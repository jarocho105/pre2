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

//import com.bydan.erp.nomina.util.ProcesoCierreProvisionConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoCierreProvisionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoCierreProvisionParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ProcesoCierreProvisionBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoCierreProvisionBeanSwingJInternalFrame extends ProcesoCierreProvisionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoCierreProvisionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoCierreProvision> procesocierreprovisionValidator = new ClassValidator<ProcesoCierreProvision>(ProcesoCierreProvision.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoCierreProvision procesocierreprovision;	
	public ProcesoCierreProvision procesocierreprovisionAux;
	public ProcesoCierreProvision procesocierreprovisionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoCierreProvision procesocierreprovisionTotales;
	public Long idProcesoCierreProvisionActual;
	public Long iIdNuevoProcesoCierreProvision=0L;
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

	public String sFinalQueryComboDefiProvisionEmpleado="";

	public List<DefiProvisionEmpleado> defiprovisionempleadosForeignKey;

	public List<DefiProvisionEmpleado> getdefiprovisionempleadosForeignKey() {
		return defiprovisionempleadosForeignKey;
	}

	public void setdefiprovisionempleadosForeignKey(List<DefiProvisionEmpleado> defiprovisionempleadosForeignKey) {
		this.defiprovisionempleadosForeignKey = defiprovisionempleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DefiProvisionEmpleado defiprovisionempleadoForeignKey;

	public DefiProvisionEmpleado getdefiprovisionempleadoForeignKey() {
		return defiprovisionempleadoForeignKey;
	}

	public void setdefiprovisionempleadoForeignKey(DefiProvisionEmpleado defiprovisionempleadoForeignKey) {
		this.defiprovisionempleadoForeignKey = defiprovisionempleadoForeignKey;
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
	
	public Boolean isPermisoTodoProcesoCierreProvision;
	public Boolean isPermisoNuevoProcesoCierreProvision;
	public Boolean isPermisoActualizarProcesoCierreProvision;
	public Boolean isPermisoActualizarOriginalProcesoCierreProvision;
	public Boolean isPermisoEliminarProcesoCierreProvision;
	public Boolean isPermisoGuardarCambiosProcesoCierreProvision;
	public Boolean isPermisoConsultaProcesoCierreProvision;
	public Boolean isPermisoBusquedaProcesoCierreProvision;
	public Boolean isPermisoReporteProcesoCierreProvision;
	public Boolean isPermisoPaginacionMedioProcesoCierreProvision;
	public Boolean isPermisoPaginacionAltoProcesoCierreProvision;
	public Boolean isPermisoPaginacionTodoProcesoCierreProvision;
	public Boolean isPermisoCopiarProcesoCierreProvision;
	public Boolean isPermisoVerFormProcesoCierreProvision;
	public Boolean isPermisoDuplicarProcesoCierreProvision;
	public Boolean isPermisoOrdenProcesoCierreProvision;
	
	
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
	
	public ProcesoCierreProvisionParameterReturnGeneral procesocierreprovisionReturnGeneral;
	public ProcesoCierreProvisionParameterReturnGeneral procesocierreprovisionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoCierreProvision=false;
	public Boolean esParaAccionDesdeFormularioProcesoCierreProvision=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoCierreProvisionSessionBeanAdditional procesocierreprovisionSessionBeanAdditional=null;
	
	public ProcesoCierreProvisionSessionBeanAdditional getProcesoCierreProvisionSessionBeanAdditional() {
		return this.procesocierreprovisionSessionBeanAdditional;
	}
	
	public void setProcesoCierreProvisionSessionBeanAdditional(ProcesoCierreProvisionSessionBeanAdditional procesocierreprovisionSessionBeanAdditional) {
		try {
			this.procesocierreprovisionSessionBeanAdditional=procesocierreprovisionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoCierreProvisionBeanSwingJInternalFrameAdditional procesocierreprovisionBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoCierreProvisionBeanSwingJInternalFrame
	
	public ProcesoCierreProvisionBeanSwingJInternalFrameAdditional getProcesoCierreProvisionBeanSwingJInternalFrameAdditional() {
		return this.procesocierreprovisionBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoCierreProvisionBeanSwingJInternalFrameAdditional(ProcesoCierreProvisionBeanSwingJInternalFrameAdditional procesocierreprovisionBeanSwingJInternalFrameAdditional) {
		try {
			this.procesocierreprovisionBeanSwingJInternalFrameAdditional=procesocierreprovisionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoCierreProvisionLogic procesocierreprovisionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoCierreProvision procesocierreprovisionBean;
	public ProcesoCierreProvisionConstantesFunciones procesocierreprovisionConstantesFunciones;
	//public ProcesoCierreProvisionParameterReturnGeneral procesocierreprovisionReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	public EstructuraLogic estructuraLogic;
	public EmpleadoLogic empleadoLogic;
	public DefiProvisionEmpleadoLogic defiprovisionempleadoLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoCierreProvision> procesocierreprovisions;	
	//public List<ProcesoCierreProvision> procesocierreprovisionsEliminados;
	//public List<ProcesoCierreProvision> procesocierreprovisionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoCierreProvision=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoCierreProvision=true;
	public Boolean isVisibilidadCeldaCopiarProcesoCierreProvision=true;
	public Boolean isVisibilidadCeldaVerFormProcesoCierreProvision=true;
	public Boolean isVisibilidadCeldaOrdenProcesoCierreProvision=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=false;
	public Boolean isVisibilidadCeldaModificarProcesoCierreProvision=false;
	public Boolean isVisibilidadCeldaActualizarProcesoCierreProvision=false;
	public Boolean isVisibilidadCeldaEliminarProcesoCierreProvision=false;
	public Boolean isVisibilidadCeldaCancelarProcesoCierreProvision=false;
	public Boolean isVisibilidadCeldaGuardarProcesoCierreProvision=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoCierreProvision=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdDefiProvisionEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	
	public Long getiIdNuevoProcesoCierreProvision() {
		return this.iIdNuevoProcesoCierreProvision;
	}

	public void setiIdNuevoProcesoCierreProvision(Long iIdNuevoProcesoCierreProvision) {
		this.iIdNuevoProcesoCierreProvision = iIdNuevoProcesoCierreProvision;
	}
	
	public Long getidProcesoCierreProvisionActual() {
		return this.idProcesoCierreProvisionActual;
	}

	public void setidProcesoCierreProvisionActual(Long idProcesoCierreProvisionActual) {
		this.idProcesoCierreProvisionActual = idProcesoCierreProvisionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoCierreProvision getprocesocierreprovision() {
		return this.procesocierreprovision;
	}

	public void setprocesocierreprovision(ProcesoCierreProvision procesocierreprovision) {
		this.procesocierreprovision = procesocierreprovision;
	}
	
	public ProcesoCierreProvision getprocesocierreprovisionAux() {
		return this.procesocierreprovisionAux;
	}

	public void setprocesocierreprovisionAux(ProcesoCierreProvision procesocierreprovisionAux) {
		this.procesocierreprovisionAux = procesocierreprovisionAux;
	}				
	
	public ProcesoCierreProvision getprocesocierreprovisionAnterior() {
		return this.procesocierreprovisionAnterior;
	}

	public void setprocesocierreprovisionAnterior(ProcesoCierreProvision procesocierreprovisionAnterior) {
		this.procesocierreprovisionAnterior = procesocierreprovisionAnterior;
	}	
	
	public ProcesoCierreProvision getprocesocierreprovisionTotales() {
		return this.procesocierreprovisionTotales;
	}

	public void setprocesocierreprovisionTotales(ProcesoCierreProvision procesocierreprovisionTotales) {
		this.procesocierreprovisionTotales = procesocierreprovisionTotales;
	}	
	
	public ProcesoCierreProvision getprocesocierreprovisionBean() {
		return this.procesocierreprovisionBean;
	}

	public void setprocesocierreprovisionBean(ProcesoCierreProvision procesocierreprovisionBean) {
		this.procesocierreprovisionBean = procesocierreprovisionBean;
	}	
	
	public ProcesoCierreProvisionParameterReturnGeneral getprocesocierreprovisionReturnGeneral() {
		return this.procesocierreprovisionReturnGeneral;
	}

	public void setprocesocierreprovisionReturnGeneral(ProcesoCierreProvisionParameterReturnGeneral procesocierreprovisionReturnGeneral) {
		this.procesocierreprovisionReturnGeneral = procesocierreprovisionReturnGeneral;
	}	
	
	
	public Long id_anioBusquedaProcesoCierreProvision=null;

	public Long getid_anioBusquedaProcesoCierreProvision() {
		return this.id_anioBusquedaProcesoCierreProvision;
	}

	public void setid_anioBusquedaProcesoCierreProvision(Long id_anioBusquedaProcesoCierreProvision) {
		this.id_anioBusquedaProcesoCierreProvision = id_anioBusquedaProcesoCierreProvision;
	}

;
	public Long id_estructuraBusquedaProcesoCierreProvision=-1L;

	public Long getid_estructuraBusquedaProcesoCierreProvision() {
		return this.id_estructuraBusquedaProcesoCierreProvision;
	}

	public void setid_estructuraBusquedaProcesoCierreProvision(Long id_estructuraBusquedaProcesoCierreProvision) {
		this.id_estructuraBusquedaProcesoCierreProvision = id_estructuraBusquedaProcesoCierreProvision;
	}

;
	public Long id_empleadoBusquedaProcesoCierreProvision=-1L;

	public Long getid_empleadoBusquedaProcesoCierreProvision() {
		return this.id_empleadoBusquedaProcesoCierreProvision;
	}

	public void setid_empleadoBusquedaProcesoCierreProvision(Long id_empleadoBusquedaProcesoCierreProvision) {
		this.id_empleadoBusquedaProcesoCierreProvision = id_empleadoBusquedaProcesoCierreProvision;
	}

;
	public Long id_defi_provision_empleadoBusquedaProcesoCierreProvision=-1L;

	public Long getid_defi_provision_empleadoBusquedaProcesoCierreProvision() {
		return this.id_defi_provision_empleadoBusquedaProcesoCierreProvision;
	}

	public void setid_defi_provision_empleadoBusquedaProcesoCierreProvision(Long id_defi_provision_empleadoBusquedaProcesoCierreProvision) {
		this.id_defi_provision_empleadoBusquedaProcesoCierreProvision = id_defi_provision_empleadoBusquedaProcesoCierreProvision;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_defi_provision_empleadoFK_IdDefiProvisionEmpleado=-1L;

	public Long getid_defi_provision_empleadoFK_IdDefiProvisionEmpleado() {
		return this.id_defi_provision_empleadoFK_IdDefiProvisionEmpleado;
	}

	public void setid_defi_provision_empleadoFK_IdDefiProvisionEmpleado(Long id_defi_provision_empleadoFK_IdDefiProvisionEmpleado) {
		this.id_defi_provision_empleadoFK_IdDefiProvisionEmpleado = id_defi_provision_empleadoFK_IdDefiProvisionEmpleado;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoCierreProvisionLogic getProcesoCierreProvisionLogic()	{		
		return procesocierreprovisionLogic;
	}

	public void setProcesoCierreProvisionLogic(ProcesoCierreProvisionLogic procesocierreprovisionLogic) {
		this.procesocierreprovisionLogic = procesocierreprovisionLogic;
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
	
	public Boolean getIsEsNuevoProcesoCierreProvision() {
		return isEsNuevoProcesoCierreProvision;
	}

	public void setIsEsNuevoProcesoCierreProvision(Boolean isEsNuevoProcesoCierreProvision) {
		this.isEsNuevoProcesoCierreProvision = isEsNuevoProcesoCierreProvision;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoCierreProvision() {
		return esParaAccionDesdeFormularioProcesoCierreProvision;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoCierreProvision(Boolean esParaAccionDesdeFormularioProcesoCierreProvision) {
		this.esParaAccionDesdeFormularioProcesoCierreProvision = esParaAccionDesdeFormularioProcesoCierreProvision;
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

			if(this.procesocierreprovisionSessionBean==null) {
				this.procesocierreprovisionSessionBean=new ProcesoCierreProvisionSessionBean();
			}

			if(!this.procesocierreprovisionSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(procesocierreprovisionSessionBean.getlidAnioActual());
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

			if(this.procesocierreprovisionSessionBean==null) {
				this.procesocierreprovisionSessionBean=new ProcesoCierreProvisionSessionBean();
			}

			if(!this.procesocierreprovisionSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(procesocierreprovisionSessionBean.getlidEstructuraActual());
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

			empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.procesocierreprovisionSessionBean==null) {
				this.procesocierreprovisionSessionBean=new ProcesoCierreProvisionSessionBean();
			}

			if(!this.procesocierreprovisionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

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
					empleadoLogic.getEntityWithConnection(procesocierreprovisionSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosDefiProvisionEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.defiprovisionempleadosForeignKey=new ArrayList<DefiProvisionEmpleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DefiProvisionEmpleadoLogic defiprovisionempleadoLogic=new DefiProvisionEmpleadoLogic();

			defiprovisionempleadoLogic.getDefiProvisionEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.procesocierreprovisionSessionBean==null) {
				this.procesocierreprovisionSessionBean=new ProcesoCierreProvisionSessionBean();
			}

			if(!this.procesocierreprovisionSessionBean.getisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					defiprovisionempleadoLogic.getDefiProvisionEmpleadoDataAccess().setIsForForeingKeyData(true);

					defiprovisionempleadoLogic.getTodosDefiProvisionEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.defiprovisionempleadosForeignKey=defiprovisionempleadoLogic.getDefiProvisionEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDefiProvisionEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					defiprovisionempleadoLogic.getEntityWithConnection(procesocierreprovisionSessionBean.getlidDefiProvisionEmpleadoActual());
					this.defiprovisionempleadosForeignKey.add(defiprovisionempleadoLogic.getDefiProvisionEmpleado());
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

					if(this.procesocierreprovision!=null) {
						this.procesocierreprovision.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
						this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioProcesoCierreProvision.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreProvision") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision!=null) {
						jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision!=null) {
							//jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.getItemCount()>0) {
								jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioProcesoCierreProvisionGenerico)throws Exception
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
				jComboBoxid_anioProcesoCierreProvisionGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioProcesoCierreProvisionGenerico!=null && jComboBoxid_anioProcesoCierreProvisionGenerico.getItemCount()>0) {
					jComboBoxid_anioProcesoCierreProvisionGenerico.setSelectedIndex(0);
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

					if(this.procesocierreprovision!=null) {
						this.procesocierreprovision.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
						this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraProcesoCierreProvision.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreProvision") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision!=null) {
						jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision!=null) {
							//jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.getItemCount()>0) {
								jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraProcesoCierreProvisionGenerico)throws Exception
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
				jComboBoxid_estructuraProcesoCierreProvisionGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraProcesoCierreProvisionGenerico!=null && jComboBoxid_estructuraProcesoCierreProvisionGenerico.getItemCount()>0) {
					jComboBoxid_estructuraProcesoCierreProvisionGenerico.setSelectedIndex(0);
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

					if(this.procesocierreprovision!=null) {
						this.procesocierreprovision.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
						this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoProcesoCierreProvision.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreProvision") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision!=null) {
						jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision!=null) {
							//jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.getItemCount()>0) {
								jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoProcesoCierreProvisionGenerico)throws Exception
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
				jComboBoxid_empleadoProcesoCierreProvisionGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoProcesoCierreProvisionGenerico!=null && jComboBoxid_empleadoProcesoCierreProvisionGenerico.getItemCount()>0) {
					jComboBoxid_empleadoProcesoCierreProvisionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDefiProvisionEmpleadoForeignKey(Long idDefiProvisionEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DefiProvisionEmpleado  defiprovisionempleadoTemp=null;

			for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosForeignKey) {
				if(defiprovisionempleadoAux.getId()!=null && defiprovisionempleadoAux.getId().equals(idDefiProvisionEmpleadoSeleccionado)) {
					defiprovisionempleadoTemp=defiprovisionempleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(defiprovisionempleadoTemp!=null) {

					if(this.procesocierreprovision!=null) {
						this.procesocierreprovision.setDefiProvisionEmpleado(defiprovisionempleadoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
						this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setSelectedItem(defiprovisionempleadoTemp);
					}
				} else {
					//jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setSelectedItem(defiprovisionempleadoTemp);
					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreProvision") || sFormularioTipoBusqueda.equals("Todos")){
					if(defiprovisionempleadoTemp!=null && jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision!=null) {
						jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(defiprovisionempleadoTemp);
					} else {
						if(jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision!=null) {
							//jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(defiprovisionempleadoTemp);
							if(jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.getItemCount()>0) {
								jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedIndex(0);
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

	public String getActualDefiProvisionEmpleadoForeignKeyDescripcion(Long idDefiProvisionEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DefiProvisionEmpleado  defiprovisionempleadoTemp=null;

			for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosForeignKey) {
				if(defiprovisionempleadoAux.getId()!=null && defiprovisionempleadoAux.getId().equals(idDefiProvisionEmpleadoSeleccionado)) {
					defiprovisionempleadoTemp=defiprovisionempleadoAux;
					break;
				}
			}


			sDescripcion=DefiProvisionEmpleadoConstantesFunciones.getDefiProvisionEmpleadoDescripcion(defiprovisionempleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDefiProvisionEmpleadoForeignKeyGenerico(Long idDefiProvisionEmpleadoSeleccionado,JComboBox jComboBoxid_defi_provision_empleadoProcesoCierreProvisionGenerico)throws Exception
	{
		try
		{
			DefiProvisionEmpleado  defiprovisionempleadoTemp=null;

			for(DefiProvisionEmpleado defiprovisionempleadoAux:defiprovisionempleadosForeignKey) {
				if(defiprovisionempleadoAux.getId()!=null && defiprovisionempleadoAux.getId().equals(idDefiProvisionEmpleadoSeleccionado)) {
					defiprovisionempleadoTemp=defiprovisionempleadoAux;
					break;
				}
			}

			if(defiprovisionempleadoTemp!=null) {
				jComboBoxid_defi_provision_empleadoProcesoCierreProvisionGenerico.setSelectedItem(defiprovisionempleadoTemp);
			} else {
				if(jComboBoxid_defi_provision_empleadoProcesoCierreProvisionGenerico!=null && jComboBoxid_defi_provision_empleadoProcesoCierreProvisionGenerico.getItemCount()>0) {
					jComboBoxid_defi_provision_empleadoProcesoCierreProvisionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(ProcesoCierreProvision procesocierreprovision,JComboBox jComboBoxid_anioProcesoCierreProvisionGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioProcesoCierreProvisionGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioProcesoCierreProvisionGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				procesocierreprovision.setid_anio(anioAux.getId());
				procesocierreprovision.setanio_descripcion(ProcesoCierreProvisionConstantesFunciones.getAnioDescripcion(anioAux));
				procesocierreprovision.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(ProcesoCierreProvision procesocierreprovision,JComboBox jComboBoxid_estructuraProcesoCierreProvisionGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraProcesoCierreProvisionGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraProcesoCierreProvisionGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				procesocierreprovision.setid_estructura(estructuraAux.getId());
				procesocierreprovision.setestructura_descripcion(ProcesoCierreProvisionConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				procesocierreprovision.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(ProcesoCierreProvision procesocierreprovision,JComboBox jComboBoxid_empleadoProcesoCierreProvisionGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoProcesoCierreProvisionGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoProcesoCierreProvisionGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				procesocierreprovision.setid_empleado(empleadoAux.getId());
				procesocierreprovision.setempleado_descripcion(ProcesoCierreProvisionConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				procesocierreprovision.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDefiProvisionEmpleadoForeignKey(ProcesoCierreProvision procesocierreprovision,JComboBox jComboBoxid_defi_provision_empleadoProcesoCierreProvisionGenerico)throws Exception
	{
		try
		{
			DefiProvisionEmpleado  defiprovisionempleadoAux=new DefiProvisionEmpleado();

			if(jComboBoxid_defi_provision_empleadoProcesoCierreProvisionGenerico==null) {
				defiprovisionempleadoAux=(DefiProvisionEmpleado)this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.getSelectedItem();
			} else {
				defiprovisionempleadoAux=(DefiProvisionEmpleado)jComboBoxid_defi_provision_empleadoProcesoCierreProvisionGenerico.getSelectedItem();
			}

			if(defiprovisionempleadoAux!=null && defiprovisionempleadoAux.getId()!=null) {
				procesocierreprovision.setid_defi_provision_empleado(defiprovisionempleadoAux.getId());
				procesocierreprovision.setdefiprovisionempleado_descripcion(ProcesoCierreProvisionConstantesFunciones.getDefiProvisionEmpleadoDescripcion(defiprovisionempleadoAux));
				procesocierreprovision.setDefiProvisionEmpleado(defiprovisionempleadoAux);			}
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

					if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { 
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { 
					}

					if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreProvision") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.addItem(anio);
							}
						}

						if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { 
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { 
					}

					if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreProvision") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.addItem(estructura);
							}
						}

						if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { 
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { 
					}

					if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreProvision") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.addItem(empleado);
							}
						}

						if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDefiProvisionEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDefiProvisionEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { 
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.removeAllItems();

							for(DefiProvisionEmpleado defiprovisionempleado:this.defiprovisionempleadosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.addItem(defiprovisionempleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { 
					}

					if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreProvision") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.removeAllItems();

							for(DefiProvisionEmpleado defiprovisionempleado:this.defiprovisionempleadosForeignKey) {
								this.jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.addItem(defiprovisionempleado);
							}
						}

						if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameDefiProvisionEmpleadoForeignKey(DefiProvisionEmpleado defiprovisionempleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setSelectedItem(defiprovisionempleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedItem(defiprovisionempleado);
						} else {
							this.jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoCierreProvision() throws Exception {
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
		
	public ProcesoCierreProvisionParameterReturnGeneral getProcesoCierreProvisionParameterGeneral() {
		return this.procesocierreprovisionParameterGeneral;
	}
	
	public void setProcesoCierreProvisionParameterGeneral(ProcesoCierreProvisionParameterReturnGeneral procesocierreprovisionParameterGeneral) {
		this.procesocierreprovisionParameterGeneral = procesocierreprovisionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoCierreProvision() {
		return isPermisoTodoProcesoCierreProvision;
	}

	public void setIsPermisoTodoProcesoCierreProvision(Boolean isPermisoTodoProcesoCierreProvision) {
		this.isPermisoTodoProcesoCierreProvision = isPermisoTodoProcesoCierreProvision;
	}

	public Boolean getIsPermisoNuevoProcesoCierreProvision() {
		return isPermisoNuevoProcesoCierreProvision;
	}

	public void setIsPermisoNuevoProcesoCierreProvision(Boolean isPermisoNuevoProcesoCierreProvision) {
		this.isPermisoNuevoProcesoCierreProvision = isPermisoNuevoProcesoCierreProvision;
	}

	public Boolean getIsPermisoActualizarProcesoCierreProvision() {
		return isPermisoActualizarProcesoCierreProvision;
	}

	public void setIsPermisoActualizarProcesoCierreProvision(Boolean isPermisoActualizarProcesoCierreProvision) {
		this.isPermisoActualizarProcesoCierreProvision = isPermisoActualizarProcesoCierreProvision;
	}

	public Boolean getIsPermisoEliminarProcesoCierreProvision() {
		return isPermisoEliminarProcesoCierreProvision;
	}

	public void setIsPermisoEliminarProcesoCierreProvision(Boolean isPermisoEliminarProcesoCierreProvision) {
		this.isPermisoEliminarProcesoCierreProvision = isPermisoEliminarProcesoCierreProvision;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoCierreProvision() {
		return isPermisoGuardarCambiosProcesoCierreProvision;
	}

	public void setIsPermisoGuardarCambiosProcesoCierreProvision(Boolean isPermisoGuardarCambiosProcesoCierreProvision) {
		this.isPermisoGuardarCambiosProcesoCierreProvision = isPermisoGuardarCambiosProcesoCierreProvision;
	}
	
	public Boolean getIsPermisoConsultaProcesoCierreProvision() {
		return isPermisoConsultaProcesoCierreProvision;
	}

	public void setIsPermisoConsultaProcesoCierreProvision(Boolean isPermisoConsultaProcesoCierreProvision) {
		this.isPermisoConsultaProcesoCierreProvision = isPermisoConsultaProcesoCierreProvision;
	}

	public Boolean getIsPermisoBusquedaProcesoCierreProvision() {
		return isPermisoBusquedaProcesoCierreProvision;
	}

	public void setIsPermisoBusquedaProcesoCierreProvision(Boolean isPermisoBusquedaProcesoCierreProvision) {
		this.isPermisoBusquedaProcesoCierreProvision = isPermisoBusquedaProcesoCierreProvision;
	}

	public Boolean getIsPermisoReporteProcesoCierreProvision() {
		return isPermisoReporteProcesoCierreProvision;
	}

	public void setIsPermisoReporteProcesoCierreProvision(Boolean isPermisoReporteProcesoCierreProvision) {
		this.isPermisoReporteProcesoCierreProvision = isPermisoReporteProcesoCierreProvision;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoCierreProvision() {
		return isPermisoPaginacionMedioProcesoCierreProvision;
	}

	public void setIsPermisoPaginacionMedioProcesoCierreProvision(Boolean isPermisoPaginacionMedioProcesoCierreProvision) {
		this.isPermisoPaginacionMedioProcesoCierreProvision = isPermisoPaginacionMedioProcesoCierreProvision;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoCierreProvision() {
		return isPermisoPaginacionTodoProcesoCierreProvision;
	}

	public void setIsPermisoPaginacionTodoProcesoCierreProvision(Boolean isPermisoPaginacionTodoProcesoCierreProvision) {
		this.isPermisoPaginacionTodoProcesoCierreProvision = isPermisoPaginacionTodoProcesoCierreProvision;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoCierreProvision() {
		return isPermisoPaginacionAltoProcesoCierreProvision;
	}

	public void setIsPermisoPaginacionAltoProcesoCierreProvision(Boolean isPermisoPaginacionAltoProcesoCierreProvision) {
		this.isPermisoPaginacionAltoProcesoCierreProvision = isPermisoPaginacionAltoProcesoCierreProvision;
	}
	
	public Boolean getIsPermisoCopiarProcesoCierreProvision() {
		return isPermisoCopiarProcesoCierreProvision;
	}

	public void setIsPermisoCopiarProcesoCierreProvision(Boolean isPermisoCopiarProcesoCierreProvision) {
		this.isPermisoCopiarProcesoCierreProvision = isPermisoCopiarProcesoCierreProvision;
	}
	
	public Boolean getIsPermisoVerFormProcesoCierreProvision() {
		return isPermisoVerFormProcesoCierreProvision;
	}

	public void setIsPermisoVerFormProcesoCierreProvision(Boolean isPermisoVerFormProcesoCierreProvision) {
		this.isPermisoVerFormProcesoCierreProvision = isPermisoVerFormProcesoCierreProvision;
	}
	
	public Boolean getIsPermisoDuplicarProcesoCierreProvision() {
		return isPermisoDuplicarProcesoCierreProvision;
	}

	public void setIsPermisoDuplicarProcesoCierreProvision(Boolean isPermisoDuplicarProcesoCierreProvision) {
		this.isPermisoDuplicarProcesoCierreProvision = isPermisoDuplicarProcesoCierreProvision;
	}
	
	public Boolean getIsPermisoOrdenProcesoCierreProvision() {
		return isPermisoOrdenProcesoCierreProvision;
	}

	public void setIsPermisoOrdenProcesoCierreProvision(Boolean isPermisoOrdenProcesoCierreProvision) {
		this.isPermisoOrdenProcesoCierreProvision = isPermisoOrdenProcesoCierreProvision;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoCierreProvision() {
		return isVisibilidadCeldaNuevoProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaNuevoProcesoCierreProvision(Boolean isVisibilidadCeldaNuevoProcesoCierreProvision) {
		this.isVisibilidadCeldaNuevoProcesoCierreProvision = isVisibilidadCeldaNuevoProcesoCierreProvision;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoCierreProvision() {
		return isVisibilidadCeldaDuplicarProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoCierreProvision(Boolean isVisibilidadCeldaDuplicarProcesoCierreProvision) {
		this.isVisibilidadCeldaDuplicarProcesoCierreProvision = isVisibilidadCeldaDuplicarProcesoCierreProvision;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoCierreProvision() {
		return isVisibilidadCeldaCopiarProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaCopiarProcesoCierreProvision(Boolean isVisibilidadCeldaCopiarProcesoCierreProvision) {
		this.isVisibilidadCeldaCopiarProcesoCierreProvision = isVisibilidadCeldaCopiarProcesoCierreProvision;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoCierreProvision() {
		return isVisibilidadCeldaVerFormProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaVerFormProcesoCierreProvision(Boolean isVisibilidadCeldaVerFormProcesoCierreProvision) {
		this.isVisibilidadCeldaVerFormProcesoCierreProvision = isVisibilidadCeldaVerFormProcesoCierreProvision;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoCierreProvision() {
		return isVisibilidadCeldaOrdenProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaOrdenProcesoCierreProvision(Boolean isVisibilidadCeldaOrdenProcesoCierreProvision) {
		this.isVisibilidadCeldaOrdenProcesoCierreProvision = isVisibilidadCeldaOrdenProcesoCierreProvision;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoCierreProvision() {
		return isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoCierreProvision(Boolean isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision = isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoCierreProvision() {
		return isVisibilidadCeldaModificarProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaModificarProcesoCierreProvision(Boolean isVisibilidadCeldaModificarProcesoCierreProvision) {
		this.isVisibilidadCeldaModificarProcesoCierreProvision = isVisibilidadCeldaModificarProcesoCierreProvision;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoCierreProvision() {
		return isVisibilidadCeldaActualizarProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaActualizarProcesoCierreProvision(Boolean isVisibilidadCeldaActualizarProcesoCierreProvision) {
		this.isVisibilidadCeldaActualizarProcesoCierreProvision = isVisibilidadCeldaActualizarProcesoCierreProvision;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoCierreProvision() {
		return isVisibilidadCeldaEliminarProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaEliminarProcesoCierreProvision(Boolean isVisibilidadCeldaEliminarProcesoCierreProvision) {
		this.isVisibilidadCeldaEliminarProcesoCierreProvision = isVisibilidadCeldaEliminarProcesoCierreProvision;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoCierreProvision() {
		return isVisibilidadCeldaCancelarProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaCancelarProcesoCierreProvision(Boolean isVisibilidadCeldaCancelarProcesoCierreProvision) {
		this.isVisibilidadCeldaCancelarProcesoCierreProvision = isVisibilidadCeldaCancelarProcesoCierreProvision;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoCierreProvision() {
		return isVisibilidadCeldaGuardarProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaGuardarProcesoCierreProvision(Boolean isVisibilidadCeldaGuardarProcesoCierreProvision) {
		this.isVisibilidadCeldaGuardarProcesoCierreProvision = isVisibilidadCeldaGuardarProcesoCierreProvision;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoCierreProvision() {
		return isVisibilidadCeldaGuardarCambiosProcesoCierreProvision;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoCierreProvision(Boolean isVisibilidadCeldaGuardarCambiosProcesoCierreProvision) {
		this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision = isVisibilidadCeldaGuardarCambiosProcesoCierreProvision;
	}
		
	public ProcesoCierreProvisionSessionBean getprocesocierreprovisionSessionBean() {
		return this.procesocierreprovisionSessionBean;
	}
	
	public void setprocesocierreprovisionSessionBean(ProcesoCierreProvisionSessionBean procesocierreprovisionSessionBean) {
		this.procesocierreprovisionSessionBean=procesocierreprovisionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoCierreProvision() {
		return this.isVisibilidadBusquedaProcesoCierreProvision;
	}

	public void setisVisibilidadBusquedaProcesoCierreProvision(Boolean isVisibilidadBusquedaProcesoCierreProvision) {
		this.isVisibilidadBusquedaProcesoCierreProvision=isVisibilidadBusquedaProcesoCierreProvision;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdDefiProvisionEmpleado() {
		return this.isVisibilidadFK_IdDefiProvisionEmpleado;
	}

	public void setisVisibilidadFK_IdDefiProvisionEmpleado(Boolean isVisibilidadFK_IdDefiProvisionEmpleado) {
		this.isVisibilidadFK_IdDefiProvisionEmpleado=isVisibilidadFK_IdDefiProvisionEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(procesocierreprovision,null);
				this.setActualParaGuardarEstructuraForeignKey(procesocierreprovision,null);
				this.setActualParaGuardarEmpleadoForeignKey(procesocierreprovision,null);
				this.setActualParaGuardarDefiProvisionEmpleadoForeignKey(procesocierreprovision,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoCierreProvision procesocierreprovision,ProcesoCierreProvision procesocierreprovisionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoCierreProvision(procesocierreprovision);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesocierreprovisionAux.setId(procesocierreprovision.getId());
		procesocierreprovisionAux.setVersionRow(procesocierreprovision.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoCierreProvision procesocierreprovisionLocal) throws Exception {
		
		if(this.procesocierreprovisionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoCierreProvision procesocierreprovisionLocal) throws Exception {	
		if(this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				procesocierreprovisionLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				procesocierreprovisionLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				procesocierreprovisionLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DefiProvisionEmpleadoDetalleFormJInternalFrame.class)) {
				DefiProvisionEmpleadoBeanSwingJInternalFrame defiprovisionempleadoBeanSwingJInternalFrameLocal=(DefiProvisionEmpleadoBeanSwingJInternalFrame) ((DefiProvisionEmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				defiprovisionempleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDefiProvisionEmpleado(defiprovisionempleadoBeanSwingJInternalFrameLocal.getdefiprovisionempleado(),true);
				defiprovisionempleadoBeanSwingJInternalFrameLocal.actualizarLista(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado,this.defiprovisionempleadosForeignKey);

				defiprovisionempleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado);

				procesocierreprovisionLocal.setDefiProvisionEmpleado(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado);

				this.addItemDefectoCombosForeignKeyDefiProvisionEmpleado();
				this.cargarCombosFrameDefiProvisionEmpleadosForeignKey("Formulario");
				this.setActualDefiProvisionEmpleadoForeignKey(defiprovisionempleadoBeanSwingJInternalFrameLocal.defiprovisionempleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoCierreProvisionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesocierreprovisionValidator.getInvalidValues(this.procesocierreprovision);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoCierreProvision procesocierreprovision,List<ProcesoCierreProvision> procesocierreprovisions) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoCierreProvision procesocierreprovision,List<ProcesoCierreProvision> procesocierreprovisions) throws Exception {
		try	{			
			ProcesoCierreProvisionConstantesFunciones.actualizarSelectedLista(procesocierreprovision,procesocierreprovisions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoCierreProvision> procesocierreprovisionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesocierreprovisionsLocal=this.procesocierreprovisionLogic.getProcesoCierreProvisions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesocierreprovisionsLocal=this.procesocierreprovisions;
			}
			//ARCHITECTURE
		
			for(ProcesoCierreProvision procesocierreprovisionLocal:procesocierreprovisionsLocal) {
				if(this.permiteMantenimiento(procesocierreprovisionLocal) && procesocierreprovisionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoCierreProvisionConstantesFunciones.getProcesoCierreProvisionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoCierreProvisionConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelid_anioProcesoCierreProvision,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCierreProvisionConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelid_estructuraProcesoCierreProvision,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCierreProvisionConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelid_empleadoProcesoCierreProvision,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCierreProvisionConstantesFunciones.IDDEFIPROVISIONEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelid_defi_provision_empleadoProcesoCierreProvision,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelid_anioProcesoCierreProvision,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelid_estructuraProcesoCierreProvision,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelid_empleadoProcesoCierreProvision,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelid_defi_provision_empleadoProcesoCierreProvision,"");
		
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
		this.iIdNuevoProcesoCierreProvision--;	
		
		
		this.procesocierreprovisionAux=new ProcesoCierreProvision();
		
		this.procesocierreprovisionAux.setId(this.iIdNuevoProcesoCierreProvision);
		this.procesocierreprovisionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocierreprovisionLogic.getProcesoCierreProvisions().add(this.procesocierreprovisionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesocierreprovisions.add(this.procesocierreprovisionAux);
		}
		//ARCHITECTURE
		
		this.procesocierreprovision=this.procesocierreprovisionAux;
		
		if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoCierreProvision(this.procesocierreprovision);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreProvision(this.procesocierreprovision);
		}
				
		//this.setDefaultControlesProcesoCierreProvision();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoCierreProvision();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoCierreProvision();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreProvision();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCierreProvision(this.procesocierreprovisionBean,this.procesocierreprovision,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoCierreProvision(this.procesocierreprovisionReturnGeneral,this.procesocierreprovisionBean,false);
		
		if(this.procesocierreprovisionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreProvision(this.procesocierreprovisionReturnGeneral.getProcesoCierreProvision());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoCierreProvision(this.procesocierreprovisionReturnGeneral.getProcesoCierreProvision());
		}
		
		if(this.procesocierreprovisionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreProvision(this.procesocierreprovisionReturnGeneral.getProcesoCierreProvision(),classes);//this.procesocierreprovisionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.procesocierreprovision,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoCierreProvision();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoCierreProvision();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.RecargarFormProcesoCierreProvision(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoCierreProvision(false);
						
			if(procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreProvision();
			}
			
			this.actualizarVisualTableDatosProcesoCierreProvision();
			
			this.jTableDatosProcesoCierreProvision.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreProvision(), this.getIndiceNuevoProcesoCierreProvision());
			
			this.seleccionarFilaTablaProcesoCierreProvisionActual();
						
			this.actualizarEstadoCeldasBotonesProcesoCierreProvision("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoCierreProvision(Boolean isHabilitar) throws Exception {
			
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.setEnabled(isHabilitar && this.procesocierreprovisionConstantesFunciones.activarid_anioProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.setEnabled(isHabilitar && this.procesocierreprovisionConstantesFunciones.activarid_estructuraProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.setEnabled(isHabilitar && this.procesocierreprovisionConstantesFunciones.activarid_empleadoProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setEnabled(isHabilitar && this.procesocierreprovisionConstantesFunciones.activarid_defi_provision_empleadoProcesoCierreProvision);
	};
	
	public void setDefaultControlesProcesoCierreProvision() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoCierreProvision(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesocierreprovisionSessionBean.setConGuardarRelaciones(true);			
			this.procesocierreprovisionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoCierreProvision.jTabbedPaneRelacionesProcesoCierreProvision.setVisible(true);
			
					
		} else {
			//this.procesocierreprovisionSessionBean.setConGuardarRelaciones(false);			
			this.procesocierreprovisionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoCierreProvision.jTabbedPaneRelacionesProcesoCierreProvision.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoCierreProvision() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisionLogic.getProcesoCierreProvisions()) {
				if(procesocierreprovisionAux.getId().equals(this.iIdNuevoProcesoCierreProvision)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisions) {
				if(procesocierreprovisionAux.getId().equals(this.iIdNuevoProcesoCierreProvision)) {
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
	
	public int getIndiceActualProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisionLogic.getProcesoCierreProvisions()) {
				if(procesocierreprovisionAux.getId().equals(procesocierreprovision.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisions) {
				if(procesocierreprovisionAux.getId().equals(procesocierreprovision.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoCierreProvision(ProcesoCierreProvision procesocierreprovisionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisionLogic.getProcesoCierreProvisions()) {
				if(procesocierreprovisionAux.getProcesoCierreProvisionOriginal().getId().equals(procesocierreprovisionOriginal.getId())) {
					existe=true;
					procesocierreprovisionOriginal.setId(procesocierreprovisionAux.getId());
					procesocierreprovisionOriginal.setVersionRow(procesocierreprovisionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisions) {
				if(procesocierreprovisionAux.getProcesoCierreProvisionOriginal().getId().equals(procesocierreprovisionOriginal.getId())) {
					existe=true;
					procesocierreprovisionOriginal.setId(procesocierreprovisionAux.getId());
					procesocierreprovisionOriginal.setVersionRow(procesocierreprovisionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoCierreProvision(Boolean esParaCancelar) throws Exception {
		procesocierreprovisionsAux=new ArrayList<ProcesoCierreProvision>();
		procesocierreprovisionAux=new ProcesoCierreProvision();
		
		if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisionLogic.getProcesoCierreProvisions()) {
					if(procesocierreprovisionAux.getId()<0) {
						procesocierreprovisionsAux.add(procesocierreprovisionAux);
					}		
				}
				this.iIdNuevoProcesoCierreProvision=0L;
				this.procesocierreprovisionLogic.getProcesoCierreProvisions().removeAll(procesocierreprovisionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisions) {
					if(procesocierreprovisionAux.getId()<0) {
						procesocierreprovisionsAux.add(procesocierreprovisionAux);
					}		
				}
				this.iIdNuevoProcesoCierreProvision=0L;
				this.procesocierreprovisions.removeAll(procesocierreprovisionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoCierreProvision 
					&& this.procesocierreprovisionLogic.getProcesoCierreProvisions().size()>0
					) {
					procesocierreprovisionAux=this.procesocierreprovisionLogic.getProcesoCierreProvisions().get(this.procesocierreprovisionLogic.getProcesoCierreProvisions().size() - 1);
				
					if(procesocierreprovisionAux.getId()<0) {
						this.procesocierreprovisionLogic.getProcesoCierreProvisions().remove(procesocierreprovisionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoCierreProvision && this.procesocierreprovisions.size()>0) {
					procesocierreprovisionAux=this.procesocierreprovisions.get(this.procesocierreprovisions.size() - 1);
				
					if(procesocierreprovisionAux.getId()<0) {
						this.procesocierreprovisions.remove(procesocierreprovisionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoCierreProvision(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesocierreprovision.getId()<0) {
				this.procesocierreprovisionLogic.getProcesoCierreProvisions().remove(this.procesocierreprovision);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesocierreprovision.getId()<0) {
				this.procesocierreprovisions.remove(this.procesocierreprovision);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoCierreProvision(List<ProcesoCierreProvision> procesocierreprovisionsAux) throws Exception {
		ProcesoCierreProvisionConstantesFunciones.setEstadosInicialesProcesoCierreProvision(procesocierreprovisionsAux);
	}
	
	public void setEstadosInicialesProcesoCierreProvision(ProcesoCierreProvision procesocierreprovisionAux) throws Exception {
		ProcesoCierreProvisionConstantesFunciones.setEstadosInicialesProcesoCierreProvision(procesocierreprovisionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoCierreProvisionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoCierreProvision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoCierreProvisionActual()) {
				if(!this.isEsNuevoProcesoCierreProvision) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoCierreProvision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoCierreProvision=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoCierreProvisionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Cierre Provision ?", "MANTENIMIENTO DE Proceso Cierre Provision", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoCierreProvision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoCierreProvision procesocierreprovision) throws Exception {
		ProcesoCierreProvisionConstantesFunciones.seleccionarAsignar(this.procesocierreprovision,procesocierreprovision);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoCierreProvision=this.isPermisoActualizarOriginalProcesoCierreProvision;
			
			
			this.seleccionarAsignar(procesocierreprovision);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoCierreProvision("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesocierreprovisionSessionBean.setsFuncionBusquedaRapida(this.procesocierreprovisionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoCierreProvision) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoCierreProvision(esParaCancelar);				
				this.cancelarNuevoProcesoCierreProvision(esParaCancelar);								
			}
			
			this.procesocierreprovision=new ProcesoCierreProvision();
			
			this.inicializarProcesoCierreProvision();
			
			this.actualizarEstadoCeldasBotonesProcesoCierreProvision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoCierreProvision() throws Exception {
		try {
			ProcesoCierreProvisionConstantesFunciones.inicializarProcesoCierreProvision(this.procesocierreprovision);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesocierreprovisionLogic.getProcesoCierreProvisions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoCierreProvisions(String sAccionBusqueda,List<ProcesoCierreProvision> procesocierreprovisionsParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoCierreProvision"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoCierreProvisionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoCierreProvisionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoCierreProvision"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Cierre Provisiones");		
		parameters.put("busquedapor", ProcesoCierreProvisionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoCierreProvision=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoCierreProvision);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoCierreProvisionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoCierreProvisionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoCierreProvisionBean.TraerProcesoCierreProvisionBeans(procesocierreprovisionsParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoCierreProvisions(sAccionBusqueda,sTipoArchivoReporte,procesocierreprovisionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoCierreProvisions(sAccionBusqueda,sTipoArchivoReporte,procesocierreprovisionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoCierreProvisionActionPerformed(null);
					//this.generarExcelReporteProcesoCierreProvisions(sAccionBusqueda,sTipoArchivoReporte,procesocierreprovisionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoCierreProvisions(sAccionBusqueda,sTipoArchivoReporte,procesocierreprovisionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoCierreProvisions(sAccionBusqueda,sTipoArchivoReporte,procesocierreprovisionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoCierreProvisions(sAccionBusqueda,sTipoArchivoReporte,procesocierreprovisionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoCierreProvisions(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreProvision> procesocierreprovisionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreprovision";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreProvisions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCierreProvision("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoCierreProvision procesocierreprovision : procesocierreprovisionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoCierreProvisionConstantesFunciones.generarExcelReporteDataProcesoCierreProvision("NORMAL",row,workbook,procesocierreprovision,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Provision",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoCierreProvision(String sTipo,Row row,Workbook workbook) {
		
		ProcesoCierreProvisionConstantesFunciones.generarExcelReporteHeaderProcesoCierreProvision(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoCierreProvisions(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreProvision> procesocierreprovisionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreprovision_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreProvisions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoCierreProvision procesocierreprovision : procesocierreprovisionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.getProcesoCierreProvisionDescripcion(procesocierreprovision));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierreprovision.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierreprovision.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierreprovision.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierreprovision.getdefiprovisionempleado_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Provision",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoCierreProvisions(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreProvision> procesocierreprovisionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoCierreProvision> procesocierreprovisionsRespaldo=null;
		
		classes=ProcesoCierreProvisionConstantesFunciones.getClassesRelationshipsOfProcesoCierreProvision(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesocierreprovisionLogic.setDatosCliente(this.datosCliente);
		this.procesocierreprovisionLogic.setDatosDeep(this.datosDeep);
		this.procesocierreprovisionLogic.setIsConDeep(true);
		
		procesocierreprovisionsRespaldo=this.procesocierreprovisionLogic.getProcesoCierreProvisions();
		
		this.procesocierreprovisionLogic.setProcesoCierreProvisions(procesocierreprovisionsParaReportes);	
		this.procesocierreprovisionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesocierreprovisionsParaReportes=this.procesocierreprovisionLogic.getProcesoCierreProvisions();
		this.procesocierreprovisionLogic.setProcesoCierreProvisions(procesocierreprovisionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreprovision_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreProvisions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCierreProvision("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoCierreProvision procesocierreprovision : procesocierreprovisionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoCierreProvision("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoCierreProvisionConstantesFunciones.generarExcelReporteDataProcesoCierreProvision("NORMAL",row,workbook,procesocierreprovision,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.getProcesoCierreProvisionDescripcion(procesocierreprovision));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Provision",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoCierreProvision() throws Exception {		
		this.startProcessProcesoCierreProvision(true);
	}
	
	public void startProcessProcesoCierreProvision(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoCierreProvision ,this.jPanelParametrosReportesProcesoCierreProvision, this.jScrollPanelDatosProcesoCierreProvision,this.jPanelPaginacionProcesoCierreProvision, this.jScrollPanelDatosEdicionProcesoCierreProvision, this.jPanelAccionesProcesoCierreProvision,this.jPanelAccionesFormularioProcesoCierreProvision,this.jmenuBarProcesoCierreProvision,this.jmenuBarDetalleProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,this.jTtoolBarDetalleProcesoCierreProvision);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCierreProvision=this.jTabbedPaneBusquedasProcesoCierreProvision; 
		
		final JPanel jPanelParametrosReportesProcesoCierreProvision=this.jPanelParametrosReportesProcesoCierreProvision;
		//final JScrollPane jScrollPanelDatosProcesoCierreProvision=this.jScrollPanelDatosProcesoCierreProvision;
		final JTable jTableDatosProcesoCierreProvision=this.jTableDatosProcesoCierreProvision;		
		final JPanel jPanelPaginacionProcesoCierreProvision=this.jPanelPaginacionProcesoCierreProvision;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCierreProvision=this.jScrollPanelDatosEdicionProcesoCierreProvision;
		final JPanel jPanelAccionesProcesoCierreProvision=this.jPanelAccionesProcesoCierreProvision;
		
		JPanel jPanelCamposAuxiliarProcesoCierreProvision=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCierreProvision=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			jPanelCamposAuxiliarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jPanelCamposProcesoCierreProvision;
			jPanelAccionesFormularioAuxiliarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jPanelAccionesFormularioProcesoCierreProvision;
		}
		
		final JPanel jPanelCamposProcesoCierreProvision=jPanelCamposAuxiliarProcesoCierreProvision;
		final JPanel jPanelAccionesFormularioProcesoCierreProvision=jPanelAccionesFormularioAuxiliarProcesoCierreProvision;
		
		
		final JMenuBar jmenuBarProcesoCierreProvision=this.jmenuBarProcesoCierreProvision;
		final JToolBar jTtoolBarProcesoCierreProvision=this.jTtoolBarProcesoCierreProvision;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoCierreProvision=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCierreProvision=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			jmenuBarDetalleAuxiliarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jmenuBarDetalleProcesoCierreProvision;
			jTtoolBarDetalleAuxiliarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jTtoolBarDetalleProcesoCierreProvision;
		}
		
		final JMenuBar jmenuBarDetalleProcesoCierreProvision=jmenuBarDetalleAuxiliarProcesoCierreProvision;
		final JToolBar jTtoolBarDetalleProcesoCierreProvision=jTtoolBarDetalleAuxiliarProcesoCierreProvision;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCierreProvision;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCierreProvision;
			processRunnable.jTableDatos=jTableDatosProcesoCierreProvision;
			processRunnable.jPanelCampos=jPanelCamposProcesoCierreProvision;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCierreProvision;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCierreProvision;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCierreProvision;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCierreProvision;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCierreProvision;
			processRunnable.jTtoolBar=jTtoolBarProcesoCierreProvision;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCierreProvision;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCierreProvision ,jPanelParametrosReportesProcesoCierreProvision,jTableDatosProcesoCierreProvision, /*jScrollPanelDatosProcesoCierreProvision,*/jPanelCamposProcesoCierreProvision,jPanelPaginacionProcesoCierreProvision, /*jScrollPanelDatosEdicionProcesoCierreProvision,*/ jPanelAccionesProcesoCierreProvision,jPanelAccionesFormularioProcesoCierreProvision,jmenuBarProcesoCierreProvision,jmenuBarDetalleProcesoCierreProvision,jTtoolBarProcesoCierreProvision,jTtoolBarDetalleProcesoCierreProvision);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCierreProvision ,jPanelParametrosReportesProcesoCierreProvision, jScrollPanelDatosProcesoCierreProvision,jPanelPaginacionProcesoCierreProvision, jScrollPanelDatosEdicionProcesoCierreProvision, jPanelAccionesProcesoCierreProvision,jPanelAccionesFormularioProcesoCierreProvision,jmenuBarProcesoCierreProvision,jmenuBarDetalleProcesoCierreProvision,jTtoolBarProcesoCierreProvision,jTtoolBarDetalleProcesoCierreProvision);
						
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
	
	public void finishProcessProcesoCierreProvision() {// throws Exception 
		this.finishProcessProcesoCierreProvision(true);
	}
	
	public void finishProcessProcesoCierreProvision(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoCierreProvision ,this.jPanelParametrosReportesProcesoCierreProvision, this.jScrollPanelDatosProcesoCierreProvision,this.jPanelPaginacionProcesoCierreProvision, this.jScrollPanelDatosEdicionProcesoCierreProvision, this.jPanelAccionesProcesoCierreProvision,this.jPanelAccionesFormularioProcesoCierreProvision,this.jmenuBarProcesoCierreProvision,this.jmenuBarDetalleProcesoCierreProvision,this.jTtoolBarProcesoCierreProvision,this.jTtoolBarDetalleProcesoCierreProvision);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCierreProvision=this.jTabbedPaneBusquedasProcesoCierreProvision; 
		
		final JPanel jPanelParametrosReportesProcesoCierreProvision=this.jPanelParametrosReportesProcesoCierreProvision;
		//final JScrollPane jScrollPanelDatosProcesoCierreProvision=this.jScrollPanelDatosProcesoCierreProvision;
		final JTable jTableDatosProcesoCierreProvision=this.jTableDatosProcesoCierreProvision;		
		final JPanel jPanelPaginacionProcesoCierreProvision=this.jPanelPaginacionProcesoCierreProvision;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCierreProvision=this.jScrollPanelDatosEdicionProcesoCierreProvision;
		final JPanel jPanelAccionesProcesoCierreProvision=this.jPanelAccionesProcesoCierreProvision;
		
		JPanel jPanelCamposAuxiliarProcesoCierreProvision=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCierreProvision=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			jPanelCamposAuxiliarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jPanelCamposProcesoCierreProvision;
			jPanelAccionesFormularioAuxiliarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jPanelAccionesFormularioProcesoCierreProvision;
		}
		
		final JPanel jPanelCamposProcesoCierreProvision=jPanelCamposAuxiliarProcesoCierreProvision;
		final JPanel jPanelAccionesFormularioProcesoCierreProvision=jPanelAccionesFormularioAuxiliarProcesoCierreProvision;
		
		
		final JMenuBar jmenuBarProcesoCierreProvision=this.jmenuBarProcesoCierreProvision;		
		final JToolBar jTtoolBarProcesoCierreProvision=this.jTtoolBarProcesoCierreProvision;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoCierreProvision=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCierreProvision=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			jmenuBarDetalleAuxiliarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jmenuBarDetalleProcesoCierreProvision;
			jTtoolBarDetalleAuxiliarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jTtoolBarDetalleProcesoCierreProvision;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoCierreProvision=jmenuBarDetalleAuxiliarProcesoCierreProvision;
		final JToolBar jTtoolBarDetalleProcesoCierreProvision=jTtoolBarDetalleAuxiliarProcesoCierreProvision;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCierreProvision;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCierreProvision;
			processRunnable.jTableDatos=jTableDatosProcesoCierreProvision;
			processRunnable.jPanelCampos=jPanelCamposProcesoCierreProvision;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCierreProvision;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCierreProvision;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCierreProvision;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCierreProvision;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCierreProvision;
			processRunnable.jTtoolBar=jTtoolBarProcesoCierreProvision;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCierreProvision;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoCierreProvision ,jPanelParametrosReportesProcesoCierreProvision, jTableDatosProcesoCierreProvision,/*jScrollPanelDatosProcesoCierreProvision,*/jPanelCamposProcesoCierreProvision,jPanelPaginacionProcesoCierreProvision, /*jScrollPanelDatosEdicionProcesoCierreProvision,*/ jPanelAccionesProcesoCierreProvision,jPanelAccionesFormularioProcesoCierreProvision,jmenuBarProcesoCierreProvision,jmenuBarDetalleProcesoCierreProvision,jTtoolBarProcesoCierreProvision,jTtoolBarDetalleProcesoCierreProvision));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoCierreProvision(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoCierreProvision(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoCierreProvision(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoCierreProvision(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoCierreProvision,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoCierreProvision,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoCierreProvision(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoCierreProvision,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoCierreProvision,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesocierreprovisionConstantesFunciones.getsFinalQueryProcesoCierreProvision();
		String  finalQueryPaginacionTodos=this.procesocierreprovisionConstantesFunciones.getsFinalQueryProcesoCierreProvision();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoCierreProvisionConstantesFunciones.getArrayColumnasGlobalesNoProcesoCierreProvision(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoCierreProvisionConstantesFunciones.getArrayColumnasGlobalesProcesoCierreProvision(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoCierreProvisionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesocierreprovisionsEliminados= new ArrayList<ProcesoCierreProvision>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoCierreProvision();
		
				///*ProcesoCierreProvisionSessionBean*/this.procesocierreprovisionSessionBean=new ProcesoCierreProvisionSessionBean();
			
			if(this.procesocierreprovisionSessionBean==null) {
				this.procesocierreprovisionSessionBean=new ProcesoCierreProvisionSessionBean();
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
					this.iNumeroPaginacion=ProcesoCierreProvisionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoCierreProvisionConstantesFunciones.getClassesForeignKeysOfProcesoCierreProvision(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesocierreprovision."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesocierreprovisionsAux= new ArrayList<ProcesoCierreProvision>();
			
				
			procesocierreprovisionLogic.setDatosCliente(this.datosCliente);
			procesocierreprovisionLogic.setDatosDeep(this.datosDeep);
			procesocierreprovisionLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoCierreProvision")) {
				this.sDetalleReporte=ProcesoCierreProvisionConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreProvision(id_anioBusquedaProcesoCierreProvision,id_estructuraBusquedaProcesoCierreProvision,id_empleadoBusquedaProcesoCierreProvision,id_defi_provision_empleadoBusquedaProcesoCierreProvision);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesocierreprovisionLogic.getProcesoCierreProvisionsBusquedaProcesoCierreProvision(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoCierreProvision,id_estructuraBusquedaProcesoCierreProvision,id_empleadoBusquedaProcesoCierreProvision,id_defi_provision_empleadoBusquedaProcesoCierreProvision);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCierreProvisionConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreProvision(id_anioBusquedaProcesoCierreProvision,id_estructuraBusquedaProcesoCierreProvision,id_empleadoBusquedaProcesoCierreProvision,id_defi_provision_empleadoBusquedaProcesoCierreProvision);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCierreProvisionConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreProvision(id_anioBusquedaProcesoCierreProvision,id_estructuraBusquedaProcesoCierreProvision,id_empleadoBusquedaProcesoCierreProvision,id_defi_provision_empleadoBusquedaProcesoCierreProvision);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesocierreprovisionLogic.getProcesoCierreProvisions()==null||procesocierreprovisionLogic.getProcesoCierreProvisions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesocierreprovisions==null|| procesocierreprovisions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreprovisionsAux=new ArrayList<ProcesoCierreProvision>();
						procesocierreprovisionsAux.addAll(procesocierreprovisionLogic.getProcesoCierreProvisions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierreprovisionsAux=new ArrayList<ProcesoCierreProvision>();
							procesocierreprovisionsAux.addAll(procesocierreprovisions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesocierreprovisionLogic.getProcesoCierreProvisionsBusquedaProcesoCierreProvision(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoCierreProvision,id_estructuraBusquedaProcesoCierreProvision,id_empleadoBusquedaProcesoCierreProvision,id_defi_provision_empleadoBusquedaProcesoCierreProvision);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCierreProvisionConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreProvision(id_anioBusquedaProcesoCierreProvision,id_estructuraBusquedaProcesoCierreProvision,id_empleadoBusquedaProcesoCierreProvision,id_defi_provision_empleadoBusquedaProcesoCierreProvision);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCierreProvisionConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreProvision(id_anioBusquedaProcesoCierreProvision,id_estructuraBusquedaProcesoCierreProvision,id_empleadoBusquedaProcesoCierreProvision,id_defi_provision_empleadoBusquedaProcesoCierreProvision);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoCierreProvisions("BusquedaProcesoCierreProvision",procesocierreprovisionLogic.getProcesoCierreProvisions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoCierreProvisions("BusquedaProcesoCierreProvision",procesocierreprovisions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreprovisionLogic.setProcesoCierreProvisions(new ArrayList<ProcesoCierreProvision>());
						procesocierreprovisionLogic.getProcesoCierreProvisions().addAll(procesocierreprovisionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierreprovisions=new ArrayList<ProcesoCierreProvision>();
							procesocierreprovisions.addAll(procesocierreprovisionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoCierreProvision();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoCierreProvision();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocierreprovisionLogic.getProcesoCierreProvisions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierreprovisions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocierreprovisionLogic.getProcesoCierreProvisions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierreprovisions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoCierreProvision procesocierreprovision) {
		Boolean permite=true;
		
		if(this.procesocierreprovision.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoCierreProvisionConstantesFunciones.getOrderByListaProcesoCierreProvision();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoCierreProvisionConstantesFunciones.getOrderByListaProcesoCierreProvision();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreProvision procesocierreprovision:procesocierreprovisionLogic.getProcesoCierreProvisions()) {
				if(procesocierreprovision.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreprovisionTotales=procesocierreprovision;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreProvision procesocierreprovision:this.procesocierreprovisions) {
				if(procesocierreprovision.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreprovisionTotales=procesocierreprovision;
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
			this.procesocierreprovisionAux=new ProcesoCierreProvision();
			this.procesocierreprovisionAux.setsType(Constantes2.S_TOTALES);
			this.procesocierreprovisionAux.setIsNew(false);
			this.procesocierreprovisionAux.setIsChanged(false);
			this.procesocierreprovisionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoCierreProvisionConstantesFunciones.TotalizarValoresFilaProcesoCierreProvision(this.procesocierreprovisionLogic.getProcesoCierreProvisions(),this.procesocierreprovisionAux);
				
				//this.procesocierreprovisionLogic.getProcesoCierreProvisions().add(this.procesocierreprovisionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoCierreProvisionConstantesFunciones.TotalizarValoresFilaProcesoCierreProvision(this.procesocierreprovisions,this.procesocierreprovisionAux);
				
				this.procesocierreprovisions.add(this.procesocierreprovisionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesocierreprovisionTotales=new ProcesoCierreProvision();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocierreprovisionLogic.getProcesoCierreProvisions().remove(procesocierreprovisionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocierreprovisions.remove(procesocierreprovisionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesocierreprovisionTotales=new ProcesoCierreProvision();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreProvision procesocierreprovision:procesocierreprovisionLogic.getProcesoCierreProvisions()) {
				if(procesocierreprovision.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreprovisionTotales=procesocierreprovision;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCierreProvisionConstantesFunciones.TotalizarValoresFilaProcesoCierreProvision(this.procesocierreprovisionLogic.getProcesoCierreProvisions(),procesocierreprovisionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreProvision procesocierreprovision:this.procesocierreprovisions) {
				if(procesocierreprovision.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreprovisionTotales=procesocierreprovision;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCierreProvisionConstantesFunciones.TotalizarValoresFilaProcesoCierreProvision(this.procesocierreprovisions,procesocierreprovisionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoCierreProvisionsBusquedaProcesoCierreProvision()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoCierreProvision";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCierreProvisionsFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCierreProvisionsFK_IdDefiProvisionEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdDefiProvisionEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCierreProvisionsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCierreProvisionsFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoCierreProvisionsBusquedaProcesoCierreProvision(String sFinalQuery,Long id_anio,Long id_estructura,Long id_empleado,Long id_defi_provision_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierreprovisionLogic.getProcesoCierreProvisionsBusquedaProcesoCierreProvision(sFinalQuery,this.pagination,id_anio,id_estructura,id_empleado,id_defi_provision_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCierreProvisionsFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierreprovisionLogic.getProcesoCierreProvisionsFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCierreProvisionsFK_IdDefiProvisionEmpleado(String sFinalQuery,Long id_defi_provision_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierreprovisionLogic.getProcesoCierreProvisionsFK_IdDefiProvisionEmpleado(sFinalQuery,this.pagination,id_defi_provision_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCierreProvisionsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierreprovisionLogic.getProcesoCierreProvisionsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCierreProvisionsFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierreprovisionLogic.getProcesoCierreProvisionsFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
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
	
	public void inicializarPermisosProcesoCierreProvision() {
		this.isPermisoTodoProcesoCierreProvision=false;
		this.isPermisoNuevoProcesoCierreProvision=false;
		this.isPermisoActualizarProcesoCierreProvision=false;
		this.isPermisoActualizarOriginalProcesoCierreProvision=false;
		this.isPermisoEliminarProcesoCierreProvision=false;
		this.isPermisoGuardarCambiosProcesoCierreProvision=false;
		this.isPermisoConsultaProcesoCierreProvision=true;
		this.isPermisoBusquedaProcesoCierreProvision=true;
		this.isPermisoReporteProcesoCierreProvision=true;
		this.isPermisoOrdenProcesoCierreProvision=false;		
		this.isPermisoPaginacionMedioProcesoCierreProvision=false;		
		this.isPermisoPaginacionAltoProcesoCierreProvision=false;		
		this.isPermisoPaginacionTodoProcesoCierreProvision=false;		
		this.isPermisoCopiarProcesoCierreProvision=false;		
		this.isPermisoVerFormProcesoCierreProvision=false;		
		this.isPermisoDuplicarProcesoCierreProvision=false;
		this.isPermisoOrdenProcesoCierreProvision=false;
	}
	
	public void setPermisosUsuarioProcesoCierreProvision(Boolean isPermiso) {
		this.isPermisoTodoProcesoCierreProvision=isPermiso;
		this.isPermisoNuevoProcesoCierreProvision=isPermiso;
		this.isPermisoActualizarProcesoCierreProvision=isPermiso;
		this.isPermisoActualizarOriginalProcesoCierreProvision=isPermiso;
		this.isPermisoEliminarProcesoCierreProvision=isPermiso;
		this.isPermisoGuardarCambiosProcesoCierreProvision=isPermiso;
		this.isPermisoConsultaProcesoCierreProvision=isPermiso;
		this.isPermisoBusquedaProcesoCierreProvision=isPermiso;
		this.isPermisoReporteProcesoCierreProvision=isPermiso;
		this.isPermisoOrdenProcesoCierreProvision=isPermiso;		
		this.isPermisoPaginacionMedioProcesoCierreProvision=isPermiso;		
		this.isPermisoPaginacionAltoProcesoCierreProvision=isPermiso;		
		this.isPermisoPaginacionTodoProcesoCierreProvision=isPermiso;		
		this.isPermisoCopiarProcesoCierreProvision=isPermiso;		
		this.isPermisoVerFormProcesoCierreProvision=isPermiso;		
		this.isPermisoDuplicarProcesoCierreProvision=isPermiso;
		this.isPermisoOrdenProcesoCierreProvision=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoCierreProvision(Boolean isPermiso) {
		//this.isPermisoTodoProcesoCierreProvision=isPermiso;
		this.isPermisoNuevoProcesoCierreProvision=isPermiso;
		this.isPermisoActualizarProcesoCierreProvision=isPermiso;
		this.isPermisoActualizarOriginalProcesoCierreProvision=isPermiso;
		this.isPermisoEliminarProcesoCierreProvision=isPermiso;
		this.isPermisoGuardarCambiosProcesoCierreProvision=isPermiso;
		//this.isPermisoConsultaProcesoCierreProvision=isPermiso;
		//this.isPermisoBusquedaProcesoCierreProvision=isPermiso;
		//this.isPermisoReporteProcesoCierreProvision=isPermiso;
		//this.isPermisoOrdenProcesoCierreProvision=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoCierreProvision=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoCierreProvision=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoCierreProvision=isPermiso;		
		//this.isPermisoCopiarProcesoCierreProvision=isPermiso;		
		//this.isPermisoDuplicarProcesoCierreProvision=isPermiso;
		//this.isPermisoOrdenProcesoCierreProvision=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCierreProvisionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoCierreProvisionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoCierreProvision(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCierreProvisionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoCierreProvisionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoCierreProvisionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoCierreProvisionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoCierreProvision() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoCierreProvisionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoCierreProvisionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoCierreProvision=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoCierreProvision=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoCierreProvision=this.isPermisoActualizarProcesoCierreProvision;
			this.isPermisoEliminarProcesoCierreProvision=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoCierreProvision=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoCierreProvision=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoCierreProvision=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoCierreProvision=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoCierreProvision=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCierreProvision=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoCierreProvision=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoCierreProvision=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoCierreProvision=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoCierreProvision=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoCierreProvision=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoCierreProvision=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCierreProvision=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoCierreProvision.setToolTipText(this.jTableDatosProcesoCierreProvision.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoCierreProvision(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoCierreProvision(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoCierreProvisionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoCierreProvisionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoCierreProvision() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoCierreProvisionListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.defiprovisionempleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoCierreProvisionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoCierreProvisionJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDefiProvisionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyDefiProvisionEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.defiprovisionempleadosForeignKey==null||this.defiprovisionempleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DefiProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesDefiProvisionEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DefiProvisionEmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DefiProvisionEmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDefiProvisionEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoCierreProvision()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyDefiProvisionEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.procesocierreprovisionSessionBean==null) {
				this.procesocierreprovisionSessionBean=new ProcesoCierreProvisionSessionBean();
			}

			if(!this.procesocierreprovisionSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.procesocierreprovisionSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.procesocierreprovisionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyDefiProvisionEmpleado()throws Exception {
		try {

			if(!this.procesocierreprovisionSessionBean.getisBusquedaDesdeForeignKeySesionDefiProvisionEmpleado()) {
				DefiProvisionEmpleado defiprovisionempleado=new DefiProvisionEmpleado();
				DefiProvisionEmpleadoConstantesFunciones.setDefiProvisionEmpleadoDescripcion(defiprovisionempleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				defiprovisionempleado.setId(null);

				if(!DefiProvisionEmpleadoConstantesFunciones.ExisteEnLista(this.defiprovisionempleadosForeignKey,defiprovisionempleado,true)) {

					this.defiprovisionempleadosForeignKey.add(0,defiprovisionempleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCierreProvision()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCierreProvision(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoCierreProvision()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreProvision();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision)throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(procesocierreprovision.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(procesocierreprovision.getid_empleado(),false,"Formulario");
			this.setActualDefiProvisionEmpleadoForeignKey(procesocierreprovision.getid_defi_provision_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoCierreProvision()throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(this.procesocierreprovisionConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.procesocierreprovisionConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualDefiProvisionEmpleadoForeignKey(this.procesocierreprovisionConstantesFunciones.getid_defi_provision_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreProvision()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoCierreProvision()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoCierreProvision()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoCierreProvision()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoCierreProvision()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameDefiProvisionEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoCierreProvision(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDefiProvisionEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoCierreProvision()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision!=null && this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision!=null && this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision!=null && this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision!=null && this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ProcesoCierreProvisionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoCierreProvisionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoCierreProvisionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesocierreprovisionSessionBean=new ProcesoCierreProvisionSessionBean(); 
		this.procesocierreprovisionConstantesFunciones=new ProcesoCierreProvisionConstantesFunciones(); 
		this.procesocierreprovisionBean=new ProcesoCierreProvision();//(this.procesocierreprovisionConstantesFunciones); 		
		this.procesocierreprovisionReturnGeneral=new ProcesoCierreProvisionParameterReturnGeneral(); 
		
		this.procesocierreprovisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierreprovisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoCierreProvisionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoCierreProvisionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoCierreProvisionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoCierreProvision(true);
			
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
			
			this.procesocierreprovisionConstantesFunciones=new ProcesoCierreProvisionConstantesFunciones(); 
			this.procesocierreprovisionBean=new ProcesoCierreProvision();//this.procesocierreprovisionConstantesFunciones); 			
			this.procesocierreprovisionReturnGeneral=new ProcesoCierreProvisionParameterReturnGeneral(); 
		
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cierre Provision Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesocierreprovision=new ProcesoCierreProvision();
			this.procesocierreprovisions = new ArrayList<ProcesoCierreProvision>();
			this.procesocierreprovisionsAux = new ArrayList<ProcesoCierreProvision>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic=new ProcesoCierreProvisionLogic();
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}
			
			//this.procesocierreprovisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesocierreprovisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoCierreProvision);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoCierreProvision!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCierreProvision);	
					}
					
					if(this.jInternalFrameImportacionProcesoCierreProvision!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCierreProvision);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoCierreProvision!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoCierreProvision);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCierreProvision);
				this.jInternalFrameDetalleFormProcesoCierreProvision.setVisible(false);
				this.jInternalFrameDetalleFormProcesoCierreProvision.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCierreProvision!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCierreProvision);
					this.jInternalFrameReporteDinamicoProcesoCierreProvision.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoCierreProvision.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoCierreProvision!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCierreProvision);
					this.jInternalFrameImportacionProcesoCierreProvision.setVisible(false);
					this.jInternalFrameImportacionProcesoCierreProvision.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoCierreProvision!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCierreProvision);
					this.jInternalFrameOrderByProcesoCierreProvision.setVisible(false);
					this.jInternalFrameOrderByProcesoCierreProvision.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoCierreProvisionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoCierreProvisionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesocierreprovisionReturnGeneral=new ProcesoCierreProvisionParameterReturnGeneral();
			
			this.procesocierreprovisionParameterGeneral=new ProcesoCierreProvisionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesocierreprovisionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoCierreProvisionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCierreProvisionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocierreprovisionSessionBean.getEsGuardarRelacionado(),this.procesocierreprovisionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCierreProvisionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocierreprovisionSessionBean.getEsGuardarRelacionado(),this.procesocierreprovisionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=false;
			this.isVisibilidadCeldaDuplicarProcesoCierreProvision=true;
			this.isVisibilidadCeldaCopiarProcesoCierreProvision=true;
			this.isVisibilidadCeldaVerFormProcesoCierreProvision=true;
			this.isVisibilidadCeldaOrdenProcesoCierreProvision=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=false;
			this.isVisibilidadCeldaModificarProcesoCierreProvision=false;
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=false;
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=false;
			this.isVisibilidadCeldaCancelarProcesoCierreProvision=false;
			this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=false;
			
			
			this.isVisibilidadBusquedaProcesoCierreProvision=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdDefiProvisionEmpleado=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEstructura=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoCierreProvision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoCierreProvision();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoCierreProvision(false);
			
			this.setPermisosUsuarioProcesoCierreProvision();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado() 
				|| (this.procesocierreprovisionSessionBean.getEsGuardarRelacionado() && this.procesocierreprovisionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoCierreProvisionClasesRelacionadas();
			}
			
			if(this.procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoCierreProvisionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoCierreProvision();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoCierreProvision();
			}
			
			if(!this.isPermisoBusquedaProcesoCierreProvision) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoCierreProvision.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoCierreProvisionConstantesFunciones.getTiposSeleccionarProcesoCierreProvision());
				
				this.tiposColumnasSelect=ProcesoCierreProvisionConstantesFunciones.getTiposSeleccionarProcesoCierreProvision(true);
				
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
			//if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoCierreProvision();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoCierreProvision(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoCierreProvision(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreProvision() ;
			
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
			this.estructuraLogic=new EstructuraLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.defiprovisionempleadoLogic=new DefiProvisionEmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesocierreprovisionImplementable= (ProcesoCierreProvisionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCierreProvisionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesocierreprovisionImplementableHome= (ProcesoCierreProvisionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCierreProvisionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesocierreprovisions= new ArrayList<ProcesoCierreProvision>();
			this.procesocierreprovisionsEliminados= new ArrayList<ProcesoCierreProvision>();
						
			this.isEsNuevoProcesoCierreProvision=false;
			this.esParaAccionDesdeFormularioProcesoCierreProvision=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.defiprovisionempleadosForeignKey=new ArrayList<DefiProvisionEmpleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoCierreProvision(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoCierreProvision();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoCierreProvisionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoCierreProvision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoCierreProvision(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoCierreProvision();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoCierreProvision();
			}
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoCierreProvision.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoCierreProvision.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoCierreProvision.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoCierreProvision(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoCierreProvision: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoCierreProvision() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoCierreProvision")) {
				iIndex=this.jInternalFrameDetalleFormProcesoCierreProvision.jTabbedPaneRelacionesProcesoCierreProvision.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoCierreProvision.jTabbedPaneRelacionesProcesoCierreProvision.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoCierreProvision();	
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
	
	public void cargarCombosForeignKeyProcesoCierreProvision(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoCierreProvision(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoCierreProvision(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoCierreProvisionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoCierreProvision();
		
		this.cargarCombosFrameForeignKeyProcesoCierreProvision();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoCierreProvision();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoCierreProvision();
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

	public void cargarCombosForeignKeyDefiProvisionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDefiProvisionEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDefiProvisionEmpleado();
				this.cargarCombosFrameDefiProvisionEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDefiProvisionEmpleado(this.defiprovisionempleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoCierreProvisionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
			
			if(jTableDatosProcesoCierreProvision.getRowCount()>=1) {
				jTableDatosProcesoCierreProvision.removeRowSelectionInterval(0, jTableDatosProcesoCierreProvision.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoCierreProvision=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoCierreProvision(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoCierreProvision(true);			
			//this.procesocierreprovision=new ProcesoCierreProvision();
			//this.procesocierreprovision.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreProvision(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreProvision() ;
			
			if(ProcesoCierreProvisionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreProvision(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesocierreprovision);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);				
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
			if(this.procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoCierreProvision: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoCierreProvisionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoCierreProvision.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoCierreProvision.getSelectedRows().length;			
			}
			
			procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoCierreProvision--;			
				//ProcesoCierreProvision procesocierreprovisionAux= new ProcesoCierreProvision();			
				//procesocierreprovisionAux.setId(this.iIdNuevoProcesoCierreProvision);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoCierreProvision procesocierreprovisionOrigen=new ProcesoCierreProvision();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoCierreProvision procesocierreprovisionOrigen : procesocierreprovisionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesocierreprovisionOrigen =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierreprovisionOrigen =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoCierreProvision();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesocierreprovision.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoCierreProvision(procesocierreprovisionOrigen,this.procesocierreprovision,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocierreprovisionLogic.getProcesoCierreProvisions().add(this.procesocierreprovisionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocierreprovisions.add(this.procesocierreprovisionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
				
				this.jTableDatosProcesoCierreProvision.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreProvision(), this.getIndiceNuevoProcesoCierreProvision());
				
				int iLastRow =  this.jTableDatosProcesoCierreProvision.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCierreProvision.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCierreProvision.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();									
		
			ProcesoCierreProvision procesocierreprovisionOrigen=new ProcesoCierreProvision();
			ProcesoCierreProvision procesocierreprovisionDestino=new ProcesoCierreProvision();
				
			procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoCierreProvision.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesocierreprovisionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoCierreProvision.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreprovisionOrigen =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocierreprovisionOrigen =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreprovisionDestino =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocierreprovisionDestino =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesocierreprovisionOrigen =procesocierreprovisionsSeleccionados.get(0);
				procesocierreprovisionDestino =procesocierreprovisionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoCierreProvision(procesocierreprovisionOrigen,procesocierreprovisionDestino,true,false);
				
				procesocierreprovisionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesocierreprovisionDestino,procesocierreprovisionLogic.getProcesoCierreProvisions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesocierreprovisionDestino,procesocierreprovisions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
				
				//this.jTableDatosProcesoCierreProvision.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreProvision(), this.getIndiceNuevoProcesoCierreProvision());
				
				int iLastRow =  this.jTableDatosProcesoCierreProvision.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCierreProvision.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCierreProvision.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoCierreProvision.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoCierreProvision.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoCierreProvision.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoCierreProvision.setVisible(!isVisible);
			this.jPanelPaginacionProcesoCierreProvision.setVisible(!isVisible);
			this.jPanelAccionesProcesoCierreProvision.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoCierreProvision();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoCierreProvision();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoCierreProvision();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoCierreProvision();
			
			this.abrirFrameOrderByProcesoCierreProvision();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoCierreProvision();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoCierreProvision(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCierreProvision);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoCierreProvision.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoCierreProvision.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoCierreProvision.setSize(this.jInternalFrameDetalleFormProcesoCierreProvision.iWidthFormulario,this.jInternalFrameDetalleFormProcesoCierreProvision.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoCierreProvision.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoCierreProvision.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoCierreProvision.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoCierreProvision.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoCierreProvision.jContentPaneDetalleProcesoCierreProvision.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoCierreProvision.jTabbedPaneRelacionesProcesoCierreProvision.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreProvision.jContentPaneDetalleProcesoCierreProvision.getWidth(),ProcesoCierreProvisionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCierreProvision.jTabbedPaneRelacionesProcesoCierreProvision.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreProvision.jContentPaneDetalleProcesoCierreProvision.getWidth(),ProcesoCierreProvisionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCierreProvision.jTabbedPaneRelacionesProcesoCierreProvision.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreProvision.jContentPaneDetalleProcesoCierreProvision.getWidth(),ProcesoCierreProvisionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoCierreProvision.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoCierreProvision.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoCierreProvision() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoCierreProvision==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoCierreProvision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreProvision,false,this);
				} else {
					this.jInternalFrameOrderByProcesoCierreProvision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreProvision,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCierreProvision);
				this.jInternalFrameOrderByProcesoCierreProvision.setVisible(false);
				this.jInternalFrameOrderByProcesoCierreProvision.setSelected(false);
				
				this.jInternalFrameOrderByProcesoCierreProvision.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCierreProvision"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoCierreProvision();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoCierreProvision() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoCierreProvision==null) {
				
				this.jInternalFrameImportacionProcesoCierreProvision=new ImportacionJInternalFrame(ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCierreProvision);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCierreProvision);
				this.jInternalFrameImportacionProcesoCierreProvision.setVisible(false);
				this.jInternalFrameImportacionProcesoCierreProvision.setSelected(false);


				this.jInternalFrameImportacionProcesoCierreProvision.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCierreProvision"));
				this.jInternalFrameImportacionProcesoCierreProvision.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCierreProvision"));
				this.jInternalFrameImportacionProcesoCierreProvision.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCierreProvision"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoCierreProvision() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreProvision==null) {
				this.jInternalFrameReporteDinamicoProcesoCierreProvision=new ReporteDinamicoJInternalFrame(ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCierreProvision);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCierreProvision);
				this.jInternalFrameReporteDinamicoProcesoCierreProvision.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoCierreProvision.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreProvision"));
				this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreProvision"));
				this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreProvision"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreProvision();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoCierreProvision() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCierreProvision);
			
	       	this.jInternalFrameDetalleFormProcesoCierreProvision.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoCierreProvision.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoCierreProvision.dispose();
			//this.jInternalFrameDetalleFormProcesoCierreProvision=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoCierreProvision() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoCierreProvision.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoCierreProvision.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoCierreProvision() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoCierreProvision.setVisible(true);
	        this.jInternalFrameImportacionProcesoCierreProvision.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoCierreProvision() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoCierreProvision.setVisible(true);
	        this.jInternalFrameOrderByProcesoCierreProvision.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoCierreProvision() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoCierreProvision.setVisible(false);
	        this.jInternalFrameOrderByProcesoCierreProvision.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoCierreProvision() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoCierreProvision.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoCierreProvision.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoCierreProvision() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoCierreProvision.setVisible(false);
	        this.jInternalFrameImportacionProcesoCierreProvision.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoCierreProvision(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoCierreProvision(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoCierreProvision(true);
			//this.isEsNuevoProcesoCierreProvision=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoCierreProvision("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreProvision(false) ;
			
			if(procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoCierreProvisionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreProvision(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreProvision(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoCierreProvisionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoCierreProvision(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoCierreProvision(true);
			//this.isEsNuevoProcesoCierreProvision=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesocierreprovision.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoCierreProvision("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoCierreProvision(false) ;
			
			if(ProcesoCierreProvisionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreProvision(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreProvision(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCierreProvision.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCierreProvision.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCierreProvision.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaDefiProvisionEmpleado(List<DefiProvisionEmpleado> defiprovisionempleadosForeignKey)throws Exception{
		TableColumn tableColumnDefiProvisionEmpleado=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO));
		TableCellEditor tableCellEditorDefiProvisionEmpleado =tableColumnDefiProvisionEmpleado.getCellEditor();

		DefiProvisionEmpleadoTableCell defiprovisionempleadoTableCellFk=(DefiProvisionEmpleadoTableCell)tableCellEditorDefiProvisionEmpleado;

		if(defiprovisionempleadoTableCellFk!=null) {
			defiprovisionempleadoTableCellFk.setdefiprovisionempleadosForeignKey(defiprovisionempleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCierreProvision.getSelectedRow();

		//if(intSelectedRow<=0) {
			//defiprovisionempleadoTableCellFk.setRowActual(intSelectedRow);
			//defiprovisionempleadoTableCellFk.setdefiprovisionempleadosForeignKeyActual(defiprovisionempleadosForeignKey);
		//}


		if(defiprovisionempleadoTableCellFk!=null) {
			defiprovisionempleadoTableCellFk.RecargarDefiProvisionEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoCierreProvision(false);
			
			//if(!this.isEsNuevoProcesoCierreProvision) {								
				int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.procesocierreprovision,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
				
			}
			
			if(this.permiteMantenimiento(this.procesocierreprovision)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoCierreProvision=true;
					this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
					this.isEsNuevoProcesoCierreProvision=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoCierreProvision=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoCierreProvision=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCierreProvision(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreProvision(false);
				
				this.habilitarDeshabilitarControlesProcesoCierreProvision(false);
			
												
				
				if(ProcesoCierreProvisionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoCierreProvision();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoCierreProvisionActionPerformed(evt,procesocierreprovisionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoCierreProvision(this.procesocierreprovision,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoCierreProvision.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesocierreprovisionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesocierreprovision.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreProvision.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreProvision.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				this.procesocierreprovision.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				this.procesocierreprovision.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesocierreprovision)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoCierreProvisionModel) this.jTableDatosProcesoCierreProvision.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoCierreProvision=true;
				this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
				this.isEsNuevoProcesoCierreProvision=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCierreProvision(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreProvision(false);
				
				this.habilitarDeshabilitarControlesProcesoCierreProvision(false);
				
				
				
				if(ProcesoCierreProvisionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoCierreProvision();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoCierreProvision.getRowCount()>=1) {
				jTableDatosProcesoCierreProvision.removeRowSelectionInterval(0, jTableDatosProcesoCierreProvision.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoCierreProvision(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreProvision(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreProvision(false) ;
			
			this.isEsNuevoProcesoCierreProvision=false;
			
			if(ProcesoCierreProvisionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoCierreProvision();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoCierreProvision(false);
				
				//SI ES MANUAL
				if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoCierreProvision();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoCierreProvision--;			
			//ProcesoCierreProvision procesocierreprovisionAux= new ProcesoCierreProvision();			
			//procesocierreprovisionAux.setId(this.iIdNuevoProcesoCierreProvision);
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoCierreProvision();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
			
			this.procesocierreprovision.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesocierreprovisionLogic.getProcesoCierreProvisions().add(this.procesocierreprovisionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesocierreprovisions.add(this.procesocierreprovisionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
			
			this.jTableDatosProcesoCierreProvision.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreProvision(), this.getIndiceNuevoProcesoCierreProvision());
			
			int iLastRow =  this.jTableDatosProcesoCierreProvision.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoCierreProvision.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoCierreProvision.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoCierreProvision(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreProvision(false);
			
			//SI ES MANUAL
			if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreProvision();
			}
			
			//this.abrirFrameTreeProcesoCierreProvision();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoCierreProvision.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoCierreProvision.setFileImportacion(this.jInternalFrameImportacionProcesoCierreProvision.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoCierreProvision.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoCierreProvision.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoCierreProvision.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoCierreProvision.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();		

		procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoCierreProvisionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoCierreProvisionBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoCierreProvisions("Todos",procesocierreprovisionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Provision",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DefiProvisionEmpleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DefiProvisionEmpleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DefiProvisionEmpleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DefiProvisionEmpleado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					sNombreCampoCategoria="id_defi_provision_empleado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					sNombreCampoCategoriaValor="id_defi_provision_empleado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Defi Provision Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_defi_provision_empleado");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();		
		
		procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreprovision";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoCierreProvisions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(ProcesoCierreProvision procesocierreprovision:procesocierreprovisionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierreprovision.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(ProcesoCierreProvision procesocierreprovision:procesocierreprovisionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierreprovision.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(ProcesoCierreProvision procesocierreprovision:procesocierreprovisionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierreprovision.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
					iRow++;

					for(ProcesoCierreProvision procesocierreprovision:procesocierreprovisionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierreprovision.getdefiprovisionempleado_descripcion());
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
			//	this.getFilaCabeceraExportarExcelProcesoCierreProvision(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoCierreProvision(procesocierreprovisionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Provision",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoCierreProvision(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreProvision(false);
			
			//SI ES MANUAL
			if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreProvision();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreProvision(false);
			
			//SI ES MANUAL
			if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCierreProvision();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreProvision(false);
			
			//SI ES MANUAL
			if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCierreProvision();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoCierreProvision() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoCierreProvision.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoCierreProvision.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoCierreProvision.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoCierreProvision.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoCierreProvision.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoCierreProvision.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoCierreProvision.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoCierreProvision(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoCierreProvision(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoCierreProvision(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoCierreProvision(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoCierreProvision(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoCierreProvision(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreProvision(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoCierreProvision(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoCierreProvision() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoCierreProvision();
		
		this.inicializarActualizarBindingBotonesManualProcesoCierreProvision(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCierreProvision();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreProvision() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreProvision(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreProvision(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoCierreProvision.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoCierreProvision.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoCierreProvision.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoCierreProvision.jCheckBoxPostAccionNuevoProcesoCierreProvision.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoCierreProvision.jCheckBoxPostAccionSinCerrarProcesoCierreProvision.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoCierreProvision.jCheckBoxPostAccionSinMensajeProcesoCierreProvision.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoCierreProvision.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoCierreProvision.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoCierreProvision.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
				this.jInternalFrameDetalleFormProcesoCierreProvision.jCheckBoxPostAccionNuevoProcesoCierreProvision.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoCierreProvision.jCheckBoxPostAccionSinCerrarProcesoCierreProvision.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoCierreProvision.jCheckBoxPostAccionSinMensajeProcesoCierreProvision.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoCierreProvision.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoCierreProvision.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoCierreProvision.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoCierreProvision!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoCierreProvision.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoCierreProvision.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoCierreProvision.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoCierreProvision.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoCierreProvision!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoCierreProvision.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoCierreProvision.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoCierreProvision(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreProvision(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreProvision() throws Exception {
		try	{
			if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCierreProvision();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCierreProvision() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCierreProvision() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoCierreProvision.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoCierreProvision.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoCierreProvision.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoCierreProvision.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoCierreProvision.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoCierreProvision.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoCierreProvision.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoCierreProvision.addItem(reporte);
			}
			
			
			if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoCierreProvision.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoCierreProvision.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoCierreProvision.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoCierreProvision.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoCierreProvision.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoCierreProvision.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoCierreProvision.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoCierreProvision.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoCierreProvision.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreProvision();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreProvision() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCierreProvision!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCierreProvision!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreProvision!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoCierreProvision()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.getSelectedItem()!=null){this.id_anioBusquedaProcesoCierreProvision=((Anio)this.jComboBoxid_anioBusquedaProcesoCierreProvisionProcesoCierreProvision.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.getSelectedItem()!=null){this.id_estructuraBusquedaProcesoCierreProvision=((Estructura)this.jComboBoxid_estructuraBusquedaProcesoCierreProvisionProcesoCierreProvision.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.getSelectedItem()!=null){this.id_empleadoBusquedaProcesoCierreProvision=((Empleado)this.jComboBoxid_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.getSelectedItem()).getId();}
		if(this.jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.getSelectedItem()!=null){this.id_defi_provision_empleadoBusquedaProcesoCierreProvision=((DefiProvisionEmpleado)this.jComboBoxid_defi_provision_empleadoBusquedaProcesoCierreProvisionProcesoCierreProvision.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoCierreProvision(Boolean esInicializar) throws Exception {				
		if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCierreProvision();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoCierreProvision() throws Exception {
		this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoCierreProvision() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoCierreProvisionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoCierreProvisionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoCierreProvisionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvisionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoCierreProvisionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoCierreProvisionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoCierreProvision(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesocierreprovisionLogic.getProcesoCierreProvisions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesocierreprovisions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoCierreProvision.setModel(new ProcesoCierreProvisionModel(this.procesocierreprovisionLogic.getProcesoCierreProvisions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoCierreProvision.setModel(new ProcesoCierreProvisionModel(this.procesocierreprovisions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoCierreProvision!=null && this.jInternalFrameOrderByProcesoCierreProvision.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoCierreProvision();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoCierreProvisionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO,procesocierreprovisionConstantesFunciones.resaltarSeleccionarProcesoCierreProvision,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoCierreProvisionConstantesFunciones.SCLASSWEBTITULO,procesocierreprovisionConstantesFunciones.resaltarSeleccionarProcesoCierreProvision,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,ProcesoCierreProvisionConstantesFunciones.LABEL_ID));

		if(this.procesocierreprovisionConstantesFunciones.mostraridProcesoCierreProvision && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreProvisionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocierreprovisionConstantesFunciones.resaltaridProcesoCierreProvision,this.procesocierreprovisionConstantesFunciones.activaridProcesoCierreProvision,this,true,"idProcesoCierreProvision","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocierreprovisionConstantesFunciones.resaltaridProcesoCierreProvision,this.procesocierreprovisionConstantesFunciones.activaridProcesoCierreProvision,this,true,"idProcesoCierreProvision","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO));

		if(this.procesocierreprovisionConstantesFunciones.mostrarid_anioProcesoCierreProvision && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.procesocierreprovisionConstantesFunciones.resaltarid_anioProcesoCierreProvision,this,this.procesocierreprovisionConstantesFunciones.activarid_anioProcesoCierreProvision));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.procesocierreprovisionConstantesFunciones.resaltarid_anioProcesoCierreProvision,this,this.procesocierreprovisionConstantesFunciones.activarid_anioProcesoCierreProvision,true,"id_anioProcesoCierreProvision","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCierreProvisionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.procesocierreprovisionConstantesFunciones.mostrarid_estructuraProcesoCierreProvision && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.procesocierreprovisionConstantesFunciones.resaltarid_estructuraProcesoCierreProvision,this,this.procesocierreprovisionConstantesFunciones.activarid_estructuraProcesoCierreProvision));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.procesocierreprovisionConstantesFunciones.resaltarid_estructuraProcesoCierreProvision,this,this.procesocierreprovisionConstantesFunciones.activarid_estructuraProcesoCierreProvision,true,"id_estructuraProcesoCierreProvision","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCierreProvisionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.procesocierreprovisionConstantesFunciones.mostrarid_empleadoProcesoCierreProvision && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.procesocierreprovisionConstantesFunciones.resaltarid_empleadoProcesoCierreProvision,this,this.procesocierreprovisionConstantesFunciones.activarid_empleadoProcesoCierreProvision));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.procesocierreprovisionConstantesFunciones.resaltarid_empleadoProcesoCierreProvision,this,this.procesocierreprovisionConstantesFunciones.activarid_empleadoProcesoCierreProvision,true,"id_empleadoProcesoCierreProvision","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCierreProvisionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO));

		if(this.procesocierreprovisionConstantesFunciones.mostrarid_defi_provision_empleadoProcesoCierreProvision && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DefiProvisionEmpleadoTableCell(this.defiprovisionempleadosForeignKey,this.procesocierreprovisionConstantesFunciones.resaltarid_defi_provision_empleadoProcesoCierreProvision,this,this.procesocierreprovisionConstantesFunciones.activarid_defi_provision_empleadoProcesoCierreProvision));
			tableColumn.setCellEditor(new DefiProvisionEmpleadoTableCell(this.defiprovisionempleadosForeignKey,this.procesocierreprovisionConstantesFunciones.resaltarid_defi_provision_empleadoProcesoCierreProvision,this,this.procesocierreprovisionConstantesFunciones.activarid_defi_provision_empleadoProcesoCierreProvision,true,"id_defi_provision_empleadoProcesoCierreProvision","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCierreProvisionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCierreProvision.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCierreProvision.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoCierreProvision.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoCierreProvision.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoCierreProvision.moveColumn(this.jTableDatosProcesoCierreProvision.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoCierreProvision.moveColumn(this.jTableDatosProcesoCierreProvision.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoCierreProvision.moveColumn(this.jTableDatosProcesoCierreProvision.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoCierreProvision.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoCierreProvision.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoCierreProvision,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoCierreProvision.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoCierreProvision.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoCierreProvision.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoCierreProvision.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesocierreprovisionLogic.getProcesoCierreProvisions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesocierreprovisions.size()-1;
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
		//this.jTableDatosProcesoCierreProvision.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoCierreProvision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoCierreProvision();
			
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
				
				//this.isEsNuevoProcesoCierreProvision=false;
					
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
				if(this.procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCierreProvision.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCierreProvision.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesocierreprovision.getsType().equals("DUPLICADO")
				   || this.procesocierreprovision.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoCierreProvision=true;
				
				} else {
					this.isEsNuevoProcesoCierreProvision=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
					if(this.procesocierreprovision.getId()>=0 && !this.procesocierreprovision.getIsNew()) {						
						this.isEsNuevoProcesoCierreProvision=false;
						
					} else {
						this.isEsNuevoProcesoCierreProvision=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoCierreProvision(esRelaciones);						
				
				this.seleccionarProcesoCierreProvision(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesocierreprovision.getId()<0) {
					this.isEsNuevoProcesoCierreProvision=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoCierreProvision(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoCierreProvision(evt,rowIndex);
				}	
				
				if(this.procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoCierreProvision: " + this.dDif); 
					}
				}								
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoCierreProvision(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesocierreprovision)) {
					if(this.procesocierreprovision.getId()>0) {
						this.procesocierreprovision.setIsDeleted(true);
						
						this.procesocierreprovisionsEliminados.add(this.procesocierreprovision);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocierreprovisionLogic.getProcesoCierreProvisions().remove(this.procesocierreprovision);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocierreprovisions.remove(this.procesocierreprovision);				
					}
					
					
					((ProcesoCierreProvisionModel) this.jTableDatosProcesoCierreProvision.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreProvision(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoCierreProvision(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoCierreProvision) {
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCierreProvision.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCierreProvision.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoCierreProvision(this.procesocierreprovision);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.procesocierreprovisionConstantesFunciones.cargarid_anioProcesoCierreProvision || this.procesocierreprovisionConstantesFunciones.event_dependid_anioProcesoCierreProvision) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.procesocierreprovision.getid_anio());
									//this.inicializarActualizarBindingProcesoCierreProvision(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(procesocierreprovision.getAnio()!=null) {
							this.aniosForeignKey.add(procesocierreprovision.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.procesocierreprovision.getid_anio(),false,"Formulario");

					//Estructura
					if(!this.procesocierreprovisionConstantesFunciones.cargarid_estructuraProcesoCierreProvision || this.procesocierreprovisionConstantesFunciones.event_dependid_estructuraProcesoCierreProvision) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.procesocierreprovision.getid_estructura());
									//this.inicializarActualizarBindingProcesoCierreProvision(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(procesocierreprovision.getEstructura()!=null) {
							this.estructurasForeignKey.add(procesocierreprovision.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.procesocierreprovision.getid_estructura(),false,"Formulario");

					//Empleado
					if(!this.procesocierreprovisionConstantesFunciones.cargarid_empleadoProcesoCierreProvision || this.procesocierreprovisionConstantesFunciones.event_dependid_empleadoProcesoCierreProvision) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.procesocierreprovision.getid_empleado());
									//this.inicializarActualizarBindingProcesoCierreProvision(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(procesocierreprovision.getEmpleado()!=null) {
							this.empleadosForeignKey.add(procesocierreprovision.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.procesocierreprovision.getid_empleado(),false,"Formulario");

					//DefiProvisionEmpleado
					if(!this.procesocierreprovisionConstantesFunciones.cargarid_defi_provision_empleadoProcesoCierreProvision || this.procesocierreprovisionConstantesFunciones.event_dependid_defi_provision_empleadoProcesoCierreProvision) {
						//this.cargarCombosDefiProvisionEmpleadosForeignKeyLista(" where id="+this.procesocierreprovision.getid_defi_provision_empleado());
									//this.inicializarActualizarBindingProcesoCierreProvision(false,false);
						this.defiprovisionempleadosForeignKey=new ArrayList<DefiProvisionEmpleado>();

						if(procesocierreprovision.getDefiProvisionEmpleado()!=null) {
							this.defiprovisionempleadosForeignKey.add(procesocierreprovision.getDefiProvisionEmpleado());
						}

						this.addItemDefectoCombosForeignKeyDefiProvisionEmpleado();
						this.cargarCombosFrameDefiProvisionEmpleadosForeignKey("Todos");
					}
					this.setActualDefiProvisionEmpleadoForeignKey(this.procesocierreprovision.getid_defi_provision_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoCierreProvision("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoCierreProvision(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreProvision() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoCierreProvision(procesocierreprovision,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoCierreProvision(procesocierreprovision);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoCierreProvision(procesocierreprovision,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreProvision(procesocierreprovision);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelidProcesoCierreProvision.setText(procesocierreprovision.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoCierreProvision procesocierreprovisionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesocierreprovisionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoCierreProvision procesocierreprovisionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesocierreprovisionLocal=this.procesocierreprovision;
			} else {
				procesocierreprovisionLocal=this.procesocierreprovisionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesocierreprovisionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoCierreProvision(procesocierreprovisionLocal,true);
					
					if(procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesocierreprovisionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesocierreprovisionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCierreProvision(procesocierreprovision,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(procesocierreprovision);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCierreProvision(procesocierreprovision,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelidProcesoCierreProvision.getText()==null || this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelidProcesoCierreProvision.getText()=="" || this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelidProcesoCierreProvision.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelidProcesoCierreProvision.setText("0");
			}

			if(conColumnasBase) {procesocierreprovision.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelidProcesoCierreProvision.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCierreProvisionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelIdProcesoCierreProvision,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCierreProvision(ProcesoCierreProvision procesocierreprovisionBean,ProcesoCierreProvision procesocierreprovision,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoCierreProvision(ProcesoCierreProvision procesocierreprovisionOrigen,ProcesoCierreProvision procesocierreprovision,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocierreprovisionOrigen.getId()!=null && !procesocierreprovisionOrigen.getId().equals(0L))) {procesocierreprovision.setId(procesocierreprovisionOrigen.getId());}}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelidProcesoCierreProvision.setText(procesocierreprovision.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCierreProvision(ProcesoCierreProvisionBean procesocierreprovisionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelidProcesoCierreProvision.setText(procesocierreprovisionBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoCierreProvision(ProcesoCierreProvisionParameterReturnGeneral procesocierreprovisionReturnGeneral,ProcesoCierreProvisionBean procesocierreprovisionBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoCierreProvision procesocierreprovisionLocal=new ProcesoCierreProvision();
			
			procesocierreprovisionLocal=procesocierreprovisionReturnGeneral.getProcesoCierreProvision();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocierreprovisionLocal.getId()!=null && !procesocierreprovisionLocal.getId().equals(0L))) {procesocierreprovisionBean.setId(procesocierreprovisionLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoCierreProvisionGenerico(Long idProcesoCierreProvisionSeleccionado,JComboBox jComboBoxProcesoCierreProvision,List<ProcesoCierreProvision> procesocierreprovisionsLocal)throws Exception {
		try {
			ProcesoCierreProvision  procesocierreprovisionTemp=null;

			for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisionsLocal) {
				if(procesocierreprovisionAux.getId()!=null && procesocierreprovisionAux.getId().equals(idProcesoCierreProvisionSeleccionado)) {
					procesocierreprovisionTemp=procesocierreprovisionAux;
					break;
				}
			}

			jComboBoxProcesoCierreProvision.setSelectedItem(procesocierreprovisionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoCierreProvisionGenerico(JComboBox jComboBoxProcesoCierreProvision,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCierreProvision.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoCierreProvision.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCierreProvision.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoCierreProvision.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoCierreProvision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoCierreProvision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierreprovision=(ProcesoCierreProvision) procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocierreprovision =(ProcesoCierreProvision) procesocierreprovisions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!procesocierreprovision.getIsNew() && !procesocierreprovision.getIsChanged() && !procesocierreprovision.getIsDeleted()) {
				sDescripcion=procesocierreprovision.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=procesocierreprovision.getanio_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!procesocierreprovision.getIsNew() && !procesocierreprovision.getIsChanged() && !procesocierreprovision.getIsDeleted()) {
				sDescripcion=procesocierreprovision.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=procesocierreprovision.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!procesocierreprovision.getIsNew() && !procesocierreprovision.getIsChanged() && !procesocierreprovision.getIsDeleted()) {
				sDescripcion=procesocierreprovision.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=procesocierreprovision.getempleado_descripcion();
			}
		}

		if(sTipo.equals("DefiProvisionEmpleado")) {
			//sDescripcion=this.getActualDefiProvisionEmpleadoForeignKeyDescripcion((Long)value);
			if(!procesocierreprovision.getIsNew() && !procesocierreprovision.getIsChanged() && !procesocierreprovision.getIsDeleted()) {
				sDescripcion=procesocierreprovision.getdefiprovisionempleado_descripcion();
			} else {
				//sDescripcion=this.getActualDefiProvisionEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=procesocierreprovision.getdefiprovisionempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoCierreProvision procesocierreprovisionRow=new ProcesoCierreProvision();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierreprovisionRow=(ProcesoCierreProvision) procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocierreprovisionRow=(ProcesoCierreProvision) procesocierreprovisions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoCierreProvision(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoCierreProvision.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreProvision && this.isPermisoNuevoProcesoCierreProvision));			
			this.jButtonDuplicarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreProvision && this.isPermisoDuplicarProcesoCierreProvision));			
			this.jButtonCopiarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreProvision && this.isPermisoCopiarProcesoCierreProvision));
			this.jButtonVerFormProcesoCierreProvision.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreProvision && this.isPermisoVerFormProcesoCierreProvision));
			
			this.jButtonAbrirOrderByProcesoCierreProvision.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreProvision && this.isPermisoOrdenProcesoCierreProvision));			
			
			this.jButtonNuevoRelacionesProcesoCierreProvision.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision && this.isPermisoNuevoProcesoCierreProvision));			
			this.jButtonNuevoGuardarCambiosProcesoCierreProvision.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreProvision && this.isPermisoNuevoProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision));
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonModificarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaModificarProcesoCierreProvision && this.isPermisoActualizarProcesoCierreProvision));	
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonActualizarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreProvision && this.isPermisoActualizarProcesoCierreProvision));	
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonEliminarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreProvision && this.isPermisoEliminarProcesoCierreProvision));
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonCancelarProcesoCierreProvision.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreProvision);							
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosProcesoCierreProvision.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoCierreProvision.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreProvision && this.isPermisoNuevoProcesoCierreProvision));						
			this.jButtonDuplicarToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreProvision && this.isPermisoDuplicarProcesoCierreProvision));						
			this.jButtonCopiarToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreProvision && this.isPermisoCopiarProcesoCierreProvision));			
			this.jButtonVerFormToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreProvision && this.isPermisoVerFormProcesoCierreProvision));			
			this.jButtonAbrirOrderByToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreProvision && this.isPermisoOrdenProcesoCierreProvision));
			this.jButtonNuevoRelacionesToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision && this.isPermisoNuevoProcesoCierreProvision));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreProvision && this.isPermisoNuevoProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision));			
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonModificarToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaModificarProcesoCierreProvision && this.isPermisoActualizarProcesoCierreProvision));	
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonActualizarToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreProvision  && this.isPermisoActualizarProcesoCierreProvision));	
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonEliminarToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreProvision && this.isPermisoEliminarProcesoCierreProvision));
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonCancelarToolBarProcesoCierreProvision.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreProvision);				
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoCierreProvision.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreProvision && this.isPermisoNuevoProcesoCierreProvision));			
			this.jMenuItemDuplicarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreProvision && this.isPermisoDuplicarProcesoCierreProvision));			
			this.jMenuItemCopiarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreProvision && this.isPermisoCopiarProcesoCierreProvision));			
			this.jMenuItemVerFormProcesoCierreProvision.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreProvision && this.isPermisoVerFormProcesoCierreProvision));			
			this.jMenuItemAbrirOrderByProcesoCierreProvision.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreProvision && this.isPermisoOrdenProcesoCierreProvision));			
			//this.jMenuItemMostrarOcultarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreProvision && this.isPermisoOrdenProcesoCierreProvision));
			this.jMenuItemDetalleAbrirOrderByProcesoCierreProvision.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreProvision && this.isPermisoOrdenProcesoCierreProvision));			
			//this.jMenuItemDetalleMostrarOcultarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreProvision && this.isPermisoOrdenProcesoCierreProvision));			
			this.jMenuItemNuevoRelacionesProcesoCierreProvision.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision && this.isPermisoNuevoProcesoCierreProvision));			
			this.jMenuItemNuevoGuardarCambiosProcesoCierreProvision.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreProvision && this.isPermisoNuevoProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision));									
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemModificarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaModificarProcesoCierreProvision && this.isPermisoActualizarProcesoCierreProvision));	
			this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemActualizarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreProvision && this.isPermisoActualizarProcesoCierreProvision));	
			this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemEliminarProcesoCierreProvision.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreProvision && this.isPermisoEliminarProcesoCierreProvision));
			this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemCancelarProcesoCierreProvision.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreProvision);				
			}
			
			this.jMenuItemGuardarCambiosProcesoCierreProvision.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision));						
			this.jMenuItemGuardarCambiosTablaProcesoCierreProvision.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=this.jButtonNuevoProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoCierreProvision=this.jButtonDuplicarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaCopiarProcesoCierreProvision=this.jButtonCopiarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaVerFormProcesoCierreProvision=this.jButtonVerFormProcesoCierreProvision.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoCierreProvision=this.jButtonAbrirOrderByProcesoCierreProvision.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=this.jButtonNuevoRelacionesProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaModificarProcesoCierreProvision=this.jButtonModificarProcesoCierreProvision.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonActualizarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonEliminarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonCancelarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaGuardarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosProcesoCierreProvision.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=this.jButtonGuardarCambiosTablaProcesoCierreProvision.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=this.jButtonNuevoToolBarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=this.jButtonNuevoRelacionesToolBarProcesoCierreProvision.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			this.isVisibilidadCeldaModificarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonModificarToolBarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonActualizarToolBarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonEliminarToolBarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonCancelarToolBarProcesoCierreProvision.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCierreProvision=this.jButtonGuardarCambiosToolBarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=this.jButtonGuardarCambiosTablaToolBarProcesoCierreProvision.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=this.jMenuItemNuevoProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=this.jMenuItemNuevoRelacionesProcesoCierreProvision.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			this.isVisibilidadCeldaModificarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemModificarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemActualizarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemEliminarProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreProvision=this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemCancelarProcesoCierreProvision.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCierreProvision=this.jMenuItemGuardarCambiosProcesoCierreProvision.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=this.jMenuItemGuardarCambiosTablaProcesoCierreProvision.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoCierreProvision(Boolean esInicializar) {
		if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
				//if(this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCierreProvision();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoCierreProvision(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoCierreProvision() {
		this.jButtonNuevoProcesoCierreProvision.setVisible(this.isPermisoNuevoProcesoCierreProvision);			
		this.jButtonDuplicarProcesoCierreProvision.setVisible(this.isPermisoDuplicarProcesoCierreProvision);			
		this.jButtonCopiarProcesoCierreProvision.setVisible(this.isPermisoCopiarProcesoCierreProvision);			
		this.jButtonVerFormProcesoCierreProvision.setVisible(this.isPermisoVerFormProcesoCierreProvision);			
		
		this.jButtonAbrirOrderByProcesoCierreProvision.setVisible(this.isPermisoOrdenProcesoCierreProvision);					
		
		this.jButtonNuevoRelacionesProcesoCierreProvision.setVisible(this.isPermisoNuevoProcesoCierreProvision);			
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonModificarProcesoCierreProvision.setVisible(this.isPermisoActualizarProcesoCierreProvision);	
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonActualizarProcesoCierreProvision.setVisible(this.isPermisoActualizarProcesoCierreProvision);	
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonEliminarProcesoCierreProvision.setVisible(this.isPermisoEliminarProcesoCierreProvision);
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonCancelarProcesoCierreProvision.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreProvision);						
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosProcesoCierreProvision.setVisible(this.isPermisoGuardarCambiosProcesoCierreProvision);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoCierreProvision.setVisible(this.isPermisoActualizarProcesoCierreProvision);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCierreProvision() {
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonModificarProcesoCierreProvision.setVisible(this.isPermisoActualizarProcesoCierreProvision);	
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonActualizarProcesoCierreProvision.setVisible(this.isPermisoActualizarProcesoCierreProvision);	
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonEliminarProcesoCierreProvision.setVisible(this.isPermisoEliminarProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonCancelarProcesoCierreProvision.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreProvision);							
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosProcesoCierreProvision.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreProvision && this.isPermisoGuardarCambiosProcesoCierreProvision));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoCierreProvision() {
		if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoCierreProvision();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoCierreProvision() {
	}
	
	public void jTableDatosProcesoCierreProvisionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoCierreProvision(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoCierreProvisionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.getprocesocierreprovision(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreprovision==null) {
						this.procesocierreprovision = new ProcesoCierreProvision();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.procesocierreprovision,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
				}

				if(this.procesocierreprovision.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesocierreprovision.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreProvision(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioProcesoCierreProvisionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebProcesoCierreProvision(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierreProvision.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierreProvision.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.getprocesocierreprovision(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.procesocierreprovisionLogic.getConnexion());

				if(this.procesocierreprovision.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.procesocierreprovision.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierreProvision=(TitledBorder)this.jScrollPanelDatosProcesoCierreProvision.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderProcesoCierreProvision.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioProcesoCierreProvisionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.getprocesocierreprovision(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreprovision==null) {
						this.procesocierreprovision = new ProcesoCierreProvision();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.procesocierreprovision,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
				}

				if(this.procesocierreprovision.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.procesocierreprovision.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreProvision(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraProcesoCierreProvisionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebProcesoCierreProvision(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierreProvision.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierreProvision.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.getprocesocierreprovision(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.procesocierreprovisionLogic.getConnexion());

				if(this.procesocierreprovision.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.procesocierreprovision.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierreProvision=(TitledBorder)this.jScrollPanelDatosProcesoCierreProvision.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderProcesoCierreProvision.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraProcesoCierreProvisionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.getprocesocierreprovision(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreprovision==null) {
						this.procesocierreprovision = new ProcesoCierreProvision();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.procesocierreprovision,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
				}

				if(this.procesocierreprovision.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.procesocierreprovision.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreProvision(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoProcesoCierreProvisionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebProcesoCierreProvision(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierreProvision.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierreProvision.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.getprocesocierreprovision(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.procesocierreprovisionLogic.getConnexion());

				if(this.procesocierreprovision.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.procesocierreprovision.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierreProvision=(TitledBorder)this.jScrollPanelDatosProcesoCierreProvision.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderProcesoCierreProvision.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoProcesoCierreProvisionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.getprocesocierreprovision(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreprovision==null) {
						this.procesocierreprovision = new ProcesoCierreProvision();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.procesocierreprovision,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
				}

				if(this.procesocierreprovision.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.procesocierreprovision.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreProvision(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodefiprovisionempleado=true;

			idTienePermisodefiprovisionempleado=this.tienePermisosUsuarioEnPaginaWebProcesoCierreProvision(DefiProvisionEmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisodefiprovisionempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierreProvision.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierreProvision.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.getprocesocierreprovision(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);

				this.defiprovisionempleadoBeanSwingJInternalFrame=new DefiProvisionEmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.defiprovisionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.defiprovisionempleadoBeanSwingJInternalFrame.getDefiProvisionEmpleadoLogic().setConnexion(this.procesocierreprovisionLogic.getConnexion());

				if(this.procesocierreprovision.getid_defi_provision_empleado()!=null) {
					this.defiprovisionempleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.defiprovisionempleadoBeanSwingJInternalFrame.setIdActual(this.procesocierreprovision.getid_defi_provision_empleado());
					this.defiprovisionempleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.defiprovisionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.defiprovisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefiProvisionEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.defiprovisionempleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierreProvision=(TitledBorder)this.jScrollPanelDatosProcesoCierreProvision.getBorder();
				TitledBorder titledBorderdefiprovisionempleado=(TitledBorder)this.defiprovisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosDefiProvisionEmpleado.getBorder();

				titledBorderdefiprovisionempleado.setTitle(titledBorderProcesoCierreProvision.getTitle() + " -> Defi Provision Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_defi_provision_empleadoProcesoCierreProvisionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.getprocesocierreprovision(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreprovision==null) {
						this.procesocierreprovision = new ProcesoCierreProvision();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.procesocierreprovision,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);
				}

				if(this.procesocierreprovision.getid_defi_provision_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_defi_provision_empleado = "+this.procesocierreprovision.getid_defi_provision_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreProvision(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoCierreProvisionProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreProvision(false,false);

			this.getProcesoCierreProvisionsBusquedaProcesoCierreProvision();

			this.inicializarActualizarBindingProcesoCierreProvision(false);

			//if(ProcesoCierreProvisionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreProvision(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreProvision(false,false);

			this.getProcesoCierreProvisionsFK_IdAnio();

			this.inicializarActualizarBindingProcesoCierreProvision(false);

			//if(ProcesoCierreProvisionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreProvision(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDefiProvisionEmpleadoProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreProvision(false,false);

			this.getProcesoCierreProvisionsFK_IdDefiProvisionEmpleado();

			this.inicializarActualizarBindingProcesoCierreProvision(false);

			//if(ProcesoCierreProvisionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreProvision(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreProvision(false,false);

			this.getProcesoCierreProvisionsFK_IdEmpleado();

			this.inicializarActualizarBindingProcesoCierreProvision(false);

			//if(ProcesoCierreProvisionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreProvision(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraProcesoCierreProvisionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreProvision(false,false);

			this.getProcesoCierreProvisionsFK_IdEstructura();

			this.inicializarActualizarBindingProcesoCierreProvision(false);

			//if(ProcesoCierreProvisionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreProvision(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreprovisionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoCierreProvision() {
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoCierreProvision.dispose();
			this.jInternalFrameDetalleFormProcesoCierreProvision=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoCierreProvision!=null) {
			this.jInternalFrameReporteDinamicoProcesoCierreProvision.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoCierreProvision.dispose();
			this.jInternalFrameReporteDinamicoProcesoCierreProvision=null;
		}
		
		if(this.jInternalFrameImportacionProcesoCierreProvision!=null) {
			this.jInternalFrameImportacionProcesoCierreProvision.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoCierreProvision.dispose();
			this.jInternalFrameImportacionProcesoCierreProvision=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoCierreProvision();
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoCierreProvision")) {
				jButtonNuevoProcesoCierreProvisionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoCierreProvision")) {
				jButtonDuplicarProcesoCierreProvisionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoCierreProvision")) {
				jButtonCopiarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoCierreProvision")) {
				jButtonVerFormProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoCierreProvision")) {
				jButtonNuevoProcesoCierreProvisionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoCierreProvision")) {
				jButtonDuplicarProcesoCierreProvisionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoCierreProvision")) {
				jButtonNuevoProcesoCierreProvisionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoCierreProvision")) {
				jButtonDuplicarProcesoCierreProvisionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoCierreProvision")) {
				jButtonNuevoProcesoCierreProvisionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoCierreProvision")) {
				jButtonNuevoProcesoCierreProvisionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoCierreProvision")) {
				jButtonNuevoProcesoCierreProvisionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoCierreProvision")) {
				jButtonModificarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoCierreProvision")) {
				jButtonModificarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoCierreProvision")) {
				jButtonModificarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoCierreProvision")) {
				jButtonActualizarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoCierreProvision")) {
				jButtonActualizarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoCierreProvision")) {
				jButtonActualizarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoCierreProvision")) {
				jButtonEliminarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoCierreProvision")) {
				jButtonEliminarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoCierreProvision")) {
				jButtonEliminarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoCierreProvision")) {
				jButtonCancelarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoCierreProvision")) {
				jButtonCancelarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoCierreProvision")) {
				jButtonCancelarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoCierreProvision")) {
				jButtonCerrarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoCierreProvision")) {
				jButtonCerrarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoCierreProvision")) {
				jButtonCerrarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoCierreProvision")) {
				jButtonMostrarOcultarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoCierreProvision")) {
				jButtonCancelarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoCierreProvision")) {
				jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoCierreProvision")) {
				jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoCierreProvision")) {
				jButtonCopiarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoCierreProvision")) {
				jButtonVerFormProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoCierreProvision")) {
				jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoCierreProvision")) {
				jButtonCopiarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoCierreProvision")) {
				jButtonVerFormProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCierreProvision")) {
				jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoCierreProvision")) {
				jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoCierreProvision")) {
				jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoCierreProvision")) {
				jButtonRecargarInformacionProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoCierreProvision")) {
				jButtonRecargarInformacionProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoCierreProvision")) {
				jButtonRecargarInformacionProcesoCierreProvisionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoCierreProvision")) {
				jButtonAnterioresProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoCierreProvision")) {
				jButtonAnterioresProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoCierreProvision")) {
				jButtonAnterioresProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoCierreProvision")) {
				jButtonSiguientesProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoCierreProvision")) {
				jButtonSiguientesProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoCierreProvision")) {
				jButtonSiguientesProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoCierreProvision") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoCierreProvision")) {
				jButtonAbrirOrderByProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoCierreProvision") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoCierreProvision")) {
				jButtonMostrarOcultarProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCierreProvision")) {
				jButtonNuevoGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoCierreProvision")) {
				jButtonNuevoGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoCierreProvision")) {
				jButtonNuevoGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoCierreProvision")) {
				jButtonProcesarInformacionProcesoCierreProvisionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoCierreProvision")) {
				jButtonCerrarReporteDinamicoProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoCierreProvision")) {
				jButtonGenerarReporteDinamicoProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoCierreProvision")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoCierreProvision")) {
				jButtonCerrarImportacionProcesoCierreProvisionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoCierreProvision")) {
				
				jButtonGenerarImportacionProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoCierreProvision")) {
				
				jButtonAbrirImportacionProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoCierreProvision")) {
				jComboBoxTiposAccionesProcesoCierreProvisionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoCierreProvision")) {
				jComboBoxTiposRelacionesProcesoCierreProvisionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoCierreProvision")) {
				jComboBoxTiposAccionesProcesoCierreProvisionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoCierreProvision")) {
				
				jComboBoxTiposSeleccionarProcesoCierreProvisionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoCierreProvision")) {
				jTextFieldValorCampoGeneralProcesoCierreProvisionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoCierreProvision")) {
				jButtonAbrirOrderByProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoCierreProvision")) {
				jButtonAbrirOrderByProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoCierreProvision")) {
				jButtonCerrarOrderByProcesoCierreProvisionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCierreProvisionBusqueda")) {
				this.jButtonidProcesoCierreProvisionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoCierreProvisionUpdate")) {
				this.jButtonid_anioProcesoCierreProvisionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoCierreProvisionBusqueda")) {
				this.jButtonid_anioProcesoCierreProvisionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraProcesoCierreProvisionUpdate")) {
				this.jButtonid_estructuraProcesoCierreProvisionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraProcesoCierreProvisionBusqueda")) {
				this.jButtonid_estructuraProcesoCierreProvisionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoProcesoCierreProvisionUpdate")) {
				this.jButtonid_empleadoProcesoCierreProvisionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoProcesoCierreProvisionBusqueda")) {
				this.jButtonid_empleadoProcesoCierreProvisionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoProcesoCierreProvisionUpdate")) {
				this.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoProcesoCierreProvisionBusqueda")) {
				this.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoCierreProvisionProcesoCierreProvision")) {
				this.jButtonBusquedaProcesoCierreProvisionProcesoCierreProvisionActionPerformed(evt);
			}
			
			;
			
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoCierreProvision();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreProvisionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				


				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreProvision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreProvision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoCierreProvision procesocierreprovisionLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesocierreprovisionLocal=this.procesocierreprovision;
			} else {
				procesocierreprovisionLocal=this.procesocierreprovisionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
							
				
				


				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreProvision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreProvision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreProvisionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
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
			
			


			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreProvisionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
								
						
				


				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreProvision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreProvision.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
								
				
				


				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreProvision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreProvision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreProvisionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreProvisionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreProvisionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
							
				
				


				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreProvision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreProvision.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreProvisionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
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
			
			


			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreProvisionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
								
				
				


				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreProvision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreProvision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreProvisionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreProvisionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreProvisionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoCierreProvision")) {
					jCheckBoxSeleccionarTodosProcesoCierreProvisionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoCierreProvision")) {
					jCheckBoxSeleccionadosProcesoCierreProvisionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoCierreProvision")) {
					
				}
				
				


				
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreProvision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreProvision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
												
				
				


				
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreProvision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreProvision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreProvisionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreProvisionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
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
			
			


			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreProvisionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreProvision.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreProvision.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreprovision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreprovision);
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
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
				
				


				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreProvision.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreProvision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreProvisionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreprovisionAnterior =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoCierreProvision")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoCierreProvisionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoCierreProvision.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesocierreprovision =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesocierreprovision);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoCierreProvision")) {
				
				}
				
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoCierreProvision")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoCierreProvision.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoCierreProvision")) {
			
			}
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoCierreProvision();
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoCierreProvision")) {
				jButtonNuevoProcesoCierreProvisionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoCierreProvision")) {
				jButtonDuplicarProcesoCierreProvisionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoCierreProvision")) {
				jButtonCopiarProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoCierreProvision")) {
				jButtonVerFormProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoCierreProvision")) {
				jButtonNuevoProcesoCierreProvisionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoCierreProvision")) {
				jButtonModificarProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoCierreProvision")) {
				jButtonActualizarProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoCierreProvision")) {
				jButtonEliminarProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCierreProvision")) {
				jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoCierreProvision")) {
				jButtonCancelarProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoCierreProvision")) {
				jButtonCerrarProcesoCierreProvisionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoCierreProvision")) {
				jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCierreProvision")) {
				jButtonNuevoGuardarCambiosProcesoCierreProvisionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoCierreProvision")) {
				jButtonAbrirOrderByProcesoCierreProvisionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoCierreProvision")) {
				jButtonRecargarInformacionProcesoCierreProvisionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoCierreProvision")) {
				jButtonAnterioresProcesoCierreProvisionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoCierreProvision")) {
				jButtonSiguientesProcesoCierreProvisionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCierreProvisionBusqueda")) {
				this.jButtonidProcesoCierreProvisionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoCierreProvisionUpdate")) {
				this.jButtonid_anioProcesoCierreProvisionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoCierreProvisionBusqueda")) {
				this.jButtonid_anioProcesoCierreProvisionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraProcesoCierreProvisionUpdate")) {
				this.jButtonid_estructuraProcesoCierreProvisionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraProcesoCierreProvisionBusqueda")) {
				this.jButtonid_estructuraProcesoCierreProvisionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoProcesoCierreProvisionUpdate")) {
				this.jButtonid_empleadoProcesoCierreProvisionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoProcesoCierreProvisionBusqueda")) {
				this.jButtonid_empleadoProcesoCierreProvisionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoProcesoCierreProvisionUpdate")) {
				this.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_defi_provision_empleadoProcesoCierreProvisionBusqueda")) {
				this.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusquedaActionPerformed(evt);
			}
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoCierreProvision();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoCierreProvision")) {
				closingInternalFrameProcesoCierreProvision();
				
			} else if(sTipo.equals("jButtonCancelarProcesoCierreProvision")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoCierreProvision = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoCierreProvisionBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCierreProvisionBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCierreProvision.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoCierreProvisionActionPerformed(null);
			}
			
			ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocierreprovision,new Object(),this.procesocierreprovisionParameterGeneral,this.procesocierreprovisionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoCierreProvision(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoCierreProvision(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoCierreProvision(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesocierreprovision)) {
			if(!esControlTabla) {
				if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.procesocierreprovision,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);			
				}
				
				if(this.procesocierreprovisionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoCierreProvision(this.procesocierreprovision,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoCierreProvision(this.procesocierreprovisionReturnGeneral,this.procesocierreprovisionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesocierreprovisionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCierreProvision(classes,this.procesocierreprovisionReturnGeneral,this.procesocierreprovisionBean,false);
					}
						
					if(this.procesocierreprovisionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreProvision(this.procesocierreprovisionReturnGeneral.getProcesoCierreProvision());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoCierreProvision(this.procesocierreprovisionReturnGeneral.getProcesoCierreProvision());	
					}
						
					if(this.procesocierreprovisionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreProvision(this.procesocierreprovisionReturnGeneral.getProcesoCierreProvision(),classes);//this.procesocierreprovisionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreProvision(this.procesocierreprovision,classes);//this.procesocierreprovisionBean);									
				}
			
				if(ProcesoCierreProvisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoCierreProvision(this.procesocierreprovision,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreProvision(this.procesocierreprovision);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesocierreprovisionAnterior!=null) {
						this.procesocierreprovision=this.procesocierreprovisionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesocierreprovisionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesocierreprovisionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesocierreprovisionReturnGeneral.getProcesoCierreProvision(),procesocierreprovisionLogic.getProcesoCierreProvisions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesocierreprovisionReturnGeneral.getProcesoCierreProvision(),this.procesocierreprovisions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoCierreProvision.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoCierreProvision.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoCierreProvision();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoCierreProvision() throws Exception {
		
		ProcesoCierreProvisionModel procesocierreprovisionModel=(ProcesoCierreProvisionModel)this.jTableDatosProcesoCierreProvision.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierreprovisionModel.procesocierreprovisions=this.procesocierreprovisionLogic.getProcesoCierreProvisions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesocierreprovisionModel.procesocierreprovisions=this.procesocierreprovisions;
		}
		
		
		((ProcesoCierreProvisionModel) this.jTableDatosProcesoCierreProvision.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoCierreProvision() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesocierreprovisionAnterior(),this.procesocierreprovisionLogic.getProcesoCierreProvisions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesocierreprovisionAnterior(),this.procesocierreprovisions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoCierreProvision();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
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
										
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocierreprovision,new Object(),generalEntityParameterGeneral,this.procesocierreprovisionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoCierreProvisionConstantesFunciones.getClassesRelationshipsOfProcesoCierreProvision(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoCierreProvisionConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoCierreProvision(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoCierreProvision(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocierreprovision,new Object(),generalEntityParameterGeneral,this.procesocierreprovisionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoCierreProvision(ProcesoCierreProvisionBean procesocierreprovisionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCierreProvision(ArrayList<Classe> classes,ProcesoCierreProvisionReturnGeneral procesocierreprovisionReturnGeneral,ProcesoCierreProvisionBean procesocierreprovisionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesocierreprovision)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCierreProvision = new ProcesoCierreProvisionDetalleFormJInternalFrame(jDesktopPane,this.procesocierreprovisionSessionBean.getConGuardarRelaciones(),this.procesocierreprovisionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.setVisible(false);
		this.jInternalFrameDetalleFormProcesoCierreProvision.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.procesocierreprovisionLogic=this.procesocierreprovisionLogic;
		
		this.cargarCombosFrameForeignKeyProcesoCierreProvision("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCierreProvision();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCierreProvision();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoCierreProvision("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoCierreProvision();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCierreProvision"));
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonModificarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"ModificarProcesoCierreProvision"));

		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonModificarToolBarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCierreProvision"));
					
		this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemModificarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCierreProvision"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonActualizarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCierreProvision"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonActualizarToolBarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCierreProvision"));
						
		this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemActualizarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCierreProvision"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonEliminarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"EliminarProcesoCierreProvision"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonEliminarToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCierreProvision"));
								
		this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemEliminarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCierreProvision"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonCancelarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"CancelarProcesoCierreProvision"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonCancelarToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCierreProvision"));
					
		this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemCancelarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCierreProvision"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemDetalleCerrarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCierreProvision"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreProvision"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreProvision"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCierreProvision"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonidProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_anioProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_anioProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_estructuraProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_estructuraProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_empleadoProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_empleadoProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProcesoCierreProvisionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoCierreProvision.jTabbedPaneRelacionesProcesoCierreProvision.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCierreProvision"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoCierreProvision"));
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCierreProvision"));
		}
		
		this.jTableDatosProcesoCierreProvision.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoCierreProvision"));
		
		this.jTableDatosProcesoCierreProvision.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoCierreProvision"));
		
		this.jButtonNuevoProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"NuevoProcesoCierreProvision"));
		
		this.jButtonDuplicarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"DuplicarProcesoCierreProvision"));
		
		this.jButtonCopiarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"CopiarProcesoCierreProvision"));
		
		this.jButtonVerFormProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"VerFormProcesoCierreProvision"));
		
		
		this.jButtonNuevoToolBarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoCierreProvision"));
			
		this.jButtonDuplicarToolBarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoCierreProvision"));
			
		this.jMenuItemNuevoProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoCierreProvision"));
			
		this.jMenuItemDuplicarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoCierreProvision"));		
		
		
		this.jButtonNuevoRelacionesProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoCierreProvision"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoCierreProvision"));
			
		this.jMenuItemNuevoRelacionesProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoCierreProvision"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonModificarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"ModificarProcesoCierreProvision"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonModificarToolBarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCierreProvision"));
			
			this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemModificarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCierreProvision"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonActualizarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCierreProvision"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonActualizarToolBarProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCierreProvision"));
				
			this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemActualizarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCierreProvision"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonEliminarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"EliminarProcesoCierreProvision"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonEliminarToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCierreProvision"));
						
			this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemEliminarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCierreProvision"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonCancelarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"CancelarProcesoCierreProvision"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonCancelarToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCierreProvision"));
			
			this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemCancelarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCierreProvision"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoCierreProvision"));		
		
		
		this.jButtonCerrarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"CerrarProcesoCierreProvision"));
		
		
		this.jButtonCerrarToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoCierreProvision"));
			
		this.jMenuItemCerrarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoCierreProvision"));
			
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jMenuItemDetalleCerrarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCierreProvision"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoCierreProvision"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreProvision"));
		}
		
		this.jButtonCopiarToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoCierreProvision"));
			
		this.jButtonVerFormToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoCierreProvision"));
		
		this.jMenuItemGuardarCambiosProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoCierreProvision"));
			
		this.jMenuItemCopiarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoCierreProvision"));		
		
		this.jMenuItemVerFormProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoCierreProvision"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCierreProvision"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoCierreProvision"));
			
		this.jMenuItemGuardarCambiosTablaProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCierreProvision"));		
		
		
		
		this.jButtonRecargarInformacionProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoCierreProvision"));
					
		this.jButtonRecargarInformacionToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoCierreProvision"));
		
		this.jMenuItemRecargarInformacionProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoCierreProvision"));		
		
		
		
		this.jButtonAnterioresProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"AnterioresProcesoCierreProvision"));
		
		
		this.jButtonAnterioresToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoCierreProvision"));
		
		this.jMenuItemAnterioresProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoCierreProvision"));		
		
		
		this.jButtonSiguientesProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"SiguientesProcesoCierreProvision"));
		
		
		this.jButtonSiguientesToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoCierreProvision"));
			
		this.jMenuItemSiguientesProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoCierreProvision"));
			
		this.jMenuItemAbrirOrderByProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoCierreProvision"));
			
		this.jMenuItemMostrarOcultarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoCierreProvision"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoCierreProvision"));
			
		this.jMenuItemDetalleMostarOcultarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoCierreProvision"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoCierreProvision"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoCierreProvision"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoCierreProvision"));		
		
		
		this.jButtonProcesarInformacionProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoCierreProvision"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoCierreProvision.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoCierreProvision"));

		this.jCheckBoxSeleccionadosProcesoCierreProvision.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoCierreProvision"));
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCierreProvision"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoCierreProvision"));
			
		this.jComboBoxTiposAccionesProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoCierreProvision"));
					
		this.jComboBoxTiposSeleccionarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoCierreProvision"));
			
		this.jTextFieldValorCampoGeneralProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoCierreProvision"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonidProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_anioProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_anioProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_estructuraProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_estructuraProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_empleadoProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_empleadoProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProcesoCierreProvisionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoCierreProvisionProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCierreProvisionProcesoCierreProvision"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreProvision!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreProvision"));
				this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreProvision"));
				this.jInternalFrameReporteDinamicoProcesoCierreProvision.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreProvision"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreProvision"));				
			//this.jButtonGenerarReporteDinamicoProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreProvision"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreProvision"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoCierreProvision!=null) {
				this.jInternalFrameImportacionProcesoCierreProvision.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCierreProvision"));
				this.jInternalFrameImportacionProcesoCierreProvision.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCierreProvision"));
				this.jInternalFrameImportacionProcesoCierreProvision.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCierreProvision"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoCierreProvision"));
			
			this.jButtonAbrirOrderByToolBarProcesoCierreProvision.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoCierreProvision"));			
			
			if(this.jInternalFrameOrderByProcesoCierreProvision!=null) {
				this.jInternalFrameOrderByProcesoCierreProvision.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCierreProvision"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreProvision.jTabbedPaneRelacionesProcesoCierreProvision.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCierreProvision"));
		
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
            		closingInternalFrameProcesoCierreProvision();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoCierreProvision = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoCierreProvisionBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCierreProvisionBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCierreProvision.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoCierreProvisionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoCierreProvision.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoCierreProvisionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoCierreProvision.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoCierreProvision.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreProvisionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreProvisionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreProvisionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoCierreProvision";
		inputMap = this.jButtonNuevoProcesoCierreProvision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoCierreProvision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCierreProvisionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreProvisionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreProvisionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreProvisionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoCierreProvision";
		inputMap = this.jButtonNuevoRelacionesProcesoCierreProvision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoCierreProvision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCierreProvisionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoCierreProvision";
		inputMap = this.jButtonModificarProcesoCierreProvision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoCierreProvision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoCierreProvisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoCierreProvision";
		inputMap = this.jButtonActualizarProcesoCierreProvision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoCierreProvision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoCierreProvisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoCierreProvision";
		inputMap = this.jButtonEliminarProcesoCierreProvision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoCierreProvision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoCierreProvisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoCierreProvision";
		inputMap = this.jButtonCancelarProcesoCierreProvision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoCierreProvision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoCierreProvisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoCierreProvision";
		inputMap = this.jButtonCerrarProcesoCierreProvision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoCierreProvision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoCierreProvisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoCierreProvision";
		inputMap = this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosProcesoCierreProvision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonGuardarCambiosProcesoCierreProvision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoCierreProvisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoCierreProvision.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoCierreProvisionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoCierreProvision.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoCierreProvisionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoCierreProvision.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoCierreProvisionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoCierreProvision.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoCierreProvisionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonidProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_anioProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_anioProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_estructuraProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_estructuraProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_empleadoProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_empleadoProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoProcesoCierreProvisionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_defi_provision_empleadoProcesoCierreProvisionUpdate.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProcesoCierreProvisionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreProvision.jButtonid_defi_provision_empleadoProcesoCierreProvisionBusqueda.addActionListener(new ButtonActionListener(this,"id_defi_provision_empleadoProcesoCierreProvisionBusqueda"));
		
		
		this.jButtonBusquedaProcesoCierreProvisionProcesoCierreProvision.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCierreProvisionProcesoCierreProvision"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoCierreProvision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoCierreProvisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoCierreProvisionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoCierreProvision.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoCierreProvision(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisionLogic.getProcesoCierreProvisions()) {
					procesocierreprovisionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisions) {
					procesocierreprovisionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoCierreProvisionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCierreProvision(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisionLogic.getProcesoCierreProvisions()) {
						procesocierreprovisionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisions) {
						procesocierreprovisionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisionLogic.getProcesoCierreProvisions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCierreProvision.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCierreProvision.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoCierreProvisionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCierreProvision(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoCierreProvision.getSelectedRows();
			
			ProcesoCierreProvision procesocierreprovisionLocal=new ProcesoCierreProvision();
			
			//this.seleccionarTodosProcesoCierreProvision(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesocierreprovisionLocal =(ProcesoCierreProvision) this.procesocierreprovisionLogic.getProcesoCierreProvisions().toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesocierreprovisionLocal =(ProcesoCierreProvision) this.procesocierreprovisions.toArray()[this.jTableDatosProcesoCierreProvision.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesocierreprovisionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisionLogic.getProcesoCierreProvisions()) {
						procesocierreprovisionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisions) {
						procesocierreprovisionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCierreProvision.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCierreProvision.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreProvision,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoCierreProvisionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoCierreProvisionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoCierreProvisionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoCierreProvision(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoCierreProvision.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisionLogic.getProcesoCierreProvisions()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisions) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoCierreProvisionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoCierreProvision(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoCierreProvision=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoCierreProvision.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoCierreProvision) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoCierreProvision(conSplash);
				
					this.generarReporteProcesoCierreProvisionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreProvision.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoCierreProvisionsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCierreProvision.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCierreProvisionsSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoCierreProvision.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCierreProvisionsSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoCierreProvision.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCierreProvision();
				
				this.exportarProcesoCierreProvisionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreProvision.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoCierreProvisions();
				//this.importarProcesoCierreProvisions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreProvision.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCierreProvision();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoCierreProvisionsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCierreProvision.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Cierre Provision", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoCierreProvision();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoCierreProvision)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoCierreProvision(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Cierre Provision",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreProvision.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoCierreProvisionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoCierreProvision) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoCierreProvision(conSplash);
					
						//this.actualizarParametrosGeneralProcesoCierreProvision();
						
						this.generarReporteProcesoAccionProcesoCierreProvisionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoCierreProvision.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Cierre ProvisionES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Cierre Provision", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoCierreProvision();
				
						this.actualizarParametrosGeneralProcesoCierreProvision();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesocierreprovisionReturnGeneral=procesocierreprovisionLogic.procesarAccionProcesoCierreProvisionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesocierreprovisionLogic.getProcesoCierreProvisions(),this.procesocierreprovisionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoCierreProvisionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCierreProvision.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoCierreProvision();
					
					ProcesoCierreProvisionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoCierreProvisionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCierreProvision.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxTiposAccionesFormularioProcesoCierreProvision.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoCierreProvision(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoCierreProvisionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoCierreProvision();
			
			if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();		
			ProcesoCierreProvision procesocierreprovision=new ProcesoCierreProvision();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoCierreProvision(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoCierreProvision.getSelectedItem();
			
			
			
			
			procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesocierreprovisionsSeleccionados.size()==1) {
				for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisionsSeleccionados) {
					procesocierreprovision=procesocierreprovisionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoCierreProvision();
			
      		//this.finishProcessProcesoCierreProvision(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoCierreProvisionReturnGeneral() throws Exception {
		if(this.procesocierreprovisionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesocierreprovisionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesocierreprovisionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesocierreprovisionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesocierreprovisionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesocierreprovisionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoCierreProvision(false);
		}
		
		if(this.procesocierreprovisionReturnGeneral.getConRetornoLista() || this.procesocierreprovisionReturnGeneral.getConRetornoObjeto()) {
			if(this.procesocierreprovisionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesocierreprovisionLogic.setProcesoCierreProvisions(this.procesocierreprovisionReturnGeneral.getProcesoCierreProvisions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoCierreProvision(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoCierreProvision() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoCierreProvision> getProcesoCierreProvisionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoCierreProvision) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisionLogic.getProcesoCierreProvisions()) {
					if(procesocierreprovisionAux.getIsSelected()) {
						procesocierreprovisionsSeleccionados.add(procesocierreprovisionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreProvision procesocierreprovisionAux:this.procesocierreprovisions) {
					if(procesocierreprovisionAux.getIsSelected()) {
						procesocierreprovisionsSeleccionados.add(procesocierreprovisionAux);				
					}
				}
			}
			
			if(procesocierreprovisionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesocierreprovisionsSeleccionados.addAll(this.procesocierreprovisionLogic.getProcesoCierreProvisions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesocierreprovisionsSeleccionados.addAll(this.procesocierreprovisions);				
					}
				}
			}
		} else {
			procesocierreprovisionsSeleccionados.add(this.procesocierreprovision);
		}
		
		return procesocierreprovisionsSeleccionados;
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
	
	public void generarReporteProcesoCierreProvisionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoCierreProvisionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoCierreProvisionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCierreProvisionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCierreProvisionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Cierre Provision",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoCierreProvisionsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();		
		
		procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoCierreProvisions("Todos",procesocierreprovisionsSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoCierreProvisionsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();		
		
		procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoCierreProvisions("Todos",procesocierreprovisionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoCierreProvisionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();
		
		procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoCierreProvisions("Todos",procesocierreprovisionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoCierreProvisionsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoCierreProvision();
		
		
		procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoCierreProvision();
		
		
		//this.generarReporteProcesoCierreProvisions("Todos",procesocierreprovisionsSeleccionados ,procesocierreprovisionImplementable,procesocierreprovisionImplementableHome);
	}
	
	public void mostrarImportacionProcesoCierreProvisions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoCierreProvision();
		
		this.abrirFrameImportacionProcesoCierreProvision();		
		
			
		//this.generarReporteProcesoCierreProvisions("Todos",procesocierreprovisionsSeleccionados ,procesocierreprovisionImplementable,procesocierreprovisionImplementableHome);
	}
	
	public void importarProcesoCierreProvisions() throws Exception {		
	
	}
	
	public void exportarProcesoCierreProvisionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoCierreProvisionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoCierreProvisionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoCierreProvisionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Cierre Provision",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoCierreProvisionsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();		
		
		procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreprovision."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoCierreProvision(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoCierreProvision(procesocierreprovisionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesocierreprovisionAux.setsDetalleGeneralEntityReporte(procesocierreprovisionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Provision",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoCierreProvision(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoCierreProvisionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreProvisionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesocierreprovision.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreprovision.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreprovision.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreprovision.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreprovision.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreprovision.getdefiprovisionempleado_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoCierreProvisionsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();		
		
		procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreprovision.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoCierreProvisions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoCierreProvision(row);				
				iRow++;
			}				
			
			for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoCierreProvision(procesocierreprovisionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Provision",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoCierreProvisionsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();		
		
		procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreprovision.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesocierreprovisions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesocierreprovision");
			//elementRoot.appendChild(element);
		
			for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisionsSeleccionados) {
				element = document.createElement("procesocierreprovision");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoCierreProvision(procesocierreprovisionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Provision",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoCierreProvision(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreprovision.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreprovision.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreprovision.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreprovision.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreprovision.getdefiprovisionempleado_descripcion());				
	}
	
	public void setFilaDatosExportarXmlProcesoCierreProvision(ProcesoCierreProvision procesocierreprovision,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoCierreProvisionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesocierreprovision.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoCierreProvisionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesocierreprovision.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementanio_descripcion = document.createElement(ProcesoCierreProvisionConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(procesocierreprovision.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementestructura_descripcion = document.createElement(ProcesoCierreProvisionConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(procesocierreprovision.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementempleado_descripcion = document.createElement(ProcesoCierreProvisionConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(procesocierreprovision.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementdefiprovisionempleado_descripcion = document.createElement(ProcesoCierreProvisionConstantesFunciones.IDDEFIPROVISIONEMPLEADO);
		elementdefiprovisionempleado_descripcion.appendChild(document.createTextNode(procesocierreprovision.getdefiprovisionempleado_descripcion()));
		element.appendChild(elementdefiprovisionempleado_descripcion);
	}
	
	public void generarReporteGroupGenericoProcesoCierreProvisionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados=new ArrayList<ProcesoCierreProvision>();
		
		procesocierreprovisionsSeleccionados=this.getProcesoCierreProvisionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoCierreProvision(procesocierreprovisionsSeleccionados);
		
		this.generarReporteProcesoCierreProvisions("Todos",procesocierreprovisionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoCierreProvision(ArrayList<ProcesoCierreProvision> procesocierreprovisionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoCierreProvision procesocierreprovisionAux:procesocierreprovisionsSeleccionados) {
				procesocierreprovisionAux.setsDetalleGeneralEntityReporte(procesocierreprovisionAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoCierreProvisionConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					procesocierreprovisionAux.setsDescripcionGeneralEntityReporte1(procesocierreprovisionAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCierreProvisionConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					procesocierreprovisionAux.setsDescripcionGeneralEntityReporte1(procesocierreprovisionAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCierreProvisionConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					procesocierreprovisionAux.setsDescripcionGeneralEntityReporte1(procesocierreprovisionAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCierreProvisionConstantesFunciones.LABEL_IDDEFIPROVISIONEMPLEADO)) {
					existe=true;
					procesocierreprovisionAux.setsDescripcionGeneralEntityReporte1(procesocierreprovisionAux.getdefiprovisionempleado_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreProvisionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoCierreProvision(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoCierreProvision=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoCierreProvision=false;
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=false;
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=false;
			this.isVisibilidadCeldaCancelarProcesoCierreProvision=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=false;
			this.isVisibilidadCeldaModificarProcesoCierreProvision=false;
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=true;
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=false;
			this.isVisibilidadCeldaCancelarProcesoCierreProvision=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=false;
			this.isVisibilidadCeldaModificarProcesoCierreProvision=false;
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=true;
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=true;
			this.isVisibilidadCeldaCancelarProcesoCierreProvision=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=false;
			this.isVisibilidadCeldaModificarProcesoCierreProvision=false;
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=true;
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=false;
			this.isVisibilidadCeldaCancelarProcesoCierreProvision=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=true;
			this.isVisibilidadCeldaModificarProcesoCierreProvision=false;
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=false;
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=false;
			this.isVisibilidadCeldaCancelarProcesoCierreProvision=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=false;
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=false;
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=false;
			this.isVisibilidadCeldaCancelarProcesoCierreProvision=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=false;
			this.isVisibilidadCeldaModificarProcesoCierreProvision=true;
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=false;
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=false;
			this.isVisibilidadCeldaCancelarProcesoCierreProvision=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoCierreProvisionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=true;
		} else {
			this.actualizarEstadoPanelsProcesoCierreProvision(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoCierreProvision=false;
			//this.isVisibilidadCeldaVerFormProcesoCierreProvision=false;
			this.isVisibilidadCeldaDuplicarProcesoCierreProvision=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesocierreprovisionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoCierreProvision=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
			if(!procesocierreprovisionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=false;												
			}
			
			this.jButtonCerrarProcesoCierreProvision.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=false;
		}
		
		if(!this.permiteMantenimiento(this.procesocierreprovision)) {
			this.isVisibilidadCeldaActualizarProcesoCierreProvision=false;
			this.isVisibilidadCeldaEliminarProcesoCierreProvision=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoCierreProvision=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoCierreProvision=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoCierreProvision=false;
		//this.isVisibilidadCeldaModificarProcesoCierreProvision=true;
		this.isVisibilidadCeldaActualizarProcesoCierreProvision=false;
		this.isVisibilidadCeldaEliminarProcesoCierreProvision=false;
		//this.isVisibilidadCeldaCancelarProcesoCierreProvision=true;			
		this.isVisibilidadCeldaGuardarProcesoCierreProvision=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCierreProvision() {
	}
	
	public void actualizarEstadoPanelsProcesoCierreProvision(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoCierreProvision!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreProvision.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreProvision!=null) {
				this.jTabbedPaneBusquedasProcesoCierreProvision.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreProvision!=null) {
				this.jScrollPanelDatosProcesoCierreProvision.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreProvision!=null) {
				this.jPanelPaginacionProcesoCierreProvision.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreProvision!=null) {
				this.jPanelParametrosReportesProcesoCierreProvision.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoCierreProvision!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreProvision.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreProvision!=null) {
				this.jTabbedPaneBusquedasProcesoCierreProvision.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoCierreProvision!=null) {
				this.jScrollPanelDatosProcesoCierreProvision.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreProvision!=null) {
				this.jPanelPaginacionProcesoCierreProvision.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreProvision!=null) {
				this.jPanelParametrosReportesProcesoCierreProvision.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoCierreProvision!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreProvision.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreProvision!=null) {
				this.jTabbedPaneBusquedasProcesoCierreProvision.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreProvision!=null) {
				this.jScrollPanelDatosProcesoCierreProvision.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreProvision!=null) {
				this.jPanelPaginacionProcesoCierreProvision.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreProvision!=null) {
				this.jPanelParametrosReportesProcesoCierreProvision.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoCierreProvision!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreProvision.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreProvision!=null) {
				this.jTabbedPaneBusquedasProcesoCierreProvision.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreProvision!=null) {
				this.jScrollPanelDatosProcesoCierreProvision.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreProvision!=null) {
				this.jPanelPaginacionProcesoCierreProvision.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreProvision!=null) {
				this.jPanelParametrosReportesProcesoCierreProvision.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoCierreProvision!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreProvision.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreProvision!=null) {
				this.jTabbedPaneBusquedasProcesoCierreProvision.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreProvision!=null) {
				this.jScrollPanelDatosProcesoCierreProvision.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreProvision!=null) {
				this.jPanelPaginacionProcesoCierreProvision.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreProvision!=null) {
				this.jPanelParametrosReportesProcesoCierreProvision.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoCierreProvision!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreProvision.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreProvision!=null) {
				this.jTabbedPaneBusquedasProcesoCierreProvision.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreProvision!=null) {
				this.jScrollPanelDatosProcesoCierreProvision.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreProvision!=null) {
				this.jPanelPaginacionProcesoCierreProvision.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreProvision!=null) {
				this.jPanelParametrosReportesProcesoCierreProvision.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoCierreProvision!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreProvision.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreProvision!=null) {
				this.jTabbedPaneBusquedasProcesoCierreProvision.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreProvision!=null) {
				this.jScrollPanelDatosProcesoCierreProvision.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreProvision!=null) {
				this.jPanelPaginacionProcesoCierreProvision.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreProvision!=null) {
				this.jPanelParametrosReportesProcesoCierreProvision.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoCierreProvision!=null) {
					this.jTabbedPaneBusquedasProcesoCierreProvision.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoCierreProvision!=null) {
				this.jPanelParametrosReportesProcesoCierreProvision.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesocierreprovisionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreProvision!=null) {
				this.jTabbedPaneBusquedasProcesoCierreProvision.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoCierreProvision!=null) {
				this.jPanelParametrosReportesProcesoCierreProvision.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaProcesoCierreProvision=isParaAnio;
			if(!this.isVisibilidadBusquedaProcesoCierreProvision) {this.jTabbedPaneBusquedasProcesoCierreProvision.remove(jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadBusquedaProcesoCierreProvision=isParaEstructura;
			if(!this.isVisibilidadBusquedaProcesoCierreProvision) {this.jTabbedPaneBusquedasProcesoCierreProvision.remove(jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadBusquedaProcesoCierreProvision=isParaEmpleado;
			if(!this.isVisibilidadBusquedaProcesoCierreProvision) {this.jTabbedPaneBusquedasProcesoCierreProvision.remove(jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision);}
		}
		
	}

	public void setVisibilidadBusquedasParaDefiProvisionEmpleado(Boolean isParaDefiProvisionEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDefiProvisionEmpleadoNegation=!isParaDefiProvisionEmpleado;

			this.isVisibilidadBusquedaProcesoCierreProvision=isParaDefiProvisionEmpleado;
			if(!this.isVisibilidadBusquedaProcesoCierreProvision) {this.jTabbedPaneBusquedasProcesoCierreProvision.remove(jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision);}
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
			
			this.inicializarActualizarBindingTablaProcesoCierreProvision(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoCierreProvision() {
		this.updateBorderResaltarBusquedasFormularioProcesoCierreProvision();
		this.updateVisibilidadBusquedasFormularioProcesoCierreProvision();
		this.updateHabilitarBusquedasFormularioProcesoCierreProvision();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoCierreProvision() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoCierreProvision.getComponents().length>0) {
	

		if(this.procesocierreprovisionConstantesFunciones.resaltarBusquedaProcesoCierreProvisionProcesoCierreProvision!=null) {
			index= this.jTabbedPaneBusquedasProcesoCierreProvision.indexOfComponent(this.jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreProvision.getComponent(index);
				jPanel.setBorder(this.procesocierreprovisionConstantesFunciones.resaltarBusquedaProcesoCierreProvisionProcesoCierreProvision);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoCierreProvision() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoCierreProvision.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCierreProvision.indexOfComponent(this.jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreProvision.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesocierreprovisionConstantesFunciones.mostrarBusquedaProcesoCierreProvisionProcesoCierreProvision);
			if(!this.procesocierreprovisionConstantesFunciones.mostrarBusquedaProcesoCierreProvisionProcesoCierreProvision && index>-1) {
				this.jTabbedPaneBusquedasProcesoCierreProvision.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoCierreProvision() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoCierreProvision.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCierreProvision.indexOfComponent(this.jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreProvision.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesocierreprovisionConstantesFunciones.activarBusquedaProcesoCierreProvisionProcesoCierreProvision);
				this.jTabbedPaneBusquedasProcesoCierreProvision.setEnabledAt(index,this.procesocierreprovisionConstantesFunciones.activarBusquedaProcesoCierreProvisionProcesoCierreProvision);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoCierreProvision(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoCierreProvision")) {
			index= this.jTabbedPaneBusquedasProcesoCierreProvision.indexOfComponent(this.jPanelBusquedaProcesoCierreProvisionProcesoCierreProvision);

			this.jTabbedPaneBusquedasProcesoCierreProvision.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreProvision.getComponent(index);

			this.procesocierreprovisionConstantesFunciones.setResaltarBusquedaProcesoCierreProvisionProcesoCierreProvision(resaltar);

			jPanel.setBorder(this.procesocierreprovisionConstantesFunciones.resaltarBusquedaProcesoCierreProvisionProcesoCierreProvision);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoCierreProvision.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoCierreProvision() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoCierreProvision();
		this.updateVisibilidadResaltarControlesFormularioProcesoCierreProvision();
		this.updateHabilitarResaltarControlesFormularioProcesoCierreProvision();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoCierreProvision() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesocierreprovisionConstantesFunciones.resaltaridProcesoCierreProvision!=null && this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelidProcesoCierreProvision.setBorder(this.procesocierreprovisionConstantesFunciones.resaltaridProcesoCierreProvision);}
		if(this.procesocierreprovisionConstantesFunciones.resaltarid_anioProcesoCierreProvision!=null && this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.setBorder(this.procesocierreprovisionConstantesFunciones.resaltarid_anioProcesoCierreProvision);}
		if(this.procesocierreprovisionConstantesFunciones.resaltarid_estructuraProcesoCierreProvision!=null && this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.setBorder(this.procesocierreprovisionConstantesFunciones.resaltarid_estructuraProcesoCierreProvision);}
		if(this.procesocierreprovisionConstantesFunciones.resaltarid_empleadoProcesoCierreProvision!=null && this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.setBorder(this.procesocierreprovisionConstantesFunciones.resaltarid_empleadoProcesoCierreProvision);}
		if(this.procesocierreprovisionConstantesFunciones.resaltarid_defi_provision_empleadoProcesoCierreProvision!=null && this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setBorder(this.procesocierreprovisionConstantesFunciones.resaltarid_defi_provision_empleadoProcesoCierreProvision);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoCierreProvision() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
	
		//this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelidProcesoCierreProvision.setVisible(this.procesocierreprovisionConstantesFunciones.mostraridProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jPanelidProcesoCierreProvision.setVisible(this.procesocierreprovisionConstantesFunciones.mostraridProcesoCierreProvision);
		//this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.setVisible(this.procesocierreprovisionConstantesFunciones.mostrarid_anioProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jPanelid_anioProcesoCierreProvision.setVisible(this.procesocierreprovisionConstantesFunciones.mostrarid_anioProcesoCierreProvision);
		//this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.setVisible(this.procesocierreprovisionConstantesFunciones.mostrarid_estructuraProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jPanelid_estructuraProcesoCierreProvision.setVisible(this.procesocierreprovisionConstantesFunciones.mostrarid_estructuraProcesoCierreProvision);
		//this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.setVisible(this.procesocierreprovisionConstantesFunciones.mostrarid_empleadoProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jPanelid_empleadoProcesoCierreProvision.setVisible(this.procesocierreprovisionConstantesFunciones.mostrarid_empleadoProcesoCierreProvision);
		//this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setVisible(this.procesocierreprovisionConstantesFunciones.mostrarid_defi_provision_empleadoProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jPanelid_defi_provision_empleadoProcesoCierreProvision.setVisible(this.procesocierreprovisionConstantesFunciones.mostrarid_defi_provision_empleadoProcesoCierreProvision);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoCierreProvision() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCierreProvision==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreProvision!=null) {
	
		this.jInternalFrameDetalleFormProcesoCierreProvision.jLabelidProcesoCierreProvision.setEnabled(this.procesocierreprovisionConstantesFunciones.activaridProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_anioProcesoCierreProvision.setEnabled(this.procesocierreprovisionConstantesFunciones.activarid_anioProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_estructuraProcesoCierreProvision.setEnabled(this.procesocierreprovisionConstantesFunciones.activarid_estructuraProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_empleadoProcesoCierreProvision.setEnabled(this.procesocierreprovisionConstantesFunciones.activarid_empleadoProcesoCierreProvision);
		this.jInternalFrameDetalleFormProcesoCierreProvision.jComboBoxid_defi_provision_empleadoProcesoCierreProvision.setEnabled(this.procesocierreprovisionConstantesFunciones.activarid_defi_provision_empleadoProcesoCierreProvision);
		}
	}
	
		
}