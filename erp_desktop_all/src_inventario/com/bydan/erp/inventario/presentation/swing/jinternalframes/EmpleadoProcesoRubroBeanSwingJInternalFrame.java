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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.EmpleadoProcesoRubroConstantesFunciones;
import com.bydan.erp.inventario.util.EmpleadoProcesoRubroParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EmpleadoProcesoRubroParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EmpleadoProcesoRubroBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
public class EmpleadoProcesoRubroBeanSwingJInternalFrame extends EmpleadoProcesoRubroJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpleadoProcesoRubroBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpleadoProcesoRubro> empleadoprocesorubroValidator = new ClassValidator<EmpleadoProcesoRubro>(EmpleadoProcesoRubro.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpleadoProcesoRubro empleadoprocesorubro;	
	public EmpleadoProcesoRubro empleadoprocesorubroAux;
	public EmpleadoProcesoRubro empleadoprocesorubroAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpleadoProcesoRubro empleadoprocesorubroTotales;
	public Long idEmpleadoProcesoRubroActual;
	public Long iIdNuevoEmpleadoProcesoRubro=0L;
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
	
	public Boolean isPermisoTodoEmpleadoProcesoRubro;
	public Boolean isPermisoNuevoEmpleadoProcesoRubro;
	public Boolean isPermisoActualizarEmpleadoProcesoRubro;
	public Boolean isPermisoActualizarOriginalEmpleadoProcesoRubro;
	public Boolean isPermisoEliminarEmpleadoProcesoRubro;
	public Boolean isPermisoGuardarCambiosEmpleadoProcesoRubro;
	public Boolean isPermisoConsultaEmpleadoProcesoRubro;
	public Boolean isPermisoBusquedaEmpleadoProcesoRubro;
	public Boolean isPermisoReporteEmpleadoProcesoRubro;
	public Boolean isPermisoPaginacionMedioEmpleadoProcesoRubro;
	public Boolean isPermisoPaginacionAltoEmpleadoProcesoRubro;
	public Boolean isPermisoPaginacionTodoEmpleadoProcesoRubro;
	public Boolean isPermisoCopiarEmpleadoProcesoRubro;
	public Boolean isPermisoVerFormEmpleadoProcesoRubro;
	public Boolean isPermisoDuplicarEmpleadoProcesoRubro;
	public Boolean isPermisoOrdenEmpleadoProcesoRubro;
	
	
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
	
	public EmpleadoProcesoRubroParameterReturnGeneral empleadoprocesorubroReturnGeneral;
	public EmpleadoProcesoRubroParameterReturnGeneral empleadoprocesorubroParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpleadoProcesoRubro=false;
	public Boolean esParaAccionDesdeFormularioEmpleadoProcesoRubro=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpleadoProcesoRubroSessionBeanAdditional empleadoprocesorubroSessionBeanAdditional=null;
	
	public EmpleadoProcesoRubroSessionBeanAdditional getEmpleadoProcesoRubroSessionBeanAdditional() {
		return this.empleadoprocesorubroSessionBeanAdditional;
	}
	
	public void setEmpleadoProcesoRubroSessionBeanAdditional(EmpleadoProcesoRubroSessionBeanAdditional empleadoprocesorubroSessionBeanAdditional) {
		try {
			this.empleadoprocesorubroSessionBeanAdditional=empleadoprocesorubroSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional empleadoprocesorubroBeanSwingJInternalFrameAdditional=null;
	//public class EmpleadoProcesoRubroBeanSwingJInternalFrame
	
	public EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional getEmpleadoProcesoRubroBeanSwingJInternalFrameAdditional() {
		return this.empleadoprocesorubroBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpleadoProcesoRubroBeanSwingJInternalFrameAdditional(EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional empleadoprocesorubroBeanSwingJInternalFrameAdditional) {
		try {
			this.empleadoprocesorubroBeanSwingJInternalFrameAdditional=empleadoprocesorubroBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpleadoProcesoRubroLogic empleadoprocesorubroLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpleadoProcesoRubro empleadoprocesorubroBean;
	public EmpleadoProcesoRubroConstantesFunciones empleadoprocesorubroConstantesFunciones;
	//public EmpleadoProcesoRubroParameterReturnGeneral empleadoprocesorubroReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EstructuraLogic estructuraLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<EmpleadoProcesoRubro> empleadoprocesorubros;	
	//public List<EmpleadoProcesoRubro> empleadoprocesorubrosEliminados;
	//public List<EmpleadoProcesoRubro> empleadoprocesorubrosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpleadoProcesoRubro=false;
	public Boolean isVisibilidadCeldaDuplicarEmpleadoProcesoRubro=true;
	public Boolean isVisibilidadCeldaCopiarEmpleadoProcesoRubro=true;
	public Boolean isVisibilidadCeldaVerFormEmpleadoProcesoRubro=true;
	public Boolean isVisibilidadCeldaOrdenEmpleadoProcesoRubro=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=false;
	public Boolean isVisibilidadCeldaModificarEmpleadoProcesoRubro=false;
	public Boolean isVisibilidadCeldaActualizarEmpleadoProcesoRubro=false;
	public Boolean isVisibilidadCeldaEliminarEmpleadoProcesoRubro=false;
	public Boolean isVisibilidadCeldaCancelarEmpleadoProcesoRubro=false;
	public Boolean isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoEmpleadoProcesoRubro() {
		return this.iIdNuevoEmpleadoProcesoRubro;
	}

	public void setiIdNuevoEmpleadoProcesoRubro(Long iIdNuevoEmpleadoProcesoRubro) {
		this.iIdNuevoEmpleadoProcesoRubro = iIdNuevoEmpleadoProcesoRubro;
	}
	
	public Long getidEmpleadoProcesoRubroActual() {
		return this.idEmpleadoProcesoRubroActual;
	}

	public void setidEmpleadoProcesoRubroActual(Long idEmpleadoProcesoRubroActual) {
		this.idEmpleadoProcesoRubroActual = idEmpleadoProcesoRubroActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpleadoProcesoRubro getempleadoprocesorubro() {
		return this.empleadoprocesorubro;
	}

	public void setempleadoprocesorubro(EmpleadoProcesoRubro empleadoprocesorubro) {
		this.empleadoprocesorubro = empleadoprocesorubro;
	}
	
	public EmpleadoProcesoRubro getempleadoprocesorubroAux() {
		return this.empleadoprocesorubroAux;
	}

	public void setempleadoprocesorubroAux(EmpleadoProcesoRubro empleadoprocesorubroAux) {
		this.empleadoprocesorubroAux = empleadoprocesorubroAux;
	}				
	
	public EmpleadoProcesoRubro getempleadoprocesorubroAnterior() {
		return this.empleadoprocesorubroAnterior;
	}

	public void setempleadoprocesorubroAnterior(EmpleadoProcesoRubro empleadoprocesorubroAnterior) {
		this.empleadoprocesorubroAnterior = empleadoprocesorubroAnterior;
	}	
	
	public EmpleadoProcesoRubro getempleadoprocesorubroTotales() {
		return this.empleadoprocesorubroTotales;
	}

	public void setempleadoprocesorubroTotales(EmpleadoProcesoRubro empleadoprocesorubroTotales) {
		this.empleadoprocesorubroTotales = empleadoprocesorubroTotales;
	}	
	
	public EmpleadoProcesoRubro getempleadoprocesorubroBean() {
		return this.empleadoprocesorubroBean;
	}

	public void setempleadoprocesorubroBean(EmpleadoProcesoRubro empleadoprocesorubroBean) {
		this.empleadoprocesorubroBean = empleadoprocesorubroBean;
	}	
	
	public EmpleadoProcesoRubroParameterReturnGeneral getempleadoprocesorubroReturnGeneral() {
		return this.empleadoprocesorubroReturnGeneral;
	}

	public void setempleadoprocesorubroReturnGeneral(EmpleadoProcesoRubroParameterReturnGeneral empleadoprocesorubroReturnGeneral) {
		this.empleadoprocesorubroReturnGeneral = empleadoprocesorubroReturnGeneral;
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
	
	
	public EmpleadoProcesoRubroLogic getEmpleadoProcesoRubroLogic()	{		
		return empleadoprocesorubroLogic;
	}

	public void setEmpleadoProcesoRubroLogic(EmpleadoProcesoRubroLogic empleadoprocesorubroLogic) {
		this.empleadoprocesorubroLogic = empleadoprocesorubroLogic;
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
	
	public Boolean getIsEsNuevoEmpleadoProcesoRubro() {
		return isEsNuevoEmpleadoProcesoRubro;
	}

	public void setIsEsNuevoEmpleadoProcesoRubro(Boolean isEsNuevoEmpleadoProcesoRubro) {
		this.isEsNuevoEmpleadoProcesoRubro = isEsNuevoEmpleadoProcesoRubro;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpleadoProcesoRubro() {
		return esParaAccionDesdeFormularioEmpleadoProcesoRubro;
	}
	
	public void setEsParaAccionDesdeFormularioEmpleadoProcesoRubro(Boolean esParaAccionDesdeFormularioEmpleadoProcesoRubro) {
		this.esParaAccionDesdeFormularioEmpleadoProcesoRubro = esParaAccionDesdeFormularioEmpleadoProcesoRubro;
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

			if(this.empleadoprocesorubroSessionBean==null) {
				this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
			}

			if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(empleadoprocesorubroSessionBean.getlidEmpresaActual());
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

			if(this.empleadoprocesorubroSessionBean==null) {
				this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
			}

			if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(empleadoprocesorubroSessionBean.getlidSucursalActual());
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

			if(this.empleadoprocesorubroSessionBean==null) {
				this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
			}

			if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(empleadoprocesorubroSessionBean.getlidEstructuraActual());
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

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.empleadoprocesorubroSessionBean==null) {
				this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
			}

			if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(empleadoprocesorubroSessionBean.getlidEmpleadoActual());
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

					if(this.empleadoprocesorubro!=null) {
						this.empleadoprocesorubro.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
						this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpleadoProcesoRubro.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpleadoProcesoRubroGenerico)throws Exception
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
				jComboBoxid_empresaEmpleadoProcesoRubroGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpleadoProcesoRubroGenerico!=null && jComboBoxid_empresaEmpleadoProcesoRubroGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpleadoProcesoRubroGenerico.setSelectedIndex(0);
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

					if(this.empleadoprocesorubro!=null) {
						this.empleadoprocesorubro.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
						this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalEmpleadoProcesoRubro.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalEmpleadoProcesoRubroGenerico)throws Exception
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
				jComboBoxid_sucursalEmpleadoProcesoRubroGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalEmpleadoProcesoRubroGenerico!=null && jComboBoxid_sucursalEmpleadoProcesoRubroGenerico.getItemCount()>0) {
					jComboBoxid_sucursalEmpleadoProcesoRubroGenerico.setSelectedIndex(0);
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

					if(this.empleadoprocesorubro!=null) {
						this.empleadoprocesorubro.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
						this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraEmpleadoProcesoRubro.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro!=null) {
						jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraEmpleadoProcesoRubroGenerico)throws Exception
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
				jComboBoxid_estructuraEmpleadoProcesoRubroGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraEmpleadoProcesoRubroGenerico!=null && jComboBoxid_estructuraEmpleadoProcesoRubroGenerico.getItemCount()>0) {
					jComboBoxid_estructuraEmpleadoProcesoRubroGenerico.setSelectedIndex(0);
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

					if(this.empleadoprocesorubro!=null) {
						this.empleadoprocesorubro.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
						this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmpleadoProcesoRubro.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmpleadoProcesoRubroGenerico)throws Exception
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
				jComboBoxid_empleadoEmpleadoProcesoRubroGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmpleadoProcesoRubroGenerico!=null && jComboBoxid_empleadoEmpleadoProcesoRubroGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmpleadoProcesoRubroGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EmpleadoProcesoRubro empleadoprocesorubro,JComboBox jComboBoxid_empresaEmpleadoProcesoRubroGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpleadoProcesoRubroGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpleadoProcesoRubroGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empleadoprocesorubro.setid_empresa(empresaAux.getId());
				empleadoprocesorubro.setempresa_descripcion(EmpleadoProcesoRubroConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empleadoprocesorubro.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(EmpleadoProcesoRubro empleadoprocesorubro,JComboBox jComboBoxid_sucursalEmpleadoProcesoRubroGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalEmpleadoProcesoRubroGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalEmpleadoProcesoRubroGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				empleadoprocesorubro.setid_sucursal(sucursalAux.getId());
				empleadoprocesorubro.setsucursal_descripcion(EmpleadoProcesoRubroConstantesFunciones.getSucursalDescripcion(sucursalAux));
				empleadoprocesorubro.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(EmpleadoProcesoRubro empleadoprocesorubro,JComboBox jComboBoxid_estructuraEmpleadoProcesoRubroGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraEmpleadoProcesoRubroGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraEmpleadoProcesoRubroGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				empleadoprocesorubro.setid_estructura(estructuraAux.getId());
				empleadoprocesorubro.setestructura_descripcion(EmpleadoProcesoRubroConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				empleadoprocesorubro.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EmpleadoProcesoRubro empleadoprocesorubro,JComboBox jComboBoxid_empleadoEmpleadoProcesoRubroGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmpleadoProcesoRubroGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmpleadoProcesoRubroGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				empleadoprocesorubro.setid_empleado(empleadoAux.getId());
				empleadoprocesorubro.setempleado_descripcion(EmpleadoProcesoRubroConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				empleadoprocesorubro.setEmpleado(empleadoAux);			}
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

					if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { 
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { 
					}

					if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { 
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { 
					}

					if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { 
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { 
					}

					if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.addItem(estructura);
							}
						}

						if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { 
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { 
					}

					if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.addItem(empleado);
							}
						}

						if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpleadoProcesoRubro() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpleadoProcesoRubroConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoProcesoRubro(this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpleadoProcesoRubroConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoProcesoRubro(this.empleadoprocesorubros);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empleadoprocesorubroLogic.setEmpleadoProcesoRubros(this.empleadoprocesorubros);
			empleadoprocesorubroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpleadoProcesoRubroParameterReturnGeneral getEmpleadoProcesoRubroParameterGeneral() {
		return this.empleadoprocesorubroParameterGeneral;
	}
	
	public void setEmpleadoProcesoRubroParameterGeneral(EmpleadoProcesoRubroParameterReturnGeneral empleadoprocesorubroParameterGeneral) {
		this.empleadoprocesorubroParameterGeneral = empleadoprocesorubroParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpleadoProcesoRubro() {
		return isPermisoTodoEmpleadoProcesoRubro;
	}

	public void setIsPermisoTodoEmpleadoProcesoRubro(Boolean isPermisoTodoEmpleadoProcesoRubro) {
		this.isPermisoTodoEmpleadoProcesoRubro = isPermisoTodoEmpleadoProcesoRubro;
	}

	public Boolean getIsPermisoNuevoEmpleadoProcesoRubro() {
		return isPermisoNuevoEmpleadoProcesoRubro;
	}

	public void setIsPermisoNuevoEmpleadoProcesoRubro(Boolean isPermisoNuevoEmpleadoProcesoRubro) {
		this.isPermisoNuevoEmpleadoProcesoRubro = isPermisoNuevoEmpleadoProcesoRubro;
	}

	public Boolean getIsPermisoActualizarEmpleadoProcesoRubro() {
		return isPermisoActualizarEmpleadoProcesoRubro;
	}

	public void setIsPermisoActualizarEmpleadoProcesoRubro(Boolean isPermisoActualizarEmpleadoProcesoRubro) {
		this.isPermisoActualizarEmpleadoProcesoRubro = isPermisoActualizarEmpleadoProcesoRubro;
	}

	public Boolean getIsPermisoEliminarEmpleadoProcesoRubro() {
		return isPermisoEliminarEmpleadoProcesoRubro;
	}

	public void setIsPermisoEliminarEmpleadoProcesoRubro(Boolean isPermisoEliminarEmpleadoProcesoRubro) {
		this.isPermisoEliminarEmpleadoProcesoRubro = isPermisoEliminarEmpleadoProcesoRubro;
	}

	public Boolean getIsPermisoGuardarCambiosEmpleadoProcesoRubro() {
		return isPermisoGuardarCambiosEmpleadoProcesoRubro;
	}

	public void setIsPermisoGuardarCambiosEmpleadoProcesoRubro(Boolean isPermisoGuardarCambiosEmpleadoProcesoRubro) {
		this.isPermisoGuardarCambiosEmpleadoProcesoRubro = isPermisoGuardarCambiosEmpleadoProcesoRubro;
	}
	
	public Boolean getIsPermisoConsultaEmpleadoProcesoRubro() {
		return isPermisoConsultaEmpleadoProcesoRubro;
	}

	public void setIsPermisoConsultaEmpleadoProcesoRubro(Boolean isPermisoConsultaEmpleadoProcesoRubro) {
		this.isPermisoConsultaEmpleadoProcesoRubro = isPermisoConsultaEmpleadoProcesoRubro;
	}

	public Boolean getIsPermisoBusquedaEmpleadoProcesoRubro() {
		return isPermisoBusquedaEmpleadoProcesoRubro;
	}

	public void setIsPermisoBusquedaEmpleadoProcesoRubro(Boolean isPermisoBusquedaEmpleadoProcesoRubro) {
		this.isPermisoBusquedaEmpleadoProcesoRubro = isPermisoBusquedaEmpleadoProcesoRubro;
	}

	public Boolean getIsPermisoReporteEmpleadoProcesoRubro() {
		return isPermisoReporteEmpleadoProcesoRubro;
	}

	public void setIsPermisoReporteEmpleadoProcesoRubro(Boolean isPermisoReporteEmpleadoProcesoRubro) {
		this.isPermisoReporteEmpleadoProcesoRubro = isPermisoReporteEmpleadoProcesoRubro;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpleadoProcesoRubro() {
		return isPermisoPaginacionMedioEmpleadoProcesoRubro;
	}

	public void setIsPermisoPaginacionMedioEmpleadoProcesoRubro(Boolean isPermisoPaginacionMedioEmpleadoProcesoRubro) {
		this.isPermisoPaginacionMedioEmpleadoProcesoRubro = isPermisoPaginacionMedioEmpleadoProcesoRubro;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpleadoProcesoRubro() {
		return isPermisoPaginacionTodoEmpleadoProcesoRubro;
	}

	public void setIsPermisoPaginacionTodoEmpleadoProcesoRubro(Boolean isPermisoPaginacionTodoEmpleadoProcesoRubro) {
		this.isPermisoPaginacionTodoEmpleadoProcesoRubro = isPermisoPaginacionTodoEmpleadoProcesoRubro;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpleadoProcesoRubro() {
		return isPermisoPaginacionAltoEmpleadoProcesoRubro;
	}

	public void setIsPermisoPaginacionAltoEmpleadoProcesoRubro(Boolean isPermisoPaginacionAltoEmpleadoProcesoRubro) {
		this.isPermisoPaginacionAltoEmpleadoProcesoRubro = isPermisoPaginacionAltoEmpleadoProcesoRubro;
	}
	
	public Boolean getIsPermisoCopiarEmpleadoProcesoRubro() {
		return isPermisoCopiarEmpleadoProcesoRubro;
	}

	public void setIsPermisoCopiarEmpleadoProcesoRubro(Boolean isPermisoCopiarEmpleadoProcesoRubro) {
		this.isPermisoCopiarEmpleadoProcesoRubro = isPermisoCopiarEmpleadoProcesoRubro;
	}
	
	public Boolean getIsPermisoVerFormEmpleadoProcesoRubro() {
		return isPermisoVerFormEmpleadoProcesoRubro;
	}

	public void setIsPermisoVerFormEmpleadoProcesoRubro(Boolean isPermisoVerFormEmpleadoProcesoRubro) {
		this.isPermisoVerFormEmpleadoProcesoRubro = isPermisoVerFormEmpleadoProcesoRubro;
	}
	
	public Boolean getIsPermisoDuplicarEmpleadoProcesoRubro() {
		return isPermisoDuplicarEmpleadoProcesoRubro;
	}

	public void setIsPermisoDuplicarEmpleadoProcesoRubro(Boolean isPermisoDuplicarEmpleadoProcesoRubro) {
		this.isPermisoDuplicarEmpleadoProcesoRubro = isPermisoDuplicarEmpleadoProcesoRubro;
	}
	
	public Boolean getIsPermisoOrdenEmpleadoProcesoRubro() {
		return isPermisoOrdenEmpleadoProcesoRubro;
	}

	public void setIsPermisoOrdenEmpleadoProcesoRubro(Boolean isPermisoOrdenEmpleadoProcesoRubro) {
		this.isPermisoOrdenEmpleadoProcesoRubro = isPermisoOrdenEmpleadoProcesoRubro;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpleadoProcesoRubro() {
		return isVisibilidadCeldaNuevoEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaNuevoEmpleadoProcesoRubro(Boolean isVisibilidadCeldaNuevoEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro = isVisibilidadCeldaNuevoEmpleadoProcesoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpleadoProcesoRubro() {
		return isVisibilidadCeldaDuplicarEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaDuplicarEmpleadoProcesoRubro(Boolean isVisibilidadCeldaDuplicarEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaDuplicarEmpleadoProcesoRubro = isVisibilidadCeldaDuplicarEmpleadoProcesoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpleadoProcesoRubro() {
		return isVisibilidadCeldaCopiarEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaCopiarEmpleadoProcesoRubro(Boolean isVisibilidadCeldaCopiarEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaCopiarEmpleadoProcesoRubro = isVisibilidadCeldaCopiarEmpleadoProcesoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpleadoProcesoRubro() {
		return isVisibilidadCeldaVerFormEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaVerFormEmpleadoProcesoRubro(Boolean isVisibilidadCeldaVerFormEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaVerFormEmpleadoProcesoRubro = isVisibilidadCeldaVerFormEmpleadoProcesoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpleadoProcesoRubro() {
		return isVisibilidadCeldaOrdenEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaOrdenEmpleadoProcesoRubro(Boolean isVisibilidadCeldaOrdenEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaOrdenEmpleadoProcesoRubro = isVisibilidadCeldaOrdenEmpleadoProcesoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro() {
		return isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro(Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro = isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpleadoProcesoRubro() {
		return isVisibilidadCeldaModificarEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaModificarEmpleadoProcesoRubro(Boolean isVisibilidadCeldaModificarEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaModificarEmpleadoProcesoRubro = isVisibilidadCeldaModificarEmpleadoProcesoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpleadoProcesoRubro() {
		return isVisibilidadCeldaActualizarEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaActualizarEmpleadoProcesoRubro(Boolean isVisibilidadCeldaActualizarEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro = isVisibilidadCeldaActualizarEmpleadoProcesoRubro;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpleadoProcesoRubro() {
		return isVisibilidadCeldaEliminarEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaEliminarEmpleadoProcesoRubro(Boolean isVisibilidadCeldaEliminarEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro = isVisibilidadCeldaEliminarEmpleadoProcesoRubro;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpleadoProcesoRubro() {
		return isVisibilidadCeldaCancelarEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaCancelarEmpleadoProcesoRubro(Boolean isVisibilidadCeldaCancelarEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro = isVisibilidadCeldaCancelarEmpleadoProcesoRubro;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpleadoProcesoRubro() {
		return isVisibilidadCeldaGuardarEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaGuardarEmpleadoProcesoRubro(Boolean isVisibilidadCeldaGuardarEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro = isVisibilidadCeldaGuardarEmpleadoProcesoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro() {
		return isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro(Boolean isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro) {
		this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro = isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro;
	}
		
	public EmpleadoProcesoRubroSessionBean getempleadoprocesorubroSessionBean() {
		return this.empleadoprocesorubroSessionBean;
	}
	
	public void setempleadoprocesorubroSessionBean(EmpleadoProcesoRubroSessionBean empleadoprocesorubroSessionBean) {
		this.empleadoprocesorubroSessionBean=empleadoprocesorubroSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empleadoprocesorubro,null);
				this.setActualParaGuardarSucursalForeignKey(empleadoprocesorubro,null);
				this.setActualParaGuardarEstructuraForeignKey(empleadoprocesorubro,null);
				this.setActualParaGuardarEmpleadoForeignKey(empleadoprocesorubro,null);
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
	
	public void bugActualizarReferenciaActual(EmpleadoProcesoRubro empleadoprocesorubro,EmpleadoProcesoRubro empleadoprocesorubroAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpleadoProcesoRubro(empleadoprocesorubro);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empleadoprocesorubroAux.setId(empleadoprocesorubro.getId());
		empleadoprocesorubroAux.setVersionRow(empleadoprocesorubro.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpleadoProcesoRubro();
		
			int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empleadoprocesorubroValidator.getInvalidValues(this.empleadoprocesorubro);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empleadoprocesorubroLogic.setDatosCliente(datosCliente);
			empleadoprocesorubroLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empleadoprocesorubroAux=new  EmpleadoProcesoRubro();
				
				empleadoprocesorubroAux.setIsNew(true);
				empleadoprocesorubroAux.setIsChanged(true);
				
				empleadoprocesorubroAux.setEmpleadoProcesoRubroOriginal(this.empleadoprocesorubro);
				
				empleadoprocesorubroAux.setId(this.empleadoprocesorubro.getId());	
				empleadoprocesorubroAux.setVersionRow(this.empleadoprocesorubro.getVersionRow());	
				empleadoprocesorubroAux.setid_empresa(this.empleadoprocesorubro.getid_empresa());	
				empleadoprocesorubroAux.setid_sucursal(this.empleadoprocesorubro.getid_sucursal());	
				empleadoprocesorubroAux.setid_estructura(this.empleadoprocesorubro.getid_estructura());	
				empleadoprocesorubroAux.setid_empleado(this.empleadoprocesorubro.getid_empleado());	
				empleadoprocesorubroAux.setfecha_ingreso(this.empleadoprocesorubro.getfecha_ingreso());	
				empleadoprocesorubroAux.setfecha_salida(this.empleadoprocesorubro.getfecha_salida());	
				empleadoprocesorubroAux.setobservaciones(this.empleadoprocesorubro.getobservaciones());	
				empleadoprocesorubroAux.setnumeros_reingreso(this.empleadoprocesorubro.getnumeros_reingreso());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empleadoprocesorubroAux,empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoprocesorubroAux,empleadoprocesorubros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubroLogic.saveEmpleadoProcesoRubros();//WithConnection
						//empleadoprocesorubroLogic.getSetVersionRowEmpleadoProcesoRubros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoprocesorubro,empleadoprocesorubroAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoProcesoRubro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoprocesorubroLogic.saveEmpleadoProcesoRubroRelaciones(empleadoprocesorubroAux);//WithConnection
								//empleadoprocesorubroLogic.getSetVersionRowEmpleadoProcesoRubros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoprocesorubro,empleadoprocesorubroAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoprocesorubroAux,empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoprocesorubroAux,empleadoprocesorubros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoprocesorubro,empleadoprocesorubroAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empleadoprocesorubroAux=new  EmpleadoProcesoRubro();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() 
					|| (this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() && this.empleadoprocesorubro.getId()>=0)) {
						
					empleadoprocesorubroAux.setIsNew(false);
				}
				
				empleadoprocesorubroAux.setIsDeleted(false);
			
				empleadoprocesorubroAux.setId(this.empleadoprocesorubro.getId());	
				empleadoprocesorubroAux.setVersionRow(this.empleadoprocesorubro.getVersionRow());	
				empleadoprocesorubroAux.setid_empresa(this.empleadoprocesorubro.getid_empresa());	
				empleadoprocesorubroAux.setid_sucursal(this.empleadoprocesorubro.getid_sucursal());	
				empleadoprocesorubroAux.setid_estructura(this.empleadoprocesorubro.getid_estructura());	
				empleadoprocesorubroAux.setid_empleado(this.empleadoprocesorubro.getid_empleado());	
				empleadoprocesorubroAux.setfecha_ingreso(this.empleadoprocesorubro.getfecha_ingreso());	
				empleadoprocesorubroAux.setfecha_salida(this.empleadoprocesorubro.getfecha_salida());	
				empleadoprocesorubroAux.setobservaciones(this.empleadoprocesorubro.getobservaciones());	
				empleadoprocesorubroAux.setnumeros_reingreso(this.empleadoprocesorubro.getnumeros_reingreso());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoprocesorubroAux,empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoprocesorubroAux,empleadoprocesorubros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubroLogic.saveEmpleadoProcesoRubros();//WithConnection
						//empleadoprocesorubroLogic.getSetVersionRowEmpleadoProcesoRubros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoprocesorubro,empleadoprocesorubroAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoProcesoRubro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoprocesorubroLogic.saveEmpleadoProcesoRubroRelaciones(empleadoprocesorubroAux);//WithConnection
								//empleadoprocesorubroLogic.getSetVersionRowEmpleadoProcesoRubros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoprocesorubro,empleadoprocesorubroAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoprocesorubroAux,empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoprocesorubroAux,empleadoprocesorubros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoprocesorubro,empleadoprocesorubroAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empleadoprocesorubroAux=new  EmpleadoProcesoRubro();
				
				empleadoprocesorubroAux.setIsNew(false);
				empleadoprocesorubroAux.setIsChanged(false);
				
				empleadoprocesorubroAux.setIsDeleted(true);
				
				empleadoprocesorubroAux.setId(this.empleadoprocesorubro.getId());	
				empleadoprocesorubroAux.setVersionRow(this.empleadoprocesorubro.getVersionRow());	
				empleadoprocesorubroAux.setid_empresa(this.empleadoprocesorubro.getid_empresa());	
				empleadoprocesorubroAux.setid_sucursal(this.empleadoprocesorubro.getid_sucursal());	
				empleadoprocesorubroAux.setid_estructura(this.empleadoprocesorubro.getid_estructura());	
				empleadoprocesorubroAux.setid_empleado(this.empleadoprocesorubro.getid_empleado());	
				empleadoprocesorubroAux.setfecha_ingreso(this.empleadoprocesorubro.getfecha_ingreso());	
				empleadoprocesorubroAux.setfecha_salida(this.empleadoprocesorubro.getfecha_salida());	
				empleadoprocesorubroAux.setobservaciones(this.empleadoprocesorubro.getobservaciones());	
				empleadoprocesorubroAux.setnumeros_reingreso(this.empleadoprocesorubro.getnumeros_reingreso());	
				
				if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empleadoprocesorubroAux.getId()>=0) {	
						this.empleadoprocesorubrosEliminados.add(empleadoprocesorubroAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empleadoprocesorubroAux,empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoprocesorubroAux,empleadoprocesorubros);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubroLogic.saveEmpleadoProcesoRubros();//WithConnection
						//empleadoprocesorubroLogic.getSetVersionRowEmpleadoProcesoRubros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoprocesorubroLogic.saveEmpleadoProcesoRubroRelaciones(empleadoprocesorubroAux);//WithConnection
								//empleadoprocesorubroLogic.getSetVersionRowEmpleadoProcesoRubros();//WithConnection
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
							if(this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empleadoprocesorubroAux,empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empleadoprocesorubroAux,empleadoprocesorubros);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().addAll(this.empleadoprocesorubrosEliminados);
					
					empleadoprocesorubroLogic.saveEmpleadoProcesoRubros();//WithConnection
					//empleadoprocesorubroLogic.getSetVersionRowEmpleadoProcesoRubros();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpleadoProcesoRubro();
				
				this.empleadoprocesorubrosEliminados= new ArrayList<EmpleadoProcesoRubro>();		
			}
			
			if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empleado Proceso Rubro GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Proceso Rubro",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empleadoprocesorubro=empleadoprocesorubroAux;
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
      		//this.finishProcessEmpleadoProcesoRubro();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpleadoProcesoRubro empleadoprocesorubroLocal) throws Exception {
		
		if(this.empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpleadoProcesoRubro empleadoprocesorubroLocal) throws Exception {	
		if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empleadoprocesorubroLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				empleadoprocesorubroLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				empleadoprocesorubroLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				empleadoprocesorubroLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpleadoProcesoRubroActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empleadoprocesorubroValidator.getInvalidValues(this.empleadoprocesorubro);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpleadoProcesoRubro empleadoprocesorubro,List<EmpleadoProcesoRubro> empleadoprocesorubros) throws Exception {
		try	{		
			EmpleadoProcesoRubroConstantesFunciones.actualizarLista(empleadoprocesorubro,empleadoprocesorubros,this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpleadoProcesoRubro empleadoprocesorubro,List<EmpleadoProcesoRubro> empleadoprocesorubros) throws Exception {
		try	{			
			EmpleadoProcesoRubroConstantesFunciones.actualizarSelectedLista(empleadoprocesorubro,empleadoprocesorubros);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpleadoProcesoRubro> empleadoprocesorubrosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empleadoprocesorubrosLocal=this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empleadoprocesorubrosLocal=this.empleadoprocesorubros;
			}
			//ARCHITECTURE
		
			for(EmpleadoProcesoRubro empleadoprocesorubroLocal:empleadoprocesorubrosLocal) {
				if(this.permiteMantenimiento(empleadoprocesorubroLocal) && empleadoprocesorubroLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpleadoProcesoRubroConstantesFunciones.getEmpleadoProcesoRubroLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpleadoProcesoRubroConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelid_empresaEmpleadoProcesoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoProcesoRubroConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelid_sucursalEmpleadoProcesoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoProcesoRubroConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelid_estructuraEmpleadoProcesoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoProcesoRubroConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelid_empleadoEmpleadoProcesoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoProcesoRubroConstantesFunciones.FECHAINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelfecha_ingresoEmpleadoProcesoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoProcesoRubroConstantesFunciones.FECHASALIDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelfecha_salidaEmpleadoProcesoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoProcesoRubroConstantesFunciones.OBSERVACIONES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelobservacionesEmpleadoProcesoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoProcesoRubroConstantesFunciones.NUMEROSREINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelnumeros_reingresoEmpleadoProcesoRubro,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelid_empresaEmpleadoProcesoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelid_sucursalEmpleadoProcesoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelid_estructuraEmpleadoProcesoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelid_empleadoEmpleadoProcesoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelfecha_ingresoEmpleadoProcesoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelfecha_salidaEmpleadoProcesoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelobservacionesEmpleadoProcesoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelnumeros_reingresoEmpleadoProcesoRubro,"");
		
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
		this.iIdNuevoEmpleadoProcesoRubro--;	
		
		
		this.empleadoprocesorubroAux=new EmpleadoProcesoRubro();
		
		this.empleadoprocesorubroAux.setId(this.iIdNuevoEmpleadoProcesoRubro);
		this.empleadoprocesorubroAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().add(this.empleadoprocesorubroAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empleadoprocesorubros.add(this.empleadoprocesorubroAux);
		}
		//ARCHITECTURE
		
		this.empleadoprocesorubro=this.empleadoprocesorubroAux;
		
		if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpleadoProcesoRubro(this.empleadoprocesorubro);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoProcesoRubro(this.empleadoprocesorubro);
		}
				
		//this.setDefaultControlesEmpleadoProcesoRubro();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpleadoProcesoRubro();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpleadoProcesoRubro();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoProcesoRubro();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubroBean,this.empleadoprocesorubro,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
			classes=EmpleadoProcesoRubroConstantesFunciones.getClassesRelationshipsOfEmpleadoProcesoRubro(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empleadoprocesorubroReturnGeneral=empleadoprocesorubroLogic.procesarEventosEmpleadoProcesoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros(),this.empleadoprocesorubro,this.empleadoprocesorubroParameterGeneral,this.isEsNuevoEmpleadoProcesoRubro,classes);//this.empleadoprocesorubroLogic.getEmpleadoProcesoRubro()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpleadoProcesoRubro(this.empleadoprocesorubroReturnGeneral,this.empleadoprocesorubroBean,false);
		
		if(this.empleadoprocesorubroReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoProcesoRubro(this.empleadoprocesorubroReturnGeneral.getEmpleadoProcesoRubro());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpleadoProcesoRubro(this.empleadoprocesorubroReturnGeneral.getEmpleadoProcesoRubro());
		}
		
		if(this.empleadoprocesorubroReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpleadoProcesoRubro(this.empleadoprocesorubroReturnGeneral.getEmpleadoProcesoRubro(),classes);//this.empleadoprocesorubroBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpleadoProcesoRubro();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpleadoProcesoRubro();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.RecargarFormEmpleadoProcesoRubro(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
						
			if(empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoProcesoRubro();
			}
			
			this.actualizarVisualTableDatosEmpleadoProcesoRubro();
			
			this.jTableDatosEmpleadoProcesoRubro.setRowSelectionInterval(this.getIndiceNuevoEmpleadoProcesoRubro(), this.getIndiceNuevoEmpleadoProcesoRubro());
			
			this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
						
			this.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpleadoProcesoRubro(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_ingresoEmpleadoProcesoRubro.setEnabled(isHabilitar && this.empleadoprocesorubroConstantesFunciones.activarfecha_ingresoEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_salidaEmpleadoProcesoRubro.setEnabled(isHabilitar && this.empleadoprocesorubroConstantesFunciones.activarfecha_salidaEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextAreaobservacionesEmpleadoProcesoRubro.setEnabled(isHabilitar && this.empleadoprocesorubroConstantesFunciones.activarobservacionesEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setEnabled(isHabilitar && this.empleadoprocesorubroConstantesFunciones.activarnumeros_reingresoEmpleadoProcesoRubro);	
		//
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.setEnabled(isHabilitar && this.empleadoprocesorubroConstantesFunciones.activarid_empresaEmpleadoProcesoRubro);//
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.setEnabled(isHabilitar && this.empleadoprocesorubroConstantesFunciones.activarid_sucursalEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.setEnabled(isHabilitar && this.empleadoprocesorubroConstantesFunciones.activarid_estructuraEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.setEnabled(isHabilitar && this.empleadoprocesorubroConstantesFunciones.activarid_empleadoEmpleadoProcesoRubro);
	};
	
	public void setDefaultControlesEmpleadoProcesoRubro() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpleadoProcesoRubro(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empleadoprocesorubroSessionBean.setConGuardarRelaciones(true);			
			this.empleadoprocesorubroSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTabbedPaneRelacionesEmpleadoProcesoRubro.setVisible(true);
			
					
		} else {
			//this.empleadoprocesorubroSessionBean.setConGuardarRelaciones(false);			
			this.empleadoprocesorubroSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTabbedPaneRelacionesEmpleadoProcesoRubro.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpleadoProcesoRubro() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
				if(empleadoprocesorubroAux.getId().equals(this.iIdNuevoEmpleadoProcesoRubro)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubros) {
				if(empleadoprocesorubroAux.getId().equals(this.iIdNuevoEmpleadoProcesoRubro)) {
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
	
	public int getIndiceActualEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
				if(empleadoprocesorubroAux.getId().equals(empleadoprocesorubro.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubros) {
				if(empleadoprocesorubroAux.getId().equals(empleadoprocesorubro.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubroOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
				if(empleadoprocesorubroAux.getEmpleadoProcesoRubroOriginal().getId().equals(empleadoprocesorubroOriginal.getId())) {
					existe=true;
					empleadoprocesorubroOriginal.setId(empleadoprocesorubroAux.getId());
					empleadoprocesorubroOriginal.setVersionRow(empleadoprocesorubroAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubros) {
				if(empleadoprocesorubroAux.getEmpleadoProcesoRubroOriginal().getId().equals(empleadoprocesorubroOriginal.getId())) {
					existe=true;
					empleadoprocesorubroOriginal.setId(empleadoprocesorubroAux.getId());
					empleadoprocesorubroOriginal.setVersionRow(empleadoprocesorubroAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpleadoProcesoRubro(Boolean esParaCancelar) throws Exception {
		empleadoprocesorubrosAux=new ArrayList<EmpleadoProcesoRubro>();
		empleadoprocesorubroAux=new EmpleadoProcesoRubro();
		
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
					if(empleadoprocesorubroAux.getId()<0) {
						empleadoprocesorubrosAux.add(empleadoprocesorubroAux);
					}		
				}
				this.iIdNuevoEmpleadoProcesoRubro=0L;
				this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().removeAll(empleadoprocesorubrosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubros) {
					if(empleadoprocesorubroAux.getId()<0) {
						empleadoprocesorubrosAux.add(empleadoprocesorubroAux);
					}		
				}
				this.iIdNuevoEmpleadoProcesoRubro=0L;
				this.empleadoprocesorubros.removeAll(empleadoprocesorubrosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpleadoProcesoRubro 
					&& this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size()>0
					) {
					empleadoprocesorubroAux=this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().get(this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size() - 1);
				
					if(empleadoprocesorubroAux.getId()<0) {
						this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().remove(empleadoprocesorubroAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpleadoProcesoRubro && this.empleadoprocesorubros.size()>0) {
					empleadoprocesorubroAux=this.empleadoprocesorubros.get(this.empleadoprocesorubros.size() - 1);
				
					if(empleadoprocesorubroAux.getId()<0) {
						this.empleadoprocesorubros.remove(empleadoprocesorubroAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpleadoProcesoRubro(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empleadoprocesorubro.getId()<0) {
				this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().remove(this.empleadoprocesorubro);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empleadoprocesorubro.getId()<0) {
				this.empleadoprocesorubros.remove(this.empleadoprocesorubro);
			}
		}			
	}
	
	public void setEstadosInicialesEmpleadoProcesoRubro(List<EmpleadoProcesoRubro> empleadoprocesorubrosAux) throws Exception {
		EmpleadoProcesoRubroConstantesFunciones.setEstadosInicialesEmpleadoProcesoRubro(empleadoprocesorubrosAux);
	}
	
	public void setEstadosInicialesEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubroAux) throws Exception {
		EmpleadoProcesoRubroConstantesFunciones.setEstadosInicialesEmpleadoProcesoRubro(empleadoprocesorubroAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpleadoProcesoRubroActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpleadoProcesoRubroActual()) {
				if(!this.isEsNuevoEmpleadoProcesoRubro) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpleadoProcesoRubro=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpleadoProcesoRubroActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empleado Proceso Rubro ?", "MANTENIMIENTO DE Empleado Proceso Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpleadoProcesoRubro empleadoprocesorubro) throws Exception {
		EmpleadoProcesoRubroConstantesFunciones.seleccionarAsignar(this.empleadoprocesorubro,empleadoprocesorubro);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpleadoProcesoRubro=this.isPermisoActualizarOriginalEmpleadoProcesoRubro;
			
			
			this.seleccionarAsignar(empleadoprocesorubro);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoProcesoRubroConstantesFunciones.quitarEspaciosEmpleadoProcesoRubro(this.empleadoprocesorubro,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empleadoprocesorubroSessionBean.setsFuncionBusquedaRapida(this.empleadoprocesorubroSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEmpleadoProcesoRubro) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpleadoProcesoRubro(esParaCancelar);				
				this.cancelarNuevoEmpleadoProcesoRubro(esParaCancelar);								
			}
			
			this.empleadoprocesorubro=new EmpleadoProcesoRubro();
			
			this.inicializarEmpleadoProcesoRubro();
			
			this.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpleadoProcesoRubro() throws Exception {
		try {
			EmpleadoProcesoRubroConstantesFunciones.inicializarEmpleadoProcesoRubro(this.empleadoprocesorubro);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpleadoProcesoRubros(String sAccionBusqueda,List<EmpleadoProcesoRubro> empleadoprocesorubrosParaReportes) throws Exception {
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
					sPathReporteFinal="EmpleadoProcesoRubro"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpleadoProcesoRubroMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpleadoProcesoRubroMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpleadoProcesoRubro"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empleado Proceso Rubros");		
		parameters.put("busquedapor", EmpleadoProcesoRubroConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpleadoProcesoRubro=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpleadoProcesoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpleadoProcesoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpleadoProcesoRubro=new JRBeanArrayDataSource(EmpleadoProcesoRubroJInternalFrame.TraerEmpleadoProcesoRubroBeans(empleadoprocesorubrosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpleadoProcesoRubro);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpleadoProcesoRubroConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpleadoProcesoRubroConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpleadoProcesoRubroBean.TraerEmpleadoProcesoRubroBeans(empleadoprocesorubrosParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpleadoProcesoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadoprocesorubrosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpleadoProcesoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadoprocesorubrosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubroActionPerformed(null);
					//this.generarExcelReporteEmpleadoProcesoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadoprocesorubrosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpleadoProcesoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadoprocesorubrosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpleadoProcesoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadoprocesorubrosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpleadoProcesoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadoprocesorubrosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpleadoProcesoRubros(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoProcesoRubro> empleadoprocesorubrosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoprocesorubro";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoProcesoRubros");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoProcesoRubro("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpleadoProcesoRubro empleadoprocesorubro : empleadoprocesorubrosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpleadoProcesoRubroConstantesFunciones.generarExcelReporteDataEmpleadoProcesoRubro("NORMAL",row,workbook,empleadoprocesorubro,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Proceso Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpleadoProcesoRubro(String sTipo,Row row,Workbook workbook) {
		
		EmpleadoProcesoRubroConstantesFunciones.generarExcelReporteHeaderEmpleadoProcesoRubro(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpleadoProcesoRubros(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoProcesoRubro> empleadoprocesorubrosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoprocesorubro_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoProcesoRubros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpleadoProcesoRubro empleadoprocesorubro : empleadoprocesorubrosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.getEmpleadoProcesoRubroDescripcion(empleadoprocesorubro));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoprocesorubro.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoprocesorubro.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoprocesorubro.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoprocesorubro.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoprocesorubro.getfecha_ingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoprocesorubro.getfecha_salida());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoprocesorubro.getobservaciones());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoprocesorubro.getnumeros_reingreso());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Proceso Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpleadoProcesoRubros(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoProcesoRubro> empleadoprocesorubrosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpleadoProcesoRubro> empleadoprocesorubrosRespaldo=null;
		
		classes=EmpleadoProcesoRubroConstantesFunciones.getClassesRelationshipsOfEmpleadoProcesoRubro(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empleadoprocesorubroLogic.setDatosCliente(this.datosCliente);
		this.empleadoprocesorubroLogic.setDatosDeep(this.datosDeep);
		this.empleadoprocesorubroLogic.setIsConDeep(true);
		
		empleadoprocesorubrosRespaldo=this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros();
		
		this.empleadoprocesorubroLogic.setEmpleadoProcesoRubros(empleadoprocesorubrosParaReportes);	
		this.empleadoprocesorubroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empleadoprocesorubrosParaReportes=this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros();
		this.empleadoprocesorubroLogic.setEmpleadoProcesoRubros(empleadoprocesorubrosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoprocesorubro_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoProcesoRubros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoProcesoRubro("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpleadoProcesoRubro empleadoprocesorubro : empleadoprocesorubrosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpleadoProcesoRubro("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpleadoProcesoRubroConstantesFunciones.generarExcelReporteDataEmpleadoProcesoRubro("NORMAL",row,workbook,empleadoprocesorubro,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.getEmpleadoProcesoRubroDescripcion(empleadoprocesorubro));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Proceso Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpleadoProcesoRubro() throws Exception {		
		this.startProcessEmpleadoProcesoRubro(true);
	}
	
	public void startProcessEmpleadoProcesoRubro(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpleadoProcesoRubro ,this.jPanelParametrosReportesEmpleadoProcesoRubro, this.jScrollPanelDatosEmpleadoProcesoRubro,this.jPanelPaginacionEmpleadoProcesoRubro, this.jScrollPanelDatosEdicionEmpleadoProcesoRubro, this.jPanelAccionesEmpleadoProcesoRubro,this.jPanelAccionesFormularioEmpleadoProcesoRubro,this.jmenuBarEmpleadoProcesoRubro,this.jmenuBarDetalleEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,this.jTtoolBarDetalleEmpleadoProcesoRubro);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoProcesoRubro=this.jTabbedPaneBusquedasEmpleadoProcesoRubro; 
		
		final JPanel jPanelParametrosReportesEmpleadoProcesoRubro=this.jPanelParametrosReportesEmpleadoProcesoRubro;
		//final JScrollPane jScrollPanelDatosEmpleadoProcesoRubro=this.jScrollPanelDatosEmpleadoProcesoRubro;
		final JTable jTableDatosEmpleadoProcesoRubro=this.jTableDatosEmpleadoProcesoRubro;		
		final JPanel jPanelPaginacionEmpleadoProcesoRubro=this.jPanelPaginacionEmpleadoProcesoRubro;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoProcesoRubro=this.jScrollPanelDatosEdicionEmpleadoProcesoRubro;
		final JPanel jPanelAccionesEmpleadoProcesoRubro=this.jPanelAccionesEmpleadoProcesoRubro;
		
		JPanel jPanelCamposAuxiliarEmpleadoProcesoRubro=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoProcesoRubro=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			jPanelCamposAuxiliarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelCamposEmpleadoProcesoRubro;
			jPanelAccionesFormularioAuxiliarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelAccionesFormularioEmpleadoProcesoRubro;
		}
		
		final JPanel jPanelCamposEmpleadoProcesoRubro=jPanelCamposAuxiliarEmpleadoProcesoRubro;
		final JPanel jPanelAccionesFormularioEmpleadoProcesoRubro=jPanelAccionesFormularioAuxiliarEmpleadoProcesoRubro;
		
		
		final JMenuBar jmenuBarEmpleadoProcesoRubro=this.jmenuBarEmpleadoProcesoRubro;
		final JToolBar jTtoolBarEmpleadoProcesoRubro=this.jTtoolBarEmpleadoProcesoRubro;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoProcesoRubro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoProcesoRubro=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			jmenuBarDetalleAuxiliarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jmenuBarDetalleEmpleadoProcesoRubro;
			jTtoolBarDetalleAuxiliarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTtoolBarDetalleEmpleadoProcesoRubro;
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoProcesoRubro=jmenuBarDetalleAuxiliarEmpleadoProcesoRubro;
		final JToolBar jTtoolBarDetalleEmpleadoProcesoRubro=jTtoolBarDetalleAuxiliarEmpleadoProcesoRubro;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoProcesoRubro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoProcesoRubro;
			processRunnable.jTableDatos=jTableDatosEmpleadoProcesoRubro;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoProcesoRubro;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoProcesoRubro;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoProcesoRubro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoProcesoRubro;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoProcesoRubro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoProcesoRubro;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoProcesoRubro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoProcesoRubro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoProcesoRubro ,jPanelParametrosReportesEmpleadoProcesoRubro,jTableDatosEmpleadoProcesoRubro, /*jScrollPanelDatosEmpleadoProcesoRubro,*/jPanelCamposEmpleadoProcesoRubro,jPanelPaginacionEmpleadoProcesoRubro, /*jScrollPanelDatosEdicionEmpleadoProcesoRubro,*/ jPanelAccionesEmpleadoProcesoRubro,jPanelAccionesFormularioEmpleadoProcesoRubro,jmenuBarEmpleadoProcesoRubro,jmenuBarDetalleEmpleadoProcesoRubro,jTtoolBarEmpleadoProcesoRubro,jTtoolBarDetalleEmpleadoProcesoRubro);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoProcesoRubro ,jPanelParametrosReportesEmpleadoProcesoRubro, jScrollPanelDatosEmpleadoProcesoRubro,jPanelPaginacionEmpleadoProcesoRubro, jScrollPanelDatosEdicionEmpleadoProcesoRubro, jPanelAccionesEmpleadoProcesoRubro,jPanelAccionesFormularioEmpleadoProcesoRubro,jmenuBarEmpleadoProcesoRubro,jmenuBarDetalleEmpleadoProcesoRubro,jTtoolBarEmpleadoProcesoRubro,jTtoolBarDetalleEmpleadoProcesoRubro);
						
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
	
	public void finishProcessEmpleadoProcesoRubro() {// throws Exception 
		this.finishProcessEmpleadoProcesoRubro(true);
	}
	
	public void finishProcessEmpleadoProcesoRubro(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpleadoProcesoRubro ,this.jPanelParametrosReportesEmpleadoProcesoRubro, this.jScrollPanelDatosEmpleadoProcesoRubro,this.jPanelPaginacionEmpleadoProcesoRubro, this.jScrollPanelDatosEdicionEmpleadoProcesoRubro, this.jPanelAccionesEmpleadoProcesoRubro,this.jPanelAccionesFormularioEmpleadoProcesoRubro,this.jmenuBarEmpleadoProcesoRubro,this.jmenuBarDetalleEmpleadoProcesoRubro,this.jTtoolBarEmpleadoProcesoRubro,this.jTtoolBarDetalleEmpleadoProcesoRubro);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoProcesoRubro=this.jTabbedPaneBusquedasEmpleadoProcesoRubro; 
		
		final JPanel jPanelParametrosReportesEmpleadoProcesoRubro=this.jPanelParametrosReportesEmpleadoProcesoRubro;
		//final JScrollPane jScrollPanelDatosEmpleadoProcesoRubro=this.jScrollPanelDatosEmpleadoProcesoRubro;
		final JTable jTableDatosEmpleadoProcesoRubro=this.jTableDatosEmpleadoProcesoRubro;		
		final JPanel jPanelPaginacionEmpleadoProcesoRubro=this.jPanelPaginacionEmpleadoProcesoRubro;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoProcesoRubro=this.jScrollPanelDatosEdicionEmpleadoProcesoRubro;
		final JPanel jPanelAccionesEmpleadoProcesoRubro=this.jPanelAccionesEmpleadoProcesoRubro;
		
		JPanel jPanelCamposAuxiliarEmpleadoProcesoRubro=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoProcesoRubro=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			jPanelCamposAuxiliarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelCamposEmpleadoProcesoRubro;
			jPanelAccionesFormularioAuxiliarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelAccionesFormularioEmpleadoProcesoRubro;
		}
		
		final JPanel jPanelCamposEmpleadoProcesoRubro=jPanelCamposAuxiliarEmpleadoProcesoRubro;
		final JPanel jPanelAccionesFormularioEmpleadoProcesoRubro=jPanelAccionesFormularioAuxiliarEmpleadoProcesoRubro;
		
		
		final JMenuBar jmenuBarEmpleadoProcesoRubro=this.jmenuBarEmpleadoProcesoRubro;		
		final JToolBar jTtoolBarEmpleadoProcesoRubro=this.jTtoolBarEmpleadoProcesoRubro;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoProcesoRubro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoProcesoRubro=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			jmenuBarDetalleAuxiliarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jmenuBarDetalleEmpleadoProcesoRubro;
			jTtoolBarDetalleAuxiliarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTtoolBarDetalleEmpleadoProcesoRubro;		
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoProcesoRubro=jmenuBarDetalleAuxiliarEmpleadoProcesoRubro;
		final JToolBar jTtoolBarDetalleEmpleadoProcesoRubro=jTtoolBarDetalleAuxiliarEmpleadoProcesoRubro;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoProcesoRubro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoProcesoRubro;
			processRunnable.jTableDatos=jTableDatosEmpleadoProcesoRubro;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoProcesoRubro;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoProcesoRubro;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoProcesoRubro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoProcesoRubro;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoProcesoRubro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoProcesoRubro;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoProcesoRubro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoProcesoRubro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpleadoProcesoRubro ,jPanelParametrosReportesEmpleadoProcesoRubro, jTableDatosEmpleadoProcesoRubro,/*jScrollPanelDatosEmpleadoProcesoRubro,*/jPanelCamposEmpleadoProcesoRubro,jPanelPaginacionEmpleadoProcesoRubro, /*jScrollPanelDatosEdicionEmpleadoProcesoRubro,*/ jPanelAccionesEmpleadoProcesoRubro,jPanelAccionesFormularioEmpleadoProcesoRubro,jmenuBarEmpleadoProcesoRubro,jmenuBarDetalleEmpleadoProcesoRubro,jTtoolBarEmpleadoProcesoRubro,jTtoolBarDetalleEmpleadoProcesoRubro));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpleadoProcesoRubro(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpleadoProcesoRubro(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpleadoProcesoRubro(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpleadoProcesoRubro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpleadoProcesoRubro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpleadoProcesoRubro,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpleadoProcesoRubro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpleadoProcesoRubro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpleadoProcesoRubro,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empleadoprocesorubroConstantesFunciones.getsFinalQueryEmpleadoProcesoRubro();
		String  finalQueryPaginacionTodos=this.empleadoprocesorubroConstantesFunciones.getsFinalQueryEmpleadoProcesoRubro();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpleadoProcesoRubroConstantesFunciones.getArrayColumnasGlobalesNoEmpleadoProcesoRubro(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpleadoProcesoRubroConstantesFunciones.getArrayColumnasGlobalesEmpleadoProcesoRubro(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpleadoProcesoRubroConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empleadoprocesorubrosEliminados= new ArrayList<EmpleadoProcesoRubro>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpleadoProcesoRubro();
		
				///*EmpleadoProcesoRubroSessionBean*/this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
			
			if(this.empleadoprocesorubroSessionBean==null) {
				this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
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
					this.iNumeroPaginacion=EmpleadoProcesoRubroConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpleadoProcesoRubroConstantesFunciones.getClassesForeignKeysOfEmpleadoProcesoRubro(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empleadoprocesorubro."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empleadoprocesorubrosAux= new ArrayList<EmpleadoProcesoRubro>();
			
				
			empleadoprocesorubroLogic.setDatosCliente(this.datosCliente);
			empleadoprocesorubroLogic.setDatosDeep(this.datosDeep);
			empleadoprocesorubroLogic.setIsConDeep(true);
			
			
			empleadoprocesorubroLogic.getEmpleadoProcesoRubroDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empleadoprocesorubroLogic.getTodosEmpleadoProcesoRubros(finalQueryGlobal,pagination);
					
					//empleadoprocesorubroLogic.getTodosEmpleadoProcesoRubrosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empleadoprocesorubroLogic.getEmpleadoProcesoRubros()==null|| empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoprocesorubrosAux= new ArrayList<EmpleadoProcesoRubro>();
							empleadoprocesorubrosAux.addAll(empleadoprocesorubroLogic.getEmpleadoProcesoRubros());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoprocesorubrosAux= new ArrayList<EmpleadoProcesoRubro>();
							empleadoprocesorubrosAux.addAll(empleadoprocesorubros);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoprocesorubroLogic.getTodosEmpleadoProcesoRubros(finalQueryGlobal+"",this.pagination);												
							
							//empleadoprocesorubroLogic.getTodosEmpleadoProcesoRubrosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpleadoProcesoRubros("Todos",empleadoprocesorubroLogic.getEmpleadoProcesoRubros() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoprocesorubroLogic.setEmpleadoProcesoRubros(new ArrayList<EmpleadoProcesoRubro>());					
							empleadoprocesorubroLogic.getEmpleadoProcesoRubros().addAll(empleadoprocesorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoprocesorubros=new ArrayList<EmpleadoProcesoRubro>();
							empleadoprocesorubros.addAll(empleadoprocesorubrosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpleadoProcesoRubro=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpleadoProcesoRubro=this.idActual;
				
				} else if(this.idEmpleadoProcesoRubroActual!=null && this.idEmpleadoProcesoRubroActual!=0L) {
					idEmpleadoProcesoRubro=idEmpleadoProcesoRubroActual;
				}
				
					
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndicePorId(idEmpleadoProcesoRubro);
				
				this.empleadoprocesorubros=new ArrayList<EmpleadoProcesoRubro>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empleadoprocesorubroLogic.getEntity(idEmpleadoProcesoRubro);
					
					//empleadoprocesorubroLogic.getEntityWithConnection(idEmpleadoProcesoRubro);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoprocesorubroLogic.setEmpleadoProcesoRubros(new ArrayList<EmpleadoProcesoRubro>());
					empleadoprocesorubroLogic.getEmpleadoProcesoRubros().add(empleadoprocesorubroLogic.getEmpleadoProcesoRubro());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoprocesorubros=new ArrayList<EmpleadoProcesoRubro>();
					this.empleadoprocesorubros.add(empleadoprocesorubro);
				}
				
				if(empleadoprocesorubroLogic.getEmpleadoProcesoRubro()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoprocesorubroLogic.getEmpleadoProcesoRubros()==null||empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoprocesorubros==null|| empleadoprocesorubros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubrosAux=new ArrayList<EmpleadoProcesoRubro>();
						empleadoprocesorubrosAux.addAll(empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoprocesorubrosAux=new ArrayList<EmpleadoProcesoRubro>();
							empleadoprocesorubrosAux.addAll(empleadoprocesorubros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoProcesoRubros("FK_IdEmpleado",empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoProcesoRubros("FK_IdEmpleado",empleadoprocesorubros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubroLogic.setEmpleadoProcesoRubros(new ArrayList<EmpleadoProcesoRubro>());
						empleadoprocesorubroLogic.getEmpleadoProcesoRubros().addAll(empleadoprocesorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoprocesorubros=new ArrayList<EmpleadoProcesoRubro>();
							empleadoprocesorubros.addAll(empleadoprocesorubrosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoprocesorubroLogic.getEmpleadoProcesoRubros()==null||empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoprocesorubros==null|| empleadoprocesorubros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubrosAux=new ArrayList<EmpleadoProcesoRubro>();
						empleadoprocesorubrosAux.addAll(empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoprocesorubrosAux=new ArrayList<EmpleadoProcesoRubro>();
							empleadoprocesorubrosAux.addAll(empleadoprocesorubros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoProcesoRubros("FK_IdEmpresa",empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoProcesoRubros("FK_IdEmpresa",empleadoprocesorubros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubroLogic.setEmpleadoProcesoRubros(new ArrayList<EmpleadoProcesoRubro>());
						empleadoprocesorubroLogic.getEmpleadoProcesoRubros().addAll(empleadoprocesorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoprocesorubros=new ArrayList<EmpleadoProcesoRubro>();
							empleadoprocesorubros.addAll(empleadoprocesorubrosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoprocesorubroLogic.getEmpleadoProcesoRubros()==null||empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoprocesorubros==null|| empleadoprocesorubros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubrosAux=new ArrayList<EmpleadoProcesoRubro>();
						empleadoprocesorubrosAux.addAll(empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoprocesorubrosAux=new ArrayList<EmpleadoProcesoRubro>();
							empleadoprocesorubrosAux.addAll(empleadoprocesorubros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoProcesoRubros("FK_IdEstructura",empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoProcesoRubros("FK_IdEstructura",empleadoprocesorubros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubroLogic.setEmpleadoProcesoRubros(new ArrayList<EmpleadoProcesoRubro>());
						empleadoprocesorubroLogic.getEmpleadoProcesoRubros().addAll(empleadoprocesorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoprocesorubros=new ArrayList<EmpleadoProcesoRubro>();
							empleadoprocesorubros.addAll(empleadoprocesorubrosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoprocesorubroLogic.getEmpleadoProcesoRubros()==null||empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoprocesorubros==null|| empleadoprocesorubros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubrosAux=new ArrayList<EmpleadoProcesoRubro>();
						empleadoprocesorubrosAux.addAll(empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoprocesorubrosAux=new ArrayList<EmpleadoProcesoRubro>();
							empleadoprocesorubrosAux.addAll(empleadoprocesorubros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoProcesoRubroConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoProcesoRubros("FK_IdSucursal",empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoProcesoRubros("FK_IdSucursal",empleadoprocesorubros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubroLogic.setEmpleadoProcesoRubros(new ArrayList<EmpleadoProcesoRubro>());
						empleadoprocesorubroLogic.getEmpleadoProcesoRubros().addAll(empleadoprocesorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoprocesorubros=new ArrayList<EmpleadoProcesoRubro>();
							empleadoprocesorubros.addAll(empleadoprocesorubrosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpleadoProcesoRubro();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpleadoProcesoRubro();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoprocesorubros.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoprocesorubros.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpleadoProcesoRubro empleadoprocesorubro) {
		Boolean permite=true;
		
		if(this.empleadoprocesorubro.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpleadoProcesoRubroConstantesFunciones.getOrderByListaEmpleadoProcesoRubro();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpleadoProcesoRubroConstantesFunciones.getOrderByListaEmpleadoProcesoRubro();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoProcesoRubro empleadoprocesorubro:empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
				if(empleadoprocesorubro.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoprocesorubroTotales=empleadoprocesorubro;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoProcesoRubro empleadoprocesorubro:this.empleadoprocesorubros) {
				if(empleadoprocesorubro.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoprocesorubroTotales=empleadoprocesorubro;
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
			this.empleadoprocesorubroAux=new EmpleadoProcesoRubro();
			this.empleadoprocesorubroAux.setsType(Constantes2.S_TOTALES);
			this.empleadoprocesorubroAux.setIsNew(false);
			this.empleadoprocesorubroAux.setIsChanged(false);
			this.empleadoprocesorubroAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpleadoProcesoRubroConstantesFunciones.TotalizarValoresFilaEmpleadoProcesoRubro(this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros(),this.empleadoprocesorubroAux);
				
				this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().add(this.empleadoprocesorubroAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpleadoProcesoRubroConstantesFunciones.TotalizarValoresFilaEmpleadoProcesoRubro(this.empleadoprocesorubros,this.empleadoprocesorubroAux);
				
				this.empleadoprocesorubros.add(this.empleadoprocesorubroAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empleadoprocesorubroTotales=new EmpleadoProcesoRubro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().remove(empleadoprocesorubroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoprocesorubros.remove(empleadoprocesorubroTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empleadoprocesorubroTotales=new EmpleadoProcesoRubro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoProcesoRubro empleadoprocesorubro:empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
				if(empleadoprocesorubro.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoprocesorubroTotales=empleadoprocesorubro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoProcesoRubroConstantesFunciones.TotalizarValoresFilaEmpleadoProcesoRubro(this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros(),empleadoprocesorubroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoProcesoRubro empleadoprocesorubro:this.empleadoprocesorubros) {
				if(empleadoprocesorubro.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoprocesorubroTotales=empleadoprocesorubro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoProcesoRubroConstantesFunciones.TotalizarValoresFilaEmpleadoProcesoRubro(this.empleadoprocesorubros,empleadoprocesorubroTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpleadoProcesoRubrosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoProcesoRubrosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoProcesoRubrosFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoProcesoRubrosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpleadoProcesoRubrosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoProcesoRubrosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoProcesoRubrosFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoProcesoRubrosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoprocesorubroLogic.getEmpleadoProcesoRubrosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosEmpleadoProcesoRubro() {
		this.isPermisoTodoEmpleadoProcesoRubro=false;
		this.isPermisoNuevoEmpleadoProcesoRubro=false;
		this.isPermisoActualizarEmpleadoProcesoRubro=false;
		this.isPermisoActualizarOriginalEmpleadoProcesoRubro=false;
		this.isPermisoEliminarEmpleadoProcesoRubro=false;
		this.isPermisoGuardarCambiosEmpleadoProcesoRubro=false;
		this.isPermisoConsultaEmpleadoProcesoRubro=false;
		this.isPermisoBusquedaEmpleadoProcesoRubro=false;
		this.isPermisoReporteEmpleadoProcesoRubro=false;		
		this.isPermisoOrdenEmpleadoProcesoRubro=false;		
		this.isPermisoPaginacionMedioEmpleadoProcesoRubro=false;		
		this.isPermisoPaginacionAltoEmpleadoProcesoRubro=false;
		this.isPermisoPaginacionTodoEmpleadoProcesoRubro=false;
		this.isPermisoCopiarEmpleadoProcesoRubro=false;		
		this.isPermisoVerFormEmpleadoProcesoRubro=false;		
		this.isPermisoDuplicarEmpleadoProcesoRubro=false;		
		this.isPermisoOrdenEmpleadoProcesoRubro=false;		
	}
	
	public void setPermisosUsuarioEmpleadoProcesoRubro(Boolean isPermiso) {
		this.isPermisoTodoEmpleadoProcesoRubro=isPermiso;
		this.isPermisoNuevoEmpleadoProcesoRubro=isPermiso;
		this.isPermisoActualizarEmpleadoProcesoRubro=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoProcesoRubro=isPermiso;
		this.isPermisoEliminarEmpleadoProcesoRubro=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoProcesoRubro=isPermiso;
		this.isPermisoConsultaEmpleadoProcesoRubro=isPermiso;
		this.isPermisoBusquedaEmpleadoProcesoRubro=isPermiso;
		this.isPermisoReporteEmpleadoProcesoRubro=isPermiso;
		this.isPermisoOrdenEmpleadoProcesoRubro=isPermiso;		
		this.isPermisoPaginacionMedioEmpleadoProcesoRubro=isPermiso;		
		this.isPermisoPaginacionAltoEmpleadoProcesoRubro=isPermiso;		
		this.isPermisoPaginacionTodoEmpleadoProcesoRubro=isPermiso;		
		this.isPermisoCopiarEmpleadoProcesoRubro=isPermiso;		
		this.isPermisoVerFormEmpleadoProcesoRubro=isPermiso;		
		this.isPermisoDuplicarEmpleadoProcesoRubro=isPermiso;
		this.isPermisoOrdenEmpleadoProcesoRubro=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpleadoProcesoRubro(Boolean isPermiso) {
		//this.isPermisoTodoEmpleadoProcesoRubro=isPermiso;
		this.isPermisoNuevoEmpleadoProcesoRubro=isPermiso;
		this.isPermisoActualizarEmpleadoProcesoRubro=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoProcesoRubro=isPermiso;
		this.isPermisoEliminarEmpleadoProcesoRubro=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoProcesoRubro=isPermiso;
		//this.isPermisoConsultaEmpleadoProcesoRubro=isPermiso;
		//this.isPermisoBusquedaEmpleadoProcesoRubro=isPermiso;
		//this.isPermisoReporteEmpleadoProcesoRubro=isPermiso;
		//this.isPermisoOrdenEmpleadoProcesoRubro=isPermiso;		
		//this.isPermisoPaginacionMedioEmpleadoProcesoRubro=isPermiso;		
		//this.isPermisoPaginacionAltoEmpleadoProcesoRubro=isPermiso;		
		//this.isPermisoPaginacionTodoEmpleadoProcesoRubro=isPermiso;		
		//this.isPermisoCopiarEmpleadoProcesoRubro=isPermiso;		
		//this.isPermisoDuplicarEmpleadoProcesoRubro=isPermiso;
		//this.isPermisoOrdenEmpleadoProcesoRubro=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoProcesoRubroClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpleadoProcesoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpleadoProcesoRubro(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoProcesoRubroClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpleadoProcesoRubroClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpleadoProcesoRubroClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpleadoProcesoRubroClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpleadoProcesoRubro() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpleadoProcesoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpleadoProcesoRubroConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpleadoProcesoRubro=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpleadoProcesoRubro=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpleadoProcesoRubro=this.isPermisoActualizarEmpleadoProcesoRubro;
			this.isPermisoEliminarEmpleadoProcesoRubro=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpleadoProcesoRubro=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpleadoProcesoRubro=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpleadoProcesoRubro=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpleadoProcesoRubro=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpleadoProcesoRubro=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoProcesoRubro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpleadoProcesoRubro=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpleadoProcesoRubro=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpleadoProcesoRubro=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpleadoProcesoRubro=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpleadoProcesoRubro=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpleadoProcesoRubro=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoProcesoRubro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpleadoProcesoRubro.setToolTipText(this.jTableDatosEmpleadoProcesoRubro.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpleadoProcesoRubro(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpleadoProcesoRubro(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpleadoProcesoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpleadoProcesoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpleadoProcesoRubro() throws Exception {
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
	public void inicializarCombosForeignKeyEmpleadoProcesoRubroListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpleadoProcesoRubroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpleadoProcesoRubroJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpleadoProcesoRubroListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyEmpleadoProcesoRubroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpleadoProcesoRubroParameterReturnGeneral empleadoprocesorubroReturnGeneral=new EmpleadoProcesoRubroParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empleadoprocesorubroConstantesFunciones.cargarid_empresaEmpleadoProcesoRubro)
					 || (this.esRecargarFks && this.empleadoprocesorubroConstantesFunciones.cargarid_empresaEmpleadoProcesoRubro)) {

					if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empleadoprocesorubroSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.empleadoprocesorubroConstantesFunciones.cargarid_sucursalEmpleadoProcesoRubro)
					 || (this.esRecargarFks && this.empleadoprocesorubroConstantesFunciones.cargarid_sucursalEmpleadoProcesoRubro)) {

					if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+empleadoprocesorubroSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.empleadoprocesorubroConstantesFunciones.cargarid_estructuraEmpleadoProcesoRubro)
					 || (this.esRecargarFks && this.empleadoprocesorubroConstantesFunciones.cargarid_estructuraEmpleadoProcesoRubro)) {

					if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+empleadoprocesorubroSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.empleadoprocesorubroConstantesFunciones.cargarid_empleadoEmpleadoProcesoRubro)
					 || (this.esRecargarFks && this.empleadoprocesorubroConstantesFunciones.cargarid_empleadoEmpleadoProcesoRubro)) {

					if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+empleadoprocesorubroSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empleadoprocesorubroReturnGeneral=empleadoprocesorubroLogic.cargarCombosLoteForeignKeyEmpleadoProcesoRubro(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEstructura,finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empleadoprocesorubroReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=empleadoprocesorubroReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=empleadoprocesorubroReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=empleadoprocesorubroReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpleadoProcesoRubro()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empleadoprocesorubroSessionBean==null) {
				this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
			}

			if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

			if(!this.empleadoprocesorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyEmpleadoProcesoRubro()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoProcesoRubro(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpleadoProcesoRubro()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.empleadoprocesorubro.setfecha_ingreso(this.parametroGeneralUsuario.getfecha_sistema());
				this.empleadoprocesorubro.setfecha_salida(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoProcesoRubro();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro)throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(empleadoprocesorubro.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(empleadoprocesorubro.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpleadoProcesoRubro()throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(this.empleadoprocesorubroConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.empleadoprocesorubroConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoProcesoRubro()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpleadoProcesoRubro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpleadoProcesoRubro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpleadoProcesoRubro()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpleadoProcesoRubro()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpleadoProcesoRubro(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpleadoProcesoRubro()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public EmpleadoProcesoRubroBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpleadoProcesoRubroBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpleadoProcesoRubroBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean(); 
		this.empleadoprocesorubroConstantesFunciones=new EmpleadoProcesoRubroConstantesFunciones(); 
		this.empleadoprocesorubroBean=new EmpleadoProcesoRubro();//(this.empleadoprocesorubroConstantesFunciones); 		
		this.empleadoprocesorubroReturnGeneral=new EmpleadoProcesoRubroParameterReturnGeneral(); 
		
		this.empleadoprocesorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoprocesorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpleadoProcesoRubroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpleadoProcesoRubroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpleadoProcesoRubroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpleadoProcesoRubro(true);
			
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
			
			this.empleadoprocesorubroConstantesFunciones=new EmpleadoProcesoRubroConstantesFunciones(); 
			this.empleadoprocesorubroBean=new EmpleadoProcesoRubro();//this.empleadoprocesorubroConstantesFunciones); 			
			this.empleadoprocesorubroReturnGeneral=new EmpleadoProcesoRubroParameterReturnGeneral(); 
		
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Proceso Rubro Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.empleadoprocesorubro=new EmpleadoProcesoRubro();
			this.empleadoprocesorubros = new ArrayList<EmpleadoProcesoRubro>();
			this.empleadoprocesorubrosAux = new ArrayList<EmpleadoProcesoRubro>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic=new EmpleadoProcesoRubroLogic();
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}
			
			//this.empleadoprocesorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empleadoprocesorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpleadoProcesoRubro);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro);	
					}
					
					if(this.jInternalFrameImportacionEmpleadoProcesoRubro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoProcesoRubro);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpleadoProcesoRubro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpleadoProcesoRubro);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoProcesoRubro);
				this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setVisible(false);
				this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro);
					this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpleadoProcesoRubro!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoProcesoRubro);
					this.jInternalFrameImportacionEmpleadoProcesoRubro.setVisible(false);
					this.jInternalFrameImportacionEmpleadoProcesoRubro.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpleadoProcesoRubro!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoProcesoRubro);
					this.jInternalFrameOrderByEmpleadoProcesoRubro.setVisible(false);
					this.jInternalFrameOrderByEmpleadoProcesoRubro.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpleadoProcesoRubroActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpleadoProcesoRubroConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empleadoprocesorubroReturnGeneral=new EmpleadoProcesoRubroParameterReturnGeneral();
			
			this.empleadoprocesorubroParameterGeneral=new EmpleadoProcesoRubroParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empleadoprocesorubroLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpleadoProcesoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoProcesoRubroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado(),this.empleadoprocesorubroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoProcesoRubroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado(),this.empleadoprocesorubroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaDuplicarEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaCopiarEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaVerFormEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaOrdenEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaModificarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpleadoProcesoRubro();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpleadoProcesoRubro(false);
			
			this.setPermisosUsuarioEmpleadoProcesoRubro();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() 
				|| (this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado() && this.empleadoprocesorubroSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpleadoProcesoRubroClasesRelacionadas();
			}
			
			if(this.empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpleadoProcesoRubroClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpleadoProcesoRubro();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpleadoProcesoRubro();
			}
			
			if(!this.isPermisoBusquedaEmpleadoProcesoRubro) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpleadoProcesoRubro,this.isPermisoPaginacionMedioEmpleadoProcesoRubro,this.isPermisoPaginacionTodoEmpleadoProcesoRubro);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpleadoProcesoRubroConstantesFunciones.getTiposSeleccionarEmpleadoProcesoRubro());
				
				this.tiposColumnasSelect=EmpleadoProcesoRubroConstantesFunciones.getTiposSeleccionarEmpleadoProcesoRubro(true);
				
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
			//if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpleadoProcesoRubro();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEmpleadoProcesoRubro(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEmpleadoProcesoRubro(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoProcesoRubro() ;
			
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
			this.estructuraLogic=new EstructuraLogic();
			this.empleadoLogic=new EmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empleadoprocesorubroImplementable= (EmpleadoProcesoRubroImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoProcesoRubroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empleadoprocesorubroImplementableHome= (EmpleadoProcesoRubroImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoProcesoRubroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empleadoprocesorubros= new ArrayList<EmpleadoProcesoRubro>();
			this.empleadoprocesorubrosEliminados= new ArrayList<EmpleadoProcesoRubro>();
						
			this.isEsNuevoEmpleadoProcesoRubro=false;
			this.esParaAccionDesdeFormularioEmpleadoProcesoRubro=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpleadoProcesoRubro(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpleadoProcesoRubro();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpleadoProcesoRubroConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpleadoProcesoRubro(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpleadoProcesoRubro();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpleadoProcesoRubro();
			}
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpleadoProcesoRubro(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpleadoProcesoRubro: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpleadoProcesoRubro() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpleadoProcesoRubro")) {
				iIndex=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTabbedPaneRelacionesEmpleadoProcesoRubro.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTabbedPaneRelacionesEmpleadoProcesoRubro.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpleadoProcesoRubro();	
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
	
	public void cargarCombosForeignKeyEmpleadoProcesoRubro(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpleadoProcesoRubro(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpleadoProcesoRubro(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpleadoProcesoRubroListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpleadoProcesoRubro();
		
		this.cargarCombosFrameForeignKeyEmpleadoProcesoRubro();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpleadoProcesoRubro();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpleadoProcesoRubro();
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
	
	public void jButtonNuevoEmpleadoProcesoRubroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
			
			if(jTableDatosEmpleadoProcesoRubro.getRowCount()>=1) {
				jTableDatosEmpleadoProcesoRubro.removeRowSelectionInterval(0, jTableDatosEmpleadoProcesoRubro.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpleadoProcesoRubro=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpleadoProcesoRubro(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpleadoProcesoRubro(true);			
			//this.empleadoprocesorubro=new EmpleadoProcesoRubro();
			//this.empleadoprocesorubro.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoProcesoRubro(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoProcesoRubro() ;
			
			if(EmpleadoProcesoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoProcesoRubro(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empleadoprocesorubro);	
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);				
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
			if(this.empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpleadoProcesoRubro: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpleadoProcesoRubroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpleadoProcesoRubro.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpleadoProcesoRubro.getSelectedRows().length;			
			}
			
			empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpleadoProcesoRubro--;			
				//EmpleadoProcesoRubro empleadoprocesorubroAux= new EmpleadoProcesoRubro();			
				//empleadoprocesorubroAux.setId(this.iIdNuevoEmpleadoProcesoRubro);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpleadoProcesoRubro empleadoprocesorubroOrigen=new EmpleadoProcesoRubro();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpleadoProcesoRubro empleadoprocesorubroOrigen : empleadoprocesorubrosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empleadoprocesorubroOrigen =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoprocesorubroOrigen =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpleadoProcesoRubro();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empleadoprocesorubro.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpleadoProcesoRubro(empleadoprocesorubroOrigen,this.empleadoprocesorubro,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().add(this.empleadoprocesorubroAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoprocesorubros.add(this.empleadoprocesorubroAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
				
				this.jTableDatosEmpleadoProcesoRubro.setRowSelectionInterval(this.getIndiceNuevoEmpleadoProcesoRubro(), this.getIndiceNuevoEmpleadoProcesoRubro());
				
				int iLastRow =  this.jTableDatosEmpleadoProcesoRubro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoProcesoRubro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoProcesoRubro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();									
		
			EmpleadoProcesoRubro empleadoprocesorubroOrigen=new EmpleadoProcesoRubro();
			EmpleadoProcesoRubro empleadoprocesorubroDestino=new EmpleadoProcesoRubro();
				
			empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpleadoProcesoRubro.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empleadoprocesorubrosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpleadoProcesoRubro.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubroOrigen =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoprocesorubroOrigen =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoprocesorubroDestino =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoprocesorubroDestino =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empleadoprocesorubroOrigen =empleadoprocesorubrosSeleccionados.get(0);
				empleadoprocesorubroDestino =empleadoprocesorubrosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpleadoProcesoRubro(empleadoprocesorubroOrigen,empleadoprocesorubroDestino,true,false);
				
				empleadoprocesorubroDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoprocesorubroDestino,empleadoprocesorubroLogic.getEmpleadoProcesoRubros());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoprocesorubroDestino,empleadoprocesorubros);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
				
				//this.jTableDatosEmpleadoProcesoRubro.setRowSelectionInterval(this.getIndiceNuevoEmpleadoProcesoRubro(), this.getIndiceNuevoEmpleadoProcesoRubro());
				
				int iLastRow =  this.jTableDatosEmpleadoProcesoRubro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoProcesoRubro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoProcesoRubro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpleadoProcesoRubro.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpleadoProcesoRubro.setVisible(!isVisible);
			this.jPanelPaginacionEmpleadoProcesoRubro.setVisible(!isVisible);
			this.jPanelAccionesEmpleadoProcesoRubro.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpleadoProcesoRubro();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpleadoProcesoRubro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpleadoProcesoRubro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpleadoProcesoRubro();
			
			this.abrirFrameOrderByEmpleadoProcesoRubro();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpleadoProcesoRubro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpleadoProcesoRubro(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoProcesoRubro);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.isMaximum()) {
					this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setSize(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.iWidthFormulario,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpleadoProcesoRubro.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpleadoProcesoRubro.isMaximum()) {
						this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jContentPaneDetalleEmpleadoProcesoRubro.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTabbedPaneRelacionesEmpleadoProcesoRubro.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jContentPaneDetalleEmpleadoProcesoRubro.getWidth(),EmpleadoProcesoRubroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTabbedPaneRelacionesEmpleadoProcesoRubro.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jContentPaneDetalleEmpleadoProcesoRubro.getWidth(),EmpleadoProcesoRubroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTabbedPaneRelacionesEmpleadoProcesoRubro.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jContentPaneDetalleEmpleadoProcesoRubro.getWidth(),EmpleadoProcesoRubroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setVisible(true);
	        this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpleadoProcesoRubro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpleadoProcesoRubro==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpleadoProcesoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoProcesoRubro,false,this);
				} else {
					this.jInternalFrameOrderByEmpleadoProcesoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoProcesoRubro,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoProcesoRubro);
				this.jInternalFrameOrderByEmpleadoProcesoRubro.setVisible(false);
				this.jInternalFrameOrderByEmpleadoProcesoRubro.setSelected(false);
				
				this.jInternalFrameOrderByEmpleadoProcesoRubro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoProcesoRubro"));
				
				this.inicializarActualizarBindingTablaOrderByEmpleadoProcesoRubro();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpleadoProcesoRubro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpleadoProcesoRubro==null) {
				
				this.jInternalFrameImportacionEmpleadoProcesoRubro=new ImportacionJInternalFrame(EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoProcesoRubro);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoProcesoRubro);
				this.jInternalFrameImportacionEmpleadoProcesoRubro.setVisible(false);
				this.jInternalFrameImportacionEmpleadoProcesoRubro.setSelected(false);


				this.jInternalFrameImportacionEmpleadoProcesoRubro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoProcesoRubro"));
				this.jInternalFrameImportacionEmpleadoProcesoRubro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoProcesoRubro"));
				this.jInternalFrameImportacionEmpleadoProcesoRubro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoProcesoRubro"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpleadoProcesoRubro() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro==null) {
				this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro=new ReporteDinamicoJInternalFrame(EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro);
				this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoProcesoRubro"));
				this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoProcesoRubro"));
				this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoProcesoRubro"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoProcesoRubro();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpleadoProcesoRubro() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoProcesoRubro);
			
	       	this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setVisible(false);
	        this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpleadoProcesoRubro.dispose();
			//this.jInternalFrameDetalleFormEmpleadoProcesoRubro=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpleadoProcesoRubro() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpleadoProcesoRubro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpleadoProcesoRubro.setVisible(true);
	        this.jInternalFrameImportacionEmpleadoProcesoRubro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpleadoProcesoRubro() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpleadoProcesoRubro.setVisible(true);
	        this.jInternalFrameOrderByEmpleadoProcesoRubro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpleadoProcesoRubro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpleadoProcesoRubro.setVisible(false);
	        this.jInternalFrameOrderByEmpleadoProcesoRubro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpleadoProcesoRubro() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpleadoProcesoRubro() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpleadoProcesoRubro.setVisible(false);
	        this.jInternalFrameImportacionEmpleadoProcesoRubro.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderEmpleadoProcesoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoProcesoRubro.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderEmpleadoProcesoRubro.getTitle() + " -> Estructura");


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
	
	public void jButtonModificarEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpleadoProcesoRubro(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpleadoProcesoRubro(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpleadoProcesoRubro(true);
			//this.isEsNuevoEmpleadoProcesoRubro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoProcesoRubro(false) ;
			
			if(empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpleadoProcesoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoProcesoRubro(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoProcesoRubro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpleadoProcesoRubroActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpleadoProcesoRubro(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpleadoProcesoRubro(true);
			//this.isEsNuevoEmpleadoProcesoRubro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empleadoprocesorubro.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpleadoProcesoRubro(false) ;
			
			if(EmpleadoProcesoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoProcesoRubro(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoProcesoRubro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

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
		TableColumn tableColumnEmpleado=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoProcesoRubro(false);
			
			//if(!this.isEsNuevoEmpleadoProcesoRubro) {								
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
				
			}
			
			if(this.permiteMantenimiento(this.empleadoprocesorubro)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpleadoProcesoRubro=true;
					this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
					this.isEsNuevoEmpleadoProcesoRubro=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpleadoProcesoRubro=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpleadoProcesoRubro=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoProcesoRubro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoProcesoRubro(false);
				
				this.habilitarDeshabilitarControlesEmpleadoProcesoRubro(false);
			
												
				
				if(EmpleadoProcesoRubroJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpleadoProcesoRubro();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,empleadoprocesorubroSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpleadoProcesoRubro(this.empleadoprocesorubro,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpleadoProcesoRubro.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empleadoprocesorubroSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empleadoprocesorubro.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpleadoProcesoRubro.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoProcesoRubro.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				this.empleadoprocesorubro.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				this.empleadoprocesorubro.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empleadoprocesorubro)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpleadoProcesoRubroModel) this.jTableDatosEmpleadoProcesoRubro.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpleadoProcesoRubro=true;
				this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
				this.isEsNuevoEmpleadoProcesoRubro=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoProcesoRubro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoProcesoRubro(false);
				
				this.habilitarDeshabilitarControlesEmpleadoProcesoRubro(false);
				
				
				
				if(EmpleadoProcesoRubroJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpleadoProcesoRubro();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpleadoProcesoRubro.getRowCount()>=1) {
				jTableDatosEmpleadoProcesoRubro.removeRowSelectionInterval(0, jTableDatosEmpleadoProcesoRubro.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpleadoProcesoRubro(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoProcesoRubro(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoProcesoRubro(false) ;
			
			this.isEsNuevoEmpleadoProcesoRubro=false;
			
			if(EmpleadoProcesoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpleadoProcesoRubro();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
				
				//SI ES MANUAL
				if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpleadoProcesoRubro();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpleadoProcesoRubro--;			
			//EmpleadoProcesoRubro empleadoprocesorubroAux= new EmpleadoProcesoRubro();			
			//empleadoprocesorubroAux.setId(this.iIdNuevoEmpleadoProcesoRubro);
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpleadoProcesoRubro();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
			
			this.empleadoprocesorubro.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().add(this.empleadoprocesorubroAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empleadoprocesorubros.add(this.empleadoprocesorubroAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
			
			this.jTableDatosEmpleadoProcesoRubro.setRowSelectionInterval(this.getIndiceNuevoEmpleadoProcesoRubro(), this.getIndiceNuevoEmpleadoProcesoRubro());
			
			int iLastRow =  this.jTableDatosEmpleadoProcesoRubro.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpleadoProcesoRubro.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpleadoProcesoRubro.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
			
			//SI ES MANUAL
			if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoProcesoRubro();
			}
			
			//this.abrirFrameTreeEmpleadoProcesoRubro();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empleado Proceso RubroS ?", "MANTENIMIENTO DE Empleado Proceso Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpleadoProcesoRubro.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpleadoProcesoRubro();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empleadoprocesorubroReturnGeneral=empleadoprocesorubroLogic.procesarImportacionEmpleadoProcesoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empleadoprocesorubroParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpleadoProcesoRubroReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpleadoProcesoRubro.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpleadoProcesoRubro.setFileImportacion(this.jInternalFrameImportacionEmpleadoProcesoRubro.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpleadoProcesoRubro.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpleadoProcesoRubro.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpleadoProcesoRubro.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpleadoProcesoRubro.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();		

		empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpleadoProcesoRubroBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpleadoProcesoRubroBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpleadoProcesoRubros("Todos",empleadoprocesorubrosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Proceso Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaSalida_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaSalida_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaSalida_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaSalida_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servaciones_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servaciones_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servaciones_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servaciones_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_merosReingreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_merosReingreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_merosReingreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_merosReingreso_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO:
					sNombreCampoCategoria="fecha_ingreso";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA:
					sNombreCampoCategoria="fecha_salida";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES:
					sNombreCampoCategoria="observaciones";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO:
					sNombreCampoCategoria="numeros_reingreso";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO:
					sNombreCampoCategoriaValor="fecha_ingreso";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA:
					sNombreCampoCategoriaValor="fecha_salida";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES:
					sNombreCampoCategoriaValor="observaciones";
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO:
					sNombreCampoCategoriaValor="numeros_reingreso";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ingreso");
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Sala",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_salida");
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observaciones",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observaciones");
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numeros Reingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numeros_reingreso");
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();		
		
		empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoprocesorubro";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EmpleadoProcesoRubros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EmpleadoProcesoRubro empleadoprocesorubro:empleadoprocesorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoprocesorubro.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(EmpleadoProcesoRubro empleadoprocesorubro:empleadoprocesorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoprocesorubro.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(EmpleadoProcesoRubro empleadoprocesorubro:empleadoprocesorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoprocesorubro.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EmpleadoProcesoRubro empleadoprocesorubro:empleadoprocesorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoprocesorubro.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO);
					iRow++;

					for(EmpleadoProcesoRubro empleadoprocesorubro:empleadoprocesorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoprocesorubro.getfecha_ingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA);
					iRow++;

					for(EmpleadoProcesoRubro empleadoprocesorubro:empleadoprocesorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoprocesorubro.getfecha_salida());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES);
					iRow++;

					for(EmpleadoProcesoRubro empleadoprocesorubro:empleadoprocesorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoprocesorubro.getobservaciones());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO);
					iRow++;

					for(EmpleadoProcesoRubro empleadoprocesorubro:empleadoprocesorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoprocesorubro.getnumeros_reingreso());
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
			//	this.getFilaCabeceraExportarExcelEmpleadoProcesoRubro(row);				
			//	iRow++;
			//}				
			
			//for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubrosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpleadoProcesoRubro(empleadoprocesorubroAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Proceso Rubro",JOptionPane.INFORMATION_MESSAGE);
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
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
			
			//SI ES MANUAL
			if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoProcesoRubro();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
			
			//SI ES MANUAL
			if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoProcesoRubro();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
			
			//SI ES MANUAL
			if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoProcesoRubro();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpleadoProcesoRubro() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpleadoProcesoRubro.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpleadoProcesoRubro.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpleadoProcesoRubro.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpleadoProcesoRubro.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpleadoProcesoRubro.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpleadoProcesoRubro.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpleadoProcesoRubro.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpleadoProcesoRubro(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpleadoProcesoRubro(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpleadoProcesoRubro(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpleadoProcesoRubro(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpleadoProcesoRubro(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoProcesoRubro(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoProcesoRubro(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpleadoProcesoRubro() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpleadoProcesoRubro();
		
		this.inicializarActualizarBindingBotonesManualEmpleadoProcesoRubro(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoProcesoRubro();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoProcesoRubro() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoProcesoRubro(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoProcesoRubro(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpleadoProcesoRubro.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpleadoProcesoRubro.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jCheckBoxPostAccionNuevoEmpleadoProcesoRubro.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jCheckBoxPostAccionSinCerrarEmpleadoProcesoRubro.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jCheckBoxPostAccionSinMensajeEmpleadoProcesoRubro.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpleadoProcesoRubro.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpleadoProcesoRubro.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
				this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jCheckBoxPostAccionNuevoEmpleadoProcesoRubro.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jCheckBoxPostAccionSinCerrarEmpleadoProcesoRubro.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jCheckBoxPostAccionSinMensajeEmpleadoProcesoRubro.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpleadoProcesoRubro.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpleadoProcesoRubro.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpleadoProcesoRubro.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpleadoProcesoRubro.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpleadoProcesoRubro.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpleadoProcesoRubro.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpleadoProcesoRubro(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoProcesoRubro(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoProcesoRubro() throws Exception {
		try	{
			if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoProcesoRubro();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoProcesoRubro() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoProcesoRubro() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpleadoProcesoRubro.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpleadoProcesoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpleadoProcesoRubro.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpleadoProcesoRubro.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpleadoProcesoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpleadoProcesoRubro.addItem(reporte);
			}
			
			
			if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpleadoProcesoRubro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpleadoProcesoRubro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpleadoProcesoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpleadoProcesoRubro.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpleadoProcesoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpleadoProcesoRubro.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoProcesoRubro();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoProcesoRubro() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpleadoProcesoRubro()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoProcesoRubro.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoProcesoRubro.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpleadoProcesoRubro(Boolean esInicializar) throws Exception {				
		if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoProcesoRubro();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpleadoProcesoRubro() throws Exception {
		this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpleadoProcesoRubro() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpleadoProcesoRubroOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubroOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpleadoProcesoRubro(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empleadoprocesorubros.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpleadoProcesoRubro.setModel(new EmpleadoProcesoRubroModel(this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpleadoProcesoRubro.setModel(new EmpleadoProcesoRubroModel(this.empleadoprocesorubros,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpleadoProcesoRubro!=null && this.jInternalFrameOrderByEmpleadoProcesoRubro.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpleadoProcesoRubro();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO,empleadoprocesorubroConstantesFunciones.resaltarSeleccionarEmpleadoProcesoRubro,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpleadoProcesoRubroConstantesFunciones.SCLASSWEBTITULO,empleadoprocesorubroConstantesFunciones.resaltarSeleccionarEmpleadoProcesoRubro,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,EmpleadoProcesoRubroConstantesFunciones.LABEL_ID));

		if(this.empleadoprocesorubroConstantesFunciones.mostraridEmpleadoProcesoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoProcesoRubroConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoprocesorubroConstantesFunciones.resaltaridEmpleadoProcesoRubro,this.empleadoprocesorubroConstantesFunciones.activaridEmpleadoProcesoRubro,this,true,"idEmpleadoProcesoRubro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoprocesorubroConstantesFunciones.resaltaridEmpleadoProcesoRubro,this.empleadoprocesorubroConstantesFunciones.activaridEmpleadoProcesoRubro,this,true,"idEmpleadoProcesoRubro","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empleadoprocesorubroConstantesFunciones.mostrarid_empresaEmpleadoProcesoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empleadoprocesorubroConstantesFunciones.resaltarid_empresaEmpleadoProcesoRubro,this,this.empleadoprocesorubroConstantesFunciones.activarid_empresaEmpleadoProcesoRubro));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empleadoprocesorubroConstantesFunciones.resaltarid_empresaEmpleadoProcesoRubro,this,this.empleadoprocesorubroConstantesFunciones.activarid_empresaEmpleadoProcesoRubro,false,"id_empresaEmpleadoProcesoRubro","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.empleadoprocesorubroConstantesFunciones.mostrarid_sucursalEmpleadoProcesoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.empleadoprocesorubroConstantesFunciones.resaltarid_sucursalEmpleadoProcesoRubro,this,this.empleadoprocesorubroConstantesFunciones.activarid_sucursalEmpleadoProcesoRubro));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.empleadoprocesorubroConstantesFunciones.resaltarid_sucursalEmpleadoProcesoRubro,this,this.empleadoprocesorubroConstantesFunciones.activarid_sucursalEmpleadoProcesoRubro,false,"id_sucursalEmpleadoProcesoRubro","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.empleadoprocesorubroConstantesFunciones.mostrarid_estructuraEmpleadoProcesoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.empleadoprocesorubroConstantesFunciones.resaltarid_estructuraEmpleadoProcesoRubro,this,this.empleadoprocesorubroConstantesFunciones.activarid_estructuraEmpleadoProcesoRubro));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.empleadoprocesorubroConstantesFunciones.resaltarid_estructuraEmpleadoProcesoRubro,this,this.empleadoprocesorubroConstantesFunciones.activarid_estructuraEmpleadoProcesoRubro,true,"id_estructuraEmpleadoProcesoRubro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.empleadoprocesorubroConstantesFunciones.mostrarid_empleadoEmpleadoProcesoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoprocesorubroConstantesFunciones.resaltarid_empleadoEmpleadoProcesoRubro,this,this.empleadoprocesorubroConstantesFunciones.activarid_empleadoEmpleadoProcesoRubro));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoprocesorubroConstantesFunciones.resaltarid_empleadoEmpleadoProcesoRubro,this,this.empleadoprocesorubroConstantesFunciones.activarid_empleadoEmpleadoProcesoRubro,true,"id_empleadoEmpleadoProcesoRubro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO));

		if(this.empleadoprocesorubroConstantesFunciones.mostrarfecha_ingresoEmpleadoProcesoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.empleadoprocesorubroConstantesFunciones.resaltarfecha_ingresoEmpleadoProcesoRubro,this.empleadoprocesorubroConstantesFunciones.activarfecha_ingresoEmpleadoProcesoRubro,this,true,"fecha_ingresoEmpleadoProcesoRubro","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.empleadoprocesorubroConstantesFunciones.resaltarfecha_ingresoEmpleadoProcesoRubro,this.empleadoprocesorubroConstantesFunciones.activarfecha_ingresoEmpleadoProcesoRubro,this,true,"fecha_ingresoEmpleadoProcesoRubro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA));

		if(this.empleadoprocesorubroConstantesFunciones.mostrarfecha_salidaEmpleadoProcesoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.empleadoprocesorubroConstantesFunciones.resaltarfecha_salidaEmpleadoProcesoRubro,this.empleadoprocesorubroConstantesFunciones.activarfecha_salidaEmpleadoProcesoRubro,this,true,"fecha_salidaEmpleadoProcesoRubro","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.empleadoprocesorubroConstantesFunciones.resaltarfecha_salidaEmpleadoProcesoRubro,this.empleadoprocesorubroConstantesFunciones.activarfecha_salidaEmpleadoProcesoRubro,this,true,"fecha_salidaEmpleadoProcesoRubro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES));

		if(this.empleadoprocesorubroConstantesFunciones.mostrarobservacionesEmpleadoProcesoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empleadoprocesorubroConstantesFunciones.resaltarobservacionesEmpleadoProcesoRubro,this.empleadoprocesorubroConstantesFunciones.activarobservacionesEmpleadoProcesoRubro,this,true,"observacionesEmpleadoProcesoRubro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoprocesorubroConstantesFunciones.resaltarobservacionesEmpleadoProcesoRubro,this.empleadoprocesorubroConstantesFunciones.activarobservacionesEmpleadoProcesoRubro,this,true,"observacionesEmpleadoProcesoRubro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO));

		if(this.empleadoprocesorubroConstantesFunciones.mostrarnumeros_reingresoEmpleadoProcesoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoprocesorubroConstantesFunciones.resaltarnumeros_reingresoEmpleadoProcesoRubro,this.empleadoprocesorubroConstantesFunciones.activarnumeros_reingresoEmpleadoProcesoRubro,this,true,"numeros_reingresoEmpleadoProcesoRubro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoprocesorubroConstantesFunciones.resaltarnumeros_reingresoEmpleadoProcesoRubro,this.empleadoprocesorubroConstantesFunciones.activarnumeros_reingresoEmpleadoProcesoRubro,this,true,"numeros_reingresoEmpleadoProcesoRubro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoProcesoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoProcesoRubro.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoProcesoRubro.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpleadoProcesoRubro.addColumn(tableColumn);
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
			
			this.jTableDatosEmpleadoProcesoRubro.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpleadoProcesoRubro.moveColumn(this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpleadoProcesoRubro.moveColumn(this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpleadoProcesoRubro.moveColumn(this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpleadoProcesoRubro.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpleadoProcesoRubro.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpleadoProcesoRubro,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpleadoProcesoRubro.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpleadoProcesoRubro.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpleadoProcesoRubro.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empleadoprocesorubroLogic.getEmpleadoProcesoRubros().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empleadoprocesorubros.size()-1;
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
		//this.jTableDatosEmpleadoProcesoRubro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpleadoProcesoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpleadoProcesoRubro();
			
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
				
				//this.isEsNuevoEmpleadoProcesoRubro=false;
					
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
				if(this.empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoProcesoRubro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empleadoprocesorubro.getsType().equals("DUPLICADO")
				   || this.empleadoprocesorubro.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpleadoProcesoRubro=true;
				
				} else {
					this.isEsNuevoEmpleadoProcesoRubro=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
					if(this.empleadoprocesorubro.getId()>=0 && !this.empleadoprocesorubro.getIsNew()) {						
						this.isEsNuevoEmpleadoProcesoRubro=false;
						
					} else {
						this.isEsNuevoEmpleadoProcesoRubro=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpleadoProcesoRubro(esRelaciones);						
				
				this.seleccionarEmpleadoProcesoRubro(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empleadoprocesorubro.getId()<0) {
					this.isEsNuevoEmpleadoProcesoRubro=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpleadoProcesoRubro(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpleadoProcesoRubro(evt,rowIndex);
				}	
				
				if(this.empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpleadoProcesoRubro: " + this.dDif); 
					}
				}								
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpleadoProcesoRubro(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empleadoprocesorubro)) {
					if(this.empleadoprocesorubro.getId()>0) {
						this.empleadoprocesorubro.setIsDeleted(true);
						
						this.empleadoprocesorubrosEliminados.add(this.empleadoprocesorubro);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().remove(this.empleadoprocesorubro);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoprocesorubros.remove(this.empleadoprocesorubro);				
					}
					
					
					((EmpleadoProcesoRubroModel) this.jTableDatosEmpleadoProcesoRubro.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpleadoProcesoRubro(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpleadoProcesoRubro) {
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoProcesoRubro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpleadoProcesoRubro(this.empleadoprocesorubro);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empleadoprocesorubroConstantesFunciones.cargarid_empresaEmpleadoProcesoRubro || this.empleadoprocesorubroConstantesFunciones.event_dependid_empresaEmpleadoProcesoRubro) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empleadoprocesorubro.getid_empresa());
									//this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empleadoprocesorubro.getEmpresa()!=null) {
							this.empresasForeignKey.add(empleadoprocesorubro.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empleadoprocesorubro.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.empleadoprocesorubroConstantesFunciones.cargarid_sucursalEmpleadoProcesoRubro || this.empleadoprocesorubroConstantesFunciones.event_dependid_sucursalEmpleadoProcesoRubro) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.empleadoprocesorubro.getid_sucursal());
									//this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(empleadoprocesorubro.getSucursal()!=null) {
							this.sucursalsForeignKey.add(empleadoprocesorubro.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.empleadoprocesorubro.getid_sucursal(),false,"Formulario");

					//Estructura
					if(!this.empleadoprocesorubroConstantesFunciones.cargarid_estructuraEmpleadoProcesoRubro || this.empleadoprocesorubroConstantesFunciones.event_dependid_estructuraEmpleadoProcesoRubro) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.empleadoprocesorubro.getid_estructura());
									//this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(empleadoprocesorubro.getEstructura()!=null) {
							this.estructurasForeignKey.add(empleadoprocesorubro.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.empleadoprocesorubro.getid_estructura(),false,"Formulario");

					//Empleado
					if(!this.empleadoprocesorubroConstantesFunciones.cargarid_empleadoEmpleadoProcesoRubro || this.empleadoprocesorubroConstantesFunciones.event_dependid_empleadoEmpleadoProcesoRubro) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.empleadoprocesorubro.getid_empleado());
									//this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(empleadoprocesorubro.getEmpleado()!=null) {
							this.empleadosForeignKey.add(empleadoprocesorubro.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.empleadoprocesorubro.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpleadoProcesoRubro(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoProcesoRubro() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpleadoProcesoRubro(empleadoprocesorubro,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpleadoProcesoRubro(empleadoprocesorubro);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpleadoProcesoRubro(empleadoprocesorubro,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoProcesoRubro(empleadoprocesorubro);
	}
	
	public void setVariablesObjetoActualToFormularioEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelidEmpleadoProcesoRubro.setText(empleadoprocesorubro.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_ingresoEmpleadoProcesoRubro.setDate(empleadoprocesorubro.getfecha_ingreso());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_salidaEmpleadoProcesoRubro.setDate(empleadoprocesorubro.getfecha_salida());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextAreaobservacionesEmpleadoProcesoRubro.setText(empleadoprocesorubro.getobservaciones());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setText(empleadoprocesorubro.getnumeros_reingreso().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpleadoProcesoRubro empleadoprocesorubroLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empleadoprocesorubroLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpleadoProcesoRubro empleadoprocesorubroLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empleadoprocesorubroLocal=this.empleadoprocesorubro;
			} else {
				empleadoprocesorubroLocal=this.empleadoprocesorubroAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empleadoprocesorubroLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpleadoProcesoRubro(empleadoprocesorubroLocal,true);
					
					if(empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empleadoprocesorubroLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empleadoprocesorubroLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(empleadoprocesorubro,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(empleadoprocesorubro);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(empleadoprocesorubro,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelidEmpleadoProcesoRubro.getText()==null || this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelidEmpleadoProcesoRubro.getText()=="" || this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelidEmpleadoProcesoRubro.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelidEmpleadoProcesoRubro.setText("0");
			}

			if(conColumnasBase) {empleadoprocesorubro.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelidEmpleadoProcesoRubro.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoProcesoRubroConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelIdEmpleadoProcesoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoprocesorubro.setfecha_ingreso(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_ingresoEmpleadoProcesoRubro.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelfecha_ingresoEmpleadoProcesoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoprocesorubro.setfecha_salida(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_salidaEmpleadoProcesoRubro.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelfecha_salidaEmpleadoProcesoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoprocesorubro.setobservaciones(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextAreaobservacionesEmpleadoProcesoRubro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelobservacionesEmpleadoProcesoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoprocesorubro.setnumeros_reingreso(Integer.parseInt(this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextFieldnumeros_reingresoEmpleadoProcesoRubro.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelnumeros_reingresoEmpleadoProcesoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubroBean,EmpleadoProcesoRubro empleadoprocesorubro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && empleadoprocesorubroBean.getid_estructura()!=null && !empleadoprocesorubroBean.getid_estructura().equals(-1L))) {empleadoprocesorubro.setid_estructura(empleadoprocesorubroBean.getid_estructura());}
			if(conDefault || (!conDefault && empleadoprocesorubroBean.getid_empleado()!=null && !empleadoprocesorubroBean.getid_empleado().equals(-1L))) {empleadoprocesorubro.setid_empleado(empleadoprocesorubroBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubroOrigen,EmpleadoProcesoRubro empleadoprocesorubro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoprocesorubroOrigen.getId()!=null && !empleadoprocesorubroOrigen.getId().equals(0L))) {empleadoprocesorubro.setId(empleadoprocesorubroOrigen.getId());}}
			if(conDefault || (!conDefault && empleadoprocesorubroOrigen.getid_estructura()!=null && !empleadoprocesorubroOrigen.getid_estructura().equals(-1L))) {empleadoprocesorubro.setid_estructura(empleadoprocesorubroOrigen.getid_estructura());}
			if(conDefault || (!conDefault && empleadoprocesorubroOrigen.getid_empleado()!=null && !empleadoprocesorubroOrigen.getid_empleado().equals(-1L))) {empleadoprocesorubro.setid_empleado(empleadoprocesorubroOrigen.getid_empleado());}
			if(conDefault || (!conDefault && empleadoprocesorubroOrigen.getfecha_ingreso()!=null && !empleadoprocesorubroOrigen.getfecha_ingreso().equals(new Date()))) {empleadoprocesorubro.setfecha_ingreso(empleadoprocesorubroOrigen.getfecha_ingreso());}
			if(conDefault || (!conDefault && empleadoprocesorubroOrigen.getfecha_salida()!=null && !empleadoprocesorubroOrigen.getfecha_salida().equals(new Date()))) {empleadoprocesorubro.setfecha_salida(empleadoprocesorubroOrigen.getfecha_salida());}
			if(conDefault || (!conDefault && empleadoprocesorubroOrigen.getobservaciones()!=null && !empleadoprocesorubroOrigen.getobservaciones().equals(""))) {empleadoprocesorubro.setobservaciones(empleadoprocesorubroOrigen.getobservaciones());}
			if(conDefault || (!conDefault && empleadoprocesorubroOrigen.getnumeros_reingreso()!=null && !empleadoprocesorubroOrigen.getnumeros_reingreso().equals(0))) {empleadoprocesorubro.setnumeros_reingreso(empleadoprocesorubroOrigen.getnumeros_reingreso());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelidEmpleadoProcesoRubro.setText(empleadoprocesorubro.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_ingresoEmpleadoProcesoRubro.setDate(empleadoprocesorubro.getfecha_ingreso());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_salidaEmpleadoProcesoRubro.setDate(empleadoprocesorubro.getfecha_salida());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextAreaobservacionesEmpleadoProcesoRubro.setText(empleadoprocesorubro.getobservaciones());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setText(empleadoprocesorubro.getnumeros_reingreso().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoProcesoRubro(EmpleadoProcesoRubroBean empleadoprocesorubroBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelidEmpleadoProcesoRubro.setText(empleadoprocesorubroBean.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_ingresoEmpleadoProcesoRubro.setDate(empleadoprocesorubroBean.getfecha_ingreso());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_salidaEmpleadoProcesoRubro.setDate(empleadoprocesorubroBean.getfecha_salida());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextAreaobservacionesEmpleadoProcesoRubro.setText(empleadoprocesorubroBean.getobservaciones());
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setText(empleadoprocesorubroBean.getnumeros_reingreso().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpleadoProcesoRubro(EmpleadoProcesoRubroParameterReturnGeneral empleadoprocesorubroReturnGeneral,EmpleadoProcesoRubroBean empleadoprocesorubroBean,Boolean conDefault) throws Exception { 
		try {
			EmpleadoProcesoRubro empleadoprocesorubroLocal=new EmpleadoProcesoRubro();
			
			empleadoprocesorubroLocal=empleadoprocesorubroReturnGeneral.getEmpleadoProcesoRubro();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoprocesorubroLocal.getId()!=null && !empleadoprocesorubroLocal.getId().equals(0L))) {empleadoprocesorubroBean.setId(empleadoprocesorubroLocal.getId());}}
			if(conDefault || (!conDefault && empleadoprocesorubroLocal.getid_estructura()!=null && !empleadoprocesorubroLocal.getid_estructura().equals(-1L))) {empleadoprocesorubroBean.setid_estructura(empleadoprocesorubroLocal.getid_estructura());}
			if(conDefault || (!conDefault && empleadoprocesorubroLocal.getid_empleado()!=null && !empleadoprocesorubroLocal.getid_empleado().equals(-1L))) {empleadoprocesorubroBean.setid_empleado(empleadoprocesorubroLocal.getid_empleado());}
			if(conDefault || (!conDefault && empleadoprocesorubroLocal.getfecha_ingreso()!=null && !empleadoprocesorubroLocal.getfecha_ingreso().equals(new Date()))) {empleadoprocesorubroBean.setfecha_ingreso(empleadoprocesorubroLocal.getfecha_ingreso());}
			if(conDefault || (!conDefault && empleadoprocesorubroLocal.getfecha_salida()!=null && !empleadoprocesorubroLocal.getfecha_salida().equals(new Date()))) {empleadoprocesorubroBean.setfecha_salida(empleadoprocesorubroLocal.getfecha_salida());}
			if(conDefault || (!conDefault && empleadoprocesorubroLocal.getobservaciones()!=null && !empleadoprocesorubroLocal.getobservaciones().equals(""))) {empleadoprocesorubroBean.setobservaciones(empleadoprocesorubroLocal.getobservaciones());}
			if(conDefault || (!conDefault && empleadoprocesorubroLocal.getnumeros_reingreso()!=null && !empleadoprocesorubroLocal.getnumeros_reingreso().equals(0))) {empleadoprocesorubroBean.setnumeros_reingreso(empleadoprocesorubroLocal.getnumeros_reingreso());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpleadoProcesoRubroGenerico(Long idEmpleadoProcesoRubroSeleccionado,JComboBox jComboBoxEmpleadoProcesoRubro,List<EmpleadoProcesoRubro> empleadoprocesorubrosLocal)throws Exception {
		try {
			EmpleadoProcesoRubro  empleadoprocesorubroTemp=null;

			for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubrosLocal) {
				if(empleadoprocesorubroAux.getId()!=null && empleadoprocesorubroAux.getId().equals(idEmpleadoProcesoRubroSeleccionado)) {
					empleadoprocesorubroTemp=empleadoprocesorubroAux;
					break;
				}
			}

			jComboBoxEmpleadoProcesoRubro.setSelectedItem(empleadoprocesorubroTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpleadoProcesoRubroGenerico(JComboBox jComboBoxEmpleadoProcesoRubro,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoProcesoRubro.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpleadoProcesoRubro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoProcesoRubro.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpleadoProcesoRubro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpleadoProcesoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpleadoProcesoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoprocesorubro=(EmpleadoProcesoRubro) empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoprocesorubro =(EmpleadoProcesoRubro) empleadoprocesorubros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empleadoprocesorubro.getIsNew() && !empleadoprocesorubro.getIsChanged() && !empleadoprocesorubro.getIsDeleted()) {
				sDescripcion=empleadoprocesorubro.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoprocesorubro.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!empleadoprocesorubro.getIsNew() && !empleadoprocesorubro.getIsChanged() && !empleadoprocesorubro.getIsDeleted()) {
				sDescripcion=empleadoprocesorubro.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoprocesorubro.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!empleadoprocesorubro.getIsNew() && !empleadoprocesorubro.getIsChanged() && !empleadoprocesorubro.getIsDeleted()) {
				sDescripcion=empleadoprocesorubro.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoprocesorubro.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!empleadoprocesorubro.getIsNew() && !empleadoprocesorubro.getIsChanged() && !empleadoprocesorubro.getIsDeleted()) {
				sDescripcion=empleadoprocesorubro.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoprocesorubro.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpleadoProcesoRubro empleadoprocesorubroRow=new EmpleadoProcesoRubro();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoprocesorubroRow=(EmpleadoProcesoRubro) empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoprocesorubroRow=(EmpleadoProcesoRubro) empleadoprocesorubros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpleadoProcesoRubro(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro && this.isPermisoNuevoEmpleadoProcesoRubro));			
			this.jButtonDuplicarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoProcesoRubro && this.isPermisoDuplicarEmpleadoProcesoRubro));			
			this.jButtonCopiarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaCopiarEmpleadoProcesoRubro && this.isPermisoCopiarEmpleadoProcesoRubro));
			this.jButtonVerFormEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaVerFormEmpleadoProcesoRubro && this.isPermisoVerFormEmpleadoProcesoRubro));
			
			this.jButtonAbrirOrderByEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoProcesoRubro && this.isPermisoOrdenEmpleadoProcesoRubro));			
			
			this.jButtonNuevoRelacionesEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro && this.isPermisoNuevoEmpleadoProcesoRubro));			
			this.jButtonNuevoGuardarCambiosEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro && this.isPermisoNuevoEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro));
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonModificarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaModificarEmpleadoProcesoRubro && this.isPermisoActualizarEmpleadoProcesoRubro));	
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonActualizarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro && this.isPermisoActualizarEmpleadoProcesoRubro));	
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonEliminarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro && this.isPermisoEliminarEmpleadoProcesoRubro));
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonCancelarEmpleadoProcesoRubro.setVisible(this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro);							
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro && this.isPermisoNuevoEmpleadoProcesoRubro));						
			this.jButtonDuplicarToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoProcesoRubro && this.isPermisoDuplicarEmpleadoProcesoRubro));						
			this.jButtonCopiarToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaCopiarEmpleadoProcesoRubro && this.isPermisoCopiarEmpleadoProcesoRubro));			
			this.jButtonVerFormToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaVerFormEmpleadoProcesoRubro && this.isPermisoVerFormEmpleadoProcesoRubro));			
			this.jButtonAbrirOrderByToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoProcesoRubro && this.isPermisoOrdenEmpleadoProcesoRubro));
			this.jButtonNuevoRelacionesToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro && this.isPermisoNuevoEmpleadoProcesoRubro));			
			this.jButtonNuevoGuardarCambiosToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro && this.isPermisoNuevoEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro));			
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonModificarToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaModificarEmpleadoProcesoRubro && this.isPermisoActualizarEmpleadoProcesoRubro));	
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonActualizarToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro  && this.isPermisoActualizarEmpleadoProcesoRubro));	
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonEliminarToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro && this.isPermisoEliminarEmpleadoProcesoRubro));
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonCancelarToolBarEmpleadoProcesoRubro.setVisible(this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro);				
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro && this.isPermisoNuevoEmpleadoProcesoRubro));			
			this.jMenuItemDuplicarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoProcesoRubro && this.isPermisoDuplicarEmpleadoProcesoRubro));			
			this.jMenuItemCopiarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaCopiarEmpleadoProcesoRubro && this.isPermisoCopiarEmpleadoProcesoRubro));			
			this.jMenuItemVerFormEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaVerFormEmpleadoProcesoRubro && this.isPermisoVerFormEmpleadoProcesoRubro));			
			this.jMenuItemAbrirOrderByEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoProcesoRubro && this.isPermisoOrdenEmpleadoProcesoRubro));			
			//this.jMenuItemMostrarOcultarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoProcesoRubro && this.isPermisoOrdenEmpleadoProcesoRubro));
			this.jMenuItemDetalleAbrirOrderByEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoProcesoRubro && this.isPermisoOrdenEmpleadoProcesoRubro));			
			//this.jMenuItemDetalleMostrarOcultarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoProcesoRubro && this.isPermisoOrdenEmpleadoProcesoRubro));			
			this.jMenuItemNuevoRelacionesEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro && this.isPermisoNuevoEmpleadoProcesoRubro));			
			this.jMenuItemNuevoGuardarCambiosEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro && this.isPermisoNuevoEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro));									
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemModificarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaModificarEmpleadoProcesoRubro && this.isPermisoActualizarEmpleadoProcesoRubro));	
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemActualizarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro && this.isPermisoActualizarEmpleadoProcesoRubro));	
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemEliminarEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro && this.isPermisoEliminarEmpleadoProcesoRubro));
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemCancelarEmpleadoProcesoRubro.setVisible(this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro);				
			}
			
			this.jMenuItemGuardarCambiosEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro));						
			this.jMenuItemGuardarCambiosTablaEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=this.jButtonNuevoEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaDuplicarEmpleadoProcesoRubro=this.jButtonDuplicarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaCopiarEmpleadoProcesoRubro=this.jButtonCopiarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaVerFormEmpleadoProcesoRubro=this.jButtonVerFormEmpleadoProcesoRubro.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpleadoProcesoRubro=this.jButtonAbrirOrderByEmpleadoProcesoRubro.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=this.jButtonNuevoRelacionesEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaModificarEmpleadoProcesoRubro=this.jButtonModificarEmpleadoProcesoRubro.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonActualizarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonEliminarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonCancelarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosEmpleadoProcesoRubro.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=this.jButtonNuevoToolBarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=this.jButtonNuevoRelacionesToolBarEmpleadoProcesoRubro.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			this.isVisibilidadCeldaModificarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonModificarToolBarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonActualizarToolBarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonEliminarToolBarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonCancelarToolBarEmpleadoProcesoRubro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=this.jButtonGuardarCambiosToolBarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=this.jButtonGuardarCambiosTablaToolBarEmpleadoProcesoRubro.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=this.jMenuItemNuevoEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=this.jMenuItemNuevoRelacionesEmpleadoProcesoRubro.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			this.isVisibilidadCeldaModificarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemModificarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemActualizarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemEliminarEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro=this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemCancelarEmpleadoProcesoRubro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=this.jMenuItemGuardarCambiosEmpleadoProcesoRubro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=this.jMenuItemGuardarCambiosTablaEmpleadoProcesoRubro.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpleadoProcesoRubro(Boolean esInicializar) {
		if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
				//if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoProcesoRubro();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpleadoProcesoRubro(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpleadoProcesoRubro() {
		this.jButtonNuevoEmpleadoProcesoRubro.setVisible(this.isPermisoNuevoEmpleadoProcesoRubro);			
		this.jButtonDuplicarEmpleadoProcesoRubro.setVisible(this.isPermisoDuplicarEmpleadoProcesoRubro);			
		this.jButtonCopiarEmpleadoProcesoRubro.setVisible(this.isPermisoCopiarEmpleadoProcesoRubro);			
		this.jButtonVerFormEmpleadoProcesoRubro.setVisible(this.isPermisoVerFormEmpleadoProcesoRubro);			
		
		this.jButtonAbrirOrderByEmpleadoProcesoRubro.setVisible(this.isPermisoOrdenEmpleadoProcesoRubro);					
		
		this.jButtonNuevoRelacionesEmpleadoProcesoRubro.setVisible(this.isPermisoNuevoEmpleadoProcesoRubro);			
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonModificarEmpleadoProcesoRubro.setVisible(this.isPermisoActualizarEmpleadoProcesoRubro);	
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonActualizarEmpleadoProcesoRubro.setVisible(this.isPermisoActualizarEmpleadoProcesoRubro);	
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonEliminarEmpleadoProcesoRubro.setVisible(this.isPermisoEliminarEmpleadoProcesoRubro);
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonCancelarEmpleadoProcesoRubro.setVisible(this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro);						
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosEmpleadoProcesoRubro.setVisible(this.isPermisoGuardarCambiosEmpleadoProcesoRubro);							
		}
		
		this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.setVisible(this.isPermisoActualizarEmpleadoProcesoRubro);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoProcesoRubro() {
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonModificarEmpleadoProcesoRubro.setVisible(this.isPermisoActualizarEmpleadoProcesoRubro);	
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonActualizarEmpleadoProcesoRubro.setVisible(this.isPermisoActualizarEmpleadoProcesoRubro);	
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonEliminarEmpleadoProcesoRubro.setVisible(this.isPermisoEliminarEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonCancelarEmpleadoProcesoRubro.setVisible(this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro);							
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosEmpleadoProcesoRubro.setVisible((this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro && this.isPermisoGuardarCambiosEmpleadoProcesoRubro));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpleadoProcesoRubro() {
		if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpleadoProcesoRubro();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpleadoProcesoRubro() {
	}
	
	public void jTableDatosEmpleadoProcesoRubroListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpleadoProcesoRubro(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpleadoProcesoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoprocesorubro==null) {
						this.empleadoprocesorubro = new EmpleadoProcesoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
				}

				if(this.empleadoprocesorubro.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empleadoprocesorubro.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpleadoProcesoRubroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpleadoProcesoRubro(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoProcesoRubro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoProcesoRubro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empleadoprocesorubroLogic.getConnexion());

				if(this.empleadoprocesorubro.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empleadoprocesorubro.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoProcesoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoProcesoRubro.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpleadoProcesoRubro.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpleadoProcesoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoprocesorubro==null) {
						this.empleadoprocesorubro = new EmpleadoProcesoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
				}

				if(this.empleadoprocesorubro.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empleadoprocesorubro.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalEmpleadoProcesoRubroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebEmpleadoProcesoRubro(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoProcesoRubro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoProcesoRubro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.empleadoprocesorubroLogic.getConnexion());

				if(this.empleadoprocesorubro.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.empleadoprocesorubro.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoProcesoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoProcesoRubro.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderEmpleadoProcesoRubro.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalEmpleadoProcesoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoprocesorubro==null) {
						this.empleadoprocesorubro = new EmpleadoProcesoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
				}

				if(this.empleadoprocesorubro.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.empleadoprocesorubro.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraEmpleadoProcesoRubroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebEmpleadoProcesoRubro(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoProcesoRubro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoProcesoRubro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.empleadoprocesorubroLogic.getConnexion());

				if(this.empleadoprocesorubro.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.empleadoprocesorubro.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoProcesoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoProcesoRubro.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderEmpleadoProcesoRubro.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraEmpleadoProcesoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoprocesorubro==null) {
						this.empleadoprocesorubro = new EmpleadoProcesoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
				}

				if(this.empleadoprocesorubro.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.empleadoprocesorubro.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmpleadoProcesoRubroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmpleadoProcesoRubro(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoProcesoRubro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoProcesoRubro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.empleadoprocesorubroLogic.getConnexion());

				if(this.empleadoprocesorubro.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.empleadoprocesorubro.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoProcesoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoProcesoRubro.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoProcesoRubro.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmpleadoProcesoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoprocesorubro==null) {
						this.empleadoprocesorubro = new EmpleadoProcesoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
				}

				if(this.empleadoprocesorubro.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.empleadoprocesorubro.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ingresoEmpleadoProcesoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoprocesorubro==null) {
						this.empleadoprocesorubro = new EmpleadoProcesoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
				}

				if(this.empleadoprocesorubro.getfecha_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ingreso = '"+Funciones2.getStringPostgresDate(this.empleadoprocesorubro.getfecha_ingreso())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_salidaEmpleadoProcesoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoprocesorubro==null) {
						this.empleadoprocesorubro = new EmpleadoProcesoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
				}

				if(this.empleadoprocesorubro.getfecha_salida()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_salida = '"+Funciones2.getStringPostgresDate(this.empleadoprocesorubro.getfecha_salida())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionesEmpleadoProcesoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoprocesorubro==null) {
						this.empleadoprocesorubro = new EmpleadoProcesoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
				}

				if(this.empleadoprocesorubro.getobservaciones()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observaciones like '%"+this.empleadoprocesorubro.getobservaciones()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeros_reingresoEmpleadoProcesoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.getempleadoprocesorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoprocesorubro==null) {
						this.empleadoprocesorubro = new EmpleadoProcesoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);
				}

				if(this.empleadoprocesorubro.getnumeros_reingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numeros_reingreso = "+this.empleadoprocesorubro.getnumeros_reingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);

			this.getEmpleadoProcesoRubrosFK_IdEmpleado();

			this.inicializarActualizarBindingEmpleadoProcesoRubro(false);

			//if(EmpleadoProcesoRubroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);

			this.getEmpleadoProcesoRubrosFK_IdEmpresa();

			this.inicializarActualizarBindingEmpleadoProcesoRubro(false);

			//if(EmpleadoProcesoRubroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);

			this.getEmpleadoProcesoRubrosFK_IdEstructura();

			this.inicializarActualizarBindingEmpleadoProcesoRubro(false);

			//if(EmpleadoProcesoRubroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalEmpleadoProcesoRubroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);

			this.getEmpleadoProcesoRubrosFK_IdSucursal();

			this.inicializarActualizarBindingEmpleadoProcesoRubro(false);

			//if(EmpleadoProcesoRubroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoprocesorubroLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpleadoProcesoRubro() {
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.dispose();
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro!=null) {
			this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.dispose();
			this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro=null;
		}
		
		if(this.jInternalFrameImportacionEmpleadoProcesoRubro!=null) {
			this.jInternalFrameImportacionEmpleadoProcesoRubro.setVisible(false);	    			
			this.jInternalFrameImportacionEmpleadoProcesoRubro.dispose();
			this.jInternalFrameImportacionEmpleadoProcesoRubro=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpleadoProcesoRubro();
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpleadoProcesoRubro")) {
				jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpleadoProcesoRubro")) {
				jButtonDuplicarEmpleadoProcesoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpleadoProcesoRubro")) {
				jButtonCopiarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpleadoProcesoRubro")) {
				jButtonVerFormEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpleadoProcesoRubro")) {
				jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpleadoProcesoRubro")) {
				jButtonDuplicarEmpleadoProcesoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpleadoProcesoRubro")) {
				jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpleadoProcesoRubro")) {
				jButtonDuplicarEmpleadoProcesoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpleadoProcesoRubro")) {
				jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpleadoProcesoRubro")) {
				jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpleadoProcesoRubro")) {
				jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpleadoProcesoRubro")) {
				jButtonModificarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpleadoProcesoRubro")) {
				jButtonModificarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpleadoProcesoRubro")) {
				jButtonModificarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpleadoProcesoRubro")) {
				jButtonActualizarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpleadoProcesoRubro")) {
				jButtonActualizarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpleadoProcesoRubro")) {
				jButtonActualizarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpleadoProcesoRubro")) {
				jButtonEliminarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpleadoProcesoRubro")) {
				jButtonEliminarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpleadoProcesoRubro")) {
				jButtonEliminarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpleadoProcesoRubro")) {
				jButtonCancelarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpleadoProcesoRubro")) {
				jButtonCancelarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpleadoProcesoRubro")) {
				jButtonCancelarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpleadoProcesoRubro")) {
				jButtonCerrarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpleadoProcesoRubro")) {
				jButtonCerrarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpleadoProcesoRubro")) {
				jButtonCerrarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpleadoProcesoRubro")) {
				jButtonMostrarOcultarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpleadoProcesoRubro")) {
				jButtonCancelarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpleadoProcesoRubro")) {
				jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpleadoProcesoRubro")) {
				jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpleadoProcesoRubro")) {
				jButtonCopiarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpleadoProcesoRubro")) {
				jButtonVerFormEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpleadoProcesoRubro")) {
				jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpleadoProcesoRubro")) {
				jButtonCopiarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpleadoProcesoRubro")) {
				jButtonVerFormEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoProcesoRubro")) {
				jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpleadoProcesoRubro")) {
				jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpleadoProcesoRubro")) {
				jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpleadoProcesoRubro")) {
				jButtonRecargarInformacionEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpleadoProcesoRubro")) {
				jButtonRecargarInformacionEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpleadoProcesoRubro")) {
				jButtonRecargarInformacionEmpleadoProcesoRubroActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpleadoProcesoRubro")) {
				jButtonAnterioresEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpleadoProcesoRubro")) {
				jButtonAnterioresEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpleadoProcesoRubro")) {
				jButtonAnterioresEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpleadoProcesoRubro")) {
				jButtonSiguientesEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpleadoProcesoRubro")) {
				jButtonSiguientesEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpleadoProcesoRubro")) {
				jButtonSiguientesEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpleadoProcesoRubro") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpleadoProcesoRubro")) {
				jButtonAbrirOrderByEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpleadoProcesoRubro") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpleadoProcesoRubro")) {
				jButtonMostrarOcultarEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoProcesoRubro")) {
				jButtonNuevoGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpleadoProcesoRubro")) {
				jButtonNuevoGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpleadoProcesoRubro")) {
				jButtonNuevoGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpleadoProcesoRubro")) {
				jButtonCerrarReporteDinamicoEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpleadoProcesoRubro")) {
				jButtonGenerarReporteDinamicoEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpleadoProcesoRubro")) {
				
				jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpleadoProcesoRubro")) {
				jButtonCerrarImportacionEmpleadoProcesoRubroActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpleadoProcesoRubro")) {
				
				jButtonGenerarImportacionEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpleadoProcesoRubro")) {
				
				jButtonAbrirImportacionEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpleadoProcesoRubro")) {
				jComboBoxTiposAccionesEmpleadoProcesoRubroActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpleadoProcesoRubro")) {
				jComboBoxTiposRelacionesEmpleadoProcesoRubroActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpleadoProcesoRubro")) {
				jComboBoxTiposAccionesEmpleadoProcesoRubroActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpleadoProcesoRubro")) {
				
				jComboBoxTiposSeleccionarEmpleadoProcesoRubroActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpleadoProcesoRubro")) {
				jTextFieldValorCampoGeneralEmpleadoProcesoRubroActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpleadoProcesoRubro")) {
				jButtonAbrirOrderByEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpleadoProcesoRubro")) {
				jButtonAbrirOrderByEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpleadoProcesoRubro")) {
				jButtonCerrarOrderByEmpleadoProcesoRubroActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoProcesoRubroBusqueda")) {
				this.jButtonidEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoProcesoRubroUpdate")) {
				this.jButtonid_empresaEmpleadoProcesoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoProcesoRubroBusqueda")) {
				this.jButtonid_empresaEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEmpleadoProcesoRubroUpdate")) {
				this.jButtonid_sucursalEmpleadoProcesoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEmpleadoProcesoRubroBusqueda")) {
				this.jButtonid_sucursalEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoProcesoRubroUpdate")) {
				this.jButtonid_estructuraEmpleadoProcesoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoProcesoRubroBusqueda")) {
				this.jButtonid_estructuraEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoProcesoRubroUpdate")) {
				this.jButtonid_empleadoEmpleadoProcesoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoProcesoRubroBusqueda")) {
				this.jButtonid_empleadoEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ingresoEmpleadoProcesoRubroBusqueda")) {
				this.jButtonfecha_ingresoEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_salidaEmpleadoProcesoRubroBusqueda")) {
				this.jButtonfecha_salidaEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionesEmpleadoProcesoRubroBusqueda")) {
				this.jButtonobservacionesEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeros_reingresoEmpleadoProcesoRubroBusqueda")) {
				this.jButtonnumeros_reingresoEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoEmpleadoProcesoRubro")) {
				this.jButtonFK_IdEmpleadoEmpleadoProcesoRubroActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraEmpleadoProcesoRubro")) {
				this.jButtonFK_IdEstructuraEmpleadoProcesoRubroActionPerformed(evt);
			}
			
			;
			
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpleadoProcesoRubro();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				


				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoProcesoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoProcesoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpleadoProcesoRubro empleadoprocesorubroLocal=null;
			
			if(!this.getEsControlTabla()) {
				empleadoprocesorubroLocal=this.empleadoprocesorubro;
			} else {
				empleadoprocesorubroLocal=this.empleadoprocesorubroAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
							
				
				


				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoProcesoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoProcesoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
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
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
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
			
			


			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
								
						
				


				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoProcesoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoProcesoRubro.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
								
				
				


				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoProcesoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoProcesoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
							
				
				


				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoProcesoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoProcesoRubro.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
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
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
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
			
			


			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
								
				
				


				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoProcesoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoProcesoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpleadoProcesoRubro")) {
					jCheckBoxSeleccionarTodosEmpleadoProcesoRubroItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpleadoProcesoRubro")) {
					jCheckBoxSeleccionadosEmpleadoProcesoRubroItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpleadoProcesoRubro")) {
					
				}
				
				


				
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoProcesoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoProcesoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
												
				
				


				
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoProcesoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoProcesoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
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
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
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
			
			


			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoProcesoRubro.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoProcesoRubro.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoprocesorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoprocesorubro);
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
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
				
				


				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoProcesoRubro.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoProcesoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoProcesoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoprocesorubroAnterior =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpleadoProcesoRubro")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpleadoProcesoRubroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpleadoProcesoRubro.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empleadoprocesorubro =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empleadoprocesorubro);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpleadoProcesoRubro")) {
				
				}
				
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpleadoProcesoRubro")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpleadoProcesoRubro.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpleadoProcesoRubro")) {
			
			}
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpleadoProcesoRubro();
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
			if(sTipo.equals("NuevoEmpleadoProcesoRubro")) {
				jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpleadoProcesoRubro")) {
				jButtonDuplicarEmpleadoProcesoRubroActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpleadoProcesoRubro")) {
				jButtonCopiarEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpleadoProcesoRubro")) {
				jButtonVerFormEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpleadoProcesoRubro")) {
				jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpleadoProcesoRubro")) {
				jButtonModificarEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpleadoProcesoRubro")) {
				jButtonActualizarEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpleadoProcesoRubro")) {
				jButtonEliminarEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoProcesoRubro")) {
				jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpleadoProcesoRubro")) {
				jButtonCancelarEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpleadoProcesoRubro")) {
				jButtonCerrarEmpleadoProcesoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpleadoProcesoRubro")) {
				jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoProcesoRubro")) {
				jButtonNuevoGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpleadoProcesoRubro")) {
				jButtonAbrirOrderByEmpleadoProcesoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpleadoProcesoRubro")) {
				jButtonRecargarInformacionEmpleadoProcesoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpleadoProcesoRubro")) {
				jButtonAnterioresEmpleadoProcesoRubroActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpleadoProcesoRubro")) {
				jButtonSiguientesEmpleadoProcesoRubroActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoProcesoRubroBusqueda")) {
				this.jButtonidEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoProcesoRubroUpdate")) {
				this.jButtonid_empresaEmpleadoProcesoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoProcesoRubroBusqueda")) {
				this.jButtonid_empresaEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEmpleadoProcesoRubroUpdate")) {
				this.jButtonid_sucursalEmpleadoProcesoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEmpleadoProcesoRubroBusqueda")) {
				this.jButtonid_sucursalEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoProcesoRubroUpdate")) {
				this.jButtonid_estructuraEmpleadoProcesoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoProcesoRubroBusqueda")) {
				this.jButtonid_estructuraEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoProcesoRubroUpdate")) {
				this.jButtonid_empleadoEmpleadoProcesoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoProcesoRubroBusqueda")) {
				this.jButtonid_empleadoEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ingresoEmpleadoProcesoRubroBusqueda")) {
				this.jButtonfecha_ingresoEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_salidaEmpleadoProcesoRubroBusqueda")) {
				this.jButtonfecha_salidaEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionesEmpleadoProcesoRubroBusqueda")) {
				this.jButtonobservacionesEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeros_reingresoEmpleadoProcesoRubroBusqueda")) {
				this.jButtonnumeros_reingresoEmpleadoProcesoRubroBusquedaActionPerformed(evt);
			}
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpleadoProcesoRubro();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpleadoProcesoRubro")) {
				closingInternalFrameEmpleadoProcesoRubro();
				
			} else if(sTipo.equals("jButtonCancelarEmpleadoProcesoRubro")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpleadoProcesoRubro = (JInternalFrameBase)evt.getSource();
	            	
	            EmpleadoProcesoRubroBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoProcesoRubroBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoProcesoRubro.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpleadoProcesoRubroActionPerformed(null);
			}
			
			EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoprocesorubro,new Object(),this.empleadoprocesorubroParameterGeneral,this.empleadoprocesorubroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpleadoProcesoRubro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpleadoProcesoRubro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpleadoProcesoRubro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empleadoprocesorubro)) {
			if(!esControlTabla) {
				if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);			
				}
				
				if(this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoprocesorubroReturnGeneral=empleadoprocesorubroLogic.procesarEventosEmpleadoProcesoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros(),this.empleadoprocesorubro,this.empleadoprocesorubroParameterGeneral,this.isEsNuevoEmpleadoProcesoRubro,classes);//this.empleadoprocesorubroLogic.getEmpleadoProcesoRubro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpleadoProcesoRubro(this.empleadoprocesorubroReturnGeneral,this.empleadoprocesorubroBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoProcesoRubro(classes,this.empleadoprocesorubroReturnGeneral,this.empleadoprocesorubroBean,false);
					}
						
					if(this.empleadoprocesorubroReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoProcesoRubro(this.empleadoprocesorubroReturnGeneral.getEmpleadoProcesoRubro());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpleadoProcesoRubro(this.empleadoprocesorubroReturnGeneral.getEmpleadoProcesoRubro());	
					}
						
					if(this.empleadoprocesorubroReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpleadoProcesoRubro(this.empleadoprocesorubroReturnGeneral.getEmpleadoProcesoRubro(),classes);//this.empleadoprocesorubroBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpleadoProcesoRubro(this.empleadoprocesorubro,classes);//this.empleadoprocesorubroBean);									
				}
			
				if(EmpleadoProcesoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpleadoProcesoRubro(this.empleadoprocesorubro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoProcesoRubro(this.empleadoprocesorubro);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empleadoprocesorubroAnterior!=null) {
						this.empleadoprocesorubro=this.empleadoprocesorubroAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoprocesorubroReturnGeneral=empleadoprocesorubroLogic.procesarEventosEmpleadoProcesoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros(),this.empleadoprocesorubro,this.empleadoprocesorubroParameterGeneral,this.isEsNuevoEmpleadoProcesoRubro,classes);//this.empleadoprocesorubroLogic.getEmpleadoProcesoRubro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoprocesorubroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empleadoprocesorubroReturnGeneral.getEmpleadoProcesoRubro(),empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empleadoprocesorubroReturnGeneral.getEmpleadoProcesoRubro(),this.empleadoprocesorubros);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpleadoProcesoRubro.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpleadoProcesoRubro.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpleadoProcesoRubro();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpleadoProcesoRubro() throws Exception {
		
		EmpleadoProcesoRubroModel empleadoprocesorubroModel=(EmpleadoProcesoRubroModel)this.jTableDatosEmpleadoProcesoRubro.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoprocesorubroModel.empleadoprocesorubros=this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empleadoprocesorubroModel.empleadoprocesorubros=this.empleadoprocesorubros;
		}
		
		
		((EmpleadoProcesoRubroModel) this.jTableDatosEmpleadoProcesoRubro.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpleadoProcesoRubro() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempleadoprocesorubroAnterior(),this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempleadoprocesorubroAnterior(),this.empleadoprocesorubros);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpleadoProcesoRubro();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
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
										
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoprocesorubro,new Object(),generalEntityParameterGeneral,this.empleadoprocesorubroReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpleadoProcesoRubroConstantesFunciones.getClassesRelationshipsOfEmpleadoProcesoRubro(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpleadoProcesoRubroConstantesFunciones.getClassesRelationshipsFromStringsOfEmpleadoProcesoRubro(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpleadoProcesoRubro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoprocesorubro,new Object(),generalEntityParameterGeneral,this.empleadoprocesorubroReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpleadoProcesoRubro(EmpleadoProcesoRubroBean empleadoprocesorubroBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoProcesoRubro(ArrayList<Classe> classes,EmpleadoProcesoRubroReturnGeneral empleadoprocesorubroReturnGeneral,EmpleadoProcesoRubroBean empleadoprocesorubroBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empleadoprocesorubro)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro = new EmpleadoProcesoRubroDetalleFormJInternalFrame(jDesktopPane,this.empleadoprocesorubroSessionBean.getConGuardarRelaciones(),this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setVisible(false);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.empleadoprocesorubroLogic=this.empleadoprocesorubroLogic;
		
		this.cargarCombosFrameForeignKeyEmpleadoProcesoRubro("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoProcesoRubro();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoProcesoRubro();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpleadoProcesoRubro("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpleadoProcesoRubro();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoProcesoRubro"));
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonModificarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoProcesoRubro"));

		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonModificarToolBarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoProcesoRubro"));
					
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemModificarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoProcesoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonActualizarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoProcesoRubro"));
		
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonActualizarToolBarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoProcesoRubro"));
						
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemActualizarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoProcesoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonEliminarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoProcesoRubro"));
		
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonEliminarToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoProcesoRubro"));
								
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemEliminarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoProcesoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonCancelarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoProcesoRubro"));
		
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonCancelarToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoProcesoRubro"));
					
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemCancelarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoProcesoRubro"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemDetalleCerrarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoProcesoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoProcesoRubro"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoProcesoRubro"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoProcesoRubro"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonidEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empresaEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empresaEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_sucursalEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_sucursalEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_estructuraEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_estructuraEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empleadoEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empleadoEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ingresoEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonobservacionesEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"observacionesEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"numeros_reingresoEmpleadoProcesoRubroBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTabbedPaneRelacionesEmpleadoProcesoRubro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoProcesoRubro"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpleadoProcesoRubro"));
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoProcesoRubro"));
		}
		
		this.jTableDatosEmpleadoProcesoRubro.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpleadoProcesoRubro"));
		
		this.jTableDatosEmpleadoProcesoRubro.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpleadoProcesoRubro"));
		
		this.jButtonNuevoEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"NuevoEmpleadoProcesoRubro"));
		
		this.jButtonDuplicarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"DuplicarEmpleadoProcesoRubro"));
		
		this.jButtonCopiarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"CopiarEmpleadoProcesoRubro"));
		
		this.jButtonVerFormEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"VerFormEmpleadoProcesoRubro"));
		
		
		this.jButtonNuevoToolBarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpleadoProcesoRubro"));
			
		this.jButtonDuplicarToolBarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpleadoProcesoRubro"));
			
		this.jMenuItemNuevoEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpleadoProcesoRubro"));
			
		this.jMenuItemDuplicarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpleadoProcesoRubro"));		
		
		
		this.jButtonNuevoRelacionesEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpleadoProcesoRubro"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpleadoProcesoRubro"));
			
		this.jMenuItemNuevoRelacionesEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpleadoProcesoRubro"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonModificarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoProcesoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonModificarToolBarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoProcesoRubro"));
			
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemModificarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoProcesoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonActualizarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoProcesoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonActualizarToolBarEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoProcesoRubro"));
				
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemActualizarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoProcesoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonEliminarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoProcesoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonEliminarToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoProcesoRubro"));
						
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemEliminarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoProcesoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonCancelarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoProcesoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonCancelarToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoProcesoRubro"));
			
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemCancelarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoProcesoRubro"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpleadoProcesoRubro"));		
		
		
		this.jButtonCerrarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"CerrarEmpleadoProcesoRubro"));
		
		
		this.jButtonCerrarToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpleadoProcesoRubro"));
			
		this.jMenuItemCerrarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpleadoProcesoRubro"));
			
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jMenuItemDetalleCerrarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoProcesoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpleadoProcesoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoProcesoRubro"));
		}
		
		this.jButtonCopiarToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpleadoProcesoRubro"));
			
		this.jButtonVerFormToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpleadoProcesoRubro"));
		
		this.jMenuItemGuardarCambiosEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpleadoProcesoRubro"));
			
		this.jMenuItemCopiarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpleadoProcesoRubro"));		
		
		this.jMenuItemVerFormEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpleadoProcesoRubro"));		
		
		
		this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoProcesoRubro"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpleadoProcesoRubro"));
			
		this.jMenuItemGuardarCambiosTablaEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoProcesoRubro"));		
		
		
		
		this.jButtonRecargarInformacionEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpleadoProcesoRubro"));
					
		this.jButtonRecargarInformacionToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpleadoProcesoRubro"));
		
		this.jMenuItemRecargarInformacionEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpleadoProcesoRubro"));		
		
		
		
		this.jButtonAnterioresEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"AnterioresEmpleadoProcesoRubro"));
		
		
		this.jButtonAnterioresToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpleadoProcesoRubro"));
		
		this.jMenuItemAnterioresEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpleadoProcesoRubro"));		
		
		
		this.jButtonSiguientesEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"SiguientesEmpleadoProcesoRubro"));
		
		
		this.jButtonSiguientesToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpleadoProcesoRubro"));
			
		this.jMenuItemSiguientesEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpleadoProcesoRubro"));
			
		this.jMenuItemAbrirOrderByEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpleadoProcesoRubro"));
			
		this.jMenuItemMostrarOcultarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpleadoProcesoRubro"));
			
		this.jMenuItemDetalleAbrirOrderByEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpleadoProcesoRubro"));
			
		this.jMenuItemDetalleMostarOcultarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpleadoProcesoRubro"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpleadoProcesoRubro"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpleadoProcesoRubro"));
			
		this.jMenuItemNuevoGuardarCambiosEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpleadoProcesoRubro"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpleadoProcesoRubro"));

		this.jCheckBoxSeleccionadosEmpleadoProcesoRubro.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpleadoProcesoRubro"));
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoProcesoRubro"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpleadoProcesoRubro"));
			
		this.jComboBoxTiposAccionesEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpleadoProcesoRubro"));
					
		this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpleadoProcesoRubro"));
			
		this.jTextFieldValorCampoGeneralEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpleadoProcesoRubro"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonidEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empresaEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empresaEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_sucursalEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_sucursalEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_estructuraEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_estructuraEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empleadoEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empleadoEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ingresoEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonobservacionesEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"observacionesEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"numeros_reingresoEmpleadoProcesoRubroBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoProcesoRubro"));

			this.jButtonFK_IdEstructuraEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraEmpleadoProcesoRubro"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoProcesoRubro"));
				this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoProcesoRubro"));
				this.jInternalFrameReporteDinamicoEmpleadoProcesoRubro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoProcesoRubro"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoProcesoRubro"));				
			//this.jButtonGenerarReporteDinamicoEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoProcesoRubro"));
			//this.jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoProcesoRubro"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpleadoProcesoRubro!=null) {
				this.jInternalFrameImportacionEmpleadoProcesoRubro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoProcesoRubro"));
				this.jInternalFrameImportacionEmpleadoProcesoRubro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoProcesoRubro"));
				this.jInternalFrameImportacionEmpleadoProcesoRubro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoProcesoRubro"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpleadoProcesoRubro"));
			
			this.jButtonAbrirOrderByToolBarEmpleadoProcesoRubro.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpleadoProcesoRubro"));			
			
			if(this.jInternalFrameOrderByEmpleadoProcesoRubro!=null) {
				this.jInternalFrameOrderByEmpleadoProcesoRubro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoProcesoRubro"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTabbedPaneRelacionesEmpleadoProcesoRubro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoProcesoRubro"));
		
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
            		closingInternalFrameEmpleadoProcesoRubro();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpleadoProcesoRubro = (JInternalFrameBase)event.getSource();
	            	
	            EmpleadoProcesoRubroBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoProcesoRubroBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoProcesoRubro.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpleadoProcesoRubroActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpleadoProcesoRubro.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpleadoProcesoRubroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpleadoProcesoRubro.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpleadoProcesoRubro.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpleadoProcesoRubro";
		inputMap = this.jButtonNuevoEmpleadoProcesoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpleadoProcesoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpleadoProcesoRubro";
		inputMap = this.jButtonNuevoRelacionesEmpleadoProcesoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpleadoProcesoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoProcesoRubroActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpleadoProcesoRubro";
		inputMap = this.jButtonModificarEmpleadoProcesoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpleadoProcesoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpleadoProcesoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpleadoProcesoRubro";
		inputMap = this.jButtonActualizarEmpleadoProcesoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpleadoProcesoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpleadoProcesoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpleadoProcesoRubro";
		inputMap = this.jButtonEliminarEmpleadoProcesoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpleadoProcesoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpleadoProcesoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpleadoProcesoRubro";
		inputMap = this.jButtonCancelarEmpleadoProcesoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpleadoProcesoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpleadoProcesoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpleadoProcesoRubro";
		inputMap = this.jButtonCerrarEmpleadoProcesoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpleadoProcesoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpleadoProcesoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpleadoProcesoRubro";
		inputMap = this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosEmpleadoProcesoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonGuardarCambiosEmpleadoProcesoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpleadoProcesoRubro.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpleadoProcesoRubroItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpleadoProcesoRubro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpleadoProcesoRubroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpleadoProcesoRubroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpleadoProcesoRubro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpleadoProcesoRubroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonidEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empresaEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empresaEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_sucursalEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_sucursalEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_estructuraEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_estructuraEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoProcesoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empleadoEmpleadoProcesoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoProcesoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonid_empleadoEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonfecha_ingresoEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ingresoEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonfecha_salidaEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonobservacionesEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"observacionesEmpleadoProcesoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jButtonnumeros_reingresoEmpleadoProcesoRubroBusqueda.addActionListener(new ButtonActionListener(this,"numeros_reingresoEmpleadoProcesoRubroBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoProcesoRubro"));

		this.jButtonFK_IdEstructuraEmpleadoProcesoRubro.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraEmpleadoProcesoRubro"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpleadoProcesoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpleadoProcesoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpleadoProcesoRubroActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpleadoProcesoRubro.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpleadoProcesoRubro(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
					empleadoprocesorubroAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubros) {
					empleadoprocesorubroAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpleadoProcesoRubroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
						empleadoprocesorubroAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubros) {
						empleadoprocesorubroAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubros) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoProcesoRubro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoProcesoRubro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpleadoProcesoRubroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpleadoProcesoRubro.getSelectedRows();
			
			EmpleadoProcesoRubro empleadoprocesorubroLocal=new EmpleadoProcesoRubro();
			
			//this.seleccionarTodosEmpleadoProcesoRubro(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoprocesorubroLocal =(EmpleadoProcesoRubro) this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros().toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empleadoprocesorubroLocal =(EmpleadoProcesoRubro) this.empleadoprocesorubros.toArray()[this.jTableDatosEmpleadoProcesoRubro.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empleadoprocesorubroLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
						empleadoprocesorubroAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubros) {
						empleadoprocesorubroAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoProcesoRubro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoProcesoRubro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoProcesoRubro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpleadoProcesoRubroItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpleadoProcesoRubroParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpleadoProcesoRubroActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpleadoProcesoRubro.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
				
						if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO)) {
							existe=true;
							empleadoprocesorubroAux.setfecha_ingreso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA)) {
							existe=true;
							empleadoprocesorubroAux.setfecha_salida(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES)) {
							existe=true;
							empleadoprocesorubroAux.setobservaciones(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO)) {
							existe=true;
							empleadoprocesorubroAux.setnumeros_reingreso(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubros) {
					
						if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO)) {
							existe=true;
							empleadoprocesorubroAux.setfecha_ingreso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA)) {
							existe=true;
							empleadoprocesorubroAux.setfecha_salida(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES)) {
							existe=true;
							empleadoprocesorubroAux.setobservaciones(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO)) {
							existe=true;
							empleadoprocesorubroAux.setnumeros_reingreso(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpleadoProcesoRubroActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpleadoProcesoRubro=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpleadoProcesoRubro.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpleadoProcesoRubro) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpleadoProcesoRubro(conSplash);
				
					this.generarReporteEmpleadoProcesoRubrosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpleadoProcesoRubrosSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoProcesoRubrosSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoProcesoRubrosSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoProcesoRubro();
				
				this.exportarEmpleadoProcesoRubrosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpleadoProcesoRubros();
				//this.importarEmpleadoProcesoRubros();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoProcesoRubro();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpleadoProcesoRubrosSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empleado Proceso Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpleadoProcesoRubro();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpleadoProcesoRubro)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpleadoProcesoRubro(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Proceso Rubro",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpleadoProcesoRubroBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpleadoProcesoRubro) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpleadoProcesoRubro(conSplash);
					
						//this.actualizarParametrosGeneralEmpleadoProcesoRubro();
						
						this.generarReporteProcesoAccionEmpleadoProcesoRubrosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empleado Proceso RubroS SELECCIONADOS?", "MANTENIMIENTO DE Empleado Proceso Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpleadoProcesoRubro();
				
						this.actualizarParametrosGeneralEmpleadoProcesoRubro();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empleadoprocesorubroReturnGeneral=empleadoprocesorubroLogic.procesarAccionEmpleadoProcesoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros(),this.empleadoprocesorubroParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpleadoProcesoRubroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpleadoProcesoRubro();
					
					EmpleadoProcesoRubroBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpleadoProcesoRubroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoProcesoRubro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxTiposAccionesFormularioEmpleadoProcesoRubro.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpleadoProcesoRubro(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpleadoProcesoRubroActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpleadoProcesoRubro();
			
			if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();		
			EmpleadoProcesoRubro empleadoprocesorubro=new EmpleadoProcesoRubro();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpleadoProcesoRubro.getSelectedItem();
			
			
			
			
			empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(true);
			//this.sTipoAccion;
			
			if(empleadoprocesorubrosSeleccionados.size()==1) {
				for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubrosSeleccionados) {
					empleadoprocesorubro=empleadoprocesorubroAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpleadoProcesoRubro();
			
      		//this.finishProcessEmpleadoProcesoRubro(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpleadoProcesoRubroReturnGeneral() throws Exception {
		if(this.empleadoprocesorubroReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empleadoprocesorubroReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empleadoprocesorubroReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empleadoprocesorubroReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empleadoprocesorubroReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empleadoprocesorubroReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
		}
		
		if(this.empleadoprocesorubroReturnGeneral.getConRetornoLista() || this.empleadoprocesorubroReturnGeneral.getConRetornoObjeto()) {
			if(this.empleadoprocesorubroReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoprocesorubroLogic.setEmpleadoProcesoRubros(this.empleadoprocesorubroReturnGeneral.getEmpleadoProcesoRubros());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empleadoprocesorubroReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoprocesorubroLogic.setEmpleadoProcesoRubro(this.empleadoprocesorubroReturnGeneral.getEmpleadoProcesoRubro());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpleadoProcesoRubro(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpleadoProcesoRubro() throws Exception {
		
		
	}
	
	public ArrayList<EmpleadoProcesoRubro> getEmpleadoProcesoRubrosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpleadoProcesoRubro) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubroLogic.getEmpleadoProcesoRubros()) {
					if(empleadoprocesorubroAux.getIsSelected()) {
						empleadoprocesorubrosSeleccionados.add(empleadoprocesorubroAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoProcesoRubro empleadoprocesorubroAux:this.empleadoprocesorubros) {
					if(empleadoprocesorubroAux.getIsSelected()) {
						empleadoprocesorubrosSeleccionados.add(empleadoprocesorubroAux);				
					}
				}
			}
			
			if(empleadoprocesorubrosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empleadoprocesorubrosSeleccionados.addAll(this.empleadoprocesorubroLogic.getEmpleadoProcesoRubros());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empleadoprocesorubrosSeleccionados.addAll(this.empleadoprocesorubros);				
					}
				}
			}
		} else {
			empleadoprocesorubrosSeleccionados.add(this.empleadoprocesorubro);
		}
		
		return empleadoprocesorubrosSeleccionados;
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
	
	public void generarReporteEmpleadoProcesoRubrosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpleadoProcesoRubrosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpleadoProcesoRubrosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoProcesoRubrosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoProcesoRubrosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empleado Proceso Rubro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpleadoProcesoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();		
		
		empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpleadoProcesoRubros("Todos",empleadoprocesorubrosSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpleadoProcesoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();		
		
		empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpleadoProcesoRubros("Todos",empleadoprocesorubrosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpleadoProcesoRubrosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();
		
		empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpleadoProcesoRubros("Todos",empleadoprocesorubrosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpleadoProcesoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpleadoProcesoRubro();
		
		
		empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpleadoProcesoRubro();
		
		
		//this.generarReporteEmpleadoProcesoRubros("Todos",empleadoprocesorubrosSeleccionados ,empleadoprocesorubroImplementable,empleadoprocesorubroImplementableHome);
	}
	
	public void mostrarImportacionEmpleadoProcesoRubros() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpleadoProcesoRubro();
		
		this.abrirFrameImportacionEmpleadoProcesoRubro();		
		
			
		//this.generarReporteEmpleadoProcesoRubros("Todos",empleadoprocesorubrosSeleccionados ,empleadoprocesorubroImplementable,empleadoprocesorubroImplementableHome);
	}
	
	public void importarEmpleadoProcesoRubros() throws Exception {		
	
	}
	
	public void exportarEmpleadoProcesoRubrosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpleadoProcesoRubrosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpleadoProcesoRubrosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpleadoProcesoRubrosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empleado Proceso Rubro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpleadoProcesoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();		
		
		empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoprocesorubro."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpleadoProcesoRubro(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubrosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpleadoProcesoRubro(empleadoprocesorubroAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empleadoprocesorubroAux.setsDetalleGeneralEntityReporte(empleadoprocesorubroAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Proceso Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpleadoProcesoRubro(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpleadoProcesoRubroConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoProcesoRubroConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empleadoprocesorubro.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoprocesorubro.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoprocesorubro.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoprocesorubro.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoprocesorubro.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoprocesorubro.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoprocesorubro.getfecha_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoprocesorubro.getfecha_salida().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoprocesorubro.getobservaciones();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoprocesorubro.getnumeros_reingreso().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpleadoProcesoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();		
		
		empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoprocesorubro.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpleadoProcesoRubros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpleadoProcesoRubro(row);				
				iRow++;
			}				
			
			for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubrosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpleadoProcesoRubro(empleadoprocesorubroAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Proceso Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpleadoProcesoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();		
		
		empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoprocesorubro.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empleadoprocesorubros");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empleadoprocesorubro");
			//elementRoot.appendChild(element);
		
			for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubrosSeleccionados) {
				element = document.createElement("empleadoprocesorubro");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpleadoProcesoRubro(empleadoprocesorubroAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Proceso Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpleadoProcesoRubro(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoprocesorubro.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoprocesorubro.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoprocesorubro.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoprocesorubro.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoprocesorubro.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoprocesorubro.getfecha_ingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoprocesorubro.getfecha_salida());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoprocesorubro.getobservaciones());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoprocesorubro.getnumeros_reingreso());				
	}
	
	public void setFilaDatosExportarXmlEmpleadoProcesoRubro(EmpleadoProcesoRubro empleadoprocesorubro,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpleadoProcesoRubroConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empleadoprocesorubro.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpleadoProcesoRubroConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empleadoprocesorubro.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpleadoProcesoRubroConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empleadoprocesorubro.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(EmpleadoProcesoRubroConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(empleadoprocesorubro.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementestructura_descripcion = document.createElement(EmpleadoProcesoRubroConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(empleadoprocesorubro.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementempleado_descripcion = document.createElement(EmpleadoProcesoRubroConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(empleadoprocesorubro.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementfecha_ingreso = document.createElement(EmpleadoProcesoRubroConstantesFunciones.FECHAINGRESO);
		elementfecha_ingreso.appendChild(document.createTextNode(empleadoprocesorubro.getfecha_ingreso().toString().trim()));
		element.appendChild(elementfecha_ingreso);

		Element elementfecha_salida = document.createElement(EmpleadoProcesoRubroConstantesFunciones.FECHASALIDA);
		elementfecha_salida.appendChild(document.createTextNode(empleadoprocesorubro.getfecha_salida().toString().trim()));
		element.appendChild(elementfecha_salida);

		Element elementobservaciones = document.createElement(EmpleadoProcesoRubroConstantesFunciones.OBSERVACIONES);
		elementobservaciones.appendChild(document.createTextNode(empleadoprocesorubro.getobservaciones().trim()));
		element.appendChild(elementobservaciones);

		Element elementnumeros_reingreso = document.createElement(EmpleadoProcesoRubroConstantesFunciones.NUMEROSREINGRESO);
		elementnumeros_reingreso.appendChild(document.createTextNode(empleadoprocesorubro.getnumeros_reingreso().toString().trim()));
		element.appendChild(elementnumeros_reingreso);
	}
	
	public void generarReporteGroupGenericoEmpleadoProcesoRubrosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados=new ArrayList<EmpleadoProcesoRubro>();
		
		empleadoprocesorubrosSeleccionados=this.getEmpleadoProcesoRubrosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpleadoProcesoRubro(empleadoprocesorubrosSeleccionados);
		
		this.generarReporteEmpleadoProcesoRubros("Todos",empleadoprocesorubrosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpleadoProcesoRubro(ArrayList<EmpleadoProcesoRubro> empleadoprocesorubrosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpleadoProcesoRubro empleadoprocesorubroAux:empleadoprocesorubrosSeleccionados) {
				empleadoprocesorubroAux.setsDetalleGeneralEntityReporte(empleadoprocesorubroAux.toString());
			
				if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empleadoprocesorubroAux.setsDescripcionGeneralEntityReporte1(empleadoprocesorubroAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					empleadoprocesorubroAux.setsDescripcionGeneralEntityReporte1(empleadoprocesorubroAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					empleadoprocesorubroAux.setsDescripcionGeneralEntityReporte1(empleadoprocesorubroAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					empleadoprocesorubroAux.setsDescripcionGeneralEntityReporte1(empleadoprocesorubroAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHAINGRESO)) {
					existe=true;
					empleadoprocesorubroAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(empleadoprocesorubroAux.getfecha_ingreso()));
				}
				 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_FECHASALIDA)) {
					existe=true;
					empleadoprocesorubroAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(empleadoprocesorubroAux.getfecha_salida()));
				}
				 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_OBSERVACIONES)) {
					existe=true;
					empleadoprocesorubroAux.setsDescripcionGeneralEntityReporte1(empleadoprocesorubroAux.getobservaciones());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoProcesoRubroConstantesFunciones.LABEL_NUMEROSREINGRESO)) {
					existe=true;
					empleadoprocesorubroAux.setsDescripcionGeneralEntityReporte1(empleadoprocesorubroAux.getnumeros_reingreso().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoProcesoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpleadoProcesoRubro(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=true;
				this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=true;
			}
			
			this.isVisibilidadCeldaModificarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaModificarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaModificarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaModificarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaModificarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaModificarEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoProcesoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoProcesoRubro=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpleadoProcesoRubroJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=true;
		} else {
			this.actualizarEstadoPanelsEmpleadoProcesoRubro(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpleadoProcesoRubro=false;
			//this.isVisibilidadCeldaVerFormEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaDuplicarEmpleadoProcesoRubro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoProcesoRubro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
			if(!empleadoprocesorubroSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=false;												
			}
			
			this.jButtonCerrarEmpleadoProcesoRubro.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoProcesoRubro=false;
		}
		
		if(!this.permiteMantenimiento(this.empleadoprocesorubro)) {
			this.isVisibilidadCeldaActualizarEmpleadoProcesoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoProcesoRubro=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoProcesoRubro() {
	}
	
	public void actualizarEstadoPanelsEmpleadoProcesoRubro(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEmpleadoProcesoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoProcesoRubro!=null) {
				this.jPanelPaginacionEmpleadoProcesoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoProcesoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoProcesoRubro.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEmpleadoProcesoRubro.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoProcesoRubro!=null) {
				this.jPanelPaginacionEmpleadoProcesoRubro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoProcesoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoProcesoRubro.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEmpleadoProcesoRubro.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoProcesoRubro!=null) {
				this.jPanelPaginacionEmpleadoProcesoRubro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoProcesoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoProcesoRubro.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEmpleadoProcesoRubro.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoProcesoRubro!=null) {
				this.jPanelPaginacionEmpleadoProcesoRubro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoProcesoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoProcesoRubro.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEmpleadoProcesoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoProcesoRubro!=null) {
				this.jPanelPaginacionEmpleadoProcesoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoProcesoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoProcesoRubro.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEmpleadoProcesoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoProcesoRubro!=null) {
				this.jPanelPaginacionEmpleadoProcesoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoProcesoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoProcesoRubro.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoProcesoRubro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoProcesoRubro!=null) {
				this.jScrollPanelDatosEmpleadoProcesoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoProcesoRubro!=null) {
				this.jPanelPaginacionEmpleadoProcesoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoProcesoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoProcesoRubro.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro!=null) {
					this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpleadoProcesoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoProcesoRubro.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpleadoProcesoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoProcesoRubro.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoProcesoRubro.remove(jPanelFK_IdEmpleadoEmpleadoProcesoRubro);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoProcesoRubro.remove(jPanelFK_IdEstructuraEmpleadoProcesoRubro);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoProcesoRubro.remove(jPanelFK_IdEmpleadoEmpleadoProcesoRubro);}

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoProcesoRubro.remove(jPanelFK_IdEstructuraEmpleadoProcesoRubro);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoProcesoRubro.remove(jPanelFK_IdEmpleadoEmpleadoProcesoRubro);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoProcesoRubro.remove(jPanelFK_IdEstructuraEmpleadoProcesoRubro);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoProcesoRubro.remove(jPanelFK_IdEmpleadoEmpleadoProcesoRubro);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoProcesoRubro.remove(jPanelFK_IdEstructuraEmpleadoProcesoRubro);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpleadoProcesoRubroSessionBean empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
		
		if(this.empleadoprocesorubroSessionBean==null) {
			this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
		}
		
		this.empleadoprocesorubroSessionBean.setsUltimaBusquedaEmpleadoProcesoRubro(this.getsAccionBusqueda());
		this.empleadoprocesorubroSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empleadoprocesorubroSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			empleadoprocesorubroSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empleadoprocesorubroSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			empleadoprocesorubroSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			empleadoprocesorubroSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpleadoProcesoRubroSessionBean empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
		
		if(this.empleadoprocesorubroSessionBean==null) {
			this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
		}
		
		if(this.empleadoprocesorubroSessionBean.getsUltimaBusquedaEmpleadoProcesoRubro()!=null&&!this.empleadoprocesorubroSessionBean.getsUltimaBusquedaEmpleadoProcesoRubro().equals("")) {
			this.setsAccionBusqueda(empleadoprocesorubroSessionBean.getsUltimaBusquedaEmpleadoProcesoRubro());
			this.setiNumeroPaginacion(empleadoprocesorubroSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empleadoprocesorubroSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(empleadoprocesorubroSessionBean.getid_empleado());
				empleadoprocesorubroSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empleadoprocesorubroSessionBean.getid_empresa());
				empleadoprocesorubroSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(empleadoprocesorubroSessionBean.getid_estructura());
				empleadoprocesorubroSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(empleadoprocesorubroSessionBean.getid_sucursal());
				empleadoprocesorubroSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.empleadoprocesorubroSessionBean.setsUltimaBusquedaEmpleadoProcesoRubro("");
		this.empleadoprocesorubroSessionBean.setiNumeroPaginacion(EmpleadoProcesoRubroConstantesFunciones.INUMEROPAGINACION);
		this.empleadoprocesorubroSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpleadoProcesoRubro(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpleadoProcesoRubro() {
		this.updateBorderResaltarBusquedasFormularioEmpleadoProcesoRubro();
		this.updateVisibilidadBusquedasFormularioEmpleadoProcesoRubro();
		this.updateHabilitarBusquedasFormularioEmpleadoProcesoRubro();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpleadoProcesoRubro() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getComponents().length>0) {
	

		if(this.empleadoprocesorubroConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoProcesoRubro!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoProcesoRubro.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoProcesoRubro);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getComponent(index);
				jPanel.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoProcesoRubro);
			}
		}

		if(this.empleadoprocesorubroConstantesFunciones.resaltarFK_IdEstructuraEmpleadoProcesoRubro!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoProcesoRubro.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoProcesoRubro);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getComponent(index);
				jPanel.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarFK_IdEstructuraEmpleadoProcesoRubro);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpleadoProcesoRubro() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoProcesoRubro.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoProcesoRubro);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoProcesoRubro);
			if(!this.empleadoprocesorubroConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoProcesoRubro && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoProcesoRubro.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoProcesoRubro);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarFK_IdEstructuraEmpleadoProcesoRubro);
			if(!this.empleadoprocesorubroConstantesFunciones.mostrarFK_IdEstructuraEmpleadoProcesoRubro && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpleadoProcesoRubro() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoProcesoRubro.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoProcesoRubro);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoprocesorubroConstantesFunciones.activarFK_IdEmpleadoEmpleadoProcesoRubro);
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setEnabledAt(index,this.empleadoprocesorubroConstantesFunciones.activarFK_IdEmpleadoEmpleadoProcesoRubro);
			}

			index= this.jTabbedPaneBusquedasEmpleadoProcesoRubro.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoProcesoRubro);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoprocesorubroConstantesFunciones.activarFK_IdEstructuraEmpleadoProcesoRubro);
				this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setEnabledAt(index,this.empleadoprocesorubroConstantesFunciones.activarFK_IdEstructuraEmpleadoProcesoRubro);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpleadoProcesoRubro(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmpleadoProcesoRubro.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoProcesoRubro);

			this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getComponent(index);

			this.empleadoprocesorubroConstantesFunciones.setResaltarFK_IdEmpleadoEmpleadoProcesoRubro(resaltar);

			jPanel.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoProcesoRubro);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasEmpleadoProcesoRubro.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoProcesoRubro);

			this.jTabbedPaneBusquedasEmpleadoProcesoRubro.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoProcesoRubro.getComponent(index);

			this.empleadoprocesorubroConstantesFunciones.setResaltarFK_IdEstructuraEmpleadoProcesoRubro(resaltar);

			jPanel.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarFK_IdEstructuraEmpleadoProcesoRubro);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpleadoProcesoRubro.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpleadoProcesoRubro() throws Exception {

		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpleadoProcesoRubro();
		this.updateVisibilidadResaltarControlesFormularioEmpleadoProcesoRubro();
		this.updateHabilitarResaltarControlesFormularioEmpleadoProcesoRubro();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpleadoProcesoRubro() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empleadoprocesorubroConstantesFunciones.resaltaridEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelidEmpleadoProcesoRubro.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltaridEmpleadoProcesoRubro);}
		if(this.empleadoprocesorubroConstantesFunciones.resaltarid_empresaEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarid_empresaEmpleadoProcesoRubro);}
		if(this.empleadoprocesorubroConstantesFunciones.resaltarid_sucursalEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarid_sucursalEmpleadoProcesoRubro);}
		if(this.empleadoprocesorubroConstantesFunciones.resaltarid_estructuraEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarid_estructuraEmpleadoProcesoRubro);}
		if(this.empleadoprocesorubroConstantesFunciones.resaltarid_empleadoEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarid_empleadoEmpleadoProcesoRubro);}
		if(this.empleadoprocesorubroConstantesFunciones.resaltarfecha_ingresoEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_ingresoEmpleadoProcesoRubro.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarfecha_ingresoEmpleadoProcesoRubro);}
		if(this.empleadoprocesorubroConstantesFunciones.resaltarfecha_salidaEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_salidaEmpleadoProcesoRubro.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarfecha_salidaEmpleadoProcesoRubro);}
		if(this.empleadoprocesorubroConstantesFunciones.resaltarobservacionesEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextAreaobservacionesEmpleadoProcesoRubro.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarobservacionesEmpleadoProcesoRubro);}
		if(this.empleadoprocesorubroConstantesFunciones.resaltarnumeros_reingresoEmpleadoProcesoRubro!=null && this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setBorder(this.empleadoprocesorubroConstantesFunciones.resaltarnumeros_reingresoEmpleadoProcesoRubro);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpleadoProcesoRubro() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
	
		//this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelidEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostraridEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelidEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostraridEmpleadoProcesoRubro);
		//this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarid_empresaEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelid_empresaEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarid_empresaEmpleadoProcesoRubro);
		//this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarid_sucursalEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelid_sucursalEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarid_sucursalEmpleadoProcesoRubro);
		//this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarid_estructuraEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelid_estructuraEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarid_estructuraEmpleadoProcesoRubro);
		//this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarid_empleadoEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelid_empleadoEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarid_empleadoEmpleadoProcesoRubro);
		//this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_ingresoEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarfecha_ingresoEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelfecha_ingresoEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarfecha_ingresoEmpleadoProcesoRubro);
		//this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_salidaEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarfecha_salidaEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelfecha_salidaEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarfecha_salidaEmpleadoProcesoRubro);
		//this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextAreaobservacionesEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarobservacionesEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelobservacionesEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarobservacionesEmpleadoProcesoRubro);
		//this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarnumeros_reingresoEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jPanelnumeros_reingresoEmpleadoProcesoRubro.setVisible(this.empleadoprocesorubroConstantesFunciones.mostrarnumeros_reingresoEmpleadoProcesoRubro);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpleadoProcesoRubro() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoProcesoRubro!=null) {
	
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jLabelidEmpleadoProcesoRubro.setEnabled(this.empleadoprocesorubroConstantesFunciones.activaridEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empresaEmpleadoProcesoRubro.setEnabled(this.empleadoprocesorubroConstantesFunciones.activarid_empresaEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_sucursalEmpleadoProcesoRubro.setEnabled(this.empleadoprocesorubroConstantesFunciones.activarid_sucursalEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_estructuraEmpleadoProcesoRubro.setEnabled(this.empleadoprocesorubroConstantesFunciones.activarid_estructuraEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jComboBoxid_empleadoEmpleadoProcesoRubro.setEnabled(this.empleadoprocesorubroConstantesFunciones.activarid_empleadoEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_ingresoEmpleadoProcesoRubro.setEnabled(this.empleadoprocesorubroConstantesFunciones.activarfecha_ingresoEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jDateChooserfecha_salidaEmpleadoProcesoRubro.setEnabled(this.empleadoprocesorubroConstantesFunciones.activarfecha_salidaEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextAreaobservacionesEmpleadoProcesoRubro.setEnabled(this.empleadoprocesorubroConstantesFunciones.activarobservacionesEmpleadoProcesoRubro);
		this.jInternalFrameDetalleFormEmpleadoProcesoRubro.jTextFieldnumeros_reingresoEmpleadoProcesoRubro.setEnabled(this.empleadoprocesorubroConstantesFunciones.activarnumeros_reingresoEmpleadoProcesoRubro);
		}
	}
	
		
}