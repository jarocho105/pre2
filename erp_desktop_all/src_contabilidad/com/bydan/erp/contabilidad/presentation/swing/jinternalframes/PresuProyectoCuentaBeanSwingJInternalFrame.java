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

import com.bydan.erp.contabilidad.util.PresuProyectoCuentaConstantesFunciones;
import com.bydan.erp.contabilidad.util.PresuProyectoCuentaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.PresuProyectoCuentaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.PresuProyectoCuentaBean;
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
public class PresuProyectoCuentaBeanSwingJInternalFrame extends PresuProyectoCuentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresuProyectoCuentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresuProyectoCuenta> presuproyectocuentaValidator = new ClassValidator<PresuProyectoCuenta>(PresuProyectoCuenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresuProyectoCuenta presuproyectocuenta;	
	public PresuProyectoCuenta presuproyectocuentaAux;
	public PresuProyectoCuenta presuproyectocuentaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresuProyectoCuenta presuproyectocuentaTotales;
	public Long idPresuProyectoCuentaActual;
	public Long iIdNuevoPresuProyectoCuenta=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPresuProyecto="";

	public List<PresuProyecto> presuproyectosForeignKey;

	public List<PresuProyecto> getpresuproyectosForeignKey() {
		return presuproyectosForeignKey;
	}

	public void setpresuproyectosForeignKey(List<PresuProyecto> presuproyectosForeignKey) {
		this.presuproyectosForeignKey = presuproyectosForeignKey;
	}

	//OBJETO FK ACTUAL
	public PresuProyecto presuproyectoForeignKey;

	public PresuProyecto getpresuproyectoForeignKey() {
		return presuproyectoForeignKey;
	}

	public void setpresuproyectoForeignKey(PresuProyecto presuproyectoForeignKey) {
		this.presuproyectoForeignKey = presuproyectoForeignKey;
	}

	public String sFinalQueryComboPresuTipoCuentaProyecto="";

	public List<PresuTipoCuentaProyecto> presutipocuentaproyectosForeignKey;

	public List<PresuTipoCuentaProyecto> getpresutipocuentaproyectosForeignKey() {
		return presutipocuentaproyectosForeignKey;
	}

	public void setpresutipocuentaproyectosForeignKey(List<PresuTipoCuentaProyecto> presutipocuentaproyectosForeignKey) {
		this.presutipocuentaproyectosForeignKey = presutipocuentaproyectosForeignKey;
	}

	//OBJETO FK ACTUAL
	public PresuTipoCuentaProyecto presutipocuentaproyectoForeignKey;

	public PresuTipoCuentaProyecto getpresutipocuentaproyectoForeignKey() {
		return presutipocuentaproyectoForeignKey;
	}

	public void setpresutipocuentaproyectoForeignKey(PresuTipoCuentaProyecto presutipocuentaproyectoForeignKey) {
		this.presutipocuentaproyectoForeignKey = presutipocuentaproyectoForeignKey;
	}

	public String sFinalQueryComboCuentaContable="";

	public List<CuentaContable> cuentacontablesForeignKey;

	public List<CuentaContable> getcuentacontablesForeignKey() {
		return cuentacontablesForeignKey;
	}

	public void setcuentacontablesForeignKey(List<CuentaContable> cuentacontablesForeignKey) {
		this.cuentacontablesForeignKey = cuentacontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableForeignKey;

	public CuentaContable getcuentacontableForeignKey() {
		return cuentacontableForeignKey;
	}

	public void setcuentacontableForeignKey(CuentaContable cuentacontableForeignKey) {
		this.cuentacontableForeignKey = cuentacontableForeignKey;
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
	public Long idCuentaContableActual=0L;

	public Long getidCuentaContableActual() {
		return idCuentaContableActual;
	}

	public void setidCuentaContableActual(Long idCuentaContableActual) {
		this.idCuentaContableActual= idCuentaContableActual;
	}
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
	}
	
	

	public Boolean isTienePermisosPresuAsignacion=false;

	public Boolean getIsTienePermisosPresuAsignacion() {
		return isTienePermisosPresuAsignacion;
	}

	public void setIsTienePermisosPresuAsignacion(Boolean isTienePermisosPresuAsignacion) {
		this.isTienePermisosPresuAsignacion= isTienePermisosPresuAsignacion;
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
	
	public Boolean isPermisoTodoPresuProyectoCuenta;
	public Boolean isPermisoNuevoPresuProyectoCuenta;
	public Boolean isPermisoActualizarPresuProyectoCuenta;
	public Boolean isPermisoActualizarOriginalPresuProyectoCuenta;
	public Boolean isPermisoEliminarPresuProyectoCuenta;
	public Boolean isPermisoGuardarCambiosPresuProyectoCuenta;
	public Boolean isPermisoConsultaPresuProyectoCuenta;
	public Boolean isPermisoBusquedaPresuProyectoCuenta;
	public Boolean isPermisoReportePresuProyectoCuenta;
	public Boolean isPermisoPaginacionMedioPresuProyectoCuenta;
	public Boolean isPermisoPaginacionAltoPresuProyectoCuenta;
	public Boolean isPermisoPaginacionTodoPresuProyectoCuenta;
	public Boolean isPermisoCopiarPresuProyectoCuenta;
	public Boolean isPermisoVerFormPresuProyectoCuenta;
	public Boolean isPermisoDuplicarPresuProyectoCuenta;
	public Boolean isPermisoOrdenPresuProyectoCuenta;
	
	
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
	
	public PresuProyectoCuentaParameterReturnGeneral presuproyectocuentaReturnGeneral;
	public PresuProyectoCuentaParameterReturnGeneral presuproyectocuentaParameterGeneral;
	
	

	public PresuAsignacionLogic presuasignacionLogic=null;

	public PresuAsignacionLogic getPresuAsignacionLogic() {
		return presuasignacionLogic;
	}

	public void setPresuAsignacionLogic(PresuAsignacionLogic presuasignacionLogic) {
		this.presuasignacionLogic = presuasignacionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresuProyectoCuenta=false;
	public Boolean esParaAccionDesdeFormularioPresuProyectoCuenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresuProyectoCuentaSessionBeanAdditional presuproyectocuentaSessionBeanAdditional=null;
	
	public PresuProyectoCuentaSessionBeanAdditional getPresuProyectoCuentaSessionBeanAdditional() {
		return this.presuproyectocuentaSessionBeanAdditional;
	}
	
	public void setPresuProyectoCuentaSessionBeanAdditional(PresuProyectoCuentaSessionBeanAdditional presuproyectocuentaSessionBeanAdditional) {
		try {
			this.presuproyectocuentaSessionBeanAdditional=presuproyectocuentaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresuProyectoCuentaBeanSwingJInternalFrameAdditional presuproyectocuentaBeanSwingJInternalFrameAdditional=null;
	//public class PresuProyectoCuentaBeanSwingJInternalFrame
	
	public PresuProyectoCuentaBeanSwingJInternalFrameAdditional getPresuProyectoCuentaBeanSwingJInternalFrameAdditional() {
		return this.presuproyectocuentaBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresuProyectoCuentaBeanSwingJInternalFrameAdditional(PresuProyectoCuentaBeanSwingJInternalFrameAdditional presuproyectocuentaBeanSwingJInternalFrameAdditional) {
		try {
			this.presuproyectocuentaBeanSwingJInternalFrameAdditional=presuproyectocuentaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresuProyectoCuentaLogic presuproyectocuentaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresuProyectoCuenta presuproyectocuentaBean;
	public PresuProyectoCuentaConstantesFunciones presuproyectocuentaConstantesFunciones;
	//public PresuProyectoCuentaParameterReturnGeneral presuproyectocuentaReturnGeneral;
	
	//FK
	
	public PresuProyectoLogic presuproyectoLogic;
	public PresuTipoCuentaProyectoLogic presutipocuentaproyectoLogic;
	public CuentaContableLogic cuentacontableLogic;
	public EmpleadoLogic empleadoLogic;
	public PresuEstadoLogic presuestadoLogic;
	
	//PARAMETROS
	
	
	//public List<PresuProyectoCuenta> presuproyectocuentas;	
	//public List<PresuProyectoCuenta> presuproyectocuentasEliminados;
	//public List<PresuProyectoCuenta> presuproyectocuentasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresuProyectoCuenta=false;
	public Boolean isVisibilidadCeldaDuplicarPresuProyectoCuenta=true;
	public Boolean isVisibilidadCeldaCopiarPresuProyectoCuenta=true;
	public Boolean isVisibilidadCeldaVerFormPresuProyectoCuenta=true;
	public Boolean isVisibilidadCeldaOrdenPresuProyectoCuenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=false;
	public Boolean isVisibilidadCeldaModificarPresuProyectoCuenta=false;
	public Boolean isVisibilidadCeldaActualizarPresuProyectoCuenta=false;
	public Boolean isVisibilidadCeldaEliminarPresuProyectoCuenta=false;
	public Boolean isVisibilidadCeldaCancelarPresuProyectoCuenta=false;
	public Boolean isVisibilidadCeldaGuardarPresuProyectoCuenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=false;	
	
	
	public Boolean isVisibilidadBusquedaPorProyectoPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorProyectoPorNombre=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdPresuEstado=false;
	public Boolean isVisibilidadFK_IdPresuProyecto=false;
	public Boolean isVisibilidadFK_IdPresuTipoCuentaProyecto=false;
	
	public Long getiIdNuevoPresuProyectoCuenta() {
		return this.iIdNuevoPresuProyectoCuenta;
	}

	public void setiIdNuevoPresuProyectoCuenta(Long iIdNuevoPresuProyectoCuenta) {
		this.iIdNuevoPresuProyectoCuenta = iIdNuevoPresuProyectoCuenta;
	}
	
	public Long getidPresuProyectoCuentaActual() {
		return this.idPresuProyectoCuentaActual;
	}

	public void setidPresuProyectoCuentaActual(Long idPresuProyectoCuentaActual) {
		this.idPresuProyectoCuentaActual = idPresuProyectoCuentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresuProyectoCuenta getpresuproyectocuenta() {
		return this.presuproyectocuenta;
	}

	public void setpresuproyectocuenta(PresuProyectoCuenta presuproyectocuenta) {
		this.presuproyectocuenta = presuproyectocuenta;
	}
	
	public PresuProyectoCuenta getpresuproyectocuentaAux() {
		return this.presuproyectocuentaAux;
	}

	public void setpresuproyectocuentaAux(PresuProyectoCuenta presuproyectocuentaAux) {
		this.presuproyectocuentaAux = presuproyectocuentaAux;
	}				
	
	public PresuProyectoCuenta getpresuproyectocuentaAnterior() {
		return this.presuproyectocuentaAnterior;
	}

	public void setpresuproyectocuentaAnterior(PresuProyectoCuenta presuproyectocuentaAnterior) {
		this.presuproyectocuentaAnterior = presuproyectocuentaAnterior;
	}	
	
	public PresuProyectoCuenta getpresuproyectocuentaTotales() {
		return this.presuproyectocuentaTotales;
	}

	public void setpresuproyectocuentaTotales(PresuProyectoCuenta presuproyectocuentaTotales) {
		this.presuproyectocuentaTotales = presuproyectocuentaTotales;
	}	
	
	public PresuProyectoCuenta getpresuproyectocuentaBean() {
		return this.presuproyectocuentaBean;
	}

	public void setpresuproyectocuentaBean(PresuProyectoCuenta presuproyectocuentaBean) {
		this.presuproyectocuentaBean = presuproyectocuentaBean;
	}	
	
	public PresuProyectoCuentaParameterReturnGeneral getpresuproyectocuentaReturnGeneral() {
		return this.presuproyectocuentaReturnGeneral;
	}

	public void setpresuproyectocuentaReturnGeneral(PresuProyectoCuentaParameterReturnGeneral presuproyectocuentaReturnGeneral) {
		this.presuproyectocuentaReturnGeneral = presuproyectocuentaReturnGeneral;
	}	
	
	
	public Long id_presu_proyectoBusquedaPorProyectoPorCodigo=-1L;

	public Long getid_presu_proyectoBusquedaPorProyectoPorCodigo() {
		return this.id_presu_proyectoBusquedaPorProyectoPorCodigo;
	}

	public void setid_presu_proyectoBusquedaPorProyectoPorCodigo(Long id_presu_proyectoBusquedaPorProyectoPorCodigo) {
		this.id_presu_proyectoBusquedaPorProyectoPorCodigo = id_presu_proyectoBusquedaPorProyectoPorCodigo;
	}

;
	public String codigoBusquedaPorProyectoPorCodigo="";

	public String getcodigoBusquedaPorProyectoPorCodigo() {
		return this.codigoBusquedaPorProyectoPorCodigo;
	}

	public void setcodigoBusquedaPorProyectoPorCodigo(String codigoBusquedaPorProyectoPorCodigo) {
		this.codigoBusquedaPorProyectoPorCodigo = codigoBusquedaPorProyectoPorCodigo;
	}

	public Long id_presu_proyectoBusquedaPorProyectoPorNombre=-1L;

	public Long getid_presu_proyectoBusquedaPorProyectoPorNombre() {
		return this.id_presu_proyectoBusquedaPorProyectoPorNombre;
	}

	public void setid_presu_proyectoBusquedaPorProyectoPorNombre(Long id_presu_proyectoBusquedaPorProyectoPorNombre) {
		this.id_presu_proyectoBusquedaPorProyectoPorNombre = id_presu_proyectoBusquedaPorProyectoPorNombre;
	}

;
	public String nombreBusquedaPorProyectoPorNombre="";

	public String getnombreBusquedaPorProyectoPorNombre() {
		return this.nombreBusquedaPorProyectoPorNombre;
	}

	public void setnombreBusquedaPorProyectoPorNombre(String nombreBusquedaPorProyectoPorNombre) {
		this.nombreBusquedaPorProyectoPorNombre = nombreBusquedaPorProyectoPorNombre;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
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

	public Long id_presu_proyectoFK_IdPresuProyecto=-1L;

	public Long getid_presu_proyectoFK_IdPresuProyecto() {
		return this.id_presu_proyectoFK_IdPresuProyecto;
	}

	public void setid_presu_proyectoFK_IdPresuProyecto(Long id_presu_proyectoFK_IdPresuProyecto) {
		this.id_presu_proyectoFK_IdPresuProyecto = id_presu_proyectoFK_IdPresuProyecto;
	}

	public Long id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto=-1L;

	public Long getid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto() {
		return this.id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto;
	}

	public void setid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto(Long id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto) {
		this.id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto = id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PresuProyectoCuentaLogic getPresuProyectoCuentaLogic()	{		
		return presuproyectocuentaLogic;
	}

	public void setPresuProyectoCuentaLogic(PresuProyectoCuentaLogic presuproyectocuentaLogic) {
		this.presuproyectocuentaLogic = presuproyectocuentaLogic;
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
	
	public Boolean getIsEsNuevoPresuProyectoCuenta() {
		return isEsNuevoPresuProyectoCuenta;
	}

	public void setIsEsNuevoPresuProyectoCuenta(Boolean isEsNuevoPresuProyectoCuenta) {
		this.isEsNuevoPresuProyectoCuenta = isEsNuevoPresuProyectoCuenta;
	}

	public Boolean getEsParaAccionDesdeFormularioPresuProyectoCuenta() {
		return esParaAccionDesdeFormularioPresuProyectoCuenta;
	}
	
	public void setEsParaAccionDesdeFormularioPresuProyectoCuenta(Boolean esParaAccionDesdeFormularioPresuProyectoCuenta) {
		this.esParaAccionDesdeFormularioPresuProyectoCuenta = esParaAccionDesdeFormularioPresuProyectoCuenta;
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
	
	
	public void cargarCombosPresuProyectosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.presuproyectosForeignKey=new ArrayList<PresuProyecto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PresuProyectoLogic presuproyectoLogic=new PresuProyectoLogic();

			presuproyectoLogic.getPresuProyectoDataAccess().setIsForForeingKeyData(true);

			if(this.presuproyectocuentaSessionBean==null) {
				this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
			}

			if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionPresuProyecto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getPresuProyectoDataAccess().setIsForForeingKeyData(true);

					presuproyectoLogic.getTodosPresuProyectosWithConnection(sFinalQuery,new Pagination());

					this.presuproyectosForeignKey=presuproyectoLogic.getPresuProyectos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPresuProyecto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getEntityWithConnection(presuproyectocuentaSessionBean.getlidPresuProyectoActual());
					this.presuproyectosForeignKey.add(presuproyectoLogic.getPresuProyecto());
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

	public void cargarCombosPresuTipoCuentaProyectosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.presutipocuentaproyectosForeignKey=new ArrayList<PresuTipoCuentaProyecto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PresuTipoCuentaProyectoLogic presutipocuentaproyectoLogic=new PresuTipoCuentaProyectoLogic();

			presutipocuentaproyectoLogic.getPresuTipoCuentaProyectoDataAccess().setIsForForeingKeyData(true);

			if(this.presuproyectocuentaSessionBean==null) {
				this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
			}

			if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionPresuTipoCuentaProyecto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipocuentaproyectoLogic.getPresuTipoCuentaProyectoDataAccess().setIsForForeingKeyData(true);

					presutipocuentaproyectoLogic.getTodosPresuTipoCuentaProyectosWithConnection(sFinalQuery,new Pagination());

					this.presutipocuentaproyectosForeignKey=presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPresuTipoCuentaProyecto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipocuentaproyectoLogic.getEntityWithConnection(presuproyectocuentaSessionBean.getlidPresuTipoCuentaProyectoActual());
					this.presutipocuentaproyectosForeignKey.add(presutipocuentaproyectoLogic.getPresuTipoCuentaProyecto());
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

	public void cargarCombosCuentaContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.presuproyectocuentaSessionBean==null) {
				this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
			}

			if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablesForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(presuproyectocuentaSessionBean.getlidCuentaContableActual());
					this.cuentacontablesForeignKey.add(cuentacontableLogic.getCuentaContable());
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

			if(this.presuproyectocuentaSessionBean==null) {
				this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
			}

			if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(presuproyectocuentaSessionBean.getlidEmpleadoActual());
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

			if(this.presuproyectocuentaSessionBean==null) {
				this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
			}

			if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionPresuEstado()) {
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
					presuestadoLogic.getEntityWithConnection(presuproyectocuentaSessionBean.getlidPresuEstadoActual());
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

	
	
	public void setActualPresuProyectoForeignKey(Long idPresuProyectoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PresuProyecto  presuproyectoTemp=null;

			for(PresuProyecto presuproyectoAux:presuproyectosForeignKey) {
				if(presuproyectoAux.getId()!=null && presuproyectoAux.getId().equals(idPresuProyectoSeleccionado)) {
					presuproyectoTemp=presuproyectoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(presuproyectoTemp!=null) {

					if(this.presuproyectocuenta!=null) {
						this.presuproyectocuenta.setPresuProyecto(presuproyectoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
						this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.setSelectedItem(presuproyectoTemp);
					}
				} else {
					//jComboBoxid_presu_proyectoPresuProyectoCuenta.setSelectedItem(presuproyectoTemp);
					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorProyectoPorCodigo") || sFormularioTipoBusqueda.equals("Todos")){
					if(presuproyectoTemp!=null && jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta!=null) {
						jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setSelectedItem(presuproyectoTemp);
					} else {
						if(jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta!=null) {
							//jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setSelectedItem(presuproyectoTemp);
							if(jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.getItemCount()>0) {
								jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorProyectoPorNombre") || sFormularioTipoBusqueda.equals("Todos")){
					if(presuproyectoTemp!=null && jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta!=null) {
						jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setSelectedItem(presuproyectoTemp);
					} else {
						if(jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta!=null) {
							//jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setSelectedItem(presuproyectoTemp);
							if(jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.getItemCount()>0) {
								jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdPresuProyecto") || sFormularioTipoBusqueda.equals("Todos")){
					if(presuproyectoTemp!=null && jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta!=null) {
						jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setSelectedItem(presuproyectoTemp);
					} else {
						if(jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta!=null) {
							//jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setSelectedItem(presuproyectoTemp);
							if(jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.getItemCount()>0) {
								jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setSelectedIndex(0);
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

	public String getActualPresuProyectoForeignKeyDescripcion(Long idPresuProyectoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PresuProyecto  presuproyectoTemp=null;

			for(PresuProyecto presuproyectoAux:presuproyectosForeignKey) {
				if(presuproyectoAux.getId()!=null && presuproyectoAux.getId().equals(idPresuProyectoSeleccionado)) {
					presuproyectoTemp=presuproyectoAux;
					break;
				}
			}


			sDescripcion=PresuProyectoConstantesFunciones.getPresuProyectoDescripcion(presuproyectoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPresuProyectoForeignKeyGenerico(Long idPresuProyectoSeleccionado,JComboBox jComboBoxid_presu_proyectoPresuProyectoCuentaGenerico)throws Exception
	{
		try
		{
			PresuProyecto  presuproyectoTemp=null;

			for(PresuProyecto presuproyectoAux:presuproyectosForeignKey) {
				if(presuproyectoAux.getId()!=null && presuproyectoAux.getId().equals(idPresuProyectoSeleccionado)) {
					presuproyectoTemp=presuproyectoAux;
					break;
				}
			}

			if(presuproyectoTemp!=null) {
				jComboBoxid_presu_proyectoPresuProyectoCuentaGenerico.setSelectedItem(presuproyectoTemp);
			} else {
				if(jComboBoxid_presu_proyectoPresuProyectoCuentaGenerico!=null && jComboBoxid_presu_proyectoPresuProyectoCuentaGenerico.getItemCount()>0) {
					jComboBoxid_presu_proyectoPresuProyectoCuentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPresuTipoCuentaProyectoForeignKey(Long idPresuTipoCuentaProyectoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PresuTipoCuentaProyecto  presutipocuentaproyectoTemp=null;

			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectosForeignKey) {
				if(presutipocuentaproyectoAux.getId()!=null && presutipocuentaproyectoAux.getId().equals(idPresuTipoCuentaProyectoSeleccionado)) {
					presutipocuentaproyectoTemp=presutipocuentaproyectoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(presutipocuentaproyectoTemp!=null) {

					if(this.presuproyectocuenta!=null) {
						this.presuproyectocuenta.setPresuTipoCuentaProyecto(presutipocuentaproyectoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
						this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setSelectedItem(presutipocuentaproyectoTemp);
					}
				} else {
					//jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setSelectedItem(presutipocuentaproyectoTemp);
					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPresuTipoCuentaProyecto") || sFormularioTipoBusqueda.equals("Todos")){
					if(presutipocuentaproyectoTemp!=null && jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta!=null) {
						jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setSelectedItem(presutipocuentaproyectoTemp);
					} else {
						if(jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta!=null) {
							//jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setSelectedItem(presutipocuentaproyectoTemp);
							if(jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.getItemCount()>0) {
								jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setSelectedIndex(0);
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

	public String getActualPresuTipoCuentaProyectoForeignKeyDescripcion(Long idPresuTipoCuentaProyectoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PresuTipoCuentaProyecto  presutipocuentaproyectoTemp=null;

			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectosForeignKey) {
				if(presutipocuentaproyectoAux.getId()!=null && presutipocuentaproyectoAux.getId().equals(idPresuTipoCuentaProyectoSeleccionado)) {
					presutipocuentaproyectoTemp=presutipocuentaproyectoAux;
					break;
				}
			}


			sDescripcion=PresuTipoCuentaProyectoConstantesFunciones.getPresuTipoCuentaProyectoDescripcion(presutipocuentaproyectoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPresuTipoCuentaProyectoForeignKeyGenerico(Long idPresuTipoCuentaProyectoSeleccionado,JComboBox jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuentaGenerico)throws Exception
	{
		try
		{
			PresuTipoCuentaProyecto  presutipocuentaproyectoTemp=null;

			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectosForeignKey) {
				if(presutipocuentaproyectoAux.getId()!=null && presutipocuentaproyectoAux.getId().equals(idPresuTipoCuentaProyectoSeleccionado)) {
					presutipocuentaproyectoTemp=presutipocuentaproyectoAux;
					break;
				}
			}

			if(presutipocuentaproyectoTemp!=null) {
				jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuentaGenerico.setSelectedItem(presutipocuentaproyectoTemp);
			} else {
				if(jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuentaGenerico!=null && jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuentaGenerico.getItemCount()>0) {
					jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableForeignKey(Long idCuentaContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableTemp!=null) {

					if(this.presuproyectocuenta!=null) {
						this.presuproyectocuenta.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
						this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contablePresuProyectoCuenta.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setSelectedIndex(0);
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

	public String getActualCuentaContableForeignKeyDescripcion(Long idCuentaContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contablePresuProyectoCuentaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(cuentacontableTemp!=null) {
				jComboBoxid_cuenta_contablePresuProyectoCuentaGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contablePresuProyectoCuentaGenerico!=null && jComboBoxid_cuenta_contablePresuProyectoCuentaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contablePresuProyectoCuentaGenerico.setSelectedIndex(0);
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

					if(this.presuproyectocuenta!=null) {
						this.presuproyectocuenta.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
						this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoPresuProyectoCuenta.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoPresuProyectoCuentaGenerico)throws Exception
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
				jComboBoxid_empleadoPresuProyectoCuentaGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoPresuProyectoCuentaGenerico!=null && jComboBoxid_empleadoPresuProyectoCuentaGenerico.getItemCount()>0) {
					jComboBoxid_empleadoPresuProyectoCuentaGenerico.setSelectedIndex(0);
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

					if(this.presuproyectocuenta!=null) {
						this.presuproyectocuenta.setPresuEstado(presuestadoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
						this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.setSelectedItem(presuestadoTemp);
					}
				} else {
					//jComboBoxid_presu_estadoPresuProyectoCuenta.setSelectedItem(presuestadoTemp);
					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPresuEstado") || sFormularioTipoBusqueda.equals("Todos")){
					if(presuestadoTemp!=null && jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta!=null) {
						jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setSelectedItem(presuestadoTemp);
					} else {
						if(jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta!=null) {
							//jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setSelectedItem(presuestadoTemp);
							if(jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.getItemCount()>0) {
								jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setSelectedIndex(0);
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
	public void setActualPresuEstadoForeignKeyGenerico(Long idPresuEstadoSeleccionado,JComboBox jComboBoxid_presu_estadoPresuProyectoCuentaGenerico)throws Exception
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
				jComboBoxid_presu_estadoPresuProyectoCuentaGenerico.setSelectedItem(presuestadoTemp);
			} else {
				if(jComboBoxid_presu_estadoPresuProyectoCuentaGenerico!=null && jComboBoxid_presu_estadoPresuProyectoCuentaGenerico.getItemCount()>0) {
					jComboBoxid_presu_estadoPresuProyectoCuentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPresuProyectoForeignKey(PresuProyectoCuenta presuproyectocuenta,JComboBox jComboBoxid_presu_proyectoPresuProyectoCuentaGenerico)throws Exception
	{
		try
		{
			PresuProyecto  presuproyectoAux=new PresuProyecto();

			if(jComboBoxid_presu_proyectoPresuProyectoCuentaGenerico==null) {
				presuproyectoAux=(PresuProyecto)this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.getSelectedItem();
			} else {
				presuproyectoAux=(PresuProyecto)jComboBoxid_presu_proyectoPresuProyectoCuentaGenerico.getSelectedItem();
			}

			if(presuproyectoAux!=null && presuproyectoAux.getId()!=null) {
				presuproyectocuenta.setid_presu_proyecto(presuproyectoAux.getId());
				presuproyectocuenta.setpresuproyecto_descripcion(PresuProyectoCuentaConstantesFunciones.getPresuProyectoDescripcion(presuproyectoAux));
				presuproyectocuenta.setPresuProyecto(presuproyectoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPresuTipoCuentaProyectoForeignKey(PresuProyectoCuenta presuproyectocuenta,JComboBox jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuentaGenerico)throws Exception
	{
		try
		{
			PresuTipoCuentaProyecto  presutipocuentaproyectoAux=new PresuTipoCuentaProyecto();

			if(jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuentaGenerico==null) {
				presutipocuentaproyectoAux=(PresuTipoCuentaProyecto)this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.getSelectedItem();
			} else {
				presutipocuentaproyectoAux=(PresuTipoCuentaProyecto)jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuentaGenerico.getSelectedItem();
			}

			if(presutipocuentaproyectoAux!=null && presutipocuentaproyectoAux.getId()!=null) {
				presuproyectocuenta.setid_presu_tipo_cuenta_proyecto(presutipocuentaproyectoAux.getId());
				presuproyectocuenta.setpresutipocuentaproyecto_descripcion(PresuProyectoCuentaConstantesFunciones.getPresuTipoCuentaProyectoDescripcion(presutipocuentaproyectoAux));
				presuproyectocuenta.setPresuTipoCuentaProyecto(presutipocuentaproyectoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(PresuProyectoCuenta presuproyectocuenta,JComboBox jComboBoxid_cuenta_contablePresuProyectoCuentaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contablePresuProyectoCuentaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contablePresuProyectoCuentaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				presuproyectocuenta.setid_cuenta_contable(cuentacontableAux.getId());
				presuproyectocuenta.setcuentacontable_descripcion(PresuProyectoCuentaConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				presuproyectocuenta.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(PresuProyectoCuenta presuproyectocuenta,JComboBox jComboBoxid_empleadoPresuProyectoCuentaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoPresuProyectoCuentaGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoPresuProyectoCuentaGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				presuproyectocuenta.setid_empleado(empleadoAux.getId());
				presuproyectocuenta.setempleado_descripcion(PresuProyectoCuentaConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				presuproyectocuenta.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPresuEstadoForeignKey(PresuProyectoCuenta presuproyectocuenta,JComboBox jComboBoxid_presu_estadoPresuProyectoCuentaGenerico)throws Exception
	{
		try
		{
			PresuEstado  presuestadoAux=new PresuEstado();

			if(jComboBoxid_presu_estadoPresuProyectoCuentaGenerico==null) {
				presuestadoAux=(PresuEstado)this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.getSelectedItem();
			} else {
				presuestadoAux=(PresuEstado)jComboBoxid_presu_estadoPresuProyectoCuentaGenerico.getSelectedItem();
			}

			if(presuestadoAux!=null && presuestadoAux.getId()!=null) {
				presuproyectocuenta.setid_presu_estado(presuestadoAux.getId());
				presuproyectocuenta.setpresuestado_descripcion(PresuProyectoCuentaConstantesFunciones.getPresuEstadoDescripcion(presuestadoAux));
				presuproyectocuenta.setPresuEstado(presuestadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePresuProyectosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPresuProyecto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { 
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.removeAllItems();

							for(PresuProyecto presuproyecto:this.presuproyectosForeignKey) {
								this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.addItem(presuproyecto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { 
					}

					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorProyectoPorCodigo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.removeAllItems();

							for(PresuProyecto presuproyecto:this.presuproyectosForeignKey) {
								this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.addItem(presuproyecto);
							}
						}

						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorProyectoPorNombre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.removeAllItems();

							for(PresuProyecto presuproyecto:this.presuproyectosForeignKey) {
								this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.addItem(presuproyecto);
							}
						}

						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdPresuProyecto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.removeAllItems();

							for(PresuProyecto presuproyecto:this.presuproyectosForeignKey) {
								this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.addItem(presuproyecto);
							}
						}

						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePresuTipoCuentaProyectosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPresuTipoCuentaProyecto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { 
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.removeAllItems();

							for(PresuTipoCuentaProyecto presutipocuentaproyecto:this.presutipocuentaproyectosForeignKey) {
								this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.addItem(presutipocuentaproyecto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { 
					}

					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPresuTipoCuentaProyecto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.removeAllItems();

							for(PresuTipoCuentaProyecto presutipocuentaproyecto:this.presutipocuentaproyectosForeignKey) {
								this.jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.addItem(presutipocuentaproyecto);
							}
						}

						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { 
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { 
					}

					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.addItem(cuentacontable);
							}
						}

						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { 
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { 
					}

					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.addItem(empleado);
							}
						}

						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { 
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.removeAllItems();

							for(PresuEstado presuestado:this.presuestadosForeignKey) {
								this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.addItem(presuestado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { 
					}

					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPresuEstado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.removeAllItems();

							for(PresuEstado presuestado:this.presuestadosForeignKey) {
								this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.addItem(presuestado);
							}
						}

						if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePresuProyectoForeignKey(PresuProyecto presuproyecto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.setSelectedItem(presuproyecto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setSelectedItem(presuproyecto);
						} else {
							this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setSelectedItem(presuproyecto);
						} else {
							this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setSelectedItem(presuproyecto);
						} else {
							this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePresuTipoCuentaProyectoForeignKey(PresuTipoCuentaProyecto presutipocuentaproyecto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setSelectedItem(presutipocuentaproyecto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setSelectedItem(presutipocuentaproyecto);
						} else {
							this.jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.setSelectedItem(presuestado);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setSelectedItem(presuestado);
						} else {
							this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPresuProyectoCuenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresuProyectoCuentaConstantesFunciones.refrescarForeignKeysDescripcionesPresuProyectoCuenta(this.presuproyectocuentaLogic.getPresuProyectoCuentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresuProyectoCuentaConstantesFunciones.refrescarForeignKeysDescripcionesPresuProyectoCuenta(this.presuproyectocuentas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(PresuProyecto.class));
		classes.add(new Classe(PresuTipoCuentaProyecto.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(PresuEstado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presuproyectocuentaLogic.setPresuProyectoCuentas(this.presuproyectocuentas);
			presuproyectocuentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresuProyectoCuentaParameterReturnGeneral getPresuProyectoCuentaParameterGeneral() {
		return this.presuproyectocuentaParameterGeneral;
	}
	
	public void setPresuProyectoCuentaParameterGeneral(PresuProyectoCuentaParameterReturnGeneral presuproyectocuentaParameterGeneral) {
		this.presuproyectocuentaParameterGeneral = presuproyectocuentaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresuProyectoCuenta() {
		return isPermisoTodoPresuProyectoCuenta;
	}

	public void setIsPermisoTodoPresuProyectoCuenta(Boolean isPermisoTodoPresuProyectoCuenta) {
		this.isPermisoTodoPresuProyectoCuenta = isPermisoTodoPresuProyectoCuenta;
	}

	public Boolean getIsPermisoNuevoPresuProyectoCuenta() {
		return isPermisoNuevoPresuProyectoCuenta;
	}

	public void setIsPermisoNuevoPresuProyectoCuenta(Boolean isPermisoNuevoPresuProyectoCuenta) {
		this.isPermisoNuevoPresuProyectoCuenta = isPermisoNuevoPresuProyectoCuenta;
	}

	public Boolean getIsPermisoActualizarPresuProyectoCuenta() {
		return isPermisoActualizarPresuProyectoCuenta;
	}

	public void setIsPermisoActualizarPresuProyectoCuenta(Boolean isPermisoActualizarPresuProyectoCuenta) {
		this.isPermisoActualizarPresuProyectoCuenta = isPermisoActualizarPresuProyectoCuenta;
	}

	public Boolean getIsPermisoEliminarPresuProyectoCuenta() {
		return isPermisoEliminarPresuProyectoCuenta;
	}

	public void setIsPermisoEliminarPresuProyectoCuenta(Boolean isPermisoEliminarPresuProyectoCuenta) {
		this.isPermisoEliminarPresuProyectoCuenta = isPermisoEliminarPresuProyectoCuenta;
	}

	public Boolean getIsPermisoGuardarCambiosPresuProyectoCuenta() {
		return isPermisoGuardarCambiosPresuProyectoCuenta;
	}

	public void setIsPermisoGuardarCambiosPresuProyectoCuenta(Boolean isPermisoGuardarCambiosPresuProyectoCuenta) {
		this.isPermisoGuardarCambiosPresuProyectoCuenta = isPermisoGuardarCambiosPresuProyectoCuenta;
	}
	
	public Boolean getIsPermisoConsultaPresuProyectoCuenta() {
		return isPermisoConsultaPresuProyectoCuenta;
	}

	public void setIsPermisoConsultaPresuProyectoCuenta(Boolean isPermisoConsultaPresuProyectoCuenta) {
		this.isPermisoConsultaPresuProyectoCuenta = isPermisoConsultaPresuProyectoCuenta;
	}

	public Boolean getIsPermisoBusquedaPresuProyectoCuenta() {
		return isPermisoBusquedaPresuProyectoCuenta;
	}

	public void setIsPermisoBusquedaPresuProyectoCuenta(Boolean isPermisoBusquedaPresuProyectoCuenta) {
		this.isPermisoBusquedaPresuProyectoCuenta = isPermisoBusquedaPresuProyectoCuenta;
	}

	public Boolean getIsPermisoReportePresuProyectoCuenta() {
		return isPermisoReportePresuProyectoCuenta;
	}

	public void setIsPermisoReportePresuProyectoCuenta(Boolean isPermisoReportePresuProyectoCuenta) {
		this.isPermisoReportePresuProyectoCuenta = isPermisoReportePresuProyectoCuenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresuProyectoCuenta() {
		return isPermisoPaginacionMedioPresuProyectoCuenta;
	}

	public void setIsPermisoPaginacionMedioPresuProyectoCuenta(Boolean isPermisoPaginacionMedioPresuProyectoCuenta) {
		this.isPermisoPaginacionMedioPresuProyectoCuenta = isPermisoPaginacionMedioPresuProyectoCuenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresuProyectoCuenta() {
		return isPermisoPaginacionTodoPresuProyectoCuenta;
	}

	public void setIsPermisoPaginacionTodoPresuProyectoCuenta(Boolean isPermisoPaginacionTodoPresuProyectoCuenta) {
		this.isPermisoPaginacionTodoPresuProyectoCuenta = isPermisoPaginacionTodoPresuProyectoCuenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresuProyectoCuenta() {
		return isPermisoPaginacionAltoPresuProyectoCuenta;
	}

	public void setIsPermisoPaginacionAltoPresuProyectoCuenta(Boolean isPermisoPaginacionAltoPresuProyectoCuenta) {
		this.isPermisoPaginacionAltoPresuProyectoCuenta = isPermisoPaginacionAltoPresuProyectoCuenta;
	}
	
	public Boolean getIsPermisoCopiarPresuProyectoCuenta() {
		return isPermisoCopiarPresuProyectoCuenta;
	}

	public void setIsPermisoCopiarPresuProyectoCuenta(Boolean isPermisoCopiarPresuProyectoCuenta) {
		this.isPermisoCopiarPresuProyectoCuenta = isPermisoCopiarPresuProyectoCuenta;
	}
	
	public Boolean getIsPermisoVerFormPresuProyectoCuenta() {
		return isPermisoVerFormPresuProyectoCuenta;
	}

	public void setIsPermisoVerFormPresuProyectoCuenta(Boolean isPermisoVerFormPresuProyectoCuenta) {
		this.isPermisoVerFormPresuProyectoCuenta = isPermisoVerFormPresuProyectoCuenta;
	}
	
	public Boolean getIsPermisoDuplicarPresuProyectoCuenta() {
		return isPermisoDuplicarPresuProyectoCuenta;
	}

	public void setIsPermisoDuplicarPresuProyectoCuenta(Boolean isPermisoDuplicarPresuProyectoCuenta) {
		this.isPermisoDuplicarPresuProyectoCuenta = isPermisoDuplicarPresuProyectoCuenta;
	}
	
	public Boolean getIsPermisoOrdenPresuProyectoCuenta() {
		return isPermisoOrdenPresuProyectoCuenta;
	}

	public void setIsPermisoOrdenPresuProyectoCuenta(Boolean isPermisoOrdenPresuProyectoCuenta) {
		this.isPermisoOrdenPresuProyectoCuenta = isPermisoOrdenPresuProyectoCuenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresuProyectoCuenta() {
		return isVisibilidadCeldaNuevoPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaNuevoPresuProyectoCuenta(Boolean isVisibilidadCeldaNuevoPresuProyectoCuenta) {
		this.isVisibilidadCeldaNuevoPresuProyectoCuenta = isVisibilidadCeldaNuevoPresuProyectoCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresuProyectoCuenta() {
		return isVisibilidadCeldaDuplicarPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaDuplicarPresuProyectoCuenta(Boolean isVisibilidadCeldaDuplicarPresuProyectoCuenta) {
		this.isVisibilidadCeldaDuplicarPresuProyectoCuenta = isVisibilidadCeldaDuplicarPresuProyectoCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresuProyectoCuenta() {
		return isVisibilidadCeldaCopiarPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaCopiarPresuProyectoCuenta(Boolean isVisibilidadCeldaCopiarPresuProyectoCuenta) {
		this.isVisibilidadCeldaCopiarPresuProyectoCuenta = isVisibilidadCeldaCopiarPresuProyectoCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresuProyectoCuenta() {
		return isVisibilidadCeldaVerFormPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaVerFormPresuProyectoCuenta(Boolean isVisibilidadCeldaVerFormPresuProyectoCuenta) {
		this.isVisibilidadCeldaVerFormPresuProyectoCuenta = isVisibilidadCeldaVerFormPresuProyectoCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresuProyectoCuenta() {
		return isVisibilidadCeldaOrdenPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaOrdenPresuProyectoCuenta(Boolean isVisibilidadCeldaOrdenPresuProyectoCuenta) {
		this.isVisibilidadCeldaOrdenPresuProyectoCuenta = isVisibilidadCeldaOrdenPresuProyectoCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta() {
		return isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta(Boolean isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta) {
		this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta = isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresuProyectoCuenta() {
		return isVisibilidadCeldaModificarPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaModificarPresuProyectoCuenta(Boolean isVisibilidadCeldaModificarPresuProyectoCuenta) {
		this.isVisibilidadCeldaModificarPresuProyectoCuenta = isVisibilidadCeldaModificarPresuProyectoCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresuProyectoCuenta() {
		return isVisibilidadCeldaActualizarPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaActualizarPresuProyectoCuenta(Boolean isVisibilidadCeldaActualizarPresuProyectoCuenta) {
		this.isVisibilidadCeldaActualizarPresuProyectoCuenta = isVisibilidadCeldaActualizarPresuProyectoCuenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresuProyectoCuenta() {
		return isVisibilidadCeldaEliminarPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaEliminarPresuProyectoCuenta(Boolean isVisibilidadCeldaEliminarPresuProyectoCuenta) {
		this.isVisibilidadCeldaEliminarPresuProyectoCuenta = isVisibilidadCeldaEliminarPresuProyectoCuenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresuProyectoCuenta() {
		return isVisibilidadCeldaCancelarPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaCancelarPresuProyectoCuenta(Boolean isVisibilidadCeldaCancelarPresuProyectoCuenta) {
		this.isVisibilidadCeldaCancelarPresuProyectoCuenta = isVisibilidadCeldaCancelarPresuProyectoCuenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresuProyectoCuenta() {
		return isVisibilidadCeldaGuardarPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaGuardarPresuProyectoCuenta(Boolean isVisibilidadCeldaGuardarPresuProyectoCuenta) {
		this.isVisibilidadCeldaGuardarPresuProyectoCuenta = isVisibilidadCeldaGuardarPresuProyectoCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresuProyectoCuenta() {
		return isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresuProyectoCuenta(Boolean isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta) {
		this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta = isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta;
	}
		
	public PresuProyectoCuentaSessionBean getpresuproyectocuentaSessionBean() {
		return this.presuproyectocuentaSessionBean;
	}
	
	public void setpresuproyectocuentaSessionBean(PresuProyectoCuentaSessionBean presuproyectocuentaSessionBean) {
		this.presuproyectocuentaSessionBean=presuproyectocuentaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorProyectoPorCodigo() {
		return this.isVisibilidadBusquedaPorProyectoPorCodigo;
	}

	public void setisVisibilidadBusquedaPorProyectoPorCodigo(Boolean isVisibilidadBusquedaPorProyectoPorCodigo) {
		this.isVisibilidadBusquedaPorProyectoPorCodigo=isVisibilidadBusquedaPorProyectoPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorProyectoPorNombre() {
		return this.isVisibilidadBusquedaPorProyectoPorNombre;
	}

	public void setisVisibilidadBusquedaPorProyectoPorNombre(Boolean isVisibilidadBusquedaPorProyectoPorNombre) {
		this.isVisibilidadBusquedaPorProyectoPorNombre=isVisibilidadBusquedaPorProyectoPorNombre;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
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

	public Boolean getisVisibilidadFK_IdPresuProyecto() {
		return this.isVisibilidadFK_IdPresuProyecto;
	}

	public void setisVisibilidadFK_IdPresuProyecto(Boolean isVisibilidadFK_IdPresuProyecto) {
		this.isVisibilidadFK_IdPresuProyecto=isVisibilidadFK_IdPresuProyecto;
	}

	public Boolean getisVisibilidadFK_IdPresuTipoCuentaProyecto() {
		return this.isVisibilidadFK_IdPresuTipoCuentaProyecto;
	}

	public void setisVisibilidadFK_IdPresuTipoCuentaProyecto(Boolean isVisibilidadFK_IdPresuTipoCuentaProyecto) {
		this.isVisibilidadFK_IdPresuTipoCuentaProyecto=isVisibilidadFK_IdPresuTipoCuentaProyecto;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta)throws Exception {
		try {
			
				this.setActualParaGuardarPresuProyectoForeignKey(presuproyectocuenta,null);
				this.setActualParaGuardarPresuTipoCuentaProyectoForeignKey(presuproyectocuenta,null);
				this.setActualParaGuardarCuentaContableForeignKey(presuproyectocuenta,null);
				this.setActualParaGuardarEmpleadoForeignKey(presuproyectocuenta,null);
				this.setActualParaGuardarPresuEstadoForeignKey(presuproyectocuenta,null);
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
	
	public void bugActualizarReferenciaActual(PresuProyectoCuenta presuproyectocuenta,PresuProyectoCuenta presuproyectocuentaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresuProyectoCuenta(presuproyectocuenta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presuproyectocuentaAux.setId(presuproyectocuenta.getId());
		presuproyectocuentaAux.setVersionRow(presuproyectocuenta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresuProyectoCuenta();
		
			int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presuproyectocuentaValidator.getInvalidValues(this.presuproyectocuenta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presuproyectocuentaLogic.setDatosCliente(datosCliente);
			presuproyectocuentaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presuproyectocuentaAux=new  PresuProyectoCuenta();
				
				presuproyectocuentaAux.setIsNew(true);
				presuproyectocuentaAux.setIsChanged(true);
				
				presuproyectocuentaAux.setPresuProyectoCuentaOriginal(this.presuproyectocuenta);
				
				presuproyectocuentaAux.setId(this.presuproyectocuenta.getId());	
				presuproyectocuentaAux.setVersionRow(this.presuproyectocuenta.getVersionRow());	
				presuproyectocuentaAux.setid_presu_proyecto(this.presuproyectocuenta.getid_presu_proyecto());	
				presuproyectocuentaAux.setid_presu_tipo_cuenta_proyecto(this.presuproyectocuenta.getid_presu_tipo_cuenta_proyecto());	
				presuproyectocuentaAux.setcodigo(this.presuproyectocuenta.getcodigo());	
				presuproyectocuentaAux.setnombre(this.presuproyectocuenta.getnombre());	
				presuproyectocuentaAux.setid_cuenta_contable(this.presuproyectocuenta.getid_cuenta_contable());	
				presuproyectocuentaAux.setid_empleado(this.presuproyectocuenta.getid_empleado());	
				presuproyectocuentaAux.setfecha(this.presuproyectocuenta.getfecha());	
				presuproyectocuentaAux.setvalor(this.presuproyectocuenta.getvalor());	
				presuproyectocuentaAux.setorden(this.presuproyectocuenta.getorden());	
				presuproyectocuentaAux.setid_presu_estado(this.presuproyectocuenta.getid_presu_estado());	
				presuproyectocuentaAux.setdescripcion(this.presuproyectocuenta.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presuproyectocuentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presuproyectocuentaAux,presuproyectocuentaLogic.getPresuProyectoCuentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuproyectocuentaAux,presuproyectocuentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaLogic.savePresuProyectoCuentas();//WithConnection
						//presuproyectocuentaLogic.getSetVersionRowPresuProyectoCuentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presuproyectocuenta,presuproyectocuentaAux);
					
					this.refrescarForeignKeysDescripcionesPresuProyectoCuenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.getPresuAsignacions().addAll(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacions.addAll(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presuproyectocuentaLogic.savePresuProyectoCuentaRelaciones(presuproyectocuentaAux,this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.getPresuAsignacions());//WithConnection
								//presuproyectocuentaLogic.getSetVersionRowPresuProyectoCuentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presuproyectocuenta,presuproyectocuentaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.setPresuAsignacions(new ArrayList<PresuAsignacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacions= new ArrayList<PresuAsignacion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();}
							presuproyectocuentaAux.setPresuAsignacions(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.getPresuAsignacions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presuproyectocuentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presuproyectocuentaAux,presuproyectocuentaLogic.getPresuProyectoCuentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presuproyectocuentaAux,presuproyectocuentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presuproyectocuenta,presuproyectocuentaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presuproyectocuentaAux=new  PresuProyectoCuenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() 
					|| (this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() && this.presuproyectocuenta.getId()>=0)) {
						
					presuproyectocuentaAux.setIsNew(false);
				}
				
				presuproyectocuentaAux.setIsDeleted(false);
			
				presuproyectocuentaAux.setId(this.presuproyectocuenta.getId());	
				presuproyectocuentaAux.setVersionRow(this.presuproyectocuenta.getVersionRow());	
				presuproyectocuentaAux.setid_presu_proyecto(this.presuproyectocuenta.getid_presu_proyecto());	
				presuproyectocuentaAux.setid_presu_tipo_cuenta_proyecto(this.presuproyectocuenta.getid_presu_tipo_cuenta_proyecto());	
				presuproyectocuentaAux.setcodigo(this.presuproyectocuenta.getcodigo());	
				presuproyectocuentaAux.setnombre(this.presuproyectocuenta.getnombre());	
				presuproyectocuentaAux.setid_cuenta_contable(this.presuproyectocuenta.getid_cuenta_contable());	
				presuproyectocuentaAux.setid_empleado(this.presuproyectocuenta.getid_empleado());	
				presuproyectocuentaAux.setfecha(this.presuproyectocuenta.getfecha());	
				presuproyectocuentaAux.setvalor(this.presuproyectocuenta.getvalor());	
				presuproyectocuentaAux.setorden(this.presuproyectocuenta.getorden());	
				presuproyectocuentaAux.setid_presu_estado(this.presuproyectocuenta.getid_presu_estado());	
				presuproyectocuentaAux.setdescripcion(this.presuproyectocuenta.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presuproyectocuentaAux,presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuproyectocuentaAux,presuproyectocuentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaLogic.savePresuProyectoCuentas();//WithConnection
						//presuproyectocuentaLogic.getSetVersionRowPresuProyectoCuentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presuproyectocuenta,presuproyectocuentaAux);
					
					this.refrescarForeignKeysDescripcionesPresuProyectoCuenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.getPresuAsignacions().addAll(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacions.addAll(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presuproyectocuentaLogic.savePresuProyectoCuentaRelaciones(presuproyectocuentaAux,this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.getPresuAsignacions());//WithConnection
								//presuproyectocuentaLogic.getSetVersionRowPresuProyectoCuentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presuproyectocuenta,presuproyectocuentaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.setPresuAsignacions(new ArrayList<PresuAsignacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacions= new ArrayList<PresuAsignacion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();}
							presuproyectocuentaAux.setPresuAsignacions(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.getPresuAsignacions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presuproyectocuentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presuproyectocuentaAux,presuproyectocuentaLogic.getPresuProyectoCuentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presuproyectocuentaAux,presuproyectocuentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presuproyectocuenta,presuproyectocuentaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presuproyectocuentaAux=new  PresuProyectoCuenta();
				
				presuproyectocuentaAux.setIsNew(false);
				presuproyectocuentaAux.setIsChanged(false);
				
				presuproyectocuentaAux.setIsDeleted(true);
				
				presuproyectocuentaAux.setId(this.presuproyectocuenta.getId());	
				presuproyectocuentaAux.setVersionRow(this.presuproyectocuenta.getVersionRow());	
				presuproyectocuentaAux.setid_presu_proyecto(this.presuproyectocuenta.getid_presu_proyecto());	
				presuproyectocuentaAux.setid_presu_tipo_cuenta_proyecto(this.presuproyectocuenta.getid_presu_tipo_cuenta_proyecto());	
				presuproyectocuentaAux.setcodigo(this.presuproyectocuenta.getcodigo());	
				presuproyectocuentaAux.setnombre(this.presuproyectocuenta.getnombre());	
				presuproyectocuentaAux.setid_cuenta_contable(this.presuproyectocuenta.getid_cuenta_contable());	
				presuproyectocuentaAux.setid_empleado(this.presuproyectocuenta.getid_empleado());	
				presuproyectocuentaAux.setfecha(this.presuproyectocuenta.getfecha());	
				presuproyectocuentaAux.setvalor(this.presuproyectocuenta.getvalor());	
				presuproyectocuentaAux.setorden(this.presuproyectocuenta.getorden());	
				presuproyectocuentaAux.setid_presu_estado(this.presuproyectocuenta.getid_presu_estado());	
				presuproyectocuentaAux.setdescripcion(this.presuproyectocuenta.getdescripcion());	
				
				if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presuproyectocuentaAux.getId()>=0) {	
						this.presuproyectocuentasEliminados.add(presuproyectocuentaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presuproyectocuentaAux,presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuproyectocuentaAux,presuproyectocuentas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaLogic.savePresuProyectoCuentas();//WithConnection
						//presuproyectocuentaLogic.getSetVersionRowPresuProyectoCuentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.getPresuAsignacions().addAll(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacions.addAll(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presuproyectocuentaLogic.savePresuProyectoCuentaRelaciones(presuproyectocuentaAux,this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.getPresuAsignacions());//WithConnection
								//presuproyectocuentaLogic.getSetVersionRowPresuProyectoCuentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.setPresuAsignacions(new ArrayList<PresuAsignacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacions= new ArrayList<PresuAsignacion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();}
							presuproyectocuentaAux.setPresuAsignacions(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.getPresuAsignacions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.presuproyectocuentaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(presuproyectocuentaAux,presuproyectocuentaLogic.getPresuProyectoCuentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(presuproyectocuentaAux,presuproyectocuentas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(this.presuproyectocuentasEliminados);
					
					presuproyectocuentaLogic.savePresuProyectoCuentas();//WithConnection
					//presuproyectocuentaLogic.getSetVersionRowPresuProyectoCuentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPresuProyectoCuenta();
				
				this.presuproyectocuentasEliminados= new ArrayList<PresuProyectoCuenta>();		
			}
			
			if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cuenta Contable Proyecto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Contable Proyecto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presuproyectocuenta=presuproyectocuentaAux;
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
      		//this.finishProcessPresuProyectoCuenta();
      	}
		
	}	
	
	public void actualizarRelaciones(PresuProyectoCuenta presuproyectocuentaLocal) throws Exception {
		
		if(this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				presuproyectocuentaLocal.setPresuAsignacions(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.getPresuAsignacions());
			
			} else {
			
				presuproyectocuentaLocal.setPresuAsignacions(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresuProyectoCuenta presuproyectocuentaLocal) throws Exception {	
		if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PresuProyectoDetalleFormJInternalFrame.class)) {
				PresuProyectoBeanSwingJInternalFrame presuproyectoBeanSwingJInternalFrameLocal=(PresuProyectoBeanSwingJInternalFrame) ((PresuProyectoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				presuproyectoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPresuProyecto(presuproyectoBeanSwingJInternalFrameLocal.getpresuproyecto(),true);
				presuproyectoBeanSwingJInternalFrameLocal.actualizarLista(presuproyectoBeanSwingJInternalFrameLocal.presuproyecto,this.presuproyectosForeignKey);

				presuproyectoBeanSwingJInternalFrameLocal.actualizarRelaciones(presuproyectoBeanSwingJInternalFrameLocal.presuproyecto);

				presuproyectocuentaLocal.setPresuProyecto(presuproyectoBeanSwingJInternalFrameLocal.presuproyecto);

				this.addItemDefectoCombosForeignKeyPresuProyecto();
				this.cargarCombosFramePresuProyectosForeignKey("Formulario");
				this.setActualPresuProyectoForeignKey(presuproyectoBeanSwingJInternalFrameLocal.presuproyecto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PresuTipoCuentaProyectoDetalleFormJInternalFrame.class)) {
				PresuTipoCuentaProyectoBeanSwingJInternalFrame presutipocuentaproyectoBeanSwingJInternalFrameLocal=(PresuTipoCuentaProyectoBeanSwingJInternalFrame) ((PresuTipoCuentaProyectoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				presutipocuentaproyectoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPresuTipoCuentaProyecto(presutipocuentaproyectoBeanSwingJInternalFrameLocal.getpresutipocuentaproyecto(),true);
				presutipocuentaproyectoBeanSwingJInternalFrameLocal.actualizarLista(presutipocuentaproyectoBeanSwingJInternalFrameLocal.presutipocuentaproyecto,this.presutipocuentaproyectosForeignKey);

				presutipocuentaproyectoBeanSwingJInternalFrameLocal.actualizarRelaciones(presutipocuentaproyectoBeanSwingJInternalFrameLocal.presutipocuentaproyecto);

				presuproyectocuentaLocal.setPresuTipoCuentaProyecto(presutipocuentaproyectoBeanSwingJInternalFrameLocal.presutipocuentaproyecto);

				this.addItemDefectoCombosForeignKeyPresuTipoCuentaProyecto();
				this.cargarCombosFramePresuTipoCuentaProyectosForeignKey("Formulario");
				this.setActualPresuTipoCuentaProyectoForeignKey(presutipocuentaproyectoBeanSwingJInternalFrameLocal.presutipocuentaproyecto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				presuproyectocuentaLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				presuproyectocuentaLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PresuEstadoDetalleFormJInternalFrame.class)) {
				PresuEstadoBeanSwingJInternalFrame presuestadoBeanSwingJInternalFrameLocal=(PresuEstadoBeanSwingJInternalFrame) ((PresuEstadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				presuestadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPresuEstado(presuestadoBeanSwingJInternalFrameLocal.getpresuestado(),true);
				presuestadoBeanSwingJInternalFrameLocal.actualizarLista(presuestadoBeanSwingJInternalFrameLocal.presuestado,this.presuestadosForeignKey);

				presuestadoBeanSwingJInternalFrameLocal.actualizarRelaciones(presuestadoBeanSwingJInternalFrameLocal.presuestado);

				presuproyectocuentaLocal.setPresuEstado(presuestadoBeanSwingJInternalFrameLocal.presuestado);

				this.addItemDefectoCombosForeignKeyPresuEstado();
				this.cargarCombosFramePresuEstadosForeignKey("Formulario");
				this.setActualPresuEstadoForeignKey(presuestadoBeanSwingJInternalFrameLocal.presuestado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresuProyectoCuentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presuproyectocuentaValidator.getInvalidValues(this.presuproyectocuenta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresuProyectoCuenta presuproyectocuenta,List<PresuProyectoCuenta> presuproyectocuentas) throws Exception {
		try	{		
			PresuProyectoCuentaConstantesFunciones.actualizarLista(presuproyectocuenta,presuproyectocuentas,this.presuproyectocuentaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresuProyectoCuenta presuproyectocuenta,List<PresuProyectoCuenta> presuproyectocuentas) throws Exception {
		try	{			
			PresuProyectoCuentaConstantesFunciones.actualizarSelectedLista(presuproyectocuenta,presuproyectocuentas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresuProyectoCuenta> presuproyectocuentasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presuproyectocuentasLocal=this.presuproyectocuentaLogic.getPresuProyectoCuentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presuproyectocuentasLocal=this.presuproyectocuentas;
			}
			//ARCHITECTURE
		
			for(PresuProyectoCuenta presuproyectocuentaLocal:presuproyectocuentasLocal) {
				if(this.permiteMantenimiento(presuproyectocuentaLocal) && presuproyectocuentaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresuProyectoCuentaConstantesFunciones.getPresuProyectoCuentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresuProyectoCuentaConstantesFunciones.IDPRESUPROYECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelid_presu_proyectoPresuProyectoCuenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoCuentaConstantesFunciones.IDPRESUTIPOCUENTAPROYECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoCuentaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelcodigoPresuProyectoCuenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoCuentaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelnombrePresuProyectoCuenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoCuentaConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelid_cuenta_contablePresuProyectoCuenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoCuentaConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelid_empleadoPresuProyectoCuenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoCuentaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelfechaPresuProyectoCuenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoCuentaConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelvalorPresuProyectoCuenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoCuentaConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelordenPresuProyectoCuenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoCuentaConstantesFunciones.IDPRESUESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelid_presu_estadoPresuProyectoCuenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoCuentaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabeldescripcionPresuProyectoCuenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelid_presu_proyectoPresuProyectoCuenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelcodigoPresuProyectoCuenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelnombrePresuProyectoCuenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelid_cuenta_contablePresuProyectoCuenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelid_empleadoPresuProyectoCuenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelfechaPresuProyectoCuenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelvalorPresuProyectoCuenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelordenPresuProyectoCuenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelid_presu_estadoPresuProyectoCuenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabeldescripcionPresuProyectoCuenta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PresuAsignacion")) {
			if(this.presuproyectocuenta==null) {
				this.presuproyectocuenta= new PresuProyectoCuenta();
			}

			if(this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPresuProyectoCuenta
				this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);

				this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.getpresuasignacion().setPresuProyectoCuenta(this.presuproyectocuenta);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPresuProyectoCuenta--;	
		
		
		this.presuproyectocuentaAux=new PresuProyectoCuenta();
		
		this.presuproyectocuentaAux.setId(this.iIdNuevoPresuProyectoCuenta);
		this.presuproyectocuentaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presuproyectocuentaLogic.getPresuProyectoCuentas().add(this.presuproyectocuentaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presuproyectocuentas.add(this.presuproyectocuentaAux);
		}
		//ARCHITECTURE
		
		this.presuproyectocuenta=this.presuproyectocuentaAux;
		
		if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresuProyectoCuenta(this.presuproyectocuenta);
			this.setVariablesObjetoActualToFormularioForeignKeyPresuProyectoCuenta(this.presuproyectocuenta);
		}
				
		//this.setDefaultControlesPresuProyectoCuenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresuProyectoCuenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresuProyectoCuenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuProyectoCuenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuProyectoCuenta(this.presuproyectocuentaBean,this.presuproyectocuenta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
			classes=PresuProyectoCuentaConstantesFunciones.getClassesRelationshipsOfPresuProyectoCuenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presuproyectocuentaReturnGeneral=presuproyectocuentaLogic.procesarEventosPresuProyectoCuentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuproyectocuentaLogic.getPresuProyectoCuentas(),this.presuproyectocuenta,this.presuproyectocuentaParameterGeneral,this.isEsNuevoPresuProyectoCuenta,classes);//this.presuproyectocuentaLogic.getPresuProyectoCuenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresuProyectoCuenta(this.presuproyectocuentaReturnGeneral,this.presuproyectocuentaBean,false);
		
		if(this.presuproyectocuentaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresuProyectoCuenta(this.presuproyectocuentaReturnGeneral.getPresuProyectoCuenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresuProyectoCuenta(this.presuproyectocuentaReturnGeneral.getPresuProyectoCuenta());
		}
		
		if(this.presuproyectocuentaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresuProyectoCuenta(this.presuproyectocuentaReturnGeneral.getPresuProyectoCuenta(),classes);//this.presuproyectocuentaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresuProyectoCuenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresuProyectoCuenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.RecargarFormPresuProyectoCuenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresuProyectoCuenta(false);
						
			if(presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionSessionBean.getEsGuardarRelacionado() && PresuAsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresuAsignacionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuProyectoCuenta();
			}
			
			this.actualizarVisualTableDatosPresuProyectoCuenta();
			
			this.jTableDatosPresuProyectoCuenta.setRowSelectionInterval(this.getIndiceNuevoPresuProyectoCuenta(), this.getIndiceNuevoPresuProyectoCuenta());
			
			this.seleccionarFilaTablaPresuProyectoCuentaActual();
						
			this.actualizarEstadoCeldasBotonesPresuProyectoCuenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresuProyectoCuenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldcodigoPresuProyectoCuenta.setEnabled(isHabilitar && this.presuproyectocuentaConstantesFunciones.activarcodigoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreanombrePresuProyectoCuenta.setEnabled(isHabilitar && this.presuproyectocuentaConstantesFunciones.activarnombrePresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jDateChooserfechaPresuProyectoCuenta.setEnabled(isHabilitar && this.presuproyectocuentaConstantesFunciones.activarfechaPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldvalorPresuProyectoCuenta.setEnabled(isHabilitar && this.presuproyectocuentaConstantesFunciones.activarvalorPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldordenPresuProyectoCuenta.setEnabled(isHabilitar && this.presuproyectocuentaConstantesFunciones.activarordenPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreadescripcionPresuProyectoCuenta.setEnabled(isHabilitar && this.presuproyectocuentaConstantesFunciones.activardescripcionPresuProyectoCuenta);	
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.setEnabled(isHabilitar && this.presuproyectocuentaConstantesFunciones.activarid_presu_proyectoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setEnabled(isHabilitar && this.presuproyectocuentaConstantesFunciones.activarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.setEnabled(isHabilitar && this.presuproyectocuentaConstantesFunciones.activarid_cuenta_contablePresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.setEnabled(isHabilitar && this.presuproyectocuentaConstantesFunciones.activarid_empleadoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.setEnabled(isHabilitar && this.presuproyectocuentaConstantesFunciones.activarid_presu_estadoPresuProyectoCuenta);
	};
	
	public void setDefaultControlesPresuProyectoCuenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresuProyectoCuenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presuproyectocuentaSessionBean.setConGuardarRelaciones(true);			
			this.presuproyectocuentaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTabbedPaneRelacionesPresuProyectoCuenta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.presuproyectocuentaSessionBean.setConGuardarRelaciones(false);			
			this.presuproyectocuentaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTabbedPaneRelacionesPresuProyectoCuenta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPresuProyectoCuenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentaLogic.getPresuProyectoCuentas()) {
				if(presuproyectocuentaAux.getId().equals(this.iIdNuevoPresuProyectoCuenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentas) {
				if(presuproyectocuentaAux.getId().equals(this.iIdNuevoPresuProyectoCuenta)) {
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
	
	public int getIndiceActualPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentaLogic.getPresuProyectoCuentas()) {
				if(presuproyectocuentaAux.getId().equals(presuproyectocuenta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentas) {
				if(presuproyectocuentaAux.getId().equals(presuproyectocuenta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuentaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentaLogic.getPresuProyectoCuentas()) {
				if(presuproyectocuentaAux.getPresuProyectoCuentaOriginal().getId().equals(presuproyectocuentaOriginal.getId())) {
					existe=true;
					presuproyectocuentaOriginal.setId(presuproyectocuentaAux.getId());
					presuproyectocuentaOriginal.setVersionRow(presuproyectocuentaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentas) {
				if(presuproyectocuentaAux.getPresuProyectoCuentaOriginal().getId().equals(presuproyectocuentaOriginal.getId())) {
					existe=true;
					presuproyectocuentaOriginal.setId(presuproyectocuentaAux.getId());
					presuproyectocuentaOriginal.setVersionRow(presuproyectocuentaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresuProyectoCuenta(Boolean esParaCancelar) throws Exception {
		presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
		presuproyectocuentaAux=new PresuProyectoCuenta();
		
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentaLogic.getPresuProyectoCuentas()) {
					if(presuproyectocuentaAux.getId()<0) {
						presuproyectocuentasAux.add(presuproyectocuentaAux);
					}		
				}
				this.iIdNuevoPresuProyectoCuenta=0L;
				this.presuproyectocuentaLogic.getPresuProyectoCuentas().removeAll(presuproyectocuentasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentas) {
					if(presuproyectocuentaAux.getId()<0) {
						presuproyectocuentasAux.add(presuproyectocuentaAux);
					}		
				}
				this.iIdNuevoPresuProyectoCuenta=0L;
				this.presuproyectocuentas.removeAll(presuproyectocuentasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresuProyectoCuenta 
					&& this.presuproyectocuentaLogic.getPresuProyectoCuentas().size()>0
					) {
					presuproyectocuentaAux=this.presuproyectocuentaLogic.getPresuProyectoCuentas().get(this.presuproyectocuentaLogic.getPresuProyectoCuentas().size() - 1);
				
					if(presuproyectocuentaAux.getId()<0) {
						this.presuproyectocuentaLogic.getPresuProyectoCuentas().remove(presuproyectocuentaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresuProyectoCuenta && this.presuproyectocuentas.size()>0) {
					presuproyectocuentaAux=this.presuproyectocuentas.get(this.presuproyectocuentas.size() - 1);
				
					if(presuproyectocuentaAux.getId()<0) {
						this.presuproyectocuentas.remove(presuproyectocuentaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresuProyectoCuenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presuproyectocuenta.getId()<0) {
				this.presuproyectocuentaLogic.getPresuProyectoCuentas().remove(this.presuproyectocuenta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presuproyectocuenta.getId()<0) {
				this.presuproyectocuentas.remove(this.presuproyectocuenta);
			}
		}			
	}
	
	public void setEstadosInicialesPresuProyectoCuenta(List<PresuProyectoCuenta> presuproyectocuentasAux) throws Exception {
		PresuProyectoCuentaConstantesFunciones.setEstadosInicialesPresuProyectoCuenta(presuproyectocuentasAux);
	}
	
	public void setEstadosInicialesPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuentaAux) throws Exception {
		PresuProyectoCuentaConstantesFunciones.setEstadosInicialesPresuProyectoCuenta(presuproyectocuentaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresuProyectoCuentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresuProyectoCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresuProyectoCuentaActual()) {
				if(!this.isEsNuevoPresuProyectoCuenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresuProyectoCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresuProyectoCuenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresuProyectoCuentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cuenta Contable Proyecto ?", "MANTENIMIENTO DE Cuenta Contable Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresuProyectoCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresuProyectoCuenta presuproyectocuenta) throws Exception {
		PresuProyectoCuentaConstantesFunciones.seleccionarAsignar(this.presuproyectocuenta,presuproyectocuenta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresuProyectoCuenta=this.isPermisoActualizarOriginalPresuProyectoCuenta;
			
			
			this.seleccionarAsignar(presuproyectocuenta);
			
			

			idCuentaContableActual=presuproyectocuenta.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();

			idEmpleadoActual=presuproyectocuenta.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuProyectoCuentaConstantesFunciones.quitarEspaciosPresuProyectoCuenta(this.presuproyectocuenta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresuProyectoCuenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presuproyectocuentaSessionBean.setsFuncionBusquedaRapida(this.presuproyectocuentaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableActual() throws Exception {
		try	{
			CuentaContable cuentacontableAux=new CuentaContable();

			if(this.idCuentaContableActual != null && this.idCuentaContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(this.idCuentaContableActual);
					cuentacontableAux= cuentacontableLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablesForeignKey=new ArrayList<CuentaContable>();
				cuentacontablesForeignKey.add(cuentacontableAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
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
			if(this.isEsNuevoPresuProyectoCuenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresuProyectoCuenta(esParaCancelar);				
				this.cancelarNuevoPresuProyectoCuenta(esParaCancelar);								
			}
			
			this.presuproyectocuenta=new PresuProyectoCuenta();
			
			this.inicializarPresuProyectoCuenta();
			
			this.actualizarEstadoCeldasBotonesPresuProyectoCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresuProyectoCuenta() throws Exception {
		try {
			PresuProyectoCuentaConstantesFunciones.inicializarPresuProyectoCuenta(this.presuproyectocuenta);
			
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
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presuproyectocuentaLogic.getPresuProyectoCuentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresuProyectoCuentas(String sAccionBusqueda,List<PresuProyectoCuenta> presuproyectocuentasParaReportes) throws Exception {
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
					sPathReporteFinal="PresuProyectoCuenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresuProyectoCuentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresuProyectoCuentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresuProyectoCuenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cuenta Contable Proyectoes");		
		parameters.put("busquedapor", PresuProyectoCuentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PresuAsignacion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PresuProyectoCuentaLogic presuproyectocuentaLogicAuxiliar=new PresuProyectoCuentaLogic();
					presuproyectocuentaLogicAuxiliar.setDatosCliente(presuproyectocuentaLogic.getDatosCliente());				
					presuproyectocuentaLogicAuxiliar.setPresuProyectoCuentas(presuproyectocuentasParaReportes);
					
					presuproyectocuentaLogicAuxiliar.cargarRelacionesLoteForeignKeyPresuProyectoCuentaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					presuproyectocuentasParaReportes=presuproyectocuentaLogicAuxiliar.getPresuProyectoCuentas();
					
					//presuproyectocuentaLogic.getNewConnexionToDeep();
					
					//for (PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasParaReportes) {
					//	presuproyectocuentaLogic.deepLoad(presuproyectocuenta, false, DeepLoadType.INCLUDE, classes);
					//}						
					//presuproyectocuentaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//presuproyectocuentaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePresuAsignacion = AuxiliarReportes.class.getResourceAsStream("PresuAsignacionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_presuasignacion", reportFilePresuAsignacion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresuProyectoCuenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresuProyectoCuentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresuProyectoCuentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresuProyectoCuenta=new JRBeanArrayDataSource(PresuProyectoCuentaJInternalFrame.TraerPresuProyectoCuentaBeans(presuproyectocuentasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresuProyectoCuenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresuProyectoCuentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresuProyectoCuentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresuProyectoCuentaBean.TraerPresuProyectoCuentaBeans(presuproyectocuentasParaReportes).toArray()));
							
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
				this.generarExcelReportePresuProyectoCuentas(sAccionBusqueda,sTipoArchivoReporte,presuproyectocuentasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresuProyectoCuentas(sAccionBusqueda,sTipoArchivoReporte,presuproyectocuentasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresuProyectoCuentaActionPerformed(null);
					//this.generarExcelReportePresuProyectoCuentas(sAccionBusqueda,sTipoArchivoReporte,presuproyectocuentasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresuProyectoCuentas(sAccionBusqueda,sTipoArchivoReporte,presuproyectocuentasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresuProyectoCuentas(sAccionBusqueda,sTipoArchivoReporte,presuproyectocuentasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresuProyectoCuentas(sAccionBusqueda,sTipoArchivoReporte,presuproyectocuentasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresuProyectoCuentas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuProyectoCuenta> presuproyectocuentasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyectocuenta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuProyectoCuentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuProyectoCuenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresuProyectoCuenta presuproyectocuenta : presuproyectocuentasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresuProyectoCuentaConstantesFunciones.generarExcelReporteDataPresuProyectoCuenta("NORMAL",row,workbook,presuproyectocuenta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresuProyectoCuenta(String sTipo,Row row,Workbook workbook) {
		
		PresuProyectoCuentaConstantesFunciones.generarExcelReporteHeaderPresuProyectoCuenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresuProyectoCuentas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuProyectoCuenta> presuproyectocuentasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyectocuenta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuProyectoCuentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresuProyectoCuenta presuproyectocuenta : presuproyectocuentasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresuProyectoCuentaConstantesFunciones.getPresuProyectoCuentaDescripcion(presuproyectocuenta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyectocuenta.getpresuproyecto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyectocuenta.getpresutipocuentaproyecto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyectocuenta.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyectocuenta.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyectocuenta.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyectocuenta.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoCuentaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyectocuenta.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoCuentaConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyectocuenta.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyectocuenta.getorden());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyectocuenta.getpresuestado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyectocuenta.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresuProyectoCuentas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuProyectoCuenta> presuproyectocuentasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresuProyectoCuenta> presuproyectocuentasRespaldo=null;
		
		classes=PresuProyectoCuentaConstantesFunciones.getClassesRelationshipsOfPresuProyectoCuenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presuproyectocuentaLogic.setDatosCliente(this.datosCliente);
		this.presuproyectocuentaLogic.setDatosDeep(this.datosDeep);
		this.presuproyectocuentaLogic.setIsConDeep(true);
		
		presuproyectocuentasRespaldo=this.presuproyectocuentaLogic.getPresuProyectoCuentas();
		
		this.presuproyectocuentaLogic.setPresuProyectoCuentas(presuproyectocuentasParaReportes);	
		this.presuproyectocuentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presuproyectocuentasParaReportes=this.presuproyectocuentaLogic.getPresuProyectoCuentas();
		this.presuproyectocuentaLogic.setPresuProyectoCuentas(presuproyectocuentasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyectocuenta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuProyectoCuentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuProyectoCuenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresuProyectoCuenta presuproyectocuenta : presuproyectocuentasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresuProyectoCuenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresuProyectoCuentaConstantesFunciones.generarExcelReporteDataPresuProyectoCuenta("NORMAL",row,workbook,presuproyectocuenta,cellStyleDataAux);
		
			
			


				//PresuAsignacion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PresuAsignacionConstantesFunciones.SCLASSWEBTITULO))) {

				if(presuproyectocuenta.getPresuAsignacions()!=null && presuproyectocuenta.getPresuAsignacions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PresuAsignacionConstantesFunciones.generarExcelReporteHeaderPresuAsignacion("RELACIONADO",row,workbook);
				}

				if(presuproyectocuenta.getPresuAsignacions()!=null) {
					i2=0;
					for(PresuAsignacion presuasignacion : presuproyectocuenta.getPresuAsignacions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PresuAsignacionConstantesFunciones.generarExcelReporteDataPresuAsignacion("RELACIONADO",row,workbook,presuasignacion,cellStyleDataAuxHijo);
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
		cell.setCellValue(PresuProyectoCuentaConstantesFunciones.getPresuProyectoCuentaDescripcion(presuproyectocuenta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresuProyectoCuenta() throws Exception {		
		this.startProcessPresuProyectoCuenta(true);
	}
	
	public void startProcessPresuProyectoCuenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresuProyectoCuenta ,this.jPanelParametrosReportesPresuProyectoCuenta, this.jScrollPanelDatosPresuProyectoCuenta,this.jPanelPaginacionPresuProyectoCuenta, this.jScrollPanelDatosEdicionPresuProyectoCuenta, this.jPanelAccionesPresuProyectoCuenta,this.jPanelAccionesFormularioPresuProyectoCuenta,this.jmenuBarPresuProyectoCuenta,this.jmenuBarDetallePresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,this.jTtoolBarDetallePresuProyectoCuenta);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuProyectoCuenta=this.jTabbedPaneBusquedasPresuProyectoCuenta; 
		
		final JPanel jPanelParametrosReportesPresuProyectoCuenta=this.jPanelParametrosReportesPresuProyectoCuenta;
		//final JScrollPane jScrollPanelDatosPresuProyectoCuenta=this.jScrollPanelDatosPresuProyectoCuenta;
		final JTable jTableDatosPresuProyectoCuenta=this.jTableDatosPresuProyectoCuenta;		
		final JPanel jPanelPaginacionPresuProyectoCuenta=this.jPanelPaginacionPresuProyectoCuenta;
		//final JScrollPane jScrollPanelDatosEdicionPresuProyectoCuenta=this.jScrollPanelDatosEdicionPresuProyectoCuenta;
		final JPanel jPanelAccionesPresuProyectoCuenta=this.jPanelAccionesPresuProyectoCuenta;
		
		JPanel jPanelCamposAuxiliarPresuProyectoCuenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresuProyectoCuenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			jPanelCamposAuxiliarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelCamposPresuProyectoCuenta;
			jPanelAccionesFormularioAuxiliarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelAccionesFormularioPresuProyectoCuenta;
		}
		
		final JPanel jPanelCamposPresuProyectoCuenta=jPanelCamposAuxiliarPresuProyectoCuenta;
		final JPanel jPanelAccionesFormularioPresuProyectoCuenta=jPanelAccionesFormularioAuxiliarPresuProyectoCuenta;
		
		
		final JMenuBar jmenuBarPresuProyectoCuenta=this.jmenuBarPresuProyectoCuenta;
		final JToolBar jTtoolBarPresuProyectoCuenta=this.jTtoolBarPresuProyectoCuenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresuProyectoCuenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuProyectoCuenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			jmenuBarDetalleAuxiliarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jmenuBarDetallePresuProyectoCuenta;
			jTtoolBarDetalleAuxiliarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jTtoolBarDetallePresuProyectoCuenta;
		}
		
		final JMenuBar jmenuBarDetallePresuProyectoCuenta=jmenuBarDetalleAuxiliarPresuProyectoCuenta;
		final JToolBar jTtoolBarDetallePresuProyectoCuenta=jTtoolBarDetalleAuxiliarPresuProyectoCuenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuProyectoCuenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuProyectoCuenta;
			processRunnable.jTableDatos=jTableDatosPresuProyectoCuenta;
			processRunnable.jPanelCampos=jPanelCamposPresuProyectoCuenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuProyectoCuenta;
			processRunnable.jPanelAcciones=jPanelAccionesPresuProyectoCuenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuProyectoCuenta;
			
			
			processRunnable.jmenuBar=jmenuBarPresuProyectoCuenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuProyectoCuenta;
			processRunnable.jTtoolBar=jTtoolBarPresuProyectoCuenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuProyectoCuenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuProyectoCuenta ,jPanelParametrosReportesPresuProyectoCuenta,jTableDatosPresuProyectoCuenta, /*jScrollPanelDatosPresuProyectoCuenta,*/jPanelCamposPresuProyectoCuenta,jPanelPaginacionPresuProyectoCuenta, /*jScrollPanelDatosEdicionPresuProyectoCuenta,*/ jPanelAccionesPresuProyectoCuenta,jPanelAccionesFormularioPresuProyectoCuenta,jmenuBarPresuProyectoCuenta,jmenuBarDetallePresuProyectoCuenta,jTtoolBarPresuProyectoCuenta,jTtoolBarDetallePresuProyectoCuenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuProyectoCuenta ,jPanelParametrosReportesPresuProyectoCuenta, jScrollPanelDatosPresuProyectoCuenta,jPanelPaginacionPresuProyectoCuenta, jScrollPanelDatosEdicionPresuProyectoCuenta, jPanelAccionesPresuProyectoCuenta,jPanelAccionesFormularioPresuProyectoCuenta,jmenuBarPresuProyectoCuenta,jmenuBarDetallePresuProyectoCuenta,jTtoolBarPresuProyectoCuenta,jTtoolBarDetallePresuProyectoCuenta);
						
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
	
	public void finishProcessPresuProyectoCuenta() {// throws Exception 
		this.finishProcessPresuProyectoCuenta(true);
	}
	
	public void finishProcessPresuProyectoCuenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresuProyectoCuenta ,this.jPanelParametrosReportesPresuProyectoCuenta, this.jScrollPanelDatosPresuProyectoCuenta,this.jPanelPaginacionPresuProyectoCuenta, this.jScrollPanelDatosEdicionPresuProyectoCuenta, this.jPanelAccionesPresuProyectoCuenta,this.jPanelAccionesFormularioPresuProyectoCuenta,this.jmenuBarPresuProyectoCuenta,this.jmenuBarDetallePresuProyectoCuenta,this.jTtoolBarPresuProyectoCuenta,this.jTtoolBarDetallePresuProyectoCuenta);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuProyectoCuenta=this.jTabbedPaneBusquedasPresuProyectoCuenta; 
		
		final JPanel jPanelParametrosReportesPresuProyectoCuenta=this.jPanelParametrosReportesPresuProyectoCuenta;
		//final JScrollPane jScrollPanelDatosPresuProyectoCuenta=this.jScrollPanelDatosPresuProyectoCuenta;
		final JTable jTableDatosPresuProyectoCuenta=this.jTableDatosPresuProyectoCuenta;		
		final JPanel jPanelPaginacionPresuProyectoCuenta=this.jPanelPaginacionPresuProyectoCuenta;
		//final JScrollPane jScrollPanelDatosEdicionPresuProyectoCuenta=this.jScrollPanelDatosEdicionPresuProyectoCuenta;
		final JPanel jPanelAccionesPresuProyectoCuenta=this.jPanelAccionesPresuProyectoCuenta;
		
		JPanel jPanelCamposAuxiliarPresuProyectoCuenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresuProyectoCuenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			jPanelCamposAuxiliarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelCamposPresuProyectoCuenta;
			jPanelAccionesFormularioAuxiliarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelAccionesFormularioPresuProyectoCuenta;
		}
		
		final JPanel jPanelCamposPresuProyectoCuenta=jPanelCamposAuxiliarPresuProyectoCuenta;
		final JPanel jPanelAccionesFormularioPresuProyectoCuenta=jPanelAccionesFormularioAuxiliarPresuProyectoCuenta;
		
		
		final JMenuBar jmenuBarPresuProyectoCuenta=this.jmenuBarPresuProyectoCuenta;		
		final JToolBar jTtoolBarPresuProyectoCuenta=this.jTtoolBarPresuProyectoCuenta;
				
		JMenuBar jmenuBarDetalleAuxiliarPresuProyectoCuenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuProyectoCuenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			jmenuBarDetalleAuxiliarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jmenuBarDetallePresuProyectoCuenta;
			jTtoolBarDetalleAuxiliarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jTtoolBarDetallePresuProyectoCuenta;		
		}
		
		final JMenuBar jmenuBarDetallePresuProyectoCuenta=jmenuBarDetalleAuxiliarPresuProyectoCuenta;
		final JToolBar jTtoolBarDetallePresuProyectoCuenta=jTtoolBarDetalleAuxiliarPresuProyectoCuenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuProyectoCuenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuProyectoCuenta;
			processRunnable.jTableDatos=jTableDatosPresuProyectoCuenta;
			processRunnable.jPanelCampos=jPanelCamposPresuProyectoCuenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuProyectoCuenta;
			processRunnable.jPanelAcciones=jPanelAccionesPresuProyectoCuenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuProyectoCuenta;
			
			
			processRunnable.jmenuBar=jmenuBarPresuProyectoCuenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuProyectoCuenta;
			processRunnable.jTtoolBar=jTtoolBarPresuProyectoCuenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuProyectoCuenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresuProyectoCuenta ,jPanelParametrosReportesPresuProyectoCuenta, jTableDatosPresuProyectoCuenta,/*jScrollPanelDatosPresuProyectoCuenta,*/jPanelCamposPresuProyectoCuenta,jPanelPaginacionPresuProyectoCuenta, /*jScrollPanelDatosEdicionPresuProyectoCuenta,*/ jPanelAccionesPresuProyectoCuenta,jPanelAccionesFormularioPresuProyectoCuenta,jmenuBarPresuProyectoCuenta,jmenuBarDetallePresuProyectoCuenta,jTtoolBarPresuProyectoCuenta,jTtoolBarDetallePresuProyectoCuenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresuProyectoCuenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresuProyectoCuenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresuProyectoCuenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresuProyectoCuenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresuProyectoCuenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresuProyectoCuenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresuProyectoCuenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresuProyectoCuenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresuProyectoCuenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presuproyectocuentaConstantesFunciones.getsFinalQueryPresuProyectoCuenta();
		String  finalQueryPaginacionTodos=this.presuproyectocuentaConstantesFunciones.getsFinalQueryPresuProyectoCuenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresuProyectoCuentaConstantesFunciones.getArrayColumnasGlobalesNoPresuProyectoCuenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresuProyectoCuentaConstantesFunciones.getArrayColumnasGlobalesPresuProyectoCuenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresuProyectoCuentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presuproyectocuentasEliminados= new ArrayList<PresuProyectoCuenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresuProyectoCuenta();
		
				///*PresuProyectoCuentaSessionBean*/this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
			
			if(this.presuproyectocuentaSessionBean==null) {
				this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
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
					this.iNumeroPaginacion=PresuProyectoCuentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresuProyectoCuentaConstantesFunciones.getClassesForeignKeysOfPresuProyectoCuenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presuproyectocuenta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presuproyectocuentasAux= new ArrayList<PresuProyectoCuenta>();
			
				
			presuproyectocuentaLogic.setDatosCliente(this.datosCliente);
			presuproyectocuentaLogic.setDatosDeep(this.datosDeep);
			presuproyectocuentaLogic.setIsConDeep(true);
			
			
			presuproyectocuentaLogic.getPresuProyectoCuentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presuproyectocuentaLogic.getTodosPresuProyectoCuentas(finalQueryGlobal,pagination);
					
					//presuproyectocuentaLogic.getTodosPresuProyectoCuentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presuproyectocuentaLogic.getPresuProyectoCuentas()==null|| presuproyectocuentaLogic.getPresuProyectoCuentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuproyectocuentasAux= new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentasAux.addAll(presuproyectocuentaLogic.getPresuProyectoCuentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentasAux= new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentasAux.addAll(presuproyectocuentas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuproyectocuentaLogic.getTodosPresuProyectoCuentas(finalQueryGlobal+"",this.pagination);												
							
							//presuproyectocuentaLogic.getTodosPresuProyectoCuentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresuProyectoCuentas("Todos",presuproyectocuentaLogic.getPresuProyectoCuentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());					
							presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(presuproyectocuentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentas=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentas.addAll(presuproyectocuentasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresuProyectoCuenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresuProyectoCuenta=this.idActual;
				
				} else if(this.idPresuProyectoCuentaActual!=null && this.idPresuProyectoCuentaActual!=0L) {
					idPresuProyectoCuenta=idPresuProyectoCuentaActual;
				}
				
					
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndicePorId(idPresuProyectoCuenta);
				
				this.presuproyectocuentas=new ArrayList<PresuProyectoCuenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presuproyectocuentaLogic.getEntity(idPresuProyectoCuenta);
					
					//presuproyectocuentaLogic.getEntityWithConnection(idPresuProyectoCuenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());
					presuproyectocuentaLogic.getPresuProyectoCuentas().add(presuproyectocuentaLogic.getPresuProyectoCuenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyectocuentas=new ArrayList<PresuProyectoCuenta>();
					this.presuproyectocuentas.add(presuproyectocuenta);
				}
				
				if(presuproyectocuentaLogic.getPresuProyectoCuenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorProyectoPorCodigo")) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceBusquedaPorProyectoPorCodigo(id_presu_proyectoBusquedaPorProyectoPorCodigo,codigoBusquedaPorProyectoPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectocuentaLogic.getPresuProyectoCuentasBusquedaPorProyectoPorCodigo(finalQueryGlobal,pagination,id_presu_proyectoBusquedaPorProyectoPorCodigo,codigoBusquedaPorProyectoPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceBusquedaPorProyectoPorCodigo(id_presu_proyectoBusquedaPorProyectoPorCodigo,codigoBusquedaPorProyectoPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceBusquedaPorProyectoPorCodigo(id_presu_proyectoBusquedaPorProyectoPorCodigo,codigoBusquedaPorProyectoPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectocuentaLogic.getPresuProyectoCuentas()==null||presuproyectocuentaLogic.getPresuProyectoCuentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectocuentas==null|| presuproyectocuentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
						presuproyectocuentasAux.addAll(presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentasAux.addAll(presuproyectocuentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectocuentaLogic.getPresuProyectoCuentasBusquedaPorProyectoPorCodigo(finalQueryGlobal,pagination,id_presu_proyectoBusquedaPorProyectoPorCodigo,codigoBusquedaPorProyectoPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceBusquedaPorProyectoPorCodigo(id_presu_proyectoBusquedaPorProyectoPorCodigo,codigoBusquedaPorProyectoPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceBusquedaPorProyectoPorCodigo(id_presu_proyectoBusquedaPorProyectoPorCodigo,codigoBusquedaPorProyectoPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectoCuentas("BusquedaPorProyectoPorCodigo",presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectoCuentas("BusquedaPorProyectoPorCodigo",presuproyectocuentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());
						presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(presuproyectocuentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentas=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentas.addAll(presuproyectocuentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorProyectoPorNombre")) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceBusquedaPorProyectoPorNombre(id_presu_proyectoBusquedaPorProyectoPorNombre,nombreBusquedaPorProyectoPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectocuentaLogic.getPresuProyectoCuentasBusquedaPorProyectoPorNombre(finalQueryGlobal,pagination,id_presu_proyectoBusquedaPorProyectoPorNombre,nombreBusquedaPorProyectoPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceBusquedaPorProyectoPorNombre(id_presu_proyectoBusquedaPorProyectoPorNombre,nombreBusquedaPorProyectoPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceBusquedaPorProyectoPorNombre(id_presu_proyectoBusquedaPorProyectoPorNombre,nombreBusquedaPorProyectoPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectocuentaLogic.getPresuProyectoCuentas()==null||presuproyectocuentaLogic.getPresuProyectoCuentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectocuentas==null|| presuproyectocuentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
						presuproyectocuentasAux.addAll(presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentasAux.addAll(presuproyectocuentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectocuentaLogic.getPresuProyectoCuentasBusquedaPorProyectoPorNombre(finalQueryGlobal,pagination,id_presu_proyectoBusquedaPorProyectoPorNombre,nombreBusquedaPorProyectoPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceBusquedaPorProyectoPorNombre(id_presu_proyectoBusquedaPorProyectoPorNombre,nombreBusquedaPorProyectoPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceBusquedaPorProyectoPorNombre(id_presu_proyectoBusquedaPorProyectoPorNombre,nombreBusquedaPorProyectoPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectoCuentas("BusquedaPorProyectoPorNombre",presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectoCuentas("BusquedaPorProyectoPorNombre",presuproyectocuentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());
						presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(presuproyectocuentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentas=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentas.addAll(presuproyectocuentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectocuentaLogic.getPresuProyectoCuentas()==null||presuproyectocuentaLogic.getPresuProyectoCuentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectocuentas==null|| presuproyectocuentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
						presuproyectocuentasAux.addAll(presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentasAux.addAll(presuproyectocuentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectoCuentas("FK_IdCuentaContable",presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectoCuentas("FK_IdCuentaContable",presuproyectocuentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());
						presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(presuproyectocuentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentas=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentas.addAll(presuproyectocuentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectocuentaLogic.getPresuProyectoCuentas()==null||presuproyectocuentaLogic.getPresuProyectoCuentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectocuentas==null|| presuproyectocuentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
						presuproyectocuentasAux.addAll(presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentasAux.addAll(presuproyectocuentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectoCuentas("FK_IdEmpleado",presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectoCuentas("FK_IdEmpleado",presuproyectocuentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());
						presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(presuproyectocuentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentas=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentas.addAll(presuproyectocuentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPresuEstado")) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuEstado(id_presu_estadoFK_IdPresuEstado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdPresuEstado(finalQueryGlobal,pagination,id_presu_estadoFK_IdPresuEstado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuEstado(id_presu_estadoFK_IdPresuEstado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuEstado(id_presu_estadoFK_IdPresuEstado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectocuentaLogic.getPresuProyectoCuentas()==null||presuproyectocuentaLogic.getPresuProyectoCuentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectocuentas==null|| presuproyectocuentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
						presuproyectocuentasAux.addAll(presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentasAux.addAll(presuproyectocuentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdPresuEstado(finalQueryGlobal,pagination,id_presu_estadoFK_IdPresuEstado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuEstado(id_presu_estadoFK_IdPresuEstado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuEstado(id_presu_estadoFK_IdPresuEstado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectoCuentas("FK_IdPresuEstado",presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectoCuentas("FK_IdPresuEstado",presuproyectocuentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());
						presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(presuproyectocuentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentas=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentas.addAll(presuproyectocuentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPresuProyecto")) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuProyecto(id_presu_proyectoFK_IdPresuProyecto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdPresuProyecto(finalQueryGlobal,pagination,id_presu_proyectoFK_IdPresuProyecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuProyecto(id_presu_proyectoFK_IdPresuProyecto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuProyecto(id_presu_proyectoFK_IdPresuProyecto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectocuentaLogic.getPresuProyectoCuentas()==null||presuproyectocuentaLogic.getPresuProyectoCuentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectocuentas==null|| presuproyectocuentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
						presuproyectocuentasAux.addAll(presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentasAux.addAll(presuproyectocuentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdPresuProyecto(finalQueryGlobal,pagination,id_presu_proyectoFK_IdPresuProyecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuProyecto(id_presu_proyectoFK_IdPresuProyecto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuProyecto(id_presu_proyectoFK_IdPresuProyecto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectoCuentas("FK_IdPresuProyecto",presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectoCuentas("FK_IdPresuProyecto",presuproyectocuentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());
						presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(presuproyectocuentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentas=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentas.addAll(presuproyectocuentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPresuTipoCuentaProyecto")) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuTipoCuentaProyecto(id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdPresuTipoCuentaProyecto(finalQueryGlobal,pagination,id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuTipoCuentaProyecto(id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuTipoCuentaProyecto(id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectocuentaLogic.getPresuProyectoCuentas()==null||presuproyectocuentaLogic.getPresuProyectoCuentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectocuentas==null|| presuproyectocuentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
						presuproyectocuentasAux.addAll(presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentasAux=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentasAux.addAll(presuproyectocuentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdPresuTipoCuentaProyecto(finalQueryGlobal,pagination,id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuTipoCuentaProyecto(id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoCuentaConstantesFunciones.getDetalleIndiceFK_IdPresuTipoCuentaProyecto(id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectoCuentas("FK_IdPresuTipoCuentaProyecto",presuproyectocuentaLogic.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectoCuentas("FK_IdPresuTipoCuentaProyecto",presuproyectocuentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());
						presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(presuproyectocuentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentas=new ArrayList<PresuProyectoCuenta>();
							presuproyectocuentas.addAll(presuproyectocuentasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresuProyectoCuenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresuProyectoCuenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presuproyectocuentaLogic.getPresuProyectoCuentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuproyectocuentas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presuproyectocuentaLogic.getPresuProyectoCuentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuproyectocuentas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresuProyectoCuenta presuproyectocuenta) {
		Boolean permite=true;
		
		if(this.presuproyectocuenta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresuProyectoCuentaConstantesFunciones.getOrderByListaPresuProyectoCuenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresuProyectoCuentaConstantesFunciones.getOrderByListaPresuProyectoCuenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentaLogic.getPresuProyectoCuentas()) {
				if(presuproyectocuenta.getsType().equals(Constantes2.S_TOTALES)) {
					presuproyectocuentaTotales=presuproyectocuenta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuProyectoCuenta presuproyectocuenta:this.presuproyectocuentas) {
				if(presuproyectocuenta.getsType().equals(Constantes2.S_TOTALES)) {
					presuproyectocuentaTotales=presuproyectocuenta;
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
			this.presuproyectocuentaAux=new PresuProyectoCuenta();
			this.presuproyectocuentaAux.setsType(Constantes2.S_TOTALES);
			this.presuproyectocuentaAux.setIsNew(false);
			this.presuproyectocuentaAux.setIsChanged(false);
			this.presuproyectocuentaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresuProyectoCuentaConstantesFunciones.TotalizarValoresFilaPresuProyectoCuenta(this.presuproyectocuentaLogic.getPresuProyectoCuentas(),this.presuproyectocuentaAux);
				
				this.presuproyectocuentaLogic.getPresuProyectoCuentas().add(this.presuproyectocuentaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresuProyectoCuentaConstantesFunciones.TotalizarValoresFilaPresuProyectoCuenta(this.presuproyectocuentas,this.presuproyectocuentaAux);
				
				this.presuproyectocuentas.add(this.presuproyectocuentaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presuproyectocuentaTotales=new PresuProyectoCuenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presuproyectocuentaLogic.getPresuProyectoCuentas().remove(presuproyectocuentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presuproyectocuentas.remove(presuproyectocuentaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presuproyectocuentaTotales=new PresuProyectoCuenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentaLogic.getPresuProyectoCuentas()) {
				if(presuproyectocuenta.getsType().equals(Constantes2.S_TOTALES)) {
					presuproyectocuentaTotales=presuproyectocuenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuProyectoCuentaConstantesFunciones.TotalizarValoresFilaPresuProyectoCuenta(this.presuproyectocuentaLogic.getPresuProyectoCuentas(),presuproyectocuentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuProyectoCuenta presuproyectocuenta:this.presuproyectocuentas) {
				if(presuproyectocuenta.getsType().equals(Constantes2.S_TOTALES)) {
					presuproyectocuentaTotales=presuproyectocuenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuProyectoCuentaConstantesFunciones.TotalizarValoresFilaPresuProyectoCuenta(this.presuproyectocuentas,presuproyectocuentaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresuProyectoCuentasBusquedaPorProyectoPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorProyectoPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectoCuentasBusquedaPorProyectoPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorProyectoPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectoCuentasFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectoCuentasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectoCuentasFK_IdPresuEstado()throws Exception {
		try {
			sAccionBusqueda="FK_IdPresuEstado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectoCuentasFK_IdPresuProyecto()throws Exception {
		try {
			sAccionBusqueda="FK_IdPresuProyecto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectoCuentasFK_IdPresuTipoCuentaProyecto()throws Exception {
		try {
			sAccionBusqueda="FK_IdPresuTipoCuentaProyecto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresuProyectoCuentasBusquedaPorProyectoPorCodigo(String sFinalQuery,Long id_presu_proyecto,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectocuentaLogic.getPresuProyectoCuentasBusquedaPorProyectoPorCodigo(sFinalQuery,this.pagination,id_presu_proyecto,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectoCuentasBusquedaPorProyectoPorNombre(String sFinalQuery,Long id_presu_proyecto,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectocuentaLogic.getPresuProyectoCuentasBusquedaPorProyectoPorNombre(sFinalQuery,this.pagination,id_presu_proyecto,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectoCuentasFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectoCuentasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectoCuentasFK_IdPresuEstado(String sFinalQuery,Long id_presu_estado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdPresuEstado(sFinalQuery,this.pagination,id_presu_estado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectoCuentasFK_IdPresuProyecto(String sFinalQuery,Long id_presu_proyecto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdPresuProyecto(sFinalQuery,this.pagination,id_presu_proyecto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectoCuentasFK_IdPresuTipoCuentaProyecto(String sFinalQuery,Long id_presu_tipo_cuenta_proyecto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectocuentaLogic.getPresuProyectoCuentasFK_IdPresuTipoCuentaProyecto(sFinalQuery,this.pagination,id_presu_tipo_cuenta_proyecto);
				
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
	
	public void inicializarPermisosPresuProyectoCuenta() {
		this.isPermisoTodoPresuProyectoCuenta=false;
		this.isPermisoNuevoPresuProyectoCuenta=false;
		this.isPermisoActualizarPresuProyectoCuenta=false;
		this.isPermisoActualizarOriginalPresuProyectoCuenta=false;
		this.isPermisoEliminarPresuProyectoCuenta=false;
		this.isPermisoGuardarCambiosPresuProyectoCuenta=false;
		this.isPermisoConsultaPresuProyectoCuenta=false;
		this.isPermisoBusquedaPresuProyectoCuenta=false;
		this.isPermisoReportePresuProyectoCuenta=false;		
		this.isPermisoOrdenPresuProyectoCuenta=false;		
		this.isPermisoPaginacionMedioPresuProyectoCuenta=false;		
		this.isPermisoPaginacionAltoPresuProyectoCuenta=false;
		this.isPermisoPaginacionTodoPresuProyectoCuenta=false;
		this.isPermisoCopiarPresuProyectoCuenta=false;		
		this.isPermisoVerFormPresuProyectoCuenta=false;		
		this.isPermisoDuplicarPresuProyectoCuenta=false;		
		this.isPermisoOrdenPresuProyectoCuenta=false;		
	}
	
	public void setPermisosUsuarioPresuProyectoCuenta(Boolean isPermiso) {
		this.isPermisoTodoPresuProyectoCuenta=isPermiso;
		this.isPermisoNuevoPresuProyectoCuenta=isPermiso;
		this.isPermisoActualizarPresuProyectoCuenta=isPermiso;
		this.isPermisoActualizarOriginalPresuProyectoCuenta=isPermiso;
		this.isPermisoEliminarPresuProyectoCuenta=isPermiso;
		this.isPermisoGuardarCambiosPresuProyectoCuenta=isPermiso;
		this.isPermisoConsultaPresuProyectoCuenta=isPermiso;
		this.isPermisoBusquedaPresuProyectoCuenta=isPermiso;
		this.isPermisoReportePresuProyectoCuenta=isPermiso;
		this.isPermisoOrdenPresuProyectoCuenta=isPermiso;		
		this.isPermisoPaginacionMedioPresuProyectoCuenta=isPermiso;		
		this.isPermisoPaginacionAltoPresuProyectoCuenta=isPermiso;		
		this.isPermisoPaginacionTodoPresuProyectoCuenta=isPermiso;		
		this.isPermisoCopiarPresuProyectoCuenta=isPermiso;		
		this.isPermisoVerFormPresuProyectoCuenta=isPermiso;		
		this.isPermisoDuplicarPresuProyectoCuenta=isPermiso;
		this.isPermisoOrdenPresuProyectoCuenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresuProyectoCuenta(Boolean isPermiso) {
		//this.isPermisoTodoPresuProyectoCuenta=isPermiso;
		this.isPermisoNuevoPresuProyectoCuenta=isPermiso;
		this.isPermisoActualizarPresuProyectoCuenta=isPermiso;
		this.isPermisoActualizarOriginalPresuProyectoCuenta=isPermiso;
		this.isPermisoEliminarPresuProyectoCuenta=isPermiso;
		this.isPermisoGuardarCambiosPresuProyectoCuenta=isPermiso;
		//this.isPermisoConsultaPresuProyectoCuenta=isPermiso;
		//this.isPermisoBusquedaPresuProyectoCuenta=isPermiso;
		//this.isPermisoReportePresuProyectoCuenta=isPermiso;
		//this.isPermisoOrdenPresuProyectoCuenta=isPermiso;		
		//this.isPermisoPaginacionMedioPresuProyectoCuenta=isPermiso;		
		//this.isPermisoPaginacionAltoPresuProyectoCuenta=isPermiso;		
		//this.isPermisoPaginacionTodoPresuProyectoCuenta=isPermiso;		
		//this.isPermisoCopiarPresuProyectoCuenta=isPermiso;		
		//this.isPermisoDuplicarPresuProyectoCuenta=isPermiso;
		//this.isPermisoOrdenPresuProyectoCuenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresuProyectoCuentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PresuAsignacionConstantesFunciones.SNOMBREOPCION);
		
		if(PresuProyectoCuentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPresuAsignacion=false;
		this.isTienePermisosPresuAsignacion=this.verificarGetPermisosUsuarioOpcionPresuProyectoCuentaClaseRelacionada(this.opcionsRelacionadas,PresuAsignacionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresuProyectoCuenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresuProyectoCuentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPresuAsignacion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPresuProyectoCuentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresuProyectoCuentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresuProyectoCuentaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPresuAsignacion && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTabbedPaneRelacionesPresuProyectoCuenta.remove(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPresuProyectoCuenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresuProyectoCuentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresuProyectoCuentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresuProyectoCuenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresuProyectoCuenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresuProyectoCuenta=this.isPermisoActualizarPresuProyectoCuenta;
			this.isPermisoEliminarPresuProyectoCuenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresuProyectoCuenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresuProyectoCuenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresuProyectoCuenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresuProyectoCuenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresuProyectoCuenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuProyectoCuenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresuProyectoCuenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresuProyectoCuenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresuProyectoCuenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresuProyectoCuenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresuProyectoCuenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresuProyectoCuenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuProyectoCuenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresuProyectoCuenta.setToolTipText(this.jTableDatosPresuProyectoCuenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresuProyectoCuenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresuProyectoCuenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresuProyectoCuentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresuProyectoCuentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresuProyectoCuenta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPresuAsignacion && this.presuproyectocuentaConstantesFunciones.mostrarPresuAsignacionPresuProyectoCuenta && !PresuProyectoCuentaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Asignacion Presupuesto");
			reporte.setsDescripcion("Asignacion Presupuesto");
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
	public void inicializarCombosForeignKeyPresuProyectoCuentaListas()throws Exception {
		try	{						
			
				this.presuproyectosForeignKey=new ArrayList();
				this.presutipocuentaproyectosForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.presuestadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresuProyectoCuentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresuProyectoCuentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresuProyectoCuentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyPresuProyectoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPresuTipoCuentaProyectoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPresuEstadoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPresuProyectoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.presuproyectosForeignKey==null||this.presuproyectosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PresuProyectoConstantesFunciones.getArrayColumnasGlobalesPresuProyecto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuProyectoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PresuProyectoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPresuProyectosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPresuTipoCuentaProyectoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.presutipocuentaproyectosForeignKey==null||this.presutipocuentaproyectosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PresuTipoCuentaProyectoConstantesFunciones.getArrayColumnasGlobalesPresuTipoCuentaProyecto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuTipoCuentaProyectoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PresuTipoCuentaProyectoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPresuTipoCuentaProyectosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyPresuProyectoCuentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PresuProyectoCuentaParameterReturnGeneral presuproyectocuentaReturnGeneral=new PresuProyectoCuentaParameterReturnGeneral();
						
			


				String finalQueryGlobalPresuProyecto="";

				if(((this.presuproyectosForeignKey==null||this.presuproyectosForeignKey.size()<=0) && this.presuproyectocuentaConstantesFunciones.cargarid_presu_proyectoPresuProyectoCuenta)
					 || (this.esRecargarFks && this.presuproyectocuentaConstantesFunciones.cargarid_presu_proyectoPresuProyectoCuenta)) {

					if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionPresuProyecto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PresuProyectoConstantesFunciones.getArrayColumnasGlobalesPresuProyecto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPresuProyecto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuProyectoConstantesFunciones.TABLENAME);

						finalQueryGlobalPresuProyecto=Funciones.GetFinalQueryAppend(finalQueryGlobalPresuProyecto, "");
						finalQueryGlobalPresuProyecto+=PresuProyectoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPresuProyectosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPresuProyecto=" WHERE " + ConstantesSql.ID + "="+presuproyectocuentaSessionBean.getlidPresuProyectoActual();
					}
				} else {
					finalQueryGlobalPresuProyecto="NONE";
				}


				String finalQueryGlobalPresuTipoCuentaProyecto="";

				if(((this.presutipocuentaproyectosForeignKey==null||this.presutipocuentaproyectosForeignKey.size()<=0) && this.presuproyectocuentaConstantesFunciones.cargarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta)
					 || (this.esRecargarFks && this.presuproyectocuentaConstantesFunciones.cargarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta)) {

					if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionPresuTipoCuentaProyecto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PresuTipoCuentaProyectoConstantesFunciones.getArrayColumnasGlobalesPresuTipoCuentaProyecto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPresuTipoCuentaProyecto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuTipoCuentaProyectoConstantesFunciones.TABLENAME);

						finalQueryGlobalPresuTipoCuentaProyecto=Funciones.GetFinalQueryAppend(finalQueryGlobalPresuTipoCuentaProyecto, "");
						finalQueryGlobalPresuTipoCuentaProyecto+=PresuTipoCuentaProyectoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPresuTipoCuentaProyectosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPresuTipoCuentaProyecto=" WHERE " + ConstantesSql.ID + "="+presuproyectocuentaSessionBean.getlidPresuTipoCuentaProyectoActual();
					}
				} else {
					finalQueryGlobalPresuTipoCuentaProyecto="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.presuproyectocuentaConstantesFunciones.cargarid_cuenta_contablePresuProyectoCuenta)
					 || (this.esRecargarFks && this.presuproyectocuentaConstantesFunciones.cargarid_cuenta_contablePresuProyectoCuenta)) {

					if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+presuproyectocuentaSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.presuproyectocuentaConstantesFunciones.cargarid_empleadoPresuProyectoCuenta)
					 || (this.esRecargarFks && this.presuproyectocuentaConstantesFunciones.cargarid_empleadoPresuProyectoCuenta)) {

					if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+presuproyectocuentaSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalPresuEstado="";

				if(((this.presuestadosForeignKey==null||this.presuestadosForeignKey.size()<=0) && this.presuproyectocuentaConstantesFunciones.cargarid_presu_estadoPresuProyectoCuenta)
					 || (this.esRecargarFks && this.presuproyectocuentaConstantesFunciones.cargarid_presu_estadoPresuProyectoCuenta)) {

					if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionPresuEstado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PresuEstadoConstantesFunciones.getArrayColumnasGlobalesPresuEstado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPresuEstado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuEstadoConstantesFunciones.TABLENAME);

						finalQueryGlobalPresuEstado=Funciones.GetFinalQueryAppend(finalQueryGlobalPresuEstado, "");
						finalQueryGlobalPresuEstado+=PresuEstadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPresuEstadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPresuEstado=" WHERE " + ConstantesSql.ID + "="+presuproyectocuentaSessionBean.getlidPresuEstadoActual();
					}
				} else {
					finalQueryGlobalPresuEstado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				presuproyectocuentaReturnGeneral=presuproyectocuentaLogic.cargarCombosLoteForeignKeyPresuProyectoCuenta(finalQueryGlobalPresuProyecto,finalQueryGlobalPresuTipoCuentaProyecto,finalQueryGlobalCuentaContable,finalQueryGlobalEmpleado,finalQueryGlobalPresuEstado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPresuProyecto.equals("NONE")) {
				this.presuproyectosForeignKey=presuproyectocuentaReturnGeneral.getpresuproyectosForeignKey();
			}

			if(!finalQueryGlobalPresuTipoCuentaProyecto.equals("NONE")) {
				this.presutipocuentaproyectosForeignKey=presuproyectocuentaReturnGeneral.getpresutipocuentaproyectosForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=presuproyectocuentaReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=presuproyectocuentaReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalPresuEstado.equals("NONE")) {
				this.presuestadosForeignKey=presuproyectocuentaReturnGeneral.getpresuestadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresuProyectoCuenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPresuProyecto();
			this.addItemDefectoCombosForeignKeyPresuTipoCuentaProyecto();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyPresuEstado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPresuProyecto()throws Exception {
		try {
			if(this.presuproyectocuentaSessionBean==null) {
				this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
			}

			if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionPresuProyecto()) {
				PresuProyecto presuproyecto=new PresuProyecto();
				PresuProyectoConstantesFunciones.setPresuProyectoDescripcion(presuproyecto,Constantes.SMENSAJE_ESCOJA_OPCION);
				presuproyecto.setId(null);

				if(!PresuProyectoConstantesFunciones.ExisteEnLista(this.presuproyectosForeignKey,presuproyecto,true)) {

					this.presuproyectosForeignKey.add(0,presuproyecto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPresuTipoCuentaProyecto()throws Exception {
		try {

			if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionPresuTipoCuentaProyecto()) {
				PresuTipoCuentaProyecto presutipocuentaproyecto=new PresuTipoCuentaProyecto();
				PresuTipoCuentaProyectoConstantesFunciones.setPresuTipoCuentaProyectoDescripcion(presutipocuentaproyecto,Constantes.SMENSAJE_ESCOJA_OPCION);
				presutipocuentaproyecto.setId(null);

				if(!PresuTipoCuentaProyectoConstantesFunciones.ExisteEnLista(this.presutipocuentaproyectosForeignKey,presutipocuentaproyecto,true)) {

					this.presutipocuentaproyectosForeignKey.add(0,presutipocuentaproyecto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				CuentaContable cuentacontable=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontable.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablesForeignKey,cuentacontable,true)) {

					this.cuentacontablesForeignKey.add(0,cuentacontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

			if(!this.presuproyectocuentaSessionBean.getisBusquedaDesdeForeignKeySesionPresuEstado()) {
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
	
	public void initActionsCombosTodosForeignKeyPresuProyectoCuenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresuProyectoCuenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresuProyectoCuenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.presuproyectocuenta.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuProyectoCuenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta)throws Exception {	
		try {
			
			this.setActualPresuProyectoForeignKey(presuproyectocuenta.getid_presu_proyecto(),false,"Formulario");
			this.setActualPresuTipoCuentaProyectoForeignKey(presuproyectocuenta.getid_presu_tipo_cuenta_proyecto(),false,"Formulario");
			this.setActualCuentaContableForeignKey(presuproyectocuenta.getid_cuenta_contable(),false,"Formulario");
			this.setActualEmpleadoForeignKey(presuproyectocuenta.getid_empleado(),false,"Formulario");
			this.setActualPresuEstadoForeignKey(presuproyectocuenta.getid_presu_estado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta,String sTipoEvento)throws Exception {	
		try {
			
			

				if(presuproyectocuenta.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contablePresuProyectoCuenta")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(presuproyectocuenta.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				if(presuproyectocuenta.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoPresuProyectoCuenta")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(presuproyectocuenta.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresuProyectoCuenta()throws Exception {	
		try {
			
			this.setActualPresuProyectoForeignKey(this.presuproyectocuentaConstantesFunciones.getid_presu_proyecto(),false,"Formulario");
			this.setActualPresuTipoCuentaProyectoForeignKey(this.presuproyectocuentaConstantesFunciones.getid_presu_tipo_cuenta_proyecto(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.presuproyectocuentaConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.presuproyectocuentaConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualPresuEstadoForeignKey(this.presuproyectocuentaConstantesFunciones.getid_presu_estado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresuProyectoCuenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresuProyectoCuenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresuProyectoCuenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresuProyectoCuenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresuProyectoCuenta()throws Exception {
		try {
			

			this.cargarCombosFramePresuProyectosForeignKey("Todos");
			this.cargarCombosFramePresuTipoCuentaProyectosForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFramePresuEstadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresuProyectoCuenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePresuProyectosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePresuTipoCuentaProyectosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePresuEstadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresuProyectoCuenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public PresuProyectoCuentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresuProyectoCuentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresuProyectoCuentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean(); 
		this.presuproyectocuentaConstantesFunciones=new PresuProyectoCuentaConstantesFunciones(); 
		this.presuproyectocuentaBean=new PresuProyectoCuenta();//(this.presuproyectocuentaConstantesFunciones); 		
		this.presuproyectocuentaReturnGeneral=new PresuProyectoCuentaParameterReturnGeneral(); 
		
		this.presuproyectocuentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuproyectocuentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresuProyectoCuentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresuProyectoCuentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresuProyectoCuentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresuProyectoCuenta(true);
			
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
			
			this.presuproyectocuentaConstantesFunciones=new PresuProyectoCuentaConstantesFunciones(); 
			this.presuproyectocuentaBean=new PresuProyectoCuenta();//this.presuproyectocuentaConstantesFunciones); 			
			this.presuproyectocuentaReturnGeneral=new PresuProyectoCuentaParameterReturnGeneral(); 
		
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Contable Proyecto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.presuproyectocuenta=new PresuProyectoCuenta();
			this.presuproyectocuentas = new ArrayList<PresuProyectoCuenta>();
			this.presuproyectocuentasAux = new ArrayList<PresuProyectoCuenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic=new PresuProyectoCuentaLogic();
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}
			
			//this.presuproyectocuentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presuproyectocuentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresuProyectoCuenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuProyectoCuenta);	
					}
					
					if(this.jInternalFrameImportacionPresuProyectoCuenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuProyectoCuenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresuProyectoCuenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresuProyectoCuenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuProyectoCuenta);
				this.jInternalFrameDetalleFormPresuProyectoCuenta.setVisible(false);
				this.jInternalFrameDetalleFormPresuProyectoCuenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuProyectoCuenta);
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setVisible(false);
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresuProyectoCuenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresuProyectoCuenta);
					this.jInternalFrameImportacionPresuProyectoCuenta.setVisible(false);
					this.jInternalFrameImportacionPresuProyectoCuenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresuProyectoCuenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresuProyectoCuenta);
					this.jInternalFrameOrderByPresuProyectoCuenta.setVisible(false);
					this.jInternalFrameOrderByPresuProyectoCuenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresuProyectoCuentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresuProyectoCuentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presuproyectocuentaReturnGeneral=new PresuProyectoCuentaParameterReturnGeneral();
			
			this.presuproyectocuentaParameterGeneral=new PresuProyectoCuentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presuproyectocuentaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresuProyectoCuentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PresuAsignacionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuProyectoCuentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presuproyectocuentaSessionBean.getEsGuardarRelacionado(),this.presuproyectocuentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuProyectoCuentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presuproyectocuentaSessionBean.getEsGuardarRelacionado(),this.presuproyectocuentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=false;
			this.isVisibilidadCeldaDuplicarPresuProyectoCuenta=true;
			this.isVisibilidadCeldaCopiarPresuProyectoCuenta=true;
			this.isVisibilidadCeldaVerFormPresuProyectoCuenta=true;
			this.isVisibilidadCeldaOrdenPresuProyectoCuenta=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=false;
			this.isVisibilidadCeldaModificarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaCancelarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaGuardarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=false;
			
			
			this.isVisibilidadBusquedaPorProyectoPorCodigo=true;
			this.isVisibilidadBusquedaPorProyectoPorNombre=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdPresuEstado=true;
			this.isVisibilidadFK_IdPresuProyecto=true;
			this.isVisibilidadFK_IdPresuTipoCuentaProyecto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresuProyectoCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresuProyectoCuenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresuProyectoCuenta(false);
			
			this.setPermisosUsuarioPresuProyectoCuenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() 
				|| (this.presuproyectocuentaSessionBean.getEsGuardarRelacionado() && this.presuproyectocuentaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresuProyectoCuentaClasesRelacionadas();
			}
			
			if(this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresuProyectoCuentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresuProyectoCuenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresuProyectoCuenta();
			}
			
			if(!this.isPermisoBusquedaPresuProyectoCuenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresuProyectoCuenta,this.isPermisoPaginacionMedioPresuProyectoCuenta,this.isPermisoPaginacionTodoPresuProyectoCuenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresuProyectoCuentaConstantesFunciones.getTiposSeleccionarPresuProyectoCuenta());
				
				this.tiposColumnasSelect=PresuProyectoCuentaConstantesFunciones.getTiposSeleccionarPresuProyectoCuenta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPresuProyectoCuenta();				
				//this.tiposRelacionesSelect=PresuProyectoCuentaConstantesFunciones.getTiposRelacionesPresuProyectoCuenta(true);
				
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
			//if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresuProyectoCuenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPresuProyectoCuenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPresuProyectoCuenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuProyectoCuenta() ;
			
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
			
			
			this.presuasignacionLogic=new PresuAsignacionLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.presuproyectoLogic=new PresuProyectoLogic();
			this.presutipocuentaproyectoLogic=new PresuTipoCuentaProyectoLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
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
				presuproyectocuentaImplementable= (PresuProyectoCuentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuProyectoCuentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presuproyectocuentaImplementableHome= (PresuProyectoCuentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuProyectoCuentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presuproyectocuentas= new ArrayList<PresuProyectoCuenta>();
			this.presuproyectocuentasEliminados= new ArrayList<PresuProyectoCuenta>();
						
			this.isEsNuevoPresuProyectoCuenta=false;
			this.esParaAccionDesdeFormularioPresuProyectoCuenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.presuproyectosForeignKey=new ArrayList<PresuProyecto>() ;
			this.presutipocuentaproyectosForeignKey=new ArrayList<PresuTipoCuentaProyecto>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.presuestadosForeignKey=new ArrayList<PresuEstado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresuProyectoCuenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresuProyectoCuenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresuProyectoCuentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresuProyectoCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresuProyectoCuenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresuProyectoCuenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresuProyectoCuenta();
			}
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresuProyectoCuenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresuProyectoCuenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresuProyectoCuenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresuProyectoCuenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresuProyectoCuenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresuProyectoCuenta() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresuProyectoCuenta")) {
				iIndex=this.jInternalFrameDetalleFormPresuProyectoCuenta.jTabbedPaneRelacionesPresuProyectoCuenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresuProyectoCuenta.jTabbedPaneRelacionesPresuProyectoCuenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();	
				
				

				if(sTitle.equals("Asignacion Presupuestoes")) {
					if(!PresuAsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPresuProyectoCuenta();

						this.cargarParteTabPanelRelacionadaPresuAsignacion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresuProyectoCuenta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPresuAsignacion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPresuProyectoCuenta.cargarSessionConBeanSwingJInternalFramePresuAsignacion(false,true,iIndex);
		this.jButtonPresuAsignacionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPresuAsignacion();

		//this.jTabbedPaneRelacionesPresuProyectoCuenta.updateUI();
		//this.jTabbedPaneRelacionesPresuProyectoCuenta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPresuProyectoCuenta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PresuAsignacion")) {
				int row=this.jTableDatosPresuProyectoCuenta.getSelectedRow();
				jButtonPresuAsignacionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Asignacion Presupuesto")) {

					if(this.isTienePermisosPresuAsignacion && this.presuproyectocuentaConstantesFunciones.mostrarPresuAsignacionPresuProyectoCuenta && !PresuProyectoCuentaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Asignacion Presupuestoes"+"("+PresuAsignacionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Asignacion Presupuestoes");

						if(presuproyectocuentaConstantesFunciones.resaltarPresuAsignacionPresuProyectoCuenta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(presuproyectocuentaConstantesFunciones.resaltarPresuAsignacionPresuProyectoCuenta);
						}

						jmenuItem.setEnabled(this.presuproyectocuentaConstantesFunciones.activarPresuAsignacionPresuProyectoCuenta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PresuAsignacion"));

						

						this.jInternalFrameDetalleFormPresuProyectoCuenta.jmenuDetallePresuProyectoCuenta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPresuProyectoCuenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresuProyectoCuenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresuProyectoCuenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresuProyectoCuentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresuProyectoCuenta();
		
		this.cargarCombosFrameForeignKeyPresuProyectoCuenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresuProyectoCuenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresuProyectoCuenta();
		}
	}
	
	

	public void cargarCombosForeignKeyPresuProyecto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPresuProyectoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPresuProyecto();
				this.cargarCombosFramePresuProyectosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPresuProyecto(this.presuproyectosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPresuTipoCuentaProyecto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPresuTipoCuentaProyectoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPresuTipoCuentaProyecto();
				this.cargarCombosFramePresuTipoCuentaProyectosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPresuTipoCuentaProyecto(this.presutipocuentaproyectosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

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
	
	public void jButtonNuevoPresuProyectoCuentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
			
			if(jTableDatosPresuProyectoCuenta.getRowCount()>=1) {
				jTableDatosPresuProyectoCuenta.removeRowSelectionInterval(0, jTableDatosPresuProyectoCuenta.getRowCount()-1);						
			}
			
			this.isEsNuevoPresuProyectoCuenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresuProyectoCuenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresuProyectoCuenta(true);			
			//this.presuproyectocuenta=new PresuProyectoCuenta();
			//this.presuproyectocuenta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuProyectoCuenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuProyectoCuenta() ;
			
			if(PresuProyectoCuentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuProyectoCuenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presuproyectocuenta);	
			this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);				
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
			if(this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresuProyectoCuenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresuProyectoCuentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresuProyectoCuenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresuProyectoCuenta.getSelectedRows().length;			
			}
			
			presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresuProyectoCuenta--;			
				//PresuProyectoCuenta presuproyectocuentaAux= new PresuProyectoCuenta();			
				//presuproyectocuentaAux.setId(this.iIdNuevoPresuProyectoCuenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresuProyectoCuenta presuproyectocuentaOrigen=new PresuProyectoCuenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresuProyectoCuenta presuproyectocuentaOrigen : presuproyectocuentasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presuproyectocuentaOrigen =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectocuentaOrigen =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresuProyectoCuenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presuproyectocuenta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresuProyectoCuenta(presuproyectocuentaOrigen,this.presuproyectocuenta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presuproyectocuentaLogic.getPresuProyectoCuentas().add(this.presuproyectocuentaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presuproyectocuentas.add(this.presuproyectocuentaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
				
				this.jTableDatosPresuProyectoCuenta.setRowSelectionInterval(this.getIndiceNuevoPresuProyectoCuenta(), this.getIndiceNuevoPresuProyectoCuenta());
				
				int iLastRow =  this.jTableDatosPresuProyectoCuenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuProyectoCuenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuProyectoCuenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();									
		
			PresuProyectoCuenta presuproyectocuentaOrigen=new PresuProyectoCuenta();
			PresuProyectoCuenta presuproyectocuentaDestino=new PresuProyectoCuenta();
				
			presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresuProyectoCuenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presuproyectocuentasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresuProyectoCuenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaOrigen =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presuproyectocuentaOrigen =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectocuentaDestino =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presuproyectocuentaDestino =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presuproyectocuentaOrigen =presuproyectocuentasSeleccionados.get(0);
				presuproyectocuentaDestino =presuproyectocuentasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresuProyectoCuenta(presuproyectocuentaOrigen,presuproyectocuentaDestino,true,false);
				
				presuproyectocuentaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presuproyectocuentaDestino,presuproyectocuentaLogic.getPresuProyectoCuentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuproyectocuentaDestino,presuproyectocuentas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
				
				//this.jTableDatosPresuProyectoCuenta.setRowSelectionInterval(this.getIndiceNuevoPresuProyectoCuenta(), this.getIndiceNuevoPresuProyectoCuenta());
				
				int iLastRow =  this.jTableDatosPresuProyectoCuenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuProyectoCuenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuProyectoCuenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresuProyectoCuenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresuProyectoCuenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresuProyectoCuenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresuProyectoCuenta.setVisible(!isVisible);
			this.jPanelPaginacionPresuProyectoCuenta.setVisible(!isVisible);
			this.jPanelAccionesPresuProyectoCuenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresuProyectoCuenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresuProyectoCuenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresuProyectoCuenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresuProyectoCuenta();
			
			this.abrirFrameOrderByPresuProyectoCuenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresuProyectoCuenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresuProyectoCuenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuProyectoCuenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresuProyectoCuenta.isMaximum()) {
					this.jInternalFrameDetalleFormPresuProyectoCuenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresuProyectoCuenta.setSize(this.jInternalFrameDetalleFormPresuProyectoCuenta.iWidthFormulario,this.jInternalFrameDetalleFormPresuProyectoCuenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresuProyectoCuenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresuProyectoCuenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresuProyectoCuenta.isMaximum()) {
						this.jInternalFrameDetalleFormPresuProyectoCuenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jContentPaneDetallePresuProyectoCuenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresuProyectoCuenta.jTabbedPaneRelacionesPresuProyectoCuenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresuProyectoCuenta.jContentPaneDetallePresuProyectoCuenta.getWidth(),PresuProyectoCuentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuProyectoCuenta.jTabbedPaneRelacionesPresuProyectoCuenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresuProyectoCuenta.jContentPaneDetallePresuProyectoCuenta.getWidth(),PresuProyectoCuentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuProyectoCuenta.jTabbedPaneRelacionesPresuProyectoCuenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresuProyectoCuenta.jContentPaneDetallePresuProyectoCuenta.getWidth(),PresuProyectoCuentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PresuAsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPresuAsignacion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresuProyectoCuenta.setVisible(true);
	        this.jInternalFrameDetalleFormPresuProyectoCuenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresuProyectoCuenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresuProyectoCuenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresuProyectoCuenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuProyectoCuenta,false,this);
				} else {
					this.jInternalFrameOrderByPresuProyectoCuenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuProyectoCuenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresuProyectoCuenta);
				this.jInternalFrameOrderByPresuProyectoCuenta.setVisible(false);
				this.jInternalFrameOrderByPresuProyectoCuenta.setSelected(false);
				
				this.jInternalFrameOrderByPresuProyectoCuenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuProyectoCuenta"));
				
				this.inicializarActualizarBindingTablaOrderByPresuProyectoCuenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresuProyectoCuenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresuProyectoCuenta==null) {
				
				this.jInternalFrameImportacionPresuProyectoCuenta=new ImportacionJInternalFrame(PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuProyectoCuenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresuProyectoCuenta);
				this.jInternalFrameImportacionPresuProyectoCuenta.setVisible(false);
				this.jInternalFrameImportacionPresuProyectoCuenta.setSelected(false);


				this.jInternalFrameImportacionPresuProyectoCuenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuProyectoCuenta"));
				this.jInternalFrameImportacionPresuProyectoCuenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuProyectoCuenta"));
				this.jInternalFrameImportacionPresuProyectoCuenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuProyectoCuenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresuProyectoCuenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta==null) {
				this.jInternalFrameReporteDinamicoPresuProyectoCuenta=new ReporteDinamicoJInternalFrame(PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuProyectoCuenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuProyectoCuenta);
				this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setVisible(false);
				this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuProyectoCuenta"));
				this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuProyectoCuenta"));
				this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuProyectoCuenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuProyectoCuenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPresuAsignacion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.jScrollPanelDatosPresuAsignacion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPresuProyectoCuenta.jContentPaneDetallePresuProyectoCuenta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.jScrollPanelDatosPresuAsignacion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.jScrollPanelDatosPresuAsignacion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.jScrollPanelDatosPresuAsignacion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePresuProyectoCuenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuProyectoCuenta);
			
	       	this.jInternalFrameDetalleFormPresuProyectoCuenta.setVisible(false);
	        this.jInternalFrameDetalleFormPresuProyectoCuenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresuProyectoCuenta.dispose();
			//this.jInternalFrameDetalleFormPresuProyectoCuenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresuProyectoCuenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresuProyectoCuenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresuProyectoCuenta.setVisible(true);
	        this.jInternalFrameImportacionPresuProyectoCuenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresuProyectoCuenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresuProyectoCuenta.setVisible(true);
	        this.jInternalFrameOrderByPresuProyectoCuenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresuProyectoCuenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresuProyectoCuenta.setVisible(false);
	        this.jInternalFrameOrderByPresuProyectoCuenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresuProyectoCuenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresuProyectoCuenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresuProyectoCuenta.setVisible(false);
	        this.jInternalFrameImportacionPresuProyectoCuenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContable(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContable";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderPresuProyectoCuenta=(TitledBorder)this.jScrollPanelDatosPresuProyectoCuenta.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderPresuProyectoCuenta.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContable(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresuProyectoCuenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresuProyectoCuenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresuProyectoCuenta(true);
			//this.isEsNuevoPresuProyectoCuenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresuProyectoCuenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuProyectoCuenta(false) ;
			
			if(presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionSessionBean.getEsGuardarRelacionado() && PresuAsignacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresuAsignacionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PresuProyectoCuentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuProyectoCuenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuProyectoCuenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresuProyectoCuentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresuProyectoCuenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresuProyectoCuenta(true);
			//this.isEsNuevoPresuProyectoCuenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presuproyectocuenta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresuProyectoCuenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresuProyectoCuenta(false) ;
			
			if(PresuProyectoCuentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuProyectoCuenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuProyectoCuenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.presuproyectocuentaConstantesFunciones.cargarid_cuenta_contablePresuProyectoCuenta) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
			
			if(sType.equals("Empleado")) {
				if(!this.presuproyectocuentaConstantesFunciones.cargarid_empleadoPresuProyectoCuenta) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPresuProyecto(List<PresuProyecto> presuproyectosForeignKey)throws Exception{
		TableColumn tableColumnPresuProyecto=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO));
		TableCellEditor tableCellEditorPresuProyecto =tableColumnPresuProyecto.getCellEditor();

		PresuProyectoTableCell presuproyectoTableCellFk=(PresuProyectoTableCell)tableCellEditorPresuProyecto;

		if(presuproyectoTableCellFk!=null) {
			presuproyectoTableCellFk.setpresuproyectosForeignKey(presuproyectosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuProyectoCuenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//presuproyectoTableCellFk.setRowActual(intSelectedRow);
			//presuproyectoTableCellFk.setpresuproyectosForeignKeyActual(presuproyectosForeignKey);
		//}


		if(presuproyectoTableCellFk!=null) {
			presuproyectoTableCellFk.RecargarPresuProyectosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPresuTipoCuentaProyecto(List<PresuTipoCuentaProyecto> presutipocuentaproyectosForeignKey)throws Exception{
		TableColumn tableColumnPresuTipoCuentaProyecto=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO));
		TableCellEditor tableCellEditorPresuTipoCuentaProyecto =tableColumnPresuTipoCuentaProyecto.getCellEditor();

		PresuTipoCuentaProyectoTableCell presutipocuentaproyectoTableCellFk=(PresuTipoCuentaProyectoTableCell)tableCellEditorPresuTipoCuentaProyecto;

		if(presutipocuentaproyectoTableCellFk!=null) {
			presutipocuentaproyectoTableCellFk.setpresutipocuentaproyectosForeignKey(presutipocuentaproyectosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuProyectoCuenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//presutipocuentaproyectoTableCellFk.setRowActual(intSelectedRow);
			//presutipocuentaproyectoTableCellFk.setpresutipocuentaproyectosForeignKeyActual(presutipocuentaproyectosForeignKey);
		//}


		if(presutipocuentaproyectoTableCellFk!=null) {
			presutipocuentaproyectoTableCellFk.RecargarPresuTipoCuentaProyectosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuProyectoCuenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuProyectoCuenta.getSelectedRow();

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
		TableColumn tableColumnPresuEstado=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO));
		TableCellEditor tableCellEditorPresuEstado =tableColumnPresuEstado.getCellEditor();

		PresuEstadoTableCell presuestadoTableCellFk=(PresuEstadoTableCell)tableCellEditorPresuEstado;

		if(presuestadoTableCellFk!=null) {
			presuestadoTableCellFk.setpresuestadosForeignKey(presuestadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuProyectoCuenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//presuestadoTableCellFk.setRowActual(intSelectedRow);
			//presuestadoTableCellFk.setpresuestadosForeignKeyActual(presuestadosForeignKey);
		//}


		if(presuestadoTableCellFk!=null) {
			presuestadoTableCellFk.RecargarPresuEstadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresuProyectoCuenta(false);
			
			//if(!this.isEsNuevoPresuProyectoCuenta) {								
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				
			}
			
			if(this.permiteMantenimiento(this.presuproyectocuenta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresuProyectoCuenta=true;
					this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
					this.isEsNuevoPresuProyectoCuenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresuProyectoCuenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresuProyectoCuenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuProyectoCuenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuProyectoCuenta(false);
				
				this.habilitarDeshabilitarControlesPresuProyectoCuenta(false);
			
												
				
				if(PresuProyectoCuentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresuProyectoCuenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresuProyectoCuentaActionPerformed(evt,presuproyectocuentaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresuProyectoCuenta(this.presuproyectocuenta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresuProyectoCuenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presuproyectocuentaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presuproyectocuenta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresuProyectoCuenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyectoCuenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				this.presuproyectocuenta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				this.presuproyectocuenta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presuproyectocuenta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresuProyectoCuentaModel) this.jTableDatosPresuProyectoCuenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresuProyectoCuenta=true;
				this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
				this.isEsNuevoPresuProyectoCuenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuProyectoCuenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuProyectoCuenta(false);
				
				this.habilitarDeshabilitarControlesPresuProyectoCuenta(false);
				
				
				
				if(PresuProyectoCuentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresuProyectoCuenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresuProyectoCuenta.getRowCount()>=1) {
				jTableDatosPresuProyectoCuenta.removeRowSelectionInterval(0, jTableDatosPresuProyectoCuenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresuProyectoCuenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuProyectoCuenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuProyectoCuenta(false) ;
			
			this.isEsNuevoPresuProyectoCuenta=false;
			
			if(PresuProyectoCuentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresuProyectoCuenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresuProyectoCuenta(false);
				
				//SI ES MANUAL
				if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresuProyectoCuenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresuProyectoCuenta--;			
			//PresuProyectoCuenta presuproyectocuentaAux= new PresuProyectoCuenta();			
			//presuproyectocuentaAux.setId(this.iIdNuevoPresuProyectoCuenta);
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresuProyectoCuenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
			
			this.presuproyectocuenta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presuproyectocuentaLogic.getPresuProyectoCuentas().add(this.presuproyectocuentaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presuproyectocuentas.add(this.presuproyectocuentaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
			
			this.jTableDatosPresuProyectoCuenta.setRowSelectionInterval(this.getIndiceNuevoPresuProyectoCuenta(), this.getIndiceNuevoPresuProyectoCuenta());
			
			int iLastRow =  this.jTableDatosPresuProyectoCuenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresuProyectoCuenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresuProyectoCuenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuProyectoCuenta(false);
			
			//SI ES MANUAL
			if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuProyectoCuenta();
			}
			
			//this.abrirFrameTreePresuProyectoCuenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cuenta Contable ProyectoES ?", "MANTENIMIENTO DE Cuenta Contable Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresuProyectoCuenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresuProyectoCuenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presuproyectocuentaReturnGeneral=presuproyectocuentaLogic.procesarImportacionPresuProyectoCuentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presuproyectocuentaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresuProyectoCuentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresuProyectoCuenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresuProyectoCuenta.setFileImportacion(this.jInternalFrameImportacionPresuProyectoCuenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresuProyectoCuenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresuProyectoCuenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresuProyectoCuenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresuProyectoCuenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();		

		presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresuProyectoCuentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresuProyectoCuentaBaseDesign.jrxml";
			
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
			
			this.generarReportePresuProyectoCuentas("Todos",presuproyectocuentasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PresuProyecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PresuProyecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PresuProyecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PresuProyecto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PresuTipoCuentaProyecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PresuTipoCuentaProyecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PresuTipoCuentaProyecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PresuTipoCuentaProyecto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PresuEstado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PresuEstado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PresuEstado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PresuEstado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO:
					sNombreCampoCategoria="id_presu_proyecto";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO:
					sNombreCampoCategoria="id_presu_tipo_cuenta_proyecto";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO:
					sNombreCampoCategoria="id_presu_estado";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO:
					sNombreCampoCategoriaValor="id_presu_proyecto";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO:
					sNombreCampoCategoriaValor="id_presu_tipo_cuenta_proyecto";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO:
					sNombreCampoCategoriaValor="id_presu_estado";
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Proyecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_presu_proyecto");
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Cuenta Proyecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_presu_tipo_cuenta_proyecto");
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_presu_estado");
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();		
		
		presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyectocuenta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresuProyectoCuentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO);
					iRow++;

					for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyectocuenta.getpresuproyecto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO);
					iRow++;

					for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyectocuenta.getpresutipocuentaproyecto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyectocuenta.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyectocuenta.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyectocuenta.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyectocuenta.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyectocuenta.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyectocuenta.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyectocuenta.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO);
					iRow++;

					for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyectocuenta.getpresuestado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(PresuProyectoCuenta presuproyectocuenta:presuproyectocuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyectocuenta.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelPresuProyectoCuenta(row);				
			//	iRow++;
			//}				
			
			//for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresuProyectoCuenta(presuproyectocuentaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Proyecto",JOptionPane.INFORMATION_MESSAGE);
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
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuProyectoCuenta(false);
			
			//SI ES MANUAL
			if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuProyectoCuenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuProyectoCuenta(false);
			
			//SI ES MANUAL
			if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuProyectoCuenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuProyectoCuenta(false);
			
			//SI ES MANUAL
			if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuProyectoCuenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresuProyectoCuenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresuProyectoCuenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresuProyectoCuenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresuProyectoCuenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresuProyectoCuenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresuProyectoCuenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresuProyectoCuenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresuProyectoCuenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresuProyectoCuenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresuProyectoCuenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresuProyectoCuenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresuProyectoCuenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresuProyectoCuenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresuProyectoCuenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuProyectoCuenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresuProyectoCuenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresuProyectoCuenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresuProyectoCuenta();
		
		this.inicializarActualizarBindingBotonesManualPresuProyectoCuenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresuProyectoCuenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuProyectoCuenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresuProyectoCuenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresuProyectoCuenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresuProyectoCuenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresuProyectoCuenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresuProyectoCuenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresuProyectoCuenta.jCheckBoxPostAccionNuevoPresuProyectoCuenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresuProyectoCuenta.jCheckBoxPostAccionSinCerrarPresuProyectoCuenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresuProyectoCuenta.jCheckBoxPostAccionSinMensajePresuProyectoCuenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresuProyectoCuenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresuProyectoCuenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresuProyectoCuenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
				this.jInternalFrameDetalleFormPresuProyectoCuenta.jCheckBoxPostAccionNuevoPresuProyectoCuenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresuProyectoCuenta.jCheckBoxPostAccionSinCerrarPresuProyectoCuenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresuProyectoCuenta.jCheckBoxPostAccionSinMensajePresuProyectoCuenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresuProyectoCuenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresuProyectoCuenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresuProyectoCuenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresuProyectoCuenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresuProyectoCuenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresuProyectoCuenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresuProyectoCuenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresuProyectoCuenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresuProyectoCuenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresuProyectoCuenta(Boolean esInicializar) throws Exception {
		try	{	
			if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresuProyectoCuenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresuProyectoCuenta() throws Exception {
		try	{
			if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuProyectoCuenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuProyectoCuenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuProyectoCuenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresuProyectoCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresuProyectoCuenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresuProyectoCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresuProyectoCuenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresuProyectoCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresuProyectoCuenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresuProyectoCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresuProyectoCuenta.addItem(reporte);
			}
			
			
			if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresuProyectoCuenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresuProyectoCuenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresuProyectoCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresuProyectoCuenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresuProyectoCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresuProyectoCuenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresuProyectoCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresuProyectoCuenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresuProyectoCuenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuProyectoCuenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuProyectoCuenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta!=null) {
				this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta!=null) {
				this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PresuProyectoCuentaConstantesFunciones.getTiposSeleccionarPresuProyectoCuenta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PresuProyectoCuentaConstantesFunciones.getTiposSeleccionarPresuProyectoCuenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PresuProyectoCuentaConstantesFunciones.getTiposSeleccionarPresuProyectoCuenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresuProyectoCuenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.getSelectedItem()!=null){this.id_presu_proyectoBusquedaPorProyectoPorCodigo=((PresuProyecto)this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.getSelectedItem()).getId();}
		this.codigoBusquedaPorProyectoPorCodigo=this.jTextFieldcodigoBusquedaPorProyectoPorCodigoPresuProyectoCuenta.getText();
		if(this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.getSelectedItem()!=null){this.id_presu_proyectoBusquedaPorProyectoPorNombre=((PresuProyecto)this.jComboBoxid_presu_proyectoBusquedaPorProyectoPorNombrePresuProyectoCuenta.getSelectedItem()).getId();}
		this.nombreBusquedaPorProyectoPorNombre=this.jTextAreanombreBusquedaPorProyectoPorNombrePresuProyectoCuenta.getText();
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuProyectoCuenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoPresuProyectoCuenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.getSelectedItem()!=null){this.id_presu_estadoFK_IdPresuEstado=((PresuEstado)this.jComboBoxid_presu_estadoFK_IdPresuEstadoPresuProyectoCuenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.getSelectedItem()!=null){this.id_presu_proyectoFK_IdPresuProyecto=((PresuProyecto)this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuProyectoCuenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.getSelectedItem()!=null){this.id_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto=((PresuTipoCuentaProyecto)this.jComboBoxid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresuProyectoCuenta(Boolean esInicializar) throws Exception {				
		if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresuProyectoCuenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresuProyectoCuenta() throws Exception {
		this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresuProyectoCuenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresuProyectoCuentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresuProyectoCuenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presuproyectocuentaLogic.getPresuProyectoCuentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presuproyectocuentas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresuProyectoCuenta.setModel(new PresuProyectoCuentaModel(this.presuproyectocuentaLogic.getPresuProyectoCuentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresuProyectoCuenta.setModel(new PresuProyectoCuentaModel(this.presuproyectocuentas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresuProyectoCuenta!=null && this.jInternalFrameOrderByPresuProyectoCuenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresuProyectoCuenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO,presuproyectocuentaConstantesFunciones.resaltarSeleccionarPresuProyectoCuenta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO,presuproyectocuentaConstantesFunciones.resaltarSeleccionarPresuProyectoCuenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_ID));

		if(this.presuproyectocuentaConstantesFunciones.mostraridPresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presuproyectocuentaConstantesFunciones.resaltaridPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activaridPresuProyectoCuenta,iSizeTabla,this,true,"idPresuProyectoCuenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuproyectocuentaConstantesFunciones.resaltaridPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activaridPresuProyectoCuenta,this,true,"idPresuProyectoCuenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO));

		if(this.presuproyectocuentaConstantesFunciones.mostrarid_presu_proyectoPresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PresuProyectoTableCell(this.presuproyectosForeignKey,this.presuproyectocuentaConstantesFunciones.resaltarid_presu_proyectoPresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarid_presu_proyectoPresuProyectoCuenta,iSizeTabla));
			tableColumn.setCellEditor(new PresuProyectoTableCell(this.presuproyectosForeignKey,this.presuproyectocuentaConstantesFunciones.resaltarid_presu_proyectoPresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarid_presu_proyectoPresuProyectoCuenta,true,"id_presu_proyectoPresuProyectoCuenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO));

		if(this.presuproyectocuentaConstantesFunciones.mostrarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PresuTipoCuentaProyectoTableCell(this.presutipocuentaproyectosForeignKey,this.presuproyectocuentaConstantesFunciones.resaltarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta,iSizeTabla));
			tableColumn.setCellEditor(new PresuTipoCuentaProyectoTableCell(this.presutipocuentaproyectosForeignKey,this.presuproyectocuentaConstantesFunciones.resaltarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta,true,"id_presu_tipo_cuenta_proyectoPresuProyectoCuenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO));

		if(this.presuproyectocuentaConstantesFunciones.mostrarcodigoPresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presuproyectocuentaConstantesFunciones.resaltarcodigoPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activarcodigoPresuProyectoCuenta,iSizeTabla,this,true,"codigoPresuProyectoCuenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuproyectocuentaConstantesFunciones.resaltarcodigoPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activarcodigoPresuProyectoCuenta,this,true,"codigoPresuProyectoCuenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE));

		if(this.presuproyectocuentaConstantesFunciones.mostrarnombrePresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presuproyectocuentaConstantesFunciones.resaltarnombrePresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activarnombrePresuProyectoCuenta,iSizeTabla,this,true,"nombrePresuProyectoCuenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuproyectocuentaConstantesFunciones.resaltarnombrePresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activarnombrePresuProyectoCuenta,this,true,"nombrePresuProyectoCuenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.presuproyectocuentaConstantesFunciones.mostrarid_cuenta_contablePresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.presuproyectocuentaConstantesFunciones.resaltarid_cuenta_contablePresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarid_cuenta_contablePresuProyectoCuenta,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.presuproyectocuentaConstantesFunciones.resaltarid_cuenta_contablePresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarid_cuenta_contablePresuProyectoCuenta,true,"id_cuenta_contablePresuProyectoCuenta","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.presuproyectocuentaConstantesFunciones.mostrarid_empleadoPresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.presuproyectocuentaConstantesFunciones.resaltarid_empleadoPresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarid_empleadoPresuProyectoCuenta,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.presuproyectocuentaConstantesFunciones.resaltarid_empleadoPresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarid_empleadoPresuProyectoCuenta,true,"id_empleadoPresuProyectoCuenta","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_FECHA));

		if(this.presuproyectocuentaConstantesFunciones.mostrarfechaPresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.presuproyectocuentaConstantesFunciones.resaltarfechaPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activarfechaPresuProyectoCuenta,iSizeTabla,this,true,"fechaPresuProyectoCuenta","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.presuproyectocuentaConstantesFunciones.resaltarfechaPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activarfechaPresuProyectoCuenta,this,true,"fechaPresuProyectoCuenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_VALOR));

		if(this.presuproyectocuentaConstantesFunciones.mostrarvalorPresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presuproyectocuentaConstantesFunciones.resaltarvalorPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activarvalorPresuProyectoCuenta,iSizeTabla,this,true,"valorPresuProyectoCuenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuproyectocuentaConstantesFunciones.resaltarvalorPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activarvalorPresuProyectoCuenta,this,true,"valorPresuProyectoCuenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN));

		if(this.presuproyectocuentaConstantesFunciones.mostrarordenPresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presuproyectocuentaConstantesFunciones.resaltarordenPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activarordenPresuProyectoCuenta,iSizeTabla,this,true,"ordenPresuProyectoCuenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuproyectocuentaConstantesFunciones.resaltarordenPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activarordenPresuProyectoCuenta,this,true,"ordenPresuProyectoCuenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO));

		if(this.presuproyectocuentaConstantesFunciones.mostrarid_presu_estadoPresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PresuEstadoTableCell(this.presuestadosForeignKey,this.presuproyectocuentaConstantesFunciones.resaltarid_presu_estadoPresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarid_presu_estadoPresuProyectoCuenta,iSizeTabla));
			tableColumn.setCellEditor(new PresuEstadoTableCell(this.presuestadosForeignKey,this.presuproyectocuentaConstantesFunciones.resaltarid_presu_estadoPresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarid_presu_estadoPresuProyectoCuenta,true,"id_presu_estadoPresuProyectoCuenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.presuproyectocuentaConstantesFunciones.mostrardescripcionPresuProyectoCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presuproyectocuentaConstantesFunciones.resaltardescripcionPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activardescripcionPresuProyectoCuenta,iSizeTabla,this,true,"descripcionPresuProyectoCuenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuproyectocuentaConstantesFunciones.resaltardescripcionPresuProyectoCuenta,this.presuproyectocuentaConstantesFunciones.activardescripcionPresuProyectoCuenta,this,true,"descripcionPresuProyectoCuenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPresuAsignacion && this.presuproyectocuentaConstantesFunciones.mostrarPresuAsignacionPresuProyectoCuenta && !PresuProyectoCuentaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Asignacion Presupuestoes");
				tableColumn.setHeaderValue("Asignacion Presupuestoes");
				tableColumn.setCellRenderer(new PresuAsignacionTableCell(presuproyectocuentaConstantesFunciones.resaltarPresuAsignacionPresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarPresuAsignacionPresuProyectoCuenta));
				tableColumn.setCellEditor(new PresuAsignacionTableCell(presuproyectocuentaConstantesFunciones.resaltarPresuAsignacionPresuProyectoCuenta,this,this.presuproyectocuentaConstantesFunciones.activarPresuAsignacionPresuProyectoCuenta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPresuProyectoCuenta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presuproyectocuentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presuproyectocuentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuProyectoCuenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presuproyectocuentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presuproyectocuentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuProyectoCuenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presuproyectocuentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presuproyectocuentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresuProyectoCuenta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosPresuProyectoCuenta.addColumn(tableColumn);
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
			
			this.jTableDatosPresuProyectoCuenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresuProyectoCuenta.moveColumn(this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresuProyectoCuenta.moveColumn(this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPresuProyectoCuenta.moveColumn(this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresuProyectoCuenta.moveColumn(this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresuProyectoCuenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresuProyectoCuenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresuProyectoCuenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresuProyectoCuenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresuProyectoCuenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresuProyectoCuenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presuproyectocuentaLogic.getPresuProyectoCuentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presuproyectocuentas.size()-1;
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
		//this.jTableDatosPresuProyectoCuenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresuProyectoCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresuProyectoCuenta();
			
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
				
				//this.isEsNuevoPresuProyectoCuenta=false;
					
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
				if(this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuProyectoCuenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuProyectoCuenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presuproyectocuenta.getsType().equals("DUPLICADO")
				   || this.presuproyectocuenta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresuProyectoCuenta=true;
				
				} else {
					this.isEsNuevoPresuProyectoCuenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
					if(this.presuproyectocuenta.getId()>=0 && !this.presuproyectocuenta.getIsNew()) {						
						this.isEsNuevoPresuProyectoCuenta=false;
						
					} else {
						this.isEsNuevoPresuProyectoCuenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresuProyectoCuenta(esRelaciones);						
				
				this.seleccionarPresuProyectoCuenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presuproyectocuenta.getId()<0) {
					this.isEsNuevoPresuProyectoCuenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresuProyectoCuenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresuProyectoCuenta(evt,rowIndex);
				}	
				
				if(this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresuProyectoCuenta: " + this.dDif); 
					}
				}								
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresuProyectoCuenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presuproyectocuenta)) {
					if(this.presuproyectocuenta.getId()>0) {
						this.presuproyectocuenta.setIsDeleted(true);
						
						this.presuproyectocuentasEliminados.add(this.presuproyectocuenta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presuproyectocuentaLogic.getPresuProyectoCuentas().remove(this.presuproyectocuenta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presuproyectocuentas.remove(this.presuproyectocuenta);				
					}
					
					
					((PresuProyectoCuentaModel) this.jTableDatosPresuProyectoCuenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresuProyectoCuenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresuProyectoCuenta) {
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuProyectoCuenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuProyectoCuenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresuProyectoCuenta(this.presuproyectocuenta);
				}
				
				//ARCHITECTURE
				try {
					

					//PresuProyecto
					if(!this.presuproyectocuentaConstantesFunciones.cargarid_presu_proyectoPresuProyectoCuenta || this.presuproyectocuentaConstantesFunciones.event_dependid_presu_proyectoPresuProyectoCuenta) {
						//this.cargarCombosPresuProyectosForeignKeyLista(" where id="+this.presuproyectocuenta.getid_presu_proyecto());
									//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
						this.presuproyectosForeignKey=new ArrayList<PresuProyecto>();

						if(presuproyectocuenta.getPresuProyecto()!=null) {
							this.presuproyectosForeignKey.add(presuproyectocuenta.getPresuProyecto());
						}

						this.addItemDefectoCombosForeignKeyPresuProyecto();
						this.cargarCombosFramePresuProyectosForeignKey("Todos");
					}
					this.setActualPresuProyectoForeignKey(this.presuproyectocuenta.getid_presu_proyecto(),false,"Formulario");

					//PresuTipoCuentaProyecto
					if(!this.presuproyectocuentaConstantesFunciones.cargarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta || this.presuproyectocuentaConstantesFunciones.event_dependid_presu_tipo_cuenta_proyectoPresuProyectoCuenta) {
						//this.cargarCombosPresuTipoCuentaProyectosForeignKeyLista(" where id="+this.presuproyectocuenta.getid_presu_tipo_cuenta_proyecto());
									//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
						this.presutipocuentaproyectosForeignKey=new ArrayList<PresuTipoCuentaProyecto>();

						if(presuproyectocuenta.getPresuTipoCuentaProyecto()!=null) {
							this.presutipocuentaproyectosForeignKey.add(presuproyectocuenta.getPresuTipoCuentaProyecto());
						}

						this.addItemDefectoCombosForeignKeyPresuTipoCuentaProyecto();
						this.cargarCombosFramePresuTipoCuentaProyectosForeignKey("Todos");
					}
					this.setActualPresuTipoCuentaProyectoForeignKey(this.presuproyectocuenta.getid_presu_tipo_cuenta_proyecto(),false,"Formulario");

					//CuentaContable
					if(!this.presuproyectocuentaConstantesFunciones.cargarid_cuenta_contablePresuProyectoCuenta || this.presuproyectocuentaConstantesFunciones.event_dependid_cuenta_contablePresuProyectoCuenta) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.presuproyectocuenta.getid_cuenta_contable());
									//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(presuproyectocuenta.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(presuproyectocuenta.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.presuproyectocuenta.getid_cuenta_contable(),false,"Formulario");

					//Empleado
					if(!this.presuproyectocuentaConstantesFunciones.cargarid_empleadoPresuProyectoCuenta || this.presuproyectocuentaConstantesFunciones.event_dependid_empleadoPresuProyectoCuenta) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.presuproyectocuenta.getid_empleado());
									//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(presuproyectocuenta.getEmpleado()!=null) {
							this.empleadosForeignKey.add(presuproyectocuenta.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.presuproyectocuenta.getid_empleado(),false,"Formulario");

					//PresuEstado
					if(!this.presuproyectocuentaConstantesFunciones.cargarid_presu_estadoPresuProyectoCuenta || this.presuproyectocuentaConstantesFunciones.event_dependid_presu_estadoPresuProyectoCuenta) {
						//this.cargarCombosPresuEstadosForeignKeyLista(" where id="+this.presuproyectocuenta.getid_presu_estado());
									//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
						this.presuestadosForeignKey=new ArrayList<PresuEstado>();

						if(presuproyectocuenta.getPresuEstado()!=null) {
							this.presuestadosForeignKey.add(presuproyectocuenta.getPresuEstado());
						}

						this.addItemDefectoCombosForeignKeyPresuEstado();
						this.cargarCombosFramePresuEstadosForeignKey("Todos");
					}
					this.setActualPresuEstadoForeignKey(this.presuproyectocuenta.getid_presu_estado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresuProyectoCuenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresuProyectoCuenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuProyectoCuenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresuProyectoCuenta(presuproyectocuenta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresuProyectoCuenta(presuproyectocuenta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresuProyectoCuenta(presuproyectocuenta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresuProyectoCuenta(presuproyectocuenta);
	}
	
	public void setVariablesObjetoActualToFormularioPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelidPresuProyectoCuenta.setText(presuproyectocuenta.getId().toString());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldcodigoPresuProyectoCuenta.setText(presuproyectocuenta.getcodigo());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreanombrePresuProyectoCuenta.setText(presuproyectocuenta.getnombre());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jDateChooserfechaPresuProyectoCuenta.setDate(presuproyectocuenta.getfecha());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldvalorPresuProyectoCuenta.setText(presuproyectocuenta.getvalor().toString());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldordenPresuProyectoCuenta.setText(presuproyectocuenta.getorden().toString());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreadescripcionPresuProyectoCuenta.setText(presuproyectocuenta.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresuProyectoCuenta presuproyectocuentaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presuproyectocuentaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresuProyectoCuenta presuproyectocuentaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presuproyectocuentaLocal=this.presuproyectocuenta;
			} else {
				presuproyectocuentaLocal=this.presuproyectocuentaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presuproyectocuentaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresuProyectoCuenta(presuproyectocuentaLocal,true);
					
					if(presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presuproyectocuentaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presuproyectocuentaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(presuproyectocuenta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(presuproyectocuenta);
	}
	
	public void setVariablesFormularioToObjetoActualPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(presuproyectocuenta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelidPresuProyectoCuenta.getText()==null || this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelidPresuProyectoCuenta.getText()=="" || this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelidPresuProyectoCuenta.getText()=="Id") {
				this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelidPresuProyectoCuenta.setText("0");
			}

			if(conColumnasBase) {presuproyectocuenta.setId(Long.parseLong(this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelidPresuProyectoCuenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoCuentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelIdPresuProyectoCuenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuproyectocuenta.setcodigo(this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldcodigoPresuProyectoCuenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelcodigoPresuProyectoCuenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuproyectocuenta.setnombre(this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreanombrePresuProyectoCuenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelnombrePresuProyectoCuenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuproyectocuenta.setfecha(this.jInternalFrameDetalleFormPresuProyectoCuenta.jDateChooserfechaPresuProyectoCuenta.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoCuentaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelfechaPresuProyectoCuenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuproyectocuenta.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldvalorPresuProyectoCuenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoCuentaConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelvalorPresuProyectoCuenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuproyectocuenta.setorden(Integer.parseInt(this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldordenPresuProyectoCuenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelordenPresuProyectoCuenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuproyectocuenta.setdescripcion(this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreadescripcionPresuProyectoCuenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabeldescripcionPresuProyectoCuenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuentaBean,PresuProyectoCuenta presuproyectocuenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && presuproyectocuentaBean.getid_presu_proyecto()!=null && !presuproyectocuentaBean.getid_presu_proyecto().equals(-1L))) {presuproyectocuenta.setid_presu_proyecto(presuproyectocuentaBean.getid_presu_proyecto());}
			if(conDefault || (!conDefault && presuproyectocuentaBean.getid_presu_tipo_cuenta_proyecto()!=null && !presuproyectocuentaBean.getid_presu_tipo_cuenta_proyecto().equals(-1L))) {presuproyectocuenta.setid_presu_tipo_cuenta_proyecto(presuproyectocuentaBean.getid_presu_tipo_cuenta_proyecto());}
			if(conDefault || (!conDefault && presuproyectocuentaBean.getid_cuenta_contable()!=null && !presuproyectocuentaBean.getid_cuenta_contable().equals(-1L))) {presuproyectocuenta.setid_cuenta_contable(presuproyectocuentaBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && presuproyectocuentaBean.getid_empleado()!=null && !presuproyectocuentaBean.getid_empleado().equals(-1L))) {presuproyectocuenta.setid_empleado(presuproyectocuentaBean.getid_empleado());}
			if(conDefault || (!conDefault && presuproyectocuentaBean.getid_presu_estado()!=null && !presuproyectocuentaBean.getid_presu_estado().equals(-1L))) {presuproyectocuenta.setid_presu_estado(presuproyectocuentaBean.getid_presu_estado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuentaOrigen,PresuProyectoCuenta presuproyectocuenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presuproyectocuentaOrigen.getId()!=null && !presuproyectocuentaOrigen.getId().equals(0L))) {presuproyectocuenta.setId(presuproyectocuentaOrigen.getId());}}
			if(conDefault || (!conDefault && presuproyectocuentaOrigen.getid_presu_proyecto()!=null && !presuproyectocuentaOrigen.getid_presu_proyecto().equals(-1L))) {presuproyectocuenta.setid_presu_proyecto(presuproyectocuentaOrigen.getid_presu_proyecto());}
			if(conDefault || (!conDefault && presuproyectocuentaOrigen.getid_presu_tipo_cuenta_proyecto()!=null && !presuproyectocuentaOrigen.getid_presu_tipo_cuenta_proyecto().equals(-1L))) {presuproyectocuenta.setid_presu_tipo_cuenta_proyecto(presuproyectocuentaOrigen.getid_presu_tipo_cuenta_proyecto());}
			if(conDefault || (!conDefault && presuproyectocuentaOrigen.getcodigo()!=null && !presuproyectocuentaOrigen.getcodigo().equals(""))) {presuproyectocuenta.setcodigo(presuproyectocuentaOrigen.getcodigo());}
			if(conDefault || (!conDefault && presuproyectocuentaOrigen.getnombre()!=null && !presuproyectocuentaOrigen.getnombre().equals(""))) {presuproyectocuenta.setnombre(presuproyectocuentaOrigen.getnombre());}
			if(conDefault || (!conDefault && presuproyectocuentaOrigen.getid_cuenta_contable()!=null && !presuproyectocuentaOrigen.getid_cuenta_contable().equals(-1L))) {presuproyectocuenta.setid_cuenta_contable(presuproyectocuentaOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && presuproyectocuentaOrigen.getid_empleado()!=null && !presuproyectocuentaOrigen.getid_empleado().equals(-1L))) {presuproyectocuenta.setid_empleado(presuproyectocuentaOrigen.getid_empleado());}
			if(conDefault || (!conDefault && presuproyectocuentaOrigen.getfecha()!=null && !presuproyectocuentaOrigen.getfecha().equals(new Date()))) {presuproyectocuenta.setfecha(presuproyectocuentaOrigen.getfecha());}
			if(conDefault || (!conDefault && presuproyectocuentaOrigen.getvalor()!=null && !presuproyectocuentaOrigen.getvalor().equals(0.0))) {presuproyectocuenta.setvalor(presuproyectocuentaOrigen.getvalor());}
			if(conDefault || (!conDefault && presuproyectocuentaOrigen.getorden()!=null && !presuproyectocuentaOrigen.getorden().equals(0))) {presuproyectocuenta.setorden(presuproyectocuentaOrigen.getorden());}
			if(conDefault || (!conDefault && presuproyectocuentaOrigen.getid_presu_estado()!=null && !presuproyectocuentaOrigen.getid_presu_estado().equals(-1L))) {presuproyectocuenta.setid_presu_estado(presuproyectocuentaOrigen.getid_presu_estado());}
			if(conDefault || (!conDefault && presuproyectocuentaOrigen.getdescripcion()!=null && !presuproyectocuentaOrigen.getdescripcion().equals(""))) {presuproyectocuenta.setdescripcion(presuproyectocuentaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelidPresuProyectoCuenta.setText(presuproyectocuenta.getId().toString());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldcodigoPresuProyectoCuenta.setText(presuproyectocuenta.getcodigo());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreanombrePresuProyectoCuenta.setText(presuproyectocuenta.getnombre());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jDateChooserfechaPresuProyectoCuenta.setDate(presuproyectocuenta.getfecha());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldvalorPresuProyectoCuenta.setText(presuproyectocuenta.getvalor().toString());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldordenPresuProyectoCuenta.setText(presuproyectocuenta.getorden().toString());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreadescripcionPresuProyectoCuenta.setText(presuproyectocuenta.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuProyectoCuenta(PresuProyectoCuentaBean presuproyectocuentaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelidPresuProyectoCuenta.setText(presuproyectocuentaBean.getId().toString());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldcodigoPresuProyectoCuenta.setText(presuproyectocuentaBean.getcodigo());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreanombrePresuProyectoCuenta.setText(presuproyectocuentaBean.getnombre());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jDateChooserfechaPresuProyectoCuenta.setDate(presuproyectocuentaBean.getfecha());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldvalorPresuProyectoCuenta.setText(presuproyectocuentaBean.getvalor().toString());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldordenPresuProyectoCuenta.setText(presuproyectocuentaBean.getorden().toString());
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreadescripcionPresuProyectoCuenta.setText(presuproyectocuentaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresuProyectoCuenta(PresuProyectoCuentaParameterReturnGeneral presuproyectocuentaReturnGeneral,PresuProyectoCuentaBean presuproyectocuentaBean,Boolean conDefault) throws Exception { 
		try {
			PresuProyectoCuenta presuproyectocuentaLocal=new PresuProyectoCuenta();
			
			presuproyectocuentaLocal=presuproyectocuentaReturnGeneral.getPresuProyectoCuenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presuproyectocuentaLocal.getId()!=null && !presuproyectocuentaLocal.getId().equals(0L))) {presuproyectocuentaBean.setId(presuproyectocuentaLocal.getId());}}
			if(conDefault || (!conDefault && presuproyectocuentaLocal.getid_presu_proyecto()!=null && !presuproyectocuentaLocal.getid_presu_proyecto().equals(-1L))) {presuproyectocuentaBean.setid_presu_proyecto(presuproyectocuentaLocal.getid_presu_proyecto());}
			if(conDefault || (!conDefault && presuproyectocuentaLocal.getid_presu_tipo_cuenta_proyecto()!=null && !presuproyectocuentaLocal.getid_presu_tipo_cuenta_proyecto().equals(-1L))) {presuproyectocuentaBean.setid_presu_tipo_cuenta_proyecto(presuproyectocuentaLocal.getid_presu_tipo_cuenta_proyecto());}
			if(conDefault || (!conDefault && presuproyectocuentaLocal.getcodigo()!=null && !presuproyectocuentaLocal.getcodigo().equals(""))) {presuproyectocuentaBean.setcodigo(presuproyectocuentaLocal.getcodigo());}
			if(conDefault || (!conDefault && presuproyectocuentaLocal.getnombre()!=null && !presuproyectocuentaLocal.getnombre().equals(""))) {presuproyectocuentaBean.setnombre(presuproyectocuentaLocal.getnombre());}
			if(conDefault || (!conDefault && presuproyectocuentaLocal.getid_cuenta_contable()!=null && !presuproyectocuentaLocal.getid_cuenta_contable().equals(-1L))) {presuproyectocuentaBean.setid_cuenta_contable(presuproyectocuentaLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && presuproyectocuentaLocal.getid_empleado()!=null && !presuproyectocuentaLocal.getid_empleado().equals(-1L))) {presuproyectocuentaBean.setid_empleado(presuproyectocuentaLocal.getid_empleado());}
			if(conDefault || (!conDefault && presuproyectocuentaLocal.getfecha()!=null && !presuproyectocuentaLocal.getfecha().equals(new Date()))) {presuproyectocuentaBean.setfecha(presuproyectocuentaLocal.getfecha());}
			if(conDefault || (!conDefault && presuproyectocuentaLocal.getvalor()!=null && !presuproyectocuentaLocal.getvalor().equals(0.0))) {presuproyectocuentaBean.setvalor(presuproyectocuentaLocal.getvalor());}
			if(conDefault || (!conDefault && presuproyectocuentaLocal.getorden()!=null && !presuproyectocuentaLocal.getorden().equals(0))) {presuproyectocuentaBean.setorden(presuproyectocuentaLocal.getorden());}
			if(conDefault || (!conDefault && presuproyectocuentaLocal.getid_presu_estado()!=null && !presuproyectocuentaLocal.getid_presu_estado().equals(-1L))) {presuproyectocuentaBean.setid_presu_estado(presuproyectocuentaLocal.getid_presu_estado());}
			if(conDefault || (!conDefault && presuproyectocuentaLocal.getdescripcion()!=null && !presuproyectocuentaLocal.getdescripcion().equals(""))) {presuproyectocuentaBean.setdescripcion(presuproyectocuentaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresuProyectoCuentaGenerico(Long idPresuProyectoCuentaSeleccionado,JComboBox jComboBoxPresuProyectoCuenta,List<PresuProyectoCuenta> presuproyectocuentasLocal)throws Exception {
		try {
			PresuProyectoCuenta  presuproyectocuentaTemp=null;

			for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentasLocal) {
				if(presuproyectocuentaAux.getId()!=null && presuproyectocuentaAux.getId().equals(idPresuProyectoCuentaSeleccionado)) {
					presuproyectocuentaTemp=presuproyectocuentaAux;
					break;
				}
			}

			jComboBoxPresuProyectoCuenta.setSelectedItem(presuproyectocuentaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresuProyectoCuentaGenerico(JComboBox jComboBoxPresuProyectoCuenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuProyectoCuenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresuProyectoCuenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuProyectoCuenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresuProyectoCuenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresuProyectoCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresuProyectoCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PresuAsignacion")) {
			jButtonPresuAsignacionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuproyectocuenta=(PresuProyectoCuenta) presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presuproyectocuenta =(PresuProyectoCuenta) presuproyectocuentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("PresuProyecto")) {
			//sDescripcion=this.getActualPresuProyectoForeignKeyDescripcion((Long)value);
			if(!presuproyectocuenta.getIsNew() && !presuproyectocuenta.getIsChanged() && !presuproyectocuenta.getIsDeleted()) {
				sDescripcion=presuproyectocuenta.getpresuproyecto_descripcion();
			} else {
				//sDescripcion=this.getActualPresuProyectoForeignKeyDescripcion((Long)value);
				sDescripcion=presuproyectocuenta.getpresuproyecto_descripcion();
			}
		}

		if(sTipo.equals("PresuTipoCuentaProyecto")) {
			//sDescripcion=this.getActualPresuTipoCuentaProyectoForeignKeyDescripcion((Long)value);
			if(!presuproyectocuenta.getIsNew() && !presuproyectocuenta.getIsChanged() && !presuproyectocuenta.getIsDeleted()) {
				sDescripcion=presuproyectocuenta.getpresutipocuentaproyecto_descripcion();
			} else {
				//sDescripcion=this.getActualPresuTipoCuentaProyectoForeignKeyDescripcion((Long)value);
				sDescripcion=presuproyectocuenta.getpresutipocuentaproyecto_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!presuproyectocuenta.getIsNew() && !presuproyectocuenta.getIsChanged() && !presuproyectocuenta.getIsDeleted()) {
				sDescripcion=presuproyectocuenta.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=presuproyectocuenta.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!presuproyectocuenta.getIsNew() && !presuproyectocuenta.getIsChanged() && !presuproyectocuenta.getIsDeleted()) {
				sDescripcion=presuproyectocuenta.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=presuproyectocuenta.getempleado_descripcion();
			}
		}

		if(sTipo.equals("PresuEstado")) {
			//sDescripcion=this.getActualPresuEstadoForeignKeyDescripcion((Long)value);
			if(!presuproyectocuenta.getIsNew() && !presuproyectocuenta.getIsChanged() && !presuproyectocuenta.getIsDeleted()) {
				sDescripcion=presuproyectocuenta.getpresuestado_descripcion();
			} else {
				//sDescripcion=this.getActualPresuEstadoForeignKeyDescripcion((Long)value);
				sDescripcion=presuproyectocuenta.getpresuestado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresuProyectoCuenta presuproyectocuentaRow=new PresuProyectoCuenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuproyectocuentaRow=(PresuProyectoCuenta) presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presuproyectocuentaRow=(PresuProyectoCuenta) presuproyectocuentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPresuAsignacionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PresuProyectoCuenta presuproyectocuenta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta = (PresuProyectoCuenta)this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.presuproyectocuenta = (PresuProyectoCuenta)this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(presuproyectocuenta!=null) {
						this.presuproyectocuenta = presuproyectocuenta;
					} else {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}
				}

				if(this.isTienePermisosPresuAsignacion && this.permiteMantenimiento(this.presuproyectocuenta)) {
					PresuAsignacionBeanSwingJInternalFrame presuasignacionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFramePopup=new PresuAsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						presuasignacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFramePopup;
					} else {
						presuasignacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame;
					}

					List<PresuProyectoCuenta> presuproyectocuentas=new ArrayList<PresuProyectoCuenta>();
					presuproyectocuentas.add(this.presuproyectocuenta);
					if(!esRelacionado) {
						//presuasignacionBeanSwingJInternalFrame.presuasignacionSessionBean.setConGuardarRelaciones(false);
						//presuasignacionBeanSwingJInternalFrame.presuasignacionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					presuasignacionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPresuProyectoCuenta.cargarPresuAsignacionBeanSwingJInternalFrame(presuproyectocuentas,this.presuproyectocuenta,presuasignacionBeanSwingJInternalFrame,/*conInicializar,*/presuasignacionBeanSwingJInternalFrame.presuasignacionSessionBean.getConGuardarRelaciones(),presuasignacionBeanSwingJInternalFrame.presuasignacionSessionBean.getEsGuardarRelacionado());
					presuasignacionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						presuasignacionBeanSwingJInternalFrame.actualizarEstadoPanelsPresuAsignacion("no_relacionado");

						presuasignacionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PresuAsignacionConstantesFunciones.ITAMANIOFILATABLA + (PresuAsignacionConstantesFunciones.ITAMANIOFILATABLA/2));

						presuasignacionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPresuProyectoCuenta=(TitledBorder)this.jScrollPanelDatosPresuProyectoCuenta.getBorder();
						TitledBorder titledBorderPresuAsignacion=(TitledBorder)presuasignacionBeanSwingJInternalFrame.jScrollPanelDatosPresuAsignacion.getBorder();

						titledBorderPresuAsignacion.setTitle(titledBorderPresuProyectoCuenta.getTitle() + " -> Asignacion Presupuesto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,presuasignacionBeanSwingJInternalFrame);
						}

						presuasignacionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(presuasignacionBeanSwingJInternalFrame);

						presuasignacionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Asignacion Presupuesto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresuProyectoCuenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaNuevoPresuProyectoCuenta && this.isPermisoNuevoPresuProyectoCuenta));			
			this.jButtonDuplicarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaDuplicarPresuProyectoCuenta && this.isPermisoDuplicarPresuProyectoCuenta));			
			this.jButtonCopiarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaCopiarPresuProyectoCuenta && this.isPermisoCopiarPresuProyectoCuenta));
			this.jButtonVerFormPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaVerFormPresuProyectoCuenta && this.isPermisoVerFormPresuProyectoCuenta));
			
			this.jButtonAbrirOrderByPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaOrdenPresuProyectoCuenta && this.isPermisoOrdenPresuProyectoCuenta));			
			
			this.jButtonNuevoRelacionesPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta && this.isPermisoNuevoPresuProyectoCuenta));			
			this.jButtonNuevoGuardarCambiosPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaNuevoPresuProyectoCuenta && this.isPermisoNuevoPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta));
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonModificarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaModificarPresuProyectoCuenta && this.isPermisoActualizarPresuProyectoCuenta));	
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonActualizarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaActualizarPresuProyectoCuenta && this.isPermisoActualizarPresuProyectoCuenta));	
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonEliminarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaEliminarPresuProyectoCuenta && this.isPermisoEliminarPresuProyectoCuenta));
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonCancelarPresuProyectoCuenta.setVisible(this.isVisibilidadCeldaCancelarPresuProyectoCuenta);							
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaGuardarPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaNuevoPresuProyectoCuenta && this.isPermisoNuevoPresuProyectoCuenta));						
			this.jButtonDuplicarToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaDuplicarPresuProyectoCuenta && this.isPermisoDuplicarPresuProyectoCuenta));						
			this.jButtonCopiarToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaCopiarPresuProyectoCuenta && this.isPermisoCopiarPresuProyectoCuenta));			
			this.jButtonVerFormToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaVerFormPresuProyectoCuenta && this.isPermisoVerFormPresuProyectoCuenta));			
			this.jButtonAbrirOrderByToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaOrdenPresuProyectoCuenta && this.isPermisoOrdenPresuProyectoCuenta));
			this.jButtonNuevoRelacionesToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta && this.isPermisoNuevoPresuProyectoCuenta));			
			this.jButtonNuevoGuardarCambiosToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaNuevoPresuProyectoCuenta && this.isPermisoNuevoPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta));			
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonModificarToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaModificarPresuProyectoCuenta && this.isPermisoActualizarPresuProyectoCuenta));	
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonActualizarToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaActualizarPresuProyectoCuenta  && this.isPermisoActualizarPresuProyectoCuenta));	
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonEliminarToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaEliminarPresuProyectoCuenta && this.isPermisoEliminarPresuProyectoCuenta));
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonCancelarToolBarPresuProyectoCuenta.setVisible(this.isVisibilidadCeldaCancelarPresuProyectoCuenta);				
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaGuardarPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaNuevoPresuProyectoCuenta && this.isPermisoNuevoPresuProyectoCuenta));			
			this.jMenuItemDuplicarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaDuplicarPresuProyectoCuenta && this.isPermisoDuplicarPresuProyectoCuenta));			
			this.jMenuItemCopiarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaCopiarPresuProyectoCuenta && this.isPermisoCopiarPresuProyectoCuenta));			
			this.jMenuItemVerFormPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaVerFormPresuProyectoCuenta && this.isPermisoVerFormPresuProyectoCuenta));			
			this.jMenuItemAbrirOrderByPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaOrdenPresuProyectoCuenta && this.isPermisoOrdenPresuProyectoCuenta));			
			//this.jMenuItemMostrarOcultarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaOrdenPresuProyectoCuenta && this.isPermisoOrdenPresuProyectoCuenta));
			this.jMenuItemDetalleAbrirOrderByPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaOrdenPresuProyectoCuenta && this.isPermisoOrdenPresuProyectoCuenta));			
			//this.jMenuItemDetalleMostrarOcultarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaOrdenPresuProyectoCuenta && this.isPermisoOrdenPresuProyectoCuenta));			
			this.jMenuItemNuevoRelacionesPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta && this.isPermisoNuevoPresuProyectoCuenta));			
			this.jMenuItemNuevoGuardarCambiosPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaNuevoPresuProyectoCuenta && this.isPermisoNuevoPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta));									
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemModificarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaModificarPresuProyectoCuenta && this.isPermisoActualizarPresuProyectoCuenta));	
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemActualizarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaActualizarPresuProyectoCuenta && this.isPermisoActualizarPresuProyectoCuenta));	
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemEliminarPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaEliminarPresuProyectoCuenta && this.isPermisoEliminarPresuProyectoCuenta));
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemCancelarPresuProyectoCuenta.setVisible(this.isVisibilidadCeldaCancelarPresuProyectoCuenta);				
			}
			
			this.jMenuItemGuardarCambiosPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaGuardarPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta));						
			this.jMenuItemGuardarCambiosTablaPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=this.jButtonNuevoPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaDuplicarPresuProyectoCuenta=this.jButtonDuplicarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaCopiarPresuProyectoCuenta=this.jButtonCopiarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaVerFormPresuProyectoCuenta=this.jButtonVerFormPresuProyectoCuenta.isVisible();
			
			this.isVisibilidadCeldaOrdenPresuProyectoCuenta=this.jButtonAbrirOrderByPresuProyectoCuenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=this.jButtonNuevoRelacionesPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaModificarPresuProyectoCuenta=this.jButtonModificarPresuProyectoCuenta.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonActualizarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonEliminarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaCancelarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonCancelarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaGuardarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosPresuProyectoCuenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=this.jButtonGuardarCambiosTablaPresuProyectoCuenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=this.jButtonNuevoToolBarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=this.jButtonNuevoRelacionesToolBarPresuProyectoCuenta.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			this.isVisibilidadCeldaModificarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonModificarToolBarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonActualizarToolBarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonEliminarToolBarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaCancelarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonCancelarToolBarPresuProyectoCuenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuProyectoCuenta=this.jButtonGuardarCambiosToolBarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=this.jButtonGuardarCambiosTablaToolBarPresuProyectoCuenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=this.jMenuItemNuevoPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=this.jMenuItemNuevoRelacionesPresuProyectoCuenta.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			this.isVisibilidadCeldaModificarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemModificarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemActualizarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemEliminarPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaCancelarPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemCancelarPresuProyectoCuenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuProyectoCuenta=this.jMenuItemGuardarCambiosPresuProyectoCuenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=this.jMenuItemGuardarCambiosTablaPresuProyectoCuenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresuProyectoCuenta(Boolean esInicializar) {
		if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
				//if(this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresuProyectoCuenta();
			}
			
			this.inicializarActualizarBindingBotonesManualPresuProyectoCuenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresuProyectoCuenta() {
		this.jButtonNuevoPresuProyectoCuenta.setVisible(this.isPermisoNuevoPresuProyectoCuenta);			
		this.jButtonDuplicarPresuProyectoCuenta.setVisible(this.isPermisoDuplicarPresuProyectoCuenta);			
		this.jButtonCopiarPresuProyectoCuenta.setVisible(this.isPermisoCopiarPresuProyectoCuenta);			
		this.jButtonVerFormPresuProyectoCuenta.setVisible(this.isPermisoVerFormPresuProyectoCuenta);			
		
		this.jButtonAbrirOrderByPresuProyectoCuenta.setVisible(this.isPermisoOrdenPresuProyectoCuenta);					
		
		this.jButtonNuevoRelacionesPresuProyectoCuenta.setVisible(this.isPermisoNuevoPresuProyectoCuenta);			
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonModificarPresuProyectoCuenta.setVisible(this.isPermisoActualizarPresuProyectoCuenta);	
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonActualizarPresuProyectoCuenta.setVisible(this.isPermisoActualizarPresuProyectoCuenta);	
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonEliminarPresuProyectoCuenta.setVisible(this.isPermisoEliminarPresuProyectoCuenta);
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonCancelarPresuProyectoCuenta.setVisible(this.isVisibilidadCeldaCancelarPresuProyectoCuenta);						
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosPresuProyectoCuenta.setVisible(this.isPermisoGuardarCambiosPresuProyectoCuenta);							
		}
		
		this.jButtonGuardarCambiosTablaPresuProyectoCuenta.setVisible(this.isPermisoActualizarPresuProyectoCuenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresuProyectoCuenta() {
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonModificarPresuProyectoCuenta.setVisible(this.isPermisoActualizarPresuProyectoCuenta);	
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonActualizarPresuProyectoCuenta.setVisible(this.isPermisoActualizarPresuProyectoCuenta);	
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonEliminarPresuProyectoCuenta.setVisible(this.isPermisoEliminarPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonCancelarPresuProyectoCuenta.setVisible(this.isVisibilidadCeldaCancelarPresuProyectoCuenta);							
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosPresuProyectoCuenta.setVisible((this.isVisibilidadCeldaGuardarPresuProyectoCuenta && this.isPermisoGuardarCambiosPresuProyectoCuenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresuProyectoCuenta() {
		if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresuProyectoCuenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresuProyectoCuenta() {
	}
	
	public void jTableDatosPresuProyectoCuentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresuProyectoCuenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presuproyectocuenta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_presu_proyectoPresuProyectoCuentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopresuproyecto=true;

			idTienePermisopresuproyecto=this.tienePermisosUsuarioEnPaginaWebPresuProyectoCuenta(PresuProyectoConstantesFunciones.CLASSNAME);

			if(idTienePermisopresuproyecto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuProyectoCuenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuProyectoCuenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);

				this.presuproyectoBeanSwingJInternalFrame=new PresuProyectoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.presuproyectoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.presuproyectoBeanSwingJInternalFrame.getPresuProyectoLogic().setConnexion(this.presuproyectocuentaLogic.getConnexion());

				if(this.presuproyectocuenta.getid_presu_proyecto()!=null) {
					this.presuproyectoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.presuproyectoBeanSwingJInternalFrame.setIdActual(this.presuproyectocuenta.getid_presu_proyecto());
					this.presuproyectoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.presuproyectoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.presuproyectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuProyecto();
				}

				JInternalFrameBase jinternalFrame =this.presuproyectoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuProyectoCuenta=(TitledBorder)this.jScrollPanelDatosPresuProyectoCuenta.getBorder();
				TitledBorder titledBorderpresuproyecto=(TitledBorder)this.presuproyectoBeanSwingJInternalFrame.jScrollPanelDatosPresuProyecto.getBorder();

				titledBorderpresuproyecto.setTitle(titledBorderPresuProyectoCuenta.getTitle() + " -> Proyecto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_presu_proyectoPresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getid_presu_proyecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_presu_proyecto = "+this.presuproyectocuenta.getid_presu_proyecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopresutipocuentaproyecto=true;

			idTienePermisopresutipocuentaproyecto=this.tienePermisosUsuarioEnPaginaWebPresuProyectoCuenta(PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);

			if(idTienePermisopresutipocuentaproyecto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuProyectoCuenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuProyectoCuenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);

				this.presutipocuentaproyectoBeanSwingJInternalFrame=new PresuTipoCuentaProyectoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.presutipocuentaproyectoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.presutipocuentaproyectoBeanSwingJInternalFrame.getPresuTipoCuentaProyectoLogic().setConnexion(this.presuproyectocuentaLogic.getConnexion());

				if(this.presuproyectocuenta.getid_presu_tipo_cuenta_proyecto()!=null) {
					this.presutipocuentaproyectoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.presutipocuentaproyectoBeanSwingJInternalFrame.setIdActual(this.presuproyectocuenta.getid_presu_tipo_cuenta_proyecto());
					this.presutipocuentaproyectoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.presutipocuentaproyectoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.presutipocuentaproyectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuTipoCuentaProyecto();
				}

				JInternalFrameBase jinternalFrame =this.presutipocuentaproyectoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuProyectoCuenta=(TitledBorder)this.jScrollPanelDatosPresuProyectoCuenta.getBorder();
				TitledBorder titledBorderpresutipocuentaproyecto=(TitledBorder)this.presutipocuentaproyectoBeanSwingJInternalFrame.jScrollPanelDatosPresuTipoCuentaProyecto.getBorder();

				titledBorderpresutipocuentaproyecto.setTitle(titledBorderPresuProyectoCuenta.getTitle() + " -> Tipo Cuenta Proyecto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getid_presu_tipo_cuenta_proyecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_presu_tipo_cuenta_proyecto = "+this.presuproyectocuenta.getid_presu_tipo_cuenta_proyecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.presuproyectocuenta.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.presuproyectocuenta.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contablePresuProyectoCuentaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="CuentaContable";

			if(!this.sFinalQueryGeneral_cuentacontable.equals("")) {
				this.cuentacontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontable);
				this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPresuProyectoCuenta=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosPresuProyectoCuenta.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPresuProyectoCuenta=(TitledBorder)this.jScrollPanelDatosPresuProyectoCuenta.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderPresuProyectoCuenta.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contablePresuProyectoCuentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebPresuProyectoCuenta(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuProyectoCuenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuProyectoCuenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.presuproyectocuentaLogic.getConnexion());

				if(this.presuproyectocuenta.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.presuproyectocuenta.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuProyectoCuenta=(TitledBorder)this.jScrollPanelDatosPresuProyectoCuenta.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderPresuProyectoCuenta.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contablePresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.presuproyectocuenta.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoPresuProyectoCuentaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderPresuProyectoCuenta=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosPresuProyectoCuenta.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPresuProyectoCuenta=(TitledBorder)this.jScrollPanelDatosPresuProyectoCuenta.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderPresuProyectoCuenta.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoPresuProyectoCuentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebPresuProyectoCuenta(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuProyectoCuenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuProyectoCuenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.presuproyectocuentaLogic.getConnexion());

				if(this.presuproyectocuenta.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.presuproyectocuenta.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuProyectoCuenta=(TitledBorder)this.jScrollPanelDatosPresuProyectoCuenta.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderPresuProyectoCuenta.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoPresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.presuproyectocuenta.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaPresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.presuproyectocuenta.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorPresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.presuproyectocuenta.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenPresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.presuproyectocuenta.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_presu_estadoPresuProyectoCuentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopresuestado=true;

			idTienePermisopresuestado=this.tienePermisosUsuarioEnPaginaWebPresuProyectoCuenta(PresuEstadoConstantesFunciones.CLASSNAME);

			if(idTienePermisopresuestado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuProyectoCuenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuProyectoCuenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);

				this.presuestadoBeanSwingJInternalFrame=new PresuEstadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.presuestadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.presuestadoBeanSwingJInternalFrame.getPresuEstadoLogic().setConnexion(this.presuproyectocuentaLogic.getConnexion());

				if(this.presuproyectocuenta.getid_presu_estado()!=null) {
					this.presuestadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.presuestadoBeanSwingJInternalFrame.setIdActual(this.presuproyectocuenta.getid_presu_estado());
					this.presuestadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.presuestadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.presuestadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuEstado();
				}

				JInternalFrameBase jinternalFrame =this.presuestadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuProyectoCuenta=(TitledBorder)this.jScrollPanelDatosPresuProyectoCuenta.getBorder();
				TitledBorder titledBorderpresuestado=(TitledBorder)this.presuestadoBeanSwingJInternalFrame.jScrollPanelDatosPresuEstado.getBorder();

				titledBorderpresuestado.setTitle(titledBorderPresuProyectoCuenta.getTitle() + " -> Estado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_presu_estadoPresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getid_presu_estado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_presu_estado = "+this.presuproyectocuenta.getid_presu_estado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPresuProyectoCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.getpresuproyectocuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyectocuenta==null) {
						this.presuproyectocuenta = new PresuProyectoCuenta();
					}

					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);
				}

				if(this.presuproyectocuenta.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.presuproyectocuenta.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyectoCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorProyectoPorCodigoPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);

			this.getPresuProyectoCuentasBusquedaPorProyectoPorCodigo();

			this.inicializarActualizarBindingPresuProyectoCuenta(false);

			//if(PresuProyectoCuentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorProyectoPorNombrePresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);

			this.getPresuProyectoCuentasBusquedaPorProyectoPorNombre();

			this.inicializarActualizarBindingPresuProyectoCuenta(false);

			//if(PresuProyectoCuentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContablePresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);

			this.getPresuProyectoCuentasFK_IdCuentaContable();

			this.inicializarActualizarBindingPresuProyectoCuenta(false);

			//if(PresuProyectoCuentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);

			this.getPresuProyectoCuentasFK_IdEmpleado();

			this.inicializarActualizarBindingPresuProyectoCuenta(false);

			//if(PresuProyectoCuentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPresuEstadoPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);

			this.getPresuProyectoCuentasFK_IdPresuEstado();

			this.inicializarActualizarBindingPresuProyectoCuenta(false);

			//if(PresuProyectoCuentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPresuProyectoPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);

			this.getPresuProyectoCuentasFK_IdPresuProyecto();

			this.inicializarActualizarBindingPresuProyectoCuenta(false);

			//if(PresuProyectoCuentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPresuTipoCuentaProyectoPresuProyectoCuentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);

			this.getPresuProyectoCuentasFK_IdPresuTipoCuentaProyecto();

			this.inicializarActualizarBindingPresuProyectoCuenta(false);

			//if(PresuProyectoCuentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectocuentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresuProyectoCuenta() {
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
		

		if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresuProyectoCuenta.dispose();
			this.jInternalFrameDetalleFormPresuProyectoCuenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta!=null) {
			this.jInternalFrameReporteDinamicoPresuProyectoCuenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresuProyectoCuenta.dispose();
			this.jInternalFrameReporteDinamicoPresuProyectoCuenta=null;
		}
		
		if(this.jInternalFrameImportacionPresuProyectoCuenta!=null) {
			this.jInternalFrameImportacionPresuProyectoCuenta.setVisible(false);	    			
			this.jInternalFrameImportacionPresuProyectoCuenta.dispose();
			this.jInternalFrameImportacionPresuProyectoCuenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresuProyectoCuenta();
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresuProyectoCuenta")) {
				jButtonNuevoPresuProyectoCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresuProyectoCuenta")) {
				jButtonDuplicarPresuProyectoCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresuProyectoCuenta")) {
				jButtonCopiarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresuProyectoCuenta")) {
				jButtonVerFormPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresuProyectoCuenta")) {
				jButtonNuevoPresuProyectoCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresuProyectoCuenta")) {
				jButtonDuplicarPresuProyectoCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresuProyectoCuenta")) {
				jButtonNuevoPresuProyectoCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresuProyectoCuenta")) {
				jButtonDuplicarPresuProyectoCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresuProyectoCuenta")) {
				jButtonNuevoPresuProyectoCuentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresuProyectoCuenta")) {
				jButtonNuevoPresuProyectoCuentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresuProyectoCuenta")) {
				jButtonNuevoPresuProyectoCuentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresuProyectoCuenta")) {
				jButtonModificarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresuProyectoCuenta")) {
				jButtonModificarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresuProyectoCuenta")) {
				jButtonModificarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresuProyectoCuenta")) {
				jButtonActualizarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresuProyectoCuenta")) {
				jButtonActualizarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresuProyectoCuenta")) {
				jButtonActualizarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresuProyectoCuenta")) {
				jButtonEliminarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresuProyectoCuenta")) {
				jButtonEliminarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresuProyectoCuenta")) {
				jButtonEliminarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresuProyectoCuenta")) {
				jButtonCancelarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresuProyectoCuenta")) {
				jButtonCancelarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresuProyectoCuenta")) {
				jButtonCancelarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresuProyectoCuenta")) {
				jButtonCerrarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresuProyectoCuenta")) {
				jButtonCerrarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresuProyectoCuenta")) {
				jButtonCerrarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresuProyectoCuenta")) {
				jButtonMostrarOcultarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresuProyectoCuenta")) {
				jButtonCancelarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresuProyectoCuenta")) {
				jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresuProyectoCuenta")) {
				jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresuProyectoCuenta")) {
				jButtonCopiarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresuProyectoCuenta")) {
				jButtonVerFormPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresuProyectoCuenta")) {
				jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresuProyectoCuenta")) {
				jButtonCopiarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresuProyectoCuenta")) {
				jButtonVerFormPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresuProyectoCuenta")) {
				jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresuProyectoCuenta")) {
				jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresuProyectoCuenta")) {
				jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresuProyectoCuenta")) {
				jButtonRecargarInformacionPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresuProyectoCuenta")) {
				jButtonRecargarInformacionPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresuProyectoCuenta")) {
				jButtonRecargarInformacionPresuProyectoCuentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresuProyectoCuenta")) {
				jButtonAnterioresPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresuProyectoCuenta")) {
				jButtonAnterioresPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresuProyectoCuenta")) {
				jButtonAnterioresPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresuProyectoCuenta")) {
				jButtonSiguientesPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresuProyectoCuenta")) {
				jButtonSiguientesPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresuProyectoCuenta")) {
				jButtonSiguientesPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresuProyectoCuenta") || sTipo.equals("MenuItemDetalleAbrirOrderByPresuProyectoCuenta")) {
				jButtonAbrirOrderByPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresuProyectoCuenta") || sTipo.equals("MenuItemDetalleMostrarOcultarPresuProyectoCuenta")) {
				jButtonMostrarOcultarPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresuProyectoCuenta")) {
				jButtonNuevoGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresuProyectoCuenta")) {
				jButtonNuevoGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresuProyectoCuenta")) {
				jButtonNuevoGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresuProyectoCuenta")) {
				jButtonCerrarReporteDinamicoPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresuProyectoCuenta")) {
				jButtonGenerarReporteDinamicoPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresuProyectoCuenta")) {
				
				jButtonGenerarExcelReporteDinamicoPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresuProyectoCuenta")) {
				jButtonCerrarImportacionPresuProyectoCuentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresuProyectoCuenta")) {
				
				jButtonGenerarImportacionPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresuProyectoCuenta")) {
				
				jButtonAbrirImportacionPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresuProyectoCuenta")) {
				jComboBoxTiposAccionesPresuProyectoCuentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresuProyectoCuenta")) {
				jComboBoxTiposRelacionesPresuProyectoCuentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresuProyectoCuenta")) {
				jComboBoxTiposAccionesPresuProyectoCuentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresuProyectoCuenta")) {
				
				jComboBoxTiposSeleccionarPresuProyectoCuentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresuProyectoCuenta")) {
				jTextFieldValorCampoGeneralPresuProyectoCuentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresuProyectoCuenta")) {
				jButtonAbrirOrderByPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresuProyectoCuenta")) {
				jButtonAbrirOrderByPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresuProyectoCuenta")) {
				jButtonCerrarOrderByPresuProyectoCuentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuProyectoCuentaBusqueda")) {
				this.jButtonidPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_proyectoPresuProyectoCuentaUpdate")) {
				this.jButtonid_presu_proyectoPresuProyectoCuentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_proyectoPresuProyectoCuentaBusqueda")) {
				this.jButtonid_presu_proyectoPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate")) {
				this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda")) {
				this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPresuProyectoCuentaBusqueda")) {
				this.jButtoncodigoPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresuProyectoCuentaBusqueda")) {
				this.jButtonnombrePresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuProyectoCuenta")) {
				this.jButtonid_cuenta_contablePresuProyectoCuentaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuProyectoCuentaArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuProyectoCuentaUpdate")) {
				this.jButtonid_cuenta_contablePresuProyectoCuentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuProyectoCuentaBusqueda")) {
				this.jButtonid_cuenta_contablePresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoPresuProyectoCuenta")) {
				this.jButtonid_empleadoPresuProyectoCuentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPresuProyectoCuentaUpdate")) {
				this.jButtonid_empleadoPresuProyectoCuentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPresuProyectoCuentaBusqueda")) {
				this.jButtonid_empleadoPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPresuProyectoCuentaBusqueda")) {
				this.jButtonfechaPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresuProyectoCuentaBusqueda")) {
				this.jButtonvalorPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenPresuProyectoCuentaBusqueda")) {
				this.jButtonordenPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_estadoPresuProyectoCuentaUpdate")) {
				this.jButtonid_presu_estadoPresuProyectoCuentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_estadoPresuProyectoCuentaBusqueda")) {
				this.jButtonid_presu_estadoPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPresuProyectoCuentaBusqueda")) {
				this.jButtondescripcionPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contablePresuProyectoCuenta")) {
				this.jButtonid_cuenta_contablePresuProyectoCuentaActionPerformed(evt);
			}
			else if(sTipo.equals("id_empleadoPresuProyectoCuenta")) {
				this.jButtonid_empleadoPresuProyectoCuentaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorProyectoPorCodigoPresuProyectoCuenta")) {
				this.jButtonBusquedaPorProyectoPorCodigoPresuProyectoCuentaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorProyectoPorNombrePresuProyectoCuenta")) {
				this.jButtonBusquedaPorProyectoPorNombrePresuProyectoCuentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContablePresuProyectoCuenta")) {
				this.jButtonFK_IdCuentaContablePresuProyectoCuentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoPresuProyectoCuenta")) {
				this.jButtonFK_IdEmpleadoPresuProyectoCuentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPresuEstadoPresuProyectoCuenta")) {
				this.jButtonFK_IdPresuEstadoPresuProyectoCuentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPresuProyectoPresuProyectoCuenta")) {
				this.jButtonFK_IdPresuProyectoPresuProyectoCuentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPresuTipoCuentaProyectoPresuProyectoCuenta")) {
				this.jButtonFK_IdPresuTipoCuentaProyectoPresuProyectoCuentaActionPerformed(evt);
			}
			
			;
			
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresuProyectoCuenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoCuentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				


				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyectoCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyectoCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresuProyectoCuenta presuproyectocuentaLocal=null;
			
			if(!this.getEsControlTabla()) {
				presuproyectocuentaLocal=this.presuproyectocuenta;
			} else {
				presuproyectocuentaLocal=this.presuproyectocuentaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
							
				
				


				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyectoCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyectoCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoCuentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
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
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
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
			
			


			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoCuentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
								
						
				


				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyectoCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyectoCuenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
								
				
				


				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyectoCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyectoCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoCuentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoCuentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoCuentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
							
				
				


				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyectoCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyectoCuenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoCuentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
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
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
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
			
			


			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoCuentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
								
				
				


				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyectoCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyectoCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoCuentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoCuentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoCuentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresuProyectoCuenta")) {
					jCheckBoxSeleccionarTodosPresuProyectoCuentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresuProyectoCuenta")) {
					jCheckBoxSeleccionadosPresuProyectoCuentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresuProyectoCuenta")) {
					
				}
				
				


				
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyectoCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyectoCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
												
				
				


				
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyectoCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyectoCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoCuentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoCuentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
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
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
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
			
			


			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoCuentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyectoCuenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyectoCuenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyectocuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyectocuenta);
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
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
				
				


				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyectoCuenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyectoCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoCuentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectocuentaAnterior =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresuProyectoCuenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresuProyectoCuentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresuProyectoCuenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presuproyectocuenta =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presuproyectocuenta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresuProyectoCuenta")) {
				
				}
				
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresuProyectoCuenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresuProyectoCuenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresuProyectoCuenta")) {
			
			}
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresuProyectoCuenta();
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
			if(sTipo.equals("NuevoPresuProyectoCuenta")) {
				jButtonNuevoPresuProyectoCuentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresuProyectoCuenta")) {
				jButtonDuplicarPresuProyectoCuentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresuProyectoCuenta")) {
				jButtonCopiarPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresuProyectoCuenta")) {
				jButtonVerFormPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresuProyectoCuenta")) {
				jButtonNuevoPresuProyectoCuentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresuProyectoCuenta")) {
				jButtonModificarPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresuProyectoCuenta")) {
				jButtonActualizarPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresuProyectoCuenta")) {
				jButtonEliminarPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresuProyectoCuenta")) {
				jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresuProyectoCuenta")) {
				jButtonCancelarPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresuProyectoCuenta")) {
				jButtonCerrarPresuProyectoCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresuProyectoCuenta")) {
				jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresuProyectoCuenta")) {
				jButtonNuevoGuardarCambiosPresuProyectoCuentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresuProyectoCuenta")) {
				jButtonAbrirOrderByPresuProyectoCuentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresuProyectoCuenta")) {
				jButtonRecargarInformacionPresuProyectoCuentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresuProyectoCuenta")) {
				jButtonAnterioresPresuProyectoCuentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresuProyectoCuenta")) {
				jButtonSiguientesPresuProyectoCuentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuProyectoCuentaBusqueda")) {
				this.jButtonidPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_proyectoPresuProyectoCuentaUpdate")) {
				this.jButtonid_presu_proyectoPresuProyectoCuentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_proyectoPresuProyectoCuentaBusqueda")) {
				this.jButtonid_presu_proyectoPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate")) {
				this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda")) {
				this.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPresuProyectoCuentaBusqueda")) {
				this.jButtoncodigoPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresuProyectoCuentaBusqueda")) {
				this.jButtonnombrePresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuProyectoCuenta")) {
				this.jButtonid_cuenta_contablePresuProyectoCuentaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuProyectoCuentaArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuProyectoCuentaUpdate")) {
				this.jButtonid_cuenta_contablePresuProyectoCuentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuProyectoCuentaBusqueda")) {
				this.jButtonid_cuenta_contablePresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoPresuProyectoCuenta")) {
				this.jButtonid_empleadoPresuProyectoCuentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPresuProyectoCuentaUpdate")) {
				this.jButtonid_empleadoPresuProyectoCuentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPresuProyectoCuentaBusqueda")) {
				this.jButtonid_empleadoPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPresuProyectoCuentaBusqueda")) {
				this.jButtonfechaPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresuProyectoCuentaBusqueda")) {
				this.jButtonvalorPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenPresuProyectoCuentaBusqueda")) {
				this.jButtonordenPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_estadoPresuProyectoCuentaUpdate")) {
				this.jButtonid_presu_estadoPresuProyectoCuentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_estadoPresuProyectoCuentaBusqueda")) {
				this.jButtonid_presu_estadoPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPresuProyectoCuentaBusqueda")) {
				this.jButtondescripcionPresuProyectoCuentaBusquedaActionPerformed(evt);
			}
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresuProyectoCuenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresuProyectoCuenta")) {
				closingInternalFramePresuProyectoCuenta();
				
			} else if(sTipo.equals("jButtonCancelarPresuProyectoCuenta")) {
				JInternalFrameBase jInternalFrameDetalleFormPresuProyectoCuenta = (JInternalFrameBase)evt.getSource();
	            	
	            PresuProyectoCuentaBeanSwingJInternalFrame jInternalFrameParent=(PresuProyectoCuentaBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuProyectoCuenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresuProyectoCuentaActionPerformed(null);
			}
			
			PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presuproyectocuenta,new Object(),this.presuproyectocuentaParameterGeneral,this.presuproyectocuentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresuProyectoCuenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresuProyectoCuenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresuProyectoCuenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presuproyectocuenta)) {
			if(!esControlTabla) {
				if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);			
				}
				
				if(this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presuproyectocuentaReturnGeneral=presuproyectocuentaLogic.procesarEventosPresuProyectoCuentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuproyectocuentaLogic.getPresuProyectoCuentas(),this.presuproyectocuenta,this.presuproyectocuentaParameterGeneral,this.isEsNuevoPresuProyectoCuenta,classes);//this.presuproyectocuentaLogic.getPresuProyectoCuenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresuProyectoCuenta(this.presuproyectocuentaReturnGeneral,this.presuproyectocuentaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresuProyectoCuenta(classes,this.presuproyectocuentaReturnGeneral,this.presuproyectocuentaBean,false);
					}
						
					if(this.presuproyectocuentaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresuProyectoCuenta(this.presuproyectocuentaReturnGeneral.getPresuProyectoCuenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresuProyectoCuenta(this.presuproyectocuentaReturnGeneral.getPresuProyectoCuenta());	
					}
						
					if(this.presuproyectocuentaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresuProyectoCuenta(this.presuproyectocuentaReturnGeneral.getPresuProyectoCuenta(),classes);//this.presuproyectocuentaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresuProyectoCuenta(this.presuproyectocuenta,classes);//this.presuproyectocuentaBean);									
				}
			
				if(PresuProyectoCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresuProyectoCuenta(this.presuproyectocuenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyectoCuenta(this.presuproyectocuenta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presuproyectocuentaAnterior!=null) {
						this.presuproyectocuenta=this.presuproyectocuentaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presuproyectocuentaReturnGeneral=presuproyectocuentaLogic.procesarEventosPresuProyectoCuentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuproyectocuentaLogic.getPresuProyectoCuentas(),this.presuproyectocuenta,this.presuproyectocuentaParameterGeneral,this.isEsNuevoPresuProyectoCuenta,classes);//this.presuproyectocuentaLogic.getPresuProyectoCuenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presuproyectocuentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presuproyectocuentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presuproyectocuentaReturnGeneral.getPresuProyectoCuenta(),presuproyectocuentaLogic.getPresuProyectoCuentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presuproyectocuentaReturnGeneral.getPresuProyectoCuenta(),this.presuproyectocuentas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresuProyectoCuenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresuProyectoCuenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresuProyectoCuenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresuProyectoCuenta() throws Exception {
		
		PresuProyectoCuentaModel presuproyectocuentaModel=(PresuProyectoCuentaModel)this.jTableDatosPresuProyectoCuenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuproyectocuentaModel.presuproyectocuentas=this.presuproyectocuentaLogic.getPresuProyectoCuentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presuproyectocuentaModel.presuproyectocuentas=this.presuproyectocuentas;
		}
		
		
		((PresuProyectoCuentaModel) this.jTableDatosPresuProyectoCuenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresuProyectoCuenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresuproyectocuentaAnterior(),this.presuproyectocuentaLogic.getPresuProyectoCuentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresuproyectocuentaAnterior(),this.presuproyectocuentas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresuProyectoCuenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PresuAsignacion.class)) {
					this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.setPresuAsignacions(presuproyectocuenta.getPresuAsignacions());
					this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuAsignacion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
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
										
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuproyectocuenta,new Object(),generalEntityParameterGeneral,this.presuproyectocuentaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresuProyectoCuentaConstantesFunciones.getClassesRelationshipsOfPresuProyectoCuenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresuProyectoCuentaConstantesFunciones.getClassesRelationshipsFromStringsOfPresuProyectoCuenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresuProyectoCuenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresuProyectoCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuproyectocuenta,new Object(),generalEntityParameterGeneral,this.presuproyectocuentaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresuProyectoCuenta(PresuProyectoCuentaBean presuproyectocuentaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PresuAsignacion.class)) {
					this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.setPresuAsignacions(presuproyectocuenta.getPresuAsignacions());
					this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuAsignacion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresuProyectoCuenta(ArrayList<Classe> classes,PresuProyectoCuentaReturnGeneral presuproyectocuentaReturnGeneral,PresuProyectoCuentaBean presuproyectocuentaBean,Boolean conDefault) throws Exception {
		
			this.presuproyectocuentaBean.setPresuAsignacions(presuproyectocuentaReturnGeneral.getPresuProyectoCuenta().getPresuAsignacions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PresuAsignacion.class)) {
					presuproyectocuenta.setPresuAsignacions(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.presuasignacionLogic.getPresuAsignacions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.presuproyectocuenta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta = new PresuProyectoCuentaDetalleFormJInternalFrame(jDesktopPane,this.presuproyectocuentaSessionBean.getConGuardarRelaciones(),this.presuproyectocuentaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.setVisible(false);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.presuproyectocuentaLogic=this.presuproyectocuentaLogic;
		
		this.cargarCombosFrameForeignKeyPresuProyectoCuenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresuProyectoCuenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuProyectoCuenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresuProyectoCuenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresuProyectoCuenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuProyectoCuenta"));
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonModificarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"ModificarPresuProyectoCuenta"));

		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonModificarToolBarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuProyectoCuenta"));
					
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemModificarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuProyectoCuenta"));		
		
		
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonActualizarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"ActualizarPresuProyectoCuenta"));
		
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonActualizarToolBarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuProyectoCuenta"));
						
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemActualizarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuProyectoCuenta"));		
		
		
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonEliminarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"EliminarPresuProyectoCuenta"));
		
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonEliminarToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuProyectoCuenta"));
								
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemEliminarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuProyectoCuenta"));		
		
		
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonCancelarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"CancelarPresuProyectoCuenta"));
		
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonCancelarToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuProyectoCuenta"));
					
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemCancelarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuProyectoCuenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemDetalleCerrarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuProyectoCuenta"));		
		
		
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuProyectoCuenta"));
		
		
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuProyectoCuenta"));
		
		
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuProyectoCuenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonidPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"idPresuProyectoCuentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_proyectoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuProyectoCuentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtoncodigoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonnombrePresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuProyectoCuentaBusqueda"));
		//jButtonid_cuenta_contablePresuProyectoCuenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contablePresuProyectoCuentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuenta"));
		//jButtonid_cuenta_contablePresuProyectoCuentaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuentaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuentaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuentaBusqueda"));
		//jButtonid_empleadoPresuProyectoCuenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPresuProyectoCuentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_empleadoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"id_empleadoPresuProyectoCuenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_empleadoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_empleadoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonfechaPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonvalorPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonordenPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"ordenPresuProyectoCuentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_estadoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_estadoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtondescripcionPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuProyectoCuentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jTabbedPaneRelacionesPresuProyectoCuenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuProyectoCuenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresuProyectoCuenta"));
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuProyectoCuenta"));
		}
		
		this.jTableDatosPresuProyectoCuenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresuProyectoCuenta"));
		
		this.jTableDatosPresuProyectoCuenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresuProyectoCuenta"));
		
		this.jButtonNuevoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"NuevoPresuProyectoCuenta"));
		
		this.jButtonDuplicarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"DuplicarPresuProyectoCuenta"));
		
		this.jButtonCopiarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"CopiarPresuProyectoCuenta"));
		
		this.jButtonVerFormPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"VerFormPresuProyectoCuenta"));
		
		
		this.jButtonNuevoToolBarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresuProyectoCuenta"));
			
		this.jButtonDuplicarToolBarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresuProyectoCuenta"));
			
		this.jMenuItemNuevoPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresuProyectoCuenta"));
			
		this.jMenuItemDuplicarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresuProyectoCuenta"));		
		
		
		this.jButtonNuevoRelacionesPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresuProyectoCuenta"));
		
		
		this.jButtonNuevoRelacionesToolBarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresuProyectoCuenta"));
			
		this.jMenuItemNuevoRelacionesPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresuProyectoCuenta"));		
		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonModificarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"ModificarPresuProyectoCuenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonModificarToolBarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuProyectoCuenta"));
			
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemModificarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuProyectoCuenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonActualizarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"ActualizarPresuProyectoCuenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonActualizarToolBarPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuProyectoCuenta"));
				
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemActualizarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuProyectoCuenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonEliminarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"EliminarPresuProyectoCuenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonEliminarToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuProyectoCuenta"));
						
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemEliminarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuProyectoCuenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonCancelarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"CancelarPresuProyectoCuenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonCancelarToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuProyectoCuenta"));
			
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemCancelarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuProyectoCuenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresuProyectoCuenta"));		
		
		
		this.jButtonCerrarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"CerrarPresuProyectoCuenta"));
		
		
		this.jButtonCerrarToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresuProyectoCuenta"));
			
		this.jMenuItemCerrarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresuProyectoCuenta"));
			
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jMenuItemDetalleCerrarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuProyectoCuenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresuProyectoCuenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuProyectoCuenta"));
		}
		
		this.jButtonCopiarToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresuProyectoCuenta"));
			
		this.jButtonVerFormToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresuProyectoCuenta"));
		
		this.jMenuItemGuardarCambiosPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresuProyectoCuenta"));
			
		this.jMenuItemCopiarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresuProyectoCuenta"));		
		
		this.jMenuItemVerFormPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresuProyectoCuenta"));		
		
		
		this.jButtonGuardarCambiosTablaPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuProyectoCuenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresuProyectoCuenta"));
			
		this.jMenuItemGuardarCambiosTablaPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuProyectoCuenta"));		
		
		
		
		this.jButtonRecargarInformacionPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresuProyectoCuenta"));
					
		this.jButtonRecargarInformacionToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresuProyectoCuenta"));
		
		this.jMenuItemRecargarInformacionPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresuProyectoCuenta"));		
		
		
		
		this.jButtonAnterioresPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"AnterioresPresuProyectoCuenta"));
		
		
		this.jButtonAnterioresToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresuProyectoCuenta"));
		
		this.jMenuItemAnterioresPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresuProyectoCuenta"));		
		
		
		this.jButtonSiguientesPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"SiguientesPresuProyectoCuenta"));
		
		
		this.jButtonSiguientesToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresuProyectoCuenta"));
			
		this.jMenuItemSiguientesPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresuProyectoCuenta"));
			
		this.jMenuItemAbrirOrderByPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresuProyectoCuenta"));
			
		this.jMenuItemMostrarOcultarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresuProyectoCuenta"));
			
		this.jMenuItemDetalleAbrirOrderByPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresuProyectoCuenta"));
			
		this.jMenuItemDetalleMostarOcultarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresuProyectoCuenta"));		
		
		
		this.jButtonNuevoGuardarCambiosPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresuProyectoCuenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresuProyectoCuenta"));
			
		this.jMenuItemNuevoGuardarCambiosPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresuProyectoCuenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresuProyectoCuenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresuProyectoCuenta"));

		this.jCheckBoxSeleccionadosPresuProyectoCuenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresuProyectoCuenta"));
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuProyectoCuenta"));
		}
		
		
		this.jComboBoxTiposRelacionesPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresuProyectoCuenta"));
			
		this.jComboBoxTiposAccionesPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"TiposAccionesPresuProyectoCuenta"));
					
		this.jComboBoxTiposSeleccionarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresuProyectoCuenta"));
			
		this.jTextFieldValorCampoGeneralPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresuProyectoCuenta"));		
		
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonidPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"idPresuProyectoCuentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_proyectoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuProyectoCuentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtoncodigoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonnombrePresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuProyectoCuentaBusqueda"));
		//jButtonid_cuenta_contablePresuProyectoCuenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contablePresuProyectoCuentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuenta"));
		//jButtonid_cuenta_contablePresuProyectoCuentaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuentaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuentaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuentaBusqueda"));
		//jButtonid_empleadoPresuProyectoCuenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPresuProyectoCuentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_empleadoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"id_empleadoPresuProyectoCuenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_empleadoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_empleadoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonfechaPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonvalorPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonordenPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"ordenPresuProyectoCuentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_estadoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_estadoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtondescripcionPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuProyectoCuentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorProyectoPorCodigoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"BusquedaPorProyectoPorCodigoPresuProyectoCuenta"));

			this.jButtonBusquedaPorProyectoPorNombrePresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"BusquedaPorProyectoPorNombrePresuProyectoCuenta"));

			this.jButtonFK_IdCuentaContablePresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContablePresuProyectoCuenta"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuenta"));

			this.jButtonFK_IdEmpleadoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPresuProyectoCuenta"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"id_empleadoPresuProyectoCuenta"));

			this.jButtonFK_IdPresuEstadoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"FK_IdPresuEstadoPresuProyectoCuenta"));

			this.jButtonFK_IdPresuProyectoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"FK_IdPresuProyectoPresuProyectoCuenta"));

			this.jButtonFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"FK_IdPresuTipoCuentaProyectoPresuProyectoCuenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresuProyectoCuenta!=null) {
				this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuProyectoCuenta"));
				this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuProyectoCuenta"));
				this.jInternalFrameReporteDinamicoPresuProyectoCuenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuProyectoCuenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuProyectoCuenta"));				
			//this.jButtonGenerarReporteDinamicoPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuProyectoCuenta"));
			//this.jButtonGenerarExcelReporteDinamicoPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuProyectoCuenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresuProyectoCuenta!=null) {
				this.jInternalFrameImportacionPresuProyectoCuenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuProyectoCuenta"));
				this.jInternalFrameImportacionPresuProyectoCuenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuProyectoCuenta"));
				this.jInternalFrameImportacionPresuProyectoCuenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuProyectoCuenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresuProyectoCuenta"));
			
			this.jButtonAbrirOrderByToolBarPresuProyectoCuenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresuProyectoCuenta"));			
			
			if(this.jInternalFrameOrderByPresuProyectoCuenta!=null) {
				this.jInternalFrameOrderByPresuProyectoCuenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuProyectoCuenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jTabbedPaneRelacionesPresuProyectoCuenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuProyectoCuenta"));
		
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
            		closingInternalFramePresuProyectoCuenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresuProyectoCuenta = (JInternalFrameBase)event.getSource();
	            	
	            PresuProyectoCuentaBeanSwingJInternalFrame jInternalFrameParent=(PresuProyectoCuentaBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuProyectoCuenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresuProyectoCuentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresuProyectoCuenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresuProyectoCuentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresuProyectoCuenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresuProyectoCuenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoCuentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoCuentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoCuentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresuProyectoCuenta";
		inputMap = this.jButtonNuevoPresuProyectoCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresuProyectoCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuProyectoCuentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoCuentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoCuentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoCuentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresuProyectoCuenta";
		inputMap = this.jButtonNuevoRelacionesPresuProyectoCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresuProyectoCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuProyectoCuentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresuProyectoCuenta";
		inputMap = this.jButtonModificarPresuProyectoCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresuProyectoCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresuProyectoCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresuProyectoCuenta";
		inputMap = this.jButtonActualizarPresuProyectoCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresuProyectoCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresuProyectoCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresuProyectoCuenta";
		inputMap = this.jButtonEliminarPresuProyectoCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresuProyectoCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresuProyectoCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresuProyectoCuenta";
		inputMap = this.jButtonCancelarPresuProyectoCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresuProyectoCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresuProyectoCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresuProyectoCuenta";
		inputMap = this.jButtonCerrarPresuProyectoCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresuProyectoCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresuProyectoCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresuProyectoCuenta";
		inputMap = this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosPresuProyectoCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonGuardarCambiosPresuProyectoCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresuProyectoCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresuProyectoCuenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresuProyectoCuentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresuProyectoCuenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresuProyectoCuentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresuProyectoCuenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresuProyectoCuentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresuProyectoCuenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresuProyectoCuentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonidPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"idPresuProyectoCuentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_proyectoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_proyectoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuProyectoCuentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_tipo_cuenta_proyectoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_tipo_cuenta_proyectoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtoncodigoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonnombrePresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuProyectoCuentaBusqueda"));
		//jButtonid_cuenta_contablePresuProyectoCuenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contablePresuProyectoCuentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuenta"));
		//jButtonid_cuenta_contablePresuProyectoCuentaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuentaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuentaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuentaBusqueda"));
		//jButtonid_empleadoPresuProyectoCuenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPresuProyectoCuentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_empleadoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"id_empleadoPresuProyectoCuenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_empleadoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_empleadoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonfechaPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonvalorPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonordenPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"ordenPresuProyectoCuentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_estadoPresuProyectoCuentaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoCuentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_presu_estadoPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtondescripcionPresuProyectoCuentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuProyectoCuentaBusqueda"));
		
		
		this.jButtonBusquedaPorProyectoPorCodigoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"BusquedaPorProyectoPorCodigoPresuProyectoCuenta"));

		this.jButtonBusquedaPorProyectoPorNombrePresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"BusquedaPorProyectoPorNombrePresuProyectoCuenta"));

		this.jButtonFK_IdCuentaContablePresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContablePresuProyectoCuenta"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuProyectoCuenta"));

		this.jButtonFK_IdEmpleadoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPresuProyectoCuenta"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"id_empleadoPresuProyectoCuenta"));

		this.jButtonFK_IdPresuEstadoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"FK_IdPresuEstadoPresuProyectoCuenta"));

		this.jButtonFK_IdPresuProyectoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"FK_IdPresuProyectoPresuProyectoCuenta"));

		this.jButtonFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta.addActionListener(new ButtonActionListener(this,"FK_IdPresuTipoCuentaProyectoPresuProyectoCuenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresuProyectoCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresuProyectoCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresuProyectoCuentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresuProyectoCuenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresuProyectoCuenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentaLogic.getPresuProyectoCuentas()) {
					presuproyectocuentaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentas) {
					presuproyectocuentaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresuProyectoCuentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentaLogic.getPresuProyectoCuentas()) {
						presuproyectocuentaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentas) {
						presuproyectocuentaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentaLogic.getPresuProyectoCuentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuProyectoCuenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuProyectoCuenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresuProyectoCuentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresuProyectoCuenta.getSelectedRows();
			
			PresuProyectoCuenta presuproyectocuentaLocal=new PresuProyectoCuenta();
			
			//this.seleccionarTodosPresuProyectoCuenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectocuentaLocal =(PresuProyectoCuenta) this.presuproyectocuentaLogic.getPresuProyectoCuentas().toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presuproyectocuentaLocal =(PresuProyectoCuenta) this.presuproyectocuentas.toArray()[this.jTableDatosPresuProyectoCuenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presuproyectocuentaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentaLogic.getPresuProyectoCuentas()) {
						presuproyectocuentaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentas) {
						presuproyectocuentaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuProyectoCuenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuProyectoCuenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoCuenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresuProyectoCuentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresuProyectoCuentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresuProyectoCuentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresuProyectoCuenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentaLogic.getPresuProyectoCuentas()) {
				
						if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							presuproyectocuentaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presuproyectocuentaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							presuproyectocuentaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presuproyectocuentaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							presuproyectocuentaAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							presuproyectocuentaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentas) {
					
						if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							presuproyectocuentaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presuproyectocuentaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							presuproyectocuentaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presuproyectocuentaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							presuproyectocuentaAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							presuproyectocuentaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresuProyectoCuentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresuProyectoCuenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresuProyectoCuenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresuProyectoCuenta) {				
					conSplash=true;//false;										
					
					//this.startProcessPresuProyectoCuenta(conSplash);
				
					this.generarReportePresuProyectoCuentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuProyectoCuenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresuProyectoCuentasSeleccionados();
				//this.jComboBoxTiposAccionesPresuProyectoCuenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuProyectoCuentasSeleccionados(false);
				//this.jComboBoxTiposAccionesPresuProyectoCuenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuProyectoCuentasSeleccionados(true);
				//this.jComboBoxTiposAccionesPresuProyectoCuenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuProyectoCuenta();
				
				this.exportarPresuProyectoCuentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuProyectoCuenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresuProyectoCuentas();
				//this.importarPresuProyectoCuentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuProyectoCuenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuProyectoCuenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresuProyectoCuentasSeleccionados();
				//this.jComboBoxTiposAccionesPresuProyectoCuenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cuenta Contable Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresuProyectoCuenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresuProyectoCuenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresuProyectoCuenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Contable Proyecto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuProyectoCuenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setSelectedIndex(0);					
				}	
			} 			
			else if(PresuProyectoCuentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresuProyectoCuenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresuProyectoCuenta(conSplash);
					
						//this.actualizarParametrosGeneralPresuProyectoCuenta();
						
						this.generarReporteProcesoAccionPresuProyectoCuentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresuProyectoCuenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresuProyectoCuentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cuenta Contable ProyectoES SELECCIONADOS?", "MANTENIMIENTO DE Cuenta Contable Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresuProyectoCuenta();
				
						this.actualizarParametrosGeneralPresuProyectoCuenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presuproyectocuentaReturnGeneral=presuproyectocuentaLogic.procesarAccionPresuProyectoCuentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presuproyectocuentaLogic.getPresuProyectoCuentas(),this.presuproyectocuentaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresuProyectoCuentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuProyectoCuenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresuProyectoCuenta();
					
					PresuProyectoCuentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresuProyectoCuentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuProyectoCuenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxTiposAccionesFormularioPresuProyectoCuenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresuProyectoCuenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresuProyectoCuentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresuProyectoCuenta();
			
			if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();		
			PresuProyectoCuenta presuproyectocuenta=new PresuProyectoCuenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresuProyectoCuenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresuProyectoCuenta.getSelectedItem();
			
			
			
			
			presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(presuproyectocuentasSeleccionados.size()==1) {
				for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentasSeleccionados) {
					presuproyectocuenta=presuproyectocuentaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Asignacion Presupuesto")) {
					jButtonPresuAsignacionActionPerformed(null,rowIndex,true,false,presuproyectocuenta);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresuProyectoCuenta();
			
      		//this.finishProcessPresuProyectoCuenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresuProyectoCuentaReturnGeneral() throws Exception {
		if(this.presuproyectocuentaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presuproyectocuentaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presuproyectocuentaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presuproyectocuentaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presuproyectocuentaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presuproyectocuentaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresuProyectoCuenta(false);
		}
		
		if(this.presuproyectocuentaReturnGeneral.getConRetornoLista() || this.presuproyectocuentaReturnGeneral.getConRetornoObjeto()) {
			if(this.presuproyectocuentaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presuproyectocuentaLogic.setPresuProyectoCuentas(this.presuproyectocuentaReturnGeneral.getPresuProyectoCuentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presuproyectocuentaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presuproyectocuentaLogic.setPresuProyectoCuenta(this.presuproyectocuentaReturnGeneral.getPresuProyectoCuenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresuProyectoCuenta(false);
		}
	}
	
	public void actualizarParametrosGeneralPresuProyectoCuenta() throws Exception {
		
		
	}
	
	public ArrayList<PresuProyectoCuenta> getPresuProyectoCuentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresuProyectoCuenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentaLogic.getPresuProyectoCuentas()) {
					if(presuproyectocuentaAux.getIsSelected()) {
						presuproyectocuentasSeleccionados.add(presuproyectocuentaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuProyectoCuenta presuproyectocuentaAux:this.presuproyectocuentas) {
					if(presuproyectocuentaAux.getIsSelected()) {
						presuproyectocuentasSeleccionados.add(presuproyectocuentaAux);				
					}
				}
			}
			
			if(presuproyectocuentasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presuproyectocuentasSeleccionados.addAll(this.presuproyectocuentaLogic.getPresuProyectoCuentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presuproyectocuentasSeleccionados.addAll(this.presuproyectocuentas);				
					}
				}
			}
		} else {
			presuproyectocuentasSeleccionados.add(this.presuproyectocuenta);
		}
		
		return presuproyectocuentasSeleccionados;
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
	
	public void generarReportePresuProyectoCuentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresuProyectoCuentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresuProyectoCuentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuProyectoCuentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuProyectoCuentasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPresuProyectoCuentasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cuenta Contable Proyecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresuProyectoCuentasSeleccionados() throws Exception {
		ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();		
		
		presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresuProyectoCuentas("Todos",presuproyectocuentasSeleccionados);
		
	}	
	
	public void generarReporteNormalPresuProyectoCuentasSeleccionados() throws Exception {
		ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();		
		
		presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresuProyectoCuentas("Todos",presuproyectocuentasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresuProyectoCuentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();
		
		presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresuProyectoCuentas("Todos",presuproyectocuentasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresuProyectoCuentasSeleccionados() throws Exception {
		ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresuProyectoCuenta();
		
		
		presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresuProyectoCuenta();
		
		
		//this.generarReportePresuProyectoCuentas("Todos",presuproyectocuentasSeleccionados ,presuproyectocuentaImplementable,presuproyectocuentaImplementableHome);
	}
	
	public void mostrarImportacionPresuProyectoCuentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresuProyectoCuenta();
		
		this.abrirFrameImportacionPresuProyectoCuenta();		
		
			
		//this.generarReportePresuProyectoCuentas("Todos",presuproyectocuentasSeleccionados ,presuproyectocuentaImplementable,presuproyectocuentaImplementableHome);
	}
	
	public void importarPresuProyectoCuentas() throws Exception {		
	
	}
	
	public void exportarPresuProyectoCuentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresuProyectoCuentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresuProyectoCuentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresuProyectoCuentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cuenta Contable Proyecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresuProyectoCuentasSeleccionados() throws Exception {
		ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();		
		
		presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyectocuenta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresuProyectoCuenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresuProyectoCuenta(presuproyectocuentaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presuproyectocuentaAux.setsDetalleGeneralEntityReporte(presuproyectocuentaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresuProyectoCuenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presuproyectocuenta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getpresuproyecto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getpresutipocuentaproyecto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getpresuestado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyectocuenta.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresuProyectoCuentasSeleccionados() throws Exception {
		ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();		
		
		presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyectocuenta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresuProyectoCuentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresuProyectoCuenta(row);				
				iRow++;
			}				
			
			for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresuProyectoCuenta(presuproyectocuentaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresuProyectoCuentasSeleccionados() throws Exception {
		ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();		
		
		presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyectocuenta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presuproyectocuentas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presuproyectocuenta");
			//elementRoot.appendChild(element);
		
			for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentasSeleccionados) {
				element = document.createElement("presuproyectocuenta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresuProyectoCuenta(presuproyectocuentaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresuProyectoCuenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getpresuproyecto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getpresutipocuentaproyecto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getorden());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getpresuestado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyectocuenta.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlPresuProyectoCuenta(PresuProyectoCuenta presuproyectocuenta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresuProyectoCuentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presuproyectocuenta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresuProyectoCuentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presuproyectocuenta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpresuproyecto_descripcion = document.createElement(PresuProyectoCuentaConstantesFunciones.IDPRESUPROYECTO);
		elementpresuproyecto_descripcion.appendChild(document.createTextNode(presuproyectocuenta.getpresuproyecto_descripcion()));
		element.appendChild(elementpresuproyecto_descripcion);

		Element elementpresutipocuentaproyecto_descripcion = document.createElement(PresuProyectoCuentaConstantesFunciones.IDPRESUTIPOCUENTAPROYECTO);
		elementpresutipocuentaproyecto_descripcion.appendChild(document.createTextNode(presuproyectocuenta.getpresutipocuentaproyecto_descripcion()));
		element.appendChild(elementpresutipocuentaproyecto_descripcion);

		Element elementcodigo = document.createElement(PresuProyectoCuentaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(presuproyectocuenta.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(PresuProyectoCuentaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(presuproyectocuenta.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcuentacontable_descripcion = document.createElement(PresuProyectoCuentaConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(presuproyectocuenta.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementempleado_descripcion = document.createElement(PresuProyectoCuentaConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(presuproyectocuenta.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementfecha = document.createElement(PresuProyectoCuentaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(presuproyectocuenta.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementvalor = document.createElement(PresuProyectoCuentaConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(presuproyectocuenta.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementorden = document.createElement(PresuProyectoCuentaConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(presuproyectocuenta.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementpresuestado_descripcion = document.createElement(PresuProyectoCuentaConstantesFunciones.IDPRESUESTADO);
		elementpresuestado_descripcion.appendChild(document.createTextNode(presuproyectocuenta.getpresuestado_descripcion()));
		element.appendChild(elementpresuestado_descripcion);

		Element elementdescripcion = document.createElement(PresuProyectoCuentaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(presuproyectocuenta.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoPresuProyectoCuentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados=new ArrayList<PresuProyectoCuenta>();
		
		presuproyectocuentasSeleccionados=this.getPresuProyectoCuentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresuProyectoCuenta(presuproyectocuentasSeleccionados);
		
		this.generarReportePresuProyectoCuentas("Todos",presuproyectocuentasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresuProyectoCuenta(ArrayList<PresuProyectoCuenta> presuproyectocuentasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresuProyectoCuenta presuproyectocuentaAux:presuproyectocuentasSeleccionados) {
				presuproyectocuentaAux.setsDetalleGeneralEntityReporte(presuproyectocuentaAux.toString());
			
				if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUPROYECTO)) {
					existe=true;
					presuproyectocuentaAux.setsDescripcionGeneralEntityReporte1(presuproyectocuentaAux.getpresuproyecto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUTIPOCUENTAPROYECTO)) {
					existe=true;
					presuproyectocuentaAux.setsDescripcionGeneralEntityReporte1(presuproyectocuentaAux.getpresutipocuentaproyecto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					presuproyectocuentaAux.setsDescripcionGeneralEntityReporte1(presuproyectocuentaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					presuproyectocuentaAux.setsDescripcionGeneralEntityReporte1(presuproyectocuentaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					presuproyectocuentaAux.setsDescripcionGeneralEntityReporte1(presuproyectocuentaAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					presuproyectocuentaAux.setsDescripcionGeneralEntityReporte1(presuproyectocuentaAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					presuproyectocuentaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(presuproyectocuentaAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					presuproyectocuentaAux.setsDescripcionGeneralEntityReporte1(presuproyectocuentaAux.getorden().toString());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_IDPRESUESTADO)) {
					existe=true;
					presuproyectocuentaAux.setsDescripcionGeneralEntityReporte1(presuproyectocuentaAux.getpresuestado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoCuentaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					presuproyectocuentaAux.setsDescripcionGeneralEntityReporte1(presuproyectocuentaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresuProyectoCuenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresuProyectoCuenta=true;
				this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=true;
				this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=true;
			}
			
			this.isVisibilidadCeldaModificarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaCancelarPresuProyectoCuenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=false;
			this.isVisibilidadCeldaModificarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=true;
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaCancelarPresuProyectoCuenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=false;
			this.isVisibilidadCeldaModificarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=true;
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=true;
			this.isVisibilidadCeldaCancelarPresuProyectoCuenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=false;
			this.isVisibilidadCeldaModificarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=true;
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaCancelarPresuProyectoCuenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=true;
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=true;
			this.isVisibilidadCeldaModificarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaCancelarPresuProyectoCuenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=false;
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaCancelarPresuProyectoCuenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=false;
			this.isVisibilidadCeldaModificarPresuProyectoCuenta=true;
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaCancelarPresuProyectoCuenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyectoCuenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresuProyectoCuentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=true;
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=true;
		} else {
			this.actualizarEstadoPanelsPresuProyectoCuenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresuProyectoCuenta=false;
			//this.isVisibilidadCeldaVerFormPresuProyectoCuenta=false;
			this.isVisibilidadCeldaDuplicarPresuProyectoCuenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presuproyectocuentaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=false;
		} else {
			this.isVisibilidadCeldaNuevoPresuProyectoCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
			if(!presuproyectocuentaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=false;												
			}
			
			this.jButtonCerrarPresuProyectoCuenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresuProyectoCuenta=false;
		}
		
		if(!this.permiteMantenimiento(this.presuproyectocuenta)) {
			this.isVisibilidadCeldaActualizarPresuProyectoCuenta=false;
			this.isVisibilidadCeldaEliminarPresuProyectoCuenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresuProyectoCuenta() {
		this.isVisibilidadCeldaNuevoPresuProyectoCuenta=false;
		this.isVisibilidadCeldaGuardarCambiosPresuProyectoCuenta=false;
	}
	
	public void actualizarEstadoPanelsPresuProyectoCuenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosEdicionPresuProyectoCuenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyectoCuenta!=null) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosPresuProyectoCuenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuProyectoCuenta!=null) {
				this.jPanelPaginacionPresuProyectoCuenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuProyectoCuenta!=null) {
				this.jPanelParametrosReportesPresuProyectoCuenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosEdicionPresuProyectoCuenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyectoCuenta!=null) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosPresuProyectoCuenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuProyectoCuenta!=null) {
				this.jPanelPaginacionPresuProyectoCuenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuProyectoCuenta!=null) {
				this.jPanelParametrosReportesPresuProyectoCuenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosEdicionPresuProyectoCuenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyectoCuenta!=null) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosPresuProyectoCuenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuProyectoCuenta!=null) {
				this.jPanelPaginacionPresuProyectoCuenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuProyectoCuenta!=null) {
				this.jPanelParametrosReportesPresuProyectoCuenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosEdicionPresuProyectoCuenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyectoCuenta!=null) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosPresuProyectoCuenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuProyectoCuenta!=null) {
				this.jPanelPaginacionPresuProyectoCuenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuProyectoCuenta!=null) {
				this.jPanelParametrosReportesPresuProyectoCuenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosEdicionPresuProyectoCuenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyectoCuenta!=null) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosPresuProyectoCuenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuProyectoCuenta!=null) {
				this.jPanelPaginacionPresuProyectoCuenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuProyectoCuenta!=null) {
				this.jPanelParametrosReportesPresuProyectoCuenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosEdicionPresuProyectoCuenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyectoCuenta!=null) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosPresuProyectoCuenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuProyectoCuenta!=null) {
				this.jPanelPaginacionPresuProyectoCuenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuProyectoCuenta!=null) {
				this.jPanelParametrosReportesPresuProyectoCuenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosEdicionPresuProyectoCuenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyectoCuenta!=null) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyectoCuenta!=null) {
				this.jScrollPanelDatosPresuProyectoCuenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuProyectoCuenta!=null) {
				this.jPanelPaginacionPresuProyectoCuenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuProyectoCuenta!=null) {
				this.jPanelParametrosReportesPresuProyectoCuenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresuProyectoCuenta!=null) {
					this.jTabbedPaneBusquedasPresuProyectoCuenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresuProyectoCuenta!=null) {
				this.jPanelParametrosReportesPresuProyectoCuenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presuproyectocuentaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyectoCuenta!=null) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresuProyectoCuenta!=null) {
				this.jPanelParametrosReportesPresuProyectoCuenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPresuProyecto(Boolean isParaPresuProyecto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPresuProyectoNegation=!isParaPresuProyecto;

			this.isVisibilidadBusquedaPorProyectoPorCodigo=isParaPresuProyecto;
			if(!this.isVisibilidadBusquedaPorProyectoPorCodigo) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta);}

			this.isVisibilidadBusquedaPorProyectoPorNombre=isParaPresuProyecto;
			if(!this.isVisibilidadBusquedaPorProyectoPorNombre) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta);}

			this.isVisibilidadFK_IdCuentaContable=isParaPresuProyectoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdCuentaContablePresuProyectoCuenta);}

			this.isVisibilidadFK_IdEmpleado=isParaPresuProyectoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdEmpleadoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuEstado=isParaPresuProyectoNegation;
			if(!this.isVisibilidadFK_IdPresuEstado) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuEstadoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuProyecto=isParaPresuProyecto;
			if(!this.isVisibilidadFK_IdPresuProyecto) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuProyectoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuTipoCuentaProyecto=isParaPresuProyectoNegation;
			if(!this.isVisibilidadFK_IdPresuTipoCuentaProyecto) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaPresuTipoCuentaProyecto(Boolean isParaPresuTipoCuentaProyecto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPresuTipoCuentaProyectoNegation=!isParaPresuTipoCuentaProyecto;

			this.isVisibilidadBusquedaPorProyectoPorCodigo=isParaPresuTipoCuentaProyectoNegation;
			if(!this.isVisibilidadBusquedaPorProyectoPorCodigo) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta);}

			this.isVisibilidadBusquedaPorProyectoPorNombre=isParaPresuTipoCuentaProyectoNegation;
			if(!this.isVisibilidadBusquedaPorProyectoPorNombre) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta);}

			this.isVisibilidadFK_IdCuentaContable=isParaPresuTipoCuentaProyectoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdCuentaContablePresuProyectoCuenta);}

			this.isVisibilidadFK_IdEmpleado=isParaPresuTipoCuentaProyectoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdEmpleadoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuEstado=isParaPresuTipoCuentaProyectoNegation;
			if(!this.isVisibilidadFK_IdPresuEstado) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuEstadoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuProyecto=isParaPresuTipoCuentaProyectoNegation;
			if(!this.isVisibilidadFK_IdPresuProyecto) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuProyectoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuTipoCuentaProyecto=isParaPresuTipoCuentaProyecto;
			if(!this.isVisibilidadFK_IdPresuTipoCuentaProyecto) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadBusquedaPorProyectoPorCodigo=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorProyectoPorCodigo) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta);}

			this.isVisibilidadBusquedaPorProyectoPorNombre=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorProyectoPorNombre) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdCuentaContablePresuProyectoCuenta);}

			this.isVisibilidadFK_IdEmpleado=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdEmpleadoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuEstado=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdPresuEstado) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuEstadoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuProyecto=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdPresuProyecto) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuProyectoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuTipoCuentaProyecto=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdPresuTipoCuentaProyecto) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadBusquedaPorProyectoPorCodigo=isParaEmpleadoNegation;
			if(!this.isVisibilidadBusquedaPorProyectoPorCodigo) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta);}

			this.isVisibilidadBusquedaPorProyectoPorNombre=isParaEmpleadoNegation;
			if(!this.isVisibilidadBusquedaPorProyectoPorNombre) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdCuentaContablePresuProyectoCuenta);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdEmpleadoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuEstado=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdPresuEstado) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuEstadoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuProyecto=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdPresuProyecto) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuProyectoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuTipoCuentaProyecto=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdPresuTipoCuentaProyecto) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaPresuEstado(Boolean isParaPresuEstado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPresuEstadoNegation=!isParaPresuEstado;

			this.isVisibilidadBusquedaPorProyectoPorCodigo=isParaPresuEstadoNegation;
			if(!this.isVisibilidadBusquedaPorProyectoPorCodigo) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta);}

			this.isVisibilidadBusquedaPorProyectoPorNombre=isParaPresuEstadoNegation;
			if(!this.isVisibilidadBusquedaPorProyectoPorNombre) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta);}

			this.isVisibilidadFK_IdCuentaContable=isParaPresuEstadoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdCuentaContablePresuProyectoCuenta);}

			this.isVisibilidadFK_IdEmpleado=isParaPresuEstadoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdEmpleadoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuEstado=isParaPresuEstado;
			if(!this.isVisibilidadFK_IdPresuEstado) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuEstadoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuProyecto=isParaPresuEstadoNegation;
			if(!this.isVisibilidadFK_IdPresuProyecto) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuProyectoPresuProyectoCuenta);}

			this.isVisibilidadFK_IdPresuTipoCuentaProyecto=isParaPresuEstadoNegation;
			if(!this.isVisibilidadFK_IdPresuTipoCuentaProyecto) {this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);}
		}
		
	}
	
	

	public String registrarSesionPresuProyectoCuentaParaPresuAsignaciones() throws Exception {
		Boolean isPaginaPopupPresuAsignacion=false;

		try {

			if(this.presuproyectocuentaSessionBean==null) {
				this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
			}

			if(this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionSessionBean==null) {
				this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionSessionBean=new PresuAsignacionSessionBean();
			}

			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionSessionBean.setsPathNavegacionActual(presuproyectocuentaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PresuAsignacionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPresuAsignacion=this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePresuAsignacion(true);
			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePresuAsignacion(PresuProyectoCuentaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionSessionBean.setisBusquedaDesdeForeignKeySesionPresuProyectoCuenta(true);
			this.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionSessionBean.setlidPresuProyectoCuentaActual(this.idPresuProyectoCuentaActual);

			presuproyectocuentaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuenta(true);
			presuproyectocuentaSessionBean.setlIdPresuProyectoCuentaActualForeignKey(this.idPresuProyectoCuentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionPresuProyectoCuentaParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(presuproyectocuentaSessionBean==null) {
				presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(presuproyectocuentaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.presuproyectocuentaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(PresuProyectoCuentaConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionPresuProyectoCuenta(true);
			//cuentacontableSessionBean.setlidPresuProyectoCuentaActual(this.idPresuProyectoCuentaActual);

			presuproyectocuentaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuenta(true);
			presuproyectocuentaSessionBean.setlIdPresuProyectoCuentaActualForeignKey(this.idPresuProyectoCuentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionPresuProyectoCuentaParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(presuproyectocuentaSessionBean==null) {
				presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(presuproyectocuentaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.presuproyectocuentaFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(PresuProyectoCuentaConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionPresuProyectoCuenta(true);
			//empleadoSessionBean.setlidPresuProyectoCuentaActual(this.idPresuProyectoCuentaActual);

			presuproyectocuentaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresuProyectoCuenta(true);
			presuproyectocuentaSessionBean.setlIdPresuProyectoCuentaActualForeignKey(this.idPresuProyectoCuentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresuProyectoCuentaSessionBean presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
		
		if(this.presuproyectocuentaSessionBean==null) {
			this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
		}
		
		this.presuproyectocuentaSessionBean.setsUltimaBusquedaPresuProyectoCuenta(this.getsAccionBusqueda());
		this.presuproyectocuentaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presuproyectocuentaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorProyectoPorCodigo")) {
			presuproyectocuentaSessionBean.setid_presu_proyecto(this.getid_presu_proyectoBusquedaPorProyectoPorCodigo());	
			presuproyectocuentaSessionBean.setcodigo(this.getcodigoBusquedaPorProyectoPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorProyectoPorNombre")) {
			presuproyectocuentaSessionBean.setid_presu_proyecto(this.getid_presu_proyectoBusquedaPorProyectoPorNombre());	
			presuproyectocuentaSessionBean.setnombre(this.getnombreBusquedaPorProyectoPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			presuproyectocuentaSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			presuproyectocuentaSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPresuEstado")) {
			presuproyectocuentaSessionBean.setid_presu_estado(this.getid_presu_estadoFK_IdPresuEstado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPresuProyecto")) {
			presuproyectocuentaSessionBean.setid_presu_proyecto(this.getid_presu_proyectoFK_IdPresuProyecto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPresuTipoCuentaProyecto")) {
			presuproyectocuentaSessionBean.setid_presu_tipo_cuenta_proyecto(this.getid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresuProyectoCuentaSessionBean presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
		
		if(this.presuproyectocuentaSessionBean==null) {
			this.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
		}
		
		if(this.presuproyectocuentaSessionBean.getsUltimaBusquedaPresuProyectoCuenta()!=null&&!this.presuproyectocuentaSessionBean.getsUltimaBusquedaPresuProyectoCuenta().equals("")) {
			this.setsAccionBusqueda(presuproyectocuentaSessionBean.getsUltimaBusquedaPresuProyectoCuenta());
			this.setiNumeroPaginacion(presuproyectocuentaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presuproyectocuentaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorProyectoPorCodigo")) {
				this.setid_presu_proyectoBusquedaPorProyectoPorCodigo(presuproyectocuentaSessionBean.getid_presu_proyecto());
				presuproyectocuentaSessionBean.setid_presu_proyecto(-1L);
				this.setcodigoBusquedaPorProyectoPorCodigo(presuproyectocuentaSessionBean.getcodigo());
				presuproyectocuentaSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorProyectoPorNombre")) {
				this.setid_presu_proyectoBusquedaPorProyectoPorNombre(presuproyectocuentaSessionBean.getid_presu_proyecto());
				presuproyectocuentaSessionBean.setid_presu_proyecto(-1L);
				this.setnombreBusquedaPorProyectoPorNombre(presuproyectocuentaSessionBean.getnombre());
				presuproyectocuentaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(presuproyectocuentaSessionBean.getid_cuenta_contable());
				presuproyectocuentaSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(presuproyectocuentaSessionBean.getid_empleado());
				presuproyectocuentaSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPresuEstado")) {
				this.setid_presu_estadoFK_IdPresuEstado(presuproyectocuentaSessionBean.getid_presu_estado());
				presuproyectocuentaSessionBean.setid_presu_estado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPresuProyecto")) {
				this.setid_presu_proyectoFK_IdPresuProyecto(presuproyectocuentaSessionBean.getid_presu_proyecto());
				presuproyectocuentaSessionBean.setid_presu_proyecto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPresuTipoCuentaProyecto")) {
				this.setid_presu_tipo_cuenta_proyectoFK_IdPresuTipoCuentaProyecto(presuproyectocuentaSessionBean.getid_presu_tipo_cuenta_proyecto());
				presuproyectocuentaSessionBean.setid_presu_tipo_cuenta_proyecto(-1L);
			}
		}
		
		this.presuproyectocuentaSessionBean.setsUltimaBusquedaPresuProyectoCuenta("");
		this.presuproyectocuentaSessionBean.setiNumeroPaginacion(PresuProyectoCuentaConstantesFunciones.INUMEROPAGINACION);
		this.presuproyectocuentaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresuProyectoCuenta() {
		this.updateBorderResaltarBusquedasFormularioPresuProyectoCuenta();
		this.updateVisibilidadBusquedasFormularioPresuProyectoCuenta();
		this.updateHabilitarBusquedasFormularioPresuProyectoCuenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresuProyectoCuenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponents().length>0) {
	

		if(this.presuproyectocuentaConstantesFunciones.resaltarBusquedaPorProyectoPorCodigoPresuProyectoCuenta!=null) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarBusquedaPorProyectoPorCodigoPresuProyectoCuenta);
			}
		}

		if(this.presuproyectocuentaConstantesFunciones.resaltarBusquedaPorProyectoPorNombrePresuProyectoCuenta!=null) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarBusquedaPorProyectoPorNombrePresuProyectoCuenta);
			}
		}

		if(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdCuentaContablePresuProyectoCuenta!=null) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdCuentaContablePresuProyectoCuenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdCuentaContablePresuProyectoCuenta);
			}
		}

		if(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdEmpleadoPresuProyectoCuenta!=null) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdEmpleadoPresuProyectoCuenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdEmpleadoPresuProyectoCuenta);
			}
		}

		if(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdPresuEstadoPresuProyectoCuenta!=null) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuEstadoPresuProyectoCuenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdPresuEstadoPresuProyectoCuenta);
			}
		}

		if(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdPresuProyectoPresuProyectoCuenta!=null) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuProyectoPresuProyectoCuenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdPresuProyectoPresuProyectoCuenta);
			}
		}

		if(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta!=null) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresuProyectoCuenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarBusquedaPorProyectoPorCodigoPresuProyectoCuenta);
			if(!this.presuproyectocuentaConstantesFunciones.mostrarBusquedaPorProyectoPorCodigoPresuProyectoCuenta && index>-1) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarBusquedaPorProyectoPorNombrePresuProyectoCuenta);
			if(!this.presuproyectocuentaConstantesFunciones.mostrarBusquedaPorProyectoPorNombrePresuProyectoCuenta && index>-1) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdCuentaContablePresuProyectoCuenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarFK_IdCuentaContablePresuProyectoCuenta);
			if(!this.presuproyectocuentaConstantesFunciones.mostrarFK_IdCuentaContablePresuProyectoCuenta && index>-1) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdEmpleadoPresuProyectoCuenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarFK_IdEmpleadoPresuProyectoCuenta);
			if(!this.presuproyectocuentaConstantesFunciones.mostrarFK_IdEmpleadoPresuProyectoCuenta && index>-1) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuEstadoPresuProyectoCuenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarFK_IdPresuEstadoPresuProyectoCuenta);
			if(!this.presuproyectocuentaConstantesFunciones.mostrarFK_IdPresuEstadoPresuProyectoCuenta && index>-1) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuProyectoPresuProyectoCuenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarFK_IdPresuProyectoPresuProyectoCuenta);
			if(!this.presuproyectocuentaConstantesFunciones.mostrarFK_IdPresuProyectoPresuProyectoCuenta && index>-1) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);
			if(!this.presuproyectocuentaConstantesFunciones.mostrarFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta && index>-1) {
				this.jTabbedPaneBusquedasPresuProyectoCuenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresuProyectoCuenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuproyectocuentaConstantesFunciones.activarBusquedaPorProyectoPorCodigoPresuProyectoCuenta);
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setEnabledAt(index,this.presuproyectocuentaConstantesFunciones.activarBusquedaPorProyectoPorCodigoPresuProyectoCuenta);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuproyectocuentaConstantesFunciones.activarBusquedaPorProyectoPorNombrePresuProyectoCuenta);
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setEnabledAt(index,this.presuproyectocuentaConstantesFunciones.activarBusquedaPorProyectoPorNombrePresuProyectoCuenta);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdCuentaContablePresuProyectoCuenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuproyectocuentaConstantesFunciones.activarFK_IdCuentaContablePresuProyectoCuenta);
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setEnabledAt(index,this.presuproyectocuentaConstantesFunciones.activarFK_IdCuentaContablePresuProyectoCuenta);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdEmpleadoPresuProyectoCuenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuproyectocuentaConstantesFunciones.activarFK_IdEmpleadoPresuProyectoCuenta);
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setEnabledAt(index,this.presuproyectocuentaConstantesFunciones.activarFK_IdEmpleadoPresuProyectoCuenta);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuEstadoPresuProyectoCuenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuproyectocuentaConstantesFunciones.activarFK_IdPresuEstadoPresuProyectoCuenta);
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setEnabledAt(index,this.presuproyectocuentaConstantesFunciones.activarFK_IdPresuEstadoPresuProyectoCuenta);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuProyectoPresuProyectoCuenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuproyectocuentaConstantesFunciones.activarFK_IdPresuProyectoPresuProyectoCuenta);
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setEnabledAt(index,this.presuproyectocuentaConstantesFunciones.activarFK_IdPresuProyectoPresuProyectoCuenta);
			}

			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuproyectocuentaConstantesFunciones.activarFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);
				this.jTabbedPaneBusquedasPresuProyectoCuenta.setEnabledAt(index,this.presuproyectocuentaConstantesFunciones.activarFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresuProyectoCuenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorProyectoPorCodigo")) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelBusquedaPorProyectoPorCodigoPresuProyectoCuenta);

			this.jTabbedPaneBusquedasPresuProyectoCuenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);

			this.presuproyectocuentaConstantesFunciones.setResaltarBusquedaPorProyectoPorCodigoPresuProyectoCuenta(resaltar);

			jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarBusquedaPorProyectoPorCodigoPresuProyectoCuenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorProyectoPorNombre")) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelBusquedaPorProyectoPorNombrePresuProyectoCuenta);

			this.jTabbedPaneBusquedasPresuProyectoCuenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);

			this.presuproyectocuentaConstantesFunciones.setResaltarBusquedaPorProyectoPorNombrePresuProyectoCuenta(resaltar);

			jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarBusquedaPorProyectoPorNombrePresuProyectoCuenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdCuentaContablePresuProyectoCuenta);

			this.jTabbedPaneBusquedasPresuProyectoCuenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);

			this.presuproyectocuentaConstantesFunciones.setResaltarFK_IdCuentaContablePresuProyectoCuenta(resaltar);

			jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdCuentaContablePresuProyectoCuenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdEmpleadoPresuProyectoCuenta);

			this.jTabbedPaneBusquedasPresuProyectoCuenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);

			this.presuproyectocuentaConstantesFunciones.setResaltarFK_IdEmpleadoPresuProyectoCuenta(resaltar);

			jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdEmpleadoPresuProyectoCuenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPresuEstado")) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuEstadoPresuProyectoCuenta);

			this.jTabbedPaneBusquedasPresuProyectoCuenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);

			this.presuproyectocuentaConstantesFunciones.setResaltarFK_IdPresuEstadoPresuProyectoCuenta(resaltar);

			jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdPresuEstadoPresuProyectoCuenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPresuProyecto")) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuProyectoPresuProyectoCuenta);

			this.jTabbedPaneBusquedasPresuProyectoCuenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);

			this.presuproyectocuentaConstantesFunciones.setResaltarFK_IdPresuProyectoPresuProyectoCuenta(resaltar);

			jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdPresuProyectoPresuProyectoCuenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPresuTipoCuentaProyecto")) {
			index= this.jTabbedPaneBusquedasPresuProyectoCuenta.indexOfComponent(this.jPanelFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);

			this.jTabbedPaneBusquedasPresuProyectoCuenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyectoCuenta.getComponent(index);

			this.presuproyectocuentaConstantesFunciones.setResaltarFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta(resaltar);

			jPanel.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarFK_IdPresuTipoCuentaProyectoPresuProyectoCuenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresuProyectoCuenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresuProyectoCuenta() throws Exception {

		if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresuProyectoCuenta();
		this.updateVisibilidadResaltarControlesFormularioPresuProyectoCuenta();
		this.updateHabilitarResaltarControlesFormularioPresuProyectoCuenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresuProyectoCuenta() throws Exception {
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presuproyectocuentaConstantesFunciones.resaltaridPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelidPresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltaridPresuProyectoCuenta);}
		if(this.presuproyectocuentaConstantesFunciones.resaltarid_presu_proyectoPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarid_presu_proyectoPresuProyectoCuenta);}
		if(this.presuproyectocuentaConstantesFunciones.resaltarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta);}
		if(this.presuproyectocuentaConstantesFunciones.resaltarcodigoPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldcodigoPresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarcodigoPresuProyectoCuenta);}
		if(this.presuproyectocuentaConstantesFunciones.resaltarnombrePresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreanombrePresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarnombrePresuProyectoCuenta);}
		if(this.presuproyectocuentaConstantesFunciones.resaltarid_cuenta_contablePresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarid_cuenta_contablePresuProyectoCuenta);}
		if(this.presuproyectocuentaConstantesFunciones.resaltarid_empleadoPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarid_empleadoPresuProyectoCuenta);}
		if(this.presuproyectocuentaConstantesFunciones.resaltarfechaPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jDateChooserfechaPresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarfechaPresuProyectoCuenta);}
		if(this.presuproyectocuentaConstantesFunciones.resaltarvalorPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldvalorPresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarvalorPresuProyectoCuenta);}
		if(this.presuproyectocuentaConstantesFunciones.resaltarordenPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldordenPresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarordenPresuProyectoCuenta);}
		if(this.presuproyectocuentaConstantesFunciones.resaltarid_presu_estadoPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltarid_presu_estadoPresuProyectoCuenta);}
		if(this.presuproyectocuentaConstantesFunciones.resaltardescripcionPresuProyectoCuenta!=null && this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreadescripcionPresuProyectoCuenta.setBorder(this.presuproyectocuentaConstantesFunciones.resaltardescripcionPresuProyectoCuenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresuProyectoCuenta() throws Exception {		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
	
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelidPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostraridPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelidPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostraridPresuProyectoCuenta);
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_presu_proyectoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelid_presu_proyectoPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_presu_proyectoPresuProyectoCuenta);
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta);
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldcodigoPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarcodigoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelcodigoPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarcodigoPresuProyectoCuenta);
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreanombrePresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarnombrePresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelnombrePresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarnombrePresuProyectoCuenta);
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_cuenta_contablePresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelid_cuenta_contablePresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_cuenta_contablePresuProyectoCuenta);
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_cuenta_contablePresuProyectoCuenta);
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_empleadoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelid_empleadoPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_empleadoPresuProyectoCuenta);
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_empleadoPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_empleadoPresuProyectoCuenta);
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jDateChooserfechaPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarfechaPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelfechaPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarfechaPresuProyectoCuenta);
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldvalorPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarvalorPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelvalorPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarvalorPresuProyectoCuenta);
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldordenPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarordenPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelordenPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarordenPresuProyectoCuenta);
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_presu_estadoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPanelid_presu_estadoPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrarid_presu_estadoPresuProyectoCuenta);
		//this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreadescripcionPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrardescripcionPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jPaneldescripcionPresuProyectoCuenta.setVisible(this.presuproyectocuentaConstantesFunciones.mostrardescripcionPresuProyectoCuenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresuProyectoCuenta() throws Exception {
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuProyectoCuenta!=null) {
	
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jLabelidPresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activaridPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_proyectoPresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarid_presu_proyectoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_tipo_cuenta_proyectoPresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarid_presu_tipo_cuenta_proyectoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldcodigoPresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarcodigoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreanombrePresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarnombrePresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_cuenta_contablePresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarid_cuenta_contablePresuProyectoCuenta);
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_cuenta_contablePresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarid_cuenta_contablePresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_empleadoPresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarid_empleadoPresuProyectoCuenta);
			this.jInternalFrameDetalleFormPresuProyectoCuenta.jButtonid_empleadoPresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarid_empleadoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jDateChooserfechaPresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarfechaPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldvalorPresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarvalorPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextFieldordenPresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarordenPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jComboBoxid_presu_estadoPresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activarid_presu_estadoPresuProyectoCuenta);
		this.jInternalFrameDetalleFormPresuProyectoCuenta.jTextAreadescripcionPresuProyectoCuenta.setEnabled(this.presuproyectocuentaConstantesFunciones.activardescripcionPresuProyectoCuenta);
		}
	}
	
		
}