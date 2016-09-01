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

import com.bydan.erp.nomina.util.SolicitudReemplazoConstantesFunciones;
import com.bydan.erp.nomina.util.SolicitudReemplazoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.SolicitudReemplazoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.SolicitudReemplazoBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class SolicitudReemplazoBeanSwingJInternalFrame extends SolicitudReemplazoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SolicitudReemplazoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SolicitudReemplazo> solicitudreemplazoValidator = new ClassValidator<SolicitudReemplazo>(SolicitudReemplazo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SolicitudReemplazo solicitudreemplazo;	
	public SolicitudReemplazo solicitudreemplazoAux;
	public SolicitudReemplazo solicitudreemplazoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SolicitudReemplazo solicitudreemplazoTotales;
	public Long idSolicitudReemplazoActual;
	public Long iIdNuevoSolicitudReemplazo=0L;
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

	public String sFinalQueryComboEmpleadoReemplazo="";

	public List<Empleado> empleadoreemplazosForeignKey;

	public List<Empleado> getempleadoreemplazosForeignKey() {
		return empleadoreemplazosForeignKey;
	}

	public void setempleadoreemplazosForeignKey(List<Empleado> empleadoreemplazosForeignKey) {
		this.empleadoreemplazosForeignKey = empleadoreemplazosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoreemplazoForeignKey;

	public Empleado getempleadoreemplazoForeignKey() {
		return empleadoreemplazoForeignKey;
	}

	public void setempleadoreemplazoForeignKey(Empleado empleadoreemplazoForeignKey) {
		this.empleadoreemplazoForeignKey = empleadoreemplazoForeignKey;
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
	
	public Boolean isPermisoTodoSolicitudReemplazo;
	public Boolean isPermisoNuevoSolicitudReemplazo;
	public Boolean isPermisoActualizarSolicitudReemplazo;
	public Boolean isPermisoActualizarOriginalSolicitudReemplazo;
	public Boolean isPermisoEliminarSolicitudReemplazo;
	public Boolean isPermisoGuardarCambiosSolicitudReemplazo;
	public Boolean isPermisoConsultaSolicitudReemplazo;
	public Boolean isPermisoBusquedaSolicitudReemplazo;
	public Boolean isPermisoReporteSolicitudReemplazo;
	public Boolean isPermisoPaginacionMedioSolicitudReemplazo;
	public Boolean isPermisoPaginacionAltoSolicitudReemplazo;
	public Boolean isPermisoPaginacionTodoSolicitudReemplazo;
	public Boolean isPermisoCopiarSolicitudReemplazo;
	public Boolean isPermisoVerFormSolicitudReemplazo;
	public Boolean isPermisoDuplicarSolicitudReemplazo;
	public Boolean isPermisoOrdenSolicitudReemplazo;
	
	
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
	
	public SolicitudReemplazoParameterReturnGeneral solicitudreemplazoReturnGeneral;
	public SolicitudReemplazoParameterReturnGeneral solicitudreemplazoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSolicitudReemplazo=false;
	public Boolean esParaAccionDesdeFormularioSolicitudReemplazo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SolicitudReemplazoSessionBeanAdditional solicitudreemplazoSessionBeanAdditional=null;
	
	public SolicitudReemplazoSessionBeanAdditional getSolicitudReemplazoSessionBeanAdditional() {
		return this.solicitudreemplazoSessionBeanAdditional;
	}
	
	public void setSolicitudReemplazoSessionBeanAdditional(SolicitudReemplazoSessionBeanAdditional solicitudreemplazoSessionBeanAdditional) {
		try {
			this.solicitudreemplazoSessionBeanAdditional=solicitudreemplazoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SolicitudReemplazoBeanSwingJInternalFrameAdditional solicitudreemplazoBeanSwingJInternalFrameAdditional=null;
	//public class SolicitudReemplazoBeanSwingJInternalFrame
	
	public SolicitudReemplazoBeanSwingJInternalFrameAdditional getSolicitudReemplazoBeanSwingJInternalFrameAdditional() {
		return this.solicitudreemplazoBeanSwingJInternalFrameAdditional;
	}
	
	public void setSolicitudReemplazoBeanSwingJInternalFrameAdditional(SolicitudReemplazoBeanSwingJInternalFrameAdditional solicitudreemplazoBeanSwingJInternalFrameAdditional) {
		try {
			this.solicitudreemplazoBeanSwingJInternalFrameAdditional=solicitudreemplazoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SolicitudReemplazoLogic solicitudreemplazoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SolicitudReemplazo solicitudreemplazoBean;
	public SolicitudReemplazoConstantesFunciones solicitudreemplazoConstantesFunciones;
	//public SolicitudReemplazoParameterReturnGeneral solicitudreemplazoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EmpleadoLogic empleadojefeLogic;
	public EmpleadoLogic empleadoLogic;
	public EmpleadoLogic empleadoreemplazoLogic;
	public EstructuraLogic estructuraLogic;
	public EstadoSolicitudNomiLogic estadosolicitudnomiLogic;
	
	//PARAMETROS
	
	
	//public List<SolicitudReemplazo> solicitudreemplazos;	
	//public List<SolicitudReemplazo> solicitudreemplazosEliminados;
	//public List<SolicitudReemplazo> solicitudreemplazosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSolicitudReemplazo=false;
	public Boolean isVisibilidadCeldaDuplicarSolicitudReemplazo=true;
	public Boolean isVisibilidadCeldaCopiarSolicitudReemplazo=true;
	public Boolean isVisibilidadCeldaVerFormSolicitudReemplazo=true;
	public Boolean isVisibilidadCeldaOrdenSolicitudReemplazo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=false;
	public Boolean isVisibilidadCeldaModificarSolicitudReemplazo=false;
	public Boolean isVisibilidadCeldaActualizarSolicitudReemplazo=false;
	public Boolean isVisibilidadCeldaEliminarSolicitudReemplazo=false;
	public Boolean isVisibilidadCeldaCancelarSolicitudReemplazo=false;
	public Boolean isVisibilidadCeldaGuardarSolicitudReemplazo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpleadoJefe=false;
	public Boolean isVisibilidadFK_IdEmpleadoReemplazo=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoSolicitudNomi=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoSolicitudReemplazo() {
		return this.iIdNuevoSolicitudReemplazo;
	}

	public void setiIdNuevoSolicitudReemplazo(Long iIdNuevoSolicitudReemplazo) {
		this.iIdNuevoSolicitudReemplazo = iIdNuevoSolicitudReemplazo;
	}
	
	public Long getidSolicitudReemplazoActual() {
		return this.idSolicitudReemplazoActual;
	}

	public void setidSolicitudReemplazoActual(Long idSolicitudReemplazoActual) {
		this.idSolicitudReemplazoActual = idSolicitudReemplazoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SolicitudReemplazo getsolicitudreemplazo() {
		return this.solicitudreemplazo;
	}

	public void setsolicitudreemplazo(SolicitudReemplazo solicitudreemplazo) {
		this.solicitudreemplazo = solicitudreemplazo;
	}
	
	public SolicitudReemplazo getsolicitudreemplazoAux() {
		return this.solicitudreemplazoAux;
	}

	public void setsolicitudreemplazoAux(SolicitudReemplazo solicitudreemplazoAux) {
		this.solicitudreemplazoAux = solicitudreemplazoAux;
	}				
	
	public SolicitudReemplazo getsolicitudreemplazoAnterior() {
		return this.solicitudreemplazoAnterior;
	}

	public void setsolicitudreemplazoAnterior(SolicitudReemplazo solicitudreemplazoAnterior) {
		this.solicitudreemplazoAnterior = solicitudreemplazoAnterior;
	}	
	
	public SolicitudReemplazo getsolicitudreemplazoTotales() {
		return this.solicitudreemplazoTotales;
	}

	public void setsolicitudreemplazoTotales(SolicitudReemplazo solicitudreemplazoTotales) {
		this.solicitudreemplazoTotales = solicitudreemplazoTotales;
	}	
	
	public SolicitudReemplazo getsolicitudreemplazoBean() {
		return this.solicitudreemplazoBean;
	}

	public void setsolicitudreemplazoBean(SolicitudReemplazo solicitudreemplazoBean) {
		this.solicitudreemplazoBean = solicitudreemplazoBean;
	}	
	
	public SolicitudReemplazoParameterReturnGeneral getsolicitudreemplazoReturnGeneral() {
		return this.solicitudreemplazoReturnGeneral;
	}

	public void setsolicitudreemplazoReturnGeneral(SolicitudReemplazoParameterReturnGeneral solicitudreemplazoReturnGeneral) {
		this.solicitudreemplazoReturnGeneral = solicitudreemplazoReturnGeneral;
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

	public Long id_empleado_reemplazoFK_IdEmpleadoReemplazo=-1L;

	public Long getid_empleado_reemplazoFK_IdEmpleadoReemplazo() {
		return this.id_empleado_reemplazoFK_IdEmpleadoReemplazo;
	}

	public void setid_empleado_reemplazoFK_IdEmpleadoReemplazo(Long id_empleado_reemplazoFK_IdEmpleadoReemplazo) {
		this.id_empleado_reemplazoFK_IdEmpleadoReemplazo = id_empleado_reemplazoFK_IdEmpleadoReemplazo;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SolicitudReemplazoLogic getSolicitudReemplazoLogic()	{		
		return solicitudreemplazoLogic;
	}

	public void setSolicitudReemplazoLogic(SolicitudReemplazoLogic solicitudreemplazoLogic) {
		this.solicitudreemplazoLogic = solicitudreemplazoLogic;
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
	
	public Boolean getIsEsNuevoSolicitudReemplazo() {
		return isEsNuevoSolicitudReemplazo;
	}

	public void setIsEsNuevoSolicitudReemplazo(Boolean isEsNuevoSolicitudReemplazo) {
		this.isEsNuevoSolicitudReemplazo = isEsNuevoSolicitudReemplazo;
	}

	public Boolean getEsParaAccionDesdeFormularioSolicitudReemplazo() {
		return esParaAccionDesdeFormularioSolicitudReemplazo;
	}
	
	public void setEsParaAccionDesdeFormularioSolicitudReemplazo(Boolean esParaAccionDesdeFormularioSolicitudReemplazo) {
		this.esParaAccionDesdeFormularioSolicitudReemplazo = esParaAccionDesdeFormularioSolicitudReemplazo;
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

			if(this.solicitudreemplazoSessionBean==null) {
				this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
			}

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(solicitudreemplazoSessionBean.getlidEmpresaActual());
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

			if(this.solicitudreemplazoSessionBean==null) {
				this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
			}

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(solicitudreemplazoSessionBean.getlidSucursalActual());
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

			if(this.solicitudreemplazoSessionBean==null) {
				this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
			}

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoJefe()) {
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
					empleadoLogic.getEntityWithConnection(solicitudreemplazoSessionBean.getlidEmpleadoJefeActual());
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

			if(this.solicitudreemplazoSessionBean==null) {
				this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
			}

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(solicitudreemplazoSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosEmpleadoReemplazosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadoreemplazosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.solicitudreemplazoSessionBean==null) {
				this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
			}

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoReemplazo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoreemplazoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadoreemplazosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleadoReemplazo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(solicitudreemplazoSessionBean.getlidEmpleadoReemplazoActual());
					this.empleadoreemplazosForeignKey.add(empleadoLogic.getEmpleado());
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

			if(this.solicitudreemplazoSessionBean==null) {
				this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
			}

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(solicitudreemplazoSessionBean.getlidEstructuraActual());
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

			if(this.solicitudreemplazoSessionBean==null) {
				this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
			}

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi()) {
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
					estadosolicitudnomiLogic.getEntityWithConnection(solicitudreemplazoSessionBean.getlidEstadoSolicitudNomiActual());
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

					if(this.solicitudreemplazo!=null) {
						this.solicitudreemplazo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSolicitudReemplazo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSolicitudReemplazoGenerico)throws Exception
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
				jComboBoxid_empresaSolicitudReemplazoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSolicitudReemplazoGenerico!=null && jComboBoxid_empresaSolicitudReemplazoGenerico.getItemCount()>0) {
					jComboBoxid_empresaSolicitudReemplazoGenerico.setSelectedIndex(0);
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

					if(this.solicitudreemplazo!=null) {
						this.solicitudreemplazo.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalSolicitudReemplazo.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalSolicitudReemplazoGenerico)throws Exception
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
				jComboBoxid_sucursalSolicitudReemplazoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalSolicitudReemplazoGenerico!=null && jComboBoxid_sucursalSolicitudReemplazoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalSolicitudReemplazoGenerico.setSelectedIndex(0);
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

					if(this.solicitudreemplazo!=null) {
						this.solicitudreemplazo.setEmpleadoJefe(empleadojefeTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.setSelectedItem(empleadojefeTemp);
					}
				} else {
					//jComboBoxid_empleado_jefeSolicitudReemplazo.setSelectedItem(empleadojefeTemp);
					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoJefe") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadojefeTemp!=null && jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo!=null) {
						jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setSelectedItem(empleadojefeTemp);
					} else {
						if(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo!=null) {
							//jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setSelectedItem(empleadojefeTemp);
							if(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.getItemCount()>0) {
								jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setSelectedIndex(0);
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
	public void setActualEmpleadoJefeForeignKeyGenerico(Long idEmpleadoJefeSeleccionado,JComboBox jComboBoxid_empleado_jefeSolicitudReemplazoGenerico)throws Exception
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
				jComboBoxid_empleado_jefeSolicitudReemplazoGenerico.setSelectedItem(empleadojefeTemp);
			} else {
				if(jComboBoxid_empleado_jefeSolicitudReemplazoGenerico!=null && jComboBoxid_empleado_jefeSolicitudReemplazoGenerico.getItemCount()>0) {
					jComboBoxid_empleado_jefeSolicitudReemplazoGenerico.setSelectedIndex(0);
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

					if(this.solicitudreemplazo!=null) {
						this.solicitudreemplazo.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoSolicitudReemplazo.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoSolicitudReemplazoGenerico)throws Exception
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
				jComboBoxid_empleadoSolicitudReemplazoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoSolicitudReemplazoGenerico!=null && jComboBoxid_empleadoSolicitudReemplazoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoSolicitudReemplazoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoReemplazoForeignKey(Long idEmpleadoReemplazoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoreemplazoTemp=null;

			for(Empleado empleadoreemplazoAux:empleadoreemplazosForeignKey) {
				if(empleadoreemplazoAux.getId()!=null && empleadoreemplazoAux.getId().equals(idEmpleadoReemplazoSeleccionado)) {
					empleadoreemplazoTemp=empleadoreemplazoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoreemplazoTemp!=null) {

					if(this.solicitudreemplazo!=null) {
						this.solicitudreemplazo.setEmpleadoReemplazo(empleadoreemplazoTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.setSelectedItem(empleadoreemplazoTemp);
					}
				} else {
					//jComboBoxid_empleado_reemplazoSolicitudReemplazo.setSelectedItem(empleadoreemplazoTemp);
					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoReemplazo") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoreemplazoTemp!=null && jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo!=null) {
						jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setSelectedItem(empleadoreemplazoTemp);
					} else {
						if(jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo!=null) {
							//jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setSelectedItem(empleadoreemplazoTemp);
							if(jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.getItemCount()>0) {
								jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setSelectedIndex(0);
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

	public String getActualEmpleadoReemplazoForeignKeyDescripcion(Long idEmpleadoReemplazoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoreemplazoTemp=null;

			for(Empleado empleadoreemplazoAux:empleadoreemplazosForeignKey) {
				if(empleadoreemplazoAux.getId()!=null && empleadoreemplazoAux.getId().equals(idEmpleadoReemplazoSeleccionado)) {
					empleadoreemplazoTemp=empleadoreemplazoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoreemplazoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoReemplazoForeignKeyGenerico(Long idEmpleadoReemplazoSeleccionado,JComboBox jComboBoxid_empleado_reemplazoSolicitudReemplazoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoreemplazoTemp=null;

			for(Empleado empleadoreemplazoAux:empleadoreemplazosForeignKey) {
				if(empleadoreemplazoAux.getId()!=null && empleadoreemplazoAux.getId().equals(idEmpleadoReemplazoSeleccionado)) {
					empleadoreemplazoTemp=empleadoreemplazoAux;
					break;
				}
			}

			if(empleadoreemplazoTemp!=null) {
				jComboBoxid_empleado_reemplazoSolicitudReemplazoGenerico.setSelectedItem(empleadoreemplazoTemp);
			} else {
				if(jComboBoxid_empleado_reemplazoSolicitudReemplazoGenerico!=null && jComboBoxid_empleado_reemplazoSolicitudReemplazoGenerico.getItemCount()>0) {
					jComboBoxid_empleado_reemplazoSolicitudReemplazoGenerico.setSelectedIndex(0);
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

					if(this.solicitudreemplazo!=null) {
						this.solicitudreemplazo.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraSolicitudReemplazo.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo!=null) {
						jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraSolicitudReemplazoGenerico)throws Exception
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
				jComboBoxid_estructuraSolicitudReemplazoGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraSolicitudReemplazoGenerico!=null && jComboBoxid_estructuraSolicitudReemplazoGenerico.getItemCount()>0) {
					jComboBoxid_estructuraSolicitudReemplazoGenerico.setSelectedIndex(0);
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

					if(this.solicitudreemplazo!=null) {
						this.solicitudreemplazo.setEstadoSolicitudNomi(estadosolicitudnomiTemp);
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setSelectedItem(estadosolicitudnomiTemp);
					}
				} else {
					//jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setSelectedItem(estadosolicitudnomiTemp);
					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.getItemCount()>0) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoSolicitudNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadosolicitudnomiTemp!=null && jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo!=null) {
						jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setSelectedItem(estadosolicitudnomiTemp);
					} else {
						if(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo!=null) {
							//jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setSelectedItem(estadosolicitudnomiTemp);
							if(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.getItemCount()>0) {
								jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setSelectedIndex(0);
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
	public void setActualEstadoSolicitudNomiForeignKeyGenerico(Long idEstadoSolicitudNomiSeleccionado,JComboBox jComboBoxid_estado_solicitud_nomiSolicitudReemplazoGenerico)throws Exception
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
				jComboBoxid_estado_solicitud_nomiSolicitudReemplazoGenerico.setSelectedItem(estadosolicitudnomiTemp);
			} else {
				if(jComboBoxid_estado_solicitud_nomiSolicitudReemplazoGenerico!=null && jComboBoxid_estado_solicitud_nomiSolicitudReemplazoGenerico.getItemCount()>0) {
					jComboBoxid_estado_solicitud_nomiSolicitudReemplazoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SolicitudReemplazo solicitudreemplazo,JComboBox jComboBoxid_empresaSolicitudReemplazoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSolicitudReemplazoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSolicitudReemplazoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				solicitudreemplazo.setid_empresa(empresaAux.getId());
				solicitudreemplazo.setempresa_descripcion(SolicitudReemplazoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				solicitudreemplazo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(SolicitudReemplazo solicitudreemplazo,JComboBox jComboBoxid_sucursalSolicitudReemplazoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalSolicitudReemplazoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalSolicitudReemplazoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				solicitudreemplazo.setid_sucursal(sucursalAux.getId());
				solicitudreemplazo.setsucursal_descripcion(SolicitudReemplazoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				solicitudreemplazo.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoJefeForeignKey(SolicitudReemplazo solicitudreemplazo,JComboBox jComboBoxid_empleado_jefeSolicitudReemplazoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleado_jefeSolicitudReemplazoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleado_jefeSolicitudReemplazoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				solicitudreemplazo.setid_empleado_jefe(empleadoAux.getId());
				solicitudreemplazo.setempleadojefe_descripcion(SolicitudReemplazoConstantesFunciones.getEmpleadoJefeDescripcion(empleadoAux));
				solicitudreemplazo.setEmpleadoJefe(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(SolicitudReemplazo solicitudreemplazo,JComboBox jComboBoxid_empleadoSolicitudReemplazoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoSolicitudReemplazoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoSolicitudReemplazoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				solicitudreemplazo.setid_empleado(empleadoAux.getId());
				solicitudreemplazo.setempleado_descripcion(SolicitudReemplazoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				solicitudreemplazo.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoReemplazoForeignKey(SolicitudReemplazo solicitudreemplazo,JComboBox jComboBoxid_empleado_reemplazoSolicitudReemplazoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleado_reemplazoSolicitudReemplazoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleado_reemplazoSolicitudReemplazoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				solicitudreemplazo.setid_empleado_reemplazo(empleadoAux.getId());
				solicitudreemplazo.setempleadoreemplazo_descripcion(SolicitudReemplazoConstantesFunciones.getEmpleadoReemplazoDescripcion(empleadoAux));
				solicitudreemplazo.setEmpleadoReemplazo(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(SolicitudReemplazo solicitudreemplazo,JComboBox jComboBoxid_estructuraSolicitudReemplazoGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraSolicitudReemplazoGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraSolicitudReemplazoGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				solicitudreemplazo.setid_estructura(estructuraAux.getId());
				solicitudreemplazo.setestructura_descripcion(SolicitudReemplazoConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				solicitudreemplazo.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoSolicitudNomiForeignKey(SolicitudReemplazo solicitudreemplazo,JComboBox jComboBoxid_estado_solicitud_nomiSolicitudReemplazoGenerico)throws Exception
	{
		try
		{
			EstadoSolicitudNomi  estadosolicitudnomiAux=new EstadoSolicitudNomi();

			if(jComboBoxid_estado_solicitud_nomiSolicitudReemplazoGenerico==null) {
				estadosolicitudnomiAux=(EstadoSolicitudNomi)this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.getSelectedItem();
			} else {
				estadosolicitudnomiAux=(EstadoSolicitudNomi)jComboBoxid_estado_solicitud_nomiSolicitudReemplazoGenerico.getSelectedItem();
			}

			if(estadosolicitudnomiAux!=null && estadosolicitudnomiAux.getId()!=null) {
				solicitudreemplazo.setid_estado_solicitud_nomi(estadosolicitudnomiAux.getId());
				solicitudreemplazo.setestadosolicitudnomi_descripcion(SolicitudReemplazoConstantesFunciones.getEstadoSolicitudNomiDescripcion(estadosolicitudnomiAux));
				solicitudreemplazo.setEstadoSolicitudNomi(estadosolicitudnomiAux);			}
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

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
					}

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
					}

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.removeAllItems();

							for(Empleado empleadojefe:this.empleadojefesForeignKey) {
								this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.addItem(empleadojefe);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
					}

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoJefe") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.removeAllItems();

							for(Empleado empleadojefe:this.empleadojefesForeignKey) {
								this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.addItem(empleadojefe);
							}
						}

						if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
					}

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.addItem(empleado);
							}
						}

						if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadoReemplazosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.removeAllItems();

							for(Empleado empleadoreemplazo:this.empleadoreemplazosForeignKey) {
								this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.addItem(empleadoreemplazo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
					}

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoReemplazo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.removeAllItems();

							for(Empleado empleadoreemplazo:this.empleadoreemplazosForeignKey) {
								this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.addItem(empleadoreemplazo);
							}
						}

						if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
					}

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.addItem(estructura);
							}
						}

						if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.removeAllItems();

							for(EstadoSolicitudNomi estadosolicitudnomi:this.estadosolicitudnomisForeignKey) {
								this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.addItem(estadosolicitudnomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { 
					}

					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoSolicitudNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.removeAllItems();

							for(EstadoSolicitudNomi estadosolicitudnomi:this.estadosolicitudnomisForeignKey) {
								this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.addItem(estadosolicitudnomi);
							}
						}

						if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.setSelectedItem(empleadojefe);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setSelectedItem(empleadojefe);
						} else {
							this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoReemplazoForeignKey(Empleado empleadoreemplazo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.setSelectedItem(empleadoreemplazo);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setSelectedItem(empleadoreemplazo);
						} else {
							this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setSelectedItem(estadosolicitudnomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setSelectedItem(estadosolicitudnomi);
						} else {
							this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSolicitudReemplazo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SolicitudReemplazoConstantesFunciones.refrescarForeignKeysDescripcionesSolicitudReemplazo(this.solicitudreemplazoLogic.getSolicitudReemplazos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SolicitudReemplazoConstantesFunciones.refrescarForeignKeysDescripcionesSolicitudReemplazo(this.solicitudreemplazos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(EstadoSolicitudNomi.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//solicitudreemplazoLogic.setSolicitudReemplazos(this.solicitudreemplazos);
			solicitudreemplazoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SolicitudReemplazoParameterReturnGeneral getSolicitudReemplazoParameterGeneral() {
		return this.solicitudreemplazoParameterGeneral;
	}
	
	public void setSolicitudReemplazoParameterGeneral(SolicitudReemplazoParameterReturnGeneral solicitudreemplazoParameterGeneral) {
		this.solicitudreemplazoParameterGeneral = solicitudreemplazoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSolicitudReemplazo() {
		return isPermisoTodoSolicitudReemplazo;
	}

	public void setIsPermisoTodoSolicitudReemplazo(Boolean isPermisoTodoSolicitudReemplazo) {
		this.isPermisoTodoSolicitudReemplazo = isPermisoTodoSolicitudReemplazo;
	}

	public Boolean getIsPermisoNuevoSolicitudReemplazo() {
		return isPermisoNuevoSolicitudReemplazo;
	}

	public void setIsPermisoNuevoSolicitudReemplazo(Boolean isPermisoNuevoSolicitudReemplazo) {
		this.isPermisoNuevoSolicitudReemplazo = isPermisoNuevoSolicitudReemplazo;
	}

	public Boolean getIsPermisoActualizarSolicitudReemplazo() {
		return isPermisoActualizarSolicitudReemplazo;
	}

	public void setIsPermisoActualizarSolicitudReemplazo(Boolean isPermisoActualizarSolicitudReemplazo) {
		this.isPermisoActualizarSolicitudReemplazo = isPermisoActualizarSolicitudReemplazo;
	}

	public Boolean getIsPermisoEliminarSolicitudReemplazo() {
		return isPermisoEliminarSolicitudReemplazo;
	}

	public void setIsPermisoEliminarSolicitudReemplazo(Boolean isPermisoEliminarSolicitudReemplazo) {
		this.isPermisoEliminarSolicitudReemplazo = isPermisoEliminarSolicitudReemplazo;
	}

	public Boolean getIsPermisoGuardarCambiosSolicitudReemplazo() {
		return isPermisoGuardarCambiosSolicitudReemplazo;
	}

	public void setIsPermisoGuardarCambiosSolicitudReemplazo(Boolean isPermisoGuardarCambiosSolicitudReemplazo) {
		this.isPermisoGuardarCambiosSolicitudReemplazo = isPermisoGuardarCambiosSolicitudReemplazo;
	}
	
	public Boolean getIsPermisoConsultaSolicitudReemplazo() {
		return isPermisoConsultaSolicitudReemplazo;
	}

	public void setIsPermisoConsultaSolicitudReemplazo(Boolean isPermisoConsultaSolicitudReemplazo) {
		this.isPermisoConsultaSolicitudReemplazo = isPermisoConsultaSolicitudReemplazo;
	}

	public Boolean getIsPermisoBusquedaSolicitudReemplazo() {
		return isPermisoBusquedaSolicitudReemplazo;
	}

	public void setIsPermisoBusquedaSolicitudReemplazo(Boolean isPermisoBusquedaSolicitudReemplazo) {
		this.isPermisoBusquedaSolicitudReemplazo = isPermisoBusquedaSolicitudReemplazo;
	}

	public Boolean getIsPermisoReporteSolicitudReemplazo() {
		return isPermisoReporteSolicitudReemplazo;
	}

	public void setIsPermisoReporteSolicitudReemplazo(Boolean isPermisoReporteSolicitudReemplazo) {
		this.isPermisoReporteSolicitudReemplazo = isPermisoReporteSolicitudReemplazo;
	}
	
	public Boolean getIsPermisoPaginacionMedioSolicitudReemplazo() {
		return isPermisoPaginacionMedioSolicitudReemplazo;
	}

	public void setIsPermisoPaginacionMedioSolicitudReemplazo(Boolean isPermisoPaginacionMedioSolicitudReemplazo) {
		this.isPermisoPaginacionMedioSolicitudReemplazo = isPermisoPaginacionMedioSolicitudReemplazo;
	}
	
	public Boolean getIsPermisoPaginacionTodoSolicitudReemplazo() {
		return isPermisoPaginacionTodoSolicitudReemplazo;
	}

	public void setIsPermisoPaginacionTodoSolicitudReemplazo(Boolean isPermisoPaginacionTodoSolicitudReemplazo) {
		this.isPermisoPaginacionTodoSolicitudReemplazo = isPermisoPaginacionTodoSolicitudReemplazo;
	}
	
	public Boolean getIsPermisoPaginacionAltoSolicitudReemplazo() {
		return isPermisoPaginacionAltoSolicitudReemplazo;
	}

	public void setIsPermisoPaginacionAltoSolicitudReemplazo(Boolean isPermisoPaginacionAltoSolicitudReemplazo) {
		this.isPermisoPaginacionAltoSolicitudReemplazo = isPermisoPaginacionAltoSolicitudReemplazo;
	}
	
	public Boolean getIsPermisoCopiarSolicitudReemplazo() {
		return isPermisoCopiarSolicitudReemplazo;
	}

	public void setIsPermisoCopiarSolicitudReemplazo(Boolean isPermisoCopiarSolicitudReemplazo) {
		this.isPermisoCopiarSolicitudReemplazo = isPermisoCopiarSolicitudReemplazo;
	}
	
	public Boolean getIsPermisoVerFormSolicitudReemplazo() {
		return isPermisoVerFormSolicitudReemplazo;
	}

	public void setIsPermisoVerFormSolicitudReemplazo(Boolean isPermisoVerFormSolicitudReemplazo) {
		this.isPermisoVerFormSolicitudReemplazo = isPermisoVerFormSolicitudReemplazo;
	}
	
	public Boolean getIsPermisoDuplicarSolicitudReemplazo() {
		return isPermisoDuplicarSolicitudReemplazo;
	}

	public void setIsPermisoDuplicarSolicitudReemplazo(Boolean isPermisoDuplicarSolicitudReemplazo) {
		this.isPermisoDuplicarSolicitudReemplazo = isPermisoDuplicarSolicitudReemplazo;
	}
	
	public Boolean getIsPermisoOrdenSolicitudReemplazo() {
		return isPermisoOrdenSolicitudReemplazo;
	}

	public void setIsPermisoOrdenSolicitudReemplazo(Boolean isPermisoOrdenSolicitudReemplazo) {
		this.isPermisoOrdenSolicitudReemplazo = isPermisoOrdenSolicitudReemplazo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSolicitudReemplazo() {
		return isVisibilidadCeldaNuevoSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaNuevoSolicitudReemplazo(Boolean isVisibilidadCeldaNuevoSolicitudReemplazo) {
		this.isVisibilidadCeldaNuevoSolicitudReemplazo = isVisibilidadCeldaNuevoSolicitudReemplazo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSolicitudReemplazo() {
		return isVisibilidadCeldaDuplicarSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaDuplicarSolicitudReemplazo(Boolean isVisibilidadCeldaDuplicarSolicitudReemplazo) {
		this.isVisibilidadCeldaDuplicarSolicitudReemplazo = isVisibilidadCeldaDuplicarSolicitudReemplazo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSolicitudReemplazo() {
		return isVisibilidadCeldaCopiarSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaCopiarSolicitudReemplazo(Boolean isVisibilidadCeldaCopiarSolicitudReemplazo) {
		this.isVisibilidadCeldaCopiarSolicitudReemplazo = isVisibilidadCeldaCopiarSolicitudReemplazo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSolicitudReemplazo() {
		return isVisibilidadCeldaVerFormSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaVerFormSolicitudReemplazo(Boolean isVisibilidadCeldaVerFormSolicitudReemplazo) {
		this.isVisibilidadCeldaVerFormSolicitudReemplazo = isVisibilidadCeldaVerFormSolicitudReemplazo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSolicitudReemplazo() {
		return isVisibilidadCeldaOrdenSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaOrdenSolicitudReemplazo(Boolean isVisibilidadCeldaOrdenSolicitudReemplazo) {
		this.isVisibilidadCeldaOrdenSolicitudReemplazo = isVisibilidadCeldaOrdenSolicitudReemplazo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSolicitudReemplazo() {
		return isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSolicitudReemplazo(Boolean isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo) {
		this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo = isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSolicitudReemplazo() {
		return isVisibilidadCeldaModificarSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaModificarSolicitudReemplazo(Boolean isVisibilidadCeldaModificarSolicitudReemplazo) {
		this.isVisibilidadCeldaModificarSolicitudReemplazo = isVisibilidadCeldaModificarSolicitudReemplazo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSolicitudReemplazo() {
		return isVisibilidadCeldaActualizarSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaActualizarSolicitudReemplazo(Boolean isVisibilidadCeldaActualizarSolicitudReemplazo) {
		this.isVisibilidadCeldaActualizarSolicitudReemplazo = isVisibilidadCeldaActualizarSolicitudReemplazo;
	}

	public Boolean getIsVisibilidadCeldaEliminarSolicitudReemplazo() {
		return isVisibilidadCeldaEliminarSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaEliminarSolicitudReemplazo(Boolean isVisibilidadCeldaEliminarSolicitudReemplazo) {
		this.isVisibilidadCeldaEliminarSolicitudReemplazo = isVisibilidadCeldaEliminarSolicitudReemplazo;
	}

	public Boolean getIsVisibilidadCeldaCancelarSolicitudReemplazo() {
		return isVisibilidadCeldaCancelarSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaCancelarSolicitudReemplazo(Boolean isVisibilidadCeldaCancelarSolicitudReemplazo) {
		this.isVisibilidadCeldaCancelarSolicitudReemplazo = isVisibilidadCeldaCancelarSolicitudReemplazo;
	}

	public Boolean getIsVisibilidadCeldaGuardarSolicitudReemplazo() {
		return isVisibilidadCeldaGuardarSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaGuardarSolicitudReemplazo(Boolean isVisibilidadCeldaGuardarSolicitudReemplazo) {
		this.isVisibilidadCeldaGuardarSolicitudReemplazo = isVisibilidadCeldaGuardarSolicitudReemplazo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSolicitudReemplazo() {
		return isVisibilidadCeldaGuardarCambiosSolicitudReemplazo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSolicitudReemplazo(Boolean isVisibilidadCeldaGuardarCambiosSolicitudReemplazo) {
		this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo = isVisibilidadCeldaGuardarCambiosSolicitudReemplazo;
	}
		
	public SolicitudReemplazoSessionBean getsolicitudreemplazoSessionBean() {
		return this.solicitudreemplazoSessionBean;
	}
	
	public void setsolicitudreemplazoSessionBean(SolicitudReemplazoSessionBean solicitudreemplazoSessionBean) {
		this.solicitudreemplazoSessionBean=solicitudreemplazoSessionBean;
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

	public Boolean getisVisibilidadFK_IdEmpleadoReemplazo() {
		return this.isVisibilidadFK_IdEmpleadoReemplazo;
	}

	public void setisVisibilidadFK_IdEmpleadoReemplazo(Boolean isVisibilidadFK_IdEmpleadoReemplazo) {
		this.isVisibilidadFK_IdEmpleadoReemplazo=isVisibilidadFK_IdEmpleadoReemplazo;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(solicitudreemplazo,null);
				this.setActualParaGuardarSucursalForeignKey(solicitudreemplazo,null);
				this.setActualParaGuardarEmpleadoJefeForeignKey(solicitudreemplazo,null);
				this.setActualParaGuardarEmpleadoForeignKey(solicitudreemplazo,null);
				this.setActualParaGuardarEmpleadoReemplazoForeignKey(solicitudreemplazo,null);
				this.setActualParaGuardarEstructuraForeignKey(solicitudreemplazo,null);
				this.setActualParaGuardarEstadoSolicitudNomiForeignKey(solicitudreemplazo,null);
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
	
	public void bugActualizarReferenciaActual(SolicitudReemplazo solicitudreemplazo,SolicitudReemplazo solicitudreemplazoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSolicitudReemplazo(solicitudreemplazo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		solicitudreemplazoAux.setId(solicitudreemplazo.getId());
		solicitudreemplazoAux.setVersionRow(solicitudreemplazo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSolicitudReemplazo();
		
			int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = solicitudreemplazoValidator.getInvalidValues(this.solicitudreemplazo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			solicitudreemplazoLogic.setDatosCliente(datosCliente);
			solicitudreemplazoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				solicitudreemplazoAux=new  SolicitudReemplazo();
				
				solicitudreemplazoAux.setIsNew(true);
				solicitudreemplazoAux.setIsChanged(true);
				
				solicitudreemplazoAux.setSolicitudReemplazoOriginal(this.solicitudreemplazo);
				
				solicitudreemplazoAux.setId(this.solicitudreemplazo.getId());	
				solicitudreemplazoAux.setVersionRow(this.solicitudreemplazo.getVersionRow());	
				solicitudreemplazoAux.setid_empresa(this.solicitudreemplazo.getid_empresa());	
				solicitudreemplazoAux.setid_sucursal(this.solicitudreemplazo.getid_sucursal());	
				solicitudreemplazoAux.setid_empleado_jefe(this.solicitudreemplazo.getid_empleado_jefe());	
				solicitudreemplazoAux.setid_empleado(this.solicitudreemplazo.getid_empleado());	
				solicitudreemplazoAux.setid_empleado_reemplazo(this.solicitudreemplazo.getid_empleado_reemplazo());	
				solicitudreemplazoAux.setid_estructura(this.solicitudreemplazo.getid_estructura());	
				solicitudreemplazoAux.setid_estado_solicitud_nomi(this.solicitudreemplazo.getid_estado_solicitud_nomi());	
				solicitudreemplazoAux.setsecuencial(this.solicitudreemplazo.getsecuencial());	
				solicitudreemplazoAux.setfecha_solicita(this.solicitudreemplazo.getfecha_solicita());	
				solicitudreemplazoAux.setfecha_ejecuta(this.solicitudreemplazo.getfecha_ejecuta());	
				solicitudreemplazoAux.setnumero_horas(this.solicitudreemplazo.getnumero_horas());	
				solicitudreemplazoAux.setcosto_unitario(this.solicitudreemplazo.getcosto_unitario());	
				solicitudreemplazoAux.setcosto_total(this.solicitudreemplazo.getcosto_total());	
				solicitudreemplazoAux.setdescripcion(this.solicitudreemplazo.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.solicitudreemplazoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(solicitudreemplazoAux,solicitudreemplazoLogic.getSolicitudReemplazos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudreemplazoAux,solicitudreemplazos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoLogic.saveSolicitudReemplazos();//WithConnection
						//solicitudreemplazoLogic.getSetVersionRowSolicitudReemplazos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.solicitudreemplazo,solicitudreemplazoAux);
					
					this.refrescarForeignKeysDescripcionesSolicitudReemplazo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								solicitudreemplazoLogic.saveSolicitudReemplazoRelaciones(solicitudreemplazoAux);//WithConnection
								//solicitudreemplazoLogic.getSetVersionRowSolicitudReemplazos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.solicitudreemplazo,solicitudreemplazoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.solicitudreemplazoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(solicitudreemplazoAux,solicitudreemplazoLogic.getSolicitudReemplazos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(solicitudreemplazoAux,solicitudreemplazos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.solicitudreemplazo,solicitudreemplazoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				solicitudreemplazoAux=new  SolicitudReemplazo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() 
					|| (this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() && this.solicitudreemplazo.getId()>=0)) {
						
					solicitudreemplazoAux.setIsNew(false);
				}
				
				solicitudreemplazoAux.setIsDeleted(false);
			
				solicitudreemplazoAux.setId(this.solicitudreemplazo.getId());	
				solicitudreemplazoAux.setVersionRow(this.solicitudreemplazo.getVersionRow());	
				solicitudreemplazoAux.setid_empresa(this.solicitudreemplazo.getid_empresa());	
				solicitudreemplazoAux.setid_sucursal(this.solicitudreemplazo.getid_sucursal());	
				solicitudreemplazoAux.setid_empleado_jefe(this.solicitudreemplazo.getid_empleado_jefe());	
				solicitudreemplazoAux.setid_empleado(this.solicitudreemplazo.getid_empleado());	
				solicitudreemplazoAux.setid_empleado_reemplazo(this.solicitudreemplazo.getid_empleado_reemplazo());	
				solicitudreemplazoAux.setid_estructura(this.solicitudreemplazo.getid_estructura());	
				solicitudreemplazoAux.setid_estado_solicitud_nomi(this.solicitudreemplazo.getid_estado_solicitud_nomi());	
				solicitudreemplazoAux.setsecuencial(this.solicitudreemplazo.getsecuencial());	
				solicitudreemplazoAux.setfecha_solicita(this.solicitudreemplazo.getfecha_solicita());	
				solicitudreemplazoAux.setfecha_ejecuta(this.solicitudreemplazo.getfecha_ejecuta());	
				solicitudreemplazoAux.setnumero_horas(this.solicitudreemplazo.getnumero_horas());	
				solicitudreemplazoAux.setcosto_unitario(this.solicitudreemplazo.getcosto_unitario());	
				solicitudreemplazoAux.setcosto_total(this.solicitudreemplazo.getcosto_total());	
				solicitudreemplazoAux.setdescripcion(this.solicitudreemplazo.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(solicitudreemplazoAux,solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudreemplazoAux,solicitudreemplazos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoLogic.saveSolicitudReemplazos();//WithConnection
						//solicitudreemplazoLogic.getSetVersionRowSolicitudReemplazos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.solicitudreemplazo,solicitudreemplazoAux);
					
					this.refrescarForeignKeysDescripcionesSolicitudReemplazo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								solicitudreemplazoLogic.saveSolicitudReemplazoRelaciones(solicitudreemplazoAux);//WithConnection
								//solicitudreemplazoLogic.getSetVersionRowSolicitudReemplazos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.solicitudreemplazo,solicitudreemplazoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.solicitudreemplazoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(solicitudreemplazoAux,solicitudreemplazoLogic.getSolicitudReemplazos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(solicitudreemplazoAux,solicitudreemplazos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.solicitudreemplazo,solicitudreemplazoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				solicitudreemplazoAux=new  SolicitudReemplazo();
				
				solicitudreemplazoAux.setIsNew(false);
				solicitudreemplazoAux.setIsChanged(false);
				
				solicitudreemplazoAux.setIsDeleted(true);
				
				solicitudreemplazoAux.setId(this.solicitudreemplazo.getId());	
				solicitudreemplazoAux.setVersionRow(this.solicitudreemplazo.getVersionRow());	
				solicitudreemplazoAux.setid_empresa(this.solicitudreemplazo.getid_empresa());	
				solicitudreemplazoAux.setid_sucursal(this.solicitudreemplazo.getid_sucursal());	
				solicitudreemplazoAux.setid_empleado_jefe(this.solicitudreemplazo.getid_empleado_jefe());	
				solicitudreemplazoAux.setid_empleado(this.solicitudreemplazo.getid_empleado());	
				solicitudreemplazoAux.setid_empleado_reemplazo(this.solicitudreemplazo.getid_empleado_reemplazo());	
				solicitudreemplazoAux.setid_estructura(this.solicitudreemplazo.getid_estructura());	
				solicitudreemplazoAux.setid_estado_solicitud_nomi(this.solicitudreemplazo.getid_estado_solicitud_nomi());	
				solicitudreemplazoAux.setsecuencial(this.solicitudreemplazo.getsecuencial());	
				solicitudreemplazoAux.setfecha_solicita(this.solicitudreemplazo.getfecha_solicita());	
				solicitudreemplazoAux.setfecha_ejecuta(this.solicitudreemplazo.getfecha_ejecuta());	
				solicitudreemplazoAux.setnumero_horas(this.solicitudreemplazo.getnumero_horas());	
				solicitudreemplazoAux.setcosto_unitario(this.solicitudreemplazo.getcosto_unitario());	
				solicitudreemplazoAux.setcosto_total(this.solicitudreemplazo.getcosto_total());	
				solicitudreemplazoAux.setdescripcion(this.solicitudreemplazo.getdescripcion());	
				
				if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.solicitudreemplazoAux.getId()>=0) {	
						this.solicitudreemplazosEliminados.add(solicitudreemplazoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(solicitudreemplazoAux,solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudreemplazoAux,solicitudreemplazos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoLogic.saveSolicitudReemplazos();//WithConnection
						//solicitudreemplazoLogic.getSetVersionRowSolicitudReemplazos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								solicitudreemplazoLogic.saveSolicitudReemplazoRelaciones(solicitudreemplazoAux);//WithConnection
								//solicitudreemplazoLogic.getSetVersionRowSolicitudReemplazos();//WithConnection
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
							if(this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.solicitudreemplazoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(solicitudreemplazoAux,solicitudreemplazoLogic.getSolicitudReemplazos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(solicitudreemplazoAux,solicitudreemplazos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getSolicitudReemplazos().addAll(this.solicitudreemplazosEliminados);
					
					solicitudreemplazoLogic.saveSolicitudReemplazos();//WithConnection
					//solicitudreemplazoLogic.getSetVersionRowSolicitudReemplazos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSolicitudReemplazo();
				
				this.solicitudreemplazosEliminados= new ArrayList<SolicitudReemplazo>();		
			}
			
			if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Solicitud Reemplazo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Solicitud Reemplazo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.solicitudreemplazo=solicitudreemplazoAux;
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
      		//this.finishProcessSolicitudReemplazo();
      	}
		
	}	
	
	public void actualizarRelaciones(SolicitudReemplazo solicitudreemplazoLocal) throws Exception {
		
		if(this.solicitudreemplazoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SolicitudReemplazo solicitudreemplazoLocal) throws Exception {	
		if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				solicitudreemplazoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				solicitudreemplazoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadojefeBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadojefeBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadojefeBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadojefeBeanSwingJInternalFrameLocal.actualizarLista(empleadojefeBeanSwingJInternalFrameLocal.empleado,this.empleadojefesForeignKey);

				empleadojefeBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadojefeBeanSwingJInternalFrameLocal.empleado);

				solicitudreemplazoLocal.setEmpleadoJefe(empleadojefeBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleadoJefe();
				this.cargarCombosFrameEmpleadoJefesForeignKey("Formulario");
				this.setActualEmpleadoJefeForeignKey(empleadojefeBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				solicitudreemplazoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoreemplazoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoreemplazoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoreemplazoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoreemplazoBeanSwingJInternalFrameLocal.actualizarLista(empleadoreemplazoBeanSwingJInternalFrameLocal.empleado,this.empleadoreemplazosForeignKey);

				empleadoreemplazoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoreemplazoBeanSwingJInternalFrameLocal.empleado);

				solicitudreemplazoLocal.setEmpleadoReemplazo(empleadoreemplazoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleadoReemplazo();
				this.cargarCombosFrameEmpleadoReemplazosForeignKey("Formulario");
				this.setActualEmpleadoReemplazoForeignKey(empleadoreemplazoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				solicitudreemplazoLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoSolicitudNomiDetalleFormJInternalFrame.class)) {
				EstadoSolicitudNomiBeanSwingJInternalFrame estadosolicitudnomiBeanSwingJInternalFrameLocal=(EstadoSolicitudNomiBeanSwingJInternalFrame) ((EstadoSolicitudNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadosolicitudnomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoSolicitudNomi(estadosolicitudnomiBeanSwingJInternalFrameLocal.getestadosolicitudnomi(),true);
				estadosolicitudnomiBeanSwingJInternalFrameLocal.actualizarLista(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi,this.estadosolicitudnomisForeignKey);

				estadosolicitudnomiBeanSwingJInternalFrameLocal.actualizarRelaciones(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi);

				solicitudreemplazoLocal.setEstadoSolicitudNomi(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi);

				this.addItemDefectoCombosForeignKeyEstadoSolicitudNomi();
				this.cargarCombosFrameEstadoSolicitudNomisForeignKey("Formulario");
				this.setActualEstadoSolicitudNomiForeignKey(estadosolicitudnomiBeanSwingJInternalFrameLocal.estadosolicitudnomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSolicitudReemplazoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = solicitudreemplazoValidator.getInvalidValues(this.solicitudreemplazo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SolicitudReemplazo solicitudreemplazo,List<SolicitudReemplazo> solicitudreemplazos) throws Exception {
		try	{		
			SolicitudReemplazoConstantesFunciones.actualizarLista(solicitudreemplazo,solicitudreemplazos,this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SolicitudReemplazo solicitudreemplazo,List<SolicitudReemplazo> solicitudreemplazos) throws Exception {
		try	{			
			SolicitudReemplazoConstantesFunciones.actualizarSelectedLista(solicitudreemplazo,solicitudreemplazos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SolicitudReemplazo> solicitudreemplazosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				solicitudreemplazosLocal=this.solicitudreemplazoLogic.getSolicitudReemplazos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				solicitudreemplazosLocal=this.solicitudreemplazos;
			}
			//ARCHITECTURE
		
			for(SolicitudReemplazo solicitudreemplazoLocal:solicitudreemplazosLocal) {
				if(this.permiteMantenimiento(solicitudreemplazoLocal) && solicitudreemplazoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SolicitudReemplazoConstantesFunciones.getSolicitudReemplazoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_empresaSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_sucursalSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.IDEMPLEADOJEFE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_empleado_jefeSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_empleadoSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.IDEMPLEADOREEMPLAZO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_empleado_reemplazoSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_estructuraSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.IDESTADOSOLICITUDNOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_estado_solicitud_nomiSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelsecuencialSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.FECHASOLICITA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelfecha_solicitaSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.FECHAEJECUTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelfecha_ejecutaSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.NUMEROHORAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelnumero_horasSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.COSTOUNITARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelcosto_unitarioSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelcosto_totalSolicitudReemplazo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SolicitudReemplazoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabeldescripcionSolicitudReemplazo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_empresaSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_sucursalSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_empleado_jefeSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_empleadoSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_empleado_reemplazoSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_estructuraSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelid_estado_solicitud_nomiSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelsecuencialSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelfecha_solicitaSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelfecha_ejecutaSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelnumero_horasSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelcosto_unitarioSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelcosto_totalSolicitudReemplazo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabeldescripcionSolicitudReemplazo,"");
		
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
		this.iIdNuevoSolicitudReemplazo--;	
		
		
		this.solicitudreemplazoAux=new SolicitudReemplazo();
		
		this.solicitudreemplazoAux.setId(this.iIdNuevoSolicitudReemplazo);
		this.solicitudreemplazoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.solicitudreemplazoLogic.getSolicitudReemplazos().add(this.solicitudreemplazoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.solicitudreemplazos.add(this.solicitudreemplazoAux);
		}
		//ARCHITECTURE
		
		this.solicitudreemplazo=this.solicitudreemplazoAux;
		
		if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSolicitudReemplazo(this.solicitudreemplazo);
			this.setVariablesObjetoActualToFormularioForeignKeySolicitudReemplazo(this.solicitudreemplazo);
		}
				
		//this.setDefaultControlesSolicitudReemplazo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySolicitudReemplazo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySolicitudReemplazo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySolicitudReemplazo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSolicitudReemplazo(this.solicitudreemplazoBean,this.solicitudreemplazo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
			classes=SolicitudReemplazoConstantesFunciones.getClassesRelationshipsOfSolicitudReemplazo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.solicitudreemplazoReturnGeneral=solicitudreemplazoLogic.procesarEventosSolicitudReemplazosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.solicitudreemplazoLogic.getSolicitudReemplazos(),this.solicitudreemplazo,this.solicitudreemplazoParameterGeneral,this.isEsNuevoSolicitudReemplazo,classes);//this.solicitudreemplazoLogic.getSolicitudReemplazo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSolicitudReemplazo(this.solicitudreemplazoReturnGeneral,this.solicitudreemplazoBean,false);
		
		if(this.solicitudreemplazoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySolicitudReemplazo(this.solicitudreemplazoReturnGeneral.getSolicitudReemplazo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSolicitudReemplazo(this.solicitudreemplazoReturnGeneral.getSolicitudReemplazo());
		}
		
		if(this.solicitudreemplazoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSolicitudReemplazo(this.solicitudreemplazoReturnGeneral.getSolicitudReemplazo(),classes);//this.solicitudreemplazoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySolicitudReemplazo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySolicitudReemplazo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.RecargarFormSolicitudReemplazo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSolicitudReemplazo(false);
						
			if(solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSolicitudReemplazo();
			}
			
			this.actualizarVisualTableDatosSolicitudReemplazo();
			
			this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(this.getIndiceNuevoSolicitudReemplazo(), this.getIndiceNuevoSolicitudReemplazo());
			
			this.seleccionarFilaTablaSolicitudReemplazoActual();
						
			this.actualizarEstadoCeldasBotonesSolicitudReemplazo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSolicitudReemplazo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldsecuencialSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarsecuencialSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_solicitaSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarfecha_solicitaSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_ejecutaSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarfecha_ejecutaSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldnumero_horasSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarnumero_horasSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_unitarioSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarcosto_unitarioSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_totalSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarcosto_totalSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jTextAreadescripcionSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activardescripcionSolicitudReemplazo);	
		//
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarid_empresaSolicitudReemplazo);//
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarid_sucursalSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarid_empleado_jefeSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarid_empleadoSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarid_empleado_reemplazoSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarid_estructuraSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setEnabled(isHabilitar && this.solicitudreemplazoConstantesFunciones.activarid_estado_solicitud_nomiSolicitudReemplazo);
	};
	
	public void setDefaultControlesSolicitudReemplazo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSolicitudReemplazo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.solicitudreemplazoSessionBean.setConGuardarRelaciones(true);			
			this.solicitudreemplazoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTabbedPaneRelacionesSolicitudReemplazo.setVisible(true);
			
					
		} else {
			//this.solicitudreemplazoSessionBean.setConGuardarRelaciones(false);			
			this.solicitudreemplazoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTabbedPaneRelacionesSolicitudReemplazo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSolicitudReemplazo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazoLogic.getSolicitudReemplazos()) {
				if(solicitudreemplazoAux.getId().equals(this.iIdNuevoSolicitudReemplazo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazos) {
				if(solicitudreemplazoAux.getId().equals(this.iIdNuevoSolicitudReemplazo)) {
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
	
	public int getIndiceActualSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazoLogic.getSolicitudReemplazos()) {
				if(solicitudreemplazoAux.getId().equals(solicitudreemplazo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazos) {
				if(solicitudreemplazoAux.getId().equals(solicitudreemplazo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSolicitudReemplazo(SolicitudReemplazo solicitudreemplazoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazoLogic.getSolicitudReemplazos()) {
				if(solicitudreemplazoAux.getSolicitudReemplazoOriginal().getId().equals(solicitudreemplazoOriginal.getId())) {
					existe=true;
					solicitudreemplazoOriginal.setId(solicitudreemplazoAux.getId());
					solicitudreemplazoOriginal.setVersionRow(solicitudreemplazoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazos) {
				if(solicitudreemplazoAux.getSolicitudReemplazoOriginal().getId().equals(solicitudreemplazoOriginal.getId())) {
					existe=true;
					solicitudreemplazoOriginal.setId(solicitudreemplazoAux.getId());
					solicitudreemplazoOriginal.setVersionRow(solicitudreemplazoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSolicitudReemplazo(Boolean esParaCancelar) throws Exception {
		solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
		solicitudreemplazoAux=new SolicitudReemplazo();
		
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazoLogic.getSolicitudReemplazos()) {
					if(solicitudreemplazoAux.getId()<0) {
						solicitudreemplazosAux.add(solicitudreemplazoAux);
					}		
				}
				this.iIdNuevoSolicitudReemplazo=0L;
				this.solicitudreemplazoLogic.getSolicitudReemplazos().removeAll(solicitudreemplazosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazos) {
					if(solicitudreemplazoAux.getId()<0) {
						solicitudreemplazosAux.add(solicitudreemplazoAux);
					}		
				}
				this.iIdNuevoSolicitudReemplazo=0L;
				this.solicitudreemplazos.removeAll(solicitudreemplazosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSolicitudReemplazo 
					&& this.solicitudreemplazoLogic.getSolicitudReemplazos().size()>0
					) {
					solicitudreemplazoAux=this.solicitudreemplazoLogic.getSolicitudReemplazos().get(this.solicitudreemplazoLogic.getSolicitudReemplazos().size() - 1);
				
					if(solicitudreemplazoAux.getId()<0) {
						this.solicitudreemplazoLogic.getSolicitudReemplazos().remove(solicitudreemplazoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSolicitudReemplazo && this.solicitudreemplazos.size()>0) {
					solicitudreemplazoAux=this.solicitudreemplazos.get(this.solicitudreemplazos.size() - 1);
				
					if(solicitudreemplazoAux.getId()<0) {
						this.solicitudreemplazos.remove(solicitudreemplazoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSolicitudReemplazo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(solicitudreemplazo.getId()<0) {
				this.solicitudreemplazoLogic.getSolicitudReemplazos().remove(this.solicitudreemplazo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(solicitudreemplazo.getId()<0) {
				this.solicitudreemplazos.remove(this.solicitudreemplazo);
			}
		}			
	}
	
	public void setEstadosInicialesSolicitudReemplazo(List<SolicitudReemplazo> solicitudreemplazosAux) throws Exception {
		SolicitudReemplazoConstantesFunciones.setEstadosInicialesSolicitudReemplazo(solicitudreemplazosAux);
	}
	
	public void setEstadosInicialesSolicitudReemplazo(SolicitudReemplazo solicitudreemplazoAux) throws Exception {
		SolicitudReemplazoConstantesFunciones.setEstadosInicialesSolicitudReemplazo(solicitudreemplazoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSolicitudReemplazoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSolicitudReemplazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSolicitudReemplazoActual()) {
				if(!this.isEsNuevoSolicitudReemplazo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSolicitudReemplazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSolicitudReemplazo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSolicitudReemplazoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Solicitud Reemplazo ?", "MANTENIMIENTO DE Solicitud Reemplazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSolicitudReemplazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SolicitudReemplazo solicitudreemplazo) throws Exception {
		SolicitudReemplazoConstantesFunciones.seleccionarAsignar(this.solicitudreemplazo,solicitudreemplazo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSolicitudReemplazo=this.isPermisoActualizarOriginalSolicitudReemplazo;
			
			
			this.seleccionarAsignar(solicitudreemplazo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SolicitudReemplazoConstantesFunciones.quitarEspaciosSolicitudReemplazo(this.solicitudreemplazo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSolicitudReemplazo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.solicitudreemplazoSessionBean.setsFuncionBusquedaRapida(this.solicitudreemplazoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSolicitudReemplazo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSolicitudReemplazo(esParaCancelar);				
				this.cancelarNuevoSolicitudReemplazo(esParaCancelar);								
			}
			
			this.solicitudreemplazo=new SolicitudReemplazo();
			
			this.inicializarSolicitudReemplazo();
			
			this.actualizarEstadoCeldasBotonesSolicitudReemplazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSolicitudReemplazo() throws Exception {
		try {
			SolicitudReemplazoConstantesFunciones.inicializarSolicitudReemplazo(this.solicitudreemplazo);
			
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
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.solicitudreemplazoLogic.getSolicitudReemplazos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSolicitudReemplazos(String sAccionBusqueda,List<SolicitudReemplazo> solicitudreemplazosParaReportes) throws Exception {
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
					sPathReporteFinal="SolicitudReemplazo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SolicitudReemplazoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SolicitudReemplazoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SolicitudReemplazo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Solicitud Reemplazos");		
		parameters.put("busquedapor", SolicitudReemplazoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSolicitudReemplazo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SolicitudReemplazoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SolicitudReemplazoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSolicitudReemplazo=new JRBeanArrayDataSource(SolicitudReemplazoJInternalFrame.TraerSolicitudReemplazoBeans(solicitudreemplazosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSolicitudReemplazo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SolicitudReemplazoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SolicitudReemplazoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SolicitudReemplazoBean.TraerSolicitudReemplazoBeans(solicitudreemplazosParaReportes).toArray()));
							
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
				this.generarExcelReporteSolicitudReemplazos(sAccionBusqueda,sTipoArchivoReporte,solicitudreemplazosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSolicitudReemplazos(sAccionBusqueda,sTipoArchivoReporte,solicitudreemplazosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSolicitudReemplazoActionPerformed(null);
					//this.generarExcelReporteSolicitudReemplazos(sAccionBusqueda,sTipoArchivoReporte,solicitudreemplazosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSolicitudReemplazos(sAccionBusqueda,sTipoArchivoReporte,solicitudreemplazosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSolicitudReemplazos(sAccionBusqueda,sTipoArchivoReporte,solicitudreemplazosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSolicitudReemplazos(sAccionBusqueda,sTipoArchivoReporte,solicitudreemplazosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSolicitudReemplazos(String sAccionBusqueda,String sTipoArchivoReporte,List<SolicitudReemplazo> solicitudreemplazosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudreemplazo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SolicitudReemplazos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSolicitudReemplazo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SolicitudReemplazo solicitudreemplazo : solicitudreemplazosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SolicitudReemplazoConstantesFunciones.generarExcelReporteDataSolicitudReemplazo("NORMAL",row,workbook,solicitudreemplazo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Reemplazo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSolicitudReemplazo(String sTipo,Row row,Workbook workbook) {
		
		SolicitudReemplazoConstantesFunciones.generarExcelReporteHeaderSolicitudReemplazo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSolicitudReemplazos(String sAccionBusqueda,String sTipoArchivoReporte,List<SolicitudReemplazo> solicitudreemplazosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudreemplazo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SolicitudReemplazos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SolicitudReemplazo solicitudreemplazo : solicitudreemplazosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SolicitudReemplazoConstantesFunciones.getSolicitudReemplazoDescripcion(solicitudreemplazo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getempleadojefe_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getempleadoreemplazo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getestadosolicitudnomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getfecha_solicita());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getfecha_ejecuta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getnumero_horas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getcosto_unitario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(solicitudreemplazo.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Reemplazo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSolicitudReemplazos(String sAccionBusqueda,String sTipoArchivoReporte,List<SolicitudReemplazo> solicitudreemplazosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SolicitudReemplazo> solicitudreemplazosRespaldo=null;
		
		classes=SolicitudReemplazoConstantesFunciones.getClassesRelationshipsOfSolicitudReemplazo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.solicitudreemplazoLogic.setDatosCliente(this.datosCliente);
		this.solicitudreemplazoLogic.setDatosDeep(this.datosDeep);
		this.solicitudreemplazoLogic.setIsConDeep(true);
		
		solicitudreemplazosRespaldo=this.solicitudreemplazoLogic.getSolicitudReemplazos();
		
		this.solicitudreemplazoLogic.setSolicitudReemplazos(solicitudreemplazosParaReportes);	
		this.solicitudreemplazoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		solicitudreemplazosParaReportes=this.solicitudreemplazoLogic.getSolicitudReemplazos();
		this.solicitudreemplazoLogic.setSolicitudReemplazos(solicitudreemplazosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudreemplazo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SolicitudReemplazos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSolicitudReemplazo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SolicitudReemplazo solicitudreemplazo : solicitudreemplazosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSolicitudReemplazo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SolicitudReemplazoConstantesFunciones.generarExcelReporteDataSolicitudReemplazo("NORMAL",row,workbook,solicitudreemplazo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SolicitudReemplazoConstantesFunciones.getSolicitudReemplazoDescripcion(solicitudreemplazo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Reemplazo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSolicitudReemplazo() throws Exception {		
		this.startProcessSolicitudReemplazo(true);
	}
	
	public void startProcessSolicitudReemplazo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSolicitudReemplazo ,this.jPanelParametrosReportesSolicitudReemplazo, this.jScrollPanelDatosSolicitudReemplazo,this.jPanelPaginacionSolicitudReemplazo, this.jScrollPanelDatosEdicionSolicitudReemplazo, this.jPanelAccionesSolicitudReemplazo,this.jPanelAccionesFormularioSolicitudReemplazo,this.jmenuBarSolicitudReemplazo,this.jmenuBarDetalleSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,this.jTtoolBarDetalleSolicitudReemplazo);		
		
		final JTabbedPane jTabbedPaneBusquedasSolicitudReemplazo=this.jTabbedPaneBusquedasSolicitudReemplazo; 
		
		final JPanel jPanelParametrosReportesSolicitudReemplazo=this.jPanelParametrosReportesSolicitudReemplazo;
		//final JScrollPane jScrollPanelDatosSolicitudReemplazo=this.jScrollPanelDatosSolicitudReemplazo;
		final JTable jTableDatosSolicitudReemplazo=this.jTableDatosSolicitudReemplazo;		
		final JPanel jPanelPaginacionSolicitudReemplazo=this.jPanelPaginacionSolicitudReemplazo;
		//final JScrollPane jScrollPanelDatosEdicionSolicitudReemplazo=this.jScrollPanelDatosEdicionSolicitudReemplazo;
		final JPanel jPanelAccionesSolicitudReemplazo=this.jPanelAccionesSolicitudReemplazo;
		
		JPanel jPanelCamposAuxiliarSolicitudReemplazo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSolicitudReemplazo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			jPanelCamposAuxiliarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelCamposSolicitudReemplazo;
			jPanelAccionesFormularioAuxiliarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelAccionesFormularioSolicitudReemplazo;
		}
		
		final JPanel jPanelCamposSolicitudReemplazo=jPanelCamposAuxiliarSolicitudReemplazo;
		final JPanel jPanelAccionesFormularioSolicitudReemplazo=jPanelAccionesFormularioAuxiliarSolicitudReemplazo;
		
		
		final JMenuBar jmenuBarSolicitudReemplazo=this.jmenuBarSolicitudReemplazo;
		final JToolBar jTtoolBarSolicitudReemplazo=this.jTtoolBarSolicitudReemplazo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSolicitudReemplazo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSolicitudReemplazo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			jmenuBarDetalleAuxiliarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jmenuBarDetalleSolicitudReemplazo;
			jTtoolBarDetalleAuxiliarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jTtoolBarDetalleSolicitudReemplazo;
		}
		
		final JMenuBar jmenuBarDetalleSolicitudReemplazo=jmenuBarDetalleAuxiliarSolicitudReemplazo;
		final JToolBar jTtoolBarDetalleSolicitudReemplazo=jTtoolBarDetalleAuxiliarSolicitudReemplazo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSolicitudReemplazo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSolicitudReemplazo;
			processRunnable.jTableDatos=jTableDatosSolicitudReemplazo;
			processRunnable.jPanelCampos=jPanelCamposSolicitudReemplazo;
			processRunnable.jPanelPaginacion=jPanelPaginacionSolicitudReemplazo;
			processRunnable.jPanelAcciones=jPanelAccionesSolicitudReemplazo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSolicitudReemplazo;
			
			
			processRunnable.jmenuBar=jmenuBarSolicitudReemplazo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSolicitudReemplazo;
			processRunnable.jTtoolBar=jTtoolBarSolicitudReemplazo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSolicitudReemplazo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSolicitudReemplazo ,jPanelParametrosReportesSolicitudReemplazo,jTableDatosSolicitudReemplazo, /*jScrollPanelDatosSolicitudReemplazo,*/jPanelCamposSolicitudReemplazo,jPanelPaginacionSolicitudReemplazo, /*jScrollPanelDatosEdicionSolicitudReemplazo,*/ jPanelAccionesSolicitudReemplazo,jPanelAccionesFormularioSolicitudReemplazo,jmenuBarSolicitudReemplazo,jmenuBarDetalleSolicitudReemplazo,jTtoolBarSolicitudReemplazo,jTtoolBarDetalleSolicitudReemplazo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSolicitudReemplazo ,jPanelParametrosReportesSolicitudReemplazo, jScrollPanelDatosSolicitudReemplazo,jPanelPaginacionSolicitudReemplazo, jScrollPanelDatosEdicionSolicitudReemplazo, jPanelAccionesSolicitudReemplazo,jPanelAccionesFormularioSolicitudReemplazo,jmenuBarSolicitudReemplazo,jmenuBarDetalleSolicitudReemplazo,jTtoolBarSolicitudReemplazo,jTtoolBarDetalleSolicitudReemplazo);
						
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
	
	public void finishProcessSolicitudReemplazo() {// throws Exception 
		this.finishProcessSolicitudReemplazo(true);
	}
	
	public void finishProcessSolicitudReemplazo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSolicitudReemplazo ,this.jPanelParametrosReportesSolicitudReemplazo, this.jScrollPanelDatosSolicitudReemplazo,this.jPanelPaginacionSolicitudReemplazo, this.jScrollPanelDatosEdicionSolicitudReemplazo, this.jPanelAccionesSolicitudReemplazo,this.jPanelAccionesFormularioSolicitudReemplazo,this.jmenuBarSolicitudReemplazo,this.jmenuBarDetalleSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,this.jTtoolBarDetalleSolicitudReemplazo);		
		
		final JTabbedPane jTabbedPaneBusquedasSolicitudReemplazo=this.jTabbedPaneBusquedasSolicitudReemplazo; 
		
		final JPanel jPanelParametrosReportesSolicitudReemplazo=this.jPanelParametrosReportesSolicitudReemplazo;
		//final JScrollPane jScrollPanelDatosSolicitudReemplazo=this.jScrollPanelDatosSolicitudReemplazo;
		final JTable jTableDatosSolicitudReemplazo=this.jTableDatosSolicitudReemplazo;		
		final JPanel jPanelPaginacionSolicitudReemplazo=this.jPanelPaginacionSolicitudReemplazo;
		//final JScrollPane jScrollPanelDatosEdicionSolicitudReemplazo=this.jScrollPanelDatosEdicionSolicitudReemplazo;
		final JPanel jPanelAccionesSolicitudReemplazo=this.jPanelAccionesSolicitudReemplazo;
		
		JPanel jPanelCamposAuxiliarSolicitudReemplazo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSolicitudReemplazo=new JPanel();
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			jPanelCamposAuxiliarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelCamposSolicitudReemplazo;
			jPanelAccionesFormularioAuxiliarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelAccionesFormularioSolicitudReemplazo;
		}
		
		final JPanel jPanelCamposSolicitudReemplazo=jPanelCamposAuxiliarSolicitudReemplazo;
		final JPanel jPanelAccionesFormularioSolicitudReemplazo=jPanelAccionesFormularioAuxiliarSolicitudReemplazo;
		
		
		final JMenuBar jmenuBarSolicitudReemplazo=this.jmenuBarSolicitudReemplazo;		
		final JToolBar jTtoolBarSolicitudReemplazo=this.jTtoolBarSolicitudReemplazo;
				
		JMenuBar jmenuBarDetalleAuxiliarSolicitudReemplazo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSolicitudReemplazo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			jmenuBarDetalleAuxiliarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jmenuBarDetalleSolicitudReemplazo;
			jTtoolBarDetalleAuxiliarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jTtoolBarDetalleSolicitudReemplazo;		
		}
		
		final JMenuBar jmenuBarDetalleSolicitudReemplazo=jmenuBarDetalleAuxiliarSolicitudReemplazo;
		final JToolBar jTtoolBarDetalleSolicitudReemplazo=jTtoolBarDetalleAuxiliarSolicitudReemplazo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSolicitudReemplazo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSolicitudReemplazo;
			processRunnable.jTableDatos=jTableDatosSolicitudReemplazo;
			processRunnable.jPanelCampos=jPanelCamposSolicitudReemplazo;
			processRunnable.jPanelPaginacion=jPanelPaginacionSolicitudReemplazo;
			processRunnable.jPanelAcciones=jPanelAccionesSolicitudReemplazo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSolicitudReemplazo;
			
			
			processRunnable.jmenuBar=jmenuBarSolicitudReemplazo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSolicitudReemplazo;
			processRunnable.jTtoolBar=jTtoolBarSolicitudReemplazo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSolicitudReemplazo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSolicitudReemplazo ,jPanelParametrosReportesSolicitudReemplazo, jTableDatosSolicitudReemplazo,/*jScrollPanelDatosSolicitudReemplazo,*/jPanelCamposSolicitudReemplazo,jPanelPaginacionSolicitudReemplazo, /*jScrollPanelDatosEdicionSolicitudReemplazo,*/ jPanelAccionesSolicitudReemplazo,jPanelAccionesFormularioSolicitudReemplazo,jmenuBarSolicitudReemplazo,jmenuBarDetalleSolicitudReemplazo,jTtoolBarSolicitudReemplazo,jTtoolBarDetalleSolicitudReemplazo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSolicitudReemplazo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSolicitudReemplazo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSolicitudReemplazo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSolicitudReemplazo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSolicitudReemplazo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSolicitudReemplazo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSolicitudReemplazo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSolicitudReemplazo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSolicitudReemplazo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.solicitudreemplazoConstantesFunciones.getsFinalQuerySolicitudReemplazo();
		String  finalQueryPaginacionTodos=this.solicitudreemplazoConstantesFunciones.getsFinalQuerySolicitudReemplazo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SolicitudReemplazoConstantesFunciones.getArrayColumnasGlobalesNoSolicitudReemplazo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SolicitudReemplazoConstantesFunciones.getArrayColumnasGlobalesSolicitudReemplazo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SolicitudReemplazoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.solicitudreemplazosEliminados= new ArrayList<SolicitudReemplazo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSolicitudReemplazo();
		
				///*SolicitudReemplazoSessionBean*/this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
			
			if(this.solicitudreemplazoSessionBean==null) {
				this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
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
					this.iNumeroPaginacion=SolicitudReemplazoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SolicitudReemplazoConstantesFunciones.getClassesForeignKeysOfSolicitudReemplazo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/solicitudreemplazo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			solicitudreemplazosAux= new ArrayList<SolicitudReemplazo>();
			
				
			solicitudreemplazoLogic.setDatosCliente(this.datosCliente);
			solicitudreemplazoLogic.setDatosDeep(this.datosDeep);
			solicitudreemplazoLogic.setIsConDeep(true);
			
			
			solicitudreemplazoLogic.getSolicitudReemplazoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					solicitudreemplazoLogic.getTodosSolicitudReemplazos(finalQueryGlobal,pagination);
					
					//solicitudreemplazoLogic.getTodosSolicitudReemplazosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(solicitudreemplazoLogic.getSolicitudReemplazos()==null|| solicitudreemplazoLogic.getSolicitudReemplazos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							solicitudreemplazosAux= new ArrayList<SolicitudReemplazo>();
							solicitudreemplazosAux.addAll(solicitudreemplazoLogic.getSolicitudReemplazos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazosAux= new ArrayList<SolicitudReemplazo>();
							solicitudreemplazosAux.addAll(solicitudreemplazos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							solicitudreemplazoLogic.getTodosSolicitudReemplazos(finalQueryGlobal+"",this.pagination);												
							
							//solicitudreemplazoLogic.getTodosSolicitudReemplazosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSolicitudReemplazos("Todos",solicitudreemplazoLogic.getSolicitudReemplazos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());					
							solicitudreemplazoLogic.getSolicitudReemplazos().addAll(solicitudreemplazosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazos=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazos.addAll(solicitudreemplazosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSolicitudReemplazo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSolicitudReemplazo=this.idActual;
				
				} else if(this.idSolicitudReemplazoActual!=null && this.idSolicitudReemplazoActual!=0L) {
					idSolicitudReemplazo=idSolicitudReemplazoActual;
				}
				
					
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndicePorId(idSolicitudReemplazo);
				
				this.solicitudreemplazos=new ArrayList<SolicitudReemplazo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					solicitudreemplazoLogic.getEntity(idSolicitudReemplazo);
					
					//solicitudreemplazoLogic.getEntityWithConnection(idSolicitudReemplazo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());
					solicitudreemplazoLogic.getSolicitudReemplazos().add(solicitudreemplazoLogic.getSolicitudReemplazo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudreemplazos=new ArrayList<SolicitudReemplazo>();
					this.solicitudreemplazos.add(solicitudreemplazo);
				}
				
				if(solicitudreemplazoLogic.getSolicitudReemplazo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudreemplazoLogic.getSolicitudReemplazos()==null||solicitudreemplazoLogic.getSolicitudReemplazos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudreemplazos==null|| solicitudreemplazos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
						solicitudreemplazosAux.addAll(solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazosAux.addAll(solicitudreemplazos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudReemplazos("FK_IdEmpleado",solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudReemplazos("FK_IdEmpleado",solicitudreemplazos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());
						solicitudreemplazoLogic.getSolicitudReemplazos().addAll(solicitudreemplazosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazos=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazos.addAll(solicitudreemplazosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleadoJefe")) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpleadoJefe(finalQueryGlobal,pagination,id_empleado_jefeFK_IdEmpleadoJefe);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudreemplazoLogic.getSolicitudReemplazos()==null||solicitudreemplazoLogic.getSolicitudReemplazos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudreemplazos==null|| solicitudreemplazos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
						solicitudreemplazosAux.addAll(solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazosAux.addAll(solicitudreemplazos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpleadoJefe(finalQueryGlobal,pagination,id_empleado_jefeFK_IdEmpleadoJefe);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleadoJefe(id_empleado_jefeFK_IdEmpleadoJefe);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudReemplazos("FK_IdEmpleadoJefe",solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudReemplazos("FK_IdEmpleadoJefe",solicitudreemplazos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());
						solicitudreemplazoLogic.getSolicitudReemplazos().addAll(solicitudreemplazosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazos=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazos.addAll(solicitudreemplazosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleadoReemplazo")) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleadoReemplazo(id_empleado_reemplazoFK_IdEmpleadoReemplazo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpleadoReemplazo(finalQueryGlobal,pagination,id_empleado_reemplazoFK_IdEmpleadoReemplazo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleadoReemplazo(id_empleado_reemplazoFK_IdEmpleadoReemplazo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleadoReemplazo(id_empleado_reemplazoFK_IdEmpleadoReemplazo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudreemplazoLogic.getSolicitudReemplazos()==null||solicitudreemplazoLogic.getSolicitudReemplazos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudreemplazos==null|| solicitudreemplazos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
						solicitudreemplazosAux.addAll(solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazosAux.addAll(solicitudreemplazos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpleadoReemplazo(finalQueryGlobal,pagination,id_empleado_reemplazoFK_IdEmpleadoReemplazo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleadoReemplazo(id_empleado_reemplazoFK_IdEmpleadoReemplazo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpleadoReemplazo(id_empleado_reemplazoFK_IdEmpleadoReemplazo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudReemplazos("FK_IdEmpleadoReemplazo",solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudReemplazos("FK_IdEmpleadoReemplazo",solicitudreemplazos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());
						solicitudreemplazoLogic.getSolicitudReemplazos().addAll(solicitudreemplazosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazos=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazos.addAll(solicitudreemplazosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudreemplazoLogic.getSolicitudReemplazos()==null||solicitudreemplazoLogic.getSolicitudReemplazos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudreemplazos==null|| solicitudreemplazos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
						solicitudreemplazosAux.addAll(solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazosAux.addAll(solicitudreemplazos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudReemplazos("FK_IdEmpresa",solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudReemplazos("FK_IdEmpresa",solicitudreemplazos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());
						solicitudreemplazoLogic.getSolicitudReemplazos().addAll(solicitudreemplazosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazos=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazos.addAll(solicitudreemplazosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoSolicitudNomi")) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEstadoSolicitudNomi(finalQueryGlobal,pagination,id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudreemplazoLogic.getSolicitudReemplazos()==null||solicitudreemplazoLogic.getSolicitudReemplazos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudreemplazos==null|| solicitudreemplazos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
						solicitudreemplazosAux.addAll(solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazosAux.addAll(solicitudreemplazos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEstadoSolicitudNomi(finalQueryGlobal,pagination,id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEstadoSolicitudNomi(id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudReemplazos("FK_IdEstadoSolicitudNomi",solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudReemplazos("FK_IdEstadoSolicitudNomi",solicitudreemplazos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());
						solicitudreemplazoLogic.getSolicitudReemplazos().addAll(solicitudreemplazosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazos=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazos.addAll(solicitudreemplazosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudreemplazoLogic.getSolicitudReemplazos()==null||solicitudreemplazoLogic.getSolicitudReemplazos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudreemplazos==null|| solicitudreemplazos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
						solicitudreemplazosAux.addAll(solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazosAux.addAll(solicitudreemplazos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudReemplazos("FK_IdEstructura",solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudReemplazos("FK_IdEstructura",solicitudreemplazos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());
						solicitudreemplazoLogic.getSolicitudReemplazos().addAll(solicitudreemplazosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazos=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazos.addAll(solicitudreemplazosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=solicitudreemplazoLogic.getSolicitudReemplazos()==null||solicitudreemplazoLogic.getSolicitudReemplazos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=solicitudreemplazos==null|| solicitudreemplazos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
						solicitudreemplazosAux.addAll(solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazosAux=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazosAux.addAll(solicitudreemplazos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							solicitudreemplazoLogic.getSolicitudReemplazosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SolicitudReemplazoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSolicitudReemplazos("FK_IdSucursal",solicitudreemplazoLogic.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSolicitudReemplazos("FK_IdSucursal",solicitudreemplazos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());
						solicitudreemplazoLogic.getSolicitudReemplazos().addAll(solicitudreemplazosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazos=new ArrayList<SolicitudReemplazo>();
							solicitudreemplazos.addAll(solicitudreemplazosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSolicitudReemplazo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSolicitudReemplazo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=solicitudreemplazoLogic.getSolicitudReemplazos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=solicitudreemplazos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=solicitudreemplazoLogic.getSolicitudReemplazos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=solicitudreemplazos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SolicitudReemplazo solicitudreemplazo) {
		Boolean permite=true;
		
		if(this.solicitudreemplazo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SolicitudReemplazoConstantesFunciones.getOrderByListaSolicitudReemplazo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SolicitudReemplazoConstantesFunciones.getOrderByListaSolicitudReemplazo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazoLogic.getSolicitudReemplazos()) {
				if(solicitudreemplazo.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudreemplazoTotales=solicitudreemplazo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudReemplazo solicitudreemplazo:this.solicitudreemplazos) {
				if(solicitudreemplazo.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudreemplazoTotales=solicitudreemplazo;
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
			this.solicitudreemplazoAux=new SolicitudReemplazo();
			this.solicitudreemplazoAux.setsType(Constantes2.S_TOTALES);
			this.solicitudreemplazoAux.setIsNew(false);
			this.solicitudreemplazoAux.setIsChanged(false);
			this.solicitudreemplazoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SolicitudReemplazoConstantesFunciones.TotalizarValoresFilaSolicitudReemplazo(this.solicitudreemplazoLogic.getSolicitudReemplazos(),this.solicitudreemplazoAux);
				
				this.solicitudreemplazoLogic.getSolicitudReemplazos().add(this.solicitudreemplazoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SolicitudReemplazoConstantesFunciones.TotalizarValoresFilaSolicitudReemplazo(this.solicitudreemplazos,this.solicitudreemplazoAux);
				
				this.solicitudreemplazos.add(this.solicitudreemplazoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		solicitudreemplazoTotales=new SolicitudReemplazo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.solicitudreemplazoLogic.getSolicitudReemplazos().remove(solicitudreemplazoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.solicitudreemplazos.remove(solicitudreemplazoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		solicitudreemplazoTotales=new SolicitudReemplazo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazoLogic.getSolicitudReemplazos()) {
				if(solicitudreemplazo.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudreemplazoTotales=solicitudreemplazo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SolicitudReemplazoConstantesFunciones.TotalizarValoresFilaSolicitudReemplazo(this.solicitudreemplazoLogic.getSolicitudReemplazos(),solicitudreemplazoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SolicitudReemplazo solicitudreemplazo:this.solicitudreemplazos) {
				if(solicitudreemplazo.getsType().equals(Constantes2.S_TOTALES)) {
					solicitudreemplazoTotales=solicitudreemplazo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SolicitudReemplazoConstantesFunciones.TotalizarValoresFilaSolicitudReemplazo(this.solicitudreemplazos,solicitudreemplazoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSolicitudReemplazosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudReemplazosFK_IdEmpleadoJefe()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleadoJefe";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudReemplazosFK_IdEmpleadoReemplazo()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleadoReemplazo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudReemplazosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudReemplazosFK_IdEstadoSolicitudNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoSolicitudNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudReemplazosFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSolicitudReemplazosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSolicitudReemplazosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudReemplazosFK_IdEmpleadoJefe(String sFinalQuery,Long id_empleado_jefe)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpleadoJefe(sFinalQuery,this.pagination,id_empleado_jefe);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudReemplazosFK_IdEmpleadoReemplazo(String sFinalQuery,Long id_empleado_reemplazo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpleadoReemplazo(sFinalQuery,this.pagination,id_empleado_reemplazo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudReemplazosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudReemplazosFK_IdEstadoSolicitudNomi(String sFinalQuery,Long id_estado_solicitud_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEstadoSolicitudNomi(sFinalQuery,this.pagination,id_estado_solicitud_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudReemplazosFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSolicitudReemplazosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudreemplazoLogic.getSolicitudReemplazosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosSolicitudReemplazo() {
		this.isPermisoTodoSolicitudReemplazo=false;
		this.isPermisoNuevoSolicitudReemplazo=false;
		this.isPermisoActualizarSolicitudReemplazo=false;
		this.isPermisoActualizarOriginalSolicitudReemplazo=false;
		this.isPermisoEliminarSolicitudReemplazo=false;
		this.isPermisoGuardarCambiosSolicitudReemplazo=false;
		this.isPermisoConsultaSolicitudReemplazo=false;
		this.isPermisoBusquedaSolicitudReemplazo=false;
		this.isPermisoReporteSolicitudReemplazo=false;		
		this.isPermisoOrdenSolicitudReemplazo=false;		
		this.isPermisoPaginacionMedioSolicitudReemplazo=false;		
		this.isPermisoPaginacionAltoSolicitudReemplazo=false;
		this.isPermisoPaginacionTodoSolicitudReemplazo=false;
		this.isPermisoCopiarSolicitudReemplazo=false;		
		this.isPermisoVerFormSolicitudReemplazo=false;		
		this.isPermisoDuplicarSolicitudReemplazo=false;		
		this.isPermisoOrdenSolicitudReemplazo=false;		
	}
	
	public void setPermisosUsuarioSolicitudReemplazo(Boolean isPermiso) {
		this.isPermisoTodoSolicitudReemplazo=isPermiso;
		this.isPermisoNuevoSolicitudReemplazo=isPermiso;
		this.isPermisoActualizarSolicitudReemplazo=isPermiso;
		this.isPermisoActualizarOriginalSolicitudReemplazo=isPermiso;
		this.isPermisoEliminarSolicitudReemplazo=isPermiso;
		this.isPermisoGuardarCambiosSolicitudReemplazo=isPermiso;
		this.isPermisoConsultaSolicitudReemplazo=isPermiso;
		this.isPermisoBusquedaSolicitudReemplazo=isPermiso;
		this.isPermisoReporteSolicitudReemplazo=isPermiso;
		this.isPermisoOrdenSolicitudReemplazo=isPermiso;		
		this.isPermisoPaginacionMedioSolicitudReemplazo=isPermiso;		
		this.isPermisoPaginacionAltoSolicitudReemplazo=isPermiso;		
		this.isPermisoPaginacionTodoSolicitudReemplazo=isPermiso;		
		this.isPermisoCopiarSolicitudReemplazo=isPermiso;		
		this.isPermisoVerFormSolicitudReemplazo=isPermiso;		
		this.isPermisoDuplicarSolicitudReemplazo=isPermiso;
		this.isPermisoOrdenSolicitudReemplazo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSolicitudReemplazo(Boolean isPermiso) {
		//this.isPermisoTodoSolicitudReemplazo=isPermiso;
		this.isPermisoNuevoSolicitudReemplazo=isPermiso;
		this.isPermisoActualizarSolicitudReemplazo=isPermiso;
		this.isPermisoActualizarOriginalSolicitudReemplazo=isPermiso;
		this.isPermisoEliminarSolicitudReemplazo=isPermiso;
		this.isPermisoGuardarCambiosSolicitudReemplazo=isPermiso;
		//this.isPermisoConsultaSolicitudReemplazo=isPermiso;
		//this.isPermisoBusquedaSolicitudReemplazo=isPermiso;
		//this.isPermisoReporteSolicitudReemplazo=isPermiso;
		//this.isPermisoOrdenSolicitudReemplazo=isPermiso;		
		//this.isPermisoPaginacionMedioSolicitudReemplazo=isPermiso;		
		//this.isPermisoPaginacionAltoSolicitudReemplazo=isPermiso;		
		//this.isPermisoPaginacionTodoSolicitudReemplazo=isPermiso;		
		//this.isPermisoCopiarSolicitudReemplazo=isPermiso;		
		//this.isPermisoDuplicarSolicitudReemplazo=isPermiso;
		//this.isPermisoOrdenSolicitudReemplazo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSolicitudReemplazoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SolicitudReemplazoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSolicitudReemplazo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSolicitudReemplazoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSolicitudReemplazoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSolicitudReemplazoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSolicitudReemplazoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSolicitudReemplazo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SolicitudReemplazoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SolicitudReemplazoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSolicitudReemplazo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSolicitudReemplazo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSolicitudReemplazo=this.isPermisoActualizarSolicitudReemplazo;
			this.isPermisoEliminarSolicitudReemplazo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSolicitudReemplazo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSolicitudReemplazo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSolicitudReemplazo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSolicitudReemplazo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSolicitudReemplazo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSolicitudReemplazo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSolicitudReemplazo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSolicitudReemplazo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSolicitudReemplazo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSolicitudReemplazo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSolicitudReemplazo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSolicitudReemplazo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSolicitudReemplazo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSolicitudReemplazo.setToolTipText(this.jTableDatosSolicitudReemplazo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSolicitudReemplazo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSolicitudReemplazo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SolicitudReemplazoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SolicitudReemplazoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSolicitudReemplazo() throws Exception {
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
	public void inicializarCombosForeignKeySolicitudReemplazoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.empleadojefesForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.empleadoreemplazosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.estadosolicitudnomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySolicitudReemplazoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SolicitudReemplazoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySolicitudReemplazoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoJefeListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoReemplazoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoSolicitudNomiListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpleadoReemplazoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadoreemplazosForeignKey==null||this.empleadoreemplazosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadoReemplazosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeySolicitudReemplazoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SolicitudReemplazoParameterReturnGeneral solicitudreemplazoReturnGeneral=new SolicitudReemplazoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.solicitudreemplazoConstantesFunciones.cargarid_empresaSolicitudReemplazo)
					 || (this.esRecargarFks && this.solicitudreemplazoConstantesFunciones.cargarid_empresaSolicitudReemplazo)) {

					if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+solicitudreemplazoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.solicitudreemplazoConstantesFunciones.cargarid_sucursalSolicitudReemplazo)
					 || (this.esRecargarFks && this.solicitudreemplazoConstantesFunciones.cargarid_sucursalSolicitudReemplazo)) {

					if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+solicitudreemplazoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEmpleadoJefe="";

				if(((this.empleadojefesForeignKey==null||this.empleadojefesForeignKey.size()<=0) && this.solicitudreemplazoConstantesFunciones.cargarid_empleado_jefeSolicitudReemplazo)
					 || (this.esRecargarFks && this.solicitudreemplazoConstantesFunciones.cargarid_empleado_jefeSolicitudReemplazo)) {

					if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoJefe()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleadoJefe=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleadoJefe=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleadoJefe, "");
						finalQueryGlobalEmpleadoJefe+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadoJefesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleadoJefe=" WHERE " + ConstantesSql.ID + "="+solicitudreemplazoSessionBean.getlidEmpleadoJefeActual();
					}
				} else {
					finalQueryGlobalEmpleadoJefe="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.solicitudreemplazoConstantesFunciones.cargarid_empleadoSolicitudReemplazo)
					 || (this.esRecargarFks && this.solicitudreemplazoConstantesFunciones.cargarid_empleadoSolicitudReemplazo)) {

					if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+solicitudreemplazoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEmpleadoReemplazo="";

				if(((this.empleadoreemplazosForeignKey==null||this.empleadoreemplazosForeignKey.size()<=0) && this.solicitudreemplazoConstantesFunciones.cargarid_empleado_reemplazoSolicitudReemplazo)
					 || (this.esRecargarFks && this.solicitudreemplazoConstantesFunciones.cargarid_empleado_reemplazoSolicitudReemplazo)) {

					if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoReemplazo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleadoReemplazo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleadoReemplazo=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleadoReemplazo, "");
						finalQueryGlobalEmpleadoReemplazo+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadoReemplazosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleadoReemplazo=" WHERE " + ConstantesSql.ID + "="+solicitudreemplazoSessionBean.getlidEmpleadoReemplazoActual();
					}
				} else {
					finalQueryGlobalEmpleadoReemplazo="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.solicitudreemplazoConstantesFunciones.cargarid_estructuraSolicitudReemplazo)
					 || (this.esRecargarFks && this.solicitudreemplazoConstantesFunciones.cargarid_estructuraSolicitudReemplazo)) {

					if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+solicitudreemplazoSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalEstadoSolicitudNomi="";

				if(((this.estadosolicitudnomisForeignKey==null||this.estadosolicitudnomisForeignKey.size()<=0) && this.solicitudreemplazoConstantesFunciones.cargarid_estado_solicitud_nomiSolicitudReemplazo)
					 || (this.esRecargarFks && this.solicitudreemplazoConstantesFunciones.cargarid_estado_solicitud_nomiSolicitudReemplazo)) {

					if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoSolicitudNomiConstantesFunciones.getArrayColumnasGlobalesEstadoSolicitudNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoSolicitudNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoSolicitudNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoSolicitudNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoSolicitudNomi, "");
						finalQueryGlobalEstadoSolicitudNomi+=EstadoSolicitudNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoSolicitudNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoSolicitudNomi=" WHERE " + ConstantesSql.ID + "="+solicitudreemplazoSessionBean.getlidEstadoSolicitudNomiActual();
					}
				} else {
					finalQueryGlobalEstadoSolicitudNomi="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				solicitudreemplazoReturnGeneral=solicitudreemplazoLogic.cargarCombosLoteForeignKeySolicitudReemplazo(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEmpleadoJefe,finalQueryGlobalEmpleado,finalQueryGlobalEmpleadoReemplazo,finalQueryGlobalEstructura,finalQueryGlobalEstadoSolicitudNomi);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=solicitudreemplazoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=solicitudreemplazoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEmpleadoJefe.equals("NONE")) {
				this.empleadojefesForeignKey=solicitudreemplazoReturnGeneral.getempleadojefesForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=solicitudreemplazoReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEmpleadoReemplazo.equals("NONE")) {
				this.empleadoreemplazosForeignKey=solicitudreemplazoReturnGeneral.getempleadoreemplazosForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=solicitudreemplazoReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalEstadoSolicitudNomi.equals("NONE")) {
				this.estadosolicitudnomisForeignKey=solicitudreemplazoReturnGeneral.getestadosolicitudnomisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySolicitudReemplazo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEmpleadoJefe();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEmpleadoReemplazo();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEstadoSolicitudNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.solicitudreemplazoSessionBean==null) {
				this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
			}

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoJefe()) {
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

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyEmpleadoReemplazo()throws Exception {
		try {

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoReemplazo()) {
				Empleado empleadoreemplazo=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleadoreemplazo,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleadoreemplazo.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadoreemplazosForeignKey,empleadoreemplazo,true)) {

					this.empleadoreemplazosForeignKey.add(0,empleadoreemplazo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

			if(!this.solicitudreemplazoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi()) {
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
	
	public void initActionsCombosTodosForeignKeySolicitudReemplazo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySolicitudReemplazo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySolicitudReemplazo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.solicitudreemplazo.setfecha_solicita(this.parametroGeneralUsuario.getfecha_sistema());
				this.solicitudreemplazo.setfecha_ejecuta(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySolicitudReemplazo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySolicitudReemplazo(SolicitudReemplazo solicitudreemplazo)throws Exception {	
		try {
			
			this.setActualEmpleadoJefeForeignKey(solicitudreemplazo.getid_empleado_jefe(),false,"Formulario");
			this.setActualEmpleadoForeignKey(solicitudreemplazo.getid_empleado(),false,"Formulario");
			this.setActualEmpleadoReemplazoForeignKey(solicitudreemplazo.getid_empleado_reemplazo(),false,"Formulario");
			this.setActualEstructuraForeignKey(solicitudreemplazo.getid_estructura(),false,"Formulario");
			this.setActualEstadoSolicitudNomiForeignKey(solicitudreemplazo.getid_estado_solicitud_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySolicitudReemplazo(SolicitudReemplazo solicitudreemplazo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySolicitudReemplazo()throws Exception {	
		try {
			
			this.setActualEmpleadoJefeForeignKey(this.solicitudreemplazoConstantesFunciones.getid_empleado_jefe(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.solicitudreemplazoConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEmpleadoReemplazoForeignKey(this.solicitudreemplazoConstantesFunciones.getid_empleado_reemplazo(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.solicitudreemplazoConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualEstadoSolicitudNomiForeignKey(this.solicitudreemplazoConstantesFunciones.getid_estado_solicitud_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySolicitudReemplazo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySolicitudReemplazo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySolicitudReemplazo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSolicitudReemplazo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySolicitudReemplazo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEmpleadoJefesForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEmpleadoReemplazosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEstadoSolicitudNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySolicitudReemplazo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadoJefesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadoReemplazosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoSolicitudNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySolicitudReemplazo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.getItemCount()>0) {
				this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public SolicitudReemplazoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SolicitudReemplazoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SolicitudReemplazoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean(); 
		this.solicitudreemplazoConstantesFunciones=new SolicitudReemplazoConstantesFunciones(); 
		this.solicitudreemplazoBean=new SolicitudReemplazo();//(this.solicitudreemplazoConstantesFunciones); 		
		this.solicitudreemplazoReturnGeneral=new SolicitudReemplazoParameterReturnGeneral(); 
		
		this.solicitudreemplazoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.solicitudreemplazoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SolicitudReemplazoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SolicitudReemplazoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SolicitudReemplazoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSolicitudReemplazo(true);
			
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
			
			this.solicitudreemplazoConstantesFunciones=new SolicitudReemplazoConstantesFunciones(); 
			this.solicitudreemplazoBean=new SolicitudReemplazo();//this.solicitudreemplazoConstantesFunciones); 			
			this.solicitudreemplazoReturnGeneral=new SolicitudReemplazoParameterReturnGeneral(); 
		
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Solicitud Reemplazo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.solicitudreemplazo=new SolicitudReemplazo();
			this.solicitudreemplazos = new ArrayList<SolicitudReemplazo>();
			this.solicitudreemplazosAux = new ArrayList<SolicitudReemplazo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic=new SolicitudReemplazoLogic();
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}
			
			//this.solicitudreemplazoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.solicitudreemplazoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSolicitudReemplazo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSolicitudReemplazo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSolicitudReemplazo);	
					}
					
					if(this.jInternalFrameImportacionSolicitudReemplazo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSolicitudReemplazo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySolicitudReemplazo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySolicitudReemplazo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSolicitudReemplazo);
				this.jInternalFrameDetalleFormSolicitudReemplazo.setVisible(false);
				this.jInternalFrameDetalleFormSolicitudReemplazo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSolicitudReemplazo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSolicitudReemplazo);
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.setVisible(false);
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSolicitudReemplazo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSolicitudReemplazo);
					this.jInternalFrameImportacionSolicitudReemplazo.setVisible(false);
					this.jInternalFrameImportacionSolicitudReemplazo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySolicitudReemplazo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySolicitudReemplazo);
					this.jInternalFrameOrderBySolicitudReemplazo.setVisible(false);
					this.jInternalFrameOrderBySolicitudReemplazo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSolicitudReemplazoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SolicitudReemplazoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.solicitudreemplazoReturnGeneral=new SolicitudReemplazoParameterReturnGeneral();
			
			this.solicitudreemplazoParameterGeneral=new SolicitudReemplazoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.solicitudreemplazoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SolicitudReemplazoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SolicitudReemplazoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.solicitudreemplazoSessionBean.getEsGuardarRelacionado(),this.solicitudreemplazoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SolicitudReemplazoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.solicitudreemplazoSessionBean.getEsGuardarRelacionado(),this.solicitudreemplazoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=false;
			this.isVisibilidadCeldaDuplicarSolicitudReemplazo=true;
			this.isVisibilidadCeldaCopiarSolicitudReemplazo=true;
			this.isVisibilidadCeldaVerFormSolicitudReemplazo=true;
			this.isVisibilidadCeldaOrdenSolicitudReemplazo=true;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=false;
			this.isVisibilidadCeldaModificarSolicitudReemplazo=false;
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=false;
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=false;
			this.isVisibilidadCeldaCancelarSolicitudReemplazo=false;
			this.isVisibilidadCeldaGuardarSolicitudReemplazo=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpleadoJefe=true;
			this.isVisibilidadFK_IdEmpleadoReemplazo=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoSolicitudNomi=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSolicitudReemplazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSolicitudReemplazo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSolicitudReemplazo(false);
			
			this.setPermisosUsuarioSolicitudReemplazo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() 
				|| (this.solicitudreemplazoSessionBean.getEsGuardarRelacionado() && this.solicitudreemplazoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSolicitudReemplazoClasesRelacionadas();
			}
			
			if(this.solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSolicitudReemplazoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSolicitudReemplazo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSolicitudReemplazo();
			}
			
			if(!this.isPermisoBusquedaSolicitudReemplazo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSolicitudReemplazo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSolicitudReemplazo,this.isPermisoPaginacionMedioSolicitudReemplazo,this.isPermisoPaginacionTodoSolicitudReemplazo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SolicitudReemplazoConstantesFunciones.getTiposSeleccionarSolicitudReemplazo());
				
				this.tiposColumnasSelect=SolicitudReemplazoConstantesFunciones.getTiposSeleccionarSolicitudReemplazo(true);
				
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
			//if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSolicitudReemplazo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioSolicitudReemplazo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioSolicitudReemplazo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudReemplazo() ;
			
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
			this.empleadoreemplazoLogic=new EmpleadoLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.estadosolicitudnomiLogic=new EstadoSolicitudNomiLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				solicitudreemplazoImplementable= (SolicitudReemplazoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SolicitudReemplazoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				solicitudreemplazoImplementableHome= (SolicitudReemplazoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SolicitudReemplazoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.solicitudreemplazos= new ArrayList<SolicitudReemplazo>();
			this.solicitudreemplazosEliminados= new ArrayList<SolicitudReemplazo>();
						
			this.isEsNuevoSolicitudReemplazo=false;
			this.esParaAccionDesdeFormularioSolicitudReemplazo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.empleadojefesForeignKey=new ArrayList<Empleado>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.empleadoreemplazosForeignKey=new ArrayList<Empleado>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.estadosolicitudnomisForeignKey=new ArrayList<EstadoSolicitudNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySolicitudReemplazo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSolicitudReemplazo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SolicitudReemplazoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSolicitudReemplazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSolicitudReemplazo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSolicitudReemplazo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSolicitudReemplazo();
			}
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSolicitudReemplazo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSolicitudReemplazo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSolicitudReemplazo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSolicitudReemplazo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SolicitudReemplazo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSolicitudReemplazo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSolicitudReemplazo")) {
				iIndex=this.jInternalFrameDetalleFormSolicitudReemplazo.jTabbedPaneRelacionesSolicitudReemplazo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSolicitudReemplazo.jTabbedPaneRelacionesSolicitudReemplazo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSolicitudReemplazo();	
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
	
	public void cargarCombosForeignKeySolicitudReemplazo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySolicitudReemplazo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySolicitudReemplazo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySolicitudReemplazoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySolicitudReemplazo();
		
		this.cargarCombosFrameForeignKeySolicitudReemplazo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySolicitudReemplazo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySolicitudReemplazo();
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

	public void cargarCombosForeignKeyEmpleadoReemplazo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoReemplazoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleadoReemplazo();
				this.cargarCombosFrameEmpleadoReemplazosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleadoReemplazo(this.empleadoreemplazosForeignKey);

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
	
	public void jButtonNuevoSolicitudReemplazoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
			
			if(jTableDatosSolicitudReemplazo.getRowCount()>=1) {
				jTableDatosSolicitudReemplazo.removeRowSelectionInterval(0, jTableDatosSolicitudReemplazo.getRowCount()-1);						
			}
			
			this.isEsNuevoSolicitudReemplazo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSolicitudReemplazo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSolicitudReemplazo(true);			
			//this.solicitudreemplazo=new SolicitudReemplazo();
			//this.solicitudreemplazo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSolicitudReemplazo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudReemplazo() ;
			
			if(SolicitudReemplazoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSolicitudReemplazo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.solicitudreemplazo);	
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);				
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
			if(this.solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SolicitudReemplazo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSolicitudReemplazoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSolicitudReemplazo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSolicitudReemplazo.getSelectedRows().length;			
			}
			
			solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSolicitudReemplazo--;			
				//SolicitudReemplazo solicitudreemplazoAux= new SolicitudReemplazo();			
				//solicitudreemplazoAux.setId(this.iIdNuevoSolicitudReemplazo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SolicitudReemplazo solicitudreemplazoOrigen=new SolicitudReemplazo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SolicitudReemplazo solicitudreemplazoOrigen : solicitudreemplazosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							solicitudreemplazoOrigen =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							solicitudreemplazoOrigen =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSolicitudReemplazo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.solicitudreemplazo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSolicitudReemplazo(solicitudreemplazoOrigen,this.solicitudreemplazo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.solicitudreemplazoLogic.getSolicitudReemplazos().add(this.solicitudreemplazoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazos.add(this.solicitudreemplazoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
				
				this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(this.getIndiceNuevoSolicitudReemplazo(), this.getIndiceNuevoSolicitudReemplazo());
				
				int iLastRow =  this.jTableDatosSolicitudReemplazo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSolicitudReemplazo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSolicitudReemplazo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();									
		
			SolicitudReemplazo solicitudreemplazoOrigen=new SolicitudReemplazo();
			SolicitudReemplazo solicitudreemplazoDestino=new SolicitudReemplazo();
				
			solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSolicitudReemplazo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || solicitudreemplazosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSolicitudReemplazo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoOrigen =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						solicitudreemplazoOrigen =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						solicitudreemplazoDestino =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						solicitudreemplazoDestino =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				solicitudreemplazoOrigen =solicitudreemplazosSeleccionados.get(0);
				solicitudreemplazoDestino =solicitudreemplazosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSolicitudReemplazo(solicitudreemplazoOrigen,solicitudreemplazoDestino,true,false);
				
				solicitudreemplazoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(solicitudreemplazoDestino,solicitudreemplazoLogic.getSolicitudReemplazos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(solicitudreemplazoDestino,solicitudreemplazos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
				
				//this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(this.getIndiceNuevoSolicitudReemplazo(), this.getIndiceNuevoSolicitudReemplazo());
				
				int iLastRow =  this.jTableDatosSolicitudReemplazo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSolicitudReemplazo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSolicitudReemplazo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSolicitudReemplazo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSolicitudReemplazo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSolicitudReemplazo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSolicitudReemplazo.setVisible(!isVisible);
			this.jPanelPaginacionSolicitudReemplazo.setVisible(!isVisible);
			this.jPanelAccionesSolicitudReemplazo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSolicitudReemplazo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSolicitudReemplazo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSolicitudReemplazo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySolicitudReemplazo();
			
			this.abrirFrameOrderBySolicitudReemplazo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySolicitudReemplazo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSolicitudReemplazo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSolicitudReemplazo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSolicitudReemplazo.isMaximum()) {
					this.jInternalFrameDetalleFormSolicitudReemplazo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSolicitudReemplazo.setSize(this.jInternalFrameDetalleFormSolicitudReemplazo.iWidthFormulario,this.jInternalFrameDetalleFormSolicitudReemplazo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSolicitudReemplazo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSolicitudReemplazo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSolicitudReemplazo.isMaximum()) {
						this.jInternalFrameDetalleFormSolicitudReemplazo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSolicitudReemplazo.jContentPaneDetalleSolicitudReemplazo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSolicitudReemplazo.jTabbedPaneRelacionesSolicitudReemplazo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSolicitudReemplazo.jContentPaneDetalleSolicitudReemplazo.getWidth(),SolicitudReemplazoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSolicitudReemplazo.jTabbedPaneRelacionesSolicitudReemplazo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSolicitudReemplazo.jContentPaneDetalleSolicitudReemplazo.getWidth(),SolicitudReemplazoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSolicitudReemplazo.jTabbedPaneRelacionesSolicitudReemplazo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSolicitudReemplazo.jContentPaneDetalleSolicitudReemplazo.getWidth(),SolicitudReemplazoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSolicitudReemplazo.setVisible(true);
	        this.jInternalFrameDetalleFormSolicitudReemplazo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySolicitudReemplazo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySolicitudReemplazo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySolicitudReemplazo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudReemplazo,false,this);
				} else {
					this.jInternalFrameOrderBySolicitudReemplazo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudReemplazo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySolicitudReemplazo);
				this.jInternalFrameOrderBySolicitudReemplazo.setVisible(false);
				this.jInternalFrameOrderBySolicitudReemplazo.setSelected(false);
				
				this.jInternalFrameOrderBySolicitudReemplazo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySolicitudReemplazo"));
				
				this.inicializarActualizarBindingTablaOrderBySolicitudReemplazo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSolicitudReemplazo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSolicitudReemplazo==null) {
				
				this.jInternalFrameImportacionSolicitudReemplazo=new ImportacionJInternalFrame(SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSolicitudReemplazo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSolicitudReemplazo);
				this.jInternalFrameImportacionSolicitudReemplazo.setVisible(false);
				this.jInternalFrameImportacionSolicitudReemplazo.setSelected(false);


				this.jInternalFrameImportacionSolicitudReemplazo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSolicitudReemplazo"));
				this.jInternalFrameImportacionSolicitudReemplazo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSolicitudReemplazo"));
				this.jInternalFrameImportacionSolicitudReemplazo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSolicitudReemplazo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSolicitudReemplazo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSolicitudReemplazo==null) {
				this.jInternalFrameReporteDinamicoSolicitudReemplazo=new ReporteDinamicoJInternalFrame(SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSolicitudReemplazo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSolicitudReemplazo);
				this.jInternalFrameReporteDinamicoSolicitudReemplazo.setVisible(false);
				this.jInternalFrameReporteDinamicoSolicitudReemplazo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSolicitudReemplazo"));
				this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSolicitudReemplazo"));
				this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSolicitudReemplazo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSolicitudReemplazo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSolicitudReemplazo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSolicitudReemplazo);
			
	       	this.jInternalFrameDetalleFormSolicitudReemplazo.setVisible(false);
	        this.jInternalFrameDetalleFormSolicitudReemplazo.setSelected(false);
			
			//this.jInternalFrameDetalleFormSolicitudReemplazo.dispose();
			//this.jInternalFrameDetalleFormSolicitudReemplazo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSolicitudReemplazo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSolicitudReemplazo.setVisible(true);
	        this.jInternalFrameReporteDinamicoSolicitudReemplazo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSolicitudReemplazo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSolicitudReemplazo.setVisible(true);
	        this.jInternalFrameImportacionSolicitudReemplazo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySolicitudReemplazo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySolicitudReemplazo.setVisible(true);
	        this.jInternalFrameOrderBySolicitudReemplazo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySolicitudReemplazo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySolicitudReemplazo.setVisible(false);
	        this.jInternalFrameOrderBySolicitudReemplazo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSolicitudReemplazo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSolicitudReemplazo.setVisible(false);
	        this.jInternalFrameReporteDinamicoSolicitudReemplazo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSolicitudReemplazo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSolicitudReemplazo.setVisible(false);
	        this.jInternalFrameImportacionSolicitudReemplazo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderSolicitudReemplazo=(TitledBorder)this.jScrollPanelDatosSolicitudReemplazo.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderSolicitudReemplazo.getTitle() + " -> Estructura");


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
	
	public void jButtonModificarSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSolicitudReemplazo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSolicitudReemplazo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSolicitudReemplazo(true);
			//this.isEsNuevoSolicitudReemplazo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSolicitudReemplazo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSolicitudReemplazo(false) ;
			
			if(solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SolicitudReemplazoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSolicitudReemplazo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudReemplazo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSolicitudReemplazoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSolicitudReemplazo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSolicitudReemplazo(true);
			//this.isEsNuevoSolicitudReemplazo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.solicitudreemplazo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSolicitudReemplazo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSolicitudReemplazo(false) ;
			
			if(SolicitudReemplazoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSolicitudReemplazo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudReemplazo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEmpleadoJefe(List<Empleado> empleadojefesForeignKey)throws Exception{
		TableColumn tableColumnEmpleadoJefe=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE));
		TableCellEditor tableCellEditorEmpleadoJefe =tableColumnEmpleadoJefe.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleadoJefe;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadojefesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudReemplazo.getSelectedRow();

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
		TableColumn tableColumnEmpleado=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudReemplazo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleadoReemplazo(List<Empleado> empleadoreemplazosForeignKey)throws Exception{
		TableColumn tableColumnEmpleadoReemplazo=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO));
		TableCellEditor tableCellEditorEmpleadoReemplazo =tableColumnEmpleadoReemplazo.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleadoReemplazo;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadoreemplazosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudReemplazo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadoreemplazosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudReemplazo.getSelectedRow();

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
		TableColumn tableColumnEstadoSolicitudNomi=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI));
		TableCellEditor tableCellEditorEstadoSolicitudNomi =tableColumnEstadoSolicitudNomi.getCellEditor();

		EstadoSolicitudNomiTableCell estadosolicitudnomiTableCellFk=(EstadoSolicitudNomiTableCell)tableCellEditorEstadoSolicitudNomi;

		if(estadosolicitudnomiTableCellFk!=null) {
			estadosolicitudnomiTableCellFk.setestadosolicitudnomisForeignKey(estadosolicitudnomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSolicitudReemplazo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadosolicitudnomiTableCellFk.setRowActual(intSelectedRow);
			//estadosolicitudnomiTableCellFk.setestadosolicitudnomisForeignKeyActual(estadosolicitudnomisForeignKey);
		//}


		if(estadosolicitudnomiTableCellFk!=null) {
			estadosolicitudnomiTableCellFk.RecargarEstadoSolicitudNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSolicitudReemplazo(false);
			
			//if(!this.isEsNuevoSolicitudReemplazo) {								
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				
			}
			
			if(this.permiteMantenimiento(this.solicitudreemplazo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSolicitudReemplazo=true;
					this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
					this.isEsNuevoSolicitudReemplazo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSolicitudReemplazo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSolicitudReemplazo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSolicitudReemplazo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSolicitudReemplazo(false);
				
				this.habilitarDeshabilitarControlesSolicitudReemplazo(false);
			
												
				
				if(SolicitudReemplazoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSolicitudReemplazo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSolicitudReemplazoActionPerformed(evt,solicitudreemplazoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSolicitudReemplazo(this.solicitudreemplazo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,solicitudreemplazoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.solicitudreemplazo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SolicitudReemplazo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudReemplazo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				this.solicitudreemplazo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				this.solicitudreemplazo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.solicitudreemplazo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SolicitudReemplazoModel) this.jTableDatosSolicitudReemplazo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSolicitudReemplazo=true;
				this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
				this.isEsNuevoSolicitudReemplazo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSolicitudReemplazo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSolicitudReemplazo(false);
				
				this.habilitarDeshabilitarControlesSolicitudReemplazo(false);
				
				
				
				if(SolicitudReemplazoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSolicitudReemplazo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSolicitudReemplazo.getRowCount()>=1) {
				jTableDatosSolicitudReemplazo.removeRowSelectionInterval(0, jTableDatosSolicitudReemplazo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSolicitudReemplazo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSolicitudReemplazo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSolicitudReemplazo(false) ;
			
			this.isEsNuevoSolicitudReemplazo=false;
			
			if(SolicitudReemplazoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSolicitudReemplazo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSolicitudReemplazo(false);
				
				//SI ES MANUAL
				if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSolicitudReemplazo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSolicitudReemplazo--;			
			//SolicitudReemplazo solicitudreemplazoAux= new SolicitudReemplazo();			
			//solicitudreemplazoAux.setId(this.iIdNuevoSolicitudReemplazo);
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSolicitudReemplazo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
			
			this.solicitudreemplazo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.solicitudreemplazoLogic.getSolicitudReemplazos().add(this.solicitudreemplazoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.solicitudreemplazos.add(this.solicitudreemplazoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
			
			this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(this.getIndiceNuevoSolicitudReemplazo(), this.getIndiceNuevoSolicitudReemplazo());
			
			int iLastRow =  this.jTableDatosSolicitudReemplazo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSolicitudReemplazo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSolicitudReemplazo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudReemplazo(false);
			
			//SI ES MANUAL
			if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSolicitudReemplazo();
			}
			
			//this.abrirFrameTreeSolicitudReemplazo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Solicitud ReemplazoS ?", "MANTENIMIENTO DE Solicitud Reemplazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSolicitudReemplazo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSolicitudReemplazo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.solicitudreemplazoReturnGeneral=solicitudreemplazoLogic.procesarImportacionSolicitudReemplazosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.solicitudreemplazoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSolicitudReemplazoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSolicitudReemplazo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSolicitudReemplazo.setFileImportacion(this.jInternalFrameImportacionSolicitudReemplazo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSolicitudReemplazo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSolicitudReemplazo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSolicitudReemplazo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSolicitudReemplazo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();		

		solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SolicitudReemplazoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SolicitudReemplazoBaseDesign.jrxml";
			
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
			
			this.generarReporteSolicitudReemplazos("Todos",solicitudreemplazosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Reemplazo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EmpleadoJefe_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EmpleadoJefe_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EmpleadoJefe_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EmpleadoJefe_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EmpleadoReemplazo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EmpleadoReemplazo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EmpleadoReemplazo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EmpleadoReemplazo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoSolicitudNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoSolicitudNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoSolicitudNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoSolicitudNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaSolicita_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaSolicita_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaSolicita_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaSolicita_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEjecuta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEjecuta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEjecuta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEjecuta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroHoras_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroHoras_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroHoras_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroHoras_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoUnitario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoUnitario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoUnitario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoUnitario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					sNombreCampoCategoria="id_empleado_jefe";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO:
					sNombreCampoCategoria="id_empleado_reemplazo";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					sNombreCampoCategoria="id_estado_solicitud_nomi";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA:
					sNombreCampoCategoria="fecha_solicita";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA:
					sNombreCampoCategoria="fecha_ejecuta";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS:
					sNombreCampoCategoria="numero_horas";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoria="costo_unitario";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					sNombreCampoCategoriaValor="id_empleado_jefe";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO:
					sNombreCampoCategoriaValor="id_empleado_reemplazo";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					sNombreCampoCategoriaValor="id_estado_solicitud_nomi";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA:
					sNombreCampoCategoriaValor="fecha_solicita";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA:
					sNombreCampoCategoriaValor="fecha_ejecuta";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS:
					sNombreCampoCategoriaValor="numero_horas";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoriaValor="costo_unitario";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado Jefe",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado_jefe");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado Reemplazo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado_reemplazo");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Solicitud Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_solicitud_nomi");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Solicita",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_solicita");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ejecuta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ejecuta");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Horas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_horas");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Unitario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_unitario");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();		
		
		solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudreemplazo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SolicitudReemplazos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getempleadojefe_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getempleadoreemplazo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getestadosolicitudnomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getfecha_solicita());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getfecha_ejecuta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getnumero_horas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getcosto_unitario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(solicitudreemplazo.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelSolicitudReemplazo(row);				
			//	iRow++;
			//}				
			
			//for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSolicitudReemplazo(solicitudreemplazoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Reemplazo",JOptionPane.INFORMATION_MESSAGE);
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
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudReemplazo(false);
			
			//SI ES MANUAL
			if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSolicitudReemplazo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudReemplazo(false);
			
			//SI ES MANUAL
			if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSolicitudReemplazo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSolicitudReemplazo(false);
			
			//SI ES MANUAL
			if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSolicitudReemplazo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSolicitudReemplazo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSolicitudReemplazo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSolicitudReemplazo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSolicitudReemplazo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSolicitudReemplazo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSolicitudReemplazo.setMinimumSize(dimensionMinimum);
		this.jTableDatosSolicitudReemplazo.setMaximumSize(dimensionMaximum);
		this.jTableDatosSolicitudReemplazo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSolicitudReemplazo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSolicitudReemplazo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSolicitudReemplazo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSolicitudReemplazo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSolicitudReemplazo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSolicitudReemplazo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudReemplazo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSolicitudReemplazo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSolicitudReemplazo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSolicitudReemplazo();
		
		this.inicializarActualizarBindingBotonesManualSolicitudReemplazo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSolicitudReemplazo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudReemplazo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSolicitudReemplazo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSolicitudReemplazo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSolicitudReemplazo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSolicitudReemplazo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSolicitudReemplazo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSolicitudReemplazo.jCheckBoxPostAccionNuevoSolicitudReemplazo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSolicitudReemplazo.jCheckBoxPostAccionSinCerrarSolicitudReemplazo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSolicitudReemplazo.jCheckBoxPostAccionSinMensajeSolicitudReemplazo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSolicitudReemplazo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSolicitudReemplazo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSolicitudReemplazo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
				this.jInternalFrameDetalleFormSolicitudReemplazo.jCheckBoxPostAccionNuevoSolicitudReemplazo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSolicitudReemplazo.jCheckBoxPostAccionSinCerrarSolicitudReemplazo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSolicitudReemplazo.jCheckBoxPostAccionSinMensajeSolicitudReemplazo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSolicitudReemplazo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSolicitudReemplazo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSolicitudReemplazo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSolicitudReemplazo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSolicitudReemplazo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSolicitudReemplazo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSolicitudReemplazo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSolicitudReemplazo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSolicitudReemplazo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSolicitudReemplazo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSolicitudReemplazo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSolicitudReemplazo(Boolean esInicializar) throws Exception {
		try	{	
			if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSolicitudReemplazo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSolicitudReemplazo() throws Exception {
		try	{
			if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSolicitudReemplazo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSolicitudReemplazo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSolicitudReemplazo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSolicitudReemplazo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSolicitudReemplazo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSolicitudReemplazo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSolicitudReemplazo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSolicitudReemplazo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSolicitudReemplazo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSolicitudReemplazo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSolicitudReemplazo.addItem(reporte);
			}
			
			
			if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSolicitudReemplazo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSolicitudReemplazo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSolicitudReemplazo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSolicitudReemplazo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSolicitudReemplazo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSolicitudReemplazo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSolicitudReemplazo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSolicitudReemplazo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSolicitudReemplazo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSolicitudReemplazo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSolicitudReemplazo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSolicitudReemplazo!=null) {
				this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSolicitudReemplazo!=null) {
				this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSolicitudReemplazo!=null) {
				
				if(this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SolicitudReemplazoConstantesFunciones.getTiposSeleccionarSolicitudReemplazo(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SolicitudReemplazoConstantesFunciones.getTiposSeleccionarSolicitudReemplazo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SolicitudReemplazoConstantesFunciones.getTiposSeleccionarSolicitudReemplazo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSolicitudReemplazo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.getSelectedItem()!=null){this.id_empleado_jefeFK_IdEmpleadoJefe=((Empleado)this.jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.getSelectedItem()!=null){this.id_empleado_reemplazoFK_IdEmpleadoReemplazo=((Empleado)this.jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.getSelectedItem()!=null){this.id_estado_solicitud_nomiFK_IdEstadoSolicitudNomi=((EstadoSolicitudNomi)this.jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSolicitudReemplazo(Boolean esInicializar) throws Exception {				
		if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSolicitudReemplazo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSolicitudReemplazo() throws Exception {
		this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySolicitudReemplazo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSolicitudReemplazoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSolicitudReemplazo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=solicitudreemplazoLogic.getSolicitudReemplazos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=solicitudreemplazos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSolicitudReemplazo.setModel(new SolicitudReemplazoModel(this.solicitudreemplazoLogic.getSolicitudReemplazos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSolicitudReemplazo.setModel(new SolicitudReemplazoModel(this.solicitudreemplazos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySolicitudReemplazo!=null && this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySolicitudReemplazo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO,solicitudreemplazoConstantesFunciones.resaltarSeleccionarSolicitudReemplazo,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO,solicitudreemplazoConstantesFunciones.resaltarSeleccionarSolicitudReemplazo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_ID));

		if(this.solicitudreemplazoConstantesFunciones.mostraridSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudreemplazoConstantesFunciones.resaltaridSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activaridSolicitudReemplazo,iSizeTabla,this,true,"idSolicitudReemplazo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudreemplazoConstantesFunciones.resaltaridSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activaridSolicitudReemplazo,this,true,"idSolicitudReemplazo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.solicitudreemplazoConstantesFunciones.mostrarid_empresaSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_empresaSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_empresaSolicitudReemplazo,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_empresaSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_empresaSolicitudReemplazo,false,"id_empresaSolicitudReemplazo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.solicitudreemplazoConstantesFunciones.mostrarid_sucursalSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_sucursalSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_sucursalSolicitudReemplazo,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_sucursalSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_sucursalSolicitudReemplazo,false,"id_sucursalSolicitudReemplazo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE));

		if(this.solicitudreemplazoConstantesFunciones.mostrarid_empleado_jefeSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadojefesForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_empleado_jefeSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_empleado_jefeSolicitudReemplazo,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadojefesForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_empleado_jefeSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_empleado_jefeSolicitudReemplazo,true,"id_empleado_jefeSolicitudReemplazo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.solicitudreemplazoConstantesFunciones.mostrarid_empleadoSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_empleadoSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_empleadoSolicitudReemplazo,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_empleadoSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_empleadoSolicitudReemplazo,true,"id_empleadoSolicitudReemplazo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO));

		if(this.solicitudreemplazoConstantesFunciones.mostrarid_empleado_reemplazoSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadoreemplazosForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_empleado_reemplazoSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_empleado_reemplazoSolicitudReemplazo,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadoreemplazosForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_empleado_reemplazoSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_empleado_reemplazoSolicitudReemplazo,true,"id_empleado_reemplazoSolicitudReemplazo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.solicitudreemplazoConstantesFunciones.mostrarid_estructuraSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_estructuraSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_estructuraSolicitudReemplazo,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_estructuraSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_estructuraSolicitudReemplazo,true,"id_estructuraSolicitudReemplazo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI));

		if(this.solicitudreemplazoConstantesFunciones.mostrarid_estado_solicitud_nomiSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoSolicitudNomiTableCell(this.estadosolicitudnomisForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_estado_solicitud_nomiSolicitudReemplazo,iSizeTabla));
			tableColumn.setCellEditor(new EstadoSolicitudNomiTableCell(this.estadosolicitudnomisForeignKey,this.solicitudreemplazoConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudReemplazo,this,this.solicitudreemplazoConstantesFunciones.activarid_estado_solicitud_nomiSolicitudReemplazo,true,"id_estado_solicitud_nomiSolicitudReemplazo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL));

		if(this.solicitudreemplazoConstantesFunciones.mostrarsecuencialSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.solicitudreemplazoConstantesFunciones.resaltarsecuencialSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarsecuencialSolicitudReemplazo,iSizeTabla,this,true,"secuencialSolicitudReemplazo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudreemplazoConstantesFunciones.resaltarsecuencialSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarsecuencialSolicitudReemplazo,this,true,"secuencialSolicitudReemplazo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA));

		if(this.solicitudreemplazoConstantesFunciones.mostrarfecha_solicitaSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.solicitudreemplazoConstantesFunciones.resaltarfecha_solicitaSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarfecha_solicitaSolicitudReemplazo,iSizeTabla,this,true,"fecha_solicitaSolicitudReemplazo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.solicitudreemplazoConstantesFunciones.resaltarfecha_solicitaSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarfecha_solicitaSolicitudReemplazo,this,true,"fecha_solicitaSolicitudReemplazo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA));

		if(this.solicitudreemplazoConstantesFunciones.mostrarfecha_ejecutaSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.solicitudreemplazoConstantesFunciones.resaltarfecha_ejecutaSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarfecha_ejecutaSolicitudReemplazo,iSizeTabla,this,true,"fecha_ejecutaSolicitudReemplazo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.solicitudreemplazoConstantesFunciones.resaltarfecha_ejecutaSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarfecha_ejecutaSolicitudReemplazo,this,true,"fecha_ejecutaSolicitudReemplazo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS));

		if(this.solicitudreemplazoConstantesFunciones.mostrarnumero_horasSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudreemplazoConstantesFunciones.resaltarnumero_horasSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarnumero_horasSolicitudReemplazo,iSizeTabla,this,true,"numero_horasSolicitudReemplazo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudreemplazoConstantesFunciones.resaltarnumero_horasSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarnumero_horasSolicitudReemplazo,this,true,"numero_horasSolicitudReemplazo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO));

		if(this.solicitudreemplazoConstantesFunciones.mostrarcosto_unitarioSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudreemplazoConstantesFunciones.resaltarcosto_unitarioSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarcosto_unitarioSolicitudReemplazo,iSizeTabla,this,true,"costo_unitarioSolicitudReemplazo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudreemplazoConstantesFunciones.resaltarcosto_unitarioSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarcosto_unitarioSolicitudReemplazo,this,true,"costo_unitarioSolicitudReemplazo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.solicitudreemplazoConstantesFunciones.mostrarcosto_totalSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.solicitudreemplazoConstantesFunciones.resaltarcosto_totalSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarcosto_totalSolicitudReemplazo,iSizeTabla,this,true,"costo_totalSolicitudReemplazo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudreemplazoConstantesFunciones.resaltarcosto_totalSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activarcosto_totalSolicitudReemplazo,this,true,"costo_totalSolicitudReemplazo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.solicitudreemplazoConstantesFunciones.mostrardescripcionSolicitudReemplazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.solicitudreemplazoConstantesFunciones.resaltardescripcionSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activardescripcionSolicitudReemplazo,iSizeTabla,this,true,"descripcionSolicitudReemplazo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.solicitudreemplazoConstantesFunciones.resaltardescripcionSolicitudReemplazo,this.solicitudreemplazoConstantesFunciones.activardescripcionSolicitudReemplazo,this,true,"descripcionSolicitudReemplazo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SolicitudReemplazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.solicitudreemplazoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.solicitudreemplazoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSolicitudReemplazo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.solicitudreemplazoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.solicitudreemplazoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSolicitudReemplazo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.solicitudreemplazoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.solicitudreemplazoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSolicitudReemplazo.addColumn(tableColumn);
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
			
			this.jTableDatosSolicitudReemplazo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSolicitudReemplazo.moveColumn(this.jTableDatosSolicitudReemplazo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSolicitudReemplazo.moveColumn(this.jTableDatosSolicitudReemplazo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSolicitudReemplazo.moveColumn(this.jTableDatosSolicitudReemplazo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSolicitudReemplazo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSolicitudReemplazo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSolicitudReemplazo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSolicitudReemplazo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSolicitudReemplazo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSolicitudReemplazo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSolicitudReemplazo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=solicitudreemplazoLogic.getSolicitudReemplazos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=solicitudreemplazos.size()-1;
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
		//this.jTableDatosSolicitudReemplazo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSolicitudReemplazo();
			
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
				
				//this.isEsNuevoSolicitudReemplazo=false;
					
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
				if(this.solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSolicitudReemplazo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSolicitudReemplazo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.solicitudreemplazo.getsType().equals("DUPLICADO")
				   || this.solicitudreemplazo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSolicitudReemplazo=true;
				
				} else {
					this.isEsNuevoSolicitudReemplazo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
					if(this.solicitudreemplazo.getId()>=0 && !this.solicitudreemplazo.getIsNew()) {						
						this.isEsNuevoSolicitudReemplazo=false;
						
					} else {
						this.isEsNuevoSolicitudReemplazo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSolicitudReemplazo(esRelaciones);						
				
				this.seleccionarSolicitudReemplazo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.solicitudreemplazo.getId()<0) {
					this.isEsNuevoSolicitudReemplazo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSolicitudReemplazo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSolicitudReemplazo(evt,rowIndex);
				}	
				
				if(this.solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SolicitudReemplazo: " + this.dDif); 
					}
				}								
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSolicitudReemplazo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.solicitudreemplazo)) {
					if(this.solicitudreemplazo.getId()>0) {
						this.solicitudreemplazo.setIsDeleted(true);
						
						this.solicitudreemplazosEliminados.add(this.solicitudreemplazo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.solicitudreemplazoLogic.getSolicitudReemplazos().remove(this.solicitudreemplazo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazos.remove(this.solicitudreemplazo);				
					}
					
					
					((SolicitudReemplazoModel) this.jTableDatosSolicitudReemplazo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSolicitudReemplazo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSolicitudReemplazo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSolicitudReemplazo) {
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSolicitudReemplazo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSolicitudReemplazo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSolicitudReemplazo(this.solicitudreemplazo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.solicitudreemplazoConstantesFunciones.cargarid_empresaSolicitudReemplazo || this.solicitudreemplazoConstantesFunciones.event_dependid_empresaSolicitudReemplazo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.solicitudreemplazo.getid_empresa());
									//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(solicitudreemplazo.getEmpresa()!=null) {
							this.empresasForeignKey.add(solicitudreemplazo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.solicitudreemplazo.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.solicitudreemplazoConstantesFunciones.cargarid_sucursalSolicitudReemplazo || this.solicitudreemplazoConstantesFunciones.event_dependid_sucursalSolicitudReemplazo) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.solicitudreemplazo.getid_sucursal());
									//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(solicitudreemplazo.getSucursal()!=null) {
							this.sucursalsForeignKey.add(solicitudreemplazo.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.solicitudreemplazo.getid_sucursal(),false,"Formulario");

					//EmpleadoJefe
					if(!this.solicitudreemplazoConstantesFunciones.cargarid_empleado_jefeSolicitudReemplazo || this.solicitudreemplazoConstantesFunciones.event_dependid_empleado_jefeSolicitudReemplazo) {
						//this.cargarCombosEmpleadoJefesForeignKeyLista(" where id="+this.solicitudreemplazo.getid_empleado_jefe());
									//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
						this.empleadojefesForeignKey=new ArrayList<Empleado>();

						if(solicitudreemplazo.getEmpleadoJefe()!=null) {
							this.empleadojefesForeignKey.add(solicitudreemplazo.getEmpleadoJefe());
						}

						this.addItemDefectoCombosForeignKeyEmpleadoJefe();
						this.cargarCombosFrameEmpleadoJefesForeignKey("Todos");
					}
					this.setActualEmpleadoJefeForeignKey(this.solicitudreemplazo.getid_empleado_jefe(),false,"Formulario");

					//Empleado
					if(!this.solicitudreemplazoConstantesFunciones.cargarid_empleadoSolicitudReemplazo || this.solicitudreemplazoConstantesFunciones.event_dependid_empleadoSolicitudReemplazo) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.solicitudreemplazo.getid_empleado());
									//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(solicitudreemplazo.getEmpleado()!=null) {
							this.empleadosForeignKey.add(solicitudreemplazo.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.solicitudreemplazo.getid_empleado(),false,"Formulario");

					//EmpleadoReemplazo
					if(!this.solicitudreemplazoConstantesFunciones.cargarid_empleado_reemplazoSolicitudReemplazo || this.solicitudreemplazoConstantesFunciones.event_dependid_empleado_reemplazoSolicitudReemplazo) {
						//this.cargarCombosEmpleadoReemplazosForeignKeyLista(" where id="+this.solicitudreemplazo.getid_empleado_reemplazo());
									//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
						this.empleadoreemplazosForeignKey=new ArrayList<Empleado>();

						if(solicitudreemplazo.getEmpleadoReemplazo()!=null) {
							this.empleadoreemplazosForeignKey.add(solicitudreemplazo.getEmpleadoReemplazo());
						}

						this.addItemDefectoCombosForeignKeyEmpleadoReemplazo();
						this.cargarCombosFrameEmpleadoReemplazosForeignKey("Todos");
					}
					this.setActualEmpleadoReemplazoForeignKey(this.solicitudreemplazo.getid_empleado_reemplazo(),false,"Formulario");

					//Estructura
					if(!this.solicitudreemplazoConstantesFunciones.cargarid_estructuraSolicitudReemplazo || this.solicitudreemplazoConstantesFunciones.event_dependid_estructuraSolicitudReemplazo) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.solicitudreemplazo.getid_estructura());
									//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(solicitudreemplazo.getEstructura()!=null) {
							this.estructurasForeignKey.add(solicitudreemplazo.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.solicitudreemplazo.getid_estructura(),false,"Formulario");

					//EstadoSolicitudNomi
					if(!this.solicitudreemplazoConstantesFunciones.cargarid_estado_solicitud_nomiSolicitudReemplazo || this.solicitudreemplazoConstantesFunciones.event_dependid_estado_solicitud_nomiSolicitudReemplazo) {
						//this.cargarCombosEstadoSolicitudNomisForeignKeyLista(" where id="+this.solicitudreemplazo.getid_estado_solicitud_nomi());
									//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
						this.estadosolicitudnomisForeignKey=new ArrayList<EstadoSolicitudNomi>();

						if(solicitudreemplazo.getEstadoSolicitudNomi()!=null) {
							this.estadosolicitudnomisForeignKey.add(solicitudreemplazo.getEstadoSolicitudNomi());
						}

						this.addItemDefectoCombosForeignKeyEstadoSolicitudNomi();
						this.cargarCombosFrameEstadoSolicitudNomisForeignKey("Todos");
					}
					this.setActualEstadoSolicitudNomiForeignKey(this.solicitudreemplazo.getid_estado_solicitud_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSolicitudReemplazo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSolicitudReemplazo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSolicitudReemplazo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSolicitudReemplazo(solicitudreemplazo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSolicitudReemplazo(solicitudreemplazo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySolicitudReemplazo(solicitudreemplazo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySolicitudReemplazo(solicitudreemplazo);
	}
	
	public void setVariablesObjetoActualToFormularioSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelidSolicitudReemplazo.setText(solicitudreemplazo.getId().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldsecuencialSolicitudReemplazo.setText(solicitudreemplazo.getsecuencial());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_solicitaSolicitudReemplazo.setDate(solicitudreemplazo.getfecha_solicita());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_ejecutaSolicitudReemplazo.setDate(solicitudreemplazo.getfecha_ejecuta());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldnumero_horasSolicitudReemplazo.setText(solicitudreemplazo.getnumero_horas().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_unitarioSolicitudReemplazo.setText(solicitudreemplazo.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_totalSolicitudReemplazo.setText(solicitudreemplazo.getcosto_total().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextAreadescripcionSolicitudReemplazo.setText(solicitudreemplazo.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SolicitudReemplazo solicitudreemplazoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,solicitudreemplazoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SolicitudReemplazo solicitudreemplazoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				solicitudreemplazoLocal=this.solicitudreemplazo;
			} else {
				solicitudreemplazoLocal=this.solicitudreemplazoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(solicitudreemplazoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSolicitudReemplazo(solicitudreemplazoLocal,true);
					
					if(solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(solicitudreemplazoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(solicitudreemplazoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSolicitudReemplazo(solicitudreemplazo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(solicitudreemplazo);
	}
	
	public void setVariablesFormularioToObjetoActualSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSolicitudReemplazo(solicitudreemplazo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelidSolicitudReemplazo.getText()==null || this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelidSolicitudReemplazo.getText()=="" || this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelidSolicitudReemplazo.getText()=="Id") {
				this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelidSolicitudReemplazo.setText("0");
			}

			if(conColumnasBase) {solicitudreemplazo.setId(Long.parseLong(this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelidSolicitudReemplazo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudReemplazoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelIdSolicitudReemplazo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudreemplazo.setsecuencial(this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldsecuencialSolicitudReemplazo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelsecuencialSolicitudReemplazo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudreemplazo.setfecha_solicita(this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_solicitaSolicitudReemplazo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelfecha_solicitaSolicitudReemplazo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudreemplazo.setfecha_ejecuta(this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_ejecutaSolicitudReemplazo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelfecha_ejecutaSolicitudReemplazo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudreemplazo.setnumero_horas(Integer.parseInt(this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldnumero_horasSolicitudReemplazo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelnumero_horasSolicitudReemplazo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudreemplazo.setcosto_unitario(Double.parseDouble(this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_unitarioSolicitudReemplazo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelcosto_unitarioSolicitudReemplazo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudreemplazo.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_totalSolicitudReemplazo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelcosto_totalSolicitudReemplazo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			solicitudreemplazo.setdescripcion(this.jInternalFrameDetalleFormSolicitudReemplazo.jTextAreadescripcionSolicitudReemplazo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSolicitudReemplazo.jLabeldescripcionSolicitudReemplazo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSolicitudReemplazo(SolicitudReemplazo solicitudreemplazoBean,SolicitudReemplazo solicitudreemplazo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && solicitudreemplazoBean.getid_empleado_jefe()!=null && !solicitudreemplazoBean.getid_empleado_jefe().equals(-1L))) {solicitudreemplazo.setid_empleado_jefe(solicitudreemplazoBean.getid_empleado_jefe());}
			if(conDefault || (!conDefault && solicitudreemplazoBean.getid_empleado()!=null && !solicitudreemplazoBean.getid_empleado().equals(-1L))) {solicitudreemplazo.setid_empleado(solicitudreemplazoBean.getid_empleado());}
			if(conDefault || (!conDefault && solicitudreemplazoBean.getid_empleado_reemplazo()!=null && !solicitudreemplazoBean.getid_empleado_reemplazo().equals(-1L))) {solicitudreemplazo.setid_empleado_reemplazo(solicitudreemplazoBean.getid_empleado_reemplazo());}
			if(conDefault || (!conDefault && solicitudreemplazoBean.getid_estructura()!=null && !solicitudreemplazoBean.getid_estructura().equals(-1L))) {solicitudreemplazo.setid_estructura(solicitudreemplazoBean.getid_estructura());}
			if(conDefault || (!conDefault && solicitudreemplazoBean.getid_estado_solicitud_nomi()!=null && !solicitudreemplazoBean.getid_estado_solicitud_nomi().equals(-1L))) {solicitudreemplazo.setid_estado_solicitud_nomi(solicitudreemplazoBean.getid_estado_solicitud_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSolicitudReemplazo(SolicitudReemplazo solicitudreemplazoOrigen,SolicitudReemplazo solicitudreemplazo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && solicitudreemplazoOrigen.getId()!=null && !solicitudreemplazoOrigen.getId().equals(0L))) {solicitudreemplazo.setId(solicitudreemplazoOrigen.getId());}}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getid_empleado_jefe()!=null && !solicitudreemplazoOrigen.getid_empleado_jefe().equals(-1L))) {solicitudreemplazo.setid_empleado_jefe(solicitudreemplazoOrigen.getid_empleado_jefe());}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getid_empleado()!=null && !solicitudreemplazoOrigen.getid_empleado().equals(-1L))) {solicitudreemplazo.setid_empleado(solicitudreemplazoOrigen.getid_empleado());}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getid_empleado_reemplazo()!=null && !solicitudreemplazoOrigen.getid_empleado_reemplazo().equals(-1L))) {solicitudreemplazo.setid_empleado_reemplazo(solicitudreemplazoOrigen.getid_empleado_reemplazo());}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getid_estructura()!=null && !solicitudreemplazoOrigen.getid_estructura().equals(-1L))) {solicitudreemplazo.setid_estructura(solicitudreemplazoOrigen.getid_estructura());}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getid_estado_solicitud_nomi()!=null && !solicitudreemplazoOrigen.getid_estado_solicitud_nomi().equals(-1L))) {solicitudreemplazo.setid_estado_solicitud_nomi(solicitudreemplazoOrigen.getid_estado_solicitud_nomi());}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getsecuencial()!=null && !solicitudreemplazoOrigen.getsecuencial().equals(""))) {solicitudreemplazo.setsecuencial(solicitudreemplazoOrigen.getsecuencial());}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getfecha_solicita()!=null && !solicitudreemplazoOrigen.getfecha_solicita().equals(new Date()))) {solicitudreemplazo.setfecha_solicita(solicitudreemplazoOrigen.getfecha_solicita());}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getfecha_ejecuta()!=null && !solicitudreemplazoOrigen.getfecha_ejecuta().equals(new Date()))) {solicitudreemplazo.setfecha_ejecuta(solicitudreemplazoOrigen.getfecha_ejecuta());}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getnumero_horas()!=null && !solicitudreemplazoOrigen.getnumero_horas().equals(0))) {solicitudreemplazo.setnumero_horas(solicitudreemplazoOrigen.getnumero_horas());}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getcosto_unitario()!=null && !solicitudreemplazoOrigen.getcosto_unitario().equals(0.0))) {solicitudreemplazo.setcosto_unitario(solicitudreemplazoOrigen.getcosto_unitario());}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getcosto_total()!=null && !solicitudreemplazoOrigen.getcosto_total().equals(0.0))) {solicitudreemplazo.setcosto_total(solicitudreemplazoOrigen.getcosto_total());}
			if(conDefault || (!conDefault && solicitudreemplazoOrigen.getdescripcion()!=null && !solicitudreemplazoOrigen.getdescripcion().equals(""))) {solicitudreemplazo.setdescripcion(solicitudreemplazoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelidSolicitudReemplazo.setText(solicitudreemplazo.getId().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldsecuencialSolicitudReemplazo.setText(solicitudreemplazo.getsecuencial());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_solicitaSolicitudReemplazo.setDate(solicitudreemplazo.getfecha_solicita());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_ejecutaSolicitudReemplazo.setDate(solicitudreemplazo.getfecha_ejecuta());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldnumero_horasSolicitudReemplazo.setText(solicitudreemplazo.getnumero_horas().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_unitarioSolicitudReemplazo.setText(solicitudreemplazo.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_totalSolicitudReemplazo.setText(solicitudreemplazo.getcosto_total().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextAreadescripcionSolicitudReemplazo.setText(solicitudreemplazo.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSolicitudReemplazo(SolicitudReemplazoBean solicitudreemplazoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelidSolicitudReemplazo.setText(solicitudreemplazoBean.getId().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldsecuencialSolicitudReemplazo.setText(solicitudreemplazoBean.getsecuencial());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_solicitaSolicitudReemplazo.setDate(solicitudreemplazoBean.getfecha_solicita());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_ejecutaSolicitudReemplazo.setDate(solicitudreemplazoBean.getfecha_ejecuta());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldnumero_horasSolicitudReemplazo.setText(solicitudreemplazoBean.getnumero_horas().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_unitarioSolicitudReemplazo.setText(solicitudreemplazoBean.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_totalSolicitudReemplazo.setText(solicitudreemplazoBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTextAreadescripcionSolicitudReemplazo.setText(solicitudreemplazoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSolicitudReemplazo(SolicitudReemplazoParameterReturnGeneral solicitudreemplazoReturnGeneral,SolicitudReemplazoBean solicitudreemplazoBean,Boolean conDefault) throws Exception { 
		try {
			SolicitudReemplazo solicitudreemplazoLocal=new SolicitudReemplazo();
			
			solicitudreemplazoLocal=solicitudreemplazoReturnGeneral.getSolicitudReemplazo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && solicitudreemplazoLocal.getId()!=null && !solicitudreemplazoLocal.getId().equals(0L))) {solicitudreemplazoBean.setId(solicitudreemplazoLocal.getId());}}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getid_empleado_jefe()!=null && !solicitudreemplazoLocal.getid_empleado_jefe().equals(-1L))) {solicitudreemplazoBean.setid_empleado_jefe(solicitudreemplazoLocal.getid_empleado_jefe());}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getid_empleado()!=null && !solicitudreemplazoLocal.getid_empleado().equals(-1L))) {solicitudreemplazoBean.setid_empleado(solicitudreemplazoLocal.getid_empleado());}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getid_empleado_reemplazo()!=null && !solicitudreemplazoLocal.getid_empleado_reemplazo().equals(-1L))) {solicitudreemplazoBean.setid_empleado_reemplazo(solicitudreemplazoLocal.getid_empleado_reemplazo());}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getid_estructura()!=null && !solicitudreemplazoLocal.getid_estructura().equals(-1L))) {solicitudreemplazoBean.setid_estructura(solicitudreemplazoLocal.getid_estructura());}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getid_estado_solicitud_nomi()!=null && !solicitudreemplazoLocal.getid_estado_solicitud_nomi().equals(-1L))) {solicitudreemplazoBean.setid_estado_solicitud_nomi(solicitudreemplazoLocal.getid_estado_solicitud_nomi());}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getsecuencial()!=null && !solicitudreemplazoLocal.getsecuencial().equals(""))) {solicitudreemplazoBean.setsecuencial(solicitudreemplazoLocal.getsecuencial());}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getfecha_solicita()!=null && !solicitudreemplazoLocal.getfecha_solicita().equals(new Date()))) {solicitudreemplazoBean.setfecha_solicita(solicitudreemplazoLocal.getfecha_solicita());}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getfecha_ejecuta()!=null && !solicitudreemplazoLocal.getfecha_ejecuta().equals(new Date()))) {solicitudreemplazoBean.setfecha_ejecuta(solicitudreemplazoLocal.getfecha_ejecuta());}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getnumero_horas()!=null && !solicitudreemplazoLocal.getnumero_horas().equals(0))) {solicitudreemplazoBean.setnumero_horas(solicitudreemplazoLocal.getnumero_horas());}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getcosto_unitario()!=null && !solicitudreemplazoLocal.getcosto_unitario().equals(0.0))) {solicitudreemplazoBean.setcosto_unitario(solicitudreemplazoLocal.getcosto_unitario());}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getcosto_total()!=null && !solicitudreemplazoLocal.getcosto_total().equals(0.0))) {solicitudreemplazoBean.setcosto_total(solicitudreemplazoLocal.getcosto_total());}
			if(conDefault || (!conDefault && solicitudreemplazoLocal.getdescripcion()!=null && !solicitudreemplazoLocal.getdescripcion().equals(""))) {solicitudreemplazoBean.setdescripcion(solicitudreemplazoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSolicitudReemplazoGenerico(Long idSolicitudReemplazoSeleccionado,JComboBox jComboBoxSolicitudReemplazo,List<SolicitudReemplazo> solicitudreemplazosLocal)throws Exception {
		try {
			SolicitudReemplazo  solicitudreemplazoTemp=null;

			for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazosLocal) {
				if(solicitudreemplazoAux.getId()!=null && solicitudreemplazoAux.getId().equals(idSolicitudReemplazoSeleccionado)) {
					solicitudreemplazoTemp=solicitudreemplazoAux;
					break;
				}
			}

			jComboBoxSolicitudReemplazo.setSelectedItem(solicitudreemplazoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSolicitudReemplazoGenerico(JComboBox jComboBoxSolicitudReemplazo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSolicitudReemplazo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSolicitudReemplazo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSolicitudReemplazo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSolicitudReemplazo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSolicitudReemplazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSolicitudReemplazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			solicitudreemplazo=(SolicitudReemplazo) solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			solicitudreemplazo =(SolicitudReemplazo) solicitudreemplazos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!solicitudreemplazo.getIsNew() && !solicitudreemplazo.getIsChanged() && !solicitudreemplazo.getIsDeleted()) {
				sDescripcion=solicitudreemplazo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudreemplazo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!solicitudreemplazo.getIsNew() && !solicitudreemplazo.getIsChanged() && !solicitudreemplazo.getIsDeleted()) {
				sDescripcion=solicitudreemplazo.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudreemplazo.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("EmpleadoJefe")) {
			//sDescripcion=this.getActualEmpleadoJefeForeignKeyDescripcion((Long)value);
			if(!solicitudreemplazo.getIsNew() && !solicitudreemplazo.getIsChanged() && !solicitudreemplazo.getIsDeleted()) {
				sDescripcion=solicitudreemplazo.getempleadojefe_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoJefeForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudreemplazo.getempleadojefe_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!solicitudreemplazo.getIsNew() && !solicitudreemplazo.getIsChanged() && !solicitudreemplazo.getIsDeleted()) {
				sDescripcion=solicitudreemplazo.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudreemplazo.getempleado_descripcion();
			}
		}

		if(sTipo.equals("EmpleadoReemplazo")) {
			//sDescripcion=this.getActualEmpleadoReemplazoForeignKeyDescripcion((Long)value);
			if(!solicitudreemplazo.getIsNew() && !solicitudreemplazo.getIsChanged() && !solicitudreemplazo.getIsDeleted()) {
				sDescripcion=solicitudreemplazo.getempleadoreemplazo_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoReemplazoForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudreemplazo.getempleadoreemplazo_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!solicitudreemplazo.getIsNew() && !solicitudreemplazo.getIsChanged() && !solicitudreemplazo.getIsDeleted()) {
				sDescripcion=solicitudreemplazo.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudreemplazo.getestructura_descripcion();
			}
		}

		if(sTipo.equals("EstadoSolicitudNomi")) {
			//sDescripcion=this.getActualEstadoSolicitudNomiForeignKeyDescripcion((Long)value);
			if(!solicitudreemplazo.getIsNew() && !solicitudreemplazo.getIsChanged() && !solicitudreemplazo.getIsDeleted()) {
				sDescripcion=solicitudreemplazo.getestadosolicitudnomi_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoSolicitudNomiForeignKeyDescripcion((Long)value);
				sDescripcion=solicitudreemplazo.getestadosolicitudnomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SolicitudReemplazo solicitudreemplazoRow=new SolicitudReemplazo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			solicitudreemplazoRow=(SolicitudReemplazo) solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			solicitudreemplazoRow=(SolicitudReemplazo) solicitudreemplazos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSolicitudReemplazo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSolicitudReemplazo.setVisible((this.isVisibilidadCeldaNuevoSolicitudReemplazo && this.isPermisoNuevoSolicitudReemplazo));			
			this.jButtonDuplicarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaDuplicarSolicitudReemplazo && this.isPermisoDuplicarSolicitudReemplazo));			
			this.jButtonCopiarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaCopiarSolicitudReemplazo && this.isPermisoCopiarSolicitudReemplazo));
			this.jButtonVerFormSolicitudReemplazo.setVisible((this.isVisibilidadCeldaVerFormSolicitudReemplazo && this.isPermisoVerFormSolicitudReemplazo));
			
			this.jButtonAbrirOrderBySolicitudReemplazo.setVisible((this.isVisibilidadCeldaOrdenSolicitudReemplazo && this.isPermisoOrdenSolicitudReemplazo));			
			
			this.jButtonNuevoRelacionesSolicitudReemplazo.setVisible((this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo && this.isPermisoNuevoSolicitudReemplazo));			
			this.jButtonNuevoGuardarCambiosSolicitudReemplazo.setVisible((this.isVisibilidadCeldaNuevoSolicitudReemplazo && this.isPermisoNuevoSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo));
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonModificarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaModificarSolicitudReemplazo && this.isPermisoActualizarSolicitudReemplazo));	
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonActualizarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaActualizarSolicitudReemplazo && this.isPermisoActualizarSolicitudReemplazo));	
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonEliminarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaEliminarSolicitudReemplazo && this.isPermisoEliminarSolicitudReemplazo));
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonCancelarSolicitudReemplazo.setVisible(this.isVisibilidadCeldaCancelarSolicitudReemplazo);							
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosSolicitudReemplazo.setVisible((this.isVisibilidadCeldaGuardarSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo));			
			
			}
						
			this.jButtonGuardarCambiosTablaSolicitudReemplazo.setVisible((this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaNuevoSolicitudReemplazo && this.isPermisoNuevoSolicitudReemplazo));						
			this.jButtonDuplicarToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaDuplicarSolicitudReemplazo && this.isPermisoDuplicarSolicitudReemplazo));						
			this.jButtonCopiarToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaCopiarSolicitudReemplazo && this.isPermisoCopiarSolicitudReemplazo));			
			this.jButtonVerFormToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaVerFormSolicitudReemplazo && this.isPermisoVerFormSolicitudReemplazo));			
			this.jButtonAbrirOrderByToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaOrdenSolicitudReemplazo && this.isPermisoOrdenSolicitudReemplazo));
			this.jButtonNuevoRelacionesToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo && this.isPermisoNuevoSolicitudReemplazo));			
			this.jButtonNuevoGuardarCambiosToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaNuevoSolicitudReemplazo && this.isPermisoNuevoSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo));			
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonModificarToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaModificarSolicitudReemplazo && this.isPermisoActualizarSolicitudReemplazo));	
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonActualizarToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaActualizarSolicitudReemplazo  && this.isPermisoActualizarSolicitudReemplazo));	
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonEliminarToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaEliminarSolicitudReemplazo && this.isPermisoEliminarSolicitudReemplazo));
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonCancelarToolBarSolicitudReemplazo.setVisible(this.isVisibilidadCeldaCancelarSolicitudReemplazo);				
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaGuardarSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSolicitudReemplazo.setVisible((this.isVisibilidadCeldaNuevoSolicitudReemplazo && this.isPermisoNuevoSolicitudReemplazo));			
			this.jMenuItemDuplicarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaDuplicarSolicitudReemplazo && this.isPermisoDuplicarSolicitudReemplazo));			
			this.jMenuItemCopiarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaCopiarSolicitudReemplazo && this.isPermisoCopiarSolicitudReemplazo));			
			this.jMenuItemVerFormSolicitudReemplazo.setVisible((this.isVisibilidadCeldaVerFormSolicitudReemplazo && this.isPermisoVerFormSolicitudReemplazo));			
			this.jMenuItemAbrirOrderBySolicitudReemplazo.setVisible((this.isVisibilidadCeldaOrdenSolicitudReemplazo && this.isPermisoOrdenSolicitudReemplazo));			
			//this.jMenuItemMostrarOcultarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaOrdenSolicitudReemplazo && this.isPermisoOrdenSolicitudReemplazo));
			this.jMenuItemDetalleAbrirOrderBySolicitudReemplazo.setVisible((this.isVisibilidadCeldaOrdenSolicitudReemplazo && this.isPermisoOrdenSolicitudReemplazo));			
			//this.jMenuItemDetalleMostrarOcultarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaOrdenSolicitudReemplazo && this.isPermisoOrdenSolicitudReemplazo));			
			this.jMenuItemNuevoRelacionesSolicitudReemplazo.setVisible((this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo && this.isPermisoNuevoSolicitudReemplazo));			
			this.jMenuItemNuevoGuardarCambiosSolicitudReemplazo.setVisible((this.isVisibilidadCeldaNuevoSolicitudReemplazo && this.isPermisoNuevoSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo));									
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemModificarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaModificarSolicitudReemplazo && this.isPermisoActualizarSolicitudReemplazo));	
			this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemActualizarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaActualizarSolicitudReemplazo && this.isPermisoActualizarSolicitudReemplazo));	
			this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemEliminarSolicitudReemplazo.setVisible((this.isVisibilidadCeldaEliminarSolicitudReemplazo && this.isPermisoEliminarSolicitudReemplazo));
			this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemCancelarSolicitudReemplazo.setVisible(this.isVisibilidadCeldaCancelarSolicitudReemplazo);				
			}
			
			this.jMenuItemGuardarCambiosSolicitudReemplazo.setVisible((this.isVisibilidadCeldaGuardarSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo));						
			this.jMenuItemGuardarCambiosTablaSolicitudReemplazo.setVisible((this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=this.jButtonNuevoSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaDuplicarSolicitudReemplazo=this.jButtonDuplicarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaCopiarSolicitudReemplazo=this.jButtonCopiarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaVerFormSolicitudReemplazo=this.jButtonVerFormSolicitudReemplazo.isVisible();
			
			this.isVisibilidadCeldaOrdenSolicitudReemplazo=this.jButtonAbrirOrderBySolicitudReemplazo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=this.jButtonNuevoRelacionesSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaModificarSolicitudReemplazo=this.jButtonModificarSolicitudReemplazo.isVisible();
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonActualizarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonEliminarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaCancelarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonCancelarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaGuardarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosSolicitudReemplazo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=this.jButtonGuardarCambiosTablaSolicitudReemplazo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=this.jButtonNuevoToolBarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=this.jButtonNuevoRelacionesToolBarSolicitudReemplazo.isVisible();
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			this.isVisibilidadCeldaModificarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonModificarToolBarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonActualizarToolBarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonEliminarToolBarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaCancelarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonCancelarToolBarSolicitudReemplazo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSolicitudReemplazo=this.jButtonGuardarCambiosToolBarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=this.jButtonGuardarCambiosTablaToolBarSolicitudReemplazo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=this.jMenuItemNuevoSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=this.jMenuItemNuevoRelacionesSolicitudReemplazo.isVisible();
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			this.isVisibilidadCeldaModificarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemModificarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemActualizarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemEliminarSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaCancelarSolicitudReemplazo=this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemCancelarSolicitudReemplazo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSolicitudReemplazo=this.jMenuItemGuardarCambiosSolicitudReemplazo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=this.jMenuItemGuardarCambiosTablaSolicitudReemplazo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSolicitudReemplazo(Boolean esInicializar) {
		if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
				//if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSolicitudReemplazo();
			}
			
			this.inicializarActualizarBindingBotonesManualSolicitudReemplazo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSolicitudReemplazo() {
		this.jButtonNuevoSolicitudReemplazo.setVisible(this.isPermisoNuevoSolicitudReemplazo);			
		this.jButtonDuplicarSolicitudReemplazo.setVisible(this.isPermisoDuplicarSolicitudReemplazo);			
		this.jButtonCopiarSolicitudReemplazo.setVisible(this.isPermisoCopiarSolicitudReemplazo);			
		this.jButtonVerFormSolicitudReemplazo.setVisible(this.isPermisoVerFormSolicitudReemplazo);			
		
		this.jButtonAbrirOrderBySolicitudReemplazo.setVisible(this.isPermisoOrdenSolicitudReemplazo);					
		
		this.jButtonNuevoRelacionesSolicitudReemplazo.setVisible(this.isPermisoNuevoSolicitudReemplazo);			
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonModificarSolicitudReemplazo.setVisible(this.isPermisoActualizarSolicitudReemplazo);	
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonActualizarSolicitudReemplazo.setVisible(this.isPermisoActualizarSolicitudReemplazo);	
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonEliminarSolicitudReemplazo.setVisible(this.isPermisoEliminarSolicitudReemplazo);
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonCancelarSolicitudReemplazo.setVisible(this.isVisibilidadCeldaCancelarSolicitudReemplazo);						
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosSolicitudReemplazo.setVisible(this.isPermisoGuardarCambiosSolicitudReemplazo);							
		}
		
		this.jButtonGuardarCambiosTablaSolicitudReemplazo.setVisible(this.isPermisoActualizarSolicitudReemplazo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSolicitudReemplazo() {
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonModificarSolicitudReemplazo.setVisible(this.isPermisoActualizarSolicitudReemplazo);	
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonActualizarSolicitudReemplazo.setVisible(this.isPermisoActualizarSolicitudReemplazo);	
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonEliminarSolicitudReemplazo.setVisible(this.isPermisoEliminarSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonCancelarSolicitudReemplazo.setVisible(this.isVisibilidadCeldaCancelarSolicitudReemplazo);							
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosSolicitudReemplazo.setVisible((this.isVisibilidadCeldaGuardarSolicitudReemplazo && this.isPermisoGuardarCambiosSolicitudReemplazo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSolicitudReemplazo() {
		if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSolicitudReemplazo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSolicitudReemplazo() {
	}
	
	public void jTableDatosSolicitudReemplazoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSolicitudReemplazo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.solicitudreemplazo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSolicitudReemplazoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSolicitudReemplazo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudReemplazo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.solicitudreemplazoLogic.getConnexion());

				if(this.solicitudreemplazo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.solicitudreemplazo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudReemplazo=(TitledBorder)this.jScrollPanelDatosSolicitudReemplazo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSolicitudReemplazo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.solicitudreemplazo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalSolicitudReemplazoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebSolicitudReemplazo(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudReemplazo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.solicitudreemplazoLogic.getConnexion());

				if(this.solicitudreemplazo.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.solicitudreemplazo.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudReemplazo=(TitledBorder)this.jScrollPanelDatosSolicitudReemplazo.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderSolicitudReemplazo.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.solicitudreemplazo.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleado_jefeSolicitudReemplazoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleadojefe=true;

			idTienePermisoempleadojefe=this.tienePermisosUsuarioEnPaginaWebSolicitudReemplazo(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleadojefe) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudReemplazo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);

				this.empleadojefeBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadojefeBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadojefeBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.solicitudreemplazoLogic.getConnexion());

				if(this.solicitudreemplazo.getid_empleado_jefe()!=null) {
					this.empleadojefeBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadojefeBeanSwingJInternalFrame.setIdActual(this.solicitudreemplazo.getid_empleado_jefe());
					this.empleadojefeBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadojefeBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadojefeBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadojefeBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudReemplazo=(TitledBorder)this.jScrollPanelDatosSolicitudReemplazo.getBorder();
				TitledBorder titledBorderempleadojefe=(TitledBorder)this.empleadojefeBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleadojefe.setTitle(titledBorderSolicitudReemplazo.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleado_jefeSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getid_empleado_jefe()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado_jefe = "+this.solicitudreemplazo.getid_empleado_jefe().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoSolicitudReemplazoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebSolicitudReemplazo(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudReemplazo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.solicitudreemplazoLogic.getConnexion());

				if(this.solicitudreemplazo.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.solicitudreemplazo.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudReemplazo=(TitledBorder)this.jScrollPanelDatosSolicitudReemplazo.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderSolicitudReemplazo.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.solicitudreemplazo.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleado_reemplazoSolicitudReemplazoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleadoreemplazo=true;

			idTienePermisoempleadoreemplazo=this.tienePermisosUsuarioEnPaginaWebSolicitudReemplazo(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleadoreemplazo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudReemplazo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);

				this.empleadoreemplazoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoreemplazoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoreemplazoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.solicitudreemplazoLogic.getConnexion());

				if(this.solicitudreemplazo.getid_empleado_reemplazo()!=null) {
					this.empleadoreemplazoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoreemplazoBeanSwingJInternalFrame.setIdActual(this.solicitudreemplazo.getid_empleado_reemplazo());
					this.empleadoreemplazoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoreemplazoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoreemplazoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoreemplazoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudReemplazo=(TitledBorder)this.jScrollPanelDatosSolicitudReemplazo.getBorder();
				TitledBorder titledBorderempleadoreemplazo=(TitledBorder)this.empleadoreemplazoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleadoreemplazo.setTitle(titledBorderSolicitudReemplazo.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleado_reemplazoSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getid_empleado_reemplazo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado_reemplazo = "+this.solicitudreemplazo.getid_empleado_reemplazo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraSolicitudReemplazoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebSolicitudReemplazo(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudReemplazo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.solicitudreemplazoLogic.getConnexion());

				if(this.solicitudreemplazo.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.solicitudreemplazo.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudReemplazo=(TitledBorder)this.jScrollPanelDatosSolicitudReemplazo.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderSolicitudReemplazo.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.solicitudreemplazo.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadosolicitudnomi=true;

			idTienePermisoestadosolicitudnomi=this.tienePermisosUsuarioEnPaginaWebSolicitudReemplazo(EstadoSolicitudNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadosolicitudnomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSolicitudReemplazo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSolicitudReemplazo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);

				this.estadosolicitudnomiBeanSwingJInternalFrame=new EstadoSolicitudNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadosolicitudnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadosolicitudnomiBeanSwingJInternalFrame.getEstadoSolicitudNomiLogic().setConnexion(this.solicitudreemplazoLogic.getConnexion());

				if(this.solicitudreemplazo.getid_estado_solicitud_nomi()!=null) {
					this.estadosolicitudnomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadosolicitudnomiBeanSwingJInternalFrame.setIdActual(this.solicitudreemplazo.getid_estado_solicitud_nomi());
					this.estadosolicitudnomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadosolicitudnomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadosolicitudnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoSolicitudNomi();
				}

				JInternalFrameBase jinternalFrame =this.estadosolicitudnomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSolicitudReemplazo=(TitledBorder)this.jScrollPanelDatosSolicitudReemplazo.getBorder();
				TitledBorder titledBorderestadosolicitudnomi=(TitledBorder)this.estadosolicitudnomiBeanSwingJInternalFrame.jScrollPanelDatosEstadoSolicitudNomi.getBorder();

				titledBorderestadosolicitudnomi.setTitle(titledBorderSolicitudReemplazo.getTitle() + " -> Estado Solicitud");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_solicitud_nomiSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getid_estado_solicitud_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_solicitud_nomi = "+this.solicitudreemplazo.getid_estado_solicitud_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.solicitudreemplazo.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_solicitaSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getfecha_solicita()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_solicita = '"+Funciones2.getStringPostgresDate(this.solicitudreemplazo.getfecha_solicita())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ejecutaSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getfecha_ejecuta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ejecuta = '"+Funciones2.getStringPostgresDate(this.solicitudreemplazo.getfecha_ejecuta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_horasSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getnumero_horas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_horas = "+this.solicitudreemplazo.getnumero_horas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_unitarioSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getcosto_unitario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_unitario = "+this.solicitudreemplazo.getcosto_unitario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.solicitudreemplazo.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionSolicitudReemplazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.getsolicitudreemplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.solicitudreemplazo==null) {
						this.solicitudreemplazo = new SolicitudReemplazo();
					}

					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);
				}

				if(this.solicitudreemplazo.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.solicitudreemplazo.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSolicitudReemplazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);

			this.getSolicitudReemplazosFK_IdEmpleado();

			this.inicializarActualizarBindingSolicitudReemplazo(false);

			//if(SolicitudReemplazoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoJefeSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);

			this.getSolicitudReemplazosFK_IdEmpleadoJefe();

			this.inicializarActualizarBindingSolicitudReemplazo(false);

			//if(SolicitudReemplazoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoReemplazoSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);

			this.getSolicitudReemplazosFK_IdEmpleadoReemplazo();

			this.inicializarActualizarBindingSolicitudReemplazo(false);

			//if(SolicitudReemplazoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);

			this.getSolicitudReemplazosFK_IdEmpresa();

			this.inicializarActualizarBindingSolicitudReemplazo(false);

			//if(SolicitudReemplazoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoSolicitudNomiSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);

			this.getSolicitudReemplazosFK_IdEstadoSolicitudNomi();

			this.inicializarActualizarBindingSolicitudReemplazo(false);

			//if(SolicitudReemplazoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);

			this.getSolicitudReemplazosFK_IdEstructura();

			this.inicializarActualizarBindingSolicitudReemplazo(false);

			//if(SolicitudReemplazoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalSolicitudReemplazoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);

			this.getSolicitudReemplazosFK_IdSucursal();

			this.inicializarActualizarBindingSolicitudReemplazo(false);

			//if(SolicitudReemplazoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.solicitudreemplazoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSolicitudReemplazo() {
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.setVisible(false);	    			
			this.jInternalFrameDetalleFormSolicitudReemplazo.dispose();
			this.jInternalFrameDetalleFormSolicitudReemplazo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSolicitudReemplazo!=null) {
			this.jInternalFrameReporteDinamicoSolicitudReemplazo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSolicitudReemplazo.dispose();
			this.jInternalFrameReporteDinamicoSolicitudReemplazo=null;
		}
		
		if(this.jInternalFrameImportacionSolicitudReemplazo!=null) {
			this.jInternalFrameImportacionSolicitudReemplazo.setVisible(false);	    			
			this.jInternalFrameImportacionSolicitudReemplazo.dispose();
			this.jInternalFrameImportacionSolicitudReemplazo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSolicitudReemplazo();
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
			
			if(sTipo.equals("NuevoSolicitudReemplazo")) {
				jButtonNuevoSolicitudReemplazoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSolicitudReemplazo")) {
				jButtonDuplicarSolicitudReemplazoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSolicitudReemplazo")) {
				jButtonCopiarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("VerFormSolicitudReemplazo")) {
				jButtonVerFormSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSolicitudReemplazo")) {
				jButtonNuevoSolicitudReemplazoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSolicitudReemplazo")) {
				jButtonDuplicarSolicitudReemplazoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSolicitudReemplazo")) {
				jButtonNuevoSolicitudReemplazoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSolicitudReemplazo")) {
				jButtonDuplicarSolicitudReemplazoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSolicitudReemplazo")) {
				jButtonNuevoSolicitudReemplazoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSolicitudReemplazo")) {
				jButtonNuevoSolicitudReemplazoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSolicitudReemplazo")) {
				jButtonNuevoSolicitudReemplazoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSolicitudReemplazo")) {
				jButtonModificarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSolicitudReemplazo")) {
				jButtonModificarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSolicitudReemplazo")) {
				jButtonModificarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSolicitudReemplazo")) {
				jButtonActualizarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSolicitudReemplazo")) {
				jButtonActualizarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSolicitudReemplazo")) {
				jButtonActualizarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("EliminarSolicitudReemplazo")) {
				jButtonEliminarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSolicitudReemplazo")) {
				jButtonEliminarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSolicitudReemplazo")) {
				jButtonEliminarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("CancelarSolicitudReemplazo")) {
				jButtonCancelarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSolicitudReemplazo")) {
				jButtonCancelarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSolicitudReemplazo")) {
				jButtonCancelarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("CerrarSolicitudReemplazo")) {
				jButtonCerrarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSolicitudReemplazo")) {
				jButtonCerrarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSolicitudReemplazo")) {
				jButtonCerrarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSolicitudReemplazo")) {
				jButtonMostrarOcultarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSolicitudReemplazo")) {
				jButtonCancelarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSolicitudReemplazo")) {
				jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSolicitudReemplazo")) {
				jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSolicitudReemplazo")) {
				jButtonCopiarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSolicitudReemplazo")) {
				jButtonVerFormSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSolicitudReemplazo")) {
				jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSolicitudReemplazo")) {
				jButtonCopiarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSolicitudReemplazo")) {
				jButtonVerFormSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSolicitudReemplazo")) {
				jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSolicitudReemplazo")) {
				jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSolicitudReemplazo")) {
				jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSolicitudReemplazo")) {
				jButtonRecargarInformacionSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSolicitudReemplazo")) {
				jButtonRecargarInformacionSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSolicitudReemplazo")) {
				jButtonRecargarInformacionSolicitudReemplazoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSolicitudReemplazo")) {
				jButtonAnterioresSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSolicitudReemplazo")) {
				jButtonAnterioresSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSolicitudReemplazo")) {
				jButtonAnterioresSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSolicitudReemplazo")) {
				jButtonSiguientesSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSolicitudReemplazo")) {
				jButtonSiguientesSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSolicitudReemplazo")) {
				jButtonSiguientesSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySolicitudReemplazo") || sTipo.equals("MenuItemDetalleAbrirOrderBySolicitudReemplazo")) {
				jButtonAbrirOrderBySolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSolicitudReemplazo") || sTipo.equals("MenuItemDetalleMostrarOcultarSolicitudReemplazo")) {
				jButtonMostrarOcultarSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSolicitudReemplazo")) {
				jButtonNuevoGuardarCambiosSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSolicitudReemplazo")) {
				jButtonNuevoGuardarCambiosSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSolicitudReemplazo")) {
				jButtonNuevoGuardarCambiosSolicitudReemplazoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSolicitudReemplazo")) {
				jButtonCerrarReporteDinamicoSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSolicitudReemplazo")) {
				jButtonGenerarReporteDinamicoSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSolicitudReemplazo")) {
				
				jButtonGenerarExcelReporteDinamicoSolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSolicitudReemplazo")) {
				jButtonCerrarImportacionSolicitudReemplazoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSolicitudReemplazo")) {
				
				jButtonGenerarImportacionSolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSolicitudReemplazo")) {
				
				jButtonAbrirImportacionSolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSolicitudReemplazo")) {
				jComboBoxTiposAccionesSolicitudReemplazoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSolicitudReemplazo")) {
				jComboBoxTiposRelacionesSolicitudReemplazoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSolicitudReemplazo")) {
				jComboBoxTiposAccionesSolicitudReemplazoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSolicitudReemplazo")) {
				
				jComboBoxTiposSeleccionarSolicitudReemplazoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSolicitudReemplazo")) {
				jTextFieldValorCampoGeneralSolicitudReemplazoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySolicitudReemplazo")) {
				jButtonAbrirOrderBySolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSolicitudReemplazo")) {
				jButtonAbrirOrderBySolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySolicitudReemplazo")) {
				jButtonCerrarOrderBySolicitudReemplazoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSolicitudReemplazoBusqueda")) {
				this.jButtonidSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSolicitudReemplazoUpdate")) {
				this.jButtonid_empresaSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSolicitudReemplazoBusqueda")) {
				this.jButtonid_empresaSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSolicitudReemplazoUpdate")) {
				this.jButtonid_sucursalSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSolicitudReemplazoBusqueda")) {
				this.jButtonid_sucursalSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudReemplazoUpdate")) {
				this.jButtonid_empleado_jefeSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudReemplazoBusqueda")) {
				this.jButtonid_empleado_jefeSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoSolicitudReemplazoUpdate")) {
				this.jButtonid_empleadoSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoSolicitudReemplazoBusqueda")) {
				this.jButtonid_empleadoSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_reemplazoSolicitudReemplazoUpdate")) {
				this.jButtonid_empleado_reemplazoSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_reemplazoSolicitudReemplazoBusqueda")) {
				this.jButtonid_empleado_reemplazoSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraSolicitudReemplazoUpdate")) {
				this.jButtonid_estructuraSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraSolicitudReemplazoBusqueda")) {
				this.jButtonid_estructuraSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudReemplazoUpdate")) {
				this.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudReemplazoBusqueda")) {
				this.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialSolicitudReemplazoBusqueda")) {
				this.jButtonsecuencialSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_solicitaSolicitudReemplazoBusqueda")) {
				this.jButtonfecha_solicitaSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ejecutaSolicitudReemplazoBusqueda")) {
				this.jButtonfecha_ejecutaSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_horasSolicitudReemplazoBusqueda")) {
				this.jButtonnumero_horasSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioSolicitudReemplazoBusqueda")) {
				this.jButtoncosto_unitarioSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalSolicitudReemplazoBusqueda")) {
				this.jButtoncosto_totalSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSolicitudReemplazoBusqueda")) {
				this.jButtondescripcionSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoSolicitudReemplazo")) {
				this.jButtonFK_IdEmpleadoSolicitudReemplazoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoJefeSolicitudReemplazo")) {
				this.jButtonFK_IdEmpleadoJefeSolicitudReemplazoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoReemplazoSolicitudReemplazo")) {
				this.jButtonFK_IdEmpleadoReemplazoSolicitudReemplazoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoSolicitudNomiSolicitudReemplazo")) {
				this.jButtonFK_IdEstadoSolicitudNomiSolicitudReemplazoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraSolicitudReemplazo")) {
				this.jButtonFK_IdEstructuraSolicitudReemplazoActionPerformed(evt);
			}
			
			;
			
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSolicitudReemplazo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudReemplazoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				


				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudReemplazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudReemplazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SolicitudReemplazo solicitudreemplazoLocal=null;
			
			if(!this.getEsControlTabla()) {
				solicitudreemplazoLocal=this.solicitudreemplazo;
			} else {
				solicitudreemplazoLocal=this.solicitudreemplazoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
							
				
				


				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudReemplazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudReemplazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudReemplazoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
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
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
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
			
			


			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudReemplazoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
								
						
				


				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudReemplazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudReemplazo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
								
				
				


				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudReemplazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudReemplazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudReemplazoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudReemplazoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudReemplazoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
							
				
				


				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudReemplazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudReemplazo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudReemplazoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
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
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
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
			
			


			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudReemplazoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
								
				
				


				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudReemplazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudReemplazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudReemplazoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudReemplazoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudReemplazoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSolicitudReemplazo")) {
					jCheckBoxSeleccionarTodosSolicitudReemplazoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSolicitudReemplazo")) {
					jCheckBoxSeleccionadosSolicitudReemplazoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSolicitudReemplazo")) {
					
				}
				
				


				
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudReemplazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudReemplazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
												
				
				


				
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudReemplazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudReemplazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudReemplazoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudReemplazoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
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
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
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
			
			


			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSolicitudReemplazoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudReemplazo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudReemplazo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.solicitudreemplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.solicitudreemplazo);
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
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
				
				


				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SolicitudReemplazo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SolicitudReemplazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSolicitudReemplazoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.solicitudreemplazoAnterior =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSolicitudReemplazo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSolicitudReemplazoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSolicitudReemplazo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.solicitudreemplazo =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.solicitudreemplazo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSolicitudReemplazo")) {
				
				}
				
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSolicitudReemplazo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSolicitudReemplazo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSolicitudReemplazo")) {
			
			}
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSolicitudReemplazo();
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
			if(sTipo.equals("NuevoSolicitudReemplazo")) {
				jButtonNuevoSolicitudReemplazoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSolicitudReemplazo")) {
				jButtonDuplicarSolicitudReemplazoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSolicitudReemplazo")) {
				jButtonCopiarSolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSolicitudReemplazo")) {
				jButtonVerFormSolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSolicitudReemplazo")) {
				jButtonNuevoSolicitudReemplazoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSolicitudReemplazo")) {
				jButtonModificarSolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSolicitudReemplazo")) {
				jButtonActualizarSolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSolicitudReemplazo")) {
				jButtonEliminarSolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSolicitudReemplazo")) {
				jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSolicitudReemplazo")) {
				jButtonCancelarSolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSolicitudReemplazo")) {
				jButtonCerrarSolicitudReemplazoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSolicitudReemplazo")) {
				jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSolicitudReemplazo")) {
				jButtonNuevoGuardarCambiosSolicitudReemplazoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySolicitudReemplazo")) {
				jButtonAbrirOrderBySolicitudReemplazoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSolicitudReemplazo")) {
				jButtonRecargarInformacionSolicitudReemplazoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSolicitudReemplazo")) {
				jButtonAnterioresSolicitudReemplazoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSolicitudReemplazo")) {
				jButtonSiguientesSolicitudReemplazoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSolicitudReemplazoBusqueda")) {
				this.jButtonidSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSolicitudReemplazoUpdate")) {
				this.jButtonid_empresaSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSolicitudReemplazoBusqueda")) {
				this.jButtonid_empresaSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSolicitudReemplazoUpdate")) {
				this.jButtonid_sucursalSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSolicitudReemplazoBusqueda")) {
				this.jButtonid_sucursalSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudReemplazoUpdate")) {
				this.jButtonid_empleado_jefeSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_jefeSolicitudReemplazoBusqueda")) {
				this.jButtonid_empleado_jefeSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoSolicitudReemplazoUpdate")) {
				this.jButtonid_empleadoSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoSolicitudReemplazoBusqueda")) {
				this.jButtonid_empleadoSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_reemplazoSolicitudReemplazoUpdate")) {
				this.jButtonid_empleado_reemplazoSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_reemplazoSolicitudReemplazoBusqueda")) {
				this.jButtonid_empleado_reemplazoSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraSolicitudReemplazoUpdate")) {
				this.jButtonid_estructuraSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraSolicitudReemplazoBusqueda")) {
				this.jButtonid_estructuraSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudReemplazoUpdate")) {
				this.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_solicitud_nomiSolicitudReemplazoBusqueda")) {
				this.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialSolicitudReemplazoBusqueda")) {
				this.jButtonsecuencialSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_solicitaSolicitudReemplazoBusqueda")) {
				this.jButtonfecha_solicitaSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ejecutaSolicitudReemplazoBusqueda")) {
				this.jButtonfecha_ejecutaSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_horasSolicitudReemplazoBusqueda")) {
				this.jButtonnumero_horasSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioSolicitudReemplazoBusqueda")) {
				this.jButtoncosto_unitarioSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalSolicitudReemplazoBusqueda")) {
				this.jButtoncosto_totalSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSolicitudReemplazoBusqueda")) {
				this.jButtondescripcionSolicitudReemplazoBusquedaActionPerformed(evt);
			}
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSolicitudReemplazo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSolicitudReemplazo")) {
				closingInternalFrameSolicitudReemplazo();
				
			} else if(sTipo.equals("jButtonCancelarSolicitudReemplazo")) {
				JInternalFrameBase jInternalFrameDetalleFormSolicitudReemplazo = (JInternalFrameBase)evt.getSource();
	            	
	            SolicitudReemplazoBeanSwingJInternalFrame jInternalFrameParent=(SolicitudReemplazoBeanSwingJInternalFrame)jInternalFrameDetalleFormSolicitudReemplazo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSolicitudReemplazoActionPerformed(null);
			}
			
			SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.solicitudreemplazo,new Object(),this.solicitudreemplazoParameterGeneral,this.solicitudreemplazoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSolicitudReemplazo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSolicitudReemplazo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSolicitudReemplazo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.solicitudreemplazo)) {
			if(!esControlTabla) {
				if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);			
				}
				
				if(this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.solicitudreemplazoReturnGeneral=solicitudreemplazoLogic.procesarEventosSolicitudReemplazosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudreemplazoLogic.getSolicitudReemplazos(),this.solicitudreemplazo,this.solicitudreemplazoParameterGeneral,this.isEsNuevoSolicitudReemplazo,classes);//this.solicitudreemplazoLogic.getSolicitudReemplazo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSolicitudReemplazo(this.solicitudreemplazoReturnGeneral,this.solicitudreemplazoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSolicitudReemplazo(classes,this.solicitudreemplazoReturnGeneral,this.solicitudreemplazoBean,false);
					}
						
					if(this.solicitudreemplazoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySolicitudReemplazo(this.solicitudreemplazoReturnGeneral.getSolicitudReemplazo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSolicitudReemplazo(this.solicitudreemplazoReturnGeneral.getSolicitudReemplazo());	
					}
						
					if(this.solicitudreemplazoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSolicitudReemplazo(this.solicitudreemplazoReturnGeneral.getSolicitudReemplazo(),classes);//this.solicitudreemplazoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSolicitudReemplazo(this.solicitudreemplazo,classes);//this.solicitudreemplazoBean);									
				}
			
				if(SolicitudReemplazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSolicitudReemplazo(this.solicitudreemplazo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSolicitudReemplazo(this.solicitudreemplazo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.solicitudreemplazoAnterior!=null) {
						this.solicitudreemplazo=this.solicitudreemplazoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.solicitudreemplazoReturnGeneral=solicitudreemplazoLogic.procesarEventosSolicitudReemplazosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudreemplazoLogic.getSolicitudReemplazos(),this.solicitudreemplazo,this.solicitudreemplazoParameterGeneral,this.isEsNuevoSolicitudReemplazo,classes);//this.solicitudreemplazoLogic.getSolicitudReemplazo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.solicitudreemplazoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.solicitudreemplazoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.solicitudreemplazoReturnGeneral.getSolicitudReemplazo(),solicitudreemplazoLogic.getSolicitudReemplazos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.solicitudreemplazoReturnGeneral.getSolicitudReemplazo(),this.solicitudreemplazos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSolicitudReemplazo.repaint();
				
				//((AbstractTableModel) this.jTableDatosSolicitudReemplazo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSolicitudReemplazo();
			}
		}
	}
	
	public void actualizarVisualTableDatosSolicitudReemplazo() throws Exception {
		
		SolicitudReemplazoModel solicitudreemplazoModel=(SolicitudReemplazoModel)this.jTableDatosSolicitudReemplazo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			solicitudreemplazoModel.solicitudreemplazos=this.solicitudreemplazoLogic.getSolicitudReemplazos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			solicitudreemplazoModel.solicitudreemplazos=this.solicitudreemplazos;
		}
		
		
		((SolicitudReemplazoModel) this.jTableDatosSolicitudReemplazo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSolicitudReemplazo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsolicitudreemplazoAnterior(),this.solicitudreemplazoLogic.getSolicitudReemplazos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsolicitudreemplazoAnterior(),this.solicitudreemplazos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSolicitudReemplazo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
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
										
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudreemplazo,new Object(),generalEntityParameterGeneral,this.solicitudreemplazoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SolicitudReemplazoConstantesFunciones.getClassesRelationshipsOfSolicitudReemplazo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SolicitudReemplazoConstantesFunciones.getClassesRelationshipsFromStringsOfSolicitudReemplazo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSolicitudReemplazo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SolicitudReemplazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.solicitudreemplazo,new Object(),generalEntityParameterGeneral,this.solicitudreemplazoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSolicitudReemplazo(SolicitudReemplazoBean solicitudreemplazoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSolicitudReemplazo(ArrayList<Classe> classes,SolicitudReemplazoReturnGeneral solicitudreemplazoReturnGeneral,SolicitudReemplazoBean solicitudreemplazoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.solicitudreemplazo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSolicitudReemplazo = new SolicitudReemplazoDetalleFormJInternalFrame(jDesktopPane,this.solicitudreemplazoSessionBean.getConGuardarRelaciones(),this.solicitudreemplazoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.setVisible(false);
		this.jInternalFrameDetalleFormSolicitudReemplazo.setSelected(false);						
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.solicitudreemplazoLogic=this.solicitudreemplazoLogic;
		
		this.cargarCombosFrameForeignKeySolicitudReemplazo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSolicitudReemplazo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSolicitudReemplazo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySolicitudReemplazo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySolicitudReemplazo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSolicitudReemplazo"));
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonModificarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"ModificarSolicitudReemplazo"));

		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonModificarToolBarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"ModificarToolBarSolicitudReemplazo"));
					
		this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemModificarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"MenuItemModificarSolicitudReemplazo"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonActualizarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"ActualizarSolicitudReemplazo"));
		
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonActualizarToolBarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSolicitudReemplazo"));
						
		this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemActualizarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSolicitudReemplazo"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonEliminarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"EliminarSolicitudReemplazo"));
		
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonEliminarToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"EliminarToolBarSolicitudReemplazo"));
								
		this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemEliminarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSolicitudReemplazo"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonCancelarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"CancelarSolicitudReemplazo"));
		
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonCancelarToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"CancelarToolBarSolicitudReemplazo"));
					
		this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemCancelarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSolicitudReemplazo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemDetalleCerrarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSolicitudReemplazo"));		
		
		
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSolicitudReemplazo"));
		
		
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSolicitudReemplazo"));
		
		
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSolicitudReemplazo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonidSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"idSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empresaSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empresaSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_sucursalSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_sucursalSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_jefeSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_jefeSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleadoSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleadoSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_reemplazoSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estructuraSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estructuraSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonsecuencialSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonfecha_solicitaSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_solicitaSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonfecha_ejecutaSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ejecutaSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonnumero_horasSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtoncosto_unitarioSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtoncosto_totalSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtondescripcionSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSolicitudReemplazoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSolicitudReemplazo.jTabbedPaneRelacionesSolicitudReemplazo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSolicitudReemplazo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSolicitudReemplazo"));
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSolicitudReemplazo"));
		}
		
		this.jTableDatosSolicitudReemplazo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSolicitudReemplazo"));
		
		this.jTableDatosSolicitudReemplazo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSolicitudReemplazo"));
		
		this.jButtonNuevoSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"NuevoSolicitudReemplazo"));
		
		this.jButtonDuplicarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"DuplicarSolicitudReemplazo"));
		
		this.jButtonCopiarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"CopiarSolicitudReemplazo"));
		
		this.jButtonVerFormSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"VerFormSolicitudReemplazo"));
		
		
		this.jButtonNuevoToolBarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"NuevoToolBarSolicitudReemplazo"));
			
		this.jButtonDuplicarToolBarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSolicitudReemplazo"));
			
		this.jMenuItemNuevoSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSolicitudReemplazo"));
			
		this.jMenuItemDuplicarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSolicitudReemplazo"));		
		
		
		this.jButtonNuevoRelacionesSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSolicitudReemplazo"));
		
		
		this.jButtonNuevoRelacionesToolBarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSolicitudReemplazo"));
			
		this.jMenuItemNuevoRelacionesSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSolicitudReemplazo"));		
		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonModificarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"ModificarSolicitudReemplazo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonModificarToolBarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"ModificarToolBarSolicitudReemplazo"));
			
			this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemModificarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"MenuItemModificarSolicitudReemplazo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonActualizarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"ActualizarSolicitudReemplazo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonActualizarToolBarSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSolicitudReemplazo"));
				
			this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemActualizarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSolicitudReemplazo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonEliminarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"EliminarSolicitudReemplazo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonEliminarToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"EliminarToolBarSolicitudReemplazo"));
						
			this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemEliminarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSolicitudReemplazo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonCancelarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"CancelarSolicitudReemplazo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonCancelarToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"CancelarToolBarSolicitudReemplazo"));
			
			this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemCancelarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSolicitudReemplazo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSolicitudReemplazo"));		
		
		
		this.jButtonCerrarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"CerrarSolicitudReemplazo"));
		
		
		this.jButtonCerrarToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"CerrarToolBarSolicitudReemplazo"));
			
		this.jMenuItemCerrarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSolicitudReemplazo"));
			
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jMenuItemDetalleCerrarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSolicitudReemplazo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosSolicitudReemplazo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSolicitudReemplazo"));
		}
		
		this.jButtonCopiarToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"CopiarToolBarSolicitudReemplazo"));
			
		this.jButtonVerFormToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"VerFormToolBarSolicitudReemplazo"));
		
		this.jMenuItemGuardarCambiosSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSolicitudReemplazo"));
			
		this.jMenuItemCopiarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSolicitudReemplazo"));		
		
		this.jMenuItemVerFormSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSolicitudReemplazo"));		
		
		
		this.jButtonGuardarCambiosTablaSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSolicitudReemplazo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSolicitudReemplazo"));
			
		this.jMenuItemGuardarCambiosTablaSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSolicitudReemplazo"));		
		
		
		
		this.jButtonRecargarInformacionSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"RecargarInformacionSolicitudReemplazo"));
					
		this.jButtonRecargarInformacionToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSolicitudReemplazo"));
		
		this.jMenuItemRecargarInformacionSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSolicitudReemplazo"));		
		
		
		
		this.jButtonAnterioresSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"AnterioresSolicitudReemplazo"));
		
		
		this.jButtonAnterioresToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSolicitudReemplazo"));
		
		this.jMenuItemAnterioresSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSolicitudReemplazo"));		
		
		
		this.jButtonSiguientesSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"SiguientesSolicitudReemplazo"));
		
		
		this.jButtonSiguientesToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSolicitudReemplazo"));
			
		this.jMenuItemSiguientesSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSolicitudReemplazo"));
			
		this.jMenuItemAbrirOrderBySolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySolicitudReemplazo"));
			
		this.jMenuItemMostrarOcultarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSolicitudReemplazo"));
			
		this.jMenuItemDetalleAbrirOrderBySolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySolicitudReemplazo"));
			
		this.jMenuItemDetalleMostarOcultarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSolicitudReemplazo"));		
		
		
		this.jButtonNuevoGuardarCambiosSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSolicitudReemplazo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSolicitudReemplazo"));
			
		this.jMenuItemNuevoGuardarCambiosSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSolicitudReemplazo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSolicitudReemplazo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSolicitudReemplazo"));

		this.jCheckBoxSeleccionadosSolicitudReemplazo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSolicitudReemplazo"));
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSolicitudReemplazo"));
		}
		
		
		this.jComboBoxTiposRelacionesSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"TiposRelacionesSolicitudReemplazo"));
			
		this.jComboBoxTiposAccionesSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"TiposAccionesSolicitudReemplazo"));
					
		this.jComboBoxTiposSeleccionarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSolicitudReemplazo"));
			
		this.jTextFieldValorCampoGeneralSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSolicitudReemplazo"));		
		
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonidSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"idSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empresaSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empresaSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_sucursalSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_sucursalSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_jefeSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_jefeSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleadoSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleadoSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_reemplazoSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estructuraSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estructuraSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonsecuencialSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonfecha_solicitaSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_solicitaSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonfecha_ejecutaSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ejecutaSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonnumero_horasSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtoncosto_unitarioSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtoncosto_totalSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtondescripcionSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSolicitudReemplazoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoSolicitudReemplazo"));

			this.jButtonFK_IdEmpleadoJefeSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoJefeSolicitudReemplazo"));

			this.jButtonFK_IdEmpleadoReemplazoSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoReemplazoSolicitudReemplazo"));

			this.jButtonFK_IdEstadoSolicitudNomiSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"FK_IdEstadoSolicitudNomiSolicitudReemplazo"));

			this.jButtonFK_IdEstructuraSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraSolicitudReemplazo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSolicitudReemplazo!=null) {
				this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSolicitudReemplazo"));
				this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSolicitudReemplazo"));
				this.jInternalFrameReporteDinamicoSolicitudReemplazo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSolicitudReemplazo"));
			}
			
			//this.jButtonCerrarReporteDinamicoSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSolicitudReemplazo"));				
			//this.jButtonGenerarReporteDinamicoSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSolicitudReemplazo"));
			//this.jButtonGenerarExcelReporteDinamicoSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSolicitudReemplazo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSolicitudReemplazo!=null) {
				this.jInternalFrameImportacionSolicitudReemplazo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSolicitudReemplazo"));
				this.jInternalFrameImportacionSolicitudReemplazo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSolicitudReemplazo"));
				this.jInternalFrameImportacionSolicitudReemplazo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSolicitudReemplazo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySolicitudReemplazo.addActionListener (new ButtonActionListener(this,"AbrirOrderBySolicitudReemplazo"));
			
			this.jButtonAbrirOrderByToolBarSolicitudReemplazo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSolicitudReemplazo"));			
			
			if(this.jInternalFrameOrderBySolicitudReemplazo!=null) {
				this.jInternalFrameOrderBySolicitudReemplazo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySolicitudReemplazo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSolicitudReemplazo.jTabbedPaneRelacionesSolicitudReemplazo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSolicitudReemplazo"));
		
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
            		closingInternalFrameSolicitudReemplazo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSolicitudReemplazo = (JInternalFrameBase)event.getSource();
	            	
	            SolicitudReemplazoBeanSwingJInternalFrame jInternalFrameParent=(SolicitudReemplazoBeanSwingJInternalFrame)jInternalFrameDetalleFormSolicitudReemplazo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSolicitudReemplazoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSolicitudReemplazo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSolicitudReemplazoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSolicitudReemplazo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSolicitudReemplazo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudReemplazoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudReemplazoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudReemplazoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSolicitudReemplazo";
		inputMap = this.jButtonNuevoSolicitudReemplazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSolicitudReemplazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSolicitudReemplazoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudReemplazoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudReemplazoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSolicitudReemplazoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSolicitudReemplazo";
		inputMap = this.jButtonNuevoRelacionesSolicitudReemplazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSolicitudReemplazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSolicitudReemplazoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSolicitudReemplazo";
		inputMap = this.jButtonModificarSolicitudReemplazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSolicitudReemplazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSolicitudReemplazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSolicitudReemplazo";
		inputMap = this.jButtonActualizarSolicitudReemplazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSolicitudReemplazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSolicitudReemplazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSolicitudReemplazo";
		inputMap = this.jButtonEliminarSolicitudReemplazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSolicitudReemplazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSolicitudReemplazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSolicitudReemplazo";
		inputMap = this.jButtonCancelarSolicitudReemplazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSolicitudReemplazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSolicitudReemplazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSolicitudReemplazo";
		inputMap = this.jButtonCerrarSolicitudReemplazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSolicitudReemplazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSolicitudReemplazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSolicitudReemplazo";
		inputMap = this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosSolicitudReemplazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonGuardarCambiosSolicitudReemplazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSolicitudReemplazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSolicitudReemplazo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSolicitudReemplazoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSolicitudReemplazo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSolicitudReemplazoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSolicitudReemplazo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSolicitudReemplazoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSolicitudReemplazo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSolicitudReemplazoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonidSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"idSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empresaSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empresaSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_sucursalSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_sucursalSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_jefeSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_jefeSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_jefeSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleadoSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleadoSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_reemplazoSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_empleado_reemplazoSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_reemplazoSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estructuraSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estructuraSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraSolicitudReemplazoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estado_solicitud_nomiSolicitudReemplazoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudReemplazoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonid_estado_solicitud_nomiSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_solicitud_nomiSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonsecuencialSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonfecha_solicitaSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_solicitaSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonfecha_ejecutaSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ejecutaSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtonnumero_horasSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtoncosto_unitarioSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtoncosto_totalSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalSolicitudReemplazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSolicitudReemplazo.jButtondescripcionSolicitudReemplazoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSolicitudReemplazoBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoSolicitudReemplazo"));

		this.jButtonFK_IdEmpleadoJefeSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoJefeSolicitudReemplazo"));

		this.jButtonFK_IdEmpleadoReemplazoSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoReemplazoSolicitudReemplazo"));

		this.jButtonFK_IdEstadoSolicitudNomiSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"FK_IdEstadoSolicitudNomiSolicitudReemplazo"));

		this.jButtonFK_IdEstructuraSolicitudReemplazo.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraSolicitudReemplazo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSolicitudReemplazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSolicitudReemplazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSolicitudReemplazoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSolicitudReemplazo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSolicitudReemplazo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazoLogic.getSolicitudReemplazos()) {
					solicitudreemplazoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazos) {
					solicitudreemplazoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSolicitudReemplazoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazoLogic.getSolicitudReemplazos()) {
						solicitudreemplazoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazos) {
						solicitudreemplazoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazoLogic.getSolicitudReemplazos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSolicitudReemplazo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSolicitudReemplazo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSolicitudReemplazoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSolicitudReemplazo.getSelectedRows();
			
			SolicitudReemplazo solicitudreemplazoLocal=new SolicitudReemplazo();
			
			//this.seleccionarTodosSolicitudReemplazo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					solicitudreemplazoLocal =(SolicitudReemplazo) this.solicitudreemplazoLogic.getSolicitudReemplazos().toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					solicitudreemplazoLocal =(SolicitudReemplazo) this.solicitudreemplazos.toArray()[this.jTableDatosSolicitudReemplazo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				solicitudreemplazoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazoLogic.getSolicitudReemplazos()) {
						solicitudreemplazoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazos) {
						solicitudreemplazoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSolicitudReemplazo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSolicitudReemplazo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSolicitudReemplazo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSolicitudReemplazoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSolicitudReemplazoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSolicitudReemplazoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSolicitudReemplazo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazoLogic.getSolicitudReemplazos()) {
				
						if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							solicitudreemplazoAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA)) {
							existe=true;
							solicitudreemplazoAux.setfecha_solicita(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA)) {
							existe=true;
							solicitudreemplazoAux.setfecha_ejecuta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS)) {
							existe=true;
							solicitudreemplazoAux.setnumero_horas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							solicitudreemplazoAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							solicitudreemplazoAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							solicitudreemplazoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazos) {
					
						if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							solicitudreemplazoAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA)) {
							existe=true;
							solicitudreemplazoAux.setfecha_solicita(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA)) {
							existe=true;
							solicitudreemplazoAux.setfecha_ejecuta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS)) {
							existe=true;
							solicitudreemplazoAux.setnumero_horas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							solicitudreemplazoAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							solicitudreemplazoAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							solicitudreemplazoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSolicitudReemplazoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSolicitudReemplazo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSolicitudReemplazo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSolicitudReemplazo) {				
					conSplash=true;//false;										
					
					//this.startProcessSolicitudReemplazo(conSplash);
				
					this.generarReporteSolicitudReemplazosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudReemplazo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSolicitudReemplazosSeleccionados();
				//this.jComboBoxTiposAccionesSolicitudReemplazo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSolicitudReemplazosSeleccionados(false);
				//this.jComboBoxTiposAccionesSolicitudReemplazo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSolicitudReemplazosSeleccionados(true);
				//this.jComboBoxTiposAccionesSolicitudReemplazo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSolicitudReemplazo();
				
				this.exportarSolicitudReemplazosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudReemplazo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSolicitudReemplazos();
				//this.importarSolicitudReemplazos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudReemplazo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSolicitudReemplazo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSolicitudReemplazosSeleccionados();
				//this.jComboBoxTiposAccionesSolicitudReemplazo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Solicitud Reemplazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSolicitudReemplazo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSolicitudReemplazo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySolicitudReemplazo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Solicitud Reemplazo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSolicitudReemplazo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setSelectedIndex(0);					
				}	
			} 			
			else if(SolicitudReemplazoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSolicitudReemplazo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSolicitudReemplazo(conSplash);
					
						//this.actualizarParametrosGeneralSolicitudReemplazo();
						
						this.generarReporteProcesoAccionSolicitudReemplazosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSolicitudReemplazo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SolicitudReemplazoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Solicitud ReemplazoS SELECCIONADOS?", "MANTENIMIENTO DE Solicitud Reemplazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSolicitudReemplazo();
				
						this.actualizarParametrosGeneralSolicitudReemplazo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.solicitudreemplazoReturnGeneral=solicitudreemplazoLogic.procesarAccionSolicitudReemplazosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.solicitudreemplazoLogic.getSolicitudReemplazos(),this.solicitudreemplazoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSolicitudReemplazoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSolicitudReemplazo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSolicitudReemplazo();
					
					SolicitudReemplazoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSolicitudReemplazoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSolicitudReemplazo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxTiposAccionesFormularioSolicitudReemplazo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSolicitudReemplazo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSolicitudReemplazoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSolicitudReemplazo();
			
			if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();		
			SolicitudReemplazo solicitudreemplazo=new SolicitudReemplazo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSolicitudReemplazo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSolicitudReemplazo.getSelectedItem();
			
			
			
			
			solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(true);
			//this.sTipoAccion;
			
			if(solicitudreemplazosSeleccionados.size()==1) {
				for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazosSeleccionados) {
					solicitudreemplazo=solicitudreemplazoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSolicitudReemplazo();
			
      		//this.finishProcessSolicitudReemplazo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSolicitudReemplazoReturnGeneral() throws Exception {
		if(this.solicitudreemplazoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.solicitudreemplazoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.solicitudreemplazoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.solicitudreemplazoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.solicitudreemplazoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.solicitudreemplazoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSolicitudReemplazo(false);
		}
		
		if(this.solicitudreemplazoReturnGeneral.getConRetornoLista() || this.solicitudreemplazoReturnGeneral.getConRetornoObjeto()) {
			if(this.solicitudreemplazoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.solicitudreemplazoLogic.setSolicitudReemplazos(this.solicitudreemplazoReturnGeneral.getSolicitudReemplazos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.solicitudreemplazoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.solicitudreemplazoLogic.setSolicitudReemplazo(this.solicitudreemplazoReturnGeneral.getSolicitudReemplazo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSolicitudReemplazo(false);
		}
	}
	
	public void actualizarParametrosGeneralSolicitudReemplazo() throws Exception {
		
		
	}
	
	public ArrayList<SolicitudReemplazo> getSolicitudReemplazosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSolicitudReemplazo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazoLogic.getSolicitudReemplazos()) {
					if(solicitudreemplazoAux.getIsSelected()) {
						solicitudreemplazosSeleccionados.add(solicitudreemplazoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SolicitudReemplazo solicitudreemplazoAux:this.solicitudreemplazos) {
					if(solicitudreemplazoAux.getIsSelected()) {
						solicitudreemplazosSeleccionados.add(solicitudreemplazoAux);				
					}
				}
			}
			
			if(solicitudreemplazosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						solicitudreemplazosSeleccionados.addAll(this.solicitudreemplazoLogic.getSolicitudReemplazos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						solicitudreemplazosSeleccionados.addAll(this.solicitudreemplazos);				
					}
				}
			}
		} else {
			solicitudreemplazosSeleccionados.add(this.solicitudreemplazo);
		}
		
		return solicitudreemplazosSeleccionados;
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
	
	public void generarReporteSolicitudReemplazosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSolicitudReemplazosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSolicitudReemplazosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSolicitudReemplazosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSolicitudReemplazosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Solicitud Reemplazo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSolicitudReemplazosSeleccionados() throws Exception {
		ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();		
		
		solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSolicitudReemplazos("Todos",solicitudreemplazosSeleccionados);
		
	}	
	
	public void generarReporteNormalSolicitudReemplazosSeleccionados() throws Exception {
		ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();		
		
		solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSolicitudReemplazos("Todos",solicitudreemplazosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSolicitudReemplazosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();
		
		solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSolicitudReemplazos("Todos",solicitudreemplazosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSolicitudReemplazosSeleccionados() throws Exception {
		ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSolicitudReemplazo();
		
		
		solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSolicitudReemplazo();
		
		
		//this.generarReporteSolicitudReemplazos("Todos",solicitudreemplazosSeleccionados ,solicitudreemplazoImplementable,solicitudreemplazoImplementableHome);
	}
	
	public void mostrarImportacionSolicitudReemplazos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSolicitudReemplazo();
		
		this.abrirFrameImportacionSolicitudReemplazo();		
		
			
		//this.generarReporteSolicitudReemplazos("Todos",solicitudreemplazosSeleccionados ,solicitudreemplazoImplementable,solicitudreemplazoImplementableHome);
	}
	
	public void importarSolicitudReemplazos() throws Exception {		
	
	}
	
	public void exportarSolicitudReemplazosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSolicitudReemplazosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSolicitudReemplazosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSolicitudReemplazosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Solicitud Reemplazo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSolicitudReemplazosSeleccionados() throws Exception {
		ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();		
		
		solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudreemplazo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSolicitudReemplazo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSolicitudReemplazo(solicitudreemplazoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//solicitudreemplazoAux.setsDetalleGeneralEntityReporte(solicitudreemplazoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Reemplazo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSolicitudReemplazo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=solicitudreemplazo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getempleadojefe_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getempleadoreemplazo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getestadosolicitudnomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getfecha_solicita().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getfecha_ejecuta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getnumero_horas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getcosto_unitario().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=solicitudreemplazo.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSolicitudReemplazosSeleccionados() throws Exception {
		ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();		
		
		solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudreemplazo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SolicitudReemplazos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSolicitudReemplazo(row);				
				iRow++;
			}				
			
			for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSolicitudReemplazo(solicitudreemplazoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Reemplazo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSolicitudReemplazosSeleccionados() throws Exception {
		ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();		
		
		solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"solicitudreemplazo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("solicitudreemplazos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("solicitudreemplazo");
			//elementRoot.appendChild(element);
		
			for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazosSeleccionados) {
				element = document.createElement("solicitudreemplazo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSolicitudReemplazo(solicitudreemplazoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Solicitud Reemplazo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSolicitudReemplazo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_COSTOUNITARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getempleadojefe_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getempleadoreemplazo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getestadosolicitudnomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getfecha_solicita());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getfecha_ejecuta());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getnumero_horas());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getcosto_unitario());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(solicitudreemplazo.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlSolicitudReemplazo(SolicitudReemplazo solicitudreemplazo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SolicitudReemplazoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(solicitudreemplazo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SolicitudReemplazoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(solicitudreemplazo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SolicitudReemplazoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(solicitudreemplazo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(SolicitudReemplazoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(solicitudreemplazo.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementempleadojefe_descripcion = document.createElement(SolicitudReemplazoConstantesFunciones.IDEMPLEADOJEFE);
		elementempleadojefe_descripcion.appendChild(document.createTextNode(solicitudreemplazo.getempleadojefe_descripcion()));
		element.appendChild(elementempleadojefe_descripcion);

		Element elementempleado_descripcion = document.createElement(SolicitudReemplazoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(solicitudreemplazo.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementempleadoreemplazo_descripcion = document.createElement(SolicitudReemplazoConstantesFunciones.IDEMPLEADOREEMPLAZO);
		elementempleadoreemplazo_descripcion.appendChild(document.createTextNode(solicitudreemplazo.getempleadoreemplazo_descripcion()));
		element.appendChild(elementempleadoreemplazo_descripcion);

		Element elementestructura_descripcion = document.createElement(SolicitudReemplazoConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(solicitudreemplazo.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementestadosolicitudnomi_descripcion = document.createElement(SolicitudReemplazoConstantesFunciones.IDESTADOSOLICITUDNOMI);
		elementestadosolicitudnomi_descripcion.appendChild(document.createTextNode(solicitudreemplazo.getestadosolicitudnomi_descripcion()));
		element.appendChild(elementestadosolicitudnomi_descripcion);

		Element elementsecuencial = document.createElement(SolicitudReemplazoConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(solicitudreemplazo.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha_solicita = document.createElement(SolicitudReemplazoConstantesFunciones.FECHASOLICITA);
		elementfecha_solicita.appendChild(document.createTextNode(solicitudreemplazo.getfecha_solicita().toString().trim()));
		element.appendChild(elementfecha_solicita);

		Element elementfecha_ejecuta = document.createElement(SolicitudReemplazoConstantesFunciones.FECHAEJECUTA);
		elementfecha_ejecuta.appendChild(document.createTextNode(solicitudreemplazo.getfecha_ejecuta().toString().trim()));
		element.appendChild(elementfecha_ejecuta);

		Element elementnumero_horas = document.createElement(SolicitudReemplazoConstantesFunciones.NUMEROHORAS);
		elementnumero_horas.appendChild(document.createTextNode(solicitudreemplazo.getnumero_horas().toString().trim()));
		element.appendChild(elementnumero_horas);

		Element elementcosto_unitario = document.createElement(SolicitudReemplazoConstantesFunciones.COSTOUNITARIO);
		elementcosto_unitario.appendChild(document.createTextNode(solicitudreemplazo.getcosto_unitario().toString().trim()));
		element.appendChild(elementcosto_unitario);

		Element elementcosto_total = document.createElement(SolicitudReemplazoConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(solicitudreemplazo.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(SolicitudReemplazoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(solicitudreemplazo.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoSolicitudReemplazosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados=new ArrayList<SolicitudReemplazo>();
		
		solicitudreemplazosSeleccionados=this.getSolicitudReemplazosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSolicitudReemplazo(solicitudreemplazosSeleccionados);
		
		this.generarReporteSolicitudReemplazos("Todos",solicitudreemplazosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSolicitudReemplazo(ArrayList<SolicitudReemplazo> solicitudreemplazosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SolicitudReemplazo solicitudreemplazoAux:solicitudreemplazosSeleccionados) {
				solicitudreemplazoAux.setsDetalleGeneralEntityReporte(solicitudreemplazoAux.toString());
			
				if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(solicitudreemplazoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(solicitudreemplazoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOJEFE)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(solicitudreemplazoAux.getempleadojefe_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(solicitudreemplazoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_IDEMPLEADOREEMPLAZO)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(solicitudreemplazoAux.getempleadoreemplazo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(solicitudreemplazoAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_IDESTADOSOLICITUDNOMI)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(solicitudreemplazoAux.getestadosolicitudnomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(solicitudreemplazoAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_FECHASOLICITA)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(solicitudreemplazoAux.getfecha_solicita()));
				}
				 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_FECHAEJECUTA)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(solicitudreemplazoAux.getfecha_ejecuta()));
				}
				 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_NUMEROHORAS)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(solicitudreemplazoAux.getnumero_horas().toString());
				}
				 else if(sTipoSeleccionar.equals(SolicitudReemplazoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					solicitudreemplazoAux.setsDescripcionGeneralEntityReporte1(solicitudreemplazoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SolicitudReemplazoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSolicitudReemplazo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSolicitudReemplazo=true;
				this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=true;
				this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=true;
			}
			
			this.isVisibilidadCeldaModificarSolicitudReemplazo=false;
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=false;
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=false;
			this.isVisibilidadCeldaCancelarSolicitudReemplazo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=false;
			this.isVisibilidadCeldaModificarSolicitudReemplazo=false;
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=true;
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=false;
			this.isVisibilidadCeldaCancelarSolicitudReemplazo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=false;
			this.isVisibilidadCeldaModificarSolicitudReemplazo=false;
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=true;
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=true;
			this.isVisibilidadCeldaCancelarSolicitudReemplazo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=false;
			this.isVisibilidadCeldaModificarSolicitudReemplazo=false;
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=true;
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=false;
			this.isVisibilidadCeldaCancelarSolicitudReemplazo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=false;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=true;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=true;
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=true;
			this.isVisibilidadCeldaModificarSolicitudReemplazo=false;
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=false;
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=false;
			this.isVisibilidadCeldaCancelarSolicitudReemplazo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=true;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=false;
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=false;
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=false;
			this.isVisibilidadCeldaCancelarSolicitudReemplazo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=false;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=false;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=false;
			this.isVisibilidadCeldaModificarSolicitudReemplazo=true;
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=false;
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=false;
			this.isVisibilidadCeldaCancelarSolicitudReemplazo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=false;
				} else {
					this.isVisibilidadCeldaGuardarSolicitudReemplazo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SolicitudReemplazoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=true;
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=true;
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=true;
		} else {
			this.actualizarEstadoPanelsSolicitudReemplazo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSolicitudReemplazo=false;
			//this.isVisibilidadCeldaVerFormSolicitudReemplazo=false;
			this.isVisibilidadCeldaDuplicarSolicitudReemplazo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!solicitudreemplazoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=false;
		} else {
			this.isVisibilidadCeldaNuevoSolicitudReemplazo=false;
			this.isVisibilidadCeldaGuardarCambiosSolicitudReemplazo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
			if(!solicitudreemplazoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=false;												
			}
			
			this.jButtonCerrarSolicitudReemplazo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSolicitudReemplazo=false;
		}
		
		if(!this.permiteMantenimiento(this.solicitudreemplazo)) {
			this.isVisibilidadCeldaActualizarSolicitudReemplazo=false;
			this.isVisibilidadCeldaEliminarSolicitudReemplazo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSolicitudReemplazo() {
	}
	
	public void actualizarEstadoPanelsSolicitudReemplazo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSolicitudReemplazo!=null) {
				this.jScrollPanelDatosEdicionSolicitudReemplazo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudReemplazo!=null) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudReemplazo!=null) {
				this.jScrollPanelDatosSolicitudReemplazo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudReemplazo!=null) {
				this.jPanelPaginacionSolicitudReemplazo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudReemplazo!=null) {
				this.jPanelParametrosReportesSolicitudReemplazo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSolicitudReemplazo!=null) {
				this.jScrollPanelDatosEdicionSolicitudReemplazo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudReemplazo!=null) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSolicitudReemplazo!=null) {
				this.jScrollPanelDatosSolicitudReemplazo.setVisible(false);
			}
			
			if(this.jPanelPaginacionSolicitudReemplazo!=null) {
				this.jPanelPaginacionSolicitudReemplazo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSolicitudReemplazo!=null) {
				this.jPanelParametrosReportesSolicitudReemplazo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSolicitudReemplazo!=null) {
				this.jScrollPanelDatosEdicionSolicitudReemplazo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudReemplazo!=null) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudReemplazo!=null) {
				this.jScrollPanelDatosSolicitudReemplazo.setVisible(false);
			}
			
			if(this.jPanelPaginacionSolicitudReemplazo!=null) {
				this.jPanelPaginacionSolicitudReemplazo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSolicitudReemplazo!=null) {
				this.jPanelParametrosReportesSolicitudReemplazo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSolicitudReemplazo!=null) {
				this.jScrollPanelDatosEdicionSolicitudReemplazo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudReemplazo!=null) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudReemplazo!=null) {
				this.jScrollPanelDatosSolicitudReemplazo.setVisible(false);
			}
			
			if(this.jPanelPaginacionSolicitudReemplazo!=null) {
				this.jPanelPaginacionSolicitudReemplazo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSolicitudReemplazo!=null) {
				this.jPanelParametrosReportesSolicitudReemplazo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSolicitudReemplazo!=null) {
				this.jScrollPanelDatosEdicionSolicitudReemplazo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudReemplazo!=null) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudReemplazo!=null) {
				this.jScrollPanelDatosSolicitudReemplazo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudReemplazo!=null) {
				this.jPanelPaginacionSolicitudReemplazo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudReemplazo!=null) {
				this.jPanelParametrosReportesSolicitudReemplazo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSolicitudReemplazo!=null) {
				this.jScrollPanelDatosEdicionSolicitudReemplazo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudReemplazo!=null) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudReemplazo!=null) {
				this.jScrollPanelDatosSolicitudReemplazo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudReemplazo!=null) {
				this.jPanelPaginacionSolicitudReemplazo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudReemplazo!=null) {
				this.jPanelParametrosReportesSolicitudReemplazo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSolicitudReemplazo!=null) {
				this.jScrollPanelDatosEdicionSolicitudReemplazo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudReemplazo!=null) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSolicitudReemplazo!=null) {
				this.jScrollPanelDatosSolicitudReemplazo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSolicitudReemplazo!=null) {
				this.jPanelPaginacionSolicitudReemplazo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSolicitudReemplazo!=null) {
				this.jPanelParametrosReportesSolicitudReemplazo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSolicitudReemplazo!=null) {
					this.jTabbedPaneBusquedasSolicitudReemplazo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSolicitudReemplazo!=null) {
				this.jPanelParametrosReportesSolicitudReemplazo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSolicitudReemplazo!=null) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSolicitudReemplazo!=null) {
				this.jPanelParametrosReportesSolicitudReemplazo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoJefeSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstructuraSolicitudReemplazo);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoJefeSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstructuraSolicitudReemplazo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleadoJefe(Boolean isParaEmpleadoJefe){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoJefeNegation=!isParaEmpleadoJefe;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEmpleadoJefe;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoJefeSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoJefeNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstructuraSolicitudReemplazo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoJefeSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstructuraSolicitudReemplazo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleadoReemplazo(Boolean isParaEmpleadoReemplazo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoReemplazoNegation=!isParaEmpleadoReemplazo;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleadoReemplazoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEmpleadoReemplazoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoJefeSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEmpleadoReemplazo;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEmpleadoReemplazoNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoReemplazoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstructuraSolicitudReemplazo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoJefeSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstructuraSolicitudReemplazo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoSolicitudNomi(Boolean isParaEstadoSolicitudNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoSolicitudNomiNegation=!isParaEstadoSolicitudNomi;

			this.isVisibilidadFK_IdEmpleado=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoJefe=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleadoJefe) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoJefeSolicitudReemplazo);}

			this.isVisibilidadFK_IdEmpleadoReemplazo=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleadoReemplazo) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstadoSolicitudNomi=isParaEstadoSolicitudNomi;
			if(!this.isVisibilidadFK_IdEstadoSolicitudNomi) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);}

			this.isVisibilidadFK_IdEstructura=isParaEstadoSolicitudNomiNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasSolicitudReemplazo.remove(jPanelFK_IdEstructuraSolicitudReemplazo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SolicitudReemplazoSessionBean solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
		
		if(this.solicitudreemplazoSessionBean==null) {
			this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
		}
		
		this.solicitudreemplazoSessionBean.setsUltimaBusquedaSolicitudReemplazo(this.getsAccionBusqueda());
		this.solicitudreemplazoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.solicitudreemplazoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			solicitudreemplazoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoJefe")) {
			solicitudreemplazoSessionBean.setid_empleado_jefe(this.getid_empleado_jefeFK_IdEmpleadoJefe());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoReemplazo")) {
			solicitudreemplazoSessionBean.setid_empleado_reemplazo(this.getid_empleado_reemplazoFK_IdEmpleadoReemplazo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			solicitudreemplazoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoSolicitudNomi")) {
			solicitudreemplazoSessionBean.setid_estado_solicitud_nomi(this.getid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			solicitudreemplazoSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			solicitudreemplazoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SolicitudReemplazoSessionBean solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
		
		if(this.solicitudreemplazoSessionBean==null) {
			this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
		}
		
		if(this.solicitudreemplazoSessionBean.getsUltimaBusquedaSolicitudReemplazo()!=null&&!this.solicitudreemplazoSessionBean.getsUltimaBusquedaSolicitudReemplazo().equals("")) {
			this.setsAccionBusqueda(solicitudreemplazoSessionBean.getsUltimaBusquedaSolicitudReemplazo());
			this.setiNumeroPaginacion(solicitudreemplazoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(solicitudreemplazoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(solicitudreemplazoSessionBean.getid_empleado());
				solicitudreemplazoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoJefe")) {
				this.setid_empleado_jefeFK_IdEmpleadoJefe(solicitudreemplazoSessionBean.getid_empleado_jefe());
				solicitudreemplazoSessionBean.setid_empleado_jefe(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoReemplazo")) {
				this.setid_empleado_reemplazoFK_IdEmpleadoReemplazo(solicitudreemplazoSessionBean.getid_empleado_reemplazo());
				solicitudreemplazoSessionBean.setid_empleado_reemplazo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(solicitudreemplazoSessionBean.getid_empresa());
				solicitudreemplazoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoSolicitudNomi")) {
				this.setid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi(solicitudreemplazoSessionBean.getid_estado_solicitud_nomi());
				solicitudreemplazoSessionBean.setid_estado_solicitud_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(solicitudreemplazoSessionBean.getid_estructura());
				solicitudreemplazoSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(solicitudreemplazoSessionBean.getid_sucursal());
				solicitudreemplazoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.solicitudreemplazoSessionBean.setsUltimaBusquedaSolicitudReemplazo("");
		this.solicitudreemplazoSessionBean.setiNumeroPaginacion(SolicitudReemplazoConstantesFunciones.INUMEROPAGINACION);
		this.solicitudreemplazoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSolicitudReemplazo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSolicitudReemplazo() {
		this.updateBorderResaltarBusquedasFormularioSolicitudReemplazo();
		this.updateVisibilidadBusquedasFormularioSolicitudReemplazo();
		this.updateHabilitarBusquedasFormularioSolicitudReemplazo();
	}
	
	public void updateBorderResaltarBusquedasFormularioSolicitudReemplazo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSolicitudReemplazo.getComponents().length>0) {
	

		if(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEmpleadoSolicitudReemplazo!=null) {
			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudReemplazo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
				jPanel.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEmpleadoSolicitudReemplazo);
			}
		}

		if(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEmpleadoJefeSolicitudReemplazo!=null) {
			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudReemplazo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
				jPanel.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEmpleadoJefeSolicitudReemplazo);
			}
		}

		if(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEmpleadoReemplazoSolicitudReemplazo!=null) {
			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
				jPanel.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEmpleadoReemplazoSolicitudReemplazo);
			}
		}

		if(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEstadoSolicitudNomiSolicitudReemplazo!=null) {
			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
				jPanel.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEstadoSolicitudNomiSolicitudReemplazo);
			}
		}

		if(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEstructuraSolicitudReemplazo!=null) {
			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudReemplazo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
				jPanel.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEstructuraSolicitudReemplazo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSolicitudReemplazo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSolicitudReemplazo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudReemplazo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarFK_IdEmpleadoSolicitudReemplazo);
			if(!this.solicitudreemplazoConstantesFunciones.mostrarFK_IdEmpleadoSolicitudReemplazo && index>-1) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudReemplazo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarFK_IdEmpleadoJefeSolicitudReemplazo);
			if(!this.solicitudreemplazoConstantesFunciones.mostrarFK_IdEmpleadoJefeSolicitudReemplazo && index>-1) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarFK_IdEmpleadoReemplazoSolicitudReemplazo);
			if(!this.solicitudreemplazoConstantesFunciones.mostrarFK_IdEmpleadoReemplazoSolicitudReemplazo && index>-1) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarFK_IdEstadoSolicitudNomiSolicitudReemplazo);
			if(!this.solicitudreemplazoConstantesFunciones.mostrarFK_IdEstadoSolicitudNomiSolicitudReemplazo && index>-1) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.remove(index);
			}

			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudReemplazo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarFK_IdEstructuraSolicitudReemplazo);
			if(!this.solicitudreemplazoConstantesFunciones.mostrarFK_IdEstructuraSolicitudReemplazo && index>-1) {
				this.jTabbedPaneBusquedasSolicitudReemplazo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSolicitudReemplazo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSolicitudReemplazo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudReemplazo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudreemplazoConstantesFunciones.activarFK_IdEmpleadoSolicitudReemplazo);
				this.jTabbedPaneBusquedasSolicitudReemplazo.setEnabledAt(index,this.solicitudreemplazoConstantesFunciones.activarFK_IdEmpleadoSolicitudReemplazo);
			}

			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudReemplazo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudreemplazoConstantesFunciones.activarFK_IdEmpleadoJefeSolicitudReemplazo);
				this.jTabbedPaneBusquedasSolicitudReemplazo.setEnabledAt(index,this.solicitudreemplazoConstantesFunciones.activarFK_IdEmpleadoJefeSolicitudReemplazo);
			}

			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudreemplazoConstantesFunciones.activarFK_IdEmpleadoReemplazoSolicitudReemplazo);
				this.jTabbedPaneBusquedasSolicitudReemplazo.setEnabledAt(index,this.solicitudreemplazoConstantesFunciones.activarFK_IdEmpleadoReemplazoSolicitudReemplazo);
			}

			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudreemplazoConstantesFunciones.activarFK_IdEstadoSolicitudNomiSolicitudReemplazo);
				this.jTabbedPaneBusquedasSolicitudReemplazo.setEnabledAt(index,this.solicitudreemplazoConstantesFunciones.activarFK_IdEstadoSolicitudNomiSolicitudReemplazo);
			}

			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudReemplazo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.solicitudreemplazoConstantesFunciones.activarFK_IdEstructuraSolicitudReemplazo);
				this.jTabbedPaneBusquedasSolicitudReemplazo.setEnabledAt(index,this.solicitudreemplazoConstantesFunciones.activarFK_IdEstructuraSolicitudReemplazo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSolicitudReemplazo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoSolicitudReemplazo);

			this.jTabbedPaneBusquedasSolicitudReemplazo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);

			this.solicitudreemplazoConstantesFunciones.setResaltarFK_IdEmpleadoSolicitudReemplazo(resaltar);

			jPanel.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEmpleadoSolicitudReemplazo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleadoJefe")) {
			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoJefeSolicitudReemplazo);

			this.jTabbedPaneBusquedasSolicitudReemplazo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);

			this.solicitudreemplazoConstantesFunciones.setResaltarFK_IdEmpleadoJefeSolicitudReemplazo(resaltar);

			jPanel.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEmpleadoJefeSolicitudReemplazo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleadoReemplazo")) {
			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);

			this.jTabbedPaneBusquedasSolicitudReemplazo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);

			this.solicitudreemplazoConstantesFunciones.setResaltarFK_IdEmpleadoReemplazoSolicitudReemplazo(resaltar);

			jPanel.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEmpleadoReemplazoSolicitudReemplazo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoSolicitudNomi")) {
			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);

			this.jTabbedPaneBusquedasSolicitudReemplazo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);

			this.solicitudreemplazoConstantesFunciones.setResaltarFK_IdEstadoSolicitudNomiSolicitudReemplazo(resaltar);

			jPanel.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEstadoSolicitudNomiSolicitudReemplazo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasSolicitudReemplazo.indexOfComponent(this.jPanelFK_IdEstructuraSolicitudReemplazo);

			this.jTabbedPaneBusquedasSolicitudReemplazo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSolicitudReemplazo.getComponent(index);

			this.solicitudreemplazoConstantesFunciones.setResaltarFK_IdEstructuraSolicitudReemplazo(resaltar);

			jPanel.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarFK_IdEstructuraSolicitudReemplazo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSolicitudReemplazo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSolicitudReemplazo() throws Exception {

		if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSolicitudReemplazo();
		this.updateVisibilidadResaltarControlesFormularioSolicitudReemplazo();
		this.updateHabilitarResaltarControlesFormularioSolicitudReemplazo();
		
	}
	
	public void updateBorderResaltarControlesFormularioSolicitudReemplazo() throws Exception {
		if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.solicitudreemplazoConstantesFunciones.resaltaridSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelidSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltaridSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarid_empresaSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarid_empresaSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarid_sucursalSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarid_sucursalSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarid_empleado_jefeSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarid_empleado_jefeSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarid_empleadoSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarid_empleadoSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarid_empleado_reemplazoSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarid_empleado_reemplazoSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarid_estructuraSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarid_estructuraSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarid_estado_solicitud_nomiSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarsecuencialSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldsecuencialSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarsecuencialSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarfecha_solicitaSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_solicitaSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarfecha_solicitaSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarfecha_ejecutaSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_ejecutaSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarfecha_ejecutaSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarnumero_horasSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldnumero_horasSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarnumero_horasSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarcosto_unitarioSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_unitarioSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarcosto_unitarioSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltarcosto_totalSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_totalSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltarcosto_totalSolicitudReemplazo);}
		if(this.solicitudreemplazoConstantesFunciones.resaltardescripcionSolicitudReemplazo!=null && this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {this.jInternalFrameDetalleFormSolicitudReemplazo.jTextAreadescripcionSolicitudReemplazo.setBorder(this.solicitudreemplazoConstantesFunciones.resaltardescripcionSolicitudReemplazo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSolicitudReemplazo() throws Exception {		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
	
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelidSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostraridSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelidSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostraridSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_empresaSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelid_empresaSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_empresaSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_sucursalSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelid_sucursalSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_sucursalSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_empleado_jefeSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelid_empleado_jefeSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_empleado_jefeSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_empleadoSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelid_empleadoSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_empleadoSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_empleado_reemplazoSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelid_empleado_reemplazoSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_empleado_reemplazoSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_estructuraSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelid_estructuraSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_estructuraSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_estado_solicitud_nomiSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelid_estado_solicitud_nomiSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarid_estado_solicitud_nomiSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldsecuencialSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarsecuencialSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelsecuencialSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarsecuencialSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_solicitaSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarfecha_solicitaSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelfecha_solicitaSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarfecha_solicitaSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_ejecutaSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarfecha_ejecutaSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelfecha_ejecutaSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarfecha_ejecutaSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldnumero_horasSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarnumero_horasSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelnumero_horasSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarnumero_horasSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_unitarioSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarcosto_unitarioSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelcosto_unitarioSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarcosto_unitarioSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_totalSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarcosto_totalSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPanelcosto_totalSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrarcosto_totalSolicitudReemplazo);
		//this.jInternalFrameDetalleFormSolicitudReemplazo.jTextAreadescripcionSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrardescripcionSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jPaneldescripcionSolicitudReemplazo.setVisible(this.solicitudreemplazoConstantesFunciones.mostrardescripcionSolicitudReemplazo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSolicitudReemplazo() throws Exception {
		if(this.jInternalFrameDetalleFormSolicitudReemplazo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSolicitudReemplazo!=null) {
	
		this.jInternalFrameDetalleFormSolicitudReemplazo.jLabelidSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activaridSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empresaSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarid_empresaSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_sucursalSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarid_sucursalSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_jefeSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarid_empleado_jefeSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleadoSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarid_empleadoSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_empleado_reemplazoSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarid_empleado_reemplazoSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estructuraSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarid_estructuraSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jComboBoxid_estado_solicitud_nomiSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarid_estado_solicitud_nomiSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldsecuencialSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarsecuencialSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_solicitaSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarfecha_solicitaSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jDateChooserfecha_ejecutaSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarfecha_ejecutaSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldnumero_horasSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarnumero_horasSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_unitarioSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarcosto_unitarioSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jTextFieldcosto_totalSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activarcosto_totalSolicitudReemplazo);
		this.jInternalFrameDetalleFormSolicitudReemplazo.jTextAreadescripcionSolicitudReemplazo.setEnabled(this.solicitudreemplazoConstantesFunciones.activardescripcionSolicitudReemplazo);
		}
	}
	
		
}