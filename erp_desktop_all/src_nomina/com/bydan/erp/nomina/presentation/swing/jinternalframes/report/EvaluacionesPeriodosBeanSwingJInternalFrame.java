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

//import com.bydan.erp.nomina.util.EvaluacionesPeriodosConstantesFunciones;
import com.bydan.erp.nomina.util.report.EvaluacionesPeriodosParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.EvaluacionesPeriodosParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.EvaluacionesPeriodosBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EvaluacionesPeriodosBeanSwingJInternalFrame extends EvaluacionesPeriodosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EvaluacionesPeriodosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EvaluacionesPeriodos> evaluacionesperiodosValidator = new ClassValidator<EvaluacionesPeriodos>(EvaluacionesPeriodos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EvaluacionesPeriodos evaluacionesperiodos;	
	public EvaluacionesPeriodos evaluacionesperiodosAux;
	public EvaluacionesPeriodos evaluacionesperiodosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EvaluacionesPeriodos evaluacionesperiodosTotales;
	public Long idEvaluacionesPeriodosActual;
	public Long iIdNuevoEvaluacionesPeriodos=0L;
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

	public String sFinalQueryComboTipoEvaluacionEmpleado="";

	public List<TipoEvaluacionEmpleado> tipoevaluacionempleadosForeignKey;

	public List<TipoEvaluacionEmpleado> gettipoevaluacionempleadosForeignKey() {
		return tipoevaluacionempleadosForeignKey;
	}

	public void settipoevaluacionempleadosForeignKey(List<TipoEvaluacionEmpleado> tipoevaluacionempleadosForeignKey) {
		this.tipoevaluacionempleadosForeignKey = tipoevaluacionempleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoEvaluacionEmpleado tipoevaluacionempleadoForeignKey;

	public TipoEvaluacionEmpleado gettipoevaluacionempleadoForeignKey() {
		return tipoevaluacionempleadoForeignKey;
	}

	public void settipoevaluacionempleadoForeignKey(TipoEvaluacionEmpleado tipoevaluacionempleadoForeignKey) {
		this.tipoevaluacionempleadoForeignKey = tipoevaluacionempleadoForeignKey;
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
	
	public Boolean isPermisoTodoEvaluacionesPeriodos;
	public Boolean isPermisoNuevoEvaluacionesPeriodos;
	public Boolean isPermisoActualizarEvaluacionesPeriodos;
	public Boolean isPermisoActualizarOriginalEvaluacionesPeriodos;
	public Boolean isPermisoEliminarEvaluacionesPeriodos;
	public Boolean isPermisoGuardarCambiosEvaluacionesPeriodos;
	public Boolean isPermisoConsultaEvaluacionesPeriodos;
	public Boolean isPermisoBusquedaEvaluacionesPeriodos;
	public Boolean isPermisoReporteEvaluacionesPeriodos;
	public Boolean isPermisoPaginacionMedioEvaluacionesPeriodos;
	public Boolean isPermisoPaginacionAltoEvaluacionesPeriodos;
	public Boolean isPermisoPaginacionTodoEvaluacionesPeriodos;
	public Boolean isPermisoCopiarEvaluacionesPeriodos;
	public Boolean isPermisoVerFormEvaluacionesPeriodos;
	public Boolean isPermisoDuplicarEvaluacionesPeriodos;
	public Boolean isPermisoOrdenEvaluacionesPeriodos;
	
	
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
	
	public EvaluacionesPeriodosParameterReturnGeneral evaluacionesperiodosReturnGeneral;
	public EvaluacionesPeriodosParameterReturnGeneral evaluacionesperiodosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEvaluacionesPeriodos=false;
	public Boolean esParaAccionDesdeFormularioEvaluacionesPeriodos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EvaluacionesPeriodosSessionBeanAdditional evaluacionesperiodosSessionBeanAdditional=null;
	
	public EvaluacionesPeriodosSessionBeanAdditional getEvaluacionesPeriodosSessionBeanAdditional() {
		return this.evaluacionesperiodosSessionBeanAdditional;
	}
	
	public void setEvaluacionesPeriodosSessionBeanAdditional(EvaluacionesPeriodosSessionBeanAdditional evaluacionesperiodosSessionBeanAdditional) {
		try {
			this.evaluacionesperiodosSessionBeanAdditional=evaluacionesperiodosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EvaluacionesPeriodosBeanSwingJInternalFrameAdditional evaluacionesperiodosBeanSwingJInternalFrameAdditional=null;
	//public class EvaluacionesPeriodosBeanSwingJInternalFrame
	
	public EvaluacionesPeriodosBeanSwingJInternalFrameAdditional getEvaluacionesPeriodosBeanSwingJInternalFrameAdditional() {
		return this.evaluacionesperiodosBeanSwingJInternalFrameAdditional;
	}
	
	public void setEvaluacionesPeriodosBeanSwingJInternalFrameAdditional(EvaluacionesPeriodosBeanSwingJInternalFrameAdditional evaluacionesperiodosBeanSwingJInternalFrameAdditional) {
		try {
			this.evaluacionesperiodosBeanSwingJInternalFrameAdditional=evaluacionesperiodosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EvaluacionesPeriodosLogic evaluacionesperiodosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EvaluacionesPeriodos evaluacionesperiodosBean;
	public EvaluacionesPeriodosConstantesFunciones evaluacionesperiodosConstantesFunciones;
	//public EvaluacionesPeriodosParameterReturnGeneral evaluacionesperiodosReturnGeneral;
	
	//FK
	
	public TipoCalificacionEmpleadoLogic tipocalificacionempleadoLogic;
	public EstructuraLogic estructuraLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public TipoEvaluacionEmpleadoLogic tipoevaluacionempleadoLogic;
	public FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic;
	
	//PARAMETROS
	
	
	//public List<EvaluacionesPeriodos> evaluacionesperiodoss;	
	//public List<EvaluacionesPeriodos> evaluacionesperiodossEliminados;
	//public List<EvaluacionesPeriodos> evaluacionesperiodossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEvaluacionesPeriodos=false;
	public Boolean isVisibilidadCeldaDuplicarEvaluacionesPeriodos=true;
	public Boolean isVisibilidadCeldaCopiarEvaluacionesPeriodos=true;
	public Boolean isVisibilidadCeldaVerFormEvaluacionesPeriodos=true;
	public Boolean isVisibilidadCeldaOrdenEvaluacionesPeriodos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=false;
	public Boolean isVisibilidadCeldaModificarEvaluacionesPeriodos=false;
	public Boolean isVisibilidadCeldaActualizarEvaluacionesPeriodos=false;
	public Boolean isVisibilidadCeldaEliminarEvaluacionesPeriodos=false;
	public Boolean isVisibilidadCeldaCancelarEvaluacionesPeriodos=false;
	public Boolean isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=false;	
	
	
	public Boolean isVisibilidadBusquedaEvaluacionesPeriodos=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdFormatoNomiPreguntaNomi=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoCalificacionEmpleado=false;
	public Boolean isVisibilidadFK_IdTipoEvaluacionEmpleado=false;
	
	public Long getiIdNuevoEvaluacionesPeriodos() {
		return this.iIdNuevoEvaluacionesPeriodos;
	}

	public void setiIdNuevoEvaluacionesPeriodos(Long iIdNuevoEvaluacionesPeriodos) {
		this.iIdNuevoEvaluacionesPeriodos = iIdNuevoEvaluacionesPeriodos;
	}
	
	public Long getidEvaluacionesPeriodosActual() {
		return this.idEvaluacionesPeriodosActual;
	}

	public void setidEvaluacionesPeriodosActual(Long idEvaluacionesPeriodosActual) {
		this.idEvaluacionesPeriodosActual = idEvaluacionesPeriodosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EvaluacionesPeriodos getevaluacionesperiodos() {
		return this.evaluacionesperiodos;
	}

	public void setevaluacionesperiodos(EvaluacionesPeriodos evaluacionesperiodos) {
		this.evaluacionesperiodos = evaluacionesperiodos;
	}
	
	public EvaluacionesPeriodos getevaluacionesperiodosAux() {
		return this.evaluacionesperiodosAux;
	}

	public void setevaluacionesperiodosAux(EvaluacionesPeriodos evaluacionesperiodosAux) {
		this.evaluacionesperiodosAux = evaluacionesperiodosAux;
	}				
	
	public EvaluacionesPeriodos getevaluacionesperiodosAnterior() {
		return this.evaluacionesperiodosAnterior;
	}

	public void setevaluacionesperiodosAnterior(EvaluacionesPeriodos evaluacionesperiodosAnterior) {
		this.evaluacionesperiodosAnterior = evaluacionesperiodosAnterior;
	}	
	
	public EvaluacionesPeriodos getevaluacionesperiodosTotales() {
		return this.evaluacionesperiodosTotales;
	}

	public void setevaluacionesperiodosTotales(EvaluacionesPeriodos evaluacionesperiodosTotales) {
		this.evaluacionesperiodosTotales = evaluacionesperiodosTotales;
	}	
	
	public EvaluacionesPeriodos getevaluacionesperiodosBean() {
		return this.evaluacionesperiodosBean;
	}

	public void setevaluacionesperiodosBean(EvaluacionesPeriodos evaluacionesperiodosBean) {
		this.evaluacionesperiodosBean = evaluacionesperiodosBean;
	}	
	
	public EvaluacionesPeriodosParameterReturnGeneral getevaluacionesperiodosReturnGeneral() {
		return this.evaluacionesperiodosReturnGeneral;
	}

	public void setevaluacionesperiodosReturnGeneral(EvaluacionesPeriodosParameterReturnGeneral evaluacionesperiodosReturnGeneral) {
		this.evaluacionesperiodosReturnGeneral = evaluacionesperiodosReturnGeneral;
	}	
	
	
	public Long id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos=-1L;

	public Long getid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos() {
		return this.id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos;
	}

	public void setid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos(Long id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos) {
		this.id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos = id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos;
	}

;
	public Boolean verificadoBusquedaEvaluacionesPeriodos=false;

	public Boolean getverificadoBusquedaEvaluacionesPeriodos() {
		return this.verificadoBusquedaEvaluacionesPeriodos;
	}

	public void setverificadoBusquedaEvaluacionesPeriodos(Boolean verificadoBusquedaEvaluacionesPeriodos) {
		this.verificadoBusquedaEvaluacionesPeriodos = verificadoBusquedaEvaluacionesPeriodos;
	}

;
	public Long id_estructuraBusquedaEvaluacionesPeriodos=-1L;

	public Long getid_estructuraBusquedaEvaluacionesPeriodos() {
		return this.id_estructuraBusquedaEvaluacionesPeriodos;
	}

	public void setid_estructuraBusquedaEvaluacionesPeriodos(Long id_estructuraBusquedaEvaluacionesPeriodos) {
		this.id_estructuraBusquedaEvaluacionesPeriodos = id_estructuraBusquedaEvaluacionesPeriodos;
	}

;
	public String codigoBusquedaEvaluacionesPeriodos="";

	public String getcodigoBusquedaEvaluacionesPeriodos() {
		return this.codigoBusquedaEvaluacionesPeriodos;
	}

	public void setcodigoBusquedaEvaluacionesPeriodos(String codigoBusquedaEvaluacionesPeriodos) {
		this.codigoBusquedaEvaluacionesPeriodos = codigoBusquedaEvaluacionesPeriodos;
	}

;
	public Long id_ejercicioBusquedaEvaluacionesPeriodos=-1L;

	public Long getid_ejercicioBusquedaEvaluacionesPeriodos() {
		return this.id_ejercicioBusquedaEvaluacionesPeriodos;
	}

	public void setid_ejercicioBusquedaEvaluacionesPeriodos(Long id_ejercicioBusquedaEvaluacionesPeriodos) {
		this.id_ejercicioBusquedaEvaluacionesPeriodos = id_ejercicioBusquedaEvaluacionesPeriodos;
	}

;
	public Long id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos=-1L;

	public Long getid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos() {
		return this.id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos;
	}

	public void setid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos(Long id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos) {
		this.id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos = id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos;
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

	public Long id_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleado=-1L;

	public Long getid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleado() {
		return this.id_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleado;
	}

	public void setid_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleado(Long id_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleado) {
		this.id_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleado = id_tipo_evaluacion_empleadoFK_IdTipoEvaluacionEmpleado;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EvaluacionesPeriodosLogic getEvaluacionesPeriodosLogic()	{		
		return evaluacionesperiodosLogic;
	}

	public void setEvaluacionesPeriodosLogic(EvaluacionesPeriodosLogic evaluacionesperiodosLogic) {
		this.evaluacionesperiodosLogic = evaluacionesperiodosLogic;
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
	
	public Boolean getIsEsNuevoEvaluacionesPeriodos() {
		return isEsNuevoEvaluacionesPeriodos;
	}

	public void setIsEsNuevoEvaluacionesPeriodos(Boolean isEsNuevoEvaluacionesPeriodos) {
		this.isEsNuevoEvaluacionesPeriodos = isEsNuevoEvaluacionesPeriodos;
	}

	public Boolean getEsParaAccionDesdeFormularioEvaluacionesPeriodos() {
		return esParaAccionDesdeFormularioEvaluacionesPeriodos;
	}
	
	public void setEsParaAccionDesdeFormularioEvaluacionesPeriodos(Boolean esParaAccionDesdeFormularioEvaluacionesPeriodos) {
		this.esParaAccionDesdeFormularioEvaluacionesPeriodos = esParaAccionDesdeFormularioEvaluacionesPeriodos;
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

			if(this.evaluacionesperiodosSessionBean==null) {
				this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
			}

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado()) {
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
					tipocalificacionempleadoLogic.getEntityWithConnection(evaluacionesperiodosSessionBean.getlidTipoCalificacionEmpleadoActual());
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

			if(this.evaluacionesperiodosSessionBean==null) {
				this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
			}

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(evaluacionesperiodosSessionBean.getlidEstructuraActual());
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

			if(this.evaluacionesperiodosSessionBean==null) {
				this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
			}

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(evaluacionesperiodosSessionBean.getlidEmpresaActual());
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

			if(this.evaluacionesperiodosSessionBean==null) {
				this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
			}

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(evaluacionesperiodosSessionBean.getlidSucursalActual());
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

			if(this.evaluacionesperiodosSessionBean==null) {
				this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
			}

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(evaluacionesperiodosSessionBean.getlidEjercicioActual());
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

	public void cargarCombosTipoEvaluacionEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoevaluacionempleadosForeignKey=new ArrayList<TipoEvaluacionEmpleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoEvaluacionEmpleadoLogic tipoevaluacionempleadoLogic=new TipoEvaluacionEmpleadoLogic();

			//tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.evaluacionesperiodosSessionBean==null) {
				this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
			}

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleadoDataAccess().setIsForForeingKeyData(true);

					tipoevaluacionempleadoLogic.getTodosTipoEvaluacionEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.tipoevaluacionempleadosForeignKey=tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoEvaluacionEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoevaluacionempleadoLogic.getEntityWithConnection(evaluacionesperiodosSessionBean.getlidTipoEvaluacionEmpleadoActual());
					this.tipoevaluacionempleadosForeignKey.add(tipoevaluacionempleadoLogic.getTipoEvaluacionEmpleado());
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

			if(this.evaluacionesperiodosSessionBean==null) {
				this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
			}

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi()) {
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
					formatonomipreguntanomiLogic.getEntityWithConnection(evaluacionesperiodosSessionBean.getlidFormatoNomiPreguntaNomiActual());
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

					if(this.evaluacionesperiodos!=null) {
						this.evaluacionesperiodos.setTipoCalificacionEmpleado(tipocalificacionempleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setSelectedItem(tipocalificacionempleadoTemp);
					}
				} else {
					//jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setSelectedItem(tipocalificacionempleadoTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesPeriodos") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocalificacionempleadoTemp!=null && jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos!=null) {
						jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(tipocalificacionempleadoTemp);
					} else {
						if(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos!=null) {
							//jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(tipocalificacionempleadoTemp);
							if(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getItemCount()>0) {
								jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedIndex(0);
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
	public void setActualTipoCalificacionEmpleadoForeignKeyGenerico(Long idTipoCalificacionEmpleadoSeleccionado,JComboBox jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodosGenerico)throws Exception
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
				jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodosGenerico.setSelectedItem(tipocalificacionempleadoTemp);
			} else {
				if(jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodosGenerico!=null && jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodosGenerico.setSelectedIndex(0);
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

					if(this.evaluacionesperiodos!=null) {
						this.evaluacionesperiodos.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraEvaluacionesPeriodos.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesPeriodos") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos!=null) {
						jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos!=null) {
							//jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getItemCount()>0) {
								jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraEvaluacionesPeriodosGenerico)throws Exception
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
				jComboBoxid_estructuraEvaluacionesPeriodosGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraEvaluacionesPeriodosGenerico!=null && jComboBoxid_estructuraEvaluacionesPeriodosGenerico.getItemCount()>0) {
					jComboBoxid_estructuraEvaluacionesPeriodosGenerico.setSelectedIndex(0);
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

					if(this.evaluacionesperiodos!=null) {
						this.evaluacionesperiodos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEvaluacionesPeriodos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEvaluacionesPeriodosGenerico)throws Exception
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
				jComboBoxid_empresaEvaluacionesPeriodosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEvaluacionesPeriodosGenerico!=null && jComboBoxid_empresaEvaluacionesPeriodosGenerico.getItemCount()>0) {
					jComboBoxid_empresaEvaluacionesPeriodosGenerico.setSelectedIndex(0);
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

					if(this.evaluacionesperiodos!=null) {
						this.evaluacionesperiodos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalEvaluacionesPeriodos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalEvaluacionesPeriodosGenerico)throws Exception
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
				jComboBoxid_sucursalEvaluacionesPeriodosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalEvaluacionesPeriodosGenerico!=null && jComboBoxid_sucursalEvaluacionesPeriodosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalEvaluacionesPeriodosGenerico.setSelectedIndex(0);
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

					if(this.evaluacionesperiodos!=null) {
						this.evaluacionesperiodos.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioEvaluacionesPeriodos.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesPeriodos") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos!=null) {
						jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos!=null) {
							//jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioEvaluacionesPeriodosGenerico)throws Exception
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
				jComboBoxid_ejercicioEvaluacionesPeriodosGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioEvaluacionesPeriodosGenerico!=null && jComboBoxid_ejercicioEvaluacionesPeriodosGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioEvaluacionesPeriodosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoEvaluacionEmpleadoForeignKey(Long idTipoEvaluacionEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoEvaluacionEmpleado  tipoevaluacionempleadoTemp=null;

			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleadosForeignKey) {
				if(tipoevaluacionempleadoAux.getId()!=null && tipoevaluacionempleadoAux.getId().equals(idTipoEvaluacionEmpleadoSeleccionado)) {
					tipoevaluacionempleadoTemp=tipoevaluacionempleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoevaluacionempleadoTemp!=null) {

					if(this.evaluacionesperiodos!=null) {
						this.evaluacionesperiodos.setTipoEvaluacionEmpleado(tipoevaluacionempleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setSelectedItem(tipoevaluacionempleadoTemp);
					}
				} else {
					//jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setSelectedItem(tipoevaluacionempleadoTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesPeriodos") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoevaluacionempleadoTemp!=null && jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos!=null) {
						jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(tipoevaluacionempleadoTemp);
					} else {
						if(jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos!=null) {
							//jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(tipoevaluacionempleadoTemp);
							if(jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getItemCount()>0) {
								jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedIndex(0);
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

	public String getActualTipoEvaluacionEmpleadoForeignKeyDescripcion(Long idTipoEvaluacionEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoEvaluacionEmpleado  tipoevaluacionempleadoTemp=null;

			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleadosForeignKey) {
				if(tipoevaluacionempleadoAux.getId()!=null && tipoevaluacionempleadoAux.getId().equals(idTipoEvaluacionEmpleadoSeleccionado)) {
					tipoevaluacionempleadoTemp=tipoevaluacionempleadoAux;
					break;
				}
			}


			sDescripcion=TipoEvaluacionEmpleadoConstantesFunciones.getTipoEvaluacionEmpleadoDescripcion(tipoevaluacionempleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoEvaluacionEmpleadoForeignKeyGenerico(Long idTipoEvaluacionEmpleadoSeleccionado,JComboBox jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodosGenerico)throws Exception
	{
		try
		{
			TipoEvaluacionEmpleado  tipoevaluacionempleadoTemp=null;

			for(TipoEvaluacionEmpleado tipoevaluacionempleadoAux:tipoevaluacionempleadosForeignKey) {
				if(tipoevaluacionempleadoAux.getId()!=null && tipoevaluacionempleadoAux.getId().equals(idTipoEvaluacionEmpleadoSeleccionado)) {
					tipoevaluacionempleadoTemp=tipoevaluacionempleadoAux;
					break;
				}
			}

			if(tipoevaluacionempleadoTemp!=null) {
				jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodosGenerico.setSelectedItem(tipoevaluacionempleadoTemp);
			} else {
				if(jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodosGenerico!=null && jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodosGenerico.setSelectedIndex(0);
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

					if(this.evaluacionesperiodos!=null) {
						this.evaluacionesperiodos.setFormatoNomiPreguntaNomi(formatonomipreguntanomiTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setSelectedItem(formatonomipreguntanomiTemp);
					}
				} else {
					//jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setSelectedItem(formatonomipreguntanomiTemp);
					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setSelectedIndex(0);
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
	public void setActualFormatoNomiPreguntaNomiForeignKeyGenerico(Long idFormatoNomiPreguntaNomiSeleccionado,JComboBox jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodosGenerico)throws Exception
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
				jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodosGenerico.setSelectedItem(formatonomipreguntanomiTemp);
			} else {
				if(jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodosGenerico!=null && jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodosGenerico.getItemCount()>0) {
					jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCalificacionEmpleadoForeignKey(EvaluacionesPeriodos evaluacionesperiodos,JComboBox jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodosGenerico)throws Exception
	{
		try
		{
			TipoCalificacionEmpleado  tipocalificacionempleadoAux=new TipoCalificacionEmpleado();

			if(jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodosGenerico==null) {
				tipocalificacionempleadoAux=(TipoCalificacionEmpleado)this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.getSelectedItem();
			} else {
				tipocalificacionempleadoAux=(TipoCalificacionEmpleado)jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodosGenerico.getSelectedItem();
			}

			if(tipocalificacionempleadoAux!=null && tipocalificacionempleadoAux.getId()!=null) {
				evaluacionesperiodos.setid_tipo_calificacion_empleado(tipocalificacionempleadoAux.getId());
				evaluacionesperiodos.settipocalificacionempleado_descripcion(EvaluacionesPeriodosConstantesFunciones.getTipoCalificacionEmpleadoDescripcion(tipocalificacionempleadoAux));
				evaluacionesperiodos.setTipoCalificacionEmpleado(tipocalificacionempleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(EvaluacionesPeriodos evaluacionesperiodos,JComboBox jComboBoxid_estructuraEvaluacionesPeriodosGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraEvaluacionesPeriodosGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraEvaluacionesPeriodosGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				evaluacionesperiodos.setid_estructura(estructuraAux.getId());
				evaluacionesperiodos.setestructura_descripcion(EvaluacionesPeriodosConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				evaluacionesperiodos.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EvaluacionesPeriodos evaluacionesperiodos,JComboBox jComboBoxid_empresaEvaluacionesPeriodosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEvaluacionesPeriodosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEvaluacionesPeriodosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				evaluacionesperiodos.setid_empresa(empresaAux.getId());
				evaluacionesperiodos.setempresa_descripcion(EvaluacionesPeriodosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				evaluacionesperiodos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(EvaluacionesPeriodos evaluacionesperiodos,JComboBox jComboBoxid_sucursalEvaluacionesPeriodosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalEvaluacionesPeriodosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalEvaluacionesPeriodosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				evaluacionesperiodos.setid_sucursal(sucursalAux.getId());
				evaluacionesperiodos.setsucursal_descripcion(EvaluacionesPeriodosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				evaluacionesperiodos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(EvaluacionesPeriodos evaluacionesperiodos,JComboBox jComboBoxid_ejercicioEvaluacionesPeriodosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioEvaluacionesPeriodosGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioEvaluacionesPeriodosGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				evaluacionesperiodos.setid_ejercicio(ejercicioAux.getId());
				evaluacionesperiodos.setejercicio_descripcion(EvaluacionesPeriodosConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				evaluacionesperiodos.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoEvaluacionEmpleadoForeignKey(EvaluacionesPeriodos evaluacionesperiodos,JComboBox jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodosGenerico)throws Exception
	{
		try
		{
			TipoEvaluacionEmpleado  tipoevaluacionempleadoAux=new TipoEvaluacionEmpleado();

			if(jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodosGenerico==null) {
				tipoevaluacionempleadoAux=(TipoEvaluacionEmpleado)this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.getSelectedItem();
			} else {
				tipoevaluacionempleadoAux=(TipoEvaluacionEmpleado)jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodosGenerico.getSelectedItem();
			}

			if(tipoevaluacionempleadoAux!=null && tipoevaluacionempleadoAux.getId()!=null) {
				evaluacionesperiodos.setid_tipo_evaluacion_empleado(tipoevaluacionempleadoAux.getId());
				evaluacionesperiodos.settipoevaluacionempleado_descripcion(EvaluacionesPeriodosConstantesFunciones.getTipoEvaluacionEmpleadoDescripcion(tipoevaluacionempleadoAux));
				evaluacionesperiodos.setTipoEvaluacionEmpleado(tipoevaluacionempleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoNomiPreguntaNomiForeignKey(EvaluacionesPeriodos evaluacionesperiodos,JComboBox jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodosGenerico)throws Exception
	{
		try
		{
			FormatoNomiPreguntaNomi  formatonomipreguntanomiAux=new FormatoNomiPreguntaNomi();

			if(jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodosGenerico==null) {
				formatonomipreguntanomiAux=(FormatoNomiPreguntaNomi)this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.getSelectedItem();
			} else {
				formatonomipreguntanomiAux=(FormatoNomiPreguntaNomi)jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodosGenerico.getSelectedItem();
			}

			if(formatonomipreguntanomiAux!=null && formatonomipreguntanomiAux.getId()!=null) {
				evaluacionesperiodos.setid_formato_nomi_pregunta_nomi(formatonomipreguntanomiAux.getId());
				evaluacionesperiodos.setformatonomipreguntanomi_descripcion(EvaluacionesPeriodosConstantesFunciones.getFormatoNomiPreguntaNomiDescripcion(formatonomipreguntanomiAux));
				evaluacionesperiodos.setFormatoNomiPreguntaNomi(formatonomipreguntanomiAux);			}
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

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.removeAllItems();

							for(TipoCalificacionEmpleado tipocalificacionempleado:this.tipocalificacionempleadosForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.addItem(tipocalificacionempleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
					}

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesPeriodos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.removeAllItems();

							for(TipoCalificacionEmpleado tipocalificacionempleado:this.tipocalificacionempleadosForeignKey) {
								this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.addItem(tipocalificacionempleado);
							}
						}

						if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
					}

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesPeriodos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.addItem(estructura);
							}
						}

						if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
					}

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
					}

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
					}

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesPeriodos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.addItem(ejercicio);
							}
						}

						if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoEvaluacionEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoEvaluacionEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.removeAllItems();

							for(TipoEvaluacionEmpleado tipoevaluacionempleado:this.tipoevaluacionempleadosForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.addItem(tipoevaluacionempleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
					}

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEvaluacionesPeriodos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.removeAllItems();

							for(TipoEvaluacionEmpleado tipoevaluacionempleado:this.tipoevaluacionempleadosForeignKey) {
								this.jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.addItem(tipoevaluacionempleado);
							}
						}

						if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.removeAllItems();

							for(FormatoNomiPreguntaNomi formatonomipreguntanomi:this.formatonomipreguntanomisForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.addItem(formatonomipreguntanomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { 
					}

					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setSelectedItem(tipocalificacionempleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(tipocalificacionempleado);
						} else {
							this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoEvaluacionEmpleadoForeignKey(TipoEvaluacionEmpleado tipoevaluacionempleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setSelectedItem(tipoevaluacionempleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedItem(tipoevaluacionempleado);
						} else {
							this.jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setSelectedItem(formatonomipreguntanomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesEvaluacionesPeriodos() throws Exception {
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
		
	public EvaluacionesPeriodosParameterReturnGeneral getEvaluacionesPeriodosParameterGeneral() {
		return this.evaluacionesperiodosParameterGeneral;
	}
	
	public void setEvaluacionesPeriodosParameterGeneral(EvaluacionesPeriodosParameterReturnGeneral evaluacionesperiodosParameterGeneral) {
		this.evaluacionesperiodosParameterGeneral = evaluacionesperiodosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEvaluacionesPeriodos() {
		return isPermisoTodoEvaluacionesPeriodos;
	}

	public void setIsPermisoTodoEvaluacionesPeriodos(Boolean isPermisoTodoEvaluacionesPeriodos) {
		this.isPermisoTodoEvaluacionesPeriodos = isPermisoTodoEvaluacionesPeriodos;
	}

	public Boolean getIsPermisoNuevoEvaluacionesPeriodos() {
		return isPermisoNuevoEvaluacionesPeriodos;
	}

	public void setIsPermisoNuevoEvaluacionesPeriodos(Boolean isPermisoNuevoEvaluacionesPeriodos) {
		this.isPermisoNuevoEvaluacionesPeriodos = isPermisoNuevoEvaluacionesPeriodos;
	}

	public Boolean getIsPermisoActualizarEvaluacionesPeriodos() {
		return isPermisoActualizarEvaluacionesPeriodos;
	}

	public void setIsPermisoActualizarEvaluacionesPeriodos(Boolean isPermisoActualizarEvaluacionesPeriodos) {
		this.isPermisoActualizarEvaluacionesPeriodos = isPermisoActualizarEvaluacionesPeriodos;
	}

	public Boolean getIsPermisoEliminarEvaluacionesPeriodos() {
		return isPermisoEliminarEvaluacionesPeriodos;
	}

	public void setIsPermisoEliminarEvaluacionesPeriodos(Boolean isPermisoEliminarEvaluacionesPeriodos) {
		this.isPermisoEliminarEvaluacionesPeriodos = isPermisoEliminarEvaluacionesPeriodos;
	}

	public Boolean getIsPermisoGuardarCambiosEvaluacionesPeriodos() {
		return isPermisoGuardarCambiosEvaluacionesPeriodos;
	}

	public void setIsPermisoGuardarCambiosEvaluacionesPeriodos(Boolean isPermisoGuardarCambiosEvaluacionesPeriodos) {
		this.isPermisoGuardarCambiosEvaluacionesPeriodos = isPermisoGuardarCambiosEvaluacionesPeriodos;
	}
	
	public Boolean getIsPermisoConsultaEvaluacionesPeriodos() {
		return isPermisoConsultaEvaluacionesPeriodos;
	}

	public void setIsPermisoConsultaEvaluacionesPeriodos(Boolean isPermisoConsultaEvaluacionesPeriodos) {
		this.isPermisoConsultaEvaluacionesPeriodos = isPermisoConsultaEvaluacionesPeriodos;
	}

	public Boolean getIsPermisoBusquedaEvaluacionesPeriodos() {
		return isPermisoBusquedaEvaluacionesPeriodos;
	}

	public void setIsPermisoBusquedaEvaluacionesPeriodos(Boolean isPermisoBusquedaEvaluacionesPeriodos) {
		this.isPermisoBusquedaEvaluacionesPeriodos = isPermisoBusquedaEvaluacionesPeriodos;
	}

	public Boolean getIsPermisoReporteEvaluacionesPeriodos() {
		return isPermisoReporteEvaluacionesPeriodos;
	}

	public void setIsPermisoReporteEvaluacionesPeriodos(Boolean isPermisoReporteEvaluacionesPeriodos) {
		this.isPermisoReporteEvaluacionesPeriodos = isPermisoReporteEvaluacionesPeriodos;
	}
	
	public Boolean getIsPermisoPaginacionMedioEvaluacionesPeriodos() {
		return isPermisoPaginacionMedioEvaluacionesPeriodos;
	}

	public void setIsPermisoPaginacionMedioEvaluacionesPeriodos(Boolean isPermisoPaginacionMedioEvaluacionesPeriodos) {
		this.isPermisoPaginacionMedioEvaluacionesPeriodos = isPermisoPaginacionMedioEvaluacionesPeriodos;
	}
	
	public Boolean getIsPermisoPaginacionTodoEvaluacionesPeriodos() {
		return isPermisoPaginacionTodoEvaluacionesPeriodos;
	}

	public void setIsPermisoPaginacionTodoEvaluacionesPeriodos(Boolean isPermisoPaginacionTodoEvaluacionesPeriodos) {
		this.isPermisoPaginacionTodoEvaluacionesPeriodos = isPermisoPaginacionTodoEvaluacionesPeriodos;
	}
	
	public Boolean getIsPermisoPaginacionAltoEvaluacionesPeriodos() {
		return isPermisoPaginacionAltoEvaluacionesPeriodos;
	}

	public void setIsPermisoPaginacionAltoEvaluacionesPeriodos(Boolean isPermisoPaginacionAltoEvaluacionesPeriodos) {
		this.isPermisoPaginacionAltoEvaluacionesPeriodos = isPermisoPaginacionAltoEvaluacionesPeriodos;
	}
	
	public Boolean getIsPermisoCopiarEvaluacionesPeriodos() {
		return isPermisoCopiarEvaluacionesPeriodos;
	}

	public void setIsPermisoCopiarEvaluacionesPeriodos(Boolean isPermisoCopiarEvaluacionesPeriodos) {
		this.isPermisoCopiarEvaluacionesPeriodos = isPermisoCopiarEvaluacionesPeriodos;
	}
	
	public Boolean getIsPermisoVerFormEvaluacionesPeriodos() {
		return isPermisoVerFormEvaluacionesPeriodos;
	}

	public void setIsPermisoVerFormEvaluacionesPeriodos(Boolean isPermisoVerFormEvaluacionesPeriodos) {
		this.isPermisoVerFormEvaluacionesPeriodos = isPermisoVerFormEvaluacionesPeriodos;
	}
	
	public Boolean getIsPermisoDuplicarEvaluacionesPeriodos() {
		return isPermisoDuplicarEvaluacionesPeriodos;
	}

	public void setIsPermisoDuplicarEvaluacionesPeriodos(Boolean isPermisoDuplicarEvaluacionesPeriodos) {
		this.isPermisoDuplicarEvaluacionesPeriodos = isPermisoDuplicarEvaluacionesPeriodos;
	}
	
	public Boolean getIsPermisoOrdenEvaluacionesPeriodos() {
		return isPermisoOrdenEvaluacionesPeriodos;
	}

	public void setIsPermisoOrdenEvaluacionesPeriodos(Boolean isPermisoOrdenEvaluacionesPeriodos) {
		this.isPermisoOrdenEvaluacionesPeriodos = isPermisoOrdenEvaluacionesPeriodos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEvaluacionesPeriodos() {
		return isVisibilidadCeldaNuevoEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaNuevoEvaluacionesPeriodos(Boolean isVisibilidadCeldaNuevoEvaluacionesPeriodos) {
		this.isVisibilidadCeldaNuevoEvaluacionesPeriodos = isVisibilidadCeldaNuevoEvaluacionesPeriodos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEvaluacionesPeriodos() {
		return isVisibilidadCeldaDuplicarEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaDuplicarEvaluacionesPeriodos(Boolean isVisibilidadCeldaDuplicarEvaluacionesPeriodos) {
		this.isVisibilidadCeldaDuplicarEvaluacionesPeriodos = isVisibilidadCeldaDuplicarEvaluacionesPeriodos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEvaluacionesPeriodos() {
		return isVisibilidadCeldaCopiarEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaCopiarEvaluacionesPeriodos(Boolean isVisibilidadCeldaCopiarEvaluacionesPeriodos) {
		this.isVisibilidadCeldaCopiarEvaluacionesPeriodos = isVisibilidadCeldaCopiarEvaluacionesPeriodos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEvaluacionesPeriodos() {
		return isVisibilidadCeldaVerFormEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaVerFormEvaluacionesPeriodos(Boolean isVisibilidadCeldaVerFormEvaluacionesPeriodos) {
		this.isVisibilidadCeldaVerFormEvaluacionesPeriodos = isVisibilidadCeldaVerFormEvaluacionesPeriodos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEvaluacionesPeriodos() {
		return isVisibilidadCeldaOrdenEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaOrdenEvaluacionesPeriodos(Boolean isVisibilidadCeldaOrdenEvaluacionesPeriodos) {
		this.isVisibilidadCeldaOrdenEvaluacionesPeriodos = isVisibilidadCeldaOrdenEvaluacionesPeriodos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos() {
		return isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos(Boolean isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos) {
		this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos = isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEvaluacionesPeriodos() {
		return isVisibilidadCeldaModificarEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaModificarEvaluacionesPeriodos(Boolean isVisibilidadCeldaModificarEvaluacionesPeriodos) {
		this.isVisibilidadCeldaModificarEvaluacionesPeriodos = isVisibilidadCeldaModificarEvaluacionesPeriodos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEvaluacionesPeriodos() {
		return isVisibilidadCeldaActualizarEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaActualizarEvaluacionesPeriodos(Boolean isVisibilidadCeldaActualizarEvaluacionesPeriodos) {
		this.isVisibilidadCeldaActualizarEvaluacionesPeriodos = isVisibilidadCeldaActualizarEvaluacionesPeriodos;
	}

	public Boolean getIsVisibilidadCeldaEliminarEvaluacionesPeriodos() {
		return isVisibilidadCeldaEliminarEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaEliminarEvaluacionesPeriodos(Boolean isVisibilidadCeldaEliminarEvaluacionesPeriodos) {
		this.isVisibilidadCeldaEliminarEvaluacionesPeriodos = isVisibilidadCeldaEliminarEvaluacionesPeriodos;
	}

	public Boolean getIsVisibilidadCeldaCancelarEvaluacionesPeriodos() {
		return isVisibilidadCeldaCancelarEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaCancelarEvaluacionesPeriodos(Boolean isVisibilidadCeldaCancelarEvaluacionesPeriodos) {
		this.isVisibilidadCeldaCancelarEvaluacionesPeriodos = isVisibilidadCeldaCancelarEvaluacionesPeriodos;
	}

	public Boolean getIsVisibilidadCeldaGuardarEvaluacionesPeriodos() {
		return isVisibilidadCeldaGuardarEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaGuardarEvaluacionesPeriodos(Boolean isVisibilidadCeldaGuardarEvaluacionesPeriodos) {
		this.isVisibilidadCeldaGuardarEvaluacionesPeriodos = isVisibilidadCeldaGuardarEvaluacionesPeriodos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos() {
		return isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos(Boolean isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos) {
		this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos = isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos;
	}
		
	public EvaluacionesPeriodosSessionBean getevaluacionesperiodosSessionBean() {
		return this.evaluacionesperiodosSessionBean;
	}
	
	public void setevaluacionesperiodosSessionBean(EvaluacionesPeriodosSessionBean evaluacionesperiodosSessionBean) {
		this.evaluacionesperiodosSessionBean=evaluacionesperiodosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaEvaluacionesPeriodos() {
		return this.isVisibilidadBusquedaEvaluacionesPeriodos;
	}

	public void setisVisibilidadBusquedaEvaluacionesPeriodos(Boolean isVisibilidadBusquedaEvaluacionesPeriodos) {
		this.isVisibilidadBusquedaEvaluacionesPeriodos=isVisibilidadBusquedaEvaluacionesPeriodos;
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

	public Boolean getisVisibilidadFK_IdTipoEvaluacionEmpleado() {
		return this.isVisibilidadFK_IdTipoEvaluacionEmpleado;
	}

	public void setisVisibilidadFK_IdTipoEvaluacionEmpleado(Boolean isVisibilidadFK_IdTipoEvaluacionEmpleado) {
		this.isVisibilidadFK_IdTipoEvaluacionEmpleado=isVisibilidadFK_IdTipoEvaluacionEmpleado;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos)throws Exception {
		try {
			
				this.setActualParaGuardarTipoCalificacionEmpleadoForeignKey(evaluacionesperiodos,null);
				this.setActualParaGuardarEstructuraForeignKey(evaluacionesperiodos,null);
				this.setActualParaGuardarEmpresaForeignKey(evaluacionesperiodos,null);
				this.setActualParaGuardarSucursalForeignKey(evaluacionesperiodos,null);
				this.setActualParaGuardarEjercicioForeignKey(evaluacionesperiodos,null);
				this.setActualParaGuardarTipoEvaluacionEmpleadoForeignKey(evaluacionesperiodos,null);
				this.setActualParaGuardarFormatoNomiPreguntaNomiForeignKey(evaluacionesperiodos,null);
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
	
	public void bugActualizarReferenciaActual(EvaluacionesPeriodos evaluacionesperiodos,EvaluacionesPeriodos evaluacionesperiodosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEvaluacionesPeriodos(evaluacionesperiodos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		evaluacionesperiodosAux.setId(evaluacionesperiodos.getId());
		evaluacionesperiodosAux.setVersionRow(evaluacionesperiodos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(EvaluacionesPeriodos evaluacionesperiodosLocal) throws Exception {
		
		if(this.evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EvaluacionesPeriodos evaluacionesperiodosLocal) throws Exception {	
		if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoCalificacionEmpleadoDetalleFormJInternalFrame.class)) {
				TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrameLocal=(TipoCalificacionEmpleadoBeanSwingJInternalFrame) ((TipoCalificacionEmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocalificacionempleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCalificacionEmpleado(tipocalificacionempleadoBeanSwingJInternalFrameLocal.gettipocalificacionempleado(),true);
				tipocalificacionempleadoBeanSwingJInternalFrameLocal.actualizarLista(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado,this.tipocalificacionempleadosForeignKey);

				tipocalificacionempleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado);

				evaluacionesperiodosLocal.setTipoCalificacionEmpleado(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado);

				this.addItemDefectoCombosForeignKeyTipoCalificacionEmpleado();
				this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey("Formulario");
				this.setActualTipoCalificacionEmpleadoForeignKey(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				evaluacionesperiodosLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				evaluacionesperiodosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				evaluacionesperiodosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				evaluacionesperiodosLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoEvaluacionEmpleadoDetalleFormJInternalFrame.class)) {
				TipoEvaluacionEmpleadoBeanSwingJInternalFrame tipoevaluacionempleadoBeanSwingJInternalFrameLocal=(TipoEvaluacionEmpleadoBeanSwingJInternalFrame) ((TipoEvaluacionEmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoevaluacionempleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoEvaluacionEmpleado(tipoevaluacionempleadoBeanSwingJInternalFrameLocal.gettipoevaluacionempleado(),true);
				tipoevaluacionempleadoBeanSwingJInternalFrameLocal.actualizarLista(tipoevaluacionempleadoBeanSwingJInternalFrameLocal.tipoevaluacionempleado,this.tipoevaluacionempleadosForeignKey);

				tipoevaluacionempleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoevaluacionempleadoBeanSwingJInternalFrameLocal.tipoevaluacionempleado);

				evaluacionesperiodosLocal.setTipoEvaluacionEmpleado(tipoevaluacionempleadoBeanSwingJInternalFrameLocal.tipoevaluacionempleado);

				this.addItemDefectoCombosForeignKeyTipoEvaluacionEmpleado();
				this.cargarCombosFrameTipoEvaluacionEmpleadosForeignKey("Formulario");
				this.setActualTipoEvaluacionEmpleadoForeignKey(tipoevaluacionempleadoBeanSwingJInternalFrameLocal.tipoevaluacionempleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoNomiPreguntaNomiDetalleFormJInternalFrame.class)) {
				FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrameLocal=(FormatoNomiPreguntaNomiBeanSwingJInternalFrame) ((FormatoNomiPreguntaNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatonomipreguntanomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormatoNomiPreguntaNomi(formatonomipreguntanomiBeanSwingJInternalFrameLocal.getformatonomipreguntanomi(),true);
				formatonomipreguntanomiBeanSwingJInternalFrameLocal.actualizarLista(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi,this.formatonomipreguntanomisForeignKey);

				formatonomipreguntanomiBeanSwingJInternalFrameLocal.actualizarRelaciones(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi);

				evaluacionesperiodosLocal.setFormatoNomiPreguntaNomi(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi);

				this.addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi();
				this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey("Formulario");
				this.setActualFormatoNomiPreguntaNomiForeignKey(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEvaluacionesPeriodosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = evaluacionesperiodosValidator.getInvalidValues(this.evaluacionesperiodos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EvaluacionesPeriodos evaluacionesperiodos,List<EvaluacionesPeriodos> evaluacionesperiodoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(EvaluacionesPeriodos evaluacionesperiodos,List<EvaluacionesPeriodos> evaluacionesperiodoss) throws Exception {
		try	{			
			EvaluacionesPeriodosConstantesFunciones.actualizarSelectedLista(evaluacionesperiodos,evaluacionesperiodoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EvaluacionesPeriodos> evaluacionesperiodossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				evaluacionesperiodossLocal=this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				evaluacionesperiodossLocal=this.evaluacionesperiodoss;
			}
			//ARCHITECTURE
		
			for(EvaluacionesPeriodos evaluacionesperiodosLocal:evaluacionesperiodossLocal) {
				if(this.permiteMantenimiento(evaluacionesperiodosLocal) && evaluacionesperiodosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EvaluacionesPeriodosConstantesFunciones.getEvaluacionesPeriodosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EvaluacionesPeriodosConstantesFunciones.CODIGODATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelcodigo_datoEvaluacionesPeriodos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesPeriodosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelnombre_completoEvaluacionesPeriodos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesPeriodosConstantesFunciones.IDFORMATONOMIPREGUNTANOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesPeriodosConstantesFunciones.VALORCONOCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelvalor_conocimientoEvaluacionesPeriodos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesPeriodosConstantesFunciones.VALOREFICIENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelvalor_eficienciaEvaluacionesPeriodos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesPeriodosConstantesFunciones.VALOROBTENIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelvalor_obtenidoEvaluacionesPeriodos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionesPeriodosConstantesFunciones.PROMEDIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelpromedioEvaluacionesPeriodos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelcodigo_datoEvaluacionesPeriodos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelnombre_completoEvaluacionesPeriodos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelvalor_conocimientoEvaluacionesPeriodos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelvalor_eficienciaEvaluacionesPeriodos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelvalor_obtenidoEvaluacionesPeriodos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelpromedioEvaluacionesPeriodos,"");
		
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
		this.iIdNuevoEvaluacionesPeriodos--;	
		
		
		this.evaluacionesperiodosAux=new EvaluacionesPeriodos();
		
		this.evaluacionesperiodosAux.setId(this.iIdNuevoEvaluacionesPeriodos);
		this.evaluacionesperiodosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().add(this.evaluacionesperiodosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.evaluacionesperiodoss.add(this.evaluacionesperiodosAux);
		}
		//ARCHITECTURE
		
		this.evaluacionesperiodos=this.evaluacionesperiodosAux;
		
		if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEvaluacionesPeriodos(this.evaluacionesperiodos);
			this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesPeriodos(this.evaluacionesperiodos);
		}
				
		//this.setDefaultControlesEvaluacionesPeriodos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEvaluacionesPeriodos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEvaluacionesPeriodos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionesPeriodos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodosBean,this.evaluacionesperiodos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEvaluacionesPeriodos(this.evaluacionesperiodosReturnGeneral,this.evaluacionesperiodosBean,false);
		
		if(this.evaluacionesperiodosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesPeriodos(this.evaluacionesperiodosReturnGeneral.getEvaluacionesPeriodos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEvaluacionesPeriodos(this.evaluacionesperiodosReturnGeneral.getEvaluacionesPeriodos());
		}
		
		if(this.evaluacionesperiodosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEvaluacionesPeriodos(this.evaluacionesperiodosReturnGeneral.getEvaluacionesPeriodos(),classes);//this.evaluacionesperiodosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEvaluacionesPeriodos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEvaluacionesPeriodos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.RecargarFormEvaluacionesPeriodos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEvaluacionesPeriodos(false);
						
			if(evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionesPeriodos();
			}
			
			this.actualizarVisualTableDatosEvaluacionesPeriodos();
			
			this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesPeriodos(), this.getIndiceNuevoEvaluacionesPeriodos());
			
			this.seleccionarFilaTablaEvaluacionesPeriodosActual();
						
			this.actualizarEstadoCeldasBotonesEvaluacionesPeriodos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEvaluacionesPeriodos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jCheckBoxverificadoEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarverificadoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigoEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarcodigoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigo_datoEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarcodigo_datoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextAreanombre_completoEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarnombre_completoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_conocimientoEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarvalor_conocimientoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_eficienciaEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarvalor_eficienciaEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_obtenidoEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarvalor_obtenidoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldpromedioEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarpromedioEvaluacionesPeriodos);	
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarid_tipo_calificacion_empleadoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarid_estructuraEvaluacionesPeriodos);//
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarid_empresaEvaluacionesPeriodos);//
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarid_sucursalEvaluacionesPeriodos);//
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarid_ejercicioEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarid_tipo_evaluacion_empleadoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setEnabled(isHabilitar && this.evaluacionesperiodosConstantesFunciones.activarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos);
	};
	
	public void setDefaultControlesEvaluacionesPeriodos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEvaluacionesPeriodos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.evaluacionesperiodosSessionBean.setConGuardarRelaciones(true);			
			this.evaluacionesperiodosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTabbedPaneRelacionesEvaluacionesPeriodos.setVisible(true);
			
					
		} else {
			//this.evaluacionesperiodosSessionBean.setConGuardarRelaciones(false);			
			this.evaluacionesperiodosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTabbedPaneRelacionesEvaluacionesPeriodos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEvaluacionesPeriodos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
				if(evaluacionesperiodosAux.getId().equals(this.iIdNuevoEvaluacionesPeriodos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodoss) {
				if(evaluacionesperiodosAux.getId().equals(this.iIdNuevoEvaluacionesPeriodos)) {
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
	
	public int getIndiceActualEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
				if(evaluacionesperiodosAux.getId().equals(evaluacionesperiodos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodoss) {
				if(evaluacionesperiodosAux.getId().equals(evaluacionesperiodos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
				if(evaluacionesperiodosAux.getEvaluacionesPeriodosOriginal().getId().equals(evaluacionesperiodosOriginal.getId())) {
					existe=true;
					evaluacionesperiodosOriginal.setId(evaluacionesperiodosAux.getId());
					evaluacionesperiodosOriginal.setVersionRow(evaluacionesperiodosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodoss) {
				if(evaluacionesperiodosAux.getEvaluacionesPeriodosOriginal().getId().equals(evaluacionesperiodosOriginal.getId())) {
					existe=true;
					evaluacionesperiodosOriginal.setId(evaluacionesperiodosAux.getId());
					evaluacionesperiodosOriginal.setVersionRow(evaluacionesperiodosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEvaluacionesPeriodos(Boolean esParaCancelar) throws Exception {
		evaluacionesperiodossAux=new ArrayList<EvaluacionesPeriodos>();
		evaluacionesperiodosAux=new EvaluacionesPeriodos();
		
		if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
					if(evaluacionesperiodosAux.getId()<0) {
						evaluacionesperiodossAux.add(evaluacionesperiodosAux);
					}		
				}
				this.iIdNuevoEvaluacionesPeriodos=0L;
				this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().removeAll(evaluacionesperiodossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodoss) {
					if(evaluacionesperiodosAux.getId()<0) {
						evaluacionesperiodossAux.add(evaluacionesperiodosAux);
					}		
				}
				this.iIdNuevoEvaluacionesPeriodos=0L;
				this.evaluacionesperiodoss.removeAll(evaluacionesperiodossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEvaluacionesPeriodos 
					&& this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().size()>0
					) {
					evaluacionesperiodosAux=this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().get(this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().size() - 1);
				
					if(evaluacionesperiodosAux.getId()<0) {
						this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().remove(evaluacionesperiodosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEvaluacionesPeriodos && this.evaluacionesperiodoss.size()>0) {
					evaluacionesperiodosAux=this.evaluacionesperiodoss.get(this.evaluacionesperiodoss.size() - 1);
				
					if(evaluacionesperiodosAux.getId()<0) {
						this.evaluacionesperiodoss.remove(evaluacionesperiodosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEvaluacionesPeriodos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(evaluacionesperiodos.getId()<0) {
				this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().remove(this.evaluacionesperiodos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(evaluacionesperiodos.getId()<0) {
				this.evaluacionesperiodoss.remove(this.evaluacionesperiodos);
			}
		}			
	}
	
	public void setEstadosInicialesEvaluacionesPeriodos(List<EvaluacionesPeriodos> evaluacionesperiodossAux) throws Exception {
		EvaluacionesPeriodosConstantesFunciones.setEstadosInicialesEvaluacionesPeriodos(evaluacionesperiodossAux);
	}
	
	public void setEstadosInicialesEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodosAux) throws Exception {
		EvaluacionesPeriodosConstantesFunciones.setEstadosInicialesEvaluacionesPeriodos(evaluacionesperiodosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEvaluacionesPeriodosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEvaluacionesPeriodos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEvaluacionesPeriodosActual()) {
				if(!this.isEsNuevoEvaluacionesPeriodos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEvaluacionesPeriodos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEvaluacionesPeriodos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEvaluacionesPeriodosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Evaluaciones Periodos ?", "MANTENIMIENTO DE Evaluaciones Periodos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEvaluacionesPeriodos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EvaluacionesPeriodos evaluacionesperiodos) throws Exception {
		EvaluacionesPeriodosConstantesFunciones.seleccionarAsignar(this.evaluacionesperiodos,evaluacionesperiodos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEvaluacionesPeriodos=this.isPermisoActualizarOriginalEvaluacionesPeriodos;
			
			
			this.seleccionarAsignar(evaluacionesperiodos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesEvaluacionesPeriodos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.evaluacionesperiodosSessionBean.setsFuncionBusquedaRapida(this.evaluacionesperiodosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEvaluacionesPeriodos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEvaluacionesPeriodos(esParaCancelar);				
				this.cancelarNuevoEvaluacionesPeriodos(esParaCancelar);								
			}
			
			this.evaluacionesperiodos=new EvaluacionesPeriodos();
			
			this.inicializarEvaluacionesPeriodos();
			
			this.actualizarEstadoCeldasBotonesEvaluacionesPeriodos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEvaluacionesPeriodos() throws Exception {
		try {
			EvaluacionesPeriodosConstantesFunciones.inicializarEvaluacionesPeriodos(this.evaluacionesperiodos);
			
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
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEvaluacionesPeriodoss(String sAccionBusqueda,List<EvaluacionesPeriodos> evaluacionesperiodossParaReportes) throws Exception {
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
					sPathReporteFinal="EvaluacionesPeriodos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EvaluacionesPeriodosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EvaluacionesPeriodosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EvaluacionesPeriodos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Evaluaciones Periodoses");		
		parameters.put("busquedapor", EvaluacionesPeriodosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEvaluacionesPeriodos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EvaluacionesPeriodosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EvaluacionesPeriodosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEvaluacionesPeriodos=new JRBeanArrayDataSource(EvaluacionesPeriodosJInternalFrame.TraerEvaluacionesPeriodosBeans(evaluacionesperiodossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEvaluacionesPeriodos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EvaluacionesPeriodosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EvaluacionesPeriodosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EvaluacionesPeriodosBean.TraerEvaluacionesPeriodosBeans(evaluacionesperiodossParaReportes).toArray()));
							
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
				this.generarExcelReporteEvaluacionesPeriodoss(sAccionBusqueda,sTipoArchivoReporte,evaluacionesperiodossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEvaluacionesPeriodoss(sAccionBusqueda,sTipoArchivoReporte,evaluacionesperiodossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodosActionPerformed(null);
					//this.generarExcelReporteEvaluacionesPeriodoss(sAccionBusqueda,sTipoArchivoReporte,evaluacionesperiodossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEvaluacionesPeriodoss(sAccionBusqueda,sTipoArchivoReporte,evaluacionesperiodossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEvaluacionesPeriodoss(sAccionBusqueda,sTipoArchivoReporte,evaluacionesperiodossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEvaluacionesPeriodoss(sAccionBusqueda,sTipoArchivoReporte,evaluacionesperiodossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEvaluacionesPeriodoss(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionesPeriodos> evaluacionesperiodossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesperiodos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionesPeriodoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEvaluacionesPeriodos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EvaluacionesPeriodos evaluacionesperiodos : evaluacionesperiodossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EvaluacionesPeriodosConstantesFunciones.generarExcelReporteDataEvaluacionesPeriodos("NORMAL",row,workbook,evaluacionesperiodos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Periodos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEvaluacionesPeriodos(String sTipo,Row row,Workbook workbook) {
		
		EvaluacionesPeriodosConstantesFunciones.generarExcelReporteHeaderEvaluacionesPeriodos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEvaluacionesPeriodoss(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionesPeriodos> evaluacionesperiodossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesperiodos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionesPeriodoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EvaluacionesPeriodos evaluacionesperiodos : evaluacionesperiodossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.getEvaluacionesPeriodosDescripcion(evaluacionesperiodos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.gettipocalificacionempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_VERIFICADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VERIFICADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(evaluacionesperiodos.getverificado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.gettipoevaluacionempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getcodigo_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getformatonomipreguntanomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getvalor_conocimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getvalor_eficiencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getvalor_obtenido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionesperiodos.getpromedio());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Periodos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEvaluacionesPeriodoss(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionesPeriodos> evaluacionesperiodossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EvaluacionesPeriodos> evaluacionesperiodossRespaldo=null;
		
		classes=EvaluacionesPeriodosConstantesFunciones.getClassesRelationshipsOfEvaluacionesPeriodos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.evaluacionesperiodosLogic.setDatosCliente(this.datosCliente);
		this.evaluacionesperiodosLogic.setDatosDeep(this.datosDeep);
		this.evaluacionesperiodosLogic.setIsConDeep(true);
		
		evaluacionesperiodossRespaldo=this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss();
		
		this.evaluacionesperiodosLogic.setEvaluacionesPeriodoss(evaluacionesperiodossParaReportes);	
		this.evaluacionesperiodosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		evaluacionesperiodossParaReportes=this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss();
		this.evaluacionesperiodosLogic.setEvaluacionesPeriodoss(evaluacionesperiodossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesperiodos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionesPeriodoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEvaluacionesPeriodos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EvaluacionesPeriodos evaluacionesperiodos : evaluacionesperiodossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEvaluacionesPeriodos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EvaluacionesPeriodosConstantesFunciones.generarExcelReporteDataEvaluacionesPeriodos("NORMAL",row,workbook,evaluacionesperiodos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.getEvaluacionesPeriodosDescripcion(evaluacionesperiodos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Periodos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEvaluacionesPeriodos() throws Exception {		
		this.startProcessEvaluacionesPeriodos(true);
	}
	
	public void startProcessEvaluacionesPeriodos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEvaluacionesPeriodos ,this.jPanelParametrosReportesEvaluacionesPeriodos, this.jScrollPanelDatosEvaluacionesPeriodos,this.jPanelPaginacionEvaluacionesPeriodos, this.jScrollPanelDatosEdicionEvaluacionesPeriodos, this.jPanelAccionesEvaluacionesPeriodos,this.jPanelAccionesFormularioEvaluacionesPeriodos,this.jmenuBarEvaluacionesPeriodos,this.jmenuBarDetalleEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,this.jTtoolBarDetalleEvaluacionesPeriodos);		
		
		final JTabbedPane jTabbedPaneBusquedasEvaluacionesPeriodos=this.jTabbedPaneBusquedasEvaluacionesPeriodos; 
		
		final JPanel jPanelParametrosReportesEvaluacionesPeriodos=this.jPanelParametrosReportesEvaluacionesPeriodos;
		//final JScrollPane jScrollPanelDatosEvaluacionesPeriodos=this.jScrollPanelDatosEvaluacionesPeriodos;
		final JTable jTableDatosEvaluacionesPeriodos=this.jTableDatosEvaluacionesPeriodos;		
		final JPanel jPanelPaginacionEvaluacionesPeriodos=this.jPanelPaginacionEvaluacionesPeriodos;
		//final JScrollPane jScrollPanelDatosEdicionEvaluacionesPeriodos=this.jScrollPanelDatosEdicionEvaluacionesPeriodos;
		final JPanel jPanelAccionesEvaluacionesPeriodos=this.jPanelAccionesEvaluacionesPeriodos;
		
		JPanel jPanelCamposAuxiliarEvaluacionesPeriodos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEvaluacionesPeriodos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			jPanelCamposAuxiliarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelCamposEvaluacionesPeriodos;
			jPanelAccionesFormularioAuxiliarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelAccionesFormularioEvaluacionesPeriodos;
		}
		
		final JPanel jPanelCamposEvaluacionesPeriodos=jPanelCamposAuxiliarEvaluacionesPeriodos;
		final JPanel jPanelAccionesFormularioEvaluacionesPeriodos=jPanelAccionesFormularioAuxiliarEvaluacionesPeriodos;
		
		
		final JMenuBar jmenuBarEvaluacionesPeriodos=this.jmenuBarEvaluacionesPeriodos;
		final JToolBar jTtoolBarEvaluacionesPeriodos=this.jTtoolBarEvaluacionesPeriodos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEvaluacionesPeriodos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEvaluacionesPeriodos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			jmenuBarDetalleAuxiliarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jmenuBarDetalleEvaluacionesPeriodos;
			jTtoolBarDetalleAuxiliarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTtoolBarDetalleEvaluacionesPeriodos;
		}
		
		final JMenuBar jmenuBarDetalleEvaluacionesPeriodos=jmenuBarDetalleAuxiliarEvaluacionesPeriodos;
		final JToolBar jTtoolBarDetalleEvaluacionesPeriodos=jTtoolBarDetalleAuxiliarEvaluacionesPeriodos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEvaluacionesPeriodos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEvaluacionesPeriodos;
			processRunnable.jTableDatos=jTableDatosEvaluacionesPeriodos;
			processRunnable.jPanelCampos=jPanelCamposEvaluacionesPeriodos;
			processRunnable.jPanelPaginacion=jPanelPaginacionEvaluacionesPeriodos;
			processRunnable.jPanelAcciones=jPanelAccionesEvaluacionesPeriodos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEvaluacionesPeriodos;
			
			
			processRunnable.jmenuBar=jmenuBarEvaluacionesPeriodos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEvaluacionesPeriodos;
			processRunnable.jTtoolBar=jTtoolBarEvaluacionesPeriodos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEvaluacionesPeriodos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEvaluacionesPeriodos ,jPanelParametrosReportesEvaluacionesPeriodos,jTableDatosEvaluacionesPeriodos, /*jScrollPanelDatosEvaluacionesPeriodos,*/jPanelCamposEvaluacionesPeriodos,jPanelPaginacionEvaluacionesPeriodos, /*jScrollPanelDatosEdicionEvaluacionesPeriodos,*/ jPanelAccionesEvaluacionesPeriodos,jPanelAccionesFormularioEvaluacionesPeriodos,jmenuBarEvaluacionesPeriodos,jmenuBarDetalleEvaluacionesPeriodos,jTtoolBarEvaluacionesPeriodos,jTtoolBarDetalleEvaluacionesPeriodos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEvaluacionesPeriodos ,jPanelParametrosReportesEvaluacionesPeriodos, jScrollPanelDatosEvaluacionesPeriodos,jPanelPaginacionEvaluacionesPeriodos, jScrollPanelDatosEdicionEvaluacionesPeriodos, jPanelAccionesEvaluacionesPeriodos,jPanelAccionesFormularioEvaluacionesPeriodos,jmenuBarEvaluacionesPeriodos,jmenuBarDetalleEvaluacionesPeriodos,jTtoolBarEvaluacionesPeriodos,jTtoolBarDetalleEvaluacionesPeriodos);
						
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
	
	public void finishProcessEvaluacionesPeriodos() {// throws Exception 
		this.finishProcessEvaluacionesPeriodos(true);
	}
	
	public void finishProcessEvaluacionesPeriodos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEvaluacionesPeriodos ,this.jPanelParametrosReportesEvaluacionesPeriodos, this.jScrollPanelDatosEvaluacionesPeriodos,this.jPanelPaginacionEvaluacionesPeriodos, this.jScrollPanelDatosEdicionEvaluacionesPeriodos, this.jPanelAccionesEvaluacionesPeriodos,this.jPanelAccionesFormularioEvaluacionesPeriodos,this.jmenuBarEvaluacionesPeriodos,this.jmenuBarDetalleEvaluacionesPeriodos,this.jTtoolBarEvaluacionesPeriodos,this.jTtoolBarDetalleEvaluacionesPeriodos);		
		
		final JTabbedPane jTabbedPaneBusquedasEvaluacionesPeriodos=this.jTabbedPaneBusquedasEvaluacionesPeriodos; 
		
		final JPanel jPanelParametrosReportesEvaluacionesPeriodos=this.jPanelParametrosReportesEvaluacionesPeriodos;
		//final JScrollPane jScrollPanelDatosEvaluacionesPeriodos=this.jScrollPanelDatosEvaluacionesPeriodos;
		final JTable jTableDatosEvaluacionesPeriodos=this.jTableDatosEvaluacionesPeriodos;		
		final JPanel jPanelPaginacionEvaluacionesPeriodos=this.jPanelPaginacionEvaluacionesPeriodos;
		//final JScrollPane jScrollPanelDatosEdicionEvaluacionesPeriodos=this.jScrollPanelDatosEdicionEvaluacionesPeriodos;
		final JPanel jPanelAccionesEvaluacionesPeriodos=this.jPanelAccionesEvaluacionesPeriodos;
		
		JPanel jPanelCamposAuxiliarEvaluacionesPeriodos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEvaluacionesPeriodos=new JPanel();
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			jPanelCamposAuxiliarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelCamposEvaluacionesPeriodos;
			jPanelAccionesFormularioAuxiliarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelAccionesFormularioEvaluacionesPeriodos;
		}
		
		final JPanel jPanelCamposEvaluacionesPeriodos=jPanelCamposAuxiliarEvaluacionesPeriodos;
		final JPanel jPanelAccionesFormularioEvaluacionesPeriodos=jPanelAccionesFormularioAuxiliarEvaluacionesPeriodos;
		
		
		final JMenuBar jmenuBarEvaluacionesPeriodos=this.jmenuBarEvaluacionesPeriodos;		
		final JToolBar jTtoolBarEvaluacionesPeriodos=this.jTtoolBarEvaluacionesPeriodos;
				
		JMenuBar jmenuBarDetalleAuxiliarEvaluacionesPeriodos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEvaluacionesPeriodos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			jmenuBarDetalleAuxiliarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jmenuBarDetalleEvaluacionesPeriodos;
			jTtoolBarDetalleAuxiliarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTtoolBarDetalleEvaluacionesPeriodos;		
		}
		
		final JMenuBar jmenuBarDetalleEvaluacionesPeriodos=jmenuBarDetalleAuxiliarEvaluacionesPeriodos;
		final JToolBar jTtoolBarDetalleEvaluacionesPeriodos=jTtoolBarDetalleAuxiliarEvaluacionesPeriodos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEvaluacionesPeriodos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEvaluacionesPeriodos;
			processRunnable.jTableDatos=jTableDatosEvaluacionesPeriodos;
			processRunnable.jPanelCampos=jPanelCamposEvaluacionesPeriodos;
			processRunnable.jPanelPaginacion=jPanelPaginacionEvaluacionesPeriodos;
			processRunnable.jPanelAcciones=jPanelAccionesEvaluacionesPeriodos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEvaluacionesPeriodos;
			
			
			processRunnable.jmenuBar=jmenuBarEvaluacionesPeriodos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEvaluacionesPeriodos;
			processRunnable.jTtoolBar=jTtoolBarEvaluacionesPeriodos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEvaluacionesPeriodos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEvaluacionesPeriodos ,jPanelParametrosReportesEvaluacionesPeriodos, jTableDatosEvaluacionesPeriodos,/*jScrollPanelDatosEvaluacionesPeriodos,*/jPanelCamposEvaluacionesPeriodos,jPanelPaginacionEvaluacionesPeriodos, /*jScrollPanelDatosEdicionEvaluacionesPeriodos,*/ jPanelAccionesEvaluacionesPeriodos,jPanelAccionesFormularioEvaluacionesPeriodos,jmenuBarEvaluacionesPeriodos,jmenuBarDetalleEvaluacionesPeriodos,jTtoolBarEvaluacionesPeriodos,jTtoolBarDetalleEvaluacionesPeriodos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEvaluacionesPeriodos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEvaluacionesPeriodos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEvaluacionesPeriodos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEvaluacionesPeriodos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEvaluacionesPeriodos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEvaluacionesPeriodos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEvaluacionesPeriodos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEvaluacionesPeriodos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEvaluacionesPeriodos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.evaluacionesperiodosConstantesFunciones.getsFinalQueryEvaluacionesPeriodos();
		String  finalQueryPaginacionTodos=this.evaluacionesperiodosConstantesFunciones.getsFinalQueryEvaluacionesPeriodos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EvaluacionesPeriodosConstantesFunciones.getArrayColumnasGlobalesNoEvaluacionesPeriodos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EvaluacionesPeriodosConstantesFunciones.getArrayColumnasGlobalesEvaluacionesPeriodos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EvaluacionesPeriodosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.evaluacionesperiodossEliminados= new ArrayList<EvaluacionesPeriodos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEvaluacionesPeriodos();
		
				///*EvaluacionesPeriodosSessionBean*/this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
			
			if(this.evaluacionesperiodosSessionBean==null) {
				this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
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
					this.iNumeroPaginacion=EvaluacionesPeriodosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EvaluacionesPeriodosConstantesFunciones.getClassesForeignKeysOfEvaluacionesPeriodos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/evaluacionesperiodos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			evaluacionesperiodossAux= new ArrayList<EvaluacionesPeriodos>();
			
				
			evaluacionesperiodosLogic.setDatosCliente(this.datosCliente);
			evaluacionesperiodosLogic.setDatosDeep(this.datosDeep);
			evaluacionesperiodosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaEvaluacionesPeriodos")) {
				this.sDetalleReporte=EvaluacionesPeriodosConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesPeriodos(id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos,verificadoBusquedaEvaluacionesPeriodos,id_estructuraBusquedaEvaluacionesPeriodos,codigoBusquedaEvaluacionesPeriodos,id_ejercicioBusquedaEvaluacionesPeriodos,id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionesperiodosLogic.getEvaluacionesPeriodossBusquedaEvaluacionesPeriodos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos,verificadoBusquedaEvaluacionesPeriodos,id_estructuraBusquedaEvaluacionesPeriodos,codigoBusquedaEvaluacionesPeriodos,id_ejercicioBusquedaEvaluacionesPeriodos,id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionesPeriodosConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesPeriodos(id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos,verificadoBusquedaEvaluacionesPeriodos,id_estructuraBusquedaEvaluacionesPeriodos,codigoBusquedaEvaluacionesPeriodos,id_ejercicioBusquedaEvaluacionesPeriodos,id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionesPeriodosConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesPeriodos(id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos,verificadoBusquedaEvaluacionesPeriodos,id_estructuraBusquedaEvaluacionesPeriodos,codigoBusquedaEvaluacionesPeriodos,id_ejercicioBusquedaEvaluacionesPeriodos,id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionesperiodosLogic.getEvaluacionesPeriodoss()==null||evaluacionesperiodosLogic.getEvaluacionesPeriodoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionesperiodoss==null|| evaluacionesperiodoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesperiodossAux=new ArrayList<EvaluacionesPeriodos>();
						evaluacionesperiodossAux.addAll(evaluacionesperiodosLogic.getEvaluacionesPeriodoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionesperiodossAux=new ArrayList<EvaluacionesPeriodos>();
							evaluacionesperiodossAux.addAll(evaluacionesperiodoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionesperiodosLogic.getEvaluacionesPeriodossBusquedaEvaluacionesPeriodos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos,verificadoBusquedaEvaluacionesPeriodos,id_estructuraBusquedaEvaluacionesPeriodos,codigoBusquedaEvaluacionesPeriodos,id_ejercicioBusquedaEvaluacionesPeriodos,id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionesPeriodosConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesPeriodos(id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos,verificadoBusquedaEvaluacionesPeriodos,id_estructuraBusquedaEvaluacionesPeriodos,codigoBusquedaEvaluacionesPeriodos,id_ejercicioBusquedaEvaluacionesPeriodos,id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionesPeriodosConstantesFunciones.getDetalleIndiceBusquedaEvaluacionesPeriodos(id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos,verificadoBusquedaEvaluacionesPeriodos,id_estructuraBusquedaEvaluacionesPeriodos,codigoBusquedaEvaluacionesPeriodos,id_ejercicioBusquedaEvaluacionesPeriodos,id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionesPeriodoss("BusquedaEvaluacionesPeriodos",evaluacionesperiodosLogic.getEvaluacionesPeriodoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionesPeriodoss("BusquedaEvaluacionesPeriodos",evaluacionesperiodoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesperiodosLogic.setEvaluacionesPeriodoss(new ArrayList<EvaluacionesPeriodos>());
						evaluacionesperiodosLogic.getEvaluacionesPeriodoss().addAll(evaluacionesperiodossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionesperiodoss=new ArrayList<EvaluacionesPeriodos>();
							evaluacionesperiodoss.addAll(evaluacionesperiodossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEvaluacionesPeriodos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEvaluacionesPeriodos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=evaluacionesperiodosLogic.getEvaluacionesPeriodoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionesperiodoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=evaluacionesperiodosLogic.getEvaluacionesPeriodoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionesperiodoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EvaluacionesPeriodos evaluacionesperiodos) {
		Boolean permite=true;
		
		if(this.evaluacionesperiodos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EvaluacionesPeriodosConstantesFunciones.getOrderByListaEvaluacionesPeriodos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EvaluacionesPeriodosConstantesFunciones.getOrderByListaEvaluacionesPeriodos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
				if(evaluacionesperiodos.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesperiodosTotales=evaluacionesperiodos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesPeriodos evaluacionesperiodos:this.evaluacionesperiodoss) {
				if(evaluacionesperiodos.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesperiodosTotales=evaluacionesperiodos;
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
			this.evaluacionesperiodosAux=new EvaluacionesPeriodos();
			this.evaluacionesperiodosAux.setsType(Constantes2.S_TOTALES);
			this.evaluacionesperiodosAux.setIsNew(false);
			this.evaluacionesperiodosAux.setIsChanged(false);
			this.evaluacionesperiodosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//EvaluacionesPeriodosConstantesFunciones.TotalizarValoresFilaEvaluacionesPeriodos(this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss(),this.evaluacionesperiodosAux);
				
				//this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().add(this.evaluacionesperiodosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EvaluacionesPeriodosConstantesFunciones.TotalizarValoresFilaEvaluacionesPeriodos(this.evaluacionesperiodoss,this.evaluacionesperiodosAux);
				
				this.evaluacionesperiodoss.add(this.evaluacionesperiodosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		evaluacionesperiodosTotales=new EvaluacionesPeriodos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().remove(evaluacionesperiodosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.evaluacionesperiodoss.remove(evaluacionesperiodosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		evaluacionesperiodosTotales=new EvaluacionesPeriodos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
				if(evaluacionesperiodos.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesperiodosTotales=evaluacionesperiodos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EvaluacionesPeriodosConstantesFunciones.TotalizarValoresFilaEvaluacionesPeriodos(this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss(),evaluacionesperiodosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionesPeriodos evaluacionesperiodos:this.evaluacionesperiodoss) {
				if(evaluacionesperiodos.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionesperiodosTotales=evaluacionesperiodos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EvaluacionesPeriodosConstantesFunciones.TotalizarValoresFilaEvaluacionesPeriodos(this.evaluacionesperiodoss,evaluacionesperiodosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEvaluacionesPeriodossBusquedaEvaluacionesPeriodos()throws Exception {
		try {
			sAccionBusqueda="BusquedaEvaluacionesPeriodos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesPeriodossFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesPeriodossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesPeriodossFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesPeriodossFK_IdFormatoNomiPreguntaNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormatoNomiPreguntaNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesPeriodossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesPeriodossFK_IdTipoCalificacionEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCalificacionEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionesPeriodossFK_IdTipoEvaluacionEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoEvaluacionEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEvaluacionesPeriodossBusquedaEvaluacionesPeriodos(String sFinalQuery,Long id_tipo_calificacion_empleado,Boolean verificado,Long id_estructura,String codigo,Long id_ejercicio,Long id_tipo_evaluacion_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesperiodosLogic.getEvaluacionesPeriodossBusquedaEvaluacionesPeriodos(sFinalQuery,this.pagination,id_tipo_calificacion_empleado,verificado,id_estructura,codigo,id_ejercicio,id_tipo_evaluacion_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesPeriodossFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesperiodosLogic.getEvaluacionesPeriodossFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesPeriodossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesperiodosLogic.getEvaluacionesPeriodossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesPeriodossFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesperiodosLogic.getEvaluacionesPeriodossFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesPeriodossFK_IdFormatoNomiPreguntaNomi(String sFinalQuery,Long id_formato_nomi_pregunta_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesperiodosLogic.getEvaluacionesPeriodossFK_IdFormatoNomiPreguntaNomi(sFinalQuery,this.pagination,id_formato_nomi_pregunta_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesPeriodossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesperiodosLogic.getEvaluacionesPeriodossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesPeriodossFK_IdTipoCalificacionEmpleado(String sFinalQuery,Long id_tipo_calificacion_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesperiodosLogic.getEvaluacionesPeriodossFK_IdTipoCalificacionEmpleado(sFinalQuery,this.pagination,id_tipo_calificacion_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionesPeriodossFK_IdTipoEvaluacionEmpleado(String sFinalQuery,Long id_tipo_evaluacion_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionesperiodosLogic.getEvaluacionesPeriodossFK_IdTipoEvaluacionEmpleado(sFinalQuery,this.pagination,id_tipo_evaluacion_empleado);
				
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
	
	public void inicializarPermisosEvaluacionesPeriodos() {
		this.isPermisoTodoEvaluacionesPeriodos=false;
		this.isPermisoNuevoEvaluacionesPeriodos=false;
		this.isPermisoActualizarEvaluacionesPeriodos=false;
		this.isPermisoActualizarOriginalEvaluacionesPeriodos=false;
		this.isPermisoEliminarEvaluacionesPeriodos=false;
		this.isPermisoGuardarCambiosEvaluacionesPeriodos=false;
		this.isPermisoConsultaEvaluacionesPeriodos=true;
		this.isPermisoBusquedaEvaluacionesPeriodos=true;
		this.isPermisoReporteEvaluacionesPeriodos=true;
		this.isPermisoOrdenEvaluacionesPeriodos=false;		
		this.isPermisoPaginacionMedioEvaluacionesPeriodos=false;		
		this.isPermisoPaginacionAltoEvaluacionesPeriodos=false;		
		this.isPermisoPaginacionTodoEvaluacionesPeriodos=false;		
		this.isPermisoCopiarEvaluacionesPeriodos=false;		
		this.isPermisoVerFormEvaluacionesPeriodos=false;		
		this.isPermisoDuplicarEvaluacionesPeriodos=false;
		this.isPermisoOrdenEvaluacionesPeriodos=false;
	}
	
	public void setPermisosUsuarioEvaluacionesPeriodos(Boolean isPermiso) {
		this.isPermisoTodoEvaluacionesPeriodos=isPermiso;
		this.isPermisoNuevoEvaluacionesPeriodos=isPermiso;
		this.isPermisoActualizarEvaluacionesPeriodos=isPermiso;
		this.isPermisoActualizarOriginalEvaluacionesPeriodos=isPermiso;
		this.isPermisoEliminarEvaluacionesPeriodos=isPermiso;
		this.isPermisoGuardarCambiosEvaluacionesPeriodos=isPermiso;
		this.isPermisoConsultaEvaluacionesPeriodos=isPermiso;
		this.isPermisoBusquedaEvaluacionesPeriodos=isPermiso;
		this.isPermisoReporteEvaluacionesPeriodos=isPermiso;
		this.isPermisoOrdenEvaluacionesPeriodos=isPermiso;		
		this.isPermisoPaginacionMedioEvaluacionesPeriodos=isPermiso;		
		this.isPermisoPaginacionAltoEvaluacionesPeriodos=isPermiso;		
		this.isPermisoPaginacionTodoEvaluacionesPeriodos=isPermiso;		
		this.isPermisoCopiarEvaluacionesPeriodos=isPermiso;		
		this.isPermisoVerFormEvaluacionesPeriodos=isPermiso;		
		this.isPermisoDuplicarEvaluacionesPeriodos=isPermiso;
		this.isPermisoOrdenEvaluacionesPeriodos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEvaluacionesPeriodos(Boolean isPermiso) {
		//this.isPermisoTodoEvaluacionesPeriodos=isPermiso;
		this.isPermisoNuevoEvaluacionesPeriodos=isPermiso;
		this.isPermisoActualizarEvaluacionesPeriodos=isPermiso;
		this.isPermisoActualizarOriginalEvaluacionesPeriodos=isPermiso;
		this.isPermisoEliminarEvaluacionesPeriodos=isPermiso;
		this.isPermisoGuardarCambiosEvaluacionesPeriodos=isPermiso;
		//this.isPermisoConsultaEvaluacionesPeriodos=isPermiso;
		//this.isPermisoBusquedaEvaluacionesPeriodos=isPermiso;
		//this.isPermisoReporteEvaluacionesPeriodos=isPermiso;
		//this.isPermisoOrdenEvaluacionesPeriodos=isPermiso;		
		//this.isPermisoPaginacionMedioEvaluacionesPeriodos=isPermiso;		
		//this.isPermisoPaginacionAltoEvaluacionesPeriodos=isPermiso;		
		//this.isPermisoPaginacionTodoEvaluacionesPeriodos=isPermiso;		
		//this.isPermisoCopiarEvaluacionesPeriodos=isPermiso;		
		//this.isPermisoDuplicarEvaluacionesPeriodos=isPermiso;
		//this.isPermisoOrdenEvaluacionesPeriodos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEvaluacionesPeriodosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EvaluacionesPeriodosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEvaluacionesPeriodos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEvaluacionesPeriodosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEvaluacionesPeriodosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEvaluacionesPeriodosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEvaluacionesPeriodosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEvaluacionesPeriodos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EvaluacionesPeriodosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EvaluacionesPeriodosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEvaluacionesPeriodos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEvaluacionesPeriodos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEvaluacionesPeriodos=this.isPermisoActualizarEvaluacionesPeriodos;
			this.isPermisoEliminarEvaluacionesPeriodos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEvaluacionesPeriodos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEvaluacionesPeriodos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEvaluacionesPeriodos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEvaluacionesPeriodos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEvaluacionesPeriodos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEvaluacionesPeriodos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEvaluacionesPeriodos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEvaluacionesPeriodos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEvaluacionesPeriodos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEvaluacionesPeriodos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEvaluacionesPeriodos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEvaluacionesPeriodos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEvaluacionesPeriodos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEvaluacionesPeriodos.setToolTipText(this.jTableDatosEvaluacionesPeriodos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEvaluacionesPeriodos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEvaluacionesPeriodos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EvaluacionesPeriodosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EvaluacionesPeriodosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEvaluacionesPeriodos() throws Exception {
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
	public void inicializarCombosForeignKeyEvaluacionesPeriodosListas()throws Exception {
		try	{						
			
				this.tipocalificacionempleadosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.tipoevaluacionempleadosForeignKey=new ArrayList();
				this.formatonomipreguntanomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEvaluacionesPeriodosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EvaluacionesPeriodosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyTipoCalificacionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoEvaluacionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoEvaluacionEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoevaluacionempleadosForeignKey==null||this.tipoevaluacionempleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoEvaluacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesTipoEvaluacionEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoEvaluacionEmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoEvaluacionEmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoEvaluacionEmpleadosForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyEvaluacionesPeriodos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoCalificacionEmpleado();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyTipoEvaluacionEmpleado();
			this.addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoCalificacionEmpleado()throws Exception {
		try {
			if(this.evaluacionesperiodosSessionBean==null) {
				this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean();
			}

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado()) {
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

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyTipoEvaluacionEmpleado()throws Exception {
		try {

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionTipoEvaluacionEmpleado()) {
				TipoEvaluacionEmpleado tipoevaluacionempleado=new TipoEvaluacionEmpleado();
				TipoEvaluacionEmpleadoConstantesFunciones.setTipoEvaluacionEmpleadoDescripcion(tipoevaluacionempleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoevaluacionempleado.setId(null);

				if(!TipoEvaluacionEmpleadoConstantesFunciones.ExisteEnLista(this.tipoevaluacionempleadosForeignKey,tipoevaluacionempleado,true)) {

					this.tipoevaluacionempleadosForeignKey.add(0,tipoevaluacionempleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi()throws Exception {
		try {

			if(!this.evaluacionesperiodosSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi()) {
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
	
	public void initActionsCombosTodosForeignKeyEvaluacionesPeriodos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEvaluacionesPeriodos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEvaluacionesPeriodos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionesPeriodos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos)throws Exception {	
		try {
			
			this.setActualFormatoNomiPreguntaNomiForeignKey(evaluacionesperiodos.getid_formato_nomi_pregunta_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEvaluacionesPeriodos()throws Exception {	
		try {
			
			this.setActualFormatoNomiPreguntaNomiForeignKey(this.evaluacionesperiodosConstantesFunciones.getid_formato_nomi_pregunta_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionesPeriodos()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEvaluacionesPeriodos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEvaluacionesPeriodos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEvaluacionesPeriodos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEvaluacionesPeriodos()throws Exception {
		try {
			

			this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameTipoEvaluacionEmpleadosForeignKey("Todos");
			this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEvaluacionesPeriodos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoEvaluacionEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEvaluacionesPeriodos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public EvaluacionesPeriodosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EvaluacionesPeriodosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EvaluacionesPeriodosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.evaluacionesperiodosSessionBean=new EvaluacionesPeriodosSessionBean(); 
		this.evaluacionesperiodosConstantesFunciones=new EvaluacionesPeriodosConstantesFunciones(); 
		this.evaluacionesperiodosBean=new EvaluacionesPeriodos();//(this.evaluacionesperiodosConstantesFunciones); 		
		this.evaluacionesperiodosReturnGeneral=new EvaluacionesPeriodosParameterReturnGeneral(); 
		
		this.evaluacionesperiodosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionesperiodosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EvaluacionesPeriodosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EvaluacionesPeriodosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EvaluacionesPeriodosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEvaluacionesPeriodos(true);
			
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
			
			this.evaluacionesperiodosConstantesFunciones=new EvaluacionesPeriodosConstantesFunciones(); 
			this.evaluacionesperiodosBean=new EvaluacionesPeriodos();//this.evaluacionesperiodosConstantesFunciones); 			
			this.evaluacionesperiodosReturnGeneral=new EvaluacionesPeriodosParameterReturnGeneral(); 
		
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Evaluaciones Periodos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.evaluacionesperiodos=new EvaluacionesPeriodos();
			this.evaluacionesperiodoss = new ArrayList<EvaluacionesPeriodos>();
			this.evaluacionesperiodossAux = new ArrayList<EvaluacionesPeriodos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic=new EvaluacionesPeriodosLogic();
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}
			
			//this.evaluacionesperiodosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.evaluacionesperiodosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEvaluacionesPeriodos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEvaluacionesPeriodos);	
					}
					
					if(this.jInternalFrameImportacionEvaluacionesPeriodos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEvaluacionesPeriodos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEvaluacionesPeriodos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEvaluacionesPeriodos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEvaluacionesPeriodos);
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.setVisible(false);
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos);
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setVisible(false);
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEvaluacionesPeriodos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEvaluacionesPeriodos);
					this.jInternalFrameImportacionEvaluacionesPeriodos.setVisible(false);
					this.jInternalFrameImportacionEvaluacionesPeriodos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEvaluacionesPeriodos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEvaluacionesPeriodos);
					this.jInternalFrameOrderByEvaluacionesPeriodos.setVisible(false);
					this.jInternalFrameOrderByEvaluacionesPeriodos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEvaluacionesPeriodosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EvaluacionesPeriodosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.evaluacionesperiodosReturnGeneral=new EvaluacionesPeriodosParameterReturnGeneral();
			
			this.evaluacionesperiodosParameterGeneral=new EvaluacionesPeriodosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.evaluacionesperiodosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EvaluacionesPeriodosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EvaluacionesPeriodosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado(),this.evaluacionesperiodosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EvaluacionesPeriodosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado(),this.evaluacionesperiodosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaDuplicarEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaCopiarEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaVerFormEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaOrdenEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaModificarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=false;
			
			
			this.isVisibilidadBusquedaEvaluacionesPeriodos=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoCalificacionEmpleado=true;
			this.isVisibilidadFK_IdTipoEvaluacionEmpleado=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEvaluacionesPeriodos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEvaluacionesPeriodos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEvaluacionesPeriodos(false);
			
			this.setPermisosUsuarioEvaluacionesPeriodos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() 
				|| (this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado() && this.evaluacionesperiodosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEvaluacionesPeriodosClasesRelacionadas();
			}
			
			if(this.evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEvaluacionesPeriodosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEvaluacionesPeriodos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEvaluacionesPeriodos();
			}
			
			if(!this.isPermisoBusquedaEvaluacionesPeriodos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEvaluacionesPeriodos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EvaluacionesPeriodosConstantesFunciones.getTiposSeleccionarEvaluacionesPeriodos());
				
				this.tiposColumnasSelect=EvaluacionesPeriodosConstantesFunciones.getTiposSeleccionarEvaluacionesPeriodos(true);
				
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
			//if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEvaluacionesPeriodos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioEvaluacionesPeriodos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioEvaluacionesPeriodos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesPeriodos() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.tipoevaluacionempleadoLogic=new TipoEvaluacionEmpleadoLogic();
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
				evaluacionesperiodosImplementable= (EvaluacionesPeriodosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EvaluacionesPeriodosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				evaluacionesperiodosImplementableHome= (EvaluacionesPeriodosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EvaluacionesPeriodosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.evaluacionesperiodoss= new ArrayList<EvaluacionesPeriodos>();
			this.evaluacionesperiodossEliminados= new ArrayList<EvaluacionesPeriodos>();
						
			this.isEsNuevoEvaluacionesPeriodos=false;
			this.esParaAccionDesdeFormularioEvaluacionesPeriodos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipocalificacionempleadosForeignKey=new ArrayList<TipoCalificacionEmpleado>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.tipoevaluacionempleadosForeignKey=new ArrayList<TipoEvaluacionEmpleado>() ;
			this.formatonomipreguntanomisForeignKey=new ArrayList<FormatoNomiPreguntaNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEvaluacionesPeriodos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEvaluacionesPeriodos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EvaluacionesPeriodosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEvaluacionesPeriodos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEvaluacionesPeriodos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEvaluacionesPeriodos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEvaluacionesPeriodos();
			}
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEvaluacionesPeriodos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEvaluacionesPeriodos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEvaluacionesPeriodos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEvaluacionesPeriodos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EvaluacionesPeriodos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEvaluacionesPeriodos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEvaluacionesPeriodos")) {
				iIndex=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTabbedPaneRelacionesEvaluacionesPeriodos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTabbedPaneRelacionesEvaluacionesPeriodos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEvaluacionesPeriodos();	
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
	
	public void cargarCombosForeignKeyEvaluacionesPeriodos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEvaluacionesPeriodos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEvaluacionesPeriodos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEvaluacionesPeriodosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEvaluacionesPeriodos();
		
		this.cargarCombosFrameForeignKeyEvaluacionesPeriodos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEvaluacionesPeriodos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEvaluacionesPeriodos();
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

	public void cargarCombosForeignKeyTipoEvaluacionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoEvaluacionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoEvaluacionEmpleado();
				this.cargarCombosFrameTipoEvaluacionEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoEvaluacionEmpleado(this.tipoevaluacionempleadosForeignKey);

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
	
	public void jButtonNuevoEvaluacionesPeriodosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
			
			if(jTableDatosEvaluacionesPeriodos.getRowCount()>=1) {
				jTableDatosEvaluacionesPeriodos.removeRowSelectionInterval(0, jTableDatosEvaluacionesPeriodos.getRowCount()-1);						
			}
			
			this.isEsNuevoEvaluacionesPeriodos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEvaluacionesPeriodos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEvaluacionesPeriodos(true);			
			//this.evaluacionesperiodos=new EvaluacionesPeriodos();
			//this.evaluacionesperiodos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionesPeriodos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesPeriodos() ;
			
			if(EvaluacionesPeriodosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionesPeriodos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.evaluacionesperiodos);	
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);				
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
			if(this.evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EvaluacionesPeriodos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEvaluacionesPeriodosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEvaluacionesPeriodos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEvaluacionesPeriodos.getSelectedRows().length;			
			}
			
			evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEvaluacionesPeriodos--;			
				//EvaluacionesPeriodos evaluacionesperiodosAux= new EvaluacionesPeriodos();			
				//evaluacionesperiodosAux.setId(this.iIdNuevoEvaluacionesPeriodos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EvaluacionesPeriodos evaluacionesperiodosOrigen=new EvaluacionesPeriodos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EvaluacionesPeriodos evaluacionesperiodosOrigen : evaluacionesperiodossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							evaluacionesperiodosOrigen =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionesperiodosOrigen =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEvaluacionesPeriodos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.evaluacionesperiodos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEvaluacionesPeriodos(evaluacionesperiodosOrigen,this.evaluacionesperiodos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().add(this.evaluacionesperiodosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodoss.add(this.evaluacionesperiodosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
				
				this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesPeriodos(), this.getIndiceNuevoEvaluacionesPeriodos());
				
				int iLastRow =  this.jTableDatosEvaluacionesPeriodos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEvaluacionesPeriodos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEvaluacionesPeriodos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();									
		
			EvaluacionesPeriodos evaluacionesperiodosOrigen=new EvaluacionesPeriodos();
			EvaluacionesPeriodos evaluacionesperiodosDestino=new EvaluacionesPeriodos();
				
			evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEvaluacionesPeriodos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || evaluacionesperiodossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEvaluacionesPeriodos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesperiodosOrigen =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						evaluacionesperiodosOrigen =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionesperiodosDestino =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						evaluacionesperiodosDestino =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				evaluacionesperiodosOrigen =evaluacionesperiodossSeleccionados.get(0);
				evaluacionesperiodosDestino =evaluacionesperiodossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEvaluacionesPeriodos(evaluacionesperiodosOrigen,evaluacionesperiodosDestino,true,false);
				
				evaluacionesperiodosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(evaluacionesperiodosDestino,evaluacionesperiodosLogic.getEvaluacionesPeriodoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(evaluacionesperiodosDestino,evaluacionesperiodoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
				
				//this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesPeriodos(), this.getIndiceNuevoEvaluacionesPeriodos());
				
				int iLastRow =  this.jTableDatosEvaluacionesPeriodos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEvaluacionesPeriodos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEvaluacionesPeriodos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEvaluacionesPeriodos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEvaluacionesPeriodos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEvaluacionesPeriodos.setVisible(!isVisible);
			this.jPanelPaginacionEvaluacionesPeriodos.setVisible(!isVisible);
			this.jPanelAccionesEvaluacionesPeriodos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEvaluacionesPeriodos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEvaluacionesPeriodos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEvaluacionesPeriodos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEvaluacionesPeriodos();
			
			this.abrirFrameOrderByEvaluacionesPeriodos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEvaluacionesPeriodos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEvaluacionesPeriodos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEvaluacionesPeriodos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.isMaximum()) {
					this.jInternalFrameDetalleFormEvaluacionesPeriodos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEvaluacionesPeriodos.setSize(this.jInternalFrameDetalleFormEvaluacionesPeriodos.iWidthFormulario,this.jInternalFrameDetalleFormEvaluacionesPeriodos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEvaluacionesPeriodos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEvaluacionesPeriodos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEvaluacionesPeriodos.isMaximum()) {
						this.jInternalFrameDetalleFormEvaluacionesPeriodos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jContentPaneDetalleEvaluacionesPeriodos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTabbedPaneRelacionesEvaluacionesPeriodos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jContentPaneDetalleEvaluacionesPeriodos.getWidth(),EvaluacionesPeriodosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTabbedPaneRelacionesEvaluacionesPeriodos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jContentPaneDetalleEvaluacionesPeriodos.getWidth(),EvaluacionesPeriodosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTabbedPaneRelacionesEvaluacionesPeriodos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jContentPaneDetalleEvaluacionesPeriodos.getWidth(),EvaluacionesPeriodosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEvaluacionesPeriodos.setVisible(true);
	        this.jInternalFrameDetalleFormEvaluacionesPeriodos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEvaluacionesPeriodos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEvaluacionesPeriodos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEvaluacionesPeriodos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesPeriodos,false,this);
				} else {
					this.jInternalFrameOrderByEvaluacionesPeriodos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesPeriodos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEvaluacionesPeriodos);
				this.jInternalFrameOrderByEvaluacionesPeriodos.setVisible(false);
				this.jInternalFrameOrderByEvaluacionesPeriodos.setSelected(false);
				
				this.jInternalFrameOrderByEvaluacionesPeriodos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEvaluacionesPeriodos"));
				
				this.inicializarActualizarBindingTablaOrderByEvaluacionesPeriodos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEvaluacionesPeriodos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEvaluacionesPeriodos==null) {
				
				this.jInternalFrameImportacionEvaluacionesPeriodos=new ImportacionJInternalFrame(EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEvaluacionesPeriodos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEvaluacionesPeriodos);
				this.jInternalFrameImportacionEvaluacionesPeriodos.setVisible(false);
				this.jInternalFrameImportacionEvaluacionesPeriodos.setSelected(false);


				this.jInternalFrameImportacionEvaluacionesPeriodos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEvaluacionesPeriodos"));
				this.jInternalFrameImportacionEvaluacionesPeriodos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEvaluacionesPeriodos"));
				this.jInternalFrameImportacionEvaluacionesPeriodos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEvaluacionesPeriodos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEvaluacionesPeriodos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos==null) {
				this.jInternalFrameReporteDinamicoEvaluacionesPeriodos=new ReporteDinamicoJInternalFrame(EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEvaluacionesPeriodos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos);
				this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setVisible(false);
				this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionesPeriodos"));
				this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionesPeriodos"));
				this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionesPeriodos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionesPeriodos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEvaluacionesPeriodos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEvaluacionesPeriodos);
			
	       	this.jInternalFrameDetalleFormEvaluacionesPeriodos.setVisible(false);
	        this.jInternalFrameDetalleFormEvaluacionesPeriodos.setSelected(false);
			
			//this.jInternalFrameDetalleFormEvaluacionesPeriodos.dispose();
			//this.jInternalFrameDetalleFormEvaluacionesPeriodos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEvaluacionesPeriodos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setVisible(true);
	        this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEvaluacionesPeriodos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEvaluacionesPeriodos.setVisible(true);
	        this.jInternalFrameImportacionEvaluacionesPeriodos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEvaluacionesPeriodos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEvaluacionesPeriodos.setVisible(true);
	        this.jInternalFrameOrderByEvaluacionesPeriodos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEvaluacionesPeriodos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEvaluacionesPeriodos.setVisible(false);
	        this.jInternalFrameOrderByEvaluacionesPeriodos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEvaluacionesPeriodos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setVisible(false);
	        this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEvaluacionesPeriodos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEvaluacionesPeriodos.setVisible(false);
	        this.jInternalFrameImportacionEvaluacionesPeriodos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEvaluacionesPeriodos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEvaluacionesPeriodos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEvaluacionesPeriodos(true);
			//this.isEsNuevoEvaluacionesPeriodos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEvaluacionesPeriodos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionesPeriodos(false) ;
			
			if(evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EvaluacionesPeriodosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionesPeriodos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesPeriodos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEvaluacionesPeriodosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEvaluacionesPeriodos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEvaluacionesPeriodos(true);
			//this.isEsNuevoEvaluacionesPeriodos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.evaluacionesperiodos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEvaluacionesPeriodos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEvaluacionesPeriodos(false) ;
			
			if(EvaluacionesPeriodosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionesPeriodos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesPeriodos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoCalificacionEmpleado(List<TipoCalificacionEmpleado> tipocalificacionempleadosForeignKey)throws Exception{
		TableColumn tableColumnTipoCalificacionEmpleado=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO));
		TableCellEditor tableCellEditorTipoCalificacionEmpleado =tableColumnTipoCalificacionEmpleado.getCellEditor();

		TipoCalificacionEmpleadoTableCell tipocalificacionempleadoTableCellFk=(TipoCalificacionEmpleadoTableCell)tableCellEditorTipoCalificacionEmpleado;

		if(tipocalificacionempleadoTableCellFk!=null) {
			tipocalificacionempleadoTableCellFk.settipocalificacionempleadosForeignKey(tipocalificacionempleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

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
		TableColumn tableColumnEstructura=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
				
	
	public void recargarComboTablaTipoEvaluacionEmpleado(List<TipoEvaluacionEmpleado> tipoevaluacionempleadosForeignKey)throws Exception{
		TableColumn tableColumnTipoEvaluacionEmpleado=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO));
		TableCellEditor tableCellEditorTipoEvaluacionEmpleado =tableColumnTipoEvaluacionEmpleado.getCellEditor();

		TipoEvaluacionEmpleadoTableCell tipoevaluacionempleadoTableCellFk=(TipoEvaluacionEmpleadoTableCell)tableCellEditorTipoEvaluacionEmpleado;

		if(tipoevaluacionempleadoTableCellFk!=null) {
			tipoevaluacionempleadoTableCellFk.settipoevaluacionempleadosForeignKey(tipoevaluacionempleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoevaluacionempleadoTableCellFk.setRowActual(intSelectedRow);
			//tipoevaluacionempleadoTableCellFk.settipoevaluacionempleadosForeignKeyActual(tipoevaluacionempleadosForeignKey);
		//}


		if(tipoevaluacionempleadoTableCellFk!=null) {
			tipoevaluacionempleadoTableCellFk.RecargarTipoEvaluacionEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormatoNomiPreguntaNomi(List<FormatoNomiPreguntaNomi> formatonomipreguntanomisForeignKey)throws Exception{
		TableColumn tableColumnFormatoNomiPreguntaNomi=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI));
		TableCellEditor tableCellEditorFormatoNomiPreguntaNomi =tableColumnFormatoNomiPreguntaNomi.getCellEditor();

		FormatoNomiPreguntaNomiTableCell formatonomipreguntanomiTableCellFk=(FormatoNomiPreguntaNomiTableCell)tableCellEditorFormatoNomiPreguntaNomi;

		if(formatonomipreguntanomiTableCellFk!=null) {
			formatonomipreguntanomiTableCellFk.setformatonomipreguntanomisForeignKey(formatonomipreguntanomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatonomipreguntanomiTableCellFk.setRowActual(intSelectedRow);
			//formatonomipreguntanomiTableCellFk.setformatonomipreguntanomisForeignKeyActual(formatonomipreguntanomisForeignKey);
		//}


		if(formatonomipreguntanomiTableCellFk!=null) {
			formatonomipreguntanomiTableCellFk.RecargarFormatoNomiPreguntaNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEvaluacionesPeriodos(false);
			
			//if(!this.isEsNuevoEvaluacionesPeriodos) {								
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				
			}
			
			if(this.permiteMantenimiento(this.evaluacionesperiodos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEvaluacionesPeriodos=true;
					this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
					this.isEsNuevoEvaluacionesPeriodos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEvaluacionesPeriodos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEvaluacionesPeriodos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEvaluacionesPeriodos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionesPeriodos(false);
				
				this.habilitarDeshabilitarControlesEvaluacionesPeriodos(false);
			
												
				
				if(EvaluacionesPeriodosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEvaluacionesPeriodos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,evaluacionesperiodosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEvaluacionesPeriodos(this.evaluacionesperiodos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,evaluacionesperiodosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.evaluacionesperiodos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EvaluacionesPeriodos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesPeriodos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				this.evaluacionesperiodos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				this.evaluacionesperiodos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.evaluacionesperiodos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EvaluacionesPeriodosModel) this.jTableDatosEvaluacionesPeriodos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEvaluacionesPeriodos=true;
				this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
				this.isEsNuevoEvaluacionesPeriodos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEvaluacionesPeriodos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionesPeriodos(false);
				
				this.habilitarDeshabilitarControlesEvaluacionesPeriodos(false);
				
				
				
				if(EvaluacionesPeriodosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEvaluacionesPeriodos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEvaluacionesPeriodos.getRowCount()>=1) {
				jTableDatosEvaluacionesPeriodos.removeRowSelectionInterval(0, jTableDatosEvaluacionesPeriodos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEvaluacionesPeriodos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionesPeriodos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionesPeriodos(false) ;
			
			this.isEsNuevoEvaluacionesPeriodos=false;
			
			if(EvaluacionesPeriodosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEvaluacionesPeriodos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				
				//SI ES MANUAL
				if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEvaluacionesPeriodos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEvaluacionesPeriodos--;			
			//EvaluacionesPeriodos evaluacionesperiodosAux= new EvaluacionesPeriodos();			
			//evaluacionesperiodosAux.setId(this.iIdNuevoEvaluacionesPeriodos);
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEvaluacionesPeriodos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
			
			this.evaluacionesperiodos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().add(this.evaluacionesperiodosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.evaluacionesperiodoss.add(this.evaluacionesperiodosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
			
			this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(this.getIndiceNuevoEvaluacionesPeriodos(), this.getIndiceNuevoEvaluacionesPeriodos());
			
			int iLastRow =  this.jTableDatosEvaluacionesPeriodos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEvaluacionesPeriodos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEvaluacionesPeriodos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesPeriodos(false);
			
			//SI ES MANUAL
			if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionesPeriodos();
			}
			
			//this.abrirFrameTreeEvaluacionesPeriodos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEvaluacionesPeriodos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEvaluacionesPeriodos.setFileImportacion(this.jInternalFrameImportacionEvaluacionesPeriodos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEvaluacionesPeriodos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEvaluacionesPeriodos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEvaluacionesPeriodos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEvaluacionesPeriodos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();		

		evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EvaluacionesPeriodosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EvaluacionesPeriodosBaseDesign.jrxml";
			
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
			
			this.generarReporteEvaluacionesPeriodoss("Todos",evaluacionesperiodossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Periodos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FormatoNomiPreguntaNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FormatoNomiPreguntaNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FormatoNomiPreguntaNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FormatoNomiPreguntaNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorConocimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorConocimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorConocimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorConocimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorEficiencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorEficiencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorEficiencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorEficiencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorObtenido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorObtenido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorObtenido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorObtenido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO:
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
		
		if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoria="codigo_dato";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					sNombreCampoCategoria="id_formato_nomi_pregunta_nomi";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					sNombreCampoCategoria="valor_conocimiento";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA:
					sNombreCampoCategoria="valor_eficiencia";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO:
					sNombreCampoCategoria="valor_obtenido";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO:
					sNombreCampoCategoria="promedio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoriaValor="codigo_dato";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					sNombreCampoCategoriaValor="id_formato_nomi_pregunta_nomi";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					sNombreCampoCategoriaValor="valor_conocimiento";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA:
					sNombreCampoCategoriaValor="valor_eficiencia";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO:
					sNombreCampoCategoriaValor="valor_obtenido";
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO:
					sNombreCampoCategoriaValor="promedio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_dato");
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato Nomi Pregunta Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato_nomi_pregunta_nomi");
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Conocimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_conocimiento");
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Eficiencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_eficiencia");
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Obtenido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_obtenido");
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO:
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
	
	public void jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();		
		
		evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesperiodos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EvaluacionesPeriodoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.gettipocalificacionempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VERIFICADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VERIFICADO);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getverificado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.gettipoevaluacionempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getcodigo_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getformatonomipreguntanomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getvalor_conocimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getvalor_eficiencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getvalor_obtenido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO);
					iRow++;

					for(EvaluacionesPeriodos evaluacionesperiodos:evaluacionesperiodossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionesperiodos.getpromedio());
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
			//	this.getFilaCabeceraExportarExcelEvaluacionesPeriodos(row);				
			//	iRow++;
			//}				
			
			//for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEvaluacionesPeriodos(evaluacionesperiodosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Periodos",JOptionPane.INFORMATION_MESSAGE);
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
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesPeriodos(false);
			
			//SI ES MANUAL
			if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionesPeriodos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesPeriodos(false);
			
			//SI ES MANUAL
			if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEvaluacionesPeriodos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionesPeriodos(false);
			
			//SI ES MANUAL
			if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEvaluacionesPeriodos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEvaluacionesPeriodos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEvaluacionesPeriodos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEvaluacionesPeriodos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEvaluacionesPeriodos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEvaluacionesPeriodos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEvaluacionesPeriodos.setMinimumSize(dimensionMinimum);
		this.jTableDatosEvaluacionesPeriodos.setMaximumSize(dimensionMaximum);
		this.jTableDatosEvaluacionesPeriodos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEvaluacionesPeriodos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEvaluacionesPeriodos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEvaluacionesPeriodos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEvaluacionesPeriodos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEvaluacionesPeriodos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEvaluacionesPeriodos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesPeriodos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEvaluacionesPeriodos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEvaluacionesPeriodos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEvaluacionesPeriodos();
		
		this.inicializarActualizarBindingBotonesManualEvaluacionesPeriodos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEvaluacionesPeriodos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesPeriodos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionesPeriodos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionesPeriodos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEvaluacionesPeriodos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEvaluacionesPeriodos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jCheckBoxPostAccionNuevoEvaluacionesPeriodos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jCheckBoxPostAccionSinCerrarEvaluacionesPeriodos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jCheckBoxPostAccionSinMensajeEvaluacionesPeriodos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEvaluacionesPeriodos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEvaluacionesPeriodos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jCheckBoxPostAccionNuevoEvaluacionesPeriodos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jCheckBoxPostAccionSinCerrarEvaluacionesPeriodos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jCheckBoxPostAccionSinMensajeEvaluacionesPeriodos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEvaluacionesPeriodos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEvaluacionesPeriodos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEvaluacionesPeriodos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEvaluacionesPeriodos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEvaluacionesPeriodos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEvaluacionesPeriodos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEvaluacionesPeriodos(Boolean esInicializar) throws Exception {
		try	{	
			if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionesPeriodos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionesPeriodos() throws Exception {
		try	{
			if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEvaluacionesPeriodos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEvaluacionesPeriodos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEvaluacionesPeriodos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEvaluacionesPeriodos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEvaluacionesPeriodos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEvaluacionesPeriodos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEvaluacionesPeriodos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEvaluacionesPeriodos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEvaluacionesPeriodos.addItem(reporte);
			}
			
			
			if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEvaluacionesPeriodos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEvaluacionesPeriodos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEvaluacionesPeriodos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEvaluacionesPeriodos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEvaluacionesPeriodos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEvaluacionesPeriodos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionesPeriodos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionesPeriodos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos!=null) {
				
				if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EvaluacionesPeriodosConstantesFunciones.getTiposSeleccionarEvaluacionesPeriodos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EvaluacionesPeriodosConstantesFunciones.getTiposSeleccionarEvaluacionesPeriodos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EvaluacionesPeriodosConstantesFunciones.getTiposSeleccionarEvaluacionesPeriodos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEvaluacionesPeriodos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getSelectedItem()!=null){this.id_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodos=((TipoCalificacionEmpleado)this.jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getSelectedItem()).getId();}
		this.verificadoBusquedaEvaluacionesPeriodos=this.jCheckBoxverificadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.isSelected();
		if(this.jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getSelectedItem()!=null){this.id_estructuraBusquedaEvaluacionesPeriodos=((Estructura)this.jComboBoxid_estructuraBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getSelectedItem()).getId();}
		this.codigoBusquedaEvaluacionesPeriodos=this.jTextFieldcodigoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getText();
		if(this.jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getSelectedItem()!=null){this.id_ejercicioBusquedaEvaluacionesPeriodos=((Ejercicio)this.jComboBoxid_ejercicioBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getSelectedItem()!=null){this.id_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodos=((TipoEvaluacionEmpleado)this.jComboBoxid_tipo_evaluacion_empleadoBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEvaluacionesPeriodos(Boolean esInicializar) throws Exception {				
		if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEvaluacionesPeriodos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEvaluacionesPeriodos() throws Exception {
		this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEvaluacionesPeriodos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEvaluacionesPeriodosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEvaluacionesPeriodos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=evaluacionesperiodosLogic.getEvaluacionesPeriodoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=evaluacionesperiodoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEvaluacionesPeriodos.setModel(new EvaluacionesPeriodosModel(this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEvaluacionesPeriodos.setModel(new EvaluacionesPeriodosModel(this.evaluacionesperiodoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEvaluacionesPeriodos!=null && this.jInternalFrameOrderByEvaluacionesPeriodos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEvaluacionesPeriodos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO,evaluacionesperiodosConstantesFunciones.resaltarSeleccionarEvaluacionesPeriodos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EvaluacionesPeriodosConstantesFunciones.SCLASSWEBTITULO,evaluacionesperiodosConstantesFunciones.resaltarSeleccionarEvaluacionesPeriodos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_ID));

		if(this.evaluacionesperiodosConstantesFunciones.mostraridEvaluacionesPeriodos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesPeriodosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesperiodosConstantesFunciones.resaltaridEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activaridEvaluacionesPeriodos,iSizeTabla,this,true,"idEvaluacionesPeriodos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesperiodosConstantesFunciones.resaltaridEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activaridEvaluacionesPeriodos,this,true,"idEvaluacionesPeriodos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO));

		if(this.evaluacionesperiodosConstantesFunciones.mostrarcodigo_datoEvaluacionesPeriodos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarcodigo_datoEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarcodigo_datoEvaluacionesPeriodos,iSizeTabla,this,true,"codigo_datoEvaluacionesPeriodos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarcodigo_datoEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarcodigo_datoEvaluacionesPeriodos,this,true,"codigo_datoEvaluacionesPeriodos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.evaluacionesperiodosConstantesFunciones.mostrarnombre_completoEvaluacionesPeriodos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarnombre_completoEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarnombre_completoEvaluacionesPeriodos,iSizeTabla,this,true,"nombre_completoEvaluacionesPeriodos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarnombre_completoEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarnombre_completoEvaluacionesPeriodos,this,true,"nombre_completoEvaluacionesPeriodos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI));

		if(this.evaluacionesperiodosConstantesFunciones.mostrarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoNomiPreguntaNomiTableCell(this.formatonomipreguntanomisForeignKey,this.evaluacionesperiodosConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos,this,this.evaluacionesperiodosConstantesFunciones.activarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos,iSizeTabla));
			tableColumn.setCellEditor(new FormatoNomiPreguntaNomiTableCell(this.formatonomipreguntanomisForeignKey,this.evaluacionesperiodosConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos,this,this.evaluacionesperiodosConstantesFunciones.activarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos,true,"id_formato_nomi_pregunta_nomiEvaluacionesPeriodos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO));

		if(this.evaluacionesperiodosConstantesFunciones.mostrarvalor_conocimientoEvaluacionesPeriodos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_conocimientoEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarvalor_conocimientoEvaluacionesPeriodos,iSizeTabla,this,true,"valor_conocimientoEvaluacionesPeriodos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_conocimientoEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarvalor_conocimientoEvaluacionesPeriodos,this,true,"valor_conocimientoEvaluacionesPeriodos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA));

		if(this.evaluacionesperiodosConstantesFunciones.mostrarvalor_eficienciaEvaluacionesPeriodos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_eficienciaEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarvalor_eficienciaEvaluacionesPeriodos,iSizeTabla,this,true,"valor_eficienciaEvaluacionesPeriodos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_eficienciaEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarvalor_eficienciaEvaluacionesPeriodos,this,true,"valor_eficienciaEvaluacionesPeriodos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO));

		if(this.evaluacionesperiodosConstantesFunciones.mostrarvalor_obtenidoEvaluacionesPeriodos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_obtenidoEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarvalor_obtenidoEvaluacionesPeriodos,iSizeTabla,this,true,"valor_obtenidoEvaluacionesPeriodos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_obtenidoEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarvalor_obtenidoEvaluacionesPeriodos,this,true,"valor_obtenidoEvaluacionesPeriodos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO));

		if(this.evaluacionesperiodosConstantesFunciones.mostrarpromedioEvaluacionesPeriodos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarpromedioEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarpromedioEvaluacionesPeriodos,iSizeTabla,this,true,"promedioEvaluacionesPeriodos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionesperiodosConstantesFunciones.resaltarpromedioEvaluacionesPeriodos,this.evaluacionesperiodosConstantesFunciones.activarpromedioEvaluacionesPeriodos,this,true,"promedioEvaluacionesPeriodos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EvaluacionesPeriodosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEvaluacionesPeriodos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEvaluacionesPeriodos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEvaluacionesPeriodos.addColumn(tableColumn);
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
			
			this.jTableDatosEvaluacionesPeriodos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEvaluacionesPeriodos.moveColumn(this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEvaluacionesPeriodos.moveColumn(this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEvaluacionesPeriodos.moveColumn(this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEvaluacionesPeriodos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEvaluacionesPeriodos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEvaluacionesPeriodos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEvaluacionesPeriodos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEvaluacionesPeriodos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEvaluacionesPeriodos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=evaluacionesperiodosLogic.getEvaluacionesPeriodoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=evaluacionesperiodoss.size()-1;
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
		//this.jTableDatosEvaluacionesPeriodos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEvaluacionesPeriodos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEvaluacionesPeriodos();
			
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
				
				//this.isEsNuevoEvaluacionesPeriodos=false;
					
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
				if(this.evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEvaluacionesPeriodos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEvaluacionesPeriodos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.evaluacionesperiodos.getsType().equals("DUPLICADO")
				   || this.evaluacionesperiodos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEvaluacionesPeriodos=true;
				
				} else {
					this.isEsNuevoEvaluacionesPeriodos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
					if(this.evaluacionesperiodos.getId()>=0 && !this.evaluacionesperiodos.getIsNew()) {						
						this.isEsNuevoEvaluacionesPeriodos=false;
						
					} else {
						this.isEsNuevoEvaluacionesPeriodos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEvaluacionesPeriodos(esRelaciones);						
				
				this.seleccionarEvaluacionesPeriodos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.evaluacionesperiodos.getId()<0) {
					this.isEsNuevoEvaluacionesPeriodos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEvaluacionesPeriodos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEvaluacionesPeriodos(evt,rowIndex);
				}	
				
				if(this.evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EvaluacionesPeriodos: " + this.dDif); 
					}
				}								
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEvaluacionesPeriodos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.evaluacionesperiodos)) {
					if(this.evaluacionesperiodos.getId()>0) {
						this.evaluacionesperiodos.setIsDeleted(true);
						
						this.evaluacionesperiodossEliminados.add(this.evaluacionesperiodos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().remove(this.evaluacionesperiodos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodoss.remove(this.evaluacionesperiodos);				
					}
					
					
					((EvaluacionesPeriodosModel) this.jTableDatosEvaluacionesPeriodos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEvaluacionesPeriodos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEvaluacionesPeriodos) {
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEvaluacionesPeriodos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEvaluacionesPeriodos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEvaluacionesPeriodos(this.evaluacionesperiodos);
				}
				
				//ARCHITECTURE
				try {
					

					//FormatoNomiPreguntaNomi
					if(!this.evaluacionesperiodosConstantesFunciones.cargarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos || this.evaluacionesperiodosConstantesFunciones.event_dependid_formato_nomi_pregunta_nomiEvaluacionesPeriodos) {
						//this.cargarCombosFormatoNomiPreguntaNomisForeignKeyLista(" where id="+this.evaluacionesperiodos.getid_formato_nomi_pregunta_nomi());
									//this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
						this.formatonomipreguntanomisForeignKey=new ArrayList<FormatoNomiPreguntaNomi>();

						if(evaluacionesperiodos.getFormatoNomiPreguntaNomi()!=null) {
							this.formatonomipreguntanomisForeignKey.add(evaluacionesperiodos.getFormatoNomiPreguntaNomi());
						}

						this.addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi();
						this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey("Todos");
					}
					this.setActualFormatoNomiPreguntaNomiForeignKey(this.evaluacionesperiodos.getid_formato_nomi_pregunta_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEvaluacionesPeriodos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEvaluacionesPeriodos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionesPeriodos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEvaluacionesPeriodos(evaluacionesperiodos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEvaluacionesPeriodos(evaluacionesperiodos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEvaluacionesPeriodos(evaluacionesperiodos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesPeriodos(evaluacionesperiodos);
	}
	
	public void setVariablesObjetoActualToFormularioEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelidEvaluacionesPeriodos.setText(evaluacionesperiodos.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigo_datoEvaluacionesPeriodos.setText(evaluacionesperiodos.getcodigo_dato());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextAreanombre_completoEvaluacionesPeriodos.setText(evaluacionesperiodos.getnombre_completo());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_conocimientoEvaluacionesPeriodos.setText(evaluacionesperiodos.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_eficienciaEvaluacionesPeriodos.setText(evaluacionesperiodos.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_obtenidoEvaluacionesPeriodos.setText(evaluacionesperiodos.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldpromedioEvaluacionesPeriodos.setText(evaluacionesperiodos.getpromedio().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EvaluacionesPeriodos evaluacionesperiodosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,evaluacionesperiodosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EvaluacionesPeriodos evaluacionesperiodosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				evaluacionesperiodosLocal=this.evaluacionesperiodos;
			} else {
				evaluacionesperiodosLocal=this.evaluacionesperiodosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(evaluacionesperiodosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEvaluacionesPeriodos(evaluacionesperiodosLocal,true);
					
					if(evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(evaluacionesperiodosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(evaluacionesperiodosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(evaluacionesperiodos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(evaluacionesperiodos);
	}
	
	public void setVariablesFormularioToObjetoActualEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(evaluacionesperiodos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelidEvaluacionesPeriodos.getText()==null || this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelidEvaluacionesPeriodos.getText()=="" || this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelidEvaluacionesPeriodos.getText()=="Id") {
				this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelidEvaluacionesPeriodos.setText("0");
			}

			if(conColumnasBase) {evaluacionesperiodos.setId(Long.parseLong(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelidEvaluacionesPeriodos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesPeriodosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelIdEvaluacionesPeriodos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesperiodos.setcodigo_dato(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigo_datoEvaluacionesPeriodos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelcodigo_datoEvaluacionesPeriodos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesperiodos.setnombre_completo(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextAreanombre_completoEvaluacionesPeriodos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelnombre_completoEvaluacionesPeriodos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesperiodos.setvalor_conocimiento(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_conocimientoEvaluacionesPeriodos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelvalor_conocimientoEvaluacionesPeriodos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesperiodos.setvalor_eficiencia(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_eficienciaEvaluacionesPeriodos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelvalor_eficienciaEvaluacionesPeriodos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesperiodos.setvalor_obtenido(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_obtenidoEvaluacionesPeriodos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelvalor_obtenidoEvaluacionesPeriodos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionesperiodos.setpromedio(Double.parseDouble(this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldpromedioEvaluacionesPeriodos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelpromedioEvaluacionesPeriodos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodosBean,EvaluacionesPeriodos evaluacionesperiodos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && evaluacionesperiodosBean.getid_formato_nomi_pregunta_nomi()!=null && !evaluacionesperiodosBean.getid_formato_nomi_pregunta_nomi().equals(-1L))) {evaluacionesperiodos.setid_formato_nomi_pregunta_nomi(evaluacionesperiodosBean.getid_formato_nomi_pregunta_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodosOrigen,EvaluacionesPeriodos evaluacionesperiodos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && evaluacionesperiodosOrigen.getId()!=null && !evaluacionesperiodosOrigen.getId().equals(0L))) {evaluacionesperiodos.setId(evaluacionesperiodosOrigen.getId());}}
			if(conDefault || (!conDefault && evaluacionesperiodosOrigen.getverificado()!=null && !evaluacionesperiodosOrigen.getverificado().equals(false))) {evaluacionesperiodos.setverificado(evaluacionesperiodosOrigen.getverificado());}
			if(conDefault || (!conDefault && evaluacionesperiodosOrigen.getcodigo()!=null && !evaluacionesperiodosOrigen.getcodigo().equals(""))) {evaluacionesperiodos.setcodigo(evaluacionesperiodosOrigen.getcodigo());}
			if(conDefault || (!conDefault && evaluacionesperiodosOrigen.getcodigo_dato()!=null && !evaluacionesperiodosOrigen.getcodigo_dato().equals(""))) {evaluacionesperiodos.setcodigo_dato(evaluacionesperiodosOrigen.getcodigo_dato());}
			if(conDefault || (!conDefault && evaluacionesperiodosOrigen.getnombre_completo()!=null && !evaluacionesperiodosOrigen.getnombre_completo().equals(""))) {evaluacionesperiodos.setnombre_completo(evaluacionesperiodosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && evaluacionesperiodosOrigen.getid_formato_nomi_pregunta_nomi()!=null && !evaluacionesperiodosOrigen.getid_formato_nomi_pregunta_nomi().equals(-1L))) {evaluacionesperiodos.setid_formato_nomi_pregunta_nomi(evaluacionesperiodosOrigen.getid_formato_nomi_pregunta_nomi());}
			if(conDefault || (!conDefault && evaluacionesperiodosOrigen.getvalor_conocimiento()!=null && !evaluacionesperiodosOrigen.getvalor_conocimiento().equals(0.0))) {evaluacionesperiodos.setvalor_conocimiento(evaluacionesperiodosOrigen.getvalor_conocimiento());}
			if(conDefault || (!conDefault && evaluacionesperiodosOrigen.getvalor_eficiencia()!=null && !evaluacionesperiodosOrigen.getvalor_eficiencia().equals(0.0))) {evaluacionesperiodos.setvalor_eficiencia(evaluacionesperiodosOrigen.getvalor_eficiencia());}
			if(conDefault || (!conDefault && evaluacionesperiodosOrigen.getvalor_obtenido()!=null && !evaluacionesperiodosOrigen.getvalor_obtenido().equals(0.0))) {evaluacionesperiodos.setvalor_obtenido(evaluacionesperiodosOrigen.getvalor_obtenido());}
			if(conDefault || (!conDefault && evaluacionesperiodosOrigen.getpromedio()!=null && !evaluacionesperiodosOrigen.getpromedio().equals(0.0))) {evaluacionesperiodos.setpromedio(evaluacionesperiodosOrigen.getpromedio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelidEvaluacionesPeriodos.setText(evaluacionesperiodos.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigo_datoEvaluacionesPeriodos.setText(evaluacionesperiodos.getcodigo_dato());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextAreanombre_completoEvaluacionesPeriodos.setText(evaluacionesperiodos.getnombre_completo());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_conocimientoEvaluacionesPeriodos.setText(evaluacionesperiodos.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_eficienciaEvaluacionesPeriodos.setText(evaluacionesperiodos.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_obtenidoEvaluacionesPeriodos.setText(evaluacionesperiodos.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldpromedioEvaluacionesPeriodos.setText(evaluacionesperiodos.getpromedio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEvaluacionesPeriodos(EvaluacionesPeriodosBean evaluacionesperiodosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelidEvaluacionesPeriodos.setText(evaluacionesperiodosBean.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigo_datoEvaluacionesPeriodos.setText(evaluacionesperiodosBean.getcodigo_dato());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextAreanombre_completoEvaluacionesPeriodos.setText(evaluacionesperiodosBean.getnombre_completo());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_conocimientoEvaluacionesPeriodos.setText(evaluacionesperiodosBean.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_eficienciaEvaluacionesPeriodos.setText(evaluacionesperiodosBean.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_obtenidoEvaluacionesPeriodos.setText(evaluacionesperiodosBean.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldpromedioEvaluacionesPeriodos.setText(evaluacionesperiodosBean.getpromedio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEvaluacionesPeriodos(EvaluacionesPeriodosParameterReturnGeneral evaluacionesperiodosReturnGeneral,EvaluacionesPeriodosBean evaluacionesperiodosBean,Boolean conDefault) throws Exception { 
		try {
			EvaluacionesPeriodos evaluacionesperiodosLocal=new EvaluacionesPeriodos();
			
			evaluacionesperiodosLocal=evaluacionesperiodosReturnGeneral.getEvaluacionesPeriodos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && evaluacionesperiodosLocal.getId()!=null && !evaluacionesperiodosLocal.getId().equals(0L))) {evaluacionesperiodosBean.setId(evaluacionesperiodosLocal.getId());}}
			if(conDefault || (!conDefault && evaluacionesperiodosLocal.getcodigo_dato()!=null && !evaluacionesperiodosLocal.getcodigo_dato().equals(""))) {evaluacionesperiodosBean.setcodigo_dato(evaluacionesperiodosLocal.getcodigo_dato());}
			if(conDefault || (!conDefault && evaluacionesperiodosLocal.getnombre_completo()!=null && !evaluacionesperiodosLocal.getnombre_completo().equals(""))) {evaluacionesperiodosBean.setnombre_completo(evaluacionesperiodosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && evaluacionesperiodosLocal.getid_formato_nomi_pregunta_nomi()!=null && !evaluacionesperiodosLocal.getid_formato_nomi_pregunta_nomi().equals(-1L))) {evaluacionesperiodosBean.setid_formato_nomi_pregunta_nomi(evaluacionesperiodosLocal.getid_formato_nomi_pregunta_nomi());}
			if(conDefault || (!conDefault && evaluacionesperiodosLocal.getvalor_conocimiento()!=null && !evaluacionesperiodosLocal.getvalor_conocimiento().equals(0.0))) {evaluacionesperiodosBean.setvalor_conocimiento(evaluacionesperiodosLocal.getvalor_conocimiento());}
			if(conDefault || (!conDefault && evaluacionesperiodosLocal.getvalor_eficiencia()!=null && !evaluacionesperiodosLocal.getvalor_eficiencia().equals(0.0))) {evaluacionesperiodosBean.setvalor_eficiencia(evaluacionesperiodosLocal.getvalor_eficiencia());}
			if(conDefault || (!conDefault && evaluacionesperiodosLocal.getvalor_obtenido()!=null && !evaluacionesperiodosLocal.getvalor_obtenido().equals(0.0))) {evaluacionesperiodosBean.setvalor_obtenido(evaluacionesperiodosLocal.getvalor_obtenido());}
			if(conDefault || (!conDefault && evaluacionesperiodosLocal.getpromedio()!=null && !evaluacionesperiodosLocal.getpromedio().equals(0.0))) {evaluacionesperiodosBean.setpromedio(evaluacionesperiodosLocal.getpromedio());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEvaluacionesPeriodosGenerico(Long idEvaluacionesPeriodosSeleccionado,JComboBox jComboBoxEvaluacionesPeriodos,List<EvaluacionesPeriodos> evaluacionesperiodossLocal)throws Exception {
		try {
			EvaluacionesPeriodos  evaluacionesperiodosTemp=null;

			for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodossLocal) {
				if(evaluacionesperiodosAux.getId()!=null && evaluacionesperiodosAux.getId().equals(idEvaluacionesPeriodosSeleccionado)) {
					evaluacionesperiodosTemp=evaluacionesperiodosAux;
					break;
				}
			}

			jComboBoxEvaluacionesPeriodos.setSelectedItem(evaluacionesperiodosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEvaluacionesPeriodosGenerico(JComboBox jComboBoxEvaluacionesPeriodos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEvaluacionesPeriodos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEvaluacionesPeriodos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEvaluacionesPeriodos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEvaluacionesPeriodos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEvaluacionesPeriodos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEvaluacionesPeriodos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionesperiodos=(EvaluacionesPeriodos) evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			evaluacionesperiodos =(EvaluacionesPeriodos) evaluacionesperiodoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoCalificacionEmpleado")) {
			//sDescripcion=this.getActualTipoCalificacionEmpleadoForeignKeyDescripcion((Long)value);
			if(!evaluacionesperiodos.getIsNew() && !evaluacionesperiodos.getIsChanged() && !evaluacionesperiodos.getIsDeleted()) {
				sDescripcion=evaluacionesperiodos.gettipocalificacionempleado_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCalificacionEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesperiodos.gettipocalificacionempleado_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!evaluacionesperiodos.getIsNew() && !evaluacionesperiodos.getIsChanged() && !evaluacionesperiodos.getIsDeleted()) {
				sDescripcion=evaluacionesperiodos.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesperiodos.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!evaluacionesperiodos.getIsNew() && !evaluacionesperiodos.getIsChanged() && !evaluacionesperiodos.getIsDeleted()) {
				sDescripcion=evaluacionesperiodos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesperiodos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!evaluacionesperiodos.getIsNew() && !evaluacionesperiodos.getIsChanged() && !evaluacionesperiodos.getIsDeleted()) {
				sDescripcion=evaluacionesperiodos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesperiodos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!evaluacionesperiodos.getIsNew() && !evaluacionesperiodos.getIsChanged() && !evaluacionesperiodos.getIsDeleted()) {
				sDescripcion=evaluacionesperiodos.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesperiodos.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("TipoEvaluacionEmpleado")) {
			//sDescripcion=this.getActualTipoEvaluacionEmpleadoForeignKeyDescripcion((Long)value);
			if(!evaluacionesperiodos.getIsNew() && !evaluacionesperiodos.getIsChanged() && !evaluacionesperiodos.getIsDeleted()) {
				sDescripcion=evaluacionesperiodos.gettipoevaluacionempleado_descripcion();
			} else {
				//sDescripcion=this.getActualTipoEvaluacionEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesperiodos.gettipoevaluacionempleado_descripcion();
			}
		}

		if(sTipo.equals("FormatoNomiPreguntaNomi")) {
			//sDescripcion=this.getActualFormatoNomiPreguntaNomiForeignKeyDescripcion((Long)value);
			if(!evaluacionesperiodos.getIsNew() && !evaluacionesperiodos.getIsChanged() && !evaluacionesperiodos.getIsDeleted()) {
				sDescripcion=evaluacionesperiodos.getformatonomipreguntanomi_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoNomiPreguntaNomiForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionesperiodos.getformatonomipreguntanomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EvaluacionesPeriodos evaluacionesperiodosRow=new EvaluacionesPeriodos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionesperiodosRow=(EvaluacionesPeriodos) evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			evaluacionesperiodosRow=(EvaluacionesPeriodos) evaluacionesperiodoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEvaluacionesPeriodos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesPeriodos && this.isPermisoNuevoEvaluacionesPeriodos));			
			this.jButtonDuplicarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionesPeriodos && this.isPermisoDuplicarEvaluacionesPeriodos));			
			this.jButtonCopiarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaCopiarEvaluacionesPeriodos && this.isPermisoCopiarEvaluacionesPeriodos));
			this.jButtonVerFormEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaVerFormEvaluacionesPeriodos && this.isPermisoVerFormEvaluacionesPeriodos));
			
			this.jButtonAbrirOrderByEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesPeriodos && this.isPermisoOrdenEvaluacionesPeriodos));			
			
			this.jButtonNuevoRelacionesEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos && this.isPermisoNuevoEvaluacionesPeriodos));			
			this.jButtonNuevoGuardarCambiosEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesPeriodos && this.isPermisoNuevoEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos));
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonModificarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaModificarEvaluacionesPeriodos && this.isPermisoActualizarEvaluacionesPeriodos));	
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonActualizarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaActualizarEvaluacionesPeriodos && this.isPermisoActualizarEvaluacionesPeriodos));	
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonEliminarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaEliminarEvaluacionesPeriodos && this.isPermisoEliminarEvaluacionesPeriodos));
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonCancelarEvaluacionesPeriodos.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesPeriodos);							
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos));			
			
			}
						
			this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesPeriodos && this.isPermisoNuevoEvaluacionesPeriodos));						
			this.jButtonDuplicarToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionesPeriodos && this.isPermisoDuplicarEvaluacionesPeriodos));						
			this.jButtonCopiarToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaCopiarEvaluacionesPeriodos && this.isPermisoCopiarEvaluacionesPeriodos));			
			this.jButtonVerFormToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaVerFormEvaluacionesPeriodos && this.isPermisoVerFormEvaluacionesPeriodos));			
			this.jButtonAbrirOrderByToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesPeriodos && this.isPermisoOrdenEvaluacionesPeriodos));
			this.jButtonNuevoRelacionesToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos && this.isPermisoNuevoEvaluacionesPeriodos));			
			this.jButtonNuevoGuardarCambiosToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesPeriodos && this.isPermisoNuevoEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos));			
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonModificarToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaModificarEvaluacionesPeriodos && this.isPermisoActualizarEvaluacionesPeriodos));	
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonActualizarToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaActualizarEvaluacionesPeriodos  && this.isPermisoActualizarEvaluacionesPeriodos));	
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonEliminarToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaEliminarEvaluacionesPeriodos && this.isPermisoEliminarEvaluacionesPeriodos));
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonCancelarToolBarEvaluacionesPeriodos.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesPeriodos);				
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesPeriodos && this.isPermisoNuevoEvaluacionesPeriodos));			
			this.jMenuItemDuplicarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionesPeriodos && this.isPermisoDuplicarEvaluacionesPeriodos));			
			this.jMenuItemCopiarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaCopiarEvaluacionesPeriodos && this.isPermisoCopiarEvaluacionesPeriodos));			
			this.jMenuItemVerFormEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaVerFormEvaluacionesPeriodos && this.isPermisoVerFormEvaluacionesPeriodos));			
			this.jMenuItemAbrirOrderByEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesPeriodos && this.isPermisoOrdenEvaluacionesPeriodos));			
			//this.jMenuItemMostrarOcultarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesPeriodos && this.isPermisoOrdenEvaluacionesPeriodos));
			this.jMenuItemDetalleAbrirOrderByEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesPeriodos && this.isPermisoOrdenEvaluacionesPeriodos));			
			//this.jMenuItemDetalleMostrarOcultarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaOrdenEvaluacionesPeriodos && this.isPermisoOrdenEvaluacionesPeriodos));			
			this.jMenuItemNuevoRelacionesEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos && this.isPermisoNuevoEvaluacionesPeriodos));			
			this.jMenuItemNuevoGuardarCambiosEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaNuevoEvaluacionesPeriodos && this.isPermisoNuevoEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos));									
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemModificarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaModificarEvaluacionesPeriodos && this.isPermisoActualizarEvaluacionesPeriodos));	
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemActualizarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaActualizarEvaluacionesPeriodos && this.isPermisoActualizarEvaluacionesPeriodos));	
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemEliminarEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaEliminarEvaluacionesPeriodos && this.isPermisoEliminarEvaluacionesPeriodos));
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemCancelarEvaluacionesPeriodos.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesPeriodos);				
			}
			
			this.jMenuItemGuardarCambiosEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos));						
			this.jMenuItemGuardarCambiosTablaEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=this.jButtonNuevoEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaDuplicarEvaluacionesPeriodos=this.jButtonDuplicarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaCopiarEvaluacionesPeriodos=this.jButtonCopiarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaVerFormEvaluacionesPeriodos=this.jButtonVerFormEvaluacionesPeriodos.isVisible();
			
			this.isVisibilidadCeldaOrdenEvaluacionesPeriodos=this.jButtonAbrirOrderByEvaluacionesPeriodos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=this.jButtonNuevoRelacionesEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaModificarEvaluacionesPeriodos=this.jButtonModificarEvaluacionesPeriodos.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonActualizarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonEliminarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonCancelarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosEvaluacionesPeriodos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=this.jButtonNuevoToolBarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=this.jButtonNuevoRelacionesToolBarEvaluacionesPeriodos.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			this.isVisibilidadCeldaModificarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonModificarToolBarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonActualizarToolBarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonEliminarToolBarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonCancelarToolBarEvaluacionesPeriodos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=this.jButtonGuardarCambiosToolBarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=this.jButtonGuardarCambiosTablaToolBarEvaluacionesPeriodos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=this.jMenuItemNuevoEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=this.jMenuItemNuevoRelacionesEvaluacionesPeriodos.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			this.isVisibilidadCeldaModificarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemModificarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemActualizarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemEliminarEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemCancelarEvaluacionesPeriodos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=this.jMenuItemGuardarCambiosEvaluacionesPeriodos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=this.jMenuItemGuardarCambiosTablaEvaluacionesPeriodos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEvaluacionesPeriodos(Boolean esInicializar) {
		if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
				//if(this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEvaluacionesPeriodos();
			}
			
			this.inicializarActualizarBindingBotonesManualEvaluacionesPeriodos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEvaluacionesPeriodos() {
		this.jButtonNuevoEvaluacionesPeriodos.setVisible(this.isPermisoNuevoEvaluacionesPeriodos);			
		this.jButtonDuplicarEvaluacionesPeriodos.setVisible(this.isPermisoDuplicarEvaluacionesPeriodos);			
		this.jButtonCopiarEvaluacionesPeriodos.setVisible(this.isPermisoCopiarEvaluacionesPeriodos);			
		this.jButtonVerFormEvaluacionesPeriodos.setVisible(this.isPermisoVerFormEvaluacionesPeriodos);			
		
		this.jButtonAbrirOrderByEvaluacionesPeriodos.setVisible(this.isPermisoOrdenEvaluacionesPeriodos);					
		
		this.jButtonNuevoRelacionesEvaluacionesPeriodos.setVisible(this.isPermisoNuevoEvaluacionesPeriodos);			
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonModificarEvaluacionesPeriodos.setVisible(this.isPermisoActualizarEvaluacionesPeriodos);	
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonActualizarEvaluacionesPeriodos.setVisible(this.isPermisoActualizarEvaluacionesPeriodos);	
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonEliminarEvaluacionesPeriodos.setVisible(this.isPermisoEliminarEvaluacionesPeriodos);
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonCancelarEvaluacionesPeriodos.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesPeriodos);						
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosEvaluacionesPeriodos.setVisible(this.isPermisoGuardarCambiosEvaluacionesPeriodos);							
		}
		
		this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.setVisible(this.isPermisoActualizarEvaluacionesPeriodos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEvaluacionesPeriodos() {
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonModificarEvaluacionesPeriodos.setVisible(this.isPermisoActualizarEvaluacionesPeriodos);	
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonActualizarEvaluacionesPeriodos.setVisible(this.isPermisoActualizarEvaluacionesPeriodos);	
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonEliminarEvaluacionesPeriodos.setVisible(this.isPermisoEliminarEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonCancelarEvaluacionesPeriodos.setVisible(this.isVisibilidadCeldaCancelarEvaluacionesPeriodos);							
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosEvaluacionesPeriodos.setVisible((this.isVisibilidadCeldaGuardarEvaluacionesPeriodos && this.isPermisoGuardarCambiosEvaluacionesPeriodos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEvaluacionesPeriodos() {
		if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEvaluacionesPeriodos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEvaluacionesPeriodos() {
	}
	
	public void jTableDatosEvaluacionesPeriodosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEvaluacionesPeriodos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.evaluacionesperiodos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocalificacionempleado=true;

			idTienePermisotipocalificacionempleado=this.tienePermisosUsuarioEnPaginaWebEvaluacionesPeriodos(TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocalificacionempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesPeriodos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);

				this.tipocalificacionempleadoBeanSwingJInternalFrame=new TipoCalificacionEmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocalificacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocalificacionempleadoBeanSwingJInternalFrame.getTipoCalificacionEmpleadoLogic().setConnexion(this.evaluacionesperiodosLogic.getConnexion());

				if(this.evaluacionesperiodos.getid_tipo_calificacion_empleado()!=null) {
					this.tipocalificacionempleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocalificacionempleadoBeanSwingJInternalFrame.setIdActual(this.evaluacionesperiodos.getid_tipo_calificacion_empleado());
					this.tipocalificacionempleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocalificacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocalificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCalificacionEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.tipocalificacionempleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesPeriodos=(TitledBorder)this.jScrollPanelDatosEvaluacionesPeriodos.getBorder();
				TitledBorder titledBordertipocalificacionempleado=(TitledBorder)this.tipocalificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosTipoCalificacionEmpleado.getBorder();

				titledBordertipocalificacionempleado.setTitle(titledBorderEvaluacionesPeriodos.getTitle() + " -> Tipo Calificacion Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getid_tipo_calificacion_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_calificacion_empleado = "+this.evaluacionesperiodos.getid_tipo_calificacion_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonverificadoEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getverificado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where verificado = "+this.evaluacionesperiodos.getverificado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraEvaluacionesPeriodosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebEvaluacionesPeriodos(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesPeriodos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.evaluacionesperiodosLogic.getConnexion());

				if(this.evaluacionesperiodos.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.evaluacionesperiodos.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesPeriodos=(TitledBorder)this.jScrollPanelDatosEvaluacionesPeriodos.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderEvaluacionesPeriodos.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.evaluacionesperiodos.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.evaluacionesperiodos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEvaluacionesPeriodosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEvaluacionesPeriodos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesPeriodos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.evaluacionesperiodosLogic.getConnexion());

				if(this.evaluacionesperiodos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.evaluacionesperiodos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesPeriodos=(TitledBorder)this.jScrollPanelDatosEvaluacionesPeriodos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEvaluacionesPeriodos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.evaluacionesperiodos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalEvaluacionesPeriodosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebEvaluacionesPeriodos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesPeriodos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.evaluacionesperiodosLogic.getConnexion());

				if(this.evaluacionesperiodos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.evaluacionesperiodos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesPeriodos=(TitledBorder)this.jScrollPanelDatosEvaluacionesPeriodos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderEvaluacionesPeriodos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.evaluacionesperiodos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioEvaluacionesPeriodosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebEvaluacionesPeriodos(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesPeriodos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.evaluacionesperiodosLogic.getConnexion());

				if(this.evaluacionesperiodos.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.evaluacionesperiodos.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesPeriodos=(TitledBorder)this.jScrollPanelDatosEvaluacionesPeriodos.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderEvaluacionesPeriodos.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.evaluacionesperiodos.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoevaluacionempleado=true;

			idTienePermisotipoevaluacionempleado=this.tienePermisosUsuarioEnPaginaWebEvaluacionesPeriodos(TipoEvaluacionEmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoevaluacionempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesPeriodos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);

				this.tipoevaluacionempleadoBeanSwingJInternalFrame=new TipoEvaluacionEmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoevaluacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoevaluacionempleadoBeanSwingJInternalFrame.getTipoEvaluacionEmpleadoLogic().setConnexion(this.evaluacionesperiodosLogic.getConnexion());

				if(this.evaluacionesperiodos.getid_tipo_evaluacion_empleado()!=null) {
					this.tipoevaluacionempleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoevaluacionempleadoBeanSwingJInternalFrame.setIdActual(this.evaluacionesperiodos.getid_tipo_evaluacion_empleado());
					this.tipoevaluacionempleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoevaluacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoevaluacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoEvaluacionEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.tipoevaluacionempleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesPeriodos=(TitledBorder)this.jScrollPanelDatosEvaluacionesPeriodos.getBorder();
				TitledBorder titledBordertipoevaluacionempleado=(TitledBorder)this.tipoevaluacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosTipoEvaluacionEmpleado.getBorder();

				titledBordertipoevaluacionempleado.setTitle(titledBorderEvaluacionesPeriodos.getTitle() + " -> Tipo Evaluacion Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getid_tipo_evaluacion_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_evaluacion_empleado = "+this.evaluacionesperiodos.getid_tipo_evaluacion_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_datoEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getcodigo_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_dato like '%"+this.evaluacionesperiodos.getcodigo_dato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.evaluacionesperiodos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformatonomipreguntanomi=true;

			idTienePermisoformatonomipreguntanomi=this.tienePermisosUsuarioEnPaginaWebEvaluacionesPeriodos(FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoformatonomipreguntanomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionesPeriodos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionesPeriodos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);

				this.formatonomipreguntanomiBeanSwingJInternalFrame=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatonomipreguntanomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatonomipreguntanomiBeanSwingJInternalFrame.getFormatoNomiPreguntaNomiLogic().setConnexion(this.evaluacionesperiodosLogic.getConnexion());

				if(this.evaluacionesperiodos.getid_formato_nomi_pregunta_nomi()!=null) {
					this.formatonomipreguntanomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatonomipreguntanomiBeanSwingJInternalFrame.setIdActual(this.evaluacionesperiodos.getid_formato_nomi_pregunta_nomi());
					this.formatonomipreguntanomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatonomipreguntanomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi();
				}

				JInternalFrameBase jinternalFrame =this.formatonomipreguntanomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionesPeriodos=(TitledBorder)this.jScrollPanelDatosEvaluacionesPeriodos.getBorder();
				TitledBorder titledBorderformatonomipreguntanomi=(TitledBorder)this.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();

				titledBorderformatonomipreguntanomi.setTitle(titledBorderEvaluacionesPeriodos.getTitle() + " -> Formato Nomi Pregunta Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getid_formato_nomi_pregunta_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato_nomi_pregunta_nomi = "+this.evaluacionesperiodos.getid_formato_nomi_pregunta_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_conocimientoEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getvalor_conocimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_conocimiento = "+this.evaluacionesperiodos.getvalor_conocimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_eficienciaEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getvalor_eficiencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_eficiencia = "+this.evaluacionesperiodos.getvalor_eficiencia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_obtenidoEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getvalor_obtenido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_obtenido = "+this.evaluacionesperiodos.getvalor_obtenido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpromedioEvaluacionesPeriodosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.getevaluacionesperiodos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionesperiodos==null) {
						this.evaluacionesperiodos = new EvaluacionesPeriodos();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);
				}

				if(this.evaluacionesperiodos.getpromedio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where promedio = "+this.evaluacionesperiodos.getpromedio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionesPeriodos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaEvaluacionesPeriodosEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);

			this.getEvaluacionesPeriodossBusquedaEvaluacionesPeriodos();

			this.inicializarActualizarBindingEvaluacionesPeriodos(false);

			//if(EvaluacionesPeriodosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);

			this.getEvaluacionesPeriodossFK_IdEjercicio();

			this.inicializarActualizarBindingEvaluacionesPeriodos(false);

			//if(EvaluacionesPeriodosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);

			this.getEvaluacionesPeriodossFK_IdEmpresa();

			this.inicializarActualizarBindingEvaluacionesPeriodos(false);

			//if(EvaluacionesPeriodosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);

			this.getEvaluacionesPeriodossFK_IdEstructura();

			this.inicializarActualizarBindingEvaluacionesPeriodos(false);

			//if(EvaluacionesPeriodosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoNomiPreguntaNomiEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);

			this.getEvaluacionesPeriodossFK_IdFormatoNomiPreguntaNomi();

			this.inicializarActualizarBindingEvaluacionesPeriodos(false);

			//if(EvaluacionesPeriodosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);

			this.getEvaluacionesPeriodossFK_IdSucursal();

			this.inicializarActualizarBindingEvaluacionesPeriodos(false);

			//if(EvaluacionesPeriodosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCalificacionEmpleadoEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);

			this.getEvaluacionesPeriodossFK_IdTipoCalificacionEmpleado();

			this.inicializarActualizarBindingEvaluacionesPeriodos(false);

			//if(EvaluacionesPeriodosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoEvaluacionEmpleadoEvaluacionesPeriodosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);

			this.getEvaluacionesPeriodossFK_IdTipoEvaluacionEmpleado();

			this.inicializarActualizarBindingEvaluacionesPeriodos(false);

			//if(EvaluacionesPeriodosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionesperiodosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEvaluacionesPeriodos() {
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.setVisible(false);	    			
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.dispose();
			this.jInternalFrameDetalleFormEvaluacionesPeriodos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos!=null) {
			this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.dispose();
			this.jInternalFrameReporteDinamicoEvaluacionesPeriodos=null;
		}
		
		if(this.jInternalFrameImportacionEvaluacionesPeriodos!=null) {
			this.jInternalFrameImportacionEvaluacionesPeriodos.setVisible(false);	    			
			this.jInternalFrameImportacionEvaluacionesPeriodos.dispose();
			this.jInternalFrameImportacionEvaluacionesPeriodos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEvaluacionesPeriodos();
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
			
			if(sTipo.equals("NuevoEvaluacionesPeriodos")) {
				jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEvaluacionesPeriodos")) {
				jButtonDuplicarEvaluacionesPeriodosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEvaluacionesPeriodos")) {
				jButtonCopiarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("VerFormEvaluacionesPeriodos")) {
				jButtonVerFormEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEvaluacionesPeriodos")) {
				jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEvaluacionesPeriodos")) {
				jButtonDuplicarEvaluacionesPeriodosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEvaluacionesPeriodos")) {
				jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEvaluacionesPeriodos")) {
				jButtonDuplicarEvaluacionesPeriodosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEvaluacionesPeriodos")) {
				jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEvaluacionesPeriodos")) {
				jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEvaluacionesPeriodos")) {
				jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEvaluacionesPeriodos")) {
				jButtonModificarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEvaluacionesPeriodos")) {
				jButtonModificarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEvaluacionesPeriodos")) {
				jButtonModificarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEvaluacionesPeriodos")) {
				jButtonActualizarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEvaluacionesPeriodos")) {
				jButtonActualizarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEvaluacionesPeriodos")) {
				jButtonActualizarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("EliminarEvaluacionesPeriodos")) {
				jButtonEliminarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEvaluacionesPeriodos")) {
				jButtonEliminarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEvaluacionesPeriodos")) {
				jButtonEliminarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("CancelarEvaluacionesPeriodos")) {
				jButtonCancelarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEvaluacionesPeriodos")) {
				jButtonCancelarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEvaluacionesPeriodos")) {
				jButtonCancelarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("CerrarEvaluacionesPeriodos")) {
				jButtonCerrarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEvaluacionesPeriodos")) {
				jButtonCerrarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEvaluacionesPeriodos")) {
				jButtonCerrarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEvaluacionesPeriodos")) {
				jButtonMostrarOcultarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEvaluacionesPeriodos")) {
				jButtonCancelarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEvaluacionesPeriodos")) {
				jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEvaluacionesPeriodos")) {
				jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEvaluacionesPeriodos")) {
				jButtonCopiarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEvaluacionesPeriodos")) {
				jButtonVerFormEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEvaluacionesPeriodos")) {
				jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEvaluacionesPeriodos")) {
				jButtonCopiarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEvaluacionesPeriodos")) {
				jButtonVerFormEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEvaluacionesPeriodos")) {
				jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEvaluacionesPeriodos")) {
				jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEvaluacionesPeriodos")) {
				jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEvaluacionesPeriodos")) {
				jButtonRecargarInformacionEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEvaluacionesPeriodos")) {
				jButtonRecargarInformacionEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEvaluacionesPeriodos")) {
				jButtonRecargarInformacionEvaluacionesPeriodosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEvaluacionesPeriodos")) {
				jButtonAnterioresEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEvaluacionesPeriodos")) {
				jButtonAnterioresEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEvaluacionesPeriodos")) {
				jButtonAnterioresEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEvaluacionesPeriodos")) {
				jButtonSiguientesEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEvaluacionesPeriodos")) {
				jButtonSiguientesEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEvaluacionesPeriodos")) {
				jButtonSiguientesEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEvaluacionesPeriodos") || sTipo.equals("MenuItemDetalleAbrirOrderByEvaluacionesPeriodos")) {
				jButtonAbrirOrderByEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEvaluacionesPeriodos") || sTipo.equals("MenuItemDetalleMostrarOcultarEvaluacionesPeriodos")) {
				jButtonMostrarOcultarEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEvaluacionesPeriodos")) {
				jButtonNuevoGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEvaluacionesPeriodos")) {
				jButtonNuevoGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEvaluacionesPeriodos")) {
				jButtonNuevoGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEvaluacionesPeriodos")) {
				jButtonCerrarReporteDinamicoEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEvaluacionesPeriodos")) {
				jButtonGenerarReporteDinamicoEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEvaluacionesPeriodos")) {
				
				jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEvaluacionesPeriodos")) {
				jButtonCerrarImportacionEvaluacionesPeriodosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEvaluacionesPeriodos")) {
				
				jButtonGenerarImportacionEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEvaluacionesPeriodos")) {
				
				jButtonAbrirImportacionEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEvaluacionesPeriodos")) {
				jComboBoxTiposAccionesEvaluacionesPeriodosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEvaluacionesPeriodos")) {
				jComboBoxTiposRelacionesEvaluacionesPeriodosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEvaluacionesPeriodos")) {
				jComboBoxTiposAccionesEvaluacionesPeriodosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEvaluacionesPeriodos")) {
				
				jComboBoxTiposSeleccionarEvaluacionesPeriodosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEvaluacionesPeriodos")) {
				jTextFieldValorCampoGeneralEvaluacionesPeriodosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEvaluacionesPeriodos")) {
				jButtonAbrirOrderByEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEvaluacionesPeriodos")) {
				jButtonAbrirOrderByEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEvaluacionesPeriodos")) {
				jButtonCerrarOrderByEvaluacionesPeriodosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEvaluacionesPeriodosBusqueda")) {
				this.jButtonidEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("verificadoEvaluacionesPeriodosBusqueda")) {
				this.jButtonverificadoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesPeriodosUpdate")) {
				this.jButtonid_estructuraEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_estructuraEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEvaluacionesPeriodosBusqueda")) {
				this.jButtoncodigoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesPeriodosUpdate")) {
				this.jButtonid_empresaEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_empresaEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesPeriodosUpdate")) {
				this.jButtonid_sucursalEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_sucursalEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionesPeriodosUpdate")) {
				this.jButtonid_ejercicioEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_ejercicioEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate")) {
				this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoEvaluacionesPeriodosBusqueda")) {
				this.jButtoncodigo_datoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoEvaluacionesPeriodosBusqueda")) {
				this.jButtonnombre_completoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate")) {
				this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_conocimientoEvaluacionesPeriodosBusqueda")) {
				this.jButtonvalor_conocimientoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_eficienciaEvaluacionesPeriodosBusqueda")) {
				this.jButtonvalor_eficienciaEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_obtenidoEvaluacionesPeriodosBusqueda")) {
				this.jButtonvalor_obtenidoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("promedioEvaluacionesPeriodosBusqueda")) {
				this.jButtonpromedioEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaEvaluacionesPeriodosEvaluacionesPeriodos")) {
				this.jButtonBusquedaEvaluacionesPeriodosEvaluacionesPeriodosActionPerformed(evt);
			}
			
			;
			
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEvaluacionesPeriodos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesPeriodosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				


				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesPeriodos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesPeriodos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EvaluacionesPeriodos evaluacionesperiodosLocal=null;
			
			if(!this.getEsControlTabla()) {
				evaluacionesperiodosLocal=this.evaluacionesperiodos;
			} else {
				evaluacionesperiodosLocal=this.evaluacionesperiodosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
							
				
				


				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesPeriodos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesPeriodos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesPeriodosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
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
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
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
			
			


			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesPeriodosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
								
						
				


				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesPeriodos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesPeriodos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
								
				
				


				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesPeriodos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesPeriodos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesPeriodosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesPeriodosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesPeriodosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
							
				
				


				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesPeriodos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesPeriodos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesPeriodosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
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
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
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
			
			


			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesPeriodosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
								
				
				


				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesPeriodos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesPeriodos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesPeriodosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesPeriodosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesPeriodosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEvaluacionesPeriodos")) {
					jCheckBoxSeleccionarTodosEvaluacionesPeriodosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEvaluacionesPeriodos")) {
					jCheckBoxSeleccionadosEvaluacionesPeriodosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEvaluacionesPeriodos")) {
					
				}
				
				


				
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesPeriodos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesPeriodos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
												
				
				


				
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesPeriodos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesPeriodos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesPeriodosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesPeriodosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
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
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
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
			
			


			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionesPeriodosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesPeriodos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesPeriodos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionesperiodos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionesperiodos);
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
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
				
				


				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionesPeriodos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionesPeriodos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionesPeriodosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionesperiodosAnterior =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEvaluacionesPeriodos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEvaluacionesPeriodosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEvaluacionesPeriodos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.evaluacionesperiodos =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.evaluacionesperiodos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEvaluacionesPeriodos")) {
				
				}
				
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEvaluacionesPeriodos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEvaluacionesPeriodos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEvaluacionesPeriodos")) {
			
			}
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEvaluacionesPeriodos();
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
			if(sTipo.equals("NuevoEvaluacionesPeriodos")) {
				jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEvaluacionesPeriodos")) {
				jButtonDuplicarEvaluacionesPeriodosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEvaluacionesPeriodos")) {
				jButtonCopiarEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEvaluacionesPeriodos")) {
				jButtonVerFormEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEvaluacionesPeriodos")) {
				jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEvaluacionesPeriodos")) {
				jButtonModificarEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEvaluacionesPeriodos")) {
				jButtonActualizarEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEvaluacionesPeriodos")) {
				jButtonEliminarEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEvaluacionesPeriodos")) {
				jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEvaluacionesPeriodos")) {
				jButtonCancelarEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEvaluacionesPeriodos")) {
				jButtonCerrarEvaluacionesPeriodosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEvaluacionesPeriodos")) {
				jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEvaluacionesPeriodos")) {
				jButtonNuevoGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEvaluacionesPeriodos")) {
				jButtonAbrirOrderByEvaluacionesPeriodosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEvaluacionesPeriodos")) {
				jButtonRecargarInformacionEvaluacionesPeriodosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEvaluacionesPeriodos")) {
				jButtonAnterioresEvaluacionesPeriodosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEvaluacionesPeriodos")) {
				jButtonSiguientesEvaluacionesPeriodosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEvaluacionesPeriodosBusqueda")) {
				this.jButtonidEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("verificadoEvaluacionesPeriodosBusqueda")) {
				this.jButtonverificadoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesPeriodosUpdate")) {
				this.jButtonid_estructuraEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_estructuraEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEvaluacionesPeriodosBusqueda")) {
				this.jButtoncodigoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesPeriodosUpdate")) {
				this.jButtonid_empresaEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_empresaEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesPeriodosUpdate")) {
				this.jButtonid_sucursalEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_sucursalEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionesPeriodosUpdate")) {
				this.jButtonid_ejercicioEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_ejercicioEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate")) {
				this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoEvaluacionesPeriodosBusqueda")) {
				this.jButtoncodigo_datoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoEvaluacionesPeriodosBusqueda")) {
				this.jButtonnombre_completoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate")) {
				this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda")) {
				this.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_conocimientoEvaluacionesPeriodosBusqueda")) {
				this.jButtonvalor_conocimientoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_eficienciaEvaluacionesPeriodosBusqueda")) {
				this.jButtonvalor_eficienciaEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_obtenidoEvaluacionesPeriodosBusqueda")) {
				this.jButtonvalor_obtenidoEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("promedioEvaluacionesPeriodosBusqueda")) {
				this.jButtonpromedioEvaluacionesPeriodosBusquedaActionPerformed(evt);
			}
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEvaluacionesPeriodos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEvaluacionesPeriodos")) {
				closingInternalFrameEvaluacionesPeriodos();
				
			} else if(sTipo.equals("jButtonCancelarEvaluacionesPeriodos")) {
				JInternalFrameBase jInternalFrameDetalleFormEvaluacionesPeriodos = (JInternalFrameBase)evt.getSource();
	            	
	            EvaluacionesPeriodosBeanSwingJInternalFrame jInternalFrameParent=(EvaluacionesPeriodosBeanSwingJInternalFrame)jInternalFrameDetalleFormEvaluacionesPeriodos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEvaluacionesPeriodosActionPerformed(null);
			}
			
			EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.evaluacionesperiodos,new Object(),this.evaluacionesperiodosParameterGeneral,this.evaluacionesperiodosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEvaluacionesPeriodos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEvaluacionesPeriodos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEvaluacionesPeriodos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.evaluacionesperiodos)) {
			if(!esControlTabla) {
				if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);			
				}
				
				if(this.evaluacionesperiodosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEvaluacionesPeriodos(this.evaluacionesperiodosReturnGeneral,this.evaluacionesperiodosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.evaluacionesperiodosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEvaluacionesPeriodos(classes,this.evaluacionesperiodosReturnGeneral,this.evaluacionesperiodosBean,false);
					}
						
					if(this.evaluacionesperiodosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionesPeriodos(this.evaluacionesperiodosReturnGeneral.getEvaluacionesPeriodos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEvaluacionesPeriodos(this.evaluacionesperiodosReturnGeneral.getEvaluacionesPeriodos());	
					}
						
					if(this.evaluacionesperiodosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEvaluacionesPeriodos(this.evaluacionesperiodosReturnGeneral.getEvaluacionesPeriodos(),classes);//this.evaluacionesperiodosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEvaluacionesPeriodos(this.evaluacionesperiodos,classes);//this.evaluacionesperiodosBean);									
				}
			
				if(EvaluacionesPeriodosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEvaluacionesPeriodos(this.evaluacionesperiodos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionesPeriodos(this.evaluacionesperiodos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.evaluacionesperiodosAnterior!=null) {
						this.evaluacionesperiodos=this.evaluacionesperiodosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.evaluacionesperiodosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.evaluacionesperiodosReturnGeneral.getEvaluacionesPeriodos(),evaluacionesperiodosLogic.getEvaluacionesPeriodoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.evaluacionesperiodosReturnGeneral.getEvaluacionesPeriodos(),this.evaluacionesperiodoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEvaluacionesPeriodos.repaint();
				
				//((AbstractTableModel) this.jTableDatosEvaluacionesPeriodos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEvaluacionesPeriodos();
			}
		}
	}
	
	public void actualizarVisualTableDatosEvaluacionesPeriodos() throws Exception {
		
		EvaluacionesPeriodosModel evaluacionesperiodosModel=(EvaluacionesPeriodosModel)this.jTableDatosEvaluacionesPeriodos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionesperiodosModel.evaluacionesperiodoss=this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			evaluacionesperiodosModel.evaluacionesperiodoss=this.evaluacionesperiodoss;
		}
		
		
		((EvaluacionesPeriodosModel) this.jTableDatosEvaluacionesPeriodos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEvaluacionesPeriodos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getevaluacionesperiodosAnterior(),this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getevaluacionesperiodosAnterior(),this.evaluacionesperiodoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEvaluacionesPeriodos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
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
										
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionesperiodos,new Object(),generalEntityParameterGeneral,this.evaluacionesperiodosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EvaluacionesPeriodosConstantesFunciones.getClassesRelationshipsOfEvaluacionesPeriodos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EvaluacionesPeriodosConstantesFunciones.getClassesRelationshipsFromStringsOfEvaluacionesPeriodos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEvaluacionesPeriodos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionesperiodos,new Object(),generalEntityParameterGeneral,this.evaluacionesperiodosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEvaluacionesPeriodos(EvaluacionesPeriodosBean evaluacionesperiodosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEvaluacionesPeriodos(ArrayList<Classe> classes,EvaluacionesPeriodosReturnGeneral evaluacionesperiodosReturnGeneral,EvaluacionesPeriodosBean evaluacionesperiodosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.evaluacionesperiodos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos = new EvaluacionesPeriodosDetalleFormJInternalFrame(jDesktopPane,this.evaluacionesperiodosSessionBean.getConGuardarRelaciones(),this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.setVisible(false);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.setSelected(false);						
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.evaluacionesperiodosLogic=this.evaluacionesperiodosLogic;
		
		this.cargarCombosFrameForeignKeyEvaluacionesPeriodos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEvaluacionesPeriodos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEvaluacionesPeriodos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEvaluacionesPeriodos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEvaluacionesPeriodos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEvaluacionesPeriodos"));
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonModificarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"ModificarEvaluacionesPeriodos"));

		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonModificarToolBarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"ModificarToolBarEvaluacionesPeriodos"));
					
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemModificarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"MenuItemModificarEvaluacionesPeriodos"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonActualizarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"ActualizarEvaluacionesPeriodos"));
		
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonActualizarToolBarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEvaluacionesPeriodos"));
						
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemActualizarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEvaluacionesPeriodos"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonEliminarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"EliminarEvaluacionesPeriodos"));
		
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonEliminarToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"EliminarToolBarEvaluacionesPeriodos"));
								
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemEliminarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEvaluacionesPeriodos"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonCancelarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"CancelarEvaluacionesPeriodos"));
		
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonCancelarToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"CancelarToolBarEvaluacionesPeriodos"));
					
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemCancelarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEvaluacionesPeriodos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemDetalleCerrarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEvaluacionesPeriodos"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionesPeriodos"));
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionesPeriodos"));
		
		
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEvaluacionesPeriodos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonidEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonverificadoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"verificadoEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_estructuraEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_estructuraEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtoncodigoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"codigoEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_empresaEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_empresaEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_sucursalEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_sucursalEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_ejercicioEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_ejercicioEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtoncodigo_datoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonnombre_completoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonpromedioEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"promedioEvaluacionesPeriodosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTabbedPaneRelacionesEvaluacionesPeriodos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEvaluacionesPeriodos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEvaluacionesPeriodos"));
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEvaluacionesPeriodos"));
		}
		
		this.jTableDatosEvaluacionesPeriodos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEvaluacionesPeriodos"));
		
		this.jTableDatosEvaluacionesPeriodos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEvaluacionesPeriodos"));
		
		this.jButtonNuevoEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"NuevoEvaluacionesPeriodos"));
		
		this.jButtonDuplicarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"DuplicarEvaluacionesPeriodos"));
		
		this.jButtonCopiarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"CopiarEvaluacionesPeriodos"));
		
		this.jButtonVerFormEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"VerFormEvaluacionesPeriodos"));
		
		
		this.jButtonNuevoToolBarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"NuevoToolBarEvaluacionesPeriodos"));
			
		this.jButtonDuplicarToolBarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEvaluacionesPeriodos"));
			
		this.jMenuItemNuevoEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEvaluacionesPeriodos"));
			
		this.jMenuItemDuplicarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEvaluacionesPeriodos"));		
		
		
		this.jButtonNuevoRelacionesEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEvaluacionesPeriodos"));
		
		
		this.jButtonNuevoRelacionesToolBarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEvaluacionesPeriodos"));
			
		this.jMenuItemNuevoRelacionesEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEvaluacionesPeriodos"));		
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonModificarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"ModificarEvaluacionesPeriodos"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonModificarToolBarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"ModificarToolBarEvaluacionesPeriodos"));
			
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemModificarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"MenuItemModificarEvaluacionesPeriodos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonActualizarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"ActualizarEvaluacionesPeriodos"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonActualizarToolBarEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEvaluacionesPeriodos"));
				
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemActualizarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEvaluacionesPeriodos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonEliminarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"EliminarEvaluacionesPeriodos"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonEliminarToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"EliminarToolBarEvaluacionesPeriodos"));
						
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemEliminarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEvaluacionesPeriodos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonCancelarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"CancelarEvaluacionesPeriodos"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonCancelarToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"CancelarToolBarEvaluacionesPeriodos"));
			
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemCancelarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEvaluacionesPeriodos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEvaluacionesPeriodos"));		
		
		
		this.jButtonCerrarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"CerrarEvaluacionesPeriodos"));
		
		
		this.jButtonCerrarToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"CerrarToolBarEvaluacionesPeriodos"));
			
		this.jMenuItemCerrarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEvaluacionesPeriodos"));
			
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jMenuItemDetalleCerrarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEvaluacionesPeriodos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"GuardarCambiosEvaluacionesPeriodos"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionesPeriodos"));
		}
		
		this.jButtonCopiarToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"CopiarToolBarEvaluacionesPeriodos"));
			
		this.jButtonVerFormToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"VerFormToolBarEvaluacionesPeriodos"));
		
		this.jMenuItemGuardarCambiosEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEvaluacionesPeriodos"));
			
		this.jMenuItemCopiarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEvaluacionesPeriodos"));		
		
		this.jMenuItemVerFormEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEvaluacionesPeriodos"));		
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEvaluacionesPeriodos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEvaluacionesPeriodos"));
			
		this.jMenuItemGuardarCambiosTablaEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEvaluacionesPeriodos"));		
		
		
		
		this.jButtonRecargarInformacionEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"RecargarInformacionEvaluacionesPeriodos"));
					
		this.jButtonRecargarInformacionToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEvaluacionesPeriodos"));
		
		this.jMenuItemRecargarInformacionEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEvaluacionesPeriodos"));		
		
		
		
		this.jButtonAnterioresEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"AnterioresEvaluacionesPeriodos"));
		
		
		this.jButtonAnterioresToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEvaluacionesPeriodos"));
		
		this.jMenuItemAnterioresEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEvaluacionesPeriodos"));		
		
		
		this.jButtonSiguientesEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"SiguientesEvaluacionesPeriodos"));
		
		
		this.jButtonSiguientesToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEvaluacionesPeriodos"));
			
		this.jMenuItemSiguientesEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEvaluacionesPeriodos"));
			
		this.jMenuItemAbrirOrderByEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEvaluacionesPeriodos"));
			
		this.jMenuItemMostrarOcultarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEvaluacionesPeriodos"));
			
		this.jMenuItemDetalleAbrirOrderByEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEvaluacionesPeriodos"));
			
		this.jMenuItemDetalleMostarOcultarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEvaluacionesPeriodos"));		
		
		
		this.jButtonNuevoGuardarCambiosEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEvaluacionesPeriodos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEvaluacionesPeriodos"));
			
		this.jMenuItemNuevoGuardarCambiosEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEvaluacionesPeriodos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEvaluacionesPeriodos"));

		this.jCheckBoxSeleccionadosEvaluacionesPeriodos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEvaluacionesPeriodos"));
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEvaluacionesPeriodos"));
		}
		
		
		this.jComboBoxTiposRelacionesEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"TiposRelacionesEvaluacionesPeriodos"));
			
		this.jComboBoxTiposAccionesEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"TiposAccionesEvaluacionesPeriodos"));
					
		this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEvaluacionesPeriodos"));
			
		this.jTextFieldValorCampoGeneralEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEvaluacionesPeriodos"));		
		
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonidEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonverificadoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"verificadoEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_estructuraEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_estructuraEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtoncodigoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"codigoEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_empresaEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_empresaEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_sucursalEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_sucursalEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_ejercicioEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_ejercicioEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtoncodigo_datoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonnombre_completoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonpromedioEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"promedioEvaluacionesPeriodosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"BusquedaEvaluacionesPeriodosEvaluacionesPeriodos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEvaluacionesPeriodos!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionesPeriodos"));
				this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionesPeriodos"));
				this.jInternalFrameReporteDinamicoEvaluacionesPeriodos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionesPeriodos"));
			}
			
			//this.jButtonCerrarReporteDinamicoEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionesPeriodos"));				
			//this.jButtonGenerarReporteDinamicoEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionesPeriodos"));
			//this.jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionesPeriodos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEvaluacionesPeriodos!=null) {
				this.jInternalFrameImportacionEvaluacionesPeriodos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEvaluacionesPeriodos"));
				this.jInternalFrameImportacionEvaluacionesPeriodos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEvaluacionesPeriodos"));
				this.jInternalFrameImportacionEvaluacionesPeriodos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEvaluacionesPeriodos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"AbrirOrderByEvaluacionesPeriodos"));
			
			this.jButtonAbrirOrderByToolBarEvaluacionesPeriodos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEvaluacionesPeriodos"));			
			
			if(this.jInternalFrameOrderByEvaluacionesPeriodos!=null) {
				this.jInternalFrameOrderByEvaluacionesPeriodos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEvaluacionesPeriodos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTabbedPaneRelacionesEvaluacionesPeriodos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEvaluacionesPeriodos"));
		
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
            		closingInternalFrameEvaluacionesPeriodos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEvaluacionesPeriodos = (JInternalFrameBase)event.getSource();
	            	
	            EvaluacionesPeriodosBeanSwingJInternalFrame jInternalFrameParent=(EvaluacionesPeriodosBeanSwingJInternalFrame)jInternalFrameDetalleFormEvaluacionesPeriodos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEvaluacionesPeriodosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEvaluacionesPeriodos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEvaluacionesPeriodosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEvaluacionesPeriodos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEvaluacionesPeriodos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEvaluacionesPeriodos";
		inputMap = this.jButtonNuevoEvaluacionesPeriodos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEvaluacionesPeriodos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEvaluacionesPeriodos";
		inputMap = this.jButtonNuevoRelacionesEvaluacionesPeriodos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEvaluacionesPeriodos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEvaluacionesPeriodosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEvaluacionesPeriodos";
		inputMap = this.jButtonModificarEvaluacionesPeriodos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEvaluacionesPeriodos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEvaluacionesPeriodosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEvaluacionesPeriodos";
		inputMap = this.jButtonActualizarEvaluacionesPeriodos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEvaluacionesPeriodos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEvaluacionesPeriodosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEvaluacionesPeriodos";
		inputMap = this.jButtonEliminarEvaluacionesPeriodos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEvaluacionesPeriodos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEvaluacionesPeriodosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEvaluacionesPeriodos";
		inputMap = this.jButtonCancelarEvaluacionesPeriodos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEvaluacionesPeriodos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEvaluacionesPeriodosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEvaluacionesPeriodos";
		inputMap = this.jButtonCerrarEvaluacionesPeriodos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEvaluacionesPeriodos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEvaluacionesPeriodosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEvaluacionesPeriodos";
		inputMap = this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosEvaluacionesPeriodos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonGuardarCambiosEvaluacionesPeriodos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEvaluacionesPeriodos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEvaluacionesPeriodosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEvaluacionesPeriodos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEvaluacionesPeriodosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEvaluacionesPeriodosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEvaluacionesPeriodos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEvaluacionesPeriodosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonidEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonverificadoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"verificadoEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_estructuraEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_estructuraEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtoncodigoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"codigoEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_empresaEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_empresaEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_sucursalEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_sucursalEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_ejercicioEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_ejercicioEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_evaluacion_empleadoEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_evaluacion_empleadoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtoncodigo_datoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonnombre_completoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoEvaluacionesPeriodosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesPeriodosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonid_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonvalor_conocimientoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonvalor_eficienciaEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonvalor_obtenidoEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoEvaluacionesPeriodosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jButtonpromedioEvaluacionesPeriodosBusqueda.addActionListener(new ButtonActionListener(this,"promedioEvaluacionesPeriodosBusqueda"));
		
		
		this.jButtonBusquedaEvaluacionesPeriodosEvaluacionesPeriodos.addActionListener(new ButtonActionListener(this,"BusquedaEvaluacionesPeriodosEvaluacionesPeriodos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEvaluacionesPeriodos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEvaluacionesPeriodosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEvaluacionesPeriodosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEvaluacionesPeriodos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEvaluacionesPeriodos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
					evaluacionesperiodosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodoss) {
					evaluacionesperiodosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEvaluacionesPeriodosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
						evaluacionesperiodosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodoss) {
						evaluacionesperiodosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
					
						if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_VERIFICADO)) {
							existe=true;
							evaluacionesperiodosAux.setverificado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodoss) {
						
						if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_VERIFICADO)) {
							existe=true;
							evaluacionesperiodosAux.setverificado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEvaluacionesPeriodos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEvaluacionesPeriodos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEvaluacionesPeriodosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEvaluacionesPeriodos.getSelectedRows();
			
			EvaluacionesPeriodos evaluacionesperiodosLocal=new EvaluacionesPeriodos();
			
			//this.seleccionarTodosEvaluacionesPeriodos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionesperiodosLocal =(EvaluacionesPeriodos) this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss().toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					evaluacionesperiodosLocal =(EvaluacionesPeriodos) this.evaluacionesperiodoss.toArray()[this.jTableDatosEvaluacionesPeriodos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				evaluacionesperiodosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
						evaluacionesperiodosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodoss) {
						evaluacionesperiodosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEvaluacionesPeriodos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEvaluacionesPeriodos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionesPeriodos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEvaluacionesPeriodosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEvaluacionesPeriodosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEvaluacionesPeriodosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEvaluacionesPeriodos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
				
						if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							evaluacionesperiodosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							evaluacionesperiodosAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							evaluacionesperiodosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO)) {
							existe=true;
							evaluacionesperiodosAux.setvalor_conocimiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA)) {
							existe=true;
							evaluacionesperiodosAux.setvalor_eficiencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO)) {
							existe=true;
							evaluacionesperiodosAux.setvalor_obtenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO)) {
							existe=true;
							evaluacionesperiodosAux.setpromedio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodoss) {
					
						if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							evaluacionesperiodosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							evaluacionesperiodosAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							evaluacionesperiodosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO)) {
							existe=true;
							evaluacionesperiodosAux.setvalor_conocimiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA)) {
							existe=true;
							evaluacionesperiodosAux.setvalor_eficiencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO)) {
							existe=true;
							evaluacionesperiodosAux.setvalor_obtenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO)) {
							existe=true;
							evaluacionesperiodosAux.setpromedio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEvaluacionesPeriodosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEvaluacionesPeriodos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEvaluacionesPeriodos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEvaluacionesPeriodos) {				
					conSplash=true;//false;										
					
					//this.startProcessEvaluacionesPeriodos(conSplash);
				
					this.generarReporteEvaluacionesPeriodossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesPeriodos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEvaluacionesPeriodossSeleccionados();
				//this.jComboBoxTiposAccionesEvaluacionesPeriodos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEvaluacionesPeriodossSeleccionados(false);
				//this.jComboBoxTiposAccionesEvaluacionesPeriodos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEvaluacionesPeriodossSeleccionados(true);
				//this.jComboBoxTiposAccionesEvaluacionesPeriodos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEvaluacionesPeriodos();
				
				this.exportarEvaluacionesPeriodossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesPeriodos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEvaluacionesPeriodoss();
				//this.importarEvaluacionesPeriodoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesPeriodos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEvaluacionesPeriodos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEvaluacionesPeriodossSeleccionados();
				//this.jComboBoxTiposAccionesEvaluacionesPeriodos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Evaluaciones Periodos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEvaluacionesPeriodos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEvaluacionesPeriodos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEvaluacionesPeriodos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Evaluaciones Periodos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionesPeriodos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setSelectedIndex(0);					
				}	
			} 			
			else if(EvaluacionesPeriodosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEvaluacionesPeriodos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEvaluacionesPeriodos(conSplash);
					
						//this.actualizarParametrosGeneralEvaluacionesPeriodos();
						
						this.generarReporteProcesoAccionEvaluacionesPeriodossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEvaluacionesPeriodos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Evaluaciones PeriodosES SELECCIONADOS?", "MANTENIMIENTO DE Evaluaciones Periodos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEvaluacionesPeriodos();
				
						this.actualizarParametrosGeneralEvaluacionesPeriodos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.evaluacionesperiodosReturnGeneral=evaluacionesperiodosLogic.procesarAccionEvaluacionesPeriodossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss(),this.evaluacionesperiodosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEvaluacionesPeriodosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEvaluacionesPeriodos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEvaluacionesPeriodos();
					
					EvaluacionesPeriodosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEvaluacionesPeriodosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEvaluacionesPeriodos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxTiposAccionesFormularioEvaluacionesPeriodos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEvaluacionesPeriodos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEvaluacionesPeriodosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEvaluacionesPeriodos();
			
			if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();		
			EvaluacionesPeriodos evaluacionesperiodos=new EvaluacionesPeriodos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEvaluacionesPeriodos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEvaluacionesPeriodos.getSelectedItem();
			
			
			
			
			evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(true);
			//this.sTipoAccion;
			
			if(evaluacionesperiodossSeleccionados.size()==1) {
				for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodossSeleccionados) {
					evaluacionesperiodos=evaluacionesperiodosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEvaluacionesPeriodos();
			
      		//this.finishProcessEvaluacionesPeriodos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEvaluacionesPeriodosReturnGeneral() throws Exception {
		if(this.evaluacionesperiodosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.evaluacionesperiodosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.evaluacionesperiodosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.evaluacionesperiodosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.evaluacionesperiodosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.evaluacionesperiodosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEvaluacionesPeriodos(false);
		}
		
		if(this.evaluacionesperiodosReturnGeneral.getConRetornoLista() || this.evaluacionesperiodosReturnGeneral.getConRetornoObjeto()) {
			if(this.evaluacionesperiodosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.evaluacionesperiodosLogic.setEvaluacionesPeriodoss(this.evaluacionesperiodosReturnGeneral.getEvaluacionesPeriodoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingEvaluacionesPeriodos(false);
		}
	}
	
	public void actualizarParametrosGeneralEvaluacionesPeriodos() throws Exception {
		
		
	}
	
	public ArrayList<EvaluacionesPeriodos> getEvaluacionesPeriodossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEvaluacionesPeriodos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodosLogic.getEvaluacionesPeriodoss()) {
					if(evaluacionesperiodosAux.getIsSelected()) {
						evaluacionesperiodossSeleccionados.add(evaluacionesperiodosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionesPeriodos evaluacionesperiodosAux:this.evaluacionesperiodoss) {
					if(evaluacionesperiodosAux.getIsSelected()) {
						evaluacionesperiodossSeleccionados.add(evaluacionesperiodosAux);				
					}
				}
			}
			
			if(evaluacionesperiodossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						evaluacionesperiodossSeleccionados.addAll(this.evaluacionesperiodosLogic.getEvaluacionesPeriodoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						evaluacionesperiodossSeleccionados.addAll(this.evaluacionesperiodoss);				
					}
				}
			}
		} else {
			evaluacionesperiodossSeleccionados.add(this.evaluacionesperiodos);
		}
		
		return evaluacionesperiodossSeleccionados;
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
	
	public void generarReporteEvaluacionesPeriodossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEvaluacionesPeriodossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEvaluacionesPeriodossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEvaluacionesPeriodossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEvaluacionesPeriodossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Evaluaciones Periodos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEvaluacionesPeriodossSeleccionados() throws Exception {
		ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();		
		
		evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEvaluacionesPeriodoss("Todos",evaluacionesperiodossSeleccionados);
		
	}	
	
	public void generarReporteNormalEvaluacionesPeriodossSeleccionados() throws Exception {
		ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();		
		
		evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEvaluacionesPeriodoss("Todos",evaluacionesperiodossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEvaluacionesPeriodossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();
		
		evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEvaluacionesPeriodoss("Todos",evaluacionesperiodossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEvaluacionesPeriodossSeleccionados() throws Exception {
		ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEvaluacionesPeriodos();
		
		
		evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEvaluacionesPeriodos();
		
		
		//this.generarReporteEvaluacionesPeriodoss("Todos",evaluacionesperiodossSeleccionados ,evaluacionesperiodosImplementable,evaluacionesperiodosImplementableHome);
	}
	
	public void mostrarImportacionEvaluacionesPeriodoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEvaluacionesPeriodos();
		
		this.abrirFrameImportacionEvaluacionesPeriodos();		
		
			
		//this.generarReporteEvaluacionesPeriodoss("Todos",evaluacionesperiodossSeleccionados ,evaluacionesperiodosImplementable,evaluacionesperiodosImplementableHome);
	}
	
	public void importarEvaluacionesPeriodoss() throws Exception {		
	
	}
	
	public void exportarEvaluacionesPeriodossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEvaluacionesPeriodossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEvaluacionesPeriodossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEvaluacionesPeriodossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Evaluaciones Periodos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEvaluacionesPeriodossSeleccionados() throws Exception {
		ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();		
		
		evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesperiodos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEvaluacionesPeriodos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEvaluacionesPeriodos(evaluacionesperiodosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//evaluacionesperiodosAux.setsDetalleGeneralEntityReporte(evaluacionesperiodosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Periodos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEvaluacionesPeriodos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_VERIFICADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=evaluacionesperiodos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.gettipocalificacionempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getverificado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.gettipoevaluacionempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getcodigo_dato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getformatonomipreguntanomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getvalor_conocimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getvalor_eficiencia().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getvalor_obtenido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionesperiodos.getpromedio().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEvaluacionesPeriodossSeleccionados() throws Exception {
		ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();		
		
		evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesperiodos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EvaluacionesPeriodoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEvaluacionesPeriodos(row);				
				iRow++;
			}				
			
			for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEvaluacionesPeriodos(evaluacionesperiodosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Periodos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEvaluacionesPeriodossSeleccionados() throws Exception {
		ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();		
		
		evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionesperiodos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("evaluacionesperiodoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("evaluacionesperiodos");
			//elementRoot.appendChild(element);
		
			for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodossSeleccionados) {
				element = document.createElement("evaluacionesperiodos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEvaluacionesPeriodos(evaluacionesperiodosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluaciones Periodos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEvaluacionesPeriodos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VERIFICADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VALORCONOCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOREFICIENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_VALOROBTENIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionesPeriodosConstantesFunciones.LABEL_PROMEDIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.gettipocalificacionempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getverificado());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.gettipoevaluacionempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getcodigo_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getformatonomipreguntanomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getvalor_conocimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getvalor_eficiencia());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getvalor_obtenido());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionesperiodos.getpromedio());				
	}
	
	public void setFilaDatosExportarXmlEvaluacionesPeriodos(EvaluacionesPeriodos evaluacionesperiodos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EvaluacionesPeriodosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(evaluacionesperiodos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EvaluacionesPeriodosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(evaluacionesperiodos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipocalificacionempleado_descripcion = document.createElement(EvaluacionesPeriodosConstantesFunciones.IDTIPOCALIFICACIONEMPLEADO);
		elementtipocalificacionempleado_descripcion.appendChild(document.createTextNode(evaluacionesperiodos.gettipocalificacionempleado_descripcion()));
		element.appendChild(elementtipocalificacionempleado_descripcion);

		Element elementverificado = document.createElement(EvaluacionesPeriodosConstantesFunciones.VERIFICADO);
		elementverificado.appendChild(document.createTextNode(evaluacionesperiodos.getverificado().toString().trim()));
		element.appendChild(elementverificado);

		Element elementestructura_descripcion = document.createElement(EvaluacionesPeriodosConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(evaluacionesperiodos.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementcodigo = document.createElement(EvaluacionesPeriodosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(evaluacionesperiodos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementempresa_descripcion = document.createElement(EvaluacionesPeriodosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(evaluacionesperiodos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(EvaluacionesPeriodosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(evaluacionesperiodos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(EvaluacionesPeriodosConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(evaluacionesperiodos.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementtipoevaluacionempleado_descripcion = document.createElement(EvaluacionesPeriodosConstantesFunciones.IDTIPOEVALUACIONEMPLEADO);
		elementtipoevaluacionempleado_descripcion.appendChild(document.createTextNode(evaluacionesperiodos.gettipoevaluacionempleado_descripcion()));
		element.appendChild(elementtipoevaluacionempleado_descripcion);

		Element elementcodigo_dato = document.createElement(EvaluacionesPeriodosConstantesFunciones.CODIGODATO);
		elementcodigo_dato.appendChild(document.createTextNode(evaluacionesperiodos.getcodigo_dato().trim()));
		element.appendChild(elementcodigo_dato);

		Element elementnombre_completo = document.createElement(EvaluacionesPeriodosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(evaluacionesperiodos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementformatonomipreguntanomi_descripcion = document.createElement(EvaluacionesPeriodosConstantesFunciones.IDFORMATONOMIPREGUNTANOMI);
		elementformatonomipreguntanomi_descripcion.appendChild(document.createTextNode(evaluacionesperiodos.getformatonomipreguntanomi_descripcion()));
		element.appendChild(elementformatonomipreguntanomi_descripcion);

		Element elementvalor_conocimiento = document.createElement(EvaluacionesPeriodosConstantesFunciones.VALORCONOCIMIENTO);
		elementvalor_conocimiento.appendChild(document.createTextNode(evaluacionesperiodos.getvalor_conocimiento().toString().trim()));
		element.appendChild(elementvalor_conocimiento);

		Element elementvalor_eficiencia = document.createElement(EvaluacionesPeriodosConstantesFunciones.VALOREFICIENCIA);
		elementvalor_eficiencia.appendChild(document.createTextNode(evaluacionesperiodos.getvalor_eficiencia().toString().trim()));
		element.appendChild(elementvalor_eficiencia);

		Element elementvalor_obtenido = document.createElement(EvaluacionesPeriodosConstantesFunciones.VALOROBTENIDO);
		elementvalor_obtenido.appendChild(document.createTextNode(evaluacionesperiodos.getvalor_obtenido().toString().trim()));
		element.appendChild(elementvalor_obtenido);

		Element elementpromedio = document.createElement(EvaluacionesPeriodosConstantesFunciones.PROMEDIO);
		elementpromedio.appendChild(document.createTextNode(evaluacionesperiodos.getpromedio().toString().trim()));
		element.appendChild(elementpromedio);
	}
	
	public void generarReporteGroupGenericoEvaluacionesPeriodossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados=new ArrayList<EvaluacionesPeriodos>();
		
		evaluacionesperiodossSeleccionados=this.getEvaluacionesPeriodossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEvaluacionesPeriodos(evaluacionesperiodossSeleccionados);
		
		this.generarReporteEvaluacionesPeriodoss("Todos",evaluacionesperiodossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEvaluacionesPeriodos(ArrayList<EvaluacionesPeriodos> evaluacionesperiodossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EvaluacionesPeriodos evaluacionesperiodosAux:evaluacionesperiodossSeleccionados) {
				evaluacionesperiodosAux.setsDetalleGeneralEntityReporte(evaluacionesperiodosAux.toString());
			
				if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO)) {
					existe=true;
					evaluacionesperiodosAux.setsDescripcionGeneralEntityReporte1(evaluacionesperiodosAux.gettipocalificacionempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_VERIFICADO)) {
					existe=true;
					evaluacionesperiodosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(evaluacionesperiodosAux.getverificado()));
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					evaluacionesperiodosAux.setsDescripcionGeneralEntityReporte1(evaluacionesperiodosAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					evaluacionesperiodosAux.setsDescripcionGeneralEntityReporte1(evaluacionesperiodosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					evaluacionesperiodosAux.setsDescripcionGeneralEntityReporte1(evaluacionesperiodosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					evaluacionesperiodosAux.setsDescripcionGeneralEntityReporte1(evaluacionesperiodosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					evaluacionesperiodosAux.setsDescripcionGeneralEntityReporte1(evaluacionesperiodosAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_IDTIPOEVALUACIONEMPLEADO)) {
					existe=true;
					evaluacionesperiodosAux.setsDescripcionGeneralEntityReporte1(evaluacionesperiodosAux.gettipoevaluacionempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_CODIGODATO)) {
					existe=true;
					evaluacionesperiodosAux.setsDescripcionGeneralEntityReporte1(evaluacionesperiodosAux.getcodigo_dato());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					evaluacionesperiodosAux.setsDescripcionGeneralEntityReporte1(evaluacionesperiodosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionesPeriodosConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI)) {
					existe=true;
					evaluacionesperiodosAux.setsDescripcionGeneralEntityReporte1(evaluacionesperiodosAux.getformatonomipreguntanomi_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionesPeriodosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEvaluacionesPeriodos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=true;
				this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=true;
				this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=true;
			}
			
			this.isVisibilidadCeldaModificarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaModificarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaModificarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaModificarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaModificarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaModificarEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EvaluacionesPeriodosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=true;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=true;
		} else {
			this.actualizarEstadoPanelsEvaluacionesPeriodos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEvaluacionesPeriodos=false;
			//this.isVisibilidadCeldaVerFormEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaDuplicarEvaluacionesPeriodos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=false;
		} else {
			this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
			if(!evaluacionesperiodosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=false;												
			}
			
			this.jButtonCerrarEvaluacionesPeriodos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=false;
		}
		
		if(!this.permiteMantenimiento(this.evaluacionesperiodos)) {
			this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=false;
			this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoEvaluacionesPeriodos=false;
		this.isVisibilidadCeldaNuevoRelacionesEvaluacionesPeriodos=false;
		this.isVisibilidadCeldaGuardarCambiosEvaluacionesPeriodos=false;
		//this.isVisibilidadCeldaModificarEvaluacionesPeriodos=true;
		this.isVisibilidadCeldaActualizarEvaluacionesPeriodos=false;
		this.isVisibilidadCeldaEliminarEvaluacionesPeriodos=false;
		//this.isVisibilidadCeldaCancelarEvaluacionesPeriodos=true;			
		this.isVisibilidadCeldaGuardarEvaluacionesPeriodos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEvaluacionesPeriodos() {
	}
	
	public void actualizarEstadoPanelsEvaluacionesPeriodos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesPeriodos!=null) {
				this.jTabbedPaneBusquedasEvaluacionesPeriodos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEvaluacionesPeriodos.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesPeriodos!=null) {
				this.jPanelPaginacionEvaluacionesPeriodos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesPeriodos!=null) {
				this.jPanelParametrosReportesEvaluacionesPeriodos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesPeriodos!=null) {
				this.jTabbedPaneBusquedasEvaluacionesPeriodos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEvaluacionesPeriodos.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionesPeriodos!=null) {
				this.jPanelPaginacionEvaluacionesPeriodos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesPeriodos!=null) {
				this.jPanelParametrosReportesEvaluacionesPeriodos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesPeriodos!=null) {
				this.jTabbedPaneBusquedasEvaluacionesPeriodos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEvaluacionesPeriodos.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionesPeriodos!=null) {
				this.jPanelPaginacionEvaluacionesPeriodos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesPeriodos!=null) {
				this.jPanelParametrosReportesEvaluacionesPeriodos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesPeriodos!=null) {
				this.jTabbedPaneBusquedasEvaluacionesPeriodos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEvaluacionesPeriodos.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionesPeriodos!=null) {
				this.jPanelPaginacionEvaluacionesPeriodos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesPeriodos!=null) {
				this.jPanelParametrosReportesEvaluacionesPeriodos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesPeriodos!=null) {
				this.jTabbedPaneBusquedasEvaluacionesPeriodos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEvaluacionesPeriodos.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesPeriodos!=null) {
				this.jPanelPaginacionEvaluacionesPeriodos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesPeriodos!=null) {
				this.jPanelParametrosReportesEvaluacionesPeriodos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesPeriodos!=null) {
				this.jTabbedPaneBusquedasEvaluacionesPeriodos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEvaluacionesPeriodos.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesPeriodos!=null) {
				this.jPanelPaginacionEvaluacionesPeriodos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesPeriodos!=null) {
				this.jPanelParametrosReportesEvaluacionesPeriodos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEdicionEvaluacionesPeriodos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesPeriodos!=null) {
				this.jTabbedPaneBusquedasEvaluacionesPeriodos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionesPeriodos!=null) {
				this.jScrollPanelDatosEvaluacionesPeriodos.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionesPeriodos!=null) {
				this.jPanelPaginacionEvaluacionesPeriodos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionesPeriodos!=null) {
				this.jPanelParametrosReportesEvaluacionesPeriodos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEvaluacionesPeriodos!=null) {
					this.jTabbedPaneBusquedasEvaluacionesPeriodos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEvaluacionesPeriodos!=null) {
				this.jPanelParametrosReportesEvaluacionesPeriodos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.evaluacionesperiodosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionesPeriodos!=null) {
				this.jTabbedPaneBusquedasEvaluacionesPeriodos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEvaluacionesPeriodos!=null) {
				this.jPanelParametrosReportesEvaluacionesPeriodos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoCalificacionEmpleado(Boolean isParaTipoCalificacionEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCalificacionEmpleadoNegation=!isParaTipoCalificacionEmpleado;

			this.isVisibilidadBusquedaEvaluacionesPeriodos=isParaTipoCalificacionEmpleado;
			if(!this.isVisibilidadBusquedaEvaluacionesPeriodos) {this.jTabbedPaneBusquedasEvaluacionesPeriodos.remove(jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadBusquedaEvaluacionesPeriodos=isParaEstructura;
			if(!this.isVisibilidadBusquedaEvaluacionesPeriodos) {this.jTabbedPaneBusquedasEvaluacionesPeriodos.remove(jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaEvaluacionesPeriodos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaEvaluacionesPeriodos) {this.jTabbedPaneBusquedasEvaluacionesPeriodos.remove(jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaEvaluacionesPeriodos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaEvaluacionesPeriodos) {this.jTabbedPaneBusquedasEvaluacionesPeriodos.remove(jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaEvaluacionesPeriodos=isParaEjercicio;
			if(!this.isVisibilidadBusquedaEvaluacionesPeriodos) {this.jTabbedPaneBusquedasEvaluacionesPeriodos.remove(jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoEvaluacionEmpleado(Boolean isParaTipoEvaluacionEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoEvaluacionEmpleadoNegation=!isParaTipoEvaluacionEmpleado;

			this.isVisibilidadBusquedaEvaluacionesPeriodos=isParaTipoEvaluacionEmpleado;
			if(!this.isVisibilidadBusquedaEvaluacionesPeriodos) {this.jTabbedPaneBusquedasEvaluacionesPeriodos.remove(jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormatoNomiPreguntaNomi(Boolean isParaFormatoNomiPreguntaNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNomiPreguntaNomiNegation=!isParaFormatoNomiPreguntaNomi;

			this.isVisibilidadBusquedaEvaluacionesPeriodos=isParaFormatoNomiPreguntaNomiNegation;
			if(!this.isVisibilidadBusquedaEvaluacionesPeriodos) {this.jTabbedPaneBusquedasEvaluacionesPeriodos.remove(jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);}
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
			
			this.inicializarActualizarBindingTablaEvaluacionesPeriodos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEvaluacionesPeriodos() {
		this.updateBorderResaltarBusquedasFormularioEvaluacionesPeriodos();
		this.updateVisibilidadBusquedasFormularioEvaluacionesPeriodos();
		this.updateHabilitarBusquedasFormularioEvaluacionesPeriodos();
	}
	
	public void updateBorderResaltarBusquedasFormularioEvaluacionesPeriodos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEvaluacionesPeriodos.getComponents().length>0) {
	

		if(this.evaluacionesperiodosConstantesFunciones.resaltarBusquedaEvaluacionesPeriodosEvaluacionesPeriodos!=null) {
			index= this.jTabbedPaneBusquedasEvaluacionesPeriodos.indexOfComponent(this.jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesPeriodos.getComponent(index);
				jPanel.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEvaluacionesPeriodos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEvaluacionesPeriodos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEvaluacionesPeriodos.indexOfComponent(this.jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesPeriodos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);
			if(!this.evaluacionesperiodosConstantesFunciones.mostrarBusquedaEvaluacionesPeriodosEvaluacionesPeriodos && index>-1) {
				this.jTabbedPaneBusquedasEvaluacionesPeriodos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEvaluacionesPeriodos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEvaluacionesPeriodos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEvaluacionesPeriodos.indexOfComponent(this.jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesPeriodos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);
				this.jTabbedPaneBusquedasEvaluacionesPeriodos.setEnabledAt(index,this.evaluacionesperiodosConstantesFunciones.activarBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEvaluacionesPeriodos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaEvaluacionesPeriodos")) {
			index= this.jTabbedPaneBusquedasEvaluacionesPeriodos.indexOfComponent(this.jPanelBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);

			this.jTabbedPaneBusquedasEvaluacionesPeriodos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionesPeriodos.getComponent(index);

			this.evaluacionesperiodosConstantesFunciones.setResaltarBusquedaEvaluacionesPeriodosEvaluacionesPeriodos(resaltar);

			jPanel.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarBusquedaEvaluacionesPeriodosEvaluacionesPeriodos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEvaluacionesPeriodos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEvaluacionesPeriodos() throws Exception {

		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEvaluacionesPeriodos();
		this.updateVisibilidadResaltarControlesFormularioEvaluacionesPeriodos();
		this.updateHabilitarResaltarControlesFormularioEvaluacionesPeriodos();
		
	}
	
	public void updateBorderResaltarControlesFormularioEvaluacionesPeriodos() throws Exception {
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.evaluacionesperiodosConstantesFunciones.resaltaridEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelidEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltaridEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarid_tipo_calificacion_empleadoEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarid_tipo_calificacion_empleadoEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarverificadoEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jCheckBoxverificadoEvaluacionesPeriodos.setBorderPainted(true);this.jInternalFrameDetalleFormEvaluacionesPeriodos.jCheckBoxverificadoEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarverificadoEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarid_estructuraEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarid_estructuraEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarcodigoEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigoEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarcodigoEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarid_empresaEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarid_empresaEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarid_sucursalEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarid_sucursalEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarid_ejercicioEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarid_ejercicioEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarid_tipo_evaluacion_empleadoEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarid_tipo_evaluacion_empleadoEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarcodigo_datoEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigo_datoEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarcodigo_datoEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarnombre_completoEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextAreanombre_completoEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarnombre_completoEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_conocimientoEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_conocimientoEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_conocimientoEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_eficienciaEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_eficienciaEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_eficienciaEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_obtenidoEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_obtenidoEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarvalor_obtenidoEvaluacionesPeriodos);}
		if(this.evaluacionesperiodosConstantesFunciones.resaltarpromedioEvaluacionesPeriodos!=null && this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldpromedioEvaluacionesPeriodos.setBorder(this.evaluacionesperiodosConstantesFunciones.resaltarpromedioEvaluacionesPeriodos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEvaluacionesPeriodos() throws Exception {		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
	
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelidEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostraridEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelidEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostraridEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_tipo_calificacion_empleadoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelid_tipo_calificacion_empleadoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_tipo_calificacion_empleadoEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jCheckBoxverificadoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarverificadoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelverificadoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarverificadoEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_estructuraEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelid_estructuraEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_estructuraEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarcodigoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelcodigoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarcodigoEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_empresaEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelid_empresaEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_empresaEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_sucursalEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelid_sucursalEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_sucursalEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_ejercicioEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelid_ejercicioEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_ejercicioEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_tipo_evaluacion_empleadoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_tipo_evaluacion_empleadoEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigo_datoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarcodigo_datoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelcodigo_datoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarcodigo_datoEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextAreanombre_completoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarnombre_completoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelnombre_completoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarnombre_completoEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_conocimientoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarvalor_conocimientoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelvalor_conocimientoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarvalor_conocimientoEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_eficienciaEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarvalor_eficienciaEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelvalor_eficienciaEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarvalor_eficienciaEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_obtenidoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarvalor_obtenidoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelvalor_obtenidoEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarvalor_obtenidoEvaluacionesPeriodos);
		//this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldpromedioEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarpromedioEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jPanelpromedioEvaluacionesPeriodos.setVisible(this.evaluacionesperiodosConstantesFunciones.mostrarpromedioEvaluacionesPeriodos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEvaluacionesPeriodos() throws Exception {
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionesPeriodos!=null) {
	
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jLabelidEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activaridEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_calificacion_empleadoEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarid_tipo_calificacion_empleadoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jCheckBoxverificadoEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarverificadoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_estructuraEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarid_estructuraEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigoEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarcodigoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_empresaEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarid_empresaEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_sucursalEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarid_sucursalEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_ejercicioEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarid_ejercicioEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_tipo_evaluacion_empleadoEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarid_tipo_evaluacion_empleadoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldcodigo_datoEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarcodigo_datoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextAreanombre_completoEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarnombre_completoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jComboBoxid_formato_nomi_pregunta_nomiEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarid_formato_nomi_pregunta_nomiEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_conocimientoEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarvalor_conocimientoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_eficienciaEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarvalor_eficienciaEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldvalor_obtenidoEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarvalor_obtenidoEvaluacionesPeriodos);
		this.jInternalFrameDetalleFormEvaluacionesPeriodos.jTextFieldpromedioEvaluacionesPeriodos.setEnabled(this.evaluacionesperiodosConstantesFunciones.activarpromedioEvaluacionesPeriodos);
		}
	}
	
		
}