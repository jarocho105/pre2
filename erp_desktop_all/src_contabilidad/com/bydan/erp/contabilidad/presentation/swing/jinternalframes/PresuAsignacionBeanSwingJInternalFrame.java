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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.PresuAsignacionConstantesFunciones;
import com.bydan.erp.contabilidad.util.PresuAsignacionParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.PresuAsignacionParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.PresuAsignacionBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PresuAsignacionBeanSwingJInternalFrame extends PresuAsignacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresuAsignacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresuAsignacion> presuasignacionValidator = new ClassValidator<PresuAsignacion>(PresuAsignacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresuAsignacion presuasignacion;	
	public PresuAsignacion presuasignacionAux;
	public PresuAsignacion presuasignacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresuAsignacion presuasignacionTotales;
	public Long idPresuAsignacionActual;
	public Long iIdNuevoPresuAsignacion=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPresuProyectoCuenta="";

	public List<PresuProyectoCuenta> presuproyectocuentasForeignKey;

	public List<PresuProyectoCuenta> getpresuproyectocuentasForeignKey() {
		return presuproyectocuentasForeignKey;
	}

	public void setpresuproyectocuentasForeignKey(List<PresuProyectoCuenta> presuproyectocuentasForeignKey) {
		this.presuproyectocuentasForeignKey = presuproyectocuentasForeignKey;
	}

	//OBJETO FK ACTUAL
	public PresuProyectoCuenta presuproyectocuentaForeignKey;

	public PresuProyectoCuenta getpresuproyectocuentaForeignKey() {
		return presuproyectocuentaForeignKey;
	}

	public void setpresuproyectocuentaForeignKey(PresuProyectoCuenta presuproyectocuentaForeignKey) {
		this.presuproyectocuentaForeignKey = presuproyectocuentaForeignKey;
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

	public String sFinalQueryComboPresuEstado="";

	public List<PresuEstado> presuestadosForeignKey;

	public List<PresuEstado> getpresuestadosForeignKey() {
		return presuestadosForeignKey;
	}

	public void setpresuestadosForeignKey(List<PresuEstado> presuestadosForeignKey) {
		this.presuestadosForeignKey = presuestadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public PresuEstado presuestadoForeignKey;

	public PresuEstado getpresuestadoForeignKey() {
		return presuestadoForeignKey;
	}

	public void setpresuestadoForeignKey(PresuEstado presuestadoForeignKey) {
		this.presuestadoForeignKey = presuestadoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
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
	
	public Boolean isPermisoTodoPresuAsignacion;
	public Boolean isPermisoNuevoPresuAsignacion;
	public Boolean isPermisoActualizarPresuAsignacion;
	public Boolean isPermisoActualizarOriginalPresuAsignacion;
	public Boolean isPermisoEliminarPresuAsignacion;
	public Boolean isPermisoGuardarCambiosPresuAsignacion;
	public Boolean isPermisoConsultaPresuAsignacion;
	public Boolean isPermisoBusquedaPresuAsignacion;
	public Boolean isPermisoReportePresuAsignacion;
	public Boolean isPermisoPaginacionMedioPresuAsignacion;
	public Boolean isPermisoPaginacionAltoPresuAsignacion;
	public Boolean isPermisoPaginacionTodoPresuAsignacion;
	public Boolean isPermisoCopiarPresuAsignacion;
	public Boolean isPermisoVerFormPresuAsignacion;
	public Boolean isPermisoDuplicarPresuAsignacion;
	public Boolean isPermisoOrdenPresuAsignacion;
	
	
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
	
	public PresuAsignacionParameterReturnGeneral presuasignacionReturnGeneral;
	public PresuAsignacionParameterReturnGeneral presuasignacionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresuAsignacion=false;
	public Boolean esParaAccionDesdeFormularioPresuAsignacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresuAsignacionSessionBeanAdditional presuasignacionSessionBeanAdditional=null;
	
	public PresuAsignacionSessionBeanAdditional getPresuAsignacionSessionBeanAdditional() {
		return this.presuasignacionSessionBeanAdditional;
	}
	
	public void setPresuAsignacionSessionBeanAdditional(PresuAsignacionSessionBeanAdditional presuasignacionSessionBeanAdditional) {
		try {
			this.presuasignacionSessionBeanAdditional=presuasignacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresuAsignacionBeanSwingJInternalFrameAdditional presuasignacionBeanSwingJInternalFrameAdditional=null;
	//public class PresuAsignacionBeanSwingJInternalFrame
	
	public PresuAsignacionBeanSwingJInternalFrameAdditional getPresuAsignacionBeanSwingJInternalFrameAdditional() {
		return this.presuasignacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresuAsignacionBeanSwingJInternalFrameAdditional(PresuAsignacionBeanSwingJInternalFrameAdditional presuasignacionBeanSwingJInternalFrameAdditional) {
		try {
			this.presuasignacionBeanSwingJInternalFrameAdditional=presuasignacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresuAsignacionLogic presuasignacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresuAsignacion presuasignacionBean;
	public PresuAsignacionConstantesFunciones presuasignacionConstantesFunciones;
	//public PresuAsignacionParameterReturnGeneral presuasignacionReturnGeneral;
	
	//FK
	
	public PresuProyectoCuentaLogic presuproyectocuentaLogic;
	public EmpleadoLogic empleadoLogic;
	public PresuEstadoLogic presuestadoLogic;
	
	//PARAMETROS
	
	
	//public List<PresuAsignacion> presuasignacions;	
	//public List<PresuAsignacion> presuasignacionsEliminados;
	//public List<PresuAsignacion> presuasignacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresuAsignacion=false;
	public Boolean isVisibilidadCeldaDuplicarPresuAsignacion=true;
	public Boolean isVisibilidadCeldaCopiarPresuAsignacion=true;
	public Boolean isVisibilidadCeldaVerFormPresuAsignacion=true;
	public Boolean isVisibilidadCeldaOrdenPresuAsignacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresuAsignacion=false;
	public Boolean isVisibilidadCeldaModificarPresuAsignacion=false;
	public Boolean isVisibilidadCeldaActualizarPresuAsignacion=false;
	public Boolean isVisibilidadCeldaEliminarPresuAsignacion=false;
	public Boolean isVisibilidadCeldaCancelarPresuAsignacion=false;
	public Boolean isVisibilidadCeldaGuardarPresuAsignacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresuAsignacion=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdPresuEstado=false;
	public Boolean isVisibilidadFK_IdPresuProyectoCuenta=false;
	
	public Long getiIdNuevoPresuAsignacion() {
		return this.iIdNuevoPresuAsignacion;
	}

	public void setiIdNuevoPresuAsignacion(Long iIdNuevoPresuAsignacion) {
		this.iIdNuevoPresuAsignacion = iIdNuevoPresuAsignacion;
	}
	
	public Long getidPresuAsignacionActual() {
		return this.idPresuAsignacionActual;
	}

	public void setidPresuAsignacionActual(Long idPresuAsignacionActual) {
		this.idPresuAsignacionActual = idPresuAsignacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresuAsignacion getpresuasignacion() {
		return this.presuasignacion;
	}

	public void setpresuasignacion(PresuAsignacion presuasignacion) {
		this.presuasignacion = presuasignacion;
	}
	
	public PresuAsignacion getpresuasignacionAux() {
		return this.presuasignacionAux;
	}

	public void setpresuasignacionAux(PresuAsignacion presuasignacionAux) {
		this.presuasignacionAux = presuasignacionAux;
	}				
	
	public PresuAsignacion getpresuasignacionAnterior() {
		return this.presuasignacionAnterior;
	}

	public void setpresuasignacionAnterior(PresuAsignacion presuasignacionAnterior) {
		this.presuasignacionAnterior = presuasignacionAnterior;
	}	
	
	public PresuAsignacion getpresuasignacionTotales() {
		return this.presuasignacionTotales;
	}

	public void setpresuasignacionTotales(PresuAsignacion presuasignacionTotales) {
		this.presuasignacionTotales = presuasignacionTotales;
	}	
	
	public PresuAsignacion getpresuasignacionBean() {
		return this.presuasignacionBean;
	}

	public void setpresuasignacionBean(PresuAsignacion presuasignacionBean) {
		this.presuasignacionBean = presuasignacionBean;
	}	
	
	public PresuAsignacionParameterReturnGeneral getpresuasignacionReturnGeneral() {
		return this.presuasignacionReturnGeneral;
	}

	public void setpresuasignacionReturnGeneral(PresuAsignacionParameterReturnGeneral presuasignacionReturnGeneral) {
		this.presuasignacionReturnGeneral = presuasignacionReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_presu_estadoFK_IdPresuEstado=-1L;

	public Long getid_presu_estadoFK_IdPresuEstado() {
		return this.id_presu_estadoFK_IdPresuEstado;
	}

	public void setid_presu_estadoFK_IdPresuEstado(Long id_presu_estadoFK_IdPresuEstado) {
		this.id_presu_estadoFK_IdPresuEstado = id_presu_estadoFK_IdPresuEstado;
	}

	public Long id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta=-1L;

	public Long getid_presu_proyecto_cuentaFK_IdPresuProyectoCuenta() {
		return this.id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta;
	}

	public void setid_presu_proyecto_cuentaFK_IdPresuProyectoCuenta(Long id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta) {
		this.id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta = id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PresuAsignacionLogic getPresuAsignacionLogic()	{		
		return presuasignacionLogic;
	}

	public void setPresuAsignacionLogic(PresuAsignacionLogic presuasignacionLogic) {
		this.presuasignacionLogic = presuasignacionLogic;
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
	
	public Boolean getIsEsNuevoPresuAsignacion() {
		return isEsNuevoPresuAsignacion;
	}

	public void setIsEsNuevoPresuAsignacion(Boolean isEsNuevoPresuAsignacion) {
		this.isEsNuevoPresuAsignacion = isEsNuevoPresuAsignacion;
	}

	public Boolean getEsParaAccionDesdeFormularioPresuAsignacion() {
		return esParaAccionDesdeFormularioPresuAsignacion;
	}
	
	public void setEsParaAccionDesdeFormularioPresuAsignacion(Boolean esParaAccionDesdeFormularioPresuAsignacion) {
		this.esParaAccionDesdeFormularioPresuAsignacion = esParaAccionDesdeFormularioPresuAsignacion;
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
	
	
	public void cargarCombosPresuProyectoCuentasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.presuproyectocuentasForeignKey=new ArrayList<PresuProyectoCuenta>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PresuProyectoCuentaLogic presuproyectocuentaLogic=new PresuProyectoCuentaLogic();

			presuproyectocuentaLogic.getPresuProyectoCuentaDataAccess().setIsForForeingKeyData(true);

			if(this.presuasignacionSessionBean==null) {
				this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
			}

			if(!this.presuasignacionSessionBean.getisBusquedaDesdeForeignKeySesionPresuProyectoCuenta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectocuentaLogic.getPresuProyectoCuentaDataAccess().setIsForForeingKeyData(true);

					presuproyectocuentaLogic.getTodosPresuProyectoCuentasWithConnection(sFinalQuery,new Pagination());

					this.presuproyectocuentasForeignKey=presuproyectocuentaLogic.getPresuProyectoCuentas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPresuProyectoCuenta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectocuentaLogic.getEntityWithConnection(presuasignacionSessionBean.getlidPresuProyectoCuentaActual());
					this.presuproyectocuentasForeignKey.add(presuproyectocuentaLogic.getPresuProyectoCuenta());
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

			if(this.presuasignacionSessionBean==null) {
				this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
			}

			if(!this.presuasignacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(presuasignacionSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosPresuEstadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.presuestadosForeignKey=new ArrayList<PresuEstado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PresuEstadoLogic presuestadoLogic=new PresuEstadoLogic();

			presuestadoLogic.getPresuEstadoDataAccess().setIsForForeingKeyData(true);

			if(this.presuasignacionSessionBean==null) {
				this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
			}

			if(!this.presuasignacionSessionBean.getisBusquedaDesdeForeignKeySesionPresuEstado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuestadoLogic.getPresuEstadoDataAccess().setIsForForeingKeyData(true);

					presuestadoLogic.getTodosPresuEstadosWithConnection(sFinalQuery,new Pagination());

					this.presuestadosForeignKey=presuestadoLogic.getPresuEstados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPresuEstado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuestadoLogic.getEntityWithConnection(presuasignacionSessionBean.getlidPresuEstadoActual());
					this.presuestadosForeignKey.add(presuestadoLogic.getPresuEstado());
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

	
	
	public void setActualPresuProyectoCuentaForeignKey(Long idPresuProyectoCuentaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PresuProyectoCuenta  presuproyectocuentaTemp=null;

			for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentasForeignKey) {
				if(presuproyectocuentaAux.getId()!=null && presuproyectocuentaAux.getId().equals(idPresuProyectoCuentaSeleccionado)) {
					presuproyectocuentaTemp=presuproyectocuentaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(presuproyectocuentaTemp!=null) {

					if(this.presuasignacion!=null) {
						this.presuasignacion.setPresuProyectoCuenta(presuproyectocuentaTemp);
					}

					if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
						this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setSelectedItem(presuproyectocuentaTemp);
					}
				} else {
					//jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setSelectedItem(presuproyectocuentaTemp);
					if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
						if(this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPresuProyectoCuenta") || sFormularioTipoBusqueda.equals("Todos")){
					if(presuproyectocuentaTemp!=null && jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion!=null) {
						jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setSelectedItem(presuproyectocuentaTemp);
					} else {
						if(jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion!=null) {
							//jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setSelectedItem(presuproyectocuentaTemp);
							if(jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.getItemCount()>0) {
								jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setSelectedIndex(0);
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

	public String getActualPresuProyectoCuentaForeignKeyDescripcion(Long idPresuProyectoCuentaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PresuProyectoCuenta  presuproyectocuentaTemp=null;

			for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentasForeignKey) {
				if(presuproyectocuentaAux.getId()!=null && presuproyectocuentaAux.getId().equals(idPresuProyectoCuentaSeleccionado)) {
					presuproyectocuentaTemp=presuproyectocuentaAux;
					break;
				}
			}


			sDescripcion=PresuProyectoCuentaConstantesFunciones.getPresuProyectoCuentaDescripcion(presuproyectocuentaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPresuProyectoCuentaForeignKeyGenerico(Long idPresuProyectoCuentaSeleccionado,JComboBox jComboBoxid_presu_proyecto_cuentaPresuAsignacionGenerico)throws Exception
	{
		try
		{
			PresuProyectoCuenta  presuproyectocuentaTemp=null;

			for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentasForeignKey) {
				if(presuproyectocuentaAux.getId()!=null && presuproyectocuentaAux.getId().equals(idPresuProyectoCuentaSeleccionado)) {
					presuproyectocuentaTemp=presuproyectocuentaAux;
					break;
				}
			}

			if(presuproyectocuentaTemp!=null) {
				jComboBoxid_presu_proyecto_cuentaPresuAsignacionGenerico.setSelectedItem(presuproyectocuentaTemp);
			} else {
				if(jComboBoxid_presu_proyecto_cuentaPresuAsignacionGenerico!=null && jComboBoxid_presu_proyecto_cuentaPresuAsignacionGenerico.getItemCount()>0) {
					jComboBoxid_presu_proyecto_cuentaPresuAsignacionGenerico.setSelectedIndex(0);
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

					if(this.presuasignacion!=null) {
						this.presuasignacion.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
						this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoPresuAsignacion.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
						if(this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoPresuAsignacionGenerico)throws Exception
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
				jComboBoxid_empleadoPresuAsignacionGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoPresuAsignacionGenerico!=null && jComboBoxid_empleadoPresuAsignacionGenerico.getItemCount()>0) {
					jComboBoxid_empleadoPresuAsignacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPresuEstadoForeignKey(Long idPresuEstadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PresuEstado  presuestadoTemp=null;

			for(PresuEstado presuestadoAux:presuestadosForeignKey) {
				if(presuestadoAux.getId()!=null && presuestadoAux.getId().equals(idPresuEstadoSeleccionado)) {
					presuestadoTemp=presuestadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(presuestadoTemp!=null) {

					if(this.presuasignacion!=null) {
						this.presuasignacion.setPresuEstado(presuestadoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
						this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.setSelectedItem(presuestadoTemp);
					}
				} else {
					//jComboBoxid_presu_estadoPresuAsignacion.setSelectedItem(presuestadoTemp);
					if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
						if(this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPresuEstado") || sFormularioTipoBusqueda.equals("Todos")){
					if(presuestadoTemp!=null && jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion!=null) {
						jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setSelectedItem(presuestadoTemp);
					} else {
						if(jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion!=null) {
							//jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setSelectedItem(presuestadoTemp);
							if(jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.getItemCount()>0) {
								jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setSelectedIndex(0);
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

	public String getActualPresuEstadoForeignKeyDescripcion(Long idPresuEstadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PresuEstado  presuestadoTemp=null;

			for(PresuEstado presuestadoAux:presuestadosForeignKey) {
				if(presuestadoAux.getId()!=null && presuestadoAux.getId().equals(idPresuEstadoSeleccionado)) {
					presuestadoTemp=presuestadoAux;
					break;
				}
			}


			sDescripcion=PresuEstadoConstantesFunciones.getPresuEstadoDescripcion(presuestadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPresuEstadoForeignKeyGenerico(Long idPresuEstadoSeleccionado,JComboBox jComboBoxid_presu_estadoPresuAsignacionGenerico)throws Exception
	{
		try
		{
			PresuEstado  presuestadoTemp=null;

			for(PresuEstado presuestadoAux:presuestadosForeignKey) {
				if(presuestadoAux.getId()!=null && presuestadoAux.getId().equals(idPresuEstadoSeleccionado)) {
					presuestadoTemp=presuestadoAux;
					break;
				}
			}

			if(presuestadoTemp!=null) {
				jComboBoxid_presu_estadoPresuAsignacionGenerico.setSelectedItem(presuestadoTemp);
			} else {
				if(jComboBoxid_presu_estadoPresuAsignacionGenerico!=null && jComboBoxid_presu_estadoPresuAsignacionGenerico.getItemCount()>0) {
					jComboBoxid_presu_estadoPresuAsignacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPresuProyectoCuentaForeignKey(PresuAsignacion presuasignacion,JComboBox jComboBoxid_presu_proyecto_cuentaPresuAsignacionGenerico)throws Exception
	{
		try
		{
			PresuProyectoCuenta  presuproyectocuentaAux=new PresuProyectoCuenta();

			if(jComboBoxid_presu_proyecto_cuentaPresuAsignacionGenerico==null) {
				presuproyectocuentaAux=(PresuProyectoCuenta)this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.getSelectedItem();
			} else {
				presuproyectocuentaAux=(PresuProyectoCuenta)jComboBoxid_presu_proyecto_cuentaPresuAsignacionGenerico.getSelectedItem();
			}

			if(presuproyectocuentaAux!=null && presuproyectocuentaAux.getId()!=null) {
				presuasignacion.setid_presu_proyecto_cuenta(presuproyectocuentaAux.getId());
				presuasignacion.setpresuproyectocuenta_descripcion(PresuAsignacionConstantesFunciones.getPresuProyectoCuentaDescripcion(presuproyectocuentaAux));
				presuasignacion.setPresuProyectoCuenta(presuproyectocuentaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(PresuAsignacion presuasignacion,JComboBox jComboBoxid_empleadoPresuAsignacionGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoPresuAsignacionGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoPresuAsignacionGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				presuasignacion.setid_empleado(empleadoAux.getId());
				presuasignacion.setempleado_descripcion(PresuAsignacionConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				presuasignacion.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPresuEstadoForeignKey(PresuAsignacion presuasignacion,JComboBox jComboBoxid_presu_estadoPresuAsignacionGenerico)throws Exception
	{
		try
		{
			PresuEstado  presuestadoAux=new PresuEstado();

			if(jComboBoxid_presu_estadoPresuAsignacionGenerico==null) {
				presuestadoAux=(PresuEstado)this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.getSelectedItem();
			} else {
				presuestadoAux=(PresuEstado)jComboBoxid_presu_estadoPresuAsignacionGenerico.getSelectedItem();
			}

			if(presuestadoAux!=null && presuestadoAux.getId()!=null) {
				presuasignacion.setid_presu_estado(presuestadoAux.getId());
				presuasignacion.setpresuestado_descripcion(PresuAsignacionConstantesFunciones.getPresuEstadoDescripcion(presuestadoAux));
				presuasignacion.setPresuEstado(presuestadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePresuProyectoCuentasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPresuProyectoCuenta=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { 
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.removeAllItems();

							for(PresuProyectoCuenta presuproyectocuenta:this.presuproyectocuentasForeignKey) {
								this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.addItem(presuproyectocuenta);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { 
					}

					if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPresuProyectoCuenta") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.removeAllItems();

							for(PresuProyectoCuenta presuproyectocuenta:this.presuproyectocuentasForeignKey) {
								this.jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.addItem(presuproyectocuenta);
							}
						}

						if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { 
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { 
					}

					if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.addItem(empleado);
							}
						}

						if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePresuEstadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPresuEstado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { 
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.removeAllItems();

							for(PresuEstado presuestado:this.presuestadosForeignKey) {
								this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.addItem(presuestado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { 
					}

					if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPresuEstado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.removeAllItems();

							for(PresuEstado presuestado:this.presuestadosForeignKey) {
								this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.addItem(presuestado);
							}
						}

						if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePresuProyectoCuentaForeignKey(PresuProyectoCuenta presuproyectocuenta,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setSelectedItem(presuproyectocuenta);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setSelectedItem(presuproyectocuenta);
						} else {
							this.jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePresuEstadoForeignKey(PresuEstado presuestado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.setSelectedItem(presuestado);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setSelectedItem(presuestado);
						} else {
							this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPresuAsignacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresuAsignacionConstantesFunciones.refrescarForeignKeysDescripcionesPresuAsignacion(this.presuasignacionLogic.getPresuAsignacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresuAsignacionConstantesFunciones.refrescarForeignKeysDescripcionesPresuAsignacion(this.presuasignacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(PresuProyectoCuenta.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(PresuEstado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presuasignacionLogic.setPresuAsignacions(this.presuasignacions);
			presuasignacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresuAsignacionParameterReturnGeneral getPresuAsignacionParameterGeneral() {
		return this.presuasignacionParameterGeneral;
	}
	
	public void setPresuAsignacionParameterGeneral(PresuAsignacionParameterReturnGeneral presuasignacionParameterGeneral) {
		this.presuasignacionParameterGeneral = presuasignacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresuAsignacion() {
		return isPermisoTodoPresuAsignacion;
	}

	public void setIsPermisoTodoPresuAsignacion(Boolean isPermisoTodoPresuAsignacion) {
		this.isPermisoTodoPresuAsignacion = isPermisoTodoPresuAsignacion;
	}

	public Boolean getIsPermisoNuevoPresuAsignacion() {
		return isPermisoNuevoPresuAsignacion;
	}

	public void setIsPermisoNuevoPresuAsignacion(Boolean isPermisoNuevoPresuAsignacion) {
		this.isPermisoNuevoPresuAsignacion = isPermisoNuevoPresuAsignacion;
	}

	public Boolean getIsPermisoActualizarPresuAsignacion() {
		return isPermisoActualizarPresuAsignacion;
	}

	public void setIsPermisoActualizarPresuAsignacion(Boolean isPermisoActualizarPresuAsignacion) {
		this.isPermisoActualizarPresuAsignacion = isPermisoActualizarPresuAsignacion;
	}

	public Boolean getIsPermisoEliminarPresuAsignacion() {
		return isPermisoEliminarPresuAsignacion;
	}

	public void setIsPermisoEliminarPresuAsignacion(Boolean isPermisoEliminarPresuAsignacion) {
		this.isPermisoEliminarPresuAsignacion = isPermisoEliminarPresuAsignacion;
	}

	public Boolean getIsPermisoGuardarCambiosPresuAsignacion() {
		return isPermisoGuardarCambiosPresuAsignacion;
	}

	public void setIsPermisoGuardarCambiosPresuAsignacion(Boolean isPermisoGuardarCambiosPresuAsignacion) {
		this.isPermisoGuardarCambiosPresuAsignacion = isPermisoGuardarCambiosPresuAsignacion;
	}
	
	public Boolean getIsPermisoConsultaPresuAsignacion() {
		return isPermisoConsultaPresuAsignacion;
	}

	public void setIsPermisoConsultaPresuAsignacion(Boolean isPermisoConsultaPresuAsignacion) {
		this.isPermisoConsultaPresuAsignacion = isPermisoConsultaPresuAsignacion;
	}

	public Boolean getIsPermisoBusquedaPresuAsignacion() {
		return isPermisoBusquedaPresuAsignacion;
	}

	public void setIsPermisoBusquedaPresuAsignacion(Boolean isPermisoBusquedaPresuAsignacion) {
		this.isPermisoBusquedaPresuAsignacion = isPermisoBusquedaPresuAsignacion;
	}

	public Boolean getIsPermisoReportePresuAsignacion() {
		return isPermisoReportePresuAsignacion;
	}

	public void setIsPermisoReportePresuAsignacion(Boolean isPermisoReportePresuAsignacion) {
		this.isPermisoReportePresuAsignacion = isPermisoReportePresuAsignacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresuAsignacion() {
		return isPermisoPaginacionMedioPresuAsignacion;
	}

	public void setIsPermisoPaginacionMedioPresuAsignacion(Boolean isPermisoPaginacionMedioPresuAsignacion) {
		this.isPermisoPaginacionMedioPresuAsignacion = isPermisoPaginacionMedioPresuAsignacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresuAsignacion() {
		return isPermisoPaginacionTodoPresuAsignacion;
	}

	public void setIsPermisoPaginacionTodoPresuAsignacion(Boolean isPermisoPaginacionTodoPresuAsignacion) {
		this.isPermisoPaginacionTodoPresuAsignacion = isPermisoPaginacionTodoPresuAsignacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresuAsignacion() {
		return isPermisoPaginacionAltoPresuAsignacion;
	}

	public void setIsPermisoPaginacionAltoPresuAsignacion(Boolean isPermisoPaginacionAltoPresuAsignacion) {
		this.isPermisoPaginacionAltoPresuAsignacion = isPermisoPaginacionAltoPresuAsignacion;
	}
	
	public Boolean getIsPermisoCopiarPresuAsignacion() {
		return isPermisoCopiarPresuAsignacion;
	}

	public void setIsPermisoCopiarPresuAsignacion(Boolean isPermisoCopiarPresuAsignacion) {
		this.isPermisoCopiarPresuAsignacion = isPermisoCopiarPresuAsignacion;
	}
	
	public Boolean getIsPermisoVerFormPresuAsignacion() {
		return isPermisoVerFormPresuAsignacion;
	}

	public void setIsPermisoVerFormPresuAsignacion(Boolean isPermisoVerFormPresuAsignacion) {
		this.isPermisoVerFormPresuAsignacion = isPermisoVerFormPresuAsignacion;
	}
	
	public Boolean getIsPermisoDuplicarPresuAsignacion() {
		return isPermisoDuplicarPresuAsignacion;
	}

	public void setIsPermisoDuplicarPresuAsignacion(Boolean isPermisoDuplicarPresuAsignacion) {
		this.isPermisoDuplicarPresuAsignacion = isPermisoDuplicarPresuAsignacion;
	}
	
	public Boolean getIsPermisoOrdenPresuAsignacion() {
		return isPermisoOrdenPresuAsignacion;
	}

	public void setIsPermisoOrdenPresuAsignacion(Boolean isPermisoOrdenPresuAsignacion) {
		this.isPermisoOrdenPresuAsignacion = isPermisoOrdenPresuAsignacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresuAsignacion() {
		return isVisibilidadCeldaNuevoPresuAsignacion;
	}

	public void setIsVisibilidadCeldaNuevoPresuAsignacion(Boolean isVisibilidadCeldaNuevoPresuAsignacion) {
		this.isVisibilidadCeldaNuevoPresuAsignacion = isVisibilidadCeldaNuevoPresuAsignacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresuAsignacion() {
		return isVisibilidadCeldaDuplicarPresuAsignacion;
	}

	public void setIsVisibilidadCeldaDuplicarPresuAsignacion(Boolean isVisibilidadCeldaDuplicarPresuAsignacion) {
		this.isVisibilidadCeldaDuplicarPresuAsignacion = isVisibilidadCeldaDuplicarPresuAsignacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresuAsignacion() {
		return isVisibilidadCeldaCopiarPresuAsignacion;
	}

	public void setIsVisibilidadCeldaCopiarPresuAsignacion(Boolean isVisibilidadCeldaCopiarPresuAsignacion) {
		this.isVisibilidadCeldaCopiarPresuAsignacion = isVisibilidadCeldaCopiarPresuAsignacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresuAsignacion() {
		return isVisibilidadCeldaVerFormPresuAsignacion;
	}

	public void setIsVisibilidadCeldaVerFormPresuAsignacion(Boolean isVisibilidadCeldaVerFormPresuAsignacion) {
		this.isVisibilidadCeldaVerFormPresuAsignacion = isVisibilidadCeldaVerFormPresuAsignacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresuAsignacion() {
		return isVisibilidadCeldaOrdenPresuAsignacion;
	}

	public void setIsVisibilidadCeldaOrdenPresuAsignacion(Boolean isVisibilidadCeldaOrdenPresuAsignacion) {
		this.isVisibilidadCeldaOrdenPresuAsignacion = isVisibilidadCeldaOrdenPresuAsignacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresuAsignacion() {
		return isVisibilidadCeldaNuevoRelacionesPresuAsignacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresuAsignacion(Boolean isVisibilidadCeldaNuevoRelacionesPresuAsignacion) {
		this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion = isVisibilidadCeldaNuevoRelacionesPresuAsignacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresuAsignacion() {
		return isVisibilidadCeldaModificarPresuAsignacion;
	}

	public void setIsVisibilidadCeldaModificarPresuAsignacion(Boolean isVisibilidadCeldaModificarPresuAsignacion) {
		this.isVisibilidadCeldaModificarPresuAsignacion = isVisibilidadCeldaModificarPresuAsignacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresuAsignacion() {
		return isVisibilidadCeldaActualizarPresuAsignacion;
	}

	public void setIsVisibilidadCeldaActualizarPresuAsignacion(Boolean isVisibilidadCeldaActualizarPresuAsignacion) {
		this.isVisibilidadCeldaActualizarPresuAsignacion = isVisibilidadCeldaActualizarPresuAsignacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresuAsignacion() {
		return isVisibilidadCeldaEliminarPresuAsignacion;
	}

	public void setIsVisibilidadCeldaEliminarPresuAsignacion(Boolean isVisibilidadCeldaEliminarPresuAsignacion) {
		this.isVisibilidadCeldaEliminarPresuAsignacion = isVisibilidadCeldaEliminarPresuAsignacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresuAsignacion() {
		return isVisibilidadCeldaCancelarPresuAsignacion;
	}

	public void setIsVisibilidadCeldaCancelarPresuAsignacion(Boolean isVisibilidadCeldaCancelarPresuAsignacion) {
		this.isVisibilidadCeldaCancelarPresuAsignacion = isVisibilidadCeldaCancelarPresuAsignacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresuAsignacion() {
		return isVisibilidadCeldaGuardarPresuAsignacion;
	}

	public void setIsVisibilidadCeldaGuardarPresuAsignacion(Boolean isVisibilidadCeldaGuardarPresuAsignacion) {
		this.isVisibilidadCeldaGuardarPresuAsignacion = isVisibilidadCeldaGuardarPresuAsignacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresuAsignacion() {
		return isVisibilidadCeldaGuardarCambiosPresuAsignacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresuAsignacion(Boolean isVisibilidadCeldaGuardarCambiosPresuAsignacion) {
		this.isVisibilidadCeldaGuardarCambiosPresuAsignacion = isVisibilidadCeldaGuardarCambiosPresuAsignacion;
	}
		
	public PresuAsignacionSessionBean getpresuasignacionSessionBean() {
		return this.presuasignacionSessionBean;
	}
	
	public void setpresuasignacionSessionBean(PresuAsignacionSessionBean presuasignacionSessionBean) {
		this.presuasignacionSessionBean=presuasignacionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdPresuEstado() {
		return this.isVisibilidadFK_IdPresuEstado;
	}

	public void setisVisibilidadFK_IdPresuEstado(Boolean isVisibilidadFK_IdPresuEstado) {
		this.isVisibilidadFK_IdPresuEstado=isVisibilidadFK_IdPresuEstado;
	}

	public Boolean getisVisibilidadFK_IdPresuProyectoCuenta() {
		return this.isVisibilidadFK_IdPresuProyectoCuenta;
	}

	public void setisVisibilidadFK_IdPresuProyectoCuenta(Boolean isVisibilidadFK_IdPresuProyectoCuenta) {
		this.isVisibilidadFK_IdPresuProyectoCuenta=isVisibilidadFK_IdPresuProyectoCuenta;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(PresuAsignacion presuasignacion)throws Exception {
		try {
			
				this.setActualParaGuardarPresuProyectoCuentaForeignKey(presuasignacion,null);
				this.setActualParaGuardarEmpleadoForeignKey(presuasignacion,null);
				this.setActualParaGuardarPresuEstadoForeignKey(presuasignacion,null);
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
	
	public void bugActualizarReferenciaActual(PresuAsignacion presuasignacion,PresuAsignacion presuasignacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresuAsignacion(presuasignacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presuasignacionAux.setId(presuasignacion.getId());
		presuasignacionAux.setVersionRow(presuasignacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresuAsignacion();
		
			int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presuasignacionValidator.getInvalidValues(this.presuasignacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presuasignacionLogic.setDatosCliente(datosCliente);
			presuasignacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presuasignacionAux=new  PresuAsignacion();
				
				presuasignacionAux.setIsNew(true);
				presuasignacionAux.setIsChanged(true);
				
				presuasignacionAux.setPresuAsignacionOriginal(this.presuasignacion);
				
				presuasignacionAux.setId(this.presuasignacion.getId());	
				presuasignacionAux.setVersionRow(this.presuasignacion.getVersionRow());	
				presuasignacionAux.setid_presu_proyecto_cuenta(this.presuasignacion.getid_presu_proyecto_cuenta());	
				presuasignacionAux.setid_empleado(this.presuasignacion.getid_empleado());	
				presuasignacionAux.setcodigo_secuencial(this.presuasignacion.getcodigo_secuencial());	
				presuasignacionAux.setvalor(this.presuasignacion.getvalor());	
				presuasignacionAux.setfecha(this.presuasignacion.getfecha());	
				presuasignacionAux.setid_presu_estado(this.presuasignacion.getid_presu_estado());	
				presuasignacionAux.setdescripcion(this.presuasignacion.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presuasignacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presuasignacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presuasignacionAux,presuasignacionLogic.getPresuAsignacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuasignacionAux,presuasignacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presuasignacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuasignacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuasignacionLogic.savePresuAsignacions();//WithConnection
						//presuasignacionLogic.getSetVersionRowPresuAsignacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presuasignacion,presuasignacionAux);
					
					this.refrescarForeignKeysDescripcionesPresuAsignacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presuasignacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presuasignacionLogic.savePresuAsignacionRelaciones(presuasignacionAux);//WithConnection
								//presuasignacionLogic.getSetVersionRowPresuAsignacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presuasignacion,presuasignacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presuasignacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presuasignacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presuasignacionAux,presuasignacionLogic.getPresuAsignacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presuasignacionAux,presuasignacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presuasignacion,presuasignacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presuasignacionAux=new  PresuAsignacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presuasignacionSessionBean.getEsGuardarRelacionado() 
					|| (this.presuasignacionSessionBean.getEsGuardarRelacionado() && this.presuasignacion.getId()>=0)) {
						
					presuasignacionAux.setIsNew(false);
				}
				
				presuasignacionAux.setIsDeleted(false);
			
				presuasignacionAux.setId(this.presuasignacion.getId());	
				presuasignacionAux.setVersionRow(this.presuasignacion.getVersionRow());	
				presuasignacionAux.setid_presu_proyecto_cuenta(this.presuasignacion.getid_presu_proyecto_cuenta());	
				presuasignacionAux.setid_empleado(this.presuasignacion.getid_empleado());	
				presuasignacionAux.setcodigo_secuencial(this.presuasignacion.getcodigo_secuencial());	
				presuasignacionAux.setvalor(this.presuasignacion.getvalor());	
				presuasignacionAux.setfecha(this.presuasignacion.getfecha());	
				presuasignacionAux.setid_presu_estado(this.presuasignacion.getid_presu_estado());	
				presuasignacionAux.setdescripcion(this.presuasignacion.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presuasignacionAux,presuasignacionLogic.getPresuAsignacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuasignacionAux,presuasignacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presuasignacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuasignacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuasignacionLogic.savePresuAsignacions();//WithConnection
						//presuasignacionLogic.getSetVersionRowPresuAsignacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presuasignacion,presuasignacionAux);
					
					this.refrescarForeignKeysDescripcionesPresuAsignacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presuasignacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presuasignacionLogic.savePresuAsignacionRelaciones(presuasignacionAux);//WithConnection
								//presuasignacionLogic.getSetVersionRowPresuAsignacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presuasignacion,presuasignacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presuasignacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presuasignacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presuasignacionAux,presuasignacionLogic.getPresuAsignacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presuasignacionAux,presuasignacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presuasignacion,presuasignacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presuasignacionAux=new  PresuAsignacion();
				
				presuasignacionAux.setIsNew(false);
				presuasignacionAux.setIsChanged(false);
				
				presuasignacionAux.setIsDeleted(true);
				
				presuasignacionAux.setId(this.presuasignacion.getId());	
				presuasignacionAux.setVersionRow(this.presuasignacion.getVersionRow());	
				presuasignacionAux.setid_presu_proyecto_cuenta(this.presuasignacion.getid_presu_proyecto_cuenta());	
				presuasignacionAux.setid_empleado(this.presuasignacion.getid_empleado());	
				presuasignacionAux.setcodigo_secuencial(this.presuasignacion.getcodigo_secuencial());	
				presuasignacionAux.setvalor(this.presuasignacion.getvalor());	
				presuasignacionAux.setfecha(this.presuasignacion.getfecha());	
				presuasignacionAux.setid_presu_estado(this.presuasignacion.getid_presu_estado());	
				presuasignacionAux.setdescripcion(this.presuasignacion.getdescripcion());	
				
				if(this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presuasignacionAux.getId()>=0) {	
						this.presuasignacionsEliminados.add(presuasignacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presuasignacionAux,presuasignacionLogic.getPresuAsignacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuasignacionAux,presuasignacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presuasignacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuasignacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuasignacionLogic.savePresuAsignacions();//WithConnection
						//presuasignacionLogic.getSetVersionRowPresuAsignacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presuasignacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presuasignacionLogic.savePresuAsignacionRelaciones(presuasignacionAux);//WithConnection
								//presuasignacionLogic.getSetVersionRowPresuAsignacions();//WithConnection
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
							if(this.presuasignacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.presuasignacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(presuasignacionAux,presuasignacionLogic.getPresuAsignacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(presuasignacionAux,presuasignacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.getPresuAsignacions().addAll(this.presuasignacionsEliminados);
					
					presuasignacionLogic.savePresuAsignacions();//WithConnection
					//presuasignacionLogic.getSetVersionRowPresuAsignacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPresuAsignacion();
				
				this.presuasignacionsEliminados= new ArrayList<PresuAsignacion>();		
			}
			
			if(this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Asignacion Presupuesto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Asignacion Presupuesto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presuasignacion=presuasignacionAux;
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
      		//this.finishProcessPresuAsignacion();
      	}
		
	}	
	
	public void actualizarRelaciones(PresuAsignacion presuasignacionLocal) throws Exception {
		
		if(this.presuasignacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresuAsignacion presuasignacionLocal) throws Exception {	
		if(this.presuasignacionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PresuProyectoCuentaDetalleFormJInternalFrame.class)) {
				PresuProyectoCuentaBeanSwingJInternalFrame presuproyectocuentaBeanSwingJInternalFrameLocal=(PresuProyectoCuentaBeanSwingJInternalFrame) ((PresuProyectoCuentaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				presuproyectocuentaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPresuProyectoCuenta(presuproyectocuentaBeanSwingJInternalFrameLocal.getpresuproyectocuenta(),true);
				presuproyectocuentaBeanSwingJInternalFrameLocal.actualizarLista(presuproyectocuentaBeanSwingJInternalFrameLocal.presuproyectocuenta,this.presuproyectocuentasForeignKey);

				presuproyectocuentaBeanSwingJInternalFrameLocal.actualizarRelaciones(presuproyectocuentaBeanSwingJInternalFrameLocal.presuproyectocuenta);

				presuasignacionLocal.setPresuProyectoCuenta(presuproyectocuentaBeanSwingJInternalFrameLocal.presuproyectocuenta);

				this.addItemDefectoCombosForeignKeyPresuProyectoCuenta();
				this.cargarCombosFramePresuProyectoCuentasForeignKey("Formulario");
				this.setActualPresuProyectoCuentaForeignKey(presuproyectocuentaBeanSwingJInternalFrameLocal.presuproyectocuenta.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				presuasignacionLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PresuEstadoDetalleFormJInternalFrame.class)) {
				PresuEstadoBeanSwingJInternalFrame presuestadoBeanSwingJInternalFrameLocal=(PresuEstadoBeanSwingJInternalFrame) ((PresuEstadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				presuestadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPresuEstado(presuestadoBeanSwingJInternalFrameLocal.getpresuestado(),true);
				presuestadoBeanSwingJInternalFrameLocal.actualizarLista(presuestadoBeanSwingJInternalFrameLocal.presuestado,this.presuestadosForeignKey);

				presuestadoBeanSwingJInternalFrameLocal.actualizarRelaciones(presuestadoBeanSwingJInternalFrameLocal.presuestado);

				presuasignacionLocal.setPresuEstado(presuestadoBeanSwingJInternalFrameLocal.presuestado);

				this.addItemDefectoCombosForeignKeyPresuEstado();
				this.cargarCombosFramePresuEstadosForeignKey("Formulario");
				this.setActualPresuEstadoForeignKey(presuestadoBeanSwingJInternalFrameLocal.presuestado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresuAsignacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presuasignacionValidator.getInvalidValues(this.presuasignacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresuAsignacion presuasignacion,List<PresuAsignacion> presuasignacions) throws Exception {
		try	{		
			PresuAsignacionConstantesFunciones.actualizarLista(presuasignacion,presuasignacions,this.presuasignacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresuAsignacion presuasignacion,List<PresuAsignacion> presuasignacions) throws Exception {
		try	{			
			PresuAsignacionConstantesFunciones.actualizarSelectedLista(presuasignacion,presuasignacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresuAsignacion> presuasignacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presuasignacionsLocal=this.presuasignacionLogic.getPresuAsignacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presuasignacionsLocal=this.presuasignacions;
			}
			//ARCHITECTURE
		
			for(PresuAsignacion presuasignacionLocal:presuasignacionsLocal) {
				if(this.permiteMantenimiento(presuasignacionLocal) && presuasignacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresuAsignacionConstantesFunciones.getPresuAsignacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresuAsignacionConstantesFunciones.IDPRESUPROYECTOCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabelid_presu_proyecto_cuentaPresuAsignacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuAsignacionConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabelid_empleadoPresuAsignacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuAsignacionConstantesFunciones.CODIGOSECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabelcodigo_secuencialPresuAsignacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuAsignacionConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabelvalorPresuAsignacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuAsignacionConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabelfechaPresuAsignacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuAsignacionConstantesFunciones.IDPRESUESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabelid_presu_estadoPresuAsignacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuAsignacionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabeldescripcionPresuAsignacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuAsignacion.jLabelid_presu_proyecto_cuentaPresuAsignacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuAsignacion.jLabelid_empleadoPresuAsignacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuAsignacion.jLabelcodigo_secuencialPresuAsignacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuAsignacion.jLabelvalorPresuAsignacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuAsignacion.jLabelfechaPresuAsignacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuAsignacion.jLabelid_presu_estadoPresuAsignacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuAsignacion.jLabeldescripcionPresuAsignacion,"");
		
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
		this.iIdNuevoPresuAsignacion--;	
		
		
		this.presuasignacionAux=new PresuAsignacion();
		
		this.presuasignacionAux.setId(this.iIdNuevoPresuAsignacion);
		this.presuasignacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presuasignacionLogic.getPresuAsignacions().add(this.presuasignacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presuasignacions.add(this.presuasignacionAux);
		}
		//ARCHITECTURE
		
		this.presuasignacion=this.presuasignacionAux;
		
		if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresuAsignacion(this.presuasignacion);
			this.setVariablesObjetoActualToFormularioForeignKeyPresuAsignacion(this.presuasignacion);
		}
				
		//this.setDefaultControlesPresuAsignacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresuAsignacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresuAsignacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuAsignacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuAsignacion(this.presuasignacionBean,this.presuasignacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresuAsignacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presuasignacionSessionBean.getConGuardarRelaciones()) {
			classes=PresuAsignacionConstantesFunciones.getClassesRelationshipsOfPresuAsignacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presuasignacionReturnGeneral=presuasignacionLogic.procesarEventosPresuAsignacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuasignacionLogic.getPresuAsignacions(),this.presuasignacion,this.presuasignacionParameterGeneral,this.isEsNuevoPresuAsignacion,classes);//this.presuasignacionLogic.getPresuAsignacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresuAsignacion(this.presuasignacionReturnGeneral,this.presuasignacionBean,false);
		
		if(this.presuasignacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresuAsignacion(this.presuasignacionReturnGeneral.getPresuAsignacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresuAsignacion(this.presuasignacionReturnGeneral.getPresuAsignacion());
		}
		
		if(this.presuasignacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresuAsignacion(this.presuasignacionReturnGeneral.getPresuAsignacion(),classes);//this.presuasignacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresuAsignacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresuAsignacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.RecargarFormPresuAsignacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresuAsignacion(false);
						
			if(presuasignacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuAsignacion();
			}
			
			this.actualizarVisualTableDatosPresuAsignacion();
			
			this.jTableDatosPresuAsignacion.setRowSelectionInterval(this.getIndiceNuevoPresuAsignacion(), this.getIndiceNuevoPresuAsignacion());
			
			this.seleccionarFilaTablaPresuAsignacionActual();
						
			this.actualizarEstadoCeldasBotonesPresuAsignacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresuAsignacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldcodigo_secuencialPresuAsignacion.setEnabled(isHabilitar && this.presuasignacionConstantesFunciones.activarcodigo_secuencialPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldvalorPresuAsignacion.setEnabled(isHabilitar && this.presuasignacionConstantesFunciones.activarvalorPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jDateChooserfechaPresuAsignacion.setEnabled(isHabilitar && this.presuasignacionConstantesFunciones.activarfechaPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jTextAreadescripcionPresuAsignacion.setEnabled(isHabilitar && this.presuasignacionConstantesFunciones.activardescripcionPresuAsignacion);	
		
		this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setEnabled(isHabilitar && this.presuasignacionConstantesFunciones.activarid_presu_proyecto_cuentaPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.setEnabled(isHabilitar && this.presuasignacionConstantesFunciones.activarid_empleadoPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.setEnabled(isHabilitar && this.presuasignacionConstantesFunciones.activarid_presu_estadoPresuAsignacion);
	};
	
	public void setDefaultControlesPresuAsignacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresuAsignacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presuasignacionSessionBean.setConGuardarRelaciones(true);			
			this.presuasignacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresuAsignacion.jTabbedPaneRelacionesPresuAsignacion.setVisible(true);
			
					
		} else {
			//this.presuasignacionSessionBean.setConGuardarRelaciones(false);			
			this.presuasignacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresuAsignacion.jTabbedPaneRelacionesPresuAsignacion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPresuAsignacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuAsignacion presuasignacionAux:this.presuasignacionLogic.getPresuAsignacions()) {
				if(presuasignacionAux.getId().equals(this.iIdNuevoPresuAsignacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuAsignacion presuasignacionAux:this.presuasignacions) {
				if(presuasignacionAux.getId().equals(this.iIdNuevoPresuAsignacion)) {
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
	
	public int getIndiceActualPresuAsignacion(PresuAsignacion presuasignacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuAsignacion presuasignacionAux:this.presuasignacionLogic.getPresuAsignacions()) {
				if(presuasignacionAux.getId().equals(presuasignacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuAsignacion presuasignacionAux:this.presuasignacions) {
				if(presuasignacionAux.getId().equals(presuasignacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresuAsignacion(PresuAsignacion presuasignacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuAsignacion presuasignacionAux:this.presuasignacionLogic.getPresuAsignacions()) {
				if(presuasignacionAux.getPresuAsignacionOriginal().getId().equals(presuasignacionOriginal.getId())) {
					existe=true;
					presuasignacionOriginal.setId(presuasignacionAux.getId());
					presuasignacionOriginal.setVersionRow(presuasignacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuAsignacion presuasignacionAux:this.presuasignacions) {
				if(presuasignacionAux.getPresuAsignacionOriginal().getId().equals(presuasignacionOriginal.getId())) {
					existe=true;
					presuasignacionOriginal.setId(presuasignacionAux.getId());
					presuasignacionOriginal.setVersionRow(presuasignacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresuAsignacion(Boolean esParaCancelar) throws Exception {
		presuasignacionsAux=new ArrayList<PresuAsignacion>();
		presuasignacionAux=new PresuAsignacion();
		
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuAsignacion presuasignacionAux:this.presuasignacionLogic.getPresuAsignacions()) {
					if(presuasignacionAux.getId()<0) {
						presuasignacionsAux.add(presuasignacionAux);
					}		
				}
				this.iIdNuevoPresuAsignacion=0L;
				this.presuasignacionLogic.getPresuAsignacions().removeAll(presuasignacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuAsignacion presuasignacionAux:this.presuasignacions) {
					if(presuasignacionAux.getId()<0) {
						presuasignacionsAux.add(presuasignacionAux);
					}		
				}
				this.iIdNuevoPresuAsignacion=0L;
				this.presuasignacions.removeAll(presuasignacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresuAsignacion 
					&& this.presuasignacionLogic.getPresuAsignacions().size()>0
					) {
					presuasignacionAux=this.presuasignacionLogic.getPresuAsignacions().get(this.presuasignacionLogic.getPresuAsignacions().size() - 1);
				
					if(presuasignacionAux.getId()<0) {
						this.presuasignacionLogic.getPresuAsignacions().remove(presuasignacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresuAsignacion && this.presuasignacions.size()>0) {
					presuasignacionAux=this.presuasignacions.get(this.presuasignacions.size() - 1);
				
					if(presuasignacionAux.getId()<0) {
						this.presuasignacions.remove(presuasignacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresuAsignacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presuasignacion.getId()<0) {
				this.presuasignacionLogic.getPresuAsignacions().remove(this.presuasignacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presuasignacion.getId()<0) {
				this.presuasignacions.remove(this.presuasignacion);
			}
		}			
	}
	
	public void setEstadosInicialesPresuAsignacion(List<PresuAsignacion> presuasignacionsAux) throws Exception {
		PresuAsignacionConstantesFunciones.setEstadosInicialesPresuAsignacion(presuasignacionsAux);
	}
	
	public void setEstadosInicialesPresuAsignacion(PresuAsignacion presuasignacionAux) throws Exception {
		PresuAsignacionConstantesFunciones.setEstadosInicialesPresuAsignacion(presuasignacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresuAsignacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresuAsignacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresuAsignacionActual()) {
				if(!this.isEsNuevoPresuAsignacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresuAsignacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresuAsignacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresuAsignacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Asignacion Presupuesto ?", "MANTENIMIENTO DE Asignacion Presupuesto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresuAsignacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresuAsignacion presuasignacion) throws Exception {
		PresuAsignacionConstantesFunciones.seleccionarAsignar(this.presuasignacion,presuasignacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresuAsignacion=this.isPermisoActualizarOriginalPresuAsignacion;
			
			
			this.seleccionarAsignar(presuasignacion);
			
			

			idEmpleadoActual=presuasignacion.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuAsignacionConstantesFunciones.quitarEspaciosPresuAsignacion(this.presuasignacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresuAsignacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presuasignacionSessionBean.setsFuncionBusquedaRapida(this.presuasignacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
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
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPresuAsignacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresuAsignacion(esParaCancelar);				
				this.cancelarNuevoPresuAsignacion(esParaCancelar);								
			}
			
			this.presuasignacion=new PresuAsignacion();
			
			this.inicializarPresuAsignacion();
			
			this.actualizarEstadoCeldasBotonesPresuAsignacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresuAsignacion() throws Exception {
		try {
			PresuAsignacionConstantesFunciones.inicializarPresuAsignacion(this.presuasignacion);
			
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
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presuasignacionLogic.getPresuAsignacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresuAsignacions(String sAccionBusqueda,List<PresuAsignacion> presuasignacionsParaReportes) throws Exception {
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
					sPathReporteFinal="PresuAsignacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresuAsignacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresuAsignacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresuAsignacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Asignacion Presupuestoes");		
		parameters.put("busquedapor", PresuAsignacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresuAsignacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresuAsignacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresuAsignacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresuAsignacion=new JRBeanArrayDataSource(PresuAsignacionJInternalFrame.TraerPresuAsignacionBeans(presuasignacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresuAsignacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresuAsignacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresuAsignacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresuAsignacionBean.TraerPresuAsignacionBeans(presuasignacionsParaReportes).toArray()));
							
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
				this.generarExcelReportePresuAsignacions(sAccionBusqueda,sTipoArchivoReporte,presuasignacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresuAsignacions(sAccionBusqueda,sTipoArchivoReporte,presuasignacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresuAsignacionActionPerformed(null);
					//this.generarExcelReportePresuAsignacions(sAccionBusqueda,sTipoArchivoReporte,presuasignacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresuAsignacions(sAccionBusqueda,sTipoArchivoReporte,presuasignacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresuAsignacions(sAccionBusqueda,sTipoArchivoReporte,presuasignacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresuAsignacions(sAccionBusqueda,sTipoArchivoReporte,presuasignacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresuAsignacions(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuAsignacion> presuasignacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuasignacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuAsignacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuAsignacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresuAsignacion presuasignacion : presuasignacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresuAsignacionConstantesFunciones.generarExcelReporteDataPresuAsignacion("NORMAL",row,workbook,presuasignacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asignacion Presupuesto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresuAsignacion(String sTipo,Row row,Workbook workbook) {
		
		PresuAsignacionConstantesFunciones.generarExcelReporteHeaderPresuAsignacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresuAsignacions(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuAsignacion> presuasignacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuasignacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuAsignacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresuAsignacion presuasignacion : presuasignacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresuAsignacionConstantesFunciones.getPresuAsignacionDescripcion(presuasignacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuasignacion.getpresuproyectocuenta_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuasignacion.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuasignacion.getcodigo_secuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuAsignacionConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuasignacion.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuAsignacionConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuasignacion.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuasignacion.getpresuestado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuasignacion.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asignacion Presupuesto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresuAsignacions(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuAsignacion> presuasignacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresuAsignacion> presuasignacionsRespaldo=null;
		
		classes=PresuAsignacionConstantesFunciones.getClassesRelationshipsOfPresuAsignacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presuasignacionLogic.setDatosCliente(this.datosCliente);
		this.presuasignacionLogic.setDatosDeep(this.datosDeep);
		this.presuasignacionLogic.setIsConDeep(true);
		
		presuasignacionsRespaldo=this.presuasignacionLogic.getPresuAsignacions();
		
		this.presuasignacionLogic.setPresuAsignacions(presuasignacionsParaReportes);	
		this.presuasignacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presuasignacionsParaReportes=this.presuasignacionLogic.getPresuAsignacions();
		this.presuasignacionLogic.setPresuAsignacions(presuasignacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuasignacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuAsignacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuAsignacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresuAsignacion presuasignacion : presuasignacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresuAsignacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresuAsignacionConstantesFunciones.generarExcelReporteDataPresuAsignacion("NORMAL",row,workbook,presuasignacion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PresuAsignacionConstantesFunciones.getPresuAsignacionDescripcion(presuasignacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asignacion Presupuesto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuAsignacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresuAsignacion() throws Exception {		
		this.startProcessPresuAsignacion(true);
	}
	
	public void startProcessPresuAsignacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresuAsignacion ,this.jPanelParametrosReportesPresuAsignacion, this.jScrollPanelDatosPresuAsignacion,this.jPanelPaginacionPresuAsignacion, this.jScrollPanelDatosEdicionPresuAsignacion, this.jPanelAccionesPresuAsignacion,this.jPanelAccionesFormularioPresuAsignacion,this.jmenuBarPresuAsignacion,this.jmenuBarDetallePresuAsignacion,this.jTtoolBarPresuAsignacion,this.jTtoolBarDetallePresuAsignacion);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuAsignacion=this.jTabbedPaneBusquedasPresuAsignacion; 
		
		final JPanel jPanelParametrosReportesPresuAsignacion=this.jPanelParametrosReportesPresuAsignacion;
		//final JScrollPane jScrollPanelDatosPresuAsignacion=this.jScrollPanelDatosPresuAsignacion;
		final JTable jTableDatosPresuAsignacion=this.jTableDatosPresuAsignacion;		
		final JPanel jPanelPaginacionPresuAsignacion=this.jPanelPaginacionPresuAsignacion;
		//final JScrollPane jScrollPanelDatosEdicionPresuAsignacion=this.jScrollPanelDatosEdicionPresuAsignacion;
		final JPanel jPanelAccionesPresuAsignacion=this.jPanelAccionesPresuAsignacion;
		
		JPanel jPanelCamposAuxiliarPresuAsignacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresuAsignacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			jPanelCamposAuxiliarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jPanelCamposPresuAsignacion;
			jPanelAccionesFormularioAuxiliarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jPanelAccionesFormularioPresuAsignacion;
		}
		
		final JPanel jPanelCamposPresuAsignacion=jPanelCamposAuxiliarPresuAsignacion;
		final JPanel jPanelAccionesFormularioPresuAsignacion=jPanelAccionesFormularioAuxiliarPresuAsignacion;
		
		
		final JMenuBar jmenuBarPresuAsignacion=this.jmenuBarPresuAsignacion;
		final JToolBar jTtoolBarPresuAsignacion=this.jTtoolBarPresuAsignacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresuAsignacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuAsignacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			jmenuBarDetalleAuxiliarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jmenuBarDetallePresuAsignacion;
			jTtoolBarDetalleAuxiliarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jTtoolBarDetallePresuAsignacion;
		}
		
		final JMenuBar jmenuBarDetallePresuAsignacion=jmenuBarDetalleAuxiliarPresuAsignacion;
		final JToolBar jTtoolBarDetallePresuAsignacion=jTtoolBarDetalleAuxiliarPresuAsignacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuAsignacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuAsignacion;
			processRunnable.jTableDatos=jTableDatosPresuAsignacion;
			processRunnable.jPanelCampos=jPanelCamposPresuAsignacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuAsignacion;
			processRunnable.jPanelAcciones=jPanelAccionesPresuAsignacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuAsignacion;
			
			
			processRunnable.jmenuBar=jmenuBarPresuAsignacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuAsignacion;
			processRunnable.jTtoolBar=jTtoolBarPresuAsignacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuAsignacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuAsignacion ,jPanelParametrosReportesPresuAsignacion,jTableDatosPresuAsignacion, /*jScrollPanelDatosPresuAsignacion,*/jPanelCamposPresuAsignacion,jPanelPaginacionPresuAsignacion, /*jScrollPanelDatosEdicionPresuAsignacion,*/ jPanelAccionesPresuAsignacion,jPanelAccionesFormularioPresuAsignacion,jmenuBarPresuAsignacion,jmenuBarDetallePresuAsignacion,jTtoolBarPresuAsignacion,jTtoolBarDetallePresuAsignacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuAsignacion ,jPanelParametrosReportesPresuAsignacion, jScrollPanelDatosPresuAsignacion,jPanelPaginacionPresuAsignacion, jScrollPanelDatosEdicionPresuAsignacion, jPanelAccionesPresuAsignacion,jPanelAccionesFormularioPresuAsignacion,jmenuBarPresuAsignacion,jmenuBarDetallePresuAsignacion,jTtoolBarPresuAsignacion,jTtoolBarDetallePresuAsignacion);
						
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
	
	public void finishProcessPresuAsignacion() {// throws Exception 
		this.finishProcessPresuAsignacion(true);
	}
	
	public void finishProcessPresuAsignacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresuAsignacion ,this.jPanelParametrosReportesPresuAsignacion, this.jScrollPanelDatosPresuAsignacion,this.jPanelPaginacionPresuAsignacion, this.jScrollPanelDatosEdicionPresuAsignacion, this.jPanelAccionesPresuAsignacion,this.jPanelAccionesFormularioPresuAsignacion,this.jmenuBarPresuAsignacion,this.jmenuBarDetallePresuAsignacion,this.jTtoolBarPresuAsignacion,this.jTtoolBarDetallePresuAsignacion);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuAsignacion=this.jTabbedPaneBusquedasPresuAsignacion; 
		
		final JPanel jPanelParametrosReportesPresuAsignacion=this.jPanelParametrosReportesPresuAsignacion;
		//final JScrollPane jScrollPanelDatosPresuAsignacion=this.jScrollPanelDatosPresuAsignacion;
		final JTable jTableDatosPresuAsignacion=this.jTableDatosPresuAsignacion;		
		final JPanel jPanelPaginacionPresuAsignacion=this.jPanelPaginacionPresuAsignacion;
		//final JScrollPane jScrollPanelDatosEdicionPresuAsignacion=this.jScrollPanelDatosEdicionPresuAsignacion;
		final JPanel jPanelAccionesPresuAsignacion=this.jPanelAccionesPresuAsignacion;
		
		JPanel jPanelCamposAuxiliarPresuAsignacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresuAsignacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			jPanelCamposAuxiliarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jPanelCamposPresuAsignacion;
			jPanelAccionesFormularioAuxiliarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jPanelAccionesFormularioPresuAsignacion;
		}
		
		final JPanel jPanelCamposPresuAsignacion=jPanelCamposAuxiliarPresuAsignacion;
		final JPanel jPanelAccionesFormularioPresuAsignacion=jPanelAccionesFormularioAuxiliarPresuAsignacion;
		
		
		final JMenuBar jmenuBarPresuAsignacion=this.jmenuBarPresuAsignacion;		
		final JToolBar jTtoolBarPresuAsignacion=this.jTtoolBarPresuAsignacion;
				
		JMenuBar jmenuBarDetalleAuxiliarPresuAsignacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuAsignacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			jmenuBarDetalleAuxiliarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jmenuBarDetallePresuAsignacion;
			jTtoolBarDetalleAuxiliarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jTtoolBarDetallePresuAsignacion;		
		}
		
		final JMenuBar jmenuBarDetallePresuAsignacion=jmenuBarDetalleAuxiliarPresuAsignacion;
		final JToolBar jTtoolBarDetallePresuAsignacion=jTtoolBarDetalleAuxiliarPresuAsignacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuAsignacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuAsignacion;
			processRunnable.jTableDatos=jTableDatosPresuAsignacion;
			processRunnable.jPanelCampos=jPanelCamposPresuAsignacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuAsignacion;
			processRunnable.jPanelAcciones=jPanelAccionesPresuAsignacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuAsignacion;
			
			
			processRunnable.jmenuBar=jmenuBarPresuAsignacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuAsignacion;
			processRunnable.jTtoolBar=jTtoolBarPresuAsignacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuAsignacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresuAsignacion ,jPanelParametrosReportesPresuAsignacion, jTableDatosPresuAsignacion,/*jScrollPanelDatosPresuAsignacion,*/jPanelCamposPresuAsignacion,jPanelPaginacionPresuAsignacion, /*jScrollPanelDatosEdicionPresuAsignacion,*/ jPanelAccionesPresuAsignacion,jPanelAccionesFormularioPresuAsignacion,jmenuBarPresuAsignacion,jmenuBarDetallePresuAsignacion,jTtoolBarPresuAsignacion,jTtoolBarDetallePresuAsignacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresuAsignacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresuAsignacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresuAsignacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresuAsignacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresuAsignacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresuAsignacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresuAsignacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresuAsignacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresuAsignacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presuasignacionConstantesFunciones.getsFinalQueryPresuAsignacion();
		String  finalQueryPaginacionTodos=this.presuasignacionConstantesFunciones.getsFinalQueryPresuAsignacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresuAsignacionConstantesFunciones.getArrayColumnasGlobalesNoPresuAsignacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresuAsignacionConstantesFunciones.getArrayColumnasGlobalesPresuAsignacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresuAsignacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presuasignacionsEliminados= new ArrayList<PresuAsignacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresuAsignacion();
		
				///*PresuAsignacionSessionBean*/this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
			
			if(this.presuasignacionSessionBean==null) {
				this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
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
					this.iNumeroPaginacion=PresuAsignacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresuAsignacionConstantesFunciones.getClassesForeignKeysOfPresuAsignacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presuasignacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presuasignacionsAux= new ArrayList<PresuAsignacion>();
			
				
			presuasignacionLogic.setDatosCliente(this.datosCliente);
			presuasignacionLogic.setDatosDeep(this.datosDeep);
			presuasignacionLogic.setIsConDeep(true);
			
			
			presuasignacionLogic.getPresuAsignacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presuasignacionLogic.getTodosPresuAsignacions(finalQueryGlobal,pagination);
					
					//presuasignacionLogic.getTodosPresuAsignacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presuasignacionLogic.getPresuAsignacions()==null|| presuasignacionLogic.getPresuAsignacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuasignacionsAux= new ArrayList<PresuAsignacion>();
							presuasignacionsAux.addAll(presuasignacionLogic.getPresuAsignacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuasignacionsAux= new ArrayList<PresuAsignacion>();
							presuasignacionsAux.addAll(presuasignacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuasignacionLogic.getTodosPresuAsignacions(finalQueryGlobal+"",this.pagination);												
							
							//presuasignacionLogic.getTodosPresuAsignacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresuAsignacions("Todos",presuasignacionLogic.getPresuAsignacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuasignacionLogic.setPresuAsignacions(new ArrayList<PresuAsignacion>());					
							presuasignacionLogic.getPresuAsignacions().addAll(presuasignacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuasignacions=new ArrayList<PresuAsignacion>();
							presuasignacions.addAll(presuasignacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresuAsignacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresuAsignacion=this.idActual;
				
				} else if(this.idPresuAsignacionActual!=null && this.idPresuAsignacionActual!=0L) {
					idPresuAsignacion=idPresuAsignacionActual;
				}
				
					
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndicePorId(idPresuAsignacion);
				
				this.presuasignacions=new ArrayList<PresuAsignacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presuasignacionLogic.getEntity(idPresuAsignacion);
					
					//presuasignacionLogic.getEntityWithConnection(idPresuAsignacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuasignacionLogic.setPresuAsignacions(new ArrayList<PresuAsignacion>());
					presuasignacionLogic.getPresuAsignacions().add(presuasignacionLogic.getPresuAsignacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuasignacions=new ArrayList<PresuAsignacion>();
					this.presuasignacions.add(presuasignacion);
				}
				
				if(presuasignacionLogic.getPresuAsignacion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuasignacionLogic.getPresuAsignacionsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuasignacionLogic.getPresuAsignacions()==null||presuasignacionLogic.getPresuAsignacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuasignacions==null|| presuasignacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuasignacionsAux=new ArrayList<PresuAsignacion>();
						presuasignacionsAux.addAll(presuasignacionLogic.getPresuAsignacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuasignacionsAux=new ArrayList<PresuAsignacion>();
							presuasignacionsAux.addAll(presuasignacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuasignacionLogic.getPresuAsignacionsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuAsignacions("FK_IdEmpleado",presuasignacionLogic.getPresuAsignacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuAsignacions("FK_IdEmpleado",presuasignacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuasignacionLogic.setPresuAsignacions(new ArrayList<PresuAsignacion>());
						presuasignacionLogic.getPresuAsignacions().addAll(presuasignacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuasignacions=new ArrayList<PresuAsignacion>();
							presuasignacions.addAll(presuasignacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPresuEstado")) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdPresuEstado(id_presu_estadoFK_IdPresuEstado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuasignacionLogic.getPresuAsignacionsFK_IdPresuEstado(finalQueryGlobal,pagination,id_presu_estadoFK_IdPresuEstado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdPresuEstado(id_presu_estadoFK_IdPresuEstado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdPresuEstado(id_presu_estadoFK_IdPresuEstado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuasignacionLogic.getPresuAsignacions()==null||presuasignacionLogic.getPresuAsignacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuasignacions==null|| presuasignacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuasignacionsAux=new ArrayList<PresuAsignacion>();
						presuasignacionsAux.addAll(presuasignacionLogic.getPresuAsignacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuasignacionsAux=new ArrayList<PresuAsignacion>();
							presuasignacionsAux.addAll(presuasignacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuasignacionLogic.getPresuAsignacionsFK_IdPresuEstado(finalQueryGlobal,pagination,id_presu_estadoFK_IdPresuEstado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdPresuEstado(id_presu_estadoFK_IdPresuEstado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdPresuEstado(id_presu_estadoFK_IdPresuEstado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuAsignacions("FK_IdPresuEstado",presuasignacionLogic.getPresuAsignacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuAsignacions("FK_IdPresuEstado",presuasignacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuasignacionLogic.setPresuAsignacions(new ArrayList<PresuAsignacion>());
						presuasignacionLogic.getPresuAsignacions().addAll(presuasignacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuasignacions=new ArrayList<PresuAsignacion>();
							presuasignacions.addAll(presuasignacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPresuProyectoCuenta")) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdPresuProyectoCuenta(id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuasignacionLogic.getPresuAsignacionsFK_IdPresuProyectoCuenta(finalQueryGlobal,pagination,id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdPresuProyectoCuenta(id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdPresuProyectoCuenta(id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuasignacionLogic.getPresuAsignacions()==null||presuasignacionLogic.getPresuAsignacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuasignacions==null|| presuasignacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuasignacionsAux=new ArrayList<PresuAsignacion>();
						presuasignacionsAux.addAll(presuasignacionLogic.getPresuAsignacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuasignacionsAux=new ArrayList<PresuAsignacion>();
							presuasignacionsAux.addAll(presuasignacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuasignacionLogic.getPresuAsignacionsFK_IdPresuProyectoCuenta(finalQueryGlobal,pagination,id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdPresuProyectoCuenta(id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuAsignacionConstantesFunciones.getDetalleIndiceFK_IdPresuProyectoCuenta(id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuAsignacions("FK_IdPresuProyectoCuenta",presuasignacionLogic.getPresuAsignacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuAsignacions("FK_IdPresuProyectoCuenta",presuasignacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuasignacionLogic.setPresuAsignacions(new ArrayList<PresuAsignacion>());
						presuasignacionLogic.getPresuAsignacions().addAll(presuasignacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuasignacions=new ArrayList<PresuAsignacion>();
							presuasignacions.addAll(presuasignacionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresuAsignacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresuAsignacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presuasignacionLogic.getPresuAsignacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuasignacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presuasignacionLogic.getPresuAsignacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuasignacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresuAsignacion presuasignacion) {
		Boolean permite=true;
		
		if(this.presuasignacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresuAsignacionConstantesFunciones.getOrderByListaPresuAsignacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresuAsignacionConstantesFunciones.getOrderByListaPresuAsignacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuAsignacion presuasignacion:presuasignacionLogic.getPresuAsignacions()) {
				if(presuasignacion.getsType().equals(Constantes2.S_TOTALES)) {
					presuasignacionTotales=presuasignacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuAsignacion presuasignacion:this.presuasignacions) {
				if(presuasignacion.getsType().equals(Constantes2.S_TOTALES)) {
					presuasignacionTotales=presuasignacion;
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
			this.presuasignacionAux=new PresuAsignacion();
			this.presuasignacionAux.setsType(Constantes2.S_TOTALES);
			this.presuasignacionAux.setIsNew(false);
			this.presuasignacionAux.setIsChanged(false);
			this.presuasignacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresuAsignacionConstantesFunciones.TotalizarValoresFilaPresuAsignacion(this.presuasignacionLogic.getPresuAsignacions(),this.presuasignacionAux);
				
				this.presuasignacionLogic.getPresuAsignacions().add(this.presuasignacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresuAsignacionConstantesFunciones.TotalizarValoresFilaPresuAsignacion(this.presuasignacions,this.presuasignacionAux);
				
				this.presuasignacions.add(this.presuasignacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presuasignacionTotales=new PresuAsignacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presuasignacionLogic.getPresuAsignacions().remove(presuasignacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presuasignacions.remove(presuasignacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presuasignacionTotales=new PresuAsignacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuAsignacion presuasignacion:presuasignacionLogic.getPresuAsignacions()) {
				if(presuasignacion.getsType().equals(Constantes2.S_TOTALES)) {
					presuasignacionTotales=presuasignacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuAsignacionConstantesFunciones.TotalizarValoresFilaPresuAsignacion(this.presuasignacionLogic.getPresuAsignacions(),presuasignacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuAsignacion presuasignacion:this.presuasignacions) {
				if(presuasignacion.getsType().equals(Constantes2.S_TOTALES)) {
					presuasignacionTotales=presuasignacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuAsignacionConstantesFunciones.TotalizarValoresFilaPresuAsignacion(this.presuasignacions,presuasignacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresuAsignacionsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuAsignacionsFK_IdPresuEstado()throws Exception {
		try {
			sAccionBusqueda="FK_IdPresuEstado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuAsignacionsFK_IdPresuProyectoCuenta()throws Exception {
		try {
			sAccionBusqueda="FK_IdPresuProyectoCuenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresuAsignacionsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuasignacionLogic.getPresuAsignacionsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuAsignacionsFK_IdPresuEstado(String sFinalQuery,Long id_presu_estado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuasignacionLogic.getPresuAsignacionsFK_IdPresuEstado(sFinalQuery,this.pagination,id_presu_estado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuAsignacionsFK_IdPresuProyectoCuenta(String sFinalQuery,Long id_presu_proyecto_cuenta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuasignacionLogic.getPresuAsignacionsFK_IdPresuProyectoCuenta(sFinalQuery,this.pagination,id_presu_proyecto_cuenta);
				
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
	
	public void inicializarPermisosPresuAsignacion() {
		this.isPermisoTodoPresuAsignacion=false;
		this.isPermisoNuevoPresuAsignacion=false;
		this.isPermisoActualizarPresuAsignacion=false;
		this.isPermisoActualizarOriginalPresuAsignacion=false;
		this.isPermisoEliminarPresuAsignacion=false;
		this.isPermisoGuardarCambiosPresuAsignacion=false;
		this.isPermisoConsultaPresuAsignacion=false;
		this.isPermisoBusquedaPresuAsignacion=false;
		this.isPermisoReportePresuAsignacion=false;		
		this.isPermisoOrdenPresuAsignacion=false;		
		this.isPermisoPaginacionMedioPresuAsignacion=false;		
		this.isPermisoPaginacionAltoPresuAsignacion=false;
		this.isPermisoPaginacionTodoPresuAsignacion=false;
		this.isPermisoCopiarPresuAsignacion=false;		
		this.isPermisoVerFormPresuAsignacion=false;		
		this.isPermisoDuplicarPresuAsignacion=false;		
		this.isPermisoOrdenPresuAsignacion=false;		
	}
	
	public void setPermisosUsuarioPresuAsignacion(Boolean isPermiso) {
		this.isPermisoTodoPresuAsignacion=isPermiso;
		this.isPermisoNuevoPresuAsignacion=isPermiso;
		this.isPermisoActualizarPresuAsignacion=isPermiso;
		this.isPermisoActualizarOriginalPresuAsignacion=isPermiso;
		this.isPermisoEliminarPresuAsignacion=isPermiso;
		this.isPermisoGuardarCambiosPresuAsignacion=isPermiso;
		this.isPermisoConsultaPresuAsignacion=isPermiso;
		this.isPermisoBusquedaPresuAsignacion=isPermiso;
		this.isPermisoReportePresuAsignacion=isPermiso;
		this.isPermisoOrdenPresuAsignacion=isPermiso;		
		this.isPermisoPaginacionMedioPresuAsignacion=isPermiso;		
		this.isPermisoPaginacionAltoPresuAsignacion=isPermiso;		
		this.isPermisoPaginacionTodoPresuAsignacion=isPermiso;		
		this.isPermisoCopiarPresuAsignacion=isPermiso;		
		this.isPermisoVerFormPresuAsignacion=isPermiso;		
		this.isPermisoDuplicarPresuAsignacion=isPermiso;
		this.isPermisoOrdenPresuAsignacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresuAsignacion(Boolean isPermiso) {
		//this.isPermisoTodoPresuAsignacion=isPermiso;
		this.isPermisoNuevoPresuAsignacion=isPermiso;
		this.isPermisoActualizarPresuAsignacion=isPermiso;
		this.isPermisoActualizarOriginalPresuAsignacion=isPermiso;
		this.isPermisoEliminarPresuAsignacion=isPermiso;
		this.isPermisoGuardarCambiosPresuAsignacion=isPermiso;
		//this.isPermisoConsultaPresuAsignacion=isPermiso;
		//this.isPermisoBusquedaPresuAsignacion=isPermiso;
		//this.isPermisoReportePresuAsignacion=isPermiso;
		//this.isPermisoOrdenPresuAsignacion=isPermiso;		
		//this.isPermisoPaginacionMedioPresuAsignacion=isPermiso;		
		//this.isPermisoPaginacionAltoPresuAsignacion=isPermiso;		
		//this.isPermisoPaginacionTodoPresuAsignacion=isPermiso;		
		//this.isPermisoCopiarPresuAsignacion=isPermiso;		
		//this.isPermisoDuplicarPresuAsignacion=isPermiso;
		//this.isPermisoOrdenPresuAsignacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresuAsignacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PresuAsignacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresuAsignacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresuAsignacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPresuAsignacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresuAsignacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresuAsignacionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPresuAsignacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresuAsignacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresuAsignacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresuAsignacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresuAsignacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresuAsignacion=this.isPermisoActualizarPresuAsignacion;
			this.isPermisoEliminarPresuAsignacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresuAsignacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresuAsignacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresuAsignacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresuAsignacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresuAsignacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuAsignacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresuAsignacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresuAsignacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresuAsignacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresuAsignacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresuAsignacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresuAsignacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuAsignacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresuAsignacion.setToolTipText(this.jTableDatosPresuAsignacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresuAsignacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresuAsignacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresuAsignacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresuAsignacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresuAsignacion() throws Exception {
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
	public void inicializarCombosForeignKeyPresuAsignacionListas()throws Exception {
		try	{						
			
				this.presuproyectocuentasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.presuestadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresuAsignacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresuAsignacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresuAsignacionListas(false);
			} else {
			
				this.cargarCombosForeignKeyPresuProyectoCuentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPresuEstadoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPresuProyectoCuentaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.presuproyectocuentasForeignKey==null||this.presuproyectocuentasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PresuProyectoCuentaConstantesFunciones.getArrayColumnasGlobalesPresuProyectoCuenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuProyectoCuentaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PresuProyectoCuentaConstantesFunciones.SFINALQUERY;

				this.cargarCombosPresuProyectoCuentasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyPresuEstadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.presuestadosForeignKey==null||this.presuestadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PresuEstadoConstantesFunciones.getArrayColumnasGlobalesPresuEstado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuEstadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PresuEstadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPresuEstadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPresuAsignacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PresuAsignacionParameterReturnGeneral presuasignacionReturnGeneral=new PresuAsignacionParameterReturnGeneral();
						
			


				String finalQueryGlobalPresuProyectoCuenta="";

				if(((this.presuproyectocuentasForeignKey==null||this.presuproyectocuentasForeignKey.size()<=0) && this.presuasignacionConstantesFunciones.cargarid_presu_proyecto_cuentaPresuAsignacion)
					 || (this.esRecargarFks && this.presuasignacionConstantesFunciones.cargarid_presu_proyecto_cuentaPresuAsignacion)) {

					if(!this.presuasignacionSessionBean.getisBusquedaDesdeForeignKeySesionPresuProyectoCuenta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PresuProyectoCuentaConstantesFunciones.getArrayColumnasGlobalesPresuProyectoCuenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPresuProyectoCuenta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuProyectoCuentaConstantesFunciones.TABLENAME);

						finalQueryGlobalPresuProyectoCuenta=Funciones.GetFinalQueryAppend(finalQueryGlobalPresuProyectoCuenta, "");
						finalQueryGlobalPresuProyectoCuenta+=PresuProyectoCuentaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPresuProyectoCuentasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPresuProyectoCuenta=" WHERE " + ConstantesSql.ID + "="+presuasignacionSessionBean.getlidPresuProyectoCuentaActual();
					}
				} else {
					finalQueryGlobalPresuProyectoCuenta="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.presuasignacionConstantesFunciones.cargarid_empleadoPresuAsignacion)
					 || (this.esRecargarFks && this.presuasignacionConstantesFunciones.cargarid_empleadoPresuAsignacion)) {

					if(!this.presuasignacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+presuasignacionSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalPresuEstado="";

				if(((this.presuestadosForeignKey==null||this.presuestadosForeignKey.size()<=0) && this.presuasignacionConstantesFunciones.cargarid_presu_estadoPresuAsignacion)
					 || (this.esRecargarFks && this.presuasignacionConstantesFunciones.cargarid_presu_estadoPresuAsignacion)) {

					if(!this.presuasignacionSessionBean.getisBusquedaDesdeForeignKeySesionPresuEstado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PresuEstadoConstantesFunciones.getArrayColumnasGlobalesPresuEstado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPresuEstado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuEstadoConstantesFunciones.TABLENAME);

						finalQueryGlobalPresuEstado=Funciones.GetFinalQueryAppend(finalQueryGlobalPresuEstado, "");
						finalQueryGlobalPresuEstado+=PresuEstadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPresuEstadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPresuEstado=" WHERE " + ConstantesSql.ID + "="+presuasignacionSessionBean.getlidPresuEstadoActual();
					}
				} else {
					finalQueryGlobalPresuEstado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				presuasignacionReturnGeneral=presuasignacionLogic.cargarCombosLoteForeignKeyPresuAsignacion(finalQueryGlobalPresuProyectoCuenta,finalQueryGlobalEmpleado,finalQueryGlobalPresuEstado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPresuProyectoCuenta.equals("NONE")) {
				this.presuproyectocuentasForeignKey=presuasignacionReturnGeneral.getpresuproyectocuentasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=presuasignacionReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalPresuEstado.equals("NONE")) {
				this.presuestadosForeignKey=presuasignacionReturnGeneral.getpresuestadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresuAsignacion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPresuProyectoCuenta();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyPresuEstado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPresuProyectoCuenta()throws Exception {
		try {
			if(this.presuasignacionSessionBean==null) {
				this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
			}

			if(!this.presuasignacionSessionBean.getisBusquedaDesdeForeignKeySesionPresuProyectoCuenta()) {
				PresuProyectoCuenta presuproyectocuenta=new PresuProyectoCuenta();
				PresuProyectoCuentaConstantesFunciones.setPresuProyectoCuentaDescripcion(presuproyectocuenta,Constantes.SMENSAJE_ESCOJA_OPCION);
				presuproyectocuenta.setId(null);

				if(!PresuProyectoCuentaConstantesFunciones.ExisteEnLista(this.presuproyectocuentasForeignKey,presuproyectocuenta,true)) {

					this.presuproyectocuentasForeignKey.add(0,presuproyectocuenta);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.presuasignacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyPresuEstado()throws Exception {
		try {

			if(!this.presuasignacionSessionBean.getisBusquedaDesdeForeignKeySesionPresuEstado()) {
				PresuEstado presuestado=new PresuEstado();
				PresuEstadoConstantesFunciones.setPresuEstadoDescripcion(presuestado,Constantes.SMENSAJE_ESCOJA_OPCION);
				presuestado.setId(null);

				if(!PresuEstadoConstantesFunciones.ExisteEnLista(this.presuestadosForeignKey,presuestado,true)) {

					this.presuestadosForeignKey.add(0,presuestado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPresuAsignacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresuAsignacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresuAsignacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.presuasignacion.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuAsignacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresuAsignacion(PresuAsignacion presuasignacion)throws Exception {	
		try {
			
			this.setActualPresuProyectoCuentaForeignKey(presuasignacion.getid_presu_proyecto_cuenta(),false,"Formulario");
			this.setActualEmpleadoForeignKey(presuasignacion.getid_empleado(),false,"Formulario");
			this.setActualPresuEstadoForeignKey(presuasignacion.getid_presu_estado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresuAsignacion(PresuAsignacion presuasignacion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(presuasignacion.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoPresuAsignacion")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(presuasignacion.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresuAsignacion()throws Exception {	
		try {
			
			this.setActualPresuProyectoCuentaForeignKey(this.presuasignacionConstantesFunciones.getid_presu_proyecto_cuenta(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.presuasignacionConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualPresuEstadoForeignKey(this.presuasignacionConstantesFunciones.getid_presu_estado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresuAsignacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresuAsignacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresuAsignacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresuAsignacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresuAsignacion()throws Exception {
		try {
			

			this.cargarCombosFramePresuProyectoCuentasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFramePresuEstadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresuAsignacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePresuProyectoCuentasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePresuEstadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresuAsignacion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion!=null && this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion!=null && this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion!=null && this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public PresuAsignacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresuAsignacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresuAsignacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presuasignacionSessionBean=new PresuAsignacionSessionBean(); 
		this.presuasignacionConstantesFunciones=new PresuAsignacionConstantesFunciones(); 
		this.presuasignacionBean=new PresuAsignacion();//(this.presuasignacionConstantesFunciones); 		
		this.presuasignacionReturnGeneral=new PresuAsignacionParameterReturnGeneral(); 
		
		this.presuasignacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuasignacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresuAsignacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresuAsignacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresuAsignacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresuAsignacion(true);
			
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
			
			this.presuasignacionConstantesFunciones=new PresuAsignacionConstantesFunciones(); 
			this.presuasignacionBean=new PresuAsignacion();//this.presuasignacionConstantesFunciones); 			
			this.presuasignacionReturnGeneral=new PresuAsignacionParameterReturnGeneral(); 
		
			PresuAsignacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Asignacion Presupuesto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.presuasignacion=new PresuAsignacion();
			this.presuasignacions = new ArrayList<PresuAsignacion>();
			this.presuasignacionsAux = new ArrayList<PresuAsignacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic=new PresuAsignacionLogic();
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}
			
			//this.presuasignacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presuasignacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresuAsignacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresuAsignacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuAsignacion);	
					}
					
					if(this.jInternalFrameImportacionPresuAsignacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuAsignacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresuAsignacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresuAsignacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuAsignacion);
				this.jInternalFrameDetalleFormPresuAsignacion.setVisible(false);
				this.jInternalFrameDetalleFormPresuAsignacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuAsignacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuAsignacion);
					this.jInternalFrameReporteDinamicoPresuAsignacion.setVisible(false);
					this.jInternalFrameReporteDinamicoPresuAsignacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresuAsignacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresuAsignacion);
					this.jInternalFrameImportacionPresuAsignacion.setVisible(false);
					this.jInternalFrameImportacionPresuAsignacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresuAsignacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresuAsignacion);
					this.jInternalFrameOrderByPresuAsignacion.setVisible(false);
					this.jInternalFrameOrderByPresuAsignacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresuAsignacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresuAsignacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presuasignacionReturnGeneral=new PresuAsignacionParameterReturnGeneral();
			
			this.presuasignacionParameterGeneral=new PresuAsignacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presuasignacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresuAsignacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuAsignacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presuasignacionSessionBean.getEsGuardarRelacionado(),this.presuasignacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuAsignacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presuasignacionSessionBean.getEsGuardarRelacionado(),this.presuasignacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresuAsignacion=false;
			this.isVisibilidadCeldaDuplicarPresuAsignacion=true;
			this.isVisibilidadCeldaCopiarPresuAsignacion=true;
			this.isVisibilidadCeldaVerFormPresuAsignacion=true;
			this.isVisibilidadCeldaOrdenPresuAsignacion=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=false;
			this.isVisibilidadCeldaModificarPresuAsignacion=false;
			this.isVisibilidadCeldaActualizarPresuAsignacion=false;
			this.isVisibilidadCeldaEliminarPresuAsignacion=false;
			this.isVisibilidadCeldaCancelarPresuAsignacion=false;
			this.isVisibilidadCeldaGuardarPresuAsignacion=false;
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdPresuEstado=true;
			this.isVisibilidadFK_IdPresuProyectoCuenta=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresuAsignacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresuAsignacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresuAsignacion(false);
			
			this.setPermisosUsuarioPresuAsignacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuasignacionSessionBean.getEsGuardarRelacionado() 
				|| (this.presuasignacionSessionBean.getEsGuardarRelacionado() && this.presuasignacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresuAsignacionClasesRelacionadas();
			}
			
			if(this.presuasignacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresuAsignacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresuAsignacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresuAsignacion();
			}
			
			if(!this.isPermisoBusquedaPresuAsignacion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresuAsignacion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresuAsignacion,this.isPermisoPaginacionMedioPresuAsignacion,this.isPermisoPaginacionTodoPresuAsignacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresuAsignacionConstantesFunciones.getTiposSeleccionarPresuAsignacion());
				
				this.tiposColumnasSelect=PresuAsignacionConstantesFunciones.getTiposSeleccionarPresuAsignacion(true);
				
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
			//if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresuAsignacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPresuAsignacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPresuAsignacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuAsignacion() ;
			
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
			
			this.presuproyectocuentaLogic=new PresuProyectoCuentaLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.presuestadoLogic=new PresuEstadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				presuasignacionImplementable= (PresuAsignacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuAsignacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presuasignacionImplementableHome= (PresuAsignacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuAsignacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presuasignacions= new ArrayList<PresuAsignacion>();
			this.presuasignacionsEliminados= new ArrayList<PresuAsignacion>();
						
			this.isEsNuevoPresuAsignacion=false;
			this.esParaAccionDesdeFormularioPresuAsignacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.presuproyectocuentasForeignKey=new ArrayList<PresuProyectoCuenta>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.presuestadosForeignKey=new ArrayList<PresuEstado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresuAsignacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresuAsignacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresuAsignacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresuAsignacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresuAsignacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresuAsignacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresuAsignacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresuAsignacion();
			}
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresuAsignacion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresuAsignacion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresuAsignacion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresuAsignacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresuAsignacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresuAsignacion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresuAsignacion")) {
				iIndex=this.jInternalFrameDetalleFormPresuAsignacion.jTabbedPaneRelacionesPresuAsignacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresuAsignacion.jTabbedPaneRelacionesPresuAsignacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresuAsignacion();	
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
	
	public void cargarCombosForeignKeyPresuAsignacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresuAsignacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresuAsignacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresuAsignacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresuAsignacion();
		
		this.cargarCombosFrameForeignKeyPresuAsignacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresuAsignacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresuAsignacion();
		}
	}
	
	

	public void cargarCombosForeignKeyPresuProyectoCuenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPresuProyectoCuentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPresuProyectoCuenta();
				this.cargarCombosFramePresuProyectoCuentasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPresuProyectoCuenta(this.presuproyectocuentasForeignKey);

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

	public void cargarCombosForeignKeyPresuEstado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPresuEstadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPresuEstado();
				this.cargarCombosFramePresuEstadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPresuEstado(this.presuestadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPresuAsignacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presuasignacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
			
			if(jTableDatosPresuAsignacion.getRowCount()>=1) {
				jTableDatosPresuAsignacion.removeRowSelectionInterval(0, jTableDatosPresuAsignacion.getRowCount()-1);						
			}
			
			this.isEsNuevoPresuAsignacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresuAsignacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresuAsignacion(true);			
			//this.presuasignacion=new PresuAsignacion();
			//this.presuasignacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuAsignacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuAsignacion() ;
			
			if(PresuAsignacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuAsignacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presuasignacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);				
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
			if(this.presuasignacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresuAsignacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresuAsignacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresuAsignacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresuAsignacion.getSelectedRows().length;			
			}
			
			presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresuAsignacion--;			
				//PresuAsignacion presuasignacionAux= new PresuAsignacion();			
				//presuasignacionAux.setId(this.iIdNuevoPresuAsignacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresuAsignacion presuasignacionOrigen=new PresuAsignacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresuAsignacion presuasignacionOrigen : presuasignacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presuasignacionOrigen =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuasignacionOrigen =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresuAsignacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presuasignacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresuAsignacion(presuasignacionOrigen,this.presuasignacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presuasignacionLogic.getPresuAsignacions().add(this.presuasignacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presuasignacions.add(this.presuasignacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresuAsignacion(false);
				
				this.jTableDatosPresuAsignacion.setRowSelectionInterval(this.getIndiceNuevoPresuAsignacion(), this.getIndiceNuevoPresuAsignacion());
				
				int iLastRow =  this.jTableDatosPresuAsignacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuAsignacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuAsignacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuAsignacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();									
		
			PresuAsignacion presuasignacionOrigen=new PresuAsignacion();
			PresuAsignacion presuasignacionDestino=new PresuAsignacion();
				
			presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresuAsignacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presuasignacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresuAsignacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuasignacionOrigen =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presuasignacionOrigen =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuasignacionDestino =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presuasignacionDestino =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presuasignacionOrigen =presuasignacionsSeleccionados.get(0);
				presuasignacionDestino =presuasignacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresuAsignacion(presuasignacionOrigen,presuasignacionDestino,true,false);
				
				presuasignacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presuasignacionDestino,presuasignacionLogic.getPresuAsignacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuasignacionDestino,presuasignacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresuAsignacion(false);
				
				//this.jTableDatosPresuAsignacion.setRowSelectionInterval(this.getIndiceNuevoPresuAsignacion(), this.getIndiceNuevoPresuAsignacion());
				
				int iLastRow =  this.jTableDatosPresuAsignacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuAsignacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuAsignacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuAsignacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresuAsignacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresuAsignacion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresuAsignacion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresuAsignacion.setVisible(!isVisible);
			this.jPanelPaginacionPresuAsignacion.setVisible(!isVisible);
			this.jPanelAccionesPresuAsignacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresuAsignacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresuAsignacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresuAsignacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresuAsignacion();
			
			this.abrirFrameOrderByPresuAsignacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresuAsignacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresuAsignacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuAsignacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresuAsignacion.isMaximum()) {
					this.jInternalFrameDetalleFormPresuAsignacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresuAsignacion.setSize(this.jInternalFrameDetalleFormPresuAsignacion.iWidthFormulario,this.jInternalFrameDetalleFormPresuAsignacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresuAsignacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresuAsignacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresuAsignacion.isMaximum()) {
						this.jInternalFrameDetalleFormPresuAsignacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresuAsignacion.jContentPaneDetallePresuAsignacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresuAsignacion.jTabbedPaneRelacionesPresuAsignacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresuAsignacion.jContentPaneDetallePresuAsignacion.getWidth(),PresuAsignacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuAsignacion.jTabbedPaneRelacionesPresuAsignacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresuAsignacion.jContentPaneDetallePresuAsignacion.getWidth(),PresuAsignacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuAsignacion.jTabbedPaneRelacionesPresuAsignacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresuAsignacion.jContentPaneDetallePresuAsignacion.getWidth(),PresuAsignacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresuAsignacion.setVisible(true);
	        this.jInternalFrameDetalleFormPresuAsignacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresuAsignacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresuAsignacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresuAsignacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuAsignacion,false,this);
				} else {
					this.jInternalFrameOrderByPresuAsignacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuAsignacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresuAsignacion);
				this.jInternalFrameOrderByPresuAsignacion.setVisible(false);
				this.jInternalFrameOrderByPresuAsignacion.setSelected(false);
				
				this.jInternalFrameOrderByPresuAsignacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuAsignacion"));
				
				this.inicializarActualizarBindingTablaOrderByPresuAsignacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresuAsignacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresuAsignacion==null) {
				
				this.jInternalFrameImportacionPresuAsignacion=new ImportacionJInternalFrame(PresuAsignacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuAsignacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresuAsignacion);
				this.jInternalFrameImportacionPresuAsignacion.setVisible(false);
				this.jInternalFrameImportacionPresuAsignacion.setSelected(false);


				this.jInternalFrameImportacionPresuAsignacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuAsignacion"));
				this.jInternalFrameImportacionPresuAsignacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuAsignacion"));
				this.jInternalFrameImportacionPresuAsignacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuAsignacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresuAsignacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresuAsignacion==null) {
				this.jInternalFrameReporteDinamicoPresuAsignacion=new ReporteDinamicoJInternalFrame(PresuAsignacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuAsignacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuAsignacion);
				this.jInternalFrameReporteDinamicoPresuAsignacion.setVisible(false);
				this.jInternalFrameReporteDinamicoPresuAsignacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresuAsignacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuAsignacion"));
				this.jInternalFrameReporteDinamicoPresuAsignacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuAsignacion"));
				this.jInternalFrameReporteDinamicoPresuAsignacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuAsignacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuAsignacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePresuAsignacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuAsignacion);
			
	       	this.jInternalFrameDetalleFormPresuAsignacion.setVisible(false);
	        this.jInternalFrameDetalleFormPresuAsignacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresuAsignacion.dispose();
			//this.jInternalFrameDetalleFormPresuAsignacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresuAsignacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresuAsignacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresuAsignacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresuAsignacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresuAsignacion.setVisible(true);
	        this.jInternalFrameImportacionPresuAsignacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresuAsignacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresuAsignacion.setVisible(true);
	        this.jInternalFrameOrderByPresuAsignacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresuAsignacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresuAsignacion.setVisible(false);
	        this.jInternalFrameOrderByPresuAsignacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresuAsignacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresuAsignacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresuAsignacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresuAsignacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresuAsignacion.setVisible(false);
	        this.jInternalFrameImportacionPresuAsignacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresuAsignacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresuAsignacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresuAsignacion(true);
			//this.isEsNuevoPresuAsignacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresuAsignacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuAsignacion(false) ;
			
			if(presuasignacionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PresuAsignacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuAsignacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuAsignacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresuAsignacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresuAsignacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresuAsignacion(true);
			//this.isEsNuevoPresuAsignacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presuasignacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresuAsignacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresuAsignacion(false) ;
			
			if(PresuAsignacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuAsignacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuAsignacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.presuasignacionConstantesFunciones.cargarid_empleadoPresuAsignacion) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPresuAsignacion(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPresuProyectoCuenta(List<PresuProyectoCuenta> presuproyectocuentasForeignKey)throws Exception{
		TableColumn tableColumnPresuProyectoCuenta=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA));
		TableCellEditor tableCellEditorPresuProyectoCuenta =tableColumnPresuProyectoCuenta.getCellEditor();

		PresuProyectoCuentaTableCell presuproyectocuentaTableCellFk=(PresuProyectoCuentaTableCell)tableCellEditorPresuProyectoCuenta;

		if(presuproyectocuentaTableCellFk!=null) {
			presuproyectocuentaTableCellFk.setpresuproyectocuentasForeignKey(presuproyectocuentasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuAsignacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//presuproyectocuentaTableCellFk.setRowActual(intSelectedRow);
			//presuproyectocuentaTableCellFk.setpresuproyectocuentasForeignKeyActual(presuproyectocuentasForeignKey);
		//}


		if(presuproyectocuentaTableCellFk!=null) {
			presuproyectocuentaTableCellFk.RecargarPresuProyectoCuentasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuAsignacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPresuEstado(List<PresuEstado> presuestadosForeignKey)throws Exception{
		TableColumn tableColumnPresuEstado=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO));
		TableCellEditor tableCellEditorPresuEstado =tableColumnPresuEstado.getCellEditor();

		PresuEstadoTableCell presuestadoTableCellFk=(PresuEstadoTableCell)tableCellEditorPresuEstado;

		if(presuestadoTableCellFk!=null) {
			presuestadoTableCellFk.setpresuestadosForeignKey(presuestadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuAsignacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//presuestadoTableCellFk.setRowActual(intSelectedRow);
			//presuestadoTableCellFk.setpresuestadosForeignKeyActual(presuestadosForeignKey);
		//}


		if(presuestadoTableCellFk!=null) {
			presuestadoTableCellFk.RecargarPresuEstadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresuAsignacion(false);
			
			//if(!this.isEsNuevoPresuAsignacion) {								
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
				
			}
			
			if(this.permiteMantenimiento(this.presuasignacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresuAsignacion=true;
					this.inicializarActualizarBindingTablaPresuAsignacion(false);
					this.isEsNuevoPresuAsignacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresuAsignacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresuAsignacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuAsignacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuAsignacion(false);
				
				this.habilitarDeshabilitarControlesPresuAsignacion(false);
			
												
				
				if(PresuAsignacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresuAsignacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresuAsignacionActionPerformed(evt,presuasignacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresuAsignacion(this.presuasignacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresuAsignacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presuasignacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presuasignacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresuAsignacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuAsignacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				this.presuasignacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				this.presuasignacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presuasignacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresuAsignacionModel) this.jTableDatosPresuAsignacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresuAsignacion=true;
				this.inicializarActualizarBindingTablaPresuAsignacion(false);
				this.isEsNuevoPresuAsignacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuAsignacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuAsignacion(false);
				
				this.habilitarDeshabilitarControlesPresuAsignacion(false);
				
				
				
				if(PresuAsignacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresuAsignacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresuAsignacion.getRowCount()>=1) {
				jTableDatosPresuAsignacion.removeRowSelectionInterval(0, jTableDatosPresuAsignacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresuAsignacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresuAsignacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuAsignacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuAsignacion(false) ;
			
			this.isEsNuevoPresuAsignacion=false;
			
			if(PresuAsignacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresuAsignacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresuAsignacion(false);
				
				//SI ES MANUAL
				if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresuAsignacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresuAsignacion--;			
			//PresuAsignacion presuasignacionAux= new PresuAsignacion();			
			//presuasignacionAux.setId(this.iIdNuevoPresuAsignacion);
			
			if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresuAsignacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
			
			this.presuasignacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presuasignacionLogic.getPresuAsignacions().add(this.presuasignacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presuasignacions.add(this.presuasignacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresuAsignacion(false);
			
			this.jTableDatosPresuAsignacion.setRowSelectionInterval(this.getIndiceNuevoPresuAsignacion(), this.getIndiceNuevoPresuAsignacion());
			
			int iLastRow =  this.jTableDatosPresuAsignacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresuAsignacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresuAsignacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresuAsignacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresuAsignacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuAsignacion(false);
			
			//SI ES MANUAL
			if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuAsignacion();
			}
			
			//this.abrirFrameTreePresuAsignacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Asignacion PresupuestoES ?", "MANTENIMIENTO DE Asignacion Presupuesto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresuAsignacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresuAsignacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presuasignacionReturnGeneral=presuasignacionLogic.procesarImportacionPresuAsignacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presuasignacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresuAsignacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresuAsignacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresuAsignacion.setFileImportacion(this.jInternalFrameImportacionPresuAsignacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresuAsignacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresuAsignacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresuAsignacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresuAsignacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();		

		presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresuAsignacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresuAsignacionBaseDesign.jrxml";
			
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
			
			this.generarReportePresuAsignacions("Todos",presuasignacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asignacion Presupuesto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PresuProyectoCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PresuProyectoCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PresuProyectoCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PresuProyectoCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSecuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSecuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSecuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSecuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuAsignacionConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuAsignacionConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PresuEstado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PresuEstado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PresuEstado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PresuEstado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoPresuAsignacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA:
					sNombreCampoCategoria="id_presu_proyecto_cuenta";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL:
					sNombreCampoCategoria="codigo_secuencial";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO:
					sNombreCampoCategoria="id_presu_estado";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA:
					sNombreCampoCategoriaValor="id_presu_proyecto_cuenta";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL:
					sNombreCampoCategoriaValor="codigo_secuencial";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO:
					sNombreCampoCategoriaValor="id_presu_estado";
					break;

				case PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Proyecto Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_presu_proyecto_cuenta");
					break;

				case PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_secuencial");
					break;

				case PresuAsignacionConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case PresuAsignacionConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_presu_estado");
					break;

				case PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();		
		
		presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuasignacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresuAsignacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA);
					iRow++;

					for(PresuAsignacion presuasignacion:presuasignacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuasignacion.getpresuproyectocuenta_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(PresuAsignacion presuasignacion:presuasignacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuasignacion.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL);
					iRow++;

					for(PresuAsignacion presuasignacion:presuasignacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuasignacion.getcodigo_secuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuAsignacionConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(PresuAsignacion presuasignacion:presuasignacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuasignacion.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuAsignacionConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(PresuAsignacion presuasignacion:presuasignacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuasignacion.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO);
					iRow++;

					for(PresuAsignacion presuasignacion:presuasignacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuasignacion.getpresuestado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(PresuAsignacion presuasignacion:presuasignacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuasignacion.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelPresuAsignacion(row);				
			//	iRow++;
			//}				
			
			//for(PresuAsignacion presuasignacionAux:presuasignacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresuAsignacion(presuasignacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asignacion Presupuesto",JOptionPane.INFORMATION_MESSAGE);
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
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuAsignacion(false);
			
			//SI ES MANUAL
			if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuAsignacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuAsignacion(false);
			
			//SI ES MANUAL
			if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuAsignacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuAsignacion(false);
			
			//SI ES MANUAL
			if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuAsignacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresuAsignacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresuAsignacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresuAsignacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresuAsignacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresuAsignacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresuAsignacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresuAsignacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresuAsignacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresuAsignacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresuAsignacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresuAsignacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresuAsignacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresuAsignacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresuAsignacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuAsignacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresuAsignacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresuAsignacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresuAsignacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresuAsignacion();
		
		this.inicializarActualizarBindingBotonesManualPresuAsignacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresuAsignacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuAsignacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresuAsignacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresuAsignacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresuAsignacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresuAsignacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresuAsignacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresuAsignacion.jCheckBoxPostAccionNuevoPresuAsignacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresuAsignacion.jCheckBoxPostAccionSinCerrarPresuAsignacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresuAsignacion.jCheckBoxPostAccionSinMensajePresuAsignacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresuAsignacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresuAsignacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresuAsignacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
				this.jInternalFrameDetalleFormPresuAsignacion.jCheckBoxPostAccionNuevoPresuAsignacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresuAsignacion.jCheckBoxPostAccionSinCerrarPresuAsignacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresuAsignacion.jCheckBoxPostAccionSinMensajePresuAsignacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresuAsignacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresuAsignacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresuAsignacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresuAsignacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresuAsignacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresuAsignacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresuAsignacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresuAsignacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresuAsignacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresuAsignacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresuAsignacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresuAsignacion(Boolean esInicializar) throws Exception {
		try	{	
			if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresuAsignacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresuAsignacion() throws Exception {
		try	{
			if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuAsignacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuAsignacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuAsignacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresuAsignacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresuAsignacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresuAsignacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresuAsignacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresuAsignacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresuAsignacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresuAsignacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresuAsignacion.addItem(reporte);
			}
			
			
			if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresuAsignacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresuAsignacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresuAsignacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresuAsignacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresuAsignacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresuAsignacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresuAsignacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresuAsignacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresuAsignacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuAsignacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuAsignacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuAsignacion!=null) {
				this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuAsignacion!=null) {
				this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresuAsignacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresuAsignacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuAsignacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuAsignacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PresuAsignacionConstantesFunciones.getTiposSeleccionarPresuAsignacion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PresuAsignacionConstantesFunciones.getTiposSeleccionarPresuAsignacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PresuAsignacionConstantesFunciones.getTiposSeleccionarPresuAsignacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuAsignacion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPresuAsignacion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresuAsignacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoPresuAsignacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.getSelectedItem()!=null){this.id_presu_estadoFK_IdPresuEstado=((PresuEstado)this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuAsignacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.getSelectedItem()!=null){this.id_presu_proyecto_cuentaFK_IdPresuProyectoCuenta=((PresuProyectoCuenta)this.jComboBoxid_presu_proyecto_cuentaFK_IdPresuProyectoCuentaPresuAsignacion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresuAsignacion(Boolean esInicializar) throws Exception {				
		if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresuAsignacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresuAsignacion() throws Exception {
		this.inicializarActualizarBindingTablaPresuAsignacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresuAsignacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresuAsignacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresuAsignacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presuasignacionLogic.getPresuAsignacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presuasignacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresuAsignacion.setModel(new PresuAsignacionModel(this.presuasignacionLogic.getPresuAsignacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresuAsignacion.setModel(new PresuAsignacionModel(this.presuasignacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresuAsignacion!=null && this.jInternalFrameOrderByPresuAsignacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresuAsignacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO,presuasignacionConstantesFunciones.resaltarSeleccionarPresuAsignacion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO,presuasignacionConstantesFunciones.resaltarSeleccionarPresuAsignacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,PresuAsignacionConstantesFunciones.LABEL_ID));

		if(this.presuasignacionConstantesFunciones.mostraridPresuAsignacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuAsignacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presuasignacionConstantesFunciones.resaltaridPresuAsignacion,this.presuasignacionConstantesFunciones.activaridPresuAsignacion,iSizeTabla,this,true,"idPresuAsignacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuasignacionConstantesFunciones.resaltaridPresuAsignacion,this.presuasignacionConstantesFunciones.activaridPresuAsignacion,this,true,"idPresuAsignacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA));

		if(this.presuasignacionConstantesFunciones.mostrarid_presu_proyecto_cuentaPresuAsignacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PresuProyectoCuentaTableCell(this.presuproyectocuentasForeignKey,this.presuasignacionConstantesFunciones.resaltarid_presu_proyecto_cuentaPresuAsignacion,this,this.presuasignacionConstantesFunciones.activarid_presu_proyecto_cuentaPresuAsignacion,iSizeTabla));
			tableColumn.setCellEditor(new PresuProyectoCuentaTableCell(this.presuproyectocuentasForeignKey,this.presuasignacionConstantesFunciones.resaltarid_presu_proyecto_cuentaPresuAsignacion,this,this.presuasignacionConstantesFunciones.activarid_presu_proyecto_cuentaPresuAsignacion,true,"id_presu_proyecto_cuentaPresuAsignacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.presuasignacionConstantesFunciones.mostrarid_empleadoPresuAsignacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.presuasignacionConstantesFunciones.resaltarid_empleadoPresuAsignacion,this,this.presuasignacionConstantesFunciones.activarid_empleadoPresuAsignacion,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.presuasignacionConstantesFunciones.resaltarid_empleadoPresuAsignacion,this,this.presuasignacionConstantesFunciones.activarid_empleadoPresuAsignacion,true,"id_empleadoPresuAsignacion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL));

		if(this.presuasignacionConstantesFunciones.mostrarcodigo_secuencialPresuAsignacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presuasignacionConstantesFunciones.resaltarcodigo_secuencialPresuAsignacion,this.presuasignacionConstantesFunciones.activarcodigo_secuencialPresuAsignacion,iSizeTabla,this,true,"codigo_secuencialPresuAsignacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuasignacionConstantesFunciones.resaltarcodigo_secuencialPresuAsignacion,this.presuasignacionConstantesFunciones.activarcodigo_secuencialPresuAsignacion,this,true,"codigo_secuencialPresuAsignacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,PresuAsignacionConstantesFunciones.LABEL_VALOR));

		if(this.presuasignacionConstantesFunciones.mostrarvalorPresuAsignacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuAsignacionConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presuasignacionConstantesFunciones.resaltarvalorPresuAsignacion,this.presuasignacionConstantesFunciones.activarvalorPresuAsignacion,iSizeTabla,this,true,"valorPresuAsignacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuasignacionConstantesFunciones.resaltarvalorPresuAsignacion,this.presuasignacionConstantesFunciones.activarvalorPresuAsignacion,this,true,"valorPresuAsignacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,PresuAsignacionConstantesFunciones.LABEL_FECHA));

		if(this.presuasignacionConstantesFunciones.mostrarfechaPresuAsignacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuAsignacionConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.presuasignacionConstantesFunciones.resaltarfechaPresuAsignacion,this.presuasignacionConstantesFunciones.activarfechaPresuAsignacion,iSizeTabla,this,true,"fechaPresuAsignacion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.presuasignacionConstantesFunciones.resaltarfechaPresuAsignacion,this.presuasignacionConstantesFunciones.activarfechaPresuAsignacion,this,true,"fechaPresuAsignacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO));

		if(this.presuasignacionConstantesFunciones.mostrarid_presu_estadoPresuAsignacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PresuEstadoTableCell(this.presuestadosForeignKey,this.presuasignacionConstantesFunciones.resaltarid_presu_estadoPresuAsignacion,this,this.presuasignacionConstantesFunciones.activarid_presu_estadoPresuAsignacion,iSizeTabla));
			tableColumn.setCellEditor(new PresuEstadoTableCell(this.presuestadosForeignKey,this.presuasignacionConstantesFunciones.resaltarid_presu_estadoPresuAsignacion,this,this.presuasignacionConstantesFunciones.activarid_presu_estadoPresuAsignacion,true,"id_presu_estadoPresuAsignacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.presuasignacionConstantesFunciones.mostrardescripcionPresuAsignacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presuasignacionConstantesFunciones.resaltardescripcionPresuAsignacion,this.presuasignacionConstantesFunciones.activardescripcionPresuAsignacion,iSizeTabla,this,true,"descripcionPresuAsignacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuasignacionConstantesFunciones.resaltardescripcionPresuAsignacion,this.presuasignacionConstantesFunciones.activardescripcionPresuAsignacion,this,true,"descripcionPresuAsignacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuAsignacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presuasignacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presuasignacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuAsignacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presuasignacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presuasignacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuAsignacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presuasignacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presuasignacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresuAsignacion.addColumn(tableColumn);
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
			
			this.jTableDatosPresuAsignacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresuAsignacion.moveColumn(this.jTableDatosPresuAsignacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresuAsignacion.moveColumn(this.jTableDatosPresuAsignacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresuAsignacion.moveColumn(this.jTableDatosPresuAsignacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresuAsignacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresuAsignacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresuAsignacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresuAsignacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresuAsignacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresuAsignacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresuAsignacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresuAsignacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresuAsignacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presuasignacionLogic.getPresuAsignacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presuasignacions.size()-1;
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
		//this.jTableDatosPresuAsignacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresuAsignacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresuAsignacion();
			
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
				
				//this.isEsNuevoPresuAsignacion=false;
					
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
				if(this.presuasignacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresuAsignacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuAsignacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuAsignacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presuasignacion.getsType().equals("DUPLICADO")
				   || this.presuasignacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresuAsignacion=true;
				
				} else {
					this.isEsNuevoPresuAsignacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
					if(this.presuasignacion.getId()>=0 && !this.presuasignacion.getIsNew()) {						
						this.isEsNuevoPresuAsignacion=false;
						
					} else {
						this.isEsNuevoPresuAsignacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresuAsignacion(esRelaciones);						
				
				this.seleccionarPresuAsignacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presuasignacion.getId()<0) {
					this.isEsNuevoPresuAsignacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresuAsignacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresuAsignacion(evt,rowIndex);
				}	
				
				if(this.presuasignacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresuAsignacion: " + this.dDif); 
					}
				}								
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresuAsignacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presuasignacion)) {
					if(this.presuasignacion.getId()>0) {
						this.presuasignacion.setIsDeleted(true);
						
						this.presuasignacionsEliminados.add(this.presuasignacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presuasignacionLogic.getPresuAsignacions().remove(this.presuasignacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presuasignacions.remove(this.presuasignacion);				
					}
					
					
					((PresuAsignacionModel) this.jTableDatosPresuAsignacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuAsignacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresuAsignacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresuAsignacion) {
			
			if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuAsignacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuAsignacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresuAsignacion(this.presuasignacion);
				}
				
				//ARCHITECTURE
				try {
					

					//PresuProyectoCuenta
					if(!this.presuasignacionConstantesFunciones.cargarid_presu_proyecto_cuentaPresuAsignacion || this.presuasignacionConstantesFunciones.event_dependid_presu_proyecto_cuentaPresuAsignacion) {
						//this.cargarCombosPresuProyectoCuentasForeignKeyLista(" where id="+this.presuasignacion.getid_presu_proyecto_cuenta());
									//this.inicializarActualizarBindingPresuAsignacion(false,false);
						this.presuproyectocuentasForeignKey=new ArrayList<PresuProyectoCuenta>();

						if(presuasignacion.getPresuProyectoCuenta()!=null) {
							this.presuproyectocuentasForeignKey.add(presuasignacion.getPresuProyectoCuenta());
						}

						this.addItemDefectoCombosForeignKeyPresuProyectoCuenta();
						this.cargarCombosFramePresuProyectoCuentasForeignKey("Todos");
					}
					this.setActualPresuProyectoCuentaForeignKey(this.presuasignacion.getid_presu_proyecto_cuenta(),false,"Formulario");

					//Empleado
					if(!this.presuasignacionConstantesFunciones.cargarid_empleadoPresuAsignacion || this.presuasignacionConstantesFunciones.event_dependid_empleadoPresuAsignacion) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.presuasignacion.getid_empleado());
									//this.inicializarActualizarBindingPresuAsignacion(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(presuasignacion.getEmpleado()!=null) {
							this.empleadosForeignKey.add(presuasignacion.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.presuasignacion.getid_empleado(),false,"Formulario");

					//PresuEstado
					if(!this.presuasignacionConstantesFunciones.cargarid_presu_estadoPresuAsignacion || this.presuasignacionConstantesFunciones.event_dependid_presu_estadoPresuAsignacion) {
						//this.cargarCombosPresuEstadosForeignKeyLista(" where id="+this.presuasignacion.getid_presu_estado());
									//this.inicializarActualizarBindingPresuAsignacion(false,false);
						this.presuestadosForeignKey=new ArrayList<PresuEstado>();

						if(presuasignacion.getPresuEstado()!=null) {
							this.presuestadosForeignKey.add(presuasignacion.getPresuEstado());
						}

						this.addItemDefectoCombosForeignKeyPresuEstado();
						this.cargarCombosFramePresuEstadosForeignKey("Todos");
					}
					this.setActualPresuEstadoForeignKey(this.presuasignacion.getid_presu_estado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresuAsignacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresuAsignacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuAsignacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuAsignacion(PresuAsignacion presuasignacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresuAsignacion(presuasignacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuAsignacion(PresuAsignacion presuasignacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresuAsignacion(presuasignacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresuAsignacion(presuasignacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresuAsignacion(presuasignacion);
	}
	
	public void setVariablesObjetoActualToFormularioPresuAsignacion(PresuAsignacion presuasignacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresuAsignacion.jLabelidPresuAsignacion.setText(presuasignacion.getId().toString());
			this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldcodigo_secuencialPresuAsignacion.setText(presuasignacion.getcodigo_secuencial().toString());
			this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldvalorPresuAsignacion.setText(presuasignacion.getvalor().toString());
			this.jInternalFrameDetalleFormPresuAsignacion.jDateChooserfechaPresuAsignacion.setDate(presuasignacion.getfecha());
			this.jInternalFrameDetalleFormPresuAsignacion.jTextAreadescripcionPresuAsignacion.setText(presuasignacion.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresuAsignacion presuasignacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presuasignacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresuAsignacion presuasignacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presuasignacionLocal=this.presuasignacion;
			} else {
				presuasignacionLocal=this.presuasignacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presuasignacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresuAsignacion(presuasignacionLocal,true);
					
					if(presuasignacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presuasignacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presuasignacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresuAsignacion(PresuAsignacion presuasignacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuAsignacion(presuasignacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(presuasignacion);
	}
	
	public void setVariablesFormularioToObjetoActualPresuAsignacion(PresuAsignacion presuasignacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuAsignacion(presuasignacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresuAsignacion(PresuAsignacion presuasignacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresuAsignacion.jLabelidPresuAsignacion.getText()==null || this.jInternalFrameDetalleFormPresuAsignacion.jLabelidPresuAsignacion.getText()=="" || this.jInternalFrameDetalleFormPresuAsignacion.jLabelidPresuAsignacion.getText()=="Id") {
				this.jInternalFrameDetalleFormPresuAsignacion.jLabelidPresuAsignacion.setText("0");
			}

			if(conColumnasBase) {presuasignacion.setId(Long.parseLong(this.jInternalFrameDetalleFormPresuAsignacion.jLabelidPresuAsignacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuAsignacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabelIdPresuAsignacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuasignacion.setcodigo_secuencial(Long.parseLong(this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldcodigo_secuencialPresuAsignacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabelcodigo_secuencialPresuAsignacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuasignacion.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldvalorPresuAsignacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuAsignacionConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabelvalorPresuAsignacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuasignacion.setfecha(this.jInternalFrameDetalleFormPresuAsignacion.jDateChooserfechaPresuAsignacion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuAsignacionConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabelfechaPresuAsignacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuasignacion.setdescripcion(this.jInternalFrameDetalleFormPresuAsignacion.jTextAreadescripcionPresuAsignacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuAsignacion.jLabeldescripcionPresuAsignacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuAsignacion(PresuAsignacion presuasignacionBean,PresuAsignacion presuasignacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && presuasignacionBean.getid_presu_proyecto_cuenta()!=null && !presuasignacionBean.getid_presu_proyecto_cuenta().equals(-1L))) {presuasignacion.setid_presu_proyecto_cuenta(presuasignacionBean.getid_presu_proyecto_cuenta());}
			if(conDefault || (!conDefault && presuasignacionBean.getid_empleado()!=null && !presuasignacionBean.getid_empleado().equals(-1L))) {presuasignacion.setid_empleado(presuasignacionBean.getid_empleado());}
			if(conDefault || (!conDefault && presuasignacionBean.getid_presu_estado()!=null && !presuasignacionBean.getid_presu_estado().equals(-1L))) {presuasignacion.setid_presu_estado(presuasignacionBean.getid_presu_estado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresuAsignacion(PresuAsignacion presuasignacionOrigen,PresuAsignacion presuasignacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presuasignacionOrigen.getId()!=null && !presuasignacionOrigen.getId().equals(0L))) {presuasignacion.setId(presuasignacionOrigen.getId());}}
			if(conDefault || (!conDefault && presuasignacionOrigen.getid_presu_proyecto_cuenta()!=null && !presuasignacionOrigen.getid_presu_proyecto_cuenta().equals(-1L))) {presuasignacion.setid_presu_proyecto_cuenta(presuasignacionOrigen.getid_presu_proyecto_cuenta());}
			if(conDefault || (!conDefault && presuasignacionOrigen.getid_empleado()!=null && !presuasignacionOrigen.getid_empleado().equals(-1L))) {presuasignacion.setid_empleado(presuasignacionOrigen.getid_empleado());}
			if(conDefault || (!conDefault && presuasignacionOrigen.getcodigo_secuencial()!=null && !presuasignacionOrigen.getcodigo_secuencial().equals(0L))) {presuasignacion.setcodigo_secuencial(presuasignacionOrigen.getcodigo_secuencial());}
			if(conDefault || (!conDefault && presuasignacionOrigen.getvalor()!=null && !presuasignacionOrigen.getvalor().equals(0.0))) {presuasignacion.setvalor(presuasignacionOrigen.getvalor());}
			if(conDefault || (!conDefault && presuasignacionOrigen.getfecha()!=null && !presuasignacionOrigen.getfecha().equals(new Date()))) {presuasignacion.setfecha(presuasignacionOrigen.getfecha());}
			if(conDefault || (!conDefault && presuasignacionOrigen.getid_presu_estado()!=null && !presuasignacionOrigen.getid_presu_estado().equals(-1L))) {presuasignacion.setid_presu_estado(presuasignacionOrigen.getid_presu_estado());}
			if(conDefault || (!conDefault && presuasignacionOrigen.getdescripcion()!=null && !presuasignacionOrigen.getdescripcion().equals(""))) {presuasignacion.setdescripcion(presuasignacionOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuAsignacion(PresuAsignacion presuasignacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuAsignacion.jLabelidPresuAsignacion.setText(presuasignacion.getId().toString());
			this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldcodigo_secuencialPresuAsignacion.setText(presuasignacion.getcodigo_secuencial().toString());
			this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldvalorPresuAsignacion.setText(presuasignacion.getvalor().toString());
			this.jInternalFrameDetalleFormPresuAsignacion.jDateChooserfechaPresuAsignacion.setDate(presuasignacion.getfecha());
			this.jInternalFrameDetalleFormPresuAsignacion.jTextAreadescripcionPresuAsignacion.setText(presuasignacion.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuAsignacion(PresuAsignacionBean presuasignacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuAsignacion.jLabelidPresuAsignacion.setText(presuasignacionBean.getId().toString());
			this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldcodigo_secuencialPresuAsignacion.setText(presuasignacionBean.getcodigo_secuencial().toString());
			this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldvalorPresuAsignacion.setText(presuasignacionBean.getvalor().toString());
			this.jInternalFrameDetalleFormPresuAsignacion.jDateChooserfechaPresuAsignacion.setDate(presuasignacionBean.getfecha());
			this.jInternalFrameDetalleFormPresuAsignacion.jTextAreadescripcionPresuAsignacion.setText(presuasignacionBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresuAsignacion(PresuAsignacionParameterReturnGeneral presuasignacionReturnGeneral,PresuAsignacionBean presuasignacionBean,Boolean conDefault) throws Exception { 
		try {
			PresuAsignacion presuasignacionLocal=new PresuAsignacion();
			
			presuasignacionLocal=presuasignacionReturnGeneral.getPresuAsignacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presuasignacionLocal.getId()!=null && !presuasignacionLocal.getId().equals(0L))) {presuasignacionBean.setId(presuasignacionLocal.getId());}}
			if(conDefault || (!conDefault && presuasignacionLocal.getid_presu_proyecto_cuenta()!=null && !presuasignacionLocal.getid_presu_proyecto_cuenta().equals(-1L))) {presuasignacionBean.setid_presu_proyecto_cuenta(presuasignacionLocal.getid_presu_proyecto_cuenta());}
			if(conDefault || (!conDefault && presuasignacionLocal.getid_empleado()!=null && !presuasignacionLocal.getid_empleado().equals(-1L))) {presuasignacionBean.setid_empleado(presuasignacionLocal.getid_empleado());}
			if(conDefault || (!conDefault && presuasignacionLocal.getcodigo_secuencial()!=null && !presuasignacionLocal.getcodigo_secuencial().equals(0L))) {presuasignacionBean.setcodigo_secuencial(presuasignacionLocal.getcodigo_secuencial());}
			if(conDefault || (!conDefault && presuasignacionLocal.getvalor()!=null && !presuasignacionLocal.getvalor().equals(0.0))) {presuasignacionBean.setvalor(presuasignacionLocal.getvalor());}
			if(conDefault || (!conDefault && presuasignacionLocal.getfecha()!=null && !presuasignacionLocal.getfecha().equals(new Date()))) {presuasignacionBean.setfecha(presuasignacionLocal.getfecha());}
			if(conDefault || (!conDefault && presuasignacionLocal.getid_presu_estado()!=null && !presuasignacionLocal.getid_presu_estado().equals(-1L))) {presuasignacionBean.setid_presu_estado(presuasignacionLocal.getid_presu_estado());}
			if(conDefault || (!conDefault && presuasignacionLocal.getdescripcion()!=null && !presuasignacionLocal.getdescripcion().equals(""))) {presuasignacionBean.setdescripcion(presuasignacionLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresuAsignacionGenerico(Long idPresuAsignacionSeleccionado,JComboBox jComboBoxPresuAsignacion,List<PresuAsignacion> presuasignacionsLocal)throws Exception {
		try {
			PresuAsignacion  presuasignacionTemp=null;

			for(PresuAsignacion presuasignacionAux:presuasignacionsLocal) {
				if(presuasignacionAux.getId()!=null && presuasignacionAux.getId().equals(idPresuAsignacionSeleccionado)) {
					presuasignacionTemp=presuasignacionAux;
					break;
				}
			}

			jComboBoxPresuAsignacion.setSelectedItem(presuasignacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresuAsignacionGenerico(JComboBox jComboBoxPresuAsignacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuAsignacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresuAsignacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuAsignacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresuAsignacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresuAsignacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresuAsignacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuasignacion=(PresuAsignacion) presuasignacionLogic.getPresuAsignacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presuasignacion =(PresuAsignacion) presuasignacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("PresuProyectoCuenta")) {
			//sDescripcion=this.getActualPresuProyectoCuentaForeignKeyDescripcion((Long)value);
			if(!presuasignacion.getIsNew() && !presuasignacion.getIsChanged() && !presuasignacion.getIsDeleted()) {
				sDescripcion=presuasignacion.getpresuproyectocuenta_descripcion();
			} else {
				//sDescripcion=this.getActualPresuProyectoCuentaForeignKeyDescripcion((Long)value);
				sDescripcion=presuasignacion.getpresuproyectocuenta_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!presuasignacion.getIsNew() && !presuasignacion.getIsChanged() && !presuasignacion.getIsDeleted()) {
				sDescripcion=presuasignacion.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=presuasignacion.getempleado_descripcion();
			}
		}

		if(sTipo.equals("PresuEstado")) {
			//sDescripcion=this.getActualPresuEstadoForeignKeyDescripcion((Long)value);
			if(!presuasignacion.getIsNew() && !presuasignacion.getIsChanged() && !presuasignacion.getIsDeleted()) {
				sDescripcion=presuasignacion.getpresuestado_descripcion();
			} else {
				//sDescripcion=this.getActualPresuEstadoForeignKeyDescripcion((Long)value);
				sDescripcion=presuasignacion.getpresuestado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresuAsignacion presuasignacionRow=new PresuAsignacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuasignacionRow=(PresuAsignacion) presuasignacionLogic.getPresuAsignacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presuasignacionRow=(PresuAsignacion) presuasignacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresuAsignacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresuAsignacion.setVisible((this.isVisibilidadCeldaNuevoPresuAsignacion && this.isPermisoNuevoPresuAsignacion));			
			this.jButtonDuplicarPresuAsignacion.setVisible((this.isVisibilidadCeldaDuplicarPresuAsignacion && this.isPermisoDuplicarPresuAsignacion));			
			this.jButtonCopiarPresuAsignacion.setVisible((this.isVisibilidadCeldaCopiarPresuAsignacion && this.isPermisoCopiarPresuAsignacion));
			this.jButtonVerFormPresuAsignacion.setVisible((this.isVisibilidadCeldaVerFormPresuAsignacion && this.isPermisoVerFormPresuAsignacion));
			
			this.jButtonAbrirOrderByPresuAsignacion.setVisible((this.isVisibilidadCeldaOrdenPresuAsignacion && this.isPermisoOrdenPresuAsignacion));			
			
			this.jButtonNuevoRelacionesPresuAsignacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion && this.isPermisoNuevoPresuAsignacion));			
			this.jButtonNuevoGuardarCambiosPresuAsignacion.setVisible((this.isVisibilidadCeldaNuevoPresuAsignacion && this.isPermisoNuevoPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion));
			
			if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonModificarPresuAsignacion.setVisible((this.isVisibilidadCeldaModificarPresuAsignacion && this.isPermisoActualizarPresuAsignacion));	
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonActualizarPresuAsignacion.setVisible((this.isVisibilidadCeldaActualizarPresuAsignacion && this.isPermisoActualizarPresuAsignacion));	
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonEliminarPresuAsignacion.setVisible((this.isVisibilidadCeldaEliminarPresuAsignacion && this.isPermisoEliminarPresuAsignacion));
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonCancelarPresuAsignacion.setVisible(this.isVisibilidadCeldaCancelarPresuAsignacion);							
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosPresuAsignacion.setVisible((this.isVisibilidadCeldaGuardarPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresuAsignacion.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaNuevoPresuAsignacion && this.isPermisoNuevoPresuAsignacion));						
			this.jButtonDuplicarToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaDuplicarPresuAsignacion && this.isPermisoDuplicarPresuAsignacion));						
			this.jButtonCopiarToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaCopiarPresuAsignacion && this.isPermisoCopiarPresuAsignacion));			
			this.jButtonVerFormToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaVerFormPresuAsignacion && this.isPermisoVerFormPresuAsignacion));			
			this.jButtonAbrirOrderByToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaOrdenPresuAsignacion && this.isPermisoOrdenPresuAsignacion));
			this.jButtonNuevoRelacionesToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion && this.isPermisoNuevoPresuAsignacion));			
			this.jButtonNuevoGuardarCambiosToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaNuevoPresuAsignacion && this.isPermisoNuevoPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion));			
			
			if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonModificarToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaModificarPresuAsignacion && this.isPermisoActualizarPresuAsignacion));	
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonActualizarToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaActualizarPresuAsignacion  && this.isPermisoActualizarPresuAsignacion));	
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonEliminarToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaEliminarPresuAsignacion && this.isPermisoEliminarPresuAsignacion));
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonCancelarToolBarPresuAsignacion.setVisible(this.isVisibilidadCeldaCancelarPresuAsignacion);				
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaGuardarPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresuAsignacion.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresuAsignacion.setVisible((this.isVisibilidadCeldaNuevoPresuAsignacion && this.isPermisoNuevoPresuAsignacion));			
			this.jMenuItemDuplicarPresuAsignacion.setVisible((this.isVisibilidadCeldaDuplicarPresuAsignacion && this.isPermisoDuplicarPresuAsignacion));			
			this.jMenuItemCopiarPresuAsignacion.setVisible((this.isVisibilidadCeldaCopiarPresuAsignacion && this.isPermisoCopiarPresuAsignacion));			
			this.jMenuItemVerFormPresuAsignacion.setVisible((this.isVisibilidadCeldaVerFormPresuAsignacion && this.isPermisoVerFormPresuAsignacion));			
			this.jMenuItemAbrirOrderByPresuAsignacion.setVisible((this.isVisibilidadCeldaOrdenPresuAsignacion && this.isPermisoOrdenPresuAsignacion));			
			//this.jMenuItemMostrarOcultarPresuAsignacion.setVisible((this.isVisibilidadCeldaOrdenPresuAsignacion && this.isPermisoOrdenPresuAsignacion));
			this.jMenuItemDetalleAbrirOrderByPresuAsignacion.setVisible((this.isVisibilidadCeldaOrdenPresuAsignacion && this.isPermisoOrdenPresuAsignacion));			
			//this.jMenuItemDetalleMostrarOcultarPresuAsignacion.setVisible((this.isVisibilidadCeldaOrdenPresuAsignacion && this.isPermisoOrdenPresuAsignacion));			
			this.jMenuItemNuevoRelacionesPresuAsignacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion && this.isPermisoNuevoPresuAsignacion));			
			this.jMenuItemNuevoGuardarCambiosPresuAsignacion.setVisible((this.isVisibilidadCeldaNuevoPresuAsignacion && this.isPermisoNuevoPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion));									
			
			if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemModificarPresuAsignacion.setVisible((this.isVisibilidadCeldaModificarPresuAsignacion && this.isPermisoActualizarPresuAsignacion));	
			this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemActualizarPresuAsignacion.setVisible((this.isVisibilidadCeldaActualizarPresuAsignacion && this.isPermisoActualizarPresuAsignacion));	
			this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemEliminarPresuAsignacion.setVisible((this.isVisibilidadCeldaEliminarPresuAsignacion && this.isPermisoEliminarPresuAsignacion));
			this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemCancelarPresuAsignacion.setVisible(this.isVisibilidadCeldaCancelarPresuAsignacion);				
			}
			
			this.jMenuItemGuardarCambiosPresuAsignacion.setVisible((this.isVisibilidadCeldaGuardarPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion));						
			this.jMenuItemGuardarCambiosTablaPresuAsignacion.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresuAsignacion=this.jButtonNuevoPresuAsignacion.isVisible();
			this.isVisibilidadCeldaDuplicarPresuAsignacion=this.jButtonDuplicarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaCopiarPresuAsignacion=this.jButtonCopiarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaVerFormPresuAsignacion=this.jButtonVerFormPresuAsignacion.isVisible();
			
			this.isVisibilidadCeldaOrdenPresuAsignacion=this.jButtonAbrirOrderByPresuAsignacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=this.jButtonNuevoRelacionesPresuAsignacion.isVisible();
			this.isVisibilidadCeldaModificarPresuAsignacion=this.jButtonModificarPresuAsignacion.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			this.isVisibilidadCeldaActualizarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jButtonActualizarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaEliminarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jButtonEliminarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaCancelarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jButtonCancelarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaGuardarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosPresuAsignacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=this.jButtonGuardarCambiosTablaPresuAsignacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresuAsignacion=this.jButtonNuevoToolBarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=this.jButtonNuevoRelacionesToolBarPresuAsignacion.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			this.isVisibilidadCeldaModificarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jButtonModificarToolBarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaActualizarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jButtonActualizarToolBarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaEliminarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jButtonEliminarToolBarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaCancelarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jButtonCancelarToolBarPresuAsignacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuAsignacion=this.jButtonGuardarCambiosToolBarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=this.jButtonGuardarCambiosTablaToolBarPresuAsignacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresuAsignacion=this.jMenuItemNuevoPresuAsignacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=this.jMenuItemNuevoRelacionesPresuAsignacion.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			this.isVisibilidadCeldaModificarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemModificarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaActualizarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemActualizarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaEliminarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemEliminarPresuAsignacion.isVisible();
			this.isVisibilidadCeldaCancelarPresuAsignacion=this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemCancelarPresuAsignacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuAsignacion=this.jMenuItemGuardarCambiosPresuAsignacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=this.jMenuItemGuardarCambiosTablaPresuAsignacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresuAsignacion(Boolean esInicializar) {
		if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presuasignacionSessionBean.getConGuardarRelaciones()) {
				//if(this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresuAsignacion();
			}
			
			this.inicializarActualizarBindingBotonesManualPresuAsignacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresuAsignacion() {
		this.jButtonNuevoPresuAsignacion.setVisible(this.isPermisoNuevoPresuAsignacion);			
		this.jButtonDuplicarPresuAsignacion.setVisible(this.isPermisoDuplicarPresuAsignacion);			
		this.jButtonCopiarPresuAsignacion.setVisible(this.isPermisoCopiarPresuAsignacion);			
		this.jButtonVerFormPresuAsignacion.setVisible(this.isPermisoVerFormPresuAsignacion);			
		
		this.jButtonAbrirOrderByPresuAsignacion.setVisible(this.isPermisoOrdenPresuAsignacion);					
		
		this.jButtonNuevoRelacionesPresuAsignacion.setVisible(this.isPermisoNuevoPresuAsignacion);			
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonModificarPresuAsignacion.setVisible(this.isPermisoActualizarPresuAsignacion);	
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonActualizarPresuAsignacion.setVisible(this.isPermisoActualizarPresuAsignacion);	
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonEliminarPresuAsignacion.setVisible(this.isPermisoEliminarPresuAsignacion);
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonCancelarPresuAsignacion.setVisible(this.isVisibilidadCeldaCancelarPresuAsignacion);						
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosPresuAsignacion.setVisible(this.isPermisoGuardarCambiosPresuAsignacion);							
		}
		
		this.jButtonGuardarCambiosTablaPresuAsignacion.setVisible(this.isPermisoActualizarPresuAsignacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresuAsignacion() {
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonModificarPresuAsignacion.setVisible(this.isPermisoActualizarPresuAsignacion);	
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonActualizarPresuAsignacion.setVisible(this.isPermisoActualizarPresuAsignacion);	
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonEliminarPresuAsignacion.setVisible(this.isPermisoEliminarPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonCancelarPresuAsignacion.setVisible(this.isVisibilidadCeldaCancelarPresuAsignacion);							
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosPresuAsignacion.setVisible((this.isVisibilidadCeldaGuardarPresuAsignacion && this.isPermisoGuardarCambiosPresuAsignacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresuAsignacion() {
		if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresuAsignacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresuAsignacion() {
	}
	
	public void jTableDatosPresuAsignacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresuAsignacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresuAsignacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.getpresuasignacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuasignacion==null) {
						this.presuasignacion = new PresuAsignacion();
					}

					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
				}

				if(this.presuasignacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presuasignacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuAsignacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_presu_proyecto_cuentaPresuAsignacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopresuproyectocuenta=true;

			idTienePermisopresuproyectocuenta=this.tienePermisosUsuarioEnPaginaWebPresuAsignacion(PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			if(idTienePermisopresuproyectocuenta) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuAsignacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuAsignacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuAsignacion(this.getpresuasignacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);

				this.presuproyectocuentaBeanSwingJInternalFrame=new PresuProyectoCuentaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.presuproyectocuentaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.presuproyectocuentaBeanSwingJInternalFrame.getPresuProyectoCuentaLogic().setConnexion(this.presuasignacionLogic.getConnexion());

				if(this.presuasignacion.getid_presu_proyecto_cuenta()!=null) {
					this.presuproyectocuentaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.presuproyectocuentaBeanSwingJInternalFrame.setIdActual(this.presuasignacion.getid_presu_proyecto_cuenta());
					this.presuproyectocuentaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.presuproyectocuentaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.presuproyectocuentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuProyectoCuenta();
				}

				JInternalFrameBase jinternalFrame =this.presuproyectocuentaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuAsignacion=(TitledBorder)this.jScrollPanelDatosPresuAsignacion.getBorder();
				TitledBorder titledBorderpresuproyectocuenta=(TitledBorder)this.presuproyectocuentaBeanSwingJInternalFrame.jScrollPanelDatosPresuProyectoCuenta.getBorder();

				titledBorderpresuproyectocuenta.setTitle(titledBorderPresuAsignacion.getTitle() + " -> Cuenta Contable Proyecto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_presu_proyecto_cuentaPresuAsignacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.getpresuasignacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuasignacion==null) {
						this.presuasignacion = new PresuAsignacion();
					}

					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
				}

				if(this.presuasignacion.getid_presu_proyecto_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_presu_proyecto_cuenta = "+this.presuasignacion.getid_presu_proyecto_cuenta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuAsignacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoPresuAsignacionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderPresuAsignacion=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosPresuAsignacion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPresuAsignacion=(TitledBorder)this.jScrollPanelDatosPresuAsignacion.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderPresuAsignacion.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoPresuAsignacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebPresuAsignacion(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuAsignacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuAsignacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuAsignacion(this.getpresuasignacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.presuasignacionLogic.getConnexion());

				if(this.presuasignacion.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.presuasignacion.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuAsignacion=(TitledBorder)this.jScrollPanelDatosPresuAsignacion.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderPresuAsignacion.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoPresuAsignacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.getpresuasignacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuasignacion==null) {
						this.presuasignacion = new PresuAsignacion();
					}

					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
				}

				if(this.presuasignacion.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.presuasignacion.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuAsignacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_secuencialPresuAsignacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.getpresuasignacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuasignacion==null) {
						this.presuasignacion = new PresuAsignacion();
					}

					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
				}

				if(this.presuasignacion.getcodigo_secuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_secuencial = "+this.presuasignacion.getcodigo_secuencial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuAsignacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorPresuAsignacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.getpresuasignacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuasignacion==null) {
						this.presuasignacion = new PresuAsignacion();
					}

					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
				}

				if(this.presuasignacion.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.presuasignacion.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuAsignacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaPresuAsignacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.getpresuasignacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuasignacion==null) {
						this.presuasignacion = new PresuAsignacion();
					}

					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
				}

				if(this.presuasignacion.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.presuasignacion.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuAsignacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_presu_estadoPresuAsignacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopresuestado=true;

			idTienePermisopresuestado=this.tienePermisosUsuarioEnPaginaWebPresuAsignacion(PresuEstadoConstantesFunciones.CLASSNAME);

			if(idTienePermisopresuestado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuAsignacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuAsignacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuAsignacion(this.getpresuasignacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);

				this.presuestadoBeanSwingJInternalFrame=new PresuEstadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.presuestadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.presuestadoBeanSwingJInternalFrame.getPresuEstadoLogic().setConnexion(this.presuasignacionLogic.getConnexion());

				if(this.presuasignacion.getid_presu_estado()!=null) {
					this.presuestadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.presuestadoBeanSwingJInternalFrame.setIdActual(this.presuasignacion.getid_presu_estado());
					this.presuestadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.presuestadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.presuestadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuEstado();
				}

				JInternalFrameBase jinternalFrame =this.presuestadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuAsignacion=(TitledBorder)this.jScrollPanelDatosPresuAsignacion.getBorder();
				TitledBorder titledBorderpresuestado=(TitledBorder)this.presuestadoBeanSwingJInternalFrame.jScrollPanelDatosPresuEstado.getBorder();

				titledBorderpresuestado.setTitle(titledBorderPresuAsignacion.getTitle() + " -> Estado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_presu_estadoPresuAsignacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.getpresuasignacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuasignacion==null) {
						this.presuasignacion = new PresuAsignacion();
					}

					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
				}

				if(this.presuasignacion.getid_presu_estado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_presu_estado = "+this.presuasignacion.getid_presu_estado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuAsignacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPresuAsignacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.getpresuasignacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuasignacion==null) {
						this.presuasignacion = new PresuAsignacion();
					}

					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);
				}

				if(this.presuasignacion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.presuasignacion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuAsignacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuAsignacion(false,false);

			this.getPresuAsignacionsFK_IdEmpleado();

			this.inicializarActualizarBindingPresuAsignacion(false);

			//if(PresuAsignacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuAsignacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPresuEstadoPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuAsignacion(false,false);

			this.getPresuAsignacionsFK_IdPresuEstado();

			this.inicializarActualizarBindingPresuAsignacion(false);

			//if(PresuAsignacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuAsignacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPresuProyectoCuentaPresuAsignacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuAsignacion(false,false);

			this.getPresuAsignacionsFK_IdPresuProyectoCuenta();

			this.inicializarActualizarBindingPresuAsignacion(false);

			//if(PresuAsignacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuAsignacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuasignacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresuAsignacion() {
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
			this.jInternalFrameDetalleFormPresuAsignacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresuAsignacion.dispose();
			this.jInternalFrameDetalleFormPresuAsignacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresuAsignacion!=null) {
			this.jInternalFrameReporteDinamicoPresuAsignacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresuAsignacion.dispose();
			this.jInternalFrameReporteDinamicoPresuAsignacion=null;
		}
		
		if(this.jInternalFrameImportacionPresuAsignacion!=null) {
			this.jInternalFrameImportacionPresuAsignacion.setVisible(false);	    			
			this.jInternalFrameImportacionPresuAsignacion.dispose();
			this.jInternalFrameImportacionPresuAsignacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresuAsignacion();
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresuAsignacion")) {
				jButtonNuevoPresuAsignacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresuAsignacion")) {
				jButtonDuplicarPresuAsignacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresuAsignacion")) {
				jButtonCopiarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresuAsignacion")) {
				jButtonVerFormPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresuAsignacion")) {
				jButtonNuevoPresuAsignacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresuAsignacion")) {
				jButtonDuplicarPresuAsignacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresuAsignacion")) {
				jButtonNuevoPresuAsignacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresuAsignacion")) {
				jButtonDuplicarPresuAsignacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresuAsignacion")) {
				jButtonNuevoPresuAsignacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresuAsignacion")) {
				jButtonNuevoPresuAsignacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresuAsignacion")) {
				jButtonNuevoPresuAsignacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresuAsignacion")) {
				jButtonModificarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresuAsignacion")) {
				jButtonModificarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresuAsignacion")) {
				jButtonModificarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresuAsignacion")) {
				jButtonActualizarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresuAsignacion")) {
				jButtonActualizarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresuAsignacion")) {
				jButtonActualizarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresuAsignacion")) {
				jButtonEliminarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresuAsignacion")) {
				jButtonEliminarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresuAsignacion")) {
				jButtonEliminarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresuAsignacion")) {
				jButtonCancelarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresuAsignacion")) {
				jButtonCancelarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresuAsignacion")) {
				jButtonCancelarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresuAsignacion")) {
				jButtonCerrarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresuAsignacion")) {
				jButtonCerrarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresuAsignacion")) {
				jButtonCerrarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresuAsignacion")) {
				jButtonMostrarOcultarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresuAsignacion")) {
				jButtonCancelarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresuAsignacion")) {
				jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresuAsignacion")) {
				jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresuAsignacion")) {
				jButtonCopiarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresuAsignacion")) {
				jButtonVerFormPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresuAsignacion")) {
				jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresuAsignacion")) {
				jButtonCopiarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresuAsignacion")) {
				jButtonVerFormPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresuAsignacion")) {
				jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresuAsignacion")) {
				jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresuAsignacion")) {
				jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresuAsignacion")) {
				jButtonRecargarInformacionPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresuAsignacion")) {
				jButtonRecargarInformacionPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresuAsignacion")) {
				jButtonRecargarInformacionPresuAsignacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresuAsignacion")) {
				jButtonAnterioresPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresuAsignacion")) {
				jButtonAnterioresPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresuAsignacion")) {
				jButtonAnterioresPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresuAsignacion")) {
				jButtonSiguientesPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresuAsignacion")) {
				jButtonSiguientesPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresuAsignacion")) {
				jButtonSiguientesPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresuAsignacion") || sTipo.equals("MenuItemDetalleAbrirOrderByPresuAsignacion")) {
				jButtonAbrirOrderByPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresuAsignacion") || sTipo.equals("MenuItemDetalleMostrarOcultarPresuAsignacion")) {
				jButtonMostrarOcultarPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresuAsignacion")) {
				jButtonNuevoGuardarCambiosPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresuAsignacion")) {
				jButtonNuevoGuardarCambiosPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresuAsignacion")) {
				jButtonNuevoGuardarCambiosPresuAsignacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresuAsignacion")) {
				jButtonCerrarReporteDinamicoPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresuAsignacion")) {
				jButtonGenerarReporteDinamicoPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresuAsignacion")) {
				
				jButtonGenerarExcelReporteDinamicoPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresuAsignacion")) {
				jButtonCerrarImportacionPresuAsignacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresuAsignacion")) {
				
				jButtonGenerarImportacionPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresuAsignacion")) {
				
				jButtonAbrirImportacionPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresuAsignacion")) {
				jComboBoxTiposAccionesPresuAsignacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresuAsignacion")) {
				jComboBoxTiposRelacionesPresuAsignacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresuAsignacion")) {
				jComboBoxTiposAccionesPresuAsignacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresuAsignacion")) {
				
				jComboBoxTiposSeleccionarPresuAsignacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresuAsignacion")) {
				jTextFieldValorCampoGeneralPresuAsignacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresuAsignacion")) {
				jButtonAbrirOrderByPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresuAsignacion")) {
				jButtonAbrirOrderByPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresuAsignacion")) {
				jButtonCerrarOrderByPresuAsignacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuAsignacionBusqueda")) {
				this.jButtonidPresuAsignacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_proyecto_cuentaPresuAsignacionUpdate")) {
				this.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_proyecto_cuentaPresuAsignacionBusqueda")) {
				this.jButtonid_presu_proyecto_cuentaPresuAsignacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoPresuAsignacion")) {
				this.jButtonid_empleadoPresuAsignacionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPresuAsignacionUpdate")) {
				this.jButtonid_empleadoPresuAsignacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPresuAsignacionBusqueda")) {
				this.jButtonid_empleadoPresuAsignacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_secuencialPresuAsignacionBusqueda")) {
				this.jButtoncodigo_secuencialPresuAsignacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresuAsignacionBusqueda")) {
				this.jButtonvalorPresuAsignacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPresuAsignacionBusqueda")) {
				this.jButtonfechaPresuAsignacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_estadoPresuAsignacionUpdate")) {
				this.jButtonid_presu_estadoPresuAsignacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_estadoPresuAsignacionBusqueda")) {
				this.jButtonid_presu_estadoPresuAsignacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPresuAsignacionBusqueda")) {
				this.jButtondescripcionPresuAsignacionBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoPresuAsignacion")) {
				this.jButtonid_empleadoPresuAsignacionActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoPresuAsignacion")) {
				this.jButtonFK_IdEmpleadoPresuAsignacionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPresuEstadoPresuAsignacion")) {
				this.jButtonFK_IdPresuEstadoPresuAsignacionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPresuProyectoCuentaPresuAsignacion")) {
				this.jButtonFK_IdPresuProyectoCuentaPresuAsignacionActionPerformed(evt);
			}
			
			;
			
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresuAsignacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuAsignacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				


				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuAsignacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuAsignacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresuAsignacion presuasignacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				presuasignacionLocal=this.presuasignacion;
			} else {
				presuasignacionLocal=this.presuasignacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
							
				
				


				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuAsignacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuAsignacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuAsignacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
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
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
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
			
			


			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuAsignacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
								
						
				


				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuAsignacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuAsignacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
								
				
				


				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuAsignacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuAsignacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuAsignacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuAsignacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuAsignacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
							
				
				


				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuAsignacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuAsignacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuAsignacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
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
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
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
			
			


			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuAsignacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
								
				
				


				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuAsignacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuAsignacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuAsignacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuAsignacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuAsignacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresuAsignacion")) {
					jCheckBoxSeleccionarTodosPresuAsignacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresuAsignacion")) {
					jCheckBoxSeleccionadosPresuAsignacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresuAsignacion")) {
					
				}
				
				


				
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuAsignacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuAsignacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
												
				
				


				
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuAsignacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuAsignacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuAsignacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuAsignacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
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
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
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
			
			


			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuAsignacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuAsignacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuAsignacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuasignacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuasignacion);
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
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
				
				


				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuAsignacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuAsignacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuAsignacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuasignacionAnterior =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresuAsignacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresuAsignacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresuAsignacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presuasignacion =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presuasignacion =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presuasignacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresuAsignacion")) {
				
				}
				
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresuAsignacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresuAsignacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresuAsignacion")) {
			
			}
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresuAsignacion();
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
			if(sTipo.equals("NuevoPresuAsignacion")) {
				jButtonNuevoPresuAsignacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresuAsignacion")) {
				jButtonDuplicarPresuAsignacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresuAsignacion")) {
				jButtonCopiarPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresuAsignacion")) {
				jButtonVerFormPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresuAsignacion")) {
				jButtonNuevoPresuAsignacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresuAsignacion")) {
				jButtonModificarPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresuAsignacion")) {
				jButtonActualizarPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresuAsignacion")) {
				jButtonEliminarPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresuAsignacion")) {
				jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresuAsignacion")) {
				jButtonCancelarPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresuAsignacion")) {
				jButtonCerrarPresuAsignacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresuAsignacion")) {
				jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresuAsignacion")) {
				jButtonNuevoGuardarCambiosPresuAsignacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresuAsignacion")) {
				jButtonAbrirOrderByPresuAsignacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresuAsignacion")) {
				jButtonRecargarInformacionPresuAsignacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresuAsignacion")) {
				jButtonAnterioresPresuAsignacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresuAsignacion")) {
				jButtonSiguientesPresuAsignacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuAsignacionBusqueda")) {
				this.jButtonidPresuAsignacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_proyecto_cuentaPresuAsignacionUpdate")) {
				this.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_proyecto_cuentaPresuAsignacionBusqueda")) {
				this.jButtonid_presu_proyecto_cuentaPresuAsignacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoPresuAsignacion")) {
				this.jButtonid_empleadoPresuAsignacionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPresuAsignacionUpdate")) {
				this.jButtonid_empleadoPresuAsignacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPresuAsignacionBusqueda")) {
				this.jButtonid_empleadoPresuAsignacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_secuencialPresuAsignacionBusqueda")) {
				this.jButtoncodigo_secuencialPresuAsignacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresuAsignacionBusqueda")) {
				this.jButtonvalorPresuAsignacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPresuAsignacionBusqueda")) {
				this.jButtonfechaPresuAsignacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_estadoPresuAsignacionUpdate")) {
				this.jButtonid_presu_estadoPresuAsignacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_estadoPresuAsignacionBusqueda")) {
				this.jButtonid_presu_estadoPresuAsignacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPresuAsignacionBusqueda")) {
				this.jButtondescripcionPresuAsignacionBusquedaActionPerformed(evt);
			}
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresuAsignacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresuAsignacion")) {
				closingInternalFramePresuAsignacion();
				
			} else if(sTipo.equals("jButtonCancelarPresuAsignacion")) {
				JInternalFrameBase jInternalFrameDetalleFormPresuAsignacion = (JInternalFrameBase)evt.getSource();
	            	
	            PresuAsignacionBeanSwingJInternalFrame jInternalFrameParent=(PresuAsignacionBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuAsignacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresuAsignacionActionPerformed(null);
			}
			
			PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presuasignacion,new Object(),this.presuasignacionParameterGeneral,this.presuasignacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresuAsignacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresuAsignacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresuAsignacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presuasignacion)) {
			if(!esControlTabla) {
				if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);			
				}
				
				if(this.presuasignacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresuAsignacion(this.presuasignacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presuasignacionReturnGeneral=presuasignacionLogic.procesarEventosPresuAsignacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuasignacionLogic.getPresuAsignacions(),this.presuasignacion,this.presuasignacionParameterGeneral,this.isEsNuevoPresuAsignacion,classes);//this.presuasignacionLogic.getPresuAsignacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresuAsignacion(this.presuasignacionReturnGeneral,this.presuasignacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presuasignacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresuAsignacion(classes,this.presuasignacionReturnGeneral,this.presuasignacionBean,false);
					}
						
					if(this.presuasignacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresuAsignacion(this.presuasignacionReturnGeneral.getPresuAsignacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresuAsignacion(this.presuasignacionReturnGeneral.getPresuAsignacion());	
					}
						
					if(this.presuasignacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresuAsignacion(this.presuasignacionReturnGeneral.getPresuAsignacion(),classes);//this.presuasignacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresuAsignacion(this.presuasignacion,classes);//this.presuasignacionBean);									
				}
			
				if(PresuAsignacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresuAsignacion(this.presuasignacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuAsignacion(this.presuasignacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presuasignacionAnterior!=null) {
						this.presuasignacion=this.presuasignacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presuasignacionReturnGeneral=presuasignacionLogic.procesarEventosPresuAsignacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuasignacionLogic.getPresuAsignacions(),this.presuasignacion,this.presuasignacionParameterGeneral,this.isEsNuevoPresuAsignacion,classes);//this.presuasignacionLogic.getPresuAsignacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presuasignacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presuasignacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presuasignacionReturnGeneral.getPresuAsignacion(),presuasignacionLogic.getPresuAsignacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presuasignacionReturnGeneral.getPresuAsignacion(),this.presuasignacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresuAsignacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresuAsignacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresuAsignacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresuAsignacion() throws Exception {
		
		PresuAsignacionModel presuasignacionModel=(PresuAsignacionModel)this.jTableDatosPresuAsignacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuasignacionModel.presuasignacions=this.presuasignacionLogic.getPresuAsignacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presuasignacionModel.presuasignacions=this.presuasignacions;
		}
		
		
		((PresuAsignacionModel) this.jTableDatosPresuAsignacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresuAsignacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresuasignacionAnterior(),this.presuasignacionLogic.getPresuAsignacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresuasignacionAnterior(),this.presuasignacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresuAsignacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresuAsignacion(PresuAsignacion presuasignacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
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
										
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuasignacion,new Object(),generalEntityParameterGeneral,this.presuasignacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presuasignacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresuAsignacionConstantesFunciones.getClassesRelationshipsOfPresuAsignacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresuAsignacionConstantesFunciones.getClassesRelationshipsFromStringsOfPresuAsignacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresuAsignacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresuAsignacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuasignacion,new Object(),generalEntityParameterGeneral,this.presuasignacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresuAsignacion(PresuAsignacionBean presuasignacionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresuAsignacion(ArrayList<Classe> classes,PresuAsignacionReturnGeneral presuasignacionReturnGeneral,PresuAsignacionBean presuasignacionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresuAsignacion(PresuAsignacion presuasignacion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.presuasignacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresuAsignacion = new PresuAsignacionDetalleFormJInternalFrame(jDesktopPane,this.presuasignacionSessionBean.getConGuardarRelaciones(),this.presuasignacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.setVisible(false);
		this.jInternalFrameDetalleFormPresuAsignacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresuAsignacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresuAsignacion.presuasignacionLogic=this.presuasignacionLogic;
		
		this.cargarCombosFrameForeignKeyPresuAsignacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresuAsignacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuAsignacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresuAsignacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresuAsignacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresuAsignacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuAsignacion"));
		
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonModificarPresuAsignacion.addActionListener(new ButtonActionListener(this,"ModificarPresuAsignacion"));

		
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonModificarToolBarPresuAsignacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuAsignacion"));
					
		this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemModificarPresuAsignacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuAsignacion"));		
		
		
		
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonActualizarPresuAsignacion.addActionListener (new ButtonActionListener(this,"ActualizarPresuAsignacion"));
		
		
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonActualizarToolBarPresuAsignacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuAsignacion"));
						
		this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemActualizarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuAsignacion"));		
		
		
		
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonEliminarPresuAsignacion.addActionListener (new ButtonActionListener(this,"EliminarPresuAsignacion"));
		
		
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonEliminarToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuAsignacion"));
								
		this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemEliminarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuAsignacion"));		
		
		
		
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonCancelarPresuAsignacion.addActionListener (new ButtonActionListener(this,"CancelarPresuAsignacion"));
		
		
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonCancelarToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuAsignacion"));
					
		this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemCancelarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuAsignacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemDetalleCerrarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuAsignacion"));		
		
		
		
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuAsignacion"));
		
		
		
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuAsignacion"));
		
		
		
		this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuAsignacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonidPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"idPresuAsignacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate.addActionListener(new ButtonActionListener(this,"id_presu_proyecto_cuentaPresuAsignacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_proyecto_cuentaPresuAsignacionBusqueda"));
		//jButtonid_empleadoPresuAsignacion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPresuAsignacionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_empleadoPresuAsignacion.addActionListener(new ButtonActionListener(this,"id_empleadoPresuAsignacion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_empleadoPresuAsignacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPresuAsignacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_empleadoPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtoncodigo_secuencialPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"codigo_secuencialPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonvalorPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonfechaPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuAsignacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_estadoPresuAsignacionUpdate.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuAsignacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_estadoPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtondescripcionPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuAsignacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresuAsignacion.jTabbedPaneRelacionesPresuAsignacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuAsignacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresuAsignacion"));
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuAsignacion"));
		}
		
		this.jTableDatosPresuAsignacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresuAsignacion"));
		
		this.jTableDatosPresuAsignacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresuAsignacion"));
		
		this.jButtonNuevoPresuAsignacion.addActionListener(new ButtonActionListener(this,"NuevoPresuAsignacion"));
		
		this.jButtonDuplicarPresuAsignacion.addActionListener(new ButtonActionListener(this,"DuplicarPresuAsignacion"));
		
		this.jButtonCopiarPresuAsignacion.addActionListener(new ButtonActionListener(this,"CopiarPresuAsignacion"));
		
		this.jButtonVerFormPresuAsignacion.addActionListener(new ButtonActionListener(this,"VerFormPresuAsignacion"));
		
		
		this.jButtonNuevoToolBarPresuAsignacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresuAsignacion"));
			
		this.jButtonDuplicarToolBarPresuAsignacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresuAsignacion"));
			
		this.jMenuItemNuevoPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresuAsignacion"));
			
		this.jMenuItemDuplicarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresuAsignacion"));		
		
		
		this.jButtonNuevoRelacionesPresuAsignacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresuAsignacion"));
		
		
		this.jButtonNuevoRelacionesToolBarPresuAsignacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresuAsignacion"));
			
		this.jMenuItemNuevoRelacionesPresuAsignacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresuAsignacion"));		
		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonModificarPresuAsignacion.addActionListener(new ButtonActionListener(this,"ModificarPresuAsignacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonModificarToolBarPresuAsignacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuAsignacion"));
			
			this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemModificarPresuAsignacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuAsignacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonActualizarPresuAsignacion.addActionListener (new ButtonActionListener(this,"ActualizarPresuAsignacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonActualizarToolBarPresuAsignacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuAsignacion"));
				
			this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemActualizarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuAsignacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonEliminarPresuAsignacion.addActionListener (new ButtonActionListener(this,"EliminarPresuAsignacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonEliminarToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuAsignacion"));
						
			this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemEliminarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuAsignacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonCancelarPresuAsignacion.addActionListener (new ButtonActionListener(this,"CancelarPresuAsignacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonCancelarToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuAsignacion"));
			
			this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemCancelarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuAsignacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresuAsignacion"));		
		
		
		this.jButtonCerrarPresuAsignacion.addActionListener (new ButtonActionListener(this,"CerrarPresuAsignacion"));
		
		
		this.jButtonCerrarToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresuAsignacion"));
			
		this.jMenuItemCerrarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresuAsignacion"));
			
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jMenuItemDetalleCerrarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuAsignacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosPresuAsignacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresuAsignacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuAsignacion"));
		}
		
		this.jButtonCopiarToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresuAsignacion"));
			
		this.jButtonVerFormToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresuAsignacion"));
		
		this.jMenuItemGuardarCambiosPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresuAsignacion"));
			
		this.jMenuItemCopiarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresuAsignacion"));		
		
		this.jMenuItemVerFormPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresuAsignacion"));		
		
		
		this.jButtonGuardarCambiosTablaPresuAsignacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuAsignacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresuAsignacion"));
			
		this.jMenuItemGuardarCambiosTablaPresuAsignacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuAsignacion"));		
		
		
		
		this.jButtonRecargarInformacionPresuAsignacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresuAsignacion"));
					
		this.jButtonRecargarInformacionToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresuAsignacion"));
		
		this.jMenuItemRecargarInformacionPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresuAsignacion"));		
		
		
		
		this.jButtonAnterioresPresuAsignacion.addActionListener (new ButtonActionListener(this,"AnterioresPresuAsignacion"));
		
		
		this.jButtonAnterioresToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresuAsignacion"));
		
		this.jMenuItemAnterioresPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresuAsignacion"));		
		
		
		this.jButtonSiguientesPresuAsignacion.addActionListener (new ButtonActionListener(this,"SiguientesPresuAsignacion"));
		
		
		this.jButtonSiguientesToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresuAsignacion"));
			
		this.jMenuItemSiguientesPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresuAsignacion"));
			
		this.jMenuItemAbrirOrderByPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresuAsignacion"));
			
		this.jMenuItemMostrarOcultarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresuAsignacion"));
			
		this.jMenuItemDetalleAbrirOrderByPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresuAsignacion"));
			
		this.jMenuItemDetalleMostarOcultarPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresuAsignacion"));		
		
		
		this.jButtonNuevoGuardarCambiosPresuAsignacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresuAsignacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresuAsignacion"));
			
		this.jMenuItemNuevoGuardarCambiosPresuAsignacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresuAsignacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresuAsignacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresuAsignacion"));

		this.jCheckBoxSeleccionadosPresuAsignacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresuAsignacion"));
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuAsignacion"));
		}
		
		
		this.jComboBoxTiposRelacionesPresuAsignacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresuAsignacion"));
			
		this.jComboBoxTiposAccionesPresuAsignacion.addActionListener (new ButtonActionListener(this,"TiposAccionesPresuAsignacion"));
					
		this.jComboBoxTiposSeleccionarPresuAsignacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresuAsignacion"));
			
		this.jTextFieldValorCampoGeneralPresuAsignacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresuAsignacion"));		
		
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonidPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"idPresuAsignacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate.addActionListener(new ButtonActionListener(this,"id_presu_proyecto_cuentaPresuAsignacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_proyecto_cuentaPresuAsignacionBusqueda"));
		//jButtonid_empleadoPresuAsignacion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPresuAsignacionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_empleadoPresuAsignacion.addActionListener(new ButtonActionListener(this,"id_empleadoPresuAsignacion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_empleadoPresuAsignacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPresuAsignacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_empleadoPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtoncodigo_secuencialPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"codigo_secuencialPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonvalorPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonfechaPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuAsignacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_estadoPresuAsignacionUpdate.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuAsignacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_estadoPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtondescripcionPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuAsignacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoPresuAsignacion.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPresuAsignacion"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuAsignacion.addActionListener(new ButtonActionListener(this,"id_empleadoPresuAsignacion"));

			this.jButtonFK_IdPresuEstadoPresuAsignacion.addActionListener(new ButtonActionListener(this,"FK_IdPresuEstadoPresuAsignacion"));

			this.jButtonFK_IdPresuProyectoCuentaPresuAsignacion.addActionListener(new ButtonActionListener(this,"FK_IdPresuProyectoCuentaPresuAsignacion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresuAsignacion!=null) {
				this.jInternalFrameReporteDinamicoPresuAsignacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuAsignacion"));
				this.jInternalFrameReporteDinamicoPresuAsignacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuAsignacion"));
				this.jInternalFrameReporteDinamicoPresuAsignacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuAsignacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresuAsignacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuAsignacion"));				
			//this.jButtonGenerarReporteDinamicoPresuAsignacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuAsignacion"));
			//this.jButtonGenerarExcelReporteDinamicoPresuAsignacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuAsignacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresuAsignacion!=null) {
				this.jInternalFrameImportacionPresuAsignacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuAsignacion"));
				this.jInternalFrameImportacionPresuAsignacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuAsignacion"));
				this.jInternalFrameImportacionPresuAsignacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuAsignacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresuAsignacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresuAsignacion"));
			
			this.jButtonAbrirOrderByToolBarPresuAsignacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresuAsignacion"));			
			
			if(this.jInternalFrameOrderByPresuAsignacion!=null) {
				this.jInternalFrameOrderByPresuAsignacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuAsignacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuAsignacion.jTabbedPaneRelacionesPresuAsignacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuAsignacion"));
		
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
            		closingInternalFramePresuAsignacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresuAsignacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresuAsignacion = (JInternalFrameBase)event.getSource();
	            	
	            PresuAsignacionBeanSwingJInternalFrame jInternalFrameParent=(PresuAsignacionBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuAsignacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresuAsignacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresuAsignacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresuAsignacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresuAsignacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresuAsignacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuAsignacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuAsignacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuAsignacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresuAsignacion";
		inputMap = this.jButtonNuevoPresuAsignacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresuAsignacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuAsignacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuAsignacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuAsignacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuAsignacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresuAsignacion";
		inputMap = this.jButtonNuevoRelacionesPresuAsignacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresuAsignacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuAsignacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresuAsignacion";
		inputMap = this.jButtonModificarPresuAsignacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresuAsignacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresuAsignacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresuAsignacion";
		inputMap = this.jButtonActualizarPresuAsignacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresuAsignacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresuAsignacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresuAsignacion";
		inputMap = this.jButtonEliminarPresuAsignacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresuAsignacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresuAsignacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresuAsignacion";
		inputMap = this.jButtonCancelarPresuAsignacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresuAsignacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresuAsignacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresuAsignacion";
		inputMap = this.jButtonCerrarPresuAsignacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresuAsignacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresuAsignacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresuAsignacion";
		inputMap = this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosPresuAsignacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonGuardarCambiosPresuAsignacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresuAsignacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresuAsignacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresuAsignacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresuAsignacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresuAsignacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresuAsignacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresuAsignacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresuAsignacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresuAsignacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonidPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"idPresuAsignacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_proyecto_cuentaPresuAsignacionUpdate.addActionListener(new ButtonActionListener(this,"id_presu_proyecto_cuentaPresuAsignacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_proyecto_cuentaPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_proyecto_cuentaPresuAsignacionBusqueda"));
		//jButtonid_empleadoPresuAsignacion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPresuAsignacionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_empleadoPresuAsignacion.addActionListener(new ButtonActionListener(this,"id_empleadoPresuAsignacion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_empleadoPresuAsignacionUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPresuAsignacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_empleadoPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtoncodigo_secuencialPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"codigo_secuencialPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonvalorPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonfechaPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuAsignacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_estadoPresuAsignacionUpdate.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuAsignacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_presu_estadoPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuAsignacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuAsignacion.jButtondescripcionPresuAsignacionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuAsignacionBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoPresuAsignacion.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPresuAsignacion"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuAsignacion.addActionListener(new ButtonActionListener(this,"id_empleadoPresuAsignacion"));

		this.jButtonFK_IdPresuEstadoPresuAsignacion.addActionListener(new ButtonActionListener(this,"FK_IdPresuEstadoPresuAsignacion"));

		this.jButtonFK_IdPresuProyectoCuentaPresuAsignacion.addActionListener(new ButtonActionListener(this,"FK_IdPresuProyectoCuentaPresuAsignacion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresuAsignacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresuAsignacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresuAsignacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresuAsignacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresuAsignacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresuAsignacion presuasignacionAux:this.presuasignacionLogic.getPresuAsignacions()) {
					presuasignacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuAsignacion presuasignacionAux:presuasignacions) {
					presuasignacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresuAsignacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuAsignacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuAsignacion presuasignacionAux:this.presuasignacionLogic.getPresuAsignacions()) {
						presuasignacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuAsignacion presuasignacionAux:presuasignacions) {
						presuasignacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresuAsignacion presuasignacionAux:this.presuasignacionLogic.getPresuAsignacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuAsignacion presuasignacionAux:presuasignacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresuAsignacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuAsignacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuAsignacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresuAsignacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuAsignacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresuAsignacion.getSelectedRows();
			
			PresuAsignacion presuasignacionLocal=new PresuAsignacion();
			
			//this.seleccionarTodosPresuAsignacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuasignacionLocal =(PresuAsignacion) this.presuasignacionLogic.getPresuAsignacions().toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presuasignacionLocal =(PresuAsignacion) this.presuasignacions.toArray()[this.jTableDatosPresuAsignacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presuasignacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuAsignacion presuasignacionAux:this.presuasignacionLogic.getPresuAsignacions()) {
						presuasignacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuAsignacion presuasignacionAux:presuasignacions) {
						presuasignacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresuAsignacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuAsignacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuAsignacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuAsignacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresuAsignacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresuAsignacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresuAsignacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresuAsignacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresuAsignacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuAsignacion presuasignacionAux:this.presuasignacionLogic.getPresuAsignacions()) {
				
						if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL)) {
							existe=true;
							presuasignacionAux.setcodigo_secuencial(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presuasignacionAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							presuasignacionAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							presuasignacionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuAsignacion presuasignacionAux:presuasignacions) {
					
						if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL)) {
							existe=true;
							presuasignacionAux.setcodigo_secuencial(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presuasignacionAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							presuasignacionAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							presuasignacionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresuAsignacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresuAsignacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresuAsignacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresuAsignacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresuAsignacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresuAsignacion) {				
					conSplash=true;//false;										
					
					//this.startProcessPresuAsignacion(conSplash);
				
					this.generarReportePresuAsignacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuAsignacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresuAsignacionsSeleccionados();
				//this.jComboBoxTiposAccionesPresuAsignacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuAsignacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesPresuAsignacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuAsignacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesPresuAsignacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuAsignacion();
				
				this.exportarPresuAsignacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuAsignacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresuAsignacions();
				//this.importarPresuAsignacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuAsignacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuAsignacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresuAsignacionsSeleccionados();
				//this.jComboBoxTiposAccionesPresuAsignacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Asignacion Presupuesto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresuAsignacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresuAsignacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresuAsignacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Asignacion Presupuesto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuAsignacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.setSelectedIndex(0);					
				}	
			} 			
			else if(PresuAsignacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresuAsignacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresuAsignacion(conSplash);
					
						//this.actualizarParametrosGeneralPresuAsignacion();
						
						this.generarReporteProcesoAccionPresuAsignacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresuAsignacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresuAsignacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Asignacion PresupuestoES SELECCIONADOS?", "MANTENIMIENTO DE Asignacion Presupuesto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresuAsignacion();
				
						this.actualizarParametrosGeneralPresuAsignacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presuasignacionReturnGeneral=presuasignacionLogic.procesarAccionPresuAsignacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presuasignacionLogic.getPresuAsignacions(),this.presuasignacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresuAsignacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuAsignacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresuAsignacion();
					
					PresuAsignacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresuAsignacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuAsignacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxTiposAccionesFormularioPresuAsignacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresuAsignacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresuAsignacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresuAsignacion();
			
			if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();		
			PresuAsignacion presuasignacion=new PresuAsignacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresuAsignacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresuAsignacion.getSelectedItem();
			
			
			
			
			presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(presuasignacionsSeleccionados.size()==1) {
				for(PresuAsignacion presuasignacionAux:presuasignacionsSeleccionados) {
					presuasignacion=presuasignacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresuAsignacion();
			
      		//this.finishProcessPresuAsignacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresuAsignacionReturnGeneral() throws Exception {
		if(this.presuasignacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presuasignacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presuasignacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presuasignacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presuasignacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presuasignacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresuAsignacion(false);
		}
		
		if(this.presuasignacionReturnGeneral.getConRetornoLista() || this.presuasignacionReturnGeneral.getConRetornoObjeto()) {
			if(this.presuasignacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presuasignacionLogic.setPresuAsignacions(this.presuasignacionReturnGeneral.getPresuAsignacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presuasignacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presuasignacionLogic.setPresuAsignacion(this.presuasignacionReturnGeneral.getPresuAsignacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresuAsignacion(false);
		}
	}
	
	public void actualizarParametrosGeneralPresuAsignacion() throws Exception {
		
		
	}
	
	public ArrayList<PresuAsignacion> getPresuAsignacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresuAsignacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresuAsignacion presuasignacionAux:presuasignacionLogic.getPresuAsignacions()) {
					if(presuasignacionAux.getIsSelected()) {
						presuasignacionsSeleccionados.add(presuasignacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuAsignacion presuasignacionAux:this.presuasignacions) {
					if(presuasignacionAux.getIsSelected()) {
						presuasignacionsSeleccionados.add(presuasignacionAux);				
					}
				}
			}
			
			if(presuasignacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presuasignacionsSeleccionados.addAll(this.presuasignacionLogic.getPresuAsignacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presuasignacionsSeleccionados.addAll(this.presuasignacions);				
					}
				}
			}
		} else {
			presuasignacionsSeleccionados.add(this.presuasignacion);
		}
		
		return presuasignacionsSeleccionados;
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
	
	public void generarReportePresuAsignacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresuAsignacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresuAsignacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuAsignacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuAsignacionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Asignacion Presupuesto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresuAsignacionsSeleccionados() throws Exception {
		ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();		
		
		presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresuAsignacions("Todos",presuasignacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalPresuAsignacionsSeleccionados() throws Exception {
		ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();		
		
		presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresuAsignacions("Todos",presuasignacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresuAsignacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();
		
		presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresuAsignacions("Todos",presuasignacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresuAsignacionsSeleccionados() throws Exception {
		ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresuAsignacion();
		
		
		presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresuAsignacion();
		
		
		//this.generarReportePresuAsignacions("Todos",presuasignacionsSeleccionados ,presuasignacionImplementable,presuasignacionImplementableHome);
	}
	
	public void mostrarImportacionPresuAsignacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresuAsignacion();
		
		this.abrirFrameImportacionPresuAsignacion();		
		
			
		//this.generarReportePresuAsignacions("Todos",presuasignacionsSeleccionados ,presuasignacionImplementable,presuasignacionImplementableHome);
	}
	
	public void importarPresuAsignacions() throws Exception {		
	
	}
	
	public void exportarPresuAsignacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresuAsignacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresuAsignacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresuAsignacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Asignacion Presupuesto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresuAsignacionsSeleccionados() throws Exception {
		ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();		
		
		presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuasignacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresuAsignacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresuAsignacion presuasignacionAux:presuasignacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresuAsignacion(presuasignacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presuasignacionAux.setsDetalleGeneralEntityReporte(presuasignacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asignacion Presupuesto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresuAsignacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresuAsignacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuAsignacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuAsignacionConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuAsignacionConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresuAsignacion(PresuAsignacion presuasignacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presuasignacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presuasignacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuasignacion.getpresuproyectocuenta_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuasignacion.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuasignacion.getcodigo_secuencial().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuasignacion.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuasignacion.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuasignacion.getpresuestado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuasignacion.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresuAsignacionsSeleccionados() throws Exception {
		ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();		
		
		presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuasignacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresuAsignacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresuAsignacion(row);				
				iRow++;
			}				
			
			for(PresuAsignacion presuasignacionAux:presuasignacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresuAsignacion(presuasignacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asignacion Presupuesto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresuAsignacionsSeleccionados() throws Exception {
		ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();		
		
		presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuasignacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presuasignacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presuasignacion");
			//elementRoot.appendChild(element);
		
			for(PresuAsignacion presuasignacionAux:presuasignacionsSeleccionados) {
				element = document.createElement("presuasignacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresuAsignacion(presuasignacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asignacion Presupuesto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresuAsignacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresuAsignacion(PresuAsignacion presuasignacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presuasignacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presuasignacion.getpresuproyectocuenta_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuasignacion.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuasignacion.getcodigo_secuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(presuasignacion.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(presuasignacion.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(presuasignacion.getpresuestado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuasignacion.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlPresuAsignacion(PresuAsignacion presuasignacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresuAsignacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presuasignacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresuAsignacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presuasignacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpresuproyectocuenta_descripcion = document.createElement(PresuAsignacionConstantesFunciones.IDPRESUPROYECTOCUENTA);
		elementpresuproyectocuenta_descripcion.appendChild(document.createTextNode(presuasignacion.getpresuproyectocuenta_descripcion()));
		element.appendChild(elementpresuproyectocuenta_descripcion);

		Element elementempleado_descripcion = document.createElement(PresuAsignacionConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(presuasignacion.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementcodigo_secuencial = document.createElement(PresuAsignacionConstantesFunciones.CODIGOSECUENCIAL);
		elementcodigo_secuencial.appendChild(document.createTextNode(presuasignacion.getcodigo_secuencial().toString().trim()));
		element.appendChild(elementcodigo_secuencial);

		Element elementvalor = document.createElement(PresuAsignacionConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(presuasignacion.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementfecha = document.createElement(PresuAsignacionConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(presuasignacion.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementpresuestado_descripcion = document.createElement(PresuAsignacionConstantesFunciones.IDPRESUESTADO);
		elementpresuestado_descripcion.appendChild(document.createTextNode(presuasignacion.getpresuestado_descripcion()));
		element.appendChild(elementpresuestado_descripcion);

		Element elementdescripcion = document.createElement(PresuAsignacionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(presuasignacion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoPresuAsignacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresuAsignacion> presuasignacionsSeleccionados=new ArrayList<PresuAsignacion>();
		
		presuasignacionsSeleccionados=this.getPresuAsignacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresuAsignacion(presuasignacionsSeleccionados);
		
		this.generarReportePresuAsignacions("Todos",presuasignacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresuAsignacion(ArrayList<PresuAsignacion> presuasignacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresuAsignacion presuasignacionAux:presuasignacionsSeleccionados) {
				presuasignacionAux.setsDetalleGeneralEntityReporte(presuasignacionAux.toString());
			
				if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_IDPRESUPROYECTOCUENTA)) {
					existe=true;
					presuasignacionAux.setsDescripcionGeneralEntityReporte1(presuasignacionAux.getpresuproyectocuenta_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					presuasignacionAux.setsDescripcionGeneralEntityReporte1(presuasignacionAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_CODIGOSECUENCIAL)) {
					existe=true;
					presuasignacionAux.setsDescripcionGeneralEntityReporte1(presuasignacionAux.getcodigo_secuencial().toString());
				}
				 else if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					presuasignacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(presuasignacionAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_IDPRESUESTADO)) {
					existe=true;
					presuasignacionAux.setsDescripcionGeneralEntityReporte1(presuasignacionAux.getpresuestado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuAsignacionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					presuasignacionAux.setsDescripcionGeneralEntityReporte1(presuasignacionAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuAsignacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresuAsignacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresuAsignacion=true;
				this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=true;
				this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=true;
			}
			
			this.isVisibilidadCeldaModificarPresuAsignacion=false;
			this.isVisibilidadCeldaActualizarPresuAsignacion=false;
			this.isVisibilidadCeldaEliminarPresuAsignacion=false;
			this.isVisibilidadCeldaCancelarPresuAsignacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuAsignacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuAsignacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresuAsignacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=false;
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=false;
			this.isVisibilidadCeldaModificarPresuAsignacion=false;
			this.isVisibilidadCeldaActualizarPresuAsignacion=true;
			this.isVisibilidadCeldaEliminarPresuAsignacion=false;
			this.isVisibilidadCeldaCancelarPresuAsignacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuAsignacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuAsignacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresuAsignacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=false;
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=false;
			this.isVisibilidadCeldaModificarPresuAsignacion=false;
			this.isVisibilidadCeldaActualizarPresuAsignacion=true;
			this.isVisibilidadCeldaEliminarPresuAsignacion=true;
			this.isVisibilidadCeldaCancelarPresuAsignacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuAsignacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuAsignacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresuAsignacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=false;
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=false;
			this.isVisibilidadCeldaModificarPresuAsignacion=false;
			this.isVisibilidadCeldaActualizarPresuAsignacion=true;
			this.isVisibilidadCeldaEliminarPresuAsignacion=false;
			this.isVisibilidadCeldaCancelarPresuAsignacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuAsignacion=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuAsignacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresuAsignacion=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=true;
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=true;
			this.isVisibilidadCeldaModificarPresuAsignacion=false;
			this.isVisibilidadCeldaActualizarPresuAsignacion=false;
			this.isVisibilidadCeldaEliminarPresuAsignacion=false;
			this.isVisibilidadCeldaCancelarPresuAsignacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuAsignacion=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuAsignacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresuAsignacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=false;
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=false;
			this.isVisibilidadCeldaActualizarPresuAsignacion=false;
			this.isVisibilidadCeldaEliminarPresuAsignacion=false;
			this.isVisibilidadCeldaCancelarPresuAsignacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuAsignacion=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuAsignacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresuAsignacion=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=false;
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=false;
			this.isVisibilidadCeldaModificarPresuAsignacion=true;
			this.isVisibilidadCeldaActualizarPresuAsignacion=false;
			this.isVisibilidadCeldaEliminarPresuAsignacion=false;
			this.isVisibilidadCeldaCancelarPresuAsignacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuAsignacion=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuAsignacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresuAsignacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresuAsignacion=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=true;
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=true;
		} else {
			this.actualizarEstadoPanelsPresuAsignacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresuAsignacion=false;
			//this.isVisibilidadCeldaVerFormPresuAsignacion=false;
			this.isVisibilidadCeldaDuplicarPresuAsignacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presuasignacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=false;
		} else {
			this.isVisibilidadCeldaNuevoPresuAsignacion=false;
			this.isVisibilidadCeldaGuardarCambiosPresuAsignacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presuasignacionSessionBean.getEsGuardarRelacionado()) {
			if(!presuasignacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=false;												
			}
			
			this.jButtonCerrarPresuAsignacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresuAsignacion=false;
		}
		
		if(!this.permiteMantenimiento(this.presuasignacion)) {
			this.isVisibilidadCeldaActualizarPresuAsignacion=false;
			this.isVisibilidadCeldaEliminarPresuAsignacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresuAsignacion() {
	}
	
	public void actualizarEstadoPanelsPresuAsignacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresuAsignacion!=null) {
				this.jScrollPanelDatosEdicionPresuAsignacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuAsignacion!=null) {
				this.jTabbedPaneBusquedasPresuAsignacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuAsignacion!=null) {
				this.jScrollPanelDatosPresuAsignacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuAsignacion!=null) {
				this.jPanelPaginacionPresuAsignacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuAsignacion!=null) {
				this.jPanelParametrosReportesPresuAsignacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresuAsignacion!=null) {
				this.jScrollPanelDatosEdicionPresuAsignacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuAsignacion!=null) {
				this.jTabbedPaneBusquedasPresuAsignacion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresuAsignacion!=null) {
				this.jScrollPanelDatosPresuAsignacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuAsignacion!=null) {
				this.jPanelPaginacionPresuAsignacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuAsignacion!=null) {
				this.jPanelParametrosReportesPresuAsignacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresuAsignacion!=null) {
				this.jScrollPanelDatosEdicionPresuAsignacion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuAsignacion!=null) {
				this.jTabbedPaneBusquedasPresuAsignacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuAsignacion!=null) {
				this.jScrollPanelDatosPresuAsignacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuAsignacion!=null) {
				this.jPanelPaginacionPresuAsignacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuAsignacion!=null) {
				this.jPanelParametrosReportesPresuAsignacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresuAsignacion!=null) {
				this.jScrollPanelDatosEdicionPresuAsignacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuAsignacion!=null) {
				this.jTabbedPaneBusquedasPresuAsignacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuAsignacion!=null) {
				this.jScrollPanelDatosPresuAsignacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuAsignacion!=null) {
				this.jPanelPaginacionPresuAsignacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuAsignacion!=null) {
				this.jPanelParametrosReportesPresuAsignacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresuAsignacion!=null) {
				this.jScrollPanelDatosEdicionPresuAsignacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuAsignacion!=null) {
				this.jTabbedPaneBusquedasPresuAsignacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuAsignacion!=null) {
				this.jScrollPanelDatosPresuAsignacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuAsignacion!=null) {
				this.jPanelPaginacionPresuAsignacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuAsignacion!=null) {
				this.jPanelParametrosReportesPresuAsignacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresuAsignacion!=null) {
				this.jScrollPanelDatosEdicionPresuAsignacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuAsignacion!=null) {
				this.jTabbedPaneBusquedasPresuAsignacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuAsignacion!=null) {
				this.jScrollPanelDatosPresuAsignacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuAsignacion!=null) {
				this.jPanelPaginacionPresuAsignacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuAsignacion!=null) {
				this.jPanelParametrosReportesPresuAsignacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresuAsignacion!=null) {
				this.jScrollPanelDatosEdicionPresuAsignacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuAsignacion!=null) {
				this.jTabbedPaneBusquedasPresuAsignacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuAsignacion!=null) {
				this.jScrollPanelDatosPresuAsignacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuAsignacion!=null) {
				this.jPanelPaginacionPresuAsignacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuAsignacion!=null) {
				this.jPanelParametrosReportesPresuAsignacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresuAsignacion!=null) {
					this.jTabbedPaneBusquedasPresuAsignacion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresuAsignacion!=null) {
				this.jPanelParametrosReportesPresuAsignacion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presuasignacionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuAsignacion!=null) {
				this.jTabbedPaneBusquedasPresuAsignacion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresuAsignacion!=null) {
				this.jPanelParametrosReportesPresuAsignacion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPresuProyectoCuenta(Boolean isParaPresuProyectoCuenta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPresuProyectoCuentaNegation=!isParaPresuProyectoCuenta;

			this.isVisibilidadFK_IdEmpleado=isParaPresuProyectoCuentaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuAsignacion.remove(jPanelFK_IdEmpleadoPresuAsignacion);}

			this.isVisibilidadFK_IdPresuEstado=isParaPresuProyectoCuentaNegation;
			if(!this.isVisibilidadFK_IdPresuEstado) {this.jTabbedPaneBusquedasPresuAsignacion.remove(jPanelFK_IdPresuEstadoPresuAsignacion);}

			this.isVisibilidadFK_IdPresuProyectoCuenta=isParaPresuProyectoCuenta;
			if(!this.isVisibilidadFK_IdPresuProyectoCuenta) {this.jTabbedPaneBusquedasPresuAsignacion.remove(jPanelFK_IdPresuProyectoCuentaPresuAsignacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuAsignacion.remove(jPanelFK_IdEmpleadoPresuAsignacion);}

			this.isVisibilidadFK_IdPresuEstado=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdPresuEstado) {this.jTabbedPaneBusquedasPresuAsignacion.remove(jPanelFK_IdPresuEstadoPresuAsignacion);}

			this.isVisibilidadFK_IdPresuProyectoCuenta=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdPresuProyectoCuenta) {this.jTabbedPaneBusquedasPresuAsignacion.remove(jPanelFK_IdPresuProyectoCuentaPresuAsignacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaPresuEstado(Boolean isParaPresuEstado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPresuEstadoNegation=!isParaPresuEstado;

			this.isVisibilidadFK_IdEmpleado=isParaPresuEstadoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuAsignacion.remove(jPanelFK_IdEmpleadoPresuAsignacion);}

			this.isVisibilidadFK_IdPresuEstado=isParaPresuEstado;
			if(!this.isVisibilidadFK_IdPresuEstado) {this.jTabbedPaneBusquedasPresuAsignacion.remove(jPanelFK_IdPresuEstadoPresuAsignacion);}

			this.isVisibilidadFK_IdPresuProyectoCuenta=isParaPresuEstadoNegation;
			if(!this.isVisibilidadFK_IdPresuProyectoCuenta) {this.jTabbedPaneBusquedasPresuAsignacion.remove(jPanelFK_IdPresuProyectoCuentaPresuAsignacion);}
		}
		
	}
	
	
	
	

	public String registrarSesionPresuAsignacionParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(presuasignacionSessionBean==null) {
				presuasignacionSessionBean=new PresuAsignacionSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(presuasignacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.presuasignacionFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(PresuAsignacionConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionPresuAsignacion(true);
			//empleadoSessionBean.setlidPresuAsignacionActual(this.idPresuAsignacionActual);

			presuasignacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresuAsignacion(true);
			presuasignacionSessionBean.setlIdPresuAsignacionActualForeignKey(this.idPresuAsignacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresuAsignacionSessionBean presuasignacionSessionBean=new PresuAsignacionSessionBean();
		
		if(this.presuasignacionSessionBean==null) {
			this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
		}
		
		this.presuasignacionSessionBean.setsUltimaBusquedaPresuAsignacion(this.getsAccionBusqueda());
		this.presuasignacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presuasignacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			presuasignacionSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPresuEstado")) {
			presuasignacionSessionBean.setid_presu_estado(this.getid_presu_estadoFK_IdPresuEstado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPresuProyectoCuenta")) {
			presuasignacionSessionBean.setid_presu_proyecto_cuenta(this.getid_presu_proyecto_cuentaFK_IdPresuProyectoCuenta());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresuAsignacionSessionBean presuasignacionSessionBean=new PresuAsignacionSessionBean();
		
		if(this.presuasignacionSessionBean==null) {
			this.presuasignacionSessionBean=new PresuAsignacionSessionBean();
		}
		
		if(this.presuasignacionSessionBean.getsUltimaBusquedaPresuAsignacion()!=null&&!this.presuasignacionSessionBean.getsUltimaBusquedaPresuAsignacion().equals("")) {
			this.setsAccionBusqueda(presuasignacionSessionBean.getsUltimaBusquedaPresuAsignacion());
			this.setiNumeroPaginacion(presuasignacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presuasignacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(presuasignacionSessionBean.getid_empleado());
				presuasignacionSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPresuEstado")) {
				this.setid_presu_estadoFK_IdPresuEstado(presuasignacionSessionBean.getid_presu_estado());
				presuasignacionSessionBean.setid_presu_estado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPresuProyectoCuenta")) {
				this.setid_presu_proyecto_cuentaFK_IdPresuProyectoCuenta(presuasignacionSessionBean.getid_presu_proyecto_cuenta());
				presuasignacionSessionBean.setid_presu_proyecto_cuenta(-1L);
			}
		}
		
		this.presuasignacionSessionBean.setsUltimaBusquedaPresuAsignacion("");
		this.presuasignacionSessionBean.setiNumeroPaginacion(PresuAsignacionConstantesFunciones.INUMEROPAGINACION);
		this.presuasignacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresuAsignacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresuAsignacion() {
		this.updateBorderResaltarBusquedasFormularioPresuAsignacion();
		this.updateVisibilidadBusquedasFormularioPresuAsignacion();
		this.updateHabilitarBusquedasFormularioPresuAsignacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresuAsignacion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresuAsignacion.getComponents().length>0) {
	

		if(this.presuasignacionConstantesFunciones.resaltarFK_IdEmpleadoPresuAsignacion!=null) {
			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdEmpleadoPresuAsignacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);
				jPanel.setBorder(this.presuasignacionConstantesFunciones.resaltarFK_IdEmpleadoPresuAsignacion);
			}
		}

		if(this.presuasignacionConstantesFunciones.resaltarFK_IdPresuEstadoPresuAsignacion!=null) {
			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdPresuEstadoPresuAsignacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);
				jPanel.setBorder(this.presuasignacionConstantesFunciones.resaltarFK_IdPresuEstadoPresuAsignacion);
			}
		}

		if(this.presuasignacionConstantesFunciones.resaltarFK_IdPresuProyectoCuentaPresuAsignacion!=null) {
			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdPresuProyectoCuentaPresuAsignacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);
				jPanel.setBorder(this.presuasignacionConstantesFunciones.resaltarFK_IdPresuProyectoCuentaPresuAsignacion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresuAsignacion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresuAsignacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdEmpleadoPresuAsignacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuasignacionConstantesFunciones.mostrarFK_IdEmpleadoPresuAsignacion);
			if(!this.presuasignacionConstantesFunciones.mostrarFK_IdEmpleadoPresuAsignacion && index>-1) {
				this.jTabbedPaneBusquedasPresuAsignacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdPresuEstadoPresuAsignacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuasignacionConstantesFunciones.mostrarFK_IdPresuEstadoPresuAsignacion);
			if(!this.presuasignacionConstantesFunciones.mostrarFK_IdPresuEstadoPresuAsignacion && index>-1) {
				this.jTabbedPaneBusquedasPresuAsignacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdPresuProyectoCuentaPresuAsignacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuasignacionConstantesFunciones.mostrarFK_IdPresuProyectoCuentaPresuAsignacion);
			if(!this.presuasignacionConstantesFunciones.mostrarFK_IdPresuProyectoCuentaPresuAsignacion && index>-1) {
				this.jTabbedPaneBusquedasPresuAsignacion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresuAsignacion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresuAsignacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdEmpleadoPresuAsignacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuasignacionConstantesFunciones.activarFK_IdEmpleadoPresuAsignacion);
				this.jTabbedPaneBusquedasPresuAsignacion.setEnabledAt(index,this.presuasignacionConstantesFunciones.activarFK_IdEmpleadoPresuAsignacion);
			}

			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdPresuEstadoPresuAsignacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuasignacionConstantesFunciones.activarFK_IdPresuEstadoPresuAsignacion);
				this.jTabbedPaneBusquedasPresuAsignacion.setEnabledAt(index,this.presuasignacionConstantesFunciones.activarFK_IdPresuEstadoPresuAsignacion);
			}

			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdPresuProyectoCuentaPresuAsignacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuasignacionConstantesFunciones.activarFK_IdPresuProyectoCuentaPresuAsignacion);
				this.jTabbedPaneBusquedasPresuAsignacion.setEnabledAt(index,this.presuasignacionConstantesFunciones.activarFK_IdPresuProyectoCuentaPresuAsignacion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresuAsignacion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdEmpleadoPresuAsignacion);

			this.jTabbedPaneBusquedasPresuAsignacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);

			this.presuasignacionConstantesFunciones.setResaltarFK_IdEmpleadoPresuAsignacion(resaltar);

			jPanel.setBorder(this.presuasignacionConstantesFunciones.resaltarFK_IdEmpleadoPresuAsignacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPresuEstado")) {
			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdPresuEstadoPresuAsignacion);

			this.jTabbedPaneBusquedasPresuAsignacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);

			this.presuasignacionConstantesFunciones.setResaltarFK_IdPresuEstadoPresuAsignacion(resaltar);

			jPanel.setBorder(this.presuasignacionConstantesFunciones.resaltarFK_IdPresuEstadoPresuAsignacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPresuProyectoCuenta")) {
			index= this.jTabbedPaneBusquedasPresuAsignacion.indexOfComponent(this.jPanelFK_IdPresuProyectoCuentaPresuAsignacion);

			this.jTabbedPaneBusquedasPresuAsignacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuAsignacion.getComponent(index);

			this.presuasignacionConstantesFunciones.setResaltarFK_IdPresuProyectoCuentaPresuAsignacion(resaltar);

			jPanel.setBorder(this.presuasignacionConstantesFunciones.resaltarFK_IdPresuProyectoCuentaPresuAsignacion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresuAsignacion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresuAsignacion() throws Exception {

		if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresuAsignacion();
		this.updateVisibilidadResaltarControlesFormularioPresuAsignacion();
		this.updateHabilitarResaltarControlesFormularioPresuAsignacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresuAsignacion() throws Exception {
		if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presuasignacionConstantesFunciones.resaltaridPresuAsignacion!=null && this.jInternalFrameDetalleFormPresuAsignacion!=null) {this.jInternalFrameDetalleFormPresuAsignacion.jLabelidPresuAsignacion.setBorder(this.presuasignacionConstantesFunciones.resaltaridPresuAsignacion);}
		if(this.presuasignacionConstantesFunciones.resaltarid_presu_proyecto_cuentaPresuAsignacion!=null && this.jInternalFrameDetalleFormPresuAsignacion!=null) {this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setBorder(this.presuasignacionConstantesFunciones.resaltarid_presu_proyecto_cuentaPresuAsignacion);}
		if(this.presuasignacionConstantesFunciones.resaltarid_empleadoPresuAsignacion!=null && this.jInternalFrameDetalleFormPresuAsignacion!=null) {this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.setBorder(this.presuasignacionConstantesFunciones.resaltarid_empleadoPresuAsignacion);}
		if(this.presuasignacionConstantesFunciones.resaltarcodigo_secuencialPresuAsignacion!=null && this.jInternalFrameDetalleFormPresuAsignacion!=null) {this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldcodigo_secuencialPresuAsignacion.setBorder(this.presuasignacionConstantesFunciones.resaltarcodigo_secuencialPresuAsignacion);}
		if(this.presuasignacionConstantesFunciones.resaltarvalorPresuAsignacion!=null && this.jInternalFrameDetalleFormPresuAsignacion!=null) {this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldvalorPresuAsignacion.setBorder(this.presuasignacionConstantesFunciones.resaltarvalorPresuAsignacion);}
		if(this.presuasignacionConstantesFunciones.resaltarfechaPresuAsignacion!=null && this.jInternalFrameDetalleFormPresuAsignacion!=null) {this.jInternalFrameDetalleFormPresuAsignacion.jDateChooserfechaPresuAsignacion.setBorder(this.presuasignacionConstantesFunciones.resaltarfechaPresuAsignacion);}
		if(this.presuasignacionConstantesFunciones.resaltarid_presu_estadoPresuAsignacion!=null && this.jInternalFrameDetalleFormPresuAsignacion!=null) {this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.setBorder(this.presuasignacionConstantesFunciones.resaltarid_presu_estadoPresuAsignacion);}
		if(this.presuasignacionConstantesFunciones.resaltardescripcionPresuAsignacion!=null && this.jInternalFrameDetalleFormPresuAsignacion!=null) {this.jInternalFrameDetalleFormPresuAsignacion.jTextAreadescripcionPresuAsignacion.setBorder(this.presuasignacionConstantesFunciones.resaltardescripcionPresuAsignacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresuAsignacion() throws Exception {		
		if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
	
		//this.jInternalFrameDetalleFormPresuAsignacion.jLabelidPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostraridPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jPanelidPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostraridPresuAsignacion);
		//this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarid_presu_proyecto_cuentaPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jPanelid_presu_proyecto_cuentaPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarid_presu_proyecto_cuentaPresuAsignacion);
		//this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarid_empleadoPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jPanelid_empleadoPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarid_empleadoPresuAsignacion);
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_empleadoPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarid_empleadoPresuAsignacion);
		//this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldcodigo_secuencialPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarcodigo_secuencialPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jPanelcodigo_secuencialPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarcodigo_secuencialPresuAsignacion);
		//this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldvalorPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarvalorPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jPanelvalorPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarvalorPresuAsignacion);
		//this.jInternalFrameDetalleFormPresuAsignacion.jDateChooserfechaPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarfechaPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jPanelfechaPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarfechaPresuAsignacion);
		//this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarid_presu_estadoPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jPanelid_presu_estadoPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrarid_presu_estadoPresuAsignacion);
		//this.jInternalFrameDetalleFormPresuAsignacion.jTextAreadescripcionPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrardescripcionPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jPaneldescripcionPresuAsignacion.setVisible(this.presuasignacionConstantesFunciones.mostrardescripcionPresuAsignacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresuAsignacion() throws Exception {
		if(this.jInternalFrameDetalleFormPresuAsignacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuAsignacion!=null) {
	
		this.jInternalFrameDetalleFormPresuAsignacion.jLabelidPresuAsignacion.setEnabled(this.presuasignacionConstantesFunciones.activaridPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_proyecto_cuentaPresuAsignacion.setEnabled(this.presuasignacionConstantesFunciones.activarid_presu_proyecto_cuentaPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_empleadoPresuAsignacion.setEnabled(this.presuasignacionConstantesFunciones.activarid_empleadoPresuAsignacion);
			this.jInternalFrameDetalleFormPresuAsignacion.jButtonid_empleadoPresuAsignacion.setEnabled(this.presuasignacionConstantesFunciones.activarid_empleadoPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldcodigo_secuencialPresuAsignacion.setEnabled(this.presuasignacionConstantesFunciones.activarcodigo_secuencialPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jTextFieldvalorPresuAsignacion.setEnabled(this.presuasignacionConstantesFunciones.activarvalorPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jDateChooserfechaPresuAsignacion.setEnabled(this.presuasignacionConstantesFunciones.activarfechaPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jComboBoxid_presu_estadoPresuAsignacion.setEnabled(this.presuasignacionConstantesFunciones.activarid_presu_estadoPresuAsignacion);
		this.jInternalFrameDetalleFormPresuAsignacion.jTextAreadescripcionPresuAsignacion.setEnabled(this.presuasignacionConstantesFunciones.activardescripcionPresuAsignacion);
		}
	}
	
		
}