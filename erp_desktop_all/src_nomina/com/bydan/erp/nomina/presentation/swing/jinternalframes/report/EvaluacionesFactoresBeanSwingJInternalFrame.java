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

//import com.bydan.erp.nomina.util.EvaluacionesFactoresConstantesFunciones;
import com.bydan.erp.nomina.util.report.EvaluacionesFactoresParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.EvaluacionesFactoresParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.EvaluacionesFactoresBean;
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
public class EvaluacionesFactoresBeanSwingJInternalFrame extends EvaluacionesFactoresJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EvaluacionesFactoresBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EvaluacionesFactores> evaluacionesfactoresValidator = new ClassValidator<EvaluacionesFactores>(EvaluacionesFactores.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EvaluacionesFactores evaluacionesfactores;	
	public EvaluacionesFactores evaluacionesfactoresAux;
	public EvaluacionesFactores evaluacionesfactoresAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EvaluacionesFactores evaluacionesfactoresTotales;
	public Long idEvaluacionesFactoresActual;
	public Long iIdNuevoEvaluacionesFactores=0L;
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

	public String sFinalQueryComboFormatoNomiPreguntaNomi="";

	public List<FormatoNomiPreguntaNomi> formatonomipreguntanomisForeignKey;

	public List<FormatoNomiPreguntaNomi> getformatonomipreguntanomisForeignKey() {
		return formatonomipreguntanomisForeignKey;
	}

	public void setformatonomipreguntanomisForeignKey(List<FormatoNomiPreguntaNomi> formatonomipreguntanomisForeignKey) {
		this.formatonomipreguntanomisForeignKey = formatonomipreguntanomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public FormatoNomiPreguntaNomi formatonomipreguntanomiForeignKey;

	public FormatoNomiPreguntaNomi getformatonomipreguntanomiForeignKey() {
		return formatonomipreguntanomiForeignKey;
	}

	public void setformatonomipreguntanomiForeignKey(FormatoNomiPreguntaNomi formatonomipreguntanomiForeignKey) {
		this.formatonomipreguntanomiForeignKey = formatonomipreguntanomiForeignKey;
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
	
	public Boolean isPermisoTodoEvaluacionesFactores;
	public Boolean isPermisoNuevoEvaluacionesFactores;
	public Boolean isPermisoActualizarEvaluacionesFactores;
	public Boolean isPermisoActualizarOriginalEvaluacionesFactores;
	public Boolean isPermisoEliminarEvaluacionesFactores;
	public Boolean isPermisoGuardarCambiosEvaluacionesFactores;
	public Boolean isPermisoConsultaEvaluacionesFactores;
	public Boolean isPermisoBusquedaEvaluacionesFactores;
	public Boolean isPermisoReporteEvaluacionesFactores;
	public Boolean isPermisoPaginacionMedioEvaluacionesFactores;
	public Boolean isPermisoPaginacionAltoEvaluacionesFactores;
	public Boolean isPermisoPaginacionTodoEvaluacionesFactores;
	public Boolean isPermisoCopiarEvaluacionesFactores;
	public Boolean isPermisoVerFormEvaluacionesFactores;
	public Boolean isPermisoDuplicarEvaluacionesFactores;
	public Boolean isPermisoOrdenEvaluacionesFactores;
	
	
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
	
	public EvaluacionesFactoresParameterReturnGeneral evaluacionesfactoresReturnGeneral;
	public EvaluacionesFactoresParameterReturnGeneral evaluacionesfactoresParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEvaluacionesFactores=false;
	public Boolean esParaAccionDesdeFormularioEvaluacionesFactores=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EvaluacionesFactoresSessionBeanAdditional evaluacionesfactoresSessionBeanAdditional=null;
	
	public EvaluacionesFactoresSessionBeanAdditional getEvaluacionesFactoresSessionBeanAdditional() {
		return this.evaluacionesfactoresSessionBeanAdditional;
	}
	
	public void setEvaluacionesFactoresSessionBeanAdditional(EvaluacionesFactoresSessionBeanAdditional evaluacionesfactoresSessionBeanAdditional) {
		try {
			this.evaluacionesfactoresSessionBeanAdditional=evaluacionesfactoresSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EvaluacionesFactoresBeanSwingJInternalFrameAdditional evaluacionesfactoresBeanSwingJInternalFrameAdditional=null;
	//public class EvaluacionesFactoresBeanSwingJInternalFrame
	
	public EvaluacionesFactoresBeanSwingJInternalFrameAdditional getEvaluacionesFactoresBeanSwingJInternalFrameAdditional() {
		return this.evaluacionesfactoresBeanSwingJInternalFrameAdditional;
	}
	
	public void setEvaluacionesFactoresBeanSwingJInternalFrameAdditional(EvaluacionesFactoresBeanSwingJInternalFrameAdditional evaluacionesfactoresBeanSwingJInternalFrameAdditional) {
		try {
			this.evaluacionesfactoresBeanSwingJInternalFrameAdditional=evaluacionesfactoresBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EvaluacionesFactoresLogic evaluacionesfactoresLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EvaluacionesFactores evaluacionesfactoresBean;
	public EvaluacionesFactoresConstantesFunciones evaluacionesfactoresConstantesFunciones;
	//public EvaluacionesFactoresParameterReturnGeneral evaluacionesfactoresReturnGeneral;
	
	//FK
	
	public TipoCalificacionEmpleadoLogic tipocalificacionempleadoLogic;
	public EstructuraLogic estructuraLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic;
	
	//PARAMETROS
	
	
	//public List<EvaluacionesFactores> evaluacionesfactoress;	
	//public List<EvaluacionesFactores> evaluacionesfactoressEliminados;
	//public List<EvaluacionesFactores> evaluacionesfactoressAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEvaluacionesFactores=false;
	public Boolean isVisibilidadCeldaDuplicarEvaluacionesFactores=true;
	public Boolean isVisibilidadCeldaCopiarEvaluacionesFactores=true;
	public Boolean isVisibilidadCeldaVerFormEvaluacionesFactores=true;
	public Boolean isVisibilidadCeldaOrdenEvaluacionesFactores=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=false;
	public Boolean isVisibilidadCeldaModificarEvaluacionesFactores=false;
	public Boolean isVisibilidadCeldaActualizarEvaluacionesFactores=false;
	public Boolean isVisibilidadCeldaEliminarEvaluacionesFactores=false;
	public Boolean isVisibilidadCeldaCancelarEvaluacionesFactores=false;
	public Boolean isVisibilidadCeldaGuardarEvaluacionesFactores=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=false;	
	
	
	public Boolean isVisibilidadBusquedaEvaluacionesFactores=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdFormatoNomiPreguntaNomi=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoCalificacionEmpleado=false;
	
	public Long getiIdNuevoEvaluacionesFactores() {
		return this.iIdNuevoEvaluacionesFactores;
	}

	public void setiIdNuevoEvaluacionesFactores(Long iIdNuevoEvaluacionesFactores) {
		this.iIdNuevoEvaluacionesFactores = iIdNuevoEvaluacionesFactores;
	}
	
	public Long getidEvaluacionesFactoresActual() {
		return this.idEvaluacionesFactoresActual;
	}

	public void setidEvaluacionesFactoresActual(Long idEvaluacionesFactoresActual) {
		this.idEvaluacionesFactoresActual = idEvaluacionesFactoresActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EvaluacionesFactores getevaluacionesfactores() {
		return this.evaluacionesfactores;
	}

	public void setevaluacionesfactores(EvaluacionesFactores evaluacionesfactores) {
		this.evaluacionesfactores = evaluacionesfactores;
	}
	
	public EvaluacionesFactores getevaluacionesfactoresAux() {
		return this.evaluacionesfactoresAux;
	}

	public void setevaluacionesfactoresAux(EvaluacionesFactores evaluacionesfactoresAux) {
		this.evaluacionesfactoresAux = evaluacionesfactoresAux;
	}				
	
	public EvaluacionesFactores getevaluacionesfactoresAnterior() {
		return this.evaluacionesfactoresAnterior;
	}

	public void setevaluacionesfactoresAnterior(EvaluacionesFactores evaluacionesfactoresAnterior) {
		this.evaluacionesfactoresAnterior = evaluacionesfactoresAnterior;
	}	
	
	public EvaluacionesFactores getevaluacionesfactoresTotales() {
		return this.evaluacionesfactoresTotales;
	}

	public void setevaluacionesfactoresTotales(EvaluacionesFactores evaluacionesfactoresTotales) {
		this.evaluacionesfactoresTotales = evaluacionesfactoresTotales;
	}	
	
	public EvaluacionesFactores getevaluacionesfactoresBean() {
		return this.evaluacionesfactoresBean;
	}

	public void setevaluacionesfactoresBean(EvaluacionesFactores evaluacionesfactoresBean) {
		this.evaluacionesfactoresBean = evaluacionesfactoresBean;
	}	
	
	public EvaluacionesFactoresParameterReturnGeneral getevaluacionesfactoresReturnGeneral() {
		return this.evaluacionesfactoresReturnGeneral;
	}

	public void setevaluacionesfactoresReturnGeneral(EvaluacionesFactoresParameterReturnGeneral evaluacionesfactoresReturnGeneral) {
		this.evaluacionesfactoresReturnGeneral = evaluacionesfactoresReturnGeneral;
	}	
	
	
	public Long id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores=-1L;

	public Long getid_tipo_calificacion_empleadoBusquedaEvaluacionesFactores() {
		return this.id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores;
	}

	public void setid_tipo_calificacion_empleadoBusquedaEvaluacionesFactores(Long id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores) {
		this.id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores = id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores;
	}

;
	public Boolean verificadoBusquedaEvaluacionesFactores=false;

	public Boolean getverificadoBusquedaEvaluacionesFactores() {
		return this.verificadoBusquedaEvaluacionesFactores;
	}

	public void setverificadoBusquedaEvaluacionesFactores(Boolean verificadoBusquedaEvaluacionesFactores) {
		this.verificadoBusquedaEvaluacionesFactores = verificadoBusquedaEvaluacionesFactores;
	}

;
	public Long id_estructuraBusquedaEvaluacionesFactores=-1L;

	public Long getid_estructuraBusquedaEvaluacionesFactores() {
		return this.id_estructuraBusquedaEvaluacionesFactores;
	}

	public void setid_estructuraBusquedaEvaluacionesFactores(Long id_estructuraBusquedaEvaluacionesFactores) {
		this.id_estructuraBusquedaEvaluacionesFactores = id_estructuraBusquedaEvaluacionesFactores;
	}

;
	public String codigoBusquedaEvaluacionesFactores="";

	public String getcodigoBusquedaEvaluacionesFactores() {
		return this.codigoBusquedaEvaluacionesFactores;
	}

	public void setcodigoBusquedaEvaluacionesFactores(String codigoBusquedaEvaluacionesFactores) {
		this.codigoBusquedaEvaluacionesFactores = codigoBusquedaEvaluacionesFactores;
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

	public Long id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi=-1L;

	public Long getid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi() {
		return this.id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi;
	}

	public void setid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi(Long id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi) {
		this.id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi = id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi;
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
	
	
	public EvaluacionesFactoresLogic getEvaluacionesFactoresLogic()	{		
		return evaluacionesfactoresLogic;
	}

	public void setEvaluacionesFactoresLogic(EvaluacionesFactoresLogic evaluacionesfactoresLogic) {
		this.evaluacionesfactoresLogic = evaluacionesfactoresLogic;
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
	
	public Boolean getIsEsNuevoEvaluacionesFactores() {
		return isEsNuevoEvaluacionesFactores;
	}

	public void setIsEsNuevoEvaluacionesFactores(Boolean isEsNuevoEvaluacionesFactores) {
		this.isEsNuevoEvaluacionesFactores = isEsNuevoEvaluacionesFactores;
	}

	public Boolean getEsParaAccionDesdeFormularioEvaluacionesFactores() {
		return esParaAccionDesdeFormularioEvaluacionesFactores;
	}
	
	public void setEsParaAccionDesdeFormularioEvaluacionesFactores(Boolean esParaAccionDesdeFormularioEvaluacionesFactores) {
		this.esParaAccionDesdeFormularioEvaluacionesFactores = esParaAccionDesdeFormularioEvaluacionesFactores;
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

			if(this.evaluacionesfactoresSessionBean==null) {
				this.evaluacionesfactoresSessionBean=new EvaluacionesFactoresSessionBean();
			}

			if(!this.evaluacionesfactoresSessionBean.getisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado()) {
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
					tipocalificacionempleadoLogic.getEntityWithConnection(evaluacionesfactoresSessionBean.getlidTipoCalificacionEmpleadoActual());
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

			if(this.evaluacionesfactoresSessionBean==null) {
				this.evaluacionesfactoresSessionBean=new EvaluacionesFactoresSessionBean();
			}

			if(!this.evaluacionesfactoresSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(evaluacionesfactoresSessionBean.getlidEstructuraActual());
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

			if(this.evaluacionesfactoresSessionBean==null) {
				this.evaluacionesfactoresSessionBean=new EvaluacionesFactoresSessionBean();
			}

			if(!this.evaluacionesfactoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(evaluacionesfactoresSessionBean.getlidEmpresaActual());
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

			if(this.evaluacionesfactoresSessionBean==null) {
				this.evaluacionesfactoresSessionBean=new EvaluacionesFactoresSessionBean();
			}

			if(!this.evaluacionesfactoresSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(evaluacionesfactoresSessionBean.getlidSucursalActual());
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

	public void cargarCombosFormatoNomiPreguntaNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatonomipreguntanomisForeignKey=new ArrayList<FormatoNomiPreguntaNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic=new FormatoNomiPreguntaNomiLogic();

			//formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomiDataAccess().setIsForForeingKeyData(true);

			if(this.evaluacionesfactoresSessionBean==null) {
				this.evaluacionesfactoresSessionBean=new EvaluacionesFactoresSessionBean();
			}

			if(!this.evaluacionesfactoresSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomiDataAccess().setIsForForeingKeyData(true);

					formatonomipreguntanomiLogic.getTodosFormatoNomiPreguntaNomisWithConnection(sFinalQuery,new Pagination());

					this.formatonomipreguntanomisForeignKey=formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormatoNomiPreguntaNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomipreguntanomiLogic.getEntityWithConnection(evaluacionesfactoresSessionBean.getlidFormatoNomiPreguntaNomiActual());
					this.formatonomipreguntanomisForeignKey.add(formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomi());
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

					if(this.evaluacionesfactores!=null) {
						this.evaluacionesfactores.setTipoCalificacionEmpleado(tipocalificacionempleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
						this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setSelectedItem(tipocalificacionempleadoTemp);
					}
				} else {
					//jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setSelectedItem(tipocalificacionempleadoTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesFactores") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocalificacionempleadoTemp!=null && jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores!=null) {
						jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setSelectedItem(tipocalificacionempleadoTemp);
					} else {
						if(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores!=null) {
							//jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setSelectedItem(tipocalificacionempleadoTemp);
							if(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.getItemCount()>0) {
								jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setSelectedIndex(0);
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
	public void setActualTipoCalificacionEmpleadoForeignKeyGenerico(Long idTipoCalificacionEmpleadoSeleccionado,JComboBox jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactoresGenerico)throws Exception
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
				jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactoresGenerico.setSelectedItem(tipocalificacionempleadoTemp);
			} else {
				if(jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactoresGenerico!=null && jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactoresGenerico.getItemCount()>0) {
					jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactoresGenerico.setSelectedIndex(0);
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

					if(this.evaluacionesfactores!=null) {
						this.evaluacionesfactores.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
						this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraEvaluacionesFactores.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesFactores") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores!=null) {
						jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores!=null) {
							//jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.getItemCount()>0) {
								jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraEvaluacionesFactoresGenerico)throws Exception
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
				jComboBoxid_estructuraEvaluacionesFactoresGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraEvaluacionesFactoresGenerico!=null && jComboBoxid_estructuraEvaluacionesFactoresGenerico.getItemCount()>0) {
					jComboBoxid_estructuraEvaluacionesFactoresGenerico.setSelectedIndex(0);
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

					if(this.evaluacionesfactores!=null) {
						this.evaluacionesfactores.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
						this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEvaluacionesFactores.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEvaluacionesFactoresGenerico)throws Exception
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
				jComboBoxid_empresaEvaluacionesFactoresGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEvaluacionesFactoresGenerico!=null && jComboBoxid_empresaEvaluacionesFactoresGenerico.getItemCount()>0) {
					jComboBoxid_empresaEvaluacionesFactoresGenerico.setSelectedIndex(0);
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

					if(this.evaluacionesfactores!=null) {
						this.evaluacionesfactores.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
						this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalEvaluacionesFactores.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalEvaluacionesFactoresGenerico)throws Exception
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
				jComboBoxid_sucursalEvaluacionesFactoresGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalEvaluacionesFactoresGenerico!=null && jComboBoxid_sucursalEvaluacionesFactoresGenerico.getItemCount()>0) {
					jComboBoxid_sucursalEvaluacionesFactoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoNomiPreguntaNomiForeignKey(Long idFormatoNomiPreguntaNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			FormatoNomiPreguntaNomi  formatonomipreguntanomiTemp=null;

			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomisForeignKey) {
				if(formatonomipreguntanomiAux.getId()!=null && formatonomipreguntanomiAux.getId().equals(idFormatoNomiPreguntaNomiSeleccionado)) {
					formatonomipreguntanomiTemp=formatonomipreguntanomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatonomipreguntanomiTemp!=null) {

					if(this.evaluacionesfactores!=null) {
						this.evaluacionesfactores.setFormatoNomiPreguntaNomi(formatonomipreguntanomiTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
						this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setSelectedItem(formatonomipreguntanomiTemp);
					}
				} else {
					//jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setSelectedItem(formatonomipreguntanomiTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setSelectedIndex(0);
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

	public String getActualFormatoNomiPreguntaNomiForeignKeyDescripcion(Long idFormatoNomiPreguntaNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			FormatoNomiPreguntaNomi  formatonomipreguntanomiTemp=null;

			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomisForeignKey) {
				if(formatonomipreguntanomiAux.getId()!=null && formatonomipreguntanomiAux.getId().equals(idFormatoNomiPreguntaNomiSeleccionado)) {
					formatonomipreguntanomiTemp=formatonomipreguntanomiAux;
					break;
				}
			}


			sDescripcion=FormatoNomiPreguntaNomiConstantesFunciones.getFormatoNomiPreguntaNomiDescripcion(formatonomipreguntanomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoNomiPreguntaNomiForeignKeyGenerico(Long idFormatoNomiPreguntaNomiSeleccionado,JComboBox jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactoresGenerico)throws Exception
	{
		try
		{
			FormatoNomiPreguntaNomi  formatonomipreguntanomiTemp=null;

			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomisForeignKey) {
				if(formatonomipreguntanomiAux.getId()!=null && formatonomipreguntanomiAux.getId().equals(idFormatoNomiPreguntaNomiSeleccionado)) {
					formatonomipreguntanomiTemp=formatonomipreguntanomiAux;
					break;
				}
			}

			if(formatonomipreguntanomiTemp!=null) {
				jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactoresGenerico.setSelectedItem(formatonomipreguntanomiTemp);
			} else {
				if(jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactoresGenerico!=null && jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactoresGenerico.getItemCount()>0) {
					jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCalificacionEmpleadoForeignKey(EvaluacionesFactores evaluacionesfactores,JComboBox jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactoresGenerico)throws Exception
	{
		try
		{
			TipoCalificacionEmpleado  tipocalificacionempleadoAux=new TipoCalificacionEmpleado();

			if(jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactoresGenerico==null) {
				tipocalificacionempleadoAux=(TipoCalificacionEmpleado)this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.getSelectedItem();
			} else {
				tipocalificacionempleadoAux=(TipoCalificacionEmpleado)jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactoresGenerico.getSelectedItem();
			}

			if(tipocalificacionempleadoAux!=null && tipocalificacionempleadoAux.getId()!=null) {
				evaluacionesfactores.setid_tipo_calificacion_empleado(tipocalificacionempleadoAux.getId());
				evaluacionesfactores.settipocalificacionempleado_descripcion(EvaluacionesFactoresConstantesFunciones.getTipoCalificacionEmpleadoDescripcion(tipocalificacionempleadoAux));
				evaluacionesfactores.setTipoCalificacionEmpleado(tipocalificacionempleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(EvaluacionesFactores evaluacionesfactores,JComboBox jComboBoxid_estructuraEvaluacionesFactoresGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraEvaluacionesFactoresGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraEvaluacionesFactoresGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				evaluacionesfactores.setid_estructura(estructuraAux.getId());
				evaluacionesfactores.setestructura_descripcion(EvaluacionesFactoresConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				evaluacionesfactores.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EvaluacionesFactores evaluacionesfactores,JComboBox jComboBoxid_empresaEvaluacionesFactoresGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEvaluacionesFactoresGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEvaluacionesFactoresGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				evaluacionesfactores.setid_empresa(empresaAux.getId());
				evaluacionesfactores.setempresa_descripcion(EvaluacionesFactoresConstantesFunciones.getEmpresaDescripcion(empresaAux));
				evaluacionesfactores.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(EvaluacionesFactores evaluacionesfactores,JComboBox jComboBoxid_sucursalEvaluacionesFactoresGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalEvaluacionesFactoresGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalEvaluacionesFactoresGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				evaluacionesfactores.setid_sucursal(sucursalAux.getId());
				evaluacionesfactores.setsucursal_descripcion(EvaluacionesFactoresConstantesFunciones.getSucursalDescripcion(sucursalAux));
				evaluacionesfactores.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoNomiPreguntaNomiForeignKey(EvaluacionesFactores evaluacionesfactores,JComboBox jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactoresGenerico)throws Exception
	{
		try
		{
			FormatoNomiPreguntaNomi  formatonomipreguntanomiAux=new FormatoNomiPreguntaNomi();

			if(jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactoresGenerico==null) {
				formatonomipreguntanomiAux=(FormatoNomiPreguntaNomi)this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.getSelectedItem();
			} else {
				formatonomipreguntanomiAux=(FormatoNomiPreguntaNomi)jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactoresGenerico.getSelectedItem();
			}

			if(formatonomipreguntanomiAux!=null && formatonomipreguntanomiAux.getId()!=null) {
				evaluacionesfactores.setid_formato_nomi_pregunta_nomi(formatonomipreguntanomiAux.getId());
				evaluacionesfactores.setformatonomipreguntanomi_descripcion(EvaluacionesFactoresConstantesFunciones.getFormatoNomiPreguntaNomiDescripcion(formatonomipreguntanomiAux));
				evaluacionesfactores.setFormatoNomiPreguntaNomi(formatonomipreguntanomiAux);			}
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

					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.removeAllItems();

							for(TipoCalificacionEmpleado tipocalificacionempleado:this.tipocalificacionempleadosForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.addItem(tipocalificacionempleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { 
					}

					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesFactores") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.removeAllItems();

							for(TipoCalificacionEmpleado tipocalificacionempleado:this.tipocalificacionempleadosForeignKey) {
								this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.addItem(tipocalificacionempleado);
							}
						}

						if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { 
					}

					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesFactores") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.addItem(estructura);
							}
						}

						if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { 
					}

					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { 
					}

					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatoNomiPreguntaNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormatoNomiPreguntaNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.removeAllItems();

							for(FormatoNomiPreguntaNomi formatonomipreguntanomi:this.formatonomipreguntanomisForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.addItem(formatonomipreguntanomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { 
					}

					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setSelectedItem(tipocalificacionempleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setSelectedItem(tipocalificacionempleado);
						} else {
							this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFormatoNomiPreguntaNomiForeignKey(FormatoNomiPreguntaNomi formatonomipreguntanomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setSelectedItem(formatonomipreguntanomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesEvaluacionesFactores() throws Exception {
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
		
	public EvaluacionesFactoresParameterReturnGeneral getEvaluacionesFactoresParameterGeneral() {
		return this.evaluacionesfactoresParameterGeneral;
	}
	
	public void setEvaluacionesFactoresParameterGeneral(EvaluacionesFactoresParameterReturnGeneral evaluacionesfactoresParameterGeneral) {
		this.evaluacionesfactoresParameterGeneral = evaluacionesfactoresParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEvaluacionesFactores() {
		return isPermisoTodoEvaluacionesFactores;
	}

	public void setIsPermisoTodoEvaluacionesFactores(Boolean isPermisoTodoEvaluacionesFactores) {
		this.isPermisoTodoEvaluacionesFactores = isPermisoTodoEvaluacionesFactores;
	}

	public Boolean getIsPermisoNuevoEvaluacionesFactores() {
		return isPermisoNuevoEvaluacionesFactores;
	}

	public void setIsPermisoNuevoEvaluacionesFactores(Boolean isPermisoNuevoEvaluacionesFactores) {
		this.isPermisoNuevoEvaluacionesFactores = isPermisoNuevoEvaluacionesFactores;
	}

	public Boolean getIsPermisoActualizarEvaluacionesFactores() {
		return isPermisoActualizarEvaluacionesFactores;
	}

	public void setIsPermisoActualizarEvaluacionesFactores(Boolean isPermisoActualizarEvaluacionesFactores) {
		this.isPermisoActualizarEvaluacionesFactores = isPermisoActualizarEvaluacionesFactores;
	}

	public Boolean getIsPermisoEliminarEvaluacionesFactores() {
		return isPermisoEliminarEvaluacionesFactores;
	}

	public void setIsPermisoEliminarEvaluacionesFactores(Boolean isPermisoEliminarEvaluacionesFactores) {
		this.isPermisoEliminarEvaluacionesFactores = isPermisoEliminarEvaluacionesFactores;
	}

	public Boolean getIsPermisoGuardarCambiosEvaluacionesFactores() {
		return isPermisoGuardarCambiosEvaluacionesFactores;
	}

	public void setIsPermisoGuardarCambiosEvaluacionesFactores(Boolean isPermisoGuardarCambiosEvaluacionesFactores) {
		this.isPermisoGuardarCambiosEvaluacionesFactores = isPermisoGuardarCambiosEvaluacionesFactores;
	}
	
	public Boolean getIsPermisoConsultaEvaluacionesFactores() {
		return isPermisoConsultaEvaluacionesFactores;
	}

	public void setIsPermisoConsultaEvaluacionesFactores(Boolean isPermisoConsultaEvaluacionesFactores) {
		this.isPermisoConsultaEvaluacionesFactores = isPermisoConsultaEvaluacionesFactores;
	}

	public Boolean getIsPermisoBusquedaEvaluacionesFactores() {
		return isPermisoBusquedaEvaluacionesFactores;
	}

	public void setIsPermisoBusquedaEvaluacionesFactores(Boolean isPermisoBusquedaEvaluacionesFactores) {
		this.isPermisoBusquedaEvaluacionesFactores = isPermisoBusquedaEvaluacionesFactores;
	}

	public Boolean getIsPermisoReporteEvaluacionesFactores() {
		return isPermisoReporteEvaluacionesFactores;
	}

	public void setIsPermisoReporteEvaluacionesFactores(Boolean isPermisoReporteEvaluacionesFactores) {
		this.isPermisoReporteEvaluacionesFactores = isPermisoReporteEvaluacionesFactores;
	}
	
	public Boolean getIsPermisoPaginacionMedioEvaluacionesFactores() {
		return isPermisoPaginacionMedioEvaluacionesFactores;
	}

	public void setIsPermisoPaginacionMedioEvaluacionesFactores(Boolean isPermisoPaginacionMedioEvaluacionesFactores) {
		this.isPermisoPaginacionMedioEvaluacionesFactores = isPermisoPaginacionMedioEvaluacionesFactores;
	}
	
	public Boolean getIsPermisoPaginacionTodoEvaluacionesFactores() {
		return isPermisoPaginacionTodoEvaluacionesFactores;
	}

	public void setIsPermisoPaginacionTodoEvaluacionesFactores(Boolean isPermisoPaginacionTodoEvaluacionesFactores) {
		this.isPermisoPaginacionTodoEvaluacionesFactores = isPermisoPaginacionTodoEvaluacionesFactores;
	}
	
	public Boolean getIsPermisoPaginacionAltoEvaluacionesFactores() {
		return isPermisoPaginacionAltoEvaluacionesFactores;
	}

	public void setIsPermisoPaginacionAltoEvaluacionesFactores(Boolean isPermisoPaginacionAltoEvaluacionesFactores) {
		this.isPermisoPaginacionAltoEvaluacionesFactores = isPermisoPaginacionAltoEvaluacionesFactores;
	}
	
	public Boolean getIsPermisoCopiarEvaluacionesFactores() {
		return isPermisoCopiarEvaluacionesFactores;
	}

	public void setIsPermisoCopiarEvaluacionesFactores(Boolean isPermisoCopiarEvaluacionesFactores) {
		this.isPermisoCopiarEvaluacionesFactores = isPermisoCopiarEvaluacionesFactores;
	}
	
	public Boolean getIsPermisoVerFormEvaluacionesFactores() {
		return isPermisoVerFormEvaluacionesFactores;
	}

	public void setIsPermisoVerFormEvaluacionesFactores(Boolean isPermisoVerFormEvaluacionesFactores) {
		this.isPermisoVerFormEvaluacionesFactores = isPermisoVerFormEvaluacionesFactores;
	}
	
	public Boolean getIsPermisoDuplicarEvaluacionesFactores() {
		return isPermisoDuplicarEvaluacionesFactores;
	}

	public void setIsPermisoDuplicarEvaluacionesFactores(Boolean isPermisoDuplicarEvaluacionesFactores) {
		this.isPermisoDuplicarEvaluacionesFactores = isPermisoDuplicarEvaluacionesFactores;
	}
	
	public Boolean getIsPermisoOrdenEvaluacionesFactores() {
		return isPermisoOrdenEvaluacionesFactores;
	}

	public void setIsPermisoOrdenEvaluacionesFactores(Boolean isPermisoOrdenEvaluacionesFactores) {
		this.isPermisoOrdenEvaluacionesFactores = isPermisoOrdenEvaluacionesFactores;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEvaluacionesFactores() {
		return isVisibilidadCeldaNuevoEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaNuevoEvaluacionesFactores(Boolean isVisibilidadCeldaNuevoEvaluacionesFactores) {
		this.isVisibilidadCeldaNuevoEvaluacionesFactores = isVisibilidadCeldaNuevoEvaluacionesFactores;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEvaluacionesFactores() {
		return isVisibilidadCeldaDuplicarEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaDuplicarEvaluacionesFactores(Boolean isVisibilidadCeldaDuplicarEvaluacionesFactores) {
		this.isVisibilidadCeldaDuplicarEvaluacionesFactores = isVisibilidadCeldaDuplicarEvaluacionesFactores;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEvaluacionesFactores() {
		return isVisibilidadCeldaCopiarEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaCopiarEvaluacionesFactores(Boolean isVisibilidadCeldaCopiarEvaluacionesFactores) {
		this.isVisibilidadCeldaCopiarEvaluacionesFactores = isVisibilidadCeldaCopiarEvaluacionesFactores;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEvaluacionesFactores() {
		return isVisibilidadCeldaVerFormEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaVerFormEvaluacionesFactores(Boolean isVisibilidadCeldaVerFormEvaluacionesFactores) {
		this.isVisibilidadCeldaVerFormEvaluacionesFactores = isVisibilidadCeldaVerFormEvaluacionesFactores;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEvaluacionesFactores() {
		return isVisibilidadCeldaOrdenEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaOrdenEvaluacionesFactores(Boolean isVisibilidadCeldaOrdenEvaluacionesFactores) {
		this.isVisibilidadCeldaOrdenEvaluacionesFactores = isVisibilidadCeldaOrdenEvaluacionesFactores;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEvaluacionesFactores() {
		return isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEvaluacionesFactores(Boolean isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores) {
		this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores = isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEvaluacionesFactores() {
		return isVisibilidadCeldaModificarEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaModificarEvaluacionesFactores(Boolean isVisibilidadCeldaModificarEvaluacionesFactores) {
		this.isVisibilidadCeldaModificarEvaluacionesFactores = isVisibilidadCeldaModificarEvaluacionesFactores;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEvaluacionesFactores() {
		return isVisibilidadCeldaActualizarEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaActualizarEvaluacionesFactores(Boolean isVisibilidadCeldaActualizarEvaluacionesFactores) {
		this.isVisibilidadCeldaActualizarEvaluacionesFactores = isVisibilidadCeldaActualizarEvaluacionesFactores;
	}

	public Boolean getIsVisibilidadCeldaEliminarEvaluacionesFactores() {
		return isVisibilidadCeldaEliminarEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaEliminarEvaluacionesFactores(Boolean isVisibilidadCeldaEliminarEvaluacionesFactores) {
		this.isVisibilidadCeldaEliminarEvaluacionesFactores = isVisibilidadCeldaEliminarEvaluacionesFactores;
	}

	public Boolean getIsVisibilidadCeldaCancelarEvaluacionesFactores() {
		return isVisibilidadCeldaCancelarEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaCancelarEvaluacionesFactores(Boolean isVisibilidadCeldaCancelarEvaluacionesFactores) {
		this.isVisibilidadCeldaCancelarEvaluacionesFactores = isVisibilidadCeldaCancelarEvaluacionesFactores;
	}

	public Boolean getIsVisibilidadCeldaGuardarEvaluacionesFactores() {
		return isVisibilidadCeldaGuardarEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaGuardarEvaluacionesFactores(Boolean isVisibilidadCeldaGuardarEvaluacionesFactores) {
		this.isVisibilidadCeldaGuardarEvaluacionesFactores = isVisibilidadCeldaGuardarEvaluacionesFactores;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEvaluacionesFactores() {
		return isVisibilidadCeldaGuardarCambiosEvaluacionesFactores;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEvaluacionesFactores(Boolean isVisibilidadCeldaGuardarCambiosEvaluacionesFactores) {
		this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores = isVisibilidadCeldaGuardarCambiosEvaluacionesFactores;
	}
		
	public EvaluacionesFactoresSessionBean getevaluacionesfactoresSessionBean() {
		return this.evaluacionesfactoresSessionBean;
	}
	
	public void setevaluacionesfactoresSessionBean(EvaluacionesFactoresSessionBean evaluacionesfactoresSessionBean) {
		this.evaluacionesfactoresSessionBean=evaluacionesfactoresSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaEvaluacionesFactores() {
		return this.isVisibilidadBusquedaEvaluacionesFactores;
	}

	public void setisVisibilidadBusquedaEvaluacionesFactores(Boolean isVisibilidadBusquedaEvaluacionesFactores) {
		this.isVisibilidadBusquedaEvaluacionesFactores=isVisibilidadBusquedaEvaluacionesFactores;
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

	public Boolean getisVisibilidadFK_IdFormatoNomiPreguntaNomi() {
		return this.isVisibilidadFK_IdFormatoNomiPreguntaNomi;
	}

	public void setisVisibilidadFK_IdFormatoNomiPreguntaNomi(Boolean isVisibilidadFK_IdFormatoNomiPreguntaNomi) {
		this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=isVisibilidadFK_IdFormatoNomiPreguntaNomi;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores)throws Exception {
		try {
			
				this.setActualParaGuardarTipoCalificacionEmpleadoForeignKey(evaluacionesfactores,null);
				this.setActualParaGuardarEstructuraForeignKey(evaluacionesfactores,null);
				this.setActualParaGuardarEmpresaForeignKey(evaluacionesfactores,null);
				this.setActualParaGuardarSucursalForeignKey(evaluacionesfactores,null);
				this.setActualParaGuardarFormatoNomiPreguntaNomiForeignKey(evaluacionesfactores,null);
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
	
	public void bugActualizarReferenciaActual(EvaluacionesFactores evaluacionesfactores,EvaluacionesFactores evaluacionesfactoresAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEvaluacionesFactores(evaluacionesfactores);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		evaluacionesfactoresAux.setId(evaluacionesfactores.getId());
		evaluacionesfactoresAux.setVersionRow(evaluacionesfactores.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(EvaluacionesFactores evaluacionesfactoresLocal) throws Exception {
		
		if(this.evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EvaluacionesFactores evaluacionesfactoresLocal) throws Exception {	
		if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoCalificacionEmpleadoDetalleFormJInternalFrame.class)) {
				TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrameLocal=(TipoCalificacionEmpleadoBeanSwingJInternalFrame) ((TipoCalificacionEmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocalificacionempleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCalificacionEmpleado(tipocalificacionempleadoBeanSwingJInternalFrameLocal.gettipocalificacionempleado(),true);
				tipocalificacionempleadoBeanSwingJInternalFrameLocal.actualizarLista(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado,this.tipocalificacionempleadosForeignKey);

				tipocalificacionempleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado);

				evaluacionesfactoresLocal.setTipoCalificacionEmpleado(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado);

				this.addItemDefectoCombosForeignKeyTipoCalificacionEmpleado();
				this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey("Formulario");
				this.setActualTipoCalificacionEmpleadoForeignKey(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				evaluacionesfactoresLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				evaluacionesfactoresLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				evaluacionesfactoresLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoNomiPreguntaNomiDetalleFormJInternalFrame.class)) {
				FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrameLocal=(FormatoNomiPreguntaNomiBeanSwingJInternalFrame) ((FormatoNomiPreguntaNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatonomipreguntanomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormatoNomiPreguntaNomi(formatonomipreguntanomiBeanSwingJInternalFrameLocal.getformatonomipreguntanomi(),true);
				formatonomipreguntanomiBeanSwingJInternalFrameLocal.actualizarLista(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi,this.formatonomipreguntanomisForeignKey);

				formatonomipreguntanomiBeanSwingJInternalFrameLocal.actualizarRelaciones(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi);

				evaluacionesfactoresLocal.setFormatoNomiPreguntaNomi(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi);

				this.addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi();
				this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey("Formulario");
				this.setActualFormatoNomiPreguntaNomiForeignKey(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEvaluacionesFactoresActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = evaluacionesfactoresValidator.getInvalidValues(this.evaluacionesfactores);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EvaluacionesFactores evaluacionesfactores,List<EvaluacionesFactores> evaluacionesfactoress) throws Exception {
	}		
	
	public void actualizarSelectedLista(EvaluacionesFactores evaluacionesfactores,List<EvaluacionesFactores> evaluacionesfactoress) throws Exception {
		try	{			
			EvaluacionesFactoresConstantesFunciones.actualizarSelectedLista(evaluacionesfactores,evaluacionesfactoress);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EvaluacionesFactores> evaluacionesfactoressLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				evaluacionesfactoressLocal=this.evaluacionesfactoresLogic.getEvaluacionesFactoress();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				evaluacionesfactoressLocal=this.evaluacionesfactoress;
			}
			//ARCHITECTURE
		
			for(EvaluacionesFactores evaluacionesfactoresLocal:evaluacionesfactoressLocal) {
				if(this.permiteMantenimiento(evaluacionesfactoresLocal) && evaluacionesfactoresLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EvaluacionesFactoresConstantesFunciones.getEvaluacionesFactoresLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EvaluacionesFactoresConstantesFunciones.CODIGODATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelcodigo_datoEvaluacionesFactores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesFactoresConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelnombre_completoEvaluacionesFactores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesFactoresConstantesFunciones.IDFORMATONOMIPREGUNTANOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelid_formato_nomi_pregunta_nomiEvaluacionesFactores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesFactoresConstantesFunciones.VALORCONOCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelvalor_conocimientoEvaluacionesFactores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesFactoresConstantesFunciones.VALOREFICIENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelvalor_eficienciaEvaluacionesFactores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesFactoresConstantesFunciones.VALOROBTENIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelvalor_obtenidoEvaluacionesFactores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesFactoresConstantesFunciones.PROMEDIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelpromedioEvaluacionesFactores,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelcodigo_datoEvaluacionesFactores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelnombre_completoEvaluacionesFactores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelid_formato_nomi_pregunta_nomiEvaluacionesFactores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelvalor_conocimientoEvaluacionesFactores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelvalor_eficienciaEvaluacionesFactores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelvalor_obtenidoEvaluacionesFactores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelpromedioEvaluacionesFactores,"");
		
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
		this.iIdNuevoEvaluacionesFactores--;	
		
		
		this.evaluacionesfactoresAux=new EvaluacionesFactores();
		
		this.evaluacionesfactoresAux.setId(this.iIdNuevoEvaluacionesFactores);
		this.evaluacionesfactoresAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.evaluacionesfactoresLogic.getEvaluacionesFactoress().add(this.evaluacionesfactoresAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.evaluacionesfactoress.add(this.evaluacionesfactoresAux);
		}
		//ARCHITECTURE
		
		this.evaluacionesfactores=this.evaluacionesfactoresAux;
		
		if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEvaluacionesFactores(this.evaluacionesfactores);
			this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesFactores(this.evaluacionesfactores);
		}
				
		//this.setDefaultControlesEvaluacionesFactores();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEvaluacionesFactores();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEvaluacionesFactores();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionesFactores();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEvaluacionesFactores(this.evaluacionesfactoresBean,this.evaluacionesfactores,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEvaluacionesFactores(this.evaluacionesfactoresReturnGeneral,this.evaluacionesfactoresBean,false);
		
		if(this.evaluacionesfactoresReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesFactores(this.evaluacionesfactoresReturnGeneral.getEvaluacionesFactores());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEvaluacionesFactores(this.evaluacionesfactoresReturnGeneral.getEvaluacionesFactores());
		}
		
		if(this.evaluacionesfactoresReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEvaluacionesFactores(this.evaluacionesfactoresReturnGeneral.getEvaluacionesFactores(),classes);//this.evaluacionesfactoresBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEvaluacionesFactores();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEvaluacionesFactores();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.RecargarFormEvaluacionesFactores(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEvaluacionesFactores(false);
						
			if(evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionesFactores();
			}
			
			this.actualizarVisualTableDatosEvaluacionesFactores();
			
			this.jTableDatosEvaluacionesFactores.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesFactores(), this.getIndiceNuevoEvaluacionesFactores());
			
			this.seleccionarFilaTablaEvaluacionesFactoresActual();
						
			this.actualizarEstadoCeldasBotonesEvaluacionesFactores("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEvaluacionesFactores(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jCheckBoxverificadoEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarverificadoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigoEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarcodigoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigo_datoEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarcodigo_datoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextAreanombre_completoEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarnombre_completoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_conocimientoEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarvalor_conocimientoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_eficienciaEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarvalor_eficienciaEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_obtenidoEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarvalor_obtenidoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldpromedioEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarpromedioEvaluacionesFactores);	
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarid_tipo_calificacion_empleadoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarid_estructuraEvaluacionesFactores);//
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarid_empresaEvaluacionesFactores);//
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarid_sucursalEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setEnabled(isHabilitar && this.evaluacionesfactoresConstantesFunciones.activarid_formato_nomi_pregunta_nomiEvaluacionesFactores);
	};
	
	public void setDefaultControlesEvaluacionesFactores() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEvaluacionesFactores(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.evaluacionesfactoresSessionBean.setConGuardarRelaciones(true);			
			this.evaluacionesfactoresSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTabbedPaneRelacionesEvaluacionesFactores.setVisible(true);
			
					
		} else {
			//this.evaluacionesfactoresSessionBean.setConGuardarRelaciones(false);			
			this.evaluacionesfactoresSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTabbedPaneRelacionesEvaluacionesFactores.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEvaluacionesFactores() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
				if(evaluacionesfactoresAux.getId().equals(this.iIdNuevoEvaluacionesFactores)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoress) {
				if(evaluacionesfactoresAux.getId().equals(this.iIdNuevoEvaluacionesFactores)) {
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
	
	public int getIndiceActualEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
				if(evaluacionesfactoresAux.getId().equals(evaluacionesfactores.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoress) {
				if(evaluacionesfactoresAux.getId().equals(evaluacionesfactores.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEvaluacionesFactores(EvaluacionesFactores evaluacionesfactoresOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
				if(evaluacionesfactoresAux.getEvaluacionesFactoresOriginal().getId().equals(evaluacionesfactoresOriginal.getId())) {
					existe=true;
					evaluacionesfactoresOriginal.setId(evaluacionesfactoresAux.getId());
					evaluacionesfactoresOriginal.setVersionRow(evaluacionesfactoresAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoress) {
				if(evaluacionesfactoresAux.getEvaluacionesFactoresOriginal().getId().equals(evaluacionesfactoresOriginal.getId())) {
					existe=true;
					evaluacionesfactoresOriginal.setId(evaluacionesfactoresAux.getId());
					evaluacionesfactoresOriginal.setVersionRow(evaluacionesfactoresAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEvaluacionesFactores(Boolean esParaCancelar) throws Exception {
		evaluacionesfactoressAux=new ArrayList<EvaluacionesFactores>();
		evaluacionesfactoresAux=new EvaluacionesFactores();
		
		if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
					if(evaluacionesfactoresAux.getId()<0) {
						evaluacionesfactoressAux.add(evaluacionesfactoresAux);
					}		
				}
				this.iIdNuevoEvaluacionesFactores=0L;
				this.evaluacionesfactoresLogic.getEvaluacionesFactoress().removeAll(evaluacionesfactoressAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoress) {
					if(evaluacionesfactoresAux.getId()<0) {
						evaluacionesfactoressAux.add(evaluacionesfactoresAux);
					}		
				}
				this.iIdNuevoEvaluacionesFactores=0L;
				this.evaluacionesfactoress.removeAll(evaluacionesfactoressAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEvaluacionesFactores 
					&& this.evaluacionesfactoresLogic.getEvaluacionesFactoress().size()>0
					) {
					evaluacionesfactoresAux=this.evaluacionesfactoresLogic.getEvaluacionesFactoress().get(this.evaluacionesfactoresLogic.getEvaluacionesFactoress().size() - 1);
				
					if(evaluacionesfactoresAux.getId()<0) {
						this.evaluacionesfactoresLogic.getEvaluacionesFactoress().remove(evaluacionesfactoresAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEvaluacionesFactores && this.evaluacionesfactoress.size()>0) {
					evaluacionesfactoresAux=this.evaluacionesfactoress.get(this.evaluacionesfactoress.size() - 1);
				
					if(evaluacionesfactoresAux.getId()<0) {
						this.evaluacionesfactoress.remove(evaluacionesfactoresAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEvaluacionesFactores(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(evaluacionesfactores.getId()<0) {
				this.evaluacionesfactoresLogic.getEvaluacionesFactoress().remove(this.evaluacionesfactores);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(evaluacionesfactores.getId()<0) {
				this.evaluacionesfactoress.remove(this.evaluacionesfactores);
			}
		}			
	}
	
	public void setEstadosInicialesEvaluacionesFactores(List<EvaluacionesFactores> evaluacionesfactoressAux) throws Exception {
		EvaluacionesFactoresConstantesFunciones.setEstadosInicialesEvaluacionesFactores(evaluacionesfactoressAux);
	}
	
	public void setEstadosInicialesEvaluacionesFactores(EvaluacionesFactores evaluacionesfactoresAux) throws Exception {
		EvaluacionesFactoresConstantesFunciones.setEstadosInicialesEvaluacionesFactores(evaluacionesfactoresAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEvaluacionesFactoresActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEvaluacionesFactores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEvaluacionesFactoresActual()) {
				if(!this.isEsNuevoEvaluacionesFactores) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEvaluacionesFactores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEvaluacionesFactores=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEvaluacionesFactoresActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Evaluaciones Factores ?", "MANTENIMIENTO DE Evaluaciones Factores", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEvaluacionesFactores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EvaluacionesFactores evaluacionesfactores) throws Exception {
		EvaluacionesFactoresConstantesFunciones.seleccionarAsignar(this.evaluacionesfactores,evaluacionesfactores);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEvaluacionesFactores=this.isPermisoActualizarOriginalEvaluacionesFactores;
			
			
			this.seleccionarAsignar(evaluacionesfactores);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesEvaluacionesFactores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.evaluacionesfactoresSessionBean.setsFuncionBusquedaRapida(this.evaluacionesfactoresSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEvaluacionesFactores) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEvaluacionesFactores(esParaCancelar);				
				this.cancelarNuevoEvaluacionesFactores(esParaCancelar);								
			}
			
			this.evaluacionesfactores=new EvaluacionesFactores();
			
			this.inicializarEvaluacionesFactores();
			
			this.actualizarEstadoCeldasBotonesEvaluacionesFactores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEvaluacionesFactores() throws Exception {
		try {
			EvaluacionesFactoresConstantesFunciones.inicializarEvaluacionesFactores(this.evaluacionesfactores);
			
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
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.evaluacionesfactoresLogic.getEvaluacionesFactoress().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEvaluacionesFactoress(String sAccionBusqueda,List<EvaluacionesFactores> evaluacionesfactoressParaReportes) throws Exception {
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
					sPathReporteFinal="EvaluacionesFactores"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EvaluacionesFactoresMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EvaluacionesFactoresMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EvaluacionesFactores"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Evaluaciones Factoreses");		
		parameters.put("busquedapor", EvaluacionesFactoresConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEvaluacionesFactores=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EvaluacionesFactoresConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EvaluacionesFactoresConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEvaluacionesFactores=new JRBeanArrayDataSource(EvaluacionesFactoresJInternalFrame.TraerEvaluacionesFactoresBeans(evaluacionesfactoressParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEvaluacionesFactores);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EvaluacionesFactoresConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EvaluacionesFactoresConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EvaluacionesFactoresBean.TraerEvaluacionesFactoresBeans(evaluacionesfactoressParaReportes).toArray()));
							
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
				this.generarExcelReporteEvaluacionesFactoress(sAccionBusqueda,sTipoArchivoReporte,evaluacionesfactoressParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEvaluacionesFactoress(sAccionBusqueda,sTipoArchivoReporte,evaluacionesfactoressParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEvaluacionesFactoresActionPerformed(null);
					//this.generarExcelReporteEvaluacionesFactoress(sAccionBusqueda,sTipoArchivoReporte,evaluacionesfactoressParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEvaluacionesFactoress(sAccionBusqueda,sTipoArchivoReporte,evaluacionesfactoressParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEvaluacionesFactoress(sAccionBusqueda,sTipoArchivoReporte,evaluacionesfactoressParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEvaluacionesFactoress(sAccionBusqueda,sTipoArchivoReporte,evaluacionesfactoressParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEvaluacionesFactoress(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionesFactores> evaluacionesfactoressParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesfactores";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionesFactoress");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEvaluacionesFactores("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EvaluacionesFactores evaluacionesfactores : evaluacionesfactoressParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EvaluacionesFactoresConstantesFunciones.generarExcelReporteDataEvaluacionesFactores("NORMAL",row,workbook,evaluacionesfactores,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Factores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEvaluacionesFactores(String sTipo,Row row,Workbook workbook) {
		
		EvaluacionesFactoresConstantesFunciones.generarExcelReporteHeaderEvaluacionesFactores(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEvaluacionesFactoress(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionesFactores> evaluacionesfactoressParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesfactores_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionesFactoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EvaluacionesFactores evaluacionesfactores : evaluacionesfactoressParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EvaluacionesFactoresConstantesFunciones.getEvaluacionesFactoresDescripcion(evaluacionesfactores));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.gettipocalificacionempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_VERIFICADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VERIFICADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(evaluacionesfactores.getverificado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.getcodigo_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.getformatonomipreguntanomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.getvalor_conocimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.getvalor_eficiencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.getvalor_obtenido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesfactores.getpromedio());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Factores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEvaluacionesFactoress(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionesFactores> evaluacionesfactoressParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EvaluacionesFactores> evaluacionesfactoressRespaldo=null;
		
		classes=EvaluacionesFactoresConstantesFunciones.getClassesRelationshipsOfEvaluacionesFactores(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.evaluacionesfactoresLogic.setDatosCliente(this.datosCliente);
		this.evaluacionesfactoresLogic.setDatosDeep(this.datosDeep);
		this.evaluacionesfactoresLogic.setIsConDeep(true);
		
		evaluacionesfactoressRespaldo=this.evaluacionesfactoresLogic.getEvaluacionesFactoress();
		
		this.evaluacionesfactoresLogic.setEvaluacionesFactoress(evaluacionesfactoressParaReportes);	
		this.evaluacionesfactoresLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		evaluacionesfactoressParaReportes=this.evaluacionesfactoresLogic.getEvaluacionesFactoress();
		this.evaluacionesfactoresLogic.setEvaluacionesFactoress(evaluacionesfactoressRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesfactores_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionesFactoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEvaluacionesFactores("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EvaluacionesFactores evaluacionesfactores : evaluacionesfactoressParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEvaluacionesFactores("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EvaluacionesFactoresConstantesFunciones.generarExcelReporteDataEvaluacionesFactores("NORMAL",row,workbook,evaluacionesfactores,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EvaluacionesFactoresConstantesFunciones.getEvaluacionesFactoresDescripcion(evaluacionesfactores));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Factores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEvaluacionesFactores() throws Exception {		
		this.startProcessEvaluacionesFactores(true);
	}
	
	public void startProcessEvaluacionesFactores(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEvaluacionesFactores ,this.jPanelParametrosReportesEvaluacionesFactores, this.jScrollPanelDatosEvaluacionesFactores,this.jPanelPaginacionEvaluacionesFactores, this.jScrollPanelDatosEdicionEvaluacionesFactores, this.jPanelAccionesEvaluacionesFactores,this.jPanelAccionesFormularioEvaluacionesFactores,this.jmenuBarEvaluacionesFactores,this.jmenuBarDetalleEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,this.jTtoolBarDetalleEvaluacionesFactores);		
		
		final JTabbedPane jTabbedPaneBusquedasEvaluacionesFactores=this.jTabbedPaneBusquedasEvaluacionesFactores; 
		
		final JPanel jPanelParametrosReportesEvaluacionesFactores=this.jPanelParametrosReportesEvaluacionesFactores;
		//final JScrollPane jScrollPanelDatosEvaluacionesFactores=this.jScrollPanelDatosEvaluacionesFactores;
		final JTable jTableDatosEvaluacionesFactores=this.jTableDatosEvaluacionesFactores;		
		final JPanel jPanelPaginacionEvaluacionesFactores=this.jPanelPaginacionEvaluacionesFactores;
		//final JScrollPane jScrollPanelDatosEdicionEvaluacionesFactores=this.jScrollPanelDatosEdicionEvaluacionesFactores;
		final JPanel jPanelAccionesEvaluacionesFactores=this.jPanelAccionesEvaluacionesFactores;
		
		JPanel jPanelCamposAuxiliarEvaluacionesFactores=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEvaluacionesFactores=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			jPanelCamposAuxiliarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelCamposEvaluacionesFactores;
			jPanelAccionesFormularioAuxiliarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelAccionesFormularioEvaluacionesFactores;
		}
		
		final JPanel jPanelCamposEvaluacionesFactores=jPanelCamposAuxiliarEvaluacionesFactores;
		final JPanel jPanelAccionesFormularioEvaluacionesFactores=jPanelAccionesFormularioAuxiliarEvaluacionesFactores;
		
		
		final JMenuBar jmenuBarEvaluacionesFactores=this.jmenuBarEvaluacionesFactores;
		final JToolBar jTtoolBarEvaluacionesFactores=this.jTtoolBarEvaluacionesFactores;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEvaluacionesFactores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEvaluacionesFactores=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			jmenuBarDetalleAuxiliarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jmenuBarDetalleEvaluacionesFactores;
			jTtoolBarDetalleAuxiliarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jTtoolBarDetalleEvaluacionesFactores;
		}
		
		final JMenuBar jmenuBarDetalleEvaluacionesFactores=jmenuBarDetalleAuxiliarEvaluacionesFactores;
		final JToolBar jTtoolBarDetalleEvaluacionesFactores=jTtoolBarDetalleAuxiliarEvaluacionesFactores;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEvaluacionesFactores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEvaluacionesFactores;
			processRunnable.jTableDatos=jTableDatosEvaluacionesFactores;
			processRunnable.jPanelCampos=jPanelCamposEvaluacionesFactores;
			processRunnable.jPanelPaginacion=jPanelPaginacionEvaluacionesFactores;
			processRunnable.jPanelAcciones=jPanelAccionesEvaluacionesFactores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEvaluacionesFactores;
			
			
			processRunnable.jmenuBar=jmenuBarEvaluacionesFactores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEvaluacionesFactores;
			processRunnable.jTtoolBar=jTtoolBarEvaluacionesFactores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEvaluacionesFactores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEvaluacionesFactores ,jPanelParametrosReportesEvaluacionesFactores,jTableDatosEvaluacionesFactores, /*jScrollPanelDatosEvaluacionesFactores,*/jPanelCamposEvaluacionesFactores,jPanelPaginacionEvaluacionesFactores, /*jScrollPanelDatosEdicionEvaluacionesFactores,*/ jPanelAccionesEvaluacionesFactores,jPanelAccionesFormularioEvaluacionesFactores,jmenuBarEvaluacionesFactores,jmenuBarDetalleEvaluacionesFactores,jTtoolBarEvaluacionesFactores,jTtoolBarDetalleEvaluacionesFactores);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEvaluacionesFactores ,jPanelParametrosReportesEvaluacionesFactores, jScrollPanelDatosEvaluacionesFactores,jPanelPaginacionEvaluacionesFactores, jScrollPanelDatosEdicionEvaluacionesFactores, jPanelAccionesEvaluacionesFactores,jPanelAccionesFormularioEvaluacionesFactores,jmenuBarEvaluacionesFactores,jmenuBarDetalleEvaluacionesFactores,jTtoolBarEvaluacionesFactores,jTtoolBarDetalleEvaluacionesFactores);
						
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
	
	public void finishProcessEvaluacionesFactores() {// throws Exception 
		this.finishProcessEvaluacionesFactores(true);
	}
	
	public void finishProcessEvaluacionesFactores(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEvaluacionesFactores ,this.jPanelParametrosReportesEvaluacionesFactores, this.jScrollPanelDatosEvaluacionesFactores,this.jPanelPaginacionEvaluacionesFactores, this.jScrollPanelDatosEdicionEvaluacionesFactores, this.jPanelAccionesEvaluacionesFactores,this.jPanelAccionesFormularioEvaluacionesFactores,this.jmenuBarEvaluacionesFactores,this.jmenuBarDetalleEvaluacionesFactores,this.jTtoolBarEvaluacionesFactores,this.jTtoolBarDetalleEvaluacionesFactores);		
		
		final JTabbedPane jTabbedPaneBusquedasEvaluacionesFactores=this.jTabbedPaneBusquedasEvaluacionesFactores; 
		
		final JPanel jPanelParametrosReportesEvaluacionesFactores=this.jPanelParametrosReportesEvaluacionesFactores;
		//final JScrollPane jScrollPanelDatosEvaluacionesFactores=this.jScrollPanelDatosEvaluacionesFactores;
		final JTable jTableDatosEvaluacionesFactores=this.jTableDatosEvaluacionesFactores;		
		final JPanel jPanelPaginacionEvaluacionesFactores=this.jPanelPaginacionEvaluacionesFactores;
		//final JScrollPane jScrollPanelDatosEdicionEvaluacionesFactores=this.jScrollPanelDatosEdicionEvaluacionesFactores;
		final JPanel jPanelAccionesEvaluacionesFactores=this.jPanelAccionesEvaluacionesFactores;
		
		JPanel jPanelCamposAuxiliarEvaluacionesFactores=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEvaluacionesFactores=new JPanel();
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			jPanelCamposAuxiliarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelCamposEvaluacionesFactores;
			jPanelAccionesFormularioAuxiliarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelAccionesFormularioEvaluacionesFactores;
		}
		
		final JPanel jPanelCamposEvaluacionesFactores=jPanelCamposAuxiliarEvaluacionesFactores;
		final JPanel jPanelAccionesFormularioEvaluacionesFactores=jPanelAccionesFormularioAuxiliarEvaluacionesFactores;
		
		
		final JMenuBar jmenuBarEvaluacionesFactores=this.jmenuBarEvaluacionesFactores;		
		final JToolBar jTtoolBarEvaluacionesFactores=this.jTtoolBarEvaluacionesFactores;
				
		JMenuBar jmenuBarDetalleAuxiliarEvaluacionesFactores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEvaluacionesFactores=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			jmenuBarDetalleAuxiliarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jmenuBarDetalleEvaluacionesFactores;
			jTtoolBarDetalleAuxiliarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jTtoolBarDetalleEvaluacionesFactores;		
		}
		
		final JMenuBar jmenuBarDetalleEvaluacionesFactores=jmenuBarDetalleAuxiliarEvaluacionesFactores;
		final JToolBar jTtoolBarDetalleEvaluacionesFactores=jTtoolBarDetalleAuxiliarEvaluacionesFactores;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEvaluacionesFactores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEvaluacionesFactores;
			processRunnable.jTableDatos=jTableDatosEvaluacionesFactores;
			processRunnable.jPanelCampos=jPanelCamposEvaluacionesFactores;
			processRunnable.jPanelPaginacion=jPanelPaginacionEvaluacionesFactores;
			processRunnable.jPanelAcciones=jPanelAccionesEvaluacionesFactores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEvaluacionesFactores;
			
			
			processRunnable.jmenuBar=jmenuBarEvaluacionesFactores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEvaluacionesFactores;
			processRunnable.jTtoolBar=jTtoolBarEvaluacionesFactores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEvaluacionesFactores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEvaluacionesFactores ,jPanelParametrosReportesEvaluacionesFactores, jTableDatosEvaluacionesFactores,/*jScrollPanelDatosEvaluacionesFactores,*/jPanelCamposEvaluacionesFactores,jPanelPaginacionEvaluacionesFactores, /*jScrollPanelDatosEdicionEvaluacionesFactores,*/ jPanelAccionesEvaluacionesFactores,jPanelAccionesFormularioEvaluacionesFactores,jmenuBarEvaluacionesFactores,jmenuBarDetalleEvaluacionesFactores,jTtoolBarEvaluacionesFactores,jTtoolBarDetalleEvaluacionesFactores));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEvaluacionesFactores(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEvaluacionesFactores(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEvaluacionesFactores(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEvaluacionesFactores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEvaluacionesFactores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEvaluacionesFactores,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEvaluacionesFactores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEvaluacionesFactores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEvaluacionesFactores,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.evaluacionesfactoresConstantesFunciones.getsFinalQueryEvaluacionesFactores();
		String  finalQueryPaginacionTodos=this.evaluacionesfactoresConstantesFunciones.getsFinalQueryEvaluacionesFactores();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EvaluacionesFactoresConstantesFunciones.getArrayColumnasGlobalesNoEvaluacionesFactores(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EvaluacionesFactoresConstantesFunciones.getArrayColumnasGlobalesEvaluacionesFactores(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EvaluacionesFactoresConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.evaluacionesfactoressEliminados= new ArrayList<EvaluacionesFactores>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEvaluacionesFactores();
		
				///*EvaluacionesFactoresSessionBean*/this.evaluacionesfactoresSessionBean=new EvaluacionesFactoresSessionBean();
			
			if(this.evaluacionesfactoresSessionBean==null) {
				this.evaluacionesfactoresSessionBean=new EvaluacionesFactoresSessionBean();
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
					this.iNumeroPaginacion=EvaluacionesFactoresConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EvaluacionesFactoresConstantesFunciones.getClassesForeignKeysOfEvaluacionesFactores(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/evaluacionesfactores."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			evaluacionesfactoressAux= new ArrayList<EvaluacionesFactores>();
			
				
			evaluacionesfactoresLogic.setDatosCliente(this.datosCliente);
			evaluacionesfactoresLogic.setDatosDeep(this.datosDeep);
			evaluacionesfactoresLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaEvaluacionesFactores")) {
				this.sDetalleReporte=EvaluacionesFactoresConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesFactores(id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores,verificadoBusquedaEvaluacionesFactores,id_estructuraBusquedaEvaluacionesFactores,codigoBusquedaEvaluacionesFactores);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionesfactoresLogic.getEvaluacionesFactoressBusquedaEvaluacionesFactores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores,verificadoBusquedaEvaluacionesFactores,id_estructuraBusquedaEvaluacionesFactores,codigoBusquedaEvaluacionesFactores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionesFactoresConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesFactores(id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores,verificadoBusquedaEvaluacionesFactores,id_estructuraBusquedaEvaluacionesFactores,codigoBusquedaEvaluacionesFactores);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionesFactoresConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesFactores(id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores,verificadoBusquedaEvaluacionesFactores,id_estructuraBusquedaEvaluacionesFactores,codigoBusquedaEvaluacionesFactores);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionesfactoresLogic.getEvaluacionesFactoress()==null||evaluacionesfactoresLogic.getEvaluacionesFactoress().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionesfactoress==null|| evaluacionesfactoress.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesfactoressAux=new ArrayList<EvaluacionesFactores>();
						evaluacionesfactoressAux.addAll(evaluacionesfactoresLogic.getEvaluacionesFactoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionesfactoressAux=new ArrayList<EvaluacionesFactores>();
							evaluacionesfactoressAux.addAll(evaluacionesfactoress);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionesfactoresLogic.getEvaluacionesFactoressBusquedaEvaluacionesFactores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores,verificadoBusquedaEvaluacionesFactores,id_estructuraBusquedaEvaluacionesFactores,codigoBusquedaEvaluacionesFactores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionesFactoresConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesFactores(id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores,verificadoBusquedaEvaluacionesFactores,id_estructuraBusquedaEvaluacionesFactores,codigoBusquedaEvaluacionesFactores);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionesFactoresConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesFactores(id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores,verificadoBusquedaEvaluacionesFactores,id_estructuraBusquedaEvaluacionesFactores,codigoBusquedaEvaluacionesFactores);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionesFactoress("BusquedaEvaluacionesFactores",evaluacionesfactoresLogic.getEvaluacionesFactoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionesFactoress("BusquedaEvaluacionesFactores",evaluacionesfactoress);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesfactoresLogic.setEvaluacionesFactoress(new ArrayList<EvaluacionesFactores>());
						evaluacionesfactoresLogic.getEvaluacionesFactoress().addAll(evaluacionesfactoressAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionesfactoress=new ArrayList<EvaluacionesFactores>();
							evaluacionesfactoress.addAll(evaluacionesfactoressAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEvaluacionesFactores();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEvaluacionesFactores();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=evaluacionesfactoresLogic.getEvaluacionesFactoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionesfactoress.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=evaluacionesfactoresLogic.getEvaluacionesFactoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionesfactoress.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EvaluacionesFactores evaluacionesfactores) {
		Boolean permite=true;
		
		if(this.evaluacionesfactores.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EvaluacionesFactoresConstantesFunciones.getOrderByListaEvaluacionesFactores();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EvaluacionesFactoresConstantesFunciones.getOrderByListaEvaluacionesFactores();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
				if(evaluacionesfactores.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesfactoresTotales=evaluacionesfactores;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesFactores evaluacionesfactores:this.evaluacionesfactoress) {
				if(evaluacionesfactores.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesfactoresTotales=evaluacionesfactores;
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
			this.evaluacionesfactoresAux=new EvaluacionesFactores();
			this.evaluacionesfactoresAux.setsType(Constantes2.S_TOTALES);
			this.evaluacionesfactoresAux.setIsNew(false);
			this.evaluacionesfactoresAux.setIsChanged(false);
			this.evaluacionesfactoresAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//EvaluacionesFactoresConstantesFunciones.TotalizarValoresFilaEvaluacionesFactores(this.evaluacionesfactoresLogic.getEvaluacionesFactoress(),this.evaluacionesfactoresAux);
				
				//this.evaluacionesfactoresLogic.getEvaluacionesFactoress().add(this.evaluacionesfactoresAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EvaluacionesFactoresConstantesFunciones.TotalizarValoresFilaEvaluacionesFactores(this.evaluacionesfactoress,this.evaluacionesfactoresAux);
				
				this.evaluacionesfactoress.add(this.evaluacionesfactoresAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		evaluacionesfactoresTotales=new EvaluacionesFactores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.evaluacionesfactoresLogic.getEvaluacionesFactoress().remove(evaluacionesfactoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.evaluacionesfactoress.remove(evaluacionesfactoresTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		evaluacionesfactoresTotales=new EvaluacionesFactores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
				if(evaluacionesfactores.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesfactoresTotales=evaluacionesfactores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EvaluacionesFactoresConstantesFunciones.TotalizarValoresFilaEvaluacionesFactores(this.evaluacionesfactoresLogic.getEvaluacionesFactoress(),evaluacionesfactoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesFactores evaluacionesfactores:this.evaluacionesfactoress) {
				if(evaluacionesfactores.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesfactoresTotales=evaluacionesfactores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EvaluacionesFactoresConstantesFunciones.TotalizarValoresFilaEvaluacionesFactores(this.evaluacionesfactoress,evaluacionesfactoresTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEvaluacionesFactoressBusquedaEvaluacionesFactores()throws Exception {
		try {
			sAccionBusqueda="BusquedaEvaluacionesFactores";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesFactoressFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesFactoressFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesFactoressFK_IdFormatoNomiPreguntaNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormatoNomiPreguntaNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesFactoressFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesFactoressFK_IdTipoCalificacionEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCalificacionEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEvaluacionesFactoressBusquedaEvaluacionesFactores(String sFinalQuery,Long id_tipo_calificacion_empleado,Boolean verificado,Long id_estructura,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesfactoresLogic.getEvaluacionesFactoressBusquedaEvaluacionesFactores(sFinalQuery,this.pagination,id_tipo_calificacion_empleado,verificado,id_estructura,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesFactoressFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesfactoresLogic.getEvaluacionesFactoressFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesFactoressFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesfactoresLogic.getEvaluacionesFactoressFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesFactoressFK_IdFormatoNomiPreguntaNomi(String sFinalQuery,Long id_formato_nomi_pregunta_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesfactoresLogic.getEvaluacionesFactoressFK_IdFormatoNomiPreguntaNomi(sFinalQuery,this.pagination,id_formato_nomi_pregunta_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesFactoressFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesfactoresLogic.getEvaluacionesFactoressFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesFactoressFK_IdTipoCalificacionEmpleado(String sFinalQuery,Long id_tipo_calificacion_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesfactoresLogic.getEvaluacionesFactoressFK_IdTipoCalificacionEmpleado(sFinalQuery,this.pagination,id_tipo_calificacion_empleado);
				
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
	
	public void inicializarPermisosEvaluacionesFactores() {
		this.isPermisoTodoEvaluacionesFactores=false;
		this.isPermisoNuevoEvaluacionesFactores=false;
		this.isPermisoActualizarEvaluacionesFactores=false;
		this.isPermisoActualizarOriginalEvaluacionesFactores=false;
		this.isPermisoEliminarEvaluacionesFactores=false;
		this.isPermisoGuardarCambiosEvaluacionesFactores=false;
		this.isPermisoConsultaEvaluacionesFactores=true;
		this.isPermisoBusquedaEvaluacionesFactores=true;
		this.isPermisoReporteEvaluacionesFactores=true;
		this.isPermisoOrdenEvaluacionesFactores=false;		
		this.isPermisoPaginacionMedioEvaluacionesFactores=false;		
		this.isPermisoPaginacionAltoEvaluacionesFactores=false;		
		this.isPermisoPaginacionTodoEvaluacionesFactores=false;		
		this.isPermisoCopiarEvaluacionesFactores=false;		
		this.isPermisoVerFormEvaluacionesFactores=false;		
		this.isPermisoDuplicarEvaluacionesFactores=false;
		this.isPermisoOrdenEvaluacionesFactores=false;
	}
	
	public void setPermisosUsuarioEvaluacionesFactores(Boolean isPermiso) {
		this.isPermisoTodoEvaluacionesFactores=isPermiso;
		this.isPermisoNuevoEvaluacionesFactores=isPermiso;
		this.isPermisoActualizarEvaluacionesFactores=isPermiso;
		this.isPermisoActualizarOriginalEvaluacionesFactores=isPermiso;
		this.isPermisoEliminarEvaluacionesFactores=isPermiso;
		this.isPermisoGuardarCambiosEvaluacionesFactores=isPermiso;
		this.isPermisoConsultaEvaluacionesFactores=isPermiso;
		this.isPermisoBusquedaEvaluacionesFactores=isPermiso;
		this.isPermisoReporteEvaluacionesFactores=isPermiso;
		this.isPermisoOrdenEvaluacionesFactores=isPermiso;		
		this.isPermisoPaginacionMedioEvaluacionesFactores=isPermiso;		
		this.isPermisoPaginacionAltoEvaluacionesFactores=isPermiso;		
		this.isPermisoPaginacionTodoEvaluacionesFactores=isPermiso;		
		this.isPermisoCopiarEvaluacionesFactores=isPermiso;		
		this.isPermisoVerFormEvaluacionesFactores=isPermiso;		
		this.isPermisoDuplicarEvaluacionesFactores=isPermiso;
		this.isPermisoOrdenEvaluacionesFactores=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEvaluacionesFactores(Boolean isPermiso) {
		//this.isPermisoTodoEvaluacionesFactores=isPermiso;
		this.isPermisoNuevoEvaluacionesFactores=isPermiso;
		this.isPermisoActualizarEvaluacionesFactores=isPermiso;
		this.isPermisoActualizarOriginalEvaluacionesFactores=isPermiso;
		this.isPermisoEliminarEvaluacionesFactores=isPermiso;
		this.isPermisoGuardarCambiosEvaluacionesFactores=isPermiso;
		//this.isPermisoConsultaEvaluacionesFactores=isPermiso;
		//this.isPermisoBusquedaEvaluacionesFactores=isPermiso;
		//this.isPermisoReporteEvaluacionesFactores=isPermiso;
		//this.isPermisoOrdenEvaluacionesFactores=isPermiso;		
		//this.isPermisoPaginacionMedioEvaluacionesFactores=isPermiso;		
		//this.isPermisoPaginacionAltoEvaluacionesFactores=isPermiso;		
		//this.isPermisoPaginacionTodoEvaluacionesFactores=isPermiso;		
		//this.isPermisoCopiarEvaluacionesFactores=isPermiso;		
		//this.isPermisoDuplicarEvaluacionesFactores=isPermiso;
		//this.isPermisoOrdenEvaluacionesFactores=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEvaluacionesFactoresClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EvaluacionesFactoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEvaluacionesFactores(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEvaluacionesFactoresClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEvaluacionesFactoresClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEvaluacionesFactoresClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEvaluacionesFactoresClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEvaluacionesFactores() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EvaluacionesFactoresJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EvaluacionesFactoresConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEvaluacionesFactores=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEvaluacionesFactores=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEvaluacionesFactores=this.isPermisoActualizarEvaluacionesFactores;
			this.isPermisoEliminarEvaluacionesFactores=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEvaluacionesFactores=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEvaluacionesFactores=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEvaluacionesFactores=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEvaluacionesFactores=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEvaluacionesFactores=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEvaluacionesFactores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEvaluacionesFactores=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEvaluacionesFactores=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEvaluacionesFactores=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEvaluacionesFactores=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEvaluacionesFactores=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEvaluacionesFactores=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEvaluacionesFactores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEvaluacionesFactores.setToolTipText(this.jTableDatosEvaluacionesFactores.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEvaluacionesFactores(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEvaluacionesFactores(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EvaluacionesFactoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EvaluacionesFactoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEvaluacionesFactores() throws Exception {
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
	public void inicializarCombosForeignKeyEvaluacionesFactoresListas()throws Exception {
		try	{						
			
				this.tipocalificacionempleadosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.formatonomipreguntanomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEvaluacionesFactoresListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EvaluacionesFactoresJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyTipoCalificacionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoNomiPreguntaNomiListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyFormatoNomiPreguntaNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatonomipreguntanomisForeignKey==null||this.formatonomipreguntanomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoNomiPreguntaNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomiPreguntaNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoNomiPreguntaNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoNomiPreguntaNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatoNomiPreguntaNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyEvaluacionesFactores()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoCalificacionEmpleado();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoCalificacionEmpleado()throws Exception {
		try {
			if(this.evaluacionesfactoresSessionBean==null) {
				this.evaluacionesfactoresSessionBean=new EvaluacionesFactoresSessionBean();
			}

			if(!this.evaluacionesfactoresSessionBean.getisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado()) {
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

			if(!this.evaluacionesfactoresSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

			if(!this.evaluacionesfactoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.evaluacionesfactoresSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi()throws Exception {
		try {

			if(!this.evaluacionesfactoresSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi()) {
				FormatoNomiPreguntaNomi formatonomipreguntanomi=new FormatoNomiPreguntaNomi();
				FormatoNomiPreguntaNomiConstantesFunciones.setFormatoNomiPreguntaNomiDescripcion(formatonomipreguntanomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				formatonomipreguntanomi.setId(null);

				if(!FormatoNomiPreguntaNomiConstantesFunciones.ExisteEnLista(this.formatonomipreguntanomisForeignKey,formatonomipreguntanomi,true)) {

					this.formatonomipreguntanomisForeignKey.add(0,formatonomipreguntanomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEvaluacionesFactores()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEvaluacionesFactores(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEvaluacionesFactores()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionesFactores();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores)throws Exception {	
		try {
			
			this.setActualFormatoNomiPreguntaNomiForeignKey(evaluacionesfactores.getid_formato_nomi_pregunta_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEvaluacionesFactores()throws Exception {	
		try {
			
			this.setActualFormatoNomiPreguntaNomiForeignKey(this.evaluacionesfactoresConstantesFunciones.getid_formato_nomi_pregunta_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionesFactores()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEvaluacionesFactores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEvaluacionesFactores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEvaluacionesFactores()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEvaluacionesFactores()throws Exception {
		try {
			

			this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEvaluacionesFactores(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEvaluacionesFactores()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public EvaluacionesFactoresBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EvaluacionesFactoresBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EvaluacionesFactoresBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.evaluacionesfactoresSessionBean=new EvaluacionesFactoresSessionBean(); 
		this.evaluacionesfactoresConstantesFunciones=new EvaluacionesFactoresConstantesFunciones(); 
		this.evaluacionesfactoresBean=new EvaluacionesFactores();//(this.evaluacionesfactoresConstantesFunciones); 		
		this.evaluacionesfactoresReturnGeneral=new EvaluacionesFactoresParameterReturnGeneral(); 
		
		this.evaluacionesfactoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionesfactoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EvaluacionesFactoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EvaluacionesFactoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EvaluacionesFactoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEvaluacionesFactores(true);
			
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
			
			this.evaluacionesfactoresConstantesFunciones=new EvaluacionesFactoresConstantesFunciones(); 
			this.evaluacionesfactoresBean=new EvaluacionesFactores();//this.evaluacionesfactoresConstantesFunciones); 			
			this.evaluacionesfactoresReturnGeneral=new EvaluacionesFactoresParameterReturnGeneral(); 
		
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Evaluaciones Factores Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.evaluacionesfactores=new EvaluacionesFactores();
			this.evaluacionesfactoress = new ArrayList<EvaluacionesFactores>();
			this.evaluacionesfactoressAux = new ArrayList<EvaluacionesFactores>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic=new EvaluacionesFactoresLogic();
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}
			
			//this.evaluacionesfactoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.evaluacionesfactoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEvaluacionesFactores);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEvaluacionesFactores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEvaluacionesFactores);	
					}
					
					if(this.jInternalFrameImportacionEvaluacionesFactores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEvaluacionesFactores);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEvaluacionesFactores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEvaluacionesFactores);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEvaluacionesFactores);
				this.jInternalFrameDetalleFormEvaluacionesFactores.setVisible(false);
				this.jInternalFrameDetalleFormEvaluacionesFactores.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEvaluacionesFactores!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEvaluacionesFactores);
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.setVisible(false);
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEvaluacionesFactores!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEvaluacionesFactores);
					this.jInternalFrameImportacionEvaluacionesFactores.setVisible(false);
					this.jInternalFrameImportacionEvaluacionesFactores.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEvaluacionesFactores!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEvaluacionesFactores);
					this.jInternalFrameOrderByEvaluacionesFactores.setVisible(false);
					this.jInternalFrameOrderByEvaluacionesFactores.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEvaluacionesFactoresActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EvaluacionesFactoresConstantesFunciones.INUMEROPAGINACION;
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
			
			this.evaluacionesfactoresReturnGeneral=new EvaluacionesFactoresParameterReturnGeneral();
			
			this.evaluacionesfactoresParameterGeneral=new EvaluacionesFactoresParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.evaluacionesfactoresLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EvaluacionesFactoresJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EvaluacionesFactoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado(),this.evaluacionesfactoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EvaluacionesFactoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado(),this.evaluacionesfactoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=false;
			this.isVisibilidadCeldaDuplicarEvaluacionesFactores=true;
			this.isVisibilidadCeldaCopiarEvaluacionesFactores=true;
			this.isVisibilidadCeldaVerFormEvaluacionesFactores=true;
			this.isVisibilidadCeldaOrdenEvaluacionesFactores=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=false;
			this.isVisibilidadCeldaModificarEvaluacionesFactores=false;
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=false;
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=false;
			this.isVisibilidadCeldaCancelarEvaluacionesFactores=false;
			this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=false;
			
			
			this.isVisibilidadBusquedaEvaluacionesFactores=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoCalificacionEmpleado=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEvaluacionesFactores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEvaluacionesFactores();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEvaluacionesFactores(false);
			
			this.setPermisosUsuarioEvaluacionesFactores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() 
				|| (this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado() && this.evaluacionesfactoresSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEvaluacionesFactoresClasesRelacionadas();
			}
			
			if(this.evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEvaluacionesFactoresClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEvaluacionesFactores();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEvaluacionesFactores();
			}
			
			if(!this.isPermisoBusquedaEvaluacionesFactores) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEvaluacionesFactores.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EvaluacionesFactoresConstantesFunciones.getTiposSeleccionarEvaluacionesFactores());
				
				this.tiposColumnasSelect=EvaluacionesFactoresConstantesFunciones.getTiposSeleccionarEvaluacionesFactores(true);
				
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
			//if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEvaluacionesFactores();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioEvaluacionesFactores(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioEvaluacionesFactores(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesFactores() ;
			
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
			this.formatonomipreguntanomiLogic=new FormatoNomiPreguntaNomiLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				evaluacionesfactoresImplementable= (EvaluacionesFactoresImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EvaluacionesFactoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				evaluacionesfactoresImplementableHome= (EvaluacionesFactoresImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EvaluacionesFactoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.evaluacionesfactoress= new ArrayList<EvaluacionesFactores>();
			this.evaluacionesfactoressEliminados= new ArrayList<EvaluacionesFactores>();
						
			this.isEsNuevoEvaluacionesFactores=false;
			this.esParaAccionDesdeFormularioEvaluacionesFactores=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipocalificacionempleadosForeignKey=new ArrayList<TipoCalificacionEmpleado>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.formatonomipreguntanomisForeignKey=new ArrayList<FormatoNomiPreguntaNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEvaluacionesFactores(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEvaluacionesFactores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EvaluacionesFactoresConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEvaluacionesFactores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEvaluacionesFactores(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEvaluacionesFactores();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEvaluacionesFactores();
			}
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEvaluacionesFactores.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEvaluacionesFactores.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEvaluacionesFactores.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEvaluacionesFactores(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EvaluacionesFactores: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEvaluacionesFactores() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEvaluacionesFactores")) {
				iIndex=this.jInternalFrameDetalleFormEvaluacionesFactores.jTabbedPaneRelacionesEvaluacionesFactores.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEvaluacionesFactores.jTabbedPaneRelacionesEvaluacionesFactores.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEvaluacionesFactores();	
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
	
	public void cargarCombosForeignKeyEvaluacionesFactores(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEvaluacionesFactores(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEvaluacionesFactores(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEvaluacionesFactoresListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEvaluacionesFactores();
		
		this.cargarCombosFrameForeignKeyEvaluacionesFactores();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEvaluacionesFactores();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEvaluacionesFactores();
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

	public void cargarCombosForeignKeyFormatoNomiPreguntaNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoNomiPreguntaNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi();
				this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormatoNomiPreguntaNomi(this.formatonomipreguntanomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEvaluacionesFactoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
			
			if(jTableDatosEvaluacionesFactores.getRowCount()>=1) {
				jTableDatosEvaluacionesFactores.removeRowSelectionInterval(0, jTableDatosEvaluacionesFactores.getRowCount()-1);						
			}
			
			this.isEsNuevoEvaluacionesFactores=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEvaluacionesFactores(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEvaluacionesFactores(true);			
			//this.evaluacionesfactores=new EvaluacionesFactores();
			//this.evaluacionesfactores.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionesFactores(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesFactores() ;
			
			if(EvaluacionesFactoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionesFactores(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.evaluacionesfactores);	
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);				
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
			if(this.evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EvaluacionesFactores: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEvaluacionesFactoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEvaluacionesFactores.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEvaluacionesFactores.getSelectedRows().length;			
			}
			
			evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEvaluacionesFactores--;			
				//EvaluacionesFactores evaluacionesfactoresAux= new EvaluacionesFactores();			
				//evaluacionesfactoresAux.setId(this.iIdNuevoEvaluacionesFactores);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EvaluacionesFactores evaluacionesfactoresOrigen=new EvaluacionesFactores();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EvaluacionesFactores evaluacionesfactoresOrigen : evaluacionesfactoressSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							evaluacionesfactoresOrigen =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionesfactoresOrigen =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEvaluacionesFactores();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.evaluacionesfactores.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEvaluacionesFactores(evaluacionesfactoresOrigen,this.evaluacionesfactores,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.evaluacionesfactoresLogic.getEvaluacionesFactoress().add(this.evaluacionesfactoresAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactoress.add(this.evaluacionesfactoresAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
				
				this.jTableDatosEvaluacionesFactores.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesFactores(), this.getIndiceNuevoEvaluacionesFactores());
				
				int iLastRow =  this.jTableDatosEvaluacionesFactores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEvaluacionesFactores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEvaluacionesFactores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();									
		
			EvaluacionesFactores evaluacionesfactoresOrigen=new EvaluacionesFactores();
			EvaluacionesFactores evaluacionesfactoresDestino=new EvaluacionesFactores();
				
			evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEvaluacionesFactores.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || evaluacionesfactoressSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEvaluacionesFactores.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesfactoresOrigen =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						evaluacionesfactoresOrigen =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesfactoresDestino =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						evaluacionesfactoresDestino =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				evaluacionesfactoresOrigen =evaluacionesfactoressSeleccionados.get(0);
				evaluacionesfactoresDestino =evaluacionesfactoressSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEvaluacionesFactores(evaluacionesfactoresOrigen,evaluacionesfactoresDestino,true,false);
				
				evaluacionesfactoresDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(evaluacionesfactoresDestino,evaluacionesfactoresLogic.getEvaluacionesFactoress());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(evaluacionesfactoresDestino,evaluacionesfactoress);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
				
				//this.jTableDatosEvaluacionesFactores.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesFactores(), this.getIndiceNuevoEvaluacionesFactores());
				
				int iLastRow =  this.jTableDatosEvaluacionesFactores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEvaluacionesFactores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEvaluacionesFactores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEvaluacionesFactores.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEvaluacionesFactores.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEvaluacionesFactores.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEvaluacionesFactores.setVisible(!isVisible);
			this.jPanelPaginacionEvaluacionesFactores.setVisible(!isVisible);
			this.jPanelAccionesEvaluacionesFactores.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEvaluacionesFactores();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEvaluacionesFactores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEvaluacionesFactores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEvaluacionesFactores();
			
			this.abrirFrameOrderByEvaluacionesFactores();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEvaluacionesFactores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEvaluacionesFactores(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEvaluacionesFactores);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEvaluacionesFactores.isMaximum()) {
					this.jInternalFrameDetalleFormEvaluacionesFactores.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEvaluacionesFactores.setSize(this.jInternalFrameDetalleFormEvaluacionesFactores.iWidthFormulario,this.jInternalFrameDetalleFormEvaluacionesFactores.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEvaluacionesFactores.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEvaluacionesFactores.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEvaluacionesFactores.isMaximum()) {
						this.jInternalFrameDetalleFormEvaluacionesFactores.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEvaluacionesFactores.jContentPaneDetalleEvaluacionesFactores.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEvaluacionesFactores.jTabbedPaneRelacionesEvaluacionesFactores.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionesFactores.jContentPaneDetalleEvaluacionesFactores.getWidth(),EvaluacionesFactoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEvaluacionesFactores.jTabbedPaneRelacionesEvaluacionesFactores.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionesFactores.jContentPaneDetalleEvaluacionesFactores.getWidth(),EvaluacionesFactoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEvaluacionesFactores.jTabbedPaneRelacionesEvaluacionesFactores.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionesFactores.jContentPaneDetalleEvaluacionesFactores.getWidth(),EvaluacionesFactoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEvaluacionesFactores.setVisible(true);
	        this.jInternalFrameDetalleFormEvaluacionesFactores.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEvaluacionesFactores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEvaluacionesFactores==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEvaluacionesFactores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesFactores,false,this);
				} else {
					this.jInternalFrameOrderByEvaluacionesFactores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesFactores,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEvaluacionesFactores);
				this.jInternalFrameOrderByEvaluacionesFactores.setVisible(false);
				this.jInternalFrameOrderByEvaluacionesFactores.setSelected(false);
				
				this.jInternalFrameOrderByEvaluacionesFactores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEvaluacionesFactores"));
				
				this.inicializarActualizarBindingTablaOrderByEvaluacionesFactores();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEvaluacionesFactores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEvaluacionesFactores==null) {
				
				this.jInternalFrameImportacionEvaluacionesFactores=new ImportacionJInternalFrame(EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEvaluacionesFactores);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEvaluacionesFactores);
				this.jInternalFrameImportacionEvaluacionesFactores.setVisible(false);
				this.jInternalFrameImportacionEvaluacionesFactores.setSelected(false);


				this.jInternalFrameImportacionEvaluacionesFactores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEvaluacionesFactores"));
				this.jInternalFrameImportacionEvaluacionesFactores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEvaluacionesFactores"));
				this.jInternalFrameImportacionEvaluacionesFactores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEvaluacionesFactores"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEvaluacionesFactores() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEvaluacionesFactores==null) {
				this.jInternalFrameReporteDinamicoEvaluacionesFactores=new ReporteDinamicoJInternalFrame(EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEvaluacionesFactores);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEvaluacionesFactores);
				this.jInternalFrameReporteDinamicoEvaluacionesFactores.setVisible(false);
				this.jInternalFrameReporteDinamicoEvaluacionesFactores.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionesFactores"));
				this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionesFactores"));
				this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionesFactores"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionesFactores();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEvaluacionesFactores() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEvaluacionesFactores);
			
	       	this.jInternalFrameDetalleFormEvaluacionesFactores.setVisible(false);
	        this.jInternalFrameDetalleFormEvaluacionesFactores.setSelected(false);
			
			//this.jInternalFrameDetalleFormEvaluacionesFactores.dispose();
			//this.jInternalFrameDetalleFormEvaluacionesFactores=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEvaluacionesFactores() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEvaluacionesFactores.setVisible(true);
	        this.jInternalFrameReporteDinamicoEvaluacionesFactores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEvaluacionesFactores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEvaluacionesFactores.setVisible(true);
	        this.jInternalFrameImportacionEvaluacionesFactores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEvaluacionesFactores() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEvaluacionesFactores.setVisible(true);
	        this.jInternalFrameOrderByEvaluacionesFactores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEvaluacionesFactores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEvaluacionesFactores.setVisible(false);
	        this.jInternalFrameOrderByEvaluacionesFactores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEvaluacionesFactores() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEvaluacionesFactores.setVisible(false);
	        this.jInternalFrameReporteDinamicoEvaluacionesFactores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEvaluacionesFactores() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEvaluacionesFactores.setVisible(false);
	        this.jInternalFrameImportacionEvaluacionesFactores.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEvaluacionesFactores(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEvaluacionesFactores(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEvaluacionesFactores(true);
			//this.isEsNuevoEvaluacionesFactores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEvaluacionesFactores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionesFactores(false) ;
			
			if(evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EvaluacionesFactoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionesFactores(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesFactores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEvaluacionesFactoresActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEvaluacionesFactores(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEvaluacionesFactores(true);
			//this.isEsNuevoEvaluacionesFactores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.evaluacionesfactores.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEvaluacionesFactores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEvaluacionesFactores(false) ;
			
			if(EvaluacionesFactoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionesFactores(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesFactores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoCalificacionEmpleado(List<TipoCalificacionEmpleado> tipocalificacionempleadosForeignKey)throws Exception{
		TableColumn tableColumnTipoCalificacionEmpleado=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,EvaluacionesFactoresConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO));
		TableCellEditor tableCellEditorTipoCalificacionEmpleado =tableColumnTipoCalificacionEmpleado.getCellEditor();

		TipoCalificacionEmpleadoTableCell tipocalificacionempleadoTableCellFk=(TipoCalificacionEmpleadoTableCell)tableCellEditorTipoCalificacionEmpleado;

		if(tipocalificacionempleadoTableCellFk!=null) {
			tipocalificacionempleadoTableCellFk.settipocalificacionempleadosForeignKey(tipocalificacionempleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionesFactores.getSelectedRow();

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
		TableColumn tableColumnEstructura=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,EvaluacionesFactoresConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionesFactores.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaFormatoNomiPreguntaNomi(List<FormatoNomiPreguntaNomi> formatonomipreguntanomisForeignKey)throws Exception{
		TableColumn tableColumnFormatoNomiPreguntaNomi=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI));
		TableCellEditor tableCellEditorFormatoNomiPreguntaNomi =tableColumnFormatoNomiPreguntaNomi.getCellEditor();

		FormatoNomiPreguntaNomiTableCell formatonomipreguntanomiTableCellFk=(FormatoNomiPreguntaNomiTableCell)tableCellEditorFormatoNomiPreguntaNomi;

		if(formatonomipreguntanomiTableCellFk!=null) {
			formatonomipreguntanomiTableCellFk.setformatonomipreguntanomisForeignKey(formatonomipreguntanomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionesFactores.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatonomipreguntanomiTableCellFk.setRowActual(intSelectedRow);
			//formatonomipreguntanomiTableCellFk.setformatonomipreguntanomisForeignKeyActual(formatonomipreguntanomisForeignKey);
		//}


		if(formatonomipreguntanomiTableCellFk!=null) {
			formatonomipreguntanomiTableCellFk.RecargarFormatoNomiPreguntaNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEvaluacionesFactores(false);
			
			//if(!this.isEsNuevoEvaluacionesFactores) {								
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				
			}
			
			if(this.permiteMantenimiento(this.evaluacionesfactores)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEvaluacionesFactores=true;
					this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
					this.isEsNuevoEvaluacionesFactores=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEvaluacionesFactores=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEvaluacionesFactores=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEvaluacionesFactores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionesFactores(false);
				
				this.habilitarDeshabilitarControlesEvaluacionesFactores(false);
			
												
				
				if(EvaluacionesFactoresJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEvaluacionesFactores();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEvaluacionesFactoresActionPerformed(evt,evaluacionesfactoresSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEvaluacionesFactores(this.evaluacionesfactores,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEvaluacionesFactores.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,evaluacionesfactoresSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.evaluacionesfactores.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EvaluacionesFactores.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesFactores.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				this.evaluacionesfactores.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				this.evaluacionesfactores.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.evaluacionesfactores)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EvaluacionesFactoresModel) this.jTableDatosEvaluacionesFactores.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEvaluacionesFactores=true;
				this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
				this.isEsNuevoEvaluacionesFactores=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEvaluacionesFactores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionesFactores(false);
				
				this.habilitarDeshabilitarControlesEvaluacionesFactores(false);
				
				
				
				if(EvaluacionesFactoresJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEvaluacionesFactores();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEvaluacionesFactores.getRowCount()>=1) {
				jTableDatosEvaluacionesFactores.removeRowSelectionInterval(0, jTableDatosEvaluacionesFactores.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEvaluacionesFactores(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionesFactores(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesFactores(false) ;
			
			this.isEsNuevoEvaluacionesFactores=false;
			
			if(EvaluacionesFactoresJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEvaluacionesFactores();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEvaluacionesFactores(false);
				
				//SI ES MANUAL
				if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEvaluacionesFactores();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEvaluacionesFactores--;			
			//EvaluacionesFactores evaluacionesfactoresAux= new EvaluacionesFactores();			
			//evaluacionesfactoresAux.setId(this.iIdNuevoEvaluacionesFactores);
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEvaluacionesFactores();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
			
			this.evaluacionesfactores.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.evaluacionesfactoresLogic.getEvaluacionesFactoress().add(this.evaluacionesfactoresAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.evaluacionesfactoress.add(this.evaluacionesfactoresAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
			
			this.jTableDatosEvaluacionesFactores.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesFactores(), this.getIndiceNuevoEvaluacionesFactores());
			
			int iLastRow =  this.jTableDatosEvaluacionesFactores.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEvaluacionesFactores.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEvaluacionesFactores.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesFactores(false);
			
			//SI ES MANUAL
			if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionesFactores();
			}
			
			//this.abrirFrameTreeEvaluacionesFactores();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEvaluacionesFactores.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEvaluacionesFactores.setFileImportacion(this.jInternalFrameImportacionEvaluacionesFactores.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEvaluacionesFactores.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEvaluacionesFactores.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEvaluacionesFactores.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEvaluacionesFactores.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();		

		evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EvaluacionesFactoresBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EvaluacionesFactoresBaseDesign.jrxml";
			
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
			
			this.generarReporteEvaluacionesFactoress("Todos",evaluacionesfactoressSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Factores",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FormatoNomiPreguntaNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FormatoNomiPreguntaNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FormatoNomiPreguntaNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FormatoNomiPreguntaNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorConocimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorConocimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorConocimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorConocimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorEficiencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorEficiencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorEficiencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorEficiencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorObtenido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorObtenido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorObtenido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorObtenido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_omedio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_omedio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_omedio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_omedio_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoria="codigo_dato";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					sNombreCampoCategoria="id_formato_nomi_pregunta_nomi";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					sNombreCampoCategoria="valor_conocimiento";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA:
					sNombreCampoCategoria="valor_eficiencia";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO:
					sNombreCampoCategoria="valor_obtenido";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO:
					sNombreCampoCategoria="promedio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoriaValor="codigo_dato";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					sNombreCampoCategoriaValor="id_formato_nomi_pregunta_nomi";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					sNombreCampoCategoriaValor="valor_conocimiento";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA:
					sNombreCampoCategoriaValor="valor_eficiencia";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO:
					sNombreCampoCategoriaValor="valor_obtenido";
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO:
					sNombreCampoCategoriaValor="promedio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_dato");
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato Nomi Pregunta Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato_nomi_pregunta_nomi");
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Conocimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_conocimiento");
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Eficiencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_eficiencia");
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Obtenido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_obtenido");
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Promedio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"promedio");
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
	
	public void jButtonGenerarExcelReporteDinamicoEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();		
		
		evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesfactores";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EvaluacionesFactoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EvaluacionesFactoresConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.gettipocalificacionempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VERIFICADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VERIFICADO);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getverificado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getcodigo_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getformatonomipreguntanomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getvalor_conocimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getvalor_eficiencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getvalor_obtenido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO);
					iRow++;

					for(EvaluacionesFactores evaluacionesfactores:evaluacionesfactoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesfactores.getpromedio());
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
			//	this.getFilaCabeceraExportarExcelEvaluacionesFactores(row);				
			//	iRow++;
			//}				
			
			//for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoressSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEvaluacionesFactores(evaluacionesfactoresAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Factores",JOptionPane.INFORMATION_MESSAGE);
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
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesFactores(false);
			
			//SI ES MANUAL
			if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionesFactores();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesFactores(false);
			
			//SI ES MANUAL
			if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEvaluacionesFactores();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesFactores(false);
			
			//SI ES MANUAL
			if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEvaluacionesFactores();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEvaluacionesFactores() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEvaluacionesFactores.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEvaluacionesFactores.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEvaluacionesFactores.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEvaluacionesFactores.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEvaluacionesFactores.setMinimumSize(dimensionMinimum);
		this.jTableDatosEvaluacionesFactores.setMaximumSize(dimensionMaximum);
		this.jTableDatosEvaluacionesFactores.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEvaluacionesFactores(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEvaluacionesFactores(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEvaluacionesFactores(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEvaluacionesFactores(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEvaluacionesFactores(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEvaluacionesFactores(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesFactores(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEvaluacionesFactores(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEvaluacionesFactores() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEvaluacionesFactores();
		
		this.inicializarActualizarBindingBotonesManualEvaluacionesFactores(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEvaluacionesFactores();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesFactores() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionesFactores(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionesFactores(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEvaluacionesFactores.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEvaluacionesFactores.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEvaluacionesFactores.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEvaluacionesFactores.jCheckBoxPostAccionNuevoEvaluacionesFactores.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEvaluacionesFactores.jCheckBoxPostAccionSinCerrarEvaluacionesFactores.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEvaluacionesFactores.jCheckBoxPostAccionSinMensajeEvaluacionesFactores.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEvaluacionesFactores.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEvaluacionesFactores.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEvaluacionesFactores.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
				this.jInternalFrameDetalleFormEvaluacionesFactores.jCheckBoxPostAccionNuevoEvaluacionesFactores.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEvaluacionesFactores.jCheckBoxPostAccionSinCerrarEvaluacionesFactores.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEvaluacionesFactores.jCheckBoxPostAccionSinMensajeEvaluacionesFactores.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEvaluacionesFactores.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEvaluacionesFactores.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEvaluacionesFactores.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEvaluacionesFactores!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEvaluacionesFactores.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEvaluacionesFactores.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEvaluacionesFactores.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEvaluacionesFactores.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEvaluacionesFactores!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEvaluacionesFactores.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEvaluacionesFactores.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEvaluacionesFactores(Boolean esInicializar) throws Exception {
		try	{	
			if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionesFactores(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesFactores() throws Exception {
		try	{
			if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEvaluacionesFactores();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEvaluacionesFactores() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEvaluacionesFactores() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEvaluacionesFactores.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEvaluacionesFactores.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEvaluacionesFactores.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEvaluacionesFactores.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEvaluacionesFactores.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEvaluacionesFactores.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEvaluacionesFactores.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEvaluacionesFactores.addItem(reporte);
			}
			
			
			if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEvaluacionesFactores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEvaluacionesFactores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEvaluacionesFactores.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEvaluacionesFactores.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEvaluacionesFactores.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEvaluacionesFactores.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEvaluacionesFactores.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEvaluacionesFactores.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEvaluacionesFactores.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionesFactores();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionesFactores() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEvaluacionesFactores!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEvaluacionesFactores!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEvaluacionesFactores!=null) {
				
				if(this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EvaluacionesFactoresConstantesFunciones.getTiposSeleccionarEvaluacionesFactores(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EvaluacionesFactoresConstantesFunciones.getTiposSeleccionarEvaluacionesFactores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EvaluacionesFactoresConstantesFunciones.getTiposSeleccionarEvaluacionesFactores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEvaluacionesFactores()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.getSelectedItem()!=null){this.id_tipo_calificacion_empleadoBusquedaEvaluacionesFactores=((TipoCalificacionEmpleado)this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesFactoresEvaluacionesFactores.getSelectedItem()).getId();}
		this.verificadoBusquedaEvaluacionesFactores=this.jCheckBoxverificadoBusquedaEvaluacionesFactoresEvaluacionesFactores.isSelected();
		if(this.jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.getSelectedItem()!=null){this.id_estructuraBusquedaEvaluacionesFactores=((Estructura)this.jComboBoxid_estructuraBusquedaEvaluacionesFactoresEvaluacionesFactores.getSelectedItem()).getId();}
		this.codigoBusquedaEvaluacionesFactores=this.jTextFieldcodigoBusquedaEvaluacionesFactoresEvaluacionesFactores.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEvaluacionesFactores(Boolean esInicializar) throws Exception {				
		if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEvaluacionesFactores();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEvaluacionesFactores() throws Exception {
		this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEvaluacionesFactores() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEvaluacionesFactoresOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactoresOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEvaluacionesFactores(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=evaluacionesfactoresLogic.getEvaluacionesFactoress().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=evaluacionesfactoress.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEvaluacionesFactores.setModel(new EvaluacionesFactoresModel(this.evaluacionesfactoresLogic.getEvaluacionesFactoress(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEvaluacionesFactores.setModel(new EvaluacionesFactoresModel(this.evaluacionesfactoress,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEvaluacionesFactores!=null && this.jInternalFrameOrderByEvaluacionesFactores.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEvaluacionesFactores();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO,evaluacionesfactoresConstantesFunciones.resaltarSeleccionarEvaluacionesFactores,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EvaluacionesFactoresConstantesFunciones.SCLASSWEBTITULO,evaluacionesfactoresConstantesFunciones.resaltarSeleccionarEvaluacionesFactores,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,EvaluacionesFactoresConstantesFunciones.LABEL_ID));

		if(this.evaluacionesfactoresConstantesFunciones.mostraridEvaluacionesFactores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesFactoresConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesfactoresConstantesFunciones.resaltaridEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activaridEvaluacionesFactores,iSizeTabla,this,true,"idEvaluacionesFactores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesfactoresConstantesFunciones.resaltaridEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activaridEvaluacionesFactores,this,true,"idEvaluacionesFactores","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO));

		if(this.evaluacionesfactoresConstantesFunciones.mostrarcodigo_datoEvaluacionesFactores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarcodigo_datoEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarcodigo_datoEvaluacionesFactores,iSizeTabla,this,true,"codigo_datoEvaluacionesFactores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarcodigo_datoEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarcodigo_datoEvaluacionesFactores,this,true,"codigo_datoEvaluacionesFactores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.evaluacionesfactoresConstantesFunciones.mostrarnombre_completoEvaluacionesFactores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarnombre_completoEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarnombre_completoEvaluacionesFactores,iSizeTabla,this,true,"nombre_completoEvaluacionesFactores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarnombre_completoEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarnombre_completoEvaluacionesFactores,this,true,"nombre_completoEvaluacionesFactores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI));

		if(this.evaluacionesfactoresConstantesFunciones.mostrarid_formato_nomi_pregunta_nomiEvaluacionesFactores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoNomiPreguntaNomiTableCell(this.formatonomipreguntanomisForeignKey,this.evaluacionesfactoresConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiEvaluacionesFactores,this,this.evaluacionesfactoresConstantesFunciones.activarid_formato_nomi_pregunta_nomiEvaluacionesFactores,iSizeTabla));
			tableColumn.setCellEditor(new FormatoNomiPreguntaNomiTableCell(this.formatonomipreguntanomisForeignKey,this.evaluacionesfactoresConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiEvaluacionesFactores,this,this.evaluacionesfactoresConstantesFunciones.activarid_formato_nomi_pregunta_nomiEvaluacionesFactores,true,"id_formato_nomi_pregunta_nomiEvaluacionesFactores","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO));

		if(this.evaluacionesfactoresConstantesFunciones.mostrarvalor_conocimientoEvaluacionesFactores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_conocimientoEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarvalor_conocimientoEvaluacionesFactores,iSizeTabla,this,true,"valor_conocimientoEvaluacionesFactores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_conocimientoEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarvalor_conocimientoEvaluacionesFactores,this,true,"valor_conocimientoEvaluacionesFactores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA));

		if(this.evaluacionesfactoresConstantesFunciones.mostrarvalor_eficienciaEvaluacionesFactores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_eficienciaEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarvalor_eficienciaEvaluacionesFactores,iSizeTabla,this,true,"valor_eficienciaEvaluacionesFactores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_eficienciaEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarvalor_eficienciaEvaluacionesFactores,this,true,"valor_eficienciaEvaluacionesFactores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO));

		if(this.evaluacionesfactoresConstantesFunciones.mostrarvalor_obtenidoEvaluacionesFactores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_obtenidoEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarvalor_obtenidoEvaluacionesFactores,iSizeTabla,this,true,"valor_obtenidoEvaluacionesFactores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_obtenidoEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarvalor_obtenidoEvaluacionesFactores,this,true,"valor_obtenidoEvaluacionesFactores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO));

		if(this.evaluacionesfactoresConstantesFunciones.mostrarpromedioEvaluacionesFactores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarpromedioEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarpromedioEvaluacionesFactores,iSizeTabla,this,true,"promedioEvaluacionesFactores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesfactoresConstantesFunciones.resaltarpromedioEvaluacionesFactores,this.evaluacionesfactoresConstantesFunciones.activarpromedioEvaluacionesFactores,this,true,"promedioEvaluacionesFactores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesFactoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEvaluacionesFactores.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEvaluacionesFactores.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEvaluacionesFactores.addColumn(tableColumn);
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
			
			this.jTableDatosEvaluacionesFactores.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEvaluacionesFactores.moveColumn(this.jTableDatosEvaluacionesFactores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEvaluacionesFactores.moveColumn(this.jTableDatosEvaluacionesFactores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEvaluacionesFactores.moveColumn(this.jTableDatosEvaluacionesFactores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEvaluacionesFactores.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEvaluacionesFactores.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEvaluacionesFactores,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEvaluacionesFactores.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEvaluacionesFactores.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEvaluacionesFactores.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEvaluacionesFactores.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=evaluacionesfactoresLogic.getEvaluacionesFactoress().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=evaluacionesfactoress.size()-1;
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
		//this.jTableDatosEvaluacionesFactores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEvaluacionesFactores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEvaluacionesFactores();
			
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
				
				//this.isEsNuevoEvaluacionesFactores=false;
					
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
				if(this.evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEvaluacionesFactores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEvaluacionesFactores.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.evaluacionesfactores.getsType().equals("DUPLICADO")
				   || this.evaluacionesfactores.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEvaluacionesFactores=true;
				
				} else {
					this.isEsNuevoEvaluacionesFactores=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
					if(this.evaluacionesfactores.getId()>=0 && !this.evaluacionesfactores.getIsNew()) {						
						this.isEsNuevoEvaluacionesFactores=false;
						
					} else {
						this.isEsNuevoEvaluacionesFactores=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEvaluacionesFactores(esRelaciones);						
				
				this.seleccionarEvaluacionesFactores(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.evaluacionesfactores.getId()<0) {
					this.isEsNuevoEvaluacionesFactores=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEvaluacionesFactores(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEvaluacionesFactores(evt,rowIndex);
				}	
				
				if(this.evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EvaluacionesFactores: " + this.dDif); 
					}
				}								
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEvaluacionesFactores(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.evaluacionesfactores)) {
					if(this.evaluacionesfactores.getId()>0) {
						this.evaluacionesfactores.setIsDeleted(true);
						
						this.evaluacionesfactoressEliminados.add(this.evaluacionesfactores);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.evaluacionesfactoresLogic.getEvaluacionesFactoress().remove(this.evaluacionesfactores);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactoress.remove(this.evaluacionesfactores);				
					}
					
					
					((EvaluacionesFactoresModel) this.jTableDatosEvaluacionesFactores.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionesFactores(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEvaluacionesFactores(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEvaluacionesFactores) {
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEvaluacionesFactores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEvaluacionesFactores.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEvaluacionesFactores(this.evaluacionesfactores);
				}
				
				//ARCHITECTURE
				try {
					

					//FormatoNomiPreguntaNomi
					if(!this.evaluacionesfactoresConstantesFunciones.cargarid_formato_nomi_pregunta_nomiEvaluacionesFactores || this.evaluacionesfactoresConstantesFunciones.event_dependid_formato_nomi_pregunta_nomiEvaluacionesFactores) {
						//this.cargarCombosFormatoNomiPreguntaNomisForeignKeyLista(" where id="+this.evaluacionesfactores.getid_formato_nomi_pregunta_nomi());
									//this.inicializarActualizarBindingEvaluacionesFactores(false,false);
						this.formatonomipreguntanomisForeignKey=new ArrayList<FormatoNomiPreguntaNomi>();

						if(evaluacionesfactores.getFormatoNomiPreguntaNomi()!=null) {
							this.formatonomipreguntanomisForeignKey.add(evaluacionesfactores.getFormatoNomiPreguntaNomi());
						}

						this.addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi();
						this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey("Todos");
					}
					this.setActualFormatoNomiPreguntaNomiForeignKey(this.evaluacionesfactores.getid_formato_nomi_pregunta_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEvaluacionesFactores("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEvaluacionesFactores(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionesFactores() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEvaluacionesFactores(evaluacionesfactores,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEvaluacionesFactores(evaluacionesfactores);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEvaluacionesFactores(evaluacionesfactores,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesFactores(evaluacionesfactores);
	}
	
	public void setVariablesObjetoActualToFormularioEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelidEvaluacionesFactores.setText(evaluacionesfactores.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigo_datoEvaluacionesFactores.setText(evaluacionesfactores.getcodigo_dato());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextAreanombre_completoEvaluacionesFactores.setText(evaluacionesfactores.getnombre_completo());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_conocimientoEvaluacionesFactores.setText(evaluacionesfactores.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_eficienciaEvaluacionesFactores.setText(evaluacionesfactores.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_obtenidoEvaluacionesFactores.setText(evaluacionesfactores.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldpromedioEvaluacionesFactores.setText(evaluacionesfactores.getpromedio().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EvaluacionesFactores evaluacionesfactoresLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,evaluacionesfactoresLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EvaluacionesFactores evaluacionesfactoresLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				evaluacionesfactoresLocal=this.evaluacionesfactores;
			} else {
				evaluacionesfactoresLocal=this.evaluacionesfactoresAnterior;
			}
		}
		
		if(this.permiteMantenimiento(evaluacionesfactoresLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEvaluacionesFactores(evaluacionesfactoresLocal,true);
					
					if(evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(evaluacionesfactoresLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(evaluacionesfactoresLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEvaluacionesFactores(evaluacionesfactores,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(evaluacionesfactores);
	}
	
	public void setVariablesFormularioToObjetoActualEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEvaluacionesFactores(evaluacionesfactores,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelidEvaluacionesFactores.getText()==null || this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelidEvaluacionesFactores.getText()=="" || this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelidEvaluacionesFactores.getText()=="Id") {
				this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelidEvaluacionesFactores.setText("0");
			}

			if(conColumnasBase) {evaluacionesfactores.setId(Long.parseLong(this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelidEvaluacionesFactores.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesFactoresConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelIdEvaluacionesFactores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesfactores.setcodigo_dato(this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigo_datoEvaluacionesFactores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelcodigo_datoEvaluacionesFactores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesfactores.setnombre_completo(this.jInternalFrameDetalleFormEvaluacionesFactores.jTextAreanombre_completoEvaluacionesFactores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelnombre_completoEvaluacionesFactores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesfactores.setvalor_conocimiento(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_conocimientoEvaluacionesFactores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelvalor_conocimientoEvaluacionesFactores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesfactores.setvalor_eficiencia(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_eficienciaEvaluacionesFactores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelvalor_eficienciaEvaluacionesFactores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesfactores.setvalor_obtenido(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_obtenidoEvaluacionesFactores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelvalor_obtenidoEvaluacionesFactores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesfactores.setpromedio(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldpromedioEvaluacionesFactores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelpromedioEvaluacionesFactores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEvaluacionesFactores(EvaluacionesFactores evaluacionesfactoresBean,EvaluacionesFactores evaluacionesfactores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && evaluacionesfactoresBean.getid_formato_nomi_pregunta_nomi()!=null && !evaluacionesfactoresBean.getid_formato_nomi_pregunta_nomi().equals(-1L))) {evaluacionesfactores.setid_formato_nomi_pregunta_nomi(evaluacionesfactoresBean.getid_formato_nomi_pregunta_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEvaluacionesFactores(EvaluacionesFactores evaluacionesfactoresOrigen,EvaluacionesFactores evaluacionesfactores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && evaluacionesfactoresOrigen.getId()!=null && !evaluacionesfactoresOrigen.getId().equals(0L))) {evaluacionesfactores.setId(evaluacionesfactoresOrigen.getId());}}
			if(conDefault || (!conDefault && evaluacionesfactoresOrigen.getverificado()!=null && !evaluacionesfactoresOrigen.getverificado().equals(false))) {evaluacionesfactores.setverificado(evaluacionesfactoresOrigen.getverificado());}
			if(conDefault || (!conDefault && evaluacionesfactoresOrigen.getcodigo()!=null && !evaluacionesfactoresOrigen.getcodigo().equals(""))) {evaluacionesfactores.setcodigo(evaluacionesfactoresOrigen.getcodigo());}
			if(conDefault || (!conDefault && evaluacionesfactoresOrigen.getcodigo_dato()!=null && !evaluacionesfactoresOrigen.getcodigo_dato().equals(""))) {evaluacionesfactores.setcodigo_dato(evaluacionesfactoresOrigen.getcodigo_dato());}
			if(conDefault || (!conDefault && evaluacionesfactoresOrigen.getnombre_completo()!=null && !evaluacionesfactoresOrigen.getnombre_completo().equals(""))) {evaluacionesfactores.setnombre_completo(evaluacionesfactoresOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && evaluacionesfactoresOrigen.getid_formato_nomi_pregunta_nomi()!=null && !evaluacionesfactoresOrigen.getid_formato_nomi_pregunta_nomi().equals(-1L))) {evaluacionesfactores.setid_formato_nomi_pregunta_nomi(evaluacionesfactoresOrigen.getid_formato_nomi_pregunta_nomi());}
			if(conDefault || (!conDefault && evaluacionesfactoresOrigen.getvalor_conocimiento()!=null && !evaluacionesfactoresOrigen.getvalor_conocimiento().equals(0.0))) {evaluacionesfactores.setvalor_conocimiento(evaluacionesfactoresOrigen.getvalor_conocimiento());}
			if(conDefault || (!conDefault && evaluacionesfactoresOrigen.getvalor_eficiencia()!=null && !evaluacionesfactoresOrigen.getvalor_eficiencia().equals(0.0))) {evaluacionesfactores.setvalor_eficiencia(evaluacionesfactoresOrigen.getvalor_eficiencia());}
			if(conDefault || (!conDefault && evaluacionesfactoresOrigen.getvalor_obtenido()!=null && !evaluacionesfactoresOrigen.getvalor_obtenido().equals(0.0))) {evaluacionesfactores.setvalor_obtenido(evaluacionesfactoresOrigen.getvalor_obtenido());}
			if(conDefault || (!conDefault && evaluacionesfactoresOrigen.getpromedio()!=null && !evaluacionesfactoresOrigen.getpromedio().equals(0.0))) {evaluacionesfactores.setpromedio(evaluacionesfactoresOrigen.getpromedio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelidEvaluacionesFactores.setText(evaluacionesfactores.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigo_datoEvaluacionesFactores.setText(evaluacionesfactores.getcodigo_dato());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextAreanombre_completoEvaluacionesFactores.setText(evaluacionesfactores.getnombre_completo());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_conocimientoEvaluacionesFactores.setText(evaluacionesfactores.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_eficienciaEvaluacionesFactores.setText(evaluacionesfactores.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_obtenidoEvaluacionesFactores.setText(evaluacionesfactores.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldpromedioEvaluacionesFactores.setText(evaluacionesfactores.getpromedio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEvaluacionesFactores(EvaluacionesFactoresBean evaluacionesfactoresBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelidEvaluacionesFactores.setText(evaluacionesfactoresBean.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigo_datoEvaluacionesFactores.setText(evaluacionesfactoresBean.getcodigo_dato());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextAreanombre_completoEvaluacionesFactores.setText(evaluacionesfactoresBean.getnombre_completo());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_conocimientoEvaluacionesFactores.setText(evaluacionesfactoresBean.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_eficienciaEvaluacionesFactores.setText(evaluacionesfactoresBean.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_obtenidoEvaluacionesFactores.setText(evaluacionesfactoresBean.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldpromedioEvaluacionesFactores.setText(evaluacionesfactoresBean.getpromedio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEvaluacionesFactores(EvaluacionesFactoresParameterReturnGeneral evaluacionesfactoresReturnGeneral,EvaluacionesFactoresBean evaluacionesfactoresBean,Boolean conDefault) throws Exception { 
		try {
			EvaluacionesFactores evaluacionesfactoresLocal=new EvaluacionesFactores();
			
			evaluacionesfactoresLocal=evaluacionesfactoresReturnGeneral.getEvaluacionesFactores();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && evaluacionesfactoresLocal.getId()!=null && !evaluacionesfactoresLocal.getId().equals(0L))) {evaluacionesfactoresBean.setId(evaluacionesfactoresLocal.getId());}}
			if(conDefault || (!conDefault && evaluacionesfactoresLocal.getcodigo_dato()!=null && !evaluacionesfactoresLocal.getcodigo_dato().equals(""))) {evaluacionesfactoresBean.setcodigo_dato(evaluacionesfactoresLocal.getcodigo_dato());}
			if(conDefault || (!conDefault && evaluacionesfactoresLocal.getnombre_completo()!=null && !evaluacionesfactoresLocal.getnombre_completo().equals(""))) {evaluacionesfactoresBean.setnombre_completo(evaluacionesfactoresLocal.getnombre_completo());}
			if(conDefault || (!conDefault && evaluacionesfactoresLocal.getid_formato_nomi_pregunta_nomi()!=null && !evaluacionesfactoresLocal.getid_formato_nomi_pregunta_nomi().equals(-1L))) {evaluacionesfactoresBean.setid_formato_nomi_pregunta_nomi(evaluacionesfactoresLocal.getid_formato_nomi_pregunta_nomi());}
			if(conDefault || (!conDefault && evaluacionesfactoresLocal.getvalor_conocimiento()!=null && !evaluacionesfactoresLocal.getvalor_conocimiento().equals(0.0))) {evaluacionesfactoresBean.setvalor_conocimiento(evaluacionesfactoresLocal.getvalor_conocimiento());}
			if(conDefault || (!conDefault && evaluacionesfactoresLocal.getvalor_eficiencia()!=null && !evaluacionesfactoresLocal.getvalor_eficiencia().equals(0.0))) {evaluacionesfactoresBean.setvalor_eficiencia(evaluacionesfactoresLocal.getvalor_eficiencia());}
			if(conDefault || (!conDefault && evaluacionesfactoresLocal.getvalor_obtenido()!=null && !evaluacionesfactoresLocal.getvalor_obtenido().equals(0.0))) {evaluacionesfactoresBean.setvalor_obtenido(evaluacionesfactoresLocal.getvalor_obtenido());}
			if(conDefault || (!conDefault && evaluacionesfactoresLocal.getpromedio()!=null && !evaluacionesfactoresLocal.getpromedio().equals(0.0))) {evaluacionesfactoresBean.setpromedio(evaluacionesfactoresLocal.getpromedio());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEvaluacionesFactoresGenerico(Long idEvaluacionesFactoresSeleccionado,JComboBox jComboBoxEvaluacionesFactores,List<EvaluacionesFactores> evaluacionesfactoressLocal)throws Exception {
		try {
			EvaluacionesFactores  evaluacionesfactoresTemp=null;

			for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoressLocal) {
				if(evaluacionesfactoresAux.getId()!=null && evaluacionesfactoresAux.getId().equals(idEvaluacionesFactoresSeleccionado)) {
					evaluacionesfactoresTemp=evaluacionesfactoresAux;
					break;
				}
			}

			jComboBoxEvaluacionesFactores.setSelectedItem(evaluacionesfactoresTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEvaluacionesFactoresGenerico(JComboBox jComboBoxEvaluacionesFactores,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEvaluacionesFactores.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEvaluacionesFactores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEvaluacionesFactores.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEvaluacionesFactores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEvaluacionesFactores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEvaluacionesFactores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionesfactores=(EvaluacionesFactores) evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			evaluacionesfactores =(EvaluacionesFactores) evaluacionesfactoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoCalificacionEmpleado")) {
			//sDescripcion=this.getActualTipoCalificacionEmpleadoForeignKeyDescripcion((Long)value);
			if(!evaluacionesfactores.getIsNew() && !evaluacionesfactores.getIsChanged() && !evaluacionesfactores.getIsDeleted()) {
				sDescripcion=evaluacionesfactores.gettipocalificacionempleado_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCalificacionEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesfactores.gettipocalificacionempleado_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!evaluacionesfactores.getIsNew() && !evaluacionesfactores.getIsChanged() && !evaluacionesfactores.getIsDeleted()) {
				sDescripcion=evaluacionesfactores.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesfactores.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!evaluacionesfactores.getIsNew() && !evaluacionesfactores.getIsChanged() && !evaluacionesfactores.getIsDeleted()) {
				sDescripcion=evaluacionesfactores.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesfactores.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!evaluacionesfactores.getIsNew() && !evaluacionesfactores.getIsChanged() && !evaluacionesfactores.getIsDeleted()) {
				sDescripcion=evaluacionesfactores.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesfactores.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("FormatoNomiPreguntaNomi")) {
			//sDescripcion=this.getActualFormatoNomiPreguntaNomiForeignKeyDescripcion((Long)value);
			if(!evaluacionesfactores.getIsNew() && !evaluacionesfactores.getIsChanged() && !evaluacionesfactores.getIsDeleted()) {
				sDescripcion=evaluacionesfactores.getformatonomipreguntanomi_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoNomiPreguntaNomiForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesfactores.getformatonomipreguntanomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EvaluacionesFactores evaluacionesfactoresRow=new EvaluacionesFactores();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionesfactoresRow=(EvaluacionesFactores) evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			evaluacionesfactoresRow=(EvaluacionesFactores) evaluacionesfactoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEvaluacionesFactores(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEvaluacionesFactores.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesFactores && this.isPermisoNuevoEvaluacionesFactores));			
			this.jButtonDuplicarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionesFactores && this.isPermisoDuplicarEvaluacionesFactores));			
			this.jButtonCopiarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaCopiarEvaluacionesFactores && this.isPermisoCopiarEvaluacionesFactores));
			this.jButtonVerFormEvaluacionesFactores.setVisible((this.isVisibilidadCeldaVerFormEvaluacionesFactores && this.isPermisoVerFormEvaluacionesFactores));
			
			this.jButtonAbrirOrderByEvaluacionesFactores.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesFactores && this.isPermisoOrdenEvaluacionesFactores));			
			
			this.jButtonNuevoRelacionesEvaluacionesFactores.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores && this.isPermisoNuevoEvaluacionesFactores));			
			this.jButtonNuevoGuardarCambiosEvaluacionesFactores.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesFactores && this.isPermisoNuevoEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores));
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonModificarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaModificarEvaluacionesFactores && this.isPermisoActualizarEvaluacionesFactores));	
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonActualizarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaActualizarEvaluacionesFactores && this.isPermisoActualizarEvaluacionesFactores));	
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonEliminarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaEliminarEvaluacionesFactores && this.isPermisoEliminarEvaluacionesFactores));
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonCancelarEvaluacionesFactores.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesFactores);							
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosEvaluacionesFactores.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores));			
			
			}
						
			this.jButtonGuardarCambiosTablaEvaluacionesFactores.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesFactores && this.isPermisoNuevoEvaluacionesFactores));						
			this.jButtonDuplicarToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionesFactores && this.isPermisoDuplicarEvaluacionesFactores));						
			this.jButtonCopiarToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaCopiarEvaluacionesFactores && this.isPermisoCopiarEvaluacionesFactores));			
			this.jButtonVerFormToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaVerFormEvaluacionesFactores && this.isPermisoVerFormEvaluacionesFactores));			
			this.jButtonAbrirOrderByToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesFactores && this.isPermisoOrdenEvaluacionesFactores));
			this.jButtonNuevoRelacionesToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores && this.isPermisoNuevoEvaluacionesFactores));			
			this.jButtonNuevoGuardarCambiosToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesFactores && this.isPermisoNuevoEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores));			
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonModificarToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaModificarEvaluacionesFactores && this.isPermisoActualizarEvaluacionesFactores));	
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonActualizarToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaActualizarEvaluacionesFactores  && this.isPermisoActualizarEvaluacionesFactores));	
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonEliminarToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaEliminarEvaluacionesFactores && this.isPermisoEliminarEvaluacionesFactores));
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonCancelarToolBarEvaluacionesFactores.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesFactores);				
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEvaluacionesFactores.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesFactores && this.isPermisoNuevoEvaluacionesFactores));			
			this.jMenuItemDuplicarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionesFactores && this.isPermisoDuplicarEvaluacionesFactores));			
			this.jMenuItemCopiarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaCopiarEvaluacionesFactores && this.isPermisoCopiarEvaluacionesFactores));			
			this.jMenuItemVerFormEvaluacionesFactores.setVisible((this.isVisibilidadCeldaVerFormEvaluacionesFactores && this.isPermisoVerFormEvaluacionesFactores));			
			this.jMenuItemAbrirOrderByEvaluacionesFactores.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesFactores && this.isPermisoOrdenEvaluacionesFactores));			
			//this.jMenuItemMostrarOcultarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesFactores && this.isPermisoOrdenEvaluacionesFactores));
			this.jMenuItemDetalleAbrirOrderByEvaluacionesFactores.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesFactores && this.isPermisoOrdenEvaluacionesFactores));			
			//this.jMenuItemDetalleMostrarOcultarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesFactores && this.isPermisoOrdenEvaluacionesFactores));			
			this.jMenuItemNuevoRelacionesEvaluacionesFactores.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores && this.isPermisoNuevoEvaluacionesFactores));			
			this.jMenuItemNuevoGuardarCambiosEvaluacionesFactores.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesFactores && this.isPermisoNuevoEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores));									
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemModificarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaModificarEvaluacionesFactores && this.isPermisoActualizarEvaluacionesFactores));	
			this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemActualizarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaActualizarEvaluacionesFactores && this.isPermisoActualizarEvaluacionesFactores));	
			this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemEliminarEvaluacionesFactores.setVisible((this.isVisibilidadCeldaEliminarEvaluacionesFactores && this.isPermisoEliminarEvaluacionesFactores));
			this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemCancelarEvaluacionesFactores.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesFactores);				
			}
			
			this.jMenuItemGuardarCambiosEvaluacionesFactores.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores));						
			this.jMenuItemGuardarCambiosTablaEvaluacionesFactores.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=this.jButtonNuevoEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaDuplicarEvaluacionesFactores=this.jButtonDuplicarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaCopiarEvaluacionesFactores=this.jButtonCopiarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaVerFormEvaluacionesFactores=this.jButtonVerFormEvaluacionesFactores.isVisible();
			
			this.isVisibilidadCeldaOrdenEvaluacionesFactores=this.jButtonAbrirOrderByEvaluacionesFactores.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=this.jButtonNuevoRelacionesEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaModificarEvaluacionesFactores=this.jButtonModificarEvaluacionesFactores.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonActualizarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonEliminarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonCancelarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaGuardarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosEvaluacionesFactores.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=this.jButtonGuardarCambiosTablaEvaluacionesFactores.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=this.jButtonNuevoToolBarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=this.jButtonNuevoRelacionesToolBarEvaluacionesFactores.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			this.isVisibilidadCeldaModificarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonModificarToolBarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonActualizarToolBarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonEliminarToolBarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonCancelarToolBarEvaluacionesFactores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEvaluacionesFactores=this.jButtonGuardarCambiosToolBarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=this.jButtonGuardarCambiosTablaToolBarEvaluacionesFactores.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=this.jMenuItemNuevoEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=this.jMenuItemNuevoRelacionesEvaluacionesFactores.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			this.isVisibilidadCeldaModificarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemModificarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemActualizarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemEliminarEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionesFactores=this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemCancelarEvaluacionesFactores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEvaluacionesFactores=this.jMenuItemGuardarCambiosEvaluacionesFactores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=this.jMenuItemGuardarCambiosTablaEvaluacionesFactores.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEvaluacionesFactores(Boolean esInicializar) {
		if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {			
			if(this.evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
				//if(this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEvaluacionesFactores();
			}
			
			this.inicializarActualizarBindingBotonesManualEvaluacionesFactores(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEvaluacionesFactores() {
		this.jButtonNuevoEvaluacionesFactores.setVisible(this.isPermisoNuevoEvaluacionesFactores);			
		this.jButtonDuplicarEvaluacionesFactores.setVisible(this.isPermisoDuplicarEvaluacionesFactores);			
		this.jButtonCopiarEvaluacionesFactores.setVisible(this.isPermisoCopiarEvaluacionesFactores);			
		this.jButtonVerFormEvaluacionesFactores.setVisible(this.isPermisoVerFormEvaluacionesFactores);			
		
		this.jButtonAbrirOrderByEvaluacionesFactores.setVisible(this.isPermisoOrdenEvaluacionesFactores);					
		
		this.jButtonNuevoRelacionesEvaluacionesFactores.setVisible(this.isPermisoNuevoEvaluacionesFactores);			
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonModificarEvaluacionesFactores.setVisible(this.isPermisoActualizarEvaluacionesFactores);	
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonActualizarEvaluacionesFactores.setVisible(this.isPermisoActualizarEvaluacionesFactores);	
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonEliminarEvaluacionesFactores.setVisible(this.isPermisoEliminarEvaluacionesFactores);
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonCancelarEvaluacionesFactores.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesFactores);						
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosEvaluacionesFactores.setVisible(this.isPermisoGuardarCambiosEvaluacionesFactores);							
		}
		
		this.jButtonGuardarCambiosTablaEvaluacionesFactores.setVisible(this.isPermisoActualizarEvaluacionesFactores);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEvaluacionesFactores() {
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonModificarEvaluacionesFactores.setVisible(this.isPermisoActualizarEvaluacionesFactores);	
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonActualizarEvaluacionesFactores.setVisible(this.isPermisoActualizarEvaluacionesFactores);	
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonEliminarEvaluacionesFactores.setVisible(this.isPermisoEliminarEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonCancelarEvaluacionesFactores.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesFactores);							
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosEvaluacionesFactores.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesFactores && this.isPermisoGuardarCambiosEvaluacionesFactores));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEvaluacionesFactores() {
		if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEvaluacionesFactores();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEvaluacionesFactores() {
	}
	
	public void jTableDatosEvaluacionesFactoresListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEvaluacionesFactores(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.evaluacionesfactores.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocalificacionempleado=true;

			idTienePermisotipocalificacionempleado=this.tienePermisosUsuarioEnPaginaWebEvaluacionesFactores(TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocalificacionempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesFactores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesFactores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);

				this.tipocalificacionempleadoBeanSwingJInternalFrame=new TipoCalificacionEmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocalificacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocalificacionempleadoBeanSwingJInternalFrame.getTipoCalificacionEmpleadoLogic().setConnexion(this.evaluacionesfactoresLogic.getConnexion());

				if(this.evaluacionesfactores.getid_tipo_calificacion_empleado()!=null) {
					this.tipocalificacionempleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocalificacionempleadoBeanSwingJInternalFrame.setIdActual(this.evaluacionesfactores.getid_tipo_calificacion_empleado());
					this.tipocalificacionempleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocalificacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocalificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCalificacionEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.tipocalificacionempleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesFactores=(TitledBorder)this.jScrollPanelDatosEvaluacionesFactores.getBorder();
				TitledBorder titledBordertipocalificacionempleado=(TitledBorder)this.tipocalificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosTipoCalificacionEmpleado.getBorder();

				titledBordertipocalificacionempleado.setTitle(titledBorderEvaluacionesFactores.getTitle() + " -> Tipo Calificacion Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getid_tipo_calificacion_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_calificacion_empleado = "+this.evaluacionesfactores.getid_tipo_calificacion_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonverificadoEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getverificado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where verificado = "+this.evaluacionesfactores.getverificado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraEvaluacionesFactoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebEvaluacionesFactores(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesFactores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesFactores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.evaluacionesfactoresLogic.getConnexion());

				if(this.evaluacionesfactores.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.evaluacionesfactores.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesFactores=(TitledBorder)this.jScrollPanelDatosEvaluacionesFactores.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderEvaluacionesFactores.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.evaluacionesfactores.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.evaluacionesfactores.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEvaluacionesFactoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEvaluacionesFactores(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesFactores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesFactores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.evaluacionesfactoresLogic.getConnexion());

				if(this.evaluacionesfactores.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.evaluacionesfactores.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesFactores=(TitledBorder)this.jScrollPanelDatosEvaluacionesFactores.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEvaluacionesFactores.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.evaluacionesfactores.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalEvaluacionesFactoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebEvaluacionesFactores(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesFactores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesFactores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.evaluacionesfactoresLogic.getConnexion());

				if(this.evaluacionesfactores.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.evaluacionesfactores.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesFactores=(TitledBorder)this.jScrollPanelDatosEvaluacionesFactores.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderEvaluacionesFactores.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.evaluacionesfactores.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_datoEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getcodigo_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_dato like '%"+this.evaluacionesfactores.getcodigo_dato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.evaluacionesfactores.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformatonomipreguntanomi=true;

			idTienePermisoformatonomipreguntanomi=this.tienePermisosUsuarioEnPaginaWebEvaluacionesFactores(FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoformatonomipreguntanomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesFactores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesFactores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);

				this.formatonomipreguntanomiBeanSwingJInternalFrame=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatonomipreguntanomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatonomipreguntanomiBeanSwingJInternalFrame.getFormatoNomiPreguntaNomiLogic().setConnexion(this.evaluacionesfactoresLogic.getConnexion());

				if(this.evaluacionesfactores.getid_formato_nomi_pregunta_nomi()!=null) {
					this.formatonomipreguntanomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatonomipreguntanomiBeanSwingJInternalFrame.setIdActual(this.evaluacionesfactores.getid_formato_nomi_pregunta_nomi());
					this.formatonomipreguntanomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatonomipreguntanomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi();
				}

				JInternalFrameBase jinternalFrame =this.formatonomipreguntanomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesFactores=(TitledBorder)this.jScrollPanelDatosEvaluacionesFactores.getBorder();
				TitledBorder titledBorderformatonomipreguntanomi=(TitledBorder)this.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();

				titledBorderformatonomipreguntanomi.setTitle(titledBorderEvaluacionesFactores.getTitle() + " -> Formato Nomi Pregunta Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getid_formato_nomi_pregunta_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato_nomi_pregunta_nomi = "+this.evaluacionesfactores.getid_formato_nomi_pregunta_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_conocimientoEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getvalor_conocimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_conocimiento = "+this.evaluacionesfactores.getvalor_conocimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_eficienciaEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getvalor_eficiencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_eficiencia = "+this.evaluacionesfactores.getvalor_eficiencia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_obtenidoEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getvalor_obtenido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_obtenido = "+this.evaluacionesfactores.getvalor_obtenido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpromedioEvaluacionesFactoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.getevaluacionesfactores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesfactores==null) {
						this.evaluacionesfactores = new EvaluacionesFactores();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);
				}

				if(this.evaluacionesfactores.getpromedio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where promedio = "+this.evaluacionesfactores.getpromedio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesFactores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaEvaluacionesFactoresEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);

			this.getEvaluacionesFactoressBusquedaEvaluacionesFactores();

			this.inicializarActualizarBindingEvaluacionesFactores(false);

			//if(EvaluacionesFactoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);

			this.getEvaluacionesFactoressFK_IdEmpresa();

			this.inicializarActualizarBindingEvaluacionesFactores(false);

			//if(EvaluacionesFactoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);

			this.getEvaluacionesFactoressFK_IdEstructura();

			this.inicializarActualizarBindingEvaluacionesFactores(false);

			//if(EvaluacionesFactoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoNomiPreguntaNomiEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);

			this.getEvaluacionesFactoressFK_IdFormatoNomiPreguntaNomi();

			this.inicializarActualizarBindingEvaluacionesFactores(false);

			//if(EvaluacionesFactoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);

			this.getEvaluacionesFactoressFK_IdSucursal();

			this.inicializarActualizarBindingEvaluacionesFactores(false);

			//if(EvaluacionesFactoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCalificacionEmpleadoEvaluacionesFactoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);

			this.getEvaluacionesFactoressFK_IdTipoCalificacionEmpleado();

			this.inicializarActualizarBindingEvaluacionesFactores(false);

			//if(EvaluacionesFactoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesfactoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEvaluacionesFactores() {
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.setVisible(false);	    			
			this.jInternalFrameDetalleFormEvaluacionesFactores.dispose();
			this.jInternalFrameDetalleFormEvaluacionesFactores=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEvaluacionesFactores!=null) {
			this.jInternalFrameReporteDinamicoEvaluacionesFactores.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEvaluacionesFactores.dispose();
			this.jInternalFrameReporteDinamicoEvaluacionesFactores=null;
		}
		
		if(this.jInternalFrameImportacionEvaluacionesFactores!=null) {
			this.jInternalFrameImportacionEvaluacionesFactores.setVisible(false);	    			
			this.jInternalFrameImportacionEvaluacionesFactores.dispose();
			this.jInternalFrameImportacionEvaluacionesFactores=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEvaluacionesFactores();
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
			
			if(sTipo.equals("NuevoEvaluacionesFactores")) {
				jButtonNuevoEvaluacionesFactoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEvaluacionesFactores")) {
				jButtonDuplicarEvaluacionesFactoresActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEvaluacionesFactores")) {
				jButtonCopiarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormEvaluacionesFactores")) {
				jButtonVerFormEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEvaluacionesFactores")) {
				jButtonNuevoEvaluacionesFactoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEvaluacionesFactores")) {
				jButtonDuplicarEvaluacionesFactoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEvaluacionesFactores")) {
				jButtonNuevoEvaluacionesFactoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEvaluacionesFactores")) {
				jButtonDuplicarEvaluacionesFactoresActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEvaluacionesFactores")) {
				jButtonNuevoEvaluacionesFactoresActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEvaluacionesFactores")) {
				jButtonNuevoEvaluacionesFactoresActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEvaluacionesFactores")) {
				jButtonNuevoEvaluacionesFactoresActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEvaluacionesFactores")) {
				jButtonModificarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEvaluacionesFactores")) {
				jButtonModificarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEvaluacionesFactores")) {
				jButtonModificarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEvaluacionesFactores")) {
				jButtonActualizarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEvaluacionesFactores")) {
				jButtonActualizarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEvaluacionesFactores")) {
				jButtonActualizarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarEvaluacionesFactores")) {
				jButtonEliminarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEvaluacionesFactores")) {
				jButtonEliminarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEvaluacionesFactores")) {
				jButtonEliminarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarEvaluacionesFactores")) {
				jButtonCancelarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEvaluacionesFactores")) {
				jButtonCancelarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEvaluacionesFactores")) {
				jButtonCancelarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarEvaluacionesFactores")) {
				jButtonCerrarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEvaluacionesFactores")) {
				jButtonCerrarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEvaluacionesFactores")) {
				jButtonCerrarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEvaluacionesFactores")) {
				jButtonMostrarOcultarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEvaluacionesFactores")) {
				jButtonCancelarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEvaluacionesFactores")) {
				jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEvaluacionesFactores")) {
				jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEvaluacionesFactores")) {
				jButtonCopiarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEvaluacionesFactores")) {
				jButtonVerFormEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEvaluacionesFactores")) {
				jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEvaluacionesFactores")) {
				jButtonCopiarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEvaluacionesFactores")) {
				jButtonVerFormEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEvaluacionesFactores")) {
				jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEvaluacionesFactores")) {
				jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEvaluacionesFactores")) {
				jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEvaluacionesFactores")) {
				jButtonRecargarInformacionEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEvaluacionesFactores")) {
				jButtonRecargarInformacionEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEvaluacionesFactores")) {
				jButtonRecargarInformacionEvaluacionesFactoresActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEvaluacionesFactores")) {
				jButtonAnterioresEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEvaluacionesFactores")) {
				jButtonAnterioresEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEvaluacionesFactores")) {
				jButtonAnterioresEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEvaluacionesFactores")) {
				jButtonSiguientesEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEvaluacionesFactores")) {
				jButtonSiguientesEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEvaluacionesFactores")) {
				jButtonSiguientesEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEvaluacionesFactores") || sTipo.equals("MenuItemDetalleAbrirOrderByEvaluacionesFactores")) {
				jButtonAbrirOrderByEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEvaluacionesFactores") || sTipo.equals("MenuItemDetalleMostrarOcultarEvaluacionesFactores")) {
				jButtonMostrarOcultarEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEvaluacionesFactores")) {
				jButtonNuevoGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEvaluacionesFactores")) {
				jButtonNuevoGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEvaluacionesFactores")) {
				jButtonNuevoGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEvaluacionesFactores")) {
				jButtonCerrarReporteDinamicoEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEvaluacionesFactores")) {
				jButtonGenerarReporteDinamicoEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEvaluacionesFactores")) {
				
				jButtonGenerarExcelReporteDinamicoEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEvaluacionesFactores")) {
				jButtonCerrarImportacionEvaluacionesFactoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEvaluacionesFactores")) {
				
				jButtonGenerarImportacionEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEvaluacionesFactores")) {
				
				jButtonAbrirImportacionEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEvaluacionesFactores")) {
				jComboBoxTiposAccionesEvaluacionesFactoresActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEvaluacionesFactores")) {
				jComboBoxTiposRelacionesEvaluacionesFactoresActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEvaluacionesFactores")) {
				jComboBoxTiposAccionesEvaluacionesFactoresActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEvaluacionesFactores")) {
				
				jComboBoxTiposSeleccionarEvaluacionesFactoresActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEvaluacionesFactores")) {
				jTextFieldValorCampoGeneralEvaluacionesFactoresActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEvaluacionesFactores")) {
				jButtonAbrirOrderByEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEvaluacionesFactores")) {
				jButtonAbrirOrderByEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEvaluacionesFactores")) {
				jButtonCerrarOrderByEvaluacionesFactoresActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEvaluacionesFactoresBusqueda")) {
				this.jButtonidEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesFactoresUpdate")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("verificadoEvaluacionesFactoresBusqueda")) {
				this.jButtonverificadoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesFactoresUpdate")) {
				this.jButtonid_estructuraEvaluacionesFactoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesFactoresBusqueda")) {
				this.jButtonid_estructuraEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEvaluacionesFactoresBusqueda")) {
				this.jButtoncodigoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesFactoresUpdate")) {
				this.jButtonid_empresaEvaluacionesFactoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesFactoresBusqueda")) {
				this.jButtonid_empresaEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesFactoresUpdate")) {
				this.jButtonid_sucursalEvaluacionesFactoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesFactoresBusqueda")) {
				this.jButtonid_sucursalEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoEvaluacionesFactoresBusqueda")) {
				this.jButtoncodigo_datoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoEvaluacionesFactoresBusqueda")) {
				this.jButtonnombre_completoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate")) {
				this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda")) {
				this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_conocimientoEvaluacionesFactoresBusqueda")) {
				this.jButtonvalor_conocimientoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_eficienciaEvaluacionesFactoresBusqueda")) {
				this.jButtonvalor_eficienciaEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_obtenidoEvaluacionesFactoresBusqueda")) {
				this.jButtonvalor_obtenidoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("promedioEvaluacionesFactoresBusqueda")) {
				this.jButtonpromedioEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaEvaluacionesFactoresEvaluacionesFactores")) {
				this.jButtonBusquedaEvaluacionesFactoresEvaluacionesFactoresActionPerformed(evt);
			}
			
			;
			
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEvaluacionesFactores();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesFactoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				


				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesFactores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesFactores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EvaluacionesFactores evaluacionesfactoresLocal=null;
			
			if(!this.getEsControlTabla()) {
				evaluacionesfactoresLocal=this.evaluacionesfactores;
			} else {
				evaluacionesfactoresLocal=this.evaluacionesfactoresAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
							
				
				


				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesFactores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesFactores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesFactoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
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
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
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
			
			


			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesFactoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
								
						
				


				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesFactores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesFactores.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
								
				
				


				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesFactores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesFactores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesFactoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesFactoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesFactoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
							
				
				


				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesFactores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesFactores.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesFactoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
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
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
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
			
			


			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesFactoresActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
								
				
				


				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesFactores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesFactores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesFactoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesFactoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesFactoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEvaluacionesFactores")) {
					jCheckBoxSeleccionarTodosEvaluacionesFactoresItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEvaluacionesFactores")) {
					jCheckBoxSeleccionadosEvaluacionesFactoresItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEvaluacionesFactores")) {
					
				}
				
				


				
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesFactores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesFactores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
												
				
				


				
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesFactores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesFactores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesFactoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesFactoresActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
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
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
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
			
			


			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesFactoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesFactores.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesFactores.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesfactores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesfactores);
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
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
				
				


				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesFactores.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesFactores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesFactoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesfactoresAnterior =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEvaluacionesFactores")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEvaluacionesFactoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEvaluacionesFactores.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.evaluacionesfactores =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.evaluacionesfactores);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEvaluacionesFactores")) {
				
				}
				
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEvaluacionesFactores")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEvaluacionesFactores.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEvaluacionesFactores")) {
			
			}
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEvaluacionesFactores();
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
			if(sTipo.equals("NuevoEvaluacionesFactores")) {
				jButtonNuevoEvaluacionesFactoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEvaluacionesFactores")) {
				jButtonDuplicarEvaluacionesFactoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEvaluacionesFactores")) {
				jButtonCopiarEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEvaluacionesFactores")) {
				jButtonVerFormEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEvaluacionesFactores")) {
				jButtonNuevoEvaluacionesFactoresActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEvaluacionesFactores")) {
				jButtonModificarEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEvaluacionesFactores")) {
				jButtonActualizarEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEvaluacionesFactores")) {
				jButtonEliminarEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEvaluacionesFactores")) {
				jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEvaluacionesFactores")) {
				jButtonCancelarEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEvaluacionesFactores")) {
				jButtonCerrarEvaluacionesFactoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEvaluacionesFactores")) {
				jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEvaluacionesFactores")) {
				jButtonNuevoGuardarCambiosEvaluacionesFactoresActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEvaluacionesFactores")) {
				jButtonAbrirOrderByEvaluacionesFactoresActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEvaluacionesFactores")) {
				jButtonRecargarInformacionEvaluacionesFactoresActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEvaluacionesFactores")) {
				jButtonAnterioresEvaluacionesFactoresActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEvaluacionesFactores")) {
				jButtonSiguientesEvaluacionesFactoresActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEvaluacionesFactoresBusqueda")) {
				this.jButtonidEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesFactoresUpdate")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("verificadoEvaluacionesFactoresBusqueda")) {
				this.jButtonverificadoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesFactoresUpdate")) {
				this.jButtonid_estructuraEvaluacionesFactoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesFactoresBusqueda")) {
				this.jButtonid_estructuraEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEvaluacionesFactoresBusqueda")) {
				this.jButtoncodigoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesFactoresUpdate")) {
				this.jButtonid_empresaEvaluacionesFactoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesFactoresBusqueda")) {
				this.jButtonid_empresaEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesFactoresUpdate")) {
				this.jButtonid_sucursalEvaluacionesFactoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesFactoresBusqueda")) {
				this.jButtonid_sucursalEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoEvaluacionesFactoresBusqueda")) {
				this.jButtoncodigo_datoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoEvaluacionesFactoresBusqueda")) {
				this.jButtonnombre_completoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate")) {
				this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda")) {
				this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_conocimientoEvaluacionesFactoresBusqueda")) {
				this.jButtonvalor_conocimientoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_eficienciaEvaluacionesFactoresBusqueda")) {
				this.jButtonvalor_eficienciaEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_obtenidoEvaluacionesFactoresBusqueda")) {
				this.jButtonvalor_obtenidoEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("promedioEvaluacionesFactoresBusqueda")) {
				this.jButtonpromedioEvaluacionesFactoresBusquedaActionPerformed(evt);
			}
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEvaluacionesFactores();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEvaluacionesFactores")) {
				closingInternalFrameEvaluacionesFactores();
				
			} else if(sTipo.equals("jButtonCancelarEvaluacionesFactores")) {
				JInternalFrameBase jInternalFrameDetalleFormEvaluacionesFactores = (JInternalFrameBase)evt.getSource();
	            	
	            EvaluacionesFactoresBeanSwingJInternalFrame jInternalFrameParent=(EvaluacionesFactoresBeanSwingJInternalFrame)jInternalFrameDetalleFormEvaluacionesFactores.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEvaluacionesFactoresActionPerformed(null);
			}
			
			EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.evaluacionesfactores,new Object(),this.evaluacionesfactoresParameterGeneral,this.evaluacionesfactoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEvaluacionesFactores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEvaluacionesFactores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEvaluacionesFactores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.evaluacionesfactores)) {
			if(!esControlTabla) {
				if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);			
				}
				
				if(this.evaluacionesfactoresSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEvaluacionesFactores(this.evaluacionesfactoresReturnGeneral,this.evaluacionesfactoresBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.evaluacionesfactoresSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEvaluacionesFactores(classes,this.evaluacionesfactoresReturnGeneral,this.evaluacionesfactoresBean,false);
					}
						
					if(this.evaluacionesfactoresReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesFactores(this.evaluacionesfactoresReturnGeneral.getEvaluacionesFactores());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEvaluacionesFactores(this.evaluacionesfactoresReturnGeneral.getEvaluacionesFactores());	
					}
						
					if(this.evaluacionesfactoresReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEvaluacionesFactores(this.evaluacionesfactoresReturnGeneral.getEvaluacionesFactores(),classes);//this.evaluacionesfactoresBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEvaluacionesFactores(this.evaluacionesfactores,classes);//this.evaluacionesfactoresBean);									
				}
			
				if(EvaluacionesFactoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEvaluacionesFactores(this.evaluacionesfactores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesFactores(this.evaluacionesfactores);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.evaluacionesfactoresAnterior!=null) {
						this.evaluacionesfactores=this.evaluacionesfactoresAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.evaluacionesfactoresSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.evaluacionesfactoresReturnGeneral.getEvaluacionesFactores(),evaluacionesfactoresLogic.getEvaluacionesFactoress());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.evaluacionesfactoresReturnGeneral.getEvaluacionesFactores(),this.evaluacionesfactoress);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEvaluacionesFactores.repaint();
				
				//((AbstractTableModel) this.jTableDatosEvaluacionesFactores.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEvaluacionesFactores();
			}
		}
	}
	
	public void actualizarVisualTableDatosEvaluacionesFactores() throws Exception {
		
		EvaluacionesFactoresModel evaluacionesfactoresModel=(EvaluacionesFactoresModel)this.jTableDatosEvaluacionesFactores.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionesfactoresModel.evaluacionesfactoress=this.evaluacionesfactoresLogic.getEvaluacionesFactoress();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			evaluacionesfactoresModel.evaluacionesfactoress=this.evaluacionesfactoress;
		}
		
		
		((EvaluacionesFactoresModel) this.jTableDatosEvaluacionesFactores.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEvaluacionesFactores() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getevaluacionesfactoresAnterior(),this.evaluacionesfactoresLogic.getEvaluacionesFactoress());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getevaluacionesfactoresAnterior(),this.evaluacionesfactoress);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEvaluacionesFactores();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
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
										
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionesfactores,new Object(),generalEntityParameterGeneral,this.evaluacionesfactoresReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EvaluacionesFactoresConstantesFunciones.getClassesRelationshipsOfEvaluacionesFactores(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EvaluacionesFactoresConstantesFunciones.getClassesRelationshipsFromStringsOfEvaluacionesFactores(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEvaluacionesFactores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EvaluacionesFactoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionesfactores,new Object(),generalEntityParameterGeneral,this.evaluacionesfactoresReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEvaluacionesFactores(EvaluacionesFactoresBean evaluacionesfactoresBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEvaluacionesFactores(ArrayList<Classe> classes,EvaluacionesFactoresReturnGeneral evaluacionesfactoresReturnGeneral,EvaluacionesFactoresBean evaluacionesfactoresBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.evaluacionesfactores)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEvaluacionesFactores = new EvaluacionesFactoresDetalleFormJInternalFrame(jDesktopPane,this.evaluacionesfactoresSessionBean.getConGuardarRelaciones(),this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.setVisible(false);
		this.jInternalFrameDetalleFormEvaluacionesFactores.setSelected(false);						
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.evaluacionesfactoresLogic=this.evaluacionesfactoresLogic;
		
		this.cargarCombosFrameForeignKeyEvaluacionesFactores("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEvaluacionesFactores();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEvaluacionesFactores();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEvaluacionesFactores("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEvaluacionesFactores();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEvaluacionesFactores"));
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonModificarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"ModificarEvaluacionesFactores"));

		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonModificarToolBarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"ModificarToolBarEvaluacionesFactores"));
					
		this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemModificarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"MenuItemModificarEvaluacionesFactores"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonActualizarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"ActualizarEvaluacionesFactores"));
		
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonActualizarToolBarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEvaluacionesFactores"));
						
		this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemActualizarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEvaluacionesFactores"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonEliminarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"EliminarEvaluacionesFactores"));
		
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonEliminarToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"EliminarToolBarEvaluacionesFactores"));
								
		this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemEliminarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEvaluacionesFactores"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonCancelarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"CancelarEvaluacionesFactores"));
		
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonCancelarToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"CancelarToolBarEvaluacionesFactores"));
					
		this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemCancelarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEvaluacionesFactores"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemDetalleCerrarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEvaluacionesFactores"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionesFactores"));
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionesFactores"));
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEvaluacionesFactores"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonidEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonverificadoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"verificadoEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_estructuraEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_estructuraEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtoncodigoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"codigoEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_empresaEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_empresaEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_sucursalEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_sucursalEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtoncodigo_datoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonnombre_completoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonpromedioEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"promedioEvaluacionesFactoresBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTabbedPaneRelacionesEvaluacionesFactores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEvaluacionesFactores"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEvaluacionesFactores"));
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEvaluacionesFactores"));
		}
		
		this.jTableDatosEvaluacionesFactores.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEvaluacionesFactores"));
		
		this.jTableDatosEvaluacionesFactores.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEvaluacionesFactores"));
		
		this.jButtonNuevoEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"NuevoEvaluacionesFactores"));
		
		this.jButtonDuplicarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"DuplicarEvaluacionesFactores"));
		
		this.jButtonCopiarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"CopiarEvaluacionesFactores"));
		
		this.jButtonVerFormEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"VerFormEvaluacionesFactores"));
		
		
		this.jButtonNuevoToolBarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"NuevoToolBarEvaluacionesFactores"));
			
		this.jButtonDuplicarToolBarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEvaluacionesFactores"));
			
		this.jMenuItemNuevoEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEvaluacionesFactores"));
			
		this.jMenuItemDuplicarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEvaluacionesFactores"));		
		
		
		this.jButtonNuevoRelacionesEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEvaluacionesFactores"));
		
		
		this.jButtonNuevoRelacionesToolBarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEvaluacionesFactores"));
			
		this.jMenuItemNuevoRelacionesEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEvaluacionesFactores"));		
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonModificarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"ModificarEvaluacionesFactores"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonModificarToolBarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"ModificarToolBarEvaluacionesFactores"));
			
			this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemModificarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"MenuItemModificarEvaluacionesFactores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonActualizarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"ActualizarEvaluacionesFactores"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonActualizarToolBarEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEvaluacionesFactores"));
				
			this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemActualizarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEvaluacionesFactores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonEliminarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"EliminarEvaluacionesFactores"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonEliminarToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"EliminarToolBarEvaluacionesFactores"));
						
			this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemEliminarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEvaluacionesFactores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonCancelarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"CancelarEvaluacionesFactores"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonCancelarToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"CancelarToolBarEvaluacionesFactores"));
			
			this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemCancelarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEvaluacionesFactores"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEvaluacionesFactores"));		
		
		
		this.jButtonCerrarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"CerrarEvaluacionesFactores"));
		
		
		this.jButtonCerrarToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"CerrarToolBarEvaluacionesFactores"));
			
		this.jMenuItemCerrarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEvaluacionesFactores"));
			
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jMenuItemDetalleCerrarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEvaluacionesFactores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"GuardarCambiosEvaluacionesFactores"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionesFactores"));
		}
		
		this.jButtonCopiarToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"CopiarToolBarEvaluacionesFactores"));
			
		this.jButtonVerFormToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"VerFormToolBarEvaluacionesFactores"));
		
		this.jMenuItemGuardarCambiosEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEvaluacionesFactores"));
			
		this.jMenuItemCopiarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEvaluacionesFactores"));		
		
		this.jMenuItemVerFormEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEvaluacionesFactores"));		
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEvaluacionesFactores"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEvaluacionesFactores"));
			
		this.jMenuItemGuardarCambiosTablaEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEvaluacionesFactores"));		
		
		
		
		this.jButtonRecargarInformacionEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"RecargarInformacionEvaluacionesFactores"));
					
		this.jButtonRecargarInformacionToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEvaluacionesFactores"));
		
		this.jMenuItemRecargarInformacionEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEvaluacionesFactores"));		
		
		
		
		this.jButtonAnterioresEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"AnterioresEvaluacionesFactores"));
		
		
		this.jButtonAnterioresToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEvaluacionesFactores"));
		
		this.jMenuItemAnterioresEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEvaluacionesFactores"));		
		
		
		this.jButtonSiguientesEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"SiguientesEvaluacionesFactores"));
		
		
		this.jButtonSiguientesToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEvaluacionesFactores"));
			
		this.jMenuItemSiguientesEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEvaluacionesFactores"));
			
		this.jMenuItemAbrirOrderByEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEvaluacionesFactores"));
			
		this.jMenuItemMostrarOcultarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEvaluacionesFactores"));
			
		this.jMenuItemDetalleAbrirOrderByEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEvaluacionesFactores"));
			
		this.jMenuItemDetalleMostarOcultarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEvaluacionesFactores"));		
		
		
		this.jButtonNuevoGuardarCambiosEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEvaluacionesFactores"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEvaluacionesFactores"));
			
		this.jMenuItemNuevoGuardarCambiosEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEvaluacionesFactores"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEvaluacionesFactores.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEvaluacionesFactores"));

		this.jCheckBoxSeleccionadosEvaluacionesFactores.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEvaluacionesFactores"));
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEvaluacionesFactores"));
		}
		
		
		this.jComboBoxTiposRelacionesEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"TiposRelacionesEvaluacionesFactores"));
			
		this.jComboBoxTiposAccionesEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"TiposAccionesEvaluacionesFactores"));
					
		this.jComboBoxTiposSeleccionarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEvaluacionesFactores"));
			
		this.jTextFieldValorCampoGeneralEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEvaluacionesFactores"));		
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonidEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonverificadoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"verificadoEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_estructuraEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_estructuraEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtoncodigoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"codigoEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_empresaEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_empresaEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_sucursalEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_sucursalEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtoncodigo_datoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonnombre_completoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonpromedioEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"promedioEvaluacionesFactoresBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaEvaluacionesFactoresEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"BusquedaEvaluacionesFactoresEvaluacionesFactores"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEvaluacionesFactores!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionesFactores"));
				this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionesFactores"));
				this.jInternalFrameReporteDinamicoEvaluacionesFactores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionesFactores"));
			}
			
			//this.jButtonCerrarReporteDinamicoEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionesFactores"));				
			//this.jButtonGenerarReporteDinamicoEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionesFactores"));
			//this.jButtonGenerarExcelReporteDinamicoEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionesFactores"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEvaluacionesFactores!=null) {
				this.jInternalFrameImportacionEvaluacionesFactores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEvaluacionesFactores"));
				this.jInternalFrameImportacionEvaluacionesFactores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEvaluacionesFactores"));
				this.jInternalFrameImportacionEvaluacionesFactores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEvaluacionesFactores"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"AbrirOrderByEvaluacionesFactores"));
			
			this.jButtonAbrirOrderByToolBarEvaluacionesFactores.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEvaluacionesFactores"));			
			
			if(this.jInternalFrameOrderByEvaluacionesFactores!=null) {
				this.jInternalFrameOrderByEvaluacionesFactores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEvaluacionesFactores"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesFactores.jTabbedPaneRelacionesEvaluacionesFactores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEvaluacionesFactores"));
		
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
            		closingInternalFrameEvaluacionesFactores();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEvaluacionesFactores = (JInternalFrameBase)event.getSource();
	            	
	            EvaluacionesFactoresBeanSwingJInternalFrame jInternalFrameParent=(EvaluacionesFactoresBeanSwingJInternalFrame)jInternalFrameDetalleFormEvaluacionesFactores.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEvaluacionesFactoresActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEvaluacionesFactores.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEvaluacionesFactoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEvaluacionesFactores.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEvaluacionesFactores.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesFactoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesFactoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesFactoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEvaluacionesFactores";
		inputMap = this.jButtonNuevoEvaluacionesFactores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEvaluacionesFactores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEvaluacionesFactoresActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesFactoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesFactoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesFactoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEvaluacionesFactores";
		inputMap = this.jButtonNuevoRelacionesEvaluacionesFactores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEvaluacionesFactores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEvaluacionesFactoresActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEvaluacionesFactores";
		inputMap = this.jButtonModificarEvaluacionesFactores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEvaluacionesFactores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEvaluacionesFactoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEvaluacionesFactores";
		inputMap = this.jButtonActualizarEvaluacionesFactores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEvaluacionesFactores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEvaluacionesFactoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEvaluacionesFactores";
		inputMap = this.jButtonEliminarEvaluacionesFactores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEvaluacionesFactores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEvaluacionesFactoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEvaluacionesFactores";
		inputMap = this.jButtonCancelarEvaluacionesFactores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEvaluacionesFactores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEvaluacionesFactoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEvaluacionesFactores";
		inputMap = this.jButtonCerrarEvaluacionesFactores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEvaluacionesFactores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEvaluacionesFactoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEvaluacionesFactores";
		inputMap = this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosEvaluacionesFactores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonGuardarCambiosEvaluacionesFactores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEvaluacionesFactoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEvaluacionesFactores.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEvaluacionesFactoresItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEvaluacionesFactores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEvaluacionesFactoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEvaluacionesFactores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEvaluacionesFactoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEvaluacionesFactores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEvaluacionesFactoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonidEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonverificadoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"verificadoEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_estructuraEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_estructuraEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtoncodigoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"codigoEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_empresaEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_empresaEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_sucursalEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_sucursalEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtoncodigo_datoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonnombre_completoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoEvaluacionesFactoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesFactoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonid_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonvalor_conocimientoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonvalor_eficienciaEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonvalor_obtenidoEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoEvaluacionesFactoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesFactores.jButtonpromedioEvaluacionesFactoresBusqueda.addActionListener(new ButtonActionListener(this,"promedioEvaluacionesFactoresBusqueda"));
		
		
		this.jButtonBusquedaEvaluacionesFactoresEvaluacionesFactores.addActionListener(new ButtonActionListener(this,"BusquedaEvaluacionesFactoresEvaluacionesFactores"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEvaluacionesFactores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEvaluacionesFactoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEvaluacionesFactoresActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEvaluacionesFactores.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEvaluacionesFactores(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
					evaluacionesfactoresAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoress) {
					evaluacionesfactoresAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEvaluacionesFactoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
						evaluacionesfactoresAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoress) {
						evaluacionesfactoresAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
					
						if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_VERIFICADO)) {
							existe=true;
							evaluacionesfactoresAux.setverificado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoress) {
						
						if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_VERIFICADO)) {
							existe=true;
							evaluacionesfactoresAux.setverificado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEvaluacionesFactores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEvaluacionesFactores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEvaluacionesFactoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEvaluacionesFactores.getSelectedRows();
			
			EvaluacionesFactores evaluacionesfactoresLocal=new EvaluacionesFactores();
			
			//this.seleccionarTodosEvaluacionesFactores(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionesfactoresLocal =(EvaluacionesFactores) this.evaluacionesfactoresLogic.getEvaluacionesFactoress().toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					evaluacionesfactoresLocal =(EvaluacionesFactores) this.evaluacionesfactoress.toArray()[this.jTableDatosEvaluacionesFactores.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				evaluacionesfactoresLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
						evaluacionesfactoresAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoress) {
						evaluacionesfactoresAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEvaluacionesFactores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEvaluacionesFactores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesFactores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEvaluacionesFactoresItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEvaluacionesFactoresParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEvaluacionesFactoresActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEvaluacionesFactores.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
				
						if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							evaluacionesfactoresAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							evaluacionesfactoresAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							evaluacionesfactoresAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO)) {
							existe=true;
							evaluacionesfactoresAux.setvalor_conocimiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA)) {
							existe=true;
							evaluacionesfactoresAux.setvalor_eficiencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO)) {
							existe=true;
							evaluacionesfactoresAux.setvalor_obtenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO)) {
							existe=true;
							evaluacionesfactoresAux.setpromedio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoress) {
					
						if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							evaluacionesfactoresAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							evaluacionesfactoresAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							evaluacionesfactoresAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO)) {
							existe=true;
							evaluacionesfactoresAux.setvalor_conocimiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA)) {
							existe=true;
							evaluacionesfactoresAux.setvalor_eficiencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO)) {
							existe=true;
							evaluacionesfactoresAux.setvalor_obtenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO)) {
							existe=true;
							evaluacionesfactoresAux.setpromedio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEvaluacionesFactoresActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEvaluacionesFactores=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEvaluacionesFactores.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEvaluacionesFactores) {				
					conSplash=true;//false;										
					
					//this.startProcessEvaluacionesFactores(conSplash);
				
					this.generarReporteEvaluacionesFactoressSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesFactores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEvaluacionesFactoressSeleccionados();
				//this.jComboBoxTiposAccionesEvaluacionesFactores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEvaluacionesFactoressSeleccionados(false);
				//this.jComboBoxTiposAccionesEvaluacionesFactores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEvaluacionesFactoressSeleccionados(true);
				//this.jComboBoxTiposAccionesEvaluacionesFactores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEvaluacionesFactores();
				
				this.exportarEvaluacionesFactoressSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesFactores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEvaluacionesFactoress();
				//this.importarEvaluacionesFactoress();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesFactores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEvaluacionesFactores();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEvaluacionesFactoressSeleccionados();
				//this.jComboBoxTiposAccionesEvaluacionesFactores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Evaluaciones Factores", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEvaluacionesFactores();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEvaluacionesFactores)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEvaluacionesFactores(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Evaluaciones Factores",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesFactores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setSelectedIndex(0);					
				}	
			} 			
			else if(EvaluacionesFactoresBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEvaluacionesFactores) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEvaluacionesFactores(conSplash);
					
						//this.actualizarParametrosGeneralEvaluacionesFactores();
						
						this.generarReporteProcesoAccionEvaluacionesFactoressSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEvaluacionesFactores.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EvaluacionesFactoresBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Evaluaciones FactoresES SELECCIONADOS?", "MANTENIMIENTO DE Evaluaciones Factores", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEvaluacionesFactores();
				
						this.actualizarParametrosGeneralEvaluacionesFactores();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.evaluacionesfactoresReturnGeneral=evaluacionesfactoresLogic.procesarAccionEvaluacionesFactoressWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.evaluacionesfactoresLogic.getEvaluacionesFactoress(),this.evaluacionesfactoresParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEvaluacionesFactoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEvaluacionesFactores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEvaluacionesFactores();
					
					EvaluacionesFactoresBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEvaluacionesFactoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEvaluacionesFactores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxTiposAccionesFormularioEvaluacionesFactores.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEvaluacionesFactores(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEvaluacionesFactoresActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEvaluacionesFactores();
			
			if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();		
			EvaluacionesFactores evaluacionesfactores=new EvaluacionesFactores();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEvaluacionesFactores(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEvaluacionesFactores.getSelectedItem();
			
			
			
			
			evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(true);
			//this.sTipoAccion;
			
			if(evaluacionesfactoressSeleccionados.size()==1) {
				for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoressSeleccionados) {
					evaluacionesfactores=evaluacionesfactoresAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEvaluacionesFactores();
			
      		//this.finishProcessEvaluacionesFactores(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEvaluacionesFactoresReturnGeneral() throws Exception {
		if(this.evaluacionesfactoresReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.evaluacionesfactoresReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.evaluacionesfactoresReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.evaluacionesfactoresReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.evaluacionesfactoresReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.evaluacionesfactoresReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEvaluacionesFactores(false);
		}
		
		if(this.evaluacionesfactoresReturnGeneral.getConRetornoLista() || this.evaluacionesfactoresReturnGeneral.getConRetornoObjeto()) {
			if(this.evaluacionesfactoresReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.evaluacionesfactoresLogic.setEvaluacionesFactoress(this.evaluacionesfactoresReturnGeneral.getEvaluacionesFactoress());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingEvaluacionesFactores(false);
		}
	}
	
	public void actualizarParametrosGeneralEvaluacionesFactores() throws Exception {
		
		
	}
	
	public ArrayList<EvaluacionesFactores> getEvaluacionesFactoressSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEvaluacionesFactores) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoresLogic.getEvaluacionesFactoress()) {
					if(evaluacionesfactoresAux.getIsSelected()) {
						evaluacionesfactoressSeleccionados.add(evaluacionesfactoresAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesFactores evaluacionesfactoresAux:this.evaluacionesfactoress) {
					if(evaluacionesfactoresAux.getIsSelected()) {
						evaluacionesfactoressSeleccionados.add(evaluacionesfactoresAux);				
					}
				}
			}
			
			if(evaluacionesfactoressSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						evaluacionesfactoressSeleccionados.addAll(this.evaluacionesfactoresLogic.getEvaluacionesFactoress());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						evaluacionesfactoressSeleccionados.addAll(this.evaluacionesfactoress);				
					}
				}
			}
		} else {
			evaluacionesfactoressSeleccionados.add(this.evaluacionesfactores);
		}
		
		return evaluacionesfactoressSeleccionados;
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
	
	public void generarReporteEvaluacionesFactoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEvaluacionesFactoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEvaluacionesFactoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEvaluacionesFactoressSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEvaluacionesFactoressSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Evaluaciones Factores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEvaluacionesFactoressSeleccionados() throws Exception {
		ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();		
		
		evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEvaluacionesFactoress("Todos",evaluacionesfactoressSeleccionados);
		
	}	
	
	public void generarReporteNormalEvaluacionesFactoressSeleccionados() throws Exception {
		ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();		
		
		evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEvaluacionesFactoress("Todos",evaluacionesfactoressSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEvaluacionesFactoressSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();
		
		evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEvaluacionesFactoress("Todos",evaluacionesfactoressSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEvaluacionesFactoressSeleccionados() throws Exception {
		ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEvaluacionesFactores();
		
		
		evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEvaluacionesFactores();
		
		
		//this.generarReporteEvaluacionesFactoress("Todos",evaluacionesfactoressSeleccionados ,evaluacionesfactoresImplementable,evaluacionesfactoresImplementableHome);
	}
	
	public void mostrarImportacionEvaluacionesFactoress() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEvaluacionesFactores();
		
		this.abrirFrameImportacionEvaluacionesFactores();		
		
			
		//this.generarReporteEvaluacionesFactoress("Todos",evaluacionesfactoressSeleccionados ,evaluacionesfactoresImplementable,evaluacionesfactoresImplementableHome);
	}
	
	public void importarEvaluacionesFactoress() throws Exception {		
	
	}
	
	public void exportarEvaluacionesFactoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEvaluacionesFactoressSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEvaluacionesFactoressSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEvaluacionesFactoressSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Evaluaciones Factores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEvaluacionesFactoressSeleccionados() throws Exception {
		ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();		
		
		evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesfactores."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEvaluacionesFactores(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoressSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEvaluacionesFactores(evaluacionesfactoresAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//evaluacionesfactoresAux.setsDetalleGeneralEntityReporte(evaluacionesfactoresAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Factores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEvaluacionesFactores(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_VERIFICADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=evaluacionesfactores.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.gettipocalificacionempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getverificado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getcodigo_dato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getformatonomipreguntanomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getvalor_conocimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getvalor_eficiencia().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getvalor_obtenido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesfactores.getpromedio().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEvaluacionesFactoressSeleccionados() throws Exception {
		ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();		
		
		evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesfactores.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EvaluacionesFactoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEvaluacionesFactores(row);				
				iRow++;
			}				
			
			for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoressSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEvaluacionesFactores(evaluacionesfactoresAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Factores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEvaluacionesFactoressSeleccionados() throws Exception {
		ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();		
		
		evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesfactores.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("evaluacionesfactoress");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("evaluacionesfactores");
			//elementRoot.appendChild(element);
		
			for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoressSeleccionados) {
				element = document.createElement("evaluacionesfactores");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEvaluacionesFactores(evaluacionesfactoresAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Factores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEvaluacionesFactores(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VERIFICADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VALORCONOCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VALOREFICIENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_VALOROBTENIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesFactoresConstantesFunciones.LABEL_PROMEDIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.gettipocalificacionempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getverificado());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getcodigo_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getformatonomipreguntanomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getvalor_conocimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getvalor_eficiencia());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getvalor_obtenido());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesfactores.getpromedio());				
	}
	
	public void setFilaDatosExportarXmlEvaluacionesFactores(EvaluacionesFactores evaluacionesfactores,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EvaluacionesFactoresConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(evaluacionesfactores.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EvaluacionesFactoresConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(evaluacionesfactores.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipocalificacionempleado_descripcion = document.createElement(EvaluacionesFactoresConstantesFunciones.IDTIPOCALIFICACIONEMPLEADO);
		elementtipocalificacionempleado_descripcion.appendChild(document.createTextNode(evaluacionesfactores.gettipocalificacionempleado_descripcion()));
		element.appendChild(elementtipocalificacionempleado_descripcion);

		Element elementverificado = document.createElement(EvaluacionesFactoresConstantesFunciones.VERIFICADO);
		elementverificado.appendChild(document.createTextNode(evaluacionesfactores.getverificado().toString().trim()));
		element.appendChild(elementverificado);

		Element elementestructura_descripcion = document.createElement(EvaluacionesFactoresConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(evaluacionesfactores.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementcodigo = document.createElement(EvaluacionesFactoresConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(evaluacionesfactores.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementempresa_descripcion = document.createElement(EvaluacionesFactoresConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(evaluacionesfactores.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(EvaluacionesFactoresConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(evaluacionesfactores.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcodigo_dato = document.createElement(EvaluacionesFactoresConstantesFunciones.CODIGODATO);
		elementcodigo_dato.appendChild(document.createTextNode(evaluacionesfactores.getcodigo_dato().trim()));
		element.appendChild(elementcodigo_dato);

		Element elementnombre_completo = document.createElement(EvaluacionesFactoresConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(evaluacionesfactores.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementformatonomipreguntanomi_descripcion = document.createElement(EvaluacionesFactoresConstantesFunciones.IDFORMATONOMIPREGUNTANOMI);
		elementformatonomipreguntanomi_descripcion.appendChild(document.createTextNode(evaluacionesfactores.getformatonomipreguntanomi_descripcion()));
		element.appendChild(elementformatonomipreguntanomi_descripcion);

		Element elementvalor_conocimiento = document.createElement(EvaluacionesFactoresConstantesFunciones.VALORCONOCIMIENTO);
		elementvalor_conocimiento.appendChild(document.createTextNode(evaluacionesfactores.getvalor_conocimiento().toString().trim()));
		element.appendChild(elementvalor_conocimiento);

		Element elementvalor_eficiencia = document.createElement(EvaluacionesFactoresConstantesFunciones.VALOREFICIENCIA);
		elementvalor_eficiencia.appendChild(document.createTextNode(evaluacionesfactores.getvalor_eficiencia().toString().trim()));
		element.appendChild(elementvalor_eficiencia);

		Element elementvalor_obtenido = document.createElement(EvaluacionesFactoresConstantesFunciones.VALOROBTENIDO);
		elementvalor_obtenido.appendChild(document.createTextNode(evaluacionesfactores.getvalor_obtenido().toString().trim()));
		element.appendChild(elementvalor_obtenido);

		Element elementpromedio = document.createElement(EvaluacionesFactoresConstantesFunciones.PROMEDIO);
		elementpromedio.appendChild(document.createTextNode(evaluacionesfactores.getpromedio().toString().trim()));
		element.appendChild(elementpromedio);
	}
	
	public void generarReporteGroupGenericoEvaluacionesFactoressSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados=new ArrayList<EvaluacionesFactores>();
		
		evaluacionesfactoressSeleccionados=this.getEvaluacionesFactoressSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEvaluacionesFactores(evaluacionesfactoressSeleccionados);
		
		this.generarReporteEvaluacionesFactoress("Todos",evaluacionesfactoressSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEvaluacionesFactores(ArrayList<EvaluacionesFactores> evaluacionesfactoressSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EvaluacionesFactores evaluacionesfactoresAux:evaluacionesfactoressSeleccionados) {
				evaluacionesfactoresAux.setsDetalleGeneralEntityReporte(evaluacionesfactoresAux.toString());
			
				if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO)) {
					existe=true;
					evaluacionesfactoresAux.setsDescripcionGeneralEntityReporte1(evaluacionesfactoresAux.gettipocalificacionempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_VERIFICADO)) {
					existe=true;
					evaluacionesfactoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(evaluacionesfactoresAux.getverificado()));
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					evaluacionesfactoresAux.setsDescripcionGeneralEntityReporte1(evaluacionesfactoresAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					evaluacionesfactoresAux.setsDescripcionGeneralEntityReporte1(evaluacionesfactoresAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					evaluacionesfactoresAux.setsDescripcionGeneralEntityReporte1(evaluacionesfactoresAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					evaluacionesfactoresAux.setsDescripcionGeneralEntityReporte1(evaluacionesfactoresAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_CODIGODATO)) {
					existe=true;
					evaluacionesfactoresAux.setsDescripcionGeneralEntityReporte1(evaluacionesfactoresAux.getcodigo_dato());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					evaluacionesfactoresAux.setsDescripcionGeneralEntityReporte1(evaluacionesfactoresAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesFactoresConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI)) {
					existe=true;
					evaluacionesfactoresAux.setsDescripcionGeneralEntityReporte1(evaluacionesfactoresAux.getformatonomipreguntanomi_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesFactoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEvaluacionesFactores(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEvaluacionesFactores=true;
				this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=true;
				this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=true;
			}
			
			this.isVisibilidadCeldaModificarEvaluacionesFactores=false;
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=false;
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=false;
			this.isVisibilidadCeldaCancelarEvaluacionesFactores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=false;
			this.isVisibilidadCeldaModificarEvaluacionesFactores=false;
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=true;
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=false;
			this.isVisibilidadCeldaCancelarEvaluacionesFactores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=false;
			this.isVisibilidadCeldaModificarEvaluacionesFactores=false;
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=true;
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=true;
			this.isVisibilidadCeldaCancelarEvaluacionesFactores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=false;
			this.isVisibilidadCeldaModificarEvaluacionesFactores=false;
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=true;
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=false;
			this.isVisibilidadCeldaCancelarEvaluacionesFactores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=true;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=true;
			this.isVisibilidadCeldaModificarEvaluacionesFactores=false;
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=false;
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=false;
			this.isVisibilidadCeldaCancelarEvaluacionesFactores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=false;
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=false;
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=false;
			this.isVisibilidadCeldaCancelarEvaluacionesFactores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=false;
			this.isVisibilidadCeldaModificarEvaluacionesFactores=true;
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=false;
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=false;
			this.isVisibilidadCeldaCancelarEvaluacionesFactores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EvaluacionesFactoresJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=true;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=true;
		} else {
			this.actualizarEstadoPanelsEvaluacionesFactores(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEvaluacionesFactores=false;
			//this.isVisibilidadCeldaVerFormEvaluacionesFactores=false;
			this.isVisibilidadCeldaDuplicarEvaluacionesFactores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=false;
		} else {
			this.isVisibilidadCeldaNuevoEvaluacionesFactores=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
			if(!evaluacionesfactoresSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=false;												
			}
			
			this.jButtonCerrarEvaluacionesFactores.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=false;
		}
		
		if(!this.permiteMantenimiento(this.evaluacionesfactores)) {
			this.isVisibilidadCeldaActualizarEvaluacionesFactores=false;
			this.isVisibilidadCeldaEliminarEvaluacionesFactores=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoEvaluacionesFactores=false;
		this.isVisibilidadCeldaNuevoRelacionesEvaluacionesFactores=false;
		this.isVisibilidadCeldaGuardarCambiosEvaluacionesFactores=false;
		//this.isVisibilidadCeldaModificarEvaluacionesFactores=true;
		this.isVisibilidadCeldaActualizarEvaluacionesFactores=false;
		this.isVisibilidadCeldaEliminarEvaluacionesFactores=false;
		//this.isVisibilidadCeldaCancelarEvaluacionesFactores=true;			
		this.isVisibilidadCeldaGuardarEvaluacionesFactores=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEvaluacionesFactores() {
	}
	
	public void actualizarEstadoPanelsEvaluacionesFactores(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesFactores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesFactores!=null) {
				this.jTabbedPaneBusquedasEvaluacionesFactores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEvaluacionesFactores.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesFactores!=null) {
				this.jPanelPaginacionEvaluacionesFactores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesFactores!=null) {
				this.jPanelParametrosReportesEvaluacionesFactores.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesFactores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesFactores!=null) {
				this.jTabbedPaneBusquedasEvaluacionesFactores.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEvaluacionesFactores.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionesFactores!=null) {
				this.jPanelPaginacionEvaluacionesFactores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesFactores!=null) {
				this.jPanelParametrosReportesEvaluacionesFactores.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesFactores.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesFactores!=null) {
				this.jTabbedPaneBusquedasEvaluacionesFactores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEvaluacionesFactores.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionesFactores!=null) {
				this.jPanelPaginacionEvaluacionesFactores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesFactores!=null) {
				this.jPanelParametrosReportesEvaluacionesFactores.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesFactores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesFactores!=null) {
				this.jTabbedPaneBusquedasEvaluacionesFactores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEvaluacionesFactores.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionesFactores!=null) {
				this.jPanelPaginacionEvaluacionesFactores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesFactores!=null) {
				this.jPanelParametrosReportesEvaluacionesFactores.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesFactores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesFactores!=null) {
				this.jTabbedPaneBusquedasEvaluacionesFactores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEvaluacionesFactores.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesFactores!=null) {
				this.jPanelPaginacionEvaluacionesFactores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesFactores!=null) {
				this.jPanelParametrosReportesEvaluacionesFactores.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesFactores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesFactores!=null) {
				this.jTabbedPaneBusquedasEvaluacionesFactores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEvaluacionesFactores.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesFactores!=null) {
				this.jPanelPaginacionEvaluacionesFactores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesFactores!=null) {
				this.jPanelParametrosReportesEvaluacionesFactores.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesFactores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesFactores!=null) {
				this.jTabbedPaneBusquedasEvaluacionesFactores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesFactores!=null) {
				this.jScrollPanelDatosEvaluacionesFactores.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesFactores!=null) {
				this.jPanelPaginacionEvaluacionesFactores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesFactores!=null) {
				this.jPanelParametrosReportesEvaluacionesFactores.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEvaluacionesFactores!=null) {
					this.jTabbedPaneBusquedasEvaluacionesFactores.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEvaluacionesFactores!=null) {
				this.jPanelParametrosReportesEvaluacionesFactores.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.evaluacionesfactoresSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesFactores!=null) {
				this.jTabbedPaneBusquedasEvaluacionesFactores.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEvaluacionesFactores!=null) {
				this.jPanelParametrosReportesEvaluacionesFactores.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoCalificacionEmpleado(Boolean isParaTipoCalificacionEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCalificacionEmpleadoNegation=!isParaTipoCalificacionEmpleado;

			this.isVisibilidadBusquedaEvaluacionesFactores=isParaTipoCalificacionEmpleado;
			if(!this.isVisibilidadBusquedaEvaluacionesFactores) {this.jTabbedPaneBusquedasEvaluacionesFactores.remove(jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadBusquedaEvaluacionesFactores=isParaEstructura;
			if(!this.isVisibilidadBusquedaEvaluacionesFactores) {this.jTabbedPaneBusquedasEvaluacionesFactores.remove(jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaEvaluacionesFactores=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaEvaluacionesFactores) {this.jTabbedPaneBusquedasEvaluacionesFactores.remove(jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaEvaluacionesFactores=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaEvaluacionesFactores) {this.jTabbedPaneBusquedasEvaluacionesFactores.remove(jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormatoNomiPreguntaNomi(Boolean isParaFormatoNomiPreguntaNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNomiPreguntaNomiNegation=!isParaFormatoNomiPreguntaNomi;

			this.isVisibilidadBusquedaEvaluacionesFactores=isParaFormatoNomiPreguntaNomiNegation;
			if(!this.isVisibilidadBusquedaEvaluacionesFactores) {this.jTabbedPaneBusquedasEvaluacionesFactores.remove(jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores);}
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
			
			this.inicializarActualizarBindingTablaEvaluacionesFactores(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEvaluacionesFactores() {
		this.updateBorderResaltarBusquedasFormularioEvaluacionesFactores();
		this.updateVisibilidadBusquedasFormularioEvaluacionesFactores();
		this.updateHabilitarBusquedasFormularioEvaluacionesFactores();
	}
	
	public void updateBorderResaltarBusquedasFormularioEvaluacionesFactores() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEvaluacionesFactores.getComponents().length>0) {
	

		if(this.evaluacionesfactoresConstantesFunciones.resaltarBusquedaEvaluacionesFactoresEvaluacionesFactores!=null) {
			index= this.jTabbedPaneBusquedasEvaluacionesFactores.indexOfComponent(this.jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesFactores.getComponent(index);
				jPanel.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarBusquedaEvaluacionesFactoresEvaluacionesFactores);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEvaluacionesFactores() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEvaluacionesFactores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEvaluacionesFactores.indexOfComponent(this.jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesFactores.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarBusquedaEvaluacionesFactoresEvaluacionesFactores);
			if(!this.evaluacionesfactoresConstantesFunciones.mostrarBusquedaEvaluacionesFactoresEvaluacionesFactores && index>-1) {
				this.jTabbedPaneBusquedasEvaluacionesFactores.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEvaluacionesFactores() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEvaluacionesFactores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEvaluacionesFactores.indexOfComponent(this.jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesFactores.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarBusquedaEvaluacionesFactoresEvaluacionesFactores);
				this.jTabbedPaneBusquedasEvaluacionesFactores.setEnabledAt(index,this.evaluacionesfactoresConstantesFunciones.activarBusquedaEvaluacionesFactoresEvaluacionesFactores);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEvaluacionesFactores(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaEvaluacionesFactores")) {
			index= this.jTabbedPaneBusquedasEvaluacionesFactores.indexOfComponent(this.jPanelBusquedaEvaluacionesFactoresEvaluacionesFactores);

			this.jTabbedPaneBusquedasEvaluacionesFactores.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesFactores.getComponent(index);

			this.evaluacionesfactoresConstantesFunciones.setResaltarBusquedaEvaluacionesFactoresEvaluacionesFactores(resaltar);

			jPanel.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarBusquedaEvaluacionesFactoresEvaluacionesFactores);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEvaluacionesFactores.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEvaluacionesFactores() throws Exception {

		if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEvaluacionesFactores();
		this.updateVisibilidadResaltarControlesFormularioEvaluacionesFactores();
		this.updateHabilitarResaltarControlesFormularioEvaluacionesFactores();
		
	}
	
	public void updateBorderResaltarControlesFormularioEvaluacionesFactores() throws Exception {
		if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.evaluacionesfactoresConstantesFunciones.resaltaridEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelidEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltaridEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarid_tipo_calificacion_empleadoEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarid_tipo_calificacion_empleadoEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarverificadoEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jCheckBoxverificadoEvaluacionesFactores.setBorderPainted(true);this.jInternalFrameDetalleFormEvaluacionesFactores.jCheckBoxverificadoEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarverificadoEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarid_estructuraEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarid_estructuraEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarcodigoEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigoEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarcodigoEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarid_empresaEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarid_empresaEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarid_sucursalEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarid_sucursalEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarcodigo_datoEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigo_datoEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarcodigo_datoEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarnombre_completoEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jTextAreanombre_completoEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarnombre_completoEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_conocimientoEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_conocimientoEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_conocimientoEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_eficienciaEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_eficienciaEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_eficienciaEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_obtenidoEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_obtenidoEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarvalor_obtenidoEvaluacionesFactores);}
		if(this.evaluacionesfactoresConstantesFunciones.resaltarpromedioEvaluacionesFactores!=null && this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldpromedioEvaluacionesFactores.setBorder(this.evaluacionesfactoresConstantesFunciones.resaltarpromedioEvaluacionesFactores);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEvaluacionesFactores() throws Exception {		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
	
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelidEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostraridEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelidEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostraridEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarid_tipo_calificacion_empleadoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelid_tipo_calificacion_empleadoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarid_tipo_calificacion_empleadoEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jCheckBoxverificadoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarverificadoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelverificadoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarverificadoEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarid_estructuraEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelid_estructuraEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarid_estructuraEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarcodigoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelcodigoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarcodigoEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarid_empresaEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelid_empresaEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarid_empresaEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarid_sucursalEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelid_sucursalEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarid_sucursalEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigo_datoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarcodigo_datoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelcodigo_datoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarcodigo_datoEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jTextAreanombre_completoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarnombre_completoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelnombre_completoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarnombre_completoEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarid_formato_nomi_pregunta_nomiEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelid_formato_nomi_pregunta_nomiEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarid_formato_nomi_pregunta_nomiEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_conocimientoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarvalor_conocimientoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelvalor_conocimientoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarvalor_conocimientoEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_eficienciaEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarvalor_eficienciaEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelvalor_eficienciaEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarvalor_eficienciaEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_obtenidoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarvalor_obtenidoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelvalor_obtenidoEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarvalor_obtenidoEvaluacionesFactores);
		//this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldpromedioEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarpromedioEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jPanelpromedioEvaluacionesFactores.setVisible(this.evaluacionesfactoresConstantesFunciones.mostrarpromedioEvaluacionesFactores);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEvaluacionesFactores() throws Exception {
		if(this.jInternalFrameDetalleFormEvaluacionesFactores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionesFactores!=null) {
	
		this.jInternalFrameDetalleFormEvaluacionesFactores.jLabelidEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activaridEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_tipo_calificacion_empleadoEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarid_tipo_calificacion_empleadoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jCheckBoxverificadoEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarverificadoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_estructuraEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarid_estructuraEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigoEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarcodigoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_empresaEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarid_empresaEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_sucursalEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarid_sucursalEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldcodigo_datoEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarcodigo_datoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextAreanombre_completoEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarnombre_completoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarid_formato_nomi_pregunta_nomiEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_conocimientoEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarvalor_conocimientoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_eficienciaEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarvalor_eficienciaEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldvalor_obtenidoEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarvalor_obtenidoEvaluacionesFactores);
		this.jInternalFrameDetalleFormEvaluacionesFactores.jTextFieldpromedioEvaluacionesFactores.setEnabled(this.evaluacionesfactoresConstantesFunciones.activarpromedioEvaluacionesFactores);
		}
	}
	
		
}