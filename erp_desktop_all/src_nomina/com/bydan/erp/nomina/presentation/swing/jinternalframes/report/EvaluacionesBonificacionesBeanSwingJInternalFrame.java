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

//import com.bydan.erp.nomina.util.EvaluacionesBonificacionesConstantesFunciones;
import com.bydan.erp.nomina.util.report.EvaluacionesBonificacionesParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.EvaluacionesBonificacionesParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.EvaluacionesBonificacionesBean;
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

import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EvaluacionesBonificacionesBeanSwingJInternalFrame extends EvaluacionesBonificacionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EvaluacionesBonificacionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EvaluacionesBonificaciones> evaluacionesbonificacionesValidator = new ClassValidator<EvaluacionesBonificaciones>(EvaluacionesBonificaciones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EvaluacionesBonificaciones evaluacionesbonificaciones;	
	public EvaluacionesBonificaciones evaluacionesbonificacionesAux;
	public EvaluacionesBonificaciones evaluacionesbonificacionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EvaluacionesBonificaciones evaluacionesbonificacionesTotales;
	public Long idEvaluacionesBonificacionesActual;
	public Long iIdNuevoEvaluacionesBonificaciones=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboTipoCalificacionEmpleado="";

	public List<TipoCalificacionEmpleado> tipocalificacionempleadosForeignKey;

	public List<TipoCalificacionEmpleado> gettipocalificacionempleadosForeignKey() {
		return tipocalificacionempleadosForeignKey;
	}

	public void settipocalificacionempleadosForeignKey(List<TipoCalificacionEmpleado> tipocalificacionempleadosForeignKey) {
		this.tipocalificacionempleadosForeignKey = tipocalificacionempleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCalificacionEmpleado tipocalificacionempleadoForeignKey;

	public TipoCalificacionEmpleado gettipocalificacionempleadoForeignKey() {
		return tipocalificacionempleadoForeignKey;
	}

	public void settipocalificacionempleadoForeignKey(TipoCalificacionEmpleado tipocalificacionempleadoForeignKey) {
		this.tipocalificacionempleadoForeignKey = tipocalificacionempleadoForeignKey;
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
	
	public Boolean isPermisoTodoEvaluacionesBonificaciones;
	public Boolean isPermisoNuevoEvaluacionesBonificaciones;
	public Boolean isPermisoActualizarEvaluacionesBonificaciones;
	public Boolean isPermisoActualizarOriginalEvaluacionesBonificaciones;
	public Boolean isPermisoEliminarEvaluacionesBonificaciones;
	public Boolean isPermisoGuardarCambiosEvaluacionesBonificaciones;
	public Boolean isPermisoConsultaEvaluacionesBonificaciones;
	public Boolean isPermisoBusquedaEvaluacionesBonificaciones;
	public Boolean isPermisoReporteEvaluacionesBonificaciones;
	public Boolean isPermisoPaginacionMedioEvaluacionesBonificaciones;
	public Boolean isPermisoPaginacionAltoEvaluacionesBonificaciones;
	public Boolean isPermisoPaginacionTodoEvaluacionesBonificaciones;
	public Boolean isPermisoCopiarEvaluacionesBonificaciones;
	public Boolean isPermisoVerFormEvaluacionesBonificaciones;
	public Boolean isPermisoDuplicarEvaluacionesBonificaciones;
	public Boolean isPermisoOrdenEvaluacionesBonificaciones;
	
	
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
	
	public EvaluacionesBonificacionesParameterReturnGeneral evaluacionesbonificacionesReturnGeneral;
	public EvaluacionesBonificacionesParameterReturnGeneral evaluacionesbonificacionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEvaluacionesBonificaciones=false;
	public Boolean esParaAccionDesdeFormularioEvaluacionesBonificaciones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EvaluacionesBonificacionesSessionBeanAdditional evaluacionesbonificacionesSessionBeanAdditional=null;
	
	public EvaluacionesBonificacionesSessionBeanAdditional getEvaluacionesBonificacionesSessionBeanAdditional() {
		return this.evaluacionesbonificacionesSessionBeanAdditional;
	}
	
	public void setEvaluacionesBonificacionesSessionBeanAdditional(EvaluacionesBonificacionesSessionBeanAdditional evaluacionesbonificacionesSessionBeanAdditional) {
		try {
			this.evaluacionesbonificacionesSessionBeanAdditional=evaluacionesbonificacionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional evaluacionesbonificacionesBeanSwingJInternalFrameAdditional=null;
	//public class EvaluacionesBonificacionesBeanSwingJInternalFrame
	
	public EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional getEvaluacionesBonificacionesBeanSwingJInternalFrameAdditional() {
		return this.evaluacionesbonificacionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setEvaluacionesBonificacionesBeanSwingJInternalFrameAdditional(EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional evaluacionesbonificacionesBeanSwingJInternalFrameAdditional) {
		try {
			this.evaluacionesbonificacionesBeanSwingJInternalFrameAdditional=evaluacionesbonificacionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EvaluacionesBonificacionesLogic evaluacionesbonificacionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EvaluacionesBonificaciones evaluacionesbonificacionesBean;
	public EvaluacionesBonificacionesConstantesFunciones evaluacionesbonificacionesConstantesFunciones;
	//public EvaluacionesBonificacionesParameterReturnGeneral evaluacionesbonificacionesReturnGeneral;
	
	//FK
	
	public TipoCalificacionEmpleadoLogic tipocalificacionempleadoLogic;
	public EstructuraLogic estructuraLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<EvaluacionesBonificaciones> evaluacionesbonificacioness;	
	//public List<EvaluacionesBonificaciones> evaluacionesbonificacionessEliminados;
	//public List<EvaluacionesBonificaciones> evaluacionesbonificacionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEvaluacionesBonificaciones=false;
	public Boolean isVisibilidadCeldaDuplicarEvaluacionesBonificaciones=true;
	public Boolean isVisibilidadCeldaCopiarEvaluacionesBonificaciones=true;
	public Boolean isVisibilidadCeldaVerFormEvaluacionesBonificaciones=true;
	public Boolean isVisibilidadCeldaOrdenEvaluacionesBonificaciones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=false;
	public Boolean isVisibilidadCeldaModificarEvaluacionesBonificaciones=false;
	public Boolean isVisibilidadCeldaActualizarEvaluacionesBonificaciones=false;
	public Boolean isVisibilidadCeldaEliminarEvaluacionesBonificaciones=false;
	public Boolean isVisibilidadCeldaCancelarEvaluacionesBonificaciones=false;
	public Boolean isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=false;	
	
	
	public Boolean isVisibilidadBusquedaEvaluacionesBonificaciones=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoCalificacionEmpleado=false;
	
	public Long getiIdNuevoEvaluacionesBonificaciones() {
		return this.iIdNuevoEvaluacionesBonificaciones;
	}

	public void setiIdNuevoEvaluacionesBonificaciones(Long iIdNuevoEvaluacionesBonificaciones) {
		this.iIdNuevoEvaluacionesBonificaciones = iIdNuevoEvaluacionesBonificaciones;
	}
	
	public Long getidEvaluacionesBonificacionesActual() {
		return this.idEvaluacionesBonificacionesActual;
	}

	public void setidEvaluacionesBonificacionesActual(Long idEvaluacionesBonificacionesActual) {
		this.idEvaluacionesBonificacionesActual = idEvaluacionesBonificacionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EvaluacionesBonificaciones getevaluacionesbonificaciones() {
		return this.evaluacionesbonificaciones;
	}

	public void setevaluacionesbonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones) {
		this.evaluacionesbonificaciones = evaluacionesbonificaciones;
	}
	
	public EvaluacionesBonificaciones getevaluacionesbonificacionesAux() {
		return this.evaluacionesbonificacionesAux;
	}

	public void setevaluacionesbonificacionesAux(EvaluacionesBonificaciones evaluacionesbonificacionesAux) {
		this.evaluacionesbonificacionesAux = evaluacionesbonificacionesAux;
	}				
	
	public EvaluacionesBonificaciones getevaluacionesbonificacionesAnterior() {
		return this.evaluacionesbonificacionesAnterior;
	}

	public void setevaluacionesbonificacionesAnterior(EvaluacionesBonificaciones evaluacionesbonificacionesAnterior) {
		this.evaluacionesbonificacionesAnterior = evaluacionesbonificacionesAnterior;
	}	
	
	public EvaluacionesBonificaciones getevaluacionesbonificacionesTotales() {
		return this.evaluacionesbonificacionesTotales;
	}

	public void setevaluacionesbonificacionesTotales(EvaluacionesBonificaciones evaluacionesbonificacionesTotales) {
		this.evaluacionesbonificacionesTotales = evaluacionesbonificacionesTotales;
	}	
	
	public EvaluacionesBonificaciones getevaluacionesbonificacionesBean() {
		return this.evaluacionesbonificacionesBean;
	}

	public void setevaluacionesbonificacionesBean(EvaluacionesBonificaciones evaluacionesbonificacionesBean) {
		this.evaluacionesbonificacionesBean = evaluacionesbonificacionesBean;
	}	
	
	public EvaluacionesBonificacionesParameterReturnGeneral getevaluacionesbonificacionesReturnGeneral() {
		return this.evaluacionesbonificacionesReturnGeneral;
	}

	public void setevaluacionesbonificacionesReturnGeneral(EvaluacionesBonificacionesParameterReturnGeneral evaluacionesbonificacionesReturnGeneral) {
		this.evaluacionesbonificacionesReturnGeneral = evaluacionesbonificacionesReturnGeneral;
	}	
	
	
	public Long id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones=-1L;

	public Long getid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones() {
		return this.id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones;
	}

	public void setid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones(Long id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones) {
		this.id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones = id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones;
	}

;
	public Boolean verificadoBusquedaEvaluacionesBonificaciones=false;

	public Boolean getverificadoBusquedaEvaluacionesBonificaciones() {
		return this.verificadoBusquedaEvaluacionesBonificaciones;
	}

	public void setverificadoBusquedaEvaluacionesBonificaciones(Boolean verificadoBusquedaEvaluacionesBonificaciones) {
		this.verificadoBusquedaEvaluacionesBonificaciones = verificadoBusquedaEvaluacionesBonificaciones;
	}

;
	public Long id_estructuraBusquedaEvaluacionesBonificaciones=-1L;

	public Long getid_estructuraBusquedaEvaluacionesBonificaciones() {
		return this.id_estructuraBusquedaEvaluacionesBonificaciones;
	}

	public void setid_estructuraBusquedaEvaluacionesBonificaciones(Long id_estructuraBusquedaEvaluacionesBonificaciones) {
		this.id_estructuraBusquedaEvaluacionesBonificaciones = id_estructuraBusquedaEvaluacionesBonificaciones;
	}

;
	public String codigoBusquedaEvaluacionesBonificaciones="";

	public String getcodigoBusquedaEvaluacionesBonificaciones() {
		return this.codigoBusquedaEvaluacionesBonificaciones;
	}

	public void setcodigoBusquedaEvaluacionesBonificaciones(String codigoBusquedaEvaluacionesBonificaciones) {
		this.codigoBusquedaEvaluacionesBonificaciones = codigoBusquedaEvaluacionesBonificaciones;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado=-1L;

	public Long getid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado() {
		return this.id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado;
	}

	public void setid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado(Long id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado) {
		this.id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado = id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EvaluacionesBonificacionesLogic getEvaluacionesBonificacionesLogic()	{		
		return evaluacionesbonificacionesLogic;
	}

	public void setEvaluacionesBonificacionesLogic(EvaluacionesBonificacionesLogic evaluacionesbonificacionesLogic) {
		this.evaluacionesbonificacionesLogic = evaluacionesbonificacionesLogic;
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
	
	public Boolean getIsEsNuevoEvaluacionesBonificaciones() {
		return isEsNuevoEvaluacionesBonificaciones;
	}

	public void setIsEsNuevoEvaluacionesBonificaciones(Boolean isEsNuevoEvaluacionesBonificaciones) {
		this.isEsNuevoEvaluacionesBonificaciones = isEsNuevoEvaluacionesBonificaciones;
	}

	public Boolean getEsParaAccionDesdeFormularioEvaluacionesBonificaciones() {
		return esParaAccionDesdeFormularioEvaluacionesBonificaciones;
	}
	
	public void setEsParaAccionDesdeFormularioEvaluacionesBonificaciones(Boolean esParaAccionDesdeFormularioEvaluacionesBonificaciones) {
		this.esParaAccionDesdeFormularioEvaluacionesBonificaciones = esParaAccionDesdeFormularioEvaluacionesBonificaciones;
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
	
	
	public void cargarCombosTipoCalificacionEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocalificacionempleadosForeignKey=new ArrayList<TipoCalificacionEmpleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCalificacionEmpleadoLogic tipocalificacionempleadoLogic=new TipoCalificacionEmpleadoLogic();

			tipocalificacionempleadoLogic.getTipoCalificacionEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.evaluacionesbonificacionesSessionBean==null) {
				this.evaluacionesbonificacionesSessionBean=new EvaluacionesBonificacionesSessionBean();
			}

			if(!this.evaluacionesbonificacionesSessionBean.getisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocalificacionempleadoLogic.getTipoCalificacionEmpleadoDataAccess().setIsForForeingKeyData(true);

					tipocalificacionempleadoLogic.getTodosTipoCalificacionEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.tipocalificacionempleadosForeignKey=tipocalificacionempleadoLogic.getTipoCalificacionEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCalificacionEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocalificacionempleadoLogic.getEntityWithConnection(evaluacionesbonificacionesSessionBean.getlidTipoCalificacionEmpleadoActual());
					this.tipocalificacionempleadosForeignKey.add(tipocalificacionempleadoLogic.getTipoCalificacionEmpleado());
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

			estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.evaluacionesbonificacionesSessionBean==null) {
				this.evaluacionesbonificacionesSessionBean=new EvaluacionesBonificacionesSessionBean();
			}

			if(!this.evaluacionesbonificacionesSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

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
					estructuraLogic.getEntityWithConnection(evaluacionesbonificacionesSessionBean.getlidEstructuraActual());
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

			if(this.evaluacionesbonificacionesSessionBean==null) {
				this.evaluacionesbonificacionesSessionBean=new EvaluacionesBonificacionesSessionBean();
			}

			if(!this.evaluacionesbonificacionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(evaluacionesbonificacionesSessionBean.getlidEmpresaActual());
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

			if(this.evaluacionesbonificacionesSessionBean==null) {
				this.evaluacionesbonificacionesSessionBean=new EvaluacionesBonificacionesSessionBean();
			}

			if(!this.evaluacionesbonificacionesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(evaluacionesbonificacionesSessionBean.getlidSucursalActual());
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

	
	
	public void setActualTipoCalificacionEmpleadoForeignKey(Long idTipoCalificacionEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCalificacionEmpleado  tipocalificacionempleadoTemp=null;

			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleadosForeignKey) {
				if(tipocalificacionempleadoAux.getId()!=null && tipocalificacionempleadoAux.getId().equals(idTipoCalificacionEmpleadoSeleccionado)) {
					tipocalificacionempleadoTemp=tipocalificacionempleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocalificacionempleadoTemp!=null) {

					if(this.evaluacionesbonificaciones!=null) {
						this.evaluacionesbonificaciones.setTipoCalificacionEmpleado(tipocalificacionempleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
						this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setSelectedItem(tipocalificacionempleadoTemp);
					}
				} else {
					//jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setSelectedItem(tipocalificacionempleadoTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesBonificaciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocalificacionempleadoTemp!=null && jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones!=null) {
						jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setSelectedItem(tipocalificacionempleadoTemp);
					} else {
						if(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones!=null) {
							//jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setSelectedItem(tipocalificacionempleadoTemp);
							if(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.getItemCount()>0) {
								jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setSelectedIndex(0);
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

	public String getActualTipoCalificacionEmpleadoForeignKeyDescripcion(Long idTipoCalificacionEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCalificacionEmpleado  tipocalificacionempleadoTemp=null;

			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleadosForeignKey) {
				if(tipocalificacionempleadoAux.getId()!=null && tipocalificacionempleadoAux.getId().equals(idTipoCalificacionEmpleadoSeleccionado)) {
					tipocalificacionempleadoTemp=tipocalificacionempleadoAux;
					break;
				}
			}


			sDescripcion=TipoCalificacionEmpleadoConstantesFunciones.getTipoCalificacionEmpleadoDescripcion(tipocalificacionempleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCalificacionEmpleadoForeignKeyGenerico(Long idTipoCalificacionEmpleadoSeleccionado,JComboBox jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificacionesGenerico)throws Exception
	{
		try
		{
			TipoCalificacionEmpleado  tipocalificacionempleadoTemp=null;

			for(TipoCalificacionEmpleado tipocalificacionempleadoAux:tipocalificacionempleadosForeignKey) {
				if(tipocalificacionempleadoAux.getId()!=null && tipocalificacionempleadoAux.getId().equals(idTipoCalificacionEmpleadoSeleccionado)) {
					tipocalificacionempleadoTemp=tipocalificacionempleadoAux;
					break;
				}
			}

			if(tipocalificacionempleadoTemp!=null) {
				jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificacionesGenerico.setSelectedItem(tipocalificacionempleadoTemp);
			} else {
				if(jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificacionesGenerico!=null && jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificacionesGenerico.getItemCount()>0) {
					jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificacionesGenerico.setSelectedIndex(0);
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

					if(this.evaluacionesbonificaciones!=null) {
						this.evaluacionesbonificaciones.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
						this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraEvaluacionesBonificaciones.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesBonificaciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones!=null) {
						jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones!=null) {
							//jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.getItemCount()>0) {
								jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraEvaluacionesBonificacionesGenerico)throws Exception
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
				jComboBoxid_estructuraEvaluacionesBonificacionesGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraEvaluacionesBonificacionesGenerico!=null && jComboBoxid_estructuraEvaluacionesBonificacionesGenerico.getItemCount()>0) {
					jComboBoxid_estructuraEvaluacionesBonificacionesGenerico.setSelectedIndex(0);
				}
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

					if(this.evaluacionesbonificaciones!=null) {
						this.evaluacionesbonificaciones.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
						this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEvaluacionesBonificaciones.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEvaluacionesBonificacionesGenerico)throws Exception
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
				jComboBoxid_empresaEvaluacionesBonificacionesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEvaluacionesBonificacionesGenerico!=null && jComboBoxid_empresaEvaluacionesBonificacionesGenerico.getItemCount()>0) {
					jComboBoxid_empresaEvaluacionesBonificacionesGenerico.setSelectedIndex(0);
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

					if(this.evaluacionesbonificaciones!=null) {
						this.evaluacionesbonificaciones.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
						this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalEvaluacionesBonificaciones.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalEvaluacionesBonificacionesGenerico)throws Exception
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
				jComboBoxid_sucursalEvaluacionesBonificacionesGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalEvaluacionesBonificacionesGenerico!=null && jComboBoxid_sucursalEvaluacionesBonificacionesGenerico.getItemCount()>0) {
					jComboBoxid_sucursalEvaluacionesBonificacionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCalificacionEmpleadoForeignKey(EvaluacionesBonificaciones evaluacionesbonificaciones,JComboBox jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificacionesGenerico)throws Exception
	{
		try
		{
			TipoCalificacionEmpleado  tipocalificacionempleadoAux=new TipoCalificacionEmpleado();

			if(jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificacionesGenerico==null) {
				tipocalificacionempleadoAux=(TipoCalificacionEmpleado)this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.getSelectedItem();
			} else {
				tipocalificacionempleadoAux=(TipoCalificacionEmpleado)jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificacionesGenerico.getSelectedItem();
			}

			if(tipocalificacionempleadoAux!=null && tipocalificacionempleadoAux.getId()!=null) {
				evaluacionesbonificaciones.setid_tipo_calificacion_empleado(tipocalificacionempleadoAux.getId());
				evaluacionesbonificaciones.settipocalificacionempleado_descripcion(EvaluacionesBonificacionesConstantesFunciones.getTipoCalificacionEmpleadoDescripcion(tipocalificacionempleadoAux));
				evaluacionesbonificaciones.setTipoCalificacionEmpleado(tipocalificacionempleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(EvaluacionesBonificaciones evaluacionesbonificaciones,JComboBox jComboBoxid_estructuraEvaluacionesBonificacionesGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraEvaluacionesBonificacionesGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraEvaluacionesBonificacionesGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				evaluacionesbonificaciones.setid_estructura(estructuraAux.getId());
				evaluacionesbonificaciones.setestructura_descripcion(EvaluacionesBonificacionesConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				evaluacionesbonificaciones.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EvaluacionesBonificaciones evaluacionesbonificaciones,JComboBox jComboBoxid_empresaEvaluacionesBonificacionesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEvaluacionesBonificacionesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEvaluacionesBonificacionesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				evaluacionesbonificaciones.setid_empresa(empresaAux.getId());
				evaluacionesbonificaciones.setempresa_descripcion(EvaluacionesBonificacionesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				evaluacionesbonificaciones.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(EvaluacionesBonificaciones evaluacionesbonificaciones,JComboBox jComboBoxid_sucursalEvaluacionesBonificacionesGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalEvaluacionesBonificacionesGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalEvaluacionesBonificacionesGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				evaluacionesbonificaciones.setid_sucursal(sucursalAux.getId());
				evaluacionesbonificaciones.setsucursal_descripcion(EvaluacionesBonificacionesConstantesFunciones.getSucursalDescripcion(sucursalAux));
				evaluacionesbonificaciones.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCalificacionEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCalificacionEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.removeAllItems();

							for(TipoCalificacionEmpleado tipocalificacionempleado:this.tipocalificacionempleadosForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.addItem(tipocalificacionempleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { 
					}

					if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesBonificaciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.removeAllItems();

							for(TipoCalificacionEmpleado tipocalificacionempleado:this.tipocalificacionempleadosForeignKey) {
								this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.addItem(tipocalificacionempleado);
							}
						}

						if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { 
					}

					if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesBonificaciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.addItem(estructura);
							}
						}

						if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { 
					}

					if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { 
					}

					if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameTipoCalificacionEmpleadoForeignKey(TipoCalificacionEmpleado tipocalificacionempleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setSelectedItem(tipocalificacionempleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setSelectedItem(tipocalificacionempleado);
						} else {
							this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesEvaluacionesBonificaciones() throws Exception {
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
		
	public EvaluacionesBonificacionesParameterReturnGeneral getEvaluacionesBonificacionesParameterGeneral() {
		return this.evaluacionesbonificacionesParameterGeneral;
	}
	
	public void setEvaluacionesBonificacionesParameterGeneral(EvaluacionesBonificacionesParameterReturnGeneral evaluacionesbonificacionesParameterGeneral) {
		this.evaluacionesbonificacionesParameterGeneral = evaluacionesbonificacionesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEvaluacionesBonificaciones() {
		return isPermisoTodoEvaluacionesBonificaciones;
	}

	public void setIsPermisoTodoEvaluacionesBonificaciones(Boolean isPermisoTodoEvaluacionesBonificaciones) {
		this.isPermisoTodoEvaluacionesBonificaciones = isPermisoTodoEvaluacionesBonificaciones;
	}

	public Boolean getIsPermisoNuevoEvaluacionesBonificaciones() {
		return isPermisoNuevoEvaluacionesBonificaciones;
	}

	public void setIsPermisoNuevoEvaluacionesBonificaciones(Boolean isPermisoNuevoEvaluacionesBonificaciones) {
		this.isPermisoNuevoEvaluacionesBonificaciones = isPermisoNuevoEvaluacionesBonificaciones;
	}

	public Boolean getIsPermisoActualizarEvaluacionesBonificaciones() {
		return isPermisoActualizarEvaluacionesBonificaciones;
	}

	public void setIsPermisoActualizarEvaluacionesBonificaciones(Boolean isPermisoActualizarEvaluacionesBonificaciones) {
		this.isPermisoActualizarEvaluacionesBonificaciones = isPermisoActualizarEvaluacionesBonificaciones;
	}

	public Boolean getIsPermisoEliminarEvaluacionesBonificaciones() {
		return isPermisoEliminarEvaluacionesBonificaciones;
	}

	public void setIsPermisoEliminarEvaluacionesBonificaciones(Boolean isPermisoEliminarEvaluacionesBonificaciones) {
		this.isPermisoEliminarEvaluacionesBonificaciones = isPermisoEliminarEvaluacionesBonificaciones;
	}

	public Boolean getIsPermisoGuardarCambiosEvaluacionesBonificaciones() {
		return isPermisoGuardarCambiosEvaluacionesBonificaciones;
	}

	public void setIsPermisoGuardarCambiosEvaluacionesBonificaciones(Boolean isPermisoGuardarCambiosEvaluacionesBonificaciones) {
		this.isPermisoGuardarCambiosEvaluacionesBonificaciones = isPermisoGuardarCambiosEvaluacionesBonificaciones;
	}
	
	public Boolean getIsPermisoConsultaEvaluacionesBonificaciones() {
		return isPermisoConsultaEvaluacionesBonificaciones;
	}

	public void setIsPermisoConsultaEvaluacionesBonificaciones(Boolean isPermisoConsultaEvaluacionesBonificaciones) {
		this.isPermisoConsultaEvaluacionesBonificaciones = isPermisoConsultaEvaluacionesBonificaciones;
	}

	public Boolean getIsPermisoBusquedaEvaluacionesBonificaciones() {
		return isPermisoBusquedaEvaluacionesBonificaciones;
	}

	public void setIsPermisoBusquedaEvaluacionesBonificaciones(Boolean isPermisoBusquedaEvaluacionesBonificaciones) {
		this.isPermisoBusquedaEvaluacionesBonificaciones = isPermisoBusquedaEvaluacionesBonificaciones;
	}

	public Boolean getIsPermisoReporteEvaluacionesBonificaciones() {
		return isPermisoReporteEvaluacionesBonificaciones;
	}

	public void setIsPermisoReporteEvaluacionesBonificaciones(Boolean isPermisoReporteEvaluacionesBonificaciones) {
		this.isPermisoReporteEvaluacionesBonificaciones = isPermisoReporteEvaluacionesBonificaciones;
	}
	
	public Boolean getIsPermisoPaginacionMedioEvaluacionesBonificaciones() {
		return isPermisoPaginacionMedioEvaluacionesBonificaciones;
	}

	public void setIsPermisoPaginacionMedioEvaluacionesBonificaciones(Boolean isPermisoPaginacionMedioEvaluacionesBonificaciones) {
		this.isPermisoPaginacionMedioEvaluacionesBonificaciones = isPermisoPaginacionMedioEvaluacionesBonificaciones;
	}
	
	public Boolean getIsPermisoPaginacionTodoEvaluacionesBonificaciones() {
		return isPermisoPaginacionTodoEvaluacionesBonificaciones;
	}

	public void setIsPermisoPaginacionTodoEvaluacionesBonificaciones(Boolean isPermisoPaginacionTodoEvaluacionesBonificaciones) {
		this.isPermisoPaginacionTodoEvaluacionesBonificaciones = isPermisoPaginacionTodoEvaluacionesBonificaciones;
	}
	
	public Boolean getIsPermisoPaginacionAltoEvaluacionesBonificaciones() {
		return isPermisoPaginacionAltoEvaluacionesBonificaciones;
	}

	public void setIsPermisoPaginacionAltoEvaluacionesBonificaciones(Boolean isPermisoPaginacionAltoEvaluacionesBonificaciones) {
		this.isPermisoPaginacionAltoEvaluacionesBonificaciones = isPermisoPaginacionAltoEvaluacionesBonificaciones;
	}
	
	public Boolean getIsPermisoCopiarEvaluacionesBonificaciones() {
		return isPermisoCopiarEvaluacionesBonificaciones;
	}

	public void setIsPermisoCopiarEvaluacionesBonificaciones(Boolean isPermisoCopiarEvaluacionesBonificaciones) {
		this.isPermisoCopiarEvaluacionesBonificaciones = isPermisoCopiarEvaluacionesBonificaciones;
	}
	
	public Boolean getIsPermisoVerFormEvaluacionesBonificaciones() {
		return isPermisoVerFormEvaluacionesBonificaciones;
	}

	public void setIsPermisoVerFormEvaluacionesBonificaciones(Boolean isPermisoVerFormEvaluacionesBonificaciones) {
		this.isPermisoVerFormEvaluacionesBonificaciones = isPermisoVerFormEvaluacionesBonificaciones;
	}
	
	public Boolean getIsPermisoDuplicarEvaluacionesBonificaciones() {
		return isPermisoDuplicarEvaluacionesBonificaciones;
	}

	public void setIsPermisoDuplicarEvaluacionesBonificaciones(Boolean isPermisoDuplicarEvaluacionesBonificaciones) {
		this.isPermisoDuplicarEvaluacionesBonificaciones = isPermisoDuplicarEvaluacionesBonificaciones;
	}
	
	public Boolean getIsPermisoOrdenEvaluacionesBonificaciones() {
		return isPermisoOrdenEvaluacionesBonificaciones;
	}

	public void setIsPermisoOrdenEvaluacionesBonificaciones(Boolean isPermisoOrdenEvaluacionesBonificaciones) {
		this.isPermisoOrdenEvaluacionesBonificaciones = isPermisoOrdenEvaluacionesBonificaciones;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEvaluacionesBonificaciones() {
		return isVisibilidadCeldaNuevoEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaNuevoEvaluacionesBonificaciones(Boolean isVisibilidadCeldaNuevoEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones = isVisibilidadCeldaNuevoEvaluacionesBonificaciones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEvaluacionesBonificaciones() {
		return isVisibilidadCeldaDuplicarEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaDuplicarEvaluacionesBonificaciones(Boolean isVisibilidadCeldaDuplicarEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaDuplicarEvaluacionesBonificaciones = isVisibilidadCeldaDuplicarEvaluacionesBonificaciones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEvaluacionesBonificaciones() {
		return isVisibilidadCeldaCopiarEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaCopiarEvaluacionesBonificaciones(Boolean isVisibilidadCeldaCopiarEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaCopiarEvaluacionesBonificaciones = isVisibilidadCeldaCopiarEvaluacionesBonificaciones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEvaluacionesBonificaciones() {
		return isVisibilidadCeldaVerFormEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaVerFormEvaluacionesBonificaciones(Boolean isVisibilidadCeldaVerFormEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaVerFormEvaluacionesBonificaciones = isVisibilidadCeldaVerFormEvaluacionesBonificaciones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEvaluacionesBonificaciones() {
		return isVisibilidadCeldaOrdenEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaOrdenEvaluacionesBonificaciones(Boolean isVisibilidadCeldaOrdenEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaOrdenEvaluacionesBonificaciones = isVisibilidadCeldaOrdenEvaluacionesBonificaciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones() {
		return isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones(Boolean isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones = isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEvaluacionesBonificaciones() {
		return isVisibilidadCeldaModificarEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaModificarEvaluacionesBonificaciones(Boolean isVisibilidadCeldaModificarEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaModificarEvaluacionesBonificaciones = isVisibilidadCeldaModificarEvaluacionesBonificaciones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEvaluacionesBonificaciones() {
		return isVisibilidadCeldaActualizarEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaActualizarEvaluacionesBonificaciones(Boolean isVisibilidadCeldaActualizarEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones = isVisibilidadCeldaActualizarEvaluacionesBonificaciones;
	}

	public Boolean getIsVisibilidadCeldaEliminarEvaluacionesBonificaciones() {
		return isVisibilidadCeldaEliminarEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaEliminarEvaluacionesBonificaciones(Boolean isVisibilidadCeldaEliminarEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones = isVisibilidadCeldaEliminarEvaluacionesBonificaciones;
	}

	public Boolean getIsVisibilidadCeldaCancelarEvaluacionesBonificaciones() {
		return isVisibilidadCeldaCancelarEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaCancelarEvaluacionesBonificaciones(Boolean isVisibilidadCeldaCancelarEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones = isVisibilidadCeldaCancelarEvaluacionesBonificaciones;
	}

	public Boolean getIsVisibilidadCeldaGuardarEvaluacionesBonificaciones() {
		return isVisibilidadCeldaGuardarEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaGuardarEvaluacionesBonificaciones(Boolean isVisibilidadCeldaGuardarEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones = isVisibilidadCeldaGuardarEvaluacionesBonificaciones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones() {
		return isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones(Boolean isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones) {
		this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones = isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones;
	}
		
	public EvaluacionesBonificacionesSessionBean getevaluacionesbonificacionesSessionBean() {
		return this.evaluacionesbonificacionesSessionBean;
	}
	
	public void setevaluacionesbonificacionesSessionBean(EvaluacionesBonificacionesSessionBean evaluacionesbonificacionesSessionBean) {
		this.evaluacionesbonificacionesSessionBean=evaluacionesbonificacionesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaEvaluacionesBonificaciones() {
		return this.isVisibilidadBusquedaEvaluacionesBonificaciones;
	}

	public void setisVisibilidadBusquedaEvaluacionesBonificaciones(Boolean isVisibilidadBusquedaEvaluacionesBonificaciones) {
		this.isVisibilidadBusquedaEvaluacionesBonificaciones=isVisibilidadBusquedaEvaluacionesBonificaciones;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoCalificacionEmpleado() {
		return this.isVisibilidadFK_IdTipoCalificacionEmpleado;
	}

	public void setisVisibilidadFK_IdTipoCalificacionEmpleado(Boolean isVisibilidadFK_IdTipoCalificacionEmpleado) {
		this.isVisibilidadFK_IdTipoCalificacionEmpleado=isVisibilidadFK_IdTipoCalificacionEmpleado;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones)throws Exception {
		try {
			
				this.setActualParaGuardarTipoCalificacionEmpleadoForeignKey(evaluacionesbonificaciones,null);
				this.setActualParaGuardarEstructuraForeignKey(evaluacionesbonificaciones,null);
				this.setActualParaGuardarEmpresaForeignKey(evaluacionesbonificaciones,null);
				this.setActualParaGuardarSucursalForeignKey(evaluacionesbonificaciones,null);
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
	
	public void bugActualizarReferenciaActual(EvaluacionesBonificaciones evaluacionesbonificaciones,EvaluacionesBonificaciones evaluacionesbonificacionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEvaluacionesBonificaciones(evaluacionesbonificaciones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		evaluacionesbonificacionesAux.setId(evaluacionesbonificaciones.getId());
		evaluacionesbonificacionesAux.setVersionRow(evaluacionesbonificaciones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(EvaluacionesBonificaciones evaluacionesbonificacionesLocal) throws Exception {
		
		if(this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EvaluacionesBonificaciones evaluacionesbonificacionesLocal) throws Exception {	
		if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoCalificacionEmpleadoDetalleFormJInternalFrame.class)) {
				TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrameLocal=(TipoCalificacionEmpleadoBeanSwingJInternalFrame) ((TipoCalificacionEmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocalificacionempleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCalificacionEmpleado(tipocalificacionempleadoBeanSwingJInternalFrameLocal.gettipocalificacionempleado(),true);
				tipocalificacionempleadoBeanSwingJInternalFrameLocal.actualizarLista(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado,this.tipocalificacionempleadosForeignKey);

				tipocalificacionempleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado);

				evaluacionesbonificacionesLocal.setTipoCalificacionEmpleado(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado);

				this.addItemDefectoCombosForeignKeyTipoCalificacionEmpleado();
				this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey("Formulario");
				this.setActualTipoCalificacionEmpleadoForeignKey(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				evaluacionesbonificacionesLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				evaluacionesbonificacionesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				evaluacionesbonificacionesLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEvaluacionesBonificacionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = evaluacionesbonificacionesValidator.getInvalidValues(this.evaluacionesbonificaciones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EvaluacionesBonificaciones evaluacionesbonificaciones,List<EvaluacionesBonificaciones> evaluacionesbonificacioness) throws Exception {
	}		
	
	public void actualizarSelectedLista(EvaluacionesBonificaciones evaluacionesbonificaciones,List<EvaluacionesBonificaciones> evaluacionesbonificacioness) throws Exception {
		try	{			
			EvaluacionesBonificacionesConstantesFunciones.actualizarSelectedLista(evaluacionesbonificaciones,evaluacionesbonificacioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EvaluacionesBonificaciones> evaluacionesbonificacionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				evaluacionesbonificacionessLocal=this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				evaluacionesbonificacionessLocal=this.evaluacionesbonificacioness;
			}
			//ARCHITECTURE
		
			for(EvaluacionesBonificaciones evaluacionesbonificacionesLocal:evaluacionesbonificacionessLocal) {
				if(this.permiteMantenimiento(evaluacionesbonificacionesLocal) && evaluacionesbonificacionesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EvaluacionesBonificacionesConstantesFunciones.getEvaluacionesBonificacionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EvaluacionesBonificacionesConstantesFunciones.CODIGODATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelcodigo_datoEvaluacionesBonificaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesBonificacionesConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelnombre_completoEvaluacionesBonificaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesBonificacionesConstantesFunciones.SUELDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelsueldoEvaluacionesBonificaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesBonificacionesConstantesFunciones.VALORCONOCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_conocimientoEvaluacionesBonificaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesBonificacionesConstantesFunciones.VALOREFICIENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_eficienciaEvaluacionesBonificaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesBonificacionesConstantesFunciones.VALOROBTENIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_obtenidoEvaluacionesBonificaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesBonificacionesConstantesFunciones.VALORPESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_pesoEvaluacionesBonificaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesBonificacionesConstantesFunciones.BONIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelbonificacionEvaluacionesBonificaciones,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelcodigo_datoEvaluacionesBonificaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelnombre_completoEvaluacionesBonificaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelsueldoEvaluacionesBonificaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_conocimientoEvaluacionesBonificaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_eficienciaEvaluacionesBonificaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_obtenidoEvaluacionesBonificaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_pesoEvaluacionesBonificaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelbonificacionEvaluacionesBonificaciones,"");
		
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
		this.iIdNuevoEvaluacionesBonificaciones--;	
		
		
		this.evaluacionesbonificacionesAux=new EvaluacionesBonificaciones();
		
		this.evaluacionesbonificacionesAux.setId(this.iIdNuevoEvaluacionesBonificaciones);
		this.evaluacionesbonificacionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().add(this.evaluacionesbonificacionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.evaluacionesbonificacioness.add(this.evaluacionesbonificacionesAux);
		}
		//ARCHITECTURE
		
		this.evaluacionesbonificaciones=this.evaluacionesbonificacionesAux;
		
		if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
			this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
		}
				
		//this.setDefaultControlesEvaluacionesBonificaciones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEvaluacionesBonificaciones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEvaluacionesBonificaciones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionesBonificaciones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificacionesBean,this.evaluacionesbonificaciones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEvaluacionesBonificaciones(this.evaluacionesbonificacionesReturnGeneral,this.evaluacionesbonificacionesBean,false);
		
		if(this.evaluacionesbonificacionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesBonificaciones(this.evaluacionesbonificacionesReturnGeneral.getEvaluacionesBonificaciones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEvaluacionesBonificaciones(this.evaluacionesbonificacionesReturnGeneral.getEvaluacionesBonificaciones());
		}
		
		if(this.evaluacionesbonificacionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEvaluacionesBonificaciones(this.evaluacionesbonificacionesReturnGeneral.getEvaluacionesBonificaciones(),classes);//this.evaluacionesbonificacionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEvaluacionesBonificaciones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEvaluacionesBonificaciones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.RecargarFormEvaluacionesBonificaciones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
						
			if(evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionesBonificaciones();
			}
			
			this.actualizarVisualTableDatosEvaluacionesBonificaciones();
			
			this.jTableDatosEvaluacionesBonificaciones.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesBonificaciones(), this.getIndiceNuevoEvaluacionesBonificaciones());
			
			this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
						
			this.actualizarEstadoCeldasBotonesEvaluacionesBonificaciones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEvaluacionesBonificaciones(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jCheckBoxverificadoEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarverificadoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigoEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarcodigoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigo_datoEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarcodigo_datoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextAreanombre_completoEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarnombre_completoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldsueldoEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarsueldoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarvalor_conocimientoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarvalor_eficienciaEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarvalor_obtenidoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_pesoEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarvalor_pesoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldbonificacionEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarbonificacionEvaluacionesBonificaciones);	
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarid_tipo_calificacion_empleadoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarid_estructuraEvaluacionesBonificaciones);//
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarid_empresaEvaluacionesBonificaciones);//
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.setEnabled(isHabilitar && this.evaluacionesbonificacionesConstantesFunciones.activarid_sucursalEvaluacionesBonificaciones);
	};
	
	public void setDefaultControlesEvaluacionesBonificaciones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEvaluacionesBonificaciones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.evaluacionesbonificacionesSessionBean.setConGuardarRelaciones(true);			
			this.evaluacionesbonificacionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTabbedPaneRelacionesEvaluacionesBonificaciones.setVisible(true);
			
					
		} else {
			//this.evaluacionesbonificacionesSessionBean.setConGuardarRelaciones(false);			
			this.evaluacionesbonificacionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTabbedPaneRelacionesEvaluacionesBonificaciones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEvaluacionesBonificaciones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
				if(evaluacionesbonificacionesAux.getId().equals(this.iIdNuevoEvaluacionesBonificaciones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacioness) {
				if(evaluacionesbonificacionesAux.getId().equals(this.iIdNuevoEvaluacionesBonificaciones)) {
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
	
	public int getIndiceActualEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
				if(evaluacionesbonificacionesAux.getId().equals(evaluacionesbonificaciones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacioness) {
				if(evaluacionesbonificacionesAux.getId().equals(evaluacionesbonificaciones.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificacionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
				if(evaluacionesbonificacionesAux.getEvaluacionesBonificacionesOriginal().getId().equals(evaluacionesbonificacionesOriginal.getId())) {
					existe=true;
					evaluacionesbonificacionesOriginal.setId(evaluacionesbonificacionesAux.getId());
					evaluacionesbonificacionesOriginal.setVersionRow(evaluacionesbonificacionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacioness) {
				if(evaluacionesbonificacionesAux.getEvaluacionesBonificacionesOriginal().getId().equals(evaluacionesbonificacionesOriginal.getId())) {
					existe=true;
					evaluacionesbonificacionesOriginal.setId(evaluacionesbonificacionesAux.getId());
					evaluacionesbonificacionesOriginal.setVersionRow(evaluacionesbonificacionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEvaluacionesBonificaciones(Boolean esParaCancelar) throws Exception {
		evaluacionesbonificacionessAux=new ArrayList<EvaluacionesBonificaciones>();
		evaluacionesbonificacionesAux=new EvaluacionesBonificaciones();
		
		if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
					if(evaluacionesbonificacionesAux.getId()<0) {
						evaluacionesbonificacionessAux.add(evaluacionesbonificacionesAux);
					}		
				}
				this.iIdNuevoEvaluacionesBonificaciones=0L;
				this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().removeAll(evaluacionesbonificacionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacioness) {
					if(evaluacionesbonificacionesAux.getId()<0) {
						evaluacionesbonificacionessAux.add(evaluacionesbonificacionesAux);
					}		
				}
				this.iIdNuevoEvaluacionesBonificaciones=0L;
				this.evaluacionesbonificacioness.removeAll(evaluacionesbonificacionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEvaluacionesBonificaciones 
					&& this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().size()>0
					) {
					evaluacionesbonificacionesAux=this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().get(this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().size() - 1);
				
					if(evaluacionesbonificacionesAux.getId()<0) {
						this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().remove(evaluacionesbonificacionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEvaluacionesBonificaciones && this.evaluacionesbonificacioness.size()>0) {
					evaluacionesbonificacionesAux=this.evaluacionesbonificacioness.get(this.evaluacionesbonificacioness.size() - 1);
				
					if(evaluacionesbonificacionesAux.getId()<0) {
						this.evaluacionesbonificacioness.remove(evaluacionesbonificacionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEvaluacionesBonificaciones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(evaluacionesbonificaciones.getId()<0) {
				this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().remove(this.evaluacionesbonificaciones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(evaluacionesbonificaciones.getId()<0) {
				this.evaluacionesbonificacioness.remove(this.evaluacionesbonificaciones);
			}
		}			
	}
	
	public void setEstadosInicialesEvaluacionesBonificaciones(List<EvaluacionesBonificaciones> evaluacionesbonificacionessAux) throws Exception {
		EvaluacionesBonificacionesConstantesFunciones.setEstadosInicialesEvaluacionesBonificaciones(evaluacionesbonificacionessAux);
	}
	
	public void setEstadosInicialesEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificacionesAux) throws Exception {
		EvaluacionesBonificacionesConstantesFunciones.setEstadosInicialesEvaluacionesBonificaciones(evaluacionesbonificacionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEvaluacionesBonificacionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEvaluacionesBonificaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEvaluacionesBonificacionesActual()) {
				if(!this.isEsNuevoEvaluacionesBonificaciones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEvaluacionesBonificaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEvaluacionesBonificaciones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEvaluacionesBonificacionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Evaluaciones Bonificaciones ?", "MANTENIMIENTO DE Evaluaciones Bonificaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEvaluacionesBonificaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EvaluacionesBonificaciones evaluacionesbonificaciones) throws Exception {
		EvaluacionesBonificacionesConstantesFunciones.seleccionarAsignar(this.evaluacionesbonificaciones,evaluacionesbonificaciones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEvaluacionesBonificaciones=this.isPermisoActualizarOriginalEvaluacionesBonificaciones;
			
			
			this.seleccionarAsignar(evaluacionesbonificaciones);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesEvaluacionesBonificaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.evaluacionesbonificacionesSessionBean.setsFuncionBusquedaRapida(this.evaluacionesbonificacionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEvaluacionesBonificaciones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEvaluacionesBonificaciones(esParaCancelar);				
				this.cancelarNuevoEvaluacionesBonificaciones(esParaCancelar);								
			}
			
			this.evaluacionesbonificaciones=new EvaluacionesBonificaciones();
			
			this.inicializarEvaluacionesBonificaciones();
			
			this.actualizarEstadoCeldasBotonesEvaluacionesBonificaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEvaluacionesBonificaciones() throws Exception {
		try {
			EvaluacionesBonificacionesConstantesFunciones.inicializarEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
			
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
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEvaluacionesBonificacioness(String sAccionBusqueda,List<EvaluacionesBonificaciones> evaluacionesbonificacionessParaReportes) throws Exception {
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
					sPathReporteFinal="EvaluacionesBonificaciones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EvaluacionesBonificacionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EvaluacionesBonificacionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EvaluacionesBonificaciones"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Evaluaciones Bonificacioneses");		
		parameters.put("busquedapor", EvaluacionesBonificacionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEvaluacionesBonificaciones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EvaluacionesBonificacionesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EvaluacionesBonificacionesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEvaluacionesBonificaciones=new JRBeanArrayDataSource(EvaluacionesBonificacionesJInternalFrame.TraerEvaluacionesBonificacionesBeans(evaluacionesbonificacionessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEvaluacionesBonificaciones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EvaluacionesBonificacionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EvaluacionesBonificacionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EvaluacionesBonificacionesBean.TraerEvaluacionesBonificacionesBeans(evaluacionesbonificacionessParaReportes).toArray()));
							
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
				this.generarExcelReporteEvaluacionesBonificacioness(sAccionBusqueda,sTipoArchivoReporte,evaluacionesbonificacionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEvaluacionesBonificacioness(sAccionBusqueda,sTipoArchivoReporte,evaluacionesbonificacionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEvaluacionesBonificacionesActionPerformed(null);
					//this.generarExcelReporteEvaluacionesBonificacioness(sAccionBusqueda,sTipoArchivoReporte,evaluacionesbonificacionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEvaluacionesBonificacioness(sAccionBusqueda,sTipoArchivoReporte,evaluacionesbonificacionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEvaluacionesBonificacioness(sAccionBusqueda,sTipoArchivoReporte,evaluacionesbonificacionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEvaluacionesBonificacioness(sAccionBusqueda,sTipoArchivoReporte,evaluacionesbonificacionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEvaluacionesBonificacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionesBonificaciones> evaluacionesbonificacionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesbonificaciones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionesBonificacioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEvaluacionesBonificaciones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EvaluacionesBonificaciones evaluacionesbonificaciones : evaluacionesbonificacionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EvaluacionesBonificacionesConstantesFunciones.generarExcelReporteDataEvaluacionesBonificaciones("NORMAL",row,workbook,evaluacionesbonificaciones,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Bonificaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEvaluacionesBonificaciones(String sTipo,Row row,Workbook workbook) {
		
		EvaluacionesBonificacionesConstantesFunciones.generarExcelReporteHeaderEvaluacionesBonificaciones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEvaluacionesBonificacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionesBonificaciones> evaluacionesbonificacionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesbonificaciones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionesBonificacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EvaluacionesBonificaciones evaluacionesbonificaciones : evaluacionesbonificacionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.getEvaluacionesBonificacionesDescripcion(evaluacionesbonificaciones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.gettipocalificacionempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_VERIFICADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VERIFICADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(evaluacionesbonificaciones.getverificado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getcodigo_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getsueldo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getvalor_conocimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getvalor_eficiencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getvalor_obtenido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getvalor_peso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesbonificaciones.getbonificacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Bonificaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEvaluacionesBonificacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionesBonificaciones> evaluacionesbonificacionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EvaluacionesBonificaciones> evaluacionesbonificacionessRespaldo=null;
		
		classes=EvaluacionesBonificacionesConstantesFunciones.getClassesRelationshipsOfEvaluacionesBonificaciones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.evaluacionesbonificacionesLogic.setDatosCliente(this.datosCliente);
		this.evaluacionesbonificacionesLogic.setDatosDeep(this.datosDeep);
		this.evaluacionesbonificacionesLogic.setIsConDeep(true);
		
		evaluacionesbonificacionessRespaldo=this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness();
		
		this.evaluacionesbonificacionesLogic.setEvaluacionesBonificacioness(evaluacionesbonificacionessParaReportes);	
		this.evaluacionesbonificacionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		evaluacionesbonificacionessParaReportes=this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness();
		this.evaluacionesbonificacionesLogic.setEvaluacionesBonificacioness(evaluacionesbonificacionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesbonificaciones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionesBonificacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEvaluacionesBonificaciones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EvaluacionesBonificaciones evaluacionesbonificaciones : evaluacionesbonificacionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEvaluacionesBonificaciones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EvaluacionesBonificacionesConstantesFunciones.generarExcelReporteDataEvaluacionesBonificaciones("NORMAL",row,workbook,evaluacionesbonificaciones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.getEvaluacionesBonificacionesDescripcion(evaluacionesbonificaciones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Bonificaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEvaluacionesBonificaciones() throws Exception {		
		this.startProcessEvaluacionesBonificaciones(true);
	}
	
	public void startProcessEvaluacionesBonificaciones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEvaluacionesBonificaciones ,this.jPanelParametrosReportesEvaluacionesBonificaciones, this.jScrollPanelDatosEvaluacionesBonificaciones,this.jPanelPaginacionEvaluacionesBonificaciones, this.jScrollPanelDatosEdicionEvaluacionesBonificaciones, this.jPanelAccionesEvaluacionesBonificaciones,this.jPanelAccionesFormularioEvaluacionesBonificaciones,this.jmenuBarEvaluacionesBonificaciones,this.jmenuBarDetalleEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,this.jTtoolBarDetalleEvaluacionesBonificaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasEvaluacionesBonificaciones=this.jTabbedPaneBusquedasEvaluacionesBonificaciones; 
		
		final JPanel jPanelParametrosReportesEvaluacionesBonificaciones=this.jPanelParametrosReportesEvaluacionesBonificaciones;
		//final JScrollPane jScrollPanelDatosEvaluacionesBonificaciones=this.jScrollPanelDatosEvaluacionesBonificaciones;
		final JTable jTableDatosEvaluacionesBonificaciones=this.jTableDatosEvaluacionesBonificaciones;		
		final JPanel jPanelPaginacionEvaluacionesBonificaciones=this.jPanelPaginacionEvaluacionesBonificaciones;
		//final JScrollPane jScrollPanelDatosEdicionEvaluacionesBonificaciones=this.jScrollPanelDatosEdicionEvaluacionesBonificaciones;
		final JPanel jPanelAccionesEvaluacionesBonificaciones=this.jPanelAccionesEvaluacionesBonificaciones;
		
		JPanel jPanelCamposAuxiliarEvaluacionesBonificaciones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEvaluacionesBonificaciones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			jPanelCamposAuxiliarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelCamposEvaluacionesBonificaciones;
			jPanelAccionesFormularioAuxiliarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelAccionesFormularioEvaluacionesBonificaciones;
		}
		
		final JPanel jPanelCamposEvaluacionesBonificaciones=jPanelCamposAuxiliarEvaluacionesBonificaciones;
		final JPanel jPanelAccionesFormularioEvaluacionesBonificaciones=jPanelAccionesFormularioAuxiliarEvaluacionesBonificaciones;
		
		
		final JMenuBar jmenuBarEvaluacionesBonificaciones=this.jmenuBarEvaluacionesBonificaciones;
		final JToolBar jTtoolBarEvaluacionesBonificaciones=this.jTtoolBarEvaluacionesBonificaciones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEvaluacionesBonificaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEvaluacionesBonificaciones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			jmenuBarDetalleAuxiliarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jmenuBarDetalleEvaluacionesBonificaciones;
			jTtoolBarDetalleAuxiliarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTtoolBarDetalleEvaluacionesBonificaciones;
		}
		
		final JMenuBar jmenuBarDetalleEvaluacionesBonificaciones=jmenuBarDetalleAuxiliarEvaluacionesBonificaciones;
		final JToolBar jTtoolBarDetalleEvaluacionesBonificaciones=jTtoolBarDetalleAuxiliarEvaluacionesBonificaciones;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEvaluacionesBonificaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEvaluacionesBonificaciones;
			processRunnable.jTableDatos=jTableDatosEvaluacionesBonificaciones;
			processRunnable.jPanelCampos=jPanelCamposEvaluacionesBonificaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionEvaluacionesBonificaciones;
			processRunnable.jPanelAcciones=jPanelAccionesEvaluacionesBonificaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEvaluacionesBonificaciones;
			
			
			processRunnable.jmenuBar=jmenuBarEvaluacionesBonificaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEvaluacionesBonificaciones;
			processRunnable.jTtoolBar=jTtoolBarEvaluacionesBonificaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEvaluacionesBonificaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEvaluacionesBonificaciones ,jPanelParametrosReportesEvaluacionesBonificaciones,jTableDatosEvaluacionesBonificaciones, /*jScrollPanelDatosEvaluacionesBonificaciones,*/jPanelCamposEvaluacionesBonificaciones,jPanelPaginacionEvaluacionesBonificaciones, /*jScrollPanelDatosEdicionEvaluacionesBonificaciones,*/ jPanelAccionesEvaluacionesBonificaciones,jPanelAccionesFormularioEvaluacionesBonificaciones,jmenuBarEvaluacionesBonificaciones,jmenuBarDetalleEvaluacionesBonificaciones,jTtoolBarEvaluacionesBonificaciones,jTtoolBarDetalleEvaluacionesBonificaciones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEvaluacionesBonificaciones ,jPanelParametrosReportesEvaluacionesBonificaciones, jScrollPanelDatosEvaluacionesBonificaciones,jPanelPaginacionEvaluacionesBonificaciones, jScrollPanelDatosEdicionEvaluacionesBonificaciones, jPanelAccionesEvaluacionesBonificaciones,jPanelAccionesFormularioEvaluacionesBonificaciones,jmenuBarEvaluacionesBonificaciones,jmenuBarDetalleEvaluacionesBonificaciones,jTtoolBarEvaluacionesBonificaciones,jTtoolBarDetalleEvaluacionesBonificaciones);
						
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
	
	public void finishProcessEvaluacionesBonificaciones() {// throws Exception 
		this.finishProcessEvaluacionesBonificaciones(true);
	}
	
	public void finishProcessEvaluacionesBonificaciones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEvaluacionesBonificaciones ,this.jPanelParametrosReportesEvaluacionesBonificaciones, this.jScrollPanelDatosEvaluacionesBonificaciones,this.jPanelPaginacionEvaluacionesBonificaciones, this.jScrollPanelDatosEdicionEvaluacionesBonificaciones, this.jPanelAccionesEvaluacionesBonificaciones,this.jPanelAccionesFormularioEvaluacionesBonificaciones,this.jmenuBarEvaluacionesBonificaciones,this.jmenuBarDetalleEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,this.jTtoolBarDetalleEvaluacionesBonificaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasEvaluacionesBonificaciones=this.jTabbedPaneBusquedasEvaluacionesBonificaciones; 
		
		final JPanel jPanelParametrosReportesEvaluacionesBonificaciones=this.jPanelParametrosReportesEvaluacionesBonificaciones;
		//final JScrollPane jScrollPanelDatosEvaluacionesBonificaciones=this.jScrollPanelDatosEvaluacionesBonificaciones;
		final JTable jTableDatosEvaluacionesBonificaciones=this.jTableDatosEvaluacionesBonificaciones;		
		final JPanel jPanelPaginacionEvaluacionesBonificaciones=this.jPanelPaginacionEvaluacionesBonificaciones;
		//final JScrollPane jScrollPanelDatosEdicionEvaluacionesBonificaciones=this.jScrollPanelDatosEdicionEvaluacionesBonificaciones;
		final JPanel jPanelAccionesEvaluacionesBonificaciones=this.jPanelAccionesEvaluacionesBonificaciones;
		
		JPanel jPanelCamposAuxiliarEvaluacionesBonificaciones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEvaluacionesBonificaciones=new JPanel();
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			jPanelCamposAuxiliarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelCamposEvaluacionesBonificaciones;
			jPanelAccionesFormularioAuxiliarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelAccionesFormularioEvaluacionesBonificaciones;
		}
		
		final JPanel jPanelCamposEvaluacionesBonificaciones=jPanelCamposAuxiliarEvaluacionesBonificaciones;
		final JPanel jPanelAccionesFormularioEvaluacionesBonificaciones=jPanelAccionesFormularioAuxiliarEvaluacionesBonificaciones;
		
		
		final JMenuBar jmenuBarEvaluacionesBonificaciones=this.jmenuBarEvaluacionesBonificaciones;		
		final JToolBar jTtoolBarEvaluacionesBonificaciones=this.jTtoolBarEvaluacionesBonificaciones;
				
		JMenuBar jmenuBarDetalleAuxiliarEvaluacionesBonificaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEvaluacionesBonificaciones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			jmenuBarDetalleAuxiliarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jmenuBarDetalleEvaluacionesBonificaciones;
			jTtoolBarDetalleAuxiliarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTtoolBarDetalleEvaluacionesBonificaciones;		
		}
		
		final JMenuBar jmenuBarDetalleEvaluacionesBonificaciones=jmenuBarDetalleAuxiliarEvaluacionesBonificaciones;
		final JToolBar jTtoolBarDetalleEvaluacionesBonificaciones=jTtoolBarDetalleAuxiliarEvaluacionesBonificaciones;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEvaluacionesBonificaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEvaluacionesBonificaciones;
			processRunnable.jTableDatos=jTableDatosEvaluacionesBonificaciones;
			processRunnable.jPanelCampos=jPanelCamposEvaluacionesBonificaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionEvaluacionesBonificaciones;
			processRunnable.jPanelAcciones=jPanelAccionesEvaluacionesBonificaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEvaluacionesBonificaciones;
			
			
			processRunnable.jmenuBar=jmenuBarEvaluacionesBonificaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEvaluacionesBonificaciones;
			processRunnable.jTtoolBar=jTtoolBarEvaluacionesBonificaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEvaluacionesBonificaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEvaluacionesBonificaciones ,jPanelParametrosReportesEvaluacionesBonificaciones, jTableDatosEvaluacionesBonificaciones,/*jScrollPanelDatosEvaluacionesBonificaciones,*/jPanelCamposEvaluacionesBonificaciones,jPanelPaginacionEvaluacionesBonificaciones, /*jScrollPanelDatosEdicionEvaluacionesBonificaciones,*/ jPanelAccionesEvaluacionesBonificaciones,jPanelAccionesFormularioEvaluacionesBonificaciones,jmenuBarEvaluacionesBonificaciones,jmenuBarDetalleEvaluacionesBonificaciones,jTtoolBarEvaluacionesBonificaciones,jTtoolBarDetalleEvaluacionesBonificaciones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEvaluacionesBonificaciones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEvaluacionesBonificaciones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEvaluacionesBonificaciones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEvaluacionesBonificaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEvaluacionesBonificaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEvaluacionesBonificaciones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEvaluacionesBonificaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEvaluacionesBonificaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEvaluacionesBonificaciones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.evaluacionesbonificacionesConstantesFunciones.getsFinalQueryEvaluacionesBonificaciones();
		String  finalQueryPaginacionTodos=this.evaluacionesbonificacionesConstantesFunciones.getsFinalQueryEvaluacionesBonificaciones();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EvaluacionesBonificacionesConstantesFunciones.getArrayColumnasGlobalesNoEvaluacionesBonificaciones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EvaluacionesBonificacionesConstantesFunciones.getArrayColumnasGlobalesEvaluacionesBonificaciones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EvaluacionesBonificacionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.evaluacionesbonificacionessEliminados= new ArrayList<EvaluacionesBonificaciones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEvaluacionesBonificaciones();
		
				///*EvaluacionesBonificacionesSessionBean*/this.evaluacionesbonificacionesSessionBean=new EvaluacionesBonificacionesSessionBean();
			
			if(this.evaluacionesbonificacionesSessionBean==null) {
				this.evaluacionesbonificacionesSessionBean=new EvaluacionesBonificacionesSessionBean();
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
					this.iNumeroPaginacion=EvaluacionesBonificacionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EvaluacionesBonificacionesConstantesFunciones.getClassesForeignKeysOfEvaluacionesBonificaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/evaluacionesbonificaciones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			evaluacionesbonificacionessAux= new ArrayList<EvaluacionesBonificaciones>();
			
				
			evaluacionesbonificacionesLogic.setDatosCliente(this.datosCliente);
			evaluacionesbonificacionesLogic.setDatosDeep(this.datosDeep);
			evaluacionesbonificacionesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaEvaluacionesBonificaciones")) {
				this.sDetalleReporte=EvaluacionesBonificacionesConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesBonificaciones(id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones,verificadoBusquedaEvaluacionesBonificaciones,id_estructuraBusquedaEvaluacionesBonificaciones,codigoBusquedaEvaluacionesBonificaciones);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionesbonificacionesLogic.getEvaluacionesBonificacionessBusquedaEvaluacionesBonificaciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones,verificadoBusquedaEvaluacionesBonificaciones,id_estructuraBusquedaEvaluacionesBonificaciones,codigoBusquedaEvaluacionesBonificaciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionesBonificacionesConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesBonificaciones(id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones,verificadoBusquedaEvaluacionesBonificaciones,id_estructuraBusquedaEvaluacionesBonificaciones,codigoBusquedaEvaluacionesBonificaciones);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionesBonificacionesConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesBonificaciones(id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones,verificadoBusquedaEvaluacionesBonificaciones,id_estructuraBusquedaEvaluacionesBonificaciones,codigoBusquedaEvaluacionesBonificaciones);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()==null||evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionesbonificacioness==null|| evaluacionesbonificacioness.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesbonificacionessAux=new ArrayList<EvaluacionesBonificaciones>();
						evaluacionesbonificacionessAux.addAll(evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionesbonificacionessAux=new ArrayList<EvaluacionesBonificaciones>();
							evaluacionesbonificacionessAux.addAll(evaluacionesbonificacioness);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionesbonificacionesLogic.getEvaluacionesBonificacionessBusquedaEvaluacionesBonificaciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones,verificadoBusquedaEvaluacionesBonificaciones,id_estructuraBusquedaEvaluacionesBonificaciones,codigoBusquedaEvaluacionesBonificaciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionesBonificacionesConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesBonificaciones(id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones,verificadoBusquedaEvaluacionesBonificaciones,id_estructuraBusquedaEvaluacionesBonificaciones,codigoBusquedaEvaluacionesBonificaciones);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionesBonificacionesConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesBonificaciones(id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones,verificadoBusquedaEvaluacionesBonificaciones,id_estructuraBusquedaEvaluacionesBonificaciones,codigoBusquedaEvaluacionesBonificaciones);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionesBonificacioness("BusquedaEvaluacionesBonificaciones",evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionesBonificacioness("BusquedaEvaluacionesBonificaciones",evaluacionesbonificacioness);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesbonificacionesLogic.setEvaluacionesBonificacioness(new ArrayList<EvaluacionesBonificaciones>());
						evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().addAll(evaluacionesbonificacionessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionesbonificacioness=new ArrayList<EvaluacionesBonificaciones>();
							evaluacionesbonificacioness.addAll(evaluacionesbonificacionessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEvaluacionesBonificaciones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEvaluacionesBonificaciones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionesbonificacioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionesbonificacioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EvaluacionesBonificaciones evaluacionesbonificaciones) {
		Boolean permite=true;
		
		if(this.evaluacionesbonificaciones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EvaluacionesBonificacionesConstantesFunciones.getOrderByListaEvaluacionesBonificaciones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EvaluacionesBonificacionesConstantesFunciones.getOrderByListaEvaluacionesBonificaciones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
				if(evaluacionesbonificaciones.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesbonificacionesTotales=evaluacionesbonificaciones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesBonificaciones evaluacionesbonificaciones:this.evaluacionesbonificacioness) {
				if(evaluacionesbonificaciones.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesbonificacionesTotales=evaluacionesbonificaciones;
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
			this.evaluacionesbonificacionesAux=new EvaluacionesBonificaciones();
			this.evaluacionesbonificacionesAux.setsType(Constantes2.S_TOTALES);
			this.evaluacionesbonificacionesAux.setIsNew(false);
			this.evaluacionesbonificacionesAux.setIsChanged(false);
			this.evaluacionesbonificacionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//EvaluacionesBonificacionesConstantesFunciones.TotalizarValoresFilaEvaluacionesBonificaciones(this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness(),this.evaluacionesbonificacionesAux);
				
				//this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().add(this.evaluacionesbonificacionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EvaluacionesBonificacionesConstantesFunciones.TotalizarValoresFilaEvaluacionesBonificaciones(this.evaluacionesbonificacioness,this.evaluacionesbonificacionesAux);
				
				this.evaluacionesbonificacioness.add(this.evaluacionesbonificacionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		evaluacionesbonificacionesTotales=new EvaluacionesBonificaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().remove(evaluacionesbonificacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.evaluacionesbonificacioness.remove(evaluacionesbonificacionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		evaluacionesbonificacionesTotales=new EvaluacionesBonificaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
				if(evaluacionesbonificaciones.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesbonificacionesTotales=evaluacionesbonificaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EvaluacionesBonificacionesConstantesFunciones.TotalizarValoresFilaEvaluacionesBonificaciones(this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness(),evaluacionesbonificacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesBonificaciones evaluacionesbonificaciones:this.evaluacionesbonificacioness) {
				if(evaluacionesbonificaciones.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesbonificacionesTotales=evaluacionesbonificaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EvaluacionesBonificacionesConstantesFunciones.TotalizarValoresFilaEvaluacionesBonificaciones(this.evaluacionesbonificacioness,evaluacionesbonificacionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEvaluacionesBonificacionessBusquedaEvaluacionesBonificaciones()throws Exception {
		try {
			sAccionBusqueda="BusquedaEvaluacionesBonificaciones";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesBonificacionessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesBonificacionessFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesBonificacionessFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesBonificacionessFK_IdTipoCalificacionEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCalificacionEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEvaluacionesBonificacionessBusquedaEvaluacionesBonificaciones(String sFinalQuery,Long id_tipo_calificacion_empleado,Boolean verificado,Long id_estructura,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesbonificacionesLogic.getEvaluacionesBonificacionessBusquedaEvaluacionesBonificaciones(sFinalQuery,this.pagination,id_tipo_calificacion_empleado,verificado,id_estructura,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesBonificacionessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesbonificacionesLogic.getEvaluacionesBonificacionessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesBonificacionessFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesbonificacionesLogic.getEvaluacionesBonificacionessFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesBonificacionessFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesbonificacionesLogic.getEvaluacionesBonificacionessFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesBonificacionessFK_IdTipoCalificacionEmpleado(String sFinalQuery,Long id_tipo_calificacion_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesbonificacionesLogic.getEvaluacionesBonificacionessFK_IdTipoCalificacionEmpleado(sFinalQuery,this.pagination,id_tipo_calificacion_empleado);
				
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
	
	public void inicializarPermisosEvaluacionesBonificaciones() {
		this.isPermisoTodoEvaluacionesBonificaciones=false;
		this.isPermisoNuevoEvaluacionesBonificaciones=false;
		this.isPermisoActualizarEvaluacionesBonificaciones=false;
		this.isPermisoActualizarOriginalEvaluacionesBonificaciones=false;
		this.isPermisoEliminarEvaluacionesBonificaciones=false;
		this.isPermisoGuardarCambiosEvaluacionesBonificaciones=false;
		this.isPermisoConsultaEvaluacionesBonificaciones=true;
		this.isPermisoBusquedaEvaluacionesBonificaciones=true;
		this.isPermisoReporteEvaluacionesBonificaciones=true;
		this.isPermisoOrdenEvaluacionesBonificaciones=false;		
		this.isPermisoPaginacionMedioEvaluacionesBonificaciones=false;		
		this.isPermisoPaginacionAltoEvaluacionesBonificaciones=false;		
		this.isPermisoPaginacionTodoEvaluacionesBonificaciones=false;		
		this.isPermisoCopiarEvaluacionesBonificaciones=false;		
		this.isPermisoVerFormEvaluacionesBonificaciones=false;		
		this.isPermisoDuplicarEvaluacionesBonificaciones=false;
		this.isPermisoOrdenEvaluacionesBonificaciones=false;
	}
	
	public void setPermisosUsuarioEvaluacionesBonificaciones(Boolean isPermiso) {
		this.isPermisoTodoEvaluacionesBonificaciones=isPermiso;
		this.isPermisoNuevoEvaluacionesBonificaciones=isPermiso;
		this.isPermisoActualizarEvaluacionesBonificaciones=isPermiso;
		this.isPermisoActualizarOriginalEvaluacionesBonificaciones=isPermiso;
		this.isPermisoEliminarEvaluacionesBonificaciones=isPermiso;
		this.isPermisoGuardarCambiosEvaluacionesBonificaciones=isPermiso;
		this.isPermisoConsultaEvaluacionesBonificaciones=isPermiso;
		this.isPermisoBusquedaEvaluacionesBonificaciones=isPermiso;
		this.isPermisoReporteEvaluacionesBonificaciones=isPermiso;
		this.isPermisoOrdenEvaluacionesBonificaciones=isPermiso;		
		this.isPermisoPaginacionMedioEvaluacionesBonificaciones=isPermiso;		
		this.isPermisoPaginacionAltoEvaluacionesBonificaciones=isPermiso;		
		this.isPermisoPaginacionTodoEvaluacionesBonificaciones=isPermiso;		
		this.isPermisoCopiarEvaluacionesBonificaciones=isPermiso;		
		this.isPermisoVerFormEvaluacionesBonificaciones=isPermiso;		
		this.isPermisoDuplicarEvaluacionesBonificaciones=isPermiso;
		this.isPermisoOrdenEvaluacionesBonificaciones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEvaluacionesBonificaciones(Boolean isPermiso) {
		//this.isPermisoTodoEvaluacionesBonificaciones=isPermiso;
		this.isPermisoNuevoEvaluacionesBonificaciones=isPermiso;
		this.isPermisoActualizarEvaluacionesBonificaciones=isPermiso;
		this.isPermisoActualizarOriginalEvaluacionesBonificaciones=isPermiso;
		this.isPermisoEliminarEvaluacionesBonificaciones=isPermiso;
		this.isPermisoGuardarCambiosEvaluacionesBonificaciones=isPermiso;
		//this.isPermisoConsultaEvaluacionesBonificaciones=isPermiso;
		//this.isPermisoBusquedaEvaluacionesBonificaciones=isPermiso;
		//this.isPermisoReporteEvaluacionesBonificaciones=isPermiso;
		//this.isPermisoOrdenEvaluacionesBonificaciones=isPermiso;		
		//this.isPermisoPaginacionMedioEvaluacionesBonificaciones=isPermiso;		
		//this.isPermisoPaginacionAltoEvaluacionesBonificaciones=isPermiso;		
		//this.isPermisoPaginacionTodoEvaluacionesBonificaciones=isPermiso;		
		//this.isPermisoCopiarEvaluacionesBonificaciones=isPermiso;		
		//this.isPermisoDuplicarEvaluacionesBonificaciones=isPermiso;
		//this.isPermisoOrdenEvaluacionesBonificaciones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEvaluacionesBonificacionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EvaluacionesBonificacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEvaluacionesBonificaciones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEvaluacionesBonificacionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEvaluacionesBonificacionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEvaluacionesBonificacionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEvaluacionesBonificacionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEvaluacionesBonificaciones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EvaluacionesBonificacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EvaluacionesBonificacionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEvaluacionesBonificaciones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEvaluacionesBonificaciones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEvaluacionesBonificaciones=this.isPermisoActualizarEvaluacionesBonificaciones;
			this.isPermisoEliminarEvaluacionesBonificaciones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEvaluacionesBonificaciones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEvaluacionesBonificaciones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEvaluacionesBonificaciones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEvaluacionesBonificaciones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEvaluacionesBonificaciones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEvaluacionesBonificaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEvaluacionesBonificaciones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEvaluacionesBonificaciones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEvaluacionesBonificaciones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEvaluacionesBonificaciones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEvaluacionesBonificaciones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEvaluacionesBonificaciones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEvaluacionesBonificaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEvaluacionesBonificaciones.setToolTipText(this.jTableDatosEvaluacionesBonificaciones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEvaluacionesBonificaciones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEvaluacionesBonificaciones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EvaluacionesBonificacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EvaluacionesBonificacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEvaluacionesBonificaciones() throws Exception {
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
	public void inicializarCombosForeignKeyEvaluacionesBonificacionesListas()throws Exception {
		try	{						
			
				this.tipocalificacionempleadosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEvaluacionesBonificacionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EvaluacionesBonificacionesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyTipoCalificacionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyTipoCalificacionEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocalificacionempleadosForeignKey==null||this.tipocalificacionempleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCalificacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesTipoCalificacionEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCalificacionEmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCalificacionEmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCalificacionEmpleadosForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyEvaluacionesBonificaciones()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoCalificacionEmpleado();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoCalificacionEmpleado()throws Exception {
		try {
			if(this.evaluacionesbonificacionesSessionBean==null) {
				this.evaluacionesbonificacionesSessionBean=new EvaluacionesBonificacionesSessionBean();
			}

			if(!this.evaluacionesbonificacionesSessionBean.getisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado()) {
				TipoCalificacionEmpleado tipocalificacionempleado=new TipoCalificacionEmpleado();
				TipoCalificacionEmpleadoConstantesFunciones.setTipoCalificacionEmpleadoDescripcion(tipocalificacionempleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocalificacionempleado.setId(null);

				if(!TipoCalificacionEmpleadoConstantesFunciones.ExisteEnLista(this.tipocalificacionempleadosForeignKey,tipocalificacionempleado,true)) {

					this.tipocalificacionempleadosForeignKey.add(0,tipocalificacionempleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.evaluacionesbonificacionesSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.evaluacionesbonificacionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.evaluacionesbonificacionesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyEvaluacionesBonificaciones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEvaluacionesBonificaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEvaluacionesBonificaciones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionesBonificaciones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEvaluacionesBonificaciones()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionesBonificaciones()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEvaluacionesBonificaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEvaluacionesBonificaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEvaluacionesBonificaciones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEvaluacionesBonificaciones()throws Exception {
		try {
			

			this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEvaluacionesBonificaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEvaluacionesBonificaciones()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public EvaluacionesBonificacionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EvaluacionesBonificacionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EvaluacionesBonificacionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.evaluacionesbonificacionesSessionBean=new EvaluacionesBonificacionesSessionBean(); 
		this.evaluacionesbonificacionesConstantesFunciones=new EvaluacionesBonificacionesConstantesFunciones(); 
		this.evaluacionesbonificacionesBean=new EvaluacionesBonificaciones();//(this.evaluacionesbonificacionesConstantesFunciones); 		
		this.evaluacionesbonificacionesReturnGeneral=new EvaluacionesBonificacionesParameterReturnGeneral(); 
		
		this.evaluacionesbonificacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionesbonificacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EvaluacionesBonificacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EvaluacionesBonificacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EvaluacionesBonificacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEvaluacionesBonificaciones(true);
			
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
			
			this.evaluacionesbonificacionesConstantesFunciones=new EvaluacionesBonificacionesConstantesFunciones(); 
			this.evaluacionesbonificacionesBean=new EvaluacionesBonificaciones();//this.evaluacionesbonificacionesConstantesFunciones); 			
			this.evaluacionesbonificacionesReturnGeneral=new EvaluacionesBonificacionesParameterReturnGeneral(); 
		
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Evaluaciones Bonificaciones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.evaluacionesbonificaciones=new EvaluacionesBonificaciones();
			this.evaluacionesbonificacioness = new ArrayList<EvaluacionesBonificaciones>();
			this.evaluacionesbonificacionessAux = new ArrayList<EvaluacionesBonificaciones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic=new EvaluacionesBonificacionesLogic();
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.evaluacionesbonificacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.evaluacionesbonificacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEvaluacionesBonificaciones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones);	
					}
					
					if(this.jInternalFrameImportacionEvaluacionesBonificaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEvaluacionesBonificaciones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEvaluacionesBonificaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEvaluacionesBonificaciones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEvaluacionesBonificaciones);
				this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setVisible(false);
				this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones);
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setVisible(false);
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEvaluacionesBonificaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEvaluacionesBonificaciones);
					this.jInternalFrameImportacionEvaluacionesBonificaciones.setVisible(false);
					this.jInternalFrameImportacionEvaluacionesBonificaciones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEvaluacionesBonificaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEvaluacionesBonificaciones);
					this.jInternalFrameOrderByEvaluacionesBonificaciones.setVisible(false);
					this.jInternalFrameOrderByEvaluacionesBonificaciones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEvaluacionesBonificacionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EvaluacionesBonificacionesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.evaluacionesbonificacionesReturnGeneral=new EvaluacionesBonificacionesParameterReturnGeneral();
			
			this.evaluacionesbonificacionesParameterGeneral=new EvaluacionesBonificacionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.evaluacionesbonificacionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EvaluacionesBonificacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EvaluacionesBonificacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado(),this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EvaluacionesBonificacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado(),this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaDuplicarEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaCopiarEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaVerFormEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaOrdenEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaModificarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=false;
			
			
			this.isVisibilidadBusquedaEvaluacionesBonificaciones=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoCalificacionEmpleado=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEvaluacionesBonificaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEvaluacionesBonificaciones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEvaluacionesBonificaciones(false);
			
			this.setPermisosUsuarioEvaluacionesBonificaciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() 
				|| (this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado() && this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEvaluacionesBonificacionesClasesRelacionadas();
			}
			
			if(this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEvaluacionesBonificacionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEvaluacionesBonificaciones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEvaluacionesBonificaciones();
			}
			
			if(!this.isPermisoBusquedaEvaluacionesBonificaciones) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EvaluacionesBonificacionesConstantesFunciones.getTiposSeleccionarEvaluacionesBonificaciones());
				
				this.tiposColumnasSelect=EvaluacionesBonificacionesConstantesFunciones.getTiposSeleccionarEvaluacionesBonificaciones(true);
				
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
			//if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEvaluacionesBonificaciones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioEvaluacionesBonificaciones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioEvaluacionesBonificaciones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesBonificaciones() ;
			
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
			
			this.tipocalificacionempleadoLogic=new TipoCalificacionEmpleadoLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				evaluacionesbonificacionesImplementable= (EvaluacionesBonificacionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EvaluacionesBonificacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				evaluacionesbonificacionesImplementableHome= (EvaluacionesBonificacionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EvaluacionesBonificacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.evaluacionesbonificacioness= new ArrayList<EvaluacionesBonificaciones>();
			this.evaluacionesbonificacionessEliminados= new ArrayList<EvaluacionesBonificaciones>();
						
			this.isEsNuevoEvaluacionesBonificaciones=false;
			this.esParaAccionDesdeFormularioEvaluacionesBonificaciones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipocalificacionempleadosForeignKey=new ArrayList<TipoCalificacionEmpleado>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEvaluacionesBonificaciones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEvaluacionesBonificaciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EvaluacionesBonificacionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEvaluacionesBonificaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEvaluacionesBonificaciones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEvaluacionesBonificaciones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEvaluacionesBonificaciones();
			}
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEvaluacionesBonificaciones.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEvaluacionesBonificaciones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EvaluacionesBonificaciones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEvaluacionesBonificaciones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEvaluacionesBonificaciones")) {
				iIndex=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTabbedPaneRelacionesEvaluacionesBonificaciones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTabbedPaneRelacionesEvaluacionesBonificaciones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEvaluacionesBonificaciones();	
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
	
	public void cargarCombosForeignKeyEvaluacionesBonificaciones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEvaluacionesBonificaciones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEvaluacionesBonificaciones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEvaluacionesBonificacionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEvaluacionesBonificaciones();
		
		this.cargarCombosFrameForeignKeyEvaluacionesBonificaciones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEvaluacionesBonificaciones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEvaluacionesBonificaciones();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoCalificacionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCalificacionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCalificacionEmpleado();
				this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCalificacionEmpleado(this.tipocalificacionempleadosForeignKey);

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
	
	public void jButtonNuevoEvaluacionesBonificacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
			
			if(jTableDatosEvaluacionesBonificaciones.getRowCount()>=1) {
				jTableDatosEvaluacionesBonificaciones.removeRowSelectionInterval(0, jTableDatosEvaluacionesBonificaciones.getRowCount()-1);						
			}
			
			this.isEsNuevoEvaluacionesBonificaciones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEvaluacionesBonificaciones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEvaluacionesBonificaciones(true);			
			//this.evaluacionesbonificaciones=new EvaluacionesBonificaciones();
			//this.evaluacionesbonificaciones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionesBonificaciones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesBonificaciones() ;
			
			if(EvaluacionesBonificacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionesBonificaciones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.evaluacionesbonificaciones);	
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);				
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
			if(this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EvaluacionesBonificaciones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEvaluacionesBonificacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEvaluacionesBonificaciones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEvaluacionesBonificaciones.getSelectedRows().length;			
			}
			
			evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEvaluacionesBonificaciones--;			
				//EvaluacionesBonificaciones evaluacionesbonificacionesAux= new EvaluacionesBonificaciones();			
				//evaluacionesbonificacionesAux.setId(this.iIdNuevoEvaluacionesBonificaciones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EvaluacionesBonificaciones evaluacionesbonificacionesOrigen=new EvaluacionesBonificaciones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EvaluacionesBonificaciones evaluacionesbonificacionesOrigen : evaluacionesbonificacionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							evaluacionesbonificacionesOrigen =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionesbonificacionesOrigen =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEvaluacionesBonificaciones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.evaluacionesbonificaciones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEvaluacionesBonificaciones(evaluacionesbonificacionesOrigen,this.evaluacionesbonificaciones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().add(this.evaluacionesbonificacionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificacioness.add(this.evaluacionesbonificacionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
				
				this.jTableDatosEvaluacionesBonificaciones.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesBonificaciones(), this.getIndiceNuevoEvaluacionesBonificaciones());
				
				int iLastRow =  this.jTableDatosEvaluacionesBonificaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEvaluacionesBonificaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEvaluacionesBonificaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();									
		
			EvaluacionesBonificaciones evaluacionesbonificacionesOrigen=new EvaluacionesBonificaciones();
			EvaluacionesBonificaciones evaluacionesbonificacionesDestino=new EvaluacionesBonificaciones();
				
			evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEvaluacionesBonificaciones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || evaluacionesbonificacionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEvaluacionesBonificaciones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesbonificacionesOrigen =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						evaluacionesbonificacionesOrigen =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesbonificacionesDestino =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						evaluacionesbonificacionesDestino =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				evaluacionesbonificacionesOrigen =evaluacionesbonificacionessSeleccionados.get(0);
				evaluacionesbonificacionesDestino =evaluacionesbonificacionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEvaluacionesBonificaciones(evaluacionesbonificacionesOrigen,evaluacionesbonificacionesDestino,true,false);
				
				evaluacionesbonificacionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(evaluacionesbonificacionesDestino,evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(evaluacionesbonificacionesDestino,evaluacionesbonificacioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
				
				//this.jTableDatosEvaluacionesBonificaciones.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesBonificaciones(), this.getIndiceNuevoEvaluacionesBonificaciones());
				
				int iLastRow =  this.jTableDatosEvaluacionesBonificaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEvaluacionesBonificaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEvaluacionesBonificaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEvaluacionesBonificaciones.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEvaluacionesBonificaciones.setVisible(!isVisible);
			this.jPanelPaginacionEvaluacionesBonificaciones.setVisible(!isVisible);
			this.jPanelAccionesEvaluacionesBonificaciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEvaluacionesBonificaciones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEvaluacionesBonificaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEvaluacionesBonificaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEvaluacionesBonificaciones();
			
			this.abrirFrameOrderByEvaluacionesBonificaciones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEvaluacionesBonificaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEvaluacionesBonificaciones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEvaluacionesBonificaciones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.isMaximum()) {
					this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setSize(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.iWidthFormulario,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEvaluacionesBonificaciones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEvaluacionesBonificaciones.isMaximum()) {
						this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jContentPaneDetalleEvaluacionesBonificaciones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTabbedPaneRelacionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jContentPaneDetalleEvaluacionesBonificaciones.getWidth(),EvaluacionesBonificacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTabbedPaneRelacionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jContentPaneDetalleEvaluacionesBonificaciones.getWidth(),EvaluacionesBonificacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTabbedPaneRelacionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jContentPaneDetalleEvaluacionesBonificaciones.getWidth(),EvaluacionesBonificacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setVisible(true);
	        this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEvaluacionesBonificaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEvaluacionesBonificaciones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEvaluacionesBonificaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesBonificaciones,false,this);
				} else {
					this.jInternalFrameOrderByEvaluacionesBonificaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesBonificaciones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEvaluacionesBonificaciones);
				this.jInternalFrameOrderByEvaluacionesBonificaciones.setVisible(false);
				this.jInternalFrameOrderByEvaluacionesBonificaciones.setSelected(false);
				
				this.jInternalFrameOrderByEvaluacionesBonificaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEvaluacionesBonificaciones"));
				
				this.inicializarActualizarBindingTablaOrderByEvaluacionesBonificaciones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEvaluacionesBonificaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEvaluacionesBonificaciones==null) {
				
				this.jInternalFrameImportacionEvaluacionesBonificaciones=new ImportacionJInternalFrame(EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEvaluacionesBonificaciones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEvaluacionesBonificaciones);
				this.jInternalFrameImportacionEvaluacionesBonificaciones.setVisible(false);
				this.jInternalFrameImportacionEvaluacionesBonificaciones.setSelected(false);


				this.jInternalFrameImportacionEvaluacionesBonificaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEvaluacionesBonificaciones"));
				this.jInternalFrameImportacionEvaluacionesBonificaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEvaluacionesBonificaciones"));
				this.jInternalFrameImportacionEvaluacionesBonificaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEvaluacionesBonificaciones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEvaluacionesBonificaciones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones==null) {
				this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones=new ReporteDinamicoJInternalFrame(EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones);
				this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setVisible(false);
				this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionesBonificaciones"));
				this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionesBonificaciones"));
				this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionesBonificaciones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionesBonificaciones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEvaluacionesBonificaciones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEvaluacionesBonificaciones);
			
	       	this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setVisible(false);
	        this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setSelected(false);
			
			//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.dispose();
			//this.jInternalFrameDetalleFormEvaluacionesBonificaciones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEvaluacionesBonificaciones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setVisible(true);
	        this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEvaluacionesBonificaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEvaluacionesBonificaciones.setVisible(true);
	        this.jInternalFrameImportacionEvaluacionesBonificaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEvaluacionesBonificaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEvaluacionesBonificaciones.setVisible(true);
	        this.jInternalFrameOrderByEvaluacionesBonificaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEvaluacionesBonificaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEvaluacionesBonificaciones.setVisible(false);
	        this.jInternalFrameOrderByEvaluacionesBonificaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEvaluacionesBonificaciones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setVisible(false);
	        this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEvaluacionesBonificaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEvaluacionesBonificaciones.setVisible(false);
	        this.jInternalFrameImportacionEvaluacionesBonificaciones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEvaluacionesBonificaciones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEvaluacionesBonificaciones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEvaluacionesBonificaciones(true);
			//this.isEsNuevoEvaluacionesBonificaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEvaluacionesBonificaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionesBonificaciones(false) ;
			
			if(evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EvaluacionesBonificacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionesBonificaciones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesBonificaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEvaluacionesBonificacionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEvaluacionesBonificaciones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEvaluacionesBonificaciones(true);
			//this.isEsNuevoEvaluacionesBonificaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.evaluacionesbonificaciones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEvaluacionesBonificaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEvaluacionesBonificaciones(false) ;
			
			if(EvaluacionesBonificacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionesBonificaciones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesBonificaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoCalificacionEmpleado(List<TipoCalificacionEmpleado> tipocalificacionempleadosForeignKey)throws Exception{
		TableColumn tableColumnTipoCalificacionEmpleado=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,EvaluacionesBonificacionesConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO));
		TableCellEditor tableCellEditorTipoCalificacionEmpleado =tableColumnTipoCalificacionEmpleado.getCellEditor();

		TipoCalificacionEmpleadoTableCell tipocalificacionempleadoTableCellFk=(TipoCalificacionEmpleadoTableCell)tableCellEditorTipoCalificacionEmpleado;

		if(tipocalificacionempleadoTableCellFk!=null) {
			tipocalificacionempleadoTableCellFk.settipocalificacionempleadosForeignKey(tipocalificacionempleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocalificacionempleadoTableCellFk.setRowActual(intSelectedRow);
			//tipocalificacionempleadoTableCellFk.settipocalificacionempleadosForeignKeyActual(tipocalificacionempleadosForeignKey);
		//}


		if(tipocalificacionempleadoTableCellFk!=null) {
			tipocalificacionempleadoTableCellFk.RecargarTipoCalificacionEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,EvaluacionesBonificacionesConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	
	public void jButtonActualizarEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEvaluacionesBonificaciones(false);
			
			//if(!this.isEsNuevoEvaluacionesBonificaciones) {								
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				
			}
			
			if(this.permiteMantenimiento(this.evaluacionesbonificaciones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEvaluacionesBonificaciones=true;
					this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
					this.isEsNuevoEvaluacionesBonificaciones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEvaluacionesBonificaciones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEvaluacionesBonificaciones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEvaluacionesBonificaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionesBonificaciones(false);
				
				this.habilitarDeshabilitarControlesEvaluacionesBonificaciones(false);
			
												
				
				if(EvaluacionesBonificacionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEvaluacionesBonificaciones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,evaluacionesbonificacionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEvaluacionesBonificaciones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,evaluacionesbonificacionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.evaluacionesbonificaciones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EvaluacionesBonificaciones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesBonificaciones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				this.evaluacionesbonificaciones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				this.evaluacionesbonificaciones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.evaluacionesbonificaciones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EvaluacionesBonificacionesModel) this.jTableDatosEvaluacionesBonificaciones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEvaluacionesBonificaciones=true;
				this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
				this.isEsNuevoEvaluacionesBonificaciones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEvaluacionesBonificaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionesBonificaciones(false);
				
				this.habilitarDeshabilitarControlesEvaluacionesBonificaciones(false);
				
				
				
				if(EvaluacionesBonificacionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEvaluacionesBonificaciones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEvaluacionesBonificaciones.getRowCount()>=1) {
				jTableDatosEvaluacionesBonificaciones.removeRowSelectionInterval(0, jTableDatosEvaluacionesBonificaciones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEvaluacionesBonificaciones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionesBonificaciones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesBonificaciones(false) ;
			
			this.isEsNuevoEvaluacionesBonificaciones=false;
			
			if(EvaluacionesBonificacionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEvaluacionesBonificaciones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				
				//SI ES MANUAL
				if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEvaluacionesBonificaciones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEvaluacionesBonificaciones--;			
			//EvaluacionesBonificaciones evaluacionesbonificacionesAux= new EvaluacionesBonificaciones();			
			//evaluacionesbonificacionesAux.setId(this.iIdNuevoEvaluacionesBonificaciones);
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEvaluacionesBonificaciones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
			
			this.evaluacionesbonificaciones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().add(this.evaluacionesbonificacionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.evaluacionesbonificacioness.add(this.evaluacionesbonificacionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
			
			this.jTableDatosEvaluacionesBonificaciones.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesBonificaciones(), this.getIndiceNuevoEvaluacionesBonificaciones());
			
			int iLastRow =  this.jTableDatosEvaluacionesBonificaciones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEvaluacionesBonificaciones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEvaluacionesBonificaciones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
			
			//SI ES MANUAL
			if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionesBonificaciones();
			}
			
			//this.abrirFrameTreeEvaluacionesBonificaciones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEvaluacionesBonificaciones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEvaluacionesBonificaciones.setFileImportacion(this.jInternalFrameImportacionEvaluacionesBonificaciones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEvaluacionesBonificaciones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEvaluacionesBonificaciones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEvaluacionesBonificaciones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEvaluacionesBonificaciones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();		

		evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EvaluacionesBonificacionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EvaluacionesBonificacionesBaseDesign.jrxml";
			
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
			
			this.generarReporteEvaluacionesBonificacioness("Todos",evaluacionesbonificacionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Bonificaciones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_eldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_eldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_eldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_eldo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorConocimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorConocimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorConocimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorConocimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorEficiencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorEficiencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorEficiencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorEficiencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorObtenido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorObtenido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorObtenido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorObtenido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPeso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPeso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPeso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPeso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nificacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoria="codigo_dato";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO:
					sNombreCampoCategoria="sueldo";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					sNombreCampoCategoria="valor_conocimiento";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA:
					sNombreCampoCategoria="valor_eficiencia";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO:
					sNombreCampoCategoria="valor_obtenido";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO:
					sNombreCampoCategoria="valor_peso";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION:
					sNombreCampoCategoria="bonificacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoriaValor="codigo_dato";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO:
					sNombreCampoCategoriaValor="sueldo";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					sNombreCampoCategoriaValor="valor_conocimiento";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA:
					sNombreCampoCategoriaValor="valor_eficiencia";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO:
					sNombreCampoCategoriaValor="valor_obtenido";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO:
					sNombreCampoCategoriaValor="valor_peso";
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION:
					sNombreCampoCategoriaValor="bonificacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_dato");
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sueldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sueldo");
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Conocimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_conocimiento");
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Eficiencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_eficiencia");
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Obtenido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_obtenido");
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Peso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_peso");
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bonificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"bonificacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();		
		
		evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesbonificaciones";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EvaluacionesBonificacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EvaluacionesBonificacionesConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.gettipocalificacionempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VERIFICADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VERIFICADO);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getverificado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getcodigo_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getsueldo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getvalor_conocimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getvalor_eficiencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getvalor_obtenido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getvalor_peso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION);
					iRow++;

					for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesbonificaciones.getbonificacion());
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
			//	this.getFilaCabeceraExportarExcelEvaluacionesBonificaciones(row);				
			//	iRow++;
			//}				
			
			//for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEvaluacionesBonificaciones(evaluacionesbonificacionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Bonificaciones",JOptionPane.INFORMATION_MESSAGE);
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
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
			
			//SI ES MANUAL
			if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionesBonificaciones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
			
			//SI ES MANUAL
			if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEvaluacionesBonificaciones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
			
			//SI ES MANUAL
			if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEvaluacionesBonificaciones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEvaluacionesBonificaciones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEvaluacionesBonificaciones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEvaluacionesBonificaciones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEvaluacionesBonificaciones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEvaluacionesBonificaciones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEvaluacionesBonificaciones.setMinimumSize(dimensionMinimum);
		this.jTableDatosEvaluacionesBonificaciones.setMaximumSize(dimensionMaximum);
		this.jTableDatosEvaluacionesBonificaciones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEvaluacionesBonificaciones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEvaluacionesBonificaciones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEvaluacionesBonificaciones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEvaluacionesBonificaciones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEvaluacionesBonificaciones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesBonificaciones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEvaluacionesBonificaciones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEvaluacionesBonificaciones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEvaluacionesBonificaciones();
		
		this.inicializarActualizarBindingBotonesManualEvaluacionesBonificaciones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEvaluacionesBonificaciones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesBonificaciones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionesBonificaciones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionesBonificaciones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEvaluacionesBonificaciones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEvaluacionesBonificaciones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jCheckBoxPostAccionNuevoEvaluacionesBonificaciones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jCheckBoxPostAccionSinCerrarEvaluacionesBonificaciones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jCheckBoxPostAccionSinMensajeEvaluacionesBonificaciones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEvaluacionesBonificaciones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEvaluacionesBonificaciones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
				this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jCheckBoxPostAccionNuevoEvaluacionesBonificaciones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jCheckBoxPostAccionSinCerrarEvaluacionesBonificaciones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jCheckBoxPostAccionSinMensajeEvaluacionesBonificaciones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEvaluacionesBonificaciones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEvaluacionesBonificaciones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEvaluacionesBonificaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEvaluacionesBonificaciones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEvaluacionesBonificaciones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEvaluacionesBonificaciones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEvaluacionesBonificaciones(Boolean esInicializar) throws Exception {
		try	{	
			if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionesBonificaciones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesBonificaciones() throws Exception {
		try	{
			if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEvaluacionesBonificaciones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEvaluacionesBonificaciones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEvaluacionesBonificaciones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEvaluacionesBonificaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEvaluacionesBonificaciones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEvaluacionesBonificaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEvaluacionesBonificaciones.addItem(reporte);
			}
			
			
			if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEvaluacionesBonificaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEvaluacionesBonificaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEvaluacionesBonificaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEvaluacionesBonificaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEvaluacionesBonificaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEvaluacionesBonificaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionesBonificaciones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionesBonificaciones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones!=null) {
				
				if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EvaluacionesBonificacionesConstantesFunciones.getTiposSeleccionarEvaluacionesBonificaciones(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EvaluacionesBonificacionesConstantesFunciones.getTiposSeleccionarEvaluacionesBonificaciones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EvaluacionesBonificacionesConstantesFunciones.getTiposSeleccionarEvaluacionesBonificaciones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEvaluacionesBonificaciones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.getSelectedItem()!=null){this.id_tipo_calificacion_empleadoBusquedaEvaluacionesBonificaciones=((TipoCalificacionEmpleado)this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.getSelectedItem()).getId();}
		this.verificadoBusquedaEvaluacionesBonificaciones=this.jCheckBoxverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.isSelected();
		if(this.jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.getSelectedItem()!=null){this.id_estructuraBusquedaEvaluacionesBonificaciones=((Estructura)this.jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.getSelectedItem()).getId();}
		this.codigoBusquedaEvaluacionesBonificaciones=this.jTextFieldcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEvaluacionesBonificaciones(Boolean esInicializar) throws Exception {				
		if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEvaluacionesBonificaciones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEvaluacionesBonificaciones() throws Exception {
		this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEvaluacionesBonificaciones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEvaluacionesBonificacionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificacionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEvaluacionesBonificaciones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=evaluacionesbonificacioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEvaluacionesBonificaciones.setModel(new EvaluacionesBonificacionesModel(this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEvaluacionesBonificaciones.setModel(new EvaluacionesBonificacionesModel(this.evaluacionesbonificacioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEvaluacionesBonificaciones!=null && this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEvaluacionesBonificaciones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO,evaluacionesbonificacionesConstantesFunciones.resaltarSeleccionarEvaluacionesBonificaciones,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO,evaluacionesbonificacionesConstantesFunciones.resaltarSeleccionarEvaluacionesBonificaciones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,EvaluacionesBonificacionesConstantesFunciones.LABEL_ID));

		if(this.evaluacionesbonificacionesConstantesFunciones.mostraridEvaluacionesBonificaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesBonificacionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltaridEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activaridEvaluacionesBonificaciones,iSizeTabla,this,true,"idEvaluacionesBonificaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltaridEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activaridEvaluacionesBonificaciones,this,true,"idEvaluacionesBonificaciones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO));

		if(this.evaluacionesbonificacionesConstantesFunciones.mostrarcodigo_datoEvaluacionesBonificaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarcodigo_datoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarcodigo_datoEvaluacionesBonificaciones,iSizeTabla,this,true,"codigo_datoEvaluacionesBonificaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarcodigo_datoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarcodigo_datoEvaluacionesBonificaciones,this,true,"codigo_datoEvaluacionesBonificaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.evaluacionesbonificacionesConstantesFunciones.mostrarnombre_completoEvaluacionesBonificaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarnombre_completoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarnombre_completoEvaluacionesBonificaciones,iSizeTabla,this,true,"nombre_completoEvaluacionesBonificaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarnombre_completoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarnombre_completoEvaluacionesBonificaciones,this,true,"nombre_completoEvaluacionesBonificaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO));

		if(this.evaluacionesbonificacionesConstantesFunciones.mostrarsueldoEvaluacionesBonificaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarsueldoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarsueldoEvaluacionesBonificaciones,iSizeTabla,this,true,"sueldoEvaluacionesBonificaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarsueldoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarsueldoEvaluacionesBonificaciones,this,true,"sueldoEvaluacionesBonificaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO));

		if(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_conocimientoEvaluacionesBonificaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_conocimientoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarvalor_conocimientoEvaluacionesBonificaciones,iSizeTabla,this,true,"valor_conocimientoEvaluacionesBonificaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_conocimientoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarvalor_conocimientoEvaluacionesBonificaciones,this,true,"valor_conocimientoEvaluacionesBonificaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA));

		if(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_eficienciaEvaluacionesBonificaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_eficienciaEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarvalor_eficienciaEvaluacionesBonificaciones,iSizeTabla,this,true,"valor_eficienciaEvaluacionesBonificaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_eficienciaEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarvalor_eficienciaEvaluacionesBonificaciones,this,true,"valor_eficienciaEvaluacionesBonificaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO));

		if(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_obtenidoEvaluacionesBonificaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_obtenidoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarvalor_obtenidoEvaluacionesBonificaciones,iSizeTabla,this,true,"valor_obtenidoEvaluacionesBonificaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_obtenidoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarvalor_obtenidoEvaluacionesBonificaciones,this,true,"valor_obtenidoEvaluacionesBonificaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO));

		if(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_pesoEvaluacionesBonificaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_pesoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarvalor_pesoEvaluacionesBonificaciones,iSizeTabla,this,true,"valor_pesoEvaluacionesBonificaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_pesoEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarvalor_pesoEvaluacionesBonificaciones,this,true,"valor_pesoEvaluacionesBonificaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION));

		if(this.evaluacionesbonificacionesConstantesFunciones.mostrarbonificacionEvaluacionesBonificaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarbonificacionEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarbonificacionEvaluacionesBonificaciones,iSizeTabla,this,true,"bonificacionEvaluacionesBonificaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesbonificacionesConstantesFunciones.resaltarbonificacionEvaluacionesBonificaciones,this.evaluacionesbonificacionesConstantesFunciones.activarbonificacionEvaluacionesBonificaciones,this,true,"bonificacionEvaluacionesBonificaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesBonificacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEvaluacionesBonificaciones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEvaluacionesBonificaciones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEvaluacionesBonificaciones.addColumn(tableColumn);
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
			
			this.jTableDatosEvaluacionesBonificaciones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEvaluacionesBonificaciones.moveColumn(this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEvaluacionesBonificaciones.moveColumn(this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEvaluacionesBonificaciones.moveColumn(this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEvaluacionesBonificaciones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEvaluacionesBonificaciones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEvaluacionesBonificaciones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEvaluacionesBonificaciones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEvaluacionesBonificaciones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEvaluacionesBonificaciones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=evaluacionesbonificacioness.size()-1;
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
		//this.jTableDatosEvaluacionesBonificaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEvaluacionesBonificaciones();
			
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
				
				//this.isEsNuevoEvaluacionesBonificaciones=false;
					
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
				if(this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEvaluacionesBonificaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.evaluacionesbonificaciones.getsType().equals("DUPLICADO")
				   || this.evaluacionesbonificaciones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEvaluacionesBonificaciones=true;
				
				} else {
					this.isEsNuevoEvaluacionesBonificaciones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
					if(this.evaluacionesbonificaciones.getId()>=0 && !this.evaluacionesbonificaciones.getIsNew()) {						
						this.isEsNuevoEvaluacionesBonificaciones=false;
						
					} else {
						this.isEsNuevoEvaluacionesBonificaciones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEvaluacionesBonificaciones(esRelaciones);						
				
				this.seleccionarEvaluacionesBonificaciones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.evaluacionesbonificaciones.getId()<0) {
					this.isEsNuevoEvaluacionesBonificaciones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEvaluacionesBonificaciones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEvaluacionesBonificaciones(evt,rowIndex);
				}	
				
				if(this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EvaluacionesBonificaciones: " + this.dDif); 
					}
				}								
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEvaluacionesBonificaciones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.evaluacionesbonificaciones)) {
					if(this.evaluacionesbonificaciones.getId()>0) {
						this.evaluacionesbonificaciones.setIsDeleted(true);
						
						this.evaluacionesbonificacionessEliminados.add(this.evaluacionesbonificaciones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().remove(this.evaluacionesbonificaciones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificacioness.remove(this.evaluacionesbonificaciones);				
					}
					
					
					((EvaluacionesBonificacionesModel) this.jTableDatosEvaluacionesBonificaciones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEvaluacionesBonificaciones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEvaluacionesBonificaciones) {
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEvaluacionesBonificaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEvaluacionesBonificaciones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEvaluacionesBonificaciones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionesBonificaciones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEvaluacionesBonificaciones(evaluacionesbonificaciones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEvaluacionesBonificaciones(evaluacionesbonificaciones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEvaluacionesBonificaciones(evaluacionesbonificaciones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesBonificaciones(evaluacionesbonificaciones);
	}
	
	public void setVariablesObjetoActualToFormularioEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelidEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigo_datoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getcodigo_dato());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextAreanombre_completoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getnombre_completo());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldsueldoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getsueldo().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_pesoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getvalor_peso().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldbonificacionEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getbonificacion().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EvaluacionesBonificaciones evaluacionesbonificacionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,evaluacionesbonificacionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EvaluacionesBonificaciones evaluacionesbonificacionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				evaluacionesbonificacionesLocal=this.evaluacionesbonificaciones;
			} else {
				evaluacionesbonificacionesLocal=this.evaluacionesbonificacionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(evaluacionesbonificacionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEvaluacionesBonificaciones(evaluacionesbonificacionesLocal,true);
					
					if(evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(evaluacionesbonificacionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(evaluacionesbonificacionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(evaluacionesbonificaciones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(evaluacionesbonificaciones);
	}
	
	public void setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(evaluacionesbonificaciones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelidEvaluacionesBonificaciones.getText()==null || this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelidEvaluacionesBonificaciones.getText()=="" || this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelidEvaluacionesBonificaciones.getText()=="Id") {
				this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelidEvaluacionesBonificaciones.setText("0");
			}

			if(conColumnasBase) {evaluacionesbonificaciones.setId(Long.parseLong(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelidEvaluacionesBonificaciones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesBonificacionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelIdEvaluacionesBonificaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesbonificaciones.setcodigo_dato(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigo_datoEvaluacionesBonificaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelcodigo_datoEvaluacionesBonificaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesbonificaciones.setnombre_completo(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextAreanombre_completoEvaluacionesBonificaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelnombre_completoEvaluacionesBonificaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesbonificaciones.setsueldo(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldsueldoEvaluacionesBonificaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelsueldoEvaluacionesBonificaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesbonificaciones.setvalor_conocimiento(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_conocimientoEvaluacionesBonificaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_conocimientoEvaluacionesBonificaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesbonificaciones.setvalor_eficiencia(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_eficienciaEvaluacionesBonificaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_eficienciaEvaluacionesBonificaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesbonificaciones.setvalor_obtenido(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_obtenidoEvaluacionesBonificaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_obtenidoEvaluacionesBonificaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesbonificaciones.setvalor_peso(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_pesoEvaluacionesBonificaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelvalor_pesoEvaluacionesBonificaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesbonificaciones.setbonificacion(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldbonificacionEvaluacionesBonificaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelbonificacionEvaluacionesBonificaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificacionesBean,EvaluacionesBonificaciones evaluacionesbonificaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificacionesOrigen,EvaluacionesBonificaciones evaluacionesbonificaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && evaluacionesbonificacionesOrigen.getId()!=null && !evaluacionesbonificacionesOrigen.getId().equals(0L))) {evaluacionesbonificaciones.setId(evaluacionesbonificacionesOrigen.getId());}}
			if(conDefault || (!conDefault && evaluacionesbonificacionesOrigen.getverificado()!=null && !evaluacionesbonificacionesOrigen.getverificado().equals(false))) {evaluacionesbonificaciones.setverificado(evaluacionesbonificacionesOrigen.getverificado());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesOrigen.getcodigo()!=null && !evaluacionesbonificacionesOrigen.getcodigo().equals(""))) {evaluacionesbonificaciones.setcodigo(evaluacionesbonificacionesOrigen.getcodigo());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesOrigen.getcodigo_dato()!=null && !evaluacionesbonificacionesOrigen.getcodigo_dato().equals(""))) {evaluacionesbonificaciones.setcodigo_dato(evaluacionesbonificacionesOrigen.getcodigo_dato());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesOrigen.getnombre_completo()!=null && !evaluacionesbonificacionesOrigen.getnombre_completo().equals(""))) {evaluacionesbonificaciones.setnombre_completo(evaluacionesbonificacionesOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesOrigen.getsueldo()!=null && !evaluacionesbonificacionesOrigen.getsueldo().equals(0.0))) {evaluacionesbonificaciones.setsueldo(evaluacionesbonificacionesOrigen.getsueldo());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesOrigen.getvalor_conocimiento()!=null && !evaluacionesbonificacionesOrigen.getvalor_conocimiento().equals(0.0))) {evaluacionesbonificaciones.setvalor_conocimiento(evaluacionesbonificacionesOrigen.getvalor_conocimiento());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesOrigen.getvalor_eficiencia()!=null && !evaluacionesbonificacionesOrigen.getvalor_eficiencia().equals(0.0))) {evaluacionesbonificaciones.setvalor_eficiencia(evaluacionesbonificacionesOrigen.getvalor_eficiencia());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesOrigen.getvalor_obtenido()!=null && !evaluacionesbonificacionesOrigen.getvalor_obtenido().equals(0.0))) {evaluacionesbonificaciones.setvalor_obtenido(evaluacionesbonificacionesOrigen.getvalor_obtenido());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesOrigen.getvalor_peso()!=null && !evaluacionesbonificacionesOrigen.getvalor_peso().equals(0.0))) {evaluacionesbonificaciones.setvalor_peso(evaluacionesbonificacionesOrigen.getvalor_peso());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesOrigen.getbonificacion()!=null && !evaluacionesbonificacionesOrigen.getbonificacion().equals(0.0))) {evaluacionesbonificaciones.setbonificacion(evaluacionesbonificacionesOrigen.getbonificacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelidEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigo_datoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getcodigo_dato());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextAreanombre_completoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getnombre_completo());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldsueldoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getsueldo().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_pesoEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getvalor_peso().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldbonificacionEvaluacionesBonificaciones.setText(evaluacionesbonificaciones.getbonificacion().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEvaluacionesBonificaciones(EvaluacionesBonificacionesBean evaluacionesbonificacionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelidEvaluacionesBonificaciones.setText(evaluacionesbonificacionesBean.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigo_datoEvaluacionesBonificaciones.setText(evaluacionesbonificacionesBean.getcodigo_dato());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextAreanombre_completoEvaluacionesBonificaciones.setText(evaluacionesbonificacionesBean.getnombre_completo());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldsueldoEvaluacionesBonificaciones.setText(evaluacionesbonificacionesBean.getsueldo().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setText(evaluacionesbonificacionesBean.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setText(evaluacionesbonificacionesBean.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setText(evaluacionesbonificacionesBean.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_pesoEvaluacionesBonificaciones.setText(evaluacionesbonificacionesBean.getvalor_peso().toString());
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldbonificacionEvaluacionesBonificaciones.setText(evaluacionesbonificacionesBean.getbonificacion().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEvaluacionesBonificaciones(EvaluacionesBonificacionesParameterReturnGeneral evaluacionesbonificacionesReturnGeneral,EvaluacionesBonificacionesBean evaluacionesbonificacionesBean,Boolean conDefault) throws Exception { 
		try {
			EvaluacionesBonificaciones evaluacionesbonificacionesLocal=new EvaluacionesBonificaciones();
			
			evaluacionesbonificacionesLocal=evaluacionesbonificacionesReturnGeneral.getEvaluacionesBonificaciones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && evaluacionesbonificacionesLocal.getId()!=null && !evaluacionesbonificacionesLocal.getId().equals(0L))) {evaluacionesbonificacionesBean.setId(evaluacionesbonificacionesLocal.getId());}}
			if(conDefault || (!conDefault && evaluacionesbonificacionesLocal.getcodigo_dato()!=null && !evaluacionesbonificacionesLocal.getcodigo_dato().equals(""))) {evaluacionesbonificacionesBean.setcodigo_dato(evaluacionesbonificacionesLocal.getcodigo_dato());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesLocal.getnombre_completo()!=null && !evaluacionesbonificacionesLocal.getnombre_completo().equals(""))) {evaluacionesbonificacionesBean.setnombre_completo(evaluacionesbonificacionesLocal.getnombre_completo());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesLocal.getsueldo()!=null && !evaluacionesbonificacionesLocal.getsueldo().equals(0.0))) {evaluacionesbonificacionesBean.setsueldo(evaluacionesbonificacionesLocal.getsueldo());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesLocal.getvalor_conocimiento()!=null && !evaluacionesbonificacionesLocal.getvalor_conocimiento().equals(0.0))) {evaluacionesbonificacionesBean.setvalor_conocimiento(evaluacionesbonificacionesLocal.getvalor_conocimiento());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesLocal.getvalor_eficiencia()!=null && !evaluacionesbonificacionesLocal.getvalor_eficiencia().equals(0.0))) {evaluacionesbonificacionesBean.setvalor_eficiencia(evaluacionesbonificacionesLocal.getvalor_eficiencia());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesLocal.getvalor_obtenido()!=null && !evaluacionesbonificacionesLocal.getvalor_obtenido().equals(0.0))) {evaluacionesbonificacionesBean.setvalor_obtenido(evaluacionesbonificacionesLocal.getvalor_obtenido());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesLocal.getvalor_peso()!=null && !evaluacionesbonificacionesLocal.getvalor_peso().equals(0.0))) {evaluacionesbonificacionesBean.setvalor_peso(evaluacionesbonificacionesLocal.getvalor_peso());}
			if(conDefault || (!conDefault && evaluacionesbonificacionesLocal.getbonificacion()!=null && !evaluacionesbonificacionesLocal.getbonificacion().equals(0.0))) {evaluacionesbonificacionesBean.setbonificacion(evaluacionesbonificacionesLocal.getbonificacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEvaluacionesBonificacionesGenerico(Long idEvaluacionesBonificacionesSeleccionado,JComboBox jComboBoxEvaluacionesBonificaciones,List<EvaluacionesBonificaciones> evaluacionesbonificacionessLocal)throws Exception {
		try {
			EvaluacionesBonificaciones  evaluacionesbonificacionesTemp=null;

			for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacionessLocal) {
				if(evaluacionesbonificacionesAux.getId()!=null && evaluacionesbonificacionesAux.getId().equals(idEvaluacionesBonificacionesSeleccionado)) {
					evaluacionesbonificacionesTemp=evaluacionesbonificacionesAux;
					break;
				}
			}

			jComboBoxEvaluacionesBonificaciones.setSelectedItem(evaluacionesbonificacionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEvaluacionesBonificacionesGenerico(JComboBox jComboBoxEvaluacionesBonificaciones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEvaluacionesBonificaciones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEvaluacionesBonificaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEvaluacionesBonificaciones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEvaluacionesBonificaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEvaluacionesBonificaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEvaluacionesBonificaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionesbonificaciones=(EvaluacionesBonificaciones) evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			evaluacionesbonificaciones =(EvaluacionesBonificaciones) evaluacionesbonificacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoCalificacionEmpleado")) {
			//sDescripcion=this.getActualTipoCalificacionEmpleadoForeignKeyDescripcion((Long)value);
			if(!evaluacionesbonificaciones.getIsNew() && !evaluacionesbonificaciones.getIsChanged() && !evaluacionesbonificaciones.getIsDeleted()) {
				sDescripcion=evaluacionesbonificaciones.gettipocalificacionempleado_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCalificacionEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesbonificaciones.gettipocalificacionempleado_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!evaluacionesbonificaciones.getIsNew() && !evaluacionesbonificaciones.getIsChanged() && !evaluacionesbonificaciones.getIsDeleted()) {
				sDescripcion=evaluacionesbonificaciones.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesbonificaciones.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!evaluacionesbonificaciones.getIsNew() && !evaluacionesbonificaciones.getIsChanged() && !evaluacionesbonificaciones.getIsDeleted()) {
				sDescripcion=evaluacionesbonificaciones.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesbonificaciones.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!evaluacionesbonificaciones.getIsNew() && !evaluacionesbonificaciones.getIsChanged() && !evaluacionesbonificaciones.getIsDeleted()) {
				sDescripcion=evaluacionesbonificaciones.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesbonificaciones.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EvaluacionesBonificaciones evaluacionesbonificacionesRow=new EvaluacionesBonificaciones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionesbonificacionesRow=(EvaluacionesBonificaciones) evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			evaluacionesbonificacionesRow=(EvaluacionesBonificaciones) evaluacionesbonificacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEvaluacionesBonificaciones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones && this.isPermisoNuevoEvaluacionesBonificaciones));			
			this.jButtonDuplicarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionesBonificaciones && this.isPermisoDuplicarEvaluacionesBonificaciones));			
			this.jButtonCopiarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaCopiarEvaluacionesBonificaciones && this.isPermisoCopiarEvaluacionesBonificaciones));
			this.jButtonVerFormEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaVerFormEvaluacionesBonificaciones && this.isPermisoVerFormEvaluacionesBonificaciones));
			
			this.jButtonAbrirOrderByEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesBonificaciones && this.isPermisoOrdenEvaluacionesBonificaciones));			
			
			this.jButtonNuevoRelacionesEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones && this.isPermisoNuevoEvaluacionesBonificaciones));			
			this.jButtonNuevoGuardarCambiosEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones && this.isPermisoNuevoEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones));
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonModificarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaModificarEvaluacionesBonificaciones && this.isPermisoActualizarEvaluacionesBonificaciones));	
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonActualizarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones && this.isPermisoActualizarEvaluacionesBonificaciones));	
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonEliminarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones && this.isPermisoEliminarEvaluacionesBonificaciones));
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonCancelarEvaluacionesBonificaciones.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones);							
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones));			
			
			}
						
			this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones && this.isPermisoNuevoEvaluacionesBonificaciones));						
			this.jButtonDuplicarToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionesBonificaciones && this.isPermisoDuplicarEvaluacionesBonificaciones));						
			this.jButtonCopiarToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaCopiarEvaluacionesBonificaciones && this.isPermisoCopiarEvaluacionesBonificaciones));			
			this.jButtonVerFormToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaVerFormEvaluacionesBonificaciones && this.isPermisoVerFormEvaluacionesBonificaciones));			
			this.jButtonAbrirOrderByToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesBonificaciones && this.isPermisoOrdenEvaluacionesBonificaciones));
			this.jButtonNuevoRelacionesToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones && this.isPermisoNuevoEvaluacionesBonificaciones));			
			this.jButtonNuevoGuardarCambiosToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones && this.isPermisoNuevoEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones));			
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonModificarToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaModificarEvaluacionesBonificaciones && this.isPermisoActualizarEvaluacionesBonificaciones));	
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonActualizarToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones  && this.isPermisoActualizarEvaluacionesBonificaciones));	
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonEliminarToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones && this.isPermisoEliminarEvaluacionesBonificaciones));
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonCancelarToolBarEvaluacionesBonificaciones.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones);				
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones && this.isPermisoNuevoEvaluacionesBonificaciones));			
			this.jMenuItemDuplicarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionesBonificaciones && this.isPermisoDuplicarEvaluacionesBonificaciones));			
			this.jMenuItemCopiarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaCopiarEvaluacionesBonificaciones && this.isPermisoCopiarEvaluacionesBonificaciones));			
			this.jMenuItemVerFormEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaVerFormEvaluacionesBonificaciones && this.isPermisoVerFormEvaluacionesBonificaciones));			
			this.jMenuItemAbrirOrderByEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesBonificaciones && this.isPermisoOrdenEvaluacionesBonificaciones));			
			//this.jMenuItemMostrarOcultarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesBonificaciones && this.isPermisoOrdenEvaluacionesBonificaciones));
			this.jMenuItemDetalleAbrirOrderByEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesBonificaciones && this.isPermisoOrdenEvaluacionesBonificaciones));			
			//this.jMenuItemDetalleMostrarOcultarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesBonificaciones && this.isPermisoOrdenEvaluacionesBonificaciones));			
			this.jMenuItemNuevoRelacionesEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones && this.isPermisoNuevoEvaluacionesBonificaciones));			
			this.jMenuItemNuevoGuardarCambiosEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones && this.isPermisoNuevoEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones));									
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemModificarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaModificarEvaluacionesBonificaciones && this.isPermisoActualizarEvaluacionesBonificaciones));	
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemActualizarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones && this.isPermisoActualizarEvaluacionesBonificaciones));	
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemEliminarEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones && this.isPermisoEliminarEvaluacionesBonificaciones));
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemCancelarEvaluacionesBonificaciones.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones);				
			}
			
			this.jMenuItemGuardarCambiosEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones));						
			this.jMenuItemGuardarCambiosTablaEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=this.jButtonNuevoEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaDuplicarEvaluacionesBonificaciones=this.jButtonDuplicarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaCopiarEvaluacionesBonificaciones=this.jButtonCopiarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaVerFormEvaluacionesBonificaciones=this.jButtonVerFormEvaluacionesBonificaciones.isVisible();
			
			this.isVisibilidadCeldaOrdenEvaluacionesBonificaciones=this.jButtonAbrirOrderByEvaluacionesBonificaciones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=this.jButtonNuevoRelacionesEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaModificarEvaluacionesBonificaciones=this.jButtonModificarEvaluacionesBonificaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonActualizarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonEliminarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonCancelarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosEvaluacionesBonificaciones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=this.jButtonNuevoToolBarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=this.jButtonNuevoRelacionesToolBarEvaluacionesBonificaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			this.isVisibilidadCeldaModificarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonModificarToolBarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonActualizarToolBarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonEliminarToolBarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonCancelarToolBarEvaluacionesBonificaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=this.jButtonGuardarCambiosToolBarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=this.jButtonGuardarCambiosTablaToolBarEvaluacionesBonificaciones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=this.jMenuItemNuevoEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=this.jMenuItemNuevoRelacionesEvaluacionesBonificaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			this.isVisibilidadCeldaModificarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemModificarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemActualizarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemEliminarEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemCancelarEvaluacionesBonificaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=this.jMenuItemGuardarCambiosEvaluacionesBonificaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=this.jMenuItemGuardarCambiosTablaEvaluacionesBonificaciones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEvaluacionesBonificaciones(Boolean esInicializar) {
		if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
				//if(this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEvaluacionesBonificaciones();
			}
			
			this.inicializarActualizarBindingBotonesManualEvaluacionesBonificaciones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEvaluacionesBonificaciones() {
		this.jButtonNuevoEvaluacionesBonificaciones.setVisible(this.isPermisoNuevoEvaluacionesBonificaciones);			
		this.jButtonDuplicarEvaluacionesBonificaciones.setVisible(this.isPermisoDuplicarEvaluacionesBonificaciones);			
		this.jButtonCopiarEvaluacionesBonificaciones.setVisible(this.isPermisoCopiarEvaluacionesBonificaciones);			
		this.jButtonVerFormEvaluacionesBonificaciones.setVisible(this.isPermisoVerFormEvaluacionesBonificaciones);			
		
		this.jButtonAbrirOrderByEvaluacionesBonificaciones.setVisible(this.isPermisoOrdenEvaluacionesBonificaciones);					
		
		this.jButtonNuevoRelacionesEvaluacionesBonificaciones.setVisible(this.isPermisoNuevoEvaluacionesBonificaciones);			
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonModificarEvaluacionesBonificaciones.setVisible(this.isPermisoActualizarEvaluacionesBonificaciones);	
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonActualizarEvaluacionesBonificaciones.setVisible(this.isPermisoActualizarEvaluacionesBonificaciones);	
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonEliminarEvaluacionesBonificaciones.setVisible(this.isPermisoEliminarEvaluacionesBonificaciones);
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonCancelarEvaluacionesBonificaciones.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones);						
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosEvaluacionesBonificaciones.setVisible(this.isPermisoGuardarCambiosEvaluacionesBonificaciones);							
		}
		
		this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.setVisible(this.isPermisoActualizarEvaluacionesBonificaciones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEvaluacionesBonificaciones() {
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonModificarEvaluacionesBonificaciones.setVisible(this.isPermisoActualizarEvaluacionesBonificaciones);	
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonActualizarEvaluacionesBonificaciones.setVisible(this.isPermisoActualizarEvaluacionesBonificaciones);	
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonEliminarEvaluacionesBonificaciones.setVisible(this.isPermisoEliminarEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonCancelarEvaluacionesBonificaciones.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones);							
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosEvaluacionesBonificaciones.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones && this.isPermisoGuardarCambiosEvaluacionesBonificaciones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEvaluacionesBonificaciones() {
		if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEvaluacionesBonificaciones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEvaluacionesBonificaciones() {
	}
	
	public void jTableDatosEvaluacionesBonificacionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEvaluacionesBonificaciones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.evaluacionesbonificaciones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocalificacionempleado=true;

			idTienePermisotipocalificacionempleado=this.tienePermisosUsuarioEnPaginaWebEvaluacionesBonificaciones(TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocalificacionempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesBonificaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesBonificaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);

				this.tipocalificacionempleadoBeanSwingJInternalFrame=new TipoCalificacionEmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocalificacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocalificacionempleadoBeanSwingJInternalFrame.getTipoCalificacionEmpleadoLogic().setConnexion(this.evaluacionesbonificacionesLogic.getConnexion());

				if(this.evaluacionesbonificaciones.getid_tipo_calificacion_empleado()!=null) {
					this.tipocalificacionempleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocalificacionempleadoBeanSwingJInternalFrame.setIdActual(this.evaluacionesbonificaciones.getid_tipo_calificacion_empleado());
					this.tipocalificacionempleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocalificacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocalificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCalificacionEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.tipocalificacionempleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesBonificaciones=(TitledBorder)this.jScrollPanelDatosEvaluacionesBonificaciones.getBorder();
				TitledBorder titledBordertipocalificacionempleado=(TitledBorder)this.tipocalificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosTipoCalificacionEmpleado.getBorder();

				titledBordertipocalificacionempleado.setTitle(titledBorderEvaluacionesBonificaciones.getTitle() + " -> Tipo Calificacion Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getid_tipo_calificacion_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_calificacion_empleado = "+this.evaluacionesbonificaciones.getid_tipo_calificacion_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonverificadoEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getverificado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where verificado = "+this.evaluacionesbonificaciones.getverificado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraEvaluacionesBonificacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebEvaluacionesBonificaciones(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesBonificaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesBonificaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.evaluacionesbonificacionesLogic.getConnexion());

				if(this.evaluacionesbonificaciones.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.evaluacionesbonificaciones.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesBonificaciones=(TitledBorder)this.jScrollPanelDatosEvaluacionesBonificaciones.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderEvaluacionesBonificaciones.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.evaluacionesbonificaciones.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.evaluacionesbonificaciones.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEvaluacionesBonificacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEvaluacionesBonificaciones(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesBonificaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesBonificaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.evaluacionesbonificacionesLogic.getConnexion());

				if(this.evaluacionesbonificaciones.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.evaluacionesbonificaciones.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesBonificaciones=(TitledBorder)this.jScrollPanelDatosEvaluacionesBonificaciones.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEvaluacionesBonificaciones.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.evaluacionesbonificaciones.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalEvaluacionesBonificacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebEvaluacionesBonificaciones(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesBonificaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesBonificaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.evaluacionesbonificacionesLogic.getConnexion());

				if(this.evaluacionesbonificaciones.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.evaluacionesbonificaciones.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesBonificaciones=(TitledBorder)this.jScrollPanelDatosEvaluacionesBonificaciones.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderEvaluacionesBonificaciones.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.evaluacionesbonificaciones.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_datoEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getcodigo_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_dato like '%"+this.evaluacionesbonificaciones.getcodigo_dato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.evaluacionesbonificaciones.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsueldoEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getsueldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sueldo = "+this.evaluacionesbonificaciones.getsueldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_conocimientoEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getvalor_conocimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_conocimiento = "+this.evaluacionesbonificaciones.getvalor_conocimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_eficienciaEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getvalor_eficiencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_eficiencia = "+this.evaluacionesbonificaciones.getvalor_eficiencia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_obtenidoEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getvalor_obtenido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_obtenido = "+this.evaluacionesbonificaciones.getvalor_obtenido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_pesoEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getvalor_peso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_peso = "+this.evaluacionesbonificaciones.getvalor_peso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbonificacionEvaluacionesBonificacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.getevaluacionesbonificaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesbonificaciones==null) {
						this.evaluacionesbonificaciones = new EvaluacionesBonificaciones();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);
				}

				if(this.evaluacionesbonificaciones.getbonificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where bonificacion = "+this.evaluacionesbonificaciones.getbonificacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaEvaluacionesBonificacionesEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);

			this.getEvaluacionesBonificacionessBusquedaEvaluacionesBonificaciones();

			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);

			//if(EvaluacionesBonificacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);

			this.getEvaluacionesBonificacionessFK_IdEmpresa();

			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);

			//if(EvaluacionesBonificacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);

			this.getEvaluacionesBonificacionessFK_IdEstructura();

			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);

			//if(EvaluacionesBonificacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);

			this.getEvaluacionesBonificacionessFK_IdSucursal();

			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);

			//if(EvaluacionesBonificacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCalificacionEmpleadoEvaluacionesBonificacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);

			this.getEvaluacionesBonificacionessFK_IdTipoCalificacionEmpleado();

			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);

			//if(EvaluacionesBonificacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesbonificacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEvaluacionesBonificaciones() {
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setVisible(false);	    			
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.dispose();
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones!=null) {
			this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.dispose();
			this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones=null;
		}
		
		if(this.jInternalFrameImportacionEvaluacionesBonificaciones!=null) {
			this.jInternalFrameImportacionEvaluacionesBonificaciones.setVisible(false);	    			
			this.jInternalFrameImportacionEvaluacionesBonificaciones.dispose();
			this.jInternalFrameImportacionEvaluacionesBonificaciones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEvaluacionesBonificaciones();
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoEvaluacionesBonificaciones")) {
				jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEvaluacionesBonificaciones")) {
				jButtonDuplicarEvaluacionesBonificacionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEvaluacionesBonificaciones")) {
				jButtonCopiarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormEvaluacionesBonificaciones")) {
				jButtonVerFormEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEvaluacionesBonificaciones")) {
				jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEvaluacionesBonificaciones")) {
				jButtonDuplicarEvaluacionesBonificacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEvaluacionesBonificaciones")) {
				jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEvaluacionesBonificaciones")) {
				jButtonDuplicarEvaluacionesBonificacionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEvaluacionesBonificaciones")) {
				jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEvaluacionesBonificaciones")) {
				jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEvaluacionesBonificaciones")) {
				jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEvaluacionesBonificaciones")) {
				jButtonModificarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEvaluacionesBonificaciones")) {
				jButtonModificarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEvaluacionesBonificaciones")) {
				jButtonModificarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEvaluacionesBonificaciones")) {
				jButtonActualizarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEvaluacionesBonificaciones")) {
				jButtonActualizarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEvaluacionesBonificaciones")) {
				jButtonActualizarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarEvaluacionesBonificaciones")) {
				jButtonEliminarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEvaluacionesBonificaciones")) {
				jButtonEliminarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEvaluacionesBonificaciones")) {
				jButtonEliminarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarEvaluacionesBonificaciones")) {
				jButtonCancelarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEvaluacionesBonificaciones")) {
				jButtonCancelarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEvaluacionesBonificaciones")) {
				jButtonCancelarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarEvaluacionesBonificaciones")) {
				jButtonCerrarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEvaluacionesBonificaciones")) {
				jButtonCerrarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEvaluacionesBonificaciones")) {
				jButtonCerrarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEvaluacionesBonificaciones")) {
				jButtonMostrarOcultarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEvaluacionesBonificaciones")) {
				jButtonCancelarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEvaluacionesBonificaciones")) {
				jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEvaluacionesBonificaciones")) {
				jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEvaluacionesBonificaciones")) {
				jButtonCopiarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEvaluacionesBonificaciones")) {
				jButtonVerFormEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEvaluacionesBonificaciones")) {
				jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEvaluacionesBonificaciones")) {
				jButtonCopiarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEvaluacionesBonificaciones")) {
				jButtonVerFormEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEvaluacionesBonificaciones")) {
				jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEvaluacionesBonificaciones")) {
				jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEvaluacionesBonificaciones")) {
				jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEvaluacionesBonificaciones")) {
				jButtonRecargarInformacionEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEvaluacionesBonificaciones")) {
				jButtonRecargarInformacionEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEvaluacionesBonificaciones")) {
				jButtonRecargarInformacionEvaluacionesBonificacionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEvaluacionesBonificaciones")) {
				jButtonAnterioresEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEvaluacionesBonificaciones")) {
				jButtonAnterioresEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEvaluacionesBonificaciones")) {
				jButtonAnterioresEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEvaluacionesBonificaciones")) {
				jButtonSiguientesEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEvaluacionesBonificaciones")) {
				jButtonSiguientesEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEvaluacionesBonificaciones")) {
				jButtonSiguientesEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEvaluacionesBonificaciones") || sTipo.equals("MenuItemDetalleAbrirOrderByEvaluacionesBonificaciones")) {
				jButtonAbrirOrderByEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEvaluacionesBonificaciones") || sTipo.equals("MenuItemDetalleMostrarOcultarEvaluacionesBonificaciones")) {
				jButtonMostrarOcultarEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEvaluacionesBonificaciones")) {
				jButtonNuevoGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEvaluacionesBonificaciones")) {
				jButtonNuevoGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEvaluacionesBonificaciones")) {
				jButtonNuevoGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEvaluacionesBonificaciones")) {
				jButtonCerrarReporteDinamicoEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEvaluacionesBonificaciones")) {
				jButtonGenerarReporteDinamicoEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEvaluacionesBonificaciones")) {
				
				jButtonGenerarExcelReporteDinamicoEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEvaluacionesBonificaciones")) {
				jButtonCerrarImportacionEvaluacionesBonificacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEvaluacionesBonificaciones")) {
				
				jButtonGenerarImportacionEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEvaluacionesBonificaciones")) {
				
				jButtonAbrirImportacionEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEvaluacionesBonificaciones")) {
				jComboBoxTiposAccionesEvaluacionesBonificacionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEvaluacionesBonificaciones")) {
				jComboBoxTiposRelacionesEvaluacionesBonificacionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEvaluacionesBonificaciones")) {
				jComboBoxTiposAccionesEvaluacionesBonificacionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEvaluacionesBonificaciones")) {
				
				jComboBoxTiposSeleccionarEvaluacionesBonificacionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEvaluacionesBonificaciones")) {
				jTextFieldValorCampoGeneralEvaluacionesBonificacionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEvaluacionesBonificaciones")) {
				jButtonAbrirOrderByEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEvaluacionesBonificaciones")) {
				jButtonAbrirOrderByEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEvaluacionesBonificaciones")) {
				jButtonCerrarOrderByEvaluacionesBonificacionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEvaluacionesBonificacionesBusqueda")) {
				this.jButtonidEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("verificadoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonverificadoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesBonificacionesUpdate")) {
				this.jButtonid_estructuraEvaluacionesBonificacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesBonificacionesBusqueda")) {
				this.jButtonid_estructuraEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEvaluacionesBonificacionesBusqueda")) {
				this.jButtoncodigoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesBonificacionesUpdate")) {
				this.jButtonid_empresaEvaluacionesBonificacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesBonificacionesBusqueda")) {
				this.jButtonid_empresaEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesBonificacionesUpdate")) {
				this.jButtonid_sucursalEvaluacionesBonificacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesBonificacionesBusqueda")) {
				this.jButtonid_sucursalEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoEvaluacionesBonificacionesBusqueda")) {
				this.jButtoncodigo_datoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonnombre_completoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sueldoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonsueldoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_conocimientoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonvalor_conocimientoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_eficienciaEvaluacionesBonificacionesBusqueda")) {
				this.jButtonvalor_eficienciaEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_obtenidoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonvalor_obtenidoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pesoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonvalor_pesoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("bonificacionEvaluacionesBonificacionesBusqueda")) {
				this.jButtonbonificacionEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones")) {
				this.jButtonBusquedaEvaluacionesBonificacionesEvaluacionesBonificacionesActionPerformed(evt);
			}
			
			;
			
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEvaluacionesBonificaciones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				


				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesBonificaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesBonificaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EvaluacionesBonificaciones evaluacionesbonificacionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				evaluacionesbonificacionesLocal=this.evaluacionesbonificaciones;
			} else {
				evaluacionesbonificacionesLocal=this.evaluacionesbonificacionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
							
				
				


				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesBonificaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesBonificaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
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
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
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
			
			


			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
								
						
				


				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesBonificaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesBonificaciones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
								
				
				


				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesBonificaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesBonificaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
							
				
				


				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesBonificaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesBonificaciones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
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
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
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
			
			


			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
								
				
				


				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesBonificaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesBonificaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEvaluacionesBonificaciones")) {
					jCheckBoxSeleccionarTodosEvaluacionesBonificacionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEvaluacionesBonificaciones")) {
					jCheckBoxSeleccionadosEvaluacionesBonificacionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEvaluacionesBonificaciones")) {
					
				}
				
				


				
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesBonificaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesBonificaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
												
				
				


				
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesBonificaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesBonificaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
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
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
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
			
			


			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesBonificaciones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesBonificaciones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesbonificaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesbonificaciones);
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
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
				
				


				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesBonificaciones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesBonificaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesBonificacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesbonificacionesAnterior =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEvaluacionesBonificaciones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEvaluacionesBonificacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEvaluacionesBonificaciones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.evaluacionesbonificaciones =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.evaluacionesbonificaciones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEvaluacionesBonificaciones")) {
				
				}
				
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEvaluacionesBonificaciones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEvaluacionesBonificaciones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEvaluacionesBonificaciones")) {
			
			}
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEvaluacionesBonificaciones();
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
			if(sTipo.equals("NuevoEvaluacionesBonificaciones")) {
				jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEvaluacionesBonificaciones")) {
				jButtonDuplicarEvaluacionesBonificacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEvaluacionesBonificaciones")) {
				jButtonCopiarEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEvaluacionesBonificaciones")) {
				jButtonVerFormEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEvaluacionesBonificaciones")) {
				jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEvaluacionesBonificaciones")) {
				jButtonModificarEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEvaluacionesBonificaciones")) {
				jButtonActualizarEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEvaluacionesBonificaciones")) {
				jButtonEliminarEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEvaluacionesBonificaciones")) {
				jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEvaluacionesBonificaciones")) {
				jButtonCancelarEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEvaluacionesBonificaciones")) {
				jButtonCerrarEvaluacionesBonificacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEvaluacionesBonificaciones")) {
				jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEvaluacionesBonificaciones")) {
				jButtonNuevoGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEvaluacionesBonificaciones")) {
				jButtonAbrirOrderByEvaluacionesBonificacionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEvaluacionesBonificaciones")) {
				jButtonRecargarInformacionEvaluacionesBonificacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEvaluacionesBonificaciones")) {
				jButtonAnterioresEvaluacionesBonificacionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEvaluacionesBonificaciones")) {
				jButtonSiguientesEvaluacionesBonificacionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEvaluacionesBonificacionesBusqueda")) {
				this.jButtonidEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("verificadoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonverificadoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesBonificacionesUpdate")) {
				this.jButtonid_estructuraEvaluacionesBonificacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesBonificacionesBusqueda")) {
				this.jButtonid_estructuraEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEvaluacionesBonificacionesBusqueda")) {
				this.jButtoncodigoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesBonificacionesUpdate")) {
				this.jButtonid_empresaEvaluacionesBonificacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesBonificacionesBusqueda")) {
				this.jButtonid_empresaEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesBonificacionesUpdate")) {
				this.jButtonid_sucursalEvaluacionesBonificacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesBonificacionesBusqueda")) {
				this.jButtonid_sucursalEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoEvaluacionesBonificacionesBusqueda")) {
				this.jButtoncodigo_datoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonnombre_completoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sueldoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonsueldoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_conocimientoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonvalor_conocimientoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_eficienciaEvaluacionesBonificacionesBusqueda")) {
				this.jButtonvalor_eficienciaEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_obtenidoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonvalor_obtenidoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pesoEvaluacionesBonificacionesBusqueda")) {
				this.jButtonvalor_pesoEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("bonificacionEvaluacionesBonificacionesBusqueda")) {
				this.jButtonbonificacionEvaluacionesBonificacionesBusquedaActionPerformed(evt);
			}
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEvaluacionesBonificaciones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEvaluacionesBonificaciones")) {
				closingInternalFrameEvaluacionesBonificaciones();
				
			} else if(sTipo.equals("jButtonCancelarEvaluacionesBonificaciones")) {
				JInternalFrameBase jInternalFrameDetalleFormEvaluacionesBonificaciones = (JInternalFrameBase)evt.getSource();
	            	
	            EvaluacionesBonificacionesBeanSwingJInternalFrame jInternalFrameParent=(EvaluacionesBonificacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormEvaluacionesBonificaciones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEvaluacionesBonificacionesActionPerformed(null);
			}
			
			EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.evaluacionesbonificaciones,new Object(),this.evaluacionesbonificacionesParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEvaluacionesBonificaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEvaluacionesBonificaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEvaluacionesBonificaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.evaluacionesbonificaciones)) {
			if(!esControlTabla) {
				if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);			
				}
				
				if(this.evaluacionesbonificacionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEvaluacionesBonificaciones(this.evaluacionesbonificacionesReturnGeneral,this.evaluacionesbonificacionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.evaluacionesbonificacionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEvaluacionesBonificaciones(classes,this.evaluacionesbonificacionesReturnGeneral,this.evaluacionesbonificacionesBean,false);
					}
						
					if(this.evaluacionesbonificacionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesBonificaciones(this.evaluacionesbonificacionesReturnGeneral.getEvaluacionesBonificaciones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEvaluacionesBonificaciones(this.evaluacionesbonificacionesReturnGeneral.getEvaluacionesBonificaciones());	
					}
						
					if(this.evaluacionesbonificacionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEvaluacionesBonificaciones(this.evaluacionesbonificacionesReturnGeneral.getEvaluacionesBonificaciones(),classes);//this.evaluacionesbonificacionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEvaluacionesBonificaciones(this.evaluacionesbonificaciones,classes);//this.evaluacionesbonificacionesBean);									
				}
			
				if(EvaluacionesBonificacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEvaluacionesBonificaciones(this.evaluacionesbonificaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesBonificaciones(this.evaluacionesbonificaciones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.evaluacionesbonificacionesAnterior!=null) {
						this.evaluacionesbonificaciones=this.evaluacionesbonificacionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.evaluacionesbonificacionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.evaluacionesbonificacionesReturnGeneral.getEvaluacionesBonificaciones(),evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.evaluacionesbonificacionesReturnGeneral.getEvaluacionesBonificaciones(),this.evaluacionesbonificacioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEvaluacionesBonificaciones.repaint();
				
				//((AbstractTableModel) this.jTableDatosEvaluacionesBonificaciones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEvaluacionesBonificaciones();
			}
		}
	}
	
	public void actualizarVisualTableDatosEvaluacionesBonificaciones() throws Exception {
		
		EvaluacionesBonificacionesModel evaluacionesbonificacionesModel=(EvaluacionesBonificacionesModel)this.jTableDatosEvaluacionesBonificaciones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionesbonificacionesModel.evaluacionesbonificacioness=this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			evaluacionesbonificacionesModel.evaluacionesbonificacioness=this.evaluacionesbonificacioness;
		}
		
		
		((EvaluacionesBonificacionesModel) this.jTableDatosEvaluacionesBonificaciones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEvaluacionesBonificaciones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getevaluacionesbonificacionesAnterior(),this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getevaluacionesbonificacionesAnterior(),this.evaluacionesbonificacioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEvaluacionesBonificaciones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
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
										
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionesbonificaciones,new Object(),generalEntityParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EvaluacionesBonificacionesConstantesFunciones.getClassesRelationshipsOfEvaluacionesBonificaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EvaluacionesBonificacionesConstantesFunciones.getClassesRelationshipsFromStringsOfEvaluacionesBonificaciones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEvaluacionesBonificaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionesbonificaciones,new Object(),generalEntityParameterGeneral,this.evaluacionesbonificacionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEvaluacionesBonificaciones(EvaluacionesBonificacionesBean evaluacionesbonificacionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEvaluacionesBonificaciones(ArrayList<Classe> classes,EvaluacionesBonificacionesReturnGeneral evaluacionesbonificacionesReturnGeneral,EvaluacionesBonificacionesBean evaluacionesbonificacionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.evaluacionesbonificaciones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones = new EvaluacionesBonificacionesDetalleFormJInternalFrame(jDesktopPane,this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones(),this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setVisible(false);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setSelected(false);						
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.evaluacionesbonificacionesLogic=this.evaluacionesbonificacionesLogic;
		
		this.cargarCombosFrameForeignKeyEvaluacionesBonificaciones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEvaluacionesBonificaciones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEvaluacionesBonificaciones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEvaluacionesBonificaciones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEvaluacionesBonificaciones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEvaluacionesBonificaciones"));
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonModificarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"ModificarEvaluacionesBonificaciones"));

		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonModificarToolBarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarEvaluacionesBonificaciones"));
					
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemModificarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarEvaluacionesBonificaciones"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonActualizarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"ActualizarEvaluacionesBonificaciones"));
		
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonActualizarToolBarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEvaluacionesBonificaciones"));
						
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemActualizarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEvaluacionesBonificaciones"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonEliminarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"EliminarEvaluacionesBonificaciones"));
		
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonEliminarToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarEvaluacionesBonificaciones"));
								
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemEliminarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEvaluacionesBonificaciones"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonCancelarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"CancelarEvaluacionesBonificaciones"));
		
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonCancelarToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarEvaluacionesBonificaciones"));
					
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemCancelarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEvaluacionesBonificaciones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemDetalleCerrarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEvaluacionesBonificaciones"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionesBonificaciones"));
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionesBonificaciones"));
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEvaluacionesBonificaciones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonidEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonverificadoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"verificadoEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_estructuraEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_estructuraEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtoncodigoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_empresaEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_empresaEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_sucursalEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_sucursalEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonnombre_completoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonsueldoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"sueldoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_pesoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonbonificacionEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"bonificacionEvaluacionesBonificacionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTabbedPaneRelacionesEvaluacionesBonificaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEvaluacionesBonificaciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEvaluacionesBonificaciones"));
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEvaluacionesBonificaciones"));
		}
		
		this.jTableDatosEvaluacionesBonificaciones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEvaluacionesBonificaciones"));
		
		this.jTableDatosEvaluacionesBonificaciones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEvaluacionesBonificaciones"));
		
		this.jButtonNuevoEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"NuevoEvaluacionesBonificaciones"));
		
		this.jButtonDuplicarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"DuplicarEvaluacionesBonificaciones"));
		
		this.jButtonCopiarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"CopiarEvaluacionesBonificaciones"));
		
		this.jButtonVerFormEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"VerFormEvaluacionesBonificaciones"));
		
		
		this.jButtonNuevoToolBarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"NuevoToolBarEvaluacionesBonificaciones"));
			
		this.jButtonDuplicarToolBarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEvaluacionesBonificaciones"));
			
		this.jMenuItemNuevoEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEvaluacionesBonificaciones"));
			
		this.jMenuItemDuplicarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEvaluacionesBonificaciones"));		
		
		
		this.jButtonNuevoRelacionesEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEvaluacionesBonificaciones"));
		
		
		this.jButtonNuevoRelacionesToolBarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEvaluacionesBonificaciones"));
			
		this.jMenuItemNuevoRelacionesEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEvaluacionesBonificaciones"));		
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonModificarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"ModificarEvaluacionesBonificaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonModificarToolBarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarEvaluacionesBonificaciones"));
			
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemModificarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarEvaluacionesBonificaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonActualizarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"ActualizarEvaluacionesBonificaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonActualizarToolBarEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEvaluacionesBonificaciones"));
				
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemActualizarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEvaluacionesBonificaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonEliminarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"EliminarEvaluacionesBonificaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonEliminarToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarEvaluacionesBonificaciones"));
						
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemEliminarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEvaluacionesBonificaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonCancelarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"CancelarEvaluacionesBonificaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonCancelarToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarEvaluacionesBonificaciones"));
			
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemCancelarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEvaluacionesBonificaciones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEvaluacionesBonificaciones"));		
		
		
		this.jButtonCerrarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"CerrarEvaluacionesBonificaciones"));
		
		
		this.jButtonCerrarToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"CerrarToolBarEvaluacionesBonificaciones"));
			
		this.jMenuItemCerrarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEvaluacionesBonificaciones"));
			
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jMenuItemDetalleCerrarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEvaluacionesBonificaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosEvaluacionesBonificaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionesBonificaciones"));
		}
		
		this.jButtonCopiarToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"CopiarToolBarEvaluacionesBonificaciones"));
			
		this.jButtonVerFormToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"VerFormToolBarEvaluacionesBonificaciones"));
		
		this.jMenuItemGuardarCambiosEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEvaluacionesBonificaciones"));
			
		this.jMenuItemCopiarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEvaluacionesBonificaciones"));		
		
		this.jMenuItemVerFormEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEvaluacionesBonificaciones"));		
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEvaluacionesBonificaciones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEvaluacionesBonificaciones"));
			
		this.jMenuItemGuardarCambiosTablaEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEvaluacionesBonificaciones"));		
		
		
		
		this.jButtonRecargarInformacionEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionEvaluacionesBonificaciones"));
					
		this.jButtonRecargarInformacionToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEvaluacionesBonificaciones"));
		
		this.jMenuItemRecargarInformacionEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEvaluacionesBonificaciones"));		
		
		
		
		this.jButtonAnterioresEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"AnterioresEvaluacionesBonificaciones"));
		
		
		this.jButtonAnterioresToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEvaluacionesBonificaciones"));
		
		this.jMenuItemAnterioresEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEvaluacionesBonificaciones"));		
		
		
		this.jButtonSiguientesEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"SiguientesEvaluacionesBonificaciones"));
		
		
		this.jButtonSiguientesToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEvaluacionesBonificaciones"));
			
		this.jMenuItemSiguientesEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEvaluacionesBonificaciones"));
			
		this.jMenuItemAbrirOrderByEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEvaluacionesBonificaciones"));
			
		this.jMenuItemMostrarOcultarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEvaluacionesBonificaciones"));
			
		this.jMenuItemDetalleAbrirOrderByEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEvaluacionesBonificaciones"));
			
		this.jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEvaluacionesBonificaciones"));		
		
		
		this.jButtonNuevoGuardarCambiosEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEvaluacionesBonificaciones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEvaluacionesBonificaciones"));
			
		this.jMenuItemNuevoGuardarCambiosEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEvaluacionesBonificaciones"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEvaluacionesBonificaciones"));

		this.jCheckBoxSeleccionadosEvaluacionesBonificaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEvaluacionesBonificaciones"));
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEvaluacionesBonificaciones"));
		}
		
		
		this.jComboBoxTiposRelacionesEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"TiposRelacionesEvaluacionesBonificaciones"));
			
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesEvaluacionesBonificaciones"));
					
		this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEvaluacionesBonificaciones"));
			
		this.jTextFieldValorCampoGeneralEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEvaluacionesBonificaciones"));		
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonidEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonverificadoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"verificadoEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_estructuraEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_estructuraEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtoncodigoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_empresaEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_empresaEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_sucursalEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_sucursalEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonnombre_completoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonsueldoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"sueldoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_pesoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonbonificacionEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"bonificacionEvaluacionesBonificacionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"BusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionesBonificaciones"));
				this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionesBonificaciones"));
				this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionesBonificaciones"));
			}
			
			//this.jButtonCerrarReporteDinamicoEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionesBonificaciones"));				
			//this.jButtonGenerarReporteDinamicoEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionesBonificaciones"));
			//this.jButtonGenerarExcelReporteDinamicoEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionesBonificaciones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEvaluacionesBonificaciones!=null) {
				this.jInternalFrameImportacionEvaluacionesBonificaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEvaluacionesBonificaciones"));
				this.jInternalFrameImportacionEvaluacionesBonificaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEvaluacionesBonificaciones"));
				this.jInternalFrameImportacionEvaluacionesBonificaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEvaluacionesBonificaciones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByEvaluacionesBonificaciones"));
			
			this.jButtonAbrirOrderByToolBarEvaluacionesBonificaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEvaluacionesBonificaciones"));			
			
			if(this.jInternalFrameOrderByEvaluacionesBonificaciones!=null) {
				this.jInternalFrameOrderByEvaluacionesBonificaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEvaluacionesBonificaciones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTabbedPaneRelacionesEvaluacionesBonificaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEvaluacionesBonificaciones"));
		
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
            		closingInternalFrameEvaluacionesBonificaciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEvaluacionesBonificaciones = (JInternalFrameBase)event.getSource();
	            	
	            EvaluacionesBonificacionesBeanSwingJInternalFrame jInternalFrameParent=(EvaluacionesBonificacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormEvaluacionesBonificaciones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEvaluacionesBonificacionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEvaluacionesBonificaciones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEvaluacionesBonificacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEvaluacionesBonificaciones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEvaluacionesBonificaciones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEvaluacionesBonificaciones";
		inputMap = this.jButtonNuevoEvaluacionesBonificaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEvaluacionesBonificaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEvaluacionesBonificaciones";
		inputMap = this.jButtonNuevoRelacionesEvaluacionesBonificaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEvaluacionesBonificaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEvaluacionesBonificacionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEvaluacionesBonificaciones";
		inputMap = this.jButtonModificarEvaluacionesBonificaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEvaluacionesBonificaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEvaluacionesBonificacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEvaluacionesBonificaciones";
		inputMap = this.jButtonActualizarEvaluacionesBonificaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEvaluacionesBonificaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEvaluacionesBonificacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEvaluacionesBonificaciones";
		inputMap = this.jButtonEliminarEvaluacionesBonificaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEvaluacionesBonificaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEvaluacionesBonificacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEvaluacionesBonificaciones";
		inputMap = this.jButtonCancelarEvaluacionesBonificaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEvaluacionesBonificaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEvaluacionesBonificacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEvaluacionesBonificaciones";
		inputMap = this.jButtonCerrarEvaluacionesBonificaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEvaluacionesBonificaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEvaluacionesBonificacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEvaluacionesBonificaciones";
		inputMap = this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosEvaluacionesBonificaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonGuardarCambiosEvaluacionesBonificaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEvaluacionesBonificacionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEvaluacionesBonificaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEvaluacionesBonificacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEvaluacionesBonificacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEvaluacionesBonificaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEvaluacionesBonificacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonidEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonverificadoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"verificadoEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_estructuraEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_estructuraEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtoncodigoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_empresaEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_empresaEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesBonificacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_sucursalEvaluacionesBonificacionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesBonificacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonid_sucursalEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtoncodigo_datoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonnombre_completoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonsueldoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"sueldoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_conocimientoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_eficienciaEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_obtenidoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonvalor_pesoEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_pesoEvaluacionesBonificacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jButtonbonificacionEvaluacionesBonificacionesBusqueda.addActionListener(new ButtonActionListener(this,"bonificacionEvaluacionesBonificacionesBusqueda"));
		
		
		this.jButtonBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.addActionListener(new ButtonActionListener(this,"BusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEvaluacionesBonificaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEvaluacionesBonificacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEvaluacionesBonificacionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEvaluacionesBonificaciones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
					evaluacionesbonificacionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacioness) {
					evaluacionesbonificacionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEvaluacionesBonificacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
						evaluacionesbonificacionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacioness) {
						evaluacionesbonificacionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
					
						if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_VERIFICADO)) {
							existe=true;
							evaluacionesbonificacionesAux.setverificado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacioness) {
						
						if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_VERIFICADO)) {
							existe=true;
							evaluacionesbonificacionesAux.setverificado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEvaluacionesBonificaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEvaluacionesBonificaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEvaluacionesBonificacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEvaluacionesBonificaciones.getSelectedRows();
			
			EvaluacionesBonificaciones evaluacionesbonificacionesLocal=new EvaluacionesBonificaciones();
			
			//this.seleccionarTodosEvaluacionesBonificaciones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionesbonificacionesLocal =(EvaluacionesBonificaciones) this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					evaluacionesbonificacionesLocal =(EvaluacionesBonificaciones) this.evaluacionesbonificacioness.toArray()[this.jTableDatosEvaluacionesBonificaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				evaluacionesbonificacionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
						evaluacionesbonificacionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacioness) {
						evaluacionesbonificacionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEvaluacionesBonificaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEvaluacionesBonificaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesBonificaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEvaluacionesBonificacionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEvaluacionesBonificacionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEvaluacionesBonificacionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEvaluacionesBonificaciones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
				
						if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							evaluacionesbonificacionesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							evaluacionesbonificacionesAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							evaluacionesbonificacionesAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO)) {
							existe=true;
							evaluacionesbonificacionesAux.setsueldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO)) {
							existe=true;
							evaluacionesbonificacionesAux.setvalor_conocimiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA)) {
							existe=true;
							evaluacionesbonificacionesAux.setvalor_eficiencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO)) {
							existe=true;
							evaluacionesbonificacionesAux.setvalor_obtenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO)) {
							existe=true;
							evaluacionesbonificacionesAux.setvalor_peso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION)) {
							existe=true;
							evaluacionesbonificacionesAux.setbonificacion(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacioness) {
					
						if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							evaluacionesbonificacionesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							evaluacionesbonificacionesAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							evaluacionesbonificacionesAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO)) {
							existe=true;
							evaluacionesbonificacionesAux.setsueldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO)) {
							existe=true;
							evaluacionesbonificacionesAux.setvalor_conocimiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA)) {
							existe=true;
							evaluacionesbonificacionesAux.setvalor_eficiencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO)) {
							existe=true;
							evaluacionesbonificacionesAux.setvalor_obtenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO)) {
							existe=true;
							evaluacionesbonificacionesAux.setvalor_peso(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION)) {
							existe=true;
							evaluacionesbonificacionesAux.setbonificacion(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEvaluacionesBonificacionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEvaluacionesBonificaciones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEvaluacionesBonificaciones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEvaluacionesBonificaciones) {				
					conSplash=true;//false;										
					
					//this.startProcessEvaluacionesBonificaciones(conSplash);
				
					this.generarReporteEvaluacionesBonificacionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEvaluacionesBonificacionessSeleccionados();
				//this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEvaluacionesBonificacionessSeleccionados(false);
				//this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEvaluacionesBonificacionessSeleccionados(true);
				//this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEvaluacionesBonificaciones();
				
				this.exportarEvaluacionesBonificacionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEvaluacionesBonificacioness();
				//this.importarEvaluacionesBonificacioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEvaluacionesBonificaciones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEvaluacionesBonificacionessSeleccionados();
				//this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Evaluaciones Bonificaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEvaluacionesBonificaciones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEvaluacionesBonificaciones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEvaluacionesBonificaciones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Evaluaciones Bonificaciones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setSelectedIndex(0);					
				}	
			} 			
			else if(EvaluacionesBonificacionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEvaluacionesBonificaciones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEvaluacionesBonificaciones(conSplash);
					
						//this.actualizarParametrosGeneralEvaluacionesBonificaciones();
						
						this.generarReporteProcesoAccionEvaluacionesBonificacionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Evaluaciones BonificacionesES SELECCIONADOS?", "MANTENIMIENTO DE Evaluaciones Bonificaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEvaluacionesBonificaciones();
				
						this.actualizarParametrosGeneralEvaluacionesBonificaciones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.evaluacionesbonificacionesReturnGeneral=evaluacionesbonificacionesLogic.procesarAccionEvaluacionesBonificacionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness(),this.evaluacionesbonificacionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEvaluacionesBonificacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEvaluacionesBonificaciones();
					
					EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEvaluacionesBonificacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxTiposAccionesFormularioEvaluacionesBonificaciones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEvaluacionesBonificaciones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEvaluacionesBonificacionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEvaluacionesBonificaciones();
			
			if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();		
			EvaluacionesBonificaciones evaluacionesbonificaciones=new EvaluacionesBonificaciones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEvaluacionesBonificaciones.getSelectedItem();
			
			
			
			
			evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(evaluacionesbonificacionessSeleccionados.size()==1) {
				for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacionessSeleccionados) {
					evaluacionesbonificaciones=evaluacionesbonificacionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEvaluacionesBonificaciones();
			
      		//this.finishProcessEvaluacionesBonificaciones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEvaluacionesBonificacionesReturnGeneral() throws Exception {
		if(this.evaluacionesbonificacionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.evaluacionesbonificacionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.evaluacionesbonificacionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.evaluacionesbonificacionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.evaluacionesbonificacionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.evaluacionesbonificacionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
		}
		
		if(this.evaluacionesbonificacionesReturnGeneral.getConRetornoLista() || this.evaluacionesbonificacionesReturnGeneral.getConRetornoObjeto()) {
			if(this.evaluacionesbonificacionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.evaluacionesbonificacionesLogic.setEvaluacionesBonificacioness(this.evaluacionesbonificacionesReturnGeneral.getEvaluacionesBonificacioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingEvaluacionesBonificaciones(false);
		}
	}
	
	public void actualizarParametrosGeneralEvaluacionesBonificaciones() throws Exception {
		
		
	}
	
	public ArrayList<EvaluacionesBonificaciones> getEvaluacionesBonificacionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEvaluacionesBonificaciones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness()) {
					if(evaluacionesbonificacionesAux.getIsSelected()) {
						evaluacionesbonificacionessSeleccionados.add(evaluacionesbonificacionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:this.evaluacionesbonificacioness) {
					if(evaluacionesbonificacionesAux.getIsSelected()) {
						evaluacionesbonificacionessSeleccionados.add(evaluacionesbonificacionesAux);				
					}
				}
			}
			
			if(evaluacionesbonificacionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						evaluacionesbonificacionessSeleccionados.addAll(this.evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						evaluacionesbonificacionessSeleccionados.addAll(this.evaluacionesbonificacioness);				
					}
				}
			}
		} else {
			evaluacionesbonificacionessSeleccionados.add(this.evaluacionesbonificaciones);
		}
		
		return evaluacionesbonificacionessSeleccionados;
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
	
	public void generarReporteEvaluacionesBonificacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEvaluacionesBonificacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEvaluacionesBonificacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEvaluacionesBonificacionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEvaluacionesBonificacionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Evaluaciones Bonificaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEvaluacionesBonificacionessSeleccionados() throws Exception {
		ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();		
		
		evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEvaluacionesBonificacioness("Todos",evaluacionesbonificacionessSeleccionados);
		
	}	
	
	public void generarReporteNormalEvaluacionesBonificacionessSeleccionados() throws Exception {
		ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();		
		
		evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEvaluacionesBonificacioness("Todos",evaluacionesbonificacionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEvaluacionesBonificacionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();
		
		evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEvaluacionesBonificacioness("Todos",evaluacionesbonificacionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEvaluacionesBonificacionessSeleccionados() throws Exception {
		ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEvaluacionesBonificaciones();
		
		
		evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEvaluacionesBonificaciones();
		
		
		//this.generarReporteEvaluacionesBonificacioness("Todos",evaluacionesbonificacionessSeleccionados ,evaluacionesbonificacionesImplementable,evaluacionesbonificacionesImplementableHome);
	}
	
	public void mostrarImportacionEvaluacionesBonificacioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEvaluacionesBonificaciones();
		
		this.abrirFrameImportacionEvaluacionesBonificaciones();		
		
			
		//this.generarReporteEvaluacionesBonificacioness("Todos",evaluacionesbonificacionessSeleccionados ,evaluacionesbonificacionesImplementable,evaluacionesbonificacionesImplementableHome);
	}
	
	public void importarEvaluacionesBonificacioness() throws Exception {		
	
	}
	
	public void exportarEvaluacionesBonificacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEvaluacionesBonificacionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEvaluacionesBonificacionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEvaluacionesBonificacionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Evaluaciones Bonificaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEvaluacionesBonificacionessSeleccionados() throws Exception {
		ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();		
		
		evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesbonificaciones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEvaluacionesBonificaciones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEvaluacionesBonificaciones(evaluacionesbonificacionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//evaluacionesbonificacionesAux.setsDetalleGeneralEntityReporte(evaluacionesbonificacionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Bonificaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEvaluacionesBonificaciones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_VERIFICADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=evaluacionesbonificaciones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.gettipocalificacionempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getverificado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getcodigo_dato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getsueldo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getvalor_conocimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getvalor_eficiencia().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getvalor_obtenido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getvalor_peso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesbonificaciones.getbonificacion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEvaluacionesBonificacionessSeleccionados() throws Exception {
		ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();		
		
		evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesbonificaciones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EvaluacionesBonificacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEvaluacionesBonificaciones(row);				
				iRow++;
			}				
			
			for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEvaluacionesBonificaciones(evaluacionesbonificacionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Bonificaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEvaluacionesBonificacionessSeleccionados() throws Exception {
		ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();		
		
		evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesbonificaciones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("evaluacionesbonificacioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("evaluacionesbonificaciones");
			//elementRoot.appendChild(element);
		
			for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacionessSeleccionados) {
				element = document.createElement("evaluacionesbonificaciones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEvaluacionesBonificaciones(evaluacionesbonificacionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Bonificaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEvaluacionesBonificaciones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VERIFICADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_SUELDO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORCONOCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOREFICIENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALOROBTENIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_VALORPESO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesBonificacionesConstantesFunciones.LABEL_BONIFICACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.gettipocalificacionempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getverificado());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getcodigo_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getsueldo());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getvalor_conocimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getvalor_eficiencia());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getvalor_obtenido());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getvalor_peso());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesbonificaciones.getbonificacion());				
	}
	
	public void setFilaDatosExportarXmlEvaluacionesBonificaciones(EvaluacionesBonificaciones evaluacionesbonificaciones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EvaluacionesBonificacionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(evaluacionesbonificaciones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EvaluacionesBonificacionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(evaluacionesbonificaciones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipocalificacionempleado_descripcion = document.createElement(EvaluacionesBonificacionesConstantesFunciones.IDTIPOCALIFICACIONEMPLEADO);
		elementtipocalificacionempleado_descripcion.appendChild(document.createTextNode(evaluacionesbonificaciones.gettipocalificacionempleado_descripcion()));
		element.appendChild(elementtipocalificacionempleado_descripcion);

		Element elementverificado = document.createElement(EvaluacionesBonificacionesConstantesFunciones.VERIFICADO);
		elementverificado.appendChild(document.createTextNode(evaluacionesbonificaciones.getverificado().toString().trim()));
		element.appendChild(elementverificado);

		Element elementestructura_descripcion = document.createElement(EvaluacionesBonificacionesConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(evaluacionesbonificaciones.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementcodigo = document.createElement(EvaluacionesBonificacionesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(evaluacionesbonificaciones.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementempresa_descripcion = document.createElement(EvaluacionesBonificacionesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(evaluacionesbonificaciones.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(EvaluacionesBonificacionesConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(evaluacionesbonificaciones.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcodigo_dato = document.createElement(EvaluacionesBonificacionesConstantesFunciones.CODIGODATO);
		elementcodigo_dato.appendChild(document.createTextNode(evaluacionesbonificaciones.getcodigo_dato().trim()));
		element.appendChild(elementcodigo_dato);

		Element elementnombre_completo = document.createElement(EvaluacionesBonificacionesConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(evaluacionesbonificaciones.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementsueldo = document.createElement(EvaluacionesBonificacionesConstantesFunciones.SUELDO);
		elementsueldo.appendChild(document.createTextNode(evaluacionesbonificaciones.getsueldo().toString().trim()));
		element.appendChild(elementsueldo);

		Element elementvalor_conocimiento = document.createElement(EvaluacionesBonificacionesConstantesFunciones.VALORCONOCIMIENTO);
		elementvalor_conocimiento.appendChild(document.createTextNode(evaluacionesbonificaciones.getvalor_conocimiento().toString().trim()));
		element.appendChild(elementvalor_conocimiento);

		Element elementvalor_eficiencia = document.createElement(EvaluacionesBonificacionesConstantesFunciones.VALOREFICIENCIA);
		elementvalor_eficiencia.appendChild(document.createTextNode(evaluacionesbonificaciones.getvalor_eficiencia().toString().trim()));
		element.appendChild(elementvalor_eficiencia);

		Element elementvalor_obtenido = document.createElement(EvaluacionesBonificacionesConstantesFunciones.VALOROBTENIDO);
		elementvalor_obtenido.appendChild(document.createTextNode(evaluacionesbonificaciones.getvalor_obtenido().toString().trim()));
		element.appendChild(elementvalor_obtenido);

		Element elementvalor_peso = document.createElement(EvaluacionesBonificacionesConstantesFunciones.VALORPESO);
		elementvalor_peso.appendChild(document.createTextNode(evaluacionesbonificaciones.getvalor_peso().toString().trim()));
		element.appendChild(elementvalor_peso);

		Element elementbonificacion = document.createElement(EvaluacionesBonificacionesConstantesFunciones.BONIFICACION);
		elementbonificacion.appendChild(document.createTextNode(evaluacionesbonificaciones.getbonificacion().toString().trim()));
		element.appendChild(elementbonificacion);
	}
	
	public void generarReporteGroupGenericoEvaluacionesBonificacionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados=new ArrayList<EvaluacionesBonificaciones>();
		
		evaluacionesbonificacionessSeleccionados=this.getEvaluacionesBonificacionessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEvaluacionesBonificaciones(evaluacionesbonificacionessSeleccionados);
		
		this.generarReporteEvaluacionesBonificacioness("Todos",evaluacionesbonificacionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEvaluacionesBonificaciones(ArrayList<EvaluacionesBonificaciones> evaluacionesbonificacionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EvaluacionesBonificaciones evaluacionesbonificacionesAux:evaluacionesbonificacionessSeleccionados) {
				evaluacionesbonificacionesAux.setsDetalleGeneralEntityReporte(evaluacionesbonificacionesAux.toString());
			
				if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO)) {
					existe=true;
					evaluacionesbonificacionesAux.setsDescripcionGeneralEntityReporte1(evaluacionesbonificacionesAux.gettipocalificacionempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_VERIFICADO)) {
					existe=true;
					evaluacionesbonificacionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(evaluacionesbonificacionesAux.getverificado()));
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					evaluacionesbonificacionesAux.setsDescripcionGeneralEntityReporte1(evaluacionesbonificacionesAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					evaluacionesbonificacionesAux.setsDescripcionGeneralEntityReporte1(evaluacionesbonificacionesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					evaluacionesbonificacionesAux.setsDescripcionGeneralEntityReporte1(evaluacionesbonificacionesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					evaluacionesbonificacionesAux.setsDescripcionGeneralEntityReporte1(evaluacionesbonificacionesAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_CODIGODATO)) {
					existe=true;
					evaluacionesbonificacionesAux.setsDescripcionGeneralEntityReporte1(evaluacionesbonificacionesAux.getcodigo_dato());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesBonificacionesConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					evaluacionesbonificacionesAux.setsDescripcionGeneralEntityReporte1(evaluacionesbonificacionesAux.getnombre_completo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesBonificacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEvaluacionesBonificaciones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=true;
				this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=true;
				this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=true;
			}
			
			this.isVisibilidadCeldaModificarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaModificarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaModificarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaModificarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaModificarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaModificarEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EvaluacionesBonificacionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=true;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=true;
		} else {
			this.actualizarEstadoPanelsEvaluacionesBonificaciones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEvaluacionesBonificaciones=false;
			//this.isVisibilidadCeldaVerFormEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaDuplicarEvaluacionesBonificaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=false;
		} else {
			this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
			if(!evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=false;												
			}
			
			this.jButtonCerrarEvaluacionesBonificaciones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.evaluacionesbonificaciones)) {
			this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=false;
			this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoEvaluacionesBonificaciones=false;
		this.isVisibilidadCeldaNuevoRelacionesEvaluacionesBonificaciones=false;
		this.isVisibilidadCeldaGuardarCambiosEvaluacionesBonificaciones=false;
		//this.isVisibilidadCeldaModificarEvaluacionesBonificaciones=true;
		this.isVisibilidadCeldaActualizarEvaluacionesBonificaciones=false;
		this.isVisibilidadCeldaEliminarEvaluacionesBonificaciones=false;
		//this.isVisibilidadCeldaCancelarEvaluacionesBonificaciones=true;			
		this.isVisibilidadCeldaGuardarEvaluacionesBonificaciones=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEvaluacionesBonificaciones() {
	}
	
	public void actualizarEstadoPanelsEvaluacionesBonificaciones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones!=null) {
				this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEvaluacionesBonificaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesBonificaciones!=null) {
				this.jPanelPaginacionEvaluacionesBonificaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesBonificaciones!=null) {
				this.jPanelParametrosReportesEvaluacionesBonificaciones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones!=null) {
				this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEvaluacionesBonificaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionesBonificaciones!=null) {
				this.jPanelPaginacionEvaluacionesBonificaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesBonificaciones!=null) {
				this.jPanelParametrosReportesEvaluacionesBonificaciones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones!=null) {
				this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEvaluacionesBonificaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionesBonificaciones!=null) {
				this.jPanelPaginacionEvaluacionesBonificaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesBonificaciones!=null) {
				this.jPanelParametrosReportesEvaluacionesBonificaciones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones!=null) {
				this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEvaluacionesBonificaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionesBonificaciones!=null) {
				this.jPanelPaginacionEvaluacionesBonificaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesBonificaciones!=null) {
				this.jPanelParametrosReportesEvaluacionesBonificaciones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones!=null) {
				this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEvaluacionesBonificaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesBonificaciones!=null) {
				this.jPanelPaginacionEvaluacionesBonificaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesBonificaciones!=null) {
				this.jPanelParametrosReportesEvaluacionesBonificaciones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones!=null) {
				this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEvaluacionesBonificaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesBonificaciones!=null) {
				this.jPanelPaginacionEvaluacionesBonificaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesBonificaciones!=null) {
				this.jPanelParametrosReportesEvaluacionesBonificaciones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesBonificaciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones!=null) {
				this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesBonificaciones!=null) {
				this.jScrollPanelDatosEvaluacionesBonificaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesBonificaciones!=null) {
				this.jPanelPaginacionEvaluacionesBonificaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesBonificaciones!=null) {
				this.jPanelParametrosReportesEvaluacionesBonificaciones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones!=null) {
					this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEvaluacionesBonificaciones!=null) {
				this.jPanelParametrosReportesEvaluacionesBonificaciones.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones!=null) {
				this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEvaluacionesBonificaciones!=null) {
				this.jPanelParametrosReportesEvaluacionesBonificaciones.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoCalificacionEmpleado(Boolean isParaTipoCalificacionEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCalificacionEmpleadoNegation=!isParaTipoCalificacionEmpleado;

			this.isVisibilidadBusquedaEvaluacionesBonificaciones=isParaTipoCalificacionEmpleado;
			if(!this.isVisibilidadBusquedaEvaluacionesBonificaciones) {this.jTabbedPaneBusquedasEvaluacionesBonificaciones.remove(jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadBusquedaEvaluacionesBonificaciones=isParaEstructura;
			if(!this.isVisibilidadBusquedaEvaluacionesBonificaciones) {this.jTabbedPaneBusquedasEvaluacionesBonificaciones.remove(jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaEvaluacionesBonificaciones=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaEvaluacionesBonificaciones) {this.jTabbedPaneBusquedasEvaluacionesBonificaciones.remove(jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaEvaluacionesBonificaciones=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaEvaluacionesBonificaciones) {this.jTabbedPaneBusquedasEvaluacionesBonificaciones.remove(jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);}
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
			
			this.inicializarActualizarBindingTablaEvaluacionesBonificaciones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEvaluacionesBonificaciones() {
		this.updateBorderResaltarBusquedasFormularioEvaluacionesBonificaciones();
		this.updateVisibilidadBusquedasFormularioEvaluacionesBonificaciones();
		this.updateHabilitarBusquedasFormularioEvaluacionesBonificaciones();
	}
	
	public void updateBorderResaltarBusquedasFormularioEvaluacionesBonificaciones() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones.getComponents().length>0) {
	

		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones!=null) {
			index= this.jTabbedPaneBusquedasEvaluacionesBonificaciones.indexOfComponent(this.jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesBonificaciones.getComponent(index);
				jPanel.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEvaluacionesBonificaciones() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEvaluacionesBonificaciones.indexOfComponent(this.jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesBonificaciones.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);
			if(!this.evaluacionesbonificacionesConstantesFunciones.mostrarBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones && index>-1) {
				this.jTabbedPaneBusquedasEvaluacionesBonificaciones.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEvaluacionesBonificaciones() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEvaluacionesBonificaciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEvaluacionesBonificaciones.indexOfComponent(this.jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesBonificaciones.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);
				this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setEnabledAt(index,this.evaluacionesbonificacionesConstantesFunciones.activarBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEvaluacionesBonificaciones(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaEvaluacionesBonificaciones")) {
			index= this.jTabbedPaneBusquedasEvaluacionesBonificaciones.indexOfComponent(this.jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);

			this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesBonificaciones.getComponent(index);

			this.evaluacionesbonificacionesConstantesFunciones.setResaltarBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones(resaltar);

			jPanel.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEvaluacionesBonificaciones.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEvaluacionesBonificaciones() throws Exception {

		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEvaluacionesBonificaciones();
		this.updateVisibilidadResaltarControlesFormularioEvaluacionesBonificaciones();
		this.updateHabilitarResaltarControlesFormularioEvaluacionesBonificaciones();
		
	}
	
	public void updateBorderResaltarControlesFormularioEvaluacionesBonificaciones() throws Exception {
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltaridEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelidEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltaridEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarid_tipo_calificacion_empleadoEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarid_tipo_calificacion_empleadoEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarverificadoEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jCheckBoxverificadoEvaluacionesBonificaciones.setBorderPainted(true);this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jCheckBoxverificadoEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarverificadoEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarid_estructuraEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarid_estructuraEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarcodigoEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigoEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarcodigoEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarid_empresaEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarid_empresaEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarid_sucursalEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarid_sucursalEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarcodigo_datoEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigo_datoEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarcodigo_datoEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarnombre_completoEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextAreanombre_completoEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarnombre_completoEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarsueldoEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldsueldoEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarsueldoEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_conocimientoEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_conocimientoEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_eficienciaEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_eficienciaEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_obtenidoEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_obtenidoEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_pesoEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_pesoEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarvalor_pesoEvaluacionesBonificaciones);}
		if(this.evaluacionesbonificacionesConstantesFunciones.resaltarbonificacionEvaluacionesBonificaciones!=null && this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldbonificacionEvaluacionesBonificaciones.setBorder(this.evaluacionesbonificacionesConstantesFunciones.resaltarbonificacionEvaluacionesBonificaciones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEvaluacionesBonificaciones() throws Exception {		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
	
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelidEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostraridEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelidEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostraridEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarid_tipo_calificacion_empleadoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarid_tipo_calificacion_empleadoEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jCheckBoxverificadoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarverificadoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelverificadoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarverificadoEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarid_estructuraEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelid_estructuraEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarid_estructuraEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarcodigoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelcodigoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarcodigoEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarid_empresaEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelid_empresaEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarid_empresaEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarid_sucursalEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelid_sucursalEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarid_sucursalEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigo_datoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarcodigo_datoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelcodigo_datoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarcodigo_datoEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextAreanombre_completoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarnombre_completoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelnombre_completoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarnombre_completoEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldsueldoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarsueldoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelsueldoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarsueldoEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_conocimientoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelvalor_conocimientoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_conocimientoEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_eficienciaEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelvalor_eficienciaEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_eficienciaEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_obtenidoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelvalor_obtenidoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_obtenidoEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_pesoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_pesoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelvalor_pesoEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarvalor_pesoEvaluacionesBonificaciones);
		//this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldbonificacionEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarbonificacionEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jPanelbonificacionEvaluacionesBonificaciones.setVisible(this.evaluacionesbonificacionesConstantesFunciones.mostrarbonificacionEvaluacionesBonificaciones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEvaluacionesBonificaciones() throws Exception {
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionesBonificaciones!=null) {
	
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jLabelidEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activaridEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_tipo_calificacion_empleadoEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarid_tipo_calificacion_empleadoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jCheckBoxverificadoEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarverificadoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_estructuraEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarid_estructuraEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigoEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarcodigoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_empresaEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarid_empresaEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jComboBoxid_sucursalEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarid_sucursalEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldcodigo_datoEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarcodigo_datoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextAreanombre_completoEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarnombre_completoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldsueldoEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarsueldoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_conocimientoEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarvalor_conocimientoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_eficienciaEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarvalor_eficienciaEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_obtenidoEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarvalor_obtenidoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldvalor_pesoEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarvalor_pesoEvaluacionesBonificaciones);
		this.jInternalFrameDetalleFormEvaluacionesBonificaciones.jTextFieldbonificacionEvaluacionesBonificaciones.setEnabled(this.evaluacionesbonificacionesConstantesFunciones.activarbonificacionEvaluacionesBonificaciones);
		}
	}
	
		
}