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

import com.bydan.erp.nomina.util.SolicitudVacacionConstantesFunciones;
import com.bydan.erp.nomina.util.SolicitudVacacionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.SolicitudVacacionParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.SolicitudVacacionBean;
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
public class SolicitudVacacionBeanSwingJInternalFrame extends SolicitudVacacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SolicitudVacacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SolicitudVacacion> solicitudvacacionValidator = new ClassValidator<SolicitudVacacion>(SolicitudVacacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SolicitudVacacion solicitudvacacion;	
	public SolicitudVacacion solicitudvacacionAux;
	public SolicitudVacacion solicitudvacacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SolicitudVacacion solicitudvacacionTotales;
	public Long idSolicitudVacacionActual;
	public Long iIdNuevoSolicitudVacacion=0L;
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

	public String sFinalQueryComboEmpleadoJefe="";

	public List<Empleado> empleadojefesForeignKey;

	public List<Empleado> getempleadojefesForeignKey() {
		return empleadojefesForeignKey;
	}

	public void setempleadojefesForeignKey(List<Empleado> empleadojefesForeignKey) {
		this.empleadojefesForeignKey = empleadojefesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadojefeForeignKey;

	public Empleado getempleadojefeForeignKey() {
		return empleadojefeForeignKey;
	}

	public void setempleadojefeForeignKey(Empleado empleadojefeForeignKey) {
		this.empleadojefeForeignKey = empleadojefeForeignKey;
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

	public String sFinalQueryComboEstadoSolicitudNomi="";

	public List<EstadoSolicitudNomi> estadosolicitudnomisForeignKey;

	public List<EstadoSolicitudNomi> getestadosolicitudnomisForeignKey() {
		return estadosolicitudnomisForeignKey;
	}

	public void setestadosolicitudnomisForeignKey(List<EstadoSolicitudNomi> estadosolicitudnomisForeignKey) {
		this.estadosolicitudnomisForeignKey = estadosolicitudnomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoSolicitudNomi estadosolicitudnomiForeignKey;

	public EstadoSolicitudNomi getestadosolicitudnomiForeignKey() {
		return estadosolicitudnomiForeignKey;
	}

	public void setestadosolicitudnomiForeignKey(EstadoSolicitudNomi estadosolicitudnomiForeignKey) {
		this.estadosolicitudnomiForeignKey = estadosolicitudnomiForeignKey;
	}

	public String sFinalQueryComboFormato="";

	public List<Formato> formatosForeignKey;

	public List<Formato> getformatosForeignKey() {
		return formatosForeignKey;
	}

	public void setformatosForeignKey(List<Formato> formatosForeignKey) {
		this.formatosForeignKey = formatosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formatoForeignKey;

	public Formato getformatoForeignKey() {
		return formatoForeignKey;
	}

	public void setformatoForeignKey(Formato formatoForeignKey) {
		this.formatoForeignKey = formatoForeignKey;
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
	
	public Boolean isPermisoTodoSolicitudVacacion;
	public Boolean isPermisoNuevoSolicitudVacacion;
	public Boolean isPermisoActualizarSolicitudVacacion;
	public Boolean isPermisoActualizarOriginalSolicitudVacacion;
	public Boolean isPermisoEliminarSolicitudVacacion;
	public Boolean isPermisoGuardarCambiosSolicitudVacacion;
	public Boolean isPermisoConsultaSolicitudVacacion;
	public Boolean isPermisoBusquedaSolicitudVacacion;
	public Boolean isPermisoReporteSolicitudVacacion;
	public Boolean isPermisoPaginacionMedioSolicitudVacacion;
	public Boolean isPermisoPaginacionAltoSolicitudVacacion;
	public Boolean isPermisoPaginacionTodoSolicitudVacacion;
	public Boolean isPermisoCopiarSolicitudVacacion;
	public Boolean isPermisoVerFormSolicitudVacacion;
	public Boolean isPermisoDuplicarSolicitudVacacion;
	public Boolean isPermisoOrdenSolicitudVacacion;
	
	
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
	
	public SolicitudVacacionParameterReturnGeneral solicitudvacacionReturnGeneral;
	public SolicitudVacacionParameterReturnGeneral solicitudvacacionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSolicitudVacacion=false;
	public Boolean esParaAccionDesdeFormularioSolicitudVacacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SolicitudVacacionSessionBeanAdditional solicitudvacacionSessionBeanAdditional=null;
	
	public SolicitudVacacionSessionBeanAdditional getSolicitudVacacionSessionBeanAdditional() {
		return this.solicitudvacacionSessionBeanAdditional;
	}
	
	public void setSolicitudVacacionSessionBeanAdditional(SolicitudVacacionSessionBeanAdditional solicitudvacacionSessionBeanAdditional) {
		try {
			this.solicitudvacacionSessionBeanAdditional=solicitudvacacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SolicitudVacacionBeanSwingJInternalFrameAdditional solicitudvacacionBeanSwingJInternalFrameAdditional=null;
	//public class SolicitudVacacionBeanSwingJInternalFrame
	
	public SolicitudVacacionBeanSwingJInternalFrameAdditional getSolicitudVacacionBeanSwingJInternalFrameAdditional() {
		return this.solicitudvacacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setSolicitudVacacionBeanSwingJInternalFrameAdditional(SolicitudVacacionBeanSwingJInternalFrameAdditional solicitudvacacionBeanSwingJInternalFrameAdditional) {
		try {
			this.solicitudvacacionBeanSwingJInternalFrameAdditional=solicitudvacacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SolicitudVacacionLogic solicitudvacacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SolicitudVacacion solicitudvacacionBean;
	public SolicitudVacacionConstantesFunciones solicitudvacacionConstantesFunciones;
	//public SolicitudVacacionParameterReturnGeneral solicitudvacacionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EmpleadoLogic empleadojefeLogic;
	public EmpleadoLogic empleadoLogic;
	public EstructuraLogic estructuraLogic;
	public EstadoSolicitudNomiLogic estadosolicitudnomiLogic;
	public FormatoLogic formatoLogic;
	
	//PARAMETROS
	
	
	//public List<SolicitudVacacion> solicitudvacacions;	
	//public List<SolicitudVacacion> solicitudvacacionsEliminados;
	//public List<SolicitudVacacion> solicitudvacacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSolicitudVacacion=false;
	public Boolean isVisibilidadCeldaDuplicarSolicitudVacacion=true;
	public Boolean isVisibilidadCeldaCopiarSolicitudVacacion=true;
	public Boolean isVisibilidadCeldaVerFormSolicitudVacacion=true;
	public Boolean isVisibilidadCeldaOrdenSolicitudVacacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=false;
	public Boolean isVisibilidadCeldaModificarSolicitudVacacion=false;
	public Boolean isVisibilidadCeldaActualizarSolicitudVacacion=false;
	public Boolean isVisibilidadCeldaEliminarSolicitudVacacion=false;
	public Boolean isVisibilidadCeldaCancelarSolicitudVacacion=false;
	public Boolean isVisibilidadCeldaGuardarSolicitudVacacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSolicitudVacacion=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpleadoJefe=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoSolicitudNomi=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdFormato=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoSolicitudVacacion() {
		return this.iIdNuevoSolicitudVacacion;
	}

	public void setiIdNuevoSolicitudVacacion(Long iIdNuevoSolicitudVacacion) {
		this.iIdNuevoSolicitudVacacion = iIdNuevoSolicitudVacacion;
	}
	
	public Long getidSolicitudVacacionActual() {
		return this.idSolicitudVacacionActual;
	}

	public void setidSolicitudVacacionActual(Long idSolicitudVacacionActual) {
		this.idSolicitudVacacionActual = idSolicitudVacacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SolicitudVacacion getsolicitudvacacion() {
		return this.solicitudvacacion;
	}

	public void setsolicitudvacacion(SolicitudVacacion solicitudvacacion) {
		this.solicitudvacacion = solicitudvacacion;
	}
	
	public SolicitudVacacion getsolicitudvacacionAux() {
		return this.solicitudvacacionAux;
	}

	public void setsolicitudvacacionAux(SolicitudVacacion solicitudvacacionAux) {
		this.solicitudvacacionAux = solicitudvacacionAux;
	}				
	
	public SolicitudVacacion getsolicitudvacacionAnterior() {
		return this.solicitudvacacionAnterior;
	}

	public void setsolicitudvacacionAnterior(SolicitudVacacion solicitudvacacionAnterior) {
		this.solicitudvacacionAnterior = solicitudvacacionAnterior;
	}	
	
	public SolicitudVacacion getsolicitudvacacionTotales() {
		return this.solicitudvacacionTotales;
	}

	public void setsolicitudvacacionTotales(SolicitudVacacion solicitudvacacionTotales) {
		this.solicitudvacacionTotales = solicitudvacacionTotales;
	}	
	
	public SolicitudVacacion getsolicitudvacacionBean() {
		return this.solicitudvacacionBean;
	}

	public void setsolicitudvacacionBean(SolicitudVacacion solicitudvacacionBean) {
		this.solicitudvacacionBean = solicitudvacacionBean;
	}	
	
	public SolicitudVacacionParameterReturnGeneral getsolicitudvacacionReturnGeneral() {
		return this.solicitudvacacionReturnGeneral;
	}

	public void setsolicitudvacacionReturnGeneral(SolicitudVacacionParameterReturnGeneral solicitudvacacionReturnGeneral) {
		this.solicitudvacacionReturnGeneral = solicitudvacacionReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empleado_jefeFK_IdEmpleadoJefe=-1L;

	public Long getid_empleado_jefeFK_IdEmpleadoJefe() {
		return this.id_empleado_jefeFK_IdEmpleadoJefe;
	}

	public void setid_empleado_jefeFK_IdEmpleadoJefe(Long id_empleado_jefeFK_IdEmpleadoJefe) {
		this.id_empleado_jefeFK_IdEmpleadoJefe = id_empleado_jefeFK_IdEmpleadoJefe;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi=-1L;

	public Long getid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi() {
		return this.id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi;
	}

	public void setid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi(Long id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi) {
		this.id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi = id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_formatoFK_IdFormato=-1L;

	public Long getid_formatoFK_IdFormato() {
		return this.id_formatoFK_IdFormato;
	}

	public void setid_formatoFK_IdFormato(Long id_formatoFK_IdFormato) {
		this.id_formatoFK_IdFormato = id_formatoFK_IdFormato;
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
	
	
	public SolicitudVacacionLogic getSolicitudVacacionLogic()	{		
		return solicitudvacacionLogic;
	}

	public void setSolicitudVacacionLogic(SolicitudVacacionLogic solicitudvacacionLogic) {
		this.solicitudvacacionLogic = solicitudvacacionLogic;
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
	
	public Boolean getIsEsNuevoSolicitudVacacion() {
		return isEsNuevoSolicitudVacacion;
	}

	public void setIsEsNuevoSolicitudVacacion(Boolean isEsNuevoSolicitudVacacion) {
		this.isEsNuevoSolicitudVacacion = isEsNuevoSolicitudVacacion;
	}

	public Boolean getEsParaAccionDesdeFormularioSolicitudVacacion() {
		return esParaAccionDesdeFormularioSolicitudVacacion;
	}
	
	public void setEsParaAccionDesdeFormularioSolicitudVacacion(Boolean esParaAccionDesdeFormularioSolicitudVacacion) {
		this.esParaAccionDesdeFormularioSolicitudVacacion = esParaAccionDesdeFormularioSolicitudVacacion;
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

			if(this.solicitudvacacionSessionBean==null) {
				this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
			}

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(solicitudvacacionSessionBean.getlidEmpresaActual());
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

			if(this.solicitudvacacionSessionBean==null) {
				this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
			}

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(solicitudvacacionSessionBean.getlidSucursalActual());
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

	public void cargarCombosEmpleadoJefesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadojefesForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.solicitudvacacionSessionBean==null) {
				this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
			}

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoJefe()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadojefeLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadojefesForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleadoJefe(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(solicitudvacacionSessionBean.getlidEmpleadoJefeActual());
					this.empleadojefesForeignKey.add(empleadoLogic.getEmpleado());
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

			if(this.solicitudvacacionSessionBean==null) {
				this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
			}

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(solicitudvacacionSessionBean.getlidEmpleadoActual());
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

			if(this.solicitudvacacionSessionBean==null) {
				this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
			}

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(solicitudvacacionSessionBean.getlidEstructuraActual());
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

	public void cargarCombosEstadoSolicitudNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadosolicitudnomisForeignKey=new ArrayList<EstadoSolicitudNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoSolicitudNomiLogic estadosolicitudnomiLogic=new EstadoSolicitudNomiLogic();

			//estadosolicitudnomiLogic.getEstadoSolicitudNomiDataAccess().setIsForForeingKeyData(true);

			if(this.solicitudvacacionSessionBean==null) {
				this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
			}

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadosolicitudnomiLogic.getEstadoSolicitudNomiDataAccess().setIsForForeingKeyData(true);

					estadosolicitudnomiLogic.getTodosEstadoSolicitudNomisWithConnection(sFinalQuery,new Pagination());

					this.estadosolicitudnomisForeignKey=estadosolicitudnomiLogic.getEstadoSolicitudNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoSolicitudNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadosolicitudnomiLogic.getEntityWithConnection(solicitudvacacionSessionBean.getlidEstadoSolicitudNomiActual());
					this.estadosolicitudnomisForeignKey.add(estadosolicitudnomiLogic.getEstadoSolicitudNomi());
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

	public void cargarCombosFormatosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatosForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.solicitudvacacionSessionBean==null) {
				this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
			}

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formatosForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(solicitudvacacionSessionBean.getlidFormatoActual());
					this.formatosForeignKey.add(formatoLogic.getFormato());
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

					if(this.solicitudvacacion!=null) {
						this.solicitudvacacion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSolicitudVacacion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSolicitudVacacionGenerico)throws Exception
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
				jComboBoxid_empresaSolicitudVacacionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSolicitudVacacionGenerico!=null && jComboBoxid_empresaSolicitudVacacionGenerico.getItemCount()>0) {
					jComboBoxid_empresaSolicitudVacacionGenerico.setSelectedIndex(0);
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

					if(this.solicitudvacacion!=null) {
						this.solicitudvacacion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalSolicitudVacacion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalSolicitudVacacionGenerico)throws Exception
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
				jComboBoxid_sucursalSolicitudVacacionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalSolicitudVacacionGenerico!=null && jComboBoxid_sucursalSolicitudVacacionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalSolicitudVacacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoJefeForeignKey(Long idEmpleadoJefeSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadojefeTemp=null;

			for(Empleado empleadojefeAux:empleadojefesForeignKey) {
				if(empleadojefeAux.getId()!=null && empleadojefeAux.getId().equals(idEmpleadoJefeSeleccionado)) {
					empleadojefeTemp=empleadojefeAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadojefeTemp!=null) {

					if(this.solicitudvacacion!=null) {
						this.solicitudvacacion.setEmpleadoJefe(empleadojefeTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.setSelectedItem(empleadojefeTemp);
					}
				} else {
					//jComboBoxid_empleado_jefeSolicitudVacacion.setSelectedItem(empleadojefeTemp);
					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoJefe") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadojefeTemp!=null && jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion!=null) {
						jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setSelectedItem(empleadojefeTemp);
					} else {
						if(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion!=null) {
							//jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setSelectedItem(empleadojefeTemp);
							if(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.getItemCount()>0) {
								jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setSelectedIndex(0);
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

	public String getActualEmpleadoJefeForeignKeyDescripcion(Long idEmpleadoJefeSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadojefeTemp=null;

			for(Empleado empleadojefeAux:empleadojefesForeignKey) {
				if(empleadojefeAux.getId()!=null && empleadojefeAux.getId().equals(idEmpleadoJefeSeleccionado)) {
					empleadojefeTemp=empleadojefeAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadojefeTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoJefeForeignKeyGenerico(Long idEmpleadoJefeSeleccionado,JComboBox jComboBoxid_empleado_jefeSolicitudVacacionGenerico)throws Exception
	{
		try
		{
			Empleado  empleadojefeTemp=null;

			for(Empleado empleadojefeAux:empleadojefesForeignKey) {
				if(empleadojefeAux.getId()!=null && empleadojefeAux.getId().equals(idEmpleadoJefeSeleccionado)) {
					empleadojefeTemp=empleadojefeAux;
					break;
				}
			}

			if(empleadojefeTemp!=null) {
				jComboBoxid_empleado_jefeSolicitudVacacionGenerico.setSelectedItem(empleadojefeTemp);
			} else {
				if(jComboBoxid_empleado_jefeSolicitudVacacionGenerico!=null && jComboBoxid_empleado_jefeSolicitudVacacionGenerico.getItemCount()>0) {
					jComboBoxid_empleado_jefeSolicitudVacacionGenerico.setSelectedIndex(0);
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

					if(this.solicitudvacacion!=null) {
						this.solicitudvacacion.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoSolicitudVacacion.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoSolicitudVacacionGenerico)throws Exception
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
				jComboBoxid_empleadoSolicitudVacacionGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoSolicitudVacacionGenerico!=null && jComboBoxid_empleadoSolicitudVacacionGenerico.getItemCount()>0) {
					jComboBoxid_empleadoSolicitudVacacionGenerico.setSelectedIndex(0);
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

					if(this.solicitudvacacion!=null) {
						this.solicitudvacacion.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraSolicitudVacacion.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion!=null) {
						jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraSolicitudVacacionGenerico)throws Exception
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
				jComboBoxid_estructuraSolicitudVacacionGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraSolicitudVacacionGenerico!=null && jComboBoxid_estructuraSolicitudVacacionGenerico.getItemCount()>0) {
					jComboBoxid_estructuraSolicitudVacacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoSolicitudNomiForeignKey(Long idEstadoSolicitudNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoSolicitudNomi  estadosolicitudnomiTemp=null;

			for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisForeignKey) {
				if(estadosolicitudnomiAux.getId()!=null && estadosolicitudnomiAux.getId().equals(idEstadoSolicitudNomiSeleccionado)) {
					estadosolicitudnomiTemp=estadosolicitudnomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadosolicitudnomiTemp!=null) {

					if(this.solicitudvacacion!=null) {
						this.solicitudvacacion.setEstadoSolicitudNomi(estadosolicitudnomiTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setSelectedItem(estadosolicitudnomiTemp);
					}
				} else {
					//jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setSelectedItem(estadosolicitudnomiTemp);
					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoSolicitudNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadosolicitudnomiTemp!=null && jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion!=null) {
						jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setSelectedItem(estadosolicitudnomiTemp);
					} else {
						if(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion!=null) {
							//jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setSelectedItem(estadosolicitudnomiTemp);
							if(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.getItemCount()>0) {
								jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setSelectedIndex(0);
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

	public String getActualEstadoSolicitudNomiForeignKeyDescripcion(Long idEstadoSolicitudNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoSolicitudNomi  estadosolicitudnomiTemp=null;

			for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisForeignKey) {
				if(estadosolicitudnomiAux.getId()!=null && estadosolicitudnomiAux.getId().equals(idEstadoSolicitudNomiSeleccionado)) {
					estadosolicitudnomiTemp=estadosolicitudnomiAux;
					break;
				}
			}


			sDescripcion=EstadoSolicitudNomiConstantesFunciones.getEstadoSolicitudNomiDescripcion(estadosolicitudnomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoSolicitudNomiForeignKeyGenerico(Long idEstadoSolicitudNomiSeleccionado,JComboBox jComboBoxid_estado_solicitud_nomiSolicitudVacacionGenerico)throws Exception
	{
		try
		{
			EstadoSolicitudNomi  estadosolicitudnomiTemp=null;

			for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisForeignKey) {
				if(estadosolicitudnomiAux.getId()!=null && estadosolicitudnomiAux.getId().equals(idEstadoSolicitudNomiSeleccionado)) {
					estadosolicitudnomiTemp=estadosolicitudnomiAux;
					break;
				}
			}

			if(estadosolicitudnomiTemp!=null) {
				jComboBoxid_estado_solicitud_nomiSolicitudVacacionGenerico.setSelectedItem(estadosolicitudnomiTemp);
			} else {
				if(jComboBoxid_estado_solicitud_nomiSolicitudVacacionGenerico!=null && jComboBoxid_estado_solicitud_nomiSolicitudVacacionGenerico.getItemCount()>0) {
					jComboBoxid_estado_solicitud_nomiSolicitudVacacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoForeignKey(Long idFormatoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatoTemp!=null) {

					if(this.solicitudvacacion!=null) {
						this.solicitudvacacion.setFormato(formatoTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.setSelectedItem(formatoTemp);
					}
				} else {
					//jComboBoxid_formatoSolicitudVacacion.setSelectedItem(formatoTemp);
					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
						if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFormato") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatoTemp!=null && jComboBoxid_formatoFK_IdFormatoSolicitudVacacion!=null) {
						jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.setSelectedItem(formatoTemp);
					} else {
						if(jComboBoxid_formatoFK_IdFormatoSolicitudVacacion!=null) {
							//jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.setSelectedItem(formatoTemp);
							if(jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.getItemCount()>0) {
								jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.setSelectedIndex(0);
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

	public String getActualFormatoForeignKeyDescripcion(Long idFormatoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formatoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoForeignKeyGenerico(Long idFormatoSeleccionado,JComboBox jComboBoxid_formatoSolicitudVacacionGenerico)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(formatoTemp!=null) {
				jComboBoxid_formatoSolicitudVacacionGenerico.setSelectedItem(formatoTemp);
			} else {
				if(jComboBoxid_formatoSolicitudVacacionGenerico!=null && jComboBoxid_formatoSolicitudVacacionGenerico.getItemCount()>0) {
					jComboBoxid_formatoSolicitudVacacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SolicitudVacacion solicitudvacacion,JComboBox jComboBoxid_empresaSolicitudVacacionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSolicitudVacacionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSolicitudVacacionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				solicitudvacacion.setid_empresa(empresaAux.getId());
				solicitudvacacion.setempresa_descripcion(SolicitudVacacionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				solicitudvacacion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(SolicitudVacacion solicitudvacacion,JComboBox jComboBoxid_sucursalSolicitudVacacionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalSolicitudVacacionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalSolicitudVacacionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				solicitudvacacion.setid_sucursal(sucursalAux.getId());
				solicitudvacacion.setsucursal_descripcion(SolicitudVacacionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				solicitudvacacion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoJefeForeignKey(SolicitudVacacion solicitudvacacion,JComboBox jComboBoxid_empleado_jefeSolicitudVacacionGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleado_jefeSolicitudVacacionGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleado_jefeSolicitudVacacionGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				solicitudvacacion.setid_empleado_jefe(empleadoAux.getId());
				solicitudvacacion.setempleadojefe_descripcion(SolicitudVacacionConstantesFunciones.getEmpleadoJefeDescripcion(empleadoAux));
				solicitudvacacion.setEmpleadoJefe(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(SolicitudVacacion solicitudvacacion,JComboBox jComboBoxid_empleadoSolicitudVacacionGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoSolicitudVacacionGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoSolicitudVacacionGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				solicitudvacacion.setid_empleado(empleadoAux.getId());
				solicitudvacacion.setempleado_descripcion(SolicitudVacacionConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				solicitudvacacion.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(SolicitudVacacion solicitudvacacion,JComboBox jComboBoxid_estructuraSolicitudVacacionGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraSolicitudVacacionGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraSolicitudVacacionGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				solicitudvacacion.setid_estructura(estructuraAux.getId());
				solicitudvacacion.setestructura_descripcion(SolicitudVacacionConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				solicitudvacacion.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoSolicitudNomiForeignKey(SolicitudVacacion solicitudvacacion,JComboBox jComboBoxid_estado_solicitud_nomiSolicitudVacacionGenerico)throws Exception
	{
		try
		{
			EstadoSolicitudNomi  estadosolicitudnomiAux=new EstadoSolicitudNomi();

			if(jComboBoxid_estado_solicitud_nomiSolicitudVacacionGenerico==null) {
				estadosolicitudnomiAux=(EstadoSolicitudNomi)this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.getSelectedItem();
			} else {
				estadosolicitudnomiAux=(EstadoSolicitudNomi)jComboBoxid_estado_solicitud_nomiSolicitudVacacionGenerico.getSelectedItem();
			}

			if(estadosolicitudnomiAux!=null && estadosolicitudnomiAux.getId()!=null) {
				solicitudvacacion.setid_estado_solicitud_nomi(estadosolicitudnomiAux.getId());
				solicitudvacacion.setestadosolicitudnomi_descripcion(SolicitudVacacionConstantesFunciones.getEstadoSolicitudNomiDescripcion(estadosolicitudnomiAux));
				solicitudvacacion.setEstadoSolicitudNomi(estadosolicitudnomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoForeignKey(SolicitudVacacion solicitudvacacion,JComboBox jComboBoxid_formatoSolicitudVacacionGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formatoSolicitudVacacionGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formatoSolicitudVacacionGenerico.getSelectedItem();
			}

			if(formatoAux!=null && formatoAux.getId()!=null) {
				solicitudvacacion.setid_formato(formatoAux.getId());
				solicitudvacacion.setformato_descripcion(SolicitudVacacionConstantesFunciones.getFormatoDescripcion(formatoAux));
				solicitudvacacion.setFormato(formatoAux);			}
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

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
					}

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
					}

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadoJefesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.removeAllItems();

							for(Empleado empleadojefe:this.empleadojefesForeignKey) {
								this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.addItem(empleadojefe);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
					}

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoJefe") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.removeAllItems();

							for(Empleado empleadojefe:this.empleadojefesForeignKey) {
								this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.addItem(empleadojefe);
							}
						}

						if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
					}

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.addItem(empleado);
							}
						}

						if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
					}

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.addItem(estructura);
							}
						}

						if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoSolicitudNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoSolicitudNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.removeAllItems();

							for(EstadoSolicitudNomi estadosolicitudnomi:this.estadosolicitudnomisForeignKey) {
								this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.addItem(estadosolicitudnomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
					}

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoSolicitudNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.removeAllItems();

							for(EstadoSolicitudNomi estadosolicitudnomi:this.estadosolicitudnomisForeignKey) {
								this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.addItem(estadosolicitudnomi);
							}
						}

						if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.addItem(formato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { 
					}

					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFormato") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.addItem(formato);
							}
						}

						if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEmpleadoJefeForeignKey(Empleado empleadojefe,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.setSelectedItem(empleadojefe);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setSelectedItem(empleadojefe);
						} else {
							this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoSolicitudNomiForeignKey(EstadoSolicitudNomi estadosolicitudnomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setSelectedItem(estadosolicitudnomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setSelectedItem(estadosolicitudnomi);
						} else {
							this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFormatoForeignKey(Formato formato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.setSelectedItem(formato);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.setSelectedItem(formato);
						} else {
							this.jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSolicitudVacacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SolicitudVacacionConstantesFunciones.refrescarForeignKeysDescripcionesSolicitudVacacion(this.solicitudvacacionLogic.getSolicitudVacacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SolicitudVacacionConstantesFunciones.refrescarForeignKeysDescripcionesSolicitudVacacion(this.solicitudvacacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(EstadoSolicitudNomi.class));
		classes.add(new Classe(Formato.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//solicitudvacacionLogic.setSolicitudVacacions(this.solicitudvacacions);
			solicitudvacacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SolicitudVacacionParameterReturnGeneral getSolicitudVacacionParameterGeneral() {
		return this.solicitudvacacionParameterGeneral;
	}
	
	public void setSolicitudVacacionParameterGeneral(SolicitudVacacionParameterReturnGeneral solicitudvacacionParameterGeneral) {
		this.solicitudvacacionParameterGeneral = solicitudvacacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSolicitudVacacion() {
		return isPermisoTodoSolicitudVacacion;
	}

	public void setIsPermisoTodoSolicitudVacacion(Boolean isPermisoTodoSolicitudVacacion) {
		this.isPermisoTodoSolicitudVacacion = isPermisoTodoSolicitudVacacion;
	}

	public Boolean getIsPermisoNuevoSolicitudVacacion() {
		return isPermisoNuevoSolicitudVacacion;
	}

	public void setIsPermisoNuevoSolicitudVacacion(Boolean isPermisoNuevoSolicitudVacacion) {
		this.isPermisoNuevoSolicitudVacacion = isPermisoNuevoSolicitudVacacion;
	}

	public Boolean getIsPermisoActualizarSolicitudVacacion() {
		return isPermisoActualizarSolicitudVacacion;
	}

	public void setIsPermisoActualizarSolicitudVacacion(Boolean isPermisoActualizarSolicitudVacacion) {
		this.isPermisoActualizarSolicitudVacacion = isPermisoActualizarSolicitudVacacion;
	}

	public Boolean getIsPermisoEliminarSolicitudVacacion() {
		return isPermisoEliminarSolicitudVacacion;
	}

	public void setIsPermisoEliminarSolicitudVacacion(Boolean isPermisoEliminarSolicitudVacacion) {
		this.isPermisoEliminarSolicitudVacacion = isPermisoEliminarSolicitudVacacion;
	}

	public Boolean getIsPermisoGuardarCambiosSolicitudVacacion() {
		return isPermisoGuardarCambiosSolicitudVacacion;
	}

	public void setIsPermisoGuardarCambiosSolicitudVacacion(Boolean isPermisoGuardarCambiosSolicitudVacacion) {
		this.isPermisoGuardarCambiosSolicitudVacacion = isPermisoGuardarCambiosSolicitudVacacion;
	}
	
	public Boolean getIsPermisoConsultaSolicitudVacacion() {
		return isPermisoConsultaSolicitudVacacion;
	}

	public void setIsPermisoConsultaSolicitudVacacion(Boolean isPermisoConsultaSolicitudVacacion) {
		this.isPermisoConsultaSolicitudVacacion = isPermisoConsultaSolicitudVacacion;
	}

	public Boolean getIsPermisoBusquedaSolicitudVacacion() {
		return isPermisoBusquedaSolicitudVacacion;
	}

	public void setIsPermisoBusquedaSolicitudVacacion(Boolean isPermisoBusquedaSolicitudVacacion) {
		this.isPermisoBusquedaSolicitudVacacion = isPermisoBusquedaSolicitudVacacion;
	}

	public Boolean getIsPermisoReporteSolicitudVacacion() {
		return isPermisoReporteSolicitudVacacion;
	}

	public void setIsPermisoReporteSolicitudVacacion(Boolean isPermisoReporteSolicitudVacacion) {
		this.isPermisoReporteSolicitudVacacion = isPermisoReporteSolicitudVacacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioSolicitudVacacion() {
		return isPermisoPaginacionMedioSolicitudVacacion;
	}

	public void setIsPermisoPaginacionMedioSolicitudVacacion(Boolean isPermisoPaginacionMedioSolicitudVacacion) {
		this.isPermisoPaginacionMedioSolicitudVacacion = isPermisoPaginacionMedioSolicitudVacacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoSolicitudVacacion() {
		return isPermisoPaginacionTodoSolicitudVacacion;
	}

	public void setIsPermisoPaginacionTodoSolicitudVacacion(Boolean isPermisoPaginacionTodoSolicitudVacacion) {
		this.isPermisoPaginacionTodoSolicitudVacacion = isPermisoPaginacionTodoSolicitudVacacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoSolicitudVacacion() {
		return isPermisoPaginacionAltoSolicitudVacacion;
	}

	public void setIsPermisoPaginacionAltoSolicitudVacacion(Boolean isPermisoPaginacionAltoSolicitudVacacion) {
		this.isPermisoPaginacionAltoSolicitudVacacion = isPermisoPaginacionAltoSolicitudVacacion;
	}
	
	public Boolean getIsPermisoCopiarSolicitudVacacion() {
		return isPermisoCopiarSolicitudVacacion;
	}

	public void setIsPermisoCopiarSolicitudVacacion(Boolean isPermisoCopiarSolicitudVacacion) {
		this.isPermisoCopiarSolicitudVacacion = isPermisoCopiarSolicitudVacacion;
	}
	
	public Boolean getIsPermisoVerFormSolicitudVacacion() {
		return isPermisoVerFormSolicitudVacacion;
	}

	public void setIsPermisoVerFormSolicitudVacacion(Boolean isPermisoVerFormSolicitudVacacion) {
		this.isPermisoVerFormSolicitudVacacion = isPermisoVerFormSolicitudVacacion;
	}
	
	public Boolean getIsPermisoDuplicarSolicitudVacacion() {
		return isPermisoDuplicarSolicitudVacacion;
	}

	public void setIsPermisoDuplicarSolicitudVacacion(Boolean isPermisoDuplicarSolicitudVacacion) {
		this.isPermisoDuplicarSolicitudVacacion = isPermisoDuplicarSolicitudVacacion;
	}
	
	public Boolean getIsPermisoOrdenSolicitudVacacion() {
		return isPermisoOrdenSolicitudVacacion;
	}

	public void setIsPermisoOrdenSolicitudVacacion(Boolean isPermisoOrdenSolicitudVacacion) {
		this.isPermisoOrdenSolicitudVacacion = isPermisoOrdenSolicitudVacacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSolicitudVacacion() {
		return isVisibilidadCeldaNuevoSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaNuevoSolicitudVacacion(Boolean isVisibilidadCeldaNuevoSolicitudVacacion) {
		this.isVisibilidadCeldaNuevoSolicitudVacacion = isVisibilidadCeldaNuevoSolicitudVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSolicitudVacacion() {
		return isVisibilidadCeldaDuplicarSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaDuplicarSolicitudVacacion(Boolean isVisibilidadCeldaDuplicarSolicitudVacacion) {
		this.isVisibilidadCeldaDuplicarSolicitudVacacion = isVisibilidadCeldaDuplicarSolicitudVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSolicitudVacacion() {
		return isVisibilidadCeldaCopiarSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaCopiarSolicitudVacacion(Boolean isVisibilidadCeldaCopiarSolicitudVacacion) {
		this.isVisibilidadCeldaCopiarSolicitudVacacion = isVisibilidadCeldaCopiarSolicitudVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSolicitudVacacion() {
		return isVisibilidadCeldaVerFormSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaVerFormSolicitudVacacion(Boolean isVisibilidadCeldaVerFormSolicitudVacacion) {
		this.isVisibilidadCeldaVerFormSolicitudVacacion = isVisibilidadCeldaVerFormSolicitudVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSolicitudVacacion() {
		return isVisibilidadCeldaOrdenSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaOrdenSolicitudVacacion(Boolean isVisibilidadCeldaOrdenSolicitudVacacion) {
		this.isVisibilidadCeldaOrdenSolicitudVacacion = isVisibilidadCeldaOrdenSolicitudVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSolicitudVacacion() {
		return isVisibilidadCeldaNuevoRelacionesSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSolicitudVacacion(Boolean isVisibilidadCeldaNuevoRelacionesSolicitudVacacion) {
		this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion = isVisibilidadCeldaNuevoRelacionesSolicitudVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSolicitudVacacion() {
		return isVisibilidadCeldaModificarSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaModificarSolicitudVacacion(Boolean isVisibilidadCeldaModificarSolicitudVacacion) {
		this.isVisibilidadCeldaModificarSolicitudVacacion = isVisibilidadCeldaModificarSolicitudVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSolicitudVacacion() {
		return isVisibilidadCeldaActualizarSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaActualizarSolicitudVacacion(Boolean isVisibilidadCeldaActualizarSolicitudVacacion) {
		this.isVisibilidadCeldaActualizarSolicitudVacacion = isVisibilidadCeldaActualizarSolicitudVacacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarSolicitudVacacion() {
		return isVisibilidadCeldaEliminarSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaEliminarSolicitudVacacion(Boolean isVisibilidadCeldaEliminarSolicitudVacacion) {
		this.isVisibilidadCeldaEliminarSolicitudVacacion = isVisibilidadCeldaEliminarSolicitudVacacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarSolicitudVacacion() {
		return isVisibilidadCeldaCancelarSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaCancelarSolicitudVacacion(Boolean isVisibilidadCeldaCancelarSolicitudVacacion) {
		this.isVisibilidadCeldaCancelarSolicitudVacacion = isVisibilidadCeldaCancelarSolicitudVacacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarSolicitudVacacion() {
		return isVisibilidadCeldaGuardarSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaGuardarSolicitudVacacion(Boolean isVisibilidadCeldaGuardarSolicitudVacacion) {
		this.isVisibilidadCeldaGuardarSolicitudVacacion = isVisibilidadCeldaGuardarSolicitudVacacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSolicitudVacacion() {
		return isVisibilidadCeldaGuardarCambiosSolicitudVacacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSolicitudVacacion(Boolean isVisibilidadCeldaGuardarCambiosSolicitudVacacion) {
		this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion = isVisibilidadCeldaGuardarCambiosSolicitudVacacion;
	}
		
	public SolicitudVacacionSessionBean getsolicitudvacacionSessionBean() {
		return this.solicitudvacacionSessionBean;
	}
	
	public void setsolicitudvacacionSessionBean(SolicitudVacacionSessionBean solicitudvacacionSessionBean) {
		this.solicitudvacacionSessionBean=solicitudvacacionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpleadoJefe() {
		return this.isVisibilidadFK_IdEmpleadoJefe;
	}

	public void setisVisibilidadFK_IdEmpleadoJefe(Boolean isVisibilidadFK_IdEmpleadoJefe) {
		this.isVisibilidadFK_IdEmpleadoJefe=isVisibilidadFK_IdEmpleadoJefe;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoSolicitudNomi() {
		return this.isVisibilidadFK_IdEstadoSolicitudNomi;
	}

	public void setisVisibilidadFK_IdEstadoSolicitudNomi(Boolean isVisibilidadFK_IdEstadoSolicitudNomi) {
		this.isVisibilidadFK_IdEstadoSolicitudNomi=isVisibilidadFK_IdEstadoSolicitudNomi;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdFormato() {
		return this.isVisibilidadFK_IdFormato;
	}

	public void setisVisibilidadFK_IdFormato(Boolean isVisibilidadFK_IdFormato) {
		this.isVisibilidadFK_IdFormato=isVisibilidadFK_IdFormato;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(SolicitudVacacion solicitudvacacion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(solicitudvacacion,null);
				this.setActualParaGuardarSucursalForeignKey(solicitudvacacion,null);
				this.setActualParaGuardarEmpleadoJefeForeignKey(solicitudvacacion,null);
				this.setActualParaGuardarEmpleadoForeignKey(solicitudvacacion,null);
				this.setActualParaGuardarEstructuraForeignKey(solicitudvacacion,null);
				this.setActualParaGuardarEstadoSolicitudNomiForeignKey(solicitudvacacion,null);
				this.setActualParaGuardarFormatoForeignKey(solicitudvacacion,null);
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
	
	public void bugActualizarReferenciaActual(SolicitudVacacion solicitudvacacion,SolicitudVacacion solicitudvacacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSolicitudVacacion(solicitudvacacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		solicitudvacacionAux.setId(solicitudvacacion.getId());
		solicitudvacacionAux.setVersionRow(solicitudvacacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSolicitudVacacion();
		
			int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = solicitudvacacionValidator.getInvalidValues(this.solicitudvacacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			solicitudvacacionLogic.setDatosCliente(datosCliente);
			solicitudvacacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				solicitudvacacionAux=new  SolicitudVacacion();
				
				solicitudvacacionAux.setIsNew(true);
				solicitudvacacionAux.setIsChanged(true);
				
				solicitudvacacionAux.setSolicitudVacacionOriginal(this.solicitudvacacion);
				
				solicitudvacacionAux.setId(this.solicitudvacacion.getId());	
				solicitudvacacionAux.setVersionRow(this.solicitudvacacion.getVersionRow());	
				solicitudvacacionAux.setid_empresa(this.solicitudvacacion.getid_empresa());	
				solicitudvacacionAux.setid_sucursal(this.solicitudvacacion.getid_sucursal());	
				solicitudvacacionAux.setid_empleado_jefe(this.solicitudvacacion.getid_empleado_jefe());	
				solicitudvacacionAux.setid_empleado(this.solicitudvacacion.getid_empleado());	
				solicitudvacacionAux.setid_estructura(this.solicitudvacacion.getid_estructura());	
				solicitudvacacionAux.setid_estado_solicitud_nomi(this.solicitudvacacion.getid_estado_solicitud_nomi());	
				solicitudvacacionAux.setid_formato(this.solicitudvacacion.getid_formato());	
				solicitudvacacionAux.setsecuencial(this.solicitudvacacion.getsecuencial());	
				solicitudvacacionAux.setfecha_solicita(this.solicitudvacacion.getfecha_solicita());	
				solicitudvacacionAux.setfecha_ejecuta(this.solicitudvacacion.getfecha_ejecuta());	
				solicitudvacacionAux.setnumero_horas(this.solicitudvacacion.getnumero_horas());	
				solicitudvacacionAux.setcosto_unitario(this.solicitudvacacion.getcosto_unitario());	
				solicitudvacacionAux.setcosto_total(this.solicitudvacacion.getcosto_total());	
				solicitudvacacionAux.setdescripcion(this.solicitudvacacion.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.solicitudvacacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(solicitudvacacionAux,solicitudvacacionLogic.getSolicitudVacacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudvacacionAux,solicitudvacacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.solicitudvacacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionLogic.saveSolicitudVacacions();//WithConnection
						//solicitudvacacionLogic.getSetVersionRowSolicitudVacacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.solicitudvacacion,solicitudvacacionAux);
					
					this.refrescarForeignKeysDescripcionesSolicitudVacacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								solicitudvacacionLogic.saveSolicitudVacacionRelaciones(solicitudvacacionAux);//WithConnection
								//solicitudvacacionLogic.getSetVersionRowSolicitudVacacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.solicitudvacacion,solicitudvacacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.solicitudvacacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(solicitudvacacionAux,solicitudvacacionLogic.getSolicitudVacacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(solicitudvacacionAux,solicitudvacacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.solicitudvacacion,solicitudvacacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				solicitudvacacionAux=new  SolicitudVacacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado() 
					|| (this.solicitudvacacionSessionBean.getEsGuardarRelacionado() && this.solicitudvacacion.getId()>=0)) {
						
					solicitudvacacionAux.setIsNew(false);
				}
				
				solicitudvacacionAux.setIsDeleted(false);
			
				solicitudvacacionAux.setId(this.solicitudvacacion.getId());	
				solicitudvacacionAux.setVersionRow(this.solicitudvacacion.getVersionRow());	
				solicitudvacacionAux.setid_empresa(this.solicitudvacacion.getid_empresa());	
				solicitudvacacionAux.setid_sucursal(this.solicitudvacacion.getid_sucursal());	
				solicitudvacacionAux.setid_empleado_jefe(this.solicitudvacacion.getid_empleado_jefe());	
				solicitudvacacionAux.setid_empleado(this.solicitudvacacion.getid_empleado());	
				solicitudvacacionAux.setid_estructura(this.solicitudvacacion.getid_estructura());	
				solicitudvacacionAux.setid_estado_solicitud_nomi(this.solicitudvacacion.getid_estado_solicitud_nomi());	
				solicitudvacacionAux.setid_formato(this.solicitudvacacion.getid_formato());	
				solicitudvacacionAux.setsecuencial(this.solicitudvacacion.getsecuencial());	
				solicitudvacacionAux.setfecha_solicita(this.solicitudvacacion.getfecha_solicita());	
				solicitudvacacionAux.setfecha_ejecuta(this.solicitudvacacion.getfecha_ejecuta());	
				solicitudvacacionAux.setnumero_horas(this.solicitudvacacion.getnumero_horas());	
				solicitudvacacionAux.setcosto_unitario(this.solicitudvacacion.getcosto_unitario());	
				solicitudvacacionAux.setcosto_total(this.solicitudvacacion.getcosto_total());	
				solicitudvacacionAux.setdescripcion(this.solicitudvacacion.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(solicitudvacacionAux,solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudvacacionAux,solicitudvacacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.solicitudvacacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionLogic.saveSolicitudVacacions();//WithConnection
						//solicitudvacacionLogic.getSetVersionRowSolicitudVacacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.solicitudvacacion,solicitudvacacionAux);
					
					this.refrescarForeignKeysDescripcionesSolicitudVacacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								solicitudvacacionLogic.saveSolicitudVacacionRelaciones(solicitudvacacionAux);//WithConnection
								//solicitudvacacionLogic.getSetVersionRowSolicitudVacacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.solicitudvacacion,solicitudvacacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.solicitudvacacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(solicitudvacacionAux,solicitudvacacionLogic.getSolicitudVacacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(solicitudvacacionAux,solicitudvacacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.solicitudvacacion,solicitudvacacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				solicitudvacacionAux=new  SolicitudVacacion();
				
				solicitudvacacionAux.setIsNew(false);
				solicitudvacacionAux.setIsChanged(false);
				
				solicitudvacacionAux.setIsDeleted(true);
				
				solicitudvacacionAux.setId(this.solicitudvacacion.getId());	
				solicitudvacacionAux.setVersionRow(this.solicitudvacacion.getVersionRow());	
				solicitudvacacionAux.setid_empresa(this.solicitudvacacion.getid_empresa());	
				solicitudvacacionAux.setid_sucursal(this.solicitudvacacion.getid_sucursal());	
				solicitudvacacionAux.setid_empleado_jefe(this.solicitudvacacion.getid_empleado_jefe());	
				solicitudvacacionAux.setid_empleado(this.solicitudvacacion.getid_empleado());	
				solicitudvacacionAux.setid_estructura(this.solicitudvacacion.getid_estructura());	
				solicitudvacacionAux.setid_estado_solicitud_nomi(this.solicitudvacacion.getid_estado_solicitud_nomi());	
				solicitudvacacionAux.setid_formato(this.solicitudvacacion.getid_formato());	
				solicitudvacacionAux.setsecuencial(this.solicitudvacacion.getsecuencial());	
				solicitudvacacionAux.setfecha_solicita(this.solicitudvacacion.getfecha_solicita());	
				solicitudvacacionAux.setfecha_ejecuta(this.solicitudvacacion.getfecha_ejecuta());	
				solicitudvacacionAux.setnumero_horas(this.solicitudvacacion.getnumero_horas());	
				solicitudvacacionAux.setcosto_unitario(this.solicitudvacacion.getcosto_unitario());	
				solicitudvacacionAux.setcosto_total(this.solicitudvacacion.getcosto_total());	
				solicitudvacacionAux.setdescripcion(this.solicitudvacacion.getdescripcion());	
				
				if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.solicitudvacacionAux.getId()>=0) {	
						this.solicitudvacacionsEliminados.add(solicitudvacacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(solicitudvacacionAux,solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudvacacionAux,solicitudvacacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.solicitudvacacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionLogic.saveSolicitudVacacions();//WithConnection
						//solicitudvacacionLogic.getSetVersionRowSolicitudVacacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								solicitudvacacionLogic.saveSolicitudVacacionRelaciones(solicitudvacacionAux);//WithConnection
								//solicitudvacacionLogic.getSetVersionRowSolicitudVacacions();//WithConnection
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
							if(this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.solicitudvacacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(solicitudvacacionAux,solicitudvacacionLogic.getSolicitudVacacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(solicitudvacacionAux,solicitudvacacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getSolicitudVacacions().addAll(this.solicitudvacacionsEliminados);
					
					solicitudvacacionLogic.saveSolicitudVacacions();//WithConnection
					//solicitudvacacionLogic.getSetVersionRowSolicitudVacacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSolicitudVacacion();
				
				this.solicitudvacacionsEliminados= new ArrayList<SolicitudVacacion>();		
			}
			
			if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Solicitud Vacacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Solicitud Vacacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.solicitudvacacion=solicitudvacacionAux;
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
      		//this.finishProcessSolicitudVacacion();
      	}
		
	}	
	
	public void actualizarRelaciones(SolicitudVacacion solicitudvacacionLocal) throws Exception {
		
		if(this.solicitudvacacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SolicitudVacacion solicitudvacacionLocal) throws Exception {	
		if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				solicitudvacacionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				solicitudvacacionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadojefeBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadojefeBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadojefeBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadojefeBeanSwingJInternalFrameLocal.actualizarLista(empleadojefeBeanSwingJInternalFrameLocal.empleado,this.empleadojefesForeignKey);

				empleadojefeBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadojefeBeanSwingJInternalFrameLocal.empleado);

				solicitudvacacionLocal.setEmpleadoJefe(empleadojefeBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleadoJefe();
				this.cargarCombosFrameEmpleadoJefesForeignKey("Formulario");
				this.setActualEmpleadoJefeForeignKey(empleadojefeBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				solicitudvacacionLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				solicitudvacacionLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoSolicitudNomiDetalleFormJInternalFrame.class)) {
				EstadoSolicitudNomiBeanSwingJInternalFrame estadosolicitudnomiBeanSwingJInternalFrameLocal=(EstadoSolicitudNomiBeanSwingJInternalFrame) ((EstadoSolicitudNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadosolicitudnomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoSolicitudNomi(estadosolicitudnomiBeanSwingJInternalFrameLocal.getestadosolicitudnomi(),true);
				estadosolicitudnomiBeanSwingJInternalFrameLocal.actualizarLista(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi,this.estadosolicitudnomisForeignKey);

				estadosolicitudnomiBeanSwingJInternalFrameLocal.actualizarRelaciones(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi);

				solicitudvacacionLocal.setEstadoSolicitudNomi(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi);

				this.addItemDefectoCombosForeignKeyEstadoSolicitudNomi();
				this.cargarCombosFrameEstadoSolicitudNomisForeignKey("Formulario");
				this.setActualEstadoSolicitudNomiForeignKey(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formatoBeanSwingJInternalFrameLocal.getformato(),true);
				formatoBeanSwingJInternalFrameLocal.actualizarLista(formatoBeanSwingJInternalFrameLocal.formato,this.formatosForeignKey);

				formatoBeanSwingJInternalFrameLocal.actualizarRelaciones(formatoBeanSwingJInternalFrameLocal.formato);

				solicitudvacacionLocal.setFormato(formatoBeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey("Formulario");
				this.setActualFormatoForeignKey(formatoBeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSolicitudVacacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = solicitudvacacionValidator.getInvalidValues(this.solicitudvacacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SolicitudVacacion solicitudvacacion,List<SolicitudVacacion> solicitudvacacions) throws Exception {
		try	{		
			SolicitudVacacionConstantesFunciones.actualizarLista(solicitudvacacion,solicitudvacacions,this.solicitudvacacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SolicitudVacacion solicitudvacacion,List<SolicitudVacacion> solicitudvacacions) throws Exception {
		try	{			
			SolicitudVacacionConstantesFunciones.actualizarSelectedLista(solicitudvacacion,solicitudvacacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SolicitudVacacion> solicitudvacacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				solicitudvacacionsLocal=this.solicitudvacacionLogic.getSolicitudVacacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				solicitudvacacionsLocal=this.solicitudvacacions;
			}
			//ARCHITECTURE
		
			for(SolicitudVacacion solicitudvacacionLocal:solicitudvacacionsLocal) {
				if(this.permiteMantenimiento(solicitudvacacionLocal) && solicitudvacacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SolicitudVacacionConstantesFunciones.getSolicitudVacacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_empresaSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_sucursalSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.IDEMPLEADOJEFE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_empleado_jefeSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_empleadoSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_estructuraSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.IDESTADOSOLICITUDNOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_estado_solicitud_nomiSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.IDFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_formatoSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelsecuencialSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.FECHASOLICITA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelfecha_solicitaSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.FECHAEJECUTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelfecha_ejecutaSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.NUMEROHORAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelnumero_horasSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.COSTOUNITARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelcosto_unitarioSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelcosto_totalSolicitudVacacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudVacacionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabeldescripcionSolicitudVacacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_empresaSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_sucursalSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_empleado_jefeSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_empleadoSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_estructuraSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_estado_solicitud_nomiSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelid_formatoSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelsecuencialSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelfecha_solicitaSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelfecha_ejecutaSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelnumero_horasSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelcosto_unitarioSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelcosto_totalSolicitudVacacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudVacacion.jLabeldescripcionSolicitudVacacion,"");
		
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
		this.iIdNuevoSolicitudVacacion--;	
		
		
		this.solicitudvacacionAux=new SolicitudVacacion();
		
		this.solicitudvacacionAux.setId(this.iIdNuevoSolicitudVacacion);
		this.solicitudvacacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.solicitudvacacionLogic.getSolicitudVacacions().add(this.solicitudvacacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.solicitudvacacions.add(this.solicitudvacacionAux);
		}
		//ARCHITECTURE
		
		this.solicitudvacacion=this.solicitudvacacionAux;
		
		if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSolicitudVacacion(this.solicitudvacacion);
			this.setVariablesObjetoActualToFormularioForeignKeySolicitudVacacion(this.solicitudvacacion);
		}
				
		//this.setDefaultControlesSolicitudVacacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySolicitudVacacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySolicitudVacacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySolicitudVacacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSolicitudVacacion(this.solicitudvacacionBean,this.solicitudvacacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SolicitudVacacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.solicitudvacacionSessionBean.getConGuardarRelaciones()) {
			classes=SolicitudVacacionConstantesFunciones.getClassesRelationshipsOfSolicitudVacacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.solicitudvacacionReturnGeneral=solicitudvacacionLogic.procesarEventosSolicitudVacacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.solicitudvacacionLogic.getSolicitudVacacions(),this.solicitudvacacion,this.solicitudvacacionParameterGeneral,this.isEsNuevoSolicitudVacacion,classes);//this.solicitudvacacionLogic.getSolicitudVacacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSolicitudVacacion(this.solicitudvacacionReturnGeneral,this.solicitudvacacionBean,false);
		
		if(this.solicitudvacacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySolicitudVacacion(this.solicitudvacacionReturnGeneral.getSolicitudVacacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSolicitudVacacion(this.solicitudvacacionReturnGeneral.getSolicitudVacacion());
		}
		
		if(this.solicitudvacacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSolicitudVacacion(this.solicitudvacacionReturnGeneral.getSolicitudVacacion(),classes);//this.solicitudvacacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySolicitudVacacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySolicitudVacacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.RecargarFormSolicitudVacacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSolicitudVacacion(false);
						
			if(solicitudvacacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSolicitudVacacion();
			}
			
			this.actualizarVisualTableDatosSolicitudVacacion();
			
			this.jTableDatosSolicitudVacacion.setRowSelectionInterval(this.getIndiceNuevoSolicitudVacacion(), this.getIndiceNuevoSolicitudVacacion());
			
			this.seleccionarFilaTablaSolicitudVacacionActual();
						
			this.actualizarEstadoCeldasBotonesSolicitudVacacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSolicitudVacacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldsecuencialSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarsecuencialSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_solicitaSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarfecha_solicitaSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_ejecutaSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarfecha_ejecutaSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldnumero_horasSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarnumero_horasSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_unitarioSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarcosto_unitarioSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_totalSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarcosto_totalSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jTextAreadescripcionSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activardescripcionSolicitudVacacion);	
		//
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarid_empresaSolicitudVacacion);//
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarid_sucursalSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarid_empleado_jefeSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarid_empleadoSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarid_estructuraSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarid_estado_solicitud_nomiSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.setEnabled(isHabilitar && this.solicitudvacacionConstantesFunciones.activarid_formatoSolicitudVacacion);
	};
	
	public void setDefaultControlesSolicitudVacacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSolicitudVacacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.solicitudvacacionSessionBean.setConGuardarRelaciones(true);			
			this.solicitudvacacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSolicitudVacacion.jTabbedPaneRelacionesSolicitudVacacion.setVisible(true);
			
					
		} else {
			//this.solicitudvacacionSessionBean.setConGuardarRelaciones(false);			
			this.solicitudvacacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSolicitudVacacion.jTabbedPaneRelacionesSolicitudVacacion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSolicitudVacacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacionLogic.getSolicitudVacacions()) {
				if(solicitudvacacionAux.getId().equals(this.iIdNuevoSolicitudVacacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacions) {
				if(solicitudvacacionAux.getId().equals(this.iIdNuevoSolicitudVacacion)) {
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
	
	public int getIndiceActualSolicitudVacacion(SolicitudVacacion solicitudvacacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacionLogic.getSolicitudVacacions()) {
				if(solicitudvacacionAux.getId().equals(solicitudvacacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacions) {
				if(solicitudvacacionAux.getId().equals(solicitudvacacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSolicitudVacacion(SolicitudVacacion solicitudvacacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacionLogic.getSolicitudVacacions()) {
				if(solicitudvacacionAux.getSolicitudVacacionOriginal().getId().equals(solicitudvacacionOriginal.getId())) {
					existe=true;
					solicitudvacacionOriginal.setId(solicitudvacacionAux.getId());
					solicitudvacacionOriginal.setVersionRow(solicitudvacacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacions) {
				if(solicitudvacacionAux.getSolicitudVacacionOriginal().getId().equals(solicitudvacacionOriginal.getId())) {
					existe=true;
					solicitudvacacionOriginal.setId(solicitudvacacionAux.getId());
					solicitudvacacionOriginal.setVersionRow(solicitudvacacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSolicitudVacacion(Boolean esParaCancelar) throws Exception {
		solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
		solicitudvacacionAux=new SolicitudVacacion();
		
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacionLogic.getSolicitudVacacions()) {
					if(solicitudvacacionAux.getId()<0) {
						solicitudvacacionsAux.add(solicitudvacacionAux);
					}		
				}
				this.iIdNuevoSolicitudVacacion=0L;
				this.solicitudvacacionLogic.getSolicitudVacacions().removeAll(solicitudvacacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacions) {
					if(solicitudvacacionAux.getId()<0) {
						solicitudvacacionsAux.add(solicitudvacacionAux);
					}		
				}
				this.iIdNuevoSolicitudVacacion=0L;
				this.solicitudvacacions.removeAll(solicitudvacacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSolicitudVacacion 
					&& this.solicitudvacacionLogic.getSolicitudVacacions().size()>0
					) {
					solicitudvacacionAux=this.solicitudvacacionLogic.getSolicitudVacacions().get(this.solicitudvacacionLogic.getSolicitudVacacions().size() - 1);
				
					if(solicitudvacacionAux.getId()<0) {
						this.solicitudvacacionLogic.getSolicitudVacacions().remove(solicitudvacacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSolicitudVacacion && this.solicitudvacacions.size()>0) {
					solicitudvacacionAux=this.solicitudvacacions.get(this.solicitudvacacions.size() - 1);
				
					if(solicitudvacacionAux.getId()<0) {
						this.solicitudvacacions.remove(solicitudvacacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSolicitudVacacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(solicitudvacacion.getId()<0) {
				this.solicitudvacacionLogic.getSolicitudVacacions().remove(this.solicitudvacacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(solicitudvacacion.getId()<0) {
				this.solicitudvacacions.remove(this.solicitudvacacion);
			}
		}			
	}
	
	public void setEstadosInicialesSolicitudVacacion(List<SolicitudVacacion> solicitudvacacionsAux) throws Exception {
		SolicitudVacacionConstantesFunciones.setEstadosInicialesSolicitudVacacion(solicitudvacacionsAux);
	}
	
	public void setEstadosInicialesSolicitudVacacion(SolicitudVacacion solicitudvacacionAux) throws Exception {
		SolicitudVacacionConstantesFunciones.setEstadosInicialesSolicitudVacacion(solicitudvacacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSolicitudVacacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSolicitudVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSolicitudVacacionActual()) {
				if(!this.isEsNuevoSolicitudVacacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSolicitudVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSolicitudVacacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSolicitudVacacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Solicitud Vacacion ?", "MANTENIMIENTO DE Solicitud Vacacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSolicitudVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SolicitudVacacion solicitudvacacion) throws Exception {
		SolicitudVacacionConstantesFunciones.seleccionarAsignar(this.solicitudvacacion,solicitudvacacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSolicitudVacacion=this.isPermisoActualizarOriginalSolicitudVacacion;
			
			
			this.seleccionarAsignar(solicitudvacacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SolicitudVacacionConstantesFunciones.quitarEspaciosSolicitudVacacion(this.solicitudvacacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSolicitudVacacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.solicitudvacacionSessionBean.setsFuncionBusquedaRapida(this.solicitudvacacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSolicitudVacacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSolicitudVacacion(esParaCancelar);				
				this.cancelarNuevoSolicitudVacacion(esParaCancelar);								
			}
			
			this.solicitudvacacion=new SolicitudVacacion();
			
			this.inicializarSolicitudVacacion();
			
			this.actualizarEstadoCeldasBotonesSolicitudVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSolicitudVacacion() throws Exception {
		try {
			SolicitudVacacionConstantesFunciones.inicializarSolicitudVacacion(this.solicitudvacacion);
			
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
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.solicitudvacacionLogic.getSolicitudVacacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSolicitudVacacions(String sAccionBusqueda,List<SolicitudVacacion> solicitudvacacionsParaReportes) throws Exception {
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
					sPathReporteFinal="SolicitudVacacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SolicitudVacacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SolicitudVacacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SolicitudVacacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Solicitud Vacaciones");		
		parameters.put("busquedapor", SolicitudVacacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSolicitudVacacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SolicitudVacacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SolicitudVacacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSolicitudVacacion=new JRBeanArrayDataSource(SolicitudVacacionJInternalFrame.TraerSolicitudVacacionBeans(solicitudvacacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSolicitudVacacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SolicitudVacacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SolicitudVacacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SolicitudVacacionBean.TraerSolicitudVacacionBeans(solicitudvacacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteSolicitudVacacions(sAccionBusqueda,sTipoArchivoReporte,solicitudvacacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSolicitudVacacions(sAccionBusqueda,sTipoArchivoReporte,solicitudvacacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSolicitudVacacionActionPerformed(null);
					//this.generarExcelReporteSolicitudVacacions(sAccionBusqueda,sTipoArchivoReporte,solicitudvacacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSolicitudVacacions(sAccionBusqueda,sTipoArchivoReporte,solicitudvacacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSolicitudVacacions(sAccionBusqueda,sTipoArchivoReporte,solicitudvacacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSolicitudVacacions(sAccionBusqueda,sTipoArchivoReporte,solicitudvacacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSolicitudVacacions(String sAccionBusqueda,String sTipoArchivoReporte,List<SolicitudVacacion> solicitudvacacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudvacacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SolicitudVacacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSolicitudVacacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SolicitudVacacion solicitudvacacion : solicitudvacacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SolicitudVacacionConstantesFunciones.generarExcelReporteDataSolicitudVacacion("NORMAL",row,workbook,solicitudvacacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Vacacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSolicitudVacacion(String sTipo,Row row,Workbook workbook) {
		
		SolicitudVacacionConstantesFunciones.generarExcelReporteHeaderSolicitudVacacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSolicitudVacacions(String sAccionBusqueda,String sTipoArchivoReporte,List<SolicitudVacacion> solicitudvacacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudvacacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SolicitudVacacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SolicitudVacacion solicitudvacacion : solicitudvacacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SolicitudVacacionConstantesFunciones.getSolicitudVacacionDescripcion(solicitudvacacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getempleadojefe_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getestadosolicitudnomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getformato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getfecha_solicita());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getfecha_ejecuta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getnumero_horas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getcosto_unitario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudvacacion.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Vacacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSolicitudVacacions(String sAccionBusqueda,String sTipoArchivoReporte,List<SolicitudVacacion> solicitudvacacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SolicitudVacacion> solicitudvacacionsRespaldo=null;
		
		classes=SolicitudVacacionConstantesFunciones.getClassesRelationshipsOfSolicitudVacacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.solicitudvacacionLogic.setDatosCliente(this.datosCliente);
		this.solicitudvacacionLogic.setDatosDeep(this.datosDeep);
		this.solicitudvacacionLogic.setIsConDeep(true);
		
		solicitudvacacionsRespaldo=this.solicitudvacacionLogic.getSolicitudVacacions();
		
		this.solicitudvacacionLogic.setSolicitudVacacions(solicitudvacacionsParaReportes);	
		this.solicitudvacacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		solicitudvacacionsParaReportes=this.solicitudvacacionLogic.getSolicitudVacacions();
		this.solicitudvacacionLogic.setSolicitudVacacions(solicitudvacacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudvacacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SolicitudVacacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSolicitudVacacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SolicitudVacacion solicitudvacacion : solicitudvacacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSolicitudVacacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SolicitudVacacionConstantesFunciones.generarExcelReporteDataSolicitudVacacion("NORMAL",row,workbook,solicitudvacacion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SolicitudVacacionConstantesFunciones.getSolicitudVacacionDescripcion(solicitudvacacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Vacacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSolicitudVacacion() throws Exception {		
		this.startProcessSolicitudVacacion(true);
	}
	
	public void startProcessSolicitudVacacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSolicitudVacacion ,this.jPanelParametrosReportesSolicitudVacacion, this.jScrollPanelDatosSolicitudVacacion,this.jPanelPaginacionSolicitudVacacion, this.jScrollPanelDatosEdicionSolicitudVacacion, this.jPanelAccionesSolicitudVacacion,this.jPanelAccionesFormularioSolicitudVacacion,this.jmenuBarSolicitudVacacion,this.jmenuBarDetalleSolicitudVacacion,this.jTtoolBarSolicitudVacacion,this.jTtoolBarDetalleSolicitudVacacion);		
		
		final JTabbedPane jTabbedPaneBusquedasSolicitudVacacion=this.jTabbedPaneBusquedasSolicitudVacacion; 
		
		final JPanel jPanelParametrosReportesSolicitudVacacion=this.jPanelParametrosReportesSolicitudVacacion;
		//final JScrollPane jScrollPanelDatosSolicitudVacacion=this.jScrollPanelDatosSolicitudVacacion;
		final JTable jTableDatosSolicitudVacacion=this.jTableDatosSolicitudVacacion;		
		final JPanel jPanelPaginacionSolicitudVacacion=this.jPanelPaginacionSolicitudVacacion;
		//final JScrollPane jScrollPanelDatosEdicionSolicitudVacacion=this.jScrollPanelDatosEdicionSolicitudVacacion;
		final JPanel jPanelAccionesSolicitudVacacion=this.jPanelAccionesSolicitudVacacion;
		
		JPanel jPanelCamposAuxiliarSolicitudVacacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSolicitudVacacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			jPanelCamposAuxiliarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jPanelCamposSolicitudVacacion;
			jPanelAccionesFormularioAuxiliarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jPanelAccionesFormularioSolicitudVacacion;
		}
		
		final JPanel jPanelCamposSolicitudVacacion=jPanelCamposAuxiliarSolicitudVacacion;
		final JPanel jPanelAccionesFormularioSolicitudVacacion=jPanelAccionesFormularioAuxiliarSolicitudVacacion;
		
		
		final JMenuBar jmenuBarSolicitudVacacion=this.jmenuBarSolicitudVacacion;
		final JToolBar jTtoolBarSolicitudVacacion=this.jTtoolBarSolicitudVacacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSolicitudVacacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSolicitudVacacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			jmenuBarDetalleAuxiliarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jmenuBarDetalleSolicitudVacacion;
			jTtoolBarDetalleAuxiliarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jTtoolBarDetalleSolicitudVacacion;
		}
		
		final JMenuBar jmenuBarDetalleSolicitudVacacion=jmenuBarDetalleAuxiliarSolicitudVacacion;
		final JToolBar jTtoolBarDetalleSolicitudVacacion=jTtoolBarDetalleAuxiliarSolicitudVacacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSolicitudVacacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSolicitudVacacion;
			processRunnable.jTableDatos=jTableDatosSolicitudVacacion;
			processRunnable.jPanelCampos=jPanelCamposSolicitudVacacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionSolicitudVacacion;
			processRunnable.jPanelAcciones=jPanelAccionesSolicitudVacacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSolicitudVacacion;
			
			
			processRunnable.jmenuBar=jmenuBarSolicitudVacacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSolicitudVacacion;
			processRunnable.jTtoolBar=jTtoolBarSolicitudVacacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSolicitudVacacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSolicitudVacacion ,jPanelParametrosReportesSolicitudVacacion,jTableDatosSolicitudVacacion, /*jScrollPanelDatosSolicitudVacacion,*/jPanelCamposSolicitudVacacion,jPanelPaginacionSolicitudVacacion, /*jScrollPanelDatosEdicionSolicitudVacacion,*/ jPanelAccionesSolicitudVacacion,jPanelAccionesFormularioSolicitudVacacion,jmenuBarSolicitudVacacion,jmenuBarDetalleSolicitudVacacion,jTtoolBarSolicitudVacacion,jTtoolBarDetalleSolicitudVacacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSolicitudVacacion ,jPanelParametrosReportesSolicitudVacacion, jScrollPanelDatosSolicitudVacacion,jPanelPaginacionSolicitudVacacion, jScrollPanelDatosEdicionSolicitudVacacion, jPanelAccionesSolicitudVacacion,jPanelAccionesFormularioSolicitudVacacion,jmenuBarSolicitudVacacion,jmenuBarDetalleSolicitudVacacion,jTtoolBarSolicitudVacacion,jTtoolBarDetalleSolicitudVacacion);
						
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
	
	public void finishProcessSolicitudVacacion() {// throws Exception 
		this.finishProcessSolicitudVacacion(true);
	}
	
	public void finishProcessSolicitudVacacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSolicitudVacacion ,this.jPanelParametrosReportesSolicitudVacacion, this.jScrollPanelDatosSolicitudVacacion,this.jPanelPaginacionSolicitudVacacion, this.jScrollPanelDatosEdicionSolicitudVacacion, this.jPanelAccionesSolicitudVacacion,this.jPanelAccionesFormularioSolicitudVacacion,this.jmenuBarSolicitudVacacion,this.jmenuBarDetalleSolicitudVacacion,this.jTtoolBarSolicitudVacacion,this.jTtoolBarDetalleSolicitudVacacion);		
		
		final JTabbedPane jTabbedPaneBusquedasSolicitudVacacion=this.jTabbedPaneBusquedasSolicitudVacacion; 
		
		final JPanel jPanelParametrosReportesSolicitudVacacion=this.jPanelParametrosReportesSolicitudVacacion;
		//final JScrollPane jScrollPanelDatosSolicitudVacacion=this.jScrollPanelDatosSolicitudVacacion;
		final JTable jTableDatosSolicitudVacacion=this.jTableDatosSolicitudVacacion;		
		final JPanel jPanelPaginacionSolicitudVacacion=this.jPanelPaginacionSolicitudVacacion;
		//final JScrollPane jScrollPanelDatosEdicionSolicitudVacacion=this.jScrollPanelDatosEdicionSolicitudVacacion;
		final JPanel jPanelAccionesSolicitudVacacion=this.jPanelAccionesSolicitudVacacion;
		
		JPanel jPanelCamposAuxiliarSolicitudVacacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSolicitudVacacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			jPanelCamposAuxiliarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jPanelCamposSolicitudVacacion;
			jPanelAccionesFormularioAuxiliarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jPanelAccionesFormularioSolicitudVacacion;
		}
		
		final JPanel jPanelCamposSolicitudVacacion=jPanelCamposAuxiliarSolicitudVacacion;
		final JPanel jPanelAccionesFormularioSolicitudVacacion=jPanelAccionesFormularioAuxiliarSolicitudVacacion;
		
		
		final JMenuBar jmenuBarSolicitudVacacion=this.jmenuBarSolicitudVacacion;		
		final JToolBar jTtoolBarSolicitudVacacion=this.jTtoolBarSolicitudVacacion;
				
		JMenuBar jmenuBarDetalleAuxiliarSolicitudVacacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSolicitudVacacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			jmenuBarDetalleAuxiliarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jmenuBarDetalleSolicitudVacacion;
			jTtoolBarDetalleAuxiliarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jTtoolBarDetalleSolicitudVacacion;		
		}
		
		final JMenuBar jmenuBarDetalleSolicitudVacacion=jmenuBarDetalleAuxiliarSolicitudVacacion;
		final JToolBar jTtoolBarDetalleSolicitudVacacion=jTtoolBarDetalleAuxiliarSolicitudVacacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSolicitudVacacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSolicitudVacacion;
			processRunnable.jTableDatos=jTableDatosSolicitudVacacion;
			processRunnable.jPanelCampos=jPanelCamposSolicitudVacacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionSolicitudVacacion;
			processRunnable.jPanelAcciones=jPanelAccionesSolicitudVacacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSolicitudVacacion;
			
			
			processRunnable.jmenuBar=jmenuBarSolicitudVacacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSolicitudVacacion;
			processRunnable.jTtoolBar=jTtoolBarSolicitudVacacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSolicitudVacacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSolicitudVacacion ,jPanelParametrosReportesSolicitudVacacion, jTableDatosSolicitudVacacion,/*jScrollPanelDatosSolicitudVacacion,*/jPanelCamposSolicitudVacacion,jPanelPaginacionSolicitudVacacion, /*jScrollPanelDatosEdicionSolicitudVacacion,*/ jPanelAccionesSolicitudVacacion,jPanelAccionesFormularioSolicitudVacacion,jmenuBarSolicitudVacacion,jmenuBarDetalleSolicitudVacacion,jTtoolBarSolicitudVacacion,jTtoolBarDetalleSolicitudVacacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSolicitudVacacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSolicitudVacacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSolicitudVacacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSolicitudVacacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSolicitudVacacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSolicitudVacacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSolicitudVacacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSolicitudVacacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSolicitudVacacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.solicitudvacacionConstantesFunciones.getsFinalQuerySolicitudVacacion();
		String  finalQueryPaginacionTodos=this.solicitudvacacionConstantesFunciones.getsFinalQuerySolicitudVacacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SolicitudVacacionConstantesFunciones.getArrayColumnasGlobalesNoSolicitudVacacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SolicitudVacacionConstantesFunciones.getArrayColumnasGlobalesSolicitudVacacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SolicitudVacacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.solicitudvacacionsEliminados= new ArrayList<SolicitudVacacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSolicitudVacacion();
		
				///*SolicitudVacacionSessionBean*/this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
			
			if(this.solicitudvacacionSessionBean==null) {
				this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
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
					this.iNumeroPaginacion=SolicitudVacacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SolicitudVacacionConstantesFunciones.getClassesForeignKeysOfSolicitudVacacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/solicitudvacacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			solicitudvacacionsAux= new ArrayList<SolicitudVacacion>();
			
				
			solicitudvacacionLogic.setDatosCliente(this.datosCliente);
			solicitudvacacionLogic.setDatosDeep(this.datosDeep);
			solicitudvacacionLogic.setIsConDeep(true);
			
			
			solicitudvacacionLogic.getSolicitudVacacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					solicitudvacacionLogic.getTodosSolicitudVacacions(finalQueryGlobal,pagination);
					
					//solicitudvacacionLogic.getTodosSolicitudVacacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(solicitudvacacionLogic.getSolicitudVacacions()==null|| solicitudvacacionLogic.getSolicitudVacacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							solicitudvacacionsAux= new ArrayList<SolicitudVacacion>();
							solicitudvacacionsAux.addAll(solicitudvacacionLogic.getSolicitudVacacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacionsAux= new ArrayList<SolicitudVacacion>();
							solicitudvacacionsAux.addAll(solicitudvacacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							solicitudvacacionLogic.getTodosSolicitudVacacions(finalQueryGlobal+"",this.pagination);												
							
							//solicitudvacacionLogic.getTodosSolicitudVacacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSolicitudVacacions("Todos",solicitudvacacionLogic.getSolicitudVacacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());					
							solicitudvacacionLogic.getSolicitudVacacions().addAll(solicitudvacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacions=new ArrayList<SolicitudVacacion>();
							solicitudvacacions.addAll(solicitudvacacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSolicitudVacacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSolicitudVacacion=this.idActual;
				
				} else if(this.idSolicitudVacacionActual!=null && this.idSolicitudVacacionActual!=0L) {
					idSolicitudVacacion=idSolicitudVacacionActual;
				}
				
					
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndicePorId(idSolicitudVacacion);
				
				this.solicitudvacacions=new ArrayList<SolicitudVacacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					solicitudvacacionLogic.getEntity(idSolicitudVacacion);
					
					//solicitudvacacionLogic.getEntityWithConnection(idSolicitudVacacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());
					solicitudvacacionLogic.getSolicitudVacacions().add(solicitudvacacionLogic.getSolicitudVacacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudvacacions=new ArrayList<SolicitudVacacion>();
					this.solicitudvacacions.add(solicitudvacacion);
				}
				
				if(solicitudvacacionLogic.getSolicitudVacacion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudvacacionLogic.getSolicitudVacacionsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudvacacionLogic.getSolicitudVacacions()==null||solicitudvacacionLogic.getSolicitudVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudvacacions==null|| solicitudvacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
						solicitudvacacionsAux.addAll(solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
							solicitudvacacionsAux.addAll(solicitudvacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudvacacionLogic.getSolicitudVacacionsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudVacacions("FK_IdEmpleado",solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudVacacions("FK_IdEmpleado",solicitudvacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());
						solicitudvacacionLogic.getSolicitudVacacions().addAll(solicitudvacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacions=new ArrayList<SolicitudVacacion>();
							solicitudvacacions.addAll(solicitudvacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleadoJefe")) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudvacacionLogic.getSolicitudVacacionsFK_IdEmpleadoJefe(finalQueryGlobal,pagination,id_empleado_jefeFK_IdEmpleadoJefe);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudvacacionLogic.getSolicitudVacacions()==null||solicitudvacacionLogic.getSolicitudVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudvacacions==null|| solicitudvacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
						solicitudvacacionsAux.addAll(solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
							solicitudvacacionsAux.addAll(solicitudvacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudvacacionLogic.getSolicitudVacacionsFK_IdEmpleadoJefe(finalQueryGlobal,pagination,id_empleado_jefeFK_IdEmpleadoJefe);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudVacacions("FK_IdEmpleadoJefe",solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudVacacions("FK_IdEmpleadoJefe",solicitudvacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());
						solicitudvacacionLogic.getSolicitudVacacions().addAll(solicitudvacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacions=new ArrayList<SolicitudVacacion>();
							solicitudvacacions.addAll(solicitudvacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudvacacionLogic.getSolicitudVacacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudvacacionLogic.getSolicitudVacacions()==null||solicitudvacacionLogic.getSolicitudVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudvacacions==null|| solicitudvacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
						solicitudvacacionsAux.addAll(solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
							solicitudvacacionsAux.addAll(solicitudvacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudvacacionLogic.getSolicitudVacacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudVacacions("FK_IdEmpresa",solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudVacacions("FK_IdEmpresa",solicitudvacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());
						solicitudvacacionLogic.getSolicitudVacacions().addAll(solicitudvacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacions=new ArrayList<SolicitudVacacion>();
							solicitudvacacions.addAll(solicitudvacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoSolicitudNomi")) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudvacacionLogic.getSolicitudVacacionsFK_IdEstadoSolicitudNomi(finalQueryGlobal,pagination,id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudvacacionLogic.getSolicitudVacacions()==null||solicitudvacacionLogic.getSolicitudVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudvacacions==null|| solicitudvacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
						solicitudvacacionsAux.addAll(solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
							solicitudvacacionsAux.addAll(solicitudvacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudvacacionLogic.getSolicitudVacacionsFK_IdEstadoSolicitudNomi(finalQueryGlobal,pagination,id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudVacacions("FK_IdEstadoSolicitudNomi",solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudVacacions("FK_IdEstadoSolicitudNomi",solicitudvacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());
						solicitudvacacionLogic.getSolicitudVacacions().addAll(solicitudvacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacions=new ArrayList<SolicitudVacacion>();
							solicitudvacacions.addAll(solicitudvacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudvacacionLogic.getSolicitudVacacionsFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudvacacionLogic.getSolicitudVacacions()==null||solicitudvacacionLogic.getSolicitudVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudvacacions==null|| solicitudvacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
						solicitudvacacionsAux.addAll(solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
							solicitudvacacionsAux.addAll(solicitudvacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudvacacionLogic.getSolicitudVacacionsFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudVacacions("FK_IdEstructura",solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudVacacions("FK_IdEstructura",solicitudvacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());
						solicitudvacacionLogic.getSolicitudVacacions().addAll(solicitudvacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacions=new ArrayList<SolicitudVacacion>();
							solicitudvacacions.addAll(solicitudvacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFormato")) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudvacacionLogic.getSolicitudVacacionsFK_IdFormato(finalQueryGlobal,pagination,id_formatoFK_IdFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudvacacionLogic.getSolicitudVacacions()==null||solicitudvacacionLogic.getSolicitudVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudvacacions==null|| solicitudvacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
						solicitudvacacionsAux.addAll(solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
							solicitudvacacionsAux.addAll(solicitudvacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudvacacionLogic.getSolicitudVacacionsFK_IdFormato(finalQueryGlobal,pagination,id_formatoFK_IdFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudVacacions("FK_IdFormato",solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudVacacions("FK_IdFormato",solicitudvacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());
						solicitudvacacionLogic.getSolicitudVacacions().addAll(solicitudvacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacions=new ArrayList<SolicitudVacacion>();
							solicitudvacacions.addAll(solicitudvacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudvacacionLogic.getSolicitudVacacionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudvacacionLogic.getSolicitudVacacions()==null||solicitudvacacionLogic.getSolicitudVacacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudvacacions==null|| solicitudvacacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
						solicitudvacacionsAux.addAll(solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacionsAux=new ArrayList<SolicitudVacacion>();
							solicitudvacacionsAux.addAll(solicitudvacacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudvacacionLogic.getSolicitudVacacionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudVacacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudVacacions("FK_IdSucursal",solicitudvacacionLogic.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudVacacions("FK_IdSucursal",solicitudvacacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());
						solicitudvacacionLogic.getSolicitudVacacions().addAll(solicitudvacacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacions=new ArrayList<SolicitudVacacion>();
							solicitudvacacions.addAll(solicitudvacacionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSolicitudVacacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSolicitudVacacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=solicitudvacacionLogic.getSolicitudVacacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=solicitudvacacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=solicitudvacacionLogic.getSolicitudVacacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=solicitudvacacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SolicitudVacacion solicitudvacacion) {
		Boolean permite=true;
		
		if(this.solicitudvacacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SolicitudVacacionConstantesFunciones.getOrderByListaSolicitudVacacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SolicitudVacacionConstantesFunciones.getOrderByListaSolicitudVacacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudVacacion solicitudvacacion:solicitudvacacionLogic.getSolicitudVacacions()) {
				if(solicitudvacacion.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudvacacionTotales=solicitudvacacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudVacacion solicitudvacacion:this.solicitudvacacions) {
				if(solicitudvacacion.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudvacacionTotales=solicitudvacacion;
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
			this.solicitudvacacionAux=new SolicitudVacacion();
			this.solicitudvacacionAux.setsType(Constantes2.S_TOTALES);
			this.solicitudvacacionAux.setIsNew(false);
			this.solicitudvacacionAux.setIsChanged(false);
			this.solicitudvacacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SolicitudVacacionConstantesFunciones.TotalizarValoresFilaSolicitudVacacion(this.solicitudvacacionLogic.getSolicitudVacacions(),this.solicitudvacacionAux);
				
				this.solicitudvacacionLogic.getSolicitudVacacions().add(this.solicitudvacacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SolicitudVacacionConstantesFunciones.TotalizarValoresFilaSolicitudVacacion(this.solicitudvacacions,this.solicitudvacacionAux);
				
				this.solicitudvacacions.add(this.solicitudvacacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		solicitudvacacionTotales=new SolicitudVacacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.solicitudvacacionLogic.getSolicitudVacacions().remove(solicitudvacacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.solicitudvacacions.remove(solicitudvacacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		solicitudvacacionTotales=new SolicitudVacacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudVacacion solicitudvacacion:solicitudvacacionLogic.getSolicitudVacacions()) {
				if(solicitudvacacion.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudvacacionTotales=solicitudvacacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SolicitudVacacionConstantesFunciones.TotalizarValoresFilaSolicitudVacacion(this.solicitudvacacionLogic.getSolicitudVacacions(),solicitudvacacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudVacacion solicitudvacacion:this.solicitudvacacions) {
				if(solicitudvacacion.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudvacacionTotales=solicitudvacacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SolicitudVacacionConstantesFunciones.TotalizarValoresFilaSolicitudVacacion(this.solicitudvacacions,solicitudvacacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSolicitudVacacionsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudVacacionsFK_IdEmpleadoJefe()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleadoJefe";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudVacacionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudVacacionsFK_IdEstadoSolicitudNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoSolicitudNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudVacacionsFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudVacacionsFK_IdFormato()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudVacacionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSolicitudVacacionsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudvacacionLogic.getSolicitudVacacionsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudVacacionsFK_IdEmpleadoJefe(String sFinalQuery,Long id_empleado_jefe)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudvacacionLogic.getSolicitudVacacionsFK_IdEmpleadoJefe(sFinalQuery,this.pagination,id_empleado_jefe);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudVacacionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudvacacionLogic.getSolicitudVacacionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudVacacionsFK_IdEstadoSolicitudNomi(String sFinalQuery,Long id_estado_solicitud_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudvacacionLogic.getSolicitudVacacionsFK_IdEstadoSolicitudNomi(sFinalQuery,this.pagination,id_estado_solicitud_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudVacacionsFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudvacacionLogic.getSolicitudVacacionsFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudVacacionsFK_IdFormato(String sFinalQuery,Long id_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudvacacionLogic.getSolicitudVacacionsFK_IdFormato(sFinalQuery,this.pagination,id_formato);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudVacacionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudvacacionLogic.getSolicitudVacacionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosSolicitudVacacion() {
		this.isPermisoTodoSolicitudVacacion=false;
		this.isPermisoNuevoSolicitudVacacion=false;
		this.isPermisoActualizarSolicitudVacacion=false;
		this.isPermisoActualizarOriginalSolicitudVacacion=false;
		this.isPermisoEliminarSolicitudVacacion=false;
		this.isPermisoGuardarCambiosSolicitudVacacion=false;
		this.isPermisoConsultaSolicitudVacacion=false;
		this.isPermisoBusquedaSolicitudVacacion=false;
		this.isPermisoReporteSolicitudVacacion=false;		
		this.isPermisoOrdenSolicitudVacacion=false;		
		this.isPermisoPaginacionMedioSolicitudVacacion=false;		
		this.isPermisoPaginacionAltoSolicitudVacacion=false;
		this.isPermisoPaginacionTodoSolicitudVacacion=false;
		this.isPermisoCopiarSolicitudVacacion=false;		
		this.isPermisoVerFormSolicitudVacacion=false;		
		this.isPermisoDuplicarSolicitudVacacion=false;		
		this.isPermisoOrdenSolicitudVacacion=false;		
	}
	
	public void setPermisosUsuarioSolicitudVacacion(Boolean isPermiso) {
		this.isPermisoTodoSolicitudVacacion=isPermiso;
		this.isPermisoNuevoSolicitudVacacion=isPermiso;
		this.isPermisoActualizarSolicitudVacacion=isPermiso;
		this.isPermisoActualizarOriginalSolicitudVacacion=isPermiso;
		this.isPermisoEliminarSolicitudVacacion=isPermiso;
		this.isPermisoGuardarCambiosSolicitudVacacion=isPermiso;
		this.isPermisoConsultaSolicitudVacacion=isPermiso;
		this.isPermisoBusquedaSolicitudVacacion=isPermiso;
		this.isPermisoReporteSolicitudVacacion=isPermiso;
		this.isPermisoOrdenSolicitudVacacion=isPermiso;		
		this.isPermisoPaginacionMedioSolicitudVacacion=isPermiso;		
		this.isPermisoPaginacionAltoSolicitudVacacion=isPermiso;		
		this.isPermisoPaginacionTodoSolicitudVacacion=isPermiso;		
		this.isPermisoCopiarSolicitudVacacion=isPermiso;		
		this.isPermisoVerFormSolicitudVacacion=isPermiso;		
		this.isPermisoDuplicarSolicitudVacacion=isPermiso;
		this.isPermisoOrdenSolicitudVacacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSolicitudVacacion(Boolean isPermiso) {
		//this.isPermisoTodoSolicitudVacacion=isPermiso;
		this.isPermisoNuevoSolicitudVacacion=isPermiso;
		this.isPermisoActualizarSolicitudVacacion=isPermiso;
		this.isPermisoActualizarOriginalSolicitudVacacion=isPermiso;
		this.isPermisoEliminarSolicitudVacacion=isPermiso;
		this.isPermisoGuardarCambiosSolicitudVacacion=isPermiso;
		//this.isPermisoConsultaSolicitudVacacion=isPermiso;
		//this.isPermisoBusquedaSolicitudVacacion=isPermiso;
		//this.isPermisoReporteSolicitudVacacion=isPermiso;
		//this.isPermisoOrdenSolicitudVacacion=isPermiso;		
		//this.isPermisoPaginacionMedioSolicitudVacacion=isPermiso;		
		//this.isPermisoPaginacionAltoSolicitudVacacion=isPermiso;		
		//this.isPermisoPaginacionTodoSolicitudVacacion=isPermiso;		
		//this.isPermisoCopiarSolicitudVacacion=isPermiso;		
		//this.isPermisoDuplicarSolicitudVacacion=isPermiso;
		//this.isPermisoOrdenSolicitudVacacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSolicitudVacacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SolicitudVacacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSolicitudVacacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSolicitudVacacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSolicitudVacacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSolicitudVacacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSolicitudVacacionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSolicitudVacacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SolicitudVacacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SolicitudVacacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSolicitudVacacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSolicitudVacacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSolicitudVacacion=this.isPermisoActualizarSolicitudVacacion;
			this.isPermisoEliminarSolicitudVacacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSolicitudVacacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSolicitudVacacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSolicitudVacacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSolicitudVacacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSolicitudVacacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSolicitudVacacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSolicitudVacacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSolicitudVacacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSolicitudVacacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSolicitudVacacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSolicitudVacacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSolicitudVacacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSolicitudVacacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSolicitudVacacion.setToolTipText(this.jTableDatosSolicitudVacacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSolicitudVacacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSolicitudVacacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SolicitudVacacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SolicitudVacacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSolicitudVacacion() throws Exception {
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
	public void inicializarCombosForeignKeySolicitudVacacionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.empleadojefesForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.estadosolicitudnomisForeignKey=new ArrayList();
				this.formatosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySolicitudVacacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SolicitudVacacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySolicitudVacacionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoJefeListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoSolicitudNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpleadoJefeListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadojefesForeignKey==null||this.empleadojefesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadoJefesForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyEstadoSolicitudNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadosolicitudnomisForeignKey==null||this.estadosolicitudnomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoSolicitudNomiConstantesFunciones.getArrayColumnasGlobalesEstadoSolicitudNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoSolicitudNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoSolicitudNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoSolicitudNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeySolicitudVacacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SolicitudVacacionParameterReturnGeneral solicitudvacacionReturnGeneral=new SolicitudVacacionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.solicitudvacacionConstantesFunciones.cargarid_empresaSolicitudVacacion)
					 || (this.esRecargarFks && this.solicitudvacacionConstantesFunciones.cargarid_empresaSolicitudVacacion)) {

					if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+solicitudvacacionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.solicitudvacacionConstantesFunciones.cargarid_sucursalSolicitudVacacion)
					 || (this.esRecargarFks && this.solicitudvacacionConstantesFunciones.cargarid_sucursalSolicitudVacacion)) {

					if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+solicitudvacacionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEmpleadoJefe="";

				if(((this.empleadojefesForeignKey==null||this.empleadojefesForeignKey.size()<=0) && this.solicitudvacacionConstantesFunciones.cargarid_empleado_jefeSolicitudVacacion)
					 || (this.esRecargarFks && this.solicitudvacacionConstantesFunciones.cargarid_empleado_jefeSolicitudVacacion)) {

					if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoJefe()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleadoJefe=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleadoJefe=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleadoJefe, "");
						finalQueryGlobalEmpleadoJefe+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadoJefesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleadoJefe=" WHERE " + ConstantesSql.ID + "="+solicitudvacacionSessionBean.getlidEmpleadoJefeActual();
					}
				} else {
					finalQueryGlobalEmpleadoJefe="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.solicitudvacacionConstantesFunciones.cargarid_empleadoSolicitudVacacion)
					 || (this.esRecargarFks && this.solicitudvacacionConstantesFunciones.cargarid_empleadoSolicitudVacacion)) {

					if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+solicitudvacacionSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.solicitudvacacionConstantesFunciones.cargarid_estructuraSolicitudVacacion)
					 || (this.esRecargarFks && this.solicitudvacacionConstantesFunciones.cargarid_estructuraSolicitudVacacion)) {

					if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+solicitudvacacionSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalEstadoSolicitudNomi="";

				if(((this.estadosolicitudnomisForeignKey==null||this.estadosolicitudnomisForeignKey.size()<=0) && this.solicitudvacacionConstantesFunciones.cargarid_estado_solicitud_nomiSolicitudVacacion)
					 || (this.esRecargarFks && this.solicitudvacacionConstantesFunciones.cargarid_estado_solicitud_nomiSolicitudVacacion)) {

					if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoSolicitudNomiConstantesFunciones.getArrayColumnasGlobalesEstadoSolicitudNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoSolicitudNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoSolicitudNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoSolicitudNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoSolicitudNomi, "");
						finalQueryGlobalEstadoSolicitudNomi+=EstadoSolicitudNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoSolicitudNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoSolicitudNomi=" WHERE " + ConstantesSql.ID + "="+solicitudvacacionSessionBean.getlidEstadoSolicitudNomiActual();
					}
				} else {
					finalQueryGlobalEstadoSolicitudNomi="NONE";
				}


				String finalQueryGlobalFormato="";

				if(((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0) && this.solicitudvacacionConstantesFunciones.cargarid_formatoSolicitudVacacion)
					 || (this.esRecargarFks && this.solicitudvacacionConstantesFunciones.cargarid_formatoSolicitudVacacion)) {

					if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato, "");
						finalQueryGlobalFormato+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato=" WHERE " + ConstantesSql.ID + "="+solicitudvacacionSessionBean.getlidFormatoActual();
					}
				} else {
					finalQueryGlobalFormato="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				solicitudvacacionReturnGeneral=solicitudvacacionLogic.cargarCombosLoteForeignKeySolicitudVacacion(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEmpleadoJefe,finalQueryGlobalEmpleado,finalQueryGlobalEstructura,finalQueryGlobalEstadoSolicitudNomi,finalQueryGlobalFormato);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=solicitudvacacionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=solicitudvacacionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEmpleadoJefe.equals("NONE")) {
				this.empleadojefesForeignKey=solicitudvacacionReturnGeneral.getempleadojefesForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=solicitudvacacionReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=solicitudvacacionReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalEstadoSolicitudNomi.equals("NONE")) {
				this.estadosolicitudnomisForeignKey=solicitudvacacionReturnGeneral.getestadosolicitudnomisForeignKey();
			}

			if(!finalQueryGlobalFormato.equals("NONE")) {
				this.formatosForeignKey=solicitudvacacionReturnGeneral.getformatosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySolicitudVacacion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEmpleadoJefe();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEstadoSolicitudNomi();
			this.addItemDefectoCombosForeignKeyFormato();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.solicitudvacacionSessionBean==null) {
				this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
			}

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEmpleadoJefe()throws Exception {
		try {

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoJefe()) {
				Empleado empleadojefe=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleadojefe,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleadojefe.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadojefesForeignKey,empleadojefe,true)) {

					this.empleadojefesForeignKey.add(0,empleadojefe);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

	public void addItemDefectoCombosForeignKeyEstadoSolicitudNomi()throws Exception {
		try {

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi()) {
				EstadoSolicitudNomi estadosolicitudnomi=new EstadoSolicitudNomi();
				EstadoSolicitudNomiConstantesFunciones.setEstadoSolicitudNomiDescripcion(estadosolicitudnomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadosolicitudnomi.setId(null);

				if(!EstadoSolicitudNomiConstantesFunciones.ExisteEnLista(this.estadosolicitudnomisForeignKey,estadosolicitudnomi,true)) {

					this.estadosolicitudnomisForeignKey.add(0,estadosolicitudnomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormato()throws Exception {
		try {

			if(!this.solicitudvacacionSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				Formato formato=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formatosForeignKey,formato,true)) {

					this.formatosForeignKey.add(0,formato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySolicitudVacacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySolicitudVacacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySolicitudVacacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.solicitudvacacion.setfecha_solicita(this.parametroGeneralUsuario.getfecha_sistema());
				this.solicitudvacacion.setfecha_ejecuta(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySolicitudVacacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySolicitudVacacion(SolicitudVacacion solicitudvacacion)throws Exception {	
		try {
			
			this.setActualEmpleadoJefeForeignKey(solicitudvacacion.getid_empleado_jefe(),false,"Formulario");
			this.setActualEmpleadoForeignKey(solicitudvacacion.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(solicitudvacacion.getid_estructura(),false,"Formulario");
			this.setActualEstadoSolicitudNomiForeignKey(solicitudvacacion.getid_estado_solicitud_nomi(),false,"Formulario");
			this.setActualFormatoForeignKey(solicitudvacacion.getid_formato(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySolicitudVacacion(SolicitudVacacion solicitudvacacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySolicitudVacacion()throws Exception {	
		try {
			
			this.setActualEmpleadoJefeForeignKey(this.solicitudvacacionConstantesFunciones.getid_empleado_jefe(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.solicitudvacacionConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.solicitudvacacionConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualEstadoSolicitudNomiForeignKey(this.solicitudvacacionConstantesFunciones.getid_estado_solicitud_nomi(),false,"Formulario");
			this.setActualFormatoForeignKey(this.solicitudvacacionConstantesFunciones.getid_formato(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySolicitudVacacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySolicitudVacacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySolicitudVacacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSolicitudVacacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySolicitudVacacion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEmpleadoJefesForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEstadoSolicitudNomisForeignKey("Todos");
			this.cargarCombosFrameFormatosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySolicitudVacacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadoJefesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoSolicitudNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySolicitudVacacion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public SolicitudVacacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SolicitudVacacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SolicitudVacacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean(); 
		this.solicitudvacacionConstantesFunciones=new SolicitudVacacionConstantesFunciones(); 
		this.solicitudvacacionBean=new SolicitudVacacion();//(this.solicitudvacacionConstantesFunciones); 		
		this.solicitudvacacionReturnGeneral=new SolicitudVacacionParameterReturnGeneral(); 
		
		this.solicitudvacacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.solicitudvacacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SolicitudVacacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SolicitudVacacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SolicitudVacacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSolicitudVacacion(true);
			
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
			
			this.solicitudvacacionConstantesFunciones=new SolicitudVacacionConstantesFunciones(); 
			this.solicitudvacacionBean=new SolicitudVacacion();//this.solicitudvacacionConstantesFunciones); 			
			this.solicitudvacacionReturnGeneral=new SolicitudVacacionParameterReturnGeneral(); 
		
			SolicitudVacacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Solicitud Vacacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.solicitudvacacion=new SolicitudVacacion();
			this.solicitudvacacions = new ArrayList<SolicitudVacacion>();
			this.solicitudvacacionsAux = new ArrayList<SolicitudVacacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic=new SolicitudVacacionLogic();
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}
			
			//this.solicitudvacacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.solicitudvacacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSolicitudVacacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSolicitudVacacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSolicitudVacacion);	
					}
					
					if(this.jInternalFrameImportacionSolicitudVacacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSolicitudVacacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySolicitudVacacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySolicitudVacacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSolicitudVacacion);
				this.jInternalFrameDetalleFormSolicitudVacacion.setVisible(false);
				this.jInternalFrameDetalleFormSolicitudVacacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSolicitudVacacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSolicitudVacacion);
					this.jInternalFrameReporteDinamicoSolicitudVacacion.setVisible(false);
					this.jInternalFrameReporteDinamicoSolicitudVacacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSolicitudVacacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSolicitudVacacion);
					this.jInternalFrameImportacionSolicitudVacacion.setVisible(false);
					this.jInternalFrameImportacionSolicitudVacacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySolicitudVacacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySolicitudVacacion);
					this.jInternalFrameOrderBySolicitudVacacion.setVisible(false);
					this.jInternalFrameOrderBySolicitudVacacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSolicitudVacacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SolicitudVacacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.solicitudvacacionReturnGeneral=new SolicitudVacacionParameterReturnGeneral();
			
			this.solicitudvacacionParameterGeneral=new SolicitudVacacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.solicitudvacacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SolicitudVacacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SolicitudVacacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.solicitudvacacionSessionBean.getEsGuardarRelacionado(),this.solicitudvacacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SolicitudVacacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.solicitudvacacionSessionBean.getEsGuardarRelacionado(),this.solicitudvacacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSolicitudVacacion=false;
			this.isVisibilidadCeldaDuplicarSolicitudVacacion=true;
			this.isVisibilidadCeldaCopiarSolicitudVacacion=true;
			this.isVisibilidadCeldaVerFormSolicitudVacacion=true;
			this.isVisibilidadCeldaOrdenSolicitudVacacion=true;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=false;
			this.isVisibilidadCeldaModificarSolicitudVacacion=false;
			this.isVisibilidadCeldaActualizarSolicitudVacacion=false;
			this.isVisibilidadCeldaEliminarSolicitudVacacion=false;
			this.isVisibilidadCeldaCancelarSolicitudVacacion=false;
			this.isVisibilidadCeldaGuardarSolicitudVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpleadoJefe=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoSolicitudNomi=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdFormato=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSolicitudVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSolicitudVacacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSolicitudVacacion(false);
			
			this.setPermisosUsuarioSolicitudVacacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado() 
				|| (this.solicitudvacacionSessionBean.getEsGuardarRelacionado() && this.solicitudvacacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSolicitudVacacionClasesRelacionadas();
			}
			
			if(this.solicitudvacacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSolicitudVacacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSolicitudVacacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSolicitudVacacion();
			}
			
			if(!this.isPermisoBusquedaSolicitudVacacion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSolicitudVacacion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSolicitudVacacion,this.isPermisoPaginacionMedioSolicitudVacacion,this.isPermisoPaginacionTodoSolicitudVacacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SolicitudVacacionConstantesFunciones.getTiposSeleccionarSolicitudVacacion());
				
				this.tiposColumnasSelect=SolicitudVacacionConstantesFunciones.getTiposSeleccionarSolicitudVacacion(true);
				
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
			//if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSolicitudVacacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioSolicitudVacacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioSolicitudVacacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudVacacion() ;
			
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
			this.empleadojefeLogic=new EmpleadoLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.estadosolicitudnomiLogic=new EstadoSolicitudNomiLogic();
			this.formatoLogic=new FormatoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				solicitudvacacionImplementable= (SolicitudVacacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SolicitudVacacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				solicitudvacacionImplementableHome= (SolicitudVacacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SolicitudVacacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.solicitudvacacions= new ArrayList<SolicitudVacacion>();
			this.solicitudvacacionsEliminados= new ArrayList<SolicitudVacacion>();
						
			this.isEsNuevoSolicitudVacacion=false;
			this.esParaAccionDesdeFormularioSolicitudVacacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.empleadojefesForeignKey=new ArrayList<Empleado>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.estadosolicitudnomisForeignKey=new ArrayList<EstadoSolicitudNomi>() ;
			this.formatosForeignKey=new ArrayList<Formato>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySolicitudVacacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSolicitudVacacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SolicitudVacacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SolicitudVacacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSolicitudVacacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSolicitudVacacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSolicitudVacacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSolicitudVacacion();
			}
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSolicitudVacacion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSolicitudVacacion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSolicitudVacacion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSolicitudVacacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SolicitudVacacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSolicitudVacacion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSolicitudVacacion")) {
				iIndex=this.jInternalFrameDetalleFormSolicitudVacacion.jTabbedPaneRelacionesSolicitudVacacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSolicitudVacacion.jTabbedPaneRelacionesSolicitudVacacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSolicitudVacacion();	
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
	
	public void cargarCombosForeignKeySolicitudVacacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySolicitudVacacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySolicitudVacacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySolicitudVacacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySolicitudVacacion();
		
		this.cargarCombosFrameForeignKeySolicitudVacacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySolicitudVacacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySolicitudVacacion();
		}
	}
	
	

	public void cargarCombosForeignKeyEmpleadoJefe(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoJefeListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleadoJefe();
				this.cargarCombosFrameEmpleadoJefesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleadoJefe(this.empleadojefesForeignKey);

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

	public void cargarCombosForeignKeyEstadoSolicitudNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoSolicitudNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoSolicitudNomi();
				this.cargarCombosFrameEstadoSolicitudNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoSolicitudNomi(this.estadosolicitudnomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormato(this.formatosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSolicitudVacacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.solicitudvacacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
			
			if(jTableDatosSolicitudVacacion.getRowCount()>=1) {
				jTableDatosSolicitudVacacion.removeRowSelectionInterval(0, jTableDatosSolicitudVacacion.getRowCount()-1);						
			}
			
			this.isEsNuevoSolicitudVacacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSolicitudVacacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSolicitudVacacion(true);			
			//this.solicitudvacacion=new SolicitudVacacion();
			//this.solicitudvacacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSolicitudVacacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudVacacion() ;
			
			if(SolicitudVacacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSolicitudVacacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.solicitudvacacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);				
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
			if(this.solicitudvacacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SolicitudVacacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSolicitudVacacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSolicitudVacacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSolicitudVacacion.getSelectedRows().length;			
			}
			
			solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSolicitudVacacion--;			
				//SolicitudVacacion solicitudvacacionAux= new SolicitudVacacion();			
				//solicitudvacacionAux.setId(this.iIdNuevoSolicitudVacacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SolicitudVacacion solicitudvacacionOrigen=new SolicitudVacacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SolicitudVacacion solicitudvacacionOrigen : solicitudvacacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							solicitudvacacionOrigen =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudvacacionOrigen =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSolicitudVacacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.solicitudvacacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSolicitudVacacion(solicitudvacacionOrigen,this.solicitudvacacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.solicitudvacacionLogic.getSolicitudVacacions().add(this.solicitudvacacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.solicitudvacacions.add(this.solicitudvacacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSolicitudVacacion(false);
				
				this.jTableDatosSolicitudVacacion.setRowSelectionInterval(this.getIndiceNuevoSolicitudVacacion(), this.getIndiceNuevoSolicitudVacacion());
				
				int iLastRow =  this.jTableDatosSolicitudVacacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSolicitudVacacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSolicitudVacacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSolicitudVacacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();									
		
			SolicitudVacacion solicitudvacacionOrigen=new SolicitudVacacion();
			SolicitudVacacion solicitudvacacionDestino=new SolicitudVacacion();
				
			solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSolicitudVacacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || solicitudvacacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSolicitudVacacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionOrigen =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						solicitudvacacionOrigen =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudvacacionDestino =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						solicitudvacacionDestino =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				solicitudvacacionOrigen =solicitudvacacionsSeleccionados.get(0);
				solicitudvacacionDestino =solicitudvacacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSolicitudVacacion(solicitudvacacionOrigen,solicitudvacacionDestino,true,false);
				
				solicitudvacacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(solicitudvacacionDestino,solicitudvacacionLogic.getSolicitudVacacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudvacacionDestino,solicitudvacacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSolicitudVacacion(false);
				
				//this.jTableDatosSolicitudVacacion.setRowSelectionInterval(this.getIndiceNuevoSolicitudVacacion(), this.getIndiceNuevoSolicitudVacacion());
				
				int iLastRow =  this.jTableDatosSolicitudVacacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSolicitudVacacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSolicitudVacacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSolicitudVacacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSolicitudVacacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSolicitudVacacion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSolicitudVacacion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSolicitudVacacion.setVisible(!isVisible);
			this.jPanelPaginacionSolicitudVacacion.setVisible(!isVisible);
			this.jPanelAccionesSolicitudVacacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSolicitudVacacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSolicitudVacacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSolicitudVacacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySolicitudVacacion();
			
			this.abrirFrameOrderBySolicitudVacacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySolicitudVacacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSolicitudVacacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSolicitudVacacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSolicitudVacacion.isMaximum()) {
					this.jInternalFrameDetalleFormSolicitudVacacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSolicitudVacacion.setSize(this.jInternalFrameDetalleFormSolicitudVacacion.iWidthFormulario,this.jInternalFrameDetalleFormSolicitudVacacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSolicitudVacacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSolicitudVacacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSolicitudVacacion.isMaximum()) {
						this.jInternalFrameDetalleFormSolicitudVacacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSolicitudVacacion.jContentPaneDetalleSolicitudVacacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSolicitudVacacion.jTabbedPaneRelacionesSolicitudVacacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSolicitudVacacion.jContentPaneDetalleSolicitudVacacion.getWidth(),SolicitudVacacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSolicitudVacacion.jTabbedPaneRelacionesSolicitudVacacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSolicitudVacacion.jContentPaneDetalleSolicitudVacacion.getWidth(),SolicitudVacacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSolicitudVacacion.jTabbedPaneRelacionesSolicitudVacacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSolicitudVacacion.jContentPaneDetalleSolicitudVacacion.getWidth(),SolicitudVacacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSolicitudVacacion.setVisible(true);
	        this.jInternalFrameDetalleFormSolicitudVacacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySolicitudVacacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySolicitudVacacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySolicitudVacacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudVacacion,false,this);
				} else {
					this.jInternalFrameOrderBySolicitudVacacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudVacacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySolicitudVacacion);
				this.jInternalFrameOrderBySolicitudVacacion.setVisible(false);
				this.jInternalFrameOrderBySolicitudVacacion.setSelected(false);
				
				this.jInternalFrameOrderBySolicitudVacacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySolicitudVacacion"));
				
				this.inicializarActualizarBindingTablaOrderBySolicitudVacacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSolicitudVacacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSolicitudVacacion==null) {
				
				this.jInternalFrameImportacionSolicitudVacacion=new ImportacionJInternalFrame(SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSolicitudVacacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSolicitudVacacion);
				this.jInternalFrameImportacionSolicitudVacacion.setVisible(false);
				this.jInternalFrameImportacionSolicitudVacacion.setSelected(false);


				this.jInternalFrameImportacionSolicitudVacacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSolicitudVacacion"));
				this.jInternalFrameImportacionSolicitudVacacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSolicitudVacacion"));
				this.jInternalFrameImportacionSolicitudVacacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSolicitudVacacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSolicitudVacacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSolicitudVacacion==null) {
				this.jInternalFrameReporteDinamicoSolicitudVacacion=new ReporteDinamicoJInternalFrame(SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSolicitudVacacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSolicitudVacacion);
				this.jInternalFrameReporteDinamicoSolicitudVacacion.setVisible(false);
				this.jInternalFrameReporteDinamicoSolicitudVacacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSolicitudVacacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSolicitudVacacion"));
				this.jInternalFrameReporteDinamicoSolicitudVacacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSolicitudVacacion"));
				this.jInternalFrameReporteDinamicoSolicitudVacacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSolicitudVacacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSolicitudVacacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSolicitudVacacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSolicitudVacacion);
			
	       	this.jInternalFrameDetalleFormSolicitudVacacion.setVisible(false);
	        this.jInternalFrameDetalleFormSolicitudVacacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormSolicitudVacacion.dispose();
			//this.jInternalFrameDetalleFormSolicitudVacacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSolicitudVacacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSolicitudVacacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoSolicitudVacacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSolicitudVacacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSolicitudVacacion.setVisible(true);
	        this.jInternalFrameImportacionSolicitudVacacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySolicitudVacacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySolicitudVacacion.setVisible(true);
	        this.jInternalFrameOrderBySolicitudVacacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySolicitudVacacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySolicitudVacacion.setVisible(false);
	        this.jInternalFrameOrderBySolicitudVacacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSolicitudVacacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSolicitudVacacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoSolicitudVacacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSolicitudVacacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSolicitudVacacion.setVisible(false);
	        this.jInternalFrameImportacionSolicitudVacacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderSolicitudVacacion=(TitledBorder)this.jScrollPanelDatosSolicitudVacacion.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderSolicitudVacacion.getTitle() + " -> Estructura");


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
	
	public void jButtonModificarSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSolicitudVacacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSolicitudVacacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSolicitudVacacion(true);
			//this.isEsNuevoSolicitudVacacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSolicitudVacacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSolicitudVacacion(false) ;
			
			if(solicitudvacacionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SolicitudVacacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSolicitudVacacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudVacacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSolicitudVacacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSolicitudVacacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSolicitudVacacion(true);
			//this.isEsNuevoSolicitudVacacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.solicitudvacacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSolicitudVacacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSolicitudVacacion(false) ;
			
			if(SolicitudVacacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSolicitudVacacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudVacacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEmpleadoJefe(List<Empleado> empleadojefesForeignKey)throws Exception{
		TableColumn tableColumnEmpleadoJefe=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE));
		TableCellEditor tableCellEditorEmpleadoJefe =tableColumnEmpleadoJefe.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleadoJefe;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadojefesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudVacacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadojefesForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudVacacion.getSelectedRow();

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
		TableColumn tableColumnEstructura=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudVacacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoSolicitudNomi(List<EstadoSolicitudNomi> estadosolicitudnomisForeignKey)throws Exception{
		TableColumn tableColumnEstadoSolicitudNomi=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI));
		TableCellEditor tableCellEditorEstadoSolicitudNomi =tableColumnEstadoSolicitudNomi.getCellEditor();

		EstadoSolicitudNomiTableCell estadosolicitudnomiTableCellFk=(EstadoSolicitudNomiTableCell)tableCellEditorEstadoSolicitudNomi;

		if(estadosolicitudnomiTableCellFk!=null) {
			estadosolicitudnomiTableCellFk.setestadosolicitudnomisForeignKey(estadosolicitudnomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudVacacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadosolicitudnomiTableCellFk.setRowActual(intSelectedRow);
			//estadosolicitudnomiTableCellFk.setestadosolicitudnomisForeignKeyActual(estadosolicitudnomisForeignKey);
		//}


		if(estadosolicitudnomiTableCellFk!=null) {
			estadosolicitudnomiTableCellFk.RecargarEstadoSolicitudNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormato(List<Formato> formatosForeignKey)throws Exception{
		TableColumn tableColumnFormato=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO));
		TableCellEditor tableCellEditorFormato =tableColumnFormato.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formatosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudVacacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formatosForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSolicitudVacacion(false);
			
			//if(!this.isEsNuevoSolicitudVacacion) {								
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				
			}
			
			if(this.permiteMantenimiento(this.solicitudvacacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSolicitudVacacion=true;
					this.inicializarActualizarBindingTablaSolicitudVacacion(false);
					this.isEsNuevoSolicitudVacacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSolicitudVacacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSolicitudVacacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSolicitudVacacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSolicitudVacacion(false);
				
				this.habilitarDeshabilitarControlesSolicitudVacacion(false);
			
												
				
				if(SolicitudVacacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSolicitudVacacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSolicitudVacacionActionPerformed(evt,solicitudvacacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSolicitudVacacion(this.solicitudvacacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSolicitudVacacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,solicitudvacacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.solicitudvacacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SolicitudVacacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudVacacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				this.solicitudvacacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				this.solicitudvacacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.solicitudvacacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SolicitudVacacionModel) this.jTableDatosSolicitudVacacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSolicitudVacacion=true;
				this.inicializarActualizarBindingTablaSolicitudVacacion(false);
				this.isEsNuevoSolicitudVacacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSolicitudVacacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSolicitudVacacion(false);
				
				this.habilitarDeshabilitarControlesSolicitudVacacion(false);
				
				
				
				if(SolicitudVacacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSolicitudVacacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSolicitudVacacion.getRowCount()>=1) {
				jTableDatosSolicitudVacacion.removeRowSelectionInterval(0, jTableDatosSolicitudVacacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSolicitudVacacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSolicitudVacacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSolicitudVacacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudVacacion(false) ;
			
			this.isEsNuevoSolicitudVacacion=false;
			
			if(SolicitudVacacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSolicitudVacacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSolicitudVacacion(false);
				
				//SI ES MANUAL
				if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSolicitudVacacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSolicitudVacacion--;			
			//SolicitudVacacion solicitudvacacionAux= new SolicitudVacacion();			
			//solicitudvacacionAux.setId(this.iIdNuevoSolicitudVacacion);
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSolicitudVacacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
			
			this.solicitudvacacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.solicitudvacacionLogic.getSolicitudVacacions().add(this.solicitudvacacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.solicitudvacacions.add(this.solicitudvacacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSolicitudVacacion(false);
			
			this.jTableDatosSolicitudVacacion.setRowSelectionInterval(this.getIndiceNuevoSolicitudVacacion(), this.getIndiceNuevoSolicitudVacacion());
			
			int iLastRow =  this.jTableDatosSolicitudVacacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSolicitudVacacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSolicitudVacacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSolicitudVacacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSolicitudVacacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudVacacion(false);
			
			//SI ES MANUAL
			if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSolicitudVacacion();
			}
			
			//this.abrirFrameTreeSolicitudVacacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Solicitud VacacionES ?", "MANTENIMIENTO DE Solicitud Vacacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSolicitudVacacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSolicitudVacacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.solicitudvacacionReturnGeneral=solicitudvacacionLogic.procesarImportacionSolicitudVacacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.solicitudvacacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSolicitudVacacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSolicitudVacacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSolicitudVacacion.setFileImportacion(this.jInternalFrameImportacionSolicitudVacacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSolicitudVacacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSolicitudVacacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSolicitudVacacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSolicitudVacacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();		

		solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SolicitudVacacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SolicitudVacacionBaseDesign.jrxml";
			
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
			
			this.generarReporteSolicitudVacacions("Todos",solicitudvacacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Vacacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EmpleadoJefe_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EmpleadoJefe_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EmpleadoJefe_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EmpleadoJefe_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoSolicitudNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoSolicitudNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoSolicitudNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoSolicitudNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaSolicita_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaSolicita_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaSolicita_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaSolicita_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEjecuta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEjecuta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEjecuta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEjecuta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroHoras_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroHoras_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroHoras_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroHoras_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoUnitario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoUnitario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoUnitario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoUnitario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSolicitudVacacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					sNombreCampoCategoria="id_empleado_jefe";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					sNombreCampoCategoria="id_estado_solicitud_nomi";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoria="id_formato";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA:
					sNombreCampoCategoria="fecha_solicita";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA:
					sNombreCampoCategoria="fecha_ejecuta";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS:
					sNombreCampoCategoria="numero_horas";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoria="costo_unitario";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					sNombreCampoCategoriaValor="id_empleado_jefe";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					sNombreCampoCategoriaValor="id_estado_solicitud_nomi";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoriaValor="id_formato";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA:
					sNombreCampoCategoriaValor="fecha_solicita";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA:
					sNombreCampoCategoriaValor="fecha_ejecuta";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS:
					sNombreCampoCategoriaValor="numero_horas";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoriaValor="costo_unitario";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado Jefe",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado_jefe");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Solicitud Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_solicitud_nomi");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Solicita",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_solicita");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ejecuta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ejecuta");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Horas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_horas");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Unitario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_unitario");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();		
		
		solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudvacacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SolicitudVacacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getempleadojefe_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getestadosolicitudnomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getformato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getfecha_solicita());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getfecha_ejecuta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getnumero_horas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getcosto_unitario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(SolicitudVacacion solicitudvacacion:solicitudvacacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudvacacion.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelSolicitudVacacion(row);				
			//	iRow++;
			//}				
			
			//for(SolicitudVacacion solicitudvacacionAux:solicitudvacacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSolicitudVacacion(solicitudvacacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Vacacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudVacacion(false);
			
			//SI ES MANUAL
			if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSolicitudVacacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudVacacion(false);
			
			//SI ES MANUAL
			if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSolicitudVacacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudVacacion(false);
			
			//SI ES MANUAL
			if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSolicitudVacacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSolicitudVacacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSolicitudVacacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSolicitudVacacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSolicitudVacacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSolicitudVacacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSolicitudVacacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosSolicitudVacacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosSolicitudVacacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSolicitudVacacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSolicitudVacacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSolicitudVacacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSolicitudVacacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSolicitudVacacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSolicitudVacacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudVacacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSolicitudVacacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SolicitudVacacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSolicitudVacacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSolicitudVacacion();
		
		this.inicializarActualizarBindingBotonesManualSolicitudVacacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSolicitudVacacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudVacacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSolicitudVacacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSolicitudVacacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSolicitudVacacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSolicitudVacacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSolicitudVacacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSolicitudVacacion.jCheckBoxPostAccionNuevoSolicitudVacacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSolicitudVacacion.jCheckBoxPostAccionSinCerrarSolicitudVacacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSolicitudVacacion.jCheckBoxPostAccionSinMensajeSolicitudVacacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSolicitudVacacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSolicitudVacacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSolicitudVacacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
				this.jInternalFrameDetalleFormSolicitudVacacion.jCheckBoxPostAccionNuevoSolicitudVacacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSolicitudVacacion.jCheckBoxPostAccionSinCerrarSolicitudVacacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSolicitudVacacion.jCheckBoxPostAccionSinMensajeSolicitudVacacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSolicitudVacacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSolicitudVacacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSolicitudVacacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSolicitudVacacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSolicitudVacacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSolicitudVacacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSolicitudVacacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSolicitudVacacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSolicitudVacacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSolicitudVacacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSolicitudVacacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSolicitudVacacion(Boolean esInicializar) throws Exception {
		try	{	
			if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSolicitudVacacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudVacacion() throws Exception {
		try	{
			if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSolicitudVacacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSolicitudVacacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSolicitudVacacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSolicitudVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSolicitudVacacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSolicitudVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSolicitudVacacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSolicitudVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSolicitudVacacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSolicitudVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSolicitudVacacion.addItem(reporte);
			}
			
			
			if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSolicitudVacacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSolicitudVacacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSolicitudVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSolicitudVacacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSolicitudVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSolicitudVacacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSolicitudVacacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSolicitudVacacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSolicitudVacacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSolicitudVacacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSolicitudVacacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSolicitudVacacion!=null) {
				this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSolicitudVacacion!=null) {
				this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSolicitudVacacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SolicitudVacacionConstantesFunciones.getTiposSeleccionarSolicitudVacacion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SolicitudVacacionConstantesFunciones.getTiposSeleccionarSolicitudVacacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SolicitudVacacionConstantesFunciones.getTiposSeleccionarSolicitudVacacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSolicitudVacacion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSolicitudVacacion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSolicitudVacacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.getSelectedItem()!=null){this.id_empleado_jefeFK_IdEmpleadoJefe=((Empleado)this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.getSelectedItem()!=null){this.id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi=((EstadoSolicitudNomi)this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.getSelectedItem()!=null){this.id_formatoFK_IdFormato=((Formato)this.jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSolicitudVacacion(Boolean esInicializar) throws Exception {				
		if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSolicitudVacacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSolicitudVacacion() throws Exception {
		this.inicializarActualizarBindingTablaSolicitudVacacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySolicitudVacacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSolicitudVacacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSolicitudVacacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=solicitudvacacionLogic.getSolicitudVacacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=solicitudvacacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSolicitudVacacion.setModel(new SolicitudVacacionModel(this.solicitudvacacionLogic.getSolicitudVacacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSolicitudVacacion.setModel(new SolicitudVacacionModel(this.solicitudvacacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySolicitudVacacion!=null && this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySolicitudVacacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO,solicitudvacacionConstantesFunciones.resaltarSeleccionarSolicitudVacacion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO,solicitudvacacionConstantesFunciones.resaltarSeleccionarSolicitudVacacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_ID));

		if(this.solicitudvacacionConstantesFunciones.mostraridSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudvacacionConstantesFunciones.resaltaridSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activaridSolicitudVacacion,iSizeTabla,this,true,"idSolicitudVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudvacacionConstantesFunciones.resaltaridSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activaridSolicitudVacacion,this,true,"idSolicitudVacacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.solicitudvacacionConstantesFunciones.mostrarid_empresaSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_empresaSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_empresaSolicitudVacacion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_empresaSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_empresaSolicitudVacacion,false,"id_empresaSolicitudVacacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.solicitudvacacionConstantesFunciones.mostrarid_sucursalSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_sucursalSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_sucursalSolicitudVacacion,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_sucursalSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_sucursalSolicitudVacacion,false,"id_sucursalSolicitudVacacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE));

		if(this.solicitudvacacionConstantesFunciones.mostrarid_empleado_jefeSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadojefesForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_empleado_jefeSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_empleado_jefeSolicitudVacacion,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadojefesForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_empleado_jefeSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_empleado_jefeSolicitudVacacion,true,"id_empleado_jefeSolicitudVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.solicitudvacacionConstantesFunciones.mostrarid_empleadoSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_empleadoSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_empleadoSolicitudVacacion,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_empleadoSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_empleadoSolicitudVacacion,true,"id_empleadoSolicitudVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.solicitudvacacionConstantesFunciones.mostrarid_estructuraSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_estructuraSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_estructuraSolicitudVacacion,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_estructuraSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_estructuraSolicitudVacacion,true,"id_estructuraSolicitudVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI));

		if(this.solicitudvacacionConstantesFunciones.mostrarid_estado_solicitud_nomiSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoSolicitudNomiTableCell(this.estadosolicitudnomisForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_estado_solicitud_nomiSolicitudVacacion,iSizeTabla));
			tableColumn.setCellEditor(new EstadoSolicitudNomiTableCell(this.estadosolicitudnomisForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_estado_solicitud_nomiSolicitudVacacion,true,"id_estado_solicitud_nomiSolicitudVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO));

		if(this.solicitudvacacionConstantesFunciones.mostrarid_formatoSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formatosForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_formatoSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_formatoSolicitudVacacion,iSizeTabla));
			tableColumn.setCellEditor(new FormatoTableCell(this.formatosForeignKey,this.solicitudvacacionConstantesFunciones.resaltarid_formatoSolicitudVacacion,this,this.solicitudvacacionConstantesFunciones.activarid_formatoSolicitudVacacion,true,"id_formatoSolicitudVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL));

		if(this.solicitudvacacionConstantesFunciones.mostrarsecuencialSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.solicitudvacacionConstantesFunciones.resaltarsecuencialSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarsecuencialSolicitudVacacion,iSizeTabla,this,true,"secuencialSolicitudVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudvacacionConstantesFunciones.resaltarsecuencialSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarsecuencialSolicitudVacacion,this,true,"secuencialSolicitudVacacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA));

		if(this.solicitudvacacionConstantesFunciones.mostrarfecha_solicitaSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.solicitudvacacionConstantesFunciones.resaltarfecha_solicitaSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarfecha_solicitaSolicitudVacacion,iSizeTabla,this,true,"fecha_solicitaSolicitudVacacion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.solicitudvacacionConstantesFunciones.resaltarfecha_solicitaSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarfecha_solicitaSolicitudVacacion,this,true,"fecha_solicitaSolicitudVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA));

		if(this.solicitudvacacionConstantesFunciones.mostrarfecha_ejecutaSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.solicitudvacacionConstantesFunciones.resaltarfecha_ejecutaSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarfecha_ejecutaSolicitudVacacion,iSizeTabla,this,true,"fecha_ejecutaSolicitudVacacion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.solicitudvacacionConstantesFunciones.resaltarfecha_ejecutaSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarfecha_ejecutaSolicitudVacacion,this,true,"fecha_ejecutaSolicitudVacacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS));

		if(this.solicitudvacacionConstantesFunciones.mostrarnumero_horasSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudvacacionConstantesFunciones.resaltarnumero_horasSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarnumero_horasSolicitudVacacion,iSizeTabla,this,true,"numero_horasSolicitudVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudvacacionConstantesFunciones.resaltarnumero_horasSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarnumero_horasSolicitudVacacion,this,true,"numero_horasSolicitudVacacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO));

		if(this.solicitudvacacionConstantesFunciones.mostrarcosto_unitarioSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudvacacionConstantesFunciones.resaltarcosto_unitarioSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarcosto_unitarioSolicitudVacacion,iSizeTabla,this,true,"costo_unitarioSolicitudVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudvacacionConstantesFunciones.resaltarcosto_unitarioSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarcosto_unitarioSolicitudVacacion,this,true,"costo_unitarioSolicitudVacacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.solicitudvacacionConstantesFunciones.mostrarcosto_totalSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudvacacionConstantesFunciones.resaltarcosto_totalSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarcosto_totalSolicitudVacacion,iSizeTabla,this,true,"costo_totalSolicitudVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudvacacionConstantesFunciones.resaltarcosto_totalSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activarcosto_totalSolicitudVacacion,this,true,"costo_totalSolicitudVacacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.solicitudvacacionConstantesFunciones.mostrardescripcionSolicitudVacacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.solicitudvacacionConstantesFunciones.resaltardescripcionSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activardescripcionSolicitudVacacion,iSizeTabla,this,true,"descripcionSolicitudVacacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudvacacionConstantesFunciones.resaltardescripcionSolicitudVacacion,this.solicitudvacacionConstantesFunciones.activardescripcionSolicitudVacacion,this,true,"descripcionSolicitudVacacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudVacacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.solicitudvacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.solicitudvacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSolicitudVacacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.solicitudvacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.solicitudvacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSolicitudVacacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.solicitudvacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.solicitudvacacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSolicitudVacacion.addColumn(tableColumn);
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
			
			this.jTableDatosSolicitudVacacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSolicitudVacacion.moveColumn(this.jTableDatosSolicitudVacacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSolicitudVacacion.moveColumn(this.jTableDatosSolicitudVacacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSolicitudVacacion.moveColumn(this.jTableDatosSolicitudVacacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSolicitudVacacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSolicitudVacacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSolicitudVacacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSolicitudVacacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SolicitudVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSolicitudVacacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSolicitudVacacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSolicitudVacacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=solicitudvacacionLogic.getSolicitudVacacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=solicitudvacacions.size()-1;
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
		//this.jTableDatosSolicitudVacacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSolicitudVacacion();
			
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
				
				//this.isEsNuevoSolicitudVacacion=false;
					
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
				if(this.solicitudvacacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSolicitudVacacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSolicitudVacacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSolicitudVacacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.solicitudvacacion.getsType().equals("DUPLICADO")
				   || this.solicitudvacacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSolicitudVacacion=true;
				
				} else {
					this.isEsNuevoSolicitudVacacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
					if(this.solicitudvacacion.getId()>=0 && !this.solicitudvacacion.getIsNew()) {						
						this.isEsNuevoSolicitudVacacion=false;
						
					} else {
						this.isEsNuevoSolicitudVacacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSolicitudVacacion(esRelaciones);						
				
				this.seleccionarSolicitudVacacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.solicitudvacacion.getId()<0) {
					this.isEsNuevoSolicitudVacacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSolicitudVacacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSolicitudVacacion(evt,rowIndex);
				}	
				
				if(this.solicitudvacacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SolicitudVacacion: " + this.dDif); 
					}
				}								
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSolicitudVacacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.solicitudvacacion)) {
					if(this.solicitudvacacion.getId()>0) {
						this.solicitudvacacion.setIsDeleted(true);
						
						this.solicitudvacacionsEliminados.add(this.solicitudvacacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.solicitudvacacionLogic.getSolicitudVacacions().remove(this.solicitudvacacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.solicitudvacacions.remove(this.solicitudvacacion);				
					}
					
					
					((SolicitudVacacionModel) this.jTableDatosSolicitudVacacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSolicitudVacacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSolicitudVacacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSolicitudVacacion) {
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSolicitudVacacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSolicitudVacacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSolicitudVacacion(this.solicitudvacacion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.solicitudvacacionConstantesFunciones.cargarid_empresaSolicitudVacacion || this.solicitudvacacionConstantesFunciones.event_dependid_empresaSolicitudVacacion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.solicitudvacacion.getid_empresa());
									//this.inicializarActualizarBindingSolicitudVacacion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(solicitudvacacion.getEmpresa()!=null) {
							this.empresasForeignKey.add(solicitudvacacion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.solicitudvacacion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.solicitudvacacionConstantesFunciones.cargarid_sucursalSolicitudVacacion || this.solicitudvacacionConstantesFunciones.event_dependid_sucursalSolicitudVacacion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.solicitudvacacion.getid_sucursal());
									//this.inicializarActualizarBindingSolicitudVacacion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(solicitudvacacion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(solicitudvacacion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.solicitudvacacion.getid_sucursal(),false,"Formulario");

					//EmpleadoJefe
					if(!this.solicitudvacacionConstantesFunciones.cargarid_empleado_jefeSolicitudVacacion || this.solicitudvacacionConstantesFunciones.event_dependid_empleado_jefeSolicitudVacacion) {
						//this.cargarCombosEmpleadoJefesForeignKeyLista(" where id="+this.solicitudvacacion.getid_empleado_jefe());
									//this.inicializarActualizarBindingSolicitudVacacion(false,false);
						this.empleadojefesForeignKey=new ArrayList<Empleado>();

						if(solicitudvacacion.getEmpleadoJefe()!=null) {
							this.empleadojefesForeignKey.add(solicitudvacacion.getEmpleadoJefe());
						}

						this.addItemDefectoCombosForeignKeyEmpleadoJefe();
						this.cargarCombosFrameEmpleadoJefesForeignKey("Todos");
					}
					this.setActualEmpleadoJefeForeignKey(this.solicitudvacacion.getid_empleado_jefe(),false,"Formulario");

					//Empleado
					if(!this.solicitudvacacionConstantesFunciones.cargarid_empleadoSolicitudVacacion || this.solicitudvacacionConstantesFunciones.event_dependid_empleadoSolicitudVacacion) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.solicitudvacacion.getid_empleado());
									//this.inicializarActualizarBindingSolicitudVacacion(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(solicitudvacacion.getEmpleado()!=null) {
							this.empleadosForeignKey.add(solicitudvacacion.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.solicitudvacacion.getid_empleado(),false,"Formulario");

					//Estructura
					if(!this.solicitudvacacionConstantesFunciones.cargarid_estructuraSolicitudVacacion || this.solicitudvacacionConstantesFunciones.event_dependid_estructuraSolicitudVacacion) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.solicitudvacacion.getid_estructura());
									//this.inicializarActualizarBindingSolicitudVacacion(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(solicitudvacacion.getEstructura()!=null) {
							this.estructurasForeignKey.add(solicitudvacacion.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.solicitudvacacion.getid_estructura(),false,"Formulario");

					//EstadoSolicitudNomi
					if(!this.solicitudvacacionConstantesFunciones.cargarid_estado_solicitud_nomiSolicitudVacacion || this.solicitudvacacionConstantesFunciones.event_dependid_estado_solicitud_nomiSolicitudVacacion) {
						//this.cargarCombosEstadoSolicitudNomisForeignKeyLista(" where id="+this.solicitudvacacion.getid_estado_solicitud_nomi());
									//this.inicializarActualizarBindingSolicitudVacacion(false,false);
						this.estadosolicitudnomisForeignKey=new ArrayList<EstadoSolicitudNomi>();

						if(solicitudvacacion.getEstadoSolicitudNomi()!=null) {
							this.estadosolicitudnomisForeignKey.add(solicitudvacacion.getEstadoSolicitudNomi());
						}

						this.addItemDefectoCombosForeignKeyEstadoSolicitudNomi();
						this.cargarCombosFrameEstadoSolicitudNomisForeignKey("Todos");
					}
					this.setActualEstadoSolicitudNomiForeignKey(this.solicitudvacacion.getid_estado_solicitud_nomi(),false,"Formulario");

					//Formato
					if(!this.solicitudvacacionConstantesFunciones.cargarid_formatoSolicitudVacacion || this.solicitudvacacionConstantesFunciones.event_dependid_formatoSolicitudVacacion) {
						//this.cargarCombosFormatosForeignKeyLista(" where id="+this.solicitudvacacion.getid_formato());
									//this.inicializarActualizarBindingSolicitudVacacion(false,false);
						this.formatosForeignKey=new ArrayList<Formato>();

						if(solicitudvacacion.getFormato()!=null) {
							this.formatosForeignKey.add(solicitudvacacion.getFormato());
						}

						this.addItemDefectoCombosForeignKeyFormato();
						this.cargarCombosFrameFormatosForeignKey("Todos");
					}
					this.setActualFormatoForeignKey(this.solicitudvacacion.getid_formato(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSolicitudVacacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSolicitudVacacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSolicitudVacacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSolicitudVacacion(SolicitudVacacion solicitudvacacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSolicitudVacacion(solicitudvacacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSolicitudVacacion(SolicitudVacacion solicitudvacacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSolicitudVacacion(solicitudvacacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySolicitudVacacion(solicitudvacacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySolicitudVacacion(solicitudvacacion);
	}
	
	public void setVariablesObjetoActualToFormularioSolicitudVacacion(SolicitudVacacion solicitudvacacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSolicitudVacacion.jLabelidSolicitudVacacion.setText(solicitudvacacion.getId().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldsecuencialSolicitudVacacion.setText(solicitudvacacion.getsecuencial());
			this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_solicitaSolicitudVacacion.setDate(solicitudvacacion.getfecha_solicita());
			this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_ejecutaSolicitudVacacion.setDate(solicitudvacacion.getfecha_ejecuta());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldnumero_horasSolicitudVacacion.setText(solicitudvacacion.getnumero_horas().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_unitarioSolicitudVacacion.setText(solicitudvacacion.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_totalSolicitudVacacion.setText(solicitudvacacion.getcosto_total().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextAreadescripcionSolicitudVacacion.setText(solicitudvacacion.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SolicitudVacacion solicitudvacacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,solicitudvacacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SolicitudVacacion solicitudvacacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				solicitudvacacionLocal=this.solicitudvacacion;
			} else {
				solicitudvacacionLocal=this.solicitudvacacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(solicitudvacacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSolicitudVacacion(solicitudvacacionLocal,true);
					
					if(solicitudvacacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(solicitudvacacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(solicitudvacacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSolicitudVacacion(SolicitudVacacion solicitudvacacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSolicitudVacacion(solicitudvacacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(solicitudvacacion);
	}
	
	public void setVariablesFormularioToObjetoActualSolicitudVacacion(SolicitudVacacion solicitudvacacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSolicitudVacacion(solicitudvacacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSolicitudVacacion(SolicitudVacacion solicitudvacacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSolicitudVacacion.jLabelidSolicitudVacacion.getText()==null || this.jInternalFrameDetalleFormSolicitudVacacion.jLabelidSolicitudVacacion.getText()=="" || this.jInternalFrameDetalleFormSolicitudVacacion.jLabelidSolicitudVacacion.getText()=="Id") {
				this.jInternalFrameDetalleFormSolicitudVacacion.jLabelidSolicitudVacacion.setText("0");
			}

			if(conColumnasBase) {solicitudvacacion.setId(Long.parseLong(this.jInternalFrameDetalleFormSolicitudVacacion.jLabelidSolicitudVacacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudVacacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelIdSolicitudVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudvacacion.setsecuencial(this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldsecuencialSolicitudVacacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelsecuencialSolicitudVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudvacacion.setfecha_solicita(this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_solicitaSolicitudVacacion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelfecha_solicitaSolicitudVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudvacacion.setfecha_ejecuta(this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_ejecutaSolicitudVacacion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelfecha_ejecutaSolicitudVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudvacacion.setnumero_horas(Integer.parseInt(this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldnumero_horasSolicitudVacacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelnumero_horasSolicitudVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudvacacion.setcosto_unitario(Double.parseDouble(this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_unitarioSolicitudVacacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelcosto_unitarioSolicitudVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudvacacion.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_totalSolicitudVacacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabelcosto_totalSolicitudVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudvacacion.setdescripcion(this.jInternalFrameDetalleFormSolicitudVacacion.jTextAreadescripcionSolicitudVacacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudVacacion.jLabeldescripcionSolicitudVacacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSolicitudVacacion(SolicitudVacacion solicitudvacacionBean,SolicitudVacacion solicitudvacacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && solicitudvacacionBean.getid_empleado_jefe()!=null && !solicitudvacacionBean.getid_empleado_jefe().equals(-1L))) {solicitudvacacion.setid_empleado_jefe(solicitudvacacionBean.getid_empleado_jefe());}
			if(conDefault || (!conDefault && solicitudvacacionBean.getid_empleado()!=null && !solicitudvacacionBean.getid_empleado().equals(-1L))) {solicitudvacacion.setid_empleado(solicitudvacacionBean.getid_empleado());}
			if(conDefault || (!conDefault && solicitudvacacionBean.getid_estructura()!=null && !solicitudvacacionBean.getid_estructura().equals(-1L))) {solicitudvacacion.setid_estructura(solicitudvacacionBean.getid_estructura());}
			if(conDefault || (!conDefault && solicitudvacacionBean.getid_estado_solicitud_nomi()!=null && !solicitudvacacionBean.getid_estado_solicitud_nomi().equals(-1L))) {solicitudvacacion.setid_estado_solicitud_nomi(solicitudvacacionBean.getid_estado_solicitud_nomi());}
			if(conDefault || (!conDefault && solicitudvacacionBean.getid_formato()!=null && !solicitudvacacionBean.getid_formato().equals(-1L))) {solicitudvacacion.setid_formato(solicitudvacacionBean.getid_formato());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSolicitudVacacion(SolicitudVacacion solicitudvacacionOrigen,SolicitudVacacion solicitudvacacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && solicitudvacacionOrigen.getId()!=null && !solicitudvacacionOrigen.getId().equals(0L))) {solicitudvacacion.setId(solicitudvacacionOrigen.getId());}}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getid_empleado_jefe()!=null && !solicitudvacacionOrigen.getid_empleado_jefe().equals(-1L))) {solicitudvacacion.setid_empleado_jefe(solicitudvacacionOrigen.getid_empleado_jefe());}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getid_empleado()!=null && !solicitudvacacionOrigen.getid_empleado().equals(-1L))) {solicitudvacacion.setid_empleado(solicitudvacacionOrigen.getid_empleado());}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getid_estructura()!=null && !solicitudvacacionOrigen.getid_estructura().equals(-1L))) {solicitudvacacion.setid_estructura(solicitudvacacionOrigen.getid_estructura());}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getid_estado_solicitud_nomi()!=null && !solicitudvacacionOrigen.getid_estado_solicitud_nomi().equals(-1L))) {solicitudvacacion.setid_estado_solicitud_nomi(solicitudvacacionOrigen.getid_estado_solicitud_nomi());}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getid_formato()!=null && !solicitudvacacionOrigen.getid_formato().equals(-1L))) {solicitudvacacion.setid_formato(solicitudvacacionOrigen.getid_formato());}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getsecuencial()!=null && !solicitudvacacionOrigen.getsecuencial().equals(""))) {solicitudvacacion.setsecuencial(solicitudvacacionOrigen.getsecuencial());}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getfecha_solicita()!=null && !solicitudvacacionOrigen.getfecha_solicita().equals(new Date()))) {solicitudvacacion.setfecha_solicita(solicitudvacacionOrigen.getfecha_solicita());}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getfecha_ejecuta()!=null && !solicitudvacacionOrigen.getfecha_ejecuta().equals(new Date()))) {solicitudvacacion.setfecha_ejecuta(solicitudvacacionOrigen.getfecha_ejecuta());}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getnumero_horas()!=null && !solicitudvacacionOrigen.getnumero_horas().equals(0))) {solicitudvacacion.setnumero_horas(solicitudvacacionOrigen.getnumero_horas());}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getcosto_unitario()!=null && !solicitudvacacionOrigen.getcosto_unitario().equals(0.0))) {solicitudvacacion.setcosto_unitario(solicitudvacacionOrigen.getcosto_unitario());}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getcosto_total()!=null && !solicitudvacacionOrigen.getcosto_total().equals(0.0))) {solicitudvacacion.setcosto_total(solicitudvacacionOrigen.getcosto_total());}
			if(conDefault || (!conDefault && solicitudvacacionOrigen.getdescripcion()!=null && !solicitudvacacionOrigen.getdescripcion().equals(""))) {solicitudvacacion.setdescripcion(solicitudvacacionOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSolicitudVacacion(SolicitudVacacion solicitudvacacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSolicitudVacacion.jLabelidSolicitudVacacion.setText(solicitudvacacion.getId().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldsecuencialSolicitudVacacion.setText(solicitudvacacion.getsecuencial());
			this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_solicitaSolicitudVacacion.setDate(solicitudvacacion.getfecha_solicita());
			this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_ejecutaSolicitudVacacion.setDate(solicitudvacacion.getfecha_ejecuta());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldnumero_horasSolicitudVacacion.setText(solicitudvacacion.getnumero_horas().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_unitarioSolicitudVacacion.setText(solicitudvacacion.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_totalSolicitudVacacion.setText(solicitudvacacion.getcosto_total().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextAreadescripcionSolicitudVacacion.setText(solicitudvacacion.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSolicitudVacacion(SolicitudVacacionBean solicitudvacacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSolicitudVacacion.jLabelidSolicitudVacacion.setText(solicitudvacacionBean.getId().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldsecuencialSolicitudVacacion.setText(solicitudvacacionBean.getsecuencial());
			this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_solicitaSolicitudVacacion.setDate(solicitudvacacionBean.getfecha_solicita());
			this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_ejecutaSolicitudVacacion.setDate(solicitudvacacionBean.getfecha_ejecuta());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldnumero_horasSolicitudVacacion.setText(solicitudvacacionBean.getnumero_horas().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_unitarioSolicitudVacacion.setText(solicitudvacacionBean.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_totalSolicitudVacacion.setText(solicitudvacacionBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormSolicitudVacacion.jTextAreadescripcionSolicitudVacacion.setText(solicitudvacacionBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSolicitudVacacion(SolicitudVacacionParameterReturnGeneral solicitudvacacionReturnGeneral,SolicitudVacacionBean solicitudvacacionBean,Boolean conDefault) throws Exception { 
		try {
			SolicitudVacacion solicitudvacacionLocal=new SolicitudVacacion();
			
			solicitudvacacionLocal=solicitudvacacionReturnGeneral.getSolicitudVacacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && solicitudvacacionLocal.getId()!=null && !solicitudvacacionLocal.getId().equals(0L))) {solicitudvacacionBean.setId(solicitudvacacionLocal.getId());}}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getid_empleado_jefe()!=null && !solicitudvacacionLocal.getid_empleado_jefe().equals(-1L))) {solicitudvacacionBean.setid_empleado_jefe(solicitudvacacionLocal.getid_empleado_jefe());}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getid_empleado()!=null && !solicitudvacacionLocal.getid_empleado().equals(-1L))) {solicitudvacacionBean.setid_empleado(solicitudvacacionLocal.getid_empleado());}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getid_estructura()!=null && !solicitudvacacionLocal.getid_estructura().equals(-1L))) {solicitudvacacionBean.setid_estructura(solicitudvacacionLocal.getid_estructura());}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getid_estado_solicitud_nomi()!=null && !solicitudvacacionLocal.getid_estado_solicitud_nomi().equals(-1L))) {solicitudvacacionBean.setid_estado_solicitud_nomi(solicitudvacacionLocal.getid_estado_solicitud_nomi());}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getid_formato()!=null && !solicitudvacacionLocal.getid_formato().equals(-1L))) {solicitudvacacionBean.setid_formato(solicitudvacacionLocal.getid_formato());}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getsecuencial()!=null && !solicitudvacacionLocal.getsecuencial().equals(""))) {solicitudvacacionBean.setsecuencial(solicitudvacacionLocal.getsecuencial());}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getfecha_solicita()!=null && !solicitudvacacionLocal.getfecha_solicita().equals(new Date()))) {solicitudvacacionBean.setfecha_solicita(solicitudvacacionLocal.getfecha_solicita());}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getfecha_ejecuta()!=null && !solicitudvacacionLocal.getfecha_ejecuta().equals(new Date()))) {solicitudvacacionBean.setfecha_ejecuta(solicitudvacacionLocal.getfecha_ejecuta());}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getnumero_horas()!=null && !solicitudvacacionLocal.getnumero_horas().equals(0))) {solicitudvacacionBean.setnumero_horas(solicitudvacacionLocal.getnumero_horas());}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getcosto_unitario()!=null && !solicitudvacacionLocal.getcosto_unitario().equals(0.0))) {solicitudvacacionBean.setcosto_unitario(solicitudvacacionLocal.getcosto_unitario());}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getcosto_total()!=null && !solicitudvacacionLocal.getcosto_total().equals(0.0))) {solicitudvacacionBean.setcosto_total(solicitudvacacionLocal.getcosto_total());}
			if(conDefault || (!conDefault && solicitudvacacionLocal.getdescripcion()!=null && !solicitudvacacionLocal.getdescripcion().equals(""))) {solicitudvacacionBean.setdescripcion(solicitudvacacionLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSolicitudVacacionGenerico(Long idSolicitudVacacionSeleccionado,JComboBox jComboBoxSolicitudVacacion,List<SolicitudVacacion> solicitudvacacionsLocal)throws Exception {
		try {
			SolicitudVacacion  solicitudvacacionTemp=null;

			for(SolicitudVacacion solicitudvacacionAux:solicitudvacacionsLocal) {
				if(solicitudvacacionAux.getId()!=null && solicitudvacacionAux.getId().equals(idSolicitudVacacionSeleccionado)) {
					solicitudvacacionTemp=solicitudvacacionAux;
					break;
				}
			}

			jComboBoxSolicitudVacacion.setSelectedItem(solicitudvacacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSolicitudVacacionGenerico(JComboBox jComboBoxSolicitudVacacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSolicitudVacacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSolicitudVacacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSolicitudVacacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSolicitudVacacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSolicitudVacacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSolicitudVacacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			solicitudvacacion=(SolicitudVacacion) solicitudvacacionLogic.getSolicitudVacacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			solicitudvacacion =(SolicitudVacacion) solicitudvacacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!solicitudvacacion.getIsNew() && !solicitudvacacion.getIsChanged() && !solicitudvacacion.getIsDeleted()) {
				sDescripcion=solicitudvacacion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudvacacion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!solicitudvacacion.getIsNew() && !solicitudvacacion.getIsChanged() && !solicitudvacacion.getIsDeleted()) {
				sDescripcion=solicitudvacacion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudvacacion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("EmpleadoJefe")) {
			//sDescripcion=this.getActualEmpleadoJefeForeignKeyDescripcion((Long)value);
			if(!solicitudvacacion.getIsNew() && !solicitudvacacion.getIsChanged() && !solicitudvacacion.getIsDeleted()) {
				sDescripcion=solicitudvacacion.getempleadojefe_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoJefeForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudvacacion.getempleadojefe_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!solicitudvacacion.getIsNew() && !solicitudvacacion.getIsChanged() && !solicitudvacacion.getIsDeleted()) {
				sDescripcion=solicitudvacacion.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudvacacion.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!solicitudvacacion.getIsNew() && !solicitudvacacion.getIsChanged() && !solicitudvacacion.getIsDeleted()) {
				sDescripcion=solicitudvacacion.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudvacacion.getestructura_descripcion();
			}
		}

		if(sTipo.equals("EstadoSolicitudNomi")) {
			//sDescripcion=this.getActualEstadoSolicitudNomiForeignKeyDescripcion((Long)value);
			if(!solicitudvacacion.getIsNew() && !solicitudvacacion.getIsChanged() && !solicitudvacacion.getIsDeleted()) {
				sDescripcion=solicitudvacacion.getestadosolicitudnomi_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoSolicitudNomiForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudvacacion.getestadosolicitudnomi_descripcion();
			}
		}

		if(sTipo.equals("Formato")) {
			//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
			if(!solicitudvacacion.getIsNew() && !solicitudvacacion.getIsChanged() && !solicitudvacacion.getIsDeleted()) {
				sDescripcion=solicitudvacacion.getformato_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudvacacion.getformato_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SolicitudVacacion solicitudvacacionRow=new SolicitudVacacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			solicitudvacacionRow=(SolicitudVacacion) solicitudvacacionLogic.getSolicitudVacacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			solicitudvacacionRow=(SolicitudVacacion) solicitudvacacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSolicitudVacacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSolicitudVacacion.setVisible((this.isVisibilidadCeldaNuevoSolicitudVacacion && this.isPermisoNuevoSolicitudVacacion));			
			this.jButtonDuplicarSolicitudVacacion.setVisible((this.isVisibilidadCeldaDuplicarSolicitudVacacion && this.isPermisoDuplicarSolicitudVacacion));			
			this.jButtonCopiarSolicitudVacacion.setVisible((this.isVisibilidadCeldaCopiarSolicitudVacacion && this.isPermisoCopiarSolicitudVacacion));
			this.jButtonVerFormSolicitudVacacion.setVisible((this.isVisibilidadCeldaVerFormSolicitudVacacion && this.isPermisoVerFormSolicitudVacacion));
			
			this.jButtonAbrirOrderBySolicitudVacacion.setVisible((this.isVisibilidadCeldaOrdenSolicitudVacacion && this.isPermisoOrdenSolicitudVacacion));			
			
			this.jButtonNuevoRelacionesSolicitudVacacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion && this.isPermisoNuevoSolicitudVacacion));			
			this.jButtonNuevoGuardarCambiosSolicitudVacacion.setVisible((this.isVisibilidadCeldaNuevoSolicitudVacacion && this.isPermisoNuevoSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion));
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonModificarSolicitudVacacion.setVisible((this.isVisibilidadCeldaModificarSolicitudVacacion && this.isPermisoActualizarSolicitudVacacion));	
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonActualizarSolicitudVacacion.setVisible((this.isVisibilidadCeldaActualizarSolicitudVacacion && this.isPermisoActualizarSolicitudVacacion));	
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonEliminarSolicitudVacacion.setVisible((this.isVisibilidadCeldaEliminarSolicitudVacacion && this.isPermisoEliminarSolicitudVacacion));
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonCancelarSolicitudVacacion.setVisible(this.isVisibilidadCeldaCancelarSolicitudVacacion);							
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosSolicitudVacacion.setVisible((this.isVisibilidadCeldaGuardarSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaSolicitudVacacion.setVisible((this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaNuevoSolicitudVacacion && this.isPermisoNuevoSolicitudVacacion));						
			this.jButtonDuplicarToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaDuplicarSolicitudVacacion && this.isPermisoDuplicarSolicitudVacacion));						
			this.jButtonCopiarToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaCopiarSolicitudVacacion && this.isPermisoCopiarSolicitudVacacion));			
			this.jButtonVerFormToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaVerFormSolicitudVacacion && this.isPermisoVerFormSolicitudVacacion));			
			this.jButtonAbrirOrderByToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaOrdenSolicitudVacacion && this.isPermisoOrdenSolicitudVacacion));
			this.jButtonNuevoRelacionesToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion && this.isPermisoNuevoSolicitudVacacion));			
			this.jButtonNuevoGuardarCambiosToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaNuevoSolicitudVacacion && this.isPermisoNuevoSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion));			
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonModificarToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaModificarSolicitudVacacion && this.isPermisoActualizarSolicitudVacacion));	
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonActualizarToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaActualizarSolicitudVacacion  && this.isPermisoActualizarSolicitudVacacion));	
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonEliminarToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaEliminarSolicitudVacacion && this.isPermisoEliminarSolicitudVacacion));
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonCancelarToolBarSolicitudVacacion.setVisible(this.isVisibilidadCeldaCancelarSolicitudVacacion);				
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaGuardarSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSolicitudVacacion.setVisible((this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSolicitudVacacion.setVisible((this.isVisibilidadCeldaNuevoSolicitudVacacion && this.isPermisoNuevoSolicitudVacacion));			
			this.jMenuItemDuplicarSolicitudVacacion.setVisible((this.isVisibilidadCeldaDuplicarSolicitudVacacion && this.isPermisoDuplicarSolicitudVacacion));			
			this.jMenuItemCopiarSolicitudVacacion.setVisible((this.isVisibilidadCeldaCopiarSolicitudVacacion && this.isPermisoCopiarSolicitudVacacion));			
			this.jMenuItemVerFormSolicitudVacacion.setVisible((this.isVisibilidadCeldaVerFormSolicitudVacacion && this.isPermisoVerFormSolicitudVacacion));			
			this.jMenuItemAbrirOrderBySolicitudVacacion.setVisible((this.isVisibilidadCeldaOrdenSolicitudVacacion && this.isPermisoOrdenSolicitudVacacion));			
			//this.jMenuItemMostrarOcultarSolicitudVacacion.setVisible((this.isVisibilidadCeldaOrdenSolicitudVacacion && this.isPermisoOrdenSolicitudVacacion));
			this.jMenuItemDetalleAbrirOrderBySolicitudVacacion.setVisible((this.isVisibilidadCeldaOrdenSolicitudVacacion && this.isPermisoOrdenSolicitudVacacion));			
			//this.jMenuItemDetalleMostrarOcultarSolicitudVacacion.setVisible((this.isVisibilidadCeldaOrdenSolicitudVacacion && this.isPermisoOrdenSolicitudVacacion));			
			this.jMenuItemNuevoRelacionesSolicitudVacacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion && this.isPermisoNuevoSolicitudVacacion));			
			this.jMenuItemNuevoGuardarCambiosSolicitudVacacion.setVisible((this.isVisibilidadCeldaNuevoSolicitudVacacion && this.isPermisoNuevoSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion));									
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemModificarSolicitudVacacion.setVisible((this.isVisibilidadCeldaModificarSolicitudVacacion && this.isPermisoActualizarSolicitudVacacion));	
			this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemActualizarSolicitudVacacion.setVisible((this.isVisibilidadCeldaActualizarSolicitudVacacion && this.isPermisoActualizarSolicitudVacacion));	
			this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemEliminarSolicitudVacacion.setVisible((this.isVisibilidadCeldaEliminarSolicitudVacacion && this.isPermisoEliminarSolicitudVacacion));
			this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemCancelarSolicitudVacacion.setVisible(this.isVisibilidadCeldaCancelarSolicitudVacacion);				
			}
			
			this.jMenuItemGuardarCambiosSolicitudVacacion.setVisible((this.isVisibilidadCeldaGuardarSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion));						
			this.jMenuItemGuardarCambiosTablaSolicitudVacacion.setVisible((this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSolicitudVacacion=this.jButtonNuevoSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaDuplicarSolicitudVacacion=this.jButtonDuplicarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaCopiarSolicitudVacacion=this.jButtonCopiarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaVerFormSolicitudVacacion=this.jButtonVerFormSolicitudVacacion.isVisible();
			
			this.isVisibilidadCeldaOrdenSolicitudVacacion=this.jButtonAbrirOrderBySolicitudVacacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=this.jButtonNuevoRelacionesSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaModificarSolicitudVacacion=this.jButtonModificarSolicitudVacacion.isVisible();
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			this.isVisibilidadCeldaActualizarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jButtonActualizarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaEliminarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jButtonEliminarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaCancelarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jButtonCancelarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaGuardarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosSolicitudVacacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=this.jButtonGuardarCambiosTablaSolicitudVacacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSolicitudVacacion=this.jButtonNuevoToolBarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=this.jButtonNuevoRelacionesToolBarSolicitudVacacion.isVisible();
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			this.isVisibilidadCeldaModificarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jButtonModificarToolBarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaActualizarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jButtonActualizarToolBarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaEliminarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jButtonEliminarToolBarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaCancelarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jButtonCancelarToolBarSolicitudVacacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSolicitudVacacion=this.jButtonGuardarCambiosToolBarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=this.jButtonGuardarCambiosTablaToolBarSolicitudVacacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSolicitudVacacion=this.jMenuItemNuevoSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=this.jMenuItemNuevoRelacionesSolicitudVacacion.isVisible();
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			this.isVisibilidadCeldaModificarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemModificarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaActualizarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemActualizarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaEliminarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemEliminarSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaCancelarSolicitudVacacion=this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemCancelarSolicitudVacacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSolicitudVacacion=this.jMenuItemGuardarCambiosSolicitudVacacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=this.jMenuItemGuardarCambiosTablaSolicitudVacacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSolicitudVacacion(Boolean esInicializar) {
		if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.solicitudvacacionSessionBean.getConGuardarRelaciones()) {
				//if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSolicitudVacacion();
			}
			
			this.inicializarActualizarBindingBotonesManualSolicitudVacacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSolicitudVacacion() {
		this.jButtonNuevoSolicitudVacacion.setVisible(this.isPermisoNuevoSolicitudVacacion);			
		this.jButtonDuplicarSolicitudVacacion.setVisible(this.isPermisoDuplicarSolicitudVacacion);			
		this.jButtonCopiarSolicitudVacacion.setVisible(this.isPermisoCopiarSolicitudVacacion);			
		this.jButtonVerFormSolicitudVacacion.setVisible(this.isPermisoVerFormSolicitudVacacion);			
		
		this.jButtonAbrirOrderBySolicitudVacacion.setVisible(this.isPermisoOrdenSolicitudVacacion);					
		
		this.jButtonNuevoRelacionesSolicitudVacacion.setVisible(this.isPermisoNuevoSolicitudVacacion);			
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonModificarSolicitudVacacion.setVisible(this.isPermisoActualizarSolicitudVacacion);	
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonActualizarSolicitudVacacion.setVisible(this.isPermisoActualizarSolicitudVacacion);	
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonEliminarSolicitudVacacion.setVisible(this.isPermisoEliminarSolicitudVacacion);
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonCancelarSolicitudVacacion.setVisible(this.isVisibilidadCeldaCancelarSolicitudVacacion);						
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosSolicitudVacacion.setVisible(this.isPermisoGuardarCambiosSolicitudVacacion);							
		}
		
		this.jButtonGuardarCambiosTablaSolicitudVacacion.setVisible(this.isPermisoActualizarSolicitudVacacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSolicitudVacacion() {
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonModificarSolicitudVacacion.setVisible(this.isPermisoActualizarSolicitudVacacion);	
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonActualizarSolicitudVacacion.setVisible(this.isPermisoActualizarSolicitudVacacion);	
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonEliminarSolicitudVacacion.setVisible(this.isPermisoEliminarSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonCancelarSolicitudVacacion.setVisible(this.isVisibilidadCeldaCancelarSolicitudVacacion);							
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosSolicitudVacacion.setVisible((this.isVisibilidadCeldaGuardarSolicitudVacacion && this.isPermisoGuardarCambiosSolicitudVacacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSolicitudVacacion() {
		if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSolicitudVacacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSolicitudVacacion() {
	}
	
	public void jTableDatosSolicitudVacacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSolicitudVacacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.solicitudvacacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSolicitudVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSolicitudVacacion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.solicitudvacacionLogic.getConnexion());

				if(this.solicitudvacacion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.solicitudvacacion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudVacacion=(TitledBorder)this.jScrollPanelDatosSolicitudVacacion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSolicitudVacacion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.solicitudvacacion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalSolicitudVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebSolicitudVacacion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.solicitudvacacionLogic.getConnexion());

				if(this.solicitudvacacion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.solicitudvacacion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudVacacion=(TitledBorder)this.jScrollPanelDatosSolicitudVacacion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderSolicitudVacacion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.solicitudvacacion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleado_jefeSolicitudVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleadojefe=true;

			idTienePermisoempleadojefe=this.tienePermisosUsuarioEnPaginaWebSolicitudVacacion(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleadojefe) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);

				this.empleadojefeBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadojefeBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadojefeBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.solicitudvacacionLogic.getConnexion());

				if(this.solicitudvacacion.getid_empleado_jefe()!=null) {
					this.empleadojefeBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadojefeBeanSwingJInternalFrame.setIdActual(this.solicitudvacacion.getid_empleado_jefe());
					this.empleadojefeBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadojefeBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadojefeBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadojefeBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudVacacion=(TitledBorder)this.jScrollPanelDatosSolicitudVacacion.getBorder();
				TitledBorder titledBorderempleadojefe=(TitledBorder)this.empleadojefeBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleadojefe.setTitle(titledBorderSolicitudVacacion.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleado_jefeSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getid_empleado_jefe()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado_jefe = "+this.solicitudvacacion.getid_empleado_jefe().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoSolicitudVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebSolicitudVacacion(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.solicitudvacacionLogic.getConnexion());

				if(this.solicitudvacacion.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.solicitudvacacion.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudVacacion=(TitledBorder)this.jScrollPanelDatosSolicitudVacacion.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderSolicitudVacacion.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.solicitudvacacion.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraSolicitudVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebSolicitudVacacion(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.solicitudvacacionLogic.getConnexion());

				if(this.solicitudvacacion.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.solicitudvacacion.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudVacacion=(TitledBorder)this.jScrollPanelDatosSolicitudVacacion.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderSolicitudVacacion.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.solicitudvacacion.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_solicitud_nomiSolicitudVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadosolicitudnomi=true;

			idTienePermisoestadosolicitudnomi=this.tienePermisosUsuarioEnPaginaWebSolicitudVacacion(EstadoSolicitudNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadosolicitudnomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);

				this.estadosolicitudnomiBeanSwingJInternalFrame=new EstadoSolicitudNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadosolicitudnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadosolicitudnomiBeanSwingJInternalFrame.getEstadoSolicitudNomiLogic().setConnexion(this.solicitudvacacionLogic.getConnexion());

				if(this.solicitudvacacion.getid_estado_solicitud_nomi()!=null) {
					this.estadosolicitudnomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadosolicitudnomiBeanSwingJInternalFrame.setIdActual(this.solicitudvacacion.getid_estado_solicitud_nomi());
					this.estadosolicitudnomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadosolicitudnomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadosolicitudnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoSolicitudNomi();
				}

				JInternalFrameBase jinternalFrame =this.estadosolicitudnomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudVacacion=(TitledBorder)this.jScrollPanelDatosSolicitudVacacion.getBorder();
				TitledBorder titledBorderestadosolicitudnomi=(TitledBorder)this.estadosolicitudnomiBeanSwingJInternalFrame.jScrollPanelDatosEstadoSolicitudNomi.getBorder();

				titledBorderestadosolicitudnomi.setTitle(titledBorderSolicitudVacacion.getTitle() + " -> Estado Solicitud");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_solicitud_nomiSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getid_estado_solicitud_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_solicitud_nomi = "+this.solicitudvacacion.getid_estado_solicitud_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formatoSolicitudVacacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato=true;

			idTienePermisoformato=this.tienePermisosUsuarioEnPaginaWebSolicitudVacacion(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudVacacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudVacacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);

				this.formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatoBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.solicitudvacacionLogic.getConnexion());

				if(this.solicitudvacacion.getid_formato()!=null) {
					this.formatoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatoBeanSwingJInternalFrame.setIdActual(this.solicitudvacacion.getid_formato());
					this.formatoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formatoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudVacacion=(TitledBorder)this.jScrollPanelDatosSolicitudVacacion.getBorder();
				TitledBorder titledBorderformato=(TitledBorder)this.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato.setTitle(titledBorderSolicitudVacacion.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formatoSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getid_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato = "+this.solicitudvacacion.getid_formato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.solicitudvacacion.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_solicitaSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getfecha_solicita()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_solicita = '"+Funciones2.getStringPostgresDate(this.solicitudvacacion.getfecha_solicita())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ejecutaSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getfecha_ejecuta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ejecuta = '"+Funciones2.getStringPostgresDate(this.solicitudvacacion.getfecha_ejecuta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_horasSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getnumero_horas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_horas = "+this.solicitudvacacion.getnumero_horas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_unitarioSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getcosto_unitario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_unitario = "+this.solicitudvacacion.getcosto_unitario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.solicitudvacacion.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionSolicitudVacacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.getsolicitudvacacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudvacacion==null) {
						this.solicitudvacacion = new SolicitudVacacion();
					}

					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);
				}

				if(this.solicitudvacacion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.solicitudvacacion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudVacacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudVacacion(false,false);

			this.getSolicitudVacacionsFK_IdEmpleado();

			this.inicializarActualizarBindingSolicitudVacacion(false);

			//if(SolicitudVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoJefeSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudVacacion(false,false);

			this.getSolicitudVacacionsFK_IdEmpleadoJefe();

			this.inicializarActualizarBindingSolicitudVacacion(false);

			//if(SolicitudVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudVacacion(false,false);

			this.getSolicitudVacacionsFK_IdEmpresa();

			this.inicializarActualizarBindingSolicitudVacacion(false);

			//if(SolicitudVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoSolicitudNomiSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudVacacion(false,false);

			this.getSolicitudVacacionsFK_IdEstadoSolicitudNomi();

			this.inicializarActualizarBindingSolicitudVacacion(false);

			//if(SolicitudVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudVacacion(false,false);

			this.getSolicitudVacacionsFK_IdEstructura();

			this.inicializarActualizarBindingSolicitudVacacion(false);

			//if(SolicitudVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudVacacion(false,false);

			this.getSolicitudVacacionsFK_IdFormato();

			this.inicializarActualizarBindingSolicitudVacacion(false);

			//if(SolicitudVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalSolicitudVacacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudVacacion(false,false);

			this.getSolicitudVacacionsFK_IdSucursal();

			this.inicializarActualizarBindingSolicitudVacacion(false);

			//if(SolicitudVacacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudVacacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudvacacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSolicitudVacacion() {
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
			this.jInternalFrameDetalleFormSolicitudVacacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormSolicitudVacacion.dispose();
			this.jInternalFrameDetalleFormSolicitudVacacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSolicitudVacacion!=null) {
			this.jInternalFrameReporteDinamicoSolicitudVacacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSolicitudVacacion.dispose();
			this.jInternalFrameReporteDinamicoSolicitudVacacion=null;
		}
		
		if(this.jInternalFrameImportacionSolicitudVacacion!=null) {
			this.jInternalFrameImportacionSolicitudVacacion.setVisible(false);	    			
			this.jInternalFrameImportacionSolicitudVacacion.dispose();
			this.jInternalFrameImportacionSolicitudVacacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSolicitudVacacion();
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoSolicitudVacacion")) {
				jButtonNuevoSolicitudVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSolicitudVacacion")) {
				jButtonDuplicarSolicitudVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSolicitudVacacion")) {
				jButtonCopiarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormSolicitudVacacion")) {
				jButtonVerFormSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSolicitudVacacion")) {
				jButtonNuevoSolicitudVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSolicitudVacacion")) {
				jButtonDuplicarSolicitudVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSolicitudVacacion")) {
				jButtonNuevoSolicitudVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSolicitudVacacion")) {
				jButtonDuplicarSolicitudVacacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSolicitudVacacion")) {
				jButtonNuevoSolicitudVacacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSolicitudVacacion")) {
				jButtonNuevoSolicitudVacacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSolicitudVacacion")) {
				jButtonNuevoSolicitudVacacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSolicitudVacacion")) {
				jButtonModificarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSolicitudVacacion")) {
				jButtonModificarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSolicitudVacacion")) {
				jButtonModificarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSolicitudVacacion")) {
				jButtonActualizarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSolicitudVacacion")) {
				jButtonActualizarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSolicitudVacacion")) {
				jButtonActualizarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarSolicitudVacacion")) {
				jButtonEliminarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSolicitudVacacion")) {
				jButtonEliminarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSolicitudVacacion")) {
				jButtonEliminarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarSolicitudVacacion")) {
				jButtonCancelarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSolicitudVacacion")) {
				jButtonCancelarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSolicitudVacacion")) {
				jButtonCancelarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarSolicitudVacacion")) {
				jButtonCerrarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSolicitudVacacion")) {
				jButtonCerrarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSolicitudVacacion")) {
				jButtonCerrarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSolicitudVacacion")) {
				jButtonMostrarOcultarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSolicitudVacacion")) {
				jButtonCancelarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSolicitudVacacion")) {
				jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSolicitudVacacion")) {
				jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSolicitudVacacion")) {
				jButtonCopiarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSolicitudVacacion")) {
				jButtonVerFormSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSolicitudVacacion")) {
				jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSolicitudVacacion")) {
				jButtonCopiarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSolicitudVacacion")) {
				jButtonVerFormSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSolicitudVacacion")) {
				jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSolicitudVacacion")) {
				jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSolicitudVacacion")) {
				jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSolicitudVacacion")) {
				jButtonRecargarInformacionSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSolicitudVacacion")) {
				jButtonRecargarInformacionSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSolicitudVacacion")) {
				jButtonRecargarInformacionSolicitudVacacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSolicitudVacacion")) {
				jButtonAnterioresSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSolicitudVacacion")) {
				jButtonAnterioresSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSolicitudVacacion")) {
				jButtonAnterioresSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSolicitudVacacion")) {
				jButtonSiguientesSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSolicitudVacacion")) {
				jButtonSiguientesSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSolicitudVacacion")) {
				jButtonSiguientesSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySolicitudVacacion") || sTipo.equals("MenuItemDetalleAbrirOrderBySolicitudVacacion")) {
				jButtonAbrirOrderBySolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSolicitudVacacion") || sTipo.equals("MenuItemDetalleMostrarOcultarSolicitudVacacion")) {
				jButtonMostrarOcultarSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSolicitudVacacion")) {
				jButtonNuevoGuardarCambiosSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSolicitudVacacion")) {
				jButtonNuevoGuardarCambiosSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSolicitudVacacion")) {
				jButtonNuevoGuardarCambiosSolicitudVacacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSolicitudVacacion")) {
				jButtonCerrarReporteDinamicoSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSolicitudVacacion")) {
				jButtonGenerarReporteDinamicoSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSolicitudVacacion")) {
				
				jButtonGenerarExcelReporteDinamicoSolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSolicitudVacacion")) {
				jButtonCerrarImportacionSolicitudVacacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSolicitudVacacion")) {
				
				jButtonGenerarImportacionSolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSolicitudVacacion")) {
				
				jButtonAbrirImportacionSolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSolicitudVacacion")) {
				jComboBoxTiposAccionesSolicitudVacacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSolicitudVacacion")) {
				jComboBoxTiposRelacionesSolicitudVacacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSolicitudVacacion")) {
				jComboBoxTiposAccionesSolicitudVacacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSolicitudVacacion")) {
				
				jComboBoxTiposSeleccionarSolicitudVacacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSolicitudVacacion")) {
				jTextFieldValorCampoGeneralSolicitudVacacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySolicitudVacacion")) {
				jButtonAbrirOrderBySolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSolicitudVacacion")) {
				jButtonAbrirOrderBySolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySolicitudVacacion")) {
				jButtonCerrarOrderBySolicitudVacacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSolicitudVacacionBusqueda")) {
				this.jButtonidSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSolicitudVacacionUpdate")) {
				this.jButtonid_empresaSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSolicitudVacacionBusqueda")) {
				this.jButtonid_empresaSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSolicitudVacacionUpdate")) {
				this.jButtonid_sucursalSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSolicitudVacacionBusqueda")) {
				this.jButtonid_sucursalSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudVacacionUpdate")) {
				this.jButtonid_empleado_jefeSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudVacacionBusqueda")) {
				this.jButtonid_empleado_jefeSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoSolicitudVacacionUpdate")) {
				this.jButtonid_empleadoSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoSolicitudVacacionBusqueda")) {
				this.jButtonid_empleadoSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraSolicitudVacacionUpdate")) {
				this.jButtonid_estructuraSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraSolicitudVacacionBusqueda")) {
				this.jButtonid_estructuraSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudVacacionUpdate")) {
				this.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudVacacionBusqueda")) {
				this.jButtonid_estado_solicitud_nomiSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoSolicitudVacacionUpdate")) {
				this.jButtonid_formatoSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoSolicitudVacacionBusqueda")) {
				this.jButtonid_formatoSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialSolicitudVacacionBusqueda")) {
				this.jButtonsecuencialSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_solicitaSolicitudVacacionBusqueda")) {
				this.jButtonfecha_solicitaSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ejecutaSolicitudVacacionBusqueda")) {
				this.jButtonfecha_ejecutaSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_horasSolicitudVacacionBusqueda")) {
				this.jButtonnumero_horasSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioSolicitudVacacionBusqueda")) {
				this.jButtoncosto_unitarioSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalSolicitudVacacionBusqueda")) {
				this.jButtoncosto_totalSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSolicitudVacacionBusqueda")) {
				this.jButtondescripcionSolicitudVacacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoSolicitudVacacion")) {
				this.jButtonFK_IdEmpleadoSolicitudVacacionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoJefeSolicitudVacacion")) {
				this.jButtonFK_IdEmpleadoJefeSolicitudVacacionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoSolicitudNomiSolicitudVacacion")) {
				this.jButtonFK_IdEstadoSolicitudNomiSolicitudVacacionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraSolicitudVacacion")) {
				this.jButtonFK_IdEstructuraSolicitudVacacionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFormatoSolicitudVacacion")) {
				this.jButtonFK_IdFormatoSolicitudVacacionActionPerformed(evt);
			}
			
			;
			
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSolicitudVacacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudVacacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				


				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SolicitudVacacion solicitudvacacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				solicitudvacacionLocal=this.solicitudvacacion;
			} else {
				solicitudvacacionLocal=this.solicitudvacacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
							
				
				


				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudVacacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
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
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
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
			
			


			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudVacacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
								
						
				


				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudVacacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
								
				
				


				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudVacacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudVacacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudVacacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
							
				
				


				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudVacacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudVacacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
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
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
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
			
			


			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudVacacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
								
				
				


				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudVacacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudVacacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudVacacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSolicitudVacacion")) {
					jCheckBoxSeleccionarTodosSolicitudVacacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSolicitudVacacion")) {
					jCheckBoxSeleccionadosSolicitudVacacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSolicitudVacacion")) {
					
				}
				
				


				
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
												
				
				


				
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudVacacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudVacacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudVacacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
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
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
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
			
			


			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudVacacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudVacacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudVacacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudvacacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudvacacion);
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
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
				
				


				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudVacacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudVacacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudVacacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudvacacionAnterior =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSolicitudVacacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSolicitudVacacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSolicitudVacacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.solicitudvacacion =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.solicitudvacacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSolicitudVacacion")) {
				
				}
				
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSolicitudVacacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSolicitudVacacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSolicitudVacacion")) {
			
			}
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSolicitudVacacion();
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
			if(sTipo.equals("NuevoSolicitudVacacion")) {
				jButtonNuevoSolicitudVacacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSolicitudVacacion")) {
				jButtonDuplicarSolicitudVacacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSolicitudVacacion")) {
				jButtonCopiarSolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSolicitudVacacion")) {
				jButtonVerFormSolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSolicitudVacacion")) {
				jButtonNuevoSolicitudVacacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSolicitudVacacion")) {
				jButtonModificarSolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSolicitudVacacion")) {
				jButtonActualizarSolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSolicitudVacacion")) {
				jButtonEliminarSolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSolicitudVacacion")) {
				jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSolicitudVacacion")) {
				jButtonCancelarSolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSolicitudVacacion")) {
				jButtonCerrarSolicitudVacacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSolicitudVacacion")) {
				jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSolicitudVacacion")) {
				jButtonNuevoGuardarCambiosSolicitudVacacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySolicitudVacacion")) {
				jButtonAbrirOrderBySolicitudVacacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSolicitudVacacion")) {
				jButtonRecargarInformacionSolicitudVacacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSolicitudVacacion")) {
				jButtonAnterioresSolicitudVacacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSolicitudVacacion")) {
				jButtonSiguientesSolicitudVacacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSolicitudVacacionBusqueda")) {
				this.jButtonidSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSolicitudVacacionUpdate")) {
				this.jButtonid_empresaSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSolicitudVacacionBusqueda")) {
				this.jButtonid_empresaSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSolicitudVacacionUpdate")) {
				this.jButtonid_sucursalSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSolicitudVacacionBusqueda")) {
				this.jButtonid_sucursalSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudVacacionUpdate")) {
				this.jButtonid_empleado_jefeSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudVacacionBusqueda")) {
				this.jButtonid_empleado_jefeSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoSolicitudVacacionUpdate")) {
				this.jButtonid_empleadoSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoSolicitudVacacionBusqueda")) {
				this.jButtonid_empleadoSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraSolicitudVacacionUpdate")) {
				this.jButtonid_estructuraSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraSolicitudVacacionBusqueda")) {
				this.jButtonid_estructuraSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudVacacionUpdate")) {
				this.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudVacacionBusqueda")) {
				this.jButtonid_estado_solicitud_nomiSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoSolicitudVacacionUpdate")) {
				this.jButtonid_formatoSolicitudVacacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoSolicitudVacacionBusqueda")) {
				this.jButtonid_formatoSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialSolicitudVacacionBusqueda")) {
				this.jButtonsecuencialSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_solicitaSolicitudVacacionBusqueda")) {
				this.jButtonfecha_solicitaSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ejecutaSolicitudVacacionBusqueda")) {
				this.jButtonfecha_ejecutaSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_horasSolicitudVacacionBusqueda")) {
				this.jButtonnumero_horasSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioSolicitudVacacionBusqueda")) {
				this.jButtoncosto_unitarioSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalSolicitudVacacionBusqueda")) {
				this.jButtoncosto_totalSolicitudVacacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSolicitudVacacionBusqueda")) {
				this.jButtondescripcionSolicitudVacacionBusquedaActionPerformed(evt);
			}
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSolicitudVacacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSolicitudVacacion")) {
				closingInternalFrameSolicitudVacacion();
				
			} else if(sTipo.equals("jButtonCancelarSolicitudVacacion")) {
				JInternalFrameBase jInternalFrameDetalleFormSolicitudVacacion = (JInternalFrameBase)evt.getSource();
	            	
	            SolicitudVacacionBeanSwingJInternalFrame jInternalFrameParent=(SolicitudVacacionBeanSwingJInternalFrame)jInternalFrameDetalleFormSolicitudVacacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSolicitudVacacionActionPerformed(null);
			}
			
			SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.solicitudvacacion,new Object(),this.solicitudvacacionParameterGeneral,this.solicitudvacacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSolicitudVacacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSolicitudVacacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSolicitudVacacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.solicitudvacacion)) {
			if(!esControlTabla) {
				if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);			
				}
				
				if(this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSolicitudVacacion(this.solicitudvacacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.solicitudvacacionReturnGeneral=solicitudvacacionLogic.procesarEventosSolicitudVacacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudvacacionLogic.getSolicitudVacacions(),this.solicitudvacacion,this.solicitudvacacionParameterGeneral,this.isEsNuevoSolicitudVacacion,classes);//this.solicitudvacacionLogic.getSolicitudVacacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSolicitudVacacion(this.solicitudvacacionReturnGeneral,this.solicitudvacacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSolicitudVacacion(classes,this.solicitudvacacionReturnGeneral,this.solicitudvacacionBean,false);
					}
						
					if(this.solicitudvacacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySolicitudVacacion(this.solicitudvacacionReturnGeneral.getSolicitudVacacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSolicitudVacacion(this.solicitudvacacionReturnGeneral.getSolicitudVacacion());	
					}
						
					if(this.solicitudvacacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSolicitudVacacion(this.solicitudvacacionReturnGeneral.getSolicitudVacacion(),classes);//this.solicitudvacacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSolicitudVacacion(this.solicitudvacacion,classes);//this.solicitudvacacionBean);									
				}
			
				if(SolicitudVacacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSolicitudVacacion(this.solicitudvacacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudVacacion(this.solicitudvacacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.solicitudvacacionAnterior!=null) {
						this.solicitudvacacion=this.solicitudvacacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.solicitudvacacionReturnGeneral=solicitudvacacionLogic.procesarEventosSolicitudVacacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudvacacionLogic.getSolicitudVacacions(),this.solicitudvacacion,this.solicitudvacacionParameterGeneral,this.isEsNuevoSolicitudVacacion,classes);//this.solicitudvacacionLogic.getSolicitudVacacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.solicitudvacacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.solicitudvacacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.solicitudvacacionReturnGeneral.getSolicitudVacacion(),solicitudvacacionLogic.getSolicitudVacacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.solicitudvacacionReturnGeneral.getSolicitudVacacion(),this.solicitudvacacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSolicitudVacacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosSolicitudVacacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSolicitudVacacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosSolicitudVacacion() throws Exception {
		
		SolicitudVacacionModel solicitudvacacionModel=(SolicitudVacacionModel)this.jTableDatosSolicitudVacacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			solicitudvacacionModel.solicitudvacacions=this.solicitudvacacionLogic.getSolicitudVacacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			solicitudvacacionModel.solicitudvacacions=this.solicitudvacacions;
		}
		
		
		((SolicitudVacacionModel) this.jTableDatosSolicitudVacacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSolicitudVacacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsolicitudvacacionAnterior(),this.solicitudvacacionLogic.getSolicitudVacacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsolicitudvacacionAnterior(),this.solicitudvacacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSolicitudVacacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSolicitudVacacion(SolicitudVacacion solicitudvacacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
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
										
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudvacacion,new Object(),generalEntityParameterGeneral,this.solicitudvacacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.solicitudvacacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SolicitudVacacionConstantesFunciones.getClassesRelationshipsOfSolicitudVacacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SolicitudVacacionConstantesFunciones.getClassesRelationshipsFromStringsOfSolicitudVacacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSolicitudVacacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SolicitudVacacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudvacacion,new Object(),generalEntityParameterGeneral,this.solicitudvacacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSolicitudVacacion(SolicitudVacacionBean solicitudvacacionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSolicitudVacacion(ArrayList<Classe> classes,SolicitudVacacionReturnGeneral solicitudvacacionReturnGeneral,SolicitudVacacionBean solicitudvacacionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSolicitudVacacion(SolicitudVacacion solicitudvacacion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.solicitudvacacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSolicitudVacacion = new SolicitudVacacionDetalleFormJInternalFrame(jDesktopPane,this.solicitudvacacionSessionBean.getConGuardarRelaciones(),this.solicitudvacacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.setVisible(false);
		this.jInternalFrameDetalleFormSolicitudVacacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormSolicitudVacacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSolicitudVacacion.solicitudvacacionLogic=this.solicitudvacacionLogic;
		
		this.cargarCombosFrameForeignKeySolicitudVacacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSolicitudVacacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSolicitudVacacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySolicitudVacacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySolicitudVacacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSolicitudVacacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSolicitudVacacion"));
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonModificarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"ModificarSolicitudVacacion"));

		
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonModificarToolBarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarSolicitudVacacion"));
					
		this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemModificarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarSolicitudVacacion"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonActualizarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"ActualizarSolicitudVacacion"));
		
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonActualizarToolBarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSolicitudVacacion"));
						
		this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemActualizarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSolicitudVacacion"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonEliminarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"EliminarSolicitudVacacion"));
		
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonEliminarToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarSolicitudVacacion"));
								
		this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemEliminarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSolicitudVacacion"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonCancelarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"CancelarSolicitudVacacion"));
		
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonCancelarToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarSolicitudVacacion"));
					
		this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemCancelarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSolicitudVacacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemDetalleCerrarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSolicitudVacacion"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSolicitudVacacion"));
		
		
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSolicitudVacacion"));
		
		
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSolicitudVacacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonidSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"idSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empresaSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empresaSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_sucursalSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_sucursalSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleado_jefeSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleado_jefeSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleadoSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleadoSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estructuraSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estructuraSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_formatoSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_formatoSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_formatoSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonsecuencialSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonfecha_solicitaSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_solicitaSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonfecha_ejecutaSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ejecutaSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonnumero_horasSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtoncosto_unitarioSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtoncosto_totalSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtondescripcionSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSolicitudVacacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSolicitudVacacion.jTabbedPaneRelacionesSolicitudVacacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSolicitudVacacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSolicitudVacacion"));
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSolicitudVacacion"));
		}
		
		this.jTableDatosSolicitudVacacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSolicitudVacacion"));
		
		this.jTableDatosSolicitudVacacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSolicitudVacacion"));
		
		this.jButtonNuevoSolicitudVacacion.addActionListener(new ButtonActionListener(this,"NuevoSolicitudVacacion"));
		
		this.jButtonDuplicarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"DuplicarSolicitudVacacion"));
		
		this.jButtonCopiarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"CopiarSolicitudVacacion"));
		
		this.jButtonVerFormSolicitudVacacion.addActionListener(new ButtonActionListener(this,"VerFormSolicitudVacacion"));
		
		
		this.jButtonNuevoToolBarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarSolicitudVacacion"));
			
		this.jButtonDuplicarToolBarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSolicitudVacacion"));
			
		this.jMenuItemNuevoSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSolicitudVacacion"));
			
		this.jMenuItemDuplicarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSolicitudVacacion"));		
		
		
		this.jButtonNuevoRelacionesSolicitudVacacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSolicitudVacacion"));
		
		
		this.jButtonNuevoRelacionesToolBarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSolicitudVacacion"));
			
		this.jMenuItemNuevoRelacionesSolicitudVacacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSolicitudVacacion"));		
		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonModificarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"ModificarSolicitudVacacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonModificarToolBarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarSolicitudVacacion"));
			
			this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemModificarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarSolicitudVacacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonActualizarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"ActualizarSolicitudVacacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonActualizarToolBarSolicitudVacacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSolicitudVacacion"));
				
			this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemActualizarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSolicitudVacacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonEliminarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"EliminarSolicitudVacacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonEliminarToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarSolicitudVacacion"));
						
			this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemEliminarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSolicitudVacacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonCancelarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"CancelarSolicitudVacacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonCancelarToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarSolicitudVacacion"));
			
			this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemCancelarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSolicitudVacacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSolicitudVacacion"));		
		
		
		this.jButtonCerrarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"CerrarSolicitudVacacion"));
		
		
		this.jButtonCerrarToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarSolicitudVacacion"));
			
		this.jMenuItemCerrarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSolicitudVacacion"));
			
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jMenuItemDetalleCerrarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSolicitudVacacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosSolicitudVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosSolicitudVacacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSolicitudVacacion"));
		}
		
		this.jButtonCopiarToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarSolicitudVacacion"));
			
		this.jButtonVerFormToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarSolicitudVacacion"));
		
		this.jMenuItemGuardarCambiosSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSolicitudVacacion"));
			
		this.jMenuItemCopiarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSolicitudVacacion"));		
		
		this.jMenuItemVerFormSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSolicitudVacacion"));		
		
		
		this.jButtonGuardarCambiosTablaSolicitudVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSolicitudVacacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSolicitudVacacion"));
			
		this.jMenuItemGuardarCambiosTablaSolicitudVacacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSolicitudVacacion"));		
		
		
		
		this.jButtonRecargarInformacionSolicitudVacacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionSolicitudVacacion"));
					
		this.jButtonRecargarInformacionToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSolicitudVacacion"));
		
		this.jMenuItemRecargarInformacionSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSolicitudVacacion"));		
		
		
		
		this.jButtonAnterioresSolicitudVacacion.addActionListener (new ButtonActionListener(this,"AnterioresSolicitudVacacion"));
		
		
		this.jButtonAnterioresToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSolicitudVacacion"));
		
		this.jMenuItemAnterioresSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSolicitudVacacion"));		
		
		
		this.jButtonSiguientesSolicitudVacacion.addActionListener (new ButtonActionListener(this,"SiguientesSolicitudVacacion"));
		
		
		this.jButtonSiguientesToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSolicitudVacacion"));
			
		this.jMenuItemSiguientesSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSolicitudVacacion"));
			
		this.jMenuItemAbrirOrderBySolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySolicitudVacacion"));
			
		this.jMenuItemMostrarOcultarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSolicitudVacacion"));
			
		this.jMenuItemDetalleAbrirOrderBySolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySolicitudVacacion"));
			
		this.jMenuItemDetalleMostarOcultarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSolicitudVacacion"));		
		
		
		this.jButtonNuevoGuardarCambiosSolicitudVacacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSolicitudVacacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSolicitudVacacion"));
			
		this.jMenuItemNuevoGuardarCambiosSolicitudVacacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSolicitudVacacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSolicitudVacacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSolicitudVacacion"));

		this.jCheckBoxSeleccionadosSolicitudVacacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSolicitudVacacion"));
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSolicitudVacacion"));
		}
		
		
		this.jComboBoxTiposRelacionesSolicitudVacacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesSolicitudVacacion"));
			
		this.jComboBoxTiposAccionesSolicitudVacacion.addActionListener (new ButtonActionListener(this,"TiposAccionesSolicitudVacacion"));
					
		this.jComboBoxTiposSeleccionarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSolicitudVacacion"));
			
		this.jTextFieldValorCampoGeneralSolicitudVacacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSolicitudVacacion"));		
		
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonidSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"idSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empresaSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empresaSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_sucursalSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_sucursalSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleado_jefeSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleado_jefeSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleadoSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleadoSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estructuraSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estructuraSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_formatoSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_formatoSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_formatoSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonsecuencialSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonfecha_solicitaSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_solicitaSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonfecha_ejecutaSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ejecutaSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonnumero_horasSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtoncosto_unitarioSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtoncosto_totalSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtondescripcionSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSolicitudVacacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoSolicitudVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoSolicitudVacacion"));

			this.jButtonFK_IdEmpleadoJefeSolicitudVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoJefeSolicitudVacacion"));

			this.jButtonFK_IdEstadoSolicitudNomiSolicitudVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEstadoSolicitudNomiSolicitudVacacion"));

			this.jButtonFK_IdEstructuraSolicitudVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraSolicitudVacacion"));

			this.jButtonFK_IdFormatoSolicitudVacacion.addActionListener(new ButtonActionListener(this,"FK_IdFormatoSolicitudVacacion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSolicitudVacacion!=null) {
				this.jInternalFrameReporteDinamicoSolicitudVacacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSolicitudVacacion"));
				this.jInternalFrameReporteDinamicoSolicitudVacacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSolicitudVacacion"));
				this.jInternalFrameReporteDinamicoSolicitudVacacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSolicitudVacacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoSolicitudVacacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSolicitudVacacion"));				
			//this.jButtonGenerarReporteDinamicoSolicitudVacacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSolicitudVacacion"));
			//this.jButtonGenerarExcelReporteDinamicoSolicitudVacacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSolicitudVacacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSolicitudVacacion!=null) {
				this.jInternalFrameImportacionSolicitudVacacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSolicitudVacacion"));
				this.jInternalFrameImportacionSolicitudVacacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSolicitudVacacion"));
				this.jInternalFrameImportacionSolicitudVacacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSolicitudVacacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySolicitudVacacion.addActionListener (new ButtonActionListener(this,"AbrirOrderBySolicitudVacacion"));
			
			this.jButtonAbrirOrderByToolBarSolicitudVacacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSolicitudVacacion"));			
			
			if(this.jInternalFrameOrderBySolicitudVacacion!=null) {
				this.jInternalFrameOrderBySolicitudVacacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySolicitudVacacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudVacacion.jTabbedPaneRelacionesSolicitudVacacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSolicitudVacacion"));
		
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
            		closingInternalFrameSolicitudVacacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSolicitudVacacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSolicitudVacacion = (JInternalFrameBase)event.getSource();
	            	
	            SolicitudVacacionBeanSwingJInternalFrame jInternalFrameParent=(SolicitudVacacionBeanSwingJInternalFrame)jInternalFrameDetalleFormSolicitudVacacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSolicitudVacacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSolicitudVacacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSolicitudVacacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSolicitudVacacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSolicitudVacacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudVacacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudVacacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudVacacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSolicitudVacacion";
		inputMap = this.jButtonNuevoSolicitudVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSolicitudVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSolicitudVacacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudVacacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudVacacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudVacacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSolicitudVacacion";
		inputMap = this.jButtonNuevoRelacionesSolicitudVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSolicitudVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSolicitudVacacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSolicitudVacacion";
		inputMap = this.jButtonModificarSolicitudVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSolicitudVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSolicitudVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSolicitudVacacion";
		inputMap = this.jButtonActualizarSolicitudVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSolicitudVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSolicitudVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSolicitudVacacion";
		inputMap = this.jButtonEliminarSolicitudVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSolicitudVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSolicitudVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSolicitudVacacion";
		inputMap = this.jButtonCancelarSolicitudVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSolicitudVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSolicitudVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSolicitudVacacion";
		inputMap = this.jButtonCerrarSolicitudVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSolicitudVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSolicitudVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSolicitudVacacion";
		inputMap = this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosSolicitudVacacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonGuardarCambiosSolicitudVacacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSolicitudVacacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSolicitudVacacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSolicitudVacacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSolicitudVacacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSolicitudVacacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSolicitudVacacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSolicitudVacacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSolicitudVacacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSolicitudVacacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonidSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"idSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empresaSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empresaSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_sucursalSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_sucursalSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleado_jefeSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleado_jefeSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleadoSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_empleadoSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estructuraSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estructuraSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estado_solicitud_nomiSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_estado_solicitud_nomiSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudVacacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_formatoSolicitudVacacionUpdate.addActionListener(new ButtonActionListener(this,"id_formatoSolicitudVacacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonid_formatoSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonsecuencialSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonfecha_solicitaSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_solicitaSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonfecha_ejecutaSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ejecutaSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtonnumero_horasSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtoncosto_unitarioSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtoncosto_totalSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalSolicitudVacacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudVacacion.jButtondescripcionSolicitudVacacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSolicitudVacacionBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoSolicitudVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoSolicitudVacacion"));

		this.jButtonFK_IdEmpleadoJefeSolicitudVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoJefeSolicitudVacacion"));

		this.jButtonFK_IdEstadoSolicitudNomiSolicitudVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEstadoSolicitudNomiSolicitudVacacion"));

		this.jButtonFK_IdEstructuraSolicitudVacacion.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraSolicitudVacacion"));

		this.jButtonFK_IdFormatoSolicitudVacacion.addActionListener(new ButtonActionListener(this,"FK_IdFormatoSolicitudVacacion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSolicitudVacacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSolicitudVacacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSolicitudVacacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSolicitudVacacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSolicitudVacacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacionLogic.getSolicitudVacacions()) {
					solicitudvacacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudVacacion solicitudvacacionAux:solicitudvacacions) {
					solicitudvacacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSolicitudVacacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSolicitudVacacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacionLogic.getSolicitudVacacions()) {
						solicitudvacacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SolicitudVacacion solicitudvacacionAux:solicitudvacacions) {
						solicitudvacacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacionLogic.getSolicitudVacacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SolicitudVacacion solicitudvacacionAux:solicitudvacacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSolicitudVacacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSolicitudVacacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSolicitudVacacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSolicitudVacacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSolicitudVacacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSolicitudVacacion.getSelectedRows();
			
			SolicitudVacacion solicitudvacacionLocal=new SolicitudVacacion();
			
			//this.seleccionarTodosSolicitudVacacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudvacacionLocal =(SolicitudVacacion) this.solicitudvacacionLogic.getSolicitudVacacions().toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					solicitudvacacionLocal =(SolicitudVacacion) this.solicitudvacacions.toArray()[this.jTableDatosSolicitudVacacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				solicitudvacacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacionLogic.getSolicitudVacacions()) {
						solicitudvacacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SolicitudVacacion solicitudvacacionAux:solicitudvacacions) {
						solicitudvacacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSolicitudVacacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSolicitudVacacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSolicitudVacacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSolicitudVacacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSolicitudVacacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSolicitudVacacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSolicitudVacacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSolicitudVacacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSolicitudVacacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacionLogic.getSolicitudVacacions()) {
				
						if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							solicitudvacacionAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA)) {
							existe=true;
							solicitudvacacionAux.setfecha_solicita(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA)) {
							existe=true;
							solicitudvacacionAux.setfecha_ejecuta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS)) {
							existe=true;
							solicitudvacacionAux.setnumero_horas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							solicitudvacacionAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							solicitudvacacionAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							solicitudvacacionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudVacacion solicitudvacacionAux:solicitudvacacions) {
					
						if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							solicitudvacacionAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA)) {
							existe=true;
							solicitudvacacionAux.setfecha_solicita(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA)) {
							existe=true;
							solicitudvacacionAux.setfecha_ejecuta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS)) {
							existe=true;
							solicitudvacacionAux.setnumero_horas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							solicitudvacacionAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							solicitudvacacionAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							solicitudvacacionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSolicitudVacacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSolicitudVacacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSolicitudVacacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSolicitudVacacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSolicitudVacacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSolicitudVacacion) {				
					conSplash=true;//false;										
					
					//this.startProcessSolicitudVacacion(conSplash);
				
					this.generarReporteSolicitudVacacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudVacacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSolicitudVacacionsSeleccionados();
				//this.jComboBoxTiposAccionesSolicitudVacacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSolicitudVacacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesSolicitudVacacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSolicitudVacacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesSolicitudVacacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSolicitudVacacion();
				
				this.exportarSolicitudVacacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudVacacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSolicitudVacacions();
				//this.importarSolicitudVacacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudVacacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSolicitudVacacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSolicitudVacacionsSeleccionados();
				//this.jComboBoxTiposAccionesSolicitudVacacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Solicitud Vacacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSolicitudVacacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSolicitudVacacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySolicitudVacacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Solicitud Vacacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudVacacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.setSelectedIndex(0);					
				}	
			} 			
			else if(SolicitudVacacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSolicitudVacacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSolicitudVacacion(conSplash);
					
						//this.actualizarParametrosGeneralSolicitudVacacion();
						
						this.generarReporteProcesoAccionSolicitudVacacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSolicitudVacacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SolicitudVacacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Solicitud VacacionES SELECCIONADOS?", "MANTENIMIENTO DE Solicitud Vacacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSolicitudVacacion();
				
						this.actualizarParametrosGeneralSolicitudVacacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.solicitudvacacionReturnGeneral=solicitudvacacionLogic.procesarAccionSolicitudVacacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.solicitudvacacionLogic.getSolicitudVacacions(),this.solicitudvacacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSolicitudVacacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSolicitudVacacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSolicitudVacacion();
					
					SolicitudVacacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSolicitudVacacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSolicitudVacacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxTiposAccionesFormularioSolicitudVacacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSolicitudVacacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSolicitudVacacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSolicitudVacacion();
			
			if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();		
			SolicitudVacacion solicitudvacacion=new SolicitudVacacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSolicitudVacacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSolicitudVacacion.getSelectedItem();
			
			
			
			
			solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(solicitudvacacionsSeleccionados.size()==1) {
				for(SolicitudVacacion solicitudvacacionAux:solicitudvacacionsSeleccionados) {
					solicitudvacacion=solicitudvacacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSolicitudVacacion();
			
      		//this.finishProcessSolicitudVacacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSolicitudVacacionReturnGeneral() throws Exception {
		if(this.solicitudvacacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.solicitudvacacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.solicitudvacacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.solicitudvacacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.solicitudvacacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.solicitudvacacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSolicitudVacacion(false);
		}
		
		if(this.solicitudvacacionReturnGeneral.getConRetornoLista() || this.solicitudvacacionReturnGeneral.getConRetornoObjeto()) {
			if(this.solicitudvacacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.solicitudvacacionLogic.setSolicitudVacacions(this.solicitudvacacionReturnGeneral.getSolicitudVacacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.solicitudvacacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.solicitudvacacionLogic.setSolicitudVacacion(this.solicitudvacacionReturnGeneral.getSolicitudVacacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSolicitudVacacion(false);
		}
	}
	
	public void actualizarParametrosGeneralSolicitudVacacion() throws Exception {
		
		
	}
	
	public ArrayList<SolicitudVacacion> getSolicitudVacacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSolicitudVacacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SolicitudVacacion solicitudvacacionAux:solicitudvacacionLogic.getSolicitudVacacions()) {
					if(solicitudvacacionAux.getIsSelected()) {
						solicitudvacacionsSeleccionados.add(solicitudvacacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudVacacion solicitudvacacionAux:this.solicitudvacacions) {
					if(solicitudvacacionAux.getIsSelected()) {
						solicitudvacacionsSeleccionados.add(solicitudvacacionAux);				
					}
				}
			}
			
			if(solicitudvacacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						solicitudvacacionsSeleccionados.addAll(this.solicitudvacacionLogic.getSolicitudVacacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						solicitudvacacionsSeleccionados.addAll(this.solicitudvacacions);				
					}
				}
			}
		} else {
			solicitudvacacionsSeleccionados.add(this.solicitudvacacion);
		}
		
		return solicitudvacacionsSeleccionados;
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
	
	public void generarReporteSolicitudVacacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSolicitudVacacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSolicitudVacacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSolicitudVacacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSolicitudVacacionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Solicitud Vacacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSolicitudVacacionsSeleccionados() throws Exception {
		ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();		
		
		solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSolicitudVacacions("Todos",solicitudvacacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalSolicitudVacacionsSeleccionados() throws Exception {
		ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();		
		
		solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSolicitudVacacions("Todos",solicitudvacacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSolicitudVacacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();
		
		solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSolicitudVacacions("Todos",solicitudvacacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSolicitudVacacionsSeleccionados() throws Exception {
		ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSolicitudVacacion();
		
		
		solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSolicitudVacacion();
		
		
		//this.generarReporteSolicitudVacacions("Todos",solicitudvacacionsSeleccionados ,solicitudvacacionImplementable,solicitudvacacionImplementableHome);
	}
	
	public void mostrarImportacionSolicitudVacacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSolicitudVacacion();
		
		this.abrirFrameImportacionSolicitudVacacion();		
		
			
		//this.generarReporteSolicitudVacacions("Todos",solicitudvacacionsSeleccionados ,solicitudvacacionImplementable,solicitudvacacionImplementableHome);
	}
	
	public void importarSolicitudVacacions() throws Exception {		
	
	}
	
	public void exportarSolicitudVacacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSolicitudVacacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSolicitudVacacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSolicitudVacacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Solicitud Vacacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSolicitudVacacionsSeleccionados() throws Exception {
		ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();		
		
		solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudvacacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSolicitudVacacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SolicitudVacacion solicitudvacacionAux:solicitudvacacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSolicitudVacacion(solicitudvacacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//solicitudvacacionAux.setsDetalleGeneralEntityReporte(solicitudvacacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Vacacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSolicitudVacacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSolicitudVacacion(SolicitudVacacion solicitudvacacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=solicitudvacacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getempleadojefe_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getestadosolicitudnomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getformato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getfecha_solicita().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getfecha_ejecuta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getnumero_horas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getcosto_unitario().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudvacacion.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSolicitudVacacionsSeleccionados() throws Exception {
		ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();		
		
		solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudvacacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SolicitudVacacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSolicitudVacacion(row);				
				iRow++;
			}				
			
			for(SolicitudVacacion solicitudvacacionAux:solicitudvacacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSolicitudVacacion(solicitudvacacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Vacacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSolicitudVacacionsSeleccionados() throws Exception {
		ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();		
		
		solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudvacacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("solicitudvacacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("solicitudvacacion");
			//elementRoot.appendChild(element);
		
			for(SolicitudVacacion solicitudvacacionAux:solicitudvacacionsSeleccionados) {
				element = document.createElement("solicitudvacacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSolicitudVacacion(solicitudvacacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Vacacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSolicitudVacacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_COSTOUNITARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSolicitudVacacion(SolicitudVacacion solicitudvacacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getempleadojefe_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getestadosolicitudnomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getformato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getfecha_solicita());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getfecha_ejecuta());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getnumero_horas());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getcosto_unitario());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudvacacion.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlSolicitudVacacion(SolicitudVacacion solicitudvacacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SolicitudVacacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(solicitudvacacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SolicitudVacacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(solicitudvacacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SolicitudVacacionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(solicitudvacacion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(SolicitudVacacionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(solicitudvacacion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementempleadojefe_descripcion = document.createElement(SolicitudVacacionConstantesFunciones.IDEMPLEADOJEFE);
		elementempleadojefe_descripcion.appendChild(document.createTextNode(solicitudvacacion.getempleadojefe_descripcion()));
		element.appendChild(elementempleadojefe_descripcion);

		Element elementempleado_descripcion = document.createElement(SolicitudVacacionConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(solicitudvacacion.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementestructura_descripcion = document.createElement(SolicitudVacacionConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(solicitudvacacion.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementestadosolicitudnomi_descripcion = document.createElement(SolicitudVacacionConstantesFunciones.IDESTADOSOLICITUDNOMI);
		elementestadosolicitudnomi_descripcion.appendChild(document.createTextNode(solicitudvacacion.getestadosolicitudnomi_descripcion()));
		element.appendChild(elementestadosolicitudnomi_descripcion);

		Element elementformato_descripcion = document.createElement(SolicitudVacacionConstantesFunciones.IDFORMATO);
		elementformato_descripcion.appendChild(document.createTextNode(solicitudvacacion.getformato_descripcion()));
		element.appendChild(elementformato_descripcion);

		Element elementsecuencial = document.createElement(SolicitudVacacionConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(solicitudvacacion.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha_solicita = document.createElement(SolicitudVacacionConstantesFunciones.FECHASOLICITA);
		elementfecha_solicita.appendChild(document.createTextNode(solicitudvacacion.getfecha_solicita().toString().trim()));
		element.appendChild(elementfecha_solicita);

		Element elementfecha_ejecuta = document.createElement(SolicitudVacacionConstantesFunciones.FECHAEJECUTA);
		elementfecha_ejecuta.appendChild(document.createTextNode(solicitudvacacion.getfecha_ejecuta().toString().trim()));
		element.appendChild(elementfecha_ejecuta);

		Element elementnumero_horas = document.createElement(SolicitudVacacionConstantesFunciones.NUMEROHORAS);
		elementnumero_horas.appendChild(document.createTextNode(solicitudvacacion.getnumero_horas().toString().trim()));
		element.appendChild(elementnumero_horas);

		Element elementcosto_unitario = document.createElement(SolicitudVacacionConstantesFunciones.COSTOUNITARIO);
		elementcosto_unitario.appendChild(document.createTextNode(solicitudvacacion.getcosto_unitario().toString().trim()));
		element.appendChild(elementcosto_unitario);

		Element elementcosto_total = document.createElement(SolicitudVacacionConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(solicitudvacacion.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(SolicitudVacacionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(solicitudvacacion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoSolicitudVacacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados=new ArrayList<SolicitudVacacion>();
		
		solicitudvacacionsSeleccionados=this.getSolicitudVacacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSolicitudVacacion(solicitudvacacionsSeleccionados);
		
		this.generarReporteSolicitudVacacions("Todos",solicitudvacacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSolicitudVacacion(ArrayList<SolicitudVacacion> solicitudvacacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SolicitudVacacion solicitudvacacionAux:solicitudvacacionsSeleccionados) {
				solicitudvacacionAux.setsDetalleGeneralEntityReporte(solicitudvacacionAux.toString());
			
				if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(solicitudvacacionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(solicitudvacacionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADOJEFE)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(solicitudvacacionAux.getempleadojefe_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(solicitudvacacionAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(solicitudvacacionAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(solicitudvacacionAux.getestadosolicitudnomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_IDFORMATO)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(solicitudvacacionAux.getformato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(solicitudvacacionAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_FECHASOLICITA)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(solicitudvacacionAux.getfecha_solicita()));
				}
				 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_FECHAEJECUTA)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(solicitudvacacionAux.getfecha_ejecuta()));
				}
				 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_NUMEROHORAS)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(solicitudvacacionAux.getnumero_horas().toString());
				}
				 else if(sTipoSeleccionar.equals(SolicitudVacacionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					solicitudvacacionAux.setsDescripcionGeneralEntityReporte1(solicitudvacacionAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudVacacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSolicitudVacacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSolicitudVacacion=true;
				this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=true;
				this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=true;
			}
			
			this.isVisibilidadCeldaModificarSolicitudVacacion=false;
			this.isVisibilidadCeldaActualizarSolicitudVacacion=false;
			this.isVisibilidadCeldaEliminarSolicitudVacacion=false;
			this.isVisibilidadCeldaCancelarSolicitudVacacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSolicitudVacacion=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=false;
			this.isVisibilidadCeldaModificarSolicitudVacacion=false;
			this.isVisibilidadCeldaActualizarSolicitudVacacion=true;
			this.isVisibilidadCeldaEliminarSolicitudVacacion=false;
			this.isVisibilidadCeldaCancelarSolicitudVacacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSolicitudVacacion=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=false;
			this.isVisibilidadCeldaModificarSolicitudVacacion=false;
			this.isVisibilidadCeldaActualizarSolicitudVacacion=true;
			this.isVisibilidadCeldaEliminarSolicitudVacacion=true;
			this.isVisibilidadCeldaCancelarSolicitudVacacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSolicitudVacacion=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=false;
			this.isVisibilidadCeldaModificarSolicitudVacacion=false;
			this.isVisibilidadCeldaActualizarSolicitudVacacion=true;
			this.isVisibilidadCeldaEliminarSolicitudVacacion=false;
			this.isVisibilidadCeldaCancelarSolicitudVacacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=false;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSolicitudVacacion=true;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=true;
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=true;
			this.isVisibilidadCeldaModificarSolicitudVacacion=false;
			this.isVisibilidadCeldaActualizarSolicitudVacacion=false;
			this.isVisibilidadCeldaEliminarSolicitudVacacion=false;
			this.isVisibilidadCeldaCancelarSolicitudVacacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSolicitudVacacion=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=false;
			this.isVisibilidadCeldaActualizarSolicitudVacacion=false;
			this.isVisibilidadCeldaEliminarSolicitudVacacion=false;
			this.isVisibilidadCeldaCancelarSolicitudVacacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=false;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSolicitudVacacion=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=false;
			this.isVisibilidadCeldaModificarSolicitudVacacion=true;
			this.isVisibilidadCeldaActualizarSolicitudVacacion=false;
			this.isVisibilidadCeldaEliminarSolicitudVacacion=false;
			this.isVisibilidadCeldaCancelarSolicitudVacacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=false;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudVacacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SolicitudVacacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSolicitudVacacion=true;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=true;
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=true;
		} else {
			this.actualizarEstadoPanelsSolicitudVacacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSolicitudVacacion=false;
			//this.isVisibilidadCeldaVerFormSolicitudVacacion=false;
			this.isVisibilidadCeldaDuplicarSolicitudVacacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!solicitudvacacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=false;
		} else {
			this.isVisibilidadCeldaNuevoSolicitudVacacion=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudVacacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
			if(!solicitudvacacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=false;												
			}
			
			this.jButtonCerrarSolicitudVacacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSolicitudVacacion=false;
		}
		
		if(!this.permiteMantenimiento(this.solicitudvacacion)) {
			this.isVisibilidadCeldaActualizarSolicitudVacacion=false;
			this.isVisibilidadCeldaEliminarSolicitudVacacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSolicitudVacacion() {
	}
	
	public void actualizarEstadoPanelsSolicitudVacacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSolicitudVacacion!=null) {
				this.jScrollPanelDatosEdicionSolicitudVacacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudVacacion!=null) {
				this.jTabbedPaneBusquedasSolicitudVacacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudVacacion!=null) {
				this.jScrollPanelDatosSolicitudVacacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudVacacion!=null) {
				this.jPanelPaginacionSolicitudVacacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudVacacion!=null) {
				this.jPanelParametrosReportesSolicitudVacacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSolicitudVacacion!=null) {
				this.jScrollPanelDatosEdicionSolicitudVacacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudVacacion!=null) {
				this.jTabbedPaneBusquedasSolicitudVacacion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSolicitudVacacion!=null) {
				this.jScrollPanelDatosSolicitudVacacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionSolicitudVacacion!=null) {
				this.jPanelPaginacionSolicitudVacacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSolicitudVacacion!=null) {
				this.jPanelParametrosReportesSolicitudVacacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSolicitudVacacion!=null) {
				this.jScrollPanelDatosEdicionSolicitudVacacion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudVacacion!=null) {
				this.jTabbedPaneBusquedasSolicitudVacacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudVacacion!=null) {
				this.jScrollPanelDatosSolicitudVacacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionSolicitudVacacion!=null) {
				this.jPanelPaginacionSolicitudVacacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSolicitudVacacion!=null) {
				this.jPanelParametrosReportesSolicitudVacacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSolicitudVacacion!=null) {
				this.jScrollPanelDatosEdicionSolicitudVacacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudVacacion!=null) {
				this.jTabbedPaneBusquedasSolicitudVacacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudVacacion!=null) {
				this.jScrollPanelDatosSolicitudVacacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionSolicitudVacacion!=null) {
				this.jPanelPaginacionSolicitudVacacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSolicitudVacacion!=null) {
				this.jPanelParametrosReportesSolicitudVacacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSolicitudVacacion!=null) {
				this.jScrollPanelDatosEdicionSolicitudVacacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudVacacion!=null) {
				this.jTabbedPaneBusquedasSolicitudVacacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudVacacion!=null) {
				this.jScrollPanelDatosSolicitudVacacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudVacacion!=null) {
				this.jPanelPaginacionSolicitudVacacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudVacacion!=null) {
				this.jPanelParametrosReportesSolicitudVacacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSolicitudVacacion!=null) {
				this.jScrollPanelDatosEdicionSolicitudVacacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudVacacion!=null) {
				this.jTabbedPaneBusquedasSolicitudVacacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudVacacion!=null) {
				this.jScrollPanelDatosSolicitudVacacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudVacacion!=null) {
				this.jPanelPaginacionSolicitudVacacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudVacacion!=null) {
				this.jPanelParametrosReportesSolicitudVacacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSolicitudVacacion!=null) {
				this.jScrollPanelDatosEdicionSolicitudVacacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudVacacion!=null) {
				this.jTabbedPaneBusquedasSolicitudVacacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudVacacion!=null) {
				this.jScrollPanelDatosSolicitudVacacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudVacacion!=null) {
				this.jPanelPaginacionSolicitudVacacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudVacacion!=null) {
				this.jPanelParametrosReportesSolicitudVacacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSolicitudVacacion!=null) {
					this.jTabbedPaneBusquedasSolicitudVacacion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSolicitudVacacion!=null) {
				this.jPanelParametrosReportesSolicitudVacacion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudVacacion!=null) {
				this.jTabbedPaneBusquedasSolicitudVacacion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSolicitudVacacion!=null) {
				this.jPanelParametrosReportesSolicitudVacacion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoSolicitudVacacion);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoJefeSolicitudVacacion);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstructuraSolicitudVacacion);}

			this.isVisibilidadFK_IdFormato=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdFormatoSolicitudVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoSolicitudVacacion);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoJefeSolicitudVacacion);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstructuraSolicitudVacacion);}

			this.isVisibilidadFK_IdFormato=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdFormatoSolicitudVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleadoJefe(Boolean isParaEmpleadoJefe){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoJefeNegation=!isParaEmpleadoJefe;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoSolicitudVacacion);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEmpleadoJefe;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoJefeSolicitudVacacion);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstructuraSolicitudVacacion);}

			this.isVisibilidadFK_IdFormato=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdFormatoSolicitudVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoSolicitudVacacion);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoJefeSolicitudVacacion);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstructuraSolicitudVacacion);}

			this.isVisibilidadFK_IdFormato=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdFormatoSolicitudVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoSolicitudVacacion);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoJefeSolicitudVacacion);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstructuraSolicitudVacacion);}

			this.isVisibilidadFK_IdFormato=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdFormatoSolicitudVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoSolicitudNomi(Boolean isParaEstadoSolicitudNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoSolicitudNomiNegation=!isParaEstadoSolicitudNomi;

			this.isVisibilidadFK_IdEmpleado=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoSolicitudVacacion);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoJefeSolicitudVacacion);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEstadoSolicitudNomi;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstructuraSolicitudVacacion);}

			this.isVisibilidadFK_IdFormato=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdFormatoSolicitudVacacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormato(Boolean isParaFormato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNegation=!isParaFormato;

			this.isVisibilidadFK_IdEmpleado=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoSolicitudVacacion);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEmpleadoJefeSolicitudVacacion);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);}

			this.isVisibilidadFK_IdEstructura=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdEstructuraSolicitudVacacion);}

			this.isVisibilidadFK_IdFormato=isParaFormato;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasSolicitudVacacion.remove(jPanelFK_IdFormatoSolicitudVacacion);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SolicitudVacacionSessionBean solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
		
		if(this.solicitudvacacionSessionBean==null) {
			this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
		}
		
		this.solicitudvacacionSessionBean.setsUltimaBusquedaSolicitudVacacion(this.getsAccionBusqueda());
		this.solicitudvacacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.solicitudvacacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			solicitudvacacionSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoJefe")) {
			solicitudvacacionSessionBean.setid_empleado_jefe(this.getid_empleado_jefeFK_IdEmpleadoJefe());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			solicitudvacacionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoSolicitudNomi")) {
			solicitudvacacionSessionBean.setid_estado_solicitud_nomi(this.getid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			solicitudvacacionSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFormato")) {
			solicitudvacacionSessionBean.setid_formato(this.getid_formatoFK_IdFormato());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			solicitudvacacionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SolicitudVacacionSessionBean solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
		
		if(this.solicitudvacacionSessionBean==null) {
			this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
		}
		
		if(this.solicitudvacacionSessionBean.getsUltimaBusquedaSolicitudVacacion()!=null&&!this.solicitudvacacionSessionBean.getsUltimaBusquedaSolicitudVacacion().equals("")) {
			this.setsAccionBusqueda(solicitudvacacionSessionBean.getsUltimaBusquedaSolicitudVacacion());
			this.setiNumeroPaginacion(solicitudvacacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(solicitudvacacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(solicitudvacacionSessionBean.getid_empleado());
				solicitudvacacionSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoJefe")) {
				this.setid_empleado_jefeFK_IdEmpleadoJefe(solicitudvacacionSessionBean.getid_empleado_jefe());
				solicitudvacacionSessionBean.setid_empleado_jefe(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(solicitudvacacionSessionBean.getid_empresa());
				solicitudvacacionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoSolicitudNomi")) {
				this.setid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi(solicitudvacacionSessionBean.getid_estado_solicitud_nomi());
				solicitudvacacionSessionBean.setid_estado_solicitud_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(solicitudvacacionSessionBean.getid_estructura());
				solicitudvacacionSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFormato")) {
				this.setid_formatoFK_IdFormato(solicitudvacacionSessionBean.getid_formato());
				solicitudvacacionSessionBean.setid_formato(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(solicitudvacacionSessionBean.getid_sucursal());
				solicitudvacacionSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.solicitudvacacionSessionBean.setsUltimaBusquedaSolicitudVacacion("");
		this.solicitudvacacionSessionBean.setiNumeroPaginacion(SolicitudVacacionConstantesFunciones.INUMEROPAGINACION);
		this.solicitudvacacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSolicitudVacacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSolicitudVacacion() {
		this.updateBorderResaltarBusquedasFormularioSolicitudVacacion();
		this.updateVisibilidadBusquedasFormularioSolicitudVacacion();
		this.updateHabilitarBusquedasFormularioSolicitudVacacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioSolicitudVacacion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSolicitudVacacion.getComponents().length>0) {
	

		if(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEmpleadoSolicitudVacacion!=null) {
			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudVacacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
				jPanel.setBorder(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEmpleadoSolicitudVacacion);
			}
		}

		if(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEmpleadoJefeSolicitudVacacion!=null) {
			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudVacacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
				jPanel.setBorder(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEmpleadoJefeSolicitudVacacion);
			}
		}

		if(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEstadoSolicitudNomiSolicitudVacacion!=null) {
			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
				jPanel.setBorder(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEstadoSolicitudNomiSolicitudVacacion);
			}
		}

		if(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEstructuraSolicitudVacacion!=null) {
			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudVacacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
				jPanel.setBorder(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEstructuraSolicitudVacacion);
			}
		}

		if(this.solicitudvacacionConstantesFunciones.resaltarFK_IdFormatoSolicitudVacacion!=null) {
			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdFormatoSolicitudVacacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
				jPanel.setBorder(this.solicitudvacacionConstantesFunciones.resaltarFK_IdFormatoSolicitudVacacion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSolicitudVacacion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSolicitudVacacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudVacacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudvacacionConstantesFunciones.mostrarFK_IdEmpleadoSolicitudVacacion);
			if(!this.solicitudvacacionConstantesFunciones.mostrarFK_IdEmpleadoSolicitudVacacion && index>-1) {
				this.jTabbedPaneBusquedasSolicitudVacacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudVacacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudvacacionConstantesFunciones.mostrarFK_IdEmpleadoJefeSolicitudVacacion);
			if(!this.solicitudvacacionConstantesFunciones.mostrarFK_IdEmpleadoJefeSolicitudVacacion && index>-1) {
				this.jTabbedPaneBusquedasSolicitudVacacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudvacacionConstantesFunciones.mostrarFK_IdEstadoSolicitudNomiSolicitudVacacion);
			if(!this.solicitudvacacionConstantesFunciones.mostrarFK_IdEstadoSolicitudNomiSolicitudVacacion && index>-1) {
				this.jTabbedPaneBusquedasSolicitudVacacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudVacacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudvacacionConstantesFunciones.mostrarFK_IdEstructuraSolicitudVacacion);
			if(!this.solicitudvacacionConstantesFunciones.mostrarFK_IdEstructuraSolicitudVacacion && index>-1) {
				this.jTabbedPaneBusquedasSolicitudVacacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdFormatoSolicitudVacacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudvacacionConstantesFunciones.mostrarFK_IdFormatoSolicitudVacacion);
			if(!this.solicitudvacacionConstantesFunciones.mostrarFK_IdFormatoSolicitudVacacion && index>-1) {
				this.jTabbedPaneBusquedasSolicitudVacacion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSolicitudVacacion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSolicitudVacacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudVacacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudvacacionConstantesFunciones.activarFK_IdEmpleadoSolicitudVacacion);
				this.jTabbedPaneBusquedasSolicitudVacacion.setEnabledAt(index,this.solicitudvacacionConstantesFunciones.activarFK_IdEmpleadoSolicitudVacacion);
			}

			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudVacacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudvacacionConstantesFunciones.activarFK_IdEmpleadoJefeSolicitudVacacion);
				this.jTabbedPaneBusquedasSolicitudVacacion.setEnabledAt(index,this.solicitudvacacionConstantesFunciones.activarFK_IdEmpleadoJefeSolicitudVacacion);
			}

			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudvacacionConstantesFunciones.activarFK_IdEstadoSolicitudNomiSolicitudVacacion);
				this.jTabbedPaneBusquedasSolicitudVacacion.setEnabledAt(index,this.solicitudvacacionConstantesFunciones.activarFK_IdEstadoSolicitudNomiSolicitudVacacion);
			}

			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudVacacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudvacacionConstantesFunciones.activarFK_IdEstructuraSolicitudVacacion);
				this.jTabbedPaneBusquedasSolicitudVacacion.setEnabledAt(index,this.solicitudvacacionConstantesFunciones.activarFK_IdEstructuraSolicitudVacacion);
			}

			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdFormatoSolicitudVacacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudvacacionConstantesFunciones.activarFK_IdFormatoSolicitudVacacion);
				this.jTabbedPaneBusquedasSolicitudVacacion.setEnabledAt(index,this.solicitudvacacionConstantesFunciones.activarFK_IdFormatoSolicitudVacacion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSolicitudVacacion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudVacacion);

			this.jTabbedPaneBusquedasSolicitudVacacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);

			this.solicitudvacacionConstantesFunciones.setResaltarFK_IdEmpleadoSolicitudVacacion(resaltar);

			jPanel.setBorder(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEmpleadoSolicitudVacacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleadoJefe")) {
			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudVacacion);

			this.jTabbedPaneBusquedasSolicitudVacacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);

			this.solicitudvacacionConstantesFunciones.setResaltarFK_IdEmpleadoJefeSolicitudVacacion(resaltar);

			jPanel.setBorder(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEmpleadoJefeSolicitudVacacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoSolicitudNomi")) {
			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);

			this.jTabbedPaneBusquedasSolicitudVacacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);

			this.solicitudvacacionConstantesFunciones.setResaltarFK_IdEstadoSolicitudNomiSolicitudVacacion(resaltar);

			jPanel.setBorder(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEstadoSolicitudNomiSolicitudVacacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudVacacion);

			this.jTabbedPaneBusquedasSolicitudVacacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);

			this.solicitudvacacionConstantesFunciones.setResaltarFK_IdEstructuraSolicitudVacacion(resaltar);

			jPanel.setBorder(this.solicitudvacacionConstantesFunciones.resaltarFK_IdEstructuraSolicitudVacacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFormato")) {
			index= this.jTabbedPaneBusquedasSolicitudVacacion.indexOfComponent(this.jPanelFK_IdFormatoSolicitudVacacion);

			this.jTabbedPaneBusquedasSolicitudVacacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudVacacion.getComponent(index);

			this.solicitudvacacionConstantesFunciones.setResaltarFK_IdFormatoSolicitudVacacion(resaltar);

			jPanel.setBorder(this.solicitudvacacionConstantesFunciones.resaltarFK_IdFormatoSolicitudVacacion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSolicitudVacacion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSolicitudVacacion() throws Exception {

		if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSolicitudVacacion();
		this.updateVisibilidadResaltarControlesFormularioSolicitudVacacion();
		this.updateHabilitarResaltarControlesFormularioSolicitudVacacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioSolicitudVacacion() throws Exception {
		if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.solicitudvacacionConstantesFunciones.resaltaridSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jLabelidSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltaridSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarid_empresaSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarid_empresaSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarid_sucursalSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarid_sucursalSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarid_empleado_jefeSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarid_empleado_jefeSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarid_empleadoSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarid_empleadoSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarid_estructuraSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarid_estructuraSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarid_formatoSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarid_formatoSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarsecuencialSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldsecuencialSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarsecuencialSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarfecha_solicitaSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_solicitaSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarfecha_solicitaSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarfecha_ejecutaSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_ejecutaSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarfecha_ejecutaSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarnumero_horasSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldnumero_horasSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarnumero_horasSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarcosto_unitarioSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_unitarioSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarcosto_unitarioSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltarcosto_totalSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_totalSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltarcosto_totalSolicitudVacacion);}
		if(this.solicitudvacacionConstantesFunciones.resaltardescripcionSolicitudVacacion!=null && this.jInternalFrameDetalleFormSolicitudVacacion!=null) {this.jInternalFrameDetalleFormSolicitudVacacion.jTextAreadescripcionSolicitudVacacion.setBorder(this.solicitudvacacionConstantesFunciones.resaltardescripcionSolicitudVacacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSolicitudVacacion() throws Exception {		
		if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
	
		//this.jInternalFrameDetalleFormSolicitudVacacion.jLabelidSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostraridSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelidSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostraridSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_empresaSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelid_empresaSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_empresaSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_sucursalSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelid_sucursalSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_sucursalSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_empleado_jefeSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelid_empleado_jefeSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_empleado_jefeSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_empleadoSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelid_empleadoSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_empleadoSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_estructuraSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelid_estructuraSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_estructuraSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_estado_solicitud_nomiSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelid_estado_solicitud_nomiSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_estado_solicitud_nomiSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_formatoSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelid_formatoSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarid_formatoSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldsecuencialSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarsecuencialSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelsecuencialSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarsecuencialSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_solicitaSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarfecha_solicitaSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelfecha_solicitaSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarfecha_solicitaSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_ejecutaSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarfecha_ejecutaSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelfecha_ejecutaSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarfecha_ejecutaSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldnumero_horasSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarnumero_horasSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelnumero_horasSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarnumero_horasSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_unitarioSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarcosto_unitarioSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelcosto_unitarioSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarcosto_unitarioSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_totalSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarcosto_totalSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPanelcosto_totalSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrarcosto_totalSolicitudVacacion);
		//this.jInternalFrameDetalleFormSolicitudVacacion.jTextAreadescripcionSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrardescripcionSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jPaneldescripcionSolicitudVacacion.setVisible(this.solicitudvacacionConstantesFunciones.mostrardescripcionSolicitudVacacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSolicitudVacacion() throws Exception {
		if(this.jInternalFrameDetalleFormSolicitudVacacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSolicitudVacacion!=null) {
	
		this.jInternalFrameDetalleFormSolicitudVacacion.jLabelidSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activaridSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empresaSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarid_empresaSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_sucursalSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarid_sucursalSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleado_jefeSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarid_empleado_jefeSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_empleadoSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarid_empleadoSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estructuraSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarid_estructuraSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_estado_solicitud_nomiSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarid_estado_solicitud_nomiSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jComboBoxid_formatoSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarid_formatoSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldsecuencialSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarsecuencialSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_solicitaSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarfecha_solicitaSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jDateChooserfecha_ejecutaSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarfecha_ejecutaSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldnumero_horasSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarnumero_horasSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_unitarioSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarcosto_unitarioSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jTextFieldcosto_totalSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activarcosto_totalSolicitudVacacion);
		this.jInternalFrameDetalleFormSolicitudVacacion.jTextAreadescripcionSolicitudVacacion.setEnabled(this.solicitudvacacionConstantesFunciones.activardescripcionSolicitudVacacion);
		}
	}
	
		
}