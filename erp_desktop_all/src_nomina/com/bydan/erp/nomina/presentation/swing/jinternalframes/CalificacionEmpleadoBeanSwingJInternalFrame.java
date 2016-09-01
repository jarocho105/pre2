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

import com.bydan.erp.nomina.util.CalificacionEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.CalificacionEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CalificacionEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.CalificacionEmpleadoBean;
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
public class CalificacionEmpleadoBeanSwingJInternalFrame extends CalificacionEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CalificacionEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CalificacionEmpleado> calificacionempleadoValidator = new ClassValidator<CalificacionEmpleado>(CalificacionEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CalificacionEmpleado calificacionempleado;	
	public CalificacionEmpleado calificacionempleadoAux;
	public CalificacionEmpleado calificacionempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CalificacionEmpleado calificacionempleadoTotales;
	public Long idCalificacionEmpleadoActual;
	public Long iIdNuevoCalificacionEmpleado=0L;
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

	public String sFinalQueryComboEvaluacionEmpleado="";

	public List<EvaluacionEmpleado> evaluacionempleadosForeignKey;

	public List<EvaluacionEmpleado> getevaluacionempleadosForeignKey() {
		return evaluacionempleadosForeignKey;
	}

	public void setevaluacionempleadosForeignKey(List<EvaluacionEmpleado> evaluacionempleadosForeignKey) {
		this.evaluacionempleadosForeignKey = evaluacionempleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public EvaluacionEmpleado evaluacionempleadoForeignKey;

	public EvaluacionEmpleado getevaluacionempleadoForeignKey() {
		return evaluacionempleadoForeignKey;
	}

	public void setevaluacionempleadoForeignKey(EvaluacionEmpleado evaluacionempleadoForeignKey) {
		this.evaluacionempleadoForeignKey = evaluacionempleadoForeignKey;
	}

	public String sFinalQueryComboFormatoNomiFactorNomi="";

	public List<FormatoNomiFactorNomi> formatonomifactornomisForeignKey;

	public List<FormatoNomiFactorNomi> getformatonomifactornomisForeignKey() {
		return formatonomifactornomisForeignKey;
	}

	public void setformatonomifactornomisForeignKey(List<FormatoNomiFactorNomi> formatonomifactornomisForeignKey) {
		this.formatonomifactornomisForeignKey = formatonomifactornomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public FormatoNomiFactorNomi formatonomifactornomiForeignKey;

	public FormatoNomiFactorNomi getformatonomifactornomiForeignKey() {
		return formatonomifactornomiForeignKey;
	}

	public void setformatonomifactornomiForeignKey(FormatoNomiFactorNomi formatonomifactornomiForeignKey) {
		this.formatonomifactornomiForeignKey = formatonomifactornomiForeignKey;
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
	
	public Boolean isPermisoTodoCalificacionEmpleado;
	public Boolean isPermisoNuevoCalificacionEmpleado;
	public Boolean isPermisoActualizarCalificacionEmpleado;
	public Boolean isPermisoActualizarOriginalCalificacionEmpleado;
	public Boolean isPermisoEliminarCalificacionEmpleado;
	public Boolean isPermisoGuardarCambiosCalificacionEmpleado;
	public Boolean isPermisoConsultaCalificacionEmpleado;
	public Boolean isPermisoBusquedaCalificacionEmpleado;
	public Boolean isPermisoReporteCalificacionEmpleado;
	public Boolean isPermisoPaginacionMedioCalificacionEmpleado;
	public Boolean isPermisoPaginacionAltoCalificacionEmpleado;
	public Boolean isPermisoPaginacionTodoCalificacionEmpleado;
	public Boolean isPermisoCopiarCalificacionEmpleado;
	public Boolean isPermisoVerFormCalificacionEmpleado;
	public Boolean isPermisoDuplicarCalificacionEmpleado;
	public Boolean isPermisoOrdenCalificacionEmpleado;
	
	
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
	
	public CalificacionEmpleadoParameterReturnGeneral calificacionempleadoReturnGeneral;
	public CalificacionEmpleadoParameterReturnGeneral calificacionempleadoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCalificacionEmpleado=false;
	public Boolean esParaAccionDesdeFormularioCalificacionEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CalificacionEmpleadoSessionBeanAdditional calificacionempleadoSessionBeanAdditional=null;
	
	public CalificacionEmpleadoSessionBeanAdditional getCalificacionEmpleadoSessionBeanAdditional() {
		return this.calificacionempleadoSessionBeanAdditional;
	}
	
	public void setCalificacionEmpleadoSessionBeanAdditional(CalificacionEmpleadoSessionBeanAdditional calificacionempleadoSessionBeanAdditional) {
		try {
			this.calificacionempleadoSessionBeanAdditional=calificacionempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CalificacionEmpleadoBeanSwingJInternalFrameAdditional calificacionempleadoBeanSwingJInternalFrameAdditional=null;
	//public class CalificacionEmpleadoBeanSwingJInternalFrame
	
	public CalificacionEmpleadoBeanSwingJInternalFrameAdditional getCalificacionEmpleadoBeanSwingJInternalFrameAdditional() {
		return this.calificacionempleadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCalificacionEmpleadoBeanSwingJInternalFrameAdditional(CalificacionEmpleadoBeanSwingJInternalFrameAdditional calificacionempleadoBeanSwingJInternalFrameAdditional) {
		try {
			this.calificacionempleadoBeanSwingJInternalFrameAdditional=calificacionempleadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CalificacionEmpleadoLogic calificacionempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CalificacionEmpleado calificacionempleadoBean;
	public CalificacionEmpleadoConstantesFunciones calificacionempleadoConstantesFunciones;
	//public CalificacionEmpleadoParameterReturnGeneral calificacionempleadoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public EmpleadoLogic empleadoLogic;
	public EvaluacionEmpleadoLogic evaluacionempleadoLogic;
	public FormatoNomiFactorNomiLogic formatonomifactornomiLogic;
	public FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic;
	public TipoCalificacionEmpleadoLogic tipocalificacionempleadoLogic;
	
	//PARAMETROS
	
	
	//public List<CalificacionEmpleado> calificacionempleados;	
	//public List<CalificacionEmpleado> calificacionempleadosEliminados;
	//public List<CalificacionEmpleado> calificacionempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarCalificacionEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarCalificacionEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormCalificacionEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenCalificacionEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaModificarCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarCalificacionEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarCalificacionEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=false;	
	
	
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEvaluacionEmpleado=false;
	public Boolean isVisibilidadFK_IdFormatoNomiFactorNomi=false;
	public Boolean isVisibilidadFK_IdFormatoNomiPreguntaNomi=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoCalificacionEmpleado=false;
	
	public Long getiIdNuevoCalificacionEmpleado() {
		return this.iIdNuevoCalificacionEmpleado;
	}

	public void setiIdNuevoCalificacionEmpleado(Long iIdNuevoCalificacionEmpleado) {
		this.iIdNuevoCalificacionEmpleado = iIdNuevoCalificacionEmpleado;
	}
	
	public Long getidCalificacionEmpleadoActual() {
		return this.idCalificacionEmpleadoActual;
	}

	public void setidCalificacionEmpleadoActual(Long idCalificacionEmpleadoActual) {
		this.idCalificacionEmpleadoActual = idCalificacionEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CalificacionEmpleado getcalificacionempleado() {
		return this.calificacionempleado;
	}

	public void setcalificacionempleado(CalificacionEmpleado calificacionempleado) {
		this.calificacionempleado = calificacionempleado;
	}
	
	public CalificacionEmpleado getcalificacionempleadoAux() {
		return this.calificacionempleadoAux;
	}

	public void setcalificacionempleadoAux(CalificacionEmpleado calificacionempleadoAux) {
		this.calificacionempleadoAux = calificacionempleadoAux;
	}				
	
	public CalificacionEmpleado getcalificacionempleadoAnterior() {
		return this.calificacionempleadoAnterior;
	}

	public void setcalificacionempleadoAnterior(CalificacionEmpleado calificacionempleadoAnterior) {
		this.calificacionempleadoAnterior = calificacionempleadoAnterior;
	}	
	
	public CalificacionEmpleado getcalificacionempleadoTotales() {
		return this.calificacionempleadoTotales;
	}

	public void setcalificacionempleadoTotales(CalificacionEmpleado calificacionempleadoTotales) {
		this.calificacionempleadoTotales = calificacionempleadoTotales;
	}	
	
	public CalificacionEmpleado getcalificacionempleadoBean() {
		return this.calificacionempleadoBean;
	}

	public void setcalificacionempleadoBean(CalificacionEmpleado calificacionempleadoBean) {
		this.calificacionempleadoBean = calificacionempleadoBean;
	}	
	
	public CalificacionEmpleadoParameterReturnGeneral getcalificacionempleadoReturnGeneral() {
		return this.calificacionempleadoReturnGeneral;
	}

	public void setcalificacionempleadoReturnGeneral(CalificacionEmpleadoParameterReturnGeneral calificacionempleadoReturnGeneral) {
		this.calificacionempleadoReturnGeneral = calificacionempleadoReturnGeneral;
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

	public Long id_evaluacion_empleadoFK_IdEvaluacionEmpleado=-1L;

	public Long getid_evaluacion_empleadoFK_IdEvaluacionEmpleado() {
		return this.id_evaluacion_empleadoFK_IdEvaluacionEmpleado;
	}

	public void setid_evaluacion_empleadoFK_IdEvaluacionEmpleado(Long id_evaluacion_empleadoFK_IdEvaluacionEmpleado) {
		this.id_evaluacion_empleadoFK_IdEvaluacionEmpleado = id_evaluacion_empleadoFK_IdEvaluacionEmpleado;
	}

	public Long id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi=-1L;

	public Long getid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi() {
		return this.id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi;
	}

	public void setid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi(Long id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi) {
		this.id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi = id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi;
	}

	public Long id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi=-1L;

	public Long getid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi() {
		return this.id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi;
	}

	public void setid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi(Long id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi) {
		this.id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi = id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi;
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

	public Long id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado=-1L;

	public Long getid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado() {
		return this.id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado;
	}

	public void setid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado(Long id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado) {
		this.id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado = id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CalificacionEmpleadoLogic getCalificacionEmpleadoLogic()	{		
		return calificacionempleadoLogic;
	}

	public void setCalificacionEmpleadoLogic(CalificacionEmpleadoLogic calificacionempleadoLogic) {
		this.calificacionempleadoLogic = calificacionempleadoLogic;
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
	
	public Boolean getIsEsNuevoCalificacionEmpleado() {
		return isEsNuevoCalificacionEmpleado;
	}

	public void setIsEsNuevoCalificacionEmpleado(Boolean isEsNuevoCalificacionEmpleado) {
		this.isEsNuevoCalificacionEmpleado = isEsNuevoCalificacionEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioCalificacionEmpleado() {
		return esParaAccionDesdeFormularioCalificacionEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioCalificacionEmpleado(Boolean esParaAccionDesdeFormularioCalificacionEmpleado) {
		this.esParaAccionDesdeFormularioCalificacionEmpleado = esParaAccionDesdeFormularioCalificacionEmpleado;
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

			if(this.calificacionempleadoSessionBean==null) {
				this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(calificacionempleadoSessionBean.getlidEmpresaActual());
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

			if(this.calificacionempleadoSessionBean==null) {
				this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(calificacionempleadoSessionBean.getlidSucursalActual());
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

			if(this.calificacionempleadoSessionBean==null) {
				this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(calificacionempleadoSessionBean.getlidEjercicioActual());
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

			if(this.calificacionempleadoSessionBean==null) {
				this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(calificacionempleadoSessionBean.getlidPeriodoActual());
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

			if(this.calificacionempleadoSessionBean==null) {
				this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(calificacionempleadoSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosEvaluacionEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.evaluacionempleadosForeignKey=new ArrayList<EvaluacionEmpleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EvaluacionEmpleadoLogic evaluacionempleadoLogic=new EvaluacionEmpleadoLogic();

			//evaluacionempleadoLogic.getEvaluacionEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.calificacionempleadoSessionBean==null) {
				this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEvaluacionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//evaluacionempleadoLogic.getEvaluacionEmpleadoDataAccess().setIsForForeingKeyData(true);

					evaluacionempleadoLogic.getTodosEvaluacionEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.evaluacionempleadosForeignKey=evaluacionempleadoLogic.getEvaluacionEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEvaluacionEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionempleadoLogic.getEntityWithConnection(calificacionempleadoSessionBean.getlidEvaluacionEmpleadoActual());
					this.evaluacionempleadosForeignKey.add(evaluacionempleadoLogic.getEvaluacionEmpleado());
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

	public void cargarCombosFormatoNomiFactorNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatonomifactornomisForeignKey=new ArrayList<FormatoNomiFactorNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoNomiFactorNomiLogic formatonomifactornomiLogic=new FormatoNomiFactorNomiLogic();

			//formatonomifactornomiLogic.getFormatoNomiFactorNomiDataAccess().setIsForForeingKeyData(true);

			if(this.calificacionempleadoSessionBean==null) {
				this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatonomifactornomiLogic.getFormatoNomiFactorNomiDataAccess().setIsForForeingKeyData(true);

					formatonomifactornomiLogic.getTodosFormatoNomiFactorNomisWithConnection(sFinalQuery,new Pagination());

					this.formatonomifactornomisForeignKey=formatonomifactornomiLogic.getFormatoNomiFactorNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormatoNomiFactorNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomifactornomiLogic.getEntityWithConnection(calificacionempleadoSessionBean.getlidFormatoNomiFactorNomiActual());
					this.formatonomifactornomisForeignKey.add(formatonomifactornomiLogic.getFormatoNomiFactorNomi());
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

			if(this.calificacionempleadoSessionBean==null) {
				this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi()) {
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
					formatonomipreguntanomiLogic.getEntityWithConnection(calificacionempleadoSessionBean.getlidFormatoNomiPreguntaNomiActual());
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

			//tipocalificacionempleadoLogic.getTipoCalificacionEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.calificacionempleadoSessionBean==null) {
				this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocalificacionempleadoLogic.getTipoCalificacionEmpleadoDataAccess().setIsForForeingKeyData(true);

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
					tipocalificacionempleadoLogic.getEntityWithConnection(calificacionempleadoSessionBean.getlidTipoCalificacionEmpleadoActual());
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

					if(this.calificacionempleado!=null) {
						this.calificacionempleado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCalificacionEmpleado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCalificacionEmpleadoGenerico)throws Exception
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
				jComboBoxid_empresaCalificacionEmpleadoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCalificacionEmpleadoGenerico!=null && jComboBoxid_empresaCalificacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empresaCalificacionEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.calificacionempleado!=null) {
						this.calificacionempleado.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCalificacionEmpleado.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCalificacionEmpleadoGenerico)throws Exception
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
				jComboBoxid_sucursalCalificacionEmpleadoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCalificacionEmpleadoGenerico!=null && jComboBoxid_sucursalCalificacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCalificacionEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.calificacionempleado!=null) {
						this.calificacionempleado.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioCalificacionEmpleado.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioCalificacionEmpleadoGenerico)throws Exception
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
				jComboBoxid_ejercicioCalificacionEmpleadoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioCalificacionEmpleadoGenerico!=null && jComboBoxid_ejercicioCalificacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioCalificacionEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.calificacionempleado!=null) {
						this.calificacionempleado.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoCalificacionEmpleado.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoCalificacionEmpleadoGenerico)throws Exception
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
				jComboBoxid_periodoCalificacionEmpleadoGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoCalificacionEmpleadoGenerico!=null && jComboBoxid_periodoCalificacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_periodoCalificacionEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.calificacionempleado!=null) {
						this.calificacionempleado.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoCalificacionEmpleado.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoCalificacionEmpleadoGenerico)throws Exception
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
				jComboBoxid_empleadoCalificacionEmpleadoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoCalificacionEmpleadoGenerico!=null && jComboBoxid_empleadoCalificacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoCalificacionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEvaluacionEmpleadoForeignKey(Long idEvaluacionEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EvaluacionEmpleado  evaluacionempleadoTemp=null;

			for(EvaluacionEmpleado evaluacionempleadoAux:evaluacionempleadosForeignKey) {
				if(evaluacionempleadoAux.getId()!=null && evaluacionempleadoAux.getId().equals(idEvaluacionEmpleadoSeleccionado)) {
					evaluacionempleadoTemp=evaluacionempleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(evaluacionempleadoTemp!=null) {

					if(this.calificacionempleado!=null) {
						this.calificacionempleado.setEvaluacionEmpleado(evaluacionempleadoTemp);
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setSelectedItem(evaluacionempleadoTemp);
					}
				} else {
					//jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setSelectedItem(evaluacionempleadoTemp);
					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEvaluacionEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(evaluacionempleadoTemp!=null && jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado!=null) {
						jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setSelectedItem(evaluacionempleadoTemp);
					} else {
						if(jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado!=null) {
							//jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setSelectedItem(evaluacionempleadoTemp);
							if(jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.getItemCount()>0) {
								jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setSelectedIndex(0);
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

	public String getActualEvaluacionEmpleadoForeignKeyDescripcion(Long idEvaluacionEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EvaluacionEmpleado  evaluacionempleadoTemp=null;

			for(EvaluacionEmpleado evaluacionempleadoAux:evaluacionempleadosForeignKey) {
				if(evaluacionempleadoAux.getId()!=null && evaluacionempleadoAux.getId().equals(idEvaluacionEmpleadoSeleccionado)) {
					evaluacionempleadoTemp=evaluacionempleadoAux;
					break;
				}
			}


			sDescripcion=EvaluacionEmpleadoConstantesFunciones.getEvaluacionEmpleadoDescripcion(evaluacionempleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEvaluacionEmpleadoForeignKeyGenerico(Long idEvaluacionEmpleadoSeleccionado,JComboBox jComboBoxid_evaluacion_empleadoCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			EvaluacionEmpleado  evaluacionempleadoTemp=null;

			for(EvaluacionEmpleado evaluacionempleadoAux:evaluacionempleadosForeignKey) {
				if(evaluacionempleadoAux.getId()!=null && evaluacionempleadoAux.getId().equals(idEvaluacionEmpleadoSeleccionado)) {
					evaluacionempleadoTemp=evaluacionempleadoAux;
					break;
				}
			}

			if(evaluacionempleadoTemp!=null) {
				jComboBoxid_evaluacion_empleadoCalificacionEmpleadoGenerico.setSelectedItem(evaluacionempleadoTemp);
			} else {
				if(jComboBoxid_evaluacion_empleadoCalificacionEmpleadoGenerico!=null && jComboBoxid_evaluacion_empleadoCalificacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_evaluacion_empleadoCalificacionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoNomiFactorNomiForeignKey(Long idFormatoNomiFactorNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			FormatoNomiFactorNomi  formatonomifactornomiTemp=null;

			for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomisForeignKey) {
				if(formatonomifactornomiAux.getId()!=null && formatonomifactornomiAux.getId().equals(idFormatoNomiFactorNomiSeleccionado)) {
					formatonomifactornomiTemp=formatonomifactornomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatonomifactornomiTemp!=null) {

					if(this.calificacionempleado!=null) {
						this.calificacionempleado.setFormatoNomiFactorNomi(formatonomifactornomiTemp);
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setSelectedItem(formatonomifactornomiTemp);
					}
				} else {
					//jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setSelectedItem(formatonomifactornomiTemp);
					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomiFactorNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatonomifactornomiTemp!=null && jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado!=null) {
						jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setSelectedItem(formatonomifactornomiTemp);
					} else {
						if(jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado!=null) {
							//jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setSelectedItem(formatonomifactornomiTemp);
							if(jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.getItemCount()>0) {
								jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setSelectedIndex(0);
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

	public String getActualFormatoNomiFactorNomiForeignKeyDescripcion(Long idFormatoNomiFactorNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			FormatoNomiFactorNomi  formatonomifactornomiTemp=null;

			for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomisForeignKey) {
				if(formatonomifactornomiAux.getId()!=null && formatonomifactornomiAux.getId().equals(idFormatoNomiFactorNomiSeleccionado)) {
					formatonomifactornomiTemp=formatonomifactornomiAux;
					break;
				}
			}


			sDescripcion=FormatoNomiFactorNomiConstantesFunciones.getFormatoNomiFactorNomiDescripcion(formatonomifactornomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoNomiFactorNomiForeignKeyGenerico(Long idFormatoNomiFactorNomiSeleccionado,JComboBox jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			FormatoNomiFactorNomi  formatonomifactornomiTemp=null;

			for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomisForeignKey) {
				if(formatonomifactornomiAux.getId()!=null && formatonomifactornomiAux.getId().equals(idFormatoNomiFactorNomiSeleccionado)) {
					formatonomifactornomiTemp=formatonomifactornomiAux;
					break;
				}
			}

			if(formatonomifactornomiTemp!=null) {
				jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleadoGenerico.setSelectedItem(formatonomifactornomiTemp);
			} else {
				if(jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleadoGenerico!=null && jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.calificacionempleado!=null) {
						this.calificacionempleado.setFormatoNomiPreguntaNomi(formatonomipreguntanomiTemp);
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setSelectedItem(formatonomipreguntanomiTemp);
					}
				} else {
					//jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setSelectedItem(formatonomipreguntanomiTemp);
					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomiPreguntaNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatonomipreguntanomiTemp!=null && jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado!=null) {
						jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setSelectedItem(formatonomipreguntanomiTemp);
					} else {
						if(jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado!=null) {
							//jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setSelectedItem(formatonomipreguntanomiTemp);
							if(jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.getItemCount()>0) {
								jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setSelectedIndex(0);
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
	public void setActualFormatoNomiPreguntaNomiForeignKeyGenerico(Long idFormatoNomiPreguntaNomiSeleccionado,JComboBox jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleadoGenerico)throws Exception
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
				jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleadoGenerico.setSelectedItem(formatonomipreguntanomiTemp);
			} else {
				if(jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleadoGenerico!=null && jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleadoGenerico.setSelectedIndex(0);
				}
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

					if(this.calificacionempleado!=null) {
						this.calificacionempleado.setTipoCalificacionEmpleado(tipocalificacionempleadoTemp);
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setSelectedItem(tipocalificacionempleadoTemp);
					}
				} else {
					//jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setSelectedItem(tipocalificacionempleadoTemp);
					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCalificacionEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocalificacionempleadoTemp!=null && jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado!=null) {
						jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setSelectedItem(tipocalificacionempleadoTemp);
					} else {
						if(jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado!=null) {
							//jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setSelectedItem(tipocalificacionempleadoTemp);
							if(jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.getItemCount()>0) {
								jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setSelectedIndex(0);
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
	public void setActualTipoCalificacionEmpleadoForeignKeyGenerico(Long idTipoCalificacionEmpleadoSeleccionado,JComboBox jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleadoGenerico)throws Exception
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
				jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleadoGenerico.setSelectedItem(tipocalificacionempleadoTemp);
			} else {
				if(jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleadoGenerico!=null && jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CalificacionEmpleado calificacionempleado,JComboBox jComboBoxid_empresaCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCalificacionEmpleadoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCalificacionEmpleadoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				calificacionempleado.setid_empresa(empresaAux.getId());
				calificacionempleado.setempresa_descripcion(CalificacionEmpleadoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				calificacionempleado.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CalificacionEmpleado calificacionempleado,JComboBox jComboBoxid_sucursalCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCalificacionEmpleadoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCalificacionEmpleadoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				calificacionempleado.setid_sucursal(sucursalAux.getId());
				calificacionempleado.setsucursal_descripcion(CalificacionEmpleadoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				calificacionempleado.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(CalificacionEmpleado calificacionempleado,JComboBox jComboBoxid_ejercicioCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioCalificacionEmpleadoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioCalificacionEmpleadoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				calificacionempleado.setid_ejercicio(ejercicioAux.getId());
				calificacionempleado.setejercicio_descripcion(CalificacionEmpleadoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				calificacionempleado.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(CalificacionEmpleado calificacionempleado,JComboBox jComboBoxid_periodoCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoCalificacionEmpleadoGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoCalificacionEmpleadoGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				calificacionempleado.setid_periodo(periodoAux.getId());
				calificacionempleado.setperiodo_descripcion(CalificacionEmpleadoConstantesFunciones.getPeriodoDescripcion(periodoAux));
				calificacionempleado.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(CalificacionEmpleado calificacionempleado,JComboBox jComboBoxid_empleadoCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoCalificacionEmpleadoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoCalificacionEmpleadoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				calificacionempleado.setid_empleado(empleadoAux.getId());
				calificacionempleado.setempleado_descripcion(CalificacionEmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				calificacionempleado.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEvaluacionEmpleadoForeignKey(CalificacionEmpleado calificacionempleado,JComboBox jComboBoxid_evaluacion_empleadoCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			EvaluacionEmpleado  evaluacionempleadoAux=new EvaluacionEmpleado();

			if(jComboBoxid_evaluacion_empleadoCalificacionEmpleadoGenerico==null) {
				evaluacionempleadoAux=(EvaluacionEmpleado)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.getSelectedItem();
			} else {
				evaluacionempleadoAux=(EvaluacionEmpleado)jComboBoxid_evaluacion_empleadoCalificacionEmpleadoGenerico.getSelectedItem();
			}

			if(evaluacionempleadoAux!=null && evaluacionempleadoAux.getId()!=null) {
				calificacionempleado.setid_evaluacion_empleado(evaluacionempleadoAux.getId());
				calificacionempleado.setevaluacionempleado_descripcion(CalificacionEmpleadoConstantesFunciones.getEvaluacionEmpleadoDescripcion(evaluacionempleadoAux));
				calificacionempleado.setEvaluacionEmpleado(evaluacionempleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoNomiFactorNomiForeignKey(CalificacionEmpleado calificacionempleado,JComboBox jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			FormatoNomiFactorNomi  formatonomifactornomiAux=new FormatoNomiFactorNomi();

			if(jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleadoGenerico==null) {
				formatonomifactornomiAux=(FormatoNomiFactorNomi)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.getSelectedItem();
			} else {
				formatonomifactornomiAux=(FormatoNomiFactorNomi)jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleadoGenerico.getSelectedItem();
			}

			if(formatonomifactornomiAux!=null && formatonomifactornomiAux.getId()!=null) {
				calificacionempleado.setid_formato_nomi_factor_nomi(formatonomifactornomiAux.getId());
				calificacionempleado.setformatonomifactornomi_descripcion(CalificacionEmpleadoConstantesFunciones.getFormatoNomiFactorNomiDescripcion(formatonomifactornomiAux));
				calificacionempleado.setFormatoNomiFactorNomi(formatonomifactornomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoNomiPreguntaNomiForeignKey(CalificacionEmpleado calificacionempleado,JComboBox jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			FormatoNomiPreguntaNomi  formatonomipreguntanomiAux=new FormatoNomiPreguntaNomi();

			if(jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleadoGenerico==null) {
				formatonomipreguntanomiAux=(FormatoNomiPreguntaNomi)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.getSelectedItem();
			} else {
				formatonomipreguntanomiAux=(FormatoNomiPreguntaNomi)jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleadoGenerico.getSelectedItem();
			}

			if(formatonomipreguntanomiAux!=null && formatonomipreguntanomiAux.getId()!=null) {
				calificacionempleado.setid_formato_nomi_pregunta_nomi(formatonomipreguntanomiAux.getId());
				calificacionempleado.setformatonomipreguntanomi_descripcion(CalificacionEmpleadoConstantesFunciones.getFormatoNomiPreguntaNomiDescripcion(formatonomipreguntanomiAux));
				calificacionempleado.setFormatoNomiPreguntaNomi(formatonomipreguntanomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCalificacionEmpleadoForeignKey(CalificacionEmpleado calificacionempleado,JComboBox jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleadoGenerico)throws Exception
	{
		try
		{
			TipoCalificacionEmpleado  tipocalificacionempleadoAux=new TipoCalificacionEmpleado();

			if(jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleadoGenerico==null) {
				tipocalificacionempleadoAux=(TipoCalificacionEmpleado)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.getSelectedItem();
			} else {
				tipocalificacionempleadoAux=(TipoCalificacionEmpleado)jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleadoGenerico.getSelectedItem();
			}

			if(tipocalificacionempleadoAux!=null && tipocalificacionempleadoAux.getId()!=null) {
				calificacionempleado.setid_tipo_calificacion_empleado(tipocalificacionempleadoAux.getId());
				calificacionempleado.settipocalificacionempleado_descripcion(CalificacionEmpleadoConstantesFunciones.getTipoCalificacionEmpleadoDescripcion(tipocalificacionempleadoAux));
				calificacionempleado.setTipoCalificacionEmpleado(tipocalificacionempleadoAux);			}
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

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
					}

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
					}

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
					}

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
					}

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
					}

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.addItem(empleado);
							}
						}

						if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEvaluacionEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEvaluacionEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.removeAllItems();

							for(EvaluacionEmpleado evaluacionempleado:this.evaluacionempleadosForeignKey) {
								this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.addItem(evaluacionempleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
					}

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEvaluacionEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.removeAllItems();

							for(EvaluacionEmpleado evaluacionempleado:this.evaluacionempleadosForeignKey) {
								this.jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.addItem(evaluacionempleado);
							}
						}

						if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatoNomiFactorNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormatoNomiFactorNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.removeAllItems();

							for(FormatoNomiFactorNomi formatonomifactornomi:this.formatonomifactornomisForeignKey) {
								this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.addItem(formatonomifactornomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
					}

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomiFactorNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.removeAllItems();

							for(FormatoNomiFactorNomi formatonomifactornomi:this.formatonomifactornomisForeignKey) {
								this.jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.addItem(formatonomifactornomi);
							}
						}

						if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.removeAllItems();

							for(FormatoNomiPreguntaNomi formatonomipreguntanomi:this.formatonomipreguntanomisForeignKey) {
								this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.addItem(formatonomipreguntanomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
					}

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomiPreguntaNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.removeAllItems();

							for(FormatoNomiPreguntaNomi formatonomipreguntanomi:this.formatonomipreguntanomisForeignKey) {
								this.jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.addItem(formatonomipreguntanomi);
							}
						}

						if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCalificacionEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCalificacionEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.removeAllItems();

							for(TipoCalificacionEmpleado tipocalificacionempleado:this.tipocalificacionempleadosForeignKey) {
								this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.addItem(tipocalificacionempleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { 
					}

					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCalificacionEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.removeAllItems();

							for(TipoCalificacionEmpleado tipocalificacionempleado:this.tipocalificacionempleadosForeignKey) {
								this.jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.addItem(tipocalificacionempleado);
							}
						}

						if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEvaluacionEmpleadoForeignKey(EvaluacionEmpleado evaluacionempleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setSelectedItem(evaluacionempleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setSelectedItem(evaluacionempleado);
						} else {
							this.jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFormatoNomiFactorNomiForeignKey(FormatoNomiFactorNomi formatonomifactornomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setSelectedItem(formatonomifactornomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setSelectedItem(formatonomifactornomi);
						} else {
							this.jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setSelectedItem(formatonomipreguntanomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setSelectedItem(formatonomipreguntanomi);
						} else {
							this.jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoCalificacionEmpleadoForeignKey(TipoCalificacionEmpleado tipocalificacionempleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setSelectedItem(tipocalificacionempleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setSelectedItem(tipocalificacionempleado);
						} else {
							this.jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCalificacionEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CalificacionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesCalificacionEmpleado(this.calificacionempleadoLogic.getCalificacionEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CalificacionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesCalificacionEmpleado(this.calificacionempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(EvaluacionEmpleado.class));
		classes.add(new Classe(FormatoNomiFactorNomi.class));
		classes.add(new Classe(FormatoNomiPreguntaNomi.class));
		classes.add(new Classe(TipoCalificacionEmpleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//calificacionempleadoLogic.setCalificacionEmpleados(this.calificacionempleados);
			calificacionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CalificacionEmpleadoParameterReturnGeneral getCalificacionEmpleadoParameterGeneral() {
		return this.calificacionempleadoParameterGeneral;
	}
	
	public void setCalificacionEmpleadoParameterGeneral(CalificacionEmpleadoParameterReturnGeneral calificacionempleadoParameterGeneral) {
		this.calificacionempleadoParameterGeneral = calificacionempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCalificacionEmpleado() {
		return isPermisoTodoCalificacionEmpleado;
	}

	public void setIsPermisoTodoCalificacionEmpleado(Boolean isPermisoTodoCalificacionEmpleado) {
		this.isPermisoTodoCalificacionEmpleado = isPermisoTodoCalificacionEmpleado;
	}

	public Boolean getIsPermisoNuevoCalificacionEmpleado() {
		return isPermisoNuevoCalificacionEmpleado;
	}

	public void setIsPermisoNuevoCalificacionEmpleado(Boolean isPermisoNuevoCalificacionEmpleado) {
		this.isPermisoNuevoCalificacionEmpleado = isPermisoNuevoCalificacionEmpleado;
	}

	public Boolean getIsPermisoActualizarCalificacionEmpleado() {
		return isPermisoActualizarCalificacionEmpleado;
	}

	public void setIsPermisoActualizarCalificacionEmpleado(Boolean isPermisoActualizarCalificacionEmpleado) {
		this.isPermisoActualizarCalificacionEmpleado = isPermisoActualizarCalificacionEmpleado;
	}

	public Boolean getIsPermisoEliminarCalificacionEmpleado() {
		return isPermisoEliminarCalificacionEmpleado;
	}

	public void setIsPermisoEliminarCalificacionEmpleado(Boolean isPermisoEliminarCalificacionEmpleado) {
		this.isPermisoEliminarCalificacionEmpleado = isPermisoEliminarCalificacionEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosCalificacionEmpleado() {
		return isPermisoGuardarCambiosCalificacionEmpleado;
	}

	public void setIsPermisoGuardarCambiosCalificacionEmpleado(Boolean isPermisoGuardarCambiosCalificacionEmpleado) {
		this.isPermisoGuardarCambiosCalificacionEmpleado = isPermisoGuardarCambiosCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoConsultaCalificacionEmpleado() {
		return isPermisoConsultaCalificacionEmpleado;
	}

	public void setIsPermisoConsultaCalificacionEmpleado(Boolean isPermisoConsultaCalificacionEmpleado) {
		this.isPermisoConsultaCalificacionEmpleado = isPermisoConsultaCalificacionEmpleado;
	}

	public Boolean getIsPermisoBusquedaCalificacionEmpleado() {
		return isPermisoBusquedaCalificacionEmpleado;
	}

	public void setIsPermisoBusquedaCalificacionEmpleado(Boolean isPermisoBusquedaCalificacionEmpleado) {
		this.isPermisoBusquedaCalificacionEmpleado = isPermisoBusquedaCalificacionEmpleado;
	}

	public Boolean getIsPermisoReporteCalificacionEmpleado() {
		return isPermisoReporteCalificacionEmpleado;
	}

	public void setIsPermisoReporteCalificacionEmpleado(Boolean isPermisoReporteCalificacionEmpleado) {
		this.isPermisoReporteCalificacionEmpleado = isPermisoReporteCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioCalificacionEmpleado() {
		return isPermisoPaginacionMedioCalificacionEmpleado;
	}

	public void setIsPermisoPaginacionMedioCalificacionEmpleado(Boolean isPermisoPaginacionMedioCalificacionEmpleado) {
		this.isPermisoPaginacionMedioCalificacionEmpleado = isPermisoPaginacionMedioCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoCalificacionEmpleado() {
		return isPermisoPaginacionTodoCalificacionEmpleado;
	}

	public void setIsPermisoPaginacionTodoCalificacionEmpleado(Boolean isPermisoPaginacionTodoCalificacionEmpleado) {
		this.isPermisoPaginacionTodoCalificacionEmpleado = isPermisoPaginacionTodoCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoCalificacionEmpleado() {
		return isPermisoPaginacionAltoCalificacionEmpleado;
	}

	public void setIsPermisoPaginacionAltoCalificacionEmpleado(Boolean isPermisoPaginacionAltoCalificacionEmpleado) {
		this.isPermisoPaginacionAltoCalificacionEmpleado = isPermisoPaginacionAltoCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoCopiarCalificacionEmpleado() {
		return isPermisoCopiarCalificacionEmpleado;
	}

	public void setIsPermisoCopiarCalificacionEmpleado(Boolean isPermisoCopiarCalificacionEmpleado) {
		this.isPermisoCopiarCalificacionEmpleado = isPermisoCopiarCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoVerFormCalificacionEmpleado() {
		return isPermisoVerFormCalificacionEmpleado;
	}

	public void setIsPermisoVerFormCalificacionEmpleado(Boolean isPermisoVerFormCalificacionEmpleado) {
		this.isPermisoVerFormCalificacionEmpleado = isPermisoVerFormCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarCalificacionEmpleado() {
		return isPermisoDuplicarCalificacionEmpleado;
	}

	public void setIsPermisoDuplicarCalificacionEmpleado(Boolean isPermisoDuplicarCalificacionEmpleado) {
		this.isPermisoDuplicarCalificacionEmpleado = isPermisoDuplicarCalificacionEmpleado;
	}
	
	public Boolean getIsPermisoOrdenCalificacionEmpleado() {
		return isPermisoOrdenCalificacionEmpleado;
	}

	public void setIsPermisoOrdenCalificacionEmpleado(Boolean isPermisoOrdenCalificacionEmpleado) {
		this.isPermisoOrdenCalificacionEmpleado = isPermisoOrdenCalificacionEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCalificacionEmpleado() {
		return isVisibilidadCeldaNuevoCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoCalificacionEmpleado(Boolean isVisibilidadCeldaNuevoCalificacionEmpleado) {
		this.isVisibilidadCeldaNuevoCalificacionEmpleado = isVisibilidadCeldaNuevoCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCalificacionEmpleado() {
		return isVisibilidadCeldaDuplicarCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarCalificacionEmpleado(Boolean isVisibilidadCeldaDuplicarCalificacionEmpleado) {
		this.isVisibilidadCeldaDuplicarCalificacionEmpleado = isVisibilidadCeldaDuplicarCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCalificacionEmpleado() {
		return isVisibilidadCeldaCopiarCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarCalificacionEmpleado(Boolean isVisibilidadCeldaCopiarCalificacionEmpleado) {
		this.isVisibilidadCeldaCopiarCalificacionEmpleado = isVisibilidadCeldaCopiarCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCalificacionEmpleado() {
		return isVisibilidadCeldaVerFormCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormCalificacionEmpleado(Boolean isVisibilidadCeldaVerFormCalificacionEmpleado) {
		this.isVisibilidadCeldaVerFormCalificacionEmpleado = isVisibilidadCeldaVerFormCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCalificacionEmpleado() {
		return isVisibilidadCeldaOrdenCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenCalificacionEmpleado(Boolean isVisibilidadCeldaOrdenCalificacionEmpleado) {
		this.isVisibilidadCeldaOrdenCalificacionEmpleado = isVisibilidadCeldaOrdenCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCalificacionEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCalificacionEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado = isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCalificacionEmpleado() {
		return isVisibilidadCeldaModificarCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaModificarCalificacionEmpleado(Boolean isVisibilidadCeldaModificarCalificacionEmpleado) {
		this.isVisibilidadCeldaModificarCalificacionEmpleado = isVisibilidadCeldaModificarCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCalificacionEmpleado() {
		return isVisibilidadCeldaActualizarCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarCalificacionEmpleado(Boolean isVisibilidadCeldaActualizarCalificacionEmpleado) {
		this.isVisibilidadCeldaActualizarCalificacionEmpleado = isVisibilidadCeldaActualizarCalificacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarCalificacionEmpleado() {
		return isVisibilidadCeldaEliminarCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarCalificacionEmpleado(Boolean isVisibilidadCeldaEliminarCalificacionEmpleado) {
		this.isVisibilidadCeldaEliminarCalificacionEmpleado = isVisibilidadCeldaEliminarCalificacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarCalificacionEmpleado() {
		return isVisibilidadCeldaCancelarCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarCalificacionEmpleado(Boolean isVisibilidadCeldaCancelarCalificacionEmpleado) {
		this.isVisibilidadCeldaCancelarCalificacionEmpleado = isVisibilidadCeldaCancelarCalificacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarCalificacionEmpleado() {
		return isVisibilidadCeldaGuardarCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCalificacionEmpleado(Boolean isVisibilidadCeldaGuardarCalificacionEmpleado) {
		this.isVisibilidadCeldaGuardarCalificacionEmpleado = isVisibilidadCeldaGuardarCalificacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCalificacionEmpleado() {
		return isVisibilidadCeldaGuardarCambiosCalificacionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCalificacionEmpleado(Boolean isVisibilidadCeldaGuardarCambiosCalificacionEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado = isVisibilidadCeldaGuardarCambiosCalificacionEmpleado;
	}
		
	public CalificacionEmpleadoSessionBean getcalificacionempleadoSessionBean() {
		return this.calificacionempleadoSessionBean;
	}
	
	public void setcalificacionempleadoSessionBean(CalificacionEmpleadoSessionBean calificacionempleadoSessionBean) {
		this.calificacionempleadoSessionBean=calificacionempleadoSessionBean;
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

	public Boolean getisVisibilidadFK_IdEvaluacionEmpleado() {
		return this.isVisibilidadFK_IdEvaluacionEmpleado;
	}

	public void setisVisibilidadFK_IdEvaluacionEmpleado(Boolean isVisibilidadFK_IdEvaluacionEmpleado) {
		this.isVisibilidadFK_IdEvaluacionEmpleado=isVisibilidadFK_IdEvaluacionEmpleado;
	}

	public Boolean getisVisibilidadFK_IdFormatoNomiFactorNomi() {
		return this.isVisibilidadFK_IdFormatoNomiFactorNomi;
	}

	public void setisVisibilidadFK_IdFormatoNomiFactorNomi(Boolean isVisibilidadFK_IdFormatoNomiFactorNomi) {
		this.isVisibilidadFK_IdFormatoNomiFactorNomi=isVisibilidadFK_IdFormatoNomiFactorNomi;
	}

	public Boolean getisVisibilidadFK_IdFormatoNomiPreguntaNomi() {
		return this.isVisibilidadFK_IdFormatoNomiPreguntaNomi;
	}

	public void setisVisibilidadFK_IdFormatoNomiPreguntaNomi(Boolean isVisibilidadFK_IdFormatoNomiPreguntaNomi) {
		this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=isVisibilidadFK_IdFormatoNomiPreguntaNomi;
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

	public Boolean getisVisibilidadFK_IdTipoCalificacionEmpleado() {
		return this.isVisibilidadFK_IdTipoCalificacionEmpleado;
	}

	public void setisVisibilidadFK_IdTipoCalificacionEmpleado(Boolean isVisibilidadFK_IdTipoCalificacionEmpleado) {
		this.isVisibilidadFK_IdTipoCalificacionEmpleado=isVisibilidadFK_IdTipoCalificacionEmpleado;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(CalificacionEmpleado calificacionempleado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(calificacionempleado,null);
				this.setActualParaGuardarSucursalForeignKey(calificacionempleado,null);
				this.setActualParaGuardarEjercicioForeignKey(calificacionempleado,null);
				this.setActualParaGuardarPeriodoForeignKey(calificacionempleado,null);
				this.setActualParaGuardarEmpleadoForeignKey(calificacionempleado,null);
				this.setActualParaGuardarEvaluacionEmpleadoForeignKey(calificacionempleado,null);
				this.setActualParaGuardarFormatoNomiFactorNomiForeignKey(calificacionempleado,null);
				this.setActualParaGuardarFormatoNomiPreguntaNomiForeignKey(calificacionempleado,null);
				this.setActualParaGuardarTipoCalificacionEmpleadoForeignKey(calificacionempleado,null);
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
	
	public void bugActualizarReferenciaActual(CalificacionEmpleado calificacionempleado,CalificacionEmpleado calificacionempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCalificacionEmpleado(calificacionempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		calificacionempleadoAux.setId(calificacionempleado.getId());
		calificacionempleadoAux.setVersionRow(calificacionempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCalificacionEmpleado();
		
			int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = calificacionempleadoValidator.getInvalidValues(this.calificacionempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			calificacionempleadoLogic.setDatosCliente(datosCliente);
			calificacionempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				calificacionempleadoAux=new  CalificacionEmpleado();
				
				calificacionempleadoAux.setIsNew(true);
				calificacionempleadoAux.setIsChanged(true);
				
				calificacionempleadoAux.setCalificacionEmpleadoOriginal(this.calificacionempleado);
				
				calificacionempleadoAux.setId(this.calificacionempleado.getId());	
				calificacionempleadoAux.setVersionRow(this.calificacionempleado.getVersionRow());	
				calificacionempleadoAux.setid_empresa(this.calificacionempleado.getid_empresa());	
				calificacionempleadoAux.setid_sucursal(this.calificacionempleado.getid_sucursal());	
				calificacionempleadoAux.setid_ejercicio(this.calificacionempleado.getid_ejercicio());	
				calificacionempleadoAux.setid_periodo(this.calificacionempleado.getid_periodo());	
				calificacionempleadoAux.setid_empleado(this.calificacionempleado.getid_empleado());	
				calificacionempleadoAux.setid_evaluacion_empleado(this.calificacionempleado.getid_evaluacion_empleado());	
				calificacionempleadoAux.setid_formato_nomi_factor_nomi(this.calificacionempleado.getid_formato_nomi_factor_nomi());	
				calificacionempleadoAux.setid_formato_nomi_pregunta_nomi(this.calificacionempleado.getid_formato_nomi_pregunta_nomi());	
				calificacionempleadoAux.setid_tipo_calificacion_empleado(this.calificacionempleado.getid_tipo_calificacion_empleado());	
				calificacionempleadoAux.setvalor_conocimiento(this.calificacionempleado.getvalor_conocimiento());	
				calificacionempleadoAux.setvalor_eficiencia(this.calificacionempleado.getvalor_eficiencia());	
				calificacionempleadoAux.setvalor_obtenido(this.calificacionempleado.getvalor_obtenido());	
				calificacionempleadoAux.setvalor_peso(this.calificacionempleado.getvalor_peso());	
				calificacionempleadoAux.setverificado(this.calificacionempleado.getverificado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.calificacionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(calificacionempleadoAux,calificacionempleadoLogic.getCalificacionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(calificacionempleadoAux,calificacionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.calificacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.saveCalificacionEmpleados();//WithConnection
						//calificacionempleadoLogic.getSetVersionRowCalificacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.calificacionempleado,calificacionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesCalificacionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								calificacionempleadoLogic.saveCalificacionEmpleadoRelaciones(calificacionempleadoAux);//WithConnection
								//calificacionempleadoLogic.getSetVersionRowCalificacionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.calificacionempleado,calificacionempleadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.calificacionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(calificacionempleadoAux,calificacionempleadoLogic.getCalificacionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(calificacionempleadoAux,calificacionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.calificacionempleado,calificacionempleadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				calificacionempleadoAux=new  CalificacionEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.calificacionempleadoSessionBean.getEsGuardarRelacionado() && this.calificacionempleado.getId()>=0)) {
						
					calificacionempleadoAux.setIsNew(false);
				}
				
				calificacionempleadoAux.setIsDeleted(false);
			
				calificacionempleadoAux.setId(this.calificacionempleado.getId());	
				calificacionempleadoAux.setVersionRow(this.calificacionempleado.getVersionRow());	
				calificacionempleadoAux.setid_empresa(this.calificacionempleado.getid_empresa());	
				calificacionempleadoAux.setid_sucursal(this.calificacionempleado.getid_sucursal());	
				calificacionempleadoAux.setid_ejercicio(this.calificacionempleado.getid_ejercicio());	
				calificacionempleadoAux.setid_periodo(this.calificacionempleado.getid_periodo());	
				calificacionempleadoAux.setid_empleado(this.calificacionempleado.getid_empleado());	
				calificacionempleadoAux.setid_evaluacion_empleado(this.calificacionempleado.getid_evaluacion_empleado());	
				calificacionempleadoAux.setid_formato_nomi_factor_nomi(this.calificacionempleado.getid_formato_nomi_factor_nomi());	
				calificacionempleadoAux.setid_formato_nomi_pregunta_nomi(this.calificacionempleado.getid_formato_nomi_pregunta_nomi());	
				calificacionempleadoAux.setid_tipo_calificacion_empleado(this.calificacionempleado.getid_tipo_calificacion_empleado());	
				calificacionempleadoAux.setvalor_conocimiento(this.calificacionempleado.getvalor_conocimiento());	
				calificacionempleadoAux.setvalor_eficiencia(this.calificacionempleado.getvalor_eficiencia());	
				calificacionempleadoAux.setvalor_obtenido(this.calificacionempleado.getvalor_obtenido());	
				calificacionempleadoAux.setvalor_peso(this.calificacionempleado.getvalor_peso());	
				calificacionempleadoAux.setverificado(this.calificacionempleado.getverificado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(calificacionempleadoAux,calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(calificacionempleadoAux,calificacionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.calificacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.saveCalificacionEmpleados();//WithConnection
						//calificacionempleadoLogic.getSetVersionRowCalificacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.calificacionempleado,calificacionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesCalificacionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								calificacionempleadoLogic.saveCalificacionEmpleadoRelaciones(calificacionempleadoAux);//WithConnection
								//calificacionempleadoLogic.getSetVersionRowCalificacionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.calificacionempleado,calificacionempleadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.calificacionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(calificacionempleadoAux,calificacionempleadoLogic.getCalificacionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(calificacionempleadoAux,calificacionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.calificacionempleado,calificacionempleadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				calificacionempleadoAux=new  CalificacionEmpleado();
				
				calificacionempleadoAux.setIsNew(false);
				calificacionempleadoAux.setIsChanged(false);
				
				calificacionempleadoAux.setIsDeleted(true);
				
				calificacionempleadoAux.setId(this.calificacionempleado.getId());	
				calificacionempleadoAux.setVersionRow(this.calificacionempleado.getVersionRow());	
				calificacionempleadoAux.setid_empresa(this.calificacionempleado.getid_empresa());	
				calificacionempleadoAux.setid_sucursal(this.calificacionempleado.getid_sucursal());	
				calificacionempleadoAux.setid_ejercicio(this.calificacionempleado.getid_ejercicio());	
				calificacionempleadoAux.setid_periodo(this.calificacionempleado.getid_periodo());	
				calificacionempleadoAux.setid_empleado(this.calificacionempleado.getid_empleado());	
				calificacionempleadoAux.setid_evaluacion_empleado(this.calificacionempleado.getid_evaluacion_empleado());	
				calificacionempleadoAux.setid_formato_nomi_factor_nomi(this.calificacionempleado.getid_formato_nomi_factor_nomi());	
				calificacionempleadoAux.setid_formato_nomi_pregunta_nomi(this.calificacionempleado.getid_formato_nomi_pregunta_nomi());	
				calificacionempleadoAux.setid_tipo_calificacion_empleado(this.calificacionempleado.getid_tipo_calificacion_empleado());	
				calificacionempleadoAux.setvalor_conocimiento(this.calificacionempleado.getvalor_conocimiento());	
				calificacionempleadoAux.setvalor_eficiencia(this.calificacionempleado.getvalor_eficiencia());	
				calificacionempleadoAux.setvalor_obtenido(this.calificacionempleado.getvalor_obtenido());	
				calificacionempleadoAux.setvalor_peso(this.calificacionempleado.getvalor_peso());	
				calificacionempleadoAux.setverificado(this.calificacionempleado.getverificado());	
				
				if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.calificacionempleadoAux.getId()>=0) {	
						this.calificacionempleadosEliminados.add(calificacionempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(calificacionempleadoAux,calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(calificacionempleadoAux,calificacionempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.calificacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.saveCalificacionEmpleados();//WithConnection
						//calificacionempleadoLogic.getSetVersionRowCalificacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								calificacionempleadoLogic.saveCalificacionEmpleadoRelaciones(calificacionempleadoAux);//WithConnection
								//calificacionempleadoLogic.getSetVersionRowCalificacionEmpleados();//WithConnection
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
							if(this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.calificacionempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(calificacionempleadoAux,calificacionempleadoLogic.getCalificacionEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(calificacionempleadoAux,calificacionempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getCalificacionEmpleados().addAll(this.calificacionempleadosEliminados);
					
					calificacionempleadoLogic.saveCalificacionEmpleados();//WithConnection
					//calificacionempleadoLogic.getSetVersionRowCalificacionEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCalificacionEmpleado();
				
				this.calificacionempleadosEliminados= new ArrayList<CalificacionEmpleado>();		
			}
			
			if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Calificacion Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.calificacionempleado=calificacionempleadoAux;
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
      		//this.finishProcessCalificacionEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(CalificacionEmpleado calificacionempleadoLocal) throws Exception {
		
		if(this.calificacionempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CalificacionEmpleado calificacionempleadoLocal) throws Exception {	
		if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				calificacionempleadoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				calificacionempleadoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				calificacionempleadoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				calificacionempleadoLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				calificacionempleadoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EvaluacionEmpleadoDetalleFormJInternalFrame.class)) {
				EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFrameLocal=(EvaluacionEmpleadoBeanSwingJInternalFrame) ((EvaluacionEmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				evaluacionempleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEvaluacionEmpleado(evaluacionempleadoBeanSwingJInternalFrameLocal.getevaluacionempleado(),true);
				evaluacionempleadoBeanSwingJInternalFrameLocal.actualizarLista(evaluacionempleadoBeanSwingJInternalFrameLocal.evaluacionempleado,this.evaluacionempleadosForeignKey);

				evaluacionempleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(evaluacionempleadoBeanSwingJInternalFrameLocal.evaluacionempleado);

				calificacionempleadoLocal.setEvaluacionEmpleado(evaluacionempleadoBeanSwingJInternalFrameLocal.evaluacionempleado);

				this.addItemDefectoCombosForeignKeyEvaluacionEmpleado();
				this.cargarCombosFrameEvaluacionEmpleadosForeignKey("Formulario");
				this.setActualEvaluacionEmpleadoForeignKey(evaluacionempleadoBeanSwingJInternalFrameLocal.evaluacionempleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoNomiFactorNomiDetalleFormJInternalFrame.class)) {
				FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFrameLocal=(FormatoNomiFactorNomiBeanSwingJInternalFrame) ((FormatoNomiFactorNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatonomifactornomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormatoNomiFactorNomi(formatonomifactornomiBeanSwingJInternalFrameLocal.getformatonomifactornomi(),true);
				formatonomifactornomiBeanSwingJInternalFrameLocal.actualizarLista(formatonomifactornomiBeanSwingJInternalFrameLocal.formatonomifactornomi,this.formatonomifactornomisForeignKey);

				formatonomifactornomiBeanSwingJInternalFrameLocal.actualizarRelaciones(formatonomifactornomiBeanSwingJInternalFrameLocal.formatonomifactornomi);

				calificacionempleadoLocal.setFormatoNomiFactorNomi(formatonomifactornomiBeanSwingJInternalFrameLocal.formatonomifactornomi);

				this.addItemDefectoCombosForeignKeyFormatoNomiFactorNomi();
				this.cargarCombosFrameFormatoNomiFactorNomisForeignKey("Formulario");
				this.setActualFormatoNomiFactorNomiForeignKey(formatonomifactornomiBeanSwingJInternalFrameLocal.formatonomifactornomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoNomiPreguntaNomiDetalleFormJInternalFrame.class)) {
				FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrameLocal=(FormatoNomiPreguntaNomiBeanSwingJInternalFrame) ((FormatoNomiPreguntaNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatonomipreguntanomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormatoNomiPreguntaNomi(formatonomipreguntanomiBeanSwingJInternalFrameLocal.getformatonomipreguntanomi(),true);
				formatonomipreguntanomiBeanSwingJInternalFrameLocal.actualizarLista(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi,this.formatonomipreguntanomisForeignKey);

				formatonomipreguntanomiBeanSwingJInternalFrameLocal.actualizarRelaciones(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi);

				calificacionempleadoLocal.setFormatoNomiPreguntaNomi(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi);

				this.addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi();
				this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey("Formulario");
				this.setActualFormatoNomiPreguntaNomiForeignKey(formatonomipreguntanomiBeanSwingJInternalFrameLocal.formatonomipreguntanomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCalificacionEmpleadoDetalleFormJInternalFrame.class)) {
				TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrameLocal=(TipoCalificacionEmpleadoBeanSwingJInternalFrame) ((TipoCalificacionEmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocalificacionempleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCalificacionEmpleado(tipocalificacionempleadoBeanSwingJInternalFrameLocal.gettipocalificacionempleado(),true);
				tipocalificacionempleadoBeanSwingJInternalFrameLocal.actualizarLista(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado,this.tipocalificacionempleadosForeignKey);

				tipocalificacionempleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado);

				calificacionempleadoLocal.setTipoCalificacionEmpleado(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado);

				this.addItemDefectoCombosForeignKeyTipoCalificacionEmpleado();
				this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey("Formulario");
				this.setActualTipoCalificacionEmpleadoForeignKey(tipocalificacionempleadoBeanSwingJInternalFrameLocal.tipocalificacionempleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCalificacionEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = calificacionempleadoValidator.getInvalidValues(this.calificacionempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CalificacionEmpleado calificacionempleado,List<CalificacionEmpleado> calificacionempleados) throws Exception {
		try	{		
			CalificacionEmpleadoConstantesFunciones.actualizarLista(calificacionempleado,calificacionempleados,this.calificacionempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CalificacionEmpleado calificacionempleado,List<CalificacionEmpleado> calificacionempleados) throws Exception {
		try	{			
			CalificacionEmpleadoConstantesFunciones.actualizarSelectedLista(calificacionempleado,calificacionempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CalificacionEmpleado> calificacionempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				calificacionempleadosLocal=this.calificacionempleadoLogic.getCalificacionEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				calificacionempleadosLocal=this.calificacionempleados;
			}
			//ARCHITECTURE
		
			for(CalificacionEmpleado calificacionempleadoLocal:calificacionempleadosLocal) {
				if(this.permiteMantenimiento(calificacionempleadoLocal) && calificacionempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CalificacionEmpleadoConstantesFunciones.getCalificacionEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_empresaCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_sucursalCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_ejercicioCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_periodoCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_empleadoCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.IDEVALUACIONEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_evaluacion_empleadoCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.IDFORMATONOMIFACTORNOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_formato_nomi_factor_nomiCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.IDFORMATONOMIPREGUNTANOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_formato_nomi_pregunta_nomiCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.IDTIPOCALIFICACIONEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_tipo_calificacion_empleadoCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.VALORCONOCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_conocimientoCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.VALOREFICIENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_eficienciaCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.VALOROBTENIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_obtenidoCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.VALORPESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_pesoCalificacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalificacionEmpleadoConstantesFunciones.VERIFICADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelverificadoCalificacionEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_empresaCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_sucursalCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_ejercicioCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_periodoCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_empleadoCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_evaluacion_empleadoCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_formato_nomi_factor_nomiCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_formato_nomi_pregunta_nomiCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelid_tipo_calificacion_empleadoCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_conocimientoCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_eficienciaCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_obtenidoCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_pesoCalificacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelverificadoCalificacionEmpleado,"");
		
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
		this.iIdNuevoCalificacionEmpleado--;	
		
		
		this.calificacionempleadoAux=new CalificacionEmpleado();
		
		this.calificacionempleadoAux.setId(this.iIdNuevoCalificacionEmpleado);
		this.calificacionempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.calificacionempleadoLogic.getCalificacionEmpleados().add(this.calificacionempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.calificacionempleados.add(this.calificacionempleadoAux);
		}
		//ARCHITECTURE
		
		this.calificacionempleado=this.calificacionempleadoAux;
		
		if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCalificacionEmpleado(this.calificacionempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyCalificacionEmpleado(this.calificacionempleado);
		}
				
		//this.setDefaultControlesCalificacionEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCalificacionEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCalificacionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCalificacionEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCalificacionEmpleado(this.calificacionempleadoBean,this.calificacionempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.calificacionempleadoSessionBean.getConGuardarRelaciones()) {
			classes=CalificacionEmpleadoConstantesFunciones.getClassesRelationshipsOfCalificacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.calificacionempleadoReturnGeneral=calificacionempleadoLogic.procesarEventosCalificacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.calificacionempleadoLogic.getCalificacionEmpleados(),this.calificacionempleado,this.calificacionempleadoParameterGeneral,this.isEsNuevoCalificacionEmpleado,classes);//this.calificacionempleadoLogic.getCalificacionEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCalificacionEmpleado(this.calificacionempleadoReturnGeneral,this.calificacionempleadoBean,false);
		
		if(this.calificacionempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCalificacionEmpleado(this.calificacionempleadoReturnGeneral.getCalificacionEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCalificacionEmpleado(this.calificacionempleadoReturnGeneral.getCalificacionEmpleado());
		}
		
		if(this.calificacionempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCalificacionEmpleado(this.calificacionempleadoReturnGeneral.getCalificacionEmpleado(),classes);//this.calificacionempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCalificacionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCalificacionEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.RecargarFormCalificacionEmpleado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCalificacionEmpleado(false);
						
			if(calificacionempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCalificacionEmpleado();
			}
			
			this.actualizarVisualTableDatosCalificacionEmpleado();
			
			this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoCalificacionEmpleado(), this.getIndiceNuevoCalificacionEmpleado());
			
			this.seleccionarFilaTablaCalificacionEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesCalificacionEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCalificacionEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_conocimientoCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarvalor_conocimientoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_eficienciaCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarvalor_eficienciaCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_obtenidoCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarvalor_obtenidoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_pesoCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarvalor_pesoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxverificadoCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarverificadoCalificacionEmpleado);	
		//
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarid_empresaCalificacionEmpleado);//
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarid_sucursalCalificacionEmpleado);//
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarid_ejercicioCalificacionEmpleado);//
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarid_periodoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarid_empleadoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarid_evaluacion_empleadoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarid_formato_nomi_factor_nomiCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarid_formato_nomi_pregunta_nomiCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setEnabled(isHabilitar && this.calificacionempleadoConstantesFunciones.activarid_tipo_calificacion_empleadoCalificacionEmpleado);
	};
	
	public void setDefaultControlesCalificacionEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCalificacionEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.calificacionempleadoSessionBean.setConGuardarRelaciones(true);			
			this.calificacionempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTabbedPaneRelacionesCalificacionEmpleado.setVisible(true);
			
					
		} else {
			//this.calificacionempleadoSessionBean.setConGuardarRelaciones(false);			
			this.calificacionempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTabbedPaneRelacionesCalificacionEmpleado.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCalificacionEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleadoLogic.getCalificacionEmpleados()) {
				if(calificacionempleadoAux.getId().equals(this.iIdNuevoCalificacionEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleados) {
				if(calificacionempleadoAux.getId().equals(this.iIdNuevoCalificacionEmpleado)) {
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
	
	public int getIndiceActualCalificacionEmpleado(CalificacionEmpleado calificacionempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleadoLogic.getCalificacionEmpleados()) {
				if(calificacionempleadoAux.getId().equals(calificacionempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleados) {
				if(calificacionempleadoAux.getId().equals(calificacionempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCalificacionEmpleado(CalificacionEmpleado calificacionempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleadoLogic.getCalificacionEmpleados()) {
				if(calificacionempleadoAux.getCalificacionEmpleadoOriginal().getId().equals(calificacionempleadoOriginal.getId())) {
					existe=true;
					calificacionempleadoOriginal.setId(calificacionempleadoAux.getId());
					calificacionempleadoOriginal.setVersionRow(calificacionempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleados) {
				if(calificacionempleadoAux.getCalificacionEmpleadoOriginal().getId().equals(calificacionempleadoOriginal.getId())) {
					existe=true;
					calificacionempleadoOriginal.setId(calificacionempleadoAux.getId());
					calificacionempleadoOriginal.setVersionRow(calificacionempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCalificacionEmpleado(Boolean esParaCancelar) throws Exception {
		calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
		calificacionempleadoAux=new CalificacionEmpleado();
		
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleadoLogic.getCalificacionEmpleados()) {
					if(calificacionempleadoAux.getId()<0) {
						calificacionempleadosAux.add(calificacionempleadoAux);
					}		
				}
				this.iIdNuevoCalificacionEmpleado=0L;
				this.calificacionempleadoLogic.getCalificacionEmpleados().removeAll(calificacionempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleados) {
					if(calificacionempleadoAux.getId()<0) {
						calificacionempleadosAux.add(calificacionempleadoAux);
					}		
				}
				this.iIdNuevoCalificacionEmpleado=0L;
				this.calificacionempleados.removeAll(calificacionempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCalificacionEmpleado 
					&& this.calificacionempleadoLogic.getCalificacionEmpleados().size()>0
					) {
					calificacionempleadoAux=this.calificacionempleadoLogic.getCalificacionEmpleados().get(this.calificacionempleadoLogic.getCalificacionEmpleados().size() - 1);
				
					if(calificacionempleadoAux.getId()<0) {
						this.calificacionempleadoLogic.getCalificacionEmpleados().remove(calificacionempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCalificacionEmpleado && this.calificacionempleados.size()>0) {
					calificacionempleadoAux=this.calificacionempleados.get(this.calificacionempleados.size() - 1);
				
					if(calificacionempleadoAux.getId()<0) {
						this.calificacionempleados.remove(calificacionempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCalificacionEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(calificacionempleado.getId()<0) {
				this.calificacionempleadoLogic.getCalificacionEmpleados().remove(this.calificacionempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(calificacionempleado.getId()<0) {
				this.calificacionempleados.remove(this.calificacionempleado);
			}
		}			
	}
	
	public void setEstadosInicialesCalificacionEmpleado(List<CalificacionEmpleado> calificacionempleadosAux) throws Exception {
		CalificacionEmpleadoConstantesFunciones.setEstadosInicialesCalificacionEmpleado(calificacionempleadosAux);
	}
	
	public void setEstadosInicialesCalificacionEmpleado(CalificacionEmpleado calificacionempleadoAux) throws Exception {
		CalificacionEmpleadoConstantesFunciones.setEstadosInicialesCalificacionEmpleado(calificacionempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCalificacionEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCalificacionEmpleadoActual()) {
				if(!this.isEsNuevoCalificacionEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCalificacionEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCalificacionEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Calificacion Empleado ?", "MANTENIMIENTO DE Calificacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CalificacionEmpleado calificacionempleado) throws Exception {
		CalificacionEmpleadoConstantesFunciones.seleccionarAsignar(this.calificacionempleado,calificacionempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCalificacionEmpleado=this.isPermisoActualizarOriginalCalificacionEmpleado;
			
			
			this.seleccionarAsignar(calificacionempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CalificacionEmpleadoConstantesFunciones.quitarEspaciosCalificacionEmpleado(this.calificacionempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCalificacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.calificacionempleadoSessionBean.setsFuncionBusquedaRapida(this.calificacionempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCalificacionEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCalificacionEmpleado(esParaCancelar);				
				this.cancelarNuevoCalificacionEmpleado(esParaCancelar);								
			}
			
			this.calificacionempleado=new CalificacionEmpleado();
			
			this.inicializarCalificacionEmpleado();
			
			this.actualizarEstadoCeldasBotonesCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCalificacionEmpleado() throws Exception {
		try {
			CalificacionEmpleadoConstantesFunciones.inicializarCalificacionEmpleado(this.calificacionempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.calificacionempleadoLogic.getCalificacionEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCalificacionEmpleados(String sAccionBusqueda,List<CalificacionEmpleado> calificacionempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="CalificacionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CalificacionEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CalificacionEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CalificacionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Calificacion Empleados");		
		parameters.put("busquedapor", CalificacionEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCalificacionEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CalificacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CalificacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCalificacionEmpleado=new JRBeanArrayDataSource(CalificacionEmpleadoJInternalFrame.TraerCalificacionEmpleadoBeans(calificacionempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCalificacionEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CalificacionEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CalificacionEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CalificacionEmpleadoBean.TraerCalificacionEmpleadoBeans(calificacionempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,calificacionempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,calificacionempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCalificacionEmpleadoActionPerformed(null);
					//this.generarExcelReporteCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,calificacionempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,calificacionempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,calificacionempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCalificacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,calificacionempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCalificacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<CalificacionEmpleado> calificacionempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calificacionempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CalificacionEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCalificacionEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CalificacionEmpleado calificacionempleado : calificacionempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CalificacionEmpleadoConstantesFunciones.generarExcelReporteDataCalificacionEmpleado("NORMAL",row,workbook,calificacionempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCalificacionEmpleado(String sTipo,Row row,Workbook workbook) {
		
		CalificacionEmpleadoConstantesFunciones.generarExcelReporteHeaderCalificacionEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCalificacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<CalificacionEmpleado> calificacionempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calificacionempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CalificacionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CalificacionEmpleado calificacionempleado : calificacionempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CalificacionEmpleadoConstantesFunciones.getCalificacionEmpleadoDescripcion(calificacionempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getevaluacionempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getformatonomifactornomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getformatonomipreguntanomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.gettipocalificacionempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getvalor_conocimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getvalor_eficiencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getvalor_obtenido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calificacionempleado.getvalor_peso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(calificacionempleado.getverificado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCalificacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<CalificacionEmpleado> calificacionempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CalificacionEmpleado> calificacionempleadosRespaldo=null;
		
		classes=CalificacionEmpleadoConstantesFunciones.getClassesRelationshipsOfCalificacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.calificacionempleadoLogic.setDatosCliente(this.datosCliente);
		this.calificacionempleadoLogic.setDatosDeep(this.datosDeep);
		this.calificacionempleadoLogic.setIsConDeep(true);
		
		calificacionempleadosRespaldo=this.calificacionempleadoLogic.getCalificacionEmpleados();
		
		this.calificacionempleadoLogic.setCalificacionEmpleados(calificacionempleadosParaReportes);	
		this.calificacionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		calificacionempleadosParaReportes=this.calificacionempleadoLogic.getCalificacionEmpleados();
		this.calificacionempleadoLogic.setCalificacionEmpleados(calificacionempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calificacionempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CalificacionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCalificacionEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CalificacionEmpleado calificacionempleado : calificacionempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCalificacionEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CalificacionEmpleadoConstantesFunciones.generarExcelReporteDataCalificacionEmpleado("NORMAL",row,workbook,calificacionempleado,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CalificacionEmpleadoConstantesFunciones.getCalificacionEmpleadoDescripcion(calificacionempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCalificacionEmpleado() throws Exception {		
		this.startProcessCalificacionEmpleado(true);
	}
	
	public void startProcessCalificacionEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCalificacionEmpleado ,this.jPanelParametrosReportesCalificacionEmpleado, this.jScrollPanelDatosCalificacionEmpleado,this.jPanelPaginacionCalificacionEmpleado, this.jScrollPanelDatosEdicionCalificacionEmpleado, this.jPanelAccionesCalificacionEmpleado,this.jPanelAccionesFormularioCalificacionEmpleado,this.jmenuBarCalificacionEmpleado,this.jmenuBarDetalleCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,this.jTtoolBarDetalleCalificacionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasCalificacionEmpleado=this.jTabbedPaneBusquedasCalificacionEmpleado; 
		
		final JPanel jPanelParametrosReportesCalificacionEmpleado=this.jPanelParametrosReportesCalificacionEmpleado;
		//final JScrollPane jScrollPanelDatosCalificacionEmpleado=this.jScrollPanelDatosCalificacionEmpleado;
		final JTable jTableDatosCalificacionEmpleado=this.jTableDatosCalificacionEmpleado;		
		final JPanel jPanelPaginacionCalificacionEmpleado=this.jPanelPaginacionCalificacionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionCalificacionEmpleado=this.jScrollPanelDatosEdicionCalificacionEmpleado;
		final JPanel jPanelAccionesCalificacionEmpleado=this.jPanelAccionesCalificacionEmpleado;
		
		JPanel jPanelCamposAuxiliarCalificacionEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCalificacionEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			jPanelCamposAuxiliarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelCamposCalificacionEmpleado;
			jPanelAccionesFormularioAuxiliarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelAccionesFormularioCalificacionEmpleado;
		}
		
		final JPanel jPanelCamposCalificacionEmpleado=jPanelCamposAuxiliarCalificacionEmpleado;
		final JPanel jPanelAccionesFormularioCalificacionEmpleado=jPanelAccionesFormularioAuxiliarCalificacionEmpleado;
		
		
		final JMenuBar jmenuBarCalificacionEmpleado=this.jmenuBarCalificacionEmpleado;
		final JToolBar jTtoolBarCalificacionEmpleado=this.jTtoolBarCalificacionEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCalificacionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCalificacionEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			jmenuBarDetalleAuxiliarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jmenuBarDetalleCalificacionEmpleado;
			jTtoolBarDetalleAuxiliarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jTtoolBarDetalleCalificacionEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleCalificacionEmpleado=jmenuBarDetalleAuxiliarCalificacionEmpleado;
		final JToolBar jTtoolBarDetalleCalificacionEmpleado=jTtoolBarDetalleAuxiliarCalificacionEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCalificacionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCalificacionEmpleado;
			processRunnable.jTableDatos=jTableDatosCalificacionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposCalificacionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionCalificacionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesCalificacionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCalificacionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarCalificacionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCalificacionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarCalificacionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCalificacionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCalificacionEmpleado ,jPanelParametrosReportesCalificacionEmpleado,jTableDatosCalificacionEmpleado, /*jScrollPanelDatosCalificacionEmpleado,*/jPanelCamposCalificacionEmpleado,jPanelPaginacionCalificacionEmpleado, /*jScrollPanelDatosEdicionCalificacionEmpleado,*/ jPanelAccionesCalificacionEmpleado,jPanelAccionesFormularioCalificacionEmpleado,jmenuBarCalificacionEmpleado,jmenuBarDetalleCalificacionEmpleado,jTtoolBarCalificacionEmpleado,jTtoolBarDetalleCalificacionEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCalificacionEmpleado ,jPanelParametrosReportesCalificacionEmpleado, jScrollPanelDatosCalificacionEmpleado,jPanelPaginacionCalificacionEmpleado, jScrollPanelDatosEdicionCalificacionEmpleado, jPanelAccionesCalificacionEmpleado,jPanelAccionesFormularioCalificacionEmpleado,jmenuBarCalificacionEmpleado,jmenuBarDetalleCalificacionEmpleado,jTtoolBarCalificacionEmpleado,jTtoolBarDetalleCalificacionEmpleado);
						
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
	
	public void finishProcessCalificacionEmpleado() {// throws Exception 
		this.finishProcessCalificacionEmpleado(true);
	}
	
	public void finishProcessCalificacionEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCalificacionEmpleado ,this.jPanelParametrosReportesCalificacionEmpleado, this.jScrollPanelDatosCalificacionEmpleado,this.jPanelPaginacionCalificacionEmpleado, this.jScrollPanelDatosEdicionCalificacionEmpleado, this.jPanelAccionesCalificacionEmpleado,this.jPanelAccionesFormularioCalificacionEmpleado,this.jmenuBarCalificacionEmpleado,this.jmenuBarDetalleCalificacionEmpleado,this.jTtoolBarCalificacionEmpleado,this.jTtoolBarDetalleCalificacionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasCalificacionEmpleado=this.jTabbedPaneBusquedasCalificacionEmpleado; 
		
		final JPanel jPanelParametrosReportesCalificacionEmpleado=this.jPanelParametrosReportesCalificacionEmpleado;
		//final JScrollPane jScrollPanelDatosCalificacionEmpleado=this.jScrollPanelDatosCalificacionEmpleado;
		final JTable jTableDatosCalificacionEmpleado=this.jTableDatosCalificacionEmpleado;		
		final JPanel jPanelPaginacionCalificacionEmpleado=this.jPanelPaginacionCalificacionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionCalificacionEmpleado=this.jScrollPanelDatosEdicionCalificacionEmpleado;
		final JPanel jPanelAccionesCalificacionEmpleado=this.jPanelAccionesCalificacionEmpleado;
		
		JPanel jPanelCamposAuxiliarCalificacionEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCalificacionEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			jPanelCamposAuxiliarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelCamposCalificacionEmpleado;
			jPanelAccionesFormularioAuxiliarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelAccionesFormularioCalificacionEmpleado;
		}
		
		final JPanel jPanelCamposCalificacionEmpleado=jPanelCamposAuxiliarCalificacionEmpleado;
		final JPanel jPanelAccionesFormularioCalificacionEmpleado=jPanelAccionesFormularioAuxiliarCalificacionEmpleado;
		
		
		final JMenuBar jmenuBarCalificacionEmpleado=this.jmenuBarCalificacionEmpleado;		
		final JToolBar jTtoolBarCalificacionEmpleado=this.jTtoolBarCalificacionEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarCalificacionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCalificacionEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			jmenuBarDetalleAuxiliarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jmenuBarDetalleCalificacionEmpleado;
			jTtoolBarDetalleAuxiliarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jTtoolBarDetalleCalificacionEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleCalificacionEmpleado=jmenuBarDetalleAuxiliarCalificacionEmpleado;
		final JToolBar jTtoolBarDetalleCalificacionEmpleado=jTtoolBarDetalleAuxiliarCalificacionEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCalificacionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCalificacionEmpleado;
			processRunnable.jTableDatos=jTableDatosCalificacionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposCalificacionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionCalificacionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesCalificacionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCalificacionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarCalificacionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCalificacionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarCalificacionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCalificacionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCalificacionEmpleado ,jPanelParametrosReportesCalificacionEmpleado, jTableDatosCalificacionEmpleado,/*jScrollPanelDatosCalificacionEmpleado,*/jPanelCamposCalificacionEmpleado,jPanelPaginacionCalificacionEmpleado, /*jScrollPanelDatosEdicionCalificacionEmpleado,*/ jPanelAccionesCalificacionEmpleado,jPanelAccionesFormularioCalificacionEmpleado,jmenuBarCalificacionEmpleado,jmenuBarDetalleCalificacionEmpleado,jTtoolBarCalificacionEmpleado,jTtoolBarDetalleCalificacionEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCalificacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCalificacionEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCalificacionEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCalificacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCalificacionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCalificacionEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCalificacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCalificacionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCalificacionEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.calificacionempleadoConstantesFunciones.getsFinalQueryCalificacionEmpleado();
		String  finalQueryPaginacionTodos=this.calificacionempleadoConstantesFunciones.getsFinalQueryCalificacionEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CalificacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoCalificacionEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CalificacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesCalificacionEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CalificacionEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.calificacionempleadosEliminados= new ArrayList<CalificacionEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCalificacionEmpleado();
		
				///*CalificacionEmpleadoSessionBean*/this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			
			if(this.calificacionempleadoSessionBean==null) {
				this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
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
					this.iNumeroPaginacion=CalificacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CalificacionEmpleadoConstantesFunciones.getClassesForeignKeysOfCalificacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/calificacionempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			calificacionempleadosAux= new ArrayList<CalificacionEmpleado>();
			
				
			calificacionempleadoLogic.setDatosCliente(this.datosCliente);
			calificacionempleadoLogic.setDatosDeep(this.datosDeep);
			calificacionempleadoLogic.setIsConDeep(true);
			
			
			calificacionempleadoLogic.getCalificacionEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					calificacionempleadoLogic.getTodosCalificacionEmpleados(finalQueryGlobal,pagination);
					
					//calificacionempleadoLogic.getTodosCalificacionEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(calificacionempleadoLogic.getCalificacionEmpleados()==null|| calificacionempleadoLogic.getCalificacionEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							calificacionempleadosAux= new ArrayList<CalificacionEmpleado>();
							calificacionempleadosAux.addAll(calificacionempleadoLogic.getCalificacionEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleadosAux= new ArrayList<CalificacionEmpleado>();
							calificacionempleadosAux.addAll(calificacionempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							calificacionempleadoLogic.getTodosCalificacionEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//calificacionempleadoLogic.getTodosCalificacionEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCalificacionEmpleados("Todos",calificacionempleadoLogic.getCalificacionEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());					
							calificacionempleadoLogic.getCalificacionEmpleados().addAll(calificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleados=new ArrayList<CalificacionEmpleado>();
							calificacionempleados.addAll(calificacionempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCalificacionEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCalificacionEmpleado=this.idActual;
				
				} else if(this.idCalificacionEmpleadoActual!=null && this.idCalificacionEmpleadoActual!=0L) {
					idCalificacionEmpleado=idCalificacionEmpleadoActual;
				}
				
					
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndicePorId(idCalificacionEmpleado);
				
				this.calificacionempleados=new ArrayList<CalificacionEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					calificacionempleadoLogic.getEntity(idCalificacionEmpleado);
					
					//calificacionempleadoLogic.getEntityWithConnection(idCalificacionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
					calificacionempleadoLogic.getCalificacionEmpleados().add(calificacionempleadoLogic.getCalificacionEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calificacionempleados=new ArrayList<CalificacionEmpleado>();
					this.calificacionempleados.add(calificacionempleado);
				}
				
				if(calificacionempleadoLogic.getCalificacionEmpleado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=calificacionempleadoLogic.getCalificacionEmpleados()==null||calificacionempleadoLogic.getCalificacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=calificacionempleados==null|| calificacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
						calificacionempleadosAux.addAll(calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
							calificacionempleadosAux.addAll(calificacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCalificacionEmpleados("FK_IdEjercicio",calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCalificacionEmpleados("FK_IdEjercicio",calificacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
						calificacionempleadoLogic.getCalificacionEmpleados().addAll(calificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleados=new ArrayList<CalificacionEmpleado>();
							calificacionempleados.addAll(calificacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=calificacionempleadoLogic.getCalificacionEmpleados()==null||calificacionempleadoLogic.getCalificacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=calificacionempleados==null|| calificacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
						calificacionempleadosAux.addAll(calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
							calificacionempleadosAux.addAll(calificacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCalificacionEmpleados("FK_IdEmpleado",calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCalificacionEmpleados("FK_IdEmpleado",calificacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
						calificacionempleadoLogic.getCalificacionEmpleados().addAll(calificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleados=new ArrayList<CalificacionEmpleado>();
							calificacionempleados.addAll(calificacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=calificacionempleadoLogic.getCalificacionEmpleados()==null||calificacionempleadoLogic.getCalificacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=calificacionempleados==null|| calificacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
						calificacionempleadosAux.addAll(calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
							calificacionempleadosAux.addAll(calificacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCalificacionEmpleados("FK_IdEmpresa",calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCalificacionEmpleados("FK_IdEmpresa",calificacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
						calificacionempleadoLogic.getCalificacionEmpleados().addAll(calificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleados=new ArrayList<CalificacionEmpleado>();
							calificacionempleados.addAll(calificacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEvaluacionEmpleado")) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEvaluacionEmpleado(id_evaluacion_empleadoFK_IdEvaluacionEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEvaluacionEmpleado(finalQueryGlobal,pagination,id_evaluacion_empleadoFK_IdEvaluacionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEvaluacionEmpleado(id_evaluacion_empleadoFK_IdEvaluacionEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEvaluacionEmpleado(id_evaluacion_empleadoFK_IdEvaluacionEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=calificacionempleadoLogic.getCalificacionEmpleados()==null||calificacionempleadoLogic.getCalificacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=calificacionempleados==null|| calificacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
						calificacionempleadosAux.addAll(calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
							calificacionempleadosAux.addAll(calificacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEvaluacionEmpleado(finalQueryGlobal,pagination,id_evaluacion_empleadoFK_IdEvaluacionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEvaluacionEmpleado(id_evaluacion_empleadoFK_IdEvaluacionEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEvaluacionEmpleado(id_evaluacion_empleadoFK_IdEvaluacionEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCalificacionEmpleados("FK_IdEvaluacionEmpleado",calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCalificacionEmpleados("FK_IdEvaluacionEmpleado",calificacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
						calificacionempleadoLogic.getCalificacionEmpleados().addAll(calificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleados=new ArrayList<CalificacionEmpleado>();
							calificacionempleados.addAll(calificacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFormatoNomiFactorNomi")) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormatoNomiFactorNomi(id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdFormatoNomiFactorNomi(finalQueryGlobal,pagination,id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormatoNomiFactorNomi(id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormatoNomiFactorNomi(id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=calificacionempleadoLogic.getCalificacionEmpleados()==null||calificacionempleadoLogic.getCalificacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=calificacionempleados==null|| calificacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
						calificacionempleadosAux.addAll(calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
							calificacionempleadosAux.addAll(calificacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							calificacionempleadoLogic.getCalificacionEmpleadosFK_IdFormatoNomiFactorNomi(finalQueryGlobal,pagination,id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormatoNomiFactorNomi(id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormatoNomiFactorNomi(id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCalificacionEmpleados("FK_IdFormatoNomiFactorNomi",calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCalificacionEmpleados("FK_IdFormatoNomiFactorNomi",calificacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
						calificacionempleadoLogic.getCalificacionEmpleados().addAll(calificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleados=new ArrayList<CalificacionEmpleado>();
							calificacionempleados.addAll(calificacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFormatoNomiPreguntaNomi")) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormatoNomiPreguntaNomi(id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdFormatoNomiPreguntaNomi(finalQueryGlobal,pagination,id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormatoNomiPreguntaNomi(id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormatoNomiPreguntaNomi(id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=calificacionempleadoLogic.getCalificacionEmpleados()==null||calificacionempleadoLogic.getCalificacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=calificacionempleados==null|| calificacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
						calificacionempleadosAux.addAll(calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
							calificacionempleadosAux.addAll(calificacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							calificacionempleadoLogic.getCalificacionEmpleadosFK_IdFormatoNomiPreguntaNomi(finalQueryGlobal,pagination,id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormatoNomiPreguntaNomi(id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdFormatoNomiPreguntaNomi(id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCalificacionEmpleados("FK_IdFormatoNomiPreguntaNomi",calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCalificacionEmpleados("FK_IdFormatoNomiPreguntaNomi",calificacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
						calificacionempleadoLogic.getCalificacionEmpleados().addAll(calificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleados=new ArrayList<CalificacionEmpleado>();
							calificacionempleados.addAll(calificacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=calificacionempleadoLogic.getCalificacionEmpleados()==null||calificacionempleadoLogic.getCalificacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=calificacionempleados==null|| calificacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
						calificacionempleadosAux.addAll(calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
							calificacionempleadosAux.addAll(calificacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							calificacionempleadoLogic.getCalificacionEmpleadosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCalificacionEmpleados("FK_IdPeriodo",calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCalificacionEmpleados("FK_IdPeriodo",calificacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
						calificacionempleadoLogic.getCalificacionEmpleados().addAll(calificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleados=new ArrayList<CalificacionEmpleado>();
							calificacionempleados.addAll(calificacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=calificacionempleadoLogic.getCalificacionEmpleados()==null||calificacionempleadoLogic.getCalificacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=calificacionempleados==null|| calificacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
						calificacionempleadosAux.addAll(calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
							calificacionempleadosAux.addAll(calificacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							calificacionempleadoLogic.getCalificacionEmpleadosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCalificacionEmpleados("FK_IdSucursal",calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCalificacionEmpleados("FK_IdSucursal",calificacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
						calificacionempleadoLogic.getCalificacionEmpleados().addAll(calificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleados=new ArrayList<CalificacionEmpleado>();
							calificacionempleados.addAll(calificacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCalificacionEmpleado")) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdTipoCalificacionEmpleado(id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdTipoCalificacionEmpleado(finalQueryGlobal,pagination,id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdTipoCalificacionEmpleado(id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdTipoCalificacionEmpleado(id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=calificacionempleadoLogic.getCalificacionEmpleados()==null||calificacionempleadoLogic.getCalificacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=calificacionempleados==null|| calificacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
						calificacionempleadosAux.addAll(calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleadosAux=new ArrayList<CalificacionEmpleado>();
							calificacionempleadosAux.addAll(calificacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							calificacionempleadoLogic.getCalificacionEmpleadosFK_IdTipoCalificacionEmpleado(finalQueryGlobal,pagination,id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdTipoCalificacionEmpleado(id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalificacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdTipoCalificacionEmpleado(id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCalificacionEmpleados("FK_IdTipoCalificacionEmpleado",calificacionempleadoLogic.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCalificacionEmpleados("FK_IdTipoCalificacionEmpleado",calificacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
						calificacionempleadoLogic.getCalificacionEmpleados().addAll(calificacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleados=new ArrayList<CalificacionEmpleado>();
							calificacionempleados.addAll(calificacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCalificacionEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCalificacionEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=calificacionempleadoLogic.getCalificacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=calificacionempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=calificacionempleadoLogic.getCalificacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=calificacionempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CalificacionEmpleado calificacionempleado) {
		Boolean permite=true;
		
		if(this.calificacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CalificacionEmpleadoConstantesFunciones.getOrderByListaCalificacionEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CalificacionEmpleadoConstantesFunciones.getOrderByListaCalificacionEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CalificacionEmpleado calificacionempleado:calificacionempleadoLogic.getCalificacionEmpleados()) {
				if(calificacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					calificacionempleadoTotales=calificacionempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CalificacionEmpleado calificacionempleado:this.calificacionempleados) {
				if(calificacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					calificacionempleadoTotales=calificacionempleado;
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
			this.calificacionempleadoAux=new CalificacionEmpleado();
			this.calificacionempleadoAux.setsType(Constantes2.S_TOTALES);
			this.calificacionempleadoAux.setIsNew(false);
			this.calificacionempleadoAux.setIsChanged(false);
			this.calificacionempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CalificacionEmpleadoConstantesFunciones.TotalizarValoresFilaCalificacionEmpleado(this.calificacionempleadoLogic.getCalificacionEmpleados(),this.calificacionempleadoAux);
				
				this.calificacionempleadoLogic.getCalificacionEmpleados().add(this.calificacionempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CalificacionEmpleadoConstantesFunciones.TotalizarValoresFilaCalificacionEmpleado(this.calificacionempleados,this.calificacionempleadoAux);
				
				this.calificacionempleados.add(this.calificacionempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		calificacionempleadoTotales=new CalificacionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.calificacionempleadoLogic.getCalificacionEmpleados().remove(calificacionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.calificacionempleados.remove(calificacionempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		calificacionempleadoTotales=new CalificacionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CalificacionEmpleado calificacionempleado:calificacionempleadoLogic.getCalificacionEmpleados()) {
				if(calificacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					calificacionempleadoTotales=calificacionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CalificacionEmpleadoConstantesFunciones.TotalizarValoresFilaCalificacionEmpleado(this.calificacionempleadoLogic.getCalificacionEmpleados(),calificacionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CalificacionEmpleado calificacionempleado:this.calificacionempleados) {
				if(calificacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					calificacionempleadoTotales=calificacionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CalificacionEmpleadoConstantesFunciones.TotalizarValoresFilaCalificacionEmpleado(this.calificacionempleados,calificacionempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCalificacionEmpleadosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCalificacionEmpleadosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCalificacionEmpleadosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCalificacionEmpleadosFK_IdEvaluacionEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEvaluacionEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCalificacionEmpleadosFK_IdFormatoNomiFactorNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormatoNomiFactorNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCalificacionEmpleadosFK_IdFormatoNomiPreguntaNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormatoNomiPreguntaNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCalificacionEmpleadosFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCalificacionEmpleadosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCalificacionEmpleadosFK_IdTipoCalificacionEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCalificacionEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCalificacionEmpleadosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCalificacionEmpleadosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCalificacionEmpleadosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCalificacionEmpleadosFK_IdEvaluacionEmpleado(String sFinalQuery,Long id_evaluacion_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdEvaluacionEmpleado(sFinalQuery,this.pagination,id_evaluacion_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCalificacionEmpleadosFK_IdFormatoNomiFactorNomi(String sFinalQuery,Long id_formato_nomi_factor_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdFormatoNomiFactorNomi(sFinalQuery,this.pagination,id_formato_nomi_factor_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCalificacionEmpleadosFK_IdFormatoNomiPreguntaNomi(String sFinalQuery,Long id_formato_nomi_pregunta_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdFormatoNomiPreguntaNomi(sFinalQuery,this.pagination,id_formato_nomi_pregunta_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCalificacionEmpleadosFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCalificacionEmpleadosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCalificacionEmpleadosFK_IdTipoCalificacionEmpleado(String sFinalQuery,Long id_tipo_calificacion_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calificacionempleadoLogic.getCalificacionEmpleadosFK_IdTipoCalificacionEmpleado(sFinalQuery,this.pagination,id_tipo_calificacion_empleado);
				
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
	
	public void inicializarPermisosCalificacionEmpleado() {
		this.isPermisoTodoCalificacionEmpleado=false;
		this.isPermisoNuevoCalificacionEmpleado=false;
		this.isPermisoActualizarCalificacionEmpleado=false;
		this.isPermisoActualizarOriginalCalificacionEmpleado=false;
		this.isPermisoEliminarCalificacionEmpleado=false;
		this.isPermisoGuardarCambiosCalificacionEmpleado=false;
		this.isPermisoConsultaCalificacionEmpleado=false;
		this.isPermisoBusquedaCalificacionEmpleado=false;
		this.isPermisoReporteCalificacionEmpleado=false;		
		this.isPermisoOrdenCalificacionEmpleado=false;		
		this.isPermisoPaginacionMedioCalificacionEmpleado=false;		
		this.isPermisoPaginacionAltoCalificacionEmpleado=false;
		this.isPermisoPaginacionTodoCalificacionEmpleado=false;
		this.isPermisoCopiarCalificacionEmpleado=false;		
		this.isPermisoVerFormCalificacionEmpleado=false;		
		this.isPermisoDuplicarCalificacionEmpleado=false;		
		this.isPermisoOrdenCalificacionEmpleado=false;		
	}
	
	public void setPermisosUsuarioCalificacionEmpleado(Boolean isPermiso) {
		this.isPermisoTodoCalificacionEmpleado=isPermiso;
		this.isPermisoNuevoCalificacionEmpleado=isPermiso;
		this.isPermisoActualizarCalificacionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalCalificacionEmpleado=isPermiso;
		this.isPermisoEliminarCalificacionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosCalificacionEmpleado=isPermiso;
		this.isPermisoConsultaCalificacionEmpleado=isPermiso;
		this.isPermisoBusquedaCalificacionEmpleado=isPermiso;
		this.isPermisoReporteCalificacionEmpleado=isPermiso;
		this.isPermisoOrdenCalificacionEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioCalificacionEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoCalificacionEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoCalificacionEmpleado=isPermiso;		
		this.isPermisoCopiarCalificacionEmpleado=isPermiso;		
		this.isPermisoVerFormCalificacionEmpleado=isPermiso;		
		this.isPermisoDuplicarCalificacionEmpleado=isPermiso;
		this.isPermisoOrdenCalificacionEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCalificacionEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoCalificacionEmpleado=isPermiso;
		this.isPermisoNuevoCalificacionEmpleado=isPermiso;
		this.isPermisoActualizarCalificacionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalCalificacionEmpleado=isPermiso;
		this.isPermisoEliminarCalificacionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosCalificacionEmpleado=isPermiso;
		//this.isPermisoConsultaCalificacionEmpleado=isPermiso;
		//this.isPermisoBusquedaCalificacionEmpleado=isPermiso;
		//this.isPermisoReporteCalificacionEmpleado=isPermiso;
		//this.isPermisoOrdenCalificacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioCalificacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoCalificacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoCalificacionEmpleado=isPermiso;		
		//this.isPermisoCopiarCalificacionEmpleado=isPermiso;		
		//this.isPermisoDuplicarCalificacionEmpleado=isPermiso;
		//this.isPermisoOrdenCalificacionEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCalificacionEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CalificacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCalificacionEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCalificacionEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCalificacionEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCalificacionEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCalificacionEmpleadoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCalificacionEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CalificacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCalificacionEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCalificacionEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCalificacionEmpleado=this.isPermisoActualizarCalificacionEmpleado;
			this.isPermisoEliminarCalificacionEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCalificacionEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCalificacionEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCalificacionEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCalificacionEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCalificacionEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCalificacionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCalificacionEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCalificacionEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCalificacionEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCalificacionEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCalificacionEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCalificacionEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCalificacionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCalificacionEmpleado.setToolTipText(this.jTableDatosCalificacionEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCalificacionEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCalificacionEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CalificacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CalificacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCalificacionEmpleado() throws Exception {
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
	public void inicializarCombosForeignKeyCalificacionEmpleadoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.evaluacionempleadosForeignKey=new ArrayList();
				this.formatonomifactornomisForeignKey=new ArrayList();
				this.formatonomipreguntanomisForeignKey=new ArrayList();
				this.tipocalificacionempleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCalificacionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CalificacionEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCalificacionEmpleadoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEvaluacionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoNomiFactorNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoNomiPreguntaNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCalificacionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEvaluacionEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.evaluacionempleadosForeignKey==null||this.evaluacionempleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EvaluacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesEvaluacionEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EvaluacionEmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EvaluacionEmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEvaluacionEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoNomiFactorNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatonomifactornomisForeignKey==null||this.formatonomifactornomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoNomiFactorNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomiFactorNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoNomiFactorNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoNomiFactorNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatoNomiFactorNomisForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyCalificacionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CalificacionEmpleadoParameterReturnGeneral calificacionempleadoReturnGeneral=new CalificacionEmpleadoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.calificacionempleadoConstantesFunciones.cargarid_empresaCalificacionEmpleado)
					 || (this.esRecargarFks && this.calificacionempleadoConstantesFunciones.cargarid_empresaCalificacionEmpleado)) {

					if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+calificacionempleadoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.calificacionempleadoConstantesFunciones.cargarid_sucursalCalificacionEmpleado)
					 || (this.esRecargarFks && this.calificacionempleadoConstantesFunciones.cargarid_sucursalCalificacionEmpleado)) {

					if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+calificacionempleadoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.calificacionempleadoConstantesFunciones.cargarid_ejercicioCalificacionEmpleado)
					 || (this.esRecargarFks && this.calificacionempleadoConstantesFunciones.cargarid_ejercicioCalificacionEmpleado)) {

					if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+calificacionempleadoSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.calificacionempleadoConstantesFunciones.cargarid_periodoCalificacionEmpleado)
					 || (this.esRecargarFks && this.calificacionempleadoConstantesFunciones.cargarid_periodoCalificacionEmpleado)) {

					if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+calificacionempleadoSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.calificacionempleadoConstantesFunciones.cargarid_empleadoCalificacionEmpleado)
					 || (this.esRecargarFks && this.calificacionempleadoConstantesFunciones.cargarid_empleadoCalificacionEmpleado)) {

					if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+calificacionempleadoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEvaluacionEmpleado="";

				if(((this.evaluacionempleadosForeignKey==null||this.evaluacionempleadosForeignKey.size()<=0) && this.calificacionempleadoConstantesFunciones.cargarid_evaluacion_empleadoCalificacionEmpleado)
					 || (this.esRecargarFks && this.calificacionempleadoConstantesFunciones.cargarid_evaluacion_empleadoCalificacionEmpleado)) {

					if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEvaluacionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EvaluacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesEvaluacionEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEvaluacionEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EvaluacionEmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEvaluacionEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEvaluacionEmpleado, "");
						finalQueryGlobalEvaluacionEmpleado+=EvaluacionEmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEvaluacionEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEvaluacionEmpleado=" WHERE " + ConstantesSql.ID + "="+calificacionempleadoSessionBean.getlidEvaluacionEmpleadoActual();
					}
				} else {
					finalQueryGlobalEvaluacionEmpleado="NONE";
				}


				String finalQueryGlobalFormatoNomiFactorNomi="";

				if(((this.formatonomifactornomisForeignKey==null||this.formatonomifactornomisForeignKey.size()<=0) && this.calificacionempleadoConstantesFunciones.cargarid_formato_nomi_factor_nomiCalificacionEmpleado)
					 || (this.esRecargarFks && this.calificacionempleadoConstantesFunciones.cargarid_formato_nomi_factor_nomiCalificacionEmpleado)) {

					if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoNomiFactorNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomiFactorNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormatoNomiFactorNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoNomiFactorNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalFormatoNomiFactorNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalFormatoNomiFactorNomi, "");
						finalQueryGlobalFormatoNomiFactorNomi+=FormatoNomiFactorNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatoNomiFactorNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormatoNomiFactorNomi=" WHERE " + ConstantesSql.ID + "="+calificacionempleadoSessionBean.getlidFormatoNomiFactorNomiActual();
					}
				} else {
					finalQueryGlobalFormatoNomiFactorNomi="NONE";
				}


				String finalQueryGlobalFormatoNomiPreguntaNomi="";

				if(((this.formatonomipreguntanomisForeignKey==null||this.formatonomipreguntanomisForeignKey.size()<=0) && this.calificacionempleadoConstantesFunciones.cargarid_formato_nomi_pregunta_nomiCalificacionEmpleado)
					 || (this.esRecargarFks && this.calificacionempleadoConstantesFunciones.cargarid_formato_nomi_pregunta_nomiCalificacionEmpleado)) {

					if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoNomiPreguntaNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomiPreguntaNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormatoNomiPreguntaNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoNomiPreguntaNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalFormatoNomiPreguntaNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalFormatoNomiPreguntaNomi, "");
						finalQueryGlobalFormatoNomiPreguntaNomi+=FormatoNomiPreguntaNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatoNomiPreguntaNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormatoNomiPreguntaNomi=" WHERE " + ConstantesSql.ID + "="+calificacionempleadoSessionBean.getlidFormatoNomiPreguntaNomiActual();
					}
				} else {
					finalQueryGlobalFormatoNomiPreguntaNomi="NONE";
				}


				String finalQueryGlobalTipoCalificacionEmpleado="";

				if(((this.tipocalificacionempleadosForeignKey==null||this.tipocalificacionempleadosForeignKey.size()<=0) && this.calificacionempleadoConstantesFunciones.cargarid_tipo_calificacion_empleadoCalificacionEmpleado)
					 || (this.esRecargarFks && this.calificacionempleadoConstantesFunciones.cargarid_tipo_calificacion_empleadoCalificacionEmpleado)) {

					if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCalificacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesTipoCalificacionEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCalificacionEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCalificacionEmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCalificacionEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCalificacionEmpleado, "");
						finalQueryGlobalTipoCalificacionEmpleado+=TipoCalificacionEmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCalificacionEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCalificacionEmpleado=" WHERE " + ConstantesSql.ID + "="+calificacionempleadoSessionBean.getlidTipoCalificacionEmpleadoActual();
					}
				} else {
					finalQueryGlobalTipoCalificacionEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				calificacionempleadoReturnGeneral=calificacionempleadoLogic.cargarCombosLoteForeignKeyCalificacionEmpleado(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalEmpleado,finalQueryGlobalEvaluacionEmpleado,finalQueryGlobalFormatoNomiFactorNomi,finalQueryGlobalFormatoNomiPreguntaNomi,finalQueryGlobalTipoCalificacionEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=calificacionempleadoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=calificacionempleadoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=calificacionempleadoReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=calificacionempleadoReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=calificacionempleadoReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEvaluacionEmpleado.equals("NONE")) {
				this.evaluacionempleadosForeignKey=calificacionempleadoReturnGeneral.getevaluacionempleadosForeignKey();
			}

			if(!finalQueryGlobalFormatoNomiFactorNomi.equals("NONE")) {
				this.formatonomifactornomisForeignKey=calificacionempleadoReturnGeneral.getformatonomifactornomisForeignKey();
			}

			if(!finalQueryGlobalFormatoNomiPreguntaNomi.equals("NONE")) {
				this.formatonomipreguntanomisForeignKey=calificacionempleadoReturnGeneral.getformatonomipreguntanomisForeignKey();
			}

			if(!finalQueryGlobalTipoCalificacionEmpleado.equals("NONE")) {
				this.tipocalificacionempleadosForeignKey=calificacionempleadoReturnGeneral.gettipocalificacionempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCalificacionEmpleado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEvaluacionEmpleado();
			this.addItemDefectoCombosForeignKeyFormatoNomiFactorNomi();
			this.addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi();
			this.addItemDefectoCombosForeignKeyTipoCalificacionEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.calificacionempleadoSessionBean==null) {
				this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyEvaluacionEmpleado()throws Exception {
		try {

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEvaluacionEmpleado()) {
				EvaluacionEmpleado evaluacionempleado=new EvaluacionEmpleado();
				EvaluacionEmpleadoConstantesFunciones.setEvaluacionEmpleadoDescripcion(evaluacionempleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				evaluacionempleado.setId(null);

				if(!EvaluacionEmpleadoConstantesFunciones.ExisteEnLista(this.evaluacionempleadosForeignKey,evaluacionempleado,true)) {

					this.evaluacionempleadosForeignKey.add(0,evaluacionempleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormatoNomiFactorNomi()throws Exception {
		try {

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi()) {
				FormatoNomiFactorNomi formatonomifactornomi=new FormatoNomiFactorNomi();
				FormatoNomiFactorNomiConstantesFunciones.setFormatoNomiFactorNomiDescripcion(formatonomifactornomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				formatonomifactornomi.setId(null);

				if(!FormatoNomiFactorNomiConstantesFunciones.ExisteEnLista(this.formatonomifactornomisForeignKey,formatonomifactornomi,true)) {

					this.formatonomifactornomisForeignKey.add(0,formatonomifactornomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi()throws Exception {
		try {

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi()) {
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

	public void addItemDefectoCombosForeignKeyTipoCalificacionEmpleado()throws Exception {
		try {

			if(!this.calificacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCalificacionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyCalificacionEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCalificacionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCalificacionEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCalificacionEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCalificacionEmpleado(CalificacionEmpleado calificacionempleado)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(calificacionempleado.getid_empleado(),false,"Formulario");
			this.setActualEvaluacionEmpleadoForeignKey(calificacionempleado.getid_evaluacion_empleado(),false,"Formulario");
			this.setActualFormatoNomiFactorNomiForeignKey(calificacionempleado.getid_formato_nomi_factor_nomi(),false,"Formulario");
			this.setActualFormatoNomiPreguntaNomiForeignKey(calificacionempleado.getid_formato_nomi_pregunta_nomi(),false,"Formulario");
			this.setActualTipoCalificacionEmpleadoForeignKey(calificacionempleado.getid_tipo_calificacion_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCalificacionEmpleado(CalificacionEmpleado calificacionempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCalificacionEmpleado()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.calificacionempleadoConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEvaluacionEmpleadoForeignKey(this.calificacionempleadoConstantesFunciones.getid_evaluacion_empleado(),false,"Formulario");
			this.setActualFormatoNomiFactorNomiForeignKey(this.calificacionempleadoConstantesFunciones.getid_formato_nomi_factor_nomi(),false,"Formulario");
			this.setActualFormatoNomiPreguntaNomiForeignKey(this.calificacionempleadoConstantesFunciones.getid_formato_nomi_pregunta_nomi(),false,"Formulario");
			this.setActualTipoCalificacionEmpleadoForeignKey(this.calificacionempleadoConstantesFunciones.getid_tipo_calificacion_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCalificacionEmpleado()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCalificacionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCalificacionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCalificacionEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCalificacionEmpleado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEvaluacionEmpleadosForeignKey("Todos");
			this.cargarCombosFrameFormatoNomiFactorNomisForeignKey("Todos");
			this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey("Todos");
			this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCalificacionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEvaluacionEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatoNomiFactorNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCalificacionEmpleado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public CalificacionEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CalificacionEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CalificacionEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean(); 
		this.calificacionempleadoConstantesFunciones=new CalificacionEmpleadoConstantesFunciones(); 
		this.calificacionempleadoBean=new CalificacionEmpleado();//(this.calificacionempleadoConstantesFunciones); 		
		this.calificacionempleadoReturnGeneral=new CalificacionEmpleadoParameterReturnGeneral(); 
		
		this.calificacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.calificacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CalificacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CalificacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CalificacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCalificacionEmpleado(true);
			
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
			
			this.calificacionempleadoConstantesFunciones=new CalificacionEmpleadoConstantesFunciones(); 
			this.calificacionempleadoBean=new CalificacionEmpleado();//this.calificacionempleadoConstantesFunciones); 			
			this.calificacionempleadoReturnGeneral=new CalificacionEmpleadoParameterReturnGeneral(); 
		
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Calificacion Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.calificacionempleado=new CalificacionEmpleado();
			this.calificacionempleados = new ArrayList<CalificacionEmpleado>();
			this.calificacionempleadosAux = new ArrayList<CalificacionEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic=new CalificacionEmpleadoLogic();
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.calificacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.calificacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCalificacionEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCalificacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCalificacionEmpleado);	
					}
					
					if(this.jInternalFrameImportacionCalificacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCalificacionEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCalificacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCalificacionEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCalificacionEmpleado);
				this.jInternalFrameDetalleFormCalificacionEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormCalificacionEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCalificacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCalificacionEmpleado);
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCalificacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCalificacionEmpleado);
					this.jInternalFrameImportacionCalificacionEmpleado.setVisible(false);
					this.jInternalFrameImportacionCalificacionEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCalificacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCalificacionEmpleado);
					this.jInternalFrameOrderByCalificacionEmpleado.setVisible(false);
					this.jInternalFrameOrderByCalificacionEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCalificacionEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CalificacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.calificacionempleadoReturnGeneral=new CalificacionEmpleadoParameterReturnGeneral();
			
			this.calificacionempleadoParameterGeneral=new CalificacionEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.calificacionempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CalificacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.calificacionempleadoSessionBean.getEsGuardarRelacionado(),this.calificacionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.calificacionempleadoSessionBean.getEsGuardarRelacionado(),this.calificacionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=false;
			this.isVisibilidadCeldaDuplicarCalificacionEmpleado=true;
			this.isVisibilidadCeldaCopiarCalificacionEmpleado=true;
			this.isVisibilidadCeldaVerFormCalificacionEmpleado=true;
			this.isVisibilidadCeldaOrdenCalificacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=false;
			this.isVisibilidadCeldaModificarCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=false;
			
			
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEvaluacionEmpleado=true;
			this.isVisibilidadFK_IdFormatoNomiFactorNomi=true;
			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoCalificacionEmpleado=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCalificacionEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCalificacionEmpleado(false);
			
			this.setPermisosUsuarioCalificacionEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.calificacionempleadoSessionBean.getEsGuardarRelacionado() && this.calificacionempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCalificacionEmpleadoClasesRelacionadas();
			}
			
			if(this.calificacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCalificacionEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCalificacionEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCalificacionEmpleado();
			}
			
			if(!this.isPermisoBusquedaCalificacionEmpleado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCalificacionEmpleado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCalificacionEmpleado,this.isPermisoPaginacionMedioCalificacionEmpleado,this.isPermisoPaginacionTodoCalificacionEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CalificacionEmpleadoConstantesFunciones.getTiposSeleccionarCalificacionEmpleado());
				
				this.tiposColumnasSelect=CalificacionEmpleadoConstantesFunciones.getTiposSeleccionarCalificacionEmpleado(true);
				
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
			//if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCalificacionEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCalificacionEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCalificacionEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCalificacionEmpleado() ;
			
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
			this.empleadoLogic=new EmpleadoLogic();
			this.evaluacionempleadoLogic=new EvaluacionEmpleadoLogic();
			this.formatonomifactornomiLogic=new FormatoNomiFactorNomiLogic();
			this.formatonomipreguntanomiLogic=new FormatoNomiPreguntaNomiLogic();
			this.tipocalificacionempleadoLogic=new TipoCalificacionEmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				calificacionempleadoImplementable= (CalificacionEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CalificacionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				calificacionempleadoImplementableHome= (CalificacionEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CalificacionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.calificacionempleados= new ArrayList<CalificacionEmpleado>();
			this.calificacionempleadosEliminados= new ArrayList<CalificacionEmpleado>();
						
			this.isEsNuevoCalificacionEmpleado=false;
			this.esParaAccionDesdeFormularioCalificacionEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.evaluacionempleadosForeignKey=new ArrayList<EvaluacionEmpleado>() ;
			this.formatonomifactornomisForeignKey=new ArrayList<FormatoNomiFactorNomi>() ;
			this.formatonomipreguntanomisForeignKey=new ArrayList<FormatoNomiPreguntaNomi>() ;
			this.tipocalificacionempleadosForeignKey=new ArrayList<TipoCalificacionEmpleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCalificacionEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCalificacionEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CalificacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCalificacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCalificacionEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCalificacionEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCalificacionEmpleado();
			}
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCalificacionEmpleado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCalificacionEmpleado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCalificacionEmpleado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCalificacionEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CalificacionEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCalificacionEmpleado() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCalificacionEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormCalificacionEmpleado.jTabbedPaneRelacionesCalificacionEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCalificacionEmpleado.jTabbedPaneRelacionesCalificacionEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCalificacionEmpleado();	
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
	
	public void cargarCombosForeignKeyCalificacionEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCalificacionEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCalificacionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCalificacionEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCalificacionEmpleado();
		
		this.cargarCombosFrameForeignKeyCalificacionEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCalificacionEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCalificacionEmpleado();
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

	public void cargarCombosForeignKeyEvaluacionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEvaluacionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEvaluacionEmpleado();
				this.cargarCombosFrameEvaluacionEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEvaluacionEmpleado(this.evaluacionempleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoNomiFactorNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoNomiFactorNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormatoNomiFactorNomi();
				this.cargarCombosFrameFormatoNomiFactorNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormatoNomiFactorNomi(this.formatonomifactornomisForeignKey);

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
	
	public void jButtonNuevoCalificacionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.calificacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
			
			if(jTableDatosCalificacionEmpleado.getRowCount()>=1) {
				jTableDatosCalificacionEmpleado.removeRowSelectionInterval(0, jTableDatosCalificacionEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoCalificacionEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCalificacionEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCalificacionEmpleado(true);			
			//this.calificacionempleado=new CalificacionEmpleado();
			//this.calificacionempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCalificacionEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCalificacionEmpleado() ;
			
			if(CalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCalificacionEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.calificacionempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);				
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
			if(this.calificacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CalificacionEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCalificacionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCalificacionEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCalificacionEmpleado.getSelectedRows().length;			
			}
			
			calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCalificacionEmpleado--;			
				//CalificacionEmpleado calificacionempleadoAux= new CalificacionEmpleado();			
				//calificacionempleadoAux.setId(this.iIdNuevoCalificacionEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CalificacionEmpleado calificacionempleadoOrigen=new CalificacionEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CalificacionEmpleado calificacionempleadoOrigen : calificacionempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							calificacionempleadoOrigen =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calificacionempleadoOrigen =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCalificacionEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.calificacionempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCalificacionEmpleado(calificacionempleadoOrigen,this.calificacionempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.calificacionempleadoLogic.getCalificacionEmpleados().add(this.calificacionempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.calificacionempleados.add(this.calificacionempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
				
				this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoCalificacionEmpleado(), this.getIndiceNuevoCalificacionEmpleado());
				
				int iLastRow =  this.jTableDatosCalificacionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCalificacionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCalificacionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();									
		
			CalificacionEmpleado calificacionempleadoOrigen=new CalificacionEmpleado();
			CalificacionEmpleado calificacionempleadoDestino=new CalificacionEmpleado();
				
			calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCalificacionEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || calificacionempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCalificacionEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoOrigen =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						calificacionempleadoOrigen =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						calificacionempleadoDestino =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						calificacionempleadoDestino =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				calificacionempleadoOrigen =calificacionempleadosSeleccionados.get(0);
				calificacionempleadoDestino =calificacionempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCalificacionEmpleado(calificacionempleadoOrigen,calificacionempleadoDestino,true,false);
				
				calificacionempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(calificacionempleadoDestino,calificacionempleadoLogic.getCalificacionEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(calificacionempleadoDestino,calificacionempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
				
				//this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoCalificacionEmpleado(), this.getIndiceNuevoCalificacionEmpleado());
				
				int iLastRow =  this.jTableDatosCalificacionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCalificacionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCalificacionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCalificacionEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCalificacionEmpleado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCalificacionEmpleado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCalificacionEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionCalificacionEmpleado.setVisible(!isVisible);
			this.jPanelAccionesCalificacionEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCalificacionEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCalificacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCalificacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCalificacionEmpleado();
			
			this.abrirFrameOrderByCalificacionEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCalificacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCalificacionEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCalificacionEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCalificacionEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormCalificacionEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCalificacionEmpleado.setSize(this.jInternalFrameDetalleFormCalificacionEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormCalificacionEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCalificacionEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCalificacionEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCalificacionEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormCalificacionEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCalificacionEmpleado.jContentPaneDetalleCalificacionEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCalificacionEmpleado.jTabbedPaneRelacionesCalificacionEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCalificacionEmpleado.jContentPaneDetalleCalificacionEmpleado.getWidth(),CalificacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCalificacionEmpleado.jTabbedPaneRelacionesCalificacionEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCalificacionEmpleado.jContentPaneDetalleCalificacionEmpleado.getWidth(),CalificacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCalificacionEmpleado.jTabbedPaneRelacionesCalificacionEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCalificacionEmpleado.jContentPaneDetalleCalificacionEmpleado.getWidth(),CalificacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCalificacionEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormCalificacionEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCalificacionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCalificacionEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCalificacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCalificacionEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByCalificacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCalificacionEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCalificacionEmpleado);
				this.jInternalFrameOrderByCalificacionEmpleado.setVisible(false);
				this.jInternalFrameOrderByCalificacionEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByCalificacionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCalificacionEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByCalificacionEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCalificacionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCalificacionEmpleado==null) {
				
				this.jInternalFrameImportacionCalificacionEmpleado=new ImportacionJInternalFrame(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCalificacionEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCalificacionEmpleado);
				this.jInternalFrameImportacionCalificacionEmpleado.setVisible(false);
				this.jInternalFrameImportacionCalificacionEmpleado.setSelected(false);


				this.jInternalFrameImportacionCalificacionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCalificacionEmpleado"));
				this.jInternalFrameImportacionCalificacionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCalificacionEmpleado"));
				this.jInternalFrameImportacionCalificacionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCalificacionEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCalificacionEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCalificacionEmpleado==null) {
				this.jInternalFrameReporteDinamicoCalificacionEmpleado=new ReporteDinamicoJInternalFrame(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCalificacionEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCalificacionEmpleado);
				this.jInternalFrameReporteDinamicoCalificacionEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoCalificacionEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCalificacionEmpleado"));
				this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCalificacionEmpleado"));
				this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCalificacionEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCalificacionEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCalificacionEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCalificacionEmpleado);
			
	       	this.jInternalFrameDetalleFormCalificacionEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormCalificacionEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormCalificacionEmpleado.dispose();
			//this.jInternalFrameDetalleFormCalificacionEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCalificacionEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCalificacionEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoCalificacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCalificacionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCalificacionEmpleado.setVisible(true);
	        this.jInternalFrameImportacionCalificacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCalificacionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCalificacionEmpleado.setVisible(true);
	        this.jInternalFrameOrderByCalificacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCalificacionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCalificacionEmpleado.setVisible(false);
	        this.jInternalFrameOrderByCalificacionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCalificacionEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCalificacionEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoCalificacionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCalificacionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCalificacionEmpleado.setVisible(false);
	        this.jInternalFrameImportacionCalificacionEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCalificacionEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCalificacionEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCalificacionEmpleado(true);
			//this.isEsNuevoCalificacionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCalificacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCalificacionEmpleado(false) ;
			
			if(calificacionempleadoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCalificacionEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCalificacionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCalificacionEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCalificacionEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCalificacionEmpleado(true);
			//this.isEsNuevoCalificacionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.calificacionempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCalificacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCalificacionEmpleado(false) ;
			
			if(CalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCalificacionEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCalificacionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCalificacionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEvaluacionEmpleado(List<EvaluacionEmpleado> evaluacionempleadosForeignKey)throws Exception{
		TableColumn tableColumnEvaluacionEmpleado=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO));
		TableCellEditor tableCellEditorEvaluacionEmpleado =tableColumnEvaluacionEmpleado.getCellEditor();

		EvaluacionEmpleadoTableCell evaluacionempleadoTableCellFk=(EvaluacionEmpleadoTableCell)tableCellEditorEvaluacionEmpleado;

		if(evaluacionempleadoTableCellFk!=null) {
			evaluacionempleadoTableCellFk.setevaluacionempleadosForeignKey(evaluacionempleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCalificacionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//evaluacionempleadoTableCellFk.setRowActual(intSelectedRow);
			//evaluacionempleadoTableCellFk.setevaluacionempleadosForeignKeyActual(evaluacionempleadosForeignKey);
		//}


		if(evaluacionempleadoTableCellFk!=null) {
			evaluacionempleadoTableCellFk.RecargarEvaluacionEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormatoNomiFactorNomi(List<FormatoNomiFactorNomi> formatonomifactornomisForeignKey)throws Exception{
		TableColumn tableColumnFormatoNomiFactorNomi=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI));
		TableCellEditor tableCellEditorFormatoNomiFactorNomi =tableColumnFormatoNomiFactorNomi.getCellEditor();

		FormatoNomiFactorNomiTableCell formatonomifactornomiTableCellFk=(FormatoNomiFactorNomiTableCell)tableCellEditorFormatoNomiFactorNomi;

		if(formatonomifactornomiTableCellFk!=null) {
			formatonomifactornomiTableCellFk.setformatonomifactornomisForeignKey(formatonomifactornomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCalificacionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatonomifactornomiTableCellFk.setRowActual(intSelectedRow);
			//formatonomifactornomiTableCellFk.setformatonomifactornomisForeignKeyActual(formatonomifactornomisForeignKey);
		//}


		if(formatonomifactornomiTableCellFk!=null) {
			formatonomifactornomiTableCellFk.RecargarFormatoNomiFactorNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormatoNomiPreguntaNomi(List<FormatoNomiPreguntaNomi> formatonomipreguntanomisForeignKey)throws Exception{
		TableColumn tableColumnFormatoNomiPreguntaNomi=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI));
		TableCellEditor tableCellEditorFormatoNomiPreguntaNomi =tableColumnFormatoNomiPreguntaNomi.getCellEditor();

		FormatoNomiPreguntaNomiTableCell formatonomipreguntanomiTableCellFk=(FormatoNomiPreguntaNomiTableCell)tableCellEditorFormatoNomiPreguntaNomi;

		if(formatonomipreguntanomiTableCellFk!=null) {
			formatonomipreguntanomiTableCellFk.setformatonomipreguntanomisForeignKey(formatonomipreguntanomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCalificacionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatonomipreguntanomiTableCellFk.setRowActual(intSelectedRow);
			//formatonomipreguntanomiTableCellFk.setformatonomipreguntanomisForeignKeyActual(formatonomipreguntanomisForeignKey);
		//}


		if(formatonomipreguntanomiTableCellFk!=null) {
			formatonomipreguntanomiTableCellFk.RecargarFormatoNomiPreguntaNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoCalificacionEmpleado(List<TipoCalificacionEmpleado> tipocalificacionempleadosForeignKey)throws Exception{
		TableColumn tableColumnTipoCalificacionEmpleado=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO));
		TableCellEditor tableCellEditorTipoCalificacionEmpleado =tableColumnTipoCalificacionEmpleado.getCellEditor();

		TipoCalificacionEmpleadoTableCell tipocalificacionempleadoTableCellFk=(TipoCalificacionEmpleadoTableCell)tableCellEditorTipoCalificacionEmpleado;

		if(tipocalificacionempleadoTableCellFk!=null) {
			tipocalificacionempleadoTableCellFk.settipocalificacionempleadosForeignKey(tipocalificacionempleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCalificacionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocalificacionempleadoTableCellFk.setRowActual(intSelectedRow);
			//tipocalificacionempleadoTableCellFk.settipocalificacionempleadosForeignKeyActual(tipocalificacionempleadosForeignKey);
		//}


		if(tipocalificacionempleadoTableCellFk!=null) {
			tipocalificacionempleadoTableCellFk.RecargarTipoCalificacionEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCalificacionEmpleado(false);
			
			//if(!this.isEsNuevoCalificacionEmpleado) {								
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				
			}
			
			if(this.permiteMantenimiento(this.calificacionempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCalificacionEmpleado=true;
					this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
					this.isEsNuevoCalificacionEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCalificacionEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCalificacionEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCalificacionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCalificacionEmpleado(false);
				
				this.habilitarDeshabilitarControlesCalificacionEmpleado(false);
			
												
				
				if(CalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCalificacionEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCalificacionEmpleadoActionPerformed(evt,calificacionempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCalificacionEmpleado(this.calificacionempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,calificacionempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.calificacionempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CalificacionEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalificacionEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.calificacionempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.calificacionempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.calificacionempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CalificacionEmpleadoModel) this.jTableDatosCalificacionEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCalificacionEmpleado=true;
				this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
				this.isEsNuevoCalificacionEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCalificacionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCalificacionEmpleado(false);
				
				this.habilitarDeshabilitarControlesCalificacionEmpleado(false);
				
				
				
				if(CalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCalificacionEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCalificacionEmpleado.getRowCount()>=1) {
				jTableDatosCalificacionEmpleado.removeRowSelectionInterval(0, jTableDatosCalificacionEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCalificacionEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCalificacionEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCalificacionEmpleado(false) ;
			
			this.isEsNuevoCalificacionEmpleado=false;
			
			if(CalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCalificacionEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCalificacionEmpleado(false);
				
				//SI ES MANUAL
				if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCalificacionEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCalificacionEmpleado--;			
			//CalificacionEmpleado calificacionempleadoAux= new CalificacionEmpleado();			
			//calificacionempleadoAux.setId(this.iIdNuevoCalificacionEmpleado);
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCalificacionEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
			
			this.calificacionempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.calificacionempleadoLogic.getCalificacionEmpleados().add(this.calificacionempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.calificacionempleados.add(this.calificacionempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
			
			this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoCalificacionEmpleado(), this.getIndiceNuevoCalificacionEmpleado());
			
			int iLastRow =  this.jTableDatosCalificacionEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCalificacionEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCalificacionEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCalificacionEmpleado(false);
			
			//SI ES MANUAL
			if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCalificacionEmpleado();
			}
			
			//this.abrirFrameTreeCalificacionEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Calificacion EmpleadoS ?", "MANTENIMIENTO DE Calificacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCalificacionEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCalificacionEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.calificacionempleadoReturnGeneral=calificacionempleadoLogic.procesarImportacionCalificacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.calificacionempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCalificacionEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCalificacionEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCalificacionEmpleado.setFileImportacion(this.jInternalFrameImportacionCalificacionEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCalificacionEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCalificacionEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCalificacionEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCalificacionEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();		

		calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CalificacionEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CalificacionEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteCalificacionEmpleados("Todos",calificacionempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EvaluacionEmpleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EvaluacionEmpleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EvaluacionEmpleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EvaluacionEmpleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FormatoNomiFactorNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FormatoNomiFactorNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FormatoNomiFactorNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FormatoNomiFactorNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FormatoNomiPreguntaNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FormatoNomiPreguntaNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FormatoNomiPreguntaNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FormatoNomiPreguntaNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCalificacionEmpleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCalificacionEmpleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCalificacionEmpleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCalificacionEmpleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorConocimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorConocimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorConocimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorConocimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorEficiencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorEficiencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorEficiencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorEficiencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorObtenido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorObtenido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorObtenido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorObtenido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPeso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPeso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPeso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPeso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rificado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rificado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rificado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rificado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO:
					sNombreCampoCategoria="id_evaluacion_empleado";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI:
					sNombreCampoCategoria="id_formato_nomi_factor_nomi";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					sNombreCampoCategoria="id_formato_nomi_pregunta_nomi";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO:
					sNombreCampoCategoria="id_tipo_calificacion_empleado";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					sNombreCampoCategoria="valor_conocimiento";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA:
					sNombreCampoCategoria="valor_eficiencia";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO:
					sNombreCampoCategoria="valor_obtenido";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO:
					sNombreCampoCategoria="valor_peso";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO:
					sNombreCampoCategoria="verificado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO:
					sNombreCampoCategoriaValor="id_evaluacion_empleado";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI:
					sNombreCampoCategoriaValor="id_formato_nomi_factor_nomi";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					sNombreCampoCategoriaValor="id_formato_nomi_pregunta_nomi";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO:
					sNombreCampoCategoriaValor="id_tipo_calificacion_empleado";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					sNombreCampoCategoriaValor="valor_conocimiento";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA:
					sNombreCampoCategoriaValor="valor_eficiencia";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO:
					sNombreCampoCategoriaValor="valor_obtenido";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO:
					sNombreCampoCategoriaValor="valor_peso";
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO:
					sNombreCampoCategoriaValor="verificado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Evaluacion Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_evaluacion_empleado");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato Nomi Factor Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato_nomi_factor_nomi");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato Nomi Pregunta Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato_nomi_pregunta_nomi");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Idtipo Calificacion Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_calificacion_empleado");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Conocimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_conocimiento");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Eficiencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_eficiencia");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Obtenido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_obtenido");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Peso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_peso");
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Verificado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"verificado");
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
	
	public void jButtonGenerarExcelReporteDinamicoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();		
		
		calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calificacionempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CalificacionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getevaluacionempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getformatonomifactornomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getformatonomipreguntanomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.gettipocalificacionempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getvalor_conocimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getvalor_eficiencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getvalor_obtenido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getvalor_peso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO);
					iRow++;

					for(CalificacionEmpleado calificacionempleado:calificacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calificacionempleado.getverificado());
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
			//	this.getFilaCabeceraExportarExcelCalificacionEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(CalificacionEmpleado calificacionempleadoAux:calificacionempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCalificacionEmpleado(calificacionempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCalificacionEmpleado(false);
			
			//SI ES MANUAL
			if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCalificacionEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCalificacionEmpleado(false);
			
			//SI ES MANUAL
			if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCalificacionEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCalificacionEmpleado(false);
			
			//SI ES MANUAL
			if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCalificacionEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCalificacionEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCalificacionEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCalificacionEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCalificacionEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCalificacionEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCalificacionEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosCalificacionEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosCalificacionEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCalificacionEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCalificacionEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCalificacionEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCalificacionEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCalificacionEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCalificacionEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCalificacionEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCalificacionEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCalificacionEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCalificacionEmpleado();
		
		this.inicializarActualizarBindingBotonesManualCalificacionEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCalificacionEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCalificacionEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCalificacionEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCalificacionEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCalificacionEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCalificacionEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCalificacionEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxPostAccionNuevoCalificacionEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxPostAccionSinCerrarCalificacionEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxPostAccionSinMensajeCalificacionEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCalificacionEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCalificacionEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCalificacionEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxPostAccionNuevoCalificacionEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxPostAccionSinCerrarCalificacionEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxPostAccionSinMensajeCalificacionEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCalificacionEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCalificacionEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCalificacionEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCalificacionEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCalificacionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCalificacionEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCalificacionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCalificacionEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCalificacionEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCalificacionEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCalificacionEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCalificacionEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCalificacionEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCalificacionEmpleado() throws Exception {
		try	{
			if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCalificacionEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCalificacionEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCalificacionEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCalificacionEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCalificacionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCalificacionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCalificacionEmpleado.addItem(reporte);
			}
			
			
			if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCalificacionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCalificacionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCalificacionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCalificacionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCalificacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCalificacionEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCalificacionEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCalificacionEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCalificacionEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCalificacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCalificacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCalificacionEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CalificacionEmpleadoConstantesFunciones.getTiposSeleccionarCalificacionEmpleado(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CalificacionEmpleadoConstantesFunciones.getTiposSeleccionarCalificacionEmpleado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CalificacionEmpleadoConstantesFunciones.getTiposSeleccionarCalificacionEmpleado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCalificacionEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoCalificacionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.getSelectedItem()!=null){this.id_evaluacion_empleadoFK_IdEvaluacionEmpleado=((EvaluacionEmpleado)this.jComboBoxid_evaluacion_empleadoFK_IdEvaluacionEmpleadoCalificacionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.getSelectedItem()!=null){this.id_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi=((FormatoNomiFactorNomi)this.jComboBoxid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomiCalificacionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.getSelectedItem()!=null){this.id_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi=((FormatoNomiPreguntaNomi)this.jComboBoxid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.getSelectedItem()!=null){this.id_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado=((TipoCalificacionEmpleado)this.jComboBoxid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCalificacionEmpleado(Boolean esInicializar) throws Exception {				
		if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCalificacionEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCalificacionEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCalificacionEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCalificacionEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCalificacionEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=calificacionempleadoLogic.getCalificacionEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=calificacionempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCalificacionEmpleado.setModel(new CalificacionEmpleadoModel(this.calificacionempleadoLogic.getCalificacionEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCalificacionEmpleado.setModel(new CalificacionEmpleadoModel(this.calificacionempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCalificacionEmpleado!=null && this.jInternalFrameOrderByCalificacionEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCalificacionEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,calificacionempleadoConstantesFunciones.resaltarSeleccionarCalificacionEmpleado,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,calificacionempleadoConstantesFunciones.resaltarSeleccionarCalificacionEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_ID));

		if(this.calificacionempleadoConstantesFunciones.mostraridCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.calificacionempleadoConstantesFunciones.resaltaridCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activaridCalificacionEmpleado,iSizeTabla,this,true,"idCalificacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.calificacionempleadoConstantesFunciones.resaltaridCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activaridCalificacionEmpleado,this,true,"idCalificacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.calificacionempleadoConstantesFunciones.mostrarid_empresaCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_empresaCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_empresaCalificacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_empresaCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_empresaCalificacionEmpleado,false,"id_empresaCalificacionEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.calificacionempleadoConstantesFunciones.mostrarid_sucursalCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_sucursalCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_sucursalCalificacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_sucursalCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_sucursalCalificacionEmpleado,false,"id_sucursalCalificacionEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.calificacionempleadoConstantesFunciones.mostrarid_ejercicioCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_ejercicioCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_ejercicioCalificacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_ejercicioCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_ejercicioCalificacionEmpleado,false,"id_ejercicioCalificacionEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO));

		if(this.calificacionempleadoConstantesFunciones.mostrarid_periodoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_periodoCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_periodoCalificacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_periodoCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_periodoCalificacionEmpleado,false,"id_periodoCalificacionEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.calificacionempleadoConstantesFunciones.mostrarid_empleadoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_empleadoCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_empleadoCalificacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_empleadoCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_empleadoCalificacionEmpleado,true,"id_empleadoCalificacionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO));

		if(this.calificacionempleadoConstantesFunciones.mostrarid_evaluacion_empleadoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EvaluacionEmpleadoTableCell(this.evaluacionempleadosForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_evaluacion_empleadoCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_evaluacion_empleadoCalificacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EvaluacionEmpleadoTableCell(this.evaluacionempleadosForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_evaluacion_empleadoCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_evaluacion_empleadoCalificacionEmpleado,true,"id_evaluacion_empleadoCalificacionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI));

		if(this.calificacionempleadoConstantesFunciones.mostrarid_formato_nomi_factor_nomiCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoNomiFactorNomiTableCell(this.formatonomifactornomisForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_formato_nomi_factor_nomiCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_formato_nomi_factor_nomiCalificacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new FormatoNomiFactorNomiTableCell(this.formatonomifactornomisForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_formato_nomi_factor_nomiCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_formato_nomi_factor_nomiCalificacionEmpleado,true,"id_formato_nomi_factor_nomiCalificacionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI));

		if(this.calificacionempleadoConstantesFunciones.mostrarid_formato_nomi_pregunta_nomiCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoNomiPreguntaNomiTableCell(this.formatonomipreguntanomisForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_formato_nomi_pregunta_nomiCalificacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new FormatoNomiPreguntaNomiTableCell(this.formatonomipreguntanomisForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_formato_nomi_pregunta_nomiCalificacionEmpleado,true,"id_formato_nomi_pregunta_nomiCalificacionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO));

		if(this.calificacionempleadoConstantesFunciones.mostrarid_tipo_calificacion_empleadoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCalificacionEmpleadoTableCell(this.tipocalificacionempleadosForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_tipo_calificacion_empleadoCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_tipo_calificacion_empleadoCalificacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new TipoCalificacionEmpleadoTableCell(this.tipocalificacionempleadosForeignKey,this.calificacionempleadoConstantesFunciones.resaltarid_tipo_calificacion_empleadoCalificacionEmpleado,this,this.calificacionempleadoConstantesFunciones.activarid_tipo_calificacion_empleadoCalificacionEmpleado,true,"id_tipo_calificacion_empleadoCalificacionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO));

		if(this.calificacionempleadoConstantesFunciones.mostrarvalor_conocimientoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.calificacionempleadoConstantesFunciones.resaltarvalor_conocimientoCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activarvalor_conocimientoCalificacionEmpleado,iSizeTabla,this,true,"valor_conocimientoCalificacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.calificacionempleadoConstantesFunciones.resaltarvalor_conocimientoCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activarvalor_conocimientoCalificacionEmpleado,this,true,"valor_conocimientoCalificacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA));

		if(this.calificacionempleadoConstantesFunciones.mostrarvalor_eficienciaCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.calificacionempleadoConstantesFunciones.resaltarvalor_eficienciaCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activarvalor_eficienciaCalificacionEmpleado,iSizeTabla,this,true,"valor_eficienciaCalificacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.calificacionempleadoConstantesFunciones.resaltarvalor_eficienciaCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activarvalor_eficienciaCalificacionEmpleado,this,true,"valor_eficienciaCalificacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO));

		if(this.calificacionempleadoConstantesFunciones.mostrarvalor_obtenidoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.calificacionempleadoConstantesFunciones.resaltarvalor_obtenidoCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activarvalor_obtenidoCalificacionEmpleado,iSizeTabla,this,true,"valor_obtenidoCalificacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.calificacionempleadoConstantesFunciones.resaltarvalor_obtenidoCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activarvalor_obtenidoCalificacionEmpleado,this,true,"valor_obtenidoCalificacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO));

		if(this.calificacionempleadoConstantesFunciones.mostrarvalor_pesoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.calificacionempleadoConstantesFunciones.resaltarvalor_pesoCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activarvalor_pesoCalificacionEmpleado,iSizeTabla,this,true,"valor_pesoCalificacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.calificacionempleadoConstantesFunciones.resaltarvalor_pesoCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activarvalor_pesoCalificacionEmpleado,this,true,"valor_pesoCalificacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO));

		if(this.calificacionempleadoConstantesFunciones.mostrarverificadoCalificacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.calificacionempleadoConstantesFunciones.resaltarverificadoCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activarverificadoCalificacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.calificacionempleadoConstantesFunciones.resaltarverificadoCalificacionEmpleado,this.calificacionempleadoConstantesFunciones.activarverificadoCalificacionEmpleado,this,true,"verificadoCalificacionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CalificacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.calificacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.calificacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCalificacionEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.calificacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.calificacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCalificacionEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.calificacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.calificacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCalificacionEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosCalificacionEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCalificacionEmpleado.moveColumn(this.jTableDatosCalificacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCalificacionEmpleado.moveColumn(this.jTableDatosCalificacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCalificacionEmpleado.moveColumn(this.jTableDatosCalificacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCalificacionEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCalificacionEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCalificacionEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCalificacionEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCalificacionEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCalificacionEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCalificacionEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=calificacionempleadoLogic.getCalificacionEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=calificacionempleados.size()-1;
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
		//this.jTableDatosCalificacionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCalificacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCalificacionEmpleado();
			
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
				
				//this.isEsNuevoCalificacionEmpleado=false;
					
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
				if(this.calificacionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCalificacionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCalificacionEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.calificacionempleado.getsType().equals("DUPLICADO")
				   || this.calificacionempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCalificacionEmpleado=true;
				
				} else {
					this.isEsNuevoCalificacionEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.calificacionempleado.getId()>=0 && !this.calificacionempleado.getIsNew()) {						
						this.isEsNuevoCalificacionEmpleado=false;
						
					} else {
						this.isEsNuevoCalificacionEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCalificacionEmpleado(esRelaciones);						
				
				this.seleccionarCalificacionEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.calificacionempleado.getId()<0) {
					this.isEsNuevoCalificacionEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCalificacionEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCalificacionEmpleado(evt,rowIndex);
				}	
				
				if(this.calificacionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CalificacionEmpleado: " + this.dDif); 
					}
				}								
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCalificacionEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.calificacionempleado)) {
					if(this.calificacionempleado.getId()>0) {
						this.calificacionempleado.setIsDeleted(true);
						
						this.calificacionempleadosEliminados.add(this.calificacionempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.calificacionempleadoLogic.getCalificacionEmpleados().remove(this.calificacionempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.calificacionempleados.remove(this.calificacionempleado);				
					}
					
					
					((CalificacionEmpleadoModel) this.jTableDatosCalificacionEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCalificacionEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCalificacionEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCalificacionEmpleado) {
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCalificacionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCalificacionEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCalificacionEmpleado(this.calificacionempleado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.calificacionempleadoConstantesFunciones.cargarid_empresaCalificacionEmpleado || this.calificacionempleadoConstantesFunciones.event_dependid_empresaCalificacionEmpleado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.calificacionempleado.getid_empresa());
									//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(calificacionempleado.getEmpresa()!=null) {
							this.empresasForeignKey.add(calificacionempleado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.calificacionempleado.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.calificacionempleadoConstantesFunciones.cargarid_sucursalCalificacionEmpleado || this.calificacionempleadoConstantesFunciones.event_dependid_sucursalCalificacionEmpleado) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.calificacionempleado.getid_sucursal());
									//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(calificacionempleado.getSucursal()!=null) {
							this.sucursalsForeignKey.add(calificacionempleado.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.calificacionempleado.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.calificacionempleadoConstantesFunciones.cargarid_ejercicioCalificacionEmpleado || this.calificacionempleadoConstantesFunciones.event_dependid_ejercicioCalificacionEmpleado) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.calificacionempleado.getid_ejercicio());
									//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(calificacionempleado.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(calificacionempleado.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.calificacionempleado.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.calificacionempleadoConstantesFunciones.cargarid_periodoCalificacionEmpleado || this.calificacionempleadoConstantesFunciones.event_dependid_periodoCalificacionEmpleado) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.calificacionempleado.getid_periodo());
									//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(calificacionempleado.getPeriodo()!=null) {
							this.periodosForeignKey.add(calificacionempleado.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.calificacionempleado.getid_periodo(),false,"Formulario");

					//Empleado
					if(!this.calificacionempleadoConstantesFunciones.cargarid_empleadoCalificacionEmpleado || this.calificacionempleadoConstantesFunciones.event_dependid_empleadoCalificacionEmpleado) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.calificacionempleado.getid_empleado());
									//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(calificacionempleado.getEmpleado()!=null) {
							this.empleadosForeignKey.add(calificacionempleado.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.calificacionempleado.getid_empleado(),false,"Formulario");

					//EvaluacionEmpleado
					if(!this.calificacionempleadoConstantesFunciones.cargarid_evaluacion_empleadoCalificacionEmpleado || this.calificacionempleadoConstantesFunciones.event_dependid_evaluacion_empleadoCalificacionEmpleado) {
						//this.cargarCombosEvaluacionEmpleadosForeignKeyLista(" where id="+this.calificacionempleado.getid_evaluacion_empleado());
									//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
						this.evaluacionempleadosForeignKey=new ArrayList<EvaluacionEmpleado>();

						if(calificacionempleado.getEvaluacionEmpleado()!=null) {
							this.evaluacionempleadosForeignKey.add(calificacionempleado.getEvaluacionEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEvaluacionEmpleado();
						this.cargarCombosFrameEvaluacionEmpleadosForeignKey("Todos");
					}
					this.setActualEvaluacionEmpleadoForeignKey(this.calificacionempleado.getid_evaluacion_empleado(),false,"Formulario");

					//FormatoNomiFactorNomi
					if(!this.calificacionempleadoConstantesFunciones.cargarid_formato_nomi_factor_nomiCalificacionEmpleado || this.calificacionempleadoConstantesFunciones.event_dependid_formato_nomi_factor_nomiCalificacionEmpleado) {
						//this.cargarCombosFormatoNomiFactorNomisForeignKeyLista(" where id="+this.calificacionempleado.getid_formato_nomi_factor_nomi());
									//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
						this.formatonomifactornomisForeignKey=new ArrayList<FormatoNomiFactorNomi>();

						if(calificacionempleado.getFormatoNomiFactorNomi()!=null) {
							this.formatonomifactornomisForeignKey.add(calificacionempleado.getFormatoNomiFactorNomi());
						}

						this.addItemDefectoCombosForeignKeyFormatoNomiFactorNomi();
						this.cargarCombosFrameFormatoNomiFactorNomisForeignKey("Todos");
					}
					this.setActualFormatoNomiFactorNomiForeignKey(this.calificacionempleado.getid_formato_nomi_factor_nomi(),false,"Formulario");

					//FormatoNomiPreguntaNomi
					if(!this.calificacionempleadoConstantesFunciones.cargarid_formato_nomi_pregunta_nomiCalificacionEmpleado || this.calificacionempleadoConstantesFunciones.event_dependid_formato_nomi_pregunta_nomiCalificacionEmpleado) {
						//this.cargarCombosFormatoNomiPreguntaNomisForeignKeyLista(" where id="+this.calificacionempleado.getid_formato_nomi_pregunta_nomi());
									//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
						this.formatonomipreguntanomisForeignKey=new ArrayList<FormatoNomiPreguntaNomi>();

						if(calificacionempleado.getFormatoNomiPreguntaNomi()!=null) {
							this.formatonomipreguntanomisForeignKey.add(calificacionempleado.getFormatoNomiPreguntaNomi());
						}

						this.addItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi();
						this.cargarCombosFrameFormatoNomiPreguntaNomisForeignKey("Todos");
					}
					this.setActualFormatoNomiPreguntaNomiForeignKey(this.calificacionempleado.getid_formato_nomi_pregunta_nomi(),false,"Formulario");

					//TipoCalificacionEmpleado
					if(!this.calificacionempleadoConstantesFunciones.cargarid_tipo_calificacion_empleadoCalificacionEmpleado || this.calificacionempleadoConstantesFunciones.event_dependid_tipo_calificacion_empleadoCalificacionEmpleado) {
						//this.cargarCombosTipoCalificacionEmpleadosForeignKeyLista(" where id="+this.calificacionempleado.getid_tipo_calificacion_empleado());
									//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
						this.tipocalificacionempleadosForeignKey=new ArrayList<TipoCalificacionEmpleado>();

						if(calificacionempleado.getTipoCalificacionEmpleado()!=null) {
							this.tipocalificacionempleadosForeignKey.add(calificacionempleado.getTipoCalificacionEmpleado());
						}

						this.addItemDefectoCombosForeignKeyTipoCalificacionEmpleado();
						this.cargarCombosFrameTipoCalificacionEmpleadosForeignKey("Todos");
					}
					this.setActualTipoCalificacionEmpleadoForeignKey(this.calificacionempleado.getid_tipo_calificacion_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCalificacionEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCalificacionEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCalificacionEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCalificacionEmpleado(CalificacionEmpleado calificacionempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCalificacionEmpleado(calificacionempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCalificacionEmpleado(CalificacionEmpleado calificacionempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCalificacionEmpleado(calificacionempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCalificacionEmpleado(calificacionempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCalificacionEmpleado(calificacionempleado);
	}
	
	public void setVariablesObjetoActualToFormularioCalificacionEmpleado(CalificacionEmpleado calificacionempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelidCalificacionEmpleado.setText(calificacionempleado.getId().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_conocimientoCalificacionEmpleado.setText(calificacionempleado.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_eficienciaCalificacionEmpleado.setText(calificacionempleado.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_obtenidoCalificacionEmpleado.setText(calificacionempleado.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_pesoCalificacionEmpleado.setText(calificacionempleado.getvalor_peso().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxverificadoCalificacionEmpleado.setSelected(calificacionempleado.getverificado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CalificacionEmpleado calificacionempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,calificacionempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CalificacionEmpleado calificacionempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				calificacionempleadoLocal=this.calificacionempleado;
			} else {
				calificacionempleadoLocal=this.calificacionempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(calificacionempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCalificacionEmpleado(calificacionempleadoLocal,true);
					
					if(calificacionempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(calificacionempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(calificacionempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCalificacionEmpleado(CalificacionEmpleado calificacionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCalificacionEmpleado(calificacionempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(calificacionempleado);
	}
	
	public void setVariablesFormularioToObjetoActualCalificacionEmpleado(CalificacionEmpleado calificacionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCalificacionEmpleado(calificacionempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCalificacionEmpleado(CalificacionEmpleado calificacionempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelidCalificacionEmpleado.getText()==null || this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelidCalificacionEmpleado.getText()=="" || this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelidCalificacionEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelidCalificacionEmpleado.setText("0");
			}

			if(conColumnasBase) {calificacionempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelidCalificacionEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CalificacionEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelIdCalificacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			calificacionempleado.setvalor_conocimiento(Double.parseDouble(this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_conocimientoCalificacionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_conocimientoCalificacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			calificacionempleado.setvalor_eficiencia(Double.parseDouble(this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_eficienciaCalificacionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_eficienciaCalificacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			calificacionempleado.setvalor_obtenido(Double.parseDouble(this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_obtenidoCalificacionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_obtenidoCalificacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			calificacionempleado.setvalor_peso(Double.parseDouble(this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_pesoCalificacionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelvalor_pesoCalificacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			calificacionempleado.setverificado(this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxverificadoCalificacionEmpleado.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelverificadoCalificacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCalificacionEmpleado(CalificacionEmpleado calificacionempleadoBean,CalificacionEmpleado calificacionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && calificacionempleadoBean.getid_empleado()!=null && !calificacionempleadoBean.getid_empleado().equals(-1L))) {calificacionempleado.setid_empleado(calificacionempleadoBean.getid_empleado());}
			if(conDefault || (!conDefault && calificacionempleadoBean.getid_evaluacion_empleado()!=null && !calificacionempleadoBean.getid_evaluacion_empleado().equals(-1L))) {calificacionempleado.setid_evaluacion_empleado(calificacionempleadoBean.getid_evaluacion_empleado());}
			if(conDefault || (!conDefault && calificacionempleadoBean.getid_formato_nomi_factor_nomi()!=null && !calificacionempleadoBean.getid_formato_nomi_factor_nomi().equals(-1L))) {calificacionempleado.setid_formato_nomi_factor_nomi(calificacionempleadoBean.getid_formato_nomi_factor_nomi());}
			if(conDefault || (!conDefault && calificacionempleadoBean.getid_formato_nomi_pregunta_nomi()!=null && !calificacionempleadoBean.getid_formato_nomi_pregunta_nomi().equals(-1L))) {calificacionempleado.setid_formato_nomi_pregunta_nomi(calificacionempleadoBean.getid_formato_nomi_pregunta_nomi());}
			if(conDefault || (!conDefault && calificacionempleadoBean.getid_tipo_calificacion_empleado()!=null && !calificacionempleadoBean.getid_tipo_calificacion_empleado().equals(-1L))) {calificacionempleado.setid_tipo_calificacion_empleado(calificacionempleadoBean.getid_tipo_calificacion_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCalificacionEmpleado(CalificacionEmpleado calificacionempleadoOrigen,CalificacionEmpleado calificacionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && calificacionempleadoOrigen.getId()!=null && !calificacionempleadoOrigen.getId().equals(0L))) {calificacionempleado.setId(calificacionempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && calificacionempleadoOrigen.getid_empleado()!=null && !calificacionempleadoOrigen.getid_empleado().equals(-1L))) {calificacionempleado.setid_empleado(calificacionempleadoOrigen.getid_empleado());}
			if(conDefault || (!conDefault && calificacionempleadoOrigen.getid_evaluacion_empleado()!=null && !calificacionempleadoOrigen.getid_evaluacion_empleado().equals(-1L))) {calificacionempleado.setid_evaluacion_empleado(calificacionempleadoOrigen.getid_evaluacion_empleado());}
			if(conDefault || (!conDefault && calificacionempleadoOrigen.getid_formato_nomi_factor_nomi()!=null && !calificacionempleadoOrigen.getid_formato_nomi_factor_nomi().equals(-1L))) {calificacionempleado.setid_formato_nomi_factor_nomi(calificacionempleadoOrigen.getid_formato_nomi_factor_nomi());}
			if(conDefault || (!conDefault && calificacionempleadoOrigen.getid_formato_nomi_pregunta_nomi()!=null && !calificacionempleadoOrigen.getid_formato_nomi_pregunta_nomi().equals(-1L))) {calificacionempleado.setid_formato_nomi_pregunta_nomi(calificacionempleadoOrigen.getid_formato_nomi_pregunta_nomi());}
			if(conDefault || (!conDefault && calificacionempleadoOrigen.getid_tipo_calificacion_empleado()!=null && !calificacionempleadoOrigen.getid_tipo_calificacion_empleado().equals(-1L))) {calificacionempleado.setid_tipo_calificacion_empleado(calificacionempleadoOrigen.getid_tipo_calificacion_empleado());}
			if(conDefault || (!conDefault && calificacionempleadoOrigen.getvalor_conocimiento()!=null && !calificacionempleadoOrigen.getvalor_conocimiento().equals(0.0))) {calificacionempleado.setvalor_conocimiento(calificacionempleadoOrigen.getvalor_conocimiento());}
			if(conDefault || (!conDefault && calificacionempleadoOrigen.getvalor_eficiencia()!=null && !calificacionempleadoOrigen.getvalor_eficiencia().equals(0.0))) {calificacionempleado.setvalor_eficiencia(calificacionempleadoOrigen.getvalor_eficiencia());}
			if(conDefault || (!conDefault && calificacionempleadoOrigen.getvalor_obtenido()!=null && !calificacionempleadoOrigen.getvalor_obtenido().equals(0.0))) {calificacionempleado.setvalor_obtenido(calificacionempleadoOrigen.getvalor_obtenido());}
			if(conDefault || (!conDefault && calificacionempleadoOrigen.getvalor_peso()!=null && !calificacionempleadoOrigen.getvalor_peso().equals(0.0))) {calificacionempleado.setvalor_peso(calificacionempleadoOrigen.getvalor_peso());}
			if(conDefault || (!conDefault && calificacionempleadoOrigen.getverificado()!=null && !calificacionempleadoOrigen.getverificado().equals(false))) {calificacionempleado.setverificado(calificacionempleadoOrigen.getverificado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCalificacionEmpleado(CalificacionEmpleado calificacionempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelidCalificacionEmpleado.setText(calificacionempleado.getId().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_conocimientoCalificacionEmpleado.setText(calificacionempleado.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_eficienciaCalificacionEmpleado.setText(calificacionempleado.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_obtenidoCalificacionEmpleado.setText(calificacionempleado.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_pesoCalificacionEmpleado.setText(calificacionempleado.getvalor_peso().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxverificadoCalificacionEmpleado.setSelected(calificacionempleado.getverificado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCalificacionEmpleado(CalificacionEmpleadoBean calificacionempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelidCalificacionEmpleado.setText(calificacionempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_conocimientoCalificacionEmpleado.setText(calificacionempleadoBean.getvalor_conocimiento().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_eficienciaCalificacionEmpleado.setText(calificacionempleadoBean.getvalor_eficiencia().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_obtenidoCalificacionEmpleado.setText(calificacionempleadoBean.getvalor_obtenido().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_pesoCalificacionEmpleado.setText(calificacionempleadoBean.getvalor_peso().toString());
			this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxverificadoCalificacionEmpleado.setSelected(calificacionempleadoBean.getverificado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCalificacionEmpleado(CalificacionEmpleadoParameterReturnGeneral calificacionempleadoReturnGeneral,CalificacionEmpleadoBean calificacionempleadoBean,Boolean conDefault) throws Exception { 
		try {
			CalificacionEmpleado calificacionempleadoLocal=new CalificacionEmpleado();
			
			calificacionempleadoLocal=calificacionempleadoReturnGeneral.getCalificacionEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && calificacionempleadoLocal.getId()!=null && !calificacionempleadoLocal.getId().equals(0L))) {calificacionempleadoBean.setId(calificacionempleadoLocal.getId());}}
			if(conDefault || (!conDefault && calificacionempleadoLocal.getid_empleado()!=null && !calificacionempleadoLocal.getid_empleado().equals(-1L))) {calificacionempleadoBean.setid_empleado(calificacionempleadoLocal.getid_empleado());}
			if(conDefault || (!conDefault && calificacionempleadoLocal.getid_evaluacion_empleado()!=null && !calificacionempleadoLocal.getid_evaluacion_empleado().equals(-1L))) {calificacionempleadoBean.setid_evaluacion_empleado(calificacionempleadoLocal.getid_evaluacion_empleado());}
			if(conDefault || (!conDefault && calificacionempleadoLocal.getid_formato_nomi_factor_nomi()!=null && !calificacionempleadoLocal.getid_formato_nomi_factor_nomi().equals(-1L))) {calificacionempleadoBean.setid_formato_nomi_factor_nomi(calificacionempleadoLocal.getid_formato_nomi_factor_nomi());}
			if(conDefault || (!conDefault && calificacionempleadoLocal.getid_formato_nomi_pregunta_nomi()!=null && !calificacionempleadoLocal.getid_formato_nomi_pregunta_nomi().equals(-1L))) {calificacionempleadoBean.setid_formato_nomi_pregunta_nomi(calificacionempleadoLocal.getid_formato_nomi_pregunta_nomi());}
			if(conDefault || (!conDefault && calificacionempleadoLocal.getid_tipo_calificacion_empleado()!=null && !calificacionempleadoLocal.getid_tipo_calificacion_empleado().equals(-1L))) {calificacionempleadoBean.setid_tipo_calificacion_empleado(calificacionempleadoLocal.getid_tipo_calificacion_empleado());}
			if(conDefault || (!conDefault && calificacionempleadoLocal.getvalor_conocimiento()!=null && !calificacionempleadoLocal.getvalor_conocimiento().equals(0.0))) {calificacionempleadoBean.setvalor_conocimiento(calificacionempleadoLocal.getvalor_conocimiento());}
			if(conDefault || (!conDefault && calificacionempleadoLocal.getvalor_eficiencia()!=null && !calificacionempleadoLocal.getvalor_eficiencia().equals(0.0))) {calificacionempleadoBean.setvalor_eficiencia(calificacionempleadoLocal.getvalor_eficiencia());}
			if(conDefault || (!conDefault && calificacionempleadoLocal.getvalor_obtenido()!=null && !calificacionempleadoLocal.getvalor_obtenido().equals(0.0))) {calificacionempleadoBean.setvalor_obtenido(calificacionempleadoLocal.getvalor_obtenido());}
			if(conDefault || (!conDefault && calificacionempleadoLocal.getvalor_peso()!=null && !calificacionempleadoLocal.getvalor_peso().equals(0.0))) {calificacionempleadoBean.setvalor_peso(calificacionempleadoLocal.getvalor_peso());}
			if(conDefault || (!conDefault && calificacionempleadoLocal.getverificado()!=null && !calificacionempleadoLocal.getverificado().equals(false))) {calificacionempleadoBean.setverificado(calificacionempleadoLocal.getverificado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCalificacionEmpleadoGenerico(Long idCalificacionEmpleadoSeleccionado,JComboBox jComboBoxCalificacionEmpleado,List<CalificacionEmpleado> calificacionempleadosLocal)throws Exception {
		try {
			CalificacionEmpleado  calificacionempleadoTemp=null;

			for(CalificacionEmpleado calificacionempleadoAux:calificacionempleadosLocal) {
				if(calificacionempleadoAux.getId()!=null && calificacionempleadoAux.getId().equals(idCalificacionEmpleadoSeleccionado)) {
					calificacionempleadoTemp=calificacionempleadoAux;
					break;
				}
			}

			jComboBoxCalificacionEmpleado.setSelectedItem(calificacionempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCalificacionEmpleadoGenerico(JComboBox jComboBoxCalificacionEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCalificacionEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCalificacionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCalificacionEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCalificacionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCalificacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCalificacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			calificacionempleado=(CalificacionEmpleado) calificacionempleadoLogic.getCalificacionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			calificacionempleado =(CalificacionEmpleado) calificacionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!calificacionempleado.getIsNew() && !calificacionempleado.getIsChanged() && !calificacionempleado.getIsDeleted()) {
				sDescripcion=calificacionempleado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=calificacionempleado.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!calificacionempleado.getIsNew() && !calificacionempleado.getIsChanged() && !calificacionempleado.getIsDeleted()) {
				sDescripcion=calificacionempleado.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=calificacionempleado.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!calificacionempleado.getIsNew() && !calificacionempleado.getIsChanged() && !calificacionempleado.getIsDeleted()) {
				sDescripcion=calificacionempleado.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=calificacionempleado.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!calificacionempleado.getIsNew() && !calificacionempleado.getIsChanged() && !calificacionempleado.getIsDeleted()) {
				sDescripcion=calificacionempleado.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=calificacionempleado.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!calificacionempleado.getIsNew() && !calificacionempleado.getIsChanged() && !calificacionempleado.getIsDeleted()) {
				sDescripcion=calificacionempleado.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=calificacionempleado.getempleado_descripcion();
			}
		}

		if(sTipo.equals("EvaluacionEmpleado")) {
			//sDescripcion=this.getActualEvaluacionEmpleadoForeignKeyDescripcion((Long)value);
			if(!calificacionempleado.getIsNew() && !calificacionempleado.getIsChanged() && !calificacionempleado.getIsDeleted()) {
				sDescripcion=calificacionempleado.getevaluacionempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEvaluacionEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=calificacionempleado.getevaluacionempleado_descripcion();
			}
		}

		if(sTipo.equals("FormatoNomiFactorNomi")) {
			//sDescripcion=this.getActualFormatoNomiFactorNomiForeignKeyDescripcion((Long)value);
			if(!calificacionempleado.getIsNew() && !calificacionempleado.getIsChanged() && !calificacionempleado.getIsDeleted()) {
				sDescripcion=calificacionempleado.getformatonomifactornomi_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoNomiFactorNomiForeignKeyDescripcion((Long)value);
				sDescripcion=calificacionempleado.getformatonomifactornomi_descripcion();
			}
		}

		if(sTipo.equals("FormatoNomiPreguntaNomi")) {
			//sDescripcion=this.getActualFormatoNomiPreguntaNomiForeignKeyDescripcion((Long)value);
			if(!calificacionempleado.getIsNew() && !calificacionempleado.getIsChanged() && !calificacionempleado.getIsDeleted()) {
				sDescripcion=calificacionempleado.getformatonomipreguntanomi_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoNomiPreguntaNomiForeignKeyDescripcion((Long)value);
				sDescripcion=calificacionempleado.getformatonomipreguntanomi_descripcion();
			}
		}

		if(sTipo.equals("TipoCalificacionEmpleado")) {
			//sDescripcion=this.getActualTipoCalificacionEmpleadoForeignKeyDescripcion((Long)value);
			if(!calificacionempleado.getIsNew() && !calificacionempleado.getIsChanged() && !calificacionempleado.getIsDeleted()) {
				sDescripcion=calificacionempleado.gettipocalificacionempleado_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCalificacionEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=calificacionempleado.gettipocalificacionempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CalificacionEmpleado calificacionempleadoRow=new CalificacionEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			calificacionempleadoRow=(CalificacionEmpleado) calificacionempleadoLogic.getCalificacionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			calificacionempleadoRow=(CalificacionEmpleado) calificacionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCalificacionEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoCalificacionEmpleado && this.isPermisoNuevoCalificacionEmpleado));			
			this.jButtonDuplicarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarCalificacionEmpleado && this.isPermisoDuplicarCalificacionEmpleado));			
			this.jButtonCopiarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarCalificacionEmpleado && this.isPermisoCopiarCalificacionEmpleado));
			this.jButtonVerFormCalificacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormCalificacionEmpleado && this.isPermisoVerFormCalificacionEmpleado));
			
			this.jButtonAbrirOrderByCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenCalificacionEmpleado && this.isPermisoOrdenCalificacionEmpleado));			
			
			this.jButtonNuevoRelacionesCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado && this.isPermisoNuevoCalificacionEmpleado));			
			this.jButtonNuevoGuardarCambiosCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoCalificacionEmpleado && this.isPermisoNuevoCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado));
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonModificarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaModificarCalificacionEmpleado && this.isPermisoActualizarCalificacionEmpleado));	
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonActualizarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarCalificacionEmpleado && this.isPermisoActualizarCalificacionEmpleado));	
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonEliminarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarCalificacionEmpleado && this.isPermisoEliminarCalificacionEmpleado));
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonCancelarCalificacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarCalificacionEmpleado);							
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoCalificacionEmpleado && this.isPermisoNuevoCalificacionEmpleado));						
			this.jButtonDuplicarToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarCalificacionEmpleado && this.isPermisoDuplicarCalificacionEmpleado));						
			this.jButtonCopiarToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarCalificacionEmpleado && this.isPermisoCopiarCalificacionEmpleado));			
			this.jButtonVerFormToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormCalificacionEmpleado && this.isPermisoVerFormCalificacionEmpleado));			
			this.jButtonAbrirOrderByToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenCalificacionEmpleado && this.isPermisoOrdenCalificacionEmpleado));
			this.jButtonNuevoRelacionesToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado && this.isPermisoNuevoCalificacionEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoCalificacionEmpleado && this.isPermisoNuevoCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado));			
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonModificarToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaModificarCalificacionEmpleado && this.isPermisoActualizarCalificacionEmpleado));	
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonActualizarToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarCalificacionEmpleado  && this.isPermisoActualizarCalificacionEmpleado));	
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonEliminarToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarCalificacionEmpleado && this.isPermisoEliminarCalificacionEmpleado));
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonCancelarToolBarCalificacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarCalificacionEmpleado);				
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoCalificacionEmpleado && this.isPermisoNuevoCalificacionEmpleado));			
			this.jMenuItemDuplicarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarCalificacionEmpleado && this.isPermisoDuplicarCalificacionEmpleado));			
			this.jMenuItemCopiarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarCalificacionEmpleado && this.isPermisoCopiarCalificacionEmpleado));			
			this.jMenuItemVerFormCalificacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormCalificacionEmpleado && this.isPermisoVerFormCalificacionEmpleado));			
			this.jMenuItemAbrirOrderByCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenCalificacionEmpleado && this.isPermisoOrdenCalificacionEmpleado));			
			//this.jMenuItemMostrarOcultarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenCalificacionEmpleado && this.isPermisoOrdenCalificacionEmpleado));
			this.jMenuItemDetalleAbrirOrderByCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenCalificacionEmpleado && this.isPermisoOrdenCalificacionEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenCalificacionEmpleado && this.isPermisoOrdenCalificacionEmpleado));			
			this.jMenuItemNuevoRelacionesCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado && this.isPermisoNuevoCalificacionEmpleado));			
			this.jMenuItemNuevoGuardarCambiosCalificacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoCalificacionEmpleado && this.isPermisoNuevoCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado));									
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemModificarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaModificarCalificacionEmpleado && this.isPermisoActualizarCalificacionEmpleado));	
			this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemActualizarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarCalificacionEmpleado && this.isPermisoActualizarCalificacionEmpleado));	
			this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemEliminarCalificacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarCalificacionEmpleado && this.isPermisoEliminarCalificacionEmpleado));
			this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemCancelarCalificacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarCalificacionEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado));						
			this.jMenuItemGuardarCambiosTablaCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=this.jButtonNuevoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarCalificacionEmpleado=this.jButtonDuplicarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarCalificacionEmpleado=this.jButtonCopiarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormCalificacionEmpleado=this.jButtonVerFormCalificacionEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenCalificacionEmpleado=this.jButtonAbrirOrderByCalificacionEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=this.jButtonNuevoRelacionesCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaModificarCalificacionEmpleado=this.jButtonModificarCalificacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonActualizarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonEliminarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonCancelarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosCalificacionEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=this.jButtonGuardarCambiosTablaCalificacionEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=this.jButtonNuevoToolBarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=this.jButtonNuevoRelacionesToolBarCalificacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			this.isVisibilidadCeldaModificarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonModificarToolBarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonActualizarToolBarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonEliminarToolBarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonCancelarToolBarCalificacionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCalificacionEmpleado=this.jButtonGuardarCambiosToolBarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=this.jButtonGuardarCambiosTablaToolBarCalificacionEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=this.jMenuItemNuevoCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=this.jMenuItemNuevoRelacionesCalificacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			this.isVisibilidadCeldaModificarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemModificarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemActualizarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemEliminarCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarCalificacionEmpleado=this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemCancelarCalificacionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCalificacionEmpleado=this.jMenuItemGuardarCambiosCalificacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=this.jMenuItemGuardarCambiosTablaCalificacionEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCalificacionEmpleado(Boolean esInicializar) {
		if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.calificacionempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCalificacionEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualCalificacionEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCalificacionEmpleado() {
		this.jButtonNuevoCalificacionEmpleado.setVisible(this.isPermisoNuevoCalificacionEmpleado);			
		this.jButtonDuplicarCalificacionEmpleado.setVisible(this.isPermisoDuplicarCalificacionEmpleado);			
		this.jButtonCopiarCalificacionEmpleado.setVisible(this.isPermisoCopiarCalificacionEmpleado);			
		this.jButtonVerFormCalificacionEmpleado.setVisible(this.isPermisoVerFormCalificacionEmpleado);			
		
		this.jButtonAbrirOrderByCalificacionEmpleado.setVisible(this.isPermisoOrdenCalificacionEmpleado);					
		
		this.jButtonNuevoRelacionesCalificacionEmpleado.setVisible(this.isPermisoNuevoCalificacionEmpleado);			
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonModificarCalificacionEmpleado.setVisible(this.isPermisoActualizarCalificacionEmpleado);	
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonActualizarCalificacionEmpleado.setVisible(this.isPermisoActualizarCalificacionEmpleado);	
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonEliminarCalificacionEmpleado.setVisible(this.isPermisoEliminarCalificacionEmpleado);
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonCancelarCalificacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarCalificacionEmpleado);						
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosCalificacionEmpleado.setVisible(this.isPermisoGuardarCambiosCalificacionEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaCalificacionEmpleado.setVisible(this.isPermisoActualizarCalificacionEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCalificacionEmpleado() {
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonModificarCalificacionEmpleado.setVisible(this.isPermisoActualizarCalificacionEmpleado);	
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonActualizarCalificacionEmpleado.setVisible(this.isPermisoActualizarCalificacionEmpleado);	
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonEliminarCalificacionEmpleado.setVisible(this.isPermisoEliminarCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonCancelarCalificacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarCalificacionEmpleado);							
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosCalificacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCalificacionEmpleado && this.isPermisoGuardarCambiosCalificacionEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCalificacionEmpleado() {
		if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCalificacionEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCalificacionEmpleado() {
	}
	
	public void jTableDatosCalificacionEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCalificacionEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.calificacionempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCalificacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCalificacionEmpleado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCalificacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.calificacionempleadoLogic.getConnexion());

				if(this.calificacionempleado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.calificacionempleado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)this.jScrollPanelDatosCalificacionEmpleado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCalificacionEmpleado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.calificacionempleado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCalificacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCalificacionEmpleado(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCalificacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.calificacionempleadoLogic.getConnexion());

				if(this.calificacionempleado.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.calificacionempleado.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)this.jScrollPanelDatosCalificacionEmpleado.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCalificacionEmpleado.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.calificacionempleado.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioCalificacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebCalificacionEmpleado(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCalificacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.calificacionempleadoLogic.getConnexion());

				if(this.calificacionempleado.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.calificacionempleado.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)this.jScrollPanelDatosCalificacionEmpleado.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderCalificacionEmpleado.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.calificacionempleado.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoCalificacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebCalificacionEmpleado(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCalificacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.calificacionempleadoLogic.getConnexion());

				if(this.calificacionempleado.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.calificacionempleado.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)this.jScrollPanelDatosCalificacionEmpleado.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderCalificacionEmpleado.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.calificacionempleado.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoCalificacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebCalificacionEmpleado(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCalificacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.calificacionempleadoLogic.getConnexion());

				if(this.calificacionempleado.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.calificacionempleado.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)this.jScrollPanelDatosCalificacionEmpleado.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderCalificacionEmpleado.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.calificacionempleado.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoevaluacionempleado=true;

			idTienePermisoevaluacionempleado=this.tienePermisosUsuarioEnPaginaWebCalificacionEmpleado(EvaluacionEmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoevaluacionempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCalificacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);

				this.evaluacionempleadoBeanSwingJInternalFrame=new EvaluacionEmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.evaluacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.evaluacionempleadoBeanSwingJInternalFrame.getEvaluacionEmpleadoLogic().setConnexion(this.calificacionempleadoLogic.getConnexion());

				if(this.calificacionempleado.getid_evaluacion_empleado()!=null) {
					this.evaluacionempleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.evaluacionempleadoBeanSwingJInternalFrame.setIdActual(this.calificacionempleado.getid_evaluacion_empleado());
					this.evaluacionempleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.evaluacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.evaluacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEvaluacionEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.evaluacionempleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)this.jScrollPanelDatosCalificacionEmpleado.getBorder();
				TitledBorder titledBorderevaluacionempleado=(TitledBorder)this.evaluacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionEmpleado.getBorder();

				titledBorderevaluacionempleado.setTitle(titledBorderCalificacionEmpleado.getTitle() + " -> Evaluacion Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_evaluacion_empleadoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getid_evaluacion_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_evaluacion_empleado = "+this.calificacionempleado.getid_evaluacion_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformatonomifactornomi=true;

			idTienePermisoformatonomifactornomi=this.tienePermisosUsuarioEnPaginaWebCalificacionEmpleado(FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoformatonomifactornomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCalificacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);

				this.formatonomifactornomiBeanSwingJInternalFrame=new FormatoNomiFactorNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatonomifactornomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatonomifactornomiBeanSwingJInternalFrame.getFormatoNomiFactorNomiLogic().setConnexion(this.calificacionempleadoLogic.getConnexion());

				if(this.calificacionempleado.getid_formato_nomi_factor_nomi()!=null) {
					this.formatonomifactornomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatonomifactornomiBeanSwingJInternalFrame.setIdActual(this.calificacionempleado.getid_formato_nomi_factor_nomi());
					this.formatonomifactornomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatonomifactornomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatonomifactornomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiFactorNomi();
				}

				JInternalFrameBase jinternalFrame =this.formatonomifactornomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)this.jScrollPanelDatosCalificacionEmpleado.getBorder();
				TitledBorder titledBorderformatonomifactornomi=(TitledBorder)this.formatonomifactornomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiFactorNomi.getBorder();

				titledBorderformatonomifactornomi.setTitle(titledBorderCalificacionEmpleado.getTitle() + " -> Formato Nomi Factor Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getid_formato_nomi_factor_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato_nomi_factor_nomi = "+this.calificacionempleado.getid_formato_nomi_factor_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformatonomipreguntanomi=true;

			idTienePermisoformatonomipreguntanomi=this.tienePermisosUsuarioEnPaginaWebCalificacionEmpleado(FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoformatonomipreguntanomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCalificacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);

				this.formatonomipreguntanomiBeanSwingJInternalFrame=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatonomipreguntanomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatonomipreguntanomiBeanSwingJInternalFrame.getFormatoNomiPreguntaNomiLogic().setConnexion(this.calificacionempleadoLogic.getConnexion());

				if(this.calificacionempleado.getid_formato_nomi_pregunta_nomi()!=null) {
					this.formatonomipreguntanomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatonomipreguntanomiBeanSwingJInternalFrame.setIdActual(this.calificacionempleado.getid_formato_nomi_pregunta_nomi());
					this.formatonomipreguntanomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatonomipreguntanomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi();
				}

				JInternalFrameBase jinternalFrame =this.formatonomipreguntanomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)this.jScrollPanelDatosCalificacionEmpleado.getBorder();
				TitledBorder titledBorderformatonomipreguntanomi=(TitledBorder)this.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();

				titledBorderformatonomipreguntanomi.setTitle(titledBorderCalificacionEmpleado.getTitle() + " -> Formato Nomi Pregunta Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getid_formato_nomi_pregunta_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato_nomi_pregunta_nomi = "+this.calificacionempleado.getid_formato_nomi_pregunta_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocalificacionempleado=true;

			idTienePermisotipocalificacionempleado=this.tienePermisosUsuarioEnPaginaWebCalificacionEmpleado(TipoCalificacionEmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocalificacionempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCalificacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCalificacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);

				this.tipocalificacionempleadoBeanSwingJInternalFrame=new TipoCalificacionEmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocalificacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocalificacionempleadoBeanSwingJInternalFrame.getTipoCalificacionEmpleadoLogic().setConnexion(this.calificacionempleadoLogic.getConnexion());

				if(this.calificacionempleado.getid_tipo_calificacion_empleado()!=null) {
					this.tipocalificacionempleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocalificacionempleadoBeanSwingJInternalFrame.setIdActual(this.calificacionempleado.getid_tipo_calificacion_empleado());
					this.tipocalificacionempleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocalificacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocalificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCalificacionEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.tipocalificacionempleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)this.jScrollPanelDatosCalificacionEmpleado.getBorder();
				TitledBorder titledBordertipocalificacionempleado=(TitledBorder)this.tipocalificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosTipoCalificacionEmpleado.getBorder();

				titledBordertipocalificacionempleado.setTitle(titledBorderCalificacionEmpleado.getTitle() + " -> Tipo Calificacion Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getid_tipo_calificacion_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_calificacion_empleado = "+this.calificacionempleado.getid_tipo_calificacion_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_conocimientoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getvalor_conocimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_conocimiento = "+this.calificacionempleado.getvalor_conocimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_eficienciaCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getvalor_eficiencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_eficiencia = "+this.calificacionempleado.getvalor_eficiencia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_obtenidoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getvalor_obtenido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_obtenido = "+this.calificacionempleado.getvalor_obtenido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_pesoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getvalor_peso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_peso = "+this.calificacionempleado.getvalor_peso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonverificadoCalificacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.getcalificacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calificacionempleado==null) {
						this.calificacionempleado = new CalificacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);
				}

				if(this.calificacionempleado.getverificado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where verificado = "+this.calificacionempleado.getverificado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalificacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEjercicioCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);

			this.getCalificacionEmpleadosFK_IdEjercicio();

			this.inicializarActualizarBindingCalificacionEmpleado(false);

			//if(CalificacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);

			this.getCalificacionEmpleadosFK_IdEmpleado();

			this.inicializarActualizarBindingCalificacionEmpleado(false);

			//if(CalificacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);

			this.getCalificacionEmpleadosFK_IdEmpresa();

			this.inicializarActualizarBindingCalificacionEmpleado(false);

			//if(CalificacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEvaluacionEmpleadoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);

			this.getCalificacionEmpleadosFK_IdEvaluacionEmpleado();

			this.inicializarActualizarBindingCalificacionEmpleado(false);

			//if(CalificacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoNomiFactorNomiCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);

			this.getCalificacionEmpleadosFK_IdFormatoNomiFactorNomi();

			this.inicializarActualizarBindingCalificacionEmpleado(false);

			//if(CalificacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoNomiPreguntaNomiCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);

			this.getCalificacionEmpleadosFK_IdFormatoNomiPreguntaNomi();

			this.inicializarActualizarBindingCalificacionEmpleado(false);

			//if(CalificacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);

			this.getCalificacionEmpleadosFK_IdPeriodo();

			this.inicializarActualizarBindingCalificacionEmpleado(false);

			//if(CalificacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);

			this.getCalificacionEmpleadosFK_IdSucursal();

			this.inicializarActualizarBindingCalificacionEmpleado(false);

			//if(CalificacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCalificacionEmpleadoCalificacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);

			this.getCalificacionEmpleadosFK_IdTipoCalificacionEmpleado();

			this.inicializarActualizarBindingCalificacionEmpleado(false);

			//if(CalificacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calificacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCalificacionEmpleado() {
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormCalificacionEmpleado.dispose();
			this.jInternalFrameDetalleFormCalificacionEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCalificacionEmpleado!=null) {
			this.jInternalFrameReporteDinamicoCalificacionEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCalificacionEmpleado.dispose();
			this.jInternalFrameReporteDinamicoCalificacionEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionCalificacionEmpleado!=null) {
			this.jInternalFrameImportacionCalificacionEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionCalificacionEmpleado.dispose();
			this.jInternalFrameImportacionCalificacionEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCalificacionEmpleado();
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCalificacionEmpleado")) {
				jButtonNuevoCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCalificacionEmpleado")) {
				jButtonDuplicarCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCalificacionEmpleado")) {
				jButtonCopiarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCalificacionEmpleado")) {
				jButtonVerFormCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCalificacionEmpleado")) {
				jButtonNuevoCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCalificacionEmpleado")) {
				jButtonDuplicarCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCalificacionEmpleado")) {
				jButtonNuevoCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCalificacionEmpleado")) {
				jButtonDuplicarCalificacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCalificacionEmpleado")) {
				jButtonNuevoCalificacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCalificacionEmpleado")) {
				jButtonNuevoCalificacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCalificacionEmpleado")) {
				jButtonNuevoCalificacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCalificacionEmpleado")) {
				jButtonModificarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCalificacionEmpleado")) {
				jButtonModificarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCalificacionEmpleado")) {
				jButtonModificarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCalificacionEmpleado")) {
				jButtonActualizarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCalificacionEmpleado")) {
				jButtonActualizarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCalificacionEmpleado")) {
				jButtonActualizarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCalificacionEmpleado")) {
				jButtonEliminarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCalificacionEmpleado")) {
				jButtonEliminarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCalificacionEmpleado")) {
				jButtonEliminarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCalificacionEmpleado")) {
				jButtonCancelarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCalificacionEmpleado")) {
				jButtonCancelarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCalificacionEmpleado")) {
				jButtonCancelarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCalificacionEmpleado")) {
				jButtonCerrarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCalificacionEmpleado")) {
				jButtonCerrarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCalificacionEmpleado")) {
				jButtonCerrarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCalificacionEmpleado")) {
				jButtonMostrarOcultarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCalificacionEmpleado")) {
				jButtonCancelarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCalificacionEmpleado")) {
				jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCalificacionEmpleado")) {
				jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCalificacionEmpleado")) {
				jButtonCopiarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCalificacionEmpleado")) {
				jButtonVerFormCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCalificacionEmpleado")) {
				jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCalificacionEmpleado")) {
				jButtonCopiarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCalificacionEmpleado")) {
				jButtonVerFormCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCalificacionEmpleado")) {
				jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCalificacionEmpleado")) {
				jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCalificacionEmpleado")) {
				jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCalificacionEmpleado")) {
				jButtonRecargarInformacionCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCalificacionEmpleado")) {
				jButtonRecargarInformacionCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCalificacionEmpleado")) {
				jButtonRecargarInformacionCalificacionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCalificacionEmpleado")) {
				jButtonAnterioresCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCalificacionEmpleado")) {
				jButtonAnterioresCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCalificacionEmpleado")) {
				jButtonAnterioresCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCalificacionEmpleado")) {
				jButtonSiguientesCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCalificacionEmpleado")) {
				jButtonSiguientesCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCalificacionEmpleado")) {
				jButtonSiguientesCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCalificacionEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByCalificacionEmpleado")) {
				jButtonAbrirOrderByCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCalificacionEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarCalificacionEmpleado")) {
				jButtonMostrarOcultarCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCalificacionEmpleado")) {
				jButtonNuevoGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCalificacionEmpleado")) {
				jButtonNuevoGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCalificacionEmpleado")) {
				jButtonNuevoGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCalificacionEmpleado")) {
				jButtonCerrarReporteDinamicoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCalificacionEmpleado")) {
				jButtonGenerarReporteDinamicoCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCalificacionEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCalificacionEmpleado")) {
				jButtonCerrarImportacionCalificacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCalificacionEmpleado")) {
				
				jButtonGenerarImportacionCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCalificacionEmpleado")) {
				
				jButtonAbrirImportacionCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCalificacionEmpleado")) {
				jComboBoxTiposAccionesCalificacionEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCalificacionEmpleado")) {
				jComboBoxTiposRelacionesCalificacionEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCalificacionEmpleado")) {
				jComboBoxTiposAccionesCalificacionEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCalificacionEmpleado")) {
				
				jComboBoxTiposSeleccionarCalificacionEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCalificacionEmpleado")) {
				jTextFieldValorCampoGeneralCalificacionEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCalificacionEmpleado")) {
				jButtonAbrirOrderByCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCalificacionEmpleado")) {
				jButtonAbrirOrderByCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCalificacionEmpleado")) {
				jButtonCerrarOrderByCalificacionEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCalificacionEmpleadoBusqueda")) {
				this.jButtonidCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCalificacionEmpleadoUpdate")) {
				this.jButtonid_empresaCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCalificacionEmpleadoBusqueda")) {
				this.jButtonid_empresaCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCalificacionEmpleadoUpdate")) {
				this.jButtonid_sucursalCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCalificacionEmpleadoBusqueda")) {
				this.jButtonid_sucursalCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCalificacionEmpleadoUpdate")) {
				this.jButtonid_ejercicioCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCalificacionEmpleadoBusqueda")) {
				this.jButtonid_ejercicioCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoCalificacionEmpleadoUpdate")) {
				this.jButtonid_periodoCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoCalificacionEmpleadoBusqueda")) {
				this.jButtonid_periodoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCalificacionEmpleadoUpdate")) {
				this.jButtonid_empleadoCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCalificacionEmpleadoBusqueda")) {
				this.jButtonid_empleadoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_evaluacion_empleadoCalificacionEmpleadoUpdate")) {
				this.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_evaluacion_empleadoCalificacionEmpleadoBusqueda")) {
				this.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomi_factor_nomiCalificacionEmpleadoUpdate")) {
				this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda")) {
				this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate")) {
				this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda")) {
				this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoCalificacionEmpleadoUpdate")) {
				this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda")) {
				this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_conocimientoCalificacionEmpleadoBusqueda")) {
				this.jButtonvalor_conocimientoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_eficienciaCalificacionEmpleadoBusqueda")) {
				this.jButtonvalor_eficienciaCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_obtenidoCalificacionEmpleadoBusqueda")) {
				this.jButtonvalor_obtenidoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pesoCalificacionEmpleadoBusqueda")) {
				this.jButtonvalor_pesoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("verificadoCalificacionEmpleadoBusqueda")) {
				this.jButtonverificadoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoCalificacionEmpleado")) {
				this.jButtonFK_IdEmpleadoCalificacionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEvaluacionEmpleadoCalificacionEmpleado")) {
				this.jButtonFK_IdEvaluacionEmpleadoCalificacionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFormatoNomiFactorNomiCalificacionEmpleado")) {
				this.jButtonFK_IdFormatoNomiFactorNomiCalificacionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFormatoNomiPreguntaNomiCalificacionEmpleado")) {
				this.jButtonFK_IdFormatoNomiPreguntaNomiCalificacionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoCalificacionEmpleadoCalificacionEmpleado")) {
				this.jButtonFK_IdTipoCalificacionEmpleadoCalificacionEmpleadoActionPerformed(evt);
			}
			
			;
			
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCalificacionEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalificacionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				


				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CalificacionEmpleado calificacionempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				calificacionempleadoLocal=this.calificacionempleado;
			} else {
				calificacionempleadoLocal=this.calificacionempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
							
				
				


				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalificacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
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
			
			


			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalificacionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
								
						
				


				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalificacionEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
								
				
				


				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalificacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalificacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalificacionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
							
				
				


				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalificacionEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalificacionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
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
			
			


			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalificacionEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
								
				
				


				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalificacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalificacionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalificacionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCalificacionEmpleado")) {
					jCheckBoxSeleccionarTodosCalificacionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCalificacionEmpleado")) {
					jCheckBoxSeleccionadosCalificacionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCalificacionEmpleado")) {
					
				}
				
				


				
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
												
				
				


				
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalificacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalificacionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalificacionEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
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
			
			


			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalificacionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalificacionEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalificacionEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calificacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calificacionempleado);
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
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
				
				


				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalificacionEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalificacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalificacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calificacionempleadoAnterior =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCalificacionEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCalificacionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCalificacionEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.calificacionempleado =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.calificacionempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCalificacionEmpleado")) {
				
				}
				
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCalificacionEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCalificacionEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCalificacionEmpleado")) {
			
			}
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCalificacionEmpleado();
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoCalificacionEmpleado")) {
				jButtonNuevoCalificacionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCalificacionEmpleado")) {
				jButtonDuplicarCalificacionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCalificacionEmpleado")) {
				jButtonCopiarCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCalificacionEmpleado")) {
				jButtonVerFormCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCalificacionEmpleado")) {
				jButtonNuevoCalificacionEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCalificacionEmpleado")) {
				jButtonModificarCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCalificacionEmpleado")) {
				jButtonActualizarCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCalificacionEmpleado")) {
				jButtonEliminarCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCalificacionEmpleado")) {
				jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCalificacionEmpleado")) {
				jButtonCancelarCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCalificacionEmpleado")) {
				jButtonCerrarCalificacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCalificacionEmpleado")) {
				jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCalificacionEmpleado")) {
				jButtonNuevoGuardarCambiosCalificacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCalificacionEmpleado")) {
				jButtonAbrirOrderByCalificacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCalificacionEmpleado")) {
				jButtonRecargarInformacionCalificacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCalificacionEmpleado")) {
				jButtonAnterioresCalificacionEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCalificacionEmpleado")) {
				jButtonSiguientesCalificacionEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCalificacionEmpleadoBusqueda")) {
				this.jButtonidCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCalificacionEmpleadoUpdate")) {
				this.jButtonid_empresaCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCalificacionEmpleadoBusqueda")) {
				this.jButtonid_empresaCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCalificacionEmpleadoUpdate")) {
				this.jButtonid_sucursalCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCalificacionEmpleadoBusqueda")) {
				this.jButtonid_sucursalCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCalificacionEmpleadoUpdate")) {
				this.jButtonid_ejercicioCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCalificacionEmpleadoBusqueda")) {
				this.jButtonid_ejercicioCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoCalificacionEmpleadoUpdate")) {
				this.jButtonid_periodoCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoCalificacionEmpleadoBusqueda")) {
				this.jButtonid_periodoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCalificacionEmpleadoUpdate")) {
				this.jButtonid_empleadoCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCalificacionEmpleadoBusqueda")) {
				this.jButtonid_empleadoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_evaluacion_empleadoCalificacionEmpleadoUpdate")) {
				this.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_evaluacion_empleadoCalificacionEmpleadoBusqueda")) {
				this.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomi_factor_nomiCalificacionEmpleadoUpdate")) {
				this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda")) {
				this.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate")) {
				this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda")) {
				this.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoCalificacionEmpleadoUpdate")) {
				this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda")) {
				this.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_conocimientoCalificacionEmpleadoBusqueda")) {
				this.jButtonvalor_conocimientoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_eficienciaCalificacionEmpleadoBusqueda")) {
				this.jButtonvalor_eficienciaCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_obtenidoCalificacionEmpleadoBusqueda")) {
				this.jButtonvalor_obtenidoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pesoCalificacionEmpleadoBusqueda")) {
				this.jButtonvalor_pesoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("verificadoCalificacionEmpleadoBusqueda")) {
				this.jButtonverificadoCalificacionEmpleadoBusquedaActionPerformed(evt);
			}
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCalificacionEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCalificacionEmpleado")) {
				closingInternalFrameCalificacionEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarCalificacionEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormCalificacionEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            CalificacionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(CalificacionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormCalificacionEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCalificacionEmpleadoActionPerformed(null);
			}
			
			CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.calificacionempleado,new Object(),this.calificacionempleadoParameterGeneral,this.calificacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCalificacionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCalificacionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCalificacionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.calificacionempleado)) {
			if(!esControlTabla) {
				if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);			
				}
				
				if(this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCalificacionEmpleado(this.calificacionempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.calificacionempleadoReturnGeneral=calificacionempleadoLogic.procesarEventosCalificacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.calificacionempleadoLogic.getCalificacionEmpleados(),this.calificacionempleado,this.calificacionempleadoParameterGeneral,this.isEsNuevoCalificacionEmpleado,classes);//this.calificacionempleadoLogic.getCalificacionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCalificacionEmpleado(this.calificacionempleadoReturnGeneral,this.calificacionempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCalificacionEmpleado(classes,this.calificacionempleadoReturnGeneral,this.calificacionempleadoBean,false);
					}
						
					if(this.calificacionempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCalificacionEmpleado(this.calificacionempleadoReturnGeneral.getCalificacionEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCalificacionEmpleado(this.calificacionempleadoReturnGeneral.getCalificacionEmpleado());	
					}
						
					if(this.calificacionempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCalificacionEmpleado(this.calificacionempleadoReturnGeneral.getCalificacionEmpleado(),classes);//this.calificacionempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCalificacionEmpleado(this.calificacionempleado,classes);//this.calificacionempleadoBean);									
				}
			
				if(CalificacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCalificacionEmpleado(this.calificacionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCalificacionEmpleado(this.calificacionempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.calificacionempleadoAnterior!=null) {
						this.calificacionempleado=this.calificacionempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.calificacionempleadoReturnGeneral=calificacionempleadoLogic.procesarEventosCalificacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.calificacionempleadoLogic.getCalificacionEmpleados(),this.calificacionempleado,this.calificacionempleadoParameterGeneral,this.isEsNuevoCalificacionEmpleado,classes);//this.calificacionempleadoLogic.getCalificacionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.calificacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.calificacionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.calificacionempleadoReturnGeneral.getCalificacionEmpleado(),calificacionempleadoLogic.getCalificacionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.calificacionempleadoReturnGeneral.getCalificacionEmpleado(),this.calificacionempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCalificacionEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosCalificacionEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCalificacionEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosCalificacionEmpleado() throws Exception {
		
		CalificacionEmpleadoModel calificacionempleadoModel=(CalificacionEmpleadoModel)this.jTableDatosCalificacionEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			calificacionempleadoModel.calificacionempleados=this.calificacionempleadoLogic.getCalificacionEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			calificacionempleadoModel.calificacionempleados=this.calificacionempleados;
		}
		
		
		((CalificacionEmpleadoModel) this.jTableDatosCalificacionEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCalificacionEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcalificacionempleadoAnterior(),this.calificacionempleadoLogic.getCalificacionEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcalificacionempleadoAnterior(),this.calificacionempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCalificacionEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCalificacionEmpleado(CalificacionEmpleado calificacionempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
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
										
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.calificacionempleado,new Object(),generalEntityParameterGeneral,this.calificacionempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.calificacionempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CalificacionEmpleadoConstantesFunciones.getClassesRelationshipsOfCalificacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CalificacionEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfCalificacionEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCalificacionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CalificacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.calificacionempleado,new Object(),generalEntityParameterGeneral,this.calificacionempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCalificacionEmpleado(CalificacionEmpleadoBean calificacionempleadoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCalificacionEmpleado(ArrayList<Classe> classes,CalificacionEmpleadoReturnGeneral calificacionempleadoReturnGeneral,CalificacionEmpleadoBean calificacionempleadoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCalificacionEmpleado(CalificacionEmpleado calificacionempleado,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.calificacionempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCalificacionEmpleado = new CalificacionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.calificacionempleadoSessionBean.getConGuardarRelaciones(),this.calificacionempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormCalificacionEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.calificacionempleadoLogic=this.calificacionempleadoLogic;
		
		this.cargarCombosFrameForeignKeyCalificacionEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCalificacionEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCalificacionEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCalificacionEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCalificacionEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCalificacionEmpleado"));
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonModificarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarCalificacionEmpleado"));

		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonModificarToolBarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarCalificacionEmpleado"));
					
		this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemModificarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarCalificacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonActualizarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarCalificacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonActualizarToolBarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCalificacionEmpleado"));
						
		this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemActualizarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCalificacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonEliminarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarCalificacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonEliminarToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarCalificacionEmpleado"));
								
		this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemEliminarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCalificacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonCancelarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarCalificacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonCancelarToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarCalificacionEmpleado"));
					
		this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemCancelarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCalificacionEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemDetalleCerrarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCalificacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCalificacionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCalificacionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCalificacionEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonidCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empresaCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empresaCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_sucursalCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_sucursalCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_ejercicioCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_ejercicioCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_periodoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_periodoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empleadoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empleadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_evaluacion_empleadoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_evaluacion_empleadoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_factor_nomiCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_pesoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_pesoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonverificadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"verificadoCalificacionEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCalificacionEmpleado.jTabbedPaneRelacionesCalificacionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCalificacionEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCalificacionEmpleado"));
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCalificacionEmpleado"));
		}
		
		this.jTableDatosCalificacionEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCalificacionEmpleado"));
		
		this.jTableDatosCalificacionEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCalificacionEmpleado"));
		
		this.jButtonNuevoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoCalificacionEmpleado"));
		
		this.jButtonDuplicarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarCalificacionEmpleado"));
		
		this.jButtonCopiarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"CopiarCalificacionEmpleado"));
		
		this.jButtonVerFormCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"VerFormCalificacionEmpleado"));
		
		
		this.jButtonNuevoToolBarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarCalificacionEmpleado"));
			
		this.jButtonDuplicarToolBarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCalificacionEmpleado"));
			
		this.jMenuItemNuevoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCalificacionEmpleado"));
			
		this.jMenuItemDuplicarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCalificacionEmpleado"));		
		
		
		this.jButtonNuevoRelacionesCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCalificacionEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCalificacionEmpleado"));
			
		this.jMenuItemNuevoRelacionesCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCalificacionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonModificarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarCalificacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonModificarToolBarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarCalificacionEmpleado"));
			
			this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemModificarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarCalificacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonActualizarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarCalificacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonActualizarToolBarCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCalificacionEmpleado"));
				
			this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemActualizarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCalificacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonEliminarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarCalificacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonEliminarToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarCalificacionEmpleado"));
						
			this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemEliminarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCalificacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonCancelarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarCalificacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonCancelarToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarCalificacionEmpleado"));
			
			this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemCancelarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCalificacionEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCalificacionEmpleado"));		
		
		
		this.jButtonCerrarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarCalificacionEmpleado"));
		
		
		this.jButtonCerrarToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarCalificacionEmpleado"));
			
		this.jMenuItemCerrarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCalificacionEmpleado"));
			
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jMenuItemDetalleCerrarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCalificacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosCalificacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCalificacionEmpleado"));
		}
		
		this.jButtonCopiarToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarCalificacionEmpleado"));
			
		this.jButtonVerFormToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarCalificacionEmpleado"));
		
		this.jMenuItemGuardarCambiosCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCalificacionEmpleado"));
			
		this.jMenuItemCopiarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCalificacionEmpleado"));		
		
		this.jMenuItemVerFormCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCalificacionEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCalificacionEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCalificacionEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCalificacionEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionCalificacionEmpleado"));
					
		this.jButtonRecargarInformacionToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCalificacionEmpleado"));
		
		this.jMenuItemRecargarInformacionCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCalificacionEmpleado"));		
		
		
		
		this.jButtonAnterioresCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresCalificacionEmpleado"));
		
		
		this.jButtonAnterioresToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCalificacionEmpleado"));
		
		this.jMenuItemAnterioresCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCalificacionEmpleado"));		
		
		
		this.jButtonSiguientesCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesCalificacionEmpleado"));
		
		
		this.jButtonSiguientesToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCalificacionEmpleado"));
			
		this.jMenuItemSiguientesCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCalificacionEmpleado"));
			
		this.jMenuItemAbrirOrderByCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCalificacionEmpleado"));
			
		this.jMenuItemMostrarOcultarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCalificacionEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCalificacionEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCalificacionEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCalificacionEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCalificacionEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCalificacionEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCalificacionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCalificacionEmpleado"));

		this.jCheckBoxSeleccionadosCalificacionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCalificacionEmpleado"));
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCalificacionEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesCalificacionEmpleado"));
			
		this.jComboBoxTiposAccionesCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesCalificacionEmpleado"));
					
		this.jComboBoxTiposSeleccionarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCalificacionEmpleado"));
			
		this.jTextFieldValorCampoGeneralCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCalificacionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonidCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empresaCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empresaCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_sucursalCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_sucursalCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_ejercicioCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_ejercicioCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_periodoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_periodoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empleadoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empleadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_evaluacion_empleadoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_evaluacion_empleadoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_factor_nomiCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_pesoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_pesoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonverificadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"verificadoCalificacionEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoCalificacionEmpleado"));

			this.jButtonFK_IdEvaluacionEmpleadoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEvaluacionEmpleadoCalificacionEmpleado"));

			this.jButtonFK_IdFormatoNomiFactorNomiCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiFactorNomiCalificacionEmpleado"));

			this.jButtonFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiPreguntaNomiCalificacionEmpleado"));

			this.jButtonFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdTipoCalificacionEmpleadoCalificacionEmpleado"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCalificacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCalificacionEmpleado"));
				this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCalificacionEmpleado"));
				this.jInternalFrameReporteDinamicoCalificacionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCalificacionEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCalificacionEmpleado"));				
			//this.jButtonGenerarReporteDinamicoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCalificacionEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCalificacionEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCalificacionEmpleado!=null) {
				this.jInternalFrameImportacionCalificacionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCalificacionEmpleado"));
				this.jInternalFrameImportacionCalificacionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCalificacionEmpleado"));
				this.jInternalFrameImportacionCalificacionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCalificacionEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByCalificacionEmpleado"));
			
			this.jButtonAbrirOrderByToolBarCalificacionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCalificacionEmpleado"));			
			
			if(this.jInternalFrameOrderByCalificacionEmpleado!=null) {
				this.jInternalFrameOrderByCalificacionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCalificacionEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalificacionEmpleado.jTabbedPaneRelacionesCalificacionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCalificacionEmpleado"));
		
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
            		closingInternalFrameCalificacionEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCalificacionEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            CalificacionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(CalificacionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormCalificacionEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCalificacionEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCalificacionEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCalificacionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCalificacionEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCalificacionEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalificacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalificacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalificacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCalificacionEmpleado";
		inputMap = this.jButtonNuevoCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCalificacionEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalificacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalificacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalificacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCalificacionEmpleado";
		inputMap = this.jButtonNuevoRelacionesCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCalificacionEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCalificacionEmpleado";
		inputMap = this.jButtonModificarCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCalificacionEmpleado";
		inputMap = this.jButtonActualizarCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCalificacionEmpleado";
		inputMap = this.jButtonEliminarCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCalificacionEmpleado";
		inputMap = this.jButtonCancelarCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCalificacionEmpleado";
		inputMap = this.jButtonCerrarCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCalificacionEmpleado";
		inputMap = this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosCalificacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonGuardarCambiosCalificacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCalificacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCalificacionEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCalificacionEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCalificacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCalificacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCalificacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCalificacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCalificacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCalificacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonidCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empresaCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empresaCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_sucursalCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_sucursalCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_ejercicioCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_ejercicioCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_periodoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_periodoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empleadoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_empleadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_evaluacion_empleadoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_evaluacion_empleadoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_evaluacion_empleadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_evaluacion_empleadoCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_factor_nomiCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_factor_nomiCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomi_pregunta_nomiCalificacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoCalificacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonid_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_calificacion_empleadoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_conocimientoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_conocimientoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_eficienciaCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_eficienciaCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_obtenidoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_obtenidoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonvalor_pesoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_pesoCalificacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalificacionEmpleado.jButtonverificadoCalificacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"verificadoCalificacionEmpleadoBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoCalificacionEmpleado"));

		this.jButtonFK_IdEvaluacionEmpleadoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEvaluacionEmpleadoCalificacionEmpleado"));

		this.jButtonFK_IdFormatoNomiFactorNomiCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiFactorNomiCalificacionEmpleado"));

		this.jButtonFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiPreguntaNomiCalificacionEmpleado"));

		this.jButtonFK_IdTipoCalificacionEmpleadoCalificacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdTipoCalificacionEmpleadoCalificacionEmpleado"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCalificacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCalificacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCalificacionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCalificacionEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCalificacionEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleadoLogic.getCalificacionEmpleados()) {
					calificacionempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CalificacionEmpleado calificacionempleadoAux:calificacionempleados) {
					calificacionempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCalificacionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleadoLogic.getCalificacionEmpleados()) {
						calificacionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CalificacionEmpleado calificacionempleadoAux:calificacionempleados) {
						calificacionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleadoLogic.getCalificacionEmpleados()) {
					
						if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO)) {
							existe=true;
							calificacionempleadoAux.setverificado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CalificacionEmpleado calificacionempleadoAux:calificacionempleados) {
						
						if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO)) {
							existe=true;
							calificacionempleadoAux.setverificado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCalificacionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCalificacionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCalificacionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCalificacionEmpleado.getSelectedRows();
			
			CalificacionEmpleado calificacionempleadoLocal=new CalificacionEmpleado();
			
			//this.seleccionarTodosCalificacionEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calificacionempleadoLocal =(CalificacionEmpleado) this.calificacionempleadoLogic.getCalificacionEmpleados().toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					calificacionempleadoLocal =(CalificacionEmpleado) this.calificacionempleados.toArray()[this.jTableDatosCalificacionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				calificacionempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleadoLogic.getCalificacionEmpleados()) {
						calificacionempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CalificacionEmpleado calificacionempleadoAux:calificacionempleados) {
						calificacionempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCalificacionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCalificacionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCalificacionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCalificacionEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCalificacionEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCalificacionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCalificacionEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleadoLogic.getCalificacionEmpleados()) {
				
						if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO)) {
							existe=true;
							calificacionempleadoAux.setvalor_conocimiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA)) {
							existe=true;
							calificacionempleadoAux.setvalor_eficiencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO)) {
							existe=true;
							calificacionempleadoAux.setvalor_obtenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO)) {
							existe=true;
							calificacionempleadoAux.setvalor_peso(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CalificacionEmpleado calificacionempleadoAux:calificacionempleados) {
					
						if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO)) {
							existe=true;
							calificacionempleadoAux.setvalor_conocimiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA)) {
							existe=true;
							calificacionempleadoAux.setvalor_eficiencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO)) {
							existe=true;
							calificacionempleadoAux.setvalor_obtenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO)) {
							existe=true;
							calificacionempleadoAux.setvalor_peso(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCalificacionEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCalificacionEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCalificacionEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCalificacionEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessCalificacionEmpleado(conSplash);
				
					this.generarReporteCalificacionEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCalificacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCalificacionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesCalificacionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCalificacionEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesCalificacionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCalificacionEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesCalificacionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCalificacionEmpleado();
				
				this.exportarCalificacionEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCalificacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCalificacionEmpleados();
				//this.importarCalificacionEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCalificacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCalificacionEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCalificacionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesCalificacionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Calificacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCalificacionEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCalificacionEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCalificacionEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCalificacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else if(CalificacionEmpleadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCalificacionEmpleado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCalificacionEmpleado(conSplash);
					
						//this.actualizarParametrosGeneralCalificacionEmpleado();
						
						this.generarReporteProcesoAccionCalificacionEmpleadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCalificacionEmpleado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CalificacionEmpleadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Calificacion EmpleadoS SELECCIONADOS?", "MANTENIMIENTO DE Calificacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCalificacionEmpleado();
				
						this.actualizarParametrosGeneralCalificacionEmpleado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.calificacionempleadoReturnGeneral=calificacionempleadoLogic.procesarAccionCalificacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.calificacionempleadoLogic.getCalificacionEmpleados(),this.calificacionempleadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCalificacionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCalificacionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCalificacionEmpleado();
					
					CalificacionEmpleadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCalificacionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCalificacionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxTiposAccionesFormularioCalificacionEmpleado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCalificacionEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCalificacionEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCalificacionEmpleado();
			
			if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();		
			CalificacionEmpleado calificacionempleado=new CalificacionEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCalificacionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCalificacionEmpleado.getSelectedItem();
			
			
			
			
			calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(calificacionempleadosSeleccionados.size()==1) {
				for(CalificacionEmpleado calificacionempleadoAux:calificacionempleadosSeleccionados) {
					calificacionempleado=calificacionempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCalificacionEmpleado();
			
      		//this.finishProcessCalificacionEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCalificacionEmpleadoReturnGeneral() throws Exception {
		if(this.calificacionempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.calificacionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.calificacionempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.calificacionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.calificacionempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.calificacionempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCalificacionEmpleado(false);
		}
		
		if(this.calificacionempleadoReturnGeneral.getConRetornoLista() || this.calificacionempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.calificacionempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.calificacionempleadoLogic.setCalificacionEmpleados(this.calificacionempleadoReturnGeneral.getCalificacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.calificacionempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.calificacionempleadoLogic.setCalificacionEmpleado(this.calificacionempleadoReturnGeneral.getCalificacionEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCalificacionEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralCalificacionEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<CalificacionEmpleado> getCalificacionEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCalificacionEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CalificacionEmpleado calificacionempleadoAux:calificacionempleadoLogic.getCalificacionEmpleados()) {
					if(calificacionempleadoAux.getIsSelected()) {
						calificacionempleadosSeleccionados.add(calificacionempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CalificacionEmpleado calificacionempleadoAux:this.calificacionempleados) {
					if(calificacionempleadoAux.getIsSelected()) {
						calificacionempleadosSeleccionados.add(calificacionempleadoAux);				
					}
				}
			}
			
			if(calificacionempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						calificacionempleadosSeleccionados.addAll(this.calificacionempleadoLogic.getCalificacionEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						calificacionempleadosSeleccionados.addAll(this.calificacionempleados);				
					}
				}
			}
		} else {
			calificacionempleadosSeleccionados.add(this.calificacionempleado);
		}
		
		return calificacionempleadosSeleccionados;
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
	
	public void generarReporteCalificacionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCalificacionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCalificacionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCalificacionEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCalificacionEmpleadosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Calificacion Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();		
		
		calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCalificacionEmpleados("Todos",calificacionempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();		
		
		calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCalificacionEmpleados("Todos",calificacionempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCalificacionEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();
		
		calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCalificacionEmpleados("Todos",calificacionempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCalificacionEmpleado();
		
		
		calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCalificacionEmpleado();
		
		
		//this.generarReporteCalificacionEmpleados("Todos",calificacionempleadosSeleccionados ,calificacionempleadoImplementable,calificacionempleadoImplementableHome);
	}
	
	public void mostrarImportacionCalificacionEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCalificacionEmpleado();
		
		this.abrirFrameImportacionCalificacionEmpleado();		
		
			
		//this.generarReporteCalificacionEmpleados("Todos",calificacionempleadosSeleccionados ,calificacionempleadoImplementable,calificacionempleadoImplementableHome);
	}
	
	public void importarCalificacionEmpleados() throws Exception {		
	
	}
	
	public void exportarCalificacionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCalificacionEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCalificacionEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCalificacionEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Calificacion Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();		
		
		calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calificacionempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCalificacionEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CalificacionEmpleado calificacionempleadoAux:calificacionempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCalificacionEmpleado(calificacionempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//calificacionempleadoAux.setsDetalleGeneralEntityReporte(calificacionempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCalificacionEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCalificacionEmpleado(CalificacionEmpleado calificacionempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=calificacionempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getevaluacionempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getformatonomifactornomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getformatonomipreguntanomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.gettipocalificacionempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getvalor_conocimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getvalor_eficiencia().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getvalor_obtenido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getvalor_peso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calificacionempleado.getverificado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();		
		
		calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calificacionempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CalificacionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCalificacionEmpleado(row);				
				iRow++;
			}				
			
			for(CalificacionEmpleado calificacionempleadoAux:calificacionempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCalificacionEmpleado(calificacionempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCalificacionEmpleadosSeleccionados() throws Exception {
		ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();		
		
		calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calificacionempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("calificacionempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("calificacionempleado");
			//elementRoot.appendChild(element);
		
			for(CalificacionEmpleado calificacionempleadoAux:calificacionempleadosSeleccionados) {
				element = document.createElement("calificacionempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCalificacionEmpleado(calificacionempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calificacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCalificacionEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALORCONOCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALOREFICIENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALOROBTENIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VALORPESO);
		cell = row.createCell(iColumn++);cell.setCellValue(CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCalificacionEmpleado(CalificacionEmpleado calificacionempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getevaluacionempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getformatonomifactornomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getformatonomipreguntanomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.gettipocalificacionempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getvalor_conocimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getvalor_eficiencia());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getvalor_obtenido());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getvalor_peso());
		cell = row.createCell(iColumn++);cell.setCellValue(calificacionempleado.getverificado());				
	}
	
	public void setFilaDatosExportarXmlCalificacionEmpleado(CalificacionEmpleado calificacionempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CalificacionEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(calificacionempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CalificacionEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(calificacionempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CalificacionEmpleadoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(calificacionempleado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CalificacionEmpleadoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(calificacionempleado.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(CalificacionEmpleadoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(calificacionempleado.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(CalificacionEmpleadoConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(calificacionempleado.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementempleado_descripcion = document.createElement(CalificacionEmpleadoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(calificacionempleado.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementevaluacionempleado_descripcion = document.createElement(CalificacionEmpleadoConstantesFunciones.IDEVALUACIONEMPLEADO);
		elementevaluacionempleado_descripcion.appendChild(document.createTextNode(calificacionempleado.getevaluacionempleado_descripcion()));
		element.appendChild(elementevaluacionempleado_descripcion);

		Element elementformatonomifactornomi_descripcion = document.createElement(CalificacionEmpleadoConstantesFunciones.IDFORMATONOMIFACTORNOMI);
		elementformatonomifactornomi_descripcion.appendChild(document.createTextNode(calificacionempleado.getformatonomifactornomi_descripcion()));
		element.appendChild(elementformatonomifactornomi_descripcion);

		Element elementformatonomipreguntanomi_descripcion = document.createElement(CalificacionEmpleadoConstantesFunciones.IDFORMATONOMIPREGUNTANOMI);
		elementformatonomipreguntanomi_descripcion.appendChild(document.createTextNode(calificacionempleado.getformatonomipreguntanomi_descripcion()));
		element.appendChild(elementformatonomipreguntanomi_descripcion);

		Element elementtipocalificacionempleado_descripcion = document.createElement(CalificacionEmpleadoConstantesFunciones.IDTIPOCALIFICACIONEMPLEADO);
		elementtipocalificacionempleado_descripcion.appendChild(document.createTextNode(calificacionempleado.gettipocalificacionempleado_descripcion()));
		element.appendChild(elementtipocalificacionempleado_descripcion);

		Element elementvalor_conocimiento = document.createElement(CalificacionEmpleadoConstantesFunciones.VALORCONOCIMIENTO);
		elementvalor_conocimiento.appendChild(document.createTextNode(calificacionempleado.getvalor_conocimiento().toString().trim()));
		element.appendChild(elementvalor_conocimiento);

		Element elementvalor_eficiencia = document.createElement(CalificacionEmpleadoConstantesFunciones.VALOREFICIENCIA);
		elementvalor_eficiencia.appendChild(document.createTextNode(calificacionempleado.getvalor_eficiencia().toString().trim()));
		element.appendChild(elementvalor_eficiencia);

		Element elementvalor_obtenido = document.createElement(CalificacionEmpleadoConstantesFunciones.VALOROBTENIDO);
		elementvalor_obtenido.appendChild(document.createTextNode(calificacionempleado.getvalor_obtenido().toString().trim()));
		element.appendChild(elementvalor_obtenido);

		Element elementvalor_peso = document.createElement(CalificacionEmpleadoConstantesFunciones.VALORPESO);
		elementvalor_peso.appendChild(document.createTextNode(calificacionempleado.getvalor_peso().toString().trim()));
		element.appendChild(elementvalor_peso);

		Element elementverificado = document.createElement(CalificacionEmpleadoConstantesFunciones.VERIFICADO);
		elementverificado.appendChild(document.createTextNode(calificacionempleado.getverificado().toString().trim()));
		element.appendChild(elementverificado);
	}
	
	public void generarReporteGroupGenericoCalificacionEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados=new ArrayList<CalificacionEmpleado>();
		
		calificacionempleadosSeleccionados=this.getCalificacionEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCalificacionEmpleado(calificacionempleadosSeleccionados);
		
		this.generarReporteCalificacionEmpleados("Todos",calificacionempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCalificacionEmpleado(ArrayList<CalificacionEmpleado> calificacionempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CalificacionEmpleado calificacionempleadoAux:calificacionempleadosSeleccionados) {
				calificacionempleadoAux.setsDetalleGeneralEntityReporte(calificacionempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					calificacionempleadoAux.setsDescripcionGeneralEntityReporte1(calificacionempleadoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					calificacionempleadoAux.setsDescripcionGeneralEntityReporte1(calificacionempleadoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					calificacionempleadoAux.setsDescripcionGeneralEntityReporte1(calificacionempleadoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					calificacionempleadoAux.setsDescripcionGeneralEntityReporte1(calificacionempleadoAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					calificacionempleadoAux.setsDescripcionGeneralEntityReporte1(calificacionempleadoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_IDEVALUACIONEMPLEADO)) {
					existe=true;
					calificacionempleadoAux.setsDescripcionGeneralEntityReporte1(calificacionempleadoAux.getevaluacionempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIFACTORNOMI)) {
					existe=true;
					calificacionempleadoAux.setsDescripcionGeneralEntityReporte1(calificacionempleadoAux.getformatonomifactornomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_IDFORMATONOMIPREGUNTANOMI)) {
					existe=true;
					calificacionempleadoAux.setsDescripcionGeneralEntityReporte1(calificacionempleadoAux.getformatonomipreguntanomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_IDTIPOCALIFICACIONEMPLEADO)) {
					existe=true;
					calificacionempleadoAux.setsDescripcionGeneralEntityReporte1(calificacionempleadoAux.gettipocalificacionempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CalificacionEmpleadoConstantesFunciones.LABEL_VERIFICADO)) {
					existe=true;
					calificacionempleadoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(calificacionempleadoAux.getverificado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalificacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCalificacionEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCalificacionEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarCalificacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=false;
			this.isVisibilidadCeldaModificarCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=true;
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarCalificacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=false;
			this.isVisibilidadCeldaModificarCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=true;
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=true;
			this.isVisibilidadCeldaCancelarCalificacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=false;
			this.isVisibilidadCeldaModificarCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=true;
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarCalificacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=true;
			this.isVisibilidadCeldaModificarCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarCalificacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=false;
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarCalificacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=false;
			this.isVisibilidadCeldaModificarCalificacionEmpleado=true;
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=false;
			this.isVisibilidadCeldaCancelarCalificacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarCalificacionEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CalificacionEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=true;
		} else {
			this.actualizarEstadoPanelsCalificacionEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCalificacionEmpleado=false;
			//this.isVisibilidadCeldaVerFormCalificacionEmpleado=false;
			this.isVisibilidadCeldaDuplicarCalificacionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!calificacionempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoCalificacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosCalificacionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!calificacionempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=false;												
			}
			
			this.jButtonCerrarCalificacionEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCalificacionEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.calificacionempleado)) {
			this.isVisibilidadCeldaActualizarCalificacionEmpleado=false;
			this.isVisibilidadCeldaEliminarCalificacionEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCalificacionEmpleado() {
	}
	
	public void actualizarEstadoPanelsCalificacionEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionCalificacionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCalificacionEmpleado!=null) {
				this.jScrollPanelDatosCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionCalificacionEmpleado!=null) {
				this.jPanelPaginacionCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesCalificacionEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionCalificacionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCalificacionEmpleado!=null) {
				this.jScrollPanelDatosCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionCalificacionEmpleado!=null) {
				this.jPanelPaginacionCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesCalificacionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionCalificacionEmpleado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCalificacionEmpleado!=null) {
				this.jScrollPanelDatosCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionCalificacionEmpleado!=null) {
				this.jPanelPaginacionCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesCalificacionEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionCalificacionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCalificacionEmpleado!=null) {
				this.jScrollPanelDatosCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionCalificacionEmpleado!=null) {
				this.jPanelPaginacionCalificacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesCalificacionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionCalificacionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCalificacionEmpleado!=null) {
				this.jScrollPanelDatosCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionCalificacionEmpleado!=null) {
				this.jPanelPaginacionCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesCalificacionEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionCalificacionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCalificacionEmpleado!=null) {
				this.jScrollPanelDatosCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionCalificacionEmpleado!=null) {
				this.jPanelPaginacionCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesCalificacionEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCalificacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionCalificacionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCalificacionEmpleado!=null) {
				this.jScrollPanelDatosCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionCalificacionEmpleado!=null) {
				this.jPanelPaginacionCalificacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesCalificacionEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCalificacionEmpleado!=null) {
					this.jTabbedPaneBusquedasCalificacionEmpleado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesCalificacionEmpleado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.calificacionempleadoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalificacionEmpleado!=null) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCalificacionEmpleado!=null) {
				this.jPanelParametrosReportesCalificacionEmpleado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdEvaluacionEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEvaluacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiFactorNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiFactorNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiPreguntaNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdTipoCalificacionEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCalificacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdEvaluacionEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEvaluacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiFactorNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiFactorNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiPreguntaNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdTipoCalificacionEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoCalificacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdEmpleado=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdEvaluacionEmpleado=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEvaluacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiFactorNomi=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiFactorNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiPreguntaNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdTipoCalificacionEmpleado=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoCalificacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdEmpleado=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdEvaluacionEmpleado=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEvaluacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiFactorNomi=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiFactorNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiPreguntaNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdTipoCalificacionEmpleado=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoCalificacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdEvaluacionEmpleado=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEvaluacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiFactorNomi=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiFactorNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiPreguntaNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdTipoCalificacionEmpleado=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoCalificacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEvaluacionEmpleado(Boolean isParaEvaluacionEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEvaluacionEmpleadoNegation=!isParaEvaluacionEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEvaluacionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdEvaluacionEmpleado=isParaEvaluacionEmpleado;
			if(!this.isVisibilidadFK_IdEvaluacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiFactorNomi=isParaEvaluacionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiFactorNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=isParaEvaluacionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiPreguntaNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdTipoCalificacionEmpleado=isParaEvaluacionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoCalificacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormatoNomiFactorNomi(Boolean isParaFormatoNomiFactorNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNomiFactorNomiNegation=!isParaFormatoNomiFactorNomi;

			this.isVisibilidadFK_IdEmpleado=isParaFormatoNomiFactorNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdEvaluacionEmpleado=isParaFormatoNomiFactorNomiNegation;
			if(!this.isVisibilidadFK_IdEvaluacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiFactorNomi=isParaFormatoNomiFactorNomi;
			if(!this.isVisibilidadFK_IdFormatoNomiFactorNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=isParaFormatoNomiFactorNomiNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiPreguntaNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdTipoCalificacionEmpleado=isParaFormatoNomiFactorNomiNegation;
			if(!this.isVisibilidadFK_IdTipoCalificacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormatoNomiPreguntaNomi(Boolean isParaFormatoNomiPreguntaNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNomiPreguntaNomiNegation=!isParaFormatoNomiPreguntaNomi;

			this.isVisibilidadFK_IdEmpleado=isParaFormatoNomiPreguntaNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdEvaluacionEmpleado=isParaFormatoNomiPreguntaNomiNegation;
			if(!this.isVisibilidadFK_IdEvaluacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiFactorNomi=isParaFormatoNomiPreguntaNomiNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiFactorNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=isParaFormatoNomiPreguntaNomi;
			if(!this.isVisibilidadFK_IdFormatoNomiPreguntaNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdTipoCalificacionEmpleado=isParaFormatoNomiPreguntaNomiNegation;
			if(!this.isVisibilidadFK_IdTipoCalificacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCalificacionEmpleado(Boolean isParaTipoCalificacionEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCalificacionEmpleadoNegation=!isParaTipoCalificacionEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaTipoCalificacionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdEvaluacionEmpleado=isParaTipoCalificacionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEvaluacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiFactorNomi=isParaTipoCalificacionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiFactorNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdFormatoNomiPreguntaNomi=isParaTipoCalificacionEmpleadoNegation;
			if(!this.isVisibilidadFK_IdFormatoNomiPreguntaNomi) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);}

			this.isVisibilidadFK_IdTipoCalificacionEmpleado=isParaTipoCalificacionEmpleado;
			if(!this.isVisibilidadFK_IdTipoCalificacionEmpleado) {this.jTabbedPaneBusquedasCalificacionEmpleado.remove(jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CalificacionEmpleadoSessionBean calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		
		if(this.calificacionempleadoSessionBean==null) {
			this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		}
		
		this.calificacionempleadoSessionBean.setsUltimaBusquedaCalificacionEmpleado(this.getsAccionBusqueda());
		this.calificacionempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.calificacionempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			calificacionempleadoSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			calificacionempleadoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			calificacionempleadoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEvaluacionEmpleado")) {
			calificacionempleadoSessionBean.setid_evaluacion_empleado(this.getid_evaluacion_empleadoFK_IdEvaluacionEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomiFactorNomi")) {
			calificacionempleadoSessionBean.setid_formato_nomi_factor_nomi(this.getid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomiPreguntaNomi")) {
			calificacionempleadoSessionBean.setid_formato_nomi_pregunta_nomi(this.getid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			calificacionempleadoSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			calificacionempleadoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCalificacionEmpleado")) {
			calificacionempleadoSessionBean.setid_tipo_calificacion_empleado(this.getid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CalificacionEmpleadoSessionBean calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		
		if(this.calificacionempleadoSessionBean==null) {
			this.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
		}
		
		if(this.calificacionempleadoSessionBean.getsUltimaBusquedaCalificacionEmpleado()!=null&&!this.calificacionempleadoSessionBean.getsUltimaBusquedaCalificacionEmpleado().equals("")) {
			this.setsAccionBusqueda(calificacionempleadoSessionBean.getsUltimaBusquedaCalificacionEmpleado());
			this.setiNumeroPaginacion(calificacionempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(calificacionempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(calificacionempleadoSessionBean.getid_ejercicio());
				calificacionempleadoSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(calificacionempleadoSessionBean.getid_empleado());
				calificacionempleadoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(calificacionempleadoSessionBean.getid_empresa());
				calificacionempleadoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEvaluacionEmpleado")) {
				this.setid_evaluacion_empleadoFK_IdEvaluacionEmpleado(calificacionempleadoSessionBean.getid_evaluacion_empleado());
				calificacionempleadoSessionBean.setid_evaluacion_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomiFactorNomi")) {
				this.setid_formato_nomi_factor_nomiFK_IdFormatoNomiFactorNomi(calificacionempleadoSessionBean.getid_formato_nomi_factor_nomi());
				calificacionempleadoSessionBean.setid_formato_nomi_factor_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomiPreguntaNomi")) {
				this.setid_formato_nomi_pregunta_nomiFK_IdFormatoNomiPreguntaNomi(calificacionempleadoSessionBean.getid_formato_nomi_pregunta_nomi());
				calificacionempleadoSessionBean.setid_formato_nomi_pregunta_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(calificacionempleadoSessionBean.getid_periodo());
				calificacionempleadoSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(calificacionempleadoSessionBean.getid_sucursal());
				calificacionempleadoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCalificacionEmpleado")) {
				this.setid_tipo_calificacion_empleadoFK_IdTipoCalificacionEmpleado(calificacionempleadoSessionBean.getid_tipo_calificacion_empleado());
				calificacionempleadoSessionBean.setid_tipo_calificacion_empleado(-1L);
			}
		}
		
		this.calificacionempleadoSessionBean.setsUltimaBusquedaCalificacionEmpleado("");
		this.calificacionempleadoSessionBean.setiNumeroPaginacion(CalificacionEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.calificacionempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCalificacionEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCalificacionEmpleado() {
		this.updateBorderResaltarBusquedasFormularioCalificacionEmpleado();
		this.updateVisibilidadBusquedasFormularioCalificacionEmpleado();
		this.updateHabilitarBusquedasFormularioCalificacionEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioCalificacionEmpleado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCalificacionEmpleado.getComponents().length>0) {
	

		if(this.calificacionempleadoConstantesFunciones.resaltarFK_IdEmpleadoCalificacionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoCalificacionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
				jPanel.setBorder(this.calificacionempleadoConstantesFunciones.resaltarFK_IdEmpleadoCalificacionEmpleado);
			}
		}

		if(this.calificacionempleadoConstantesFunciones.resaltarFK_IdEvaluacionEmpleadoCalificacionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
				jPanel.setBorder(this.calificacionempleadoConstantesFunciones.resaltarFK_IdEvaluacionEmpleadoCalificacionEmpleado);
			}
		}

		if(this.calificacionempleadoConstantesFunciones.resaltarFK_IdFormatoNomiFactorNomiCalificacionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
				jPanel.setBorder(this.calificacionempleadoConstantesFunciones.resaltarFK_IdFormatoNomiFactorNomiCalificacionEmpleado);
			}
		}

		if(this.calificacionempleadoConstantesFunciones.resaltarFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
				jPanel.setBorder(this.calificacionempleadoConstantesFunciones.resaltarFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);
			}
		}

		if(this.calificacionempleadoConstantesFunciones.resaltarFK_IdTipoCalificacionEmpleadoCalificacionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
				jPanel.setBorder(this.calificacionempleadoConstantesFunciones.resaltarFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCalificacionEmpleado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCalificacionEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoCalificacionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.calificacionempleadoConstantesFunciones.mostrarFK_IdEmpleadoCalificacionEmpleado);
			if(!this.calificacionempleadoConstantesFunciones.mostrarFK_IdEmpleadoCalificacionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.calificacionempleadoConstantesFunciones.mostrarFK_IdEvaluacionEmpleadoCalificacionEmpleado);
			if(!this.calificacionempleadoConstantesFunciones.mostrarFK_IdEvaluacionEmpleadoCalificacionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.calificacionempleadoConstantesFunciones.mostrarFK_IdFormatoNomiFactorNomiCalificacionEmpleado);
			if(!this.calificacionempleadoConstantesFunciones.mostrarFK_IdFormatoNomiFactorNomiCalificacionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.calificacionempleadoConstantesFunciones.mostrarFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);
			if(!this.calificacionempleadoConstantesFunciones.mostrarFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.calificacionempleadoConstantesFunciones.mostrarFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);
			if(!this.calificacionempleadoConstantesFunciones.mostrarFK_IdTipoCalificacionEmpleadoCalificacionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasCalificacionEmpleado.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCalificacionEmpleado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCalificacionEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoCalificacionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.calificacionempleadoConstantesFunciones.activarFK_IdEmpleadoCalificacionEmpleado);
				this.jTabbedPaneBusquedasCalificacionEmpleado.setEnabledAt(index,this.calificacionempleadoConstantesFunciones.activarFK_IdEmpleadoCalificacionEmpleado);
			}

			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.calificacionempleadoConstantesFunciones.activarFK_IdEvaluacionEmpleadoCalificacionEmpleado);
				this.jTabbedPaneBusquedasCalificacionEmpleado.setEnabledAt(index,this.calificacionempleadoConstantesFunciones.activarFK_IdEvaluacionEmpleadoCalificacionEmpleado);
			}

			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.calificacionempleadoConstantesFunciones.activarFK_IdFormatoNomiFactorNomiCalificacionEmpleado);
				this.jTabbedPaneBusquedasCalificacionEmpleado.setEnabledAt(index,this.calificacionempleadoConstantesFunciones.activarFK_IdFormatoNomiFactorNomiCalificacionEmpleado);
			}

			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.calificacionempleadoConstantesFunciones.activarFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);
				this.jTabbedPaneBusquedasCalificacionEmpleado.setEnabledAt(index,this.calificacionempleadoConstantesFunciones.activarFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);
			}

			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.calificacionempleadoConstantesFunciones.activarFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);
				this.jTabbedPaneBusquedasCalificacionEmpleado.setEnabledAt(index,this.calificacionempleadoConstantesFunciones.activarFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCalificacionEmpleado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoCalificacionEmpleado);

			this.jTabbedPaneBusquedasCalificacionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);

			this.calificacionempleadoConstantesFunciones.setResaltarFK_IdEmpleadoCalificacionEmpleado(resaltar);

			jPanel.setBorder(this.calificacionempleadoConstantesFunciones.resaltarFK_IdEmpleadoCalificacionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEvaluacionEmpleado")) {
			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdEvaluacionEmpleadoCalificacionEmpleado);

			this.jTabbedPaneBusquedasCalificacionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);

			this.calificacionempleadoConstantesFunciones.setResaltarFK_IdEvaluacionEmpleadoCalificacionEmpleado(resaltar);

			jPanel.setBorder(this.calificacionempleadoConstantesFunciones.resaltarFK_IdEvaluacionEmpleadoCalificacionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFormatoNomiFactorNomi")) {
			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoNomiFactorNomiCalificacionEmpleado);

			this.jTabbedPaneBusquedasCalificacionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);

			this.calificacionempleadoConstantesFunciones.setResaltarFK_IdFormatoNomiFactorNomiCalificacionEmpleado(resaltar);

			jPanel.setBorder(this.calificacionempleadoConstantesFunciones.resaltarFK_IdFormatoNomiFactorNomiCalificacionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFormatoNomiPreguntaNomi")) {
			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);

			this.jTabbedPaneBusquedasCalificacionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);

			this.calificacionempleadoConstantesFunciones.setResaltarFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado(resaltar);

			jPanel.setBorder(this.calificacionempleadoConstantesFunciones.resaltarFK_IdFormatoNomiPreguntaNomiCalificacionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoCalificacionEmpleado")) {
			index= this.jTabbedPaneBusquedasCalificacionEmpleado.indexOfComponent(this.jPanelFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);

			this.jTabbedPaneBusquedasCalificacionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalificacionEmpleado.getComponent(index);

			this.calificacionempleadoConstantesFunciones.setResaltarFK_IdTipoCalificacionEmpleadoCalificacionEmpleado(resaltar);

			jPanel.setBorder(this.calificacionempleadoConstantesFunciones.resaltarFK_IdTipoCalificacionEmpleadoCalificacionEmpleado);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCalificacionEmpleado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCalificacionEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCalificacionEmpleado();
		this.updateVisibilidadResaltarControlesFormularioCalificacionEmpleado();
		this.updateHabilitarResaltarControlesFormularioCalificacionEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioCalificacionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.calificacionempleadoConstantesFunciones.resaltaridCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelidCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltaridCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarid_empresaCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarid_empresaCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarid_sucursalCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarid_sucursalCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarid_ejercicioCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarid_ejercicioCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarid_periodoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarid_periodoCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarid_empleadoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarid_empleadoCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarid_evaluacion_empleadoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarid_evaluacion_empleadoCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarid_formato_nomi_factor_nomiCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarid_formato_nomi_factor_nomiCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarid_formato_nomi_pregunta_nomiCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarid_tipo_calificacion_empleadoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarid_tipo_calificacion_empleadoCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarvalor_conocimientoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_conocimientoCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarvalor_conocimientoCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarvalor_eficienciaCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_eficienciaCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarvalor_eficienciaCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarvalor_obtenidoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_obtenidoCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarvalor_obtenidoCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarvalor_pesoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_pesoCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarvalor_pesoCalificacionEmpleado);}
		if(this.calificacionempleadoConstantesFunciones.resaltarverificadoCalificacionEmpleado!=null && this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxverificadoCalificacionEmpleado.setBorderPainted(true);this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxverificadoCalificacionEmpleado.setBorder(this.calificacionempleadoConstantesFunciones.resaltarverificadoCalificacionEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCalificacionEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelidCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostraridCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelidCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostraridCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_empresaCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelid_empresaCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_empresaCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_sucursalCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelid_sucursalCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_sucursalCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_ejercicioCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelid_ejercicioCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_ejercicioCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_periodoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelid_periodoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_periodoCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_empleadoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelid_empleadoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_empleadoCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_evaluacion_empleadoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelid_evaluacion_empleadoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_evaluacion_empleadoCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_formato_nomi_factor_nomiCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelid_formato_nomi_factor_nomiCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_formato_nomi_factor_nomiCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_formato_nomi_pregunta_nomiCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelid_formato_nomi_pregunta_nomiCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_formato_nomi_pregunta_nomiCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_tipo_calificacion_empleadoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelid_tipo_calificacion_empleadoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarid_tipo_calificacion_empleadoCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_conocimientoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarvalor_conocimientoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelvalor_conocimientoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarvalor_conocimientoCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_eficienciaCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarvalor_eficienciaCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelvalor_eficienciaCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarvalor_eficienciaCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_obtenidoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarvalor_obtenidoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelvalor_obtenidoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarvalor_obtenidoCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_pesoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarvalor_pesoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelvalor_pesoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarvalor_pesoCalificacionEmpleado);
		//this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxverificadoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarverificadoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jPanelverificadoCalificacionEmpleado.setVisible(this.calificacionempleadoConstantesFunciones.mostrarverificadoCalificacionEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCalificacionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormCalificacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCalificacionEmpleado!=null) {
	
		this.jInternalFrameDetalleFormCalificacionEmpleado.jLabelidCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activaridCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empresaCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarid_empresaCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_sucursalCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarid_sucursalCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_ejercicioCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarid_ejercicioCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_periodoCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarid_periodoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_empleadoCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarid_empleadoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_evaluacion_empleadoCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarid_evaluacion_empleadoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_factor_nomiCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarid_formato_nomi_factor_nomiCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_formato_nomi_pregunta_nomiCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarid_formato_nomi_pregunta_nomiCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jComboBoxid_tipo_calificacion_empleadoCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarid_tipo_calificacion_empleadoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_conocimientoCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarvalor_conocimientoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_eficienciaCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarvalor_eficienciaCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_obtenidoCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarvalor_obtenidoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jTextFieldvalor_pesoCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarvalor_pesoCalificacionEmpleado);
		this.jInternalFrameDetalleFormCalificacionEmpleado.jCheckBoxverificadoCalificacionEmpleado.setEnabled(this.calificacionempleadoConstantesFunciones.activarverificadoCalificacionEmpleado);
		}
	}
	
		
}