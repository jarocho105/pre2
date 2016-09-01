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

import com.bydan.erp.nomina.util.EvaluacionNomiConstantesFunciones;
import com.bydan.erp.nomina.util.EvaluacionNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EvaluacionNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EvaluacionNomiBean;
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
public class EvaluacionNomiBeanSwingJInternalFrame extends EvaluacionNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EvaluacionNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EvaluacionNomi> evaluacionnomiValidator = new ClassValidator<EvaluacionNomi>(EvaluacionNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EvaluacionNomi evaluacionnomi;	
	public EvaluacionNomi evaluacionnomiAux;
	public EvaluacionNomi evaluacionnomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EvaluacionNomi evaluacionnomiTotales;
	public Long idEvaluacionNomiActual;
	public Long iIdNuevoEvaluacionNomi=0L;
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

	public String sFinalQueryComboEmpleadoEvaluador="";

	public List<Empleado> empleadoevaluadorsForeignKey;

	public List<Empleado> getempleadoevaluadorsForeignKey() {
		return empleadoevaluadorsForeignKey;
	}

	public void setempleadoevaluadorsForeignKey(List<Empleado> empleadoevaluadorsForeignKey) {
		this.empleadoevaluadorsForeignKey = empleadoevaluadorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoevaluadorForeignKey;

	public Empleado getempleadoevaluadorForeignKey() {
		return empleadoevaluadorForeignKey;
	}

	public void setempleadoevaluadorForeignKey(Empleado empleadoevaluadorForeignKey) {
		this.empleadoevaluadorForeignKey = empleadoevaluadorForeignKey;
	}

	public String sFinalQueryComboFormatoNomi="";

	public List<FormatoNomi> formatonomisForeignKey;

	public List<FormatoNomi> getformatonomisForeignKey() {
		return formatonomisForeignKey;
	}

	public void setformatonomisForeignKey(List<FormatoNomi> formatonomisForeignKey) {
		this.formatonomisForeignKey = formatonomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public FormatoNomi formatonomiForeignKey;

	public FormatoNomi getformatonomiForeignKey() {
		return formatonomiForeignKey;
	}

	public void setformatonomiForeignKey(FormatoNomi formatonomiForeignKey) {
		this.formatonomiForeignKey = formatonomiForeignKey;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleEvaluacionNomi=false;

	public Boolean getIsTienePermisosDetalleEvaluacionNomi() {
		return isTienePermisosDetalleEvaluacionNomi;
	}

	public void setIsTienePermisosDetalleEvaluacionNomi(Boolean isTienePermisosDetalleEvaluacionNomi) {
		this.isTienePermisosDetalleEvaluacionNomi= isTienePermisosDetalleEvaluacionNomi;
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
	
	public Boolean isPermisoTodoEvaluacionNomi;
	public Boolean isPermisoNuevoEvaluacionNomi;
	public Boolean isPermisoActualizarEvaluacionNomi;
	public Boolean isPermisoActualizarOriginalEvaluacionNomi;
	public Boolean isPermisoEliminarEvaluacionNomi;
	public Boolean isPermisoGuardarCambiosEvaluacionNomi;
	public Boolean isPermisoConsultaEvaluacionNomi;
	public Boolean isPermisoBusquedaEvaluacionNomi;
	public Boolean isPermisoReporteEvaluacionNomi;
	public Boolean isPermisoPaginacionMedioEvaluacionNomi;
	public Boolean isPermisoPaginacionAltoEvaluacionNomi;
	public Boolean isPermisoPaginacionTodoEvaluacionNomi;
	public Boolean isPermisoCopiarEvaluacionNomi;
	public Boolean isPermisoVerFormEvaluacionNomi;
	public Boolean isPermisoDuplicarEvaluacionNomi;
	public Boolean isPermisoOrdenEvaluacionNomi;
	
	
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
	
	public EvaluacionNomiParameterReturnGeneral evaluacionnomiReturnGeneral;
	public EvaluacionNomiParameterReturnGeneral evaluacionnomiParameterGeneral;
	
	

	public DetalleEvaluacionNomiLogic detalleevaluacionnomiLogic=null;

	public DetalleEvaluacionNomiLogic getDetalleEvaluacionNomiLogic() {
		return detalleevaluacionnomiLogic;
	}

	public void setDetalleEvaluacionNomiLogic(DetalleEvaluacionNomiLogic detalleevaluacionnomiLogic) {
		this.detalleevaluacionnomiLogic = detalleevaluacionnomiLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEvaluacionNomi=false;
	public Boolean esParaAccionDesdeFormularioEvaluacionNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EvaluacionNomiSessionBeanAdditional evaluacionnomiSessionBeanAdditional=null;
	
	public EvaluacionNomiSessionBeanAdditional getEvaluacionNomiSessionBeanAdditional() {
		return this.evaluacionnomiSessionBeanAdditional;
	}
	
	public void setEvaluacionNomiSessionBeanAdditional(EvaluacionNomiSessionBeanAdditional evaluacionnomiSessionBeanAdditional) {
		try {
			this.evaluacionnomiSessionBeanAdditional=evaluacionnomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EvaluacionNomiBeanSwingJInternalFrameAdditional evaluacionnomiBeanSwingJInternalFrameAdditional=null;
	//public class EvaluacionNomiBeanSwingJInternalFrame
	
	public EvaluacionNomiBeanSwingJInternalFrameAdditional getEvaluacionNomiBeanSwingJInternalFrameAdditional() {
		return this.evaluacionnomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setEvaluacionNomiBeanSwingJInternalFrameAdditional(EvaluacionNomiBeanSwingJInternalFrameAdditional evaluacionnomiBeanSwingJInternalFrameAdditional) {
		try {
			this.evaluacionnomiBeanSwingJInternalFrameAdditional=evaluacionnomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EvaluacionNomiLogic evaluacionnomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EvaluacionNomi evaluacionnomiBean;
	public EvaluacionNomiConstantesFunciones evaluacionnomiConstantesFunciones;
	//public EvaluacionNomiParameterReturnGeneral evaluacionnomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public EmpleadoLogic empleadoLogic;
	public EmpleadoLogic empleadoevaluadorLogic;
	public FormatoNomiLogic formatonomiLogic;
	public EstructuraLogic estructuraLogic;
	
	//PARAMETROS
	
	
	//public List<EvaluacionNomi> evaluacionnomis;	
	//public List<EvaluacionNomi> evaluacionnomisEliminados;
	//public List<EvaluacionNomi> evaluacionnomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaDuplicarEvaluacionNomi=true;
	public Boolean isVisibilidadCeldaCopiarEvaluacionNomi=true;
	public Boolean isVisibilidadCeldaVerFormEvaluacionNomi=true;
	public Boolean isVisibilidadCeldaOrdenEvaluacionNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaModificarEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaActualizarEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaEliminarEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaCancelarEvaluacionNomi=false;
	public Boolean isVisibilidadCeldaGuardarEvaluacionNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEvaluacionNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpleadoEvaluador=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdFormatoNomi=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoEvaluacionNomi() {
		return this.iIdNuevoEvaluacionNomi;
	}

	public void setiIdNuevoEvaluacionNomi(Long iIdNuevoEvaluacionNomi) {
		this.iIdNuevoEvaluacionNomi = iIdNuevoEvaluacionNomi;
	}
	
	public Long getidEvaluacionNomiActual() {
		return this.idEvaluacionNomiActual;
	}

	public void setidEvaluacionNomiActual(Long idEvaluacionNomiActual) {
		this.idEvaluacionNomiActual = idEvaluacionNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EvaluacionNomi getevaluacionnomi() {
		return this.evaluacionnomi;
	}

	public void setevaluacionnomi(EvaluacionNomi evaluacionnomi) {
		this.evaluacionnomi = evaluacionnomi;
	}
	
	public EvaluacionNomi getevaluacionnomiAux() {
		return this.evaluacionnomiAux;
	}

	public void setevaluacionnomiAux(EvaluacionNomi evaluacionnomiAux) {
		this.evaluacionnomiAux = evaluacionnomiAux;
	}				
	
	public EvaluacionNomi getevaluacionnomiAnterior() {
		return this.evaluacionnomiAnterior;
	}

	public void setevaluacionnomiAnterior(EvaluacionNomi evaluacionnomiAnterior) {
		this.evaluacionnomiAnterior = evaluacionnomiAnterior;
	}	
	
	public EvaluacionNomi getevaluacionnomiTotales() {
		return this.evaluacionnomiTotales;
	}

	public void setevaluacionnomiTotales(EvaluacionNomi evaluacionnomiTotales) {
		this.evaluacionnomiTotales = evaluacionnomiTotales;
	}	
	
	public EvaluacionNomi getevaluacionnomiBean() {
		return this.evaluacionnomiBean;
	}

	public void setevaluacionnomiBean(EvaluacionNomi evaluacionnomiBean) {
		this.evaluacionnomiBean = evaluacionnomiBean;
	}	
	
	public EvaluacionNomiParameterReturnGeneral getevaluacionnomiReturnGeneral() {
		return this.evaluacionnomiReturnGeneral;
	}

	public void setevaluacionnomiReturnGeneral(EvaluacionNomiParameterReturnGeneral evaluacionnomiReturnGeneral) {
		this.evaluacionnomiReturnGeneral = evaluacionnomiReturnGeneral;
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

	public Long id_empleado_evaluadorFK_IdEmpleadoEvaluador=-1L;

	public Long getid_empleado_evaluadorFK_IdEmpleadoEvaluador() {
		return this.id_empleado_evaluadorFK_IdEmpleadoEvaluador;
	}

	public void setid_empleado_evaluadorFK_IdEmpleadoEvaluador(Long id_empleado_evaluadorFK_IdEmpleadoEvaluador) {
		this.id_empleado_evaluadorFK_IdEmpleadoEvaluador = id_empleado_evaluadorFK_IdEmpleadoEvaluador;
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

	public Long id_formato_nomiFK_IdFormatoNomi=-1L;

	public Long getid_formato_nomiFK_IdFormatoNomi() {
		return this.id_formato_nomiFK_IdFormatoNomi;
	}

	public void setid_formato_nomiFK_IdFormatoNomi(Long id_formato_nomiFK_IdFormatoNomi) {
		this.id_formato_nomiFK_IdFormatoNomi = id_formato_nomiFK_IdFormatoNomi;
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
	
	
	public EvaluacionNomiLogic getEvaluacionNomiLogic()	{		
		return evaluacionnomiLogic;
	}

	public void setEvaluacionNomiLogic(EvaluacionNomiLogic evaluacionnomiLogic) {
		this.evaluacionnomiLogic = evaluacionnomiLogic;
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
	
	public Boolean getIsEsNuevoEvaluacionNomi() {
		return isEsNuevoEvaluacionNomi;
	}

	public void setIsEsNuevoEvaluacionNomi(Boolean isEsNuevoEvaluacionNomi) {
		this.isEsNuevoEvaluacionNomi = isEsNuevoEvaluacionNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioEvaluacionNomi() {
		return esParaAccionDesdeFormularioEvaluacionNomi;
	}
	
	public void setEsParaAccionDesdeFormularioEvaluacionNomi(Boolean esParaAccionDesdeFormularioEvaluacionNomi) {
		this.esParaAccionDesdeFormularioEvaluacionNomi = esParaAccionDesdeFormularioEvaluacionNomi;
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

			if(this.evaluacionnomiSessionBean==null) {
				this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			}

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(evaluacionnomiSessionBean.getlidEmpresaActual());
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

			if(this.evaluacionnomiSessionBean==null) {
				this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			}

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(evaluacionnomiSessionBean.getlidSucursalActual());
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

			if(this.evaluacionnomiSessionBean==null) {
				this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			}

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(evaluacionnomiSessionBean.getlidEjercicioActual());
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

			if(this.evaluacionnomiSessionBean==null) {
				this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			}

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(evaluacionnomiSessionBean.getlidPeriodoActual());
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

			if(this.evaluacionnomiSessionBean==null) {
				this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			}

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(evaluacionnomiSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosEmpleadoEvaluadorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadoevaluadorsForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.evaluacionnomiSessionBean==null) {
				this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			}

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoEvaluador()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoevaluadorLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadoevaluadorsForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleadoEvaluador(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(evaluacionnomiSessionBean.getlidEmpleadoEvaluadorActual());
					this.empleadoevaluadorsForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosFormatoNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatonomisForeignKey=new ArrayList<FormatoNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoNomiLogic formatonomiLogic=new FormatoNomiLogic();

			//formatonomiLogic.getFormatoNomiDataAccess().setIsForForeingKeyData(true);

			if(this.evaluacionnomiSessionBean==null) {
				this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			}

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatonomiLogic.getFormatoNomiDataAccess().setIsForForeingKeyData(true);

					formatonomiLogic.getTodosFormatoNomisWithConnection(sFinalQuery,new Pagination());

					this.formatonomisForeignKey=formatonomiLogic.getFormatoNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormatoNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomiLogic.getEntityWithConnection(evaluacionnomiSessionBean.getlidFormatoNomiActual());
					this.formatonomisForeignKey.add(formatonomiLogic.getFormatoNomi());
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

			if(this.evaluacionnomiSessionBean==null) {
				this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			}

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(evaluacionnomiSessionBean.getlidEstructuraActual());
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

					if(this.evaluacionnomi!=null) {
						this.evaluacionnomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEvaluacionNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEvaluacionNomiGenerico)throws Exception
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
				jComboBoxid_empresaEvaluacionNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEvaluacionNomiGenerico!=null && jComboBoxid_empresaEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaEvaluacionNomiGenerico.setSelectedIndex(0);
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

					if(this.evaluacionnomi!=null) {
						this.evaluacionnomi.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalEvaluacionNomi.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalEvaluacionNomiGenerico)throws Exception
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
				jComboBoxid_sucursalEvaluacionNomiGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalEvaluacionNomiGenerico!=null && jComboBoxid_sucursalEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_sucursalEvaluacionNomiGenerico.setSelectedIndex(0);
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

					if(this.evaluacionnomi!=null) {
						this.evaluacionnomi.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioEvaluacionNomi.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioEvaluacionNomiGenerico)throws Exception
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
				jComboBoxid_ejercicioEvaluacionNomiGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioEvaluacionNomiGenerico!=null && jComboBoxid_ejercicioEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioEvaluacionNomiGenerico.setSelectedIndex(0);
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

					if(this.evaluacionnomi!=null) {
						this.evaluacionnomi.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoEvaluacionNomi.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoEvaluacionNomiGenerico)throws Exception
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
				jComboBoxid_periodoEvaluacionNomiGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoEvaluacionNomiGenerico!=null && jComboBoxid_periodoEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_periodoEvaluacionNomiGenerico.setSelectedIndex(0);
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

					if(this.evaluacionnomi!=null) {
						this.evaluacionnomi.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEvaluacionNomi.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEvaluacionNomiGenerico)throws Exception
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
				jComboBoxid_empleadoEvaluacionNomiGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEvaluacionNomiGenerico!=null && jComboBoxid_empleadoEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEvaluacionNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoEvaluadorForeignKey(Long idEmpleadoEvaluadorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoevaluadorTemp=null;

			for(Empleado empleadoevaluadorAux:empleadoevaluadorsForeignKey) {
				if(empleadoevaluadorAux.getId()!=null && empleadoevaluadorAux.getId().equals(idEmpleadoEvaluadorSeleccionado)) {
					empleadoevaluadorTemp=empleadoevaluadorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoevaluadorTemp!=null) {

					if(this.evaluacionnomi!=null) {
						this.evaluacionnomi.setEmpleadoEvaluador(empleadoevaluadorTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.setSelectedItem(empleadoevaluadorTemp);
					}
				} else {
					//jComboBoxid_empleado_evaluadorEvaluacionNomi.setSelectedItem(empleadoevaluadorTemp);
					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoEvaluador") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoevaluadorTemp!=null && jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi!=null) {
						jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setSelectedItem(empleadoevaluadorTemp);
					} else {
						if(jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi!=null) {
							//jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setSelectedItem(empleadoevaluadorTemp);
							if(jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.getItemCount()>0) {
								jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setSelectedIndex(0);
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

	public String getActualEmpleadoEvaluadorForeignKeyDescripcion(Long idEmpleadoEvaluadorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoevaluadorTemp=null;

			for(Empleado empleadoevaluadorAux:empleadoevaluadorsForeignKey) {
				if(empleadoevaluadorAux.getId()!=null && empleadoevaluadorAux.getId().equals(idEmpleadoEvaluadorSeleccionado)) {
					empleadoevaluadorTemp=empleadoevaluadorAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoevaluadorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoEvaluadorForeignKeyGenerico(Long idEmpleadoEvaluadorSeleccionado,JComboBox jComboBoxid_empleado_evaluadorEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoevaluadorTemp=null;

			for(Empleado empleadoevaluadorAux:empleadoevaluadorsForeignKey) {
				if(empleadoevaluadorAux.getId()!=null && empleadoevaluadorAux.getId().equals(idEmpleadoEvaluadorSeleccionado)) {
					empleadoevaluadorTemp=empleadoevaluadorAux;
					break;
				}
			}

			if(empleadoevaluadorTemp!=null) {
				jComboBoxid_empleado_evaluadorEvaluacionNomiGenerico.setSelectedItem(empleadoevaluadorTemp);
			} else {
				if(jComboBoxid_empleado_evaluadorEvaluacionNomiGenerico!=null && jComboBoxid_empleado_evaluadorEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_empleado_evaluadorEvaluacionNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoNomiForeignKey(Long idFormatoNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			FormatoNomi  formatonomiTemp=null;

			for(FormatoNomi formatonomiAux:formatonomisForeignKey) {
				if(formatonomiAux.getId()!=null && formatonomiAux.getId().equals(idFormatoNomiSeleccionado)) {
					formatonomiTemp=formatonomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatonomiTemp!=null) {

					if(this.evaluacionnomi!=null) {
						this.evaluacionnomi.setFormatoNomi(formatonomiTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.setSelectedItem(formatonomiTemp);
					}
				} else {
					//jComboBoxid_formato_nomiEvaluacionNomi.setSelectedItem(formatonomiTemp);
					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatonomiTemp!=null && jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi!=null) {
						jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setSelectedItem(formatonomiTemp);
					} else {
						if(jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi!=null) {
							//jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setSelectedItem(formatonomiTemp);
							if(jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.getItemCount()>0) {
								jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setSelectedIndex(0);
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

	public String getActualFormatoNomiForeignKeyDescripcion(Long idFormatoNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			FormatoNomi  formatonomiTemp=null;

			for(FormatoNomi formatonomiAux:formatonomisForeignKey) {
				if(formatonomiAux.getId()!=null && formatonomiAux.getId().equals(idFormatoNomiSeleccionado)) {
					formatonomiTemp=formatonomiAux;
					break;
				}
			}


			sDescripcion=FormatoNomiConstantesFunciones.getFormatoNomiDescripcion(formatonomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoNomiForeignKeyGenerico(Long idFormatoNomiSeleccionado,JComboBox jComboBoxid_formato_nomiEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			FormatoNomi  formatonomiTemp=null;

			for(FormatoNomi formatonomiAux:formatonomisForeignKey) {
				if(formatonomiAux.getId()!=null && formatonomiAux.getId().equals(idFormatoNomiSeleccionado)) {
					formatonomiTemp=formatonomiAux;
					break;
				}
			}

			if(formatonomiTemp!=null) {
				jComboBoxid_formato_nomiEvaluacionNomiGenerico.setSelectedItem(formatonomiTemp);
			} else {
				if(jComboBoxid_formato_nomiEvaluacionNomiGenerico!=null && jComboBoxid_formato_nomiEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_formato_nomiEvaluacionNomiGenerico.setSelectedIndex(0);
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

					if(this.evaluacionnomi!=null) {
						this.evaluacionnomi.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraEvaluacionNomi.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi!=null) {
						jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraEvaluacionNomiGenerico)throws Exception
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
				jComboBoxid_estructuraEvaluacionNomiGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraEvaluacionNomiGenerico!=null && jComboBoxid_estructuraEvaluacionNomiGenerico.getItemCount()>0) {
					jComboBoxid_estructuraEvaluacionNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EvaluacionNomi evaluacionnomi,JComboBox jComboBoxid_empresaEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEvaluacionNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEvaluacionNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				evaluacionnomi.setid_empresa(empresaAux.getId());
				evaluacionnomi.setempresa_descripcion(EvaluacionNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				evaluacionnomi.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(EvaluacionNomi evaluacionnomi,JComboBox jComboBoxid_sucursalEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalEvaluacionNomiGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalEvaluacionNomiGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				evaluacionnomi.setid_sucursal(sucursalAux.getId());
				evaluacionnomi.setsucursal_descripcion(EvaluacionNomiConstantesFunciones.getSucursalDescripcion(sucursalAux));
				evaluacionnomi.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(EvaluacionNomi evaluacionnomi,JComboBox jComboBoxid_ejercicioEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioEvaluacionNomiGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioEvaluacionNomiGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				evaluacionnomi.setid_ejercicio(ejercicioAux.getId());
				evaluacionnomi.setejercicio_descripcion(EvaluacionNomiConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				evaluacionnomi.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(EvaluacionNomi evaluacionnomi,JComboBox jComboBoxid_periodoEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoEvaluacionNomiGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoEvaluacionNomiGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				evaluacionnomi.setid_periodo(periodoAux.getId());
				evaluacionnomi.setperiodo_descripcion(EvaluacionNomiConstantesFunciones.getPeriodoDescripcion(periodoAux));
				evaluacionnomi.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EvaluacionNomi evaluacionnomi,JComboBox jComboBoxid_empleadoEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEvaluacionNomiGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEvaluacionNomiGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				evaluacionnomi.setid_empleado(empleadoAux.getId());
				evaluacionnomi.setempleado_descripcion(EvaluacionNomiConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				evaluacionnomi.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoEvaluadorForeignKey(EvaluacionNomi evaluacionnomi,JComboBox jComboBoxid_empleado_evaluadorEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleado_evaluadorEvaluacionNomiGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleado_evaluadorEvaluacionNomiGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				evaluacionnomi.setid_empleado_evaluador(empleadoAux.getId());
				evaluacionnomi.setempleadoevaluador_descripcion(EvaluacionNomiConstantesFunciones.getEmpleadoEvaluadorDescripcion(empleadoAux));
				evaluacionnomi.setEmpleadoEvaluador(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoNomiForeignKey(EvaluacionNomi evaluacionnomi,JComboBox jComboBoxid_formato_nomiEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			FormatoNomi  formatonomiAux=new FormatoNomi();

			if(jComboBoxid_formato_nomiEvaluacionNomiGenerico==null) {
				formatonomiAux=(FormatoNomi)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.getSelectedItem();
			} else {
				formatonomiAux=(FormatoNomi)jComboBoxid_formato_nomiEvaluacionNomiGenerico.getSelectedItem();
			}

			if(formatonomiAux!=null && formatonomiAux.getId()!=null) {
				evaluacionnomi.setid_formato_nomi(formatonomiAux.getId());
				evaluacionnomi.setformatonomi_descripcion(EvaluacionNomiConstantesFunciones.getFormatoNomiDescripcion(formatonomiAux));
				evaluacionnomi.setFormatoNomi(formatonomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(EvaluacionNomi evaluacionnomi,JComboBox jComboBoxid_estructuraEvaluacionNomiGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraEvaluacionNomiGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraEvaluacionNomiGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				evaluacionnomi.setid_estructura(estructuraAux.getId());
				evaluacionnomi.setestructura_descripcion(EvaluacionNomiConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				evaluacionnomi.setEstructura(estructuraAux);			}
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

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
					}

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
					}

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
					}

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
					}

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
					}

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.addItem(empleado);
							}
						}

						if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadoEvaluadorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.removeAllItems();

							for(Empleado empleadoevaluador:this.empleadoevaluadorsForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.addItem(empleadoevaluador);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
					}

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoEvaluador") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.removeAllItems();

							for(Empleado empleadoevaluador:this.empleadoevaluadorsForeignKey) {
								this.jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.addItem(empleadoevaluador);
							}
						}

						if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatoNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormatoNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.removeAllItems();

							for(FormatoNomi formatonomi:this.formatonomisForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.addItem(formatonomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
					}

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.removeAllItems();

							for(FormatoNomi formatonomi:this.formatonomisForeignKey) {
								this.jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.addItem(formatonomi);
							}
						}

						if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { 
					}

					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.addItem(estructura);
							}
						}

						if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoEvaluadorForeignKey(Empleado empleadoevaluador,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.setSelectedItem(empleadoevaluador);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setSelectedItem(empleadoevaluador);
						} else {
							this.jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFormatoNomiForeignKey(FormatoNomi formatonomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.setSelectedItem(formatonomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setSelectedItem(formatonomi);
						} else {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEvaluacionNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EvaluacionNomiConstantesFunciones.refrescarForeignKeysDescripcionesEvaluacionNomi(this.evaluacionnomiLogic.getEvaluacionNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EvaluacionNomiConstantesFunciones.refrescarForeignKeysDescripcionesEvaluacionNomi(this.evaluacionnomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(FormatoNomi.class));
		classes.add(new Classe(Estructura.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//evaluacionnomiLogic.setEvaluacionNomis(this.evaluacionnomis);
			evaluacionnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EvaluacionNomiParameterReturnGeneral getEvaluacionNomiParameterGeneral() {
		return this.evaluacionnomiParameterGeneral;
	}
	
	public void setEvaluacionNomiParameterGeneral(EvaluacionNomiParameterReturnGeneral evaluacionnomiParameterGeneral) {
		this.evaluacionnomiParameterGeneral = evaluacionnomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEvaluacionNomi() {
		return isPermisoTodoEvaluacionNomi;
	}

	public void setIsPermisoTodoEvaluacionNomi(Boolean isPermisoTodoEvaluacionNomi) {
		this.isPermisoTodoEvaluacionNomi = isPermisoTodoEvaluacionNomi;
	}

	public Boolean getIsPermisoNuevoEvaluacionNomi() {
		return isPermisoNuevoEvaluacionNomi;
	}

	public void setIsPermisoNuevoEvaluacionNomi(Boolean isPermisoNuevoEvaluacionNomi) {
		this.isPermisoNuevoEvaluacionNomi = isPermisoNuevoEvaluacionNomi;
	}

	public Boolean getIsPermisoActualizarEvaluacionNomi() {
		return isPermisoActualizarEvaluacionNomi;
	}

	public void setIsPermisoActualizarEvaluacionNomi(Boolean isPermisoActualizarEvaluacionNomi) {
		this.isPermisoActualizarEvaluacionNomi = isPermisoActualizarEvaluacionNomi;
	}

	public Boolean getIsPermisoEliminarEvaluacionNomi() {
		return isPermisoEliminarEvaluacionNomi;
	}

	public void setIsPermisoEliminarEvaluacionNomi(Boolean isPermisoEliminarEvaluacionNomi) {
		this.isPermisoEliminarEvaluacionNomi = isPermisoEliminarEvaluacionNomi;
	}

	public Boolean getIsPermisoGuardarCambiosEvaluacionNomi() {
		return isPermisoGuardarCambiosEvaluacionNomi;
	}

	public void setIsPermisoGuardarCambiosEvaluacionNomi(Boolean isPermisoGuardarCambiosEvaluacionNomi) {
		this.isPermisoGuardarCambiosEvaluacionNomi = isPermisoGuardarCambiosEvaluacionNomi;
	}
	
	public Boolean getIsPermisoConsultaEvaluacionNomi() {
		return isPermisoConsultaEvaluacionNomi;
	}

	public void setIsPermisoConsultaEvaluacionNomi(Boolean isPermisoConsultaEvaluacionNomi) {
		this.isPermisoConsultaEvaluacionNomi = isPermisoConsultaEvaluacionNomi;
	}

	public Boolean getIsPermisoBusquedaEvaluacionNomi() {
		return isPermisoBusquedaEvaluacionNomi;
	}

	public void setIsPermisoBusquedaEvaluacionNomi(Boolean isPermisoBusquedaEvaluacionNomi) {
		this.isPermisoBusquedaEvaluacionNomi = isPermisoBusquedaEvaluacionNomi;
	}

	public Boolean getIsPermisoReporteEvaluacionNomi() {
		return isPermisoReporteEvaluacionNomi;
	}

	public void setIsPermisoReporteEvaluacionNomi(Boolean isPermisoReporteEvaluacionNomi) {
		this.isPermisoReporteEvaluacionNomi = isPermisoReporteEvaluacionNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioEvaluacionNomi() {
		return isPermisoPaginacionMedioEvaluacionNomi;
	}

	public void setIsPermisoPaginacionMedioEvaluacionNomi(Boolean isPermisoPaginacionMedioEvaluacionNomi) {
		this.isPermisoPaginacionMedioEvaluacionNomi = isPermisoPaginacionMedioEvaluacionNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoEvaluacionNomi() {
		return isPermisoPaginacionTodoEvaluacionNomi;
	}

	public void setIsPermisoPaginacionTodoEvaluacionNomi(Boolean isPermisoPaginacionTodoEvaluacionNomi) {
		this.isPermisoPaginacionTodoEvaluacionNomi = isPermisoPaginacionTodoEvaluacionNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoEvaluacionNomi() {
		return isPermisoPaginacionAltoEvaluacionNomi;
	}

	public void setIsPermisoPaginacionAltoEvaluacionNomi(Boolean isPermisoPaginacionAltoEvaluacionNomi) {
		this.isPermisoPaginacionAltoEvaluacionNomi = isPermisoPaginacionAltoEvaluacionNomi;
	}
	
	public Boolean getIsPermisoCopiarEvaluacionNomi() {
		return isPermisoCopiarEvaluacionNomi;
	}

	public void setIsPermisoCopiarEvaluacionNomi(Boolean isPermisoCopiarEvaluacionNomi) {
		this.isPermisoCopiarEvaluacionNomi = isPermisoCopiarEvaluacionNomi;
	}
	
	public Boolean getIsPermisoVerFormEvaluacionNomi() {
		return isPermisoVerFormEvaluacionNomi;
	}

	public void setIsPermisoVerFormEvaluacionNomi(Boolean isPermisoVerFormEvaluacionNomi) {
		this.isPermisoVerFormEvaluacionNomi = isPermisoVerFormEvaluacionNomi;
	}
	
	public Boolean getIsPermisoDuplicarEvaluacionNomi() {
		return isPermisoDuplicarEvaluacionNomi;
	}

	public void setIsPermisoDuplicarEvaluacionNomi(Boolean isPermisoDuplicarEvaluacionNomi) {
		this.isPermisoDuplicarEvaluacionNomi = isPermisoDuplicarEvaluacionNomi;
	}
	
	public Boolean getIsPermisoOrdenEvaluacionNomi() {
		return isPermisoOrdenEvaluacionNomi;
	}

	public void setIsPermisoOrdenEvaluacionNomi(Boolean isPermisoOrdenEvaluacionNomi) {
		this.isPermisoOrdenEvaluacionNomi = isPermisoOrdenEvaluacionNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEvaluacionNomi() {
		return isVisibilidadCeldaNuevoEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaNuevoEvaluacionNomi(Boolean isVisibilidadCeldaNuevoEvaluacionNomi) {
		this.isVisibilidadCeldaNuevoEvaluacionNomi = isVisibilidadCeldaNuevoEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEvaluacionNomi() {
		return isVisibilidadCeldaDuplicarEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaDuplicarEvaluacionNomi(Boolean isVisibilidadCeldaDuplicarEvaluacionNomi) {
		this.isVisibilidadCeldaDuplicarEvaluacionNomi = isVisibilidadCeldaDuplicarEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEvaluacionNomi() {
		return isVisibilidadCeldaCopiarEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaCopiarEvaluacionNomi(Boolean isVisibilidadCeldaCopiarEvaluacionNomi) {
		this.isVisibilidadCeldaCopiarEvaluacionNomi = isVisibilidadCeldaCopiarEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEvaluacionNomi() {
		return isVisibilidadCeldaVerFormEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaVerFormEvaluacionNomi(Boolean isVisibilidadCeldaVerFormEvaluacionNomi) {
		this.isVisibilidadCeldaVerFormEvaluacionNomi = isVisibilidadCeldaVerFormEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEvaluacionNomi() {
		return isVisibilidadCeldaOrdenEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaOrdenEvaluacionNomi(Boolean isVisibilidadCeldaOrdenEvaluacionNomi) {
		this.isVisibilidadCeldaOrdenEvaluacionNomi = isVisibilidadCeldaOrdenEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEvaluacionNomi() {
		return isVisibilidadCeldaNuevoRelacionesEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEvaluacionNomi(Boolean isVisibilidadCeldaNuevoRelacionesEvaluacionNomi) {
		this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi = isVisibilidadCeldaNuevoRelacionesEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEvaluacionNomi() {
		return isVisibilidadCeldaModificarEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaModificarEvaluacionNomi(Boolean isVisibilidadCeldaModificarEvaluacionNomi) {
		this.isVisibilidadCeldaModificarEvaluacionNomi = isVisibilidadCeldaModificarEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEvaluacionNomi() {
		return isVisibilidadCeldaActualizarEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaActualizarEvaluacionNomi(Boolean isVisibilidadCeldaActualizarEvaluacionNomi) {
		this.isVisibilidadCeldaActualizarEvaluacionNomi = isVisibilidadCeldaActualizarEvaluacionNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarEvaluacionNomi() {
		return isVisibilidadCeldaEliminarEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaEliminarEvaluacionNomi(Boolean isVisibilidadCeldaEliminarEvaluacionNomi) {
		this.isVisibilidadCeldaEliminarEvaluacionNomi = isVisibilidadCeldaEliminarEvaluacionNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarEvaluacionNomi() {
		return isVisibilidadCeldaCancelarEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaCancelarEvaluacionNomi(Boolean isVisibilidadCeldaCancelarEvaluacionNomi) {
		this.isVisibilidadCeldaCancelarEvaluacionNomi = isVisibilidadCeldaCancelarEvaluacionNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarEvaluacionNomi() {
		return isVisibilidadCeldaGuardarEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaGuardarEvaluacionNomi(Boolean isVisibilidadCeldaGuardarEvaluacionNomi) {
		this.isVisibilidadCeldaGuardarEvaluacionNomi = isVisibilidadCeldaGuardarEvaluacionNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEvaluacionNomi() {
		return isVisibilidadCeldaGuardarCambiosEvaluacionNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEvaluacionNomi(Boolean isVisibilidadCeldaGuardarCambiosEvaluacionNomi) {
		this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi = isVisibilidadCeldaGuardarCambiosEvaluacionNomi;
	}
		
	public EvaluacionNomiSessionBean getevaluacionnomiSessionBean() {
		return this.evaluacionnomiSessionBean;
	}
	
	public void setevaluacionnomiSessionBean(EvaluacionNomiSessionBean evaluacionnomiSessionBean) {
		this.evaluacionnomiSessionBean=evaluacionnomiSessionBean;
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

	public Boolean getisVisibilidadFK_IdEmpleadoEvaluador() {
		return this.isVisibilidadFK_IdEmpleadoEvaluador;
	}

	public void setisVisibilidadFK_IdEmpleadoEvaluador(Boolean isVisibilidadFK_IdEmpleadoEvaluador) {
		this.isVisibilidadFK_IdEmpleadoEvaluador=isVisibilidadFK_IdEmpleadoEvaluador;
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

	public Boolean getisVisibilidadFK_IdFormatoNomi() {
		return this.isVisibilidadFK_IdFormatoNomi;
	}

	public void setisVisibilidadFK_IdFormatoNomi(Boolean isVisibilidadFK_IdFormatoNomi) {
		this.isVisibilidadFK_IdFormatoNomi=isVisibilidadFK_IdFormatoNomi;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(EvaluacionNomi evaluacionnomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(evaluacionnomi,null);
				this.setActualParaGuardarSucursalForeignKey(evaluacionnomi,null);
				this.setActualParaGuardarEjercicioForeignKey(evaluacionnomi,null);
				this.setActualParaGuardarPeriodoForeignKey(evaluacionnomi,null);
				this.setActualParaGuardarEmpleadoForeignKey(evaluacionnomi,null);
				this.setActualParaGuardarEmpleadoEvaluadorForeignKey(evaluacionnomi,null);
				this.setActualParaGuardarFormatoNomiForeignKey(evaluacionnomi,null);
				this.setActualParaGuardarEstructuraForeignKey(evaluacionnomi,null);
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
	
	public void bugActualizarReferenciaActual(EvaluacionNomi evaluacionnomi,EvaluacionNomi evaluacionnomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEvaluacionNomi(evaluacionnomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		evaluacionnomiAux.setId(evaluacionnomi.getId());
		evaluacionnomiAux.setVersionRow(evaluacionnomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEvaluacionNomi();
		
			int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = evaluacionnomiValidator.getInvalidValues(this.evaluacionnomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			evaluacionnomiLogic.setDatosCliente(datosCliente);
			evaluacionnomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				evaluacionnomiAux=new  EvaluacionNomi();
				
				evaluacionnomiAux.setIsNew(true);
				evaluacionnomiAux.setIsChanged(true);
				
				evaluacionnomiAux.setEvaluacionNomiOriginal(this.evaluacionnomi);
				
				evaluacionnomiAux.setId(this.evaluacionnomi.getId());	
				evaluacionnomiAux.setVersionRow(this.evaluacionnomi.getVersionRow());	
				evaluacionnomiAux.setid_empresa(this.evaluacionnomi.getid_empresa());	
				evaluacionnomiAux.setid_sucursal(this.evaluacionnomi.getid_sucursal());	
				evaluacionnomiAux.setid_ejercicio(this.evaluacionnomi.getid_ejercicio());	
				evaluacionnomiAux.setid_periodo(this.evaluacionnomi.getid_periodo());	
				evaluacionnomiAux.setid_empleado(this.evaluacionnomi.getid_empleado());	
				evaluacionnomiAux.setid_empleado_evaluador(this.evaluacionnomi.getid_empleado_evaluador());	
				evaluacionnomiAux.setid_formato_nomi(this.evaluacionnomi.getid_formato_nomi());	
				evaluacionnomiAux.setid_estructura(this.evaluacionnomi.getid_estructura());	
				evaluacionnomiAux.setfecha(this.evaluacionnomi.getfecha());	
				evaluacionnomiAux.setinstrucciones(this.evaluacionnomi.getinstrucciones());	
				evaluacionnomiAux.setdescripcion(this.evaluacionnomi.getdescripcion());	
				evaluacionnomiAux.setdescripcion2(this.evaluacionnomi.getdescripcion2());	
				evaluacionnomiAux.setdescripcion3(this.evaluacionnomi.getdescripcion3());	
				evaluacionnomiAux.setdescripcion4(this.evaluacionnomi.getdescripcion4());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.evaluacionnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(evaluacionnomiAux,evaluacionnomiLogic.getEvaluacionNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(evaluacionnomiAux,evaluacionnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.evaluacionnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiLogic.saveEvaluacionNomis();//WithConnection
						//evaluacionnomiLogic.getSetVersionRowEvaluacionNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.evaluacionnomi,evaluacionnomiAux);
					
					this.refrescarForeignKeysDescripcionesEvaluacionNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis.addAll(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								evaluacionnomiLogic.saveEvaluacionNomiRelaciones(evaluacionnomiAux,this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());//WithConnection
								//evaluacionnomiLogic.getSetVersionRowEvaluacionNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.evaluacionnomi,evaluacionnomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis= new ArrayList<DetalleEvaluacionNomi>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							evaluacionnomiAux.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.evaluacionnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(evaluacionnomiAux,evaluacionnomiLogic.getEvaluacionNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(evaluacionnomiAux,evaluacionnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.evaluacionnomi,evaluacionnomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				evaluacionnomiAux=new  EvaluacionNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado() 
					|| (this.evaluacionnomiSessionBean.getEsGuardarRelacionado() && this.evaluacionnomi.getId()>=0)) {
						
					evaluacionnomiAux.setIsNew(false);
				}
				
				evaluacionnomiAux.setIsDeleted(false);
			
				evaluacionnomiAux.setId(this.evaluacionnomi.getId());	
				evaluacionnomiAux.setVersionRow(this.evaluacionnomi.getVersionRow());	
				evaluacionnomiAux.setid_empresa(this.evaluacionnomi.getid_empresa());	
				evaluacionnomiAux.setid_sucursal(this.evaluacionnomi.getid_sucursal());	
				evaluacionnomiAux.setid_ejercicio(this.evaluacionnomi.getid_ejercicio());	
				evaluacionnomiAux.setid_periodo(this.evaluacionnomi.getid_periodo());	
				evaluacionnomiAux.setid_empleado(this.evaluacionnomi.getid_empleado());	
				evaluacionnomiAux.setid_empleado_evaluador(this.evaluacionnomi.getid_empleado_evaluador());	
				evaluacionnomiAux.setid_formato_nomi(this.evaluacionnomi.getid_formato_nomi());	
				evaluacionnomiAux.setid_estructura(this.evaluacionnomi.getid_estructura());	
				evaluacionnomiAux.setfecha(this.evaluacionnomi.getfecha());	
				evaluacionnomiAux.setinstrucciones(this.evaluacionnomi.getinstrucciones());	
				evaluacionnomiAux.setdescripcion(this.evaluacionnomi.getdescripcion());	
				evaluacionnomiAux.setdescripcion2(this.evaluacionnomi.getdescripcion2());	
				evaluacionnomiAux.setdescripcion3(this.evaluacionnomi.getdescripcion3());	
				evaluacionnomiAux.setdescripcion4(this.evaluacionnomi.getdescripcion4());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(evaluacionnomiAux,evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(evaluacionnomiAux,evaluacionnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.evaluacionnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiLogic.saveEvaluacionNomis();//WithConnection
						//evaluacionnomiLogic.getSetVersionRowEvaluacionNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.evaluacionnomi,evaluacionnomiAux);
					
					this.refrescarForeignKeysDescripcionesEvaluacionNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis.addAll(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								evaluacionnomiLogic.saveEvaluacionNomiRelaciones(evaluacionnomiAux,this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());//WithConnection
								//evaluacionnomiLogic.getSetVersionRowEvaluacionNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.evaluacionnomi,evaluacionnomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis= new ArrayList<DetalleEvaluacionNomi>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							evaluacionnomiAux.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.evaluacionnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(evaluacionnomiAux,evaluacionnomiLogic.getEvaluacionNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(evaluacionnomiAux,evaluacionnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.evaluacionnomi,evaluacionnomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				evaluacionnomiAux=new  EvaluacionNomi();
				
				evaluacionnomiAux.setIsNew(false);
				evaluacionnomiAux.setIsChanged(false);
				
				evaluacionnomiAux.setIsDeleted(true);
				
				evaluacionnomiAux.setId(this.evaluacionnomi.getId());	
				evaluacionnomiAux.setVersionRow(this.evaluacionnomi.getVersionRow());	
				evaluacionnomiAux.setid_empresa(this.evaluacionnomi.getid_empresa());	
				evaluacionnomiAux.setid_sucursal(this.evaluacionnomi.getid_sucursal());	
				evaluacionnomiAux.setid_ejercicio(this.evaluacionnomi.getid_ejercicio());	
				evaluacionnomiAux.setid_periodo(this.evaluacionnomi.getid_periodo());	
				evaluacionnomiAux.setid_empleado(this.evaluacionnomi.getid_empleado());	
				evaluacionnomiAux.setid_empleado_evaluador(this.evaluacionnomi.getid_empleado_evaluador());	
				evaluacionnomiAux.setid_formato_nomi(this.evaluacionnomi.getid_formato_nomi());	
				evaluacionnomiAux.setid_estructura(this.evaluacionnomi.getid_estructura());	
				evaluacionnomiAux.setfecha(this.evaluacionnomi.getfecha());	
				evaluacionnomiAux.setinstrucciones(this.evaluacionnomi.getinstrucciones());	
				evaluacionnomiAux.setdescripcion(this.evaluacionnomi.getdescripcion());	
				evaluacionnomiAux.setdescripcion2(this.evaluacionnomi.getdescripcion2());	
				evaluacionnomiAux.setdescripcion3(this.evaluacionnomi.getdescripcion3());	
				evaluacionnomiAux.setdescripcion4(this.evaluacionnomi.getdescripcion4());	
				
				if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.evaluacionnomiAux.getId()>=0) {	
						this.evaluacionnomisEliminados.add(evaluacionnomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(evaluacionnomiAux,evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(evaluacionnomiAux,evaluacionnomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.evaluacionnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiLogic.saveEvaluacionNomis();//WithConnection
						//evaluacionnomiLogic.getSetVersionRowEvaluacionNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis.addAll(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								evaluacionnomiLogic.saveEvaluacionNomiRelaciones(evaluacionnomiAux,this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());//WithConnection
								//evaluacionnomiLogic.getSetVersionRowEvaluacionNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis= new ArrayList<DetalleEvaluacionNomi>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							evaluacionnomiAux.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.evaluacionnomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(evaluacionnomiAux,evaluacionnomiLogic.getEvaluacionNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(evaluacionnomiAux,evaluacionnomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getEvaluacionNomis().addAll(this.evaluacionnomisEliminados);
					
					evaluacionnomiLogic.saveEvaluacionNomis();//WithConnection
					//evaluacionnomiLogic.getSetVersionRowEvaluacionNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEvaluacionNomi();
				
				this.evaluacionnomisEliminados= new ArrayList<EvaluacionNomi>();		
			}
			
			if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Evaluacion Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.evaluacionnomi=evaluacionnomiAux;
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
      		//this.finishProcessEvaluacionNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(EvaluacionNomi evaluacionnomiLocal) throws Exception {
		
		if(this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				evaluacionnomiLocal.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
			
			} else {
			
				evaluacionnomiLocal.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EvaluacionNomi evaluacionnomiLocal) throws Exception {	
		if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				evaluacionnomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				evaluacionnomiLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				evaluacionnomiLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				evaluacionnomiLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				evaluacionnomiLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoevaluadorBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoevaluadorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoevaluadorBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoevaluadorBeanSwingJInternalFrameLocal.actualizarLista(empleadoevaluadorBeanSwingJInternalFrameLocal.empleado,this.empleadoevaluadorsForeignKey);

				empleadoevaluadorBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoevaluadorBeanSwingJInternalFrameLocal.empleado);

				evaluacionnomiLocal.setEmpleadoEvaluador(empleadoevaluadorBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleadoEvaluador();
				this.cargarCombosFrameEmpleadoEvaluadorsForeignKey("Formulario");
				this.setActualEmpleadoEvaluadorForeignKey(empleadoevaluadorBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoNomiDetalleFormJInternalFrame.class)) {
				FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrameLocal=(FormatoNomiBeanSwingJInternalFrame) ((FormatoNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatonomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormatoNomi(formatonomiBeanSwingJInternalFrameLocal.getformatonomi(),true);
				formatonomiBeanSwingJInternalFrameLocal.actualizarLista(formatonomiBeanSwingJInternalFrameLocal.formatonomi,this.formatonomisForeignKey);

				formatonomiBeanSwingJInternalFrameLocal.actualizarRelaciones(formatonomiBeanSwingJInternalFrameLocal.formatonomi);

				evaluacionnomiLocal.setFormatoNomi(formatonomiBeanSwingJInternalFrameLocal.formatonomi);

				this.addItemDefectoCombosForeignKeyFormatoNomi();
				this.cargarCombosFrameFormatoNomisForeignKey("Formulario");
				this.setActualFormatoNomiForeignKey(formatonomiBeanSwingJInternalFrameLocal.formatonomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				evaluacionnomiLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEvaluacionNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = evaluacionnomiValidator.getInvalidValues(this.evaluacionnomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EvaluacionNomi evaluacionnomi,List<EvaluacionNomi> evaluacionnomis) throws Exception {
		try	{		
			EvaluacionNomiConstantesFunciones.actualizarLista(evaluacionnomi,evaluacionnomis,this.evaluacionnomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EvaluacionNomi evaluacionnomi,List<EvaluacionNomi> evaluacionnomis) throws Exception {
		try	{			
			EvaluacionNomiConstantesFunciones.actualizarSelectedLista(evaluacionnomi,evaluacionnomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EvaluacionNomi> evaluacionnomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				evaluacionnomisLocal=this.evaluacionnomiLogic.getEvaluacionNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				evaluacionnomisLocal=this.evaluacionnomis;
			}
			//ARCHITECTURE
		
			for(EvaluacionNomi evaluacionnomiLocal:evaluacionnomisLocal) {
				if(this.permiteMantenimiento(evaluacionnomiLocal) && evaluacionnomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EvaluacionNomiConstantesFunciones.getEvaluacionNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_empresaEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_sucursalEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_ejercicioEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_periodoEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_empleadoEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.IDEMPLEADOEVALUADOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_empleado_evaluadorEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.IDFORMATONOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_formato_nomiEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_estructuraEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelfechaEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.INSTRUCCIONES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelinstruccionesEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcionEvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.DESCRIPCION2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcion2EvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.DESCRIPCION3)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcion3EvaluacionNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionNomiConstantesFunciones.DESCRIPCION4)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcion4EvaluacionNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_empresaEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_sucursalEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_ejercicioEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_periodoEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_empleadoEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_empleado_evaluadorEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_formato_nomiEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelid_estructuraEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelfechaEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelinstruccionesEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcionEvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcion2EvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcion3EvaluacionNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcion4EvaluacionNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleEvaluacionNomi")) {
			if(this.evaluacionnomi==null) {
				this.evaluacionnomi= new EvaluacionNomi();
			}

			if(this.evaluacionnomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEvaluacionNomi
				this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);

				this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getdetalleevaluacionnomi().setEvaluacionNomi(this.evaluacionnomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEvaluacionNomi--;	
		
		
		this.evaluacionnomiAux=new EvaluacionNomi();
		
		this.evaluacionnomiAux.setId(this.iIdNuevoEvaluacionNomi);
		this.evaluacionnomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.evaluacionnomiLogic.getEvaluacionNomis().add(this.evaluacionnomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.evaluacionnomis.add(this.evaluacionnomiAux);
		}
		//ARCHITECTURE
		
		this.evaluacionnomi=this.evaluacionnomiAux;
		
		if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEvaluacionNomi(this.evaluacionnomi);
			this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionNomi(this.evaluacionnomi);
		}
				
		//this.setDefaultControlesEvaluacionNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEvaluacionNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEvaluacionNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEvaluacionNomi(this.evaluacionnomiBean,this.evaluacionnomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EvaluacionNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {
			classes=EvaluacionNomiConstantesFunciones.getClassesRelationshipsOfEvaluacionNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.evaluacionnomiReturnGeneral=evaluacionnomiLogic.procesarEventosEvaluacionNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionnomiLogic.getEvaluacionNomis(),this.evaluacionnomi,this.evaluacionnomiParameterGeneral,this.isEsNuevoEvaluacionNomi,classes);//this.evaluacionnomiLogic.getEvaluacionNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEvaluacionNomi(this.evaluacionnomiReturnGeneral,this.evaluacionnomiBean,false);
		
		if(this.evaluacionnomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionNomi(this.evaluacionnomiReturnGeneral.getEvaluacionNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEvaluacionNomi(this.evaluacionnomiReturnGeneral.getEvaluacionNomi());
		}
		
		if(this.evaluacionnomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEvaluacionNomi(this.evaluacionnomiReturnGeneral.getEvaluacionNomi(),classes);//this.evaluacionnomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEvaluacionNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEvaluacionNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.RecargarFormEvaluacionNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEvaluacionNomi(false);
						
			if(evaluacionnomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionNomiActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionNomi();
			}
			
			this.actualizarVisualTableDatosEvaluacionNomi();
			
			this.jTableDatosEvaluacionNomi.setRowSelectionInterval(this.getIndiceNuevoEvaluacionNomi(), this.getIndiceNuevoEvaluacionNomi());
			
			this.seleccionarFilaTablaEvaluacionNomiActual();
						
			this.actualizarEstadoCeldasBotonesEvaluacionNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEvaluacionNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jDateChooserfechaEvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activarfechaEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreainstruccionesEvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activarinstruccionesEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcionEvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activardescripcionEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion2EvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activardescripcion2EvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion3EvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activardescripcion3EvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion4EvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activardescripcion4EvaluacionNomi);	
		//
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activarid_empresaEvaluacionNomi);//
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activarid_sucursalEvaluacionNomi);//
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activarid_ejercicioEvaluacionNomi);//
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activarid_periodoEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activarid_empleadoEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activarid_empleado_evaluadorEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activarid_formato_nomiEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.setEnabled(isHabilitar && this.evaluacionnomiConstantesFunciones.activarid_estructuraEvaluacionNomi);
	};
	
	public void setDefaultControlesEvaluacionNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEvaluacionNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.evaluacionnomiSessionBean.setConGuardarRelaciones(true);			
			this.evaluacionnomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEvaluacionNomi.jTabbedPaneRelacionesEvaluacionNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.evaluacionnomiSessionBean.setConGuardarRelaciones(false);			
			this.evaluacionnomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEvaluacionNomi.jTabbedPaneRelacionesEvaluacionNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEvaluacionNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomiLogic.getEvaluacionNomis()) {
				if(evaluacionnomiAux.getId().equals(this.iIdNuevoEvaluacionNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomis) {
				if(evaluacionnomiAux.getId().equals(this.iIdNuevoEvaluacionNomi)) {
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
	
	public int getIndiceActualEvaluacionNomi(EvaluacionNomi evaluacionnomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomiLogic.getEvaluacionNomis()) {
				if(evaluacionnomiAux.getId().equals(evaluacionnomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomis) {
				if(evaluacionnomiAux.getId().equals(evaluacionnomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEvaluacionNomi(EvaluacionNomi evaluacionnomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomiLogic.getEvaluacionNomis()) {
				if(evaluacionnomiAux.getEvaluacionNomiOriginal().getId().equals(evaluacionnomiOriginal.getId())) {
					existe=true;
					evaluacionnomiOriginal.setId(evaluacionnomiAux.getId());
					evaluacionnomiOriginal.setVersionRow(evaluacionnomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomis) {
				if(evaluacionnomiAux.getEvaluacionNomiOriginal().getId().equals(evaluacionnomiOriginal.getId())) {
					existe=true;
					evaluacionnomiOriginal.setId(evaluacionnomiAux.getId());
					evaluacionnomiOriginal.setVersionRow(evaluacionnomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEvaluacionNomi(Boolean esParaCancelar) throws Exception {
		evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
		evaluacionnomiAux=new EvaluacionNomi();
		
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomiLogic.getEvaluacionNomis()) {
					if(evaluacionnomiAux.getId()<0) {
						evaluacionnomisAux.add(evaluacionnomiAux);
					}		
				}
				this.iIdNuevoEvaluacionNomi=0L;
				this.evaluacionnomiLogic.getEvaluacionNomis().removeAll(evaluacionnomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomis) {
					if(evaluacionnomiAux.getId()<0) {
						evaluacionnomisAux.add(evaluacionnomiAux);
					}		
				}
				this.iIdNuevoEvaluacionNomi=0L;
				this.evaluacionnomis.removeAll(evaluacionnomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEvaluacionNomi 
					&& this.evaluacionnomiLogic.getEvaluacionNomis().size()>0
					) {
					evaluacionnomiAux=this.evaluacionnomiLogic.getEvaluacionNomis().get(this.evaluacionnomiLogic.getEvaluacionNomis().size() - 1);
				
					if(evaluacionnomiAux.getId()<0) {
						this.evaluacionnomiLogic.getEvaluacionNomis().remove(evaluacionnomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEvaluacionNomi && this.evaluacionnomis.size()>0) {
					evaluacionnomiAux=this.evaluacionnomis.get(this.evaluacionnomis.size() - 1);
				
					if(evaluacionnomiAux.getId()<0) {
						this.evaluacionnomis.remove(evaluacionnomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEvaluacionNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(evaluacionnomi.getId()<0) {
				this.evaluacionnomiLogic.getEvaluacionNomis().remove(this.evaluacionnomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(evaluacionnomi.getId()<0) {
				this.evaluacionnomis.remove(this.evaluacionnomi);
			}
		}			
	}
	
	public void setEstadosInicialesEvaluacionNomi(List<EvaluacionNomi> evaluacionnomisAux) throws Exception {
		EvaluacionNomiConstantesFunciones.setEstadosInicialesEvaluacionNomi(evaluacionnomisAux);
	}
	
	public void setEstadosInicialesEvaluacionNomi(EvaluacionNomi evaluacionnomiAux) throws Exception {
		EvaluacionNomiConstantesFunciones.setEstadosInicialesEvaluacionNomi(evaluacionnomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEvaluacionNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEvaluacionNomiActual()) {
				if(!this.isEsNuevoEvaluacionNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEvaluacionNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEvaluacionNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Evaluacion Nomi ?", "MANTENIMIENTO DE Evaluacion Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EvaluacionNomi evaluacionnomi) throws Exception {
		EvaluacionNomiConstantesFunciones.seleccionarAsignar(this.evaluacionnomi,evaluacionnomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEvaluacionNomi=this.isPermisoActualizarOriginalEvaluacionNomi;
			
			
			this.seleccionarAsignar(evaluacionnomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EvaluacionNomiConstantesFunciones.quitarEspaciosEvaluacionNomi(this.evaluacionnomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEvaluacionNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.evaluacionnomiSessionBean.setsFuncionBusquedaRapida(this.evaluacionnomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEvaluacionNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEvaluacionNomi(esParaCancelar);				
				this.cancelarNuevoEvaluacionNomi(esParaCancelar);								
			}
			
			this.evaluacionnomi=new EvaluacionNomi();
			
			this.inicializarEvaluacionNomi();
			
			this.actualizarEstadoCeldasBotonesEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEvaluacionNomi() throws Exception {
		try {
			EvaluacionNomiConstantesFunciones.inicializarEvaluacionNomi(this.evaluacionnomi);
			
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
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.evaluacionnomiLogic.getEvaluacionNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEvaluacionNomis(String sAccionBusqueda,List<EvaluacionNomi> evaluacionnomisParaReportes) throws Exception {
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
					sPathReporteFinal="EvaluacionNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EvaluacionNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EvaluacionNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EvaluacionNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Evaluacion Nomis");		
		parameters.put("busquedapor", EvaluacionNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleEvaluacionNomi.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EvaluacionNomiLogic evaluacionnomiLogicAuxiliar=new EvaluacionNomiLogic();
					evaluacionnomiLogicAuxiliar.setDatosCliente(evaluacionnomiLogic.getDatosCliente());				
					evaluacionnomiLogicAuxiliar.setEvaluacionNomis(evaluacionnomisParaReportes);
					
					evaluacionnomiLogicAuxiliar.cargarRelacionesLoteForeignKeyEvaluacionNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					evaluacionnomisParaReportes=evaluacionnomiLogicAuxiliar.getEvaluacionNomis();
					
					//evaluacionnomiLogic.getNewConnexionToDeep();
					
					//for (EvaluacionNomi evaluacionnomi:evaluacionnomisParaReportes) {
					//	evaluacionnomiLogic.deepLoad(evaluacionnomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//evaluacionnomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//evaluacionnomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleEvaluacionNomi = AuxiliarReportes.class.getResourceAsStream("DetalleEvaluacionNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleevaluacionnomi", reportFileDetalleEvaluacionNomi);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEvaluacionNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EvaluacionNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EvaluacionNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEvaluacionNomi=new JRBeanArrayDataSource(EvaluacionNomiJInternalFrame.TraerEvaluacionNomiBeans(evaluacionnomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEvaluacionNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EvaluacionNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EvaluacionNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EvaluacionNomiBean.TraerEvaluacionNomiBeans(evaluacionnomisParaReportes).toArray()));
							
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
				this.generarExcelReporteEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,evaluacionnomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,evaluacionnomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEvaluacionNomiActionPerformed(null);
					//this.generarExcelReporteEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,evaluacionnomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,evaluacionnomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,evaluacionnomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEvaluacionNomis(sAccionBusqueda,sTipoArchivoReporte,evaluacionnomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEvaluacionNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionNomi> evaluacionnomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionnomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEvaluacionNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EvaluacionNomi evaluacionnomi : evaluacionnomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EvaluacionNomiConstantesFunciones.generarExcelReporteDataEvaluacionNomi("NORMAL",row,workbook,evaluacionnomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEvaluacionNomi(String sTipo,Row row,Workbook workbook) {
		
		EvaluacionNomiConstantesFunciones.generarExcelReporteHeaderEvaluacionNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEvaluacionNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionNomi> evaluacionnomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionnomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EvaluacionNomi evaluacionnomi : evaluacionnomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EvaluacionNomiConstantesFunciones.getEvaluacionNomiDescripcion(evaluacionnomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getempleadoevaluador_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getformatonomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getinstrucciones());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getdescripcion2());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getdescripcion3());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionnomi.getdescripcion4());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEvaluacionNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionNomi> evaluacionnomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EvaluacionNomi> evaluacionnomisRespaldo=null;
		
		classes=EvaluacionNomiConstantesFunciones.getClassesRelationshipsOfEvaluacionNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.evaluacionnomiLogic.setDatosCliente(this.datosCliente);
		this.evaluacionnomiLogic.setDatosDeep(this.datosDeep);
		this.evaluacionnomiLogic.setIsConDeep(true);
		
		evaluacionnomisRespaldo=this.evaluacionnomiLogic.getEvaluacionNomis();
		
		this.evaluacionnomiLogic.setEvaluacionNomis(evaluacionnomisParaReportes);	
		this.evaluacionnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		evaluacionnomisParaReportes=this.evaluacionnomiLogic.getEvaluacionNomis();
		this.evaluacionnomiLogic.setEvaluacionNomis(evaluacionnomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionnomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEvaluacionNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EvaluacionNomi evaluacionnomi : evaluacionnomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEvaluacionNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EvaluacionNomiConstantesFunciones.generarExcelReporteDataEvaluacionNomi("NORMAL",row,workbook,evaluacionnomi,cellStyleDataAux);
		
			
			


				//DetalleEvaluacionNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(evaluacionnomi.getDetalleEvaluacionNomis()!=null && evaluacionnomi.getDetalleEvaluacionNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleEvaluacionNomiConstantesFunciones.generarExcelReporteHeaderDetalleEvaluacionNomi("RELACIONADO",row,workbook);
				}

				if(evaluacionnomi.getDetalleEvaluacionNomis()!=null) {
					i2=0;
					for(DetalleEvaluacionNomi detalleevaluacionnomi : evaluacionnomi.getDetalleEvaluacionNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleEvaluacionNomiConstantesFunciones.generarExcelReporteDataDetalleEvaluacionNomi("RELACIONADO",row,workbook,detalleevaluacionnomi,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EvaluacionNomiConstantesFunciones.getEvaluacionNomiDescripcion(evaluacionnomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEvaluacionNomi() throws Exception {		
		this.startProcessEvaluacionNomi(true);
	}
	
	public void startProcessEvaluacionNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEvaluacionNomi ,this.jPanelParametrosReportesEvaluacionNomi, this.jScrollPanelDatosEvaluacionNomi,this.jPanelPaginacionEvaluacionNomi, this.jScrollPanelDatosEdicionEvaluacionNomi, this.jPanelAccionesEvaluacionNomi,this.jPanelAccionesFormularioEvaluacionNomi,this.jmenuBarEvaluacionNomi,this.jmenuBarDetalleEvaluacionNomi,this.jTtoolBarEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasEvaluacionNomi=this.jTabbedPaneBusquedasEvaluacionNomi; 
		
		final JPanel jPanelParametrosReportesEvaluacionNomi=this.jPanelParametrosReportesEvaluacionNomi;
		//final JScrollPane jScrollPanelDatosEvaluacionNomi=this.jScrollPanelDatosEvaluacionNomi;
		final JTable jTableDatosEvaluacionNomi=this.jTableDatosEvaluacionNomi;		
		final JPanel jPanelPaginacionEvaluacionNomi=this.jPanelPaginacionEvaluacionNomi;
		//final JScrollPane jScrollPanelDatosEdicionEvaluacionNomi=this.jScrollPanelDatosEdicionEvaluacionNomi;
		final JPanel jPanelAccionesEvaluacionNomi=this.jPanelAccionesEvaluacionNomi;
		
		JPanel jPanelCamposAuxiliarEvaluacionNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEvaluacionNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			jPanelCamposAuxiliarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jPanelCamposEvaluacionNomi;
			jPanelAccionesFormularioAuxiliarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jPanelAccionesFormularioEvaluacionNomi;
		}
		
		final JPanel jPanelCamposEvaluacionNomi=jPanelCamposAuxiliarEvaluacionNomi;
		final JPanel jPanelAccionesFormularioEvaluacionNomi=jPanelAccionesFormularioAuxiliarEvaluacionNomi;
		
		
		final JMenuBar jmenuBarEvaluacionNomi=this.jmenuBarEvaluacionNomi;
		final JToolBar jTtoolBarEvaluacionNomi=this.jTtoolBarEvaluacionNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEvaluacionNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEvaluacionNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			jmenuBarDetalleAuxiliarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jmenuBarDetalleEvaluacionNomi;
			jTtoolBarDetalleAuxiliarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jTtoolBarDetalleEvaluacionNomi;
		}
		
		final JMenuBar jmenuBarDetalleEvaluacionNomi=jmenuBarDetalleAuxiliarEvaluacionNomi;
		final JToolBar jTtoolBarDetalleEvaluacionNomi=jTtoolBarDetalleAuxiliarEvaluacionNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEvaluacionNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEvaluacionNomi;
			processRunnable.jTableDatos=jTableDatosEvaluacionNomi;
			processRunnable.jPanelCampos=jPanelCamposEvaluacionNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionEvaluacionNomi;
			processRunnable.jPanelAcciones=jPanelAccionesEvaluacionNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEvaluacionNomi;
			
			
			processRunnable.jmenuBar=jmenuBarEvaluacionNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEvaluacionNomi;
			processRunnable.jTtoolBar=jTtoolBarEvaluacionNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEvaluacionNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEvaluacionNomi ,jPanelParametrosReportesEvaluacionNomi,jTableDatosEvaluacionNomi, /*jScrollPanelDatosEvaluacionNomi,*/jPanelCamposEvaluacionNomi,jPanelPaginacionEvaluacionNomi, /*jScrollPanelDatosEdicionEvaluacionNomi,*/ jPanelAccionesEvaluacionNomi,jPanelAccionesFormularioEvaluacionNomi,jmenuBarEvaluacionNomi,jmenuBarDetalleEvaluacionNomi,jTtoolBarEvaluacionNomi,jTtoolBarDetalleEvaluacionNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEvaluacionNomi ,jPanelParametrosReportesEvaluacionNomi, jScrollPanelDatosEvaluacionNomi,jPanelPaginacionEvaluacionNomi, jScrollPanelDatosEdicionEvaluacionNomi, jPanelAccionesEvaluacionNomi,jPanelAccionesFormularioEvaluacionNomi,jmenuBarEvaluacionNomi,jmenuBarDetalleEvaluacionNomi,jTtoolBarEvaluacionNomi,jTtoolBarDetalleEvaluacionNomi);
						
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
	
	public void finishProcessEvaluacionNomi() {// throws Exception 
		this.finishProcessEvaluacionNomi(true);
	}
	
	public void finishProcessEvaluacionNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEvaluacionNomi ,this.jPanelParametrosReportesEvaluacionNomi, this.jScrollPanelDatosEvaluacionNomi,this.jPanelPaginacionEvaluacionNomi, this.jScrollPanelDatosEdicionEvaluacionNomi, this.jPanelAccionesEvaluacionNomi,this.jPanelAccionesFormularioEvaluacionNomi,this.jmenuBarEvaluacionNomi,this.jmenuBarDetalleEvaluacionNomi,this.jTtoolBarEvaluacionNomi,this.jTtoolBarDetalleEvaluacionNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasEvaluacionNomi=this.jTabbedPaneBusquedasEvaluacionNomi; 
		
		final JPanel jPanelParametrosReportesEvaluacionNomi=this.jPanelParametrosReportesEvaluacionNomi;
		//final JScrollPane jScrollPanelDatosEvaluacionNomi=this.jScrollPanelDatosEvaluacionNomi;
		final JTable jTableDatosEvaluacionNomi=this.jTableDatosEvaluacionNomi;		
		final JPanel jPanelPaginacionEvaluacionNomi=this.jPanelPaginacionEvaluacionNomi;
		//final JScrollPane jScrollPanelDatosEdicionEvaluacionNomi=this.jScrollPanelDatosEdicionEvaluacionNomi;
		final JPanel jPanelAccionesEvaluacionNomi=this.jPanelAccionesEvaluacionNomi;
		
		JPanel jPanelCamposAuxiliarEvaluacionNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEvaluacionNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			jPanelCamposAuxiliarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jPanelCamposEvaluacionNomi;
			jPanelAccionesFormularioAuxiliarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jPanelAccionesFormularioEvaluacionNomi;
		}
		
		final JPanel jPanelCamposEvaluacionNomi=jPanelCamposAuxiliarEvaluacionNomi;
		final JPanel jPanelAccionesFormularioEvaluacionNomi=jPanelAccionesFormularioAuxiliarEvaluacionNomi;
		
		
		final JMenuBar jmenuBarEvaluacionNomi=this.jmenuBarEvaluacionNomi;		
		final JToolBar jTtoolBarEvaluacionNomi=this.jTtoolBarEvaluacionNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarEvaluacionNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEvaluacionNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			jmenuBarDetalleAuxiliarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jmenuBarDetalleEvaluacionNomi;
			jTtoolBarDetalleAuxiliarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jTtoolBarDetalleEvaluacionNomi;		
		}
		
		final JMenuBar jmenuBarDetalleEvaluacionNomi=jmenuBarDetalleAuxiliarEvaluacionNomi;
		final JToolBar jTtoolBarDetalleEvaluacionNomi=jTtoolBarDetalleAuxiliarEvaluacionNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEvaluacionNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEvaluacionNomi;
			processRunnable.jTableDatos=jTableDatosEvaluacionNomi;
			processRunnable.jPanelCampos=jPanelCamposEvaluacionNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionEvaluacionNomi;
			processRunnable.jPanelAcciones=jPanelAccionesEvaluacionNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEvaluacionNomi;
			
			
			processRunnable.jmenuBar=jmenuBarEvaluacionNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEvaluacionNomi;
			processRunnable.jTtoolBar=jTtoolBarEvaluacionNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEvaluacionNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEvaluacionNomi ,jPanelParametrosReportesEvaluacionNomi, jTableDatosEvaluacionNomi,/*jScrollPanelDatosEvaluacionNomi,*/jPanelCamposEvaluacionNomi,jPanelPaginacionEvaluacionNomi, /*jScrollPanelDatosEdicionEvaluacionNomi,*/ jPanelAccionesEvaluacionNomi,jPanelAccionesFormularioEvaluacionNomi,jmenuBarEvaluacionNomi,jmenuBarDetalleEvaluacionNomi,jTtoolBarEvaluacionNomi,jTtoolBarDetalleEvaluacionNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEvaluacionNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEvaluacionNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEvaluacionNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEvaluacionNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEvaluacionNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEvaluacionNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEvaluacionNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEvaluacionNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEvaluacionNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.evaluacionnomiConstantesFunciones.getsFinalQueryEvaluacionNomi();
		String  finalQueryPaginacionTodos=this.evaluacionnomiConstantesFunciones.getsFinalQueryEvaluacionNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EvaluacionNomiConstantesFunciones.getArrayColumnasGlobalesNoEvaluacionNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EvaluacionNomiConstantesFunciones.getArrayColumnasGlobalesEvaluacionNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EvaluacionNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.evaluacionnomisEliminados= new ArrayList<EvaluacionNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEvaluacionNomi();
		
				///*EvaluacionNomiSessionBean*/this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			
			if(this.evaluacionnomiSessionBean==null) {
				this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
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
					this.iNumeroPaginacion=EvaluacionNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EvaluacionNomiConstantesFunciones.getClassesForeignKeysOfEvaluacionNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/evaluacionnomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			evaluacionnomisAux= new ArrayList<EvaluacionNomi>();
			
				
			evaluacionnomiLogic.setDatosCliente(this.datosCliente);
			evaluacionnomiLogic.setDatosDeep(this.datosDeep);
			evaluacionnomiLogic.setIsConDeep(true);
			
			
			evaluacionnomiLogic.getEvaluacionNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					evaluacionnomiLogic.getTodosEvaluacionNomis(finalQueryGlobal,pagination);
					
					//evaluacionnomiLogic.getTodosEvaluacionNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(evaluacionnomiLogic.getEvaluacionNomis()==null|| evaluacionnomiLogic.getEvaluacionNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							evaluacionnomisAux= new ArrayList<EvaluacionNomi>();
							evaluacionnomisAux.addAll(evaluacionnomiLogic.getEvaluacionNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomisAux= new ArrayList<EvaluacionNomi>();
							evaluacionnomisAux.addAll(evaluacionnomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							evaluacionnomiLogic.getTodosEvaluacionNomis(finalQueryGlobal+"",this.pagination);												
							
							//evaluacionnomiLogic.getTodosEvaluacionNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEvaluacionNomis("Todos",evaluacionnomiLogic.getEvaluacionNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());					
							evaluacionnomiLogic.getEvaluacionNomis().addAll(evaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomis=new ArrayList<EvaluacionNomi>();
							evaluacionnomis.addAll(evaluacionnomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEvaluacionNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEvaluacionNomi=this.idActual;
				
				} else if(this.idEvaluacionNomiActual!=null && this.idEvaluacionNomiActual!=0L) {
					idEvaluacionNomi=idEvaluacionNomiActual;
				}
				
					
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndicePorId(idEvaluacionNomi);
				
				this.evaluacionnomis=new ArrayList<EvaluacionNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					evaluacionnomiLogic.getEntity(idEvaluacionNomi);
					
					//evaluacionnomiLogic.getEntityWithConnection(idEvaluacionNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
					evaluacionnomiLogic.getEvaluacionNomis().add(evaluacionnomiLogic.getEvaluacionNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionnomis=new ArrayList<EvaluacionNomi>();
					this.evaluacionnomis.add(evaluacionnomi);
				}
				
				if(evaluacionnomiLogic.getEvaluacionNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionnomiLogic.getEvaluacionNomisFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionnomiLogic.getEvaluacionNomis()==null||evaluacionnomiLogic.getEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionnomis==null|| evaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
						evaluacionnomisAux.addAll(evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
							evaluacionnomisAux.addAll(evaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionnomiLogic.getEvaluacionNomisFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionNomis("FK_IdEjercicio",evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionNomis("FK_IdEjercicio",evaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
						evaluacionnomiLogic.getEvaluacionNomis().addAll(evaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomis=new ArrayList<EvaluacionNomi>();
							evaluacionnomis.addAll(evaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionnomiLogic.getEvaluacionNomisFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionnomiLogic.getEvaluacionNomis()==null||evaluacionnomiLogic.getEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionnomis==null|| evaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
						evaluacionnomisAux.addAll(evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
							evaluacionnomisAux.addAll(evaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionnomiLogic.getEvaluacionNomisFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionNomis("FK_IdEmpleado",evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionNomis("FK_IdEmpleado",evaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
						evaluacionnomiLogic.getEvaluacionNomis().addAll(evaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomis=new ArrayList<EvaluacionNomi>();
							evaluacionnomis.addAll(evaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleadoEvaluador")) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleadoEvaluador(id_empleado_evaluadorFK_IdEmpleadoEvaluador);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionnomiLogic.getEvaluacionNomisFK_IdEmpleadoEvaluador(finalQueryGlobal,pagination,id_empleado_evaluadorFK_IdEmpleadoEvaluador);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleadoEvaluador(id_empleado_evaluadorFK_IdEmpleadoEvaluador);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleadoEvaluador(id_empleado_evaluadorFK_IdEmpleadoEvaluador);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionnomiLogic.getEvaluacionNomis()==null||evaluacionnomiLogic.getEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionnomis==null|| evaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
						evaluacionnomisAux.addAll(evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
							evaluacionnomisAux.addAll(evaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionnomiLogic.getEvaluacionNomisFK_IdEmpleadoEvaluador(finalQueryGlobal,pagination,id_empleado_evaluadorFK_IdEmpleadoEvaluador);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleadoEvaluador(id_empleado_evaluadorFK_IdEmpleadoEvaluador);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleadoEvaluador(id_empleado_evaluadorFK_IdEmpleadoEvaluador);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionNomis("FK_IdEmpleadoEvaluador",evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionNomis("FK_IdEmpleadoEvaluador",evaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
						evaluacionnomiLogic.getEvaluacionNomis().addAll(evaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomis=new ArrayList<EvaluacionNomi>();
							evaluacionnomis.addAll(evaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionnomiLogic.getEvaluacionNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionnomiLogic.getEvaluacionNomis()==null||evaluacionnomiLogic.getEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionnomis==null|| evaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
						evaluacionnomisAux.addAll(evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
							evaluacionnomisAux.addAll(evaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionnomiLogic.getEvaluacionNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionNomis("FK_IdEmpresa",evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionNomis("FK_IdEmpresa",evaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
						evaluacionnomiLogic.getEvaluacionNomis().addAll(evaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomis=new ArrayList<EvaluacionNomi>();
							evaluacionnomis.addAll(evaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionnomiLogic.getEvaluacionNomisFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionnomiLogic.getEvaluacionNomis()==null||evaluacionnomiLogic.getEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionnomis==null|| evaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
						evaluacionnomisAux.addAll(evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
							evaluacionnomisAux.addAll(evaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionnomiLogic.getEvaluacionNomisFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionNomis("FK_IdEstructura",evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionNomis("FK_IdEstructura",evaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
						evaluacionnomiLogic.getEvaluacionNomis().addAll(evaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomis=new ArrayList<EvaluacionNomi>();
							evaluacionnomis.addAll(evaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFormatoNomi")) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionnomiLogic.getEvaluacionNomisFK_IdFormatoNomi(finalQueryGlobal,pagination,id_formato_nomiFK_IdFormatoNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionnomiLogic.getEvaluacionNomis()==null||evaluacionnomiLogic.getEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionnomis==null|| evaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
						evaluacionnomisAux.addAll(evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
							evaluacionnomisAux.addAll(evaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionnomiLogic.getEvaluacionNomisFK_IdFormatoNomi(finalQueryGlobal,pagination,id_formato_nomiFK_IdFormatoNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionNomis("FK_IdFormatoNomi",evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionNomis("FK_IdFormatoNomi",evaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
						evaluacionnomiLogic.getEvaluacionNomis().addAll(evaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomis=new ArrayList<EvaluacionNomi>();
							evaluacionnomis.addAll(evaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionnomiLogic.getEvaluacionNomisFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionnomiLogic.getEvaluacionNomis()==null||evaluacionnomiLogic.getEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionnomis==null|| evaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
						evaluacionnomisAux.addAll(evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
							evaluacionnomisAux.addAll(evaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionnomiLogic.getEvaluacionNomisFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionNomis("FK_IdPeriodo",evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionNomis("FK_IdPeriodo",evaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
						evaluacionnomiLogic.getEvaluacionNomis().addAll(evaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomis=new ArrayList<EvaluacionNomi>();
							evaluacionnomis.addAll(evaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionnomiLogic.getEvaluacionNomisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionnomiLogic.getEvaluacionNomis()==null||evaluacionnomiLogic.getEvaluacionNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionnomis==null|| evaluacionnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
						evaluacionnomisAux.addAll(evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomisAux=new ArrayList<EvaluacionNomi>();
							evaluacionnomisAux.addAll(evaluacionnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionnomiLogic.getEvaluacionNomisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionNomis("FK_IdSucursal",evaluacionnomiLogic.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionNomis("FK_IdSucursal",evaluacionnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
						evaluacionnomiLogic.getEvaluacionNomis().addAll(evaluacionnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomis=new ArrayList<EvaluacionNomi>();
							evaluacionnomis.addAll(evaluacionnomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEvaluacionNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEvaluacionNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=evaluacionnomiLogic.getEvaluacionNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionnomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=evaluacionnomiLogic.getEvaluacionNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionnomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EvaluacionNomi evaluacionnomi) {
		Boolean permite=true;
		
		if(this.evaluacionnomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EvaluacionNomiConstantesFunciones.getOrderByListaEvaluacionNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EvaluacionNomiConstantesFunciones.getOrderByListaEvaluacionNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionNomi evaluacionnomi:evaluacionnomiLogic.getEvaluacionNomis()) {
				if(evaluacionnomi.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionnomiTotales=evaluacionnomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionNomi evaluacionnomi:this.evaluacionnomis) {
				if(evaluacionnomi.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionnomiTotales=evaluacionnomi;
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
			this.evaluacionnomiAux=new EvaluacionNomi();
			this.evaluacionnomiAux.setsType(Constantes2.S_TOTALES);
			this.evaluacionnomiAux.setIsNew(false);
			this.evaluacionnomiAux.setIsChanged(false);
			this.evaluacionnomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EvaluacionNomiConstantesFunciones.TotalizarValoresFilaEvaluacionNomi(this.evaluacionnomiLogic.getEvaluacionNomis(),this.evaluacionnomiAux);
				
				this.evaluacionnomiLogic.getEvaluacionNomis().add(this.evaluacionnomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EvaluacionNomiConstantesFunciones.TotalizarValoresFilaEvaluacionNomi(this.evaluacionnomis,this.evaluacionnomiAux);
				
				this.evaluacionnomis.add(this.evaluacionnomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		evaluacionnomiTotales=new EvaluacionNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.evaluacionnomiLogic.getEvaluacionNomis().remove(evaluacionnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.evaluacionnomis.remove(evaluacionnomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		evaluacionnomiTotales=new EvaluacionNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionNomi evaluacionnomi:evaluacionnomiLogic.getEvaluacionNomis()) {
				if(evaluacionnomi.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionnomiTotales=evaluacionnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EvaluacionNomiConstantesFunciones.TotalizarValoresFilaEvaluacionNomi(this.evaluacionnomiLogic.getEvaluacionNomis(),evaluacionnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionNomi evaluacionnomi:this.evaluacionnomis) {
				if(evaluacionnomi.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionnomiTotales=evaluacionnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EvaluacionNomiConstantesFunciones.TotalizarValoresFilaEvaluacionNomi(this.evaluacionnomis,evaluacionnomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEvaluacionNomisFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionNomisFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionNomisFK_IdEmpleadoEvaluador()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleadoEvaluador";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionNomisFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionNomisFK_IdFormatoNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormatoNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionNomisFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionNomisFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEvaluacionNomisFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionnomiLogic.getEvaluacionNomisFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionNomisFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionnomiLogic.getEvaluacionNomisFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionNomisFK_IdEmpleadoEvaluador(String sFinalQuery,Long id_empleado_evaluador)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionnomiLogic.getEvaluacionNomisFK_IdEmpleadoEvaluador(sFinalQuery,this.pagination,id_empleado_evaluador);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionnomiLogic.getEvaluacionNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionNomisFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionnomiLogic.getEvaluacionNomisFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionNomisFK_IdFormatoNomi(String sFinalQuery,Long id_formato_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionnomiLogic.getEvaluacionNomisFK_IdFormatoNomi(sFinalQuery,this.pagination,id_formato_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionNomisFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionnomiLogic.getEvaluacionNomisFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionNomisFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionnomiLogic.getEvaluacionNomisFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosEvaluacionNomi() {
		this.isPermisoTodoEvaluacionNomi=false;
		this.isPermisoNuevoEvaluacionNomi=false;
		this.isPermisoActualizarEvaluacionNomi=false;
		this.isPermisoActualizarOriginalEvaluacionNomi=false;
		this.isPermisoEliminarEvaluacionNomi=false;
		this.isPermisoGuardarCambiosEvaluacionNomi=false;
		this.isPermisoConsultaEvaluacionNomi=false;
		this.isPermisoBusquedaEvaluacionNomi=false;
		this.isPermisoReporteEvaluacionNomi=false;		
		this.isPermisoOrdenEvaluacionNomi=false;		
		this.isPermisoPaginacionMedioEvaluacionNomi=false;		
		this.isPermisoPaginacionAltoEvaluacionNomi=false;
		this.isPermisoPaginacionTodoEvaluacionNomi=false;
		this.isPermisoCopiarEvaluacionNomi=false;		
		this.isPermisoVerFormEvaluacionNomi=false;		
		this.isPermisoDuplicarEvaluacionNomi=false;		
		this.isPermisoOrdenEvaluacionNomi=false;		
	}
	
	public void setPermisosUsuarioEvaluacionNomi(Boolean isPermiso) {
		this.isPermisoTodoEvaluacionNomi=isPermiso;
		this.isPermisoNuevoEvaluacionNomi=isPermiso;
		this.isPermisoActualizarEvaluacionNomi=isPermiso;
		this.isPermisoActualizarOriginalEvaluacionNomi=isPermiso;
		this.isPermisoEliminarEvaluacionNomi=isPermiso;
		this.isPermisoGuardarCambiosEvaluacionNomi=isPermiso;
		this.isPermisoConsultaEvaluacionNomi=isPermiso;
		this.isPermisoBusquedaEvaluacionNomi=isPermiso;
		this.isPermisoReporteEvaluacionNomi=isPermiso;
		this.isPermisoOrdenEvaluacionNomi=isPermiso;		
		this.isPermisoPaginacionMedioEvaluacionNomi=isPermiso;		
		this.isPermisoPaginacionAltoEvaluacionNomi=isPermiso;		
		this.isPermisoPaginacionTodoEvaluacionNomi=isPermiso;		
		this.isPermisoCopiarEvaluacionNomi=isPermiso;		
		this.isPermisoVerFormEvaluacionNomi=isPermiso;		
		this.isPermisoDuplicarEvaluacionNomi=isPermiso;
		this.isPermisoOrdenEvaluacionNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEvaluacionNomi(Boolean isPermiso) {
		//this.isPermisoTodoEvaluacionNomi=isPermiso;
		this.isPermisoNuevoEvaluacionNomi=isPermiso;
		this.isPermisoActualizarEvaluacionNomi=isPermiso;
		this.isPermisoActualizarOriginalEvaluacionNomi=isPermiso;
		this.isPermisoEliminarEvaluacionNomi=isPermiso;
		this.isPermisoGuardarCambiosEvaluacionNomi=isPermiso;
		//this.isPermisoConsultaEvaluacionNomi=isPermiso;
		//this.isPermisoBusquedaEvaluacionNomi=isPermiso;
		//this.isPermisoReporteEvaluacionNomi=isPermiso;
		//this.isPermisoOrdenEvaluacionNomi=isPermiso;		
		//this.isPermisoPaginacionMedioEvaluacionNomi=isPermiso;		
		//this.isPermisoPaginacionAltoEvaluacionNomi=isPermiso;		
		//this.isPermisoPaginacionTodoEvaluacionNomi=isPermiso;		
		//this.isPermisoCopiarEvaluacionNomi=isPermiso;		
		//this.isPermisoDuplicarEvaluacionNomi=isPermiso;
		//this.isPermisoOrdenEvaluacionNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEvaluacionNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION);
		
		if(EvaluacionNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleEvaluacionNomi=false;
		this.isTienePermisosDetalleEvaluacionNomi=this.verificarGetPermisosUsuarioOpcionEvaluacionNomiClaseRelacionada(this.opcionsRelacionadas,DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEvaluacionNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEvaluacionNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleEvaluacionNomi=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEvaluacionNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEvaluacionNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEvaluacionNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleEvaluacionNomi && this.jInternalFrameDetalleFormEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jTabbedPaneRelacionesEvaluacionNomi.remove(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEvaluacionNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EvaluacionNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EvaluacionNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEvaluacionNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEvaluacionNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEvaluacionNomi=this.isPermisoActualizarEvaluacionNomi;
			this.isPermisoEliminarEvaluacionNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEvaluacionNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEvaluacionNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEvaluacionNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEvaluacionNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEvaluacionNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEvaluacionNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEvaluacionNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEvaluacionNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEvaluacionNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEvaluacionNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEvaluacionNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEvaluacionNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEvaluacionNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEvaluacionNomi.setToolTipText(this.jTableDatosEvaluacionNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEvaluacionNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEvaluacionNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EvaluacionNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EvaluacionNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEvaluacionNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleEvaluacionNomi && this.evaluacionnomiConstantesFunciones.mostrarDetalleEvaluacionNomiEvaluacionNomi && !EvaluacionNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Evaluacion Nomi");
			reporte.setsDescripcion("Detalle Evaluacion Nomi");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyEvaluacionNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.empleadoevaluadorsForeignKey=new ArrayList();
				this.formatonomisForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEvaluacionNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EvaluacionNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEvaluacionNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoEvaluadorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpleadoEvaluadorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadoevaluadorsForeignKey==null||this.empleadoevaluadorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadoEvaluadorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatonomisForeignKey==null||this.formatonomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatoNomisForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyEvaluacionNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EvaluacionNomiParameterReturnGeneral evaluacionnomiReturnGeneral=new EvaluacionNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.evaluacionnomiConstantesFunciones.cargarid_empresaEvaluacionNomi)
					 || (this.esRecargarFks && this.evaluacionnomiConstantesFunciones.cargarid_empresaEvaluacionNomi)) {

					if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+evaluacionnomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.evaluacionnomiConstantesFunciones.cargarid_sucursalEvaluacionNomi)
					 || (this.esRecargarFks && this.evaluacionnomiConstantesFunciones.cargarid_sucursalEvaluacionNomi)) {

					if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+evaluacionnomiSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.evaluacionnomiConstantesFunciones.cargarid_ejercicioEvaluacionNomi)
					 || (this.esRecargarFks && this.evaluacionnomiConstantesFunciones.cargarid_ejercicioEvaluacionNomi)) {

					if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+evaluacionnomiSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.evaluacionnomiConstantesFunciones.cargarid_periodoEvaluacionNomi)
					 || (this.esRecargarFks && this.evaluacionnomiConstantesFunciones.cargarid_periodoEvaluacionNomi)) {

					if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+evaluacionnomiSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.evaluacionnomiConstantesFunciones.cargarid_empleadoEvaluacionNomi)
					 || (this.esRecargarFks && this.evaluacionnomiConstantesFunciones.cargarid_empleadoEvaluacionNomi)) {

					if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+evaluacionnomiSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEmpleadoEvaluador="";

				if(((this.empleadoevaluadorsForeignKey==null||this.empleadoevaluadorsForeignKey.size()<=0) && this.evaluacionnomiConstantesFunciones.cargarid_empleado_evaluadorEvaluacionNomi)
					 || (this.esRecargarFks && this.evaluacionnomiConstantesFunciones.cargarid_empleado_evaluadorEvaluacionNomi)) {

					if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoEvaluador()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleadoEvaluador=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleadoEvaluador=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleadoEvaluador, "");
						finalQueryGlobalEmpleadoEvaluador+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadoEvaluadorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleadoEvaluador=" WHERE " + ConstantesSql.ID + "="+evaluacionnomiSessionBean.getlidEmpleadoEvaluadorActual();
					}
				} else {
					finalQueryGlobalEmpleadoEvaluador="NONE";
				}


				String finalQueryGlobalFormatoNomi="";

				if(((this.formatonomisForeignKey==null||this.formatonomisForeignKey.size()<=0) && this.evaluacionnomiConstantesFunciones.cargarid_formato_nomiEvaluacionNomi)
					 || (this.esRecargarFks && this.evaluacionnomiConstantesFunciones.cargarid_formato_nomiEvaluacionNomi)) {

					if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormatoNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalFormatoNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalFormatoNomi, "");
						finalQueryGlobalFormatoNomi+=FormatoNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatoNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormatoNomi=" WHERE " + ConstantesSql.ID + "="+evaluacionnomiSessionBean.getlidFormatoNomiActual();
					}
				} else {
					finalQueryGlobalFormatoNomi="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.evaluacionnomiConstantesFunciones.cargarid_estructuraEvaluacionNomi)
					 || (this.esRecargarFks && this.evaluacionnomiConstantesFunciones.cargarid_estructuraEvaluacionNomi)) {

					if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+evaluacionnomiSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				evaluacionnomiReturnGeneral=evaluacionnomiLogic.cargarCombosLoteForeignKeyEvaluacionNomi(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalEmpleado,finalQueryGlobalEmpleadoEvaluador,finalQueryGlobalFormatoNomi,finalQueryGlobalEstructura);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=evaluacionnomiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=evaluacionnomiReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=evaluacionnomiReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=evaluacionnomiReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=evaluacionnomiReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEmpleadoEvaluador.equals("NONE")) {
				this.empleadoevaluadorsForeignKey=evaluacionnomiReturnGeneral.getempleadoevaluadorsForeignKey();
			}

			if(!finalQueryGlobalFormatoNomi.equals("NONE")) {
				this.formatonomisForeignKey=evaluacionnomiReturnGeneral.getformatonomisForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=evaluacionnomiReturnGeneral.getestructurasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEvaluacionNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEmpleadoEvaluador();
			this.addItemDefectoCombosForeignKeyFormatoNomi();
			this.addItemDefectoCombosForeignKeyEstructura();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.evaluacionnomiSessionBean==null) {
				this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			}

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyEmpleadoEvaluador()throws Exception {
		try {

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoEvaluador()) {
				Empleado empleadoevaluador=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleadoevaluador,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleadoevaluador.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadoevaluadorsForeignKey,empleadoevaluador,true)) {

					this.empleadoevaluadorsForeignKey.add(0,empleadoevaluador);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormatoNomi()throws Exception {
		try {

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {
				FormatoNomi formatonomi=new FormatoNomi();
				FormatoNomiConstantesFunciones.setFormatoNomiDescripcion(formatonomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				formatonomi.setId(null);

				if(!FormatoNomiConstantesFunciones.ExisteEnLista(this.formatonomisForeignKey,formatonomi,true)) {

					this.formatonomisForeignKey.add(0,formatonomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.evaluacionnomiSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
	
	public void initActionsCombosTodosForeignKeyEvaluacionNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEvaluacionNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEvaluacionNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.evaluacionnomi.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEvaluacionNomi(EvaluacionNomi evaluacionnomi)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(evaluacionnomi.getid_empleado(),false,"Formulario");
			this.setActualEmpleadoEvaluadorForeignKey(evaluacionnomi.getid_empleado_evaluador(),false,"Formulario");
			this.setActualFormatoNomiForeignKey(evaluacionnomi.getid_formato_nomi(),false,"Formulario");
			this.setActualEstructuraForeignKey(evaluacionnomi.getid_estructura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEvaluacionNomi(EvaluacionNomi evaluacionnomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEvaluacionNomi()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.evaluacionnomiConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEmpleadoEvaluadorForeignKey(this.evaluacionnomiConstantesFunciones.getid_empleado_evaluador(),false,"Formulario");
			this.setActualFormatoNomiForeignKey(this.evaluacionnomiConstantesFunciones.getid_formato_nomi(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.evaluacionnomiConstantesFunciones.getid_estructura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionNomi()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEvaluacionNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEvaluacionNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEvaluacionNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEvaluacionNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEmpleadoEvaluadorsForeignKey("Todos");
			this.cargarCombosFrameFormatoNomisForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEvaluacionNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadoEvaluadorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatoNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEvaluacionNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public EvaluacionNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EvaluacionNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EvaluacionNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean(); 
		this.evaluacionnomiConstantesFunciones=new EvaluacionNomiConstantesFunciones(); 
		this.evaluacionnomiBean=new EvaluacionNomi();//(this.evaluacionnomiConstantesFunciones); 		
		this.evaluacionnomiReturnGeneral=new EvaluacionNomiParameterReturnGeneral(); 
		
		this.evaluacionnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EvaluacionNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EvaluacionNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EvaluacionNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEvaluacionNomi(true);
			
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
			
			this.evaluacionnomiConstantesFunciones=new EvaluacionNomiConstantesFunciones(); 
			this.evaluacionnomiBean=new EvaluacionNomi();//this.evaluacionnomiConstantesFunciones); 			
			this.evaluacionnomiReturnGeneral=new EvaluacionNomiParameterReturnGeneral(); 
		
			EvaluacionNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Evaluacion Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.evaluacionnomi=new EvaluacionNomi();
			this.evaluacionnomis = new ArrayList<EvaluacionNomi>();
			this.evaluacionnomisAux = new ArrayList<EvaluacionNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic=new EvaluacionNomiLogic();
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.evaluacionnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.evaluacionnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEvaluacionNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEvaluacionNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEvaluacionNomi);	
					}
					
					if(this.jInternalFrameImportacionEvaluacionNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEvaluacionNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEvaluacionNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEvaluacionNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEvaluacionNomi);
				this.jInternalFrameDetalleFormEvaluacionNomi.setVisible(false);
				this.jInternalFrameDetalleFormEvaluacionNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEvaluacionNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEvaluacionNomi);
					this.jInternalFrameReporteDinamicoEvaluacionNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoEvaluacionNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEvaluacionNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEvaluacionNomi);
					this.jInternalFrameImportacionEvaluacionNomi.setVisible(false);
					this.jInternalFrameImportacionEvaluacionNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEvaluacionNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEvaluacionNomi);
					this.jInternalFrameOrderByEvaluacionNomi.setVisible(false);
					this.jInternalFrameOrderByEvaluacionNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEvaluacionNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EvaluacionNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.evaluacionnomiReturnGeneral=new EvaluacionNomiParameterReturnGeneral();
			
			this.evaluacionnomiParameterGeneral=new EvaluacionNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.evaluacionnomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EvaluacionNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EvaluacionNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.evaluacionnomiSessionBean.getEsGuardarRelacionado(),this.evaluacionnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EvaluacionNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.evaluacionnomiSessionBean.getEsGuardarRelacionado(),this.evaluacionnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEvaluacionNomi=false;
			this.isVisibilidadCeldaDuplicarEvaluacionNomi=true;
			this.isVisibilidadCeldaCopiarEvaluacionNomi=true;
			this.isVisibilidadCeldaVerFormEvaluacionNomi=true;
			this.isVisibilidadCeldaOrdenEvaluacionNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=false;
			this.isVisibilidadCeldaModificarEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=false;
			
			
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpleadoEvaluador=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdFormatoNomi=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEvaluacionNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEvaluacionNomi(false);
			
			this.setPermisosUsuarioEvaluacionNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado() 
				|| (this.evaluacionnomiSessionBean.getEsGuardarRelacionado() && this.evaluacionnomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEvaluacionNomiClasesRelacionadas();
			}
			
			if(this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEvaluacionNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEvaluacionNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEvaluacionNomi();
			}
			
			if(!this.isPermisoBusquedaEvaluacionNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEvaluacionNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEvaluacionNomi,this.isPermisoPaginacionMedioEvaluacionNomi,this.isPermisoPaginacionTodoEvaluacionNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EvaluacionNomiConstantesFunciones.getTiposSeleccionarEvaluacionNomi());
				
				this.tiposColumnasSelect=EvaluacionNomiConstantesFunciones.getTiposSeleccionarEvaluacionNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEvaluacionNomi();				
				//this.tiposRelacionesSelect=EvaluacionNomiConstantesFunciones.getTiposRelacionesEvaluacionNomi(true);
				
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
			//if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEvaluacionNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEvaluacionNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEvaluacionNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionNomi() ;
			
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
			
			
			this.detalleevaluacionnomiLogic=new DetalleEvaluacionNomiLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.empleadoevaluadorLogic=new EmpleadoLogic();
			this.formatonomiLogic=new FormatoNomiLogic();
			this.estructuraLogic=new EstructuraLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				evaluacionnomiImplementable= (EvaluacionNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EvaluacionNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				evaluacionnomiImplementableHome= (EvaluacionNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EvaluacionNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.evaluacionnomis= new ArrayList<EvaluacionNomi>();
			this.evaluacionnomisEliminados= new ArrayList<EvaluacionNomi>();
						
			this.isEsNuevoEvaluacionNomi=false;
			this.esParaAccionDesdeFormularioEvaluacionNomi=false;
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
			this.empleadoevaluadorsForeignKey=new ArrayList<Empleado>() ;
			this.formatonomisForeignKey=new ArrayList<FormatoNomi>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEvaluacionNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEvaluacionNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EvaluacionNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EvaluacionNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEvaluacionNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEvaluacionNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEvaluacionNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEvaluacionNomi();
			}
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEvaluacionNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEvaluacionNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEvaluacionNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEvaluacionNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EvaluacionNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEvaluacionNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEvaluacionNomi")) {
				iIndex=this.jInternalFrameDetalleFormEvaluacionNomi.jTabbedPaneRelacionesEvaluacionNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEvaluacionNomi.jTabbedPaneRelacionesEvaluacionNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Evaluacion Nomis")) {
					if(!DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEvaluacionNomi();

						this.cargarParteTabPanelRelacionadaDetalleEvaluacionNomi(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEvaluacionNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleEvaluacionNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEvaluacionNomi.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionNomi(false,true,iIndex);
		this.jButtonDetalleEvaluacionNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleEvaluacionNomi();

		//this.jTabbedPaneRelacionesEvaluacionNomi.updateUI();
		//this.jTabbedPaneRelacionesEvaluacionNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEvaluacionNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleEvaluacionNomi")) {
				int row=this.jTableDatosEvaluacionNomi.getSelectedRow();
				jButtonDetalleEvaluacionNomiActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Evaluacion Nomi")) {

					if(this.isTienePermisosDetalleEvaluacionNomi && this.evaluacionnomiConstantesFunciones.mostrarDetalleEvaluacionNomiEvaluacionNomi && !EvaluacionNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Evaluacion Nomis"+"("+DetalleEvaluacionNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Evaluacion Nomis");

						if(evaluacionnomiConstantesFunciones.resaltarDetalleEvaluacionNomiEvaluacionNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(evaluacionnomiConstantesFunciones.resaltarDetalleEvaluacionNomiEvaluacionNomi);
						}

						jmenuItem.setEnabled(this.evaluacionnomiConstantesFunciones.activarDetalleEvaluacionNomiEvaluacionNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleEvaluacionNomi"));

						

						this.jInternalFrameDetalleFormEvaluacionNomi.jmenuDetalleEvaluacionNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEvaluacionNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEvaluacionNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEvaluacionNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEvaluacionNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEvaluacionNomi();
		
		this.cargarCombosFrameForeignKeyEvaluacionNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEvaluacionNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEvaluacionNomi();
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

	public void cargarCombosForeignKeyEmpleadoEvaluador(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoEvaluadorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleadoEvaluador();
				this.cargarCombosFrameEmpleadoEvaluadorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleadoEvaluador(this.empleadoevaluadorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormatoNomi();
				this.cargarCombosFrameFormatoNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormatoNomi(this.formatonomisForeignKey);

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
	
	public void jButtonNuevoEvaluacionNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
			
			if(jTableDatosEvaluacionNomi.getRowCount()>=1) {
				jTableDatosEvaluacionNomi.removeRowSelectionInterval(0, jTableDatosEvaluacionNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoEvaluacionNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEvaluacionNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEvaluacionNomi(true);			
			//this.evaluacionnomi=new EvaluacionNomi();
			//this.evaluacionnomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionNomi() ;
			
			if(EvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.evaluacionnomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);				
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
			if(this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EvaluacionNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEvaluacionNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEvaluacionNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEvaluacionNomi.getSelectedRows().length;			
			}
			
			evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEvaluacionNomi--;			
				//EvaluacionNomi evaluacionnomiAux= new EvaluacionNomi();			
				//evaluacionnomiAux.setId(this.iIdNuevoEvaluacionNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EvaluacionNomi evaluacionnomiOrigen=new EvaluacionNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EvaluacionNomi evaluacionnomiOrigen : evaluacionnomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							evaluacionnomiOrigen =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionnomiOrigen =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEvaluacionNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.evaluacionnomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEvaluacionNomi(evaluacionnomiOrigen,this.evaluacionnomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.evaluacionnomiLogic.getEvaluacionNomis().add(this.evaluacionnomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.evaluacionnomis.add(this.evaluacionnomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEvaluacionNomi(false);
				
				this.jTableDatosEvaluacionNomi.setRowSelectionInterval(this.getIndiceNuevoEvaluacionNomi(), this.getIndiceNuevoEvaluacionNomi());
				
				int iLastRow =  this.jTableDatosEvaluacionNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEvaluacionNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEvaluacionNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();									
		
			EvaluacionNomi evaluacionnomiOrigen=new EvaluacionNomi();
			EvaluacionNomi evaluacionnomiDestino=new EvaluacionNomi();
				
			evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEvaluacionNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || evaluacionnomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEvaluacionNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiOrigen =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						evaluacionnomiOrigen =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionnomiDestino =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						evaluacionnomiDestino =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				evaluacionnomiOrigen =evaluacionnomisSeleccionados.get(0);
				evaluacionnomiDestino =evaluacionnomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEvaluacionNomi(evaluacionnomiOrigen,evaluacionnomiDestino,true,false);
				
				evaluacionnomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(evaluacionnomiDestino,evaluacionnomiLogic.getEvaluacionNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(evaluacionnomiDestino,evaluacionnomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEvaluacionNomi(false);
				
				//this.jTableDatosEvaluacionNomi.setRowSelectionInterval(this.getIndiceNuevoEvaluacionNomi(), this.getIndiceNuevoEvaluacionNomi());
				
				int iLastRow =  this.jTableDatosEvaluacionNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEvaluacionNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEvaluacionNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEvaluacionNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEvaluacionNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEvaluacionNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEvaluacionNomi.setVisible(!isVisible);
			this.jPanelPaginacionEvaluacionNomi.setVisible(!isVisible);
			this.jPanelAccionesEvaluacionNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEvaluacionNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEvaluacionNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEvaluacionNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEvaluacionNomi();
			
			this.abrirFrameOrderByEvaluacionNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEvaluacionNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEvaluacionNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEvaluacionNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEvaluacionNomi.isMaximum()) {
					this.jInternalFrameDetalleFormEvaluacionNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEvaluacionNomi.setSize(this.jInternalFrameDetalleFormEvaluacionNomi.iWidthFormulario,this.jInternalFrameDetalleFormEvaluacionNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEvaluacionNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEvaluacionNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEvaluacionNomi.isMaximum()) {
						this.jInternalFrameDetalleFormEvaluacionNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEvaluacionNomi.jContentPaneDetalleEvaluacionNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEvaluacionNomi.jTabbedPaneRelacionesEvaluacionNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionNomi.jContentPaneDetalleEvaluacionNomi.getWidth(),EvaluacionNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEvaluacionNomi.jTabbedPaneRelacionesEvaluacionNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionNomi.jContentPaneDetalleEvaluacionNomi.getWidth(),EvaluacionNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEvaluacionNomi.jTabbedPaneRelacionesEvaluacionNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionNomi.jContentPaneDetalleEvaluacionNomi.getWidth(),EvaluacionNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleEvaluacionNomi();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEvaluacionNomi.setVisible(true);
	        this.jInternalFrameDetalleFormEvaluacionNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEvaluacionNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEvaluacionNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEvaluacionNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionNomi,false,this);
				} else {
					this.jInternalFrameOrderByEvaluacionNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEvaluacionNomi);
				this.jInternalFrameOrderByEvaluacionNomi.setVisible(false);
				this.jInternalFrameOrderByEvaluacionNomi.setSelected(false);
				
				this.jInternalFrameOrderByEvaluacionNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEvaluacionNomi"));
				
				this.inicializarActualizarBindingTablaOrderByEvaluacionNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEvaluacionNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEvaluacionNomi==null) {
				
				this.jInternalFrameImportacionEvaluacionNomi=new ImportacionJInternalFrame(EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEvaluacionNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEvaluacionNomi);
				this.jInternalFrameImportacionEvaluacionNomi.setVisible(false);
				this.jInternalFrameImportacionEvaluacionNomi.setSelected(false);


				this.jInternalFrameImportacionEvaluacionNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEvaluacionNomi"));
				this.jInternalFrameImportacionEvaluacionNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEvaluacionNomi"));
				this.jInternalFrameImportacionEvaluacionNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEvaluacionNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEvaluacionNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEvaluacionNomi==null) {
				this.jInternalFrameReporteDinamicoEvaluacionNomi=new ReporteDinamicoJInternalFrame(EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEvaluacionNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEvaluacionNomi);
				this.jInternalFrameReporteDinamicoEvaluacionNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoEvaluacionNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEvaluacionNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionNomi"));
				this.jInternalFrameReporteDinamicoEvaluacionNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionNomi"));
				this.jInternalFrameReporteDinamicoEvaluacionNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleEvaluacionNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEvaluacionNomi.jContentPaneDetalleEvaluacionNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEvaluacionNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEvaluacionNomi);
			
	       	this.jInternalFrameDetalleFormEvaluacionNomi.setVisible(false);
	        this.jInternalFrameDetalleFormEvaluacionNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormEvaluacionNomi.dispose();
			//this.jInternalFrameDetalleFormEvaluacionNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEvaluacionNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEvaluacionNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoEvaluacionNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEvaluacionNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEvaluacionNomi.setVisible(true);
	        this.jInternalFrameImportacionEvaluacionNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEvaluacionNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEvaluacionNomi.setVisible(true);
	        this.jInternalFrameOrderByEvaluacionNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEvaluacionNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEvaluacionNomi.setVisible(false);
	        this.jInternalFrameOrderByEvaluacionNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEvaluacionNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEvaluacionNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoEvaluacionNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEvaluacionNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEvaluacionNomi.setVisible(false);
	        this.jInternalFrameImportacionEvaluacionNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosEvaluacionNomi.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderEvaluacionNomi.getTitle() + " -> Estructura");


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
	
	public void jButtonModificarEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEvaluacionNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEvaluacionNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEvaluacionNomi(true);
			//this.isEsNuevoEvaluacionNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEvaluacionNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionNomi(false) ;
			
			if(evaluacionnomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionNomiActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEvaluacionNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEvaluacionNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEvaluacionNomi(true);
			//this.isEsNuevoEvaluacionNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.evaluacionnomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEvaluacionNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEvaluacionNomi(false) ;
			
			if(EvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleadoEvaluador(List<Empleado> empleadoevaluadorsForeignKey)throws Exception{
		TableColumn tableColumnEmpleadoEvaluador=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR));
		TableCellEditor tableCellEditorEmpleadoEvaluador =tableColumnEmpleadoEvaluador.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleadoEvaluador;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadoevaluadorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadoevaluadorsForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormatoNomi(List<FormatoNomi> formatonomisForeignKey)throws Exception{
		TableColumn tableColumnFormatoNomi=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI));
		TableCellEditor tableCellEditorFormatoNomi =tableColumnFormatoNomi.getCellEditor();

		FormatoNomiTableCell formatonomiTableCellFk=(FormatoNomiTableCell)tableCellEditorFormatoNomi;

		if(formatonomiTableCellFk!=null) {
			formatonomiTableCellFk.setformatonomisForeignKey(formatonomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatonomiTableCellFk.setRowActual(intSelectedRow);
			//formatonomiTableCellFk.setformatonomisForeignKeyActual(formatonomisForeignKey);
		//}


		if(formatonomiTableCellFk!=null) {
			formatonomiTableCellFk.RecargarFormatoNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEvaluacionNomi(false);
			
			//if(!this.isEsNuevoEvaluacionNomi) {								
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				
			}
			
			if(this.permiteMantenimiento(this.evaluacionnomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEvaluacionNomi=true;
					this.inicializarActualizarBindingTablaEvaluacionNomi(false);
					this.isEsNuevoEvaluacionNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEvaluacionNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEvaluacionNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEvaluacionNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionNomi(false);
				
				this.habilitarDeshabilitarControlesEvaluacionNomi(false);
			
												
				
				if(EvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEvaluacionNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEvaluacionNomiActionPerformed(evt,evaluacionnomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEvaluacionNomi(this.evaluacionnomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEvaluacionNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,evaluacionnomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.evaluacionnomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EvaluacionNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				this.evaluacionnomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				this.evaluacionnomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.evaluacionnomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EvaluacionNomiModel) this.jTableDatosEvaluacionNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEvaluacionNomi=true;
				this.inicializarActualizarBindingTablaEvaluacionNomi(false);
				this.isEsNuevoEvaluacionNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEvaluacionNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionNomi(false);
				
				this.habilitarDeshabilitarControlesEvaluacionNomi(false);
				
				
				
				if(EvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEvaluacionNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEvaluacionNomi.getRowCount()>=1) {
				jTableDatosEvaluacionNomi.removeRowSelectionInterval(0, jTableDatosEvaluacionNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEvaluacionNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEvaluacionNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionNomi(false) ;
			
			this.isEsNuevoEvaluacionNomi=false;
			
			if(EvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEvaluacionNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEvaluacionNomi(false);
				
				//SI ES MANUAL
				if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEvaluacionNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEvaluacionNomi--;			
			//EvaluacionNomi evaluacionnomiAux= new EvaluacionNomi();			
			//evaluacionnomiAux.setId(this.iIdNuevoEvaluacionNomi);
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEvaluacionNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
			
			this.evaluacionnomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.evaluacionnomiLogic.getEvaluacionNomis().add(this.evaluacionnomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.evaluacionnomis.add(this.evaluacionnomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEvaluacionNomi(false);
			
			this.jTableDatosEvaluacionNomi.setRowSelectionInterval(this.getIndiceNuevoEvaluacionNomi(), this.getIndiceNuevoEvaluacionNomi());
			
			int iLastRow =  this.jTableDatosEvaluacionNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEvaluacionNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEvaluacionNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEvaluacionNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEvaluacionNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionNomi(false);
			
			//SI ES MANUAL
			if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionNomi();
			}
			
			//this.abrirFrameTreeEvaluacionNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Evaluacion NomiS ?", "MANTENIMIENTO DE Evaluacion Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEvaluacionNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEvaluacionNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.evaluacionnomiReturnGeneral=evaluacionnomiLogic.procesarImportacionEvaluacionNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.evaluacionnomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEvaluacionNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEvaluacionNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEvaluacionNomi.setFileImportacion(this.jInternalFrameImportacionEvaluacionNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEvaluacionNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEvaluacionNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEvaluacionNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEvaluacionNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();		

		evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EvaluacionNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EvaluacionNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteEvaluacionNomis("Todos",evaluacionnomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EmpleadoEvaluador_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EmpleadoEvaluador_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EmpleadoEvaluador_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EmpleadoEvaluador_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FormatoNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FormatoNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FormatoNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FormatoNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_strucciones_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_strucciones_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_strucciones_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_strucciones_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion3_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion3_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion3_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion3_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion4_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion4_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion4_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion4_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEvaluacionNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR:
					sNombreCampoCategoria="id_empleado_evaluador";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					sNombreCampoCategoria="id_formato_nomi";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES:
					sNombreCampoCategoria="instrucciones";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2:
					sNombreCampoCategoria="descripcion2";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3:
					sNombreCampoCategoria="descripcion3";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4:
					sNombreCampoCategoria="descripcion4";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR:
					sNombreCampoCategoriaValor="id_empleado_evaluador";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					sNombreCampoCategoriaValor="id_formato_nomi";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES:
					sNombreCampoCategoriaValor="instrucciones";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2:
					sNombreCampoCategoriaValor="descripcion2";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3:
					sNombreCampoCategoriaValor="descripcion3";
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4:
					sNombreCampoCategoriaValor="descripcion4";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado Evaluador",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado_evaluador");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato_nomi");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Instrucciones",sNombreCampoCategoria,sNombreCampoCategoriaValor,"instrucciones");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion2");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion3",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion3");
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion4",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion4");
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
	
	public void jButtonGenerarExcelReporteDinamicoEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();		
		
		evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionnomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EvaluacionNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getempleadoevaluador_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getformatonomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getinstrucciones());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getdescripcion2());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getdescripcion3());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4);
					iRow++;

					for(EvaluacionNomi evaluacionnomi:evaluacionnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionnomi.getdescripcion4());
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
			//	this.getFilaCabeceraExportarExcelEvaluacionNomi(row);				
			//	iRow++;
			//}				
			
			//for(EvaluacionNomi evaluacionnomiAux:evaluacionnomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEvaluacionNomi(evaluacionnomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionNomi(false);
			
			//SI ES MANUAL
			if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionNomi(false);
			
			//SI ES MANUAL
			if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEvaluacionNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionNomi(false);
			
			//SI ES MANUAL
			if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEvaluacionNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEvaluacionNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEvaluacionNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEvaluacionNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEvaluacionNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEvaluacionNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEvaluacionNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosEvaluacionNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosEvaluacionNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEvaluacionNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEvaluacionNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEvaluacionNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEvaluacionNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEvaluacionNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEvaluacionNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEvaluacionNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEvaluacionNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEvaluacionNomi();
		
		this.inicializarActualizarBindingBotonesManualEvaluacionNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEvaluacionNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEvaluacionNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEvaluacionNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEvaluacionNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEvaluacionNomi.jCheckBoxPostAccionNuevoEvaluacionNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEvaluacionNomi.jCheckBoxPostAccionSinCerrarEvaluacionNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEvaluacionNomi.jCheckBoxPostAccionSinMensajeEvaluacionNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEvaluacionNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEvaluacionNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEvaluacionNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
				this.jInternalFrameDetalleFormEvaluacionNomi.jCheckBoxPostAccionNuevoEvaluacionNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEvaluacionNomi.jCheckBoxPostAccionSinCerrarEvaluacionNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEvaluacionNomi.jCheckBoxPostAccionSinMensajeEvaluacionNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEvaluacionNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEvaluacionNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEvaluacionNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEvaluacionNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEvaluacionNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEvaluacionNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEvaluacionNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEvaluacionNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEvaluacionNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEvaluacionNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEvaluacionNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEvaluacionNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionNomi() throws Exception {
		try	{
			if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEvaluacionNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEvaluacionNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEvaluacionNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEvaluacionNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEvaluacionNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEvaluacionNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEvaluacionNomi.addItem(reporte);
			}
			
			
			if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEvaluacionNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEvaluacionNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEvaluacionNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEvaluacionNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEvaluacionNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEvaluacionNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEvaluacionNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEvaluacionNomi!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEvaluacionNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEvaluacionNomi!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEvaluacionNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEvaluacionNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEvaluacionNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.getSelectedItem()!=null){this.id_empleado_evaluadorFK_IdEmpleadoEvaluador=((Empleado)this.jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.getSelectedItem()!=null){this.id_formato_nomiFK_IdFormatoNomi=((FormatoNomi)this.jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEvaluacionNomi(Boolean esInicializar) throws Exception {				
		if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEvaluacionNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEvaluacionNomi() throws Exception {
		this.inicializarActualizarBindingTablaEvaluacionNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEvaluacionNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEvaluacionNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEvaluacionNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=evaluacionnomiLogic.getEvaluacionNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=evaluacionnomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEvaluacionNomi.setModel(new EvaluacionNomiModel(this.evaluacionnomiLogic.getEvaluacionNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEvaluacionNomi.setModel(new EvaluacionNomiModel(this.evaluacionnomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEvaluacionNomi!=null && this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEvaluacionNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,evaluacionnomiConstantesFunciones.resaltarSeleccionarEvaluacionNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,evaluacionnomiConstantesFunciones.resaltarSeleccionarEvaluacionNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_ID));

		if(this.evaluacionnomiConstantesFunciones.mostraridEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionnomiConstantesFunciones.resaltaridEvaluacionNomi,this.evaluacionnomiConstantesFunciones.activaridEvaluacionNomi,this,true,"idEvaluacionNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionnomiConstantesFunciones.resaltaridEvaluacionNomi,this.evaluacionnomiConstantesFunciones.activaridEvaluacionNomi,this,true,"idEvaluacionNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.evaluacionnomiConstantesFunciones.mostrarid_empresaEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_empresaEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_empresaEvaluacionNomi));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_empresaEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_empresaEvaluacionNomi,false,"id_empresaEvaluacionNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.evaluacionnomiConstantesFunciones.mostrarid_sucursalEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_sucursalEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_sucursalEvaluacionNomi));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_sucursalEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_sucursalEvaluacionNomi,false,"id_sucursalEvaluacionNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.evaluacionnomiConstantesFunciones.mostrarid_ejercicioEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_ejercicioEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_ejercicioEvaluacionNomi));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_ejercicioEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_ejercicioEvaluacionNomi,false,"id_ejercicioEvaluacionNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO));

		if(this.evaluacionnomiConstantesFunciones.mostrarid_periodoEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_periodoEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_periodoEvaluacionNomi));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_periodoEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_periodoEvaluacionNomi,false,"id_periodoEvaluacionNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.evaluacionnomiConstantesFunciones.mostrarid_empleadoEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_empleadoEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_empleadoEvaluacionNomi));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_empleadoEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_empleadoEvaluacionNomi,true,"id_empleadoEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR));

		if(this.evaluacionnomiConstantesFunciones.mostrarid_empleado_evaluadorEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadoevaluadorsForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_empleado_evaluadorEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_empleado_evaluadorEvaluacionNomi));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadoevaluadorsForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_empleado_evaluadorEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_empleado_evaluadorEvaluacionNomi,true,"id_empleado_evaluadorEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI));

		if(this.evaluacionnomiConstantesFunciones.mostrarid_formato_nomiEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoNomiTableCell(this.formatonomisForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_formato_nomiEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_formato_nomiEvaluacionNomi));
			tableColumn.setCellEditor(new FormatoNomiTableCell(this.formatonomisForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_formato_nomiEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_formato_nomiEvaluacionNomi,true,"id_formato_nomiEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.evaluacionnomiConstantesFunciones.mostrarid_estructuraEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_estructuraEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_estructuraEvaluacionNomi));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.evaluacionnomiConstantesFunciones.resaltarid_estructuraEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarid_estructuraEvaluacionNomi,true,"id_estructuraEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_FECHA));

		if(this.evaluacionnomiConstantesFunciones.mostrarfechaEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.evaluacionnomiConstantesFunciones.resaltarfechaEvaluacionNomi,this.evaluacionnomiConstantesFunciones.activarfechaEvaluacionNomi,this,true,"fechaEvaluacionNomi","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.evaluacionnomiConstantesFunciones.resaltarfechaEvaluacionNomi,this.evaluacionnomiConstantesFunciones.activarfechaEvaluacionNomi,this,true,"fechaEvaluacionNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES));

		if(this.evaluacionnomiConstantesFunciones.mostrarinstruccionesEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionnomiConstantesFunciones.resaltarinstruccionesEvaluacionNomi,this.evaluacionnomiConstantesFunciones.activarinstruccionesEvaluacionNomi,this,true,"instruccionesEvaluacionNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionnomiConstantesFunciones.resaltarinstruccionesEvaluacionNomi,this.evaluacionnomiConstantesFunciones.activarinstruccionesEvaluacionNomi,this,true,"instruccionesEvaluacionNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION));

		if(this.evaluacionnomiConstantesFunciones.mostrardescripcionEvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionnomiConstantesFunciones.resaltardescripcionEvaluacionNomi,this.evaluacionnomiConstantesFunciones.activardescripcionEvaluacionNomi,this,true,"descripcionEvaluacionNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionnomiConstantesFunciones.resaltardescripcionEvaluacionNomi,this.evaluacionnomiConstantesFunciones.activardescripcionEvaluacionNomi,this,true,"descripcionEvaluacionNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2));

		if(this.evaluacionnomiConstantesFunciones.mostrardescripcion2EvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionnomiConstantesFunciones.resaltardescripcion2EvaluacionNomi,this.evaluacionnomiConstantesFunciones.activardescripcion2EvaluacionNomi,this,true,"descripcion2EvaluacionNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionnomiConstantesFunciones.resaltardescripcion2EvaluacionNomi,this.evaluacionnomiConstantesFunciones.activardescripcion2EvaluacionNomi,this,true,"descripcion2EvaluacionNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3));

		if(this.evaluacionnomiConstantesFunciones.mostrardescripcion3EvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionnomiConstantesFunciones.resaltardescripcion3EvaluacionNomi,this.evaluacionnomiConstantesFunciones.activardescripcion3EvaluacionNomi,this,true,"descripcion3EvaluacionNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionnomiConstantesFunciones.resaltardescripcion3EvaluacionNomi,this.evaluacionnomiConstantesFunciones.activardescripcion3EvaluacionNomi,this,true,"descripcion3EvaluacionNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4));

		if(this.evaluacionnomiConstantesFunciones.mostrardescripcion4EvaluacionNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionnomiConstantesFunciones.resaltardescripcion4EvaluacionNomi,this.evaluacionnomiConstantesFunciones.activardescripcion4EvaluacionNomi,this,true,"descripcion4EvaluacionNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionnomiConstantesFunciones.resaltardescripcion4EvaluacionNomi,this.evaluacionnomiConstantesFunciones.activardescripcion4EvaluacionNomi,this,true,"descripcion4EvaluacionNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleEvaluacionNomi && this.evaluacionnomiConstantesFunciones.mostrarDetalleEvaluacionNomiEvaluacionNomi && !EvaluacionNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Evaluacion Nomis");
				tableColumn.setHeaderValue("Detalle Evaluacion Nomis");
				tableColumn.setCellRenderer(new DetalleEvaluacionNomiTableCell(evaluacionnomiConstantesFunciones.resaltarDetalleEvaluacionNomiEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarDetalleEvaluacionNomiEvaluacionNomi));
				tableColumn.setCellEditor(new DetalleEvaluacionNomiTableCell(evaluacionnomiConstantesFunciones.resaltarDetalleEvaluacionNomiEvaluacionNomi,this,this.evaluacionnomiConstantesFunciones.activarDetalleEvaluacionNomiEvaluacionNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEvaluacionNomi.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.evaluacionnomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.evaluacionnomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEvaluacionNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.evaluacionnomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.evaluacionnomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEvaluacionNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.evaluacionnomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.evaluacionnomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEvaluacionNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosEvaluacionNomi.addColumn(tableColumn);
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
			
			this.jTableDatosEvaluacionNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEvaluacionNomi.moveColumn(this.jTableDatosEvaluacionNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEvaluacionNomi.moveColumn(this.jTableDatosEvaluacionNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEvaluacionNomi.moveColumn(this.jTableDatosEvaluacionNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEvaluacionNomi.moveColumn(this.jTableDatosEvaluacionNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEvaluacionNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEvaluacionNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEvaluacionNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEvaluacionNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEvaluacionNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEvaluacionNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEvaluacionNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=evaluacionnomiLogic.getEvaluacionNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=evaluacionnomis.size()-1;
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
		//this.jTableDatosEvaluacionNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEvaluacionNomi();
			
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
				
				//this.isEsNuevoEvaluacionNomi=false;
					
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
				if(this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEvaluacionNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEvaluacionNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEvaluacionNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.evaluacionnomi.getsType().equals("DUPLICADO")
				   || this.evaluacionnomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEvaluacionNomi=true;
				
				} else {
					this.isEsNuevoEvaluacionNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					if(this.evaluacionnomi.getId()>=0 && !this.evaluacionnomi.getIsNew()) {						
						this.isEsNuevoEvaluacionNomi=false;
						
					} else {
						this.isEsNuevoEvaluacionNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEvaluacionNomi(esRelaciones);						
				
				this.seleccionarEvaluacionNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.evaluacionnomi.getId()<0) {
					this.isEsNuevoEvaluacionNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEvaluacionNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEvaluacionNomi(evt,rowIndex);
				}	
				
				if(this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EvaluacionNomi: " + this.dDif); 
					}
				}								
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEvaluacionNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.evaluacionnomi)) {
					if(this.evaluacionnomi.getId()>0) {
						this.evaluacionnomi.setIsDeleted(true);
						
						this.evaluacionnomisEliminados.add(this.evaluacionnomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.evaluacionnomiLogic.getEvaluacionNomis().remove(this.evaluacionnomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.evaluacionnomis.remove(this.evaluacionnomi);				
					}
					
					
					((EvaluacionNomiModel) this.jTableDatosEvaluacionNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEvaluacionNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEvaluacionNomi) {
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEvaluacionNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEvaluacionNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEvaluacionNomi(this.evaluacionnomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.evaluacionnomiConstantesFunciones.cargarid_empresaEvaluacionNomi || this.evaluacionnomiConstantesFunciones.event_dependid_empresaEvaluacionNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.evaluacionnomi.getid_empresa());
									//this.inicializarActualizarBindingEvaluacionNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(evaluacionnomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(evaluacionnomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.evaluacionnomi.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.evaluacionnomiConstantesFunciones.cargarid_sucursalEvaluacionNomi || this.evaluacionnomiConstantesFunciones.event_dependid_sucursalEvaluacionNomi) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.evaluacionnomi.getid_sucursal());
									//this.inicializarActualizarBindingEvaluacionNomi(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(evaluacionnomi.getSucursal()!=null) {
							this.sucursalsForeignKey.add(evaluacionnomi.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.evaluacionnomi.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.evaluacionnomiConstantesFunciones.cargarid_ejercicioEvaluacionNomi || this.evaluacionnomiConstantesFunciones.event_dependid_ejercicioEvaluacionNomi) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.evaluacionnomi.getid_ejercicio());
									//this.inicializarActualizarBindingEvaluacionNomi(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(evaluacionnomi.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(evaluacionnomi.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.evaluacionnomi.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.evaluacionnomiConstantesFunciones.cargarid_periodoEvaluacionNomi || this.evaluacionnomiConstantesFunciones.event_dependid_periodoEvaluacionNomi) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.evaluacionnomi.getid_periodo());
									//this.inicializarActualizarBindingEvaluacionNomi(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(evaluacionnomi.getPeriodo()!=null) {
							this.periodosForeignKey.add(evaluacionnomi.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.evaluacionnomi.getid_periodo(),false,"Formulario");

					//Empleado
					if(!this.evaluacionnomiConstantesFunciones.cargarid_empleadoEvaluacionNomi || this.evaluacionnomiConstantesFunciones.event_dependid_empleadoEvaluacionNomi) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.evaluacionnomi.getid_empleado());
									//this.inicializarActualizarBindingEvaluacionNomi(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(evaluacionnomi.getEmpleado()!=null) {
							this.empleadosForeignKey.add(evaluacionnomi.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.evaluacionnomi.getid_empleado(),false,"Formulario");

					//EmpleadoEvaluador
					if(!this.evaluacionnomiConstantesFunciones.cargarid_empleado_evaluadorEvaluacionNomi || this.evaluacionnomiConstantesFunciones.event_dependid_empleado_evaluadorEvaluacionNomi) {
						//this.cargarCombosEmpleadoEvaluadorsForeignKeyLista(" where id="+this.evaluacionnomi.getid_empleado_evaluador());
									//this.inicializarActualizarBindingEvaluacionNomi(false,false);
						this.empleadoevaluadorsForeignKey=new ArrayList<Empleado>();

						if(evaluacionnomi.getEmpleadoEvaluador()!=null) {
							this.empleadoevaluadorsForeignKey.add(evaluacionnomi.getEmpleadoEvaluador());
						}

						this.addItemDefectoCombosForeignKeyEmpleadoEvaluador();
						this.cargarCombosFrameEmpleadoEvaluadorsForeignKey("Todos");
					}
					this.setActualEmpleadoEvaluadorForeignKey(this.evaluacionnomi.getid_empleado_evaluador(),false,"Formulario");

					//FormatoNomi
					if(!this.evaluacionnomiConstantesFunciones.cargarid_formato_nomiEvaluacionNomi || this.evaluacionnomiConstantesFunciones.event_dependid_formato_nomiEvaluacionNomi) {
						//this.cargarCombosFormatoNomisForeignKeyLista(" where id="+this.evaluacionnomi.getid_formato_nomi());
									//this.inicializarActualizarBindingEvaluacionNomi(false,false);
						this.formatonomisForeignKey=new ArrayList<FormatoNomi>();

						if(evaluacionnomi.getFormatoNomi()!=null) {
							this.formatonomisForeignKey.add(evaluacionnomi.getFormatoNomi());
						}

						this.addItemDefectoCombosForeignKeyFormatoNomi();
						this.cargarCombosFrameFormatoNomisForeignKey("Todos");
					}
					this.setActualFormatoNomiForeignKey(this.evaluacionnomi.getid_formato_nomi(),false,"Formulario");

					//Estructura
					if(!this.evaluacionnomiConstantesFunciones.cargarid_estructuraEvaluacionNomi || this.evaluacionnomiConstantesFunciones.event_dependid_estructuraEvaluacionNomi) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.evaluacionnomi.getid_estructura());
									//this.inicializarActualizarBindingEvaluacionNomi(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(evaluacionnomi.getEstructura()!=null) {
							this.estructurasForeignKey.add(evaluacionnomi.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.evaluacionnomi.getid_estructura(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEvaluacionNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEvaluacionNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEvaluacionNomi(EvaluacionNomi evaluacionnomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEvaluacionNomi(evaluacionnomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEvaluacionNomi(EvaluacionNomi evaluacionnomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEvaluacionNomi(evaluacionnomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEvaluacionNomi(evaluacionnomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionNomi(evaluacionnomi);
	}
	
	public void setVariablesObjetoActualToFormularioEvaluacionNomi(EvaluacionNomi evaluacionnomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEvaluacionNomi.jLabelidEvaluacionNomi.setText(evaluacionnomi.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionNomi.jDateChooserfechaEvaluacionNomi.setDate(evaluacionnomi.getfecha());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreainstruccionesEvaluacionNomi.setText(evaluacionnomi.getinstrucciones());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcionEvaluacionNomi.setText(evaluacionnomi.getdescripcion());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion2EvaluacionNomi.setText(evaluacionnomi.getdescripcion2());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion3EvaluacionNomi.setText(evaluacionnomi.getdescripcion3());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion4EvaluacionNomi.setText(evaluacionnomi.getdescripcion4());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EvaluacionNomi evaluacionnomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,evaluacionnomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EvaluacionNomi evaluacionnomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				evaluacionnomiLocal=this.evaluacionnomi;
			} else {
				evaluacionnomiLocal=this.evaluacionnomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(evaluacionnomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEvaluacionNomi(evaluacionnomiLocal,true);
					
					if(evaluacionnomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(evaluacionnomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(evaluacionnomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEvaluacionNomi(EvaluacionNomi evaluacionnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEvaluacionNomi(evaluacionnomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(evaluacionnomi);
	}
	
	public void setVariablesFormularioToObjetoActualEvaluacionNomi(EvaluacionNomi evaluacionnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEvaluacionNomi(evaluacionnomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEvaluacionNomi(EvaluacionNomi evaluacionnomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEvaluacionNomi.jLabelidEvaluacionNomi.getText()==null || this.jInternalFrameDetalleFormEvaluacionNomi.jLabelidEvaluacionNomi.getText()=="" || this.jInternalFrameDetalleFormEvaluacionNomi.jLabelidEvaluacionNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormEvaluacionNomi.jLabelidEvaluacionNomi.setText("0");
			}

			if(conColumnasBase) {evaluacionnomi.setId(Long.parseLong(this.jInternalFrameDetalleFormEvaluacionNomi.jLabelidEvaluacionNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelIdEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionnomi.setfecha(this.jInternalFrameDetalleFormEvaluacionNomi.jDateChooserfechaEvaluacionNomi.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionNomiConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelfechaEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionnomi.setinstrucciones(this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreainstruccionesEvaluacionNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabelinstruccionesEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionnomi.setdescripcion(this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcionEvaluacionNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcionEvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionnomi.setdescripcion2(this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion2EvaluacionNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcion2EvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionnomi.setdescripcion3(this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion3EvaluacionNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcion3EvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionnomi.setdescripcion4(this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion4EvaluacionNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionNomi.jLabeldescripcion4EvaluacionNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEvaluacionNomi(EvaluacionNomi evaluacionnomiBean,EvaluacionNomi evaluacionnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && evaluacionnomiBean.getid_empleado()!=null && !evaluacionnomiBean.getid_empleado().equals(-1L))) {evaluacionnomi.setid_empleado(evaluacionnomiBean.getid_empleado());}
			if(conDefault || (!conDefault && evaluacionnomiBean.getid_empleado_evaluador()!=null && !evaluacionnomiBean.getid_empleado_evaluador().equals(-1L))) {evaluacionnomi.setid_empleado_evaluador(evaluacionnomiBean.getid_empleado_evaluador());}
			if(conDefault || (!conDefault && evaluacionnomiBean.getid_formato_nomi()!=null && !evaluacionnomiBean.getid_formato_nomi().equals(-1L))) {evaluacionnomi.setid_formato_nomi(evaluacionnomiBean.getid_formato_nomi());}
			if(conDefault || (!conDefault && evaluacionnomiBean.getid_estructura()!=null && !evaluacionnomiBean.getid_estructura().equals(-1L))) {evaluacionnomi.setid_estructura(evaluacionnomiBean.getid_estructura());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEvaluacionNomi(EvaluacionNomi evaluacionnomiOrigen,EvaluacionNomi evaluacionnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && evaluacionnomiOrigen.getId()!=null && !evaluacionnomiOrigen.getId().equals(0L))) {evaluacionnomi.setId(evaluacionnomiOrigen.getId());}}
			if(conDefault || (!conDefault && evaluacionnomiOrigen.getid_empleado()!=null && !evaluacionnomiOrigen.getid_empleado().equals(-1L))) {evaluacionnomi.setid_empleado(evaluacionnomiOrigen.getid_empleado());}
			if(conDefault || (!conDefault && evaluacionnomiOrigen.getid_empleado_evaluador()!=null && !evaluacionnomiOrigen.getid_empleado_evaluador().equals(-1L))) {evaluacionnomi.setid_empleado_evaluador(evaluacionnomiOrigen.getid_empleado_evaluador());}
			if(conDefault || (!conDefault && evaluacionnomiOrigen.getid_formato_nomi()!=null && !evaluacionnomiOrigen.getid_formato_nomi().equals(-1L))) {evaluacionnomi.setid_formato_nomi(evaluacionnomiOrigen.getid_formato_nomi());}
			if(conDefault || (!conDefault && evaluacionnomiOrigen.getid_estructura()!=null && !evaluacionnomiOrigen.getid_estructura().equals(-1L))) {evaluacionnomi.setid_estructura(evaluacionnomiOrigen.getid_estructura());}
			if(conDefault || (!conDefault && evaluacionnomiOrigen.getfecha()!=null && !evaluacionnomiOrigen.getfecha().equals(new Date()))) {evaluacionnomi.setfecha(evaluacionnomiOrigen.getfecha());}
			if(conDefault || (!conDefault && evaluacionnomiOrigen.getinstrucciones()!=null && !evaluacionnomiOrigen.getinstrucciones().equals(""))) {evaluacionnomi.setinstrucciones(evaluacionnomiOrigen.getinstrucciones());}
			if(conDefault || (!conDefault && evaluacionnomiOrigen.getdescripcion()!=null && !evaluacionnomiOrigen.getdescripcion().equals(""))) {evaluacionnomi.setdescripcion(evaluacionnomiOrigen.getdescripcion());}
			if(conDefault || (!conDefault && evaluacionnomiOrigen.getdescripcion2()!=null && !evaluacionnomiOrigen.getdescripcion2().equals(""))) {evaluacionnomi.setdescripcion2(evaluacionnomiOrigen.getdescripcion2());}
			if(conDefault || (!conDefault && evaluacionnomiOrigen.getdescripcion3()!=null && !evaluacionnomiOrigen.getdescripcion3().equals(""))) {evaluacionnomi.setdescripcion3(evaluacionnomiOrigen.getdescripcion3());}
			if(conDefault || (!conDefault && evaluacionnomiOrigen.getdescripcion4()!=null && !evaluacionnomiOrigen.getdescripcion4().equals(""))) {evaluacionnomi.setdescripcion4(evaluacionnomiOrigen.getdescripcion4());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEvaluacionNomi(EvaluacionNomi evaluacionnomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEvaluacionNomi.jLabelidEvaluacionNomi.setText(evaluacionnomi.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionNomi.jDateChooserfechaEvaluacionNomi.setDate(evaluacionnomi.getfecha());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreainstruccionesEvaluacionNomi.setText(evaluacionnomi.getinstrucciones());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcionEvaluacionNomi.setText(evaluacionnomi.getdescripcion());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion2EvaluacionNomi.setText(evaluacionnomi.getdescripcion2());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion3EvaluacionNomi.setText(evaluacionnomi.getdescripcion3());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion4EvaluacionNomi.setText(evaluacionnomi.getdescripcion4());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEvaluacionNomi(EvaluacionNomiBean evaluacionnomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEvaluacionNomi.jLabelidEvaluacionNomi.setText(evaluacionnomiBean.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionNomi.jDateChooserfechaEvaluacionNomi.setDate(evaluacionnomiBean.getfecha());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreainstruccionesEvaluacionNomi.setText(evaluacionnomiBean.getinstrucciones());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcionEvaluacionNomi.setText(evaluacionnomiBean.getdescripcion());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion2EvaluacionNomi.setText(evaluacionnomiBean.getdescripcion2());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion3EvaluacionNomi.setText(evaluacionnomiBean.getdescripcion3());
			this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion4EvaluacionNomi.setText(evaluacionnomiBean.getdescripcion4());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEvaluacionNomi(EvaluacionNomiParameterReturnGeneral evaluacionnomiReturnGeneral,EvaluacionNomiBean evaluacionnomiBean,Boolean conDefault) throws Exception { 
		try {
			EvaluacionNomi evaluacionnomiLocal=new EvaluacionNomi();
			
			evaluacionnomiLocal=evaluacionnomiReturnGeneral.getEvaluacionNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && evaluacionnomiLocal.getId()!=null && !evaluacionnomiLocal.getId().equals(0L))) {evaluacionnomiBean.setId(evaluacionnomiLocal.getId());}}
			if(conDefault || (!conDefault && evaluacionnomiLocal.getid_empleado()!=null && !evaluacionnomiLocal.getid_empleado().equals(-1L))) {evaluacionnomiBean.setid_empleado(evaluacionnomiLocal.getid_empleado());}
			if(conDefault || (!conDefault && evaluacionnomiLocal.getid_empleado_evaluador()!=null && !evaluacionnomiLocal.getid_empleado_evaluador().equals(-1L))) {evaluacionnomiBean.setid_empleado_evaluador(evaluacionnomiLocal.getid_empleado_evaluador());}
			if(conDefault || (!conDefault && evaluacionnomiLocal.getid_formato_nomi()!=null && !evaluacionnomiLocal.getid_formato_nomi().equals(-1L))) {evaluacionnomiBean.setid_formato_nomi(evaluacionnomiLocal.getid_formato_nomi());}
			if(conDefault || (!conDefault && evaluacionnomiLocal.getid_estructura()!=null && !evaluacionnomiLocal.getid_estructura().equals(-1L))) {evaluacionnomiBean.setid_estructura(evaluacionnomiLocal.getid_estructura());}
			if(conDefault || (!conDefault && evaluacionnomiLocal.getfecha()!=null && !evaluacionnomiLocal.getfecha().equals(new Date()))) {evaluacionnomiBean.setfecha(evaluacionnomiLocal.getfecha());}
			if(conDefault || (!conDefault && evaluacionnomiLocal.getinstrucciones()!=null && !evaluacionnomiLocal.getinstrucciones().equals(""))) {evaluacionnomiBean.setinstrucciones(evaluacionnomiLocal.getinstrucciones());}
			if(conDefault || (!conDefault && evaluacionnomiLocal.getdescripcion()!=null && !evaluacionnomiLocal.getdescripcion().equals(""))) {evaluacionnomiBean.setdescripcion(evaluacionnomiLocal.getdescripcion());}
			if(conDefault || (!conDefault && evaluacionnomiLocal.getdescripcion2()!=null && !evaluacionnomiLocal.getdescripcion2().equals(""))) {evaluacionnomiBean.setdescripcion2(evaluacionnomiLocal.getdescripcion2());}
			if(conDefault || (!conDefault && evaluacionnomiLocal.getdescripcion3()!=null && !evaluacionnomiLocal.getdescripcion3().equals(""))) {evaluacionnomiBean.setdescripcion3(evaluacionnomiLocal.getdescripcion3());}
			if(conDefault || (!conDefault && evaluacionnomiLocal.getdescripcion4()!=null && !evaluacionnomiLocal.getdescripcion4().equals(""))) {evaluacionnomiBean.setdescripcion4(evaluacionnomiLocal.getdescripcion4());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEvaluacionNomiGenerico(Long idEvaluacionNomiSeleccionado,JComboBox jComboBoxEvaluacionNomi,List<EvaluacionNomi> evaluacionnomisLocal)throws Exception {
		try {
			EvaluacionNomi  evaluacionnomiTemp=null;

			for(EvaluacionNomi evaluacionnomiAux:evaluacionnomisLocal) {
				if(evaluacionnomiAux.getId()!=null && evaluacionnomiAux.getId().equals(idEvaluacionNomiSeleccionado)) {
					evaluacionnomiTemp=evaluacionnomiAux;
					break;
				}
			}

			jComboBoxEvaluacionNomi.setSelectedItem(evaluacionnomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEvaluacionNomiGenerico(JComboBox jComboBoxEvaluacionNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEvaluacionNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEvaluacionNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEvaluacionNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEvaluacionNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEvaluacionNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEvaluacionNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleEvaluacionNomi")) {
			jButtonDetalleEvaluacionNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionnomi=(EvaluacionNomi) evaluacionnomiLogic.getEvaluacionNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			evaluacionnomi =(EvaluacionNomi) evaluacionnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!evaluacionnomi.getIsNew() && !evaluacionnomi.getIsChanged() && !evaluacionnomi.getIsDeleted()) {
				sDescripcion=evaluacionnomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionnomi.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!evaluacionnomi.getIsNew() && !evaluacionnomi.getIsChanged() && !evaluacionnomi.getIsDeleted()) {
				sDescripcion=evaluacionnomi.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionnomi.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!evaluacionnomi.getIsNew() && !evaluacionnomi.getIsChanged() && !evaluacionnomi.getIsDeleted()) {
				sDescripcion=evaluacionnomi.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionnomi.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!evaluacionnomi.getIsNew() && !evaluacionnomi.getIsChanged() && !evaluacionnomi.getIsDeleted()) {
				sDescripcion=evaluacionnomi.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionnomi.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!evaluacionnomi.getIsNew() && !evaluacionnomi.getIsChanged() && !evaluacionnomi.getIsDeleted()) {
				sDescripcion=evaluacionnomi.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionnomi.getempleado_descripcion();
			}
		}

		if(sTipo.equals("EmpleadoEvaluador")) {
			//sDescripcion=this.getActualEmpleadoEvaluadorForeignKeyDescripcion((Long)value);
			if(!evaluacionnomi.getIsNew() && !evaluacionnomi.getIsChanged() && !evaluacionnomi.getIsDeleted()) {
				sDescripcion=evaluacionnomi.getempleadoevaluador_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoEvaluadorForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionnomi.getempleadoevaluador_descripcion();
			}
		}

		if(sTipo.equals("FormatoNomi")) {
			//sDescripcion=this.getActualFormatoNomiForeignKeyDescripcion((Long)value);
			if(!evaluacionnomi.getIsNew() && !evaluacionnomi.getIsChanged() && !evaluacionnomi.getIsDeleted()) {
				sDescripcion=evaluacionnomi.getformatonomi_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoNomiForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionnomi.getformatonomi_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!evaluacionnomi.getIsNew() && !evaluacionnomi.getIsChanged() && !evaluacionnomi.getIsDeleted()) {
				sDescripcion=evaluacionnomi.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionnomi.getestructura_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EvaluacionNomi evaluacionnomiRow=new EvaluacionNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionnomiRow=(EvaluacionNomi) evaluacionnomiLogic.getEvaluacionNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			evaluacionnomiRow=(EvaluacionNomi) evaluacionnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleEvaluacionNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EvaluacionNomi evaluacionnomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEvaluacionNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi = (EvaluacionNomi)this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.evaluacionnomi = (EvaluacionNomi)this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(evaluacionnomi!=null) {
						this.evaluacionnomi = evaluacionnomi;
					} else {
						this.evaluacionnomi = new EvaluacionNomi();
					}
				}

				if(this.isTienePermisosDetalleEvaluacionNomi && this.permiteMantenimiento(this.evaluacionnomi)) {
					DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup=new DetalleEvaluacionNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleevaluacionnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup;
					} else {
						detalleevaluacionnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame;
					}

					List<EvaluacionNomi> evaluacionnomis=new ArrayList<EvaluacionNomi>();
					evaluacionnomis.add(this.evaluacionnomi);
					if(!esRelacionado) {
						//detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setConGuardarRelaciones(false);
						//detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleevaluacionnomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEvaluacionNomi.cargarDetalleEvaluacionNomiBeanSwingJInternalFrame(evaluacionnomis,this.evaluacionnomi,detalleevaluacionnomiBeanSwingJInternalFrame,/*conInicializar,*/detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getConGuardarRelaciones(),detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
					detalleevaluacionnomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleevaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionNomi("no_relacionado");

						detalleevaluacionnomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleEvaluacionNomiConstantesFunciones.ITAMANIOFILATABLA + (DetalleEvaluacionNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleevaluacionnomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosEvaluacionNomi.getBorder();
						TitledBorder titledBorderDetalleEvaluacionNomi=(TitledBorder)detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.getBorder();

						titledBorderDetalleEvaluacionNomi.setTitle(titledBorderEvaluacionNomi.getTitle() + " -> Detalle Evaluacion Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleevaluacionnomiBeanSwingJInternalFrame);
						}

						detalleevaluacionnomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleevaluacionnomiBeanSwingJInternalFrame);

						detalleevaluacionnomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Evaluacion Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEvaluacionNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoEvaluacionNomi && this.isPermisoNuevoEvaluacionNomi));			
			this.jButtonDuplicarEvaluacionNomi.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionNomi && this.isPermisoDuplicarEvaluacionNomi));			
			this.jButtonCopiarEvaluacionNomi.setVisible((this.isVisibilidadCeldaCopiarEvaluacionNomi && this.isPermisoCopiarEvaluacionNomi));
			this.jButtonVerFormEvaluacionNomi.setVisible((this.isVisibilidadCeldaVerFormEvaluacionNomi && this.isPermisoVerFormEvaluacionNomi));
			
			this.jButtonAbrirOrderByEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenEvaluacionNomi && this.isPermisoOrdenEvaluacionNomi));			
			
			this.jButtonNuevoRelacionesEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi && this.isPermisoNuevoEvaluacionNomi));			
			this.jButtonNuevoGuardarCambiosEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoEvaluacionNomi && this.isPermisoNuevoEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi));
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonModificarEvaluacionNomi.setVisible((this.isVisibilidadCeldaModificarEvaluacionNomi && this.isPermisoActualizarEvaluacionNomi));	
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonActualizarEvaluacionNomi.setVisible((this.isVisibilidadCeldaActualizarEvaluacionNomi && this.isPermisoActualizarEvaluacionNomi));	
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonEliminarEvaluacionNomi.setVisible((this.isVisibilidadCeldaEliminarEvaluacionNomi && this.isPermisoEliminarEvaluacionNomi));
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonCancelarEvaluacionNomi.setVisible(this.isVisibilidadCeldaCancelarEvaluacionNomi);							
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoEvaluacionNomi && this.isPermisoNuevoEvaluacionNomi));						
			this.jButtonDuplicarToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionNomi && this.isPermisoDuplicarEvaluacionNomi));						
			this.jButtonCopiarToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaCopiarEvaluacionNomi && this.isPermisoCopiarEvaluacionNomi));			
			this.jButtonVerFormToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaVerFormEvaluacionNomi && this.isPermisoVerFormEvaluacionNomi));			
			this.jButtonAbrirOrderByToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenEvaluacionNomi && this.isPermisoOrdenEvaluacionNomi));
			this.jButtonNuevoRelacionesToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi && this.isPermisoNuevoEvaluacionNomi));			
			this.jButtonNuevoGuardarCambiosToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoEvaluacionNomi && this.isPermisoNuevoEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi));			
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonModificarToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaModificarEvaluacionNomi && this.isPermisoActualizarEvaluacionNomi));	
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonActualizarToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaActualizarEvaluacionNomi  && this.isPermisoActualizarEvaluacionNomi));	
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonEliminarToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaEliminarEvaluacionNomi && this.isPermisoEliminarEvaluacionNomi));
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonCancelarToolBarEvaluacionNomi.setVisible(this.isVisibilidadCeldaCancelarEvaluacionNomi);				
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoEvaluacionNomi && this.isPermisoNuevoEvaluacionNomi));			
			this.jMenuItemDuplicarEvaluacionNomi.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionNomi && this.isPermisoDuplicarEvaluacionNomi));			
			this.jMenuItemCopiarEvaluacionNomi.setVisible((this.isVisibilidadCeldaCopiarEvaluacionNomi && this.isPermisoCopiarEvaluacionNomi));			
			this.jMenuItemVerFormEvaluacionNomi.setVisible((this.isVisibilidadCeldaVerFormEvaluacionNomi && this.isPermisoVerFormEvaluacionNomi));			
			this.jMenuItemAbrirOrderByEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenEvaluacionNomi && this.isPermisoOrdenEvaluacionNomi));			
			//this.jMenuItemMostrarOcultarEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenEvaluacionNomi && this.isPermisoOrdenEvaluacionNomi));
			this.jMenuItemDetalleAbrirOrderByEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenEvaluacionNomi && this.isPermisoOrdenEvaluacionNomi));			
			//this.jMenuItemDetalleMostrarOcultarEvaluacionNomi.setVisible((this.isVisibilidadCeldaOrdenEvaluacionNomi && this.isPermisoOrdenEvaluacionNomi));			
			this.jMenuItemNuevoRelacionesEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi && this.isPermisoNuevoEvaluacionNomi));			
			this.jMenuItemNuevoGuardarCambiosEvaluacionNomi.setVisible((this.isVisibilidadCeldaNuevoEvaluacionNomi && this.isPermisoNuevoEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi));									
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemModificarEvaluacionNomi.setVisible((this.isVisibilidadCeldaModificarEvaluacionNomi && this.isPermisoActualizarEvaluacionNomi));	
			this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemActualizarEvaluacionNomi.setVisible((this.isVisibilidadCeldaActualizarEvaluacionNomi && this.isPermisoActualizarEvaluacionNomi));	
			this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemEliminarEvaluacionNomi.setVisible((this.isVisibilidadCeldaEliminarEvaluacionNomi && this.isPermisoEliminarEvaluacionNomi));
			this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemCancelarEvaluacionNomi.setVisible(this.isVisibilidadCeldaCancelarEvaluacionNomi);				
			}
			
			this.jMenuItemGuardarCambiosEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi));						
			this.jMenuItemGuardarCambiosTablaEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEvaluacionNomi=this.jButtonNuevoEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaDuplicarEvaluacionNomi=this.jButtonDuplicarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaCopiarEvaluacionNomi=this.jButtonCopiarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaVerFormEvaluacionNomi=this.jButtonVerFormEvaluacionNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenEvaluacionNomi=this.jButtonAbrirOrderByEvaluacionNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=this.jButtonNuevoRelacionesEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaModificarEvaluacionNomi=this.jButtonModificarEvaluacionNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			this.isVisibilidadCeldaActualizarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jButtonActualizarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jButtonEliminarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jButtonCancelarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaGuardarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosEvaluacionNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=this.jButtonGuardarCambiosTablaEvaluacionNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEvaluacionNomi=this.jButtonNuevoToolBarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=this.jButtonNuevoRelacionesToolBarEvaluacionNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			this.isVisibilidadCeldaModificarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jButtonModificarToolBarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaActualizarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jButtonActualizarToolBarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jButtonEliminarToolBarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jButtonCancelarToolBarEvaluacionNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEvaluacionNomi=this.jButtonGuardarCambiosToolBarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=this.jButtonGuardarCambiosTablaToolBarEvaluacionNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEvaluacionNomi=this.jMenuItemNuevoEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=this.jMenuItemNuevoRelacionesEvaluacionNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			this.isVisibilidadCeldaModificarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemModificarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaActualizarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemActualizarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemEliminarEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemCancelarEvaluacionNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEvaluacionNomi=this.jMenuItemGuardarCambiosEvaluacionNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=this.jMenuItemGuardarCambiosTablaEvaluacionNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEvaluacionNomi(Boolean esInicializar) {
		if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {
				//if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEvaluacionNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualEvaluacionNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEvaluacionNomi() {
		this.jButtonNuevoEvaluacionNomi.setVisible(this.isPermisoNuevoEvaluacionNomi);			
		this.jButtonDuplicarEvaluacionNomi.setVisible(this.isPermisoDuplicarEvaluacionNomi);			
		this.jButtonCopiarEvaluacionNomi.setVisible(this.isPermisoCopiarEvaluacionNomi);			
		this.jButtonVerFormEvaluacionNomi.setVisible(this.isPermisoVerFormEvaluacionNomi);			
		
		this.jButtonAbrirOrderByEvaluacionNomi.setVisible(this.isPermisoOrdenEvaluacionNomi);					
		
		this.jButtonNuevoRelacionesEvaluacionNomi.setVisible(this.isPermisoNuevoEvaluacionNomi);			
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonModificarEvaluacionNomi.setVisible(this.isPermisoActualizarEvaluacionNomi);	
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonActualizarEvaluacionNomi.setVisible(this.isPermisoActualizarEvaluacionNomi);	
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonEliminarEvaluacionNomi.setVisible(this.isPermisoEliminarEvaluacionNomi);
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonCancelarEvaluacionNomi.setVisible(this.isVisibilidadCeldaCancelarEvaluacionNomi);						
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosEvaluacionNomi.setVisible(this.isPermisoGuardarCambiosEvaluacionNomi);							
		}
		
		this.jButtonGuardarCambiosTablaEvaluacionNomi.setVisible(this.isPermisoActualizarEvaluacionNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEvaluacionNomi() {
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonModificarEvaluacionNomi.setVisible(this.isPermisoActualizarEvaluacionNomi);	
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonActualizarEvaluacionNomi.setVisible(this.isPermisoActualizarEvaluacionNomi);	
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonEliminarEvaluacionNomi.setVisible(this.isPermisoEliminarEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonCancelarEvaluacionNomi.setVisible(this.isVisibilidadCeldaCancelarEvaluacionNomi);							
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosEvaluacionNomi.setVisible((this.isVisibilidadCeldaGuardarEvaluacionNomi && this.isPermisoGuardarCambiosEvaluacionNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEvaluacionNomi() {
		if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEvaluacionNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEvaluacionNomi() {
	}
	
	public void jTableDatosEvaluacionNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEvaluacionNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.evaluacionnomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEvaluacionNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.evaluacionnomiLogic.getConnexion());

				if(this.evaluacionnomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.evaluacionnomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosEvaluacionNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEvaluacionNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.evaluacionnomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebEvaluacionNomi(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.evaluacionnomiLogic.getConnexion());

				if(this.evaluacionnomi.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.evaluacionnomi.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosEvaluacionNomi.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderEvaluacionNomi.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.evaluacionnomi.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebEvaluacionNomi(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.evaluacionnomiLogic.getConnexion());

				if(this.evaluacionnomi.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.evaluacionnomi.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosEvaluacionNomi.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderEvaluacionNomi.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.evaluacionnomi.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebEvaluacionNomi(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.evaluacionnomiLogic.getConnexion());

				if(this.evaluacionnomi.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.evaluacionnomi.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosEvaluacionNomi.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderEvaluacionNomi.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.evaluacionnomi.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEvaluacionNomi(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.evaluacionnomiLogic.getConnexion());

				if(this.evaluacionnomi.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.evaluacionnomi.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosEvaluacionNomi.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEvaluacionNomi.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.evaluacionnomi.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleado_evaluadorEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleadoevaluador=true;

			idTienePermisoempleadoevaluador=this.tienePermisosUsuarioEnPaginaWebEvaluacionNomi(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleadoevaluador) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);

				this.empleadoevaluadorBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoevaluadorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoevaluadorBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.evaluacionnomiLogic.getConnexion());

				if(this.evaluacionnomi.getid_empleado_evaluador()!=null) {
					this.empleadoevaluadorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoevaluadorBeanSwingJInternalFrame.setIdActual(this.evaluacionnomi.getid_empleado_evaluador());
					this.empleadoevaluadorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoevaluadorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoevaluadorBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoevaluadorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosEvaluacionNomi.getBorder();
				TitledBorder titledBorderempleadoevaluador=(TitledBorder)this.empleadoevaluadorBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleadoevaluador.setTitle(titledBorderEvaluacionNomi.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleado_evaluadorEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getid_empleado_evaluador()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado_evaluador = "+this.evaluacionnomi.getid_empleado_evaluador().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato_nomiEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformatonomi=true;

			idTienePermisoformatonomi=this.tienePermisosUsuarioEnPaginaWebEvaluacionNomi(FormatoNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoformatonomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);

				this.formatonomiBeanSwingJInternalFrame=new FormatoNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatonomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatonomiBeanSwingJInternalFrame.getFormatoNomiLogic().setConnexion(this.evaluacionnomiLogic.getConnexion());

				if(this.evaluacionnomi.getid_formato_nomi()!=null) {
					this.formatonomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatonomiBeanSwingJInternalFrame.setIdActual(this.evaluacionnomi.getid_formato_nomi());
					this.formatonomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatonomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatonomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomi();
				}

				JInternalFrameBase jinternalFrame =this.formatonomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosEvaluacionNomi.getBorder();
				TitledBorder titledBorderformatonomi=(TitledBorder)this.formatonomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomi.getBorder();

				titledBorderformatonomi.setTitle(titledBorderEvaluacionNomi.getTitle() + " -> Formato Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato_nomiEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getid_formato_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato_nomi = "+this.evaluacionnomi.getid_formato_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraEvaluacionNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebEvaluacionNomi(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.evaluacionnomiLogic.getConnexion());

				if(this.evaluacionnomi.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.evaluacionnomi.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionNomi=(TitledBorder)this.jScrollPanelDatosEvaluacionNomi.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderEvaluacionNomi.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.evaluacionnomi.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.evaluacionnomi.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoninstruccionesEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getinstrucciones()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where instrucciones like '%"+this.evaluacionnomi.getinstrucciones()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionEvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.evaluacionnomi.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcion2EvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getdescripcion2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion2 like '%"+this.evaluacionnomi.getdescripcion2()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcion3EvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getdescripcion3()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion3 like '%"+this.evaluacionnomi.getdescripcion3()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcion4EvaluacionNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.getevaluacionnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionnomi==null) {
						this.evaluacionnomi = new EvaluacionNomi();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);
				}

				if(this.evaluacionnomi.getdescripcion4()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion4 like '%"+this.evaluacionnomi.getdescripcion4()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEjercicioEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionNomi(false,false);

			this.getEvaluacionNomisFK_IdEjercicio();

			this.inicializarActualizarBindingEvaluacionNomi(false);

			//if(EvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionNomi(false,false);

			this.getEvaluacionNomisFK_IdEmpleado();

			this.inicializarActualizarBindingEvaluacionNomi(false);

			//if(EvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoEvaluadorEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionNomi(false,false);

			this.getEvaluacionNomisFK_IdEmpleadoEvaluador();

			this.inicializarActualizarBindingEvaluacionNomi(false);

			//if(EvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionNomi(false,false);

			this.getEvaluacionNomisFK_IdEmpresa();

			this.inicializarActualizarBindingEvaluacionNomi(false);

			//if(EvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionNomi(false,false);

			this.getEvaluacionNomisFK_IdEstructura();

			this.inicializarActualizarBindingEvaluacionNomi(false);

			//if(EvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoNomiEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionNomi(false,false);

			this.getEvaluacionNomisFK_IdFormatoNomi();

			this.inicializarActualizarBindingEvaluacionNomi(false);

			//if(EvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionNomi(false,false);

			this.getEvaluacionNomisFK_IdPeriodo();

			this.inicializarActualizarBindingEvaluacionNomi(false);

			//if(EvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalEvaluacionNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionNomi(false,false);

			this.getEvaluacionNomisFK_IdSucursal();

			this.inicializarActualizarBindingEvaluacionNomi(false);

			//if(EvaluacionNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEvaluacionNomi() {
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
		

		if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
			this.jInternalFrameDetalleFormEvaluacionNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormEvaluacionNomi.dispose();
			this.jInternalFrameDetalleFormEvaluacionNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEvaluacionNomi!=null) {
			this.jInternalFrameReporteDinamicoEvaluacionNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEvaluacionNomi.dispose();
			this.jInternalFrameReporteDinamicoEvaluacionNomi=null;
		}
		
		if(this.jInternalFrameImportacionEvaluacionNomi!=null) {
			this.jInternalFrameImportacionEvaluacionNomi.setVisible(false);	    			
			this.jInternalFrameImportacionEvaluacionNomi.dispose();
			this.jInternalFrameImportacionEvaluacionNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEvaluacionNomi();
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoEvaluacionNomi")) {
				jButtonNuevoEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEvaluacionNomi")) {
				jButtonDuplicarEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEvaluacionNomi")) {
				jButtonCopiarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormEvaluacionNomi")) {
				jButtonVerFormEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEvaluacionNomi")) {
				jButtonNuevoEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEvaluacionNomi")) {
				jButtonDuplicarEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEvaluacionNomi")) {
				jButtonNuevoEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEvaluacionNomi")) {
				jButtonDuplicarEvaluacionNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEvaluacionNomi")) {
				jButtonNuevoEvaluacionNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEvaluacionNomi")) {
				jButtonNuevoEvaluacionNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEvaluacionNomi")) {
				jButtonNuevoEvaluacionNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEvaluacionNomi")) {
				jButtonModificarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEvaluacionNomi")) {
				jButtonModificarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEvaluacionNomi")) {
				jButtonModificarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEvaluacionNomi")) {
				jButtonActualizarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEvaluacionNomi")) {
				jButtonActualizarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEvaluacionNomi")) {
				jButtonActualizarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarEvaluacionNomi")) {
				jButtonEliminarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEvaluacionNomi")) {
				jButtonEliminarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEvaluacionNomi")) {
				jButtonEliminarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarEvaluacionNomi")) {
				jButtonCancelarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEvaluacionNomi")) {
				jButtonCancelarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEvaluacionNomi")) {
				jButtonCancelarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarEvaluacionNomi")) {
				jButtonCerrarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEvaluacionNomi")) {
				jButtonCerrarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEvaluacionNomi")) {
				jButtonCerrarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEvaluacionNomi")) {
				jButtonMostrarOcultarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEvaluacionNomi")) {
				jButtonCancelarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEvaluacionNomi")) {
				jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEvaluacionNomi")) {
				jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEvaluacionNomi")) {
				jButtonCopiarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEvaluacionNomi")) {
				jButtonVerFormEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEvaluacionNomi")) {
				jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEvaluacionNomi")) {
				jButtonCopiarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEvaluacionNomi")) {
				jButtonVerFormEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEvaluacionNomi")) {
				jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEvaluacionNomi")) {
				jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEvaluacionNomi")) {
				jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEvaluacionNomi")) {
				jButtonRecargarInformacionEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEvaluacionNomi")) {
				jButtonRecargarInformacionEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEvaluacionNomi")) {
				jButtonRecargarInformacionEvaluacionNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEvaluacionNomi")) {
				jButtonAnterioresEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEvaluacionNomi")) {
				jButtonAnterioresEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEvaluacionNomi")) {
				jButtonAnterioresEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEvaluacionNomi")) {
				jButtonSiguientesEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEvaluacionNomi")) {
				jButtonSiguientesEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEvaluacionNomi")) {
				jButtonSiguientesEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEvaluacionNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByEvaluacionNomi")) {
				jButtonAbrirOrderByEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEvaluacionNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarEvaluacionNomi")) {
				jButtonMostrarOcultarEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEvaluacionNomi")) {
				jButtonNuevoGuardarCambiosEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEvaluacionNomi")) {
				jButtonNuevoGuardarCambiosEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEvaluacionNomi")) {
				jButtonNuevoGuardarCambiosEvaluacionNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEvaluacionNomi")) {
				jButtonCerrarReporteDinamicoEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEvaluacionNomi")) {
				jButtonGenerarReporteDinamicoEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEvaluacionNomi")) {
				
				jButtonGenerarExcelReporteDinamicoEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEvaluacionNomi")) {
				jButtonCerrarImportacionEvaluacionNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEvaluacionNomi")) {
				
				jButtonGenerarImportacionEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEvaluacionNomi")) {
				
				jButtonAbrirImportacionEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEvaluacionNomi")) {
				jComboBoxTiposAccionesEvaluacionNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEvaluacionNomi")) {
				jComboBoxTiposRelacionesEvaluacionNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEvaluacionNomi")) {
				jComboBoxTiposAccionesEvaluacionNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEvaluacionNomi")) {
				
				jComboBoxTiposSeleccionarEvaluacionNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEvaluacionNomi")) {
				jTextFieldValorCampoGeneralEvaluacionNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEvaluacionNomi")) {
				jButtonAbrirOrderByEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEvaluacionNomi")) {
				jButtonAbrirOrderByEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEvaluacionNomi")) {
				jButtonCerrarOrderByEvaluacionNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEvaluacionNomiBusqueda")) {
				this.jButtonidEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEvaluacionNomiUpdate")) {
				this.jButtonid_empresaEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEvaluacionNomiBusqueda")) {
				this.jButtonid_empresaEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionNomiUpdate")) {
				this.jButtonid_sucursalEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionNomiBusqueda")) {
				this.jButtonid_sucursalEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionNomiUpdate")) {
				this.jButtonid_ejercicioEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionNomiBusqueda")) {
				this.jButtonid_ejercicioEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoEvaluacionNomiUpdate")) {
				this.jButtonid_periodoEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoEvaluacionNomiBusqueda")) {
				this.jButtonid_periodoEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEvaluacionNomiUpdate")) {
				this.jButtonid_empleadoEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEvaluacionNomiBusqueda")) {
				this.jButtonid_empleadoEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_evaluadorEvaluacionNomiUpdate")) {
				this.jButtonid_empleado_evaluadorEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_evaluadorEvaluacionNomiBusqueda")) {
				this.jButtonid_empleado_evaluadorEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomiEvaluacionNomiUpdate")) {
				this.jButtonid_formato_nomiEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomiEvaluacionNomiBusqueda")) {
				this.jButtonid_formato_nomiEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionNomiUpdate")) {
				this.jButtonid_estructuraEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionNomiBusqueda")) {
				this.jButtonid_estructuraEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaEvaluacionNomiBusqueda")) {
				this.jButtonfechaEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("instruccionesEvaluacionNomiBusqueda")) {
				this.jButtoninstruccionesEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEvaluacionNomiBusqueda")) {
				this.jButtondescripcionEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion2EvaluacionNomiBusqueda")) {
				this.jButtondescripcion2EvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion3EvaluacionNomiBusqueda")) {
				this.jButtondescripcion3EvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion4EvaluacionNomiBusqueda")) {
				this.jButtondescripcion4EvaluacionNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoEvaluacionNomi")) {
				this.jButtonFK_IdEmpleadoEvaluacionNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoEvaluadorEvaluacionNomi")) {
				this.jButtonFK_IdEmpleadoEvaluadorEvaluacionNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraEvaluacionNomi")) {
				this.jButtonFK_IdEstructuraEvaluacionNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFormatoNomiEvaluacionNomi")) {
				this.jButtonFK_IdFormatoNomiEvaluacionNomiActionPerformed(evt);
			}
			
			;
			
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEvaluacionNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				


				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EvaluacionNomi evaluacionnomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				evaluacionnomiLocal=this.evaluacionnomi;
			} else {
				evaluacionnomiLocal=this.evaluacionnomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
							
				
				


				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
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
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
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
			
			


			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
								
						
				


				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
								
				
				


				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
							
				
				


				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
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
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
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
			
			


			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
								
				
				


				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEvaluacionNomi")) {
					jCheckBoxSeleccionarTodosEvaluacionNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEvaluacionNomi")) {
					jCheckBoxSeleccionadosEvaluacionNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEvaluacionNomi")) {
					
				}
				
				


				
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
												
				
				


				
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
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
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
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
			
			


			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionnomi);
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
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
				
				


				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionnomiAnterior =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEvaluacionNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEvaluacionNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEvaluacionNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.evaluacionnomi =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.evaluacionnomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEvaluacionNomi")) {
				
				}
				
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEvaluacionNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEvaluacionNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEvaluacionNomi")) {
			
			}
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEvaluacionNomi();
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
			if(sTipo.equals("NuevoEvaluacionNomi")) {
				jButtonNuevoEvaluacionNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEvaluacionNomi")) {
				jButtonDuplicarEvaluacionNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEvaluacionNomi")) {
				jButtonCopiarEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEvaluacionNomi")) {
				jButtonVerFormEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEvaluacionNomi")) {
				jButtonNuevoEvaluacionNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEvaluacionNomi")) {
				jButtonModificarEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEvaluacionNomi")) {
				jButtonActualizarEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEvaluacionNomi")) {
				jButtonEliminarEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEvaluacionNomi")) {
				jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEvaluacionNomi")) {
				jButtonCancelarEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEvaluacionNomi")) {
				jButtonCerrarEvaluacionNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEvaluacionNomi")) {
				jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEvaluacionNomi")) {
				jButtonNuevoGuardarCambiosEvaluacionNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEvaluacionNomi")) {
				jButtonAbrirOrderByEvaluacionNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEvaluacionNomi")) {
				jButtonRecargarInformacionEvaluacionNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEvaluacionNomi")) {
				jButtonAnterioresEvaluacionNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEvaluacionNomi")) {
				jButtonSiguientesEvaluacionNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEvaluacionNomiBusqueda")) {
				this.jButtonidEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEvaluacionNomiUpdate")) {
				this.jButtonid_empresaEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEvaluacionNomiBusqueda")) {
				this.jButtonid_empresaEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionNomiUpdate")) {
				this.jButtonid_sucursalEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionNomiBusqueda")) {
				this.jButtonid_sucursalEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionNomiUpdate")) {
				this.jButtonid_ejercicioEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionNomiBusqueda")) {
				this.jButtonid_ejercicioEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoEvaluacionNomiUpdate")) {
				this.jButtonid_periodoEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoEvaluacionNomiBusqueda")) {
				this.jButtonid_periodoEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEvaluacionNomiUpdate")) {
				this.jButtonid_empleadoEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEvaluacionNomiBusqueda")) {
				this.jButtonid_empleadoEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_evaluadorEvaluacionNomiUpdate")) {
				this.jButtonid_empleado_evaluadorEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_evaluadorEvaluacionNomiBusqueda")) {
				this.jButtonid_empleado_evaluadorEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomiEvaluacionNomiUpdate")) {
				this.jButtonid_formato_nomiEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomiEvaluacionNomiBusqueda")) {
				this.jButtonid_formato_nomiEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionNomiUpdate")) {
				this.jButtonid_estructuraEvaluacionNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEvaluacionNomiBusqueda")) {
				this.jButtonid_estructuraEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaEvaluacionNomiBusqueda")) {
				this.jButtonfechaEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("instruccionesEvaluacionNomiBusqueda")) {
				this.jButtoninstruccionesEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEvaluacionNomiBusqueda")) {
				this.jButtondescripcionEvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion2EvaluacionNomiBusqueda")) {
				this.jButtondescripcion2EvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion3EvaluacionNomiBusqueda")) {
				this.jButtondescripcion3EvaluacionNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion4EvaluacionNomiBusqueda")) {
				this.jButtondescripcion4EvaluacionNomiBusquedaActionPerformed(evt);
			}
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEvaluacionNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEvaluacionNomi")) {
				closingInternalFrameEvaluacionNomi();
				
			} else if(sTipo.equals("jButtonCancelarEvaluacionNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormEvaluacionNomi = (JInternalFrameBase)evt.getSource();
	            	
	            EvaluacionNomiBeanSwingJInternalFrame jInternalFrameParent=(EvaluacionNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormEvaluacionNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEvaluacionNomiActionPerformed(null);
			}
			
			EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.evaluacionnomi,new Object(),this.evaluacionnomiParameterGeneral,this.evaluacionnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEvaluacionNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEvaluacionNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEvaluacionNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.evaluacionnomi)) {
			if(!esControlTabla) {
				if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);			
				}
				
				if(this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEvaluacionNomi(this.evaluacionnomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.evaluacionnomiReturnGeneral=evaluacionnomiLogic.procesarEventosEvaluacionNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionnomiLogic.getEvaluacionNomis(),this.evaluacionnomi,this.evaluacionnomiParameterGeneral,this.isEsNuevoEvaluacionNomi,classes);//this.evaluacionnomiLogic.getEvaluacionNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEvaluacionNomi(this.evaluacionnomiReturnGeneral,this.evaluacionnomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEvaluacionNomi(classes,this.evaluacionnomiReturnGeneral,this.evaluacionnomiBean,false);
					}
						
					if(this.evaluacionnomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionNomi(this.evaluacionnomiReturnGeneral.getEvaluacionNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEvaluacionNomi(this.evaluacionnomiReturnGeneral.getEvaluacionNomi());	
					}
						
					if(this.evaluacionnomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEvaluacionNomi(this.evaluacionnomiReturnGeneral.getEvaluacionNomi(),classes);//this.evaluacionnomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEvaluacionNomi(this.evaluacionnomi,classes);//this.evaluacionnomiBean);									
				}
			
				if(EvaluacionNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEvaluacionNomi(this.evaluacionnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionNomi(this.evaluacionnomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.evaluacionnomiAnterior!=null) {
						this.evaluacionnomi=this.evaluacionnomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.evaluacionnomiReturnGeneral=evaluacionnomiLogic.procesarEventosEvaluacionNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionnomiLogic.getEvaluacionNomis(),this.evaluacionnomi,this.evaluacionnomiParameterGeneral,this.isEsNuevoEvaluacionNomi,classes);//this.evaluacionnomiLogic.getEvaluacionNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.evaluacionnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.evaluacionnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.evaluacionnomiReturnGeneral.getEvaluacionNomi(),evaluacionnomiLogic.getEvaluacionNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.evaluacionnomiReturnGeneral.getEvaluacionNomi(),this.evaluacionnomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEvaluacionNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosEvaluacionNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEvaluacionNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosEvaluacionNomi() throws Exception {
		
		EvaluacionNomiModel evaluacionnomiModel=(EvaluacionNomiModel)this.jTableDatosEvaluacionNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionnomiModel.evaluacionnomis=this.evaluacionnomiLogic.getEvaluacionNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			evaluacionnomiModel.evaluacionnomis=this.evaluacionnomis;
		}
		
		
		((EvaluacionNomiModel) this.jTableDatosEvaluacionNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEvaluacionNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getevaluacionnomiAnterior(),this.evaluacionnomiLogic.getEvaluacionNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getevaluacionnomiAnterior(),this.evaluacionnomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEvaluacionNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEvaluacionNomi(EvaluacionNomi evaluacionnomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionNomi.class)) {
					this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(evaluacionnomi.getDetalleEvaluacionNomis());
					this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
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
										
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionnomi,new Object(),generalEntityParameterGeneral,this.evaluacionnomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.evaluacionnomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EvaluacionNomiConstantesFunciones.getClassesRelationshipsOfEvaluacionNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EvaluacionNomiConstantesFunciones.getClassesRelationshipsFromStringsOfEvaluacionNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEvaluacionNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EvaluacionNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionnomi,new Object(),generalEntityParameterGeneral,this.evaluacionnomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEvaluacionNomi(EvaluacionNomiBean evaluacionnomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionNomi.class)) {
					this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(evaluacionnomi.getDetalleEvaluacionNomis());
					this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEvaluacionNomi(ArrayList<Classe> classes,EvaluacionNomiReturnGeneral evaluacionnomiReturnGeneral,EvaluacionNomiBean evaluacionnomiBean,Boolean conDefault) throws Exception {
		
			this.evaluacionnomiBean.setDetalleEvaluacionNomis(evaluacionnomiReturnGeneral.getEvaluacionNomi().getDetalleEvaluacionNomis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEvaluacionNomi(EvaluacionNomi evaluacionnomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionNomi.class)) {
					evaluacionnomi.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.evaluacionnomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEvaluacionNomi = new EvaluacionNomiDetalleFormJInternalFrame(jDesktopPane,this.evaluacionnomiSessionBean.getConGuardarRelaciones(),this.evaluacionnomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.setVisible(false);
		this.jInternalFrameDetalleFormEvaluacionNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormEvaluacionNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEvaluacionNomi.evaluacionnomiLogic=this.evaluacionnomiLogic;
		
		this.cargarCombosFrameForeignKeyEvaluacionNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEvaluacionNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEvaluacionNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEvaluacionNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEvaluacionNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEvaluacionNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEvaluacionNomi"));
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonModificarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ModificarEvaluacionNomi"));

		
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonModificarToolBarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarEvaluacionNomi"));
					
		this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemModificarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarEvaluacionNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonActualizarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"ActualizarEvaluacionNomi"));
		
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonActualizarToolBarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEvaluacionNomi"));
						
		this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemActualizarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEvaluacionNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonEliminarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"EliminarEvaluacionNomi"));
		
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonEliminarToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarEvaluacionNomi"));
								
		this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemEliminarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEvaluacionNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonCancelarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CancelarEvaluacionNomi"));
		
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonCancelarToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarEvaluacionNomi"));
					
		this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemCancelarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEvaluacionNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemDetalleCerrarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEvaluacionNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionNomi"));
		
		
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionNomi"));
		
		
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEvaluacionNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonidEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empresaEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empresaEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_sucursalEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_sucursalEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_ejercicioEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_ejercicioEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_periodoEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_periodoEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleadoEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleadoEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleado_evaluadorEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_evaluadorEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_evaluadorEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_formato_nomiEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_formato_nomiEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_estructuraEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_estructuraEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonfechaEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtoninstruccionesEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"instruccionesEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcionEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcion2EvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2EvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcion3EvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcion3EvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcion4EvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcion4EvaluacionNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEvaluacionNomi.jTabbedPaneRelacionesEvaluacionNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEvaluacionNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEvaluacionNomi"));
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEvaluacionNomi"));
		}
		
		this.jTableDatosEvaluacionNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEvaluacionNomi"));
		
		this.jTableDatosEvaluacionNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEvaluacionNomi"));
		
		this.jButtonNuevoEvaluacionNomi.addActionListener(new ButtonActionListener(this,"NuevoEvaluacionNomi"));
		
		this.jButtonDuplicarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"DuplicarEvaluacionNomi"));
		
		this.jButtonCopiarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"CopiarEvaluacionNomi"));
		
		this.jButtonVerFormEvaluacionNomi.addActionListener(new ButtonActionListener(this,"VerFormEvaluacionNomi"));
		
		
		this.jButtonNuevoToolBarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarEvaluacionNomi"));
			
		this.jButtonDuplicarToolBarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEvaluacionNomi"));
			
		this.jMenuItemNuevoEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEvaluacionNomi"));
			
		this.jMenuItemDuplicarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEvaluacionNomi"));		
		
		
		this.jButtonNuevoRelacionesEvaluacionNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEvaluacionNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEvaluacionNomi"));
			
		this.jMenuItemNuevoRelacionesEvaluacionNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEvaluacionNomi"));		
		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonModificarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ModificarEvaluacionNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonModificarToolBarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarEvaluacionNomi"));
			
			this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemModificarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarEvaluacionNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonActualizarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"ActualizarEvaluacionNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonActualizarToolBarEvaluacionNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEvaluacionNomi"));
				
			this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemActualizarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEvaluacionNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonEliminarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"EliminarEvaluacionNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonEliminarToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarEvaluacionNomi"));
						
			this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemEliminarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEvaluacionNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonCancelarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CancelarEvaluacionNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonCancelarToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarEvaluacionNomi"));
			
			this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemCancelarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEvaluacionNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEvaluacionNomi"));		
		
		
		this.jButtonCerrarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CerrarEvaluacionNomi"));
		
		
		this.jButtonCerrarToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarEvaluacionNomi"));
			
		this.jMenuItemCerrarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEvaluacionNomi"));
			
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jMenuItemDetalleCerrarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEvaluacionNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosEvaluacionNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionNomi"));
		}
		
		this.jButtonCopiarToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarEvaluacionNomi"));
			
		this.jButtonVerFormToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarEvaluacionNomi"));
		
		this.jMenuItemGuardarCambiosEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEvaluacionNomi"));
			
		this.jMenuItemCopiarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEvaluacionNomi"));		
		
		this.jMenuItemVerFormEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEvaluacionNomi"));		
		
		
		this.jButtonGuardarCambiosTablaEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEvaluacionNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEvaluacionNomi"));
			
		this.jMenuItemGuardarCambiosTablaEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEvaluacionNomi"));		
		
		
		
		this.jButtonRecargarInformacionEvaluacionNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionEvaluacionNomi"));
					
		this.jButtonRecargarInformacionToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEvaluacionNomi"));
		
		this.jMenuItemRecargarInformacionEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEvaluacionNomi"));		
		
		
		
		this.jButtonAnterioresEvaluacionNomi.addActionListener (new ButtonActionListener(this,"AnterioresEvaluacionNomi"));
		
		
		this.jButtonAnterioresToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEvaluacionNomi"));
		
		this.jMenuItemAnterioresEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEvaluacionNomi"));		
		
		
		this.jButtonSiguientesEvaluacionNomi.addActionListener (new ButtonActionListener(this,"SiguientesEvaluacionNomi"));
		
		
		this.jButtonSiguientesToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEvaluacionNomi"));
			
		this.jMenuItemSiguientesEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEvaluacionNomi"));
			
		this.jMenuItemAbrirOrderByEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEvaluacionNomi"));
			
		this.jMenuItemMostrarOcultarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEvaluacionNomi"));
			
		this.jMenuItemDetalleAbrirOrderByEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEvaluacionNomi"));
			
		this.jMenuItemDetalleMostarOcultarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEvaluacionNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosEvaluacionNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEvaluacionNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEvaluacionNomi"));
			
		this.jMenuItemNuevoGuardarCambiosEvaluacionNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEvaluacionNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEvaluacionNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEvaluacionNomi"));

		this.jCheckBoxSeleccionadosEvaluacionNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEvaluacionNomi"));
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEvaluacionNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesEvaluacionNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesEvaluacionNomi"));
			
		this.jComboBoxTiposAccionesEvaluacionNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesEvaluacionNomi"));
					
		this.jComboBoxTiposSeleccionarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEvaluacionNomi"));
			
		this.jTextFieldValorCampoGeneralEvaluacionNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEvaluacionNomi"));		
		
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonidEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empresaEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empresaEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_sucursalEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_sucursalEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_ejercicioEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_ejercicioEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_periodoEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_periodoEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleadoEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleadoEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleado_evaluadorEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_evaluadorEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_evaluadorEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_formato_nomiEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_formato_nomiEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_estructuraEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_estructuraEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonfechaEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtoninstruccionesEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"instruccionesEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcionEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcion2EvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2EvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcion3EvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcion3EvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcion4EvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcion4EvaluacionNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEvaluacionNomi"));

			this.jButtonFK_IdEmpleadoEvaluadorEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEvaluadorEvaluacionNomi"));

			this.jButtonFK_IdEstructuraEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraEvaluacionNomi"));

			this.jButtonFK_IdFormatoNomiEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiEvaluacionNomi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEvaluacionNomi!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionNomi"));
				this.jInternalFrameReporteDinamicoEvaluacionNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionNomi"));
				this.jInternalFrameReporteDinamicoEvaluacionNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoEvaluacionNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionNomi"));				
			//this.jButtonGenerarReporteDinamicoEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionNomi"));
			//this.jButtonGenerarExcelReporteDinamicoEvaluacionNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEvaluacionNomi!=null) {
				this.jInternalFrameImportacionEvaluacionNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEvaluacionNomi"));
				this.jInternalFrameImportacionEvaluacionNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEvaluacionNomi"));
				this.jInternalFrameImportacionEvaluacionNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEvaluacionNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEvaluacionNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByEvaluacionNomi"));
			
			this.jButtonAbrirOrderByToolBarEvaluacionNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEvaluacionNomi"));			
			
			if(this.jInternalFrameOrderByEvaluacionNomi!=null) {
				this.jInternalFrameOrderByEvaluacionNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEvaluacionNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionNomi.jTabbedPaneRelacionesEvaluacionNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEvaluacionNomi"));
		
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
            		closingInternalFrameEvaluacionNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEvaluacionNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEvaluacionNomi = (JInternalFrameBase)event.getSource();
	            	
	            EvaluacionNomiBeanSwingJInternalFrame jInternalFrameParent=(EvaluacionNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormEvaluacionNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEvaluacionNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEvaluacionNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEvaluacionNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEvaluacionNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEvaluacionNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEvaluacionNomi";
		inputMap = this.jButtonNuevoEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEvaluacionNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEvaluacionNomi";
		inputMap = this.jButtonNuevoRelacionesEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEvaluacionNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEvaluacionNomi";
		inputMap = this.jButtonModificarEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEvaluacionNomi";
		inputMap = this.jButtonActualizarEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEvaluacionNomi";
		inputMap = this.jButtonEliminarEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEvaluacionNomi";
		inputMap = this.jButtonCancelarEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEvaluacionNomi";
		inputMap = this.jButtonCerrarEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEvaluacionNomi";
		inputMap = this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosEvaluacionNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonGuardarCambiosEvaluacionNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEvaluacionNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEvaluacionNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEvaluacionNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEvaluacionNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEvaluacionNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEvaluacionNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEvaluacionNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEvaluacionNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEvaluacionNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonidEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empresaEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empresaEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_sucursalEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_sucursalEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_ejercicioEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_ejercicioEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_periodoEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_periodoEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleadoEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleadoEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleado_evaluadorEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_evaluadorEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_empleado_evaluadorEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_evaluadorEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_formato_nomiEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_formato_nomiEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiEvaluacionNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_estructuraEvaluacionNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonid_estructuraEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtonfechaEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtoninstruccionesEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"instruccionesEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcionEvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcion2EvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2EvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcion3EvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcion3EvaluacionNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionNomi.jButtondescripcion4EvaluacionNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcion4EvaluacionNomiBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEvaluacionNomi"));

		this.jButtonFK_IdEmpleadoEvaluadorEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEvaluadorEvaluacionNomi"));

		this.jButtonFK_IdEstructuraEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraEvaluacionNomi"));

		this.jButtonFK_IdFormatoNomiEvaluacionNomi.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiEvaluacionNomi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEvaluacionNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEvaluacionNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEvaluacionNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEvaluacionNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEvaluacionNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomiLogic.getEvaluacionNomis()) {
					evaluacionnomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionNomi evaluacionnomiAux:evaluacionnomis) {
					evaluacionnomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEvaluacionNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEvaluacionNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomiLogic.getEvaluacionNomis()) {
						evaluacionnomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionNomi evaluacionnomiAux:evaluacionnomis) {
						evaluacionnomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomiLogic.getEvaluacionNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionNomi evaluacionnomiAux:evaluacionnomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEvaluacionNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEvaluacionNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEvaluacionNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEvaluacionNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEvaluacionNomi.getSelectedRows();
			
			EvaluacionNomi evaluacionnomiLocal=new EvaluacionNomi();
			
			//this.seleccionarTodosEvaluacionNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionnomiLocal =(EvaluacionNomi) this.evaluacionnomiLogic.getEvaluacionNomis().toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					evaluacionnomiLocal =(EvaluacionNomi) this.evaluacionnomis.toArray()[this.jTableDatosEvaluacionNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				evaluacionnomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomiLogic.getEvaluacionNomis()) {
						evaluacionnomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionNomi evaluacionnomiAux:evaluacionnomis) {
						evaluacionnomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEvaluacionNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEvaluacionNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEvaluacionNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEvaluacionNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEvaluacionNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEvaluacionNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEvaluacionNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomiLogic.getEvaluacionNomis()) {
				
						if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							evaluacionnomiAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES)) {
							existe=true;
							evaluacionnomiAux.setinstrucciones(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							evaluacionnomiAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2)) {
							existe=true;
							evaluacionnomiAux.setdescripcion2(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3)) {
							existe=true;
							evaluacionnomiAux.setdescripcion3(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4)) {
							existe=true;
							evaluacionnomiAux.setdescripcion4(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionNomi evaluacionnomiAux:evaluacionnomis) {
					
						if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							evaluacionnomiAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES)) {
							existe=true;
							evaluacionnomiAux.setinstrucciones(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							evaluacionnomiAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2)) {
							existe=true;
							evaluacionnomiAux.setdescripcion2(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3)) {
							existe=true;
							evaluacionnomiAux.setdescripcion3(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4)) {
							existe=true;
							evaluacionnomiAux.setdescripcion4(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEvaluacionNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEvaluacionNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEvaluacionNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEvaluacionNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEvaluacionNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessEvaluacionNomi(conSplash);
				
					this.generarReporteEvaluacionNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEvaluacionNomisSeleccionados();
				//this.jComboBoxTiposAccionesEvaluacionNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEvaluacionNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesEvaluacionNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEvaluacionNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesEvaluacionNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEvaluacionNomi();
				
				this.exportarEvaluacionNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEvaluacionNomis();
				//this.importarEvaluacionNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEvaluacionNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEvaluacionNomisSeleccionados();
				//this.jComboBoxTiposAccionesEvaluacionNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Evaluacion Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEvaluacionNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEvaluacionNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEvaluacionNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(EvaluacionNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEvaluacionNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEvaluacionNomi(conSplash);
					
						//this.actualizarParametrosGeneralEvaluacionNomi();
						
						this.generarReporteProcesoAccionEvaluacionNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEvaluacionNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EvaluacionNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Evaluacion NomiS SELECCIONADOS?", "MANTENIMIENTO DE Evaluacion Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEvaluacionNomi();
				
						this.actualizarParametrosGeneralEvaluacionNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.evaluacionnomiReturnGeneral=evaluacionnomiLogic.procesarAccionEvaluacionNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.evaluacionnomiLogic.getEvaluacionNomis(),this.evaluacionnomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEvaluacionNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEvaluacionNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEvaluacionNomi();
					
					EvaluacionNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEvaluacionNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEvaluacionNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxTiposAccionesFormularioEvaluacionNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEvaluacionNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEvaluacionNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEvaluacionNomi();
			
			if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();		
			EvaluacionNomi evaluacionnomi=new EvaluacionNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEvaluacionNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEvaluacionNomi.getSelectedItem();
			
			
			
			
			evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(evaluacionnomisSeleccionados.size()==1) {
				for(EvaluacionNomi evaluacionnomiAux:evaluacionnomisSeleccionados) {
					evaluacionnomi=evaluacionnomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Evaluacion Nomi")) {
					jButtonDetalleEvaluacionNomiActionPerformed(null,rowIndex,true,false,evaluacionnomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEvaluacionNomi();
			
      		//this.finishProcessEvaluacionNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEvaluacionNomiReturnGeneral() throws Exception {
		if(this.evaluacionnomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.evaluacionnomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.evaluacionnomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.evaluacionnomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.evaluacionnomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.evaluacionnomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEvaluacionNomi(false);
		}
		
		if(this.evaluacionnomiReturnGeneral.getConRetornoLista() || this.evaluacionnomiReturnGeneral.getConRetornoObjeto()) {
			if(this.evaluacionnomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.evaluacionnomiLogic.setEvaluacionNomis(this.evaluacionnomiReturnGeneral.getEvaluacionNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.evaluacionnomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.evaluacionnomiLogic.setEvaluacionNomi(this.evaluacionnomiReturnGeneral.getEvaluacionNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEvaluacionNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralEvaluacionNomi() throws Exception {
		
		
	}
	
	public ArrayList<EvaluacionNomi> getEvaluacionNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEvaluacionNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EvaluacionNomi evaluacionnomiAux:evaluacionnomiLogic.getEvaluacionNomis()) {
					if(evaluacionnomiAux.getIsSelected()) {
						evaluacionnomisSeleccionados.add(evaluacionnomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionNomi evaluacionnomiAux:this.evaluacionnomis) {
					if(evaluacionnomiAux.getIsSelected()) {
						evaluacionnomisSeleccionados.add(evaluacionnomiAux);				
					}
				}
			}
			
			if(evaluacionnomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						evaluacionnomisSeleccionados.addAll(this.evaluacionnomiLogic.getEvaluacionNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						evaluacionnomisSeleccionados.addAll(this.evaluacionnomis);				
					}
				}
			}
		} else {
			evaluacionnomisSeleccionados.add(this.evaluacionnomi);
		}
		
		return evaluacionnomisSeleccionados;
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
	
	public void generarReporteEvaluacionNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEvaluacionNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEvaluacionNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEvaluacionNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEvaluacionNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEvaluacionNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Evaluacion Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();		
		
		evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEvaluacionNomis("Todos",evaluacionnomisSeleccionados);
		
	}	
	
	public void generarReporteNormalEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();		
		
		evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEvaluacionNomis("Todos",evaluacionnomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEvaluacionNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();
		
		evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEvaluacionNomis("Todos",evaluacionnomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEvaluacionNomi();
		
		
		evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEvaluacionNomi();
		
		
		//this.generarReporteEvaluacionNomis("Todos",evaluacionnomisSeleccionados ,evaluacionnomiImplementable,evaluacionnomiImplementableHome);
	}
	
	public void mostrarImportacionEvaluacionNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEvaluacionNomi();
		
		this.abrirFrameImportacionEvaluacionNomi();		
		
			
		//this.generarReporteEvaluacionNomis("Todos",evaluacionnomisSeleccionados ,evaluacionnomiImplementable,evaluacionnomiImplementableHome);
	}
	
	public void importarEvaluacionNomis() throws Exception {		
	
	}
	
	public void exportarEvaluacionNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEvaluacionNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEvaluacionNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEvaluacionNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Evaluacion Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();		
		
		evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionnomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEvaluacionNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EvaluacionNomi evaluacionnomiAux:evaluacionnomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEvaluacionNomi(evaluacionnomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//evaluacionnomiAux.setsDetalleGeneralEntityReporte(evaluacionnomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEvaluacionNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEvaluacionNomi(EvaluacionNomi evaluacionnomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=evaluacionnomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getempleadoevaluador_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getformatonomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getinstrucciones();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getdescripcion2();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getdescripcion3();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionnomi.getdescripcion4();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();		
		
		evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionnomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EvaluacionNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEvaluacionNomi(row);				
				iRow++;
			}				
			
			for(EvaluacionNomi evaluacionnomiAux:evaluacionnomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEvaluacionNomi(evaluacionnomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEvaluacionNomisSeleccionados() throws Exception {
		ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();		
		
		evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionnomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("evaluacionnomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("evaluacionnomi");
			//elementRoot.appendChild(element);
		
			for(EvaluacionNomi evaluacionnomiAux:evaluacionnomisSeleccionados) {
				element = document.createElement("evaluacionnomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEvaluacionNomi(evaluacionnomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEvaluacionNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEvaluacionNomi(EvaluacionNomi evaluacionnomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getempleadoevaluador_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getformatonomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getinstrucciones());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getdescripcion2());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getdescripcion3());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionnomi.getdescripcion4());				
	}
	
	public void setFilaDatosExportarXmlEvaluacionNomi(EvaluacionNomi evaluacionnomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EvaluacionNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(evaluacionnomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EvaluacionNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(evaluacionnomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EvaluacionNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(evaluacionnomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(EvaluacionNomiConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(evaluacionnomi.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(EvaluacionNomiConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(evaluacionnomi.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(EvaluacionNomiConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(evaluacionnomi.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementempleado_descripcion = document.createElement(EvaluacionNomiConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(evaluacionnomi.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementempleadoevaluador_descripcion = document.createElement(EvaluacionNomiConstantesFunciones.IDEMPLEADOEVALUADOR);
		elementempleadoevaluador_descripcion.appendChild(document.createTextNode(evaluacionnomi.getempleadoevaluador_descripcion()));
		element.appendChild(elementempleadoevaluador_descripcion);

		Element elementformatonomi_descripcion = document.createElement(EvaluacionNomiConstantesFunciones.IDFORMATONOMI);
		elementformatonomi_descripcion.appendChild(document.createTextNode(evaluacionnomi.getformatonomi_descripcion()));
		element.appendChild(elementformatonomi_descripcion);

		Element elementestructura_descripcion = document.createElement(EvaluacionNomiConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(evaluacionnomi.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementfecha = document.createElement(EvaluacionNomiConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(evaluacionnomi.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementinstrucciones = document.createElement(EvaluacionNomiConstantesFunciones.INSTRUCCIONES);
		elementinstrucciones.appendChild(document.createTextNode(evaluacionnomi.getinstrucciones().trim()));
		element.appendChild(elementinstrucciones);

		Element elementdescripcion = document.createElement(EvaluacionNomiConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(evaluacionnomi.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementdescripcion2 = document.createElement(EvaluacionNomiConstantesFunciones.DESCRIPCION2);
		elementdescripcion2.appendChild(document.createTextNode(evaluacionnomi.getdescripcion2().trim()));
		element.appendChild(elementdescripcion2);

		Element elementdescripcion3 = document.createElement(EvaluacionNomiConstantesFunciones.DESCRIPCION3);
		elementdescripcion3.appendChild(document.createTextNode(evaluacionnomi.getdescripcion3().trim()));
		element.appendChild(elementdescripcion3);

		Element elementdescripcion4 = document.createElement(EvaluacionNomiConstantesFunciones.DESCRIPCION4);
		elementdescripcion4.appendChild(document.createTextNode(evaluacionnomi.getdescripcion4().trim()));
		element.appendChild(elementdescripcion4);
	}
	
	public void generarReporteGroupGenericoEvaluacionNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados=new ArrayList<EvaluacionNomi>();
		
		evaluacionnomisSeleccionados=this.getEvaluacionNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEvaluacionNomi(evaluacionnomisSeleccionados);
		
		this.generarReporteEvaluacionNomis("Todos",evaluacionnomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEvaluacionNomi(ArrayList<EvaluacionNomi> evaluacionnomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EvaluacionNomi evaluacionnomiAux:evaluacionnomisSeleccionados) {
				evaluacionnomiAux.setsDetalleGeneralEntityReporte(evaluacionnomiAux.toString());
			
				if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_IDEMPLEADOEVALUADOR)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getempleadoevaluador_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_IDFORMATONOMI)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getformatonomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(evaluacionnomiAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_INSTRUCCIONES)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getinstrucciones());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION2)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getdescripcion2());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION3)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getdescripcion3());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionNomiConstantesFunciones.LABEL_DESCRIPCION4)) {
					existe=true;
					evaluacionnomiAux.setsDescripcionGeneralEntityReporte1(evaluacionnomiAux.getdescripcion4());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEvaluacionNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEvaluacionNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=true;
				this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=true;
			}
			
			this.isVisibilidadCeldaModificarEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarEvaluacionNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEvaluacionNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=false;
			this.isVisibilidadCeldaModificarEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarEvaluacionNomi=true;
			this.isVisibilidadCeldaEliminarEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarEvaluacionNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEvaluacionNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=false;
			this.isVisibilidadCeldaModificarEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarEvaluacionNomi=true;
			this.isVisibilidadCeldaEliminarEvaluacionNomi=true;
			this.isVisibilidadCeldaCancelarEvaluacionNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEvaluacionNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=false;
			this.isVisibilidadCeldaModificarEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarEvaluacionNomi=true;
			this.isVisibilidadCeldaEliminarEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarEvaluacionNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEvaluacionNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=true;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=true;
			this.isVisibilidadCeldaModificarEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarEvaluacionNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEvaluacionNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=false;
			this.isVisibilidadCeldaActualizarEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarEvaluacionNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEvaluacionNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=false;
			this.isVisibilidadCeldaModificarEvaluacionNomi=true;
			this.isVisibilidadCeldaActualizarEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarEvaluacionNomi=false;
			this.isVisibilidadCeldaCancelarEvaluacionNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EvaluacionNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEvaluacionNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=true;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=true;
		} else {
			this.actualizarEstadoPanelsEvaluacionNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEvaluacionNomi=false;
			//this.isVisibilidadCeldaVerFormEvaluacionNomi=false;
			this.isVisibilidadCeldaDuplicarEvaluacionNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!evaluacionnomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoEvaluacionNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			if(!evaluacionnomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=false;												
			}
			
			this.jButtonCerrarEvaluacionNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.evaluacionnomi)) {
			this.isVisibilidadCeldaActualizarEvaluacionNomi=false;
			this.isVisibilidadCeldaEliminarEvaluacionNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEvaluacionNomi() {
		this.isVisibilidadCeldaNuevoEvaluacionNomi=false;
		this.isVisibilidadCeldaGuardarCambiosEvaluacionNomi=false;
	}
	
	public void actualizarEstadoPanelsEvaluacionNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionEvaluacionNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasEvaluacionNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionNomi!=null) {
				this.jScrollPanelDatosEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionNomi!=null) {
				this.jPanelPaginacionEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionNomi!=null) {
				this.jPanelParametrosReportesEvaluacionNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionEvaluacionNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasEvaluacionNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEvaluacionNomi!=null) {
				this.jScrollPanelDatosEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionNomi!=null) {
				this.jPanelPaginacionEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionNomi!=null) {
				this.jPanelParametrosReportesEvaluacionNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionEvaluacionNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasEvaluacionNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionNomi!=null) {
				this.jScrollPanelDatosEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionNomi!=null) {
				this.jPanelPaginacionEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionNomi!=null) {
				this.jPanelParametrosReportesEvaluacionNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionEvaluacionNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasEvaluacionNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionNomi!=null) {
				this.jScrollPanelDatosEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionNomi!=null) {
				this.jPanelPaginacionEvaluacionNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionNomi!=null) {
				this.jPanelParametrosReportesEvaluacionNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionEvaluacionNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasEvaluacionNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionNomi!=null) {
				this.jScrollPanelDatosEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionNomi!=null) {
				this.jPanelPaginacionEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionNomi!=null) {
				this.jPanelParametrosReportesEvaluacionNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionEvaluacionNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasEvaluacionNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionNomi!=null) {
				this.jScrollPanelDatosEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionNomi!=null) {
				this.jPanelPaginacionEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionNomi!=null) {
				this.jPanelParametrosReportesEvaluacionNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEvaluacionNomi!=null) {
				this.jScrollPanelDatosEdicionEvaluacionNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasEvaluacionNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionNomi!=null) {
				this.jScrollPanelDatosEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionNomi!=null) {
				this.jPanelPaginacionEvaluacionNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionNomi!=null) {
				this.jPanelParametrosReportesEvaluacionNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEvaluacionNomi!=null) {
					this.jTabbedPaneBusquedasEvaluacionNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEvaluacionNomi!=null) {
				this.jPanelParametrosReportesEvaluacionNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionNomi!=null) {
				this.jTabbedPaneBusquedasEvaluacionNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEvaluacionNomi!=null) {
				this.jPanelParametrosReportesEvaluacionNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluacionNomi);}

			this.isVisibilidadFK_IdEmpleadoEvaluador=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleadoEvaluador) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEstructuraEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdFormatoNomiEvaluacionNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluacionNomi);}

			this.isVisibilidadFK_IdEmpleadoEvaluador=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleadoEvaluador) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);}

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEstructuraEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdFormatoNomiEvaluacionNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdEmpleado=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluacionNomi);}

			this.isVisibilidadFK_IdEmpleadoEvaluador=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEmpleadoEvaluador) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);}

			this.isVisibilidadFK_IdEstructura=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEstructuraEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdFormatoNomiEvaluacionNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdEmpleado=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluacionNomi);}

			this.isVisibilidadFK_IdEmpleadoEvaluador=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoEvaluador) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);}

			this.isVisibilidadFK_IdEstructura=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEstructuraEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdFormatoNomiEvaluacionNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluacionNomi);}

			this.isVisibilidadFK_IdEmpleadoEvaluador=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoEvaluador) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEstructuraEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdFormatoNomiEvaluacionNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleadoEvaluador(Boolean isParaEmpleadoEvaluador){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoEvaluadorNegation=!isParaEmpleadoEvaluador;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleadoEvaluadorNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluacionNomi);}

			this.isVisibilidadFK_IdEmpleadoEvaluador=isParaEmpleadoEvaluador;
			if(!this.isVisibilidadFK_IdEmpleadoEvaluador) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoEvaluadorNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEstructuraEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaEmpleadoEvaluadorNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdFormatoNomiEvaluacionNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormatoNomi(Boolean isParaFormatoNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNomiNegation=!isParaFormatoNomi;

			this.isVisibilidadFK_IdEmpleado=isParaFormatoNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluacionNomi);}

			this.isVisibilidadFK_IdEmpleadoEvaluador=isParaFormatoNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleadoEvaluador) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);}

			this.isVisibilidadFK_IdEstructura=isParaFormatoNomiNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEstructuraEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaFormatoNomi;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdFormatoNomiEvaluacionNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluacionNomi);}

			this.isVisibilidadFK_IdEmpleadoEvaluador=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleadoEvaluador) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdEstructuraEvaluacionNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasEvaluacionNomi.remove(jPanelFK_IdFormatoNomiEvaluacionNomi);}
		}
		
	}
	
	

	public String registrarSesionEvaluacionNomiParaDetalleEvaluacionNomis() throws Exception {
		Boolean isPaginaPopupDetalleEvaluacionNomi=false;

		try {

			if(this.evaluacionnomiSessionBean==null) {
				this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiSessionBean==null) {
				this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
			}

			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiSessionBean.setsPathNavegacionActual(evaluacionnomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleEvaluacionNomi=this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi(true);
			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi(EvaluacionNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiSessionBean.setisBusquedaDesdeForeignKeySesionEvaluacionNomi(true);
			this.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiSessionBean.setlidEvaluacionNomiActual(this.idEvaluacionNomiActual);

			evaluacionnomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEvaluacionNomi(true);
			evaluacionnomiSessionBean.setlIdEvaluacionNomiActualForeignKey(this.idEvaluacionNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EvaluacionNomiSessionBean evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
		
		if(this.evaluacionnomiSessionBean==null) {
			this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
		}
		
		this.evaluacionnomiSessionBean.setsUltimaBusquedaEvaluacionNomi(this.getsAccionBusqueda());
		this.evaluacionnomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.evaluacionnomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			evaluacionnomiSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			evaluacionnomiSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoEvaluador")) {
			evaluacionnomiSessionBean.setid_empleado_evaluador(this.getid_empleado_evaluadorFK_IdEmpleadoEvaluador());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			evaluacionnomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			evaluacionnomiSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomi")) {
			evaluacionnomiSessionBean.setid_formato_nomi(this.getid_formato_nomiFK_IdFormatoNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			evaluacionnomiSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			evaluacionnomiSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EvaluacionNomiSessionBean evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
		
		if(this.evaluacionnomiSessionBean==null) {
			this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
		}
		
		if(this.evaluacionnomiSessionBean.getsUltimaBusquedaEvaluacionNomi()!=null&&!this.evaluacionnomiSessionBean.getsUltimaBusquedaEvaluacionNomi().equals("")) {
			this.setsAccionBusqueda(evaluacionnomiSessionBean.getsUltimaBusquedaEvaluacionNomi());
			this.setiNumeroPaginacion(evaluacionnomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(evaluacionnomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(evaluacionnomiSessionBean.getid_ejercicio());
				evaluacionnomiSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(evaluacionnomiSessionBean.getid_empleado());
				evaluacionnomiSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoEvaluador")) {
				this.setid_empleado_evaluadorFK_IdEmpleadoEvaluador(evaluacionnomiSessionBean.getid_empleado_evaluador());
				evaluacionnomiSessionBean.setid_empleado_evaluador(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(evaluacionnomiSessionBean.getid_empresa());
				evaluacionnomiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(evaluacionnomiSessionBean.getid_estructura());
				evaluacionnomiSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomi")) {
				this.setid_formato_nomiFK_IdFormatoNomi(evaluacionnomiSessionBean.getid_formato_nomi());
				evaluacionnomiSessionBean.setid_formato_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(evaluacionnomiSessionBean.getid_periodo());
				evaluacionnomiSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(evaluacionnomiSessionBean.getid_sucursal());
				evaluacionnomiSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.evaluacionnomiSessionBean.setsUltimaBusquedaEvaluacionNomi("");
		this.evaluacionnomiSessionBean.setiNumeroPaginacion(EvaluacionNomiConstantesFunciones.INUMEROPAGINACION);
		this.evaluacionnomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEvaluacionNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEvaluacionNomi() {
		this.updateBorderResaltarBusquedasFormularioEvaluacionNomi();
		this.updateVisibilidadBusquedasFormularioEvaluacionNomi();
		this.updateHabilitarBusquedasFormularioEvaluacionNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioEvaluacionNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEvaluacionNomi.getComponents().length>0) {
	

		if(this.evaluacionnomiConstantesFunciones.resaltarFK_IdEmpleadoEvaluacionNomi!=null) {
			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEmpleadoEvaluacionNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
				jPanel.setBorder(this.evaluacionnomiConstantesFunciones.resaltarFK_IdEmpleadoEvaluacionNomi);
			}
		}

		if(this.evaluacionnomiConstantesFunciones.resaltarFK_IdEmpleadoEvaluadorEvaluacionNomi!=null) {
			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
				jPanel.setBorder(this.evaluacionnomiConstantesFunciones.resaltarFK_IdEmpleadoEvaluadorEvaluacionNomi);
			}
		}

		if(this.evaluacionnomiConstantesFunciones.resaltarFK_IdEstructuraEvaluacionNomi!=null) {
			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEstructuraEvaluacionNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
				jPanel.setBorder(this.evaluacionnomiConstantesFunciones.resaltarFK_IdEstructuraEvaluacionNomi);
			}
		}

		if(this.evaluacionnomiConstantesFunciones.resaltarFK_IdFormatoNomiEvaluacionNomi!=null) {
			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiEvaluacionNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
				jPanel.setBorder(this.evaluacionnomiConstantesFunciones.resaltarFK_IdFormatoNomiEvaluacionNomi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEvaluacionNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEvaluacionNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEmpleadoEvaluacionNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.evaluacionnomiConstantesFunciones.mostrarFK_IdEmpleadoEvaluacionNomi);
			if(!this.evaluacionnomiConstantesFunciones.mostrarFK_IdEmpleadoEvaluacionNomi && index>-1) {
				this.jTabbedPaneBusquedasEvaluacionNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.evaluacionnomiConstantesFunciones.mostrarFK_IdEmpleadoEvaluadorEvaluacionNomi);
			if(!this.evaluacionnomiConstantesFunciones.mostrarFK_IdEmpleadoEvaluadorEvaluacionNomi && index>-1) {
				this.jTabbedPaneBusquedasEvaluacionNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEstructuraEvaluacionNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.evaluacionnomiConstantesFunciones.mostrarFK_IdEstructuraEvaluacionNomi);
			if(!this.evaluacionnomiConstantesFunciones.mostrarFK_IdEstructuraEvaluacionNomi && index>-1) {
				this.jTabbedPaneBusquedasEvaluacionNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiEvaluacionNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.evaluacionnomiConstantesFunciones.mostrarFK_IdFormatoNomiEvaluacionNomi);
			if(!this.evaluacionnomiConstantesFunciones.mostrarFK_IdFormatoNomiEvaluacionNomi && index>-1) {
				this.jTabbedPaneBusquedasEvaluacionNomi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEvaluacionNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEvaluacionNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEmpleadoEvaluacionNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.evaluacionnomiConstantesFunciones.activarFK_IdEmpleadoEvaluacionNomi);
				this.jTabbedPaneBusquedasEvaluacionNomi.setEnabledAt(index,this.evaluacionnomiConstantesFunciones.activarFK_IdEmpleadoEvaluacionNomi);
			}

			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.evaluacionnomiConstantesFunciones.activarFK_IdEmpleadoEvaluadorEvaluacionNomi);
				this.jTabbedPaneBusquedasEvaluacionNomi.setEnabledAt(index,this.evaluacionnomiConstantesFunciones.activarFK_IdEmpleadoEvaluadorEvaluacionNomi);
			}

			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEstructuraEvaluacionNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.evaluacionnomiConstantesFunciones.activarFK_IdEstructuraEvaluacionNomi);
				this.jTabbedPaneBusquedasEvaluacionNomi.setEnabledAt(index,this.evaluacionnomiConstantesFunciones.activarFK_IdEstructuraEvaluacionNomi);
			}

			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiEvaluacionNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.evaluacionnomiConstantesFunciones.activarFK_IdFormatoNomiEvaluacionNomi);
				this.jTabbedPaneBusquedasEvaluacionNomi.setEnabledAt(index,this.evaluacionnomiConstantesFunciones.activarFK_IdFormatoNomiEvaluacionNomi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEvaluacionNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEmpleadoEvaluacionNomi);

			this.jTabbedPaneBusquedasEvaluacionNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);

			this.evaluacionnomiConstantesFunciones.setResaltarFK_IdEmpleadoEvaluacionNomi(resaltar);

			jPanel.setBorder(this.evaluacionnomiConstantesFunciones.resaltarFK_IdEmpleadoEvaluacionNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleadoEvaluador")) {
			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);

			this.jTabbedPaneBusquedasEvaluacionNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);

			this.evaluacionnomiConstantesFunciones.setResaltarFK_IdEmpleadoEvaluadorEvaluacionNomi(resaltar);

			jPanel.setBorder(this.evaluacionnomiConstantesFunciones.resaltarFK_IdEmpleadoEvaluadorEvaluacionNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdEstructuraEvaluacionNomi);

			this.jTabbedPaneBusquedasEvaluacionNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);

			this.evaluacionnomiConstantesFunciones.setResaltarFK_IdEstructuraEvaluacionNomi(resaltar);

			jPanel.setBorder(this.evaluacionnomiConstantesFunciones.resaltarFK_IdEstructuraEvaluacionNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFormatoNomi")) {
			index= this.jTabbedPaneBusquedasEvaluacionNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiEvaluacionNomi);

			this.jTabbedPaneBusquedasEvaluacionNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionNomi.getComponent(index);

			this.evaluacionnomiConstantesFunciones.setResaltarFK_IdFormatoNomiEvaluacionNomi(resaltar);

			jPanel.setBorder(this.evaluacionnomiConstantesFunciones.resaltarFK_IdFormatoNomiEvaluacionNomi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEvaluacionNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEvaluacionNomi() throws Exception {

		if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEvaluacionNomi();
		this.updateVisibilidadResaltarControlesFormularioEvaluacionNomi();
		this.updateHabilitarResaltarControlesFormularioEvaluacionNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioEvaluacionNomi() throws Exception {
		if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.evaluacionnomiConstantesFunciones.resaltaridEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jLabelidEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltaridEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltarid_empresaEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltarid_empresaEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltarid_sucursalEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltarid_sucursalEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltarid_ejercicioEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltarid_ejercicioEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltarid_periodoEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltarid_periodoEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltarid_empleadoEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltarid_empleadoEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltarid_empleado_evaluadorEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltarid_empleado_evaluadorEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltarid_formato_nomiEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltarid_formato_nomiEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltarid_estructuraEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltarid_estructuraEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltarfechaEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jDateChooserfechaEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltarfechaEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltarinstruccionesEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreainstruccionesEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltarinstruccionesEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltardescripcionEvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcionEvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltardescripcionEvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltardescripcion2EvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion2EvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltardescripcion2EvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltardescripcion3EvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion3EvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltardescripcion3EvaluacionNomi);}
		if(this.evaluacionnomiConstantesFunciones.resaltardescripcion4EvaluacionNomi!=null && this.jInternalFrameDetalleFormEvaluacionNomi!=null) {this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion4EvaluacionNomi.setBorder(this.evaluacionnomiConstantesFunciones.resaltardescripcion4EvaluacionNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEvaluacionNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
	
		//this.jInternalFrameDetalleFormEvaluacionNomi.jLabelidEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostraridEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPanelidEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostraridEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_empresaEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPanelid_empresaEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_empresaEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_sucursalEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPanelid_sucursalEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_sucursalEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_ejercicioEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPanelid_ejercicioEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_ejercicioEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_periodoEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPanelid_periodoEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_periodoEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_empleadoEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPanelid_empleadoEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_empleadoEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_empleado_evaluadorEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPanelid_empleado_evaluadorEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_empleado_evaluadorEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_formato_nomiEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPanelid_formato_nomiEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_formato_nomiEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_estructuraEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPanelid_estructuraEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarid_estructuraEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jDateChooserfechaEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarfechaEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPanelfechaEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarfechaEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreainstruccionesEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarinstruccionesEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPanelinstruccionesEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrarinstruccionesEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcionEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrardescripcionEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPaneldescripcionEvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrardescripcionEvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion2EvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrardescripcion2EvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPaneldescripcion2EvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrardescripcion2EvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion3EvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrardescripcion3EvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPaneldescripcion3EvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrardescripcion3EvaluacionNomi);
		//this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion4EvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrardescripcion4EvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jPaneldescripcion4EvaluacionNomi.setVisible(this.evaluacionnomiConstantesFunciones.mostrardescripcion4EvaluacionNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEvaluacionNomi() throws Exception {
		if(this.jInternalFrameDetalleFormEvaluacionNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionNomi!=null) {
	
		this.jInternalFrameDetalleFormEvaluacionNomi.jLabelidEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activaridEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empresaEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activarid_empresaEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_sucursalEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activarid_sucursalEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_ejercicioEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activarid_ejercicioEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_periodoEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activarid_periodoEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleadoEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activarid_empleadoEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_empleado_evaluadorEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activarid_empleado_evaluadorEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_formato_nomiEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activarid_formato_nomiEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jComboBoxid_estructuraEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activarid_estructuraEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jDateChooserfechaEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activarfechaEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreainstruccionesEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activarinstruccionesEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcionEvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activardescripcionEvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion2EvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activardescripcion2EvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion3EvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activardescripcion3EvaluacionNomi);
		this.jInternalFrameDetalleFormEvaluacionNomi.jTextAreadescripcion4EvaluacionNomi.setEnabled(this.evaluacionnomiConstantesFunciones.activardescripcion4EvaluacionNomi);
		}
	}
	
		
}